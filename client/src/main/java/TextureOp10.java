import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class TextureOp10 extends TextureOp {

	@OriginalMember(owner = "client!vm", name = "W", descriptor = "[[I")
	private int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!vm", name = "bb", descriptor = "[I")
	private final int[] anIntArray644 = new int[257];

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
	public TextureOp10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IB)V")
	private void method4549(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray49 = new int[2][4];
			this.anIntArrayArray49[0][0] = 0;
			this.anIntArrayArray49[0][3] = 0;
			this.anIntArrayArray49[0][1] = 0;
			this.anIntArrayArray49[1][0] = 4096;
			this.anIntArrayArray49[0][2] = 0;
			this.anIntArrayArray49[1][2] = 4096;
			this.anIntArrayArray49[1][1] = 4096;
			this.anIntArrayArray49[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray49 = new int[8][4];
			this.anIntArrayArray49[0][0] = 0;
			this.anIntArrayArray49[0][1] = 2650;
			this.anIntArrayArray49[0][2] = 2602;
			this.anIntArrayArray49[1][0] = 2867;
			this.anIntArrayArray49[2][0] = 3072;
			this.anIntArrayArray49[1][2] = 1799;
			this.anIntArrayArray49[1][1] = 2313;
			this.anIntArrayArray49[2][2] = 1734;
			this.anIntArrayArray49[3][2] = 1220;
			this.anIntArrayArray49[4][2] = 963;
			this.anIntArrayArray49[0][3] = 2361;
			this.anIntArrayArray49[5][2] = 2152;
			this.anIntArrayArray49[3][0] = 3276;
			this.anIntArrayArray49[2][1] = 2618;
			this.anIntArrayArray49[6][2] = 1060;
			this.anIntArrayArray49[4][0] = 3481;
			this.anIntArrayArray49[1][3] = 1558;
			this.anIntArrayArray49[7][2] = 1413;
			this.anIntArrayArray49[5][0] = 3686;
			this.anIntArrayArray49[6][0] = 3891;
			this.anIntArrayArray49[7][0] = 4096;
			this.anIntArrayArray49[3][1] = 2296;
			this.anIntArrayArray49[2][3] = 1413;
			this.anIntArrayArray49[3][3] = 947;
			this.anIntArrayArray49[4][1] = 2072;
			this.anIntArrayArray49[5][1] = 2730;
			this.anIntArrayArray49[6][1] = 2232;
			this.anIntArrayArray49[7][1] = 1686;
			this.anIntArrayArray49[4][3] = 722;
			this.anIntArrayArray49[5][3] = 1766;
			this.anIntArrayArray49[6][3] = 915;
			this.anIntArrayArray49[7][3] = 1140;
		} else if (arg0 == 3) {
			this.anIntArrayArray49 = new int[7][4];
			this.anIntArrayArray49[0][3] = 4096;
			this.anIntArrayArray49[0][2] = 0;
			this.anIntArrayArray49[1][3] = 4096;
			this.anIntArrayArray49[2][3] = 0;
			this.anIntArrayArray49[0][0] = 0;
			this.anIntArrayArray49[3][3] = 0;
			this.anIntArrayArray49[4][3] = 0;
			this.anIntArrayArray49[1][2] = 4096;
			this.anIntArrayArray49[2][2] = 4096;
			this.anIntArrayArray49[5][3] = 4096;
			this.anIntArrayArray49[3][2] = 4096;
			this.anIntArrayArray49[0][1] = 0;
			this.anIntArrayArray49[1][0] = 663;
			this.anIntArrayArray49[1][1] = 0;
			this.anIntArrayArray49[6][3] = 4096;
			this.anIntArrayArray49[2][1] = 0;
			this.anIntArrayArray49[4][2] = 0;
			this.anIntArrayArray49[5][2] = 0;
			this.anIntArrayArray49[2][0] = 1363;
			this.anIntArrayArray49[3][0] = 2048;
			this.anIntArrayArray49[3][1] = 4096;
			this.anIntArrayArray49[4][0] = 2727;
			this.anIntArrayArray49[6][2] = 0;
			this.anIntArrayArray49[4][1] = 4096;
			this.anIntArrayArray49[5][0] = 3411;
			this.anIntArrayArray49[6][0] = 4096;
			this.anIntArrayArray49[5][1] = 4096;
			this.anIntArrayArray49[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray49 = new int[6][4];
			this.anIntArrayArray49[0][0] = 0;
			this.anIntArrayArray49[0][1] = 0;
			this.anIntArrayArray49[0][2] = 0;
			this.anIntArrayArray49[1][2] = 0;
			this.anIntArrayArray49[0][3] = 0;
			this.anIntArrayArray49[1][0] = 1843;
			this.anIntArrayArray49[1][1] = 0;
			this.anIntArrayArray49[2][0] = 2457;
			this.anIntArrayArray49[1][3] = 1493;
			this.anIntArrayArray49[2][1] = 0;
			this.anIntArrayArray49[3][1] = 0;
			this.anIntArrayArray49[2][2] = 0;
			this.anIntArrayArray49[3][2] = 1124;
			this.anIntArrayArray49[3][0] = 2781;
			this.anIntArrayArray49[2][3] = 2939;
			this.anIntArrayArray49[3][3] = 3565;
			this.anIntArrayArray49[4][0] = 3481;
			this.anIntArrayArray49[5][0] = 4096;
			this.anIntArrayArray49[4][3] = 4031;
			this.anIntArrayArray49[4][2] = 3084;
			this.anIntArrayArray49[4][1] = 546;
			this.anIntArrayArray49[5][2] = 4096;
			this.anIntArrayArray49[5][3] = 4096;
			this.anIntArrayArray49[5][1] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray49 = new int[16][4];
			this.anIntArrayArray49[0][2] = 192;
			this.anIntArrayArray49[0][1] = 80;
			this.anIntArrayArray49[0][3] = 321;
			this.anIntArrayArray49[0][0] = 0;
			this.anIntArrayArray49[1][2] = 449;
			this.anIntArrayArray49[1][1] = 321;
			this.anIntArrayArray49[2][1] = 578;
			this.anIntArrayArray49[1][3] = 562;
			this.anIntArrayArray49[2][2] = 690;
			this.anIntArrayArray49[2][3] = 803;
			this.anIntArrayArray49[3][3] = 1140;
			this.anIntArrayArray49[3][1] = 947;
			this.anIntArrayArray49[3][2] = 995;
			this.anIntArrayArray49[1][0] = 155;
			this.anIntArrayArray49[2][0] = 389;
			this.anIntArrayArray49[3][0] = 671;
			this.anIntArrayArray49[4][2] = 1397;
			this.anIntArrayArray49[5][2] = 1429;
			this.anIntArrayArray49[4][0] = 897;
			this.anIntArrayArray49[4][3] = 1509;
			this.anIntArrayArray49[6][2] = 1461;
			this.anIntArrayArray49[5][3] = 1413;
			this.anIntArrayArray49[4][1] = 1285;
			this.anIntArrayArray49[6][3] = 1333;
			this.anIntArrayArray49[5][0] = 1175;
			this.anIntArrayArray49[7][3] = 1702;
			this.anIntArrayArray49[8][3] = 2056;
			this.anIntArrayArray49[6][0] = 1368;
			this.anIntArrayArray49[9][3] = 2666;
			this.anIntArrayArray49[10][3] = 3276;
			this.anIntArrayArray49[5][1] = 1525;
			this.anIntArrayArray49[7][0] = 1507;
			this.anIntArrayArray49[7][2] = 1525;
			this.anIntArrayArray49[6][1] = 1734;
			this.anIntArrayArray49[11][3] = 3228;
			this.anIntArrayArray49[8][0] = 1736;
			this.anIntArrayArray49[9][0] = 2088;
			this.anIntArrayArray49[7][1] = 1413;
			this.anIntArrayArray49[8][2] = 1590;
			this.anIntArrayArray49[9][2] = 2056;
			this.anIntArrayArray49[8][1] = 1108;
			this.anIntArrayArray49[10][0] = 2355;
			this.anIntArrayArray49[9][1] = 1766;
			this.anIntArrayArray49[11][0] = 2691;
			this.anIntArrayArray49[10][1] = 2409;
			this.anIntArrayArray49[12][0] = 3031;
			this.anIntArrayArray49[13][0] = 3522;
			this.anIntArrayArray49[10][2] = 2586;
			this.anIntArrayArray49[11][1] = 3116;
			this.anIntArrayArray49[11][2] = 3148;
			this.anIntArrayArray49[12][3] = 3196;
			this.anIntArrayArray49[14][0] = 3727;
			this.anIntArrayArray49[15][0] = 4096;
			this.anIntArrayArray49[12][2] = 3710;
			this.anIntArrayArray49[13][3] = 3019;
			this.anIntArrayArray49[13][2] = 3421;
			this.anIntArrayArray49[12][1] = 3806;
			this.anIntArrayArray49[14][3] = 3228;
			this.anIntArrayArray49[15][3] = 2746;
			this.anIntArrayArray49[13][1] = 3437;
			this.anIntArrayArray49[14][1] = 3116;
			this.anIntArrayArray49[15][1] = 2377;
			this.anIntArrayArray49[14][2] = 3148;
			this.anIntArrayArray49[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray49 = new int[4][4];
			this.anIntArrayArray49[0][3] = 0;
			this.anIntArrayArray49[0][1] = 0;
			this.anIntArrayArray49[1][3] = 0;
			this.anIntArrayArray49[0][2] = 4096;
			this.anIntArrayArray49[1][2] = 4096;
			this.anIntArrayArray49[2][3] = 0;
			this.anIntArrayArray49[2][2] = 4096;
			this.anIntArrayArray49[0][0] = 2048;
			this.anIntArrayArray49[3][3] = 0;
			this.anIntArrayArray49[1][1] = 4096;
			this.anIntArrayArray49[3][2] = 0;
			this.anIntArrayArray49[1][0] = 2867;
			this.anIntArrayArray49[2][1] = 4096;
			this.anIntArrayArray49[3][1] = 4096;
			this.anIntArrayArray49[2][0] = 3276;
			this.anIntArrayArray49[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "(I)V")
	private void method4550() {
		@Pc(9) int local9 = this.anIntArrayArray49.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < 257; local18++) {
			@Pc(23) int local23 = 0;
			@Pc(27) int local27 = local18 << 4;
			for (@Pc(29) int local29 = 0; local9 > local29 && local27 >= this.anIntArrayArray49[local29][0]; local29++) {
				local23++;
			}
			@Pc(76) int local76;
			@Pc(80) int local80;
			@Pc(72) int local72;
			if (local9 <= local23) {
				@Pc(68) int[] local68 = this.anIntArrayArray49[local9 - 1];
				local72 = local68[3];
				local76 = local68[1];
				local80 = local68[2];
			} else {
				@Pc(86) int[] local86 = this.anIntArrayArray49[local23];
				if (local23 <= 0) {
					local80 = local86[2];
					local76 = local86[1];
					local72 = local86[3];
				} else {
					@Pc(112) int[] local112 = this.anIntArrayArray49[local23 - 1];
					@Pc(129) int local129 = (local27 - local112[0] << 12) / (local86[0] - local112[0]);
					@Pc(134) int local134 = 4096 - local129;
					local80 = local129 * local86[2] + local112[2] * local134 >> 12;
					local76 = local86[1] * local129 + local134 * local112[1] >> 12;
					local72 = local86[3] * local129 + local112[3] * local134 >> 12;
				}
			}
			@Pc(181) int local181 = local80 >> 4;
			if (local181 < 0) {
				local181 = 0;
			} else if (local181 > 255) {
				local181 = 255;
			}
			@Pc(199) int local199 = local72 >> 4;
			@Pc(203) int local203 = local76 >> 4;
			if (local203 < 0) {
				local203 = 0;
			} else if (local203 > 255) {
				local203 = 255;
			}
			if (local199 < 0) {
				local199 = 0;
			} else if (local199 > 255) {
				local199 = 255;
			}
			this.anIntArray644[local18] = local199 | local181 << 8 | local203 << 16;
		}
	}

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "(B)V")
	@Override
	public final void postDecode() {
		if (this.anIntArrayArray49 == null) {
			this.method4549(1);
		}
		this.method4550();
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code != 0) {
			return;
		}
		@Pc(13) int local13 = buffer.readUnsignedByte();
		if (local13 != 0) {
			this.method4549(local13);
			return;
		}
		this.anIntArrayArray49 = new int[buffer.readUnsignedByte()][4];
		for (@Pc(31) int local31 = 0; local31 < this.anIntArrayArray49.length; local31++) {
			this.anIntArrayArray49[local31][0] = buffer.readUnsignedShort();
			this.anIntArrayArray49[local31][1] = buffer.readUnsignedByte() << 4;
			this.anIntArrayArray49[local31][2] = buffer.readUnsignedByte() << 4;
			this.anIntArrayArray49[local31][3] = buffer.readUnsignedByte() << 4;
		}
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] method4695(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = this.colorImageCache.get(arg0);
		if (this.colorImageCache.invalid) {
			@Pc(26) int[] local26 = this.method4699(arg0, 0);
			@Pc(30) int[] local30 = local15[1];
			@Pc(34) int[] local34 = local15[2];
			@Pc(38) int[] local38 = local15[0];
			for (@Pc(40) int local40 = 0; local40 < Static2.anInt1626; local40++) {
				@Pc(49) int local49 = local26[local40] >> 4;
				if (local49 < 0) {
					local49 = 0;
				}
				if (local49 > 256) {
					local49 = 256;
				}
				@Pc(69) int local69 = this.anIntArray644[local49];
				local38[local40] = local69 >> 12 & 0xFF0;
				local30[local40] = local69 >> 4 & 0xFF0;
				local34[local40] = (local69 & 0xFF) << 4;
			}
		}
		return local15;
	}
}
