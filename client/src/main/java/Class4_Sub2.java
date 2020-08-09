import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class4_Sub2 extends Node {

	@OriginalMember(owner = "client!af", name = "z", descriptor = "I")
	public final int anInt112;

	@OriginalMember(owner = "client!af", name = "r", descriptor = "I")
	public final int anInt107;

	@OriginalMember(owner = "client!af", name = "o", descriptor = "[I")
	public final int[] anIntArray11;

	@OriginalMember(owner = "client!af", name = "t", descriptor = "[I")
	public final int[] anIntArray12;

	@OriginalMember(owner = "client!af", name = "x", descriptor = "[Z")
	public final boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!af", name = "B", descriptor = "[[I")
	public final int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(I[B)V")
	public Class4_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt112 = arg0;
		@Pc(11) Buffer local11 = new Buffer(arg1);
		this.anInt107 = local11.readUnsignedByte();
		this.anIntArray11 = new int[this.anInt107];
		this.anIntArray12 = new int[this.anInt107];
		this.aBooleanArray1 = new boolean[this.anInt107];
		this.anIntArrayArray1 = new int[this.anInt107][];
		for (@Pc(38) int local38 = 0; local38 < this.anInt107; local38++) {
			this.anIntArray11[local38] = local11.readUnsignedByte();
		}
		for (@Pc(54) int local54 = 0; local54 < this.anInt107; local54++) {
			this.aBooleanArray1[local54] = local11.readUnsignedByte() == 1;
		}
		for (@Pc(79) int local79 = 0; local79 < this.anInt107; local79++) {
			this.anIntArray12[local79] = local11.readUnsignedShort();
		}
		for (@Pc(99) int local99 = 0; local99 < this.anInt107; local99++) {
			this.anIntArrayArray1[local99] = new int[local11.readUnsignedByte()];
		}
		for (@Pc(120) int local120 = 0; local120 < this.anInt107; local120++) {
			for (@Pc(126) int local126 = 0; local126 < this.anIntArrayArray1[local120].length; local126++) {
				this.anIntArrayArray1[local120][local126] = local11.readUnsignedByte();
			}
		}
	}
}
