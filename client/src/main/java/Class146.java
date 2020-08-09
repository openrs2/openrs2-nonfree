import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class146 {

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "[I")
	public final int[] anIntArray471 = new int[2];

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray12 = new int[2][2][4];

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray11 = new int[2][2][4];

	@OriginalMember(owner = "client!qo", name = "h", descriptor = "[I")
	private final int[] anIntArray472 = new int[2];

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIF)F")
	private float method3638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray11[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray11[arg0][1][arg1] - this.anIntArrayArrayArray11[arg0][0][arg1]);
		local30 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local30 / 20.0F));
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IF)I")
	public final int method3640(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		if (arg0 == 0) {
			@Pc(20) float local20 = (float) this.anIntArray472[0] + (float) (this.anIntArray472[1] - this.anIntArray472[0]) * arg1;
			local20 *= 0.0030517578F;
			Static6.aFloat107 = (float) Math.pow(0.1D, (double) (local20 / 20.0F));
			Static6.anInt4425 = (int) (Static6.aFloat107 * 65536.0F);
		}
		if (this.anIntArray471[arg0] == 0) {
			return 0;
		}
		@Pc(50) float local50 = this.method3638(arg0, 0, arg1);
		Static6.aFloatArrayArray2[arg0][0] = -2.0F * local50 * (float) Math.cos((double) this.method3643(arg0, 0, arg1));
		Static6.aFloatArrayArray2[arg0][1] = local50 * local50;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray471[arg0]; local77++) {
			@Pc(89) float local89 = this.method3638(arg0, local77, arg1);
			@Pc(102) float local102 = -2.0F * local89 * (float) Math.cos((double) this.method3643(arg0, local77, arg1));
			@Pc(106) float local106 = local89 * local89;
			Static6.aFloatArrayArray2[arg0][local77 * 2 + 1] = Static6.aFloatArrayArray2[arg0][local77 * 2 - 1] * local106;
			Static6.aFloatArrayArray2[arg0][local77 * 2] = Static6.aFloatArrayArray2[arg0][local77 * 2 - 1] * local102 + Static6.aFloatArrayArray2[arg0][local77 * 2 - 2] * local106;
			for (@Pc(162) int local162 = local77 * 2 - 1; local162 >= 2; local162--) {
				@Pc(168) float[] local168 = Static6.aFloatArrayArray2[arg0];
				local168[local162] += Static6.aFloatArrayArray2[arg0][local162 - 1] * local102 + Static6.aFloatArrayArray2[arg0][local162 - 2] * local106;
			}
			@Pc(197) float[] local197 = Static6.aFloatArrayArray2[arg0];
			local197[1] += Static6.aFloatArrayArray2[arg0][0] * local102 + local106;
			local197 = Static6.aFloatArrayArray2[arg0];
			local197[0] += local102;
		}
		if (arg0 == 0) {
			for (@Pc(226) int local226 = 0; local226 < this.anIntArray471[0] * 2; local226++) {
				@Pc(237) float[] local237 = Static6.aFloatArrayArray2[0];
				local237[local226] *= Static6.aFloat107;
			}
		}
		for (@Pc(247) int local247 = 0; local247 < this.anIntArray471[arg0] * 2; local247++) {
			Static6.anIntArrayArray38[arg0][local247] = (int) (Static6.aFloatArrayArray2[arg0][local247] * 65536.0F);
		}
		return this.anIntArray471[arg0] * 2;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!fd;Lclient!h;)V")
	public final void method3642(@OriginalArg(0) Buffer arg0, @OriginalArg(1) Class73 arg1) {
		@Pc(3) int local3 = arg0.readUnsignedByte();
		this.anIntArray471[0] = local3 >> 4;
		this.anIntArray471[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray472[0] = this.anIntArray472[1] = 0;
			return;
		}
		this.anIntArray472[0] = arg0.readUnsignedShort();
		this.anIntArray472[1] = arg0.readUnsignedShort();
		@Pc(37) int local37 = arg0.readUnsignedByte();
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (@Pc(44) int local44 = 0; local44 < this.anIntArray471[local39]; local44++) {
				this.anIntArrayArrayArray12[local39][0][local44] = arg0.readUnsignedShort();
				this.anIntArrayArrayArray11[local39][0][local44] = arg0.readUnsignedShort();
			}
		}
		for (@Pc(78) int local78 = 0; local78 < 2; local78++) {
			for (@Pc(83) int local83 = 0; local83 < this.anIntArray471[local78]; local83++) {
				if ((local37 & 0x1 << local78 * 4 << local83) == 0) {
					this.anIntArrayArrayArray12[local78][1][local83] = this.anIntArrayArrayArray12[local78][0][local83];
					this.anIntArrayArrayArray11[local78][1][local83] = this.anIntArrayArrayArray11[local78][0][local83];
				} else {
					this.anIntArrayArrayArray12[local78][1][local83] = arg0.readUnsignedShort();
					this.anIntArrayArrayArray11[local78][1][local83] = arg0.readUnsignedShort();
				}
			}
		}
		if (local37 != 0 || this.anIntArray472[1] != this.anIntArray472[0]) {
			arg1.method1676(arg0);
		}
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(IIF)F")
	private float method3643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray12[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray12[arg0][1][arg1] - this.anIntArrayArrayArray12[arg0][0][arg1]);
		local30 *= 1.2207031E-4F;
		return Static30.method3641(local30);
	}
}
