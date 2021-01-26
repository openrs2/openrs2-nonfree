import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class AnimBase extends Node {

	@OriginalMember(owner = "client!af", name = "z", descriptor = "I")
	public final int id;

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
	public AnimBase(@OriginalArg(0) int id, @OriginalArg(1) byte[] bytes) {
		this.id = id;
		@Pc(11) Buffer buffer = new Buffer(bytes);
		this.anInt107 = buffer.readUnsignedByte();
		this.anIntArray11 = new int[this.anInt107];
		this.anIntArray12 = new int[this.anInt107];
		this.aBooleanArray1 = new boolean[this.anInt107];
		this.anIntArrayArray1 = new int[this.anInt107][];
		for (@Pc(38) int i = 0; i < this.anInt107; i++) {
			this.anIntArray11[i] = buffer.readUnsignedByte();
		}
		for (@Pc(54) int i = 0; i < this.anInt107; i++) {
			this.aBooleanArray1[i] = buffer.readUnsignedByte() == 1;
		}
		for (@Pc(79) int i = 0; i < this.anInt107; i++) {
			this.anIntArray12[i] = buffer.readUnsignedShort();
		}
		for (@Pc(99) int i = 0; i < this.anInt107; i++) {
			this.anIntArrayArray1[i] = new int[buffer.readUnsignedByte()];
		}
		for (@Pc(120) int i = 0; i < this.anInt107; i++) {
			for (@Pc(126) int j = 0; j < this.anIntArrayArray1[i].length; j++) {
				this.anIntArrayArray1[i][j] = buffer.readUnsignedByte();
			}
		}
	}
}
