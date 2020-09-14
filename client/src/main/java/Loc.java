import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public final class Loc extends Node {

	@OriginalMember(owner = "client!ch", name = "r", descriptor = "[I")
	public static final int[] LAYERS = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
	public int angle;

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
	public int id;

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
	public int layer;

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
	public int y;

	@OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
	public int anInt4439;

	@OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
	public int z;

	@OriginalMember(owner = "client!ra", name = "z", descriptor = "I")
	public int shape;

	@OriginalMember(owner = "client!ra", name = "A", descriptor = "I")
	public int anInt4443;

	@OriginalMember(owner = "client!ra", name = "B", descriptor = "I")
	public int anInt4444;

	@OriginalMember(owner = "client!ra", name = "D", descriptor = "I")
	public int x;

	@OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
	public int anInt4436 = -1;

	@OriginalMember(owner = "client!ra", name = "E", descriptor = "I")
	public int anInt4446 = 0;
}
