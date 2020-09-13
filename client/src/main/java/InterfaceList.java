import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

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
		@Pc(19) int slot = id & 0xFFFF;
		if (components[interfaceId] == null || components[interfaceId][slot] == null) {
			@Pc(34) boolean success = load(interfaceId);
			if (!success) {
				return null;
			}
		}
		return components[interfaceId][slot];
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
	public static void clear() {
		components = new Component[archive.capacity()][];
		loaded = new boolean[archive.capacity()];
	}
}
