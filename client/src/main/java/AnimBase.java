import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class AnimBase extends Node {

	@OriginalMember(owner = "client!af", name = "z", descriptor = "I")
	public final int id;

	@OriginalMember(owner = "client!af", name = "r", descriptor = "I")
	public final int transforms;

	@OriginalMember(owner = "client!af", name = "o", descriptor = "[I")
	public final int[] types;

	@OriginalMember(owner = "client!af", name = "t", descriptor = "[I")
	public final int[] parts;

	@OriginalMember(owner = "client!af", name = "x", descriptor = "[Z")
	public final boolean[] shadow;

	@OriginalMember(owner = "client!af", name = "B", descriptor = "[[I")
	public final int[][] bones;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(I[B)V")
	public AnimBase(@OriginalArg(0) int id, @OriginalArg(1) byte[] bytes) {
		this.id = id;
		@Pc(11) Buffer buffer = new Buffer(bytes);
		this.transforms = buffer.readUnsignedByte();
		this.types = new int[this.transforms];
		this.parts = new int[this.transforms];
		this.shadow = new boolean[this.transforms];
		this.bones = new int[this.transforms][];
		for (@Pc(38) int i = 0; i < this.transforms; i++) {
			this.types[i] = buffer.readUnsignedByte();
		}
		for (@Pc(54) int i = 0; i < this.transforms; i++) {
			this.shadow[i] = buffer.readUnsignedByte() == 1;
		}
		for (@Pc(79) int i = 0; i < this.transforms; i++) {
			this.parts[i] = buffer.readUnsignedShort();
		}
		for (@Pc(99) int i = 0; i < this.transforms; i++) {
			this.bones[i] = new int[buffer.readUnsignedByte()];
		}
		for (@Pc(120) int i = 0; i < this.transforms; i++) {
			for (@Pc(126) int j = 0; j < this.bones[i].length; j++) {
				this.bones[i][j] = buffer.readUnsignedByte();
			}
		}
	}
}
