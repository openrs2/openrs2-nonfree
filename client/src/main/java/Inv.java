import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Inv extends Node {

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "Lclient!ic;")
	private static HashTable inventories = new HashTable(32);

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "[I")
	private int[] types = new int[] { -1 };

	@OriginalMember(owner = "client!nd", name = "x", descriptor = "[I")
	private int[] counts = new int[] { 0 };

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)V")
	public static void deleteAll() {
		inventories = new HashTable(32);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBI)I")
	public static int getSlotTotal(@OriginalArg(2) int id, @OriginalArg(0) int type) {
		@Pc(12) Inv inv = (Inv) inventories.get(id);
		if (inv == null) {
			return 0;
		} else if (type == -1) {
			return 0;
		} else {
			@Pc(35) int total = 0;
			for (@Pc(37) int i = 0; i < inv.counts.length; i++) {
				if (inv.types[i] == type) {
					total += inv.counts[i];
				}
			}
			return total;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V")
	public static void delete(@OriginalArg(1) int id) {
		@Pc(16) Inv inventory = (Inv) inventories.get(id);
		if (inventory != null) {
			inventory.unlink();
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(III)I")
	public static int getItemCount(@OriginalArg(2) int id, @OriginalArg(1) int slot) {
		@Pc(10) Inv inv = (Inv) inventories.get(id);
		if (inv == null) {
			return 0;
		} else if (slot >= 0 && slot < inv.counts.length) {
			return inv.counts[slot];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIII)V")
	public static void set(@OriginalArg(1) int id, @OriginalArg(2) int slot, @OriginalArg(3) int type, @OriginalArg(4) int count) {
		@Pc(12) Inv inv = (Inv) inventories.get(id);
		if (inv == null) {
			inv = new Inv();
			inventories.put(id, inv);
		}
		if (slot >= inv.types.length) {
			@Pc(41) int[] newTypes = new int[slot + 1];
			@Pc(46) int[] newCounts = new int[slot + 1];
			for (@Pc(48) int i = 0; i < inv.types.length; i++) {
				newTypes[i] = inv.types[i];
				newCounts[i] = inv.counts[i];
			}
			for (@Pc(74) int i = inv.types.length; i < slot; i++) {
				newTypes[i] = -1;
				newCounts[i] = 0;
			}
			inv.counts = newCounts;
			inv.types = newTypes;
		}
		inv.types[slot] = type;
		inv.counts[slot] = count;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IBIZ)I")
	public static int getTotalParam(@OriginalArg(2) int id, @OriginalArg(0) int param, @OriginalArg(3) boolean stack) {
		@Pc(12) Inv inv = (Inv) inventories.get(id);
		if (inv == null) {
			return 0;
		}
		@Pc(19) int total = 0;
		for (@Pc(26) int i = 0; i < inv.types.length; i++) {
			if (inv.types[i] >= 0 && inv.types[i] < ObjTypeList.capacity) {
				@Pc(61) ObjType type = ObjTypeList.get(inv.types[i]);
				if (type.params != null) {
					@Pc(72) IntNode node = (IntNode) type.params.get(param);
					if (node != null) {
						if (stack) {
							total += node.value * inv.counts[i];
						} else {
							total += node.value;
						}
					}
				}
			}
		}
		return total;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)I")
	public static int getFreeSpace(@OriginalArg(0) int id) {
		if (id < 0) {
			return 0;
		}
		@Pc(18) Inv inv = (Inv) inventories.get(id);
		if (inv == null) {
			return InvTypeList.get(id).size;
		}
		@Pc(32) int freeSpace = 0;
		for (@Pc(34) int i = 0; i < inv.types.length; i++) {
			if (inv.types[i] == -1) {
				freeSpace++;
			}
		}
		return freeSpace + InvTypeList.get(id).size - inv.types.length;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(II)V")
	public static void clear(@OriginalArg(1) int id) {
		@Pc(8) Inv inv = (Inv) inventories.get(id);
		if (inv != null) {
			for (@Pc(24) int i = 0; i < inv.types.length; i++) {
				inv.types[i] = -1;
				inv.counts[i] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZ)I")
	public static int getItemType(@OriginalArg(0) int id, @OriginalArg(1) int slot) {
		@Pc(14) Inv inv = (Inv) inventories.get(id);
		if (inv == null) {
			return -1;
		} else if (slot >= 0 && slot < inv.types.length) {
			return inv.types[slot];
		} else {
			return -1;
		}
	}
}
