import java.util.Random;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class173 {

	@OriginalMember(owner = "client!uh", name = "s", descriptor = "[I")
	private static final int[] anIntArray607 = new int[32768];

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "[I")
	private static final int[] anIntArray602;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "Lclient!h;")
	private Class73 aClass73_1;

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "Lclient!h;")
	private Class73 aClass73_2;

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "Lclient!h;")
	private Class73 aClass73_3;

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "Lclient!h;")
	private Class73 aClass73_4;

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "Lclient!h;")
	private Class73 aClass73_5;

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "Lclient!h;")
	private Class73 aClass73_6;

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "Lclient!h;")
	private Class73 aClass73_7;

	@OriginalMember(owner = "client!uh", name = "p", descriptor = "Lclient!qo;")
	private Class146 aClass146_1;

	@OriginalMember(owner = "client!uh", name = "r", descriptor = "Lclient!h;")
	private Class73 aClass73_8;

	@OriginalMember(owner = "client!uh", name = "x", descriptor = "Lclient!h;")
	private Class73 aClass73_9;

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
	public int anInt5346 = 500;

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
	public int anInt5349 = 0;

	@OriginalMember(owner = "client!uh", name = "q", descriptor = "[I")
	private final int[] anIntArray606 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!uh", name = "o", descriptor = "[I")
	private final int[] anIntArray605 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
	private int anInt5347 = 0;

	@OriginalMember(owner = "client!uh", name = "n", descriptor = "[I")
	private final int[] anIntArray604 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
	private int anInt5348 = 100;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray607[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray602 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray602[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!fd;)V")
	public final void method4323(@OriginalArg(0) Buffer arg0) {
		this.aClass73_7 = new Class73();
		this.aClass73_7.method1674(arg0);
		this.aClass73_4 = new Class73();
		this.aClass73_4.method1674(arg0);
		@Pc(21) int local21 = arg0.readUnsignedByte();
		if (local21 != 0) {
			arg0.position--;
			this.aClass73_6 = new Class73();
			this.aClass73_6.method1674(arg0);
			this.aClass73_8 = new Class73();
			this.aClass73_8.method1674(arg0);
		}
		@Pc(51) int local51 = arg0.readUnsignedByte();
		if (local51 != 0) {
			arg0.position--;
			this.aClass73_5 = new Class73();
			this.aClass73_5.method1674(arg0);
			this.aClass73_2 = new Class73();
			this.aClass73_2.method1674(arg0);
		}
		@Pc(81) int local81 = arg0.readUnsignedByte();
		if (local81 != 0) {
			arg0.position--;
			this.aClass73_3 = new Class73();
			this.aClass73_3.method1674(arg0);
			this.aClass73_1 = new Class73();
			this.aClass73_1.method1674(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(116) int local116 = arg0.readUnsignedSmart();
			if (local116 == 0) {
				break;
			}
			this.anIntArray605[local109] = local116;
			this.anIntArray604[local109] = arg0.readSmart();
			this.anIntArray606[local109] = arg0.readUnsignedSmart();
		}
		this.anInt5347 = arg0.readUnsignedSmart();
		this.anInt5348 = arg0.readUnsignedSmart();
		this.anInt5346 = arg0.readUnsignedShort();
		this.anInt5349 = arg0.readUnsignedShort();
		this.aClass146_1 = new Class146();
		this.aClass73_9 = new Class73();
		this.aClass146_1.method3642(arg0, this.aClass73_9);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)[I")
	public final int[] method4325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		ArrayUtils.clear(Static7.anIntArray603, 0, arg0);
		if (arg1 < 10) {
			return Static7.anIntArray603;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass73_7.method1673();
		this.aClass73_4.method1673();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass73_6 != null) {
			this.aClass73_6.method1673();
			this.aClass73_8.method1673();
			local24 = (int) ((double) (this.aClass73_6.anInt2131 - this.aClass73_6.anInt2132) * 32.768D / local16);
			local26 = (int) ((double) this.aClass73_6.anInt2132 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass73_5 != null) {
			this.aClass73_5.method1673();
			this.aClass73_2.method1673();
			local63 = (int) ((double) (this.aClass73_5.anInt2131 - this.aClass73_5.anInt2132) * 32.768D / local16);
			local65 = (int) ((double) this.aClass73_5.anInt2132 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray605[local102] != 0) {
				Static7.anIntArray611[local102] = 0;
				Static7.anIntArray609[local102] = (int) ((double) this.anIntArray606[local102] * local16);
				Static7.anIntArray610[local102] = (this.anIntArray605[local102] << 14) / 100;
				Static7.anIntArray612[local102] = (int) ((double) (this.aClass73_7.anInt2131 - this.aClass73_7.anInt2132) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray604[local102]) / local16);
				Static7.anIntArray608[local102] = (int) ((double) this.aClass73_7.anInt2132 * 32.768D / local16);
			}
		}
		for (@Pc(177) int local177 = 0; local177 < arg0; local177++) {
			@Pc(185) int local185 = this.aClass73_7.method1675(arg0);
			@Pc(190) int local190 = this.aClass73_4.method1675(arg0);
			if (this.aClass73_6 != null) {
				@Pc(198) int local198 = this.aClass73_6.method1675(arg0);
				@Pc(203) int local203 = this.aClass73_8.method1675(arg0);
				local185 += this.method4326(local28, local203, this.aClass73_6.anInt2133) >> 1;
				local28 += (local198 * local24 >> 16) + local26;
			}
			if (this.aClass73_5 != null) {
				@Pc(233) int local233 = this.aClass73_5.method1675(arg0);
				@Pc(238) int local238 = this.aClass73_2.method1675(arg0);
				local190 = local190 * ((this.method4326(local67, local238, this.aClass73_5.anInt2133) >> 1) + 32768) >> 15;
				local67 += (local233 * local63 >> 16) + local65;
			}
			for (@Pc(266) int local266 = 0; local266 < 5; local266++) {
				if (this.anIntArray605[local266] != 0) {
					@Pc(281) int local281 = local177 + Static7.anIntArray609[local266];
					if (local281 < arg0) {
						@Pc(285) int[] local285 = Static7.anIntArray603;
						local285[local281] += this.method4326(Static7.anIntArray611[local266], local190 * Static7.anIntArray610[local266] >> 15, this.aClass73_7.anInt2133);
						local285 = Static7.anIntArray611;
						local285[local266] += (local185 * Static7.anIntArray612[local266] >> 16) + Static7.anIntArray608[local266];
					}
				}
			}
		}
		if (this.aClass73_3 != null) {
			this.aClass73_3.method1673();
			this.aClass73_1.method1673();
			@Pc(337) int local337 = 0;
			@Pc(341) boolean local341 = true;
			for (@Pc(343) int local343 = 0; local343 < arg0; local343++) {
				@Pc(351) int local351 = this.aClass73_3.method1675(arg0);
				@Pc(356) int local356 = this.aClass73_1.method1675(arg0);
				@Pc(374) int local374;
				if (local341) {
					local374 = this.aClass73_3.anInt2132 + ((this.aClass73_3.anInt2131 - this.aClass73_3.anInt2132) * local351 >> 8);
				} else {
					local374 = this.aClass73_3.anInt2132 + ((this.aClass73_3.anInt2131 - this.aClass73_3.anInt2132) * local356 >> 8);
				}
				local337 += 256;
				if (local337 >= local374) {
					local337 = 0;
					local341 = !local341;
				}
				if (local341) {
					Static7.anIntArray603[local343] = 0;
				}
			}
		}
		if (this.anInt5347 > 0 && this.anInt5348 > 0) {
			@Pc(424) int local424 = (int) ((double) this.anInt5347 * local16);
			for (@Pc(426) int local426 = local424; local426 < arg0; local426++) {
				@Pc(430) int[] local430 = Static7.anIntArray603;
				local430[local426] += Static7.anIntArray603[local426 - local424] * this.anInt5348 / 100;
			}
		}
		if (this.aClass146_1.anIntArray471[0] > 0 || this.aClass146_1.anIntArray471[1] > 0) {
			this.aClass73_9.method1673();
			@Pc(469) int local469 = this.aClass73_9.method1675(arg0 + 1);
			@Pc(478) int local478 = this.aClass146_1.method3640(0, (float) local469 / 65536.0F);
			@Pc(487) int local487 = this.aClass146_1.method3640(1, (float) local469 / 65536.0F);
			if (arg0 >= local478 + local487) {
				@Pc(494) int local494 = 0;
				@Pc(496) int local496 = local487;
				if (local487 > arg0 - local478) {
					local496 = arg0 - local478;
				}
				while (local494 < local496) {
					@Pc(521) int local521 = (int) ((long) Static7.anIntArray603[local494 + local478] * (long) Static6.anInt4425 >> 16);
					for (@Pc(523) int local523 = 0; local523 < local478; local523++) {
						local521 += (int) ((long) Static7.anIntArray603[local494 + local478 - local523 - 1] * (long) Static6.anIntArrayArray38[0][local523] >> 16);
					}
					for (@Pc(553) int local553 = 0; local553 < local494; local553++) {
						local521 -= (int) ((long) Static7.anIntArray603[local494 - local553 - 1] * (long) Static6.anIntArrayArray38[1][local553] >> 16);
					}
					Static7.anIntArray603[local494] = local521;
					local469 = this.aClass73_9.method1675(arg0 + 1);
					local494++;
				}
				@Pc(594) int local594 = 128;
				while (true) {
					if (local594 > arg0 - local478) {
						local594 = arg0 - local478;
					}
					while (local494 < local594) {
						@Pc(619) int local619 = (int) ((long) Static7.anIntArray603[local494 + local478] * (long) Static6.anInt4425 >> 16);
						for (@Pc(621) int local621 = 0; local621 < local478; local621++) {
							local619 += (int) ((long) Static7.anIntArray603[local494 + local478 - local621 - 1] * (long) Static6.anIntArrayArray38[0][local621] >> 16);
						}
						for (@Pc(651) int local651 = 0; local651 < local487; local651++) {
							local619 -= (int) ((long) Static7.anIntArray603[local494 - local651 - 1] * (long) Static6.anIntArrayArray38[1][local651] >> 16);
						}
						Static7.anIntArray603[local494] = local619;
						local469 = this.aClass73_9.method1675(arg0 + 1);
						local494++;
					}
					if (local494 >= arg0 - local478) {
						while (local494 < arg0) {
							@Pc(721) int local721 = 0;
							for (@Pc(727) int local727 = local494 + local478 - arg0; local727 < local478; local727++) {
								local721 += (int) ((long) Static7.anIntArray603[local494 + local478 - local727 - 1] * (long) Static6.anIntArrayArray38[0][local727] >> 16);
							}
							for (@Pc(757) int local757 = 0; local757 < local487; local757++) {
								local721 -= (int) ((long) Static7.anIntArray603[local494 - local757 - 1] * (long) Static6.anIntArrayArray38[1][local757] >> 16);
							}
							Static7.anIntArray603[local494] = local721;
							this.aClass73_9.method1675(arg0 + 1);
							local494++;
						}
						break;
					}
					local478 = this.aClass146_1.method3640(0, (float) local469 / 65536.0F);
					local487 = this.aClass146_1.method3640(1, (float) local469 / 65536.0F);
					local594 += 128;
				}
			}
		}
		for (@Pc(798) int local798 = 0; local798 < arg0; local798++) {
			if (Static7.anIntArray603[local798] < -32768) {
				Static7.anIntArray603[local798] = -32768;
			}
			if (Static7.anIntArray603[local798] > 32767) {
				Static7.anIntArray603[local798] = 32767;
			}
		}
		return Static7.anIntArray603;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)I")
	private int method4326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray602[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray607[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
