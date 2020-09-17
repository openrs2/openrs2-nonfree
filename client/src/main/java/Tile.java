import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public final class Tile extends Node {

	@OriginalMember(owner = "client!nh", name = "q", descriptor = "B")
	public byte aByte14;

	@OriginalMember(owner = "client!nh", name = "r", descriptor = "Z")
	public boolean aBoolean255;

	@OriginalMember(owner = "client!nh", name = "t", descriptor = "Lclient!qf;")
	public Class142 aClass142_1;

	@OriginalMember(owner = "client!nh", name = "v", descriptor = "Lclient!ve;")
	public Wall wall;

	@OriginalMember(owner = "client!nh", name = "y", descriptor = "Z")
	public boolean aBoolean256;

	@OriginalMember(owner = "client!nh", name = "A", descriptor = "I")
	public int anInt3549;

	@OriginalMember(owner = "client!nh", name = "B", descriptor = "Lclient!vf;")
	public Class180 aClass180_1;

	@OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
	public int anInt3553;

	@OriginalMember(owner = "client!nh", name = "G", descriptor = "I")
	public int sceneryLen;

	@OriginalMember(owner = "client!nh", name = "J", descriptor = "Lclient!vl;")
	public WallDecor wallDecor;

	@OriginalMember(owner = "client!nh", name = "L", descriptor = "Lclient!to;")
	public Class166 aClass166_1;

	@OriginalMember(owner = "client!nh", name = "P", descriptor = "Lclient!nh;")
	public Tile aClass4_Sub19_1;

	@OriginalMember(owner = "client!nh", name = "Q", descriptor = "Lclient!lb;")
	public SecondarySceneGraphLinkedList particles;

	@OriginalMember(owner = "client!nh", name = "R", descriptor = "I")
	public int anInt3558;

	@OriginalMember(owner = "client!nh", name = "S", descriptor = "Z")
	public boolean aBoolean257;

	@OriginalMember(owner = "client!nh", name = "T", descriptor = "I")
	public int anInt3559;

	@OriginalMember(owner = "client!nh", name = "V", descriptor = "Lclient!dm;")
	public GroundDecor groundDecor;

	@OriginalMember(owner = "client!nh", name = "s", descriptor = "[Lclient!co;")
	public final Scenery[] scenery = new Scenery[5];

	@OriginalMember(owner = "client!nh", name = "M", descriptor = "[I")
	public final int[] interiorFlags = new int[5];

	@OriginalMember(owner = "client!nh", name = "D", descriptor = "I")
	public int allInteriorFlags = 0;

	@OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
	public int anInt3552;

	@OriginalMember(owner = "client!nh", name = "N", descriptor = "I")
	public final int y;

	@OriginalMember(owner = "client!nh", name = "z", descriptor = "I")
	public final int x;

	@OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
	public final int z;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(III)V")
	public Tile(@OriginalArg(0) int y, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		this.y = this.anInt3552 = y;
		this.x = x;
		this.z = z;
	}
}
