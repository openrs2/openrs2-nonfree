import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class113 {

	@OriginalMember(owner = "client!m", name = "b", descriptor = "I")
	private int anInt3272;

	@OriginalMember(owner = "client!m", name = "e", descriptor = "I")
	private int anInt3274;

	@OriginalMember(owner = "client!m", name = "g", descriptor = "I")
	private int anInt3276;

	@OriginalMember(owner = "client!m", name = "l", descriptor = "I")
	private int anInt3280;

	@OriginalMember(owner = "client!m", name = "m", descriptor = "[I")
	private final int[] anIntArray310 = new int[256];

	@OriginalMember(owner = "client!m", name = "n", descriptor = "[I")
	private final int[] anIntArray311 = new int[256];

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "([I)V")
	public Class113(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray310[local13] = arg0[local13];
		}
		this.method2676();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	private void method2676() {
		@Pc(8) int local8 = -1640531527;
		@Pc(10) int local10 = -1640531527;
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(21) int local21 = -1640531527;
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			@Pc(38) int local38 = local21 ^ local20 << 11;
			@Pc(42) int local42 = local16 + local38;
			@Pc(46) int local46 = local20 + local18;
			local46 ^= local18 >>> 2;
			@Pc(56) int local56 = local18 + local42;
			local56 ^= local42 << 8;
			@Pc(66) int local66 = local14 + local46;
			local42 += local66;
			local16 = local42 ^ local66 >>> 16;
			@Pc(80) int local80 = local10 + local16;
			@Pc(84) int local84 = local12 + local56;
			local66 += local84;
			local14 = local66 ^ local84 << 10;
			local84 += local80;
			local12 = local84 ^ local80 >>> 4;
			@Pc(108) int local108 = local8 + local14;
			local80 += local108;
			local38 += local12;
			local10 = local80 ^ local108 << 8;
			local20 = local46 + local10;
			local108 += local38;
			local8 = local108 ^ local38 >>> 9;
			local21 = local38 + local20;
			local18 = local56 + local8;
		}
		for (@Pc(149) int local149 = 0; local149 < 256; local149 += 8) {
			@Pc(161) int local161 = local8 + this.anIntArray310[local149 + 7];
			@Pc(170) int local170 = local10 + this.anIntArray310[local149 + 6];
			@Pc(179) int local179 = local20 + this.anIntArray310[local149 + 1];
			@Pc(188) int local188 = local14 + this.anIntArray310[local149 + 4];
			@Pc(197) int local197 = local12 + this.anIntArray310[local149 + 5];
			@Pc(204) int local204 = local21 + this.anIntArray310[local149];
			local204 ^= local179 << 11;
			@Pc(219) int local219 = local16 + this.anIntArray310[local149 + 3];
			@Pc(228) int local228 = local18 + this.anIntArray310[local149 + 2];
			local179 += local228;
			local179 ^= local228 >>> 2;
			local188 += local179;
			local219 += local204;
			local228 += local219;
			local228 ^= local219 << 8;
			local197 += local228;
			local219 += local188;
			local16 = local219 ^ local188 >>> 16;
			local170 += local16;
			local188 += local197;
			local14 = local188 ^ local197 << 10;
			local161 += local14;
			local197 += local170;
			local12 = local197 ^ local170 >>> 4;
			local170 += local161;
			local10 = local170 ^ local161 << 8;
			local204 += local12;
			local161 += local204;
			local8 = local161 ^ local204 >>> 9;
			local20 = local179 + local10;
			local21 = local204 + local20;
			local18 = local228 + local8;
			this.anIntArray311[local149] = local21;
			this.anIntArray311[local149 + 1] = local20;
			this.anIntArray311[local149 + 2] = local18;
			this.anIntArray311[local149 + 3] = local16;
			this.anIntArray311[local149 + 4] = local14;
			this.anIntArray311[local149 + 5] = local12;
			this.anIntArray311[local149 + 6] = local10;
			this.anIntArray311[local149 + 7] = local8;
		}
		for (@Pc(393) int local393 = 0; local393 < 256; local393 += 8) {
			@Pc(407) int local407 = local14 + this.anIntArray311[local393 + 4];
			@Pc(416) int local416 = local16 + this.anIntArray311[local393 + 3];
			@Pc(425) int local425 = local20 + this.anIntArray311[local393 + 1];
			@Pc(434) int local434 = local18 + this.anIntArray311[local393 + 2];
			@Pc(443) int local443 = local10 + this.anIntArray311[local393 + 6];
			@Pc(452) int local452 = local12 + this.anIntArray311[local393 + 5];
			@Pc(459) int local459 = local21 + this.anIntArray311[local393];
			@Pc(468) int local468 = local8 + this.anIntArray311[local393 + 7];
			local459 ^= local425 << 11;
			local416 += local459;
			local425 += local434;
			local425 ^= local434 >>> 2;
			local407 += local425;
			local434 += local416;
			local434 ^= local416 << 8;
			local416 += local407;
			local16 = local416 ^ local407 >>> 16;
			local452 += local434;
			local407 += local452;
			local443 += local16;
			local14 = local407 ^ local452 << 10;
			local468 += local14;
			local452 += local443;
			local12 = local452 ^ local443 >>> 4;
			local459 += local12;
			local443 += local468;
			local10 = local443 ^ local468 << 8;
			local20 = local425 + local10;
			local468 += local459;
			local8 = local468 ^ local459 >>> 9;
			local21 = local459 + local20;
			this.anIntArray311[local393] = local21;
			this.anIntArray311[local393 + 1] = local20;
			local18 = local434 + local8;
			this.anIntArray311[local393 + 2] = local18;
			this.anIntArray311[local393 + 3] = local16;
			this.anIntArray311[local393 + 4] = local14;
			this.anIntArray311[local393 + 5] = local12;
			this.anIntArray311[local393 + 6] = local10;
			this.anIntArray311[local393 + 7] = local8;
		}
		this.method2681();
		this.anInt3272 = 256;
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(I)I")
	public final int method2678() {
		if (this.anInt3272-- == 0) {
			this.method2681();
			this.anInt3272 = 255;
		}
		return this.anIntArray310[this.anInt3272];
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(I)V")
	private void method2681() {
		this.anInt3276 += ++this.anInt3274;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(27) int local27 = this.anIntArray311[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt3280 ^= this.anInt3280 << 13;
				} else {
					this.anInt3280 ^= this.anInt3280 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt3280 ^= this.anInt3280 << 2;
			} else {
				this.anInt3280 ^= this.anInt3280 >>> 16;
			}
			this.anInt3280 += this.anIntArray311[local19 + 128 & 0xFF];
			@Pc(121) int local121;
			this.anIntArray311[local19] = local121 = this.anInt3276 + this.anIntArray311[local27 >> 2 & 0xFF] + this.anInt3280;
			this.anIntArray310[local19] = this.anInt3276 = this.anIntArray311[local121 >> 8 >> 2 & 0xFF] + local27;
		}
	}
}
