import java.util.Random;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class TextureOp15 extends TextureOp {

	@OriginalMember(owner = "client!rh", name = "cb", descriptor = "[S")
	private short[] aShortArray81 = new short[512];

	@OriginalMember(owner = "client!rh", name = "fb", descriptor = "I")
	private int anInt4553 = 2;

	@OriginalMember(owner = "client!rh", name = "eb", descriptor = "I")
	private int anInt4552 = 2048;

	@OriginalMember(owner = "client!rh", name = "Z", descriptor = "I")
	private int anInt4549 = 0;

	@OriginalMember(owner = "client!rh", name = "Y", descriptor = "I")
	private int anInt4548 = 1;

	@OriginalMember(owner = "client!rh", name = "db", descriptor = "I")
	private int anInt4551 = 5;

	@OriginalMember(owner = "client!rh", name = "gb", descriptor = "[B")
	private byte[] aByteArray61 = new byte[512];

	@OriginalMember(owner = "client!rh", name = "mb", descriptor = "I")
	private int anInt4557 = 5;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
	public TextureOp15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "(B)V")
	@Override
	public final void postDecode() {
		this.aByteArray61 = Static28.method3321(this.anInt4549);
		this.method3715();
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] method4694(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.monochromeImageCache.get(arg0);
		if (this.monochromeImageCache.invalid) {
			@Pc(30) int local30 = Static6.anIntArray478[arg0] * this.anInt4557 + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static2.anInt1626; local40++) {
				Static5.anInt5205 = Integer.MAX_VALUE;
				Static4.anInt2979 = Integer.MAX_VALUE;
				Static4.anInt2464 = Integer.MAX_VALUE;
				Static5.anInt4260 = Integer.MAX_VALUE;
				@Pc(65) int local65 = Static4.anIntArray231[local40] * this.anInt4551 + 2048;
				@Pc(69) int local69 = local65 >> 12;
				@Pc(73) int local73 = local69 + 1;
				for (@Pc(77) int local77 = local34 - 1; local77 <= local38; local77++) {
					@Pc(106) int local106 = this.aByteArray61[(local77 >= this.anInt4557 ? local77 - this.anInt4557 : local77) & 0xFF] & 0xFF;
					for (@Pc(110) int local110 = local69 - 1; local110 <= local73; local110++) {
						@Pc(137) int local137 = (this.aByteArray61[local106 + (this.anInt4551 <= local110 ? local110 - this.anInt4551 : local110) & 0xFF] & 0xFF) * 2;
						@Pc(151) int local151 = local65 - (local110 << 12) - this.aShortArray81[local137++];
						@Pc(164) int local164 = local30 - (local77 << 12) - this.aShortArray81[local137];
						@Pc(167) int local167 = this.anInt4548;
						@Pc(203) int local203;
						if (local167 == 1) {
							local203 = local164 * local164 + local151 * local151 >> 12;
						} else if (local167 == 3) {
							@Pc(213) int local213 = local151 >= 0 ? local151 : -local151;
							@Pc(220) int local220 = local164 < 0 ? -local164 : local164;
							local203 = local220 >= local213 ? local220 : local213;
						} else if (local167 == 4) {
							@Pc(244) int local244 = (int) (Math.sqrt((double) ((float) (local151 < 0 ? -local151 : local151) / 4096.0F)) * 4096.0D);
							@Pc(262) int local262 = (int) (Math.sqrt((double) ((float) (local164 >= 0 ? local164 : -local164) / 4096.0F)) * 4096.0D);
							@Pc(266) int local266 = local262 + local244;
							local203 = local266 * local266 >> 12;
						} else if (local167 == 5) {
							@Pc(278) int local278 = local151 * local151;
							@Pc(282) int local282 = local164 * local164;
							local203 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local278 + local282) / 1.6777216E7F))) * 4096.0D);
						} else if (local167 == 2) {
							local203 = (local151 < 0 ? -local151 : local151) + (local164 >= 0 ? local164 : -local164);
						} else {
							local203 = (int) (Math.sqrt((double) ((float) (local151 * local151 + local164 * local164) / 1.6777216E7F)) * 4096.0D);
						}
						if (local203 < Static5.anInt4260) {
							Static5.anInt5205 = Static4.anInt2979;
							Static4.anInt2979 = Static4.anInt2464;
							Static4.anInt2464 = Static5.anInt4260;
							Static5.anInt4260 = local203;
						} else if (local203 < Static4.anInt2464) {
							Static5.anInt5205 = Static4.anInt2979;
							Static4.anInt2979 = Static4.anInt2464;
							Static4.anInt2464 = local203;
						} else if (local203 < Static4.anInt2979) {
							Static5.anInt5205 = Static4.anInt2979;
							Static4.anInt2979 = local203;
						} else if (Static5.anInt5205 > local203) {
							Static5.anInt5205 = local203;
						}
					}
				}
				@Pc(390) int local390 = this.anInt4553;
				if (local390 == 0) {
					local17[local40] = Static5.anInt4260;
				} else if (local390 == 1) {
					local17[local40] = Static4.anInt2464;
				} else if (local390 == 3) {
					local17[local40] = Static4.anInt2979;
				} else if (local390 == 4) {
					local17[local40] = Static5.anInt5205;
				} else if (local390 == 2) {
					local17[local40] = Static4.anInt2464 - Static5.anInt4260;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "(I)V")
	private void method3715() {
		@Pc(16) Random local16 = new Random((long) this.anInt4549);
		this.aShortArray81 = new short[512];
		if (this.anInt4552 > 0) {
			for (@Pc(27) int local27 = 0; local27 < 512; local27++) {
				this.aShortArray81[local27] = (short) RandomUtils.nextInt(local16, this.anInt4552);
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt4551 = this.anInt4557 = buffer.readUnsignedByte();
		} else if (code == 1) {
			this.anInt4549 = buffer.readUnsignedByte();
		} else if (code == 2) {
			this.anInt4552 = buffer.readUnsignedShort();
		} else if (code == 3) {
			this.anInt4553 = buffer.readUnsignedByte();
		} else if (code == 4) {
			this.anInt4548 = buffer.readUnsignedByte();
		} else if (code == 5) {
			this.anInt4551 = buffer.readUnsignedByte();
		} else if (code == 6) {
			this.anInt4557 = buffer.readUnsignedByte();
		}
	}
}
