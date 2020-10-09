import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class TextureOp8 extends TextureOp {

	@OriginalMember(owner = "client!of", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!of", name = "X", descriptor = "[I")
	private int[] anIntArray410;

	@OriginalMember(owner = "client!of", name = "hb", descriptor = "[I")
	private int[] anIntArray411;

	@OriginalMember(owner = "client!of", name = "cb", descriptor = "[S")
	private final short[] aShortArray73 = new short[257];

	@OriginalMember(owner = "client!of", name = "db", descriptor = "I")
	private int anInt3819 = 0;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
	public TextureOp8() {
		super(1, true);
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(II)[I")
	private int[] method3181(@OriginalArg(0) int arg0) {
		if (arg0 >= 0) {
			return this.anIntArrayArray34.length > arg0 ? this.anIntArrayArray34[arg0] : this.anIntArray411;
		} else {
			return this.anIntArray410;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] method4694(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.monochromeImageCache.get(arg0);
		if (this.monochromeImageCache.invalid) {
			@Pc(28) int[] local28 = this.method4699(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static2.anInt1626; local30++) {
				@Pc(43) int local43 = local28[local30] >> 4;
				if (local43 < 0) {
					local43 = 0;
				}
				if (local43 > 256) {
					local43 = 256;
				}
				local11[local30] = this.aShortArray73[local43];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!of", name = "f", descriptor = "(I)V")
	private void method3182() {
		@Pc(13) int local13 = this.anInt3819;
		if (local13 == 2) {
			for (@Pc(28) int local28 = 0; local28 < 257; local28++) {
				@Pc(35) int local35 = local28 << 4;
				@Pc(37) int local37;
				for (local37 = 1; local37 < this.anIntArrayArray34.length - 1 && local35 >= this.anIntArrayArray34[local37][0]; local37++) {
				}
				@Pc(62) int[] local62 = this.anIntArrayArray34[local37];
				@Pc(69) int[] local69 = this.anIntArrayArray34[local37 - 1];
				@Pc(78) int local78 = this.method3181(local37 - 2)[1];
				@Pc(82) int local82 = local62[1];
				@Pc(86) int local86 = local69[1];
				@Pc(92) int local92 = local82 - local78;
				@Pc(101) int local101 = this.method3181(local37 + 1)[1];
				@Pc(118) int local118 = (local35 - local69[0] << 12) / (local62[0] - local69[0]);
				@Pc(128) int local128 = local101 + local86 - local78 - local82;
				@Pc(135) int local135 = local78 - local86 - local128;
				@Pc(141) int local141 = local118 * local118 >> 12;
				@Pc(147) int local147 = local118 * local92 >> 12;
				@Pc(157) int local157 = (local118 * local128 >> 12) * local141 >> 12;
				@Pc(163) int local163 = local141 * local135 >> 12;
				@Pc(172) int local172 = local157 + local163 + local147 + local86;
				if (local172 <= -32768) {
					local172 = -32767;
				}
				if (local172 >= 32768) {
					local172 = 32767;
				}
				this.aShortArray73[local28] = (short) local172;
			}
		} else if (local13 == 1) {
			for (@Pc(200) int local200 = 0; local200 < 257; local200++) {
				@Pc(207) int local207 = local200 << 4;
				@Pc(209) int local209;
				for (local209 = 1; this.anIntArrayArray34.length - 1 > local209 && this.anIntArrayArray34[local209][0] <= local207; local209++) {
				}
				@Pc(238) int[] local238 = this.anIntArrayArray34[local209 - 1];
				@Pc(243) int[] local243 = this.anIntArrayArray34[local209];
				@Pc(261) int local261 = (local207 - local238[0] << 12) / (local243[0] - local238[0]);
				@Pc(274) int local274 = 4096 - Static3.anIntArray222[local261 >> 5 & 0xFF] >> 1;
				@Pc(279) int local279 = 4096 - local274;
				@Pc(293) int local293 = local274 * local243[1] + local279 * local238[1] >> 12;
				if (local293 <= -32768) {
					local293 = -32767;
				}
				if (local293 >= 32768) {
					local293 = 32767;
				}
				this.aShortArray73[local200] = (short) local293;
			}
		} else {
			for (@Pc(320) int local320 = 0; local320 < 257; local320++) {
				@Pc(327) int local327 = local320 << 4;
				@Pc(329) int local329;
				for (local329 = 1; this.anIntArrayArray34.length - 1 > local329 && local327 >= this.anIntArrayArray34[local329][0]; local329++) {
				}
				@Pc(362) int[] local362 = this.anIntArrayArray34[local329 - 1];
				@Pc(367) int[] local367 = this.anIntArrayArray34[local329];
				@Pc(384) int local384 = (local327 - local362[0] << 12) / (local367[0] - local362[0]);
				@Pc(389) int local389 = 4096 - local384;
				@Pc(403) int local403 = local367[1] * local384 + local389 * local362[1] >> 12;
				if (local403 <= -32768) {
					local403 = -32767;
				}
				if (local403 >= 32768) {
					local403 = 32767;
				}
				this.aShortArray73[local320] = (short) local403;
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "g", descriptor = "(I)V")
	private void method3183() {
		@Pc(8) int[] local8 = this.anIntArrayArray34[0];
		@Pc(13) int[] local13 = this.anIntArrayArray34[1];
		@Pc(22) int[] local22 = this.anIntArrayArray34[this.anIntArrayArray34.length - 1];
		@Pc(31) int[] local31 = this.anIntArrayArray34[this.anIntArrayArray34.length - 2];
		this.anIntArray411 = new int[] { local31[0] + local31[0] - local22[0], local31[1] + local31[1] - local22[1] };
		this.anIntArray410 = new int[] { local8[0] + local8[0] - local13[0], local8[1] + local8[1] - local13[1] };
	}

	@OriginalMember(owner = "client!of", name = "e", descriptor = "(B)V")
	@Override
	public final void postDecode() {
		if (this.anIntArrayArray34 == null) {
			this.anIntArrayArray34 = new int[][] { { 0, 0 }, { 4096, 4096 } };
		}
		if (this.anIntArrayArray34.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt3819 == 2) {
			this.method3183();
		}
		Static37.method4645();
		this.method3182();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code != 0) {
			return;
		}
		this.anInt3819 = buffer.readUnsignedByte();
		this.anIntArrayArray34 = new int[buffer.readUnsignedByte()][2];
		for (@Pc(26) int local26 = 0; local26 < this.anIntArrayArray34.length; local26++) {
			this.anIntArrayArray34[local26][0] = buffer.readUnsignedShort();
			this.anIntArrayArray34[local26][1] = buffer.readUnsignedShort();
		}
	}
}
