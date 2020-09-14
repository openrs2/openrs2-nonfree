import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class TextureOp35 extends TextureOp {

	@OriginalMember(owner = "client!sh", name = "W", descriptor = "I")
	private int anInt4832 = 4096;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
	public TextureOp35() {
		super(1, true);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] method4694(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			@Pc(30) int[] local30 = this.method4699(arg0 - 1 & Static6.anInt5001, 0);
			@Pc(36) int[] local36 = this.method4699(arg0, 0);
			@Pc(46) int[] local46 = this.method4699(arg0 + 1 & Static6.anInt5001, 0);
			for (@Pc(48) int local48 = 0; local48 < Static2.anInt1626; local48++) {
				@Pc(63) int local63 = this.anInt4832 * (local46[local48] - local30[local48]);
				@Pc(83) int local83 = this.anInt4832 * (local36[Static1.anInt901 & local48 + 1] - local36[Static1.anInt901 & local48 - 1]);
				@Pc(87) int local87 = local83 >> 12;
				@Pc(91) int local91 = local63 >> 12;
				@Pc(97) int local97 = local91 * local91 >> 12;
				@Pc(103) int local103 = local87 * local87 >> 12;
				@Pc(117) int local117 = (int) (Math.sqrt((double) ((float) (local97 + local103 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(128) int local128 = local117 == 0 ? 0 : 16777216 / local117;
				local16[local48] = 4096 - local128;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt4832 = buffer.readUnsignedShort();
		}
	}
}
