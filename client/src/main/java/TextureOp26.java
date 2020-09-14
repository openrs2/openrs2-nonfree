import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class TextureOp26 extends TextureOp {

	@OriginalMember(owner = "client!mo", name = "T", descriptor = "I")
	private int anInt3394 = 0;

	@OriginalMember(owner = "client!mo", name = "V", descriptor = "I")
	private int anInt3396 = 4096;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
	public TextureOp26() {
		super(1, true);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt3394 = buffer.readUnsignedShort();
		} else if (code == 1) {
			this.anInt3396 = buffer.readUnsignedShort();
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] method4694(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			@Pc(27) int[] local27 = this.method4699(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static2.anInt1626; local29++) {
				@Pc(40) int local40 = local27[local29];
				local17[local29] = local40 >= this.anInt3394 && this.anInt3396 >= local40 ? 4096 : 0;
			}
		}
		return local17;
	}
}
