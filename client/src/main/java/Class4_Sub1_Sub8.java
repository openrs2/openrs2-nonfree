import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class4_Sub1_Sub8 extends Class4_Sub1 {

	@OriginalMember(owner = "client!fi", name = "U", descriptor = "I")
	private int anInt1831;

	@OriginalMember(owner = "client!fi", name = "cb", descriptor = "I")
	private int anInt1838;

	@OriginalMember(owner = "client!fi", name = "fb", descriptor = "[I")
	private int[] anIntArray126;

	@OriginalMember(owner = "client!fi", name = "ib", descriptor = "I")
	private int anInt1842 = -1;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub8() {
		super(0, false);
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] method4695(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass114_41.method2696(arg0);
		if (this.aClass114_41.aBoolean230 && this.method1399()) {
			@Pc(39) int local39 = this.anInt1831 * (Static1.anInt379 == this.anInt1838 ? arg0 : arg0 * this.anInt1838 / Static1.anInt379);
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[2];
			@Pc(51) int[] local51 = local11[1];
			if (this.anInt1831 == Static2.anInt1626) {
				for (@Pc(61) int local61 = 0; local61 < Static2.anInt1626; local61++) {
					@Pc(74) int local74 = this.anIntArray126[local39++];
					local47[local61] = (local74 & 0xFF) << 4;
					local51[local61] = local74 >> 4 & 0xFF0;
					local43[local61] = local74 >> 12 & 0xFF0;
				}
			} else {
				for (@Pc(105) int local105 = 0; local105 < Static2.anInt1626; local105++) {
					@Pc(115) int local115 = this.anInt1831 * local105 / Static2.anInt1626;
					@Pc(122) int local122 = this.anIntArray126[local115 + local39];
					local47[local105] = (local122 & 0xFF) << 4;
					local51[local105] = local122 >> 4 & 0xFF0;
					local43[local105] = local122 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)Z")
	private boolean method1399() {
		if (this.anIntArray126 != null) {
			return true;
		} else if (this.anInt1842 >= 0) {
			@Pc(21) int local21 = Static1.anInt379;
			@Pc(23) int local23 = Static2.anInt1626;
			@Pc(34) int local34 = Static6.anInterface3_1.method417(this.anInt1842).aBoolean234 ? 64 : 128;
			this.anIntArray126 = Static6.anInterface3_1.method415(local34, 1.0F, this.anInt1842, local34);
			this.anInt1838 = local34;
			this.anInt1831 = local34;
			Static11.method524(local23, local21);
			return this.anIntArray126 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void method4687(@OriginalArg(1) Buffer arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1842 = arg0.readUnsignedShort();
		}
	}

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)V")
	@Override
	public final void method4696() {
		super.method4696();
		this.anIntArray126 = null;
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)I")
	@Override
	public final int method4691() {
		return this.anInt1842;
	}
}
