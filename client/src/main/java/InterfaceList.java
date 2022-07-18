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

	@OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
	public static int loginScreenId;

	@OriginalMember(owner = "client!kl", name = "Z", descriptor = "Lclient!ic;")
	public static HashTable subInterfaces = new HashTable(8);

	@OriginalMember(owner = "client!ei", name = "D", descriptor = "Lclient!ic;")
	public static final HashTable serverActiveProperties = new HashTable(512);

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "Lclient!ll;")
	public static final LinkedList lowPriorityRequests = new LinkedList();

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "Lclient!ll;")
	public static final LinkedList mediumPriorityRequests = new LinkedList();

	@OriginalMember(owner = "client!e", name = "v", descriptor = "Lclient!ll;")
	public static final LinkedList highPriorityRequests = new LinkedList();

	@OriginalMember(owner = "client!t", name = "f", descriptor = "I")
	public static int transmitTimer = 1;

	@OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
	public static int miscTransmitAt = 0;

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "[I")
	public static final int[] keyCodes = new int[128];

	@OriginalMember(owner = "client!ol", name = "w", descriptor = "[I")
	public static final int[] keyChars = new int[128];

	@OriginalMember(owner = "client!td", name = "cb", descriptor = "I")
	public static int keyQueueSize = 0;

	@OriginalMember(owner = "client!sn", name = "W", descriptor = "[Z")
	public static final boolean[] rectangleRedraw = new boolean[100];

	@OriginalMember(owner = "client!t", name = "g", descriptor = "[I")
	public static final int[] rectangleX = new int[100];

	@OriginalMember(owner = "client!vi", name = "cb", descriptor = "[I")
	public static final int[] rectangleY = new int[100];

	@OriginalMember(owner = "client!nb", name = "D", descriptor = "[I")
	public static final int[] rectangleWidth = new int[100];

	@OriginalMember(owner = "client!un", name = "v", descriptor = "[I")
	public static final int[] rectangleHeight = new int[100];

	@OriginalMember(owner = "client!af", name = "F", descriptor = "I")
	public static int rectangles = 0;

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
		@Pc(35) int local35 = MiniMenu.size;
		for (@Pc(42) int local42 = 0; local42 < local35; local42++) {
			if (Static31.method3659(MiniMenu.actions[local42])) {
				MiniMenu.remove(local42);
			}
		}
		if (MiniMenu.size == 1) {
			Static1.aBoolean17 = false;
			Static8.method66(Static6.anInt4440, Static3.anInt2394, Static5.anInt3890, Static4.anInt3455);
		} else {
			Static8.method66(Static6.anInt4440, Static3.anInt2394, Static5.anInt3890, Static4.anInt3455);
			@Pc(75) int local75 = Fonts.b12Full.getStringWidth(LocalisedText.CHOOSE_OPTION);
			for (@Pc(77) int local77 = 0; local77 < MiniMenu.size; local77++) {
				@Pc(86) int local86 = Fonts.b12Full.getStringWidth(MiniMenu.getOp(local77));
				if (local86 > local75) {
					local75 = local86;
				}
			}
			Static3.anInt2394 = (Static7.aBoolean389 ? 26 : 22) + MiniMenu.size * 15;
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
		method230(id);
		@Pc(28) Component component = getComponent(componentId);
		if (component != null) {
			Static28.method3270(component);
		}
		if (Static6.aClass185_14 != null) {
			Static28.method3270(Static6.aClass185_14);
			Static6.aClass185_14 = null;
		}
		@Pc(52) int local52 = MiniMenu.size;
		for (@Pc(54) int local54 = 0; local54 < local52; local54++) {
			if (Static31.method3659(MiniMenu.actions[local54])) {
				MiniMenu.remove(local54);
			}
		}
		if (MiniMenu.size == 1) {
			Static1.aBoolean17 = false;
			Static8.method66(Static6.anInt4440, Static3.anInt2394, Static5.anInt3890, Static4.anInt3455);
		} else {
			Static8.method66(Static6.anInt4440, Static3.anInt2394, Static5.anInt3890, Static4.anInt3455);
			@Pc(93) int local93 = Fonts.b12Full.getStringWidth(LocalisedText.CHOOSE_OPTION);
			for (@Pc(95) int local95 = 0; local95 < MiniMenu.size; local95++) {
				@Pc(108) int local108 = Fonts.b12Full.getStringWidth(MiniMenu.getOp(local95));
				if (local93 < local108) {
					local93 = local108;
				}
			}
			Static3.anInt2394 = (Static7.aBoolean389 ? 26 : 22) + MiniMenu.size * 15;
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

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILclient!wf;B)Ljava/lang/String;")
	public static String getOp(@OriginalArg(1) Component component, @OriginalArg(0) int index) {
		if (!getServerActiveProperties(component).isButtonEnabled(index) && component.onOp == null) {
			return null;
		} else if (component.ops == null || index >= component.ops.length || component.ops[index] == null || component.ops[index].trim().length() == 0) {
			return Static1.qaOpTest ? "Hidden-" + index : null;
		} else {
			return component.ops[index];
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!wf;)Z")
	public static boolean isHidden(@OriginalArg(0) Component component) {
		if (Static1.qaOpTest) {
			if (getServerActiveProperties(component).events != 0) {
				return false;
			}
			if (component.type == 0) {
				return false;
			}
		}
		return component.hidden;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!wf;)Lclient!wf;")
	public static Component method691(@OriginalArg(0) Component component) {
		@Pc(4) int dragDepth = getServerActiveProperties(component).getDragDepth();
		if (dragDepth == 0) {
			return null;
		}
		for (@Pc(10) int i = 0; i < dragDepth; i++) {
			component = getComponent(component.layer);
			if (component == null) {
				return null;
			}
		}
		return component;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!wf;)Lclient!wf;")
	public static Component method2942(@OriginalArg(1) Component component) {
		if (component.layer != -1) {
			return getComponent(component.layer);
		}
		@Pc(20) int id = component.id >>> 16;
		@Pc(33) HashTableIterator iterator = new HashTableIterator(subInterfaces);
		for (@Pc(38) SubInterface subInterface = (SubInterface) iterator.head(); subInterface != null; subInterface = (SubInterface) iterator.next()) {
			if (id == subInterface.id) {
				return getComponent((int) subInterface.key);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!wf;I)Lclient!wf;")
	static Component method1403(@OriginalArg(0) Component component) {
		@Pc(2) Component local2 = method691(component);
		if (local2 == null) {
			local2 = component.dragComponent;
		}
		return local2;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V")
	public static void method230(@OriginalArg(1) int componentId) {
		if (!load(componentId)) {
			return;
		}
		@Pc(22) Component[] components = InterfaceList.components[componentId];
		for (@Pc(24) int i = 0; i < components.length; i++) {
			@Pc(36) Component component = components[i];
			if (component != null) {
				component.anInt5979 = 1;
				component.anInt5892 = 0;
				component.anInt5897 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
	public static void closeModal() {
		Protocol.outboundBuffer.writeOpcode(189);
		for (@Pc(14) SubInterface subInterface = (SubInterface) subInterfaces.head(); subInterface != null; subInterface = (SubInterface) subInterfaces.next()) {
			if (subInterface.type == 0) {
				closeSubInterface(subInterface, true);
			}
		}
		if (Static6.aClass185_14 != null) {
			Static28.method3270(Static6.aClass185_14);
			Static6.aClass185_14 = null;
		}
	}
}
