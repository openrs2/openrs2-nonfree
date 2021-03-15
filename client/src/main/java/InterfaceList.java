import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class InterfaceList {
	@OriginalMember(owner = "client!ji", name = "a", descriptor = "Lclient!fh;")
	public static Js5 spritesArchive;

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "Lclient!fh;")
	public static Js5 modelsArchive;

	@OriginalMember(owner = "client!in", name = "u", descriptor = "Lclient!fh;")
	private static Js5 archive;

	@OriginalMember(owner = "client!hk", name = "ib", descriptor = "Lclient!fh;")
	public static Js5 fontMetricsArchive;

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "[[Lclient!wf;")
	public static Component[][] components;

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "[Z")
	private static boolean[] loaded;

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
	public static int topLevelInterface = -1;

	@OriginalMember(owner = "client!kl", name = "Z", descriptor = "Lclient!ic;")
	public static HashTable subInterfaces = new HashTable(8);

	@OriginalMember(owner = "client!ei", name = "D", descriptor = "Lclient!ic;")
	public static final HashTable serverActiveProperties = new HashTable(512);

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!fh;ILclient!fh;Lclient!fh;Lclient!fh;)V")
	public static void init(@OriginalArg(3) Js5 archive, @OriginalArg(4) Js5 modelsArchive, @OriginalArg(0) Js5 spritesArchive, @OriginalArg(2) Js5 fontMetricsArchive) {
		InterfaceList.spritesArchive = spritesArchive;
		InterfaceList.modelsArchive = modelsArchive;
		InterfaceList.archive = archive;
		InterfaceList.fontMetricsArchive = fontMetricsArchive;
		components = new Component[InterfaceList.archive.capacity()][];
		loaded = new boolean[InterfaceList.archive.capacity()];
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(II)Z")
	public static boolean load(@OriginalArg(1) int id) {
		if (loaded[id]) {
			return true;
		} else if (archive.isGroupReady(id)) {
			@Pc(29) int capacity = archive.getGroupCapacity(id);
			if (capacity == 0) {
				loaded[id] = true;
				return true;
			}
			if (components[id] == null) {
				components[id] = new Component[capacity];
			}
			for (@Pc(53) int i = 0; i < capacity; i++) {
				if (components[id][i] == null) {
					@Pc(74) byte[] bytes = archive.fetchFile(id, i);
					if (bytes != null) {
						@Pc(88) Component component = components[id][i] = new Component();
						component.id = (id << 16) + i;
						if (bytes[0] == -1) {
							component.decodeIf3(new Buffer(bytes));
						} else {
							component.decodeIf1(new Buffer(bytes));
						}
					}
				}
			}
			loaded[id] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(II)V")
	public static void discard(@OriginalArg(1) int id) {
		if (id == -1 || !loaded[id]) {
			return;
		}
		archive.discardUnpacked(id);
		if (components[id] == null) {
			return;
		}
		@Pc(25) boolean discard = true;
		for (@Pc(27) int i = 0; i < components[id].length; i++) {
			if (components[id][i] != null) {
				if (components[id][i].type == 2) {
					discard = false;
				} else {
					components[id][i] = null;
				}
			}
		}
		if (discard) {
			components[id] = null;
		}
		loaded[id] = false;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)Lclient!wf;")
	public static Component getComponent(@OriginalArg(1) int id) {
		@Pc(7) int interfaceId = id >> 16;
		@Pc(19) int componentId = id & 0xFFFF;
		if (components[interfaceId] == null || components[interfaceId][componentId] == null) {
			@Pc(34) boolean success = load(interfaceId);
			if (!success) {
				return null;
			}
		}
		return components[interfaceId][componentId];
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
	public static void clear() {
		components = new Component[archive.capacity()][];
		loaded = new boolean[archive.capacity()];
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZLclient!rl;I)V")
	public static void closeSubInterface(@OriginalArg(1) SubInterface subInterface, @OriginalArg(0) boolean discard) {
		@Pc(9) int componentId = (int) subInterface.key;
		@Pc(12) int id = subInterface.id;
		subInterface.unlink();
		if (discard) {
			discard(id);
		}
		resetServerActiveProperties(id);
		@Pc(28) Component component = getComponent(componentId);
		if (component != null) {
			Static28.method3270(component);
		}
		@Pc(35) int local35 = Static7.anInt5634;
		for (@Pc(42) int local42 = 0; local42 < local35; local42++) {
			if (Static31.method3659(Static6.aShortArray100[local42])) {
				Static25.method2929(local42);
			}
		}
		if (Static7.anInt5634 == 1) {
			Static1.aBoolean17 = false;
			Static8.method66(Static6.anInt4440, Static3.anInt2394, Static5.anInt3890, Static4.anInt3455);
		} else {
			Static8.method66(Static6.anInt4440, Static3.anInt2394, Static5.anInt3890, Static4.anInt3455);
			@Pc(75) int local75 = Fonts.b12Full.getStringWidth(LocalisedText.CHOOSE_OPTION);
			for (@Pc(77) int local77 = 0; local77 < Static7.anInt5634; local77++) {
				@Pc(86) int local86 = Fonts.b12Full.getStringWidth(Static26.method2992(local77));
				if (local86 > local75) {
					local75 = local86;
				}
			}
			Static3.anInt2394 = (Static7.aBoolean389 ? 26 : 22) + Static7.anInt5634 * 15;
			Static6.anInt4440 = local75 + 8;
		}
		if (topLevelInterface != -1) {
			Static28.method3277(topLevelInterface, 1);
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIBI)Lclient!rl;")
	public static SubInterface openSubInterface(@OriginalArg(3) int componentId, @OriginalArg(0) int id, @OriginalArg(1) int type) {
		@Pc(9) SubInterface subInterface = new SubInterface();
		subInterface.type = type;
		subInterface.id = id;
		subInterfaces.put(componentId, subInterface);
		Static9.method230(id);
		@Pc(28) Component component = getComponent(componentId);
		if (component != null) {
			Static28.method3270(component);
		}
		if (Static6.aClass185_14 != null) {
			Static28.method3270(Static6.aClass185_14);
			Static6.aClass185_14 = null;
		}
		@Pc(52) int local52 = Static7.anInt5634;
		for (@Pc(54) int local54 = 0; local54 < local52; local54++) {
			if (Static31.method3659(Static6.aShortArray100[local54])) {
				Static25.method2929(local54);
			}
		}
		if (Static7.anInt5634 == 1) {
			Static1.aBoolean17 = false;
			Static8.method66(Static6.anInt4440, Static3.anInt2394, Static5.anInt3890, Static4.anInt3455);
		} else {
			Static8.method66(Static6.anInt4440, Static3.anInt2394, Static5.anInt3890, Static4.anInt3455);
			@Pc(93) int local93 = Fonts.b12Full.getStringWidth(LocalisedText.CHOOSE_OPTION);
			for (@Pc(95) int local95 = 0; local95 < Static7.anInt5634; local95++) {
				@Pc(108) int local108 = Fonts.b12Full.getStringWidth(Static26.method2992(local95));
				if (local93 < local108) {
					local93 = local108;
				}
			}
			Static3.anInt2394 = (Static7.aBoolean389 ? 26 : 22) + Static7.anInt5634 * 15;
			Static6.anInt4440 = local93 + 8;
		}
		if (component != null) {
			Static34.method4251(false, component);
		}
		Static14.method1102(id);
		if (topLevelInterface != -1) {
			Static28.method3277(topLevelInterface, 1);
		}
		return subInterface;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(BI)V")
	private static void resetServerActiveProperties(@OriginalArg(1) int id) {
		for (@Pc(16) Node node = serverActiveProperties.head(); node != null; node = serverActiveProperties.next()) {
			if ((node.key >> 48 & 0xFFFFL) == (long) id) {
				node.unlink();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!wf;)Lclient!on;")
	public static ServerActiveProperties getServerActiveProperties(@OriginalArg(0) Component component) {
		@Pc(13) ServerActiveProperties serverActiveProperties = (ServerActiveProperties) InterfaceList.serverActiveProperties.get(((long) component.id << 32) + (long) component.createdComponentId);
		return serverActiveProperties == null ? component.serverActiveProperties : serverActiveProperties;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IBI)Lclient!wf;")
	public static Component getCreatedComponent(@OriginalArg(0) int componentId, @OriginalArg(2) int createdComponentId) {
		@Pc(9) Component component = getComponent(componentId);
		if (createdComponentId == -1) {
			return component;
		} else if (component == null || component.createdComponents == null || createdComponentId >= component.createdComponents.length) {
			return null;
		} else {
			return component.createdComponents[createdComponentId];
		}
	}
}
