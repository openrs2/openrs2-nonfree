import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public class TextureOp39 extends TextureOp {

	@OriginalMember(owner = "client!og", name = "T", descriptor = "I")
	protected int anInt5834;

	@OriginalMember(owner = "client!og", name = "cb", descriptor = "I")
	protected int anInt5843;

	@OriginalMember(owner = "client!og", name = "jb", descriptor = "[I")
	protected int[] anIntArray655;

	@OriginalMember(owner = "client!og", name = "ib", descriptor = "I")
	private int anInt5847 = -1;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
	public TextureOp39() {
		super(0, false);
	}

	@OriginalMember(owner = "client!og", name = "f", descriptor = "(I)Z")
	protected final boolean method4702() {
		if (this.anIntArray655 != null) {
			return true;
		} else if (this.anInt5847 >= 0) {
			@Pc(38) SoftwareSprite local38 = Static6.anInt4366 < 0 ? Static24.method2679(Static1.aClass58_7, this.anInt5847) : Static24.method2654(Static1.aClass58_7, Static6.anInt4366, this.anInt5847);
			local38.method2176();
			this.anIntArray655 = local38.pixels;
			this.anInt5843 = local38.width;
			this.anInt5834 = local38.height;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt5847 = buffer.readUnsignedShort();
		}
	}

	@OriginalMember(owner = "client!og", name = "e", descriptor = "(I)V")
	@Override
	public final void method4696() {
		super.method4696();
		this.anIntArray655 = null;
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(I)I")
	@Override
	public final int method4688() {
		return this.anInt5847;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4695(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = this.aClass114_41.method2696(arg0);
		if (this.aClass114_41.aBoolean230 && this.method4702()) {
			@Pc(32) int[] local32 = local16[0];
			@Pc(36) int[] local36 = local16[1];
			@Pc(40) int[] local40 = local16[2];
			@Pc(60) int local60 = (Static1.anInt379 == this.anInt5834 ? arg0 : arg0 * this.anInt5834 / Static1.anInt379) * this.anInt5843;
			if (this.anInt5843 == Static2.anInt1626) {
				for (@Pc(70) int local70 = 0; local70 < Static2.anInt1626; local70++) {
					@Pc(79) int local79 = this.anIntArray655[local60++];
					local40[local70] = (local79 & 0xFF) << 4;
					local36[local70] = local79 >> 4 & 0xFF0;
					local32[local70] = local79 >> 12 & 0xFF0;
				}
			} else {
				for (@Pc(110) int local110 = 0; local110 < Static2.anInt1626; local110++) {
					@Pc(120) int local120 = this.anInt5843 * local110 / Static2.anInt1626;
					@Pc(127) int local127 = this.anIntArray655[local120 + local60];
					local40[local110] = (local127 & 0xFF) << 4;
					local36[local110] = local127 >> 4 & 0xFF0;
					local32[local110] = local127 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}
}
