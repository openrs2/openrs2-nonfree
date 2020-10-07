import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class TextureOp30 extends TextureOp {

	@OriginalMember(owner = "client!sc", name = "Y", descriptor = "I")
	private int anInt4748 = 2048;

	@OriginalMember(owner = "client!sc", name = "W", descriptor = "I")
	private int anInt4746 = 1024;

	@OriginalMember(owner = "client!sc", name = "ib", descriptor = "I")
	private int anInt4756 = 3072;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
	public TextureOp30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] method4694(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			@Pc(20) int[] local20 = this.method4699(arg0, 0);
			for (@Pc(22) int local22 = 0; local22 < Static2.anInt1626; local22++) {
				local7[local22] = this.anInt4746 + (local20[local22] * this.anInt4748 >> 12);
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] method4695(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = this.aClass114_41.method2696(arg0);
		if (this.aClass114_41.aBoolean230) {
			@Pc(23) int[][] local23 = this.method4686(0, arg0);
			@Pc(27) int[] local27 = local23[0];
			@Pc(31) int[] local31 = local23[1];
			@Pc(35) int[] local35 = local13[0];
			@Pc(39) int[] local39 = local13[2];
			@Pc(43) int[] local43 = local13[1];
			@Pc(47) int[] local47 = local23[2];
			for (@Pc(49) int local49 = 0; local49 < Static2.anInt1626; local49++) {
				local35[local49] = (this.anInt4748 * local27[local49] >> 12) + this.anInt4746;
				local43[local49] = this.anInt4746 + (local31[local49] * this.anInt4748 >> 12);
				local39[local49] = this.anInt4746 + (this.anInt4748 * local47[local49] >> 12);
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "(B)V")
	@Override
	public final void postDecode() {
		this.anInt4748 = this.anInt4756 - this.anInt4746;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt4746 = buffer.readUnsignedShort();
		} else if (code == 1) {
			this.anInt4756 = buffer.readUnsignedShort();
		} else if (code == 2) {
			this.aBoolean397 = buffer.readUnsignedByte() == 1;
		}
	}
}
