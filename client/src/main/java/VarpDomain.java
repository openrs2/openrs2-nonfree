import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class VarpDomain {
	@OriginalMember(owner = "client!da", name = "u", descriptor = "[I")
	public static final int[] serverVarps = new int[2500];

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "[I")
	public static final int[] varps = new int[2500];

	@OriginalMember(owner = "client!jh", name = "j", descriptor = "[I")
	public static final int[] updatedVarps = new int[32];

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
	public static int updatedVarpsWriterIndex = 0;

	@OriginalMember(owner = "client!un", name = "t", descriptor = "Lclient!ic;")
	private static HashTable pendingUpdates = new HashTable(16);

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IBI)V")
	public static void setVarpServer(@OriginalArg(0) int id, @OriginalArg(2) int value) {
		serverVarps[id] = value;
		@Pc(21) LongNode node = (LongNode) pendingUpdates.get(id);
		if (node == null) {
			@Pc(28) LongNode newNode = new LongNode(0x4000000000000001L);
			pendingUpdates.put(id, newNode);
		} else if (node.value != 0x4000000000000001L) {
			node.value = MonotonicClock.currentTimeMillis() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
	public static void clear() {
		for (@Pc(11) int i = 0; i < VarpTypeList.capacity; i++) {
			@Pc(18) VarpType type = VarpTypeList.get(i);
			if (type != null && type.clientCode == 0) {
				serverVarps[i] = 0;
				varps[i] = 0;
			}
		}
		pendingUpdates = new HashTable(16);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)I")
	public static int poll(@OriginalArg(1) boolean head) {
		@Pc(13) long now = MonotonicClock.currentTimeMillis();
		for (@Pc(27) LongNode node = head ? (LongNode) pendingUpdates.head() : (LongNode) pendingUpdates.next(); node != null; node = (LongNode) pendingUpdates.next()) {
			if (now > (node.value & 0x3FFFFFFFFFFFFFFFL)) {
				if ((node.value & 0x4000000000000000L) != 0L) {
					@Pc(55) int id = (int) node.key;
					varps[id] = serverVarps[id];
					node.unlink();
					return id;
				}
				node.unlink();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)V")
	public static void setVarbitServer(@OriginalArg(2) int id, @OriginalArg(1) int value) {
		@Pc(7) VarbitType type = VarbitTypeList.get(id);
		@Pc(10) int varp = type.baseVar;
		@Pc(13) int start = type.startBit;
		@Pc(16) int end = type.endBit;
		@Pc(39) int mask = GlSolidColorTexture.BIT_MASKS[end - start];
		if (value < 0 || value > mask) {
			value = 0;
		}
		@Pc(57) int shiftedMask = mask << start;
		setVarpServer(varp, value << start & shiftedMask | ~shiftedMask & serverVarps[varp]);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZII)V")
	public static void setVarpClient(@OriginalArg(1) int id, @OriginalArg(2) int value) {
		varps[id] = value;
		@Pc(20) LongNode node = (LongNode) pendingUpdates.get(id);
		if (node == null) {
			@Pc(30) LongNode newNode = new LongNode(MonotonicClock.currentTimeMillis() + 500L);
			pendingUpdates.put(id, newNode);
		} else {
			node.value = MonotonicClock.currentTimeMillis() + 500L;
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(III)V")
	public static void setVarbitClient(@OriginalArg(0) int id, @OriginalArg(2) int value) {
		@Pc(7) VarbitType type = VarbitTypeList.get(id);
		@Pc(10) int varp = type.baseVar;
		@Pc(13) int start = type.startBit;
		@Pc(16) int end = type.endBit;
		@Pc(23) int mask = GlSolidColorTexture.BIT_MASKS[end - start];
		if (value < 0 || value > mask) {
			value = 0;
		}
		@Pc(40) int shiftedMask = mask << start;
		setVarpClient(varp, value << start & shiftedMask | varps[varp] & ~shiftedMask);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)I")
	public static int getVarbit(@OriginalArg(1) int id) {
		@Pc(13) VarbitType type = VarbitTypeList.get(id);
		@Pc(16) int varp = type.baseVar;
		@Pc(19) int start = type.startBit;
		@Pc(22) int end = type.endBit;
		@Pc(29) int mask = GlSolidColorTexture.BIT_MASKS[end - start];
		return mask & varps[varp] >> start;
	}
}
