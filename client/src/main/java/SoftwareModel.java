import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class SoftwareModel extends Model {

	@OriginalMember(owner = "client!na", name = "p", descriptor = "S")
	private short aShort35;

	@OriginalMember(owner = "client!na", name = "q", descriptor = "[I")
	private int[] anIntArray339;

	@OriginalMember(owner = "client!na", name = "r", descriptor = "S")
	private short aShort36;

	@OriginalMember(owner = "client!na", name = "s", descriptor = "[S")
	private short[] aShortArray61;

	@OriginalMember(owner = "client!na", name = "t", descriptor = "[S")
	private short[] aShortArray62;

	@OriginalMember(owner = "client!na", name = "u", descriptor = "[B")
	private byte[] aByteArray41;

	@OriginalMember(owner = "client!na", name = "v", descriptor = "S")
	private short aShort37;

	@OriginalMember(owner = "client!na", name = "w", descriptor = "[I")
	public int[] anIntArray340;

	@OriginalMember(owner = "client!na", name = "x", descriptor = "[B")
	private byte[] aByteArray42;

	@OriginalMember(owner = "client!na", name = "y", descriptor = "[I")
	private int[] anIntArray341;

	@OriginalMember(owner = "client!na", name = "B", descriptor = "[I")
	private int[] anIntArray342;

	@OriginalMember(owner = "client!na", name = "C", descriptor = "[B")
	private byte[] aByteArray43;

	@OriginalMember(owner = "client!na", name = "D", descriptor = "S")
	private short aShort38;

	@OriginalMember(owner = "client!na", name = "E", descriptor = "S")
	private short aShort39;

	@OriginalMember(owner = "client!na", name = "F", descriptor = "[I")
	private int[] anIntArray343;

	@OriginalMember(owner = "client!na", name = "H", descriptor = "[I")
	public int[] anIntArray344;

	@OriginalMember(owner = "client!na", name = "I", descriptor = "[Lclient!u;")
	public Class167[] aClass167Array2;

	@OriginalMember(owner = "client!na", name = "J", descriptor = "[S")
	private short[] aShortArray63;

	@OriginalMember(owner = "client!na", name = "K", descriptor = "S")
	private short aShort40;

	@OriginalMember(owner = "client!na", name = "L", descriptor = "[I")
	private int[] anIntArray345;

	@OriginalMember(owner = "client!na", name = "M", descriptor = "[I")
	private int[] anIntArray346;

	@OriginalMember(owner = "client!na", name = "P", descriptor = "[S")
	private short[] aShortArray64;

	@OriginalMember(owner = "client!na", name = "Q", descriptor = "[I")
	public int[] anIntArray347;

	@OriginalMember(owner = "client!na", name = "R", descriptor = "S")
	private short aShort41;

	@OriginalMember(owner = "client!na", name = "S", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!na", name = "T", descriptor = "[I")
	private int[] anIntArray348;

	@OriginalMember(owner = "client!na", name = "U", descriptor = "[Lclient!sk;")
	public Class158[] aClass158Array2;

	@OriginalMember(owner = "client!na", name = "X", descriptor = "[I")
	private int[] anIntArray351;

	@OriginalMember(owner = "client!na", name = "ab", descriptor = "S")
	private short aShort42;

	@OriginalMember(owner = "client!na", name = "bb", descriptor = "[[I")
	private int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!na", name = "db", descriptor = "[I")
	private int[] anIntArray353;

	@OriginalMember(owner = "client!na", name = "o", descriptor = "B")
	private byte aByte12 = 0;

	@OriginalMember(owner = "client!na", name = "A", descriptor = "I")
	private int anInt3437 = 0;

	@OriginalMember(owner = "client!na", name = "G", descriptor = "Z")
	private boolean aBoolean245 = false;

	@OriginalMember(owner = "client!na", name = "n", descriptor = "Z")
	public boolean aBoolean244 = false;

	@OriginalMember(owner = "client!na", name = "Y", descriptor = "I")
	private int anInt3439 = 0;

	@OriginalMember(owner = "client!na", name = "N", descriptor = "I")
	private int anInt3438 = 0;

	@OriginalMember(owner = "client!na", name = "Z", descriptor = "I")
	public int anInt3440 = 0;

	static {
		if (Static4.aBoolean246) {
			Static4.anIntArray369 = new int[4096];
			Static4.anIntArray360 = new int[4096];
		} else {
			Static4.anIntArray374 = new int[1600];
			Static4.anIntArrayArray32 = new int[1600][64];
			Static4.anIntArray363 = new int[32];
			Static4.anIntArrayArray31 = new int[32][512];
		}
	}

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
	public SoftwareModel() {
	}

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lclient!ml;IIIII)V")
	public SoftwareModel(@OriginalArg(0) Class53_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method2764();
		arg0.method2744();
		this.anInt3440 = arg0.anInt3356;
		this.anInt3438 = arg0.anInt3355;
		this.anIntArray347 = arg0.anIntArray329;
		this.anIntArray344 = arg0.anIntArray324;
		this.anIntArray340 = arg0.anIntArray326;
		this.anInt3439 = arg0.anInt3353;
		this.anIntArray343 = arg0.anIntArray331;
		this.anIntArray348 = arg0.anIntArray330;
		this.anIntArray339 = arg0.anIntArray332;
		this.aByteArray41 = arg0.aByteArray37;
		this.aByteArray42 = arg0.aByteArray33;
		this.aByte12 = arg0.aByte11;
		this.aShortArray63 = arg0.aShortArray53;
		this.anIntArrayArray29 = arg0.anIntArrayArray27;
		this.anIntArrayArray30 = arg0.anIntArrayArray26;
		this.aShortArray62 = arg0.aShortArray54;
		this.aClass158Array2 = arg0.aClass158Array1;
		this.aClass167Array2 = arg0.aClass167Array1;
		this.aShortArray64 = arg0.aShortArray52;
		@Pc(117) int local117 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(123) int local123 = arg2 * local117 >> 8;
		this.anIntArray345 = new int[this.anInt3439];
		this.anIntArray346 = new int[this.anInt3439];
		this.anIntArray342 = new int[this.anInt3439];
		if (arg0.aShortArray51 == null) {
			this.aShortArray61 = null;
		} else {
			this.aShortArray61 = new short[this.anInt3439];
			for (@Pc(148) int local148 = 0; local148 < this.anInt3439; local148++) {
				@Pc(157) short local157 = arg0.aShortArray51[local148];
				if (local157 != -1 && Static4.anInterface4_1.method441(local157)) {
					this.aShortArray61[local148] = local157;
				} else {
					this.aShortArray61[local148] = -1;
				}
			}
		}
		if (arg0.anInt3352 > 0 && arg0.aByteArray35 != null) {
			@Pc(192) int[] local192 = new int[arg0.anInt3352];
			for (@Pc(194) int local194 = 0; local194 < this.anInt3439; local194++) {
				if (arg0.aByteArray35[local194] != -1) {
					local192[arg0.aByteArray35[local194] & 0xFF]++;
				}
			}
			this.anInt3437 = 0;
			for (@Pc(223) int local223 = 0; local223 < arg0.anInt3352; local223++) {
				if (local192[local223] > 0 && arg0.aByteArray38[local223] == 0) {
					this.anInt3437++;
				}
			}
			this.anIntArray351 = new int[this.anInt3437];
			this.anIntArray353 = new int[this.anInt3437];
			this.anIntArray341 = new int[this.anInt3437];
			@Pc(261) int local261 = 0;
			for (@Pc(263) int local263 = 0; local263 < arg0.anInt3352; local263++) {
				if (local192[local263] > 0 && arg0.aByteArray38[local263] == 0) {
					this.anIntArray351[local261] = arg0.aShortArray59[local263] & 0xFFFF;
					this.anIntArray353[local261] = arg0.aShortArray56[local263] & 0xFFFF;
					this.anIntArray341[local261] = arg0.aShortArray57[local263] & 0xFFFF;
					local192[local263] = local261++;
				} else {
					local192[local263] = -1;
				}
			}
			this.aByteArray43 = new byte[this.anInt3439];
			for (@Pc(325) int local325 = 0; local325 < this.anInt3439; local325++) {
				if (arg0.aByteArray35[local325] == -1) {
					this.aByteArray43[local325] = -1;
				} else {
					this.aByteArray43[local325] = (byte) local192[arg0.aByteArray35[local325] & 0xFF];
					if (this.aByteArray43[local325] == -1 && this.aShortArray61 != null) {
						this.aShortArray61[local325] = -1;
					}
				}
			}
		}
		for (@Pc(372) int local372 = 0; local372 < this.anInt3439; local372++) {
			@Pc(381) byte local381;
			if (arg0.aByteArray40 == null) {
				local381 = 0;
			} else {
				local381 = arg0.aByteArray40[local372];
			}
			@Pc(392) byte local392;
			if (arg0.aByteArray33 == null) {
				local392 = 0;
			} else {
				local392 = arg0.aByteArray33[local372];
			}
			@Pc(403) short local403;
			if (this.aShortArray61 == null) {
				local403 = -1;
			} else {
				local403 = this.aShortArray61[local372];
			}
			if (local392 == -2) {
				local381 = 3;
			}
			if (local392 == -1) {
				local381 = 2;
			}
			if (local403 == -1) {
				if (local381 == 0) {
					@Pc(431) int local431 = arg0.aShortArray53[local372] & 0xFFFF;
					@Pc(450) Class31 local450;
					if (arg0.aClass31Array2 == null || arg0.aClass31Array2[this.anIntArray343[local372]] == null) {
						local450 = arg0.aClass31Array1[this.anIntArray343[local372]];
					} else {
						local450 = arg0.aClass31Array2[this.anIntArray343[local372]];
					}
					@Pc(483) int local483 = arg1 + (arg3 * local450.anInt621 + arg4 * local450.anInt619 + arg5 * local450.anInt625) / (local123 * local450.anInt620) << 17;
					this.anIntArray345[local372] = local483 | Static25.method2912(local431, local483 >> 17);
					@Pc(513) Class31 local513;
					if (arg0.aClass31Array2 == null || arg0.aClass31Array2[this.anIntArray348[local372]] == null) {
						local513 = arg0.aClass31Array1[this.anIntArray348[local372]];
					} else {
						local513 = arg0.aClass31Array2[this.anIntArray348[local372]];
					}
					@Pc(546) int local546 = arg1 + (arg3 * local513.anInt621 + arg4 * local513.anInt619 + arg5 * local513.anInt625) / (local123 * local513.anInt620) << 17;
					this.anIntArray346[local372] = local546 | Static25.method2912(local431, local546 >> 17);
					@Pc(576) Class31 local576;
					if (arg0.aClass31Array2 == null || arg0.aClass31Array2[this.anIntArray339[local372]] == null) {
						local576 = arg0.aClass31Array1[this.anIntArray339[local372]];
					} else {
						local576 = arg0.aClass31Array2[this.anIntArray339[local372]];
					}
					@Pc(609) int local609 = arg1 + (arg3 * local576.anInt621 + arg4 * local576.anInt619 + arg5 * local576.anInt625) / (local123 * local576.anInt620) << 17;
					this.anIntArray342[local372] = local609 | Static25.method2912(local431, local609 >> 17);
				} else if (local381 == 1) {
					@Pc(629) Class120 local629 = arg0.aClass120Array1[local372];
					@Pc(654) int local654 = arg1 + (arg3 * local629.anInt3342 + arg4 * local629.anInt3339 + arg5 * local629.anInt3343) / (local123 + local123 / 2) << 17;
					this.anIntArray345[local372] = local654 | Static25.method2912(arg0.aShortArray53[local372] & 0xFFFF, local654 >> 17);
					this.anIntArray342[local372] = -1;
				} else if (local381 == 3) {
					this.anIntArray345[local372] = 128;
					this.anIntArray342[local372] = -1;
				} else {
					this.anIntArray342[local372] = -2;
				}
			} else if (local381 == 0) {
				@Pc(717) Class31 local717;
				if (arg0.aClass31Array2 == null || arg0.aClass31Array2[this.anIntArray343[local372]] == null) {
					local717 = arg0.aClass31Array1[this.anIntArray343[local372]];
				} else {
					local717 = arg0.aClass31Array2[this.anIntArray343[local372]];
				}
				@Pc(748) int local748 = arg1 + (arg3 * local717.anInt621 + arg4 * local717.anInt619 + arg5 * local717.anInt625) / (local123 * local717.anInt620);
				this.anIntArray345[local372] = Static25.method2914(local748);
				@Pc(773) Class31 local773;
				if (arg0.aClass31Array2 == null || arg0.aClass31Array2[this.anIntArray348[local372]] == null) {
					local773 = arg0.aClass31Array1[this.anIntArray348[local372]];
				} else {
					local773 = arg0.aClass31Array2[this.anIntArray348[local372]];
				}
				@Pc(804) int local804 = arg1 + (arg3 * local773.anInt621 + arg4 * local773.anInt619 + arg5 * local773.anInt625) / (local123 * local773.anInt620);
				this.anIntArray346[local372] = Static25.method2914(local804);
				@Pc(829) Class31 local829;
				if (arg0.aClass31Array2 == null || arg0.aClass31Array2[this.anIntArray339[local372]] == null) {
					local829 = arg0.aClass31Array1[this.anIntArray339[local372]];
				} else {
					local829 = arg0.aClass31Array2[this.anIntArray339[local372]];
				}
				@Pc(860) int local860 = arg1 + (arg3 * local829.anInt621 + arg4 * local829.anInt619 + arg5 * local829.anInt625) / (local123 * local829.anInt620);
				this.anIntArray342[local372] = Static25.method2914(local860);
			} else if (local381 == 1) {
				@Pc(875) Class120 local875 = arg0.aClass120Array1[local372];
				@Pc(898) int local898 = arg1 + (arg3 * local875.anInt3342 + arg4 * local875.anInt3339 + arg5 * local875.anInt3343) / (local123 + local123 / 2);
				this.anIntArray345[local372] = Static25.method2914(local898);
				this.anIntArray342[local372] = -1;
			} else {
				this.anIntArray342[local372] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "([Lclient!na;I)V")
	private SoftwareModel(@OriginalArg(0) SoftwareModel[] arg0, @OriginalArg(1) int arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		this.anInt3440 = 0;
		this.anInt3439 = 0;
		this.anInt3437 = 0;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		this.aByte12 = -1;
		for (@Pc(48) int local48 = 0; local48 < arg1; local48++) {
			@Pc(55) SoftwareModel local55 = arg0[local48];
			if (local55 != null) {
				this.anInt3440 += local55.anInt3440;
				this.anInt3439 += local55.anInt3439;
				this.anInt3437 += local55.anInt3437;
				if (local55.aByteArray41 == null) {
					if (this.aByte12 == -1) {
						this.aByte12 = local55.aByte12;
					}
					if (this.aByte12 != local55.aByte12) {
						local24 = true;
					}
				} else {
					local24 = true;
				}
				local26 |= local55.aByteArray42 != null;
				local28 |= local55.aShortArray61 != null;
				local30 |= local55.aByteArray43 != null;
				if (local55.aClass158Array2 != null) {
					local41 += local55.aClass158Array2.length;
				}
				if (local55.aClass167Array2 != null) {
					local43 += local55.aClass167Array2.length;
				}
			}
		}
		this.anIntArray347 = new int[this.anInt3440];
		this.anIntArray344 = new int[this.anInt3440];
		this.anIntArray340 = new int[this.anInt3440];
		this.anIntArray343 = new int[this.anInt3439];
		this.anIntArray348 = new int[this.anInt3439];
		this.anIntArray339 = new int[this.anInt3439];
		this.anIntArray345 = new int[this.anInt3439];
		this.anIntArray346 = new int[this.anInt3439];
		this.anIntArray342 = new int[this.anInt3439];
		if (local24) {
			this.aByteArray41 = new byte[this.anInt3439];
		}
		if (local26) {
			this.aByteArray42 = new byte[this.anInt3439];
		}
		if (local28) {
			this.aShortArray61 = new short[this.anInt3439];
		}
		if (local30) {
			this.aByteArray43 = new byte[this.anInt3439];
		}
		if (this.anInt3437 > 0) {
			this.anIntArray351 = new int[this.anInt3437];
			this.anIntArray353 = new int[this.anInt3437];
			this.anIntArray341 = new int[this.anInt3437];
		}
		if (local41 > 0) {
			this.aClass158Array2 = new Class158[local41];
		}
		if (local43 > 0) {
			this.aClass167Array2 = new Class167[local43];
		}
		this.aShortArray63 = new short[this.anInt3439];
		this.anInt3440 = 0;
		this.anInt3439 = 0;
		this.anInt3437 = 0;
		@Pc(265) int local265 = 0;
		@Pc(267) int local267 = 0;
		for (@Pc(269) int local269 = 0; local269 < arg1; local269++) {
			@Pc(276) SoftwareModel local276 = arg0[local269];
			if (local276 != null) {
				for (@Pc(280) int local280 = 0; local280 < local276.anInt3439; local280++) {
					this.anIntArray343[this.anInt3439] = local276.anIntArray343[local280] + this.anInt3440;
					this.anIntArray348[this.anInt3439] = local276.anIntArray348[local280] + this.anInt3440;
					this.anIntArray339[this.anInt3439] = local276.anIntArray339[local280] + this.anInt3440;
					this.anIntArray345[this.anInt3439] = local276.anIntArray345[local280];
					this.anIntArray346[this.anInt3439] = local276.anIntArray346[local280];
					this.anIntArray342[this.anInt3439] = local276.anIntArray342[local280];
					this.aShortArray63[this.anInt3439] = local276.aShortArray63[local280];
					if (local24) {
						if (local276.aByteArray41 == null) {
							this.aByteArray41[this.anInt3439] = local276.aByte12;
						} else {
							this.aByteArray41[this.anInt3439] = local276.aByteArray41[local280];
						}
					}
					if (local26 && local276.aByteArray42 != null) {
						this.aByteArray42[this.anInt3439] = local276.aByteArray42[local280];
					}
					if (local28) {
						if (local276.aShortArray61 == null) {
							this.aShortArray61[this.anInt3439] = -1;
						} else {
							this.aShortArray61[this.anInt3439] = local276.aShortArray61[local280];
						}
					}
					if (local30) {
						this.aByteArray43[this.anInt3439] = (byte) (local276.aByteArray43 == null || local276.aByteArray43[local280] == -1 ? -1 : local276.aByteArray43[local280] + this.anInt3437);
					}
					this.anInt3439++;
				}
				if (local276.aClass158Array2 != null) {
					for (@Pc(452) int local452 = 0; local452 < local276.aClass158Array2.length; local452++) {
						this.aClass158Array2[local267] = new Class158(local276.aClass158Array2[local452].aClass89_2, local276.aClass158Array2[local452].anInt4869 + this.anInt3440, local276.aClass158Array2[local452].anInt4868 + this.anInt3440, local276.aClass158Array2[local452].anInt4864 + this.anInt3440);
						local267++;
					}
				}
				if (local276.aClass167Array2 != null) {
					for (@Pc(501) int local501 = 0; local501 < local276.aClass167Array2.length; local501++) {
						this.aClass167Array2[local265] = new Class167(local276.aClass167Array2[local501].aClass37_1, local276.aClass167Array2[local501].anInt5232 + this.anInt3440);
						local265++;
					}
				}
				for (@Pc(531) int local531 = 0; local531 < local276.anInt3437; local531++) {
					if (local276.anIntArray351[local531] < local276.anInt3438) {
						this.anIntArray351[this.anInt3437] = local276.anIntArray351[local531] + this.anInt3440;
					}
					if (local276.anIntArray353[local531] < local276.anInt3438) {
						this.anIntArray353[this.anInt3437] = local276.anIntArray353[local531] + this.anInt3440;
					}
					if (local276.anIntArray341[local531] < local276.anInt3438) {
						this.anIntArray341[this.anInt3437] = local276.anIntArray341[local531] + this.anInt3440;
					}
					this.anInt3437++;
				}
				for (@Pc(602) int local602 = 0; local602 < local276.anInt3438; local602++) {
					this.anIntArray347[this.anInt3440] = local276.anIntArray347[local602];
					this.anIntArray344[this.anInt3440] = local276.anIntArray344[local602];
					this.anIntArray340[this.anInt3440] = local276.anIntArray340[local602];
					this.anInt3440++;
				}
			}
		}
		@Pc(645) int local645 = 0;
		this.anInt3438 = this.anInt3440;
		for (@Pc(651) int local651 = 0; local651 < arg1; local651++) {
			@Pc(658) SoftwareModel local658 = arg0[local651];
			if (local658 != null) {
				for (@Pc(662) int local662 = 0; local662 < local658.anInt3437; local662++) {
					if (local658.anIntArray351[local662] >= local658.anInt3438) {
						this.anIntArray351[local645] = local658.anIntArray351[local662] + this.anInt3440 - local658.anInt3438;
					}
					if (local658.anIntArray353[local662] >= local658.anInt3438) {
						this.anIntArray353[local645] = local658.anIntArray353[local662] + this.anInt3440 - local658.anInt3438;
					}
					if (local658.anIntArray341[local662] >= local658.anInt3438) {
						this.anIntArray341[local645] = local658.anIntArray341[local662] + this.anInt3440 - local658.anInt3438;
					}
					local645++;
				}
				for (@Pc(735) int local735 = local658.anInt3438; local735 < local658.anInt3440; local735++) {
					this.anIntArray347[this.anInt3440] = local658.anIntArray347[local735];
					this.anIntArray344[this.anInt3440] = local658.anIntArray344[local735];
					this.anIntArray340[this.anInt3440] = local658.anIntArray340[local735];
					this.anInt3440++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "h", descriptor = "()V")
	@Override
	public final void method3828() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3440; local1++) {
			this.anIntArray347[local1] = -this.anIntArray347[local1];
			this.anIntArray340[local1] = -this.anIntArray340[local1];
		}
		this.aBoolean244 = false;
	}

	@OriginalMember(owner = "client!na", name = "m", descriptor = "()I")
	@Override
	public final int method3842() {
		if (!this.aBoolean244) {
			this.method2909();
		}
		return this.aShort39;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZZZ)Lclient!vg;")
	@Override
	public final Model method3831(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static4.aByteArray44.length < this.anInt3439) {
			Static4.aByteArray44 = new byte[this.anInt3439 + 100];
		}
		if (!arg1 && Static4.aShortArray65.length < this.anInt3439) {
			Static4.anIntArray350 = new int[this.anInt3439 + 100];
			Static4.anIntArray349 = new int[this.anInt3439 + 100];
			Static4.anIntArray352 = new int[this.anInt3439 + 100];
			Static4.aShortArray65 = new short[this.anInt3439 + 100];
		}
		return this.method2908(arg0, arg1, Static4.aClass53_Sub4_Sub1_1, Static4.aByteArray44, Static4.aShortArray65, Static4.anIntArray350, Static4.anIntArray349, Static4.anIntArray352);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method2901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@OriginalMember(owner = "client!na", name = "k", descriptor = "()I")
	@Override
	public final int method3838() {
		if (!this.aBoolean244) {
			this.method2909();
		}
		return this.aShort36;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZZJIILclient!ne;)V")
	private void method2902(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class20_Sub3 arg5) {
		if (arg4 >= 1600) {
			return;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		if (!Static4.aBoolean246) {
			for (@Pc(11) int local11 = 0; local11 < 1600; local11++) {
				Static4.anIntArray374[local11] = 0;
			}
			for (@Pc(22) int local22 = 0; local22 < 32; local22++) {
				Static4.anIntArray363[local22] = 0;
			}
			Static4.anInt3441 = 0;
		}
		for (@Pc(35) int local35 = 0; local35 < this.anInt3439; local35++) {
			if (this.anIntArray342[local35] != -2) {
				@Pc(51) int local51 = this.anIntArray343[local35];
				@Pc(56) int local56 = this.anIntArray348[local35];
				@Pc(61) int local61 = this.anIntArray339[local35];
				@Pc(65) int local65 = Static4.anIntArray379[local51];
				@Pc(69) int local69 = Static4.anIntArray379[local56];
				@Pc(73) int local73 = Static4.anIntArray379[local61];
				if (arg0 && (local65 == -5000 || local69 == -5000 || local73 == -5000)) {
					@Pc(88) int local88 = Static4.anIntArray370[local51];
					@Pc(92) int local92 = Static4.anIntArray370[local56];
					@Pc(96) int local96 = Static4.anIntArray370[local61];
					@Pc(100) int local100 = Static4.anIntArray367[local51];
					@Pc(104) int local104 = Static4.anIntArray367[local56];
					@Pc(108) int local108 = Static4.anIntArray367[local61];
					@Pc(112) int local112 = Static4.anIntArray372[local51];
					@Pc(116) int local116 = Static4.anIntArray372[local56];
					@Pc(120) int local120 = Static4.anIntArray372[local61];
					local88 -= local92;
					local96 -= local92;
					local100 -= local104;
					local108 -= local104;
					local112 -= local116;
					local120 -= local116;
					@Pc(152) int local152 = local100 * local120 - local112 * local108;
					@Pc(160) int local160 = local112 * local96 - local88 * local120;
					@Pc(168) int local168 = local88 * local108 - local100 * local96;
					if (local92 * local152 + local104 * local160 + local116 * local168 > 0) {
						Static4.aBooleanArray17[local35] = true;
						if (Static4.aBoolean246) {
							Static4.anIntArray369[local5] = (Static4.anIntArray376[local51] + Static4.anIntArray376[local56] + Static4.anIntArray376[local61]) / 3;
							Static4.anIntArray360[local5++] = local35;
						} else {
							@Pc(224) int local224 = (Static4.anIntArray376[local51] + Static4.anIntArray376[local56] + Static4.anIntArray376[local61]) / 3 + arg3;
							if (Static4.anIntArray374[local224] < 64) {
								Static4.anIntArrayArray32[local224][Static4.anIntArray374[local224]++] = local35;
							} else {
								@Pc(247) int local247 = Static4.anIntArray374[local224];
								if (local247 == 64) {
									if (Static4.anInt3441 == 512) {
										continue;
									}
									Static4.anIntArray374[local224] = local247 = Static4.anInt3441++ + 65;
								}
								@Pc(267) int local267 = local247 - 65;
								Static4.anIntArrayArray31[local267][Static4.anIntArray363[local267]++] = local35;
							}
						}
					}
				} else {
					if (arg1 && this.method2901(Static7.anInt5333 + Static4.anInt3125, Static1.anInt3 + Static4.anInt3126, Static4.anIntArray361[local51], Static4.anIntArray361[local56], Static4.anIntArray361[local61], local65, local69, local73)) {
						Static5.aLongArray57[Static7.anInt5623++] = arg2;
						arg1 = false;
					}
					if ((local65 - local69) * (Static4.anIntArray361[local61] - Static4.anIntArray361[local56]) - (Static4.anIntArray361[local51] - Static4.anIntArray361[local56]) * (local73 - local69) > 0) {
						Static4.aBooleanArray17[local35] = false;
						if (local65 >= 0 && local69 >= 0 && local73 >= 0 && local65 <= Static4.anInt3129 && local69 <= Static4.anInt3129 && local73 <= Static4.anInt3129) {
							Static4.aBooleanArray16[local35] = false;
						} else {
							Static4.aBooleanArray16[local35] = true;
						}
						if (Static4.aBoolean246) {
							Static4.anIntArray369[local5] = (Static4.anIntArray376[local51] + Static4.anIntArray376[local56] + Static4.anIntArray376[local61]) / 3;
							Static4.anIntArray360[local5++] = local35;
						} else {
							@Pc(406) int local406 = (Static4.anIntArray376[local51] + Static4.anIntArray376[local56] + Static4.anIntArray376[local61]) / 3 + arg3;
							if (Static4.anIntArray374[local406] < 64) {
								Static4.anIntArrayArray32[local406][Static4.anIntArray374[local406]++] = local35;
							} else {
								@Pc(429) int local429 = Static4.anIntArray374[local406];
								if (local429 == 64) {
									if (Static4.anInt3441 == 512) {
										continue;
									}
									Static4.anIntArray374[local406] = local429 = Static4.anInt3441++ + 65;
								}
								@Pc(449) int local449 = local429 - 65;
								Static4.anIntArrayArray31[local449][Static4.anIntArray363[local449]++] = local35;
							}
						}
					}
				}
			}
		}
		if (arg5 != null && !Static4.aBoolean246) {
			for (@Pc(470) int local470 = 0; local470 < Static4.anIntArray368.length; local470++) {
				@Pc(480) int local480 = Static4.anIntArray368[local470] + arg3;
				if (local480 >= 0 && local480 < 1600) {
					if (Static4.anIntArray374[local480] < 64) {
						Static4.anIntArrayArray32[local480][Static4.anIntArray374[local480]++] = local470 + 1 << 16;
					} else {
						@Pc(512) int local512 = Static4.anIntArray374[local480];
						if (local512 == 64) {
							if (Static4.anInt3441 == 512) {
								continue;
							}
							Static4.anIntArray374[local480] = local512 = Static4.anInt3441++ + 65;
						}
						@Pc(532) int local532 = local512 - 65;
						Static4.anIntArrayArray31[local532][Static4.anIntArray363[local532]++] = local470 + 1 << 16;
					}
				}
			}
		}
		if (Static4.aBoolean246) {
			Static23.method2459(local5 - 1, Static4.anIntArray360, Static4.anIntArray369, 0);
			if (this.aByteArray41 == null) {
				for (@Pc(566) int local566 = 0; local566 < local5; local566++) {
					this.method2904(Static4.anIntArray360[local566]);
				}
				return;
			}
			for (@Pc(579) int local579 = 0; local579 < 12; local579++) {
				Static4.anIntArray366[local579] = 0;
				Static4.anIntArray358[local579] = 0;
			}
			for (@Pc(594) int local594 = 0; local594 < local5; local594++) {
				@Pc(601) int local601 = Static4.anIntArray360[local594];
				@Pc(605) int local605 = Static4.anIntArray369[local594];
				@Pc(610) byte local610 = this.aByteArray41[local601];
				@Pc(619) int local619 = Static4.anIntArray366[local610]++;
				Static4.anIntArrayArray33[local610][local619] = local601;
				if (local610 < 10) {
					@Pc(629) int[] local629 = Static4.anIntArray358;
					local629[local610] += local605;
				} else if (local610 == 10) {
					Static4.anIntArray371[local619] = local605;
				} else {
					Static4.anIntArray378[local619] = local605;
				}
			}
		} else if (this.aByteArray41 == null) {
			for (@Pc(658) int local658 = arg4 - 1; local658 >= 0; local658--) {
				@Pc(664) int local664 = Static4.anIntArray374[local658];
				if (local664 > 0) {
					@Pc(673) int local673 = local664 > 64 ? 64 : local664;
					@Pc(677) int[] local677 = Static4.anIntArrayArray32[local658];
					for (@Pc(679) int local679 = 0; local679 < local673; local679++) {
						@Pc(686) int local686 = local677[local679];
						if (local686 < 65536) {
							this.method2904(local677[local679]);
						} else {
							@Pc(701) int local701 = (local686 >> 16) - 1;
							@Pc(706) Class20_Sub2_Sub1 local706 = arg5.aClass20_Sub2_Sub1Array2[local701];
							@Pc(712) int local712 = Static4.anIntArray375[local701] * 400;
							if (local712 == 0) {
								local712 = 1;
							}
							Static33.method4206(Static4.anIntArray362[local701], Static4.anIntArray357[local701], (local706.aClass20_Sub1_1.aClass89_1.anInt2399 << 16) / local712, local706.anInt3231, local706.anInt3231 >> 24 & 0xFF);
						}
					}
				}
				if (local664 > 64) {
					@Pc(752) int local752 = Static4.anIntArray374[local658] - 64 - 1;
					@Pc(756) int[] local756 = Static4.anIntArrayArray31[local752];
					for (@Pc(758) int local758 = 0; local758 < Static4.anIntArray363[local752]; local758++) {
						@Pc(767) int local767 = local756[local758];
						if (local767 < 65536) {
							this.method2904(local756[local758]);
						} else {
							@Pc(782) int local782 = (local767 >> 16) - 1;
							@Pc(787) Class20_Sub2_Sub1 local787 = arg5.aClass20_Sub2_Sub1Array2[local782];
							@Pc(793) int local793 = Static4.anIntArray375[local782] * 400;
							if (local793 == 0) {
								local793 = 1;
							}
							Static33.method4206(Static4.anIntArray362[local782], Static4.anIntArray357[local782], (local787.aClass20_Sub1_1.aClass89_1.anInt2399 << 16) / local793, local787.anInt3231, local787.anInt3231 >> 24 & 0xFF);
						}
					}
				}
			}
			return;
		} else {
			for (@Pc(827) int local827 = 0; local827 < 12; local827++) {
				Static4.anIntArray366[local827] = 0;
				Static4.anIntArray358[local827] = 0;
			}
			for (@Pc(844) int local844 = arg4 - 1; local844 >= 0; local844--) {
				@Pc(850) int local850 = Static4.anIntArray374[local844];
				if (local850 > 0) {
					@Pc(857) int local857;
					if (local850 > 64) {
						local857 = 64;
					} else {
						local857 = local850;
					}
					@Pc(864) int[] local864 = Static4.anIntArrayArray32[local844];
					for (@Pc(866) int local866 = 0; local866 < local857; local866++) {
						@Pc(873) int local873 = local864[local866];
						if (local873 < 65536) {
							@Pc(881) byte local881 = this.aByteArray41[local873];
							@Pc(890) int local890 = Static4.anIntArray366[local881]++;
							Static4.anIntArrayArray33[local881][local890] = local873;
							if (local881 < 10) {
								@Pc(900) int[] local900 = Static4.anIntArray358;
								local900[local881] += local844;
							} else if (local881 == 10) {
								Static4.anIntArray371[local890] = local844;
							} else {
								Static4.anIntArray378[local890] = local844;
							}
						} else {
							Static4.anIntArray365[local7++] = (local873 >> 16) - 1;
						}
					}
				}
				if (local850 > 64) {
					@Pc(942) int local942 = Static4.anIntArray374[local844] - 64 - 1;
					@Pc(946) int[] local946 = Static4.anIntArrayArray31[local942];
					for (@Pc(948) int local948 = 0; local948 < Static4.anIntArray363[local942]; local948++) {
						@Pc(957) int local957 = local946[local948];
						if (local957 < 65536) {
							@Pc(965) byte local965 = this.aByteArray41[local957];
							@Pc(974) int local974 = Static4.anIntArray366[local965]++;
							Static4.anIntArrayArray33[local965][local974] = local957;
							if (local965 < 10) {
								@Pc(984) int[] local984 = Static4.anIntArray358;
								local984[local965] += local844;
							} else if (local965 == 10) {
								Static4.anIntArray371[local974] = local844;
							} else {
								Static4.anIntArray378[local974] = local844;
							}
						} else {
							Static4.anIntArray365[local7++] = (local957 >> 16) - 1;
						}
					}
				}
			}
		}
		@Pc(1019) int local1019 = 0;
		if (Static4.anIntArray366[1] > 0 || Static4.anIntArray366[2] > 0) {
			local1019 = (Static4.anIntArray358[1] + Static4.anIntArray358[2]) / (Static4.anIntArray366[1] + Static4.anIntArray366[2]);
		}
		@Pc(1045) int local1045 = 0;
		if (Static4.anIntArray366[3] > 0 || Static4.anIntArray366[4] > 0) {
			local1045 = (Static4.anIntArray358[3] + Static4.anIntArray358[4]) / (Static4.anIntArray366[3] + Static4.anIntArray366[4]);
		}
		@Pc(1071) int local1071 = 0;
		if (Static4.anIntArray366[6] > 0 || Static4.anIntArray366[8] > 0) {
			local1071 = (Static4.anIntArray358[6] + Static4.anIntArray358[8]) / (Static4.anIntArray366[6] + Static4.anIntArray366[8]);
		}
		@Pc(1097) int local1097 = 0;
		@Pc(1101) int local1101 = Static4.anIntArray366[10];
		@Pc(1105) int[] local1105 = Static4.anIntArrayArray33[10];
		@Pc(1107) int[] local1107 = Static4.anIntArray371;
		@Pc(1109) int local1109 = 0;
		if (local1101 == 0) {
			local1097 = 0;
			local1101 = Static4.anIntArray366[11];
			local1105 = Static4.anIntArrayArray33[11];
			local1107 = Static4.anIntArray378;
		}
		@Pc(1131) int local1131;
		if (local1101 > 0) {
			local1131 = local1107[0];
		} else {
			local1131 = -1000;
		}
		for (@Pc(1136) int local1136 = 0; local1136 < 10; local1136++) {
			while (local1136 == 0 && local1131 > local1019) {
				this.method2904(local1105[local1097++]);
				if (local1097 == local1101 && local1105 != Static4.anIntArrayArray33[11]) {
					local1097 = 0;
					local1101 = Static4.anIntArray366[11];
					local1105 = Static4.anIntArrayArray33[11];
					local1107 = Static4.anIntArray378;
				}
				if (local1097 < local1101) {
					local1131 = local1107[local1097];
				} else {
					local1131 = -1000;
				}
			}
			while (local1136 == 3 && local1131 > local1045) {
				this.method2904(local1105[local1097++]);
				if (local1097 == local1101 && local1105 != Static4.anIntArrayArray33[11]) {
					local1097 = 0;
					local1101 = Static4.anIntArray366[11];
					local1105 = Static4.anIntArrayArray33[11];
					local1107 = Static4.anIntArray378;
				}
				if (local1097 < local1101) {
					local1131 = local1107[local1097];
				} else {
					local1131 = -1000;
				}
			}
			while (local1136 == 5 && local1131 > local1071) {
				this.method2904(local1105[local1097++]);
				if (local1097 == local1101 && local1105 != Static4.anIntArrayArray33[11]) {
					local1097 = 0;
					local1101 = Static4.anIntArray366[11];
					local1105 = Static4.anIntArrayArray33[11];
					local1107 = Static4.anIntArray378;
				}
				if (local1097 < local1101) {
					local1131 = local1107[local1097];
				} else {
					local1131 = -1000;
				}
			}
			@Pc(1271) int local1271 = Static4.anIntArray366[local1136];
			@Pc(1275) int[] local1275 = Static4.anIntArrayArray33[local1136];
			if (arg5 != null) {
				@Pc(1279) int local1279 = Integer.MAX_VALUE;
				if (local1271 != 0) {
					local1279 = Static4.anIntArray358[local1136] / local1271;
				}
				for (@Pc(1291) int local1291 = Static4.anIntArray365[local1109]; Static4.anIntArray368[local1291] + arg3 > local1279; local1291 = Static4.anIntArray365[local1109++]) {
					@Pc(1303) Class20_Sub2_Sub1 local1303 = arg5.aClass20_Sub2_Sub1Array2[local1291];
					@Pc(1309) int local1309 = Static4.anIntArray375[local1291] * 400;
					if (local1309 == 0) {
						local1309 = 1;
					}
					Static33.method4206(Static4.anIntArray362[local1291], Static4.anIntArray357[local1291], (local1303.aClass20_Sub1_1.aClass89_1.anInt2399 << 16) / local1309, local1303.anInt3231, local1303.anInt3231 >> 24 & 0xFF);
					if (local1109 >= local7) {
						break;
					}
				}
			}
			for (@Pc(1347) int local1347 = 0; local1347 < local1271; local1347++) {
				this.method2904(local1275[local1347]);
			}
		}
		while (local1131 != -1000) {
			this.method2904(local1105[local1097++]);
			if (local1097 == local1101 && local1105 != Static4.anIntArrayArray33[11]) {
				local1097 = 0;
				local1105 = Static4.anIntArrayArray33[11];
				local1101 = Static4.anIntArray366[11];
				local1107 = Static4.anIntArray378;
			}
			if (local1097 < local1101) {
				local1131 = local1107[local1097];
			} else {
				local1131 = -1000;
			}
		}
		if (arg5 == null) {
			return;
		}
		@Pc(1405) int local1405 = Static4.anIntArray365[local1109];
		while (local1109 < local7) {
			@Pc(1413) Class20_Sub2_Sub1 local1413 = arg5.aClass20_Sub2_Sub1Array2[local1405];
			@Pc(1419) int local1419 = Static4.anIntArray375[local1405] * 400;
			if (local1419 == 0) {
				local1419 = 1;
			}
			Static33.method4206(Static4.anIntArray362[local1405], Static4.anIntArray357[local1405], (local1413.aClass20_Sub1_1.aClass89_1.anInt2399 << 16) / local1419, local1413.anInt3231, local1413.anInt3231 >> 24 & 0xFF);
			local1405 = Static4.anIntArray365[local1109++];
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
	@Override
	public final void method3815(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = MathUtils.SINE[arg0];
		@Pc(7) int local7 = MathUtils.COSINE[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3440; local9++) {
			@Pc(29) int local29 = this.anIntArray340[local9] * local3 + this.anIntArray347[local9] * local7 >> 16;
			this.anIntArray340[local9] = this.anIntArray340[local9] * local7 - this.anIntArray347[local9] * local3 >> 16;
			this.anIntArray347[local9] = local29;
		}
		this.aBoolean244 = false;
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "()V")
	@Override
	public final void method3820() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3440; local1++) {
			@Pc(10) int local10 = this.anIntArray347[local1];
			this.anIntArray347[local1] = this.anIntArray340[local1];
			this.anIntArray340[local1] = -local10;
		}
		this.aBoolean244 = false;
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V")
	@Override
	public final void method3832(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = MathUtils.SINE[arg0];
		@Pc(7) int local7 = MathUtils.COSINE[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3440; local9++) {
			@Pc(29) int local29 = this.anIntArray344[local9] * local7 - this.anIntArray340[local9] * local3 >> 16;
			this.anIntArray340[local9] = this.anIntArray344[local9] * local3 + this.anIntArray340[local9] * local7 >> 16;
			this.anIntArray344[local9] = local29;
		}
		this.aBoolean244 = false;
	}

	@OriginalMember(owner = "client!na", name = "i", descriptor = "()I")
	@Override
	public final int method3829() {
		if (!this.aBoolean244) {
			this.method2909();
		}
		return this.aShort40;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!vg;)Lclient!vg;")
	public final Model method2903(@OriginalArg(0) Model arg0) {
		return new SoftwareModel(new SoftwareModel[] { this, (SoftwareModel) arg0 }, 2);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIIIJILclient!ne;)V")
	@Override
	public final void method3805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class20_Sub3 arg10) {
		if (!this.aBoolean244) {
			this.method2909();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (this.aShort37 * arg2 + this.aShort39 * arg1 >> 16);
		@Pc(53) int local53 = local24 + (-this.aShort37 * arg2 + this.aShort42 * arg1 >> 16);
		if (arg10 != null) {
			@Pc(58) int local58 = arg10.method2959();
			@Pc(70) int local70 = local24 + (local58 * arg2 + arg1 * 0 >> 16);
			@Pc(87) int local87 = local24 + (-local58 * arg2 - (arg10.anInt3510 - arg10.anInt3520) * arg1 >> 16);
			if (local87 < local53) {
				local53 = local87;
			}
			if (local70 > local38) {
				local38 = local70;
			}
			arg10.method2970(arg0, arg9, arg5, arg6, arg7);
		}
		if (local38 <= 50 || local53 >= 3500) {
			return;
		}
		@Pc(122) int local122 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(129) int local129 = local122 + this.aShort37 << 9;
		if (local129 / local38 <= Static7.anInt5437) {
			return;
		}
		@Pc(142) int local142 = local122 - this.aShort37 << 9;
		if (local142 / local38 >= Static4.anInt3123) {
			return;
		}
		@Pc(158) int local158 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(174) int local174 = local158 + (this.aShort37 * arg1 + this.aShort39 * arg2 >> 16) << 9;
		if (local174 / local38 <= Static7.anInt6030) {
			return;
		}
		@Pc(197) int local197 = local158 + (-this.aShort37 * arg1 + this.aShort42 * arg2 >> 16) << 9;
		if (local197 / local38 >= Static1.anInt403) {
			return;
		}
		@Pc(205) boolean local205 = false;
		@Pc(212) boolean local212 = local53 <= 50;
		@Pc(221) boolean local221 = local212 || this.anInt3437 > 0;
		@Pc(223) int local223 = Static4.anInt3125;
		@Pc(225) int local225 = Static4.anInt3126;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		if (arg0 != 0) {
			local227 = MathUtils.SINE[arg0];
			local229 = MathUtils.COSINE[arg0];
		}
		@Pc(241) boolean local241 = false;
		if (arg8 > 0L && Static1.aBoolean8 && local53 > 0) {
			@Pc(255) int local255;
			@Pc(259) int local259;
			if (local122 > 0) {
				local255 = local142 / local38;
				local259 = local129 / local53;
			} else {
				local255 = local142 / local53;
				local259 = local129 / local38;
			}
			@Pc(274) int local274;
			@Pc(278) int local278;
			if (local158 > 0) {
				local274 = local197 / local38;
				local278 = local174 / local53;
			} else {
				local274 = local197 / local53;
				local278 = local174 / local38;
			}
			if (Static7.anInt5333 >= local255 && Static7.anInt5333 <= local259 && Static1.anInt3 >= local274 && Static1.anInt3 <= local278) {
				@Pc(301) int local301 = 999999;
				@Pc(303) int local303 = -999999;
				@Pc(305) int local305 = 999999;
				@Pc(307) int local307 = -999999;
				@Pc(350) int[] local350 = new int[] { this.aShort40, this.aShort36, this.aShort40, this.aShort36, this.aShort40, this.aShort36, this.aShort40, this.aShort36 };
				@Pc(393) int[] local393 = new int[] { this.aShort35, this.aShort35, this.aShort38, this.aShort38, this.aShort35, this.aShort35, this.aShort38, this.aShort38 };
				@Pc(436) int[] local436 = new int[] { this.aShort42, this.aShort42, this.aShort42, this.aShort42, this.aShort39, this.aShort39, this.aShort39, this.aShort39 };
				for (@Pc(438) int local438 = 0; local438 < 8; local438++) {
					@Pc(445) int local445 = local350[local438];
					@Pc(449) int local449 = local436[local438];
					@Pc(453) int local453 = local393[local438];
					if (arg0 != 0) {
						@Pc(465) int local465 = local453 * local227 + local445 * local229 >> 16;
						local453 = local453 * local229 - local445 * local227 >> 16;
						local445 = local465;
					}
					@Pc(481) int local481 = local445 + arg5;
					@Pc(485) int local485 = local449 + arg6;
					@Pc(489) int local489 = local453 + arg7;
					@Pc(499) int local499 = local489 * arg3 + local481 * arg4 >> 16;
					local489 = local489 * arg4 - local481 * arg3 >> 16;
					local481 = local499;
					local499 = local485 * arg2 - local489 * arg1 >> 16;
					local489 = local485 * arg1 + local489 * arg2 >> 16;
					if (local489 > 0) {
						@Pc(541) int local541 = (local481 << 9) / local489;
						@Pc(547) int local547 = (local499 << 9) / local489;
						if (local541 < local301) {
							local301 = local541;
						}
						if (local541 > local303) {
							local303 = local541;
						}
						if (local547 < local305) {
							local305 = local547;
						}
						if (local547 > local307) {
							local307 = local547;
						}
					}
				}
				if (Static7.anInt5333 >= local301 && Static7.anInt5333 <= local303 && Static1.anInt3 >= local305 && Static1.anInt3 <= local307) {
					if (this.aBoolean324) {
						Static5.aLongArray57[Static7.anInt5623++] = arg8;
					} else {
						local241 = true;
					}
				}
			}
		}
		for (@Pc(597) int local597 = 0; local597 < this.anInt3440; local597++) {
			@Pc(606) int local606 = this.anIntArray347[local597];
			@Pc(611) int local611 = this.anIntArray344[local597];
			@Pc(616) int local616 = this.anIntArray340[local597];
			if (arg0 != 0) {
				@Pc(628) int local628 = local616 * local227 + local606 * local229 >> 16;
				local616 = local616 * local229 - local606 * local227 >> 16;
				local606 = local628;
			}
			@Pc(644) int local644 = local606 + arg5;
			@Pc(648) int local648 = local611 + arg6;
			@Pc(652) int local652 = local616 + arg7;
			@Pc(662) int local662 = local652 * arg3 + local644 * arg4 >> 16;
			local652 = local652 * arg4 - local644 * arg3 >> 16;
			local644 = local662;
			local662 = local648 * arg2 - local652 * arg1 >> 16;
			local652 = local648 * arg1 + local652 * arg2 >> 16;
			Static4.anIntArray376[local597] = local652 - local24;
			if (local652 >= 50) {
				Static4.anIntArray379[local597] = local223 + (local644 << 9) / local652;
				Static4.anIntArray361[local597] = local225 + (local662 << 9) / local652;
			} else {
				Static4.anIntArray379[local597] = -5000;
				local205 = true;
			}
			if (local221) {
				Static4.anIntArray370[local597] = local644;
				Static4.anIntArray367[local597] = local662;
				Static4.anIntArray372[local597] = local652;
			}
		}
		if (arg10 != null) {
			@Pc(754) int local754 = Static5.anInt3506 + local223;
			@Pc(758) int local758 = Static5.anInt3503 + local225;
			for (@Pc(760) int local760 = 0; local760 < arg10.aClass20_Sub2_Sub1Array2.length; local760++) {
				@Pc(770) Class20_Sub2_Sub1 local770 = arg10.aClass20_Sub2_Sub1Array2[local760];
				if (local770 == null || local770.aBoolean228) {
					Static4.anIntArray368[local760] = Integer.MIN_VALUE;
				} else {
					@Pc(782) int local782 = (local770.anInt3228 >> 12) - Static7.anInt5281;
					@Pc(789) int local789 = (local770.anInt3229 >> 12) - Static6.anInt4375;
					@Pc(796) int local796 = (local770.anInt3230 >> 12) - Static6.anInt4400;
					@Pc(806) int local806 = local796 * arg3 + local782 * arg4 >> 16;
					local796 = local796 * arg4 - local782 * arg3 >> 16;
					local782 = local806;
					local806 = local789 * arg2 - local796 * arg1 >> 16;
					local796 = local789 * arg1 + local796 * arg2 >> 16;
					if (local796 >= 50) {
						Static4.anIntArray362[local760] = local754 + (local782 << 9) / local796;
						Static4.anIntArray357[local760] = local758 + (local806 << 9) / local796;
						Static4.anIntArray375[local760] = local796;
						Static4.anIntArray368[local760] = local796 - local24;
					} else {
						Static4.anIntArray368[local760] = Integer.MIN_VALUE;
					}
				}
			}
		}
		try {
			this.method2902(local205, local241, arg8, local24 - local53, local38 + 2 - local53, arg10);
		} catch (@Pc(901) Exception local901) {
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
	@Override
	public final void method3817(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = MathUtils.SINE[arg0];
		@Pc(7) int local7 = MathUtils.COSINE[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3440; local9++) {
			@Pc(29) int local29 = this.anIntArray344[local9] * local3 + this.anIntArray347[local9] * local7 >> 16;
			this.anIntArray344[local9] = this.anIntArray344[local9] * local7 - this.anIntArray347[local9] * local3 >> 16;
			this.anIntArray347[local9] = local29;
		}
		this.aBoolean244 = false;
	}

	@OriginalMember(owner = "client!na", name = "j", descriptor = "()Z")
	@Override
	protected final boolean method3830() {
		if (this.anIntArrayArray29 == null) {
			return false;
		} else {
			Static4.anInt3443 = 0;
			Static4.anInt3444 = 0;
			Static4.anInt3442 = 0;
			return true;
		}
	}

	@OriginalMember(owner = "client!na", name = "g", descriptor = "()V")
	@Override
	public final void method3827() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3440; local1++) {
			@Pc(10) int local10 = this.anIntArray340[local1];
			this.anIntArray340[local1] = this.anIntArray347[local1];
			this.anIntArray347[local1] = -local10;
		}
		this.aBoolean244 = false;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(III)V")
	@Override
	public final void method3823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3440; local1++) {
			@Pc(7) int[] local7 = this.anIntArray347;
			local7[local1] += arg0;
			local7 = this.anIntArray344;
			local7[local1] += arg1;
			local7 = this.anIntArray340;
			local7[local1] += arg2;
		}
		this.aBoolean244 = false;
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(I)V")
	private void method2904(@OriginalArg(0) int arg0) {
		if (Static4.aBooleanArray17[arg0]) {
			this.method2907(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray343[arg0];
		@Pc(17) int local17 = this.anIntArray348[arg0];
		@Pc(22) int local22 = this.anIntArray339[arg0];
		Static4.aBoolean217 = Static4.aBooleanArray16[arg0];
		if (this.aByteArray42 == null) {
			Static4.anInt3127 = 0;
		} else {
			Static4.anInt3127 = this.aByteArray42[arg0] & 0xFF;
		}
		if (this.aShortArray61 != null && this.aShortArray61[arg0] != -1) {
			@Pc(141) int local141;
			@Pc(146) int local146;
			@Pc(151) int local151;
			if (this.aByteArray43 == null || this.aByteArray43[arg0] == -1) {
				local141 = local12;
				local146 = local17;
				local151 = local22;
			} else {
				@Pc(136) int local136 = this.aByteArray43[arg0] & 0xFF;
				local141 = this.anIntArray351[local136];
				local146 = this.anIntArray353[local136];
				local151 = this.anIntArray341[local136];
			}
			if (this.anIntArray342[arg0] == -1) {
				Static23.method2549(Static4.anIntArray361[local12], Static4.anIntArray361[local17], Static4.anIntArray361[local22], Static4.anIntArray379[local12], Static4.anIntArray379[local17], Static4.anIntArray379[local22], this.anIntArray345[arg0], this.anIntArray345[arg0], this.anIntArray345[arg0], Static4.anIntArray370[local141], Static4.anIntArray370[local146], Static4.anIntArray370[local151], Static4.anIntArray367[local141], Static4.anIntArray367[local146], Static4.anIntArray367[local151], Static4.anIntArray372[local141], Static4.anIntArray372[local146], Static4.anIntArray372[local151], this.aShortArray61[arg0]);
			} else {
				Static23.method2549(Static4.anIntArray361[local12], Static4.anIntArray361[local17], Static4.anIntArray361[local22], Static4.anIntArray379[local12], Static4.anIntArray379[local17], Static4.anIntArray379[local22], this.anIntArray345[arg0], this.anIntArray346[arg0], this.anIntArray342[arg0], Static4.anIntArray370[local141], Static4.anIntArray370[local146], Static4.anIntArray370[local151], Static4.anIntArray367[local141], Static4.anIntArray367[local146], Static4.anIntArray367[local151], Static4.anIntArray372[local141], Static4.anIntArray372[local146], Static4.anIntArray372[local151], this.aShortArray61[arg0]);
			}
		} else if (this.anIntArray342[arg0] == -1) {
			Static23.method2550(Static4.anIntArray361[local12], Static4.anIntArray361[local17], Static4.anIntArray361[local22], Static4.anIntArray379[local12], Static4.anIntArray379[local17], Static4.anIntArray379[local22], ColorUtils.HSL_TO_RGB[this.anIntArray345[arg0] & 0xFFFF]);
		} else {
			Static23.method2543(Static4.anIntArray361[local12], Static4.anIntArray361[local17], Static4.anIntArray361[local22], Static4.anIntArray379[local12], Static4.anIntArray379[local17], Static4.anIntArray379[local22], this.anIntArray345[arg0] & 0xFFFF, this.anIntArray346[arg0] & 0xFFFF, this.anIntArray342[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!na", name = "f", descriptor = "()I")
	@Override
	public final int method3826() {
		if (!this.aBoolean244) {
			this.method2909();
		}
		return this.aShort37;
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "()I")
	@Override
	public final int method3818() {
		if (!this.aBoolean244) {
			this.method2909();
		}
		return this.aShort35;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIIJ)V")
	@Override
	public final void method3822(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6) {
		try {
			if (!this.aBoolean244) {
				this.method2909();
			}
			@Pc(6) int local6 = Static4.anInt3125;
			@Pc(8) int local8 = Static4.anInt3126;
			@Pc(12) int local12 = MathUtils.SINE[0];
			@Pc(16) int local16 = MathUtils.COSINE[0];
			@Pc(20) int local20 = MathUtils.SINE[arg0];
			@Pc(24) int local24 = MathUtils.COSINE[arg0];
			@Pc(28) int local28 = MathUtils.SINE[arg1];
			@Pc(32) int local32 = MathUtils.COSINE[arg1];
			@Pc(36) int local36 = MathUtils.SINE[arg2];
			@Pc(40) int local40 = MathUtils.COSINE[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt3440; local52++) {
				@Pc(61) int local61 = this.anIntArray347[local52];
				@Pc(66) int local66 = this.anIntArray344[local52];
				@Pc(71) int local71 = this.anIntArray340[local52];
				if (arg1 != 0) {
					@Pc(83) int local83 = local66 * local28 + local61 * local32 >> 16;
					local66 = local66 * local32 - local61 * local28 >> 16;
					local61 = local83;
				}
				if (arg0 != 0) {
					@Pc(131) int local131 = local71 * local20 + local61 * local24 >> 16;
					local71 = local71 * local24 - local61 * local20 >> 16;
					local61 = local131;
				}
				@Pc(147) int local147 = local61 + arg3;
				@Pc(151) int local151 = local66 + arg4;
				@Pc(155) int local155 = local71 + arg5;
				@Pc(165) int local165 = local151 * local40 - local155 * local36 >> 16;
				local155 = local151 * local36 + local155 * local40 >> 16;
				Static4.anIntArray376[local52] = local155 - local50;
				Static4.anIntArray379[local52] = local6 + (local147 << 9) / local155;
				Static4.anIntArray361[local52] = local8 + (local165 << 9) / local155;
				if (this.anInt3437 > 0) {
					Static4.anIntArray370[local52] = local147;
					Static4.anIntArray367[local52] = local165;
					Static4.anIntArray372[local52] = local155;
				}
			}
			this.method2902(false, arg6 >= 0L, arg6, this.aShort41, this.aShort41 << 1, null);
		} catch (@Pc(240) RuntimeException local240) {
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(ZZZ)Lclient!vg;")
	@Override
	public final Model method3833(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static4.aByteArray46.length < this.anInt3439) {
			Static4.aByteArray46 = new byte[this.anInt3439 + 100];
		}
		if (!arg1 && Static4.aShortArray67.length < this.anInt3439) {
			Static4.anIntArray373 = new int[this.anInt3439 + 100];
			Static4.anIntArray364 = new int[this.anInt3439 + 100];
			Static4.anIntArray359 = new int[this.anInt3439 + 100];
			Static4.aShortArray67 = new short[this.anInt3439 + 100];
		}
		return this.method2908(arg0, arg1, Static4.aClass53_Sub4_Sub1_3, Static4.aByteArray46, Static4.aShortArray67, Static4.anIntArray373, Static4.anIntArray364, Static4.anIntArray359);
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "()V")
	@Override
	protected final void method3819() {
		if (this.aBoolean245) {
			this.method2913();
			this.aBoolean245 = false;
		}
		this.aBoolean244 = false;
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(ZZZ)Lclient!vg;")
	@Override
	public final Model method3836(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static4.aByteArray45.length < this.anInt3439) {
			Static4.aByteArray45 = new byte[this.anInt3439 + 100];
		}
		if (!arg1 && Static4.aShortArray66.length < this.anInt3439) {
			Static4.anIntArray355 = new int[this.anInt3439 + 100];
			Static4.anIntArray356 = new int[this.anInt3439 + 100];
			Static4.anIntArray354 = new int[this.anInt3439 + 100];
			Static4.aShortArray66 = new short[this.anInt3439 + 100];
		}
		return this.method2908(arg0, arg1, Static4.aClass53_Sub4_Sub1_2, Static4.aByteArray45, Static4.aShortArray66, Static4.anIntArray355, Static4.anIntArray356, Static4.anIntArray354);
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "(I)V")
	private void method2907(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static4.anInt3125;
		@Pc(3) int local3 = Static4.anInt3126;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray343[arg0];
		@Pc(15) int local15 = this.anIntArray348[arg0];
		@Pc(20) int local20 = this.anIntArray339[arg0];
		@Pc(24) int local24 = Static4.anIntArray372[local10];
		@Pc(28) int local28 = Static4.anIntArray372[local15];
		@Pc(32) int local32 = Static4.anIntArray372[local20];
		if (this.aByteArray42 == null) {
			Static4.anInt3127 = 0;
		} else {
			Static4.anInt3127 = this.aByteArray42[arg0] & 0xFF;
		}
		if (local24 >= 50) {
			Static4.anIntArray381[0] = Static4.anIntArray379[local10];
			Static4.anIntArray377[0] = Static4.anIntArray361[local10];
			local5++;
			Static4.anIntArray380[0] = this.anIntArray345[arg0] & 0xFFFF;
		} else {
			@Pc(75) int local75 = Static4.anIntArray370[local10];
			@Pc(79) int local79 = Static4.anIntArray367[local10];
			@Pc(86) int local86 = this.anIntArray345[arg0] & 0xFFFF;
			if (local32 >= 50) {
				@Pc(99) int local99 = (50 - local24) * MathUtils.anIntArray300[local32 - local24];
				Static4.anIntArray381[0] = local1 + (local75 + ((Static4.anIntArray370[local20] - local75) * local99 >> 16) << 9) / 50;
				Static4.anIntArray377[0] = local3 + (local79 + ((Static4.anIntArray367[local20] - local79) * local99 >> 16) << 9) / 50;
				local5++;
				Static4.anIntArray380[0] = local86 + (((this.anIntArray342[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local28 >= 50) {
				@Pc(170) int local170 = (50 - local24) * MathUtils.anIntArray300[local28 - local24];
				Static4.anIntArray381[local5] = local1 + (local75 + ((Static4.anIntArray370[local15] - local75) * local170 >> 16) << 9) / 50;
				Static4.anIntArray377[local5] = local3 + (local79 + ((Static4.anIntArray367[local15] - local79) * local170 >> 16) << 9) / 50;
				Static4.anIntArray380[local5++] = local86 + (((this.anIntArray346[arg0] & 0xFFFF) - local86) * local170 >> 16);
			}
		}
		if (local28 >= 50) {
			Static4.anIntArray381[local5] = Static4.anIntArray379[local15];
			Static4.anIntArray377[local5] = Static4.anIntArray361[local15];
			Static4.anIntArray380[local5++] = this.anIntArray346[arg0] & 0xFFFF;
		} else {
			@Pc(258) int local258 = Static4.anIntArray370[local15];
			@Pc(262) int local262 = Static4.anIntArray367[local15];
			@Pc(269) int local269 = this.anIntArray346[arg0] & 0xFFFF;
			if (local24 >= 50) {
				@Pc(282) int local282 = (50 - local28) * MathUtils.anIntArray300[local24 - local28];
				Static4.anIntArray381[local5] = local1 + (local258 + ((Static4.anIntArray370[local10] - local258) * local282 >> 16) << 9) / 50;
				Static4.anIntArray377[local5] = local3 + (local262 + ((Static4.anIntArray367[local10] - local262) * local282 >> 16) << 9) / 50;
				Static4.anIntArray380[local5++] = local269 + (((this.anIntArray345[arg0] & 0xFFFF) - local269) * local282 >> 16);
			}
			if (local32 >= 50) {
				@Pc(353) int local353 = (50 - local28) * MathUtils.anIntArray300[local32 - local28];
				Static4.anIntArray381[local5] = local1 + (local258 + ((Static4.anIntArray370[local20] - local258) * local353 >> 16) << 9) / 50;
				Static4.anIntArray377[local5] = local3 + (local262 + ((Static4.anIntArray367[local20] - local262) * local353 >> 16) << 9) / 50;
				Static4.anIntArray380[local5++] = local269 + (((this.anIntArray342[arg0] & 0xFFFF) - local269) * local353 >> 16);
			}
		}
		if (local32 >= 50) {
			Static4.anIntArray381[local5] = Static4.anIntArray379[local20];
			Static4.anIntArray377[local5] = Static4.anIntArray361[local20];
			Static4.anIntArray380[local5++] = this.anIntArray342[arg0] & 0xFFFF;
		} else {
			@Pc(441) int local441 = Static4.anIntArray370[local20];
			@Pc(445) int local445 = Static4.anIntArray367[local20];
			@Pc(452) int local452 = this.anIntArray342[arg0] & 0xFFFF;
			if (local28 >= 50) {
				@Pc(465) int local465 = (50 - local32) * MathUtils.anIntArray300[local28 - local32];
				Static4.anIntArray381[local5] = local1 + (local441 + ((Static4.anIntArray370[local15] - local441) * local465 >> 16) << 9) / 50;
				Static4.anIntArray377[local5] = local3 + (local445 + ((Static4.anIntArray367[local15] - local445) * local465 >> 16) << 9) / 50;
				Static4.anIntArray380[local5++] = local452 + (((this.anIntArray346[arg0] & 0xFFFF) - local452) * local465 >> 16);
			}
			if (local24 >= 50) {
				@Pc(536) int local536 = (50 - local32) * MathUtils.anIntArray300[local24 - local32];
				Static4.anIntArray381[local5] = local1 + (local441 + ((Static4.anIntArray370[local10] - local441) * local536 >> 16) << 9) / 50;
				Static4.anIntArray377[local5] = local3 + (local445 + ((Static4.anIntArray367[local10] - local445) * local536 >> 16) << 9) / 50;
				Static4.anIntArray380[local5++] = local452 + (((this.anIntArray345[arg0] & 0xFFFF) - local452) * local536 >> 16);
			}
		}
		@Pc(598) int local598 = Static4.anIntArray381[0];
		@Pc(602) int local602 = Static4.anIntArray381[1];
		@Pc(606) int local606 = Static4.anIntArray381[2];
		@Pc(610) int local610 = Static4.anIntArray377[0];
		@Pc(614) int local614 = Static4.anIntArray377[1];
		@Pc(618) int local618 = Static4.anIntArray377[2];
		Static4.aBoolean217 = false;
		if (local5 == 3) {
			if (local598 < 0 || local602 < 0 || local606 < 0 || local598 > Static4.anInt3129 || local602 > Static4.anInt3129 || local606 > Static4.anInt3129) {
				Static4.aBoolean217 = true;
			}
			if (this.aShortArray61 != null && this.aShortArray61[arg0] != -1) {
				@Pc(709) int local709;
				@Pc(714) int local714;
				@Pc(719) int local719;
				if (this.aByteArray43 == null || this.aByteArray43[arg0] == -1) {
					local709 = local10;
					local714 = local15;
					local719 = local20;
				} else {
					@Pc(704) int local704 = this.aByteArray43[arg0] & 0xFF;
					local709 = this.anIntArray351[local704];
					local714 = this.anIntArray353[local704];
					local719 = this.anIntArray341[local704];
				}
				if (this.anIntArray342[arg0] == -1) {
					Static23.method2549(local610, local614, local618, local598, local602, local606, this.anIntArray345[arg0], this.anIntArray345[arg0], this.anIntArray345[arg0], Static4.anIntArray370[local709], Static4.anIntArray370[local714], Static4.anIntArray370[local719], Static4.anIntArray367[local709], Static4.anIntArray367[local714], Static4.anIntArray367[local719], Static4.anIntArray372[local709], Static4.anIntArray372[local714], Static4.anIntArray372[local719], this.aShortArray61[arg0]);
				} else {
					Static23.method2549(local610, local614, local618, local598, local602, local606, Static4.anIntArray380[0], Static4.anIntArray380[1], Static4.anIntArray380[2], Static4.anIntArray370[local709], Static4.anIntArray370[local714], Static4.anIntArray370[local719], Static4.anIntArray367[local709], Static4.anIntArray367[local714], Static4.anIntArray367[local719], Static4.anIntArray372[local709], Static4.anIntArray372[local714], Static4.anIntArray372[local719], this.aShortArray61[arg0]);
				}
			} else if (this.anIntArray342[arg0] == -1) {
				Static23.method2550(local610, local614, local618, local598, local602, local606, ColorUtils.HSL_TO_RGB[this.anIntArray345[arg0] & 0xFFFF]);
			} else {
				Static23.method2543(local610, local614, local618, local598, local602, local606, Static4.anIntArray380[0], Static4.anIntArray380[1], Static4.anIntArray380[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local598 < 0 || local602 < 0 || local606 < 0 || local598 > Static4.anInt3129 || local602 > Static4.anInt3129 || local606 > Static4.anInt3129 || Static4.anIntArray381[3] < 0 || Static4.anIntArray381[3] > Static4.anInt3129) {
			Static4.aBoolean217 = true;
		}
		if (this.aShortArray61 != null && this.aShortArray61[arg0] != -1) {
			@Pc(962) int local962;
			@Pc(967) int local967;
			@Pc(972) int local972;
			if (this.aByteArray43 == null || this.aByteArray43[arg0] == -1) {
				local962 = local10;
				local967 = local15;
				local972 = local20;
			} else {
				@Pc(957) int local957 = this.aByteArray43[arg0] & 0xFF;
				local962 = this.anIntArray351[local957];
				local967 = this.anIntArray353[local957];
				local972 = this.anIntArray341[local957];
			}
			@Pc(984) short local984 = this.aShortArray61[arg0];
			if (this.anIntArray342[arg0] == -1) {
				Static23.method2549(local610, local614, local618, local598, local602, local606, this.anIntArray345[arg0], this.anIntArray345[arg0], this.anIntArray345[arg0], Static4.anIntArray370[local962], Static4.anIntArray370[local967], Static4.anIntArray370[local972], Static4.anIntArray367[local962], Static4.anIntArray367[local967], Static4.anIntArray367[local972], Static4.anIntArray372[local962], Static4.anIntArray372[local967], Static4.anIntArray372[local972], local984);
				Static23.method2549(local610, local618, Static4.anIntArray377[3], local598, local606, Static4.anIntArray381[3], this.anIntArray345[arg0], this.anIntArray345[arg0], this.anIntArray345[arg0], Static4.anIntArray370[local962], Static4.anIntArray370[local967], Static4.anIntArray370[local972], Static4.anIntArray367[local962], Static4.anIntArray367[local967], Static4.anIntArray367[local972], Static4.anIntArray372[local962], Static4.anIntArray372[local967], Static4.anIntArray372[local972], local984);
			} else {
				Static23.method2549(local610, local614, local618, local598, local602, local606, Static4.anIntArray380[0], Static4.anIntArray380[1], Static4.anIntArray380[2], Static4.anIntArray370[local962], Static4.anIntArray370[local967], Static4.anIntArray370[local972], Static4.anIntArray367[local962], Static4.anIntArray367[local967], Static4.anIntArray367[local972], Static4.anIntArray372[local962], Static4.anIntArray372[local967], Static4.anIntArray372[local972], local984);
				Static23.method2549(local610, local618, Static4.anIntArray377[3], local598, local606, Static4.anIntArray381[3], Static4.anIntArray380[0], Static4.anIntArray380[2], Static4.anIntArray380[3], Static4.anIntArray370[local962], Static4.anIntArray370[local967], Static4.anIntArray370[local972], Static4.anIntArray367[local962], Static4.anIntArray367[local967], Static4.anIntArray367[local972], Static4.anIntArray372[local962], Static4.anIntArray372[local967], Static4.anIntArray372[local972], local984);
			}
		} else if (this.anIntArray342[arg0] == -1) {
			@Pc(883) int local883 = ColorUtils.HSL_TO_RGB[this.anIntArray345[arg0] & 0xFFFF];
			Static23.method2550(local610, local614, local618, local598, local602, local606, local883);
			Static23.method2550(local610, local618, Static4.anIntArray377[3], local598, local606, Static4.anIntArray381[3], local883);
		} else {
			Static23.method2543(local610, local614, local618, local598, local602, local606, Static4.anIntArray380[0], Static4.anIntArray380[1], Static4.anIntArray380[2]);
			Static23.method2543(local610, local618, Static4.anIntArray377[3], local598, local606, Static4.anIntArray381[3], Static4.anIntArray380[0], Static4.anIntArray380[2], Static4.anIntArray380[3]);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZZLclient!na;[B[S[I[I[I)Lclient!vg;")
	private Model method2908(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) SoftwareModel arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) short[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		arg2.anInt3440 = this.anInt3440;
		arg2.anInt3438 = this.anInt3438;
		arg2.anInt3439 = this.anInt3439;
		arg2.anInt3437 = this.anInt3437;
		if (arg2.anIntArray347 == null || arg2.anIntArray347.length < this.anInt3440) {
			arg2.anIntArray347 = new int[this.anInt3440 + 100];
			arg2.anIntArray344 = new int[this.anInt3440 + 100];
			arg2.anIntArray340 = new int[this.anInt3440 + 100];
		}
		for (@Pc(47) int local47 = 0; local47 < this.anInt3440; local47++) {
			arg2.anIntArray347[local47] = this.anIntArray347[local47];
			arg2.anIntArray344[local47] = this.anIntArray344[local47];
			arg2.anIntArray340[local47] = this.anIntArray340[local47];
		}
		if (arg0) {
			arg2.aByteArray42 = this.aByteArray42;
		} else {
			arg2.aByteArray42 = arg3;
			if (this.aByteArray42 == null) {
				for (@Pc(92) int local92 = 0; local92 < this.anInt3439; local92++) {
					arg2.aByteArray42[local92] = 0;
				}
			} else {
				for (@Pc(106) int local106 = 0; local106 < this.anInt3439; local106++) {
					arg2.aByteArray42[local106] = this.aByteArray42[local106];
				}
			}
		}
		if (arg1) {
			arg2.aShortArray63 = this.aShortArray63;
			arg2.anIntArray345 = this.anIntArray345;
			arg2.anIntArray346 = this.anIntArray346;
			arg2.anIntArray342 = this.anIntArray342;
		} else {
			arg2.aShortArray63 = arg4;
			arg2.anIntArray345 = arg5;
			arg2.anIntArray346 = arg6;
			arg2.anIntArray342 = arg7;
			for (@Pc(153) int local153 = 0; local153 < this.anInt3439; local153++) {
				arg2.aShortArray63[local153] = this.aShortArray63[local153];
				arg2.anIntArray345[local153] = this.anIntArray345[local153];
				arg2.anIntArray346[local153] = this.anIntArray346[local153];
				arg2.anIntArray342[local153] = this.anIntArray342[local153];
			}
		}
		arg2.anIntArray343 = this.anIntArray343;
		arg2.anIntArray348 = this.anIntArray348;
		arg2.anIntArray339 = this.anIntArray339;
		arg2.aByteArray41 = this.aByteArray41;
		arg2.aByteArray43 = this.aByteArray43;
		arg2.aShortArray61 = this.aShortArray61;
		arg2.aByte12 = this.aByte12;
		arg2.anIntArray351 = this.anIntArray351;
		arg2.anIntArray353 = this.anIntArray353;
		arg2.anIntArray341 = this.anIntArray341;
		arg2.anIntArrayArray29 = this.anIntArrayArray29;
		arg2.anIntArrayArray30 = this.anIntArrayArray30;
		arg2.aShortArray64 = this.aShortArray64;
		arg2.aShortArray62 = this.aShortArray62;
		arg2.aBoolean324 = this.aBoolean324;
		arg2.aBoolean244 = false;
		arg2.aClass158Array2 = this.aClass158Array2;
		arg2.aClass167Array2 = this.aClass167Array2;
		return arg2;
	}

	@OriginalMember(owner = "client!na", name = "p", descriptor = "()V")
	private void method2909() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt3438; local17++) {
			@Pc(26) int local26 = this.anIntArray347[local17];
			@Pc(31) int local31 = this.anIntArray344[local17];
			@Pc(36) int local36 = this.anIntArray340[local17];
			if (local26 < local1) {
				local1 = local26;
			}
			if (local26 > local7) {
				local7 = local26;
			}
			if (local31 < local3) {
				local3 = local31;
			}
			if (local31 > local9) {
				local9 = local31;
			}
			if (local36 < local5) {
				local5 = local36;
			}
			if (local36 > local11) {
				local11 = local36;
			}
			@Pc(74) int local74 = local26 * local26 + local36 * local36;
			if (local74 > local13) {
				local13 = local74;
			}
			@Pc(85) int local85 = local74 + local31 * local31;
			if (local85 > local15) {
				local15 = local85;
			}
		}
		this.aShort40 = (short) local1;
		this.aShort36 = (short) local7;
		this.aShort42 = (short) local3;
		this.aShort39 = (short) local9;
		this.aShort35 = (short) local5;
		this.aShort38 = (short) local11;
		this.aShort37 = (short) (Math.sqrt((double) local13) + 0.99D);
		this.aShort41 = (short) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean244 = true;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II[[I[[IIIIZ)Lclient!na;")
	public final SoftwareModel method2910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (!this.aBoolean244) {
			this.method2909();
		}
		@Pc(9) int local9 = arg4 + this.aShort40;
		@Pc(14) int local14 = arg4 + this.aShort36;
		@Pc(19) int local19 = arg6 + this.aShort35;
		@Pc(24) int local24 = arg6 + this.aShort38;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local9 < 0 || local14 + 128 >> 7 >= arg2.length || local19 < 0 || local24 + 128 >> 7 >= arg2[0].length)) {
			return this;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return this;
			}
			if (local9 < 0 || local14 + 128 >> 7 >= arg3.length || local19 < 0 || local24 + 128 >> 7 >= arg3[0].length) {
				return this;
			}
		} else {
			@Pc(98) int local98 = local9 >> 7;
			@Pc(104) int local104 = local14 + 127 >> 7;
			@Pc(108) int local108 = local19 >> 7;
			@Pc(114) int local114 = local24 + 127 >> 7;
			if (arg2[local98][local108] == arg5 && arg2[local104][local108] == arg5 && arg2[local98][local114] == arg5 && arg2[local104][local114] == arg5) {
				return this;
			}
		}
		@Pc(150) SoftwareModel local150;
		if (arg7) {
			local150 = new SoftwareModel();
			local150.anInt3440 = this.anInt3440;
			local150.anInt3438 = this.anInt3438;
			local150.anInt3439 = this.anInt3439;
			local150.anInt3437 = this.anInt3437;
			local150.anIntArray343 = this.anIntArray343;
			local150.anIntArray348 = this.anIntArray348;
			local150.anIntArray339 = this.anIntArray339;
			local150.anIntArray345 = this.anIntArray345;
			local150.anIntArray346 = this.anIntArray346;
			local150.anIntArray342 = this.anIntArray342;
			local150.aByteArray41 = this.aByteArray41;
			local150.aByteArray43 = this.aByteArray43;
			local150.aShortArray61 = this.aShortArray61;
			local150.aShortArray63 = this.aShortArray63;
			local150.aByteArray42 = this.aByteArray42;
			local150.aByte12 = this.aByte12;
			local150.anIntArray351 = this.anIntArray351;
			local150.anIntArray353 = this.anIntArray353;
			local150.anIntArray341 = this.anIntArray341;
			local150.anIntArrayArray29 = this.anIntArrayArray29;
			local150.anIntArrayArray30 = this.anIntArrayArray30;
			local150.aShortArray64 = this.aShortArray64;
			local150.aShortArray62 = this.aShortArray62;
			local150.aBoolean324 = this.aBoolean324;
			if (arg0 == 3) {
				local150.anIntArray347 = Static24.method2566(this.anIntArray347);
				local150.anIntArray344 = Static24.method2566(this.anIntArray344);
				local150.anIntArray340 = Static24.method2566(this.anIntArray340);
			} else {
				local150.anIntArray347 = this.anIntArray347;
				local150.anIntArray344 = new int[local150.anInt3440];
				local150.anIntArray340 = this.anIntArray340;
			}
		} else {
			local150 = this;
		}
		if (arg0 == 1) {
			for (@Pc(289) int local289 = 0; local289 < local150.anInt3438; local289++) {
				@Pc(300) int local300 = this.anIntArray347[local289] + arg4;
				@Pc(307) int local307 = this.anIntArray340[local289] + arg6;
				@Pc(311) int local311 = local300 & 0x7F;
				@Pc(315) int local315 = local307 & 0x7F;
				@Pc(319) int local319 = local300 >> 7;
				@Pc(323) int local323 = local307 >> 7;
				@Pc(345) int local345 = arg2[local319][local323] * (128 - local311) + arg2[local319 + 1][local323] * local311 >> 7;
				@Pc(371) int local371 = arg2[local319][local323 + 1] * (128 - local311) + arg2[local319 + 1][local323 + 1] * local311 >> 7;
				@Pc(383) int local383 = local345 * (128 - local315) + local371 * local315 >> 7;
				local150.anIntArray344[local289] = this.anIntArray344[local289] + local383 - arg5;
			}
			for (@Pc(400) int local400 = local150.anInt3438; local400 < local150.anInt3440; local400++) {
				@Pc(411) int local411 = this.anIntArray347[local400] + arg4;
				@Pc(418) int local418 = this.anIntArray340[local400] + arg6;
				@Pc(422) int local422 = local411 & 0x7F;
				@Pc(426) int local426 = local418 & 0x7F;
				@Pc(430) int local430 = local411 >> 7;
				@Pc(434) int local434 = local418 >> 7;
				if (local430 >= 0 && local430 < arg2.length - 1 && local434 >= 0 && local434 < arg2[0].length - 1) {
					@Pc(475) int local475 = arg2[local430][local434] * (128 - local422) + arg2[local430 + 1][local434] * local422 >> 7;
					@Pc(501) int local501 = arg2[local430][local434 + 1] * (128 - local422) + arg2[local430 + 1][local434 + 1] * local422 >> 7;
					@Pc(513) int local513 = local475 * (128 - local426) + local501 * local426 >> 7;
					local150.anIntArray344[local400] = this.anIntArray344[local400] + local513 - arg5;
				}
			}
		} else if (arg0 == 2) {
			for (@Pc(533) int local533 = 0; local533 < local150.anInt3438; local533++) {
				@Pc(547) int local547 = (this.anIntArray344[local533] << 16) / this.aShort42;
				if (local547 < arg1) {
					@Pc(557) int local557 = this.anIntArray347[local533] + arg4;
					@Pc(564) int local564 = this.anIntArray340[local533] + arg6;
					@Pc(568) int local568 = local557 & 0x7F;
					@Pc(572) int local572 = local564 & 0x7F;
					@Pc(576) int local576 = local557 >> 7;
					@Pc(580) int local580 = local564 >> 7;
					@Pc(602) int local602 = arg2[local576][local580] * (128 - local568) + arg2[local576 + 1][local580] * local568 >> 7;
					@Pc(628) int local628 = arg2[local576][local580 + 1] * (128 - local568) + arg2[local576 + 1][local580 + 1] * local568 >> 7;
					@Pc(640) int local640 = local602 * (128 - local572) + local628 * local572 >> 7;
					local150.anIntArray344[local533] = this.anIntArray344[local533] + (local640 - arg5) * (arg1 - local547) / arg1;
				} else {
					local150.anIntArray344[local533] = this.anIntArray344[local533];
				}
			}
			for (@Pc(672) int local672 = local150.anInt3438; local672 < local150.anInt3440; local672++) {
				@Pc(686) int local686 = (this.anIntArray344[local672] << 16) / this.aShort42;
				if (local686 < arg1) {
					@Pc(696) int local696 = this.anIntArray347[local672] + arg4;
					@Pc(703) int local703 = this.anIntArray340[local672] + arg6;
					@Pc(707) int local707 = local696 & 0x7F;
					@Pc(711) int local711 = local703 & 0x7F;
					@Pc(715) int local715 = local696 >> 7;
					@Pc(719) int local719 = local703 >> 7;
					if (local715 >= 0 && local715 < arg2.length - 1 && local719 >= 0 && local719 < arg2[0].length - 1) {
						@Pc(760) int local760 = arg2[local715][local719] * (128 - local707) + arg2[local715 + 1][local719] * local707 >> 7;
						@Pc(786) int local786 = arg2[local715][local719 + 1] * (128 - local707) + arg2[local715 + 1][local719 + 1] * local707 >> 7;
						@Pc(798) int local798 = local760 * (128 - local711) + local786 * local711 >> 7;
						local150.anIntArray344[local672] = this.anIntArray344[local672] + (local798 - arg5) * (arg1 - local686) / arg1;
					}
				} else {
					local150.anIntArray344[local672] = this.anIntArray344[local672];
				}
			}
		} else if (arg0 == 3) {
			@Pc(837) int local837 = (arg1 & 0xFF) * 4;
			@Pc(845) int local845 = (arg1 >> 8 & 0xFF) * 4;
			local150.method3840(arg2, arg4, arg5, arg6, local837, local845);
		} else if (arg0 == 4) {
			@Pc(863) int local863 = this.aShort39 - this.aShort42;
			for (@Pc(865) int local865 = 0; local865 < this.anInt3438; local865++) {
				@Pc(876) int local876 = this.anIntArray347[local865] + arg4;
				@Pc(883) int local883 = this.anIntArray340[local865] + arg6;
				@Pc(887) int local887 = local876 & 0x7F;
				@Pc(891) int local891 = local883 & 0x7F;
				@Pc(895) int local895 = local876 >> 7;
				@Pc(899) int local899 = local883 >> 7;
				@Pc(921) int local921 = arg3[local895][local899] * (128 - local887) + arg3[local895 + 1][local899] * local887 >> 7;
				@Pc(947) int local947 = arg3[local895][local899 + 1] * (128 - local887) + arg3[local895 + 1][local899 + 1] * local887 >> 7;
				@Pc(959) int local959 = local921 * (128 - local891) + local947 * local891 >> 7;
				local150.anIntArray344[local865] = this.anIntArray344[local865] + local959 + local863 - arg5;
			}
			for (@Pc(978) int local978 = local150.anInt3438; local978 < local150.anInt3440; local978++) {
				@Pc(989) int local989 = this.anIntArray347[local978] + arg4;
				@Pc(996) int local996 = this.anIntArray340[local978] + arg6;
				@Pc(1000) int local1000 = local989 & 0x7F;
				@Pc(1004) int local1004 = local996 & 0x7F;
				@Pc(1008) int local1008 = local989 >> 7;
				@Pc(1012) int local1012 = local996 >> 7;
				if (local1008 >= 0 && local1008 < arg3.length - 1 && local1012 >= 0 && local1012 < arg3[0].length - 1) {
					@Pc(1053) int local1053 = arg3[local1008][local1012] * (128 - local1000) + arg3[local1008 + 1][local1012] * local1000 >> 7;
					@Pc(1079) int local1079 = arg3[local1008][local1012 + 1] * (128 - local1000) + arg3[local1008 + 1][local1012 + 1] * local1000 >> 7;
					@Pc(1091) int local1091 = local1053 * (128 - local1004) + local1079 * local1004 >> 7;
					local150.anIntArray344[local978] = this.anIntArray344[local978] + local1091 + local863 - arg5;
				}
			}
		} else if (arg0 == 5) {
			@Pc(1117) int local1117 = this.aShort39 - this.aShort42;
			for (@Pc(1119) int local1119 = 0; local1119 < this.anInt3438; local1119++) {
				@Pc(1130) int local1130 = this.anIntArray347[local1119] + arg4;
				@Pc(1137) int local1137 = this.anIntArray340[local1119] + arg6;
				@Pc(1141) int local1141 = local1130 & 0x7F;
				@Pc(1145) int local1145 = local1137 & 0x7F;
				@Pc(1149) int local1149 = local1130 >> 7;
				@Pc(1153) int local1153 = local1137 >> 7;
				@Pc(1175) int local1175 = arg2[local1149][local1153] * (128 - local1141) + arg2[local1149 + 1][local1153] * local1141 >> 7;
				@Pc(1201) int local1201 = arg2[local1149][local1153 + 1] * (128 - local1141) + arg2[local1149 + 1][local1153 + 1] * local1141 >> 7;
				@Pc(1213) int local1213 = local1175 * (128 - local1145) + local1201 * local1145 >> 7;
				local1175 = arg3[local1149][local1153] * (128 - local1141) + arg3[local1149 + 1][local1153] * local1141 >> 7;
				local1201 = arg3[local1149][local1153 + 1] * (128 - local1141) + arg3[local1149 + 1][local1153 + 1] * local1141 >> 7;
				@Pc(1273) int local1273 = local1175 * (128 - local1145) + local1201 * local1145 >> 7;
				@Pc(1277) int local1277 = local1213 - local1273;
				local150.anIntArray344[local1119] = ((this.anIntArray344[local1119] << 8) / local1117 * local1277 >> 8) + local1213 - arg5;
			}
			for (@Pc(1302) int local1302 = local150.anInt3438; local1302 < local150.anInt3440; local1302++) {
				@Pc(1313) int local1313 = this.anIntArray347[local1302] + arg4;
				@Pc(1320) int local1320 = this.anIntArray340[local1302] + arg6;
				@Pc(1324) int local1324 = local1313 & 0x7F;
				@Pc(1328) int local1328 = local1320 & 0x7F;
				@Pc(1332) int local1332 = local1313 >> 7;
				@Pc(1336) int local1336 = local1320 >> 7;
				if (local1332 >= 0 && local1332 < arg2.length - 1 && local1332 < arg3.length - 1 && local1336 >= 0 && local1336 < arg2[0].length - 1 && local1336 < arg3[0].length - 1) {
					@Pc(1391) int local1391 = arg2[local1332][local1336] * (128 - local1324) + arg2[local1332 + 1][local1336] * local1324 >> 7;
					@Pc(1417) int local1417 = arg2[local1332][local1336 + 1] * (128 - local1324) + arg2[local1332 + 1][local1336 + 1] * local1324 >> 7;
					@Pc(1429) int local1429 = local1391 * (128 - local1328) + local1417 * local1328 >> 7;
					local1391 = arg3[local1332][local1336] * (128 - local1324) + arg3[local1332 + 1][local1336] * local1324 >> 7;
					local1417 = arg3[local1332][local1336 + 1] * (128 - local1324) + arg3[local1332 + 1][local1336 + 1] * local1324 >> 7;
					@Pc(1489) int local1489 = local1391 * (128 - local1328) + local1417 * local1328 >> 7;
					@Pc(1493) int local1493 = local1429 - local1489;
					local150.anIntArray344[local1302] = ((this.anIntArray344[local1302] << 8) / local1117 * local1493 >> 8) + local1429 - arg5;
				}
			}
		}
		local150.aBoolean244 = false;
		return local150;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I[IIIIZ)V")
	@Override
	protected final void method3843(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(2) int local2 = arg1.length;
		if (arg0 == 0) {
			@Pc(6) int local6 = 0;
			Static4.anInt3443 = 0;
			Static4.anInt3444 = 0;
			Static4.anInt3442 = 0;
			for (@Pc(14) int local14 = 0; local14 < local2; local14++) {
				@Pc(21) int local21 = arg1[local14];
				if (local21 < this.anIntArrayArray29.length) {
					@Pc(31) int[] local31 = this.anIntArrayArray29[local21];
					for (@Pc(33) int local33 = 0; local33 < local31.length; local33++) {
						@Pc(41) int local41 = local31[local33];
						Static4.anInt3443 += this.anIntArray347[local41];
						Static4.anInt3444 += this.anIntArray344[local41];
						Static4.anInt3442 += this.anIntArray340[local41];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static4.anInt3443 = Static4.anInt3443 / local6 + arg2;
				Static4.anInt3444 = Static4.anInt3444 / local6 + arg3;
				Static4.anInt3442 = Static4.anInt3442 / local6 + arg4;
			} else {
				Static4.anInt3443 = arg2;
				Static4.anInt3444 = arg3;
				Static4.anInt3442 = arg4;
			}
		} else if (arg0 == 1) {
			for (@Pc(100) int local100 = 0; local100 < local2; local100++) {
				@Pc(107) int local107 = arg1[local100];
				if (local107 < this.anIntArrayArray29.length) {
					@Pc(117) int[] local117 = this.anIntArrayArray29[local107];
					for (@Pc(119) int local119 = 0; local119 < local117.length; local119++) {
						@Pc(127) int local127 = local117[local119];
						@Pc(129) int[] local129 = this.anIntArray347;
						local129[local127] += arg2;
						local129 = this.anIntArray344;
						local129[local127] += arg3;
						local129 = this.anIntArray340;
						local129[local127] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (@Pc(161) int local161 = 0; local161 < local2; local161++) {
				@Pc(168) int local168 = arg1[local161];
				if (local168 < this.anIntArrayArray29.length) {
					@Pc(178) int[] local178 = this.anIntArrayArray29[local168];
					for (@Pc(180) int local180 = 0; local180 < local178.length; local180++) {
						@Pc(188) int local188 = local178[local180];
						@Pc(190) int[] local190 = this.anIntArray347;
						local190[local188] -= Static4.anInt3443;
						local190 = this.anIntArray344;
						local190[local188] -= Static4.anInt3444;
						local190 = this.anIntArray340;
						local190[local188] -= Static4.anInt3442;
						if (arg4 != 0) {
							@Pc(218) int local218 = MathUtils.SINE[arg4];
							@Pc(222) int local222 = MathUtils.COSINE[arg4];
							@Pc(240) int local240 = this.anIntArray344[local188] * local218 + this.anIntArray347[local188] * local222 + 32767 >> 16;
							this.anIntArray344[local188] = this.anIntArray344[local188] * local222 + 32767 - this.anIntArray347[local188] * local218 >> 16;
							this.anIntArray347[local188] = local240;
						}
						if (arg2 != 0) {
							@Pc(272) int local272 = MathUtils.SINE[arg2];
							@Pc(276) int local276 = MathUtils.COSINE[arg2];
							@Pc(294) int local294 = this.anIntArray344[local188] * local276 + 32767 - this.anIntArray340[local188] * local272 >> 16;
							this.anIntArray340[local188] = this.anIntArray344[local188] * local272 + this.anIntArray340[local188] * local276 + 32767 >> 16;
							this.anIntArray344[local188] = local294;
						}
						if (arg3 != 0) {
							@Pc(326) int local326 = MathUtils.SINE[arg3];
							@Pc(330) int local330 = MathUtils.COSINE[arg3];
							@Pc(348) int local348 = this.anIntArray340[local188] * local326 + this.anIntArray347[local188] * local330 + 32767 >> 16;
							this.anIntArray340[local188] = this.anIntArray340[local188] * local330 + 32767 - this.anIntArray347[local188] * local326 >> 16;
							this.anIntArray347[local188] = local348;
						}
						@Pc(376) int[] local376 = this.anIntArray347;
						local376[local188] += Static4.anInt3443;
						local376 = this.anIntArray344;
						local376[local188] += Static4.anInt3444;
						local376 = this.anIntArray340;
						local376[local188] += Static4.anInt3442;
					}
				}
			}
		} else if (arg0 == 3) {
			for (@Pc(408) int local408 = 0; local408 < local2; local408++) {
				@Pc(415) int local415 = arg1[local408];
				if (local415 < this.anIntArrayArray29.length) {
					@Pc(425) int[] local425 = this.anIntArrayArray29[local415];
					for (@Pc(427) int local427 = 0; local427 < local425.length; local427++) {
						@Pc(435) int local435 = local425[local427];
						@Pc(437) int[] local437 = this.anIntArray347;
						local437[local435] -= Static4.anInt3443;
						local437 = this.anIntArray344;
						local437[local435] -= Static4.anInt3444;
						local437 = this.anIntArray340;
						local437[local435] -= Static4.anInt3442;
						this.anIntArray347[local435] = this.anIntArray347[local435] * arg2 / 128;
						this.anIntArray344[local435] = this.anIntArray344[local435] * arg3 / 128;
						this.anIntArray340[local435] = this.anIntArray340[local435] * arg4 / 128;
						local437 = this.anIntArray347;
						local437[local435] += Static4.anInt3443;
						local437 = this.anIntArray344;
						local437[local435] += Static4.anInt3444;
						local437 = this.anIntArray340;
						local437[local435] += Static4.anInt3442;
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray30 != null && this.aByteArray42 != null) {
				for (@Pc(535) int local535 = 0; local535 < local2; local535++) {
					@Pc(542) int local542 = arg1[local535];
					if (local542 < this.anIntArrayArray30.length) {
						@Pc(552) int[] local552 = this.anIntArrayArray30[local542];
						for (@Pc(554) int local554 = 0; local554 < local552.length; local554++) {
							@Pc(562) int local562 = local552[local554];
							@Pc(573) int local573 = (this.aByteArray42[local562] & 0xFF) + arg2 * 8;
							if (local573 < 0) {
								local573 = 0;
							} else if (local573 > 255) {
								local573 = 255;
							}
							this.aByteArray42[local562] = (byte) local573;
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray30 != null) {
			for (@Pc(602) int local602 = 0; local602 < local2; local602++) {
				@Pc(609) int local609 = arg1[local602];
				if (local609 < this.anIntArrayArray30.length) {
					@Pc(619) int[] local619 = this.anIntArrayArray30[local609];
					for (@Pc(621) int local621 = 0; local621 < local619.length; local621++) {
						@Pc(629) int local629 = local619[local621];
						@Pc(636) int local636 = this.aShortArray63[local629] & 0xFFFF;
						@Pc(642) int local642 = local636 >> 10 & 0x3F;
						@Pc(648) int local648 = local636 >> 7 & 0x7;
						@Pc(652) int local652 = local636 & 0x7F;
						local642 = local642 + arg2 & 0x3F;
						@Pc(662) int local662 = local648 + arg3;
						if (local662 < 0) {
							local662 = 0;
						} else if (local662 > 7) {
							local662 = 7;
						}
						@Pc(676) int local676 = local652 + arg4;
						if (local676 < 0) {
							local676 = 0;
						} else if (local676 > 127) {
							local676 = 127;
						}
						this.aShortArray63[local629] = (short) (local642 << 10 | local662 << 7 | local676);
					}
					this.aBoolean245 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "()I")
	@Override
	public final int method3813() {
		if (!this.aBoolean244) {
			this.method2909();
		}
		return this.aShort42;
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(III)V")
	@Override
	public final void method3824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3440; local1++) {
			this.anIntArray347[local1] = this.anIntArray347[local1] * arg0 / 128;
			this.anIntArray344[local1] = this.anIntArray344[local1] * arg1 / 128;
			this.anIntArray340[local1] = this.anIntArray340[local1] * arg2 / 128;
		}
		this.aBoolean244 = false;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(IIIIIIII)V")
	public final void method2911(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (!this.aBoolean244) {
				this.method2909();
			}
			@Pc(6) int local6 = Static4.anInt3125;
			@Pc(8) int local8 = Static4.anInt3126;
			@Pc(12) int local12 = MathUtils.SINE[0];
			@Pc(16) int local16 = MathUtils.COSINE[0];
			@Pc(20) int local20 = MathUtils.SINE[arg0];
			@Pc(24) int local24 = MathUtils.COSINE[arg0];
			@Pc(28) int local28 = MathUtils.SINE[arg1];
			@Pc(32) int local32 = MathUtils.COSINE[arg1];
			@Pc(36) int local36 = MathUtils.SINE[arg2];
			@Pc(40) int local40 = MathUtils.COSINE[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt3440; local52++) {
				@Pc(61) int local61 = this.anIntArray347[local52];
				@Pc(66) int local66 = this.anIntArray344[local52];
				@Pc(71) int local71 = this.anIntArray340[local52];
				if (arg1 != 0) {
					@Pc(83) int local83 = local66 * local28 + local61 * local32 >> 16;
					local66 = local66 * local32 - local61 * local28 >> 16;
					local61 = local83;
				}
				if (arg0 != 0) {
					@Pc(131) int local131 = local71 * local20 + local61 * local24 >> 16;
					local71 = local71 * local24 - local61 * local20 >> 16;
					local61 = local131;
				}
				@Pc(147) int local147 = local61 + arg3;
				@Pc(151) int local151 = local66 + arg4;
				@Pc(155) int local155 = local71 + arg5;
				@Pc(165) int local165 = local151 * local40 - local155 * local36 >> 16;
				local155 = local151 * local36 + local155 * local40 >> 16;
				Static4.anIntArray376[local52] = local155 - local50;
				Static4.anIntArray379[local52] = local6 + (local147 << 9) / arg6;
				Static4.anIntArray361[local52] = local8 + (local165 << 9) / arg6;
				if (this.anInt3437 > 0) {
					Static4.anIntArray370[local52] = local147;
					Static4.anIntArray367[local52] = local165;
					Static4.anIntArray372[local52] = local155;
				}
			}
			this.method2902(false, false, 0L, this.aShort41, this.aShort41 << 1, null);
		} catch (@Pc(234) RuntimeException local234) {
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected final void method3837(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		if (arg0 == 0) {
			@Pc(6) int local6 = 0;
			Static4.anInt3443 = 0;
			Static4.anInt3444 = 0;
			Static4.anInt3442 = 0;
			for (@Pc(14) int local14 = 0; local14 < local2; local14++) {
				@Pc(21) int local21 = arg1[local14];
				if (local21 < this.anIntArrayArray29.length) {
					@Pc(31) int[] local31 = this.anIntArrayArray29[local21];
					for (@Pc(33) int local33 = 0; local33 < local31.length; local33++) {
						@Pc(41) int local41 = local31[local33];
						if (this.aShortArray64 == null || (arg6 & this.aShortArray64[local41]) != 0) {
							Static4.anInt3443 += this.anIntArray347[local41];
							Static4.anInt3444 += this.anIntArray344[local41];
							Static4.anInt3442 += this.anIntArray340[local41];
							local6++;
						}
					}
				}
			}
			if (local6 > 0) {
				Static4.anInt3443 = Static4.anInt3443 / local6 + arg2;
				Static4.anInt3444 = Static4.anInt3444 / local6 + arg3;
				Static4.anInt3442 = Static4.anInt3442 / local6 + arg4;
				Static4.aBoolean247 = true;
			} else {
				Static4.anInt3443 = arg2;
				Static4.anInt3444 = arg3;
				Static4.anInt3442 = arg4;
			}
		} else if (arg0 == 1) {
			if (arg7 != null) {
				@Pc(135) int local135 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 16384 >> 15;
				@Pc(157) int local157 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 16384 >> 15;
				@Pc(179) int local179 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 16384 >> 15;
				arg2 = local135;
				arg3 = local157;
				arg4 = local179;
			}
			for (@Pc(187) int local187 = 0; local187 < local2; local187++) {
				@Pc(194) int local194 = arg1[local187];
				if (local194 < this.anIntArrayArray29.length) {
					@Pc(204) int[] local204 = this.anIntArrayArray29[local194];
					for (@Pc(206) int local206 = 0; local206 < local204.length; local206++) {
						@Pc(214) int local214 = local204[local206];
						if (this.aShortArray64 == null || (arg6 & this.aShortArray64[local214]) != 0) {
							@Pc(227) int[] local227 = this.anIntArray347;
							local227[local214] += arg2;
							local227 = this.anIntArray344;
							local227[local214] += arg3;
							local227 = this.anIntArray340;
							local227[local214] += arg4;
						}
					}
				}
			}
		} else if (arg0 == 2) {
			if (arg7 == null) {
				for (@Pc(1051) int local1051 = 0; local1051 < local2; local1051++) {
					@Pc(1058) int local1058 = arg1[local1051];
					if (local1058 < this.anIntArrayArray29.length) {
						@Pc(1068) int[] local1068 = this.anIntArrayArray29[local1058];
						for (@Pc(1070) int local1070 = 0; local1070 < local1068.length; local1070++) {
							@Pc(1078) int local1078 = local1068[local1070];
							if (this.aShortArray64 == null || (arg6 & this.aShortArray64[local1078]) != 0) {
								@Pc(1091) int[] local1091 = this.anIntArray347;
								local1091[local1078] -= Static4.anInt3443;
								local1091 = this.anIntArray344;
								local1091[local1078] -= Static4.anInt3444;
								local1091 = this.anIntArray340;
								local1091[local1078] -= Static4.anInt3442;
								if (arg4 != 0) {
									@Pc(1119) int local1119 = MathUtils.SINE[arg4];
									@Pc(1123) int local1123 = MathUtils.COSINE[arg4];
									@Pc(1141) int local1141 = this.anIntArray344[local1078] * local1119 + this.anIntArray347[local1078] * local1123 + 32767 >> 16;
									this.anIntArray344[local1078] = this.anIntArray344[local1078] * local1123 + 32767 - this.anIntArray347[local1078] * local1119 >> 16;
									this.anIntArray347[local1078] = local1141;
								}
								if (arg2 != 0) {
									@Pc(1173) int local1173 = MathUtils.SINE[arg2];
									@Pc(1177) int local1177 = MathUtils.COSINE[arg2];
									@Pc(1195) int local1195 = this.anIntArray344[local1078] * local1177 + 32767 - this.anIntArray340[local1078] * local1173 >> 16;
									this.anIntArray340[local1078] = this.anIntArray344[local1078] * local1173 + this.anIntArray340[local1078] * local1177 + 32767 >> 16;
									this.anIntArray344[local1078] = local1195;
								}
								if (arg3 != 0) {
									@Pc(1227) int local1227 = MathUtils.SINE[arg3];
									@Pc(1231) int local1231 = MathUtils.COSINE[arg3];
									@Pc(1249) int local1249 = this.anIntArray340[local1078] * local1227 + this.anIntArray347[local1078] * local1231 + 32767 >> 16;
									this.anIntArray340[local1078] = this.anIntArray340[local1078] * local1231 + 32767 - this.anIntArray347[local1078] * local1227 >> 16;
									this.anIntArray347[local1078] = local1249;
								}
								@Pc(1277) int[] local1277 = this.anIntArray347;
								local1277[local1078] += Static4.anInt3443;
								local1277 = this.anIntArray344;
								local1277[local1078] += Static4.anInt3444;
								local1277 = this.anIntArray340;
								local1277[local1078] += Static4.anInt3442;
							}
						}
					}
				}
			} else {
				@Pc(263) int local263 = arg7[9];
				@Pc(267) int local267 = arg7[10];
				@Pc(271) int local271 = arg7[11];
				@Pc(275) int local275 = arg7[12];
				@Pc(279) int local279 = arg7[13];
				@Pc(283) int local283 = arg7[14];
				if (Static4.aBoolean247) {
					@Pc(307) int local307 = arg7[0] * Static4.anInt3443 + arg7[3] * Static4.anInt3444 + arg7[6] * Static4.anInt3442 + 16384 >> 15;
					@Pc(329) int local329 = arg7[1] * Static4.anInt3443 + arg7[4] * Static4.anInt3444 + arg7[7] * Static4.anInt3442 + 16384 >> 15;
					@Pc(351) int local351 = arg7[2] * Static4.anInt3443 + arg7[5] * Static4.anInt3444 + arg7[8] * Static4.anInt3442 + 16384 >> 15;
					local307 += local275;
					local329 += local279;
					local351 += local283;
					Static4.anInt3443 = local307;
					Static4.anInt3444 = local329;
					Static4.anInt3442 = local351;
					Static4.aBoolean247 = false;
				}
				@Pc(374) int[] local374 = new int[9];
				@Pc(380) int local380 = MathUtils.COSINE[arg2] >> 1;
				@Pc(386) int local386 = MathUtils.SINE[arg2] >> 1;
				@Pc(392) int local392 = MathUtils.COSINE[arg3] >> 1;
				@Pc(398) int local398 = MathUtils.SINE[arg3] >> 1;
				@Pc(404) int local404 = MathUtils.COSINE[arg4] >> 1;
				@Pc(410) int local410 = MathUtils.SINE[arg4] >> 1;
				@Pc(418) int local418 = local386 * local404 + 16384 >> 15;
				@Pc(426) int local426 = local386 * local410 + 16384 >> 15;
				local374[0] = local392 * local404 + local398 * local426 + 16384 >> 15;
				local374[1] = -local392 * local410 + local398 * local418 + 16384 >> 15;
				local374[2] = local398 * local380 + 16384 >> 15;
				local374[3] = local380 * local410 + 16384 >> 15;
				local374[4] = local380 * local404 + 16384 >> 15;
				local374[5] = -local386;
				local374[6] = -local398 * local404 + local392 * local426 + 16384 >> 15;
				local374[7] = local398 * local410 + local392 * local418 + 16384 >> 15;
				local374[8] = local392 * local380 + 16384 >> 15;
				@Pc(554) int local554 = local374[0] * -Static4.anInt3443 + local374[1] * -Static4.anInt3444 + local374[2] * -Static4.anInt3442 + 16384 >> 15;
				@Pc(579) int local579 = local374[3] * -Static4.anInt3443 + local374[4] * -Static4.anInt3444 + local374[5] * -Static4.anInt3442 + 16384 >> 15;
				@Pc(604) int local604 = local374[6] * -Static4.anInt3443 + local374[7] * -Static4.anInt3444 + local374[8] * -Static4.anInt3442 + 16384 >> 15;
				@Pc(608) int local608 = local554 + Static4.anInt3443;
				@Pc(612) int local612 = local579 + Static4.anInt3444;
				@Pc(616) int local616 = local604 + Static4.anInt3442;
				@Pc(619) int[] local619 = new int[9];
				for (@Pc(621) int local621 = 0; local621 < 3; local621++) {
					for (@Pc(626) int local626 = 0; local626 < 3; local626++) {
						@Pc(631) int local631 = 0;
						for (@Pc(633) int local633 = 0; local633 < 3; local633++) {
							local631 += local374[local621 * 3 + local633] * arg7[local626 * 3 + local633];
						}
						local619[local621 * 3 + local626] = local631 + 16384 >> 15;
					}
				}
				@Pc(694) int local694 = local374[0] * local275 + local374[1] * local279 + local374[2] * local283 + 16384 >> 15;
				@Pc(716) int local716 = local374[3] * local275 + local374[4] * local279 + local374[5] * local283 + 16384 >> 15;
				@Pc(738) int local738 = local374[6] * local275 + local374[7] * local279 + local374[8] * local283 + 16384 >> 15;
				local694 += local608;
				local716 += local612;
				local738 += local616;
				@Pc(753) int[] local753 = new int[9];
				for (@Pc(755) int local755 = 0; local755 < 3; local755++) {
					for (@Pc(760) int local760 = 0; local760 < 3; local760++) {
						@Pc(765) int local765 = 0;
						for (@Pc(767) int local767 = 0; local767 < 3; local767++) {
							local765 += arg7[local755 * 3 + local767] * local619[local760 + local767 * 3];
						}
						local753[local755 * 3 + local760] = local765 + 16384 >> 15;
					}
				}
				@Pc(828) int local828 = arg7[0] * local694 + arg7[1] * local716 + arg7[2] * local738 + 16384 >> 15;
				@Pc(850) int local850 = arg7[3] * local694 + arg7[4] * local716 + arg7[5] * local738 + 16384 >> 15;
				@Pc(872) int local872 = arg7[6] * local694 + arg7[7] * local716 + arg7[8] * local738 + 16384 >> 15;
				local828 += local263;
				local850 += local267;
				local872 += local271;
				for (@Pc(886) int local886 = 0; local886 < local2; local886++) {
					@Pc(893) int local893 = arg1[local886];
					if (local893 < this.anIntArrayArray29.length) {
						@Pc(903) int[] local903 = this.anIntArrayArray29[local893];
						for (@Pc(905) int local905 = 0; local905 < local903.length; local905++) {
							@Pc(913) int local913 = local903[local905];
							if (this.aShortArray64 == null || (arg6 & this.aShortArray64[local913]) != 0) {
								@Pc(955) int local955 = local753[0] * this.anIntArray347[local913] + local753[1] * this.anIntArray344[local913] + local753[2] * this.anIntArray340[local913] + 16384 >> 15;
								@Pc(986) int local986 = local753[3] * this.anIntArray347[local913] + local753[4] * this.anIntArray344[local913] + local753[5] * this.anIntArray340[local913] + 16384 >> 15;
								@Pc(1017) int local1017 = local753[6] * this.anIntArray347[local913] + local753[7] * this.anIntArray344[local913] + local753[8] * this.anIntArray340[local913] + 16384 >> 15;
								local955 += local828;
								local986 += local850;
								local1017 += local872;
								this.anIntArray347[local913] = local955;
								this.anIntArray344[local913] = local986;
								this.anIntArray340[local913] = local1017;
							}
						}
					}
				}
			}
		} else if (arg0 == 3) {
			if (arg7 == null) {
				for (@Pc(1926) int local1926 = 0; local1926 < local2; local1926++) {
					@Pc(1933) int local1933 = arg1[local1926];
					if (local1933 < this.anIntArrayArray29.length) {
						@Pc(1943) int[] local1943 = this.anIntArrayArray29[local1933];
						for (@Pc(1945) int local1945 = 0; local1945 < local1943.length; local1945++) {
							@Pc(1953) int local1953 = local1943[local1945];
							if (this.aShortArray64 == null || (arg6 & this.aShortArray64[local1953]) != 0) {
								@Pc(1966) int[] local1966 = this.anIntArray347;
								local1966[local1953] -= Static4.anInt3443;
								local1966 = this.anIntArray344;
								local1966[local1953] -= Static4.anInt3444;
								local1966 = this.anIntArray340;
								local1966[local1953] -= Static4.anInt3442;
								this.anIntArray347[local1953] = this.anIntArray347[local1953] * arg2 / 128;
								this.anIntArray344[local1953] = this.anIntArray344[local1953] * arg3 / 128;
								this.anIntArray340[local1953] = this.anIntArray340[local1953] * arg4 / 128;
								local1966 = this.anIntArray347;
								local1966[local1953] += Static4.anInt3443;
								local1966 = this.anIntArray344;
								local1966[local1953] += Static4.anInt3444;
								local1966 = this.anIntArray340;
								local1966[local1953] += Static4.anInt3442;
							}
						}
					}
				}
			} else {
				@Pc(1313) int local1313 = arg7[9];
				@Pc(1317) int local1317 = arg7[10];
				@Pc(1321) int local1321 = arg7[11];
				@Pc(1325) int local1325 = arg7[12];
				@Pc(1329) int local1329 = arg7[13];
				@Pc(1333) int local1333 = arg7[14];
				if (Static4.aBoolean247) {
					@Pc(1357) int local1357 = arg7[0] * Static4.anInt3443 + arg7[3] * Static4.anInt3444 + arg7[6] * Static4.anInt3442 + 16384 >> 15;
					@Pc(1379) int local1379 = arg7[1] * Static4.anInt3443 + arg7[4] * Static4.anInt3444 + arg7[7] * Static4.anInt3442 + 16384 >> 15;
					@Pc(1401) int local1401 = arg7[2] * Static4.anInt3443 + arg7[5] * Static4.anInt3444 + arg7[8] * Static4.anInt3442 + 16384 >> 15;
					local1357 += local1325;
					local1379 += local1329;
					local1401 += local1333;
					Static4.anInt3443 = local1357;
					Static4.anInt3444 = local1379;
					Static4.anInt3442 = local1401;
					Static4.aBoolean247 = false;
				}
				@Pc(1427) int local1427 = arg2 << 15 >> 7;
				@Pc(1433) int local1433 = arg3 << 15 >> 7;
				@Pc(1439) int local1439 = arg4 << 15 >> 7;
				@Pc(1448) int local1448 = local1427 * -Static4.anInt3443 + 16384 >> 15;
				@Pc(1457) int local1457 = local1433 * -Static4.anInt3444 + 16384 >> 15;
				@Pc(1466) int local1466 = local1439 * -Static4.anInt3442 + 16384 >> 15;
				@Pc(1470) int local1470 = local1448 + Static4.anInt3443;
				@Pc(1474) int local1474 = local1457 + Static4.anInt3444;
				@Pc(1478) int local1478 = local1466 + Static4.anInt3442;
				@Pc(1481) int[] local1481 = new int[] { local1427 * arg7[0] + 16384 >> 15, local1427 * arg7[3] + 16384 >> 15, local1427 * arg7[6] + 16384 >> 15, local1433 * arg7[1] + 16384 >> 15, local1433 * arg7[4] + 16384 >> 15, local1433 * arg7[7] + 16384 >> 15, local1439 * arg7[2] + 16384 >> 15, local1439 * arg7[5] + 16384 >> 15, local1439 * arg7[8] + 16384 >> 15 };
				@Pc(1597) int local1597 = local1427 * local1325 + 16384 >> 15;
				@Pc(1605) int local1605 = local1433 * local1329 + 16384 >> 15;
				@Pc(1613) int local1613 = local1439 * local1333 + 16384 >> 15;
				local1597 += local1470;
				local1605 += local1474;
				local1613 += local1478;
				@Pc(1628) int[] local1628 = new int[9];
				for (@Pc(1630) int local1630 = 0; local1630 < 3; local1630++) {
					for (@Pc(1635) int local1635 = 0; local1635 < 3; local1635++) {
						@Pc(1640) int local1640 = 0;
						for (@Pc(1642) int local1642 = 0; local1642 < 3; local1642++) {
							local1640 += arg7[local1630 * 3 + local1642] * local1481[local1635 + local1642 * 3];
						}
						local1628[local1630 * 3 + local1635] = local1640 + 16384 >> 15;
					}
				}
				@Pc(1703) int local1703 = arg7[0] * local1597 + arg7[1] * local1605 + arg7[2] * local1613 + 16384 >> 15;
				@Pc(1725) int local1725 = arg7[3] * local1597 + arg7[4] * local1605 + arg7[5] * local1613 + 16384 >> 15;
				@Pc(1747) int local1747 = arg7[6] * local1597 + arg7[7] * local1605 + arg7[8] * local1613 + 16384 >> 15;
				local1703 += local1313;
				local1725 += local1317;
				local1747 += local1321;
				for (@Pc(1761) int local1761 = 0; local1761 < local2; local1761++) {
					@Pc(1768) int local1768 = arg1[local1761];
					if (local1768 < this.anIntArrayArray29.length) {
						@Pc(1778) int[] local1778 = this.anIntArrayArray29[local1768];
						for (@Pc(1780) int local1780 = 0; local1780 < local1778.length; local1780++) {
							@Pc(1788) int local1788 = local1778[local1780];
							if (this.aShortArray64 == null || (arg6 & this.aShortArray64[local1788]) != 0) {
								@Pc(1830) int local1830 = local1628[0] * this.anIntArray347[local1788] + local1628[1] * this.anIntArray344[local1788] + local1628[2] * this.anIntArray340[local1788] + 16384 >> 15;
								@Pc(1861) int local1861 = local1628[3] * this.anIntArray347[local1788] + local1628[4] * this.anIntArray344[local1788] + local1628[5] * this.anIntArray340[local1788] + 16384 >> 15;
								@Pc(1892) int local1892 = local1628[6] * this.anIntArray347[local1788] + local1628[7] * this.anIntArray344[local1788] + local1628[8] * this.anIntArray340[local1788] + 16384 >> 15;
								local1830 += local1703;
								local1861 += local1725;
								local1892 += local1747;
								this.anIntArray347[local1788] = local1830;
								this.anIntArray344[local1788] = local1861;
								this.anIntArray340[local1788] = local1892;
							}
						}
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray30 != null && this.aByteArray42 != null) {
				for (@Pc(2064) int local2064 = 0; local2064 < local2; local2064++) {
					@Pc(2071) int local2071 = arg1[local2064];
					if (local2071 < this.anIntArrayArray30.length) {
						@Pc(2081) int[] local2081 = this.anIntArrayArray30[local2071];
						for (@Pc(2083) int local2083 = 0; local2083 < local2081.length; local2083++) {
							@Pc(2091) int local2091 = local2081[local2083];
							if (this.aShortArray62 == null || (arg6 & this.aShortArray62[local2091]) != 0) {
								@Pc(2113) int local2113 = (this.aByteArray42[local2091] & 0xFF) + arg2 * 8;
								if (local2113 < 0) {
									local2113 = 0;
								} else if (local2113 > 255) {
									local2113 = 255;
								}
								this.aByteArray42[local2091] = (byte) local2113;
							}
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray30 != null) {
			for (@Pc(2142) int local2142 = 0; local2142 < local2; local2142++) {
				@Pc(2149) int local2149 = arg1[local2142];
				if (local2149 < this.anIntArrayArray30.length) {
					@Pc(2159) int[] local2159 = this.anIntArrayArray30[local2149];
					for (@Pc(2161) int local2161 = 0; local2161 < local2159.length; local2161++) {
						@Pc(2169) int local2169 = local2159[local2161];
						if (this.aShortArray62 == null || (arg6 & this.aShortArray62[local2169]) != 0) {
							@Pc(2187) int local2187 = this.aShortArray63[local2169] & 0xFFFF;
							@Pc(2193) int local2193 = local2187 >> 10 & 0x3F;
							@Pc(2199) int local2199 = local2187 >> 7 & 0x7;
							@Pc(2203) int local2203 = local2187 & 0x7F;
							local2193 = local2193 + arg2 & 0x3F;
							@Pc(2213) int local2213 = local2199 + arg3;
							if (local2213 < 0) {
								local2213 = 0;
							} else if (local2213 > 7) {
								local2213 = 7;
							}
							@Pc(2227) int local2227 = local2203 + arg4;
							if (local2227 < 0) {
								local2227 = 0;
							} else if (local2227 > 127) {
								local2227 = 127;
							}
							this.aShortArray63[local2169] = (short) (local2193 << 10 | local2213 << 7 | local2227);
						}
					}
					this.aBoolean245 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "l", descriptor = "()I")
	@Override
	public final int method3841() {
		if (!this.aBoolean244) {
			this.method2909();
		}
		return this.aShort38;
	}

	@OriginalMember(owner = "client!na", name = "q", descriptor = "()V")
	private void method2913() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3439; local1++) {
			@Pc(15) short local15 = this.aShortArray61 == null ? -1 : this.aShortArray61[local1];
			if (local15 == -1) {
				@Pc(25) int local25 = this.aShortArray63[local1] & 0xFFFF;
				if (this.anIntArray342[local1] == -1) {
					@Pc(38) int local38 = this.anIntArray345[local1] & 0xFFFE0000;
					this.anIntArray345[local1] = local38 | Static25.method2912(local25, local38 >> 17);
				} else if (this.anIntArray342[local1] != -2) {
					@Pc(63) int local63 = this.anIntArray345[local1] & 0xFFFE0000;
					this.anIntArray345[local1] = local63 | Static25.method2912(local25, local63 >> 17);
					local63 = this.anIntArray346[local1] & 0xFFFE0000;
					this.anIntArray346[local1] = local63 | Static25.method2912(local25, local63 >> 17);
					local63 = this.anIntArray342[local1] & 0xFFFE0000;
					this.anIntArray342[local1] = local63 | Static25.method2912(local25, local63 >> 17);
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIII)V")
	@Override
	protected final void method3834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == 0) {
			@Pc(3) int local3 = 0;
			Static4.anInt3443 = 0;
			Static4.anInt3444 = 0;
			Static4.anInt3442 = 0;
			for (@Pc(11) int local11 = 0; local11 < this.anInt3440; local11++) {
				Static4.anInt3443 += this.anIntArray347[local11];
				Static4.anInt3444 += this.anIntArray344[local11];
				Static4.anInt3442 += this.anIntArray340[local11];
				local3++;
			}
			if (local3 > 0) {
				Static4.anInt3443 = Static4.anInt3443 / local3 + arg1;
				Static4.anInt3444 = Static4.anInt3444 / local3 + arg2;
				Static4.anInt3442 = Static4.anInt3442 / local3 + arg3;
			} else {
				Static4.anInt3443 = arg1;
				Static4.anInt3444 = arg2;
				Static4.anInt3442 = arg3;
			}
		} else if (arg0 == 1) {
			for (@Pc(72) int local72 = 0; local72 < this.anInt3440; local72++) {
				@Pc(78) int[] local78 = this.anIntArray347;
				local78[local72] += arg1;
				local78 = this.anIntArray344;
				local78[local72] += arg2;
				local78 = this.anIntArray340;
				local78[local72] += arg3;
			}
		} else if (arg0 == 2) {
			for (@Pc(108) int local108 = 0; local108 < this.anInt3440; local108++) {
				@Pc(114) int[] local114 = this.anIntArray347;
				local114[local108] -= Static4.anInt3443;
				local114 = this.anIntArray344;
				local114[local108] -= Static4.anInt3444;
				local114 = this.anIntArray340;
				local114[local108] -= Static4.anInt3442;
				if (arg3 != 0) {
					@Pc(142) int local142 = MathUtils.SINE[arg3];
					@Pc(146) int local146 = MathUtils.COSINE[arg3];
					@Pc(164) int local164 = this.anIntArray344[local108] * local142 + this.anIntArray347[local108] * local146 + 32767 >> 16;
					this.anIntArray344[local108] = this.anIntArray344[local108] * local146 + 32767 - this.anIntArray347[local108] * local142 >> 16;
					this.anIntArray347[local108] = local164;
				}
				if (arg1 != 0) {
					@Pc(196) int local196 = MathUtils.SINE[arg1];
					@Pc(200) int local200 = MathUtils.COSINE[arg1];
					@Pc(218) int local218 = this.anIntArray344[local108] * local200 + 32767 - this.anIntArray340[local108] * local196 >> 16;
					this.anIntArray340[local108] = this.anIntArray344[local108] * local196 + this.anIntArray340[local108] * local200 + 32767 >> 16;
					this.anIntArray344[local108] = local218;
				}
				if (arg2 != 0) {
					@Pc(250) int local250 = MathUtils.SINE[arg2];
					@Pc(254) int local254 = MathUtils.COSINE[arg2];
					@Pc(272) int local272 = this.anIntArray340[local108] * local250 + this.anIntArray347[local108] * local254 + 32767 >> 16;
					this.anIntArray340[local108] = this.anIntArray340[local108] * local254 + 32767 - this.anIntArray347[local108] * local250 >> 16;
					this.anIntArray347[local108] = local272;
				}
				@Pc(300) int[] local300 = this.anIntArray347;
				local300[local108] += Static4.anInt3443;
				local300 = this.anIntArray344;
				local300[local108] += Static4.anInt3444;
				local300 = this.anIntArray340;
				local300[local108] += Static4.anInt3442;
			}
		} else if (arg0 == 3) {
			for (@Pc(330) int local330 = 0; local330 < this.anInt3440; local330++) {
				@Pc(336) int[] local336 = this.anIntArray347;
				local336[local330] -= Static4.anInt3443;
				local336 = this.anIntArray344;
				local336[local330] -= Static4.anInt3444;
				local336 = this.anIntArray340;
				local336[local330] -= Static4.anInt3442;
				this.anIntArray347[local330] = this.anIntArray347[local330] * arg1 / 128;
				this.anIntArray344[local330] = this.anIntArray344[local330] * arg2 / 128;
				this.anIntArray340[local330] = this.anIntArray340[local330] * arg3 / 128;
				local336 = this.anIntArray347;
				local336[local330] += Static4.anInt3443;
				local336 = this.anIntArray344;
				local336[local330] += Static4.anInt3444;
				local336 = this.anIntArray340;
				local336[local330] += Static4.anInt3442;
			}
		} else if (arg0 == 5) {
			for (@Pc(426) int local426 = 0; local426 < this.anInt3439; local426++) {
				@Pc(441) int local441 = (this.aByteArray42[local426] & 0xFF) + arg1 * 8;
				if (local441 < 0) {
					local441 = 0;
				} else if (local441 > 255) {
					local441 = 255;
				}
				this.aByteArray42[local426] = (byte) local441;
			}
		} else if (arg0 == 7) {
			for (@Pc(465) int local465 = 0; local465 < this.anInt3439; local465++) {
				@Pc(476) int local476 = this.aShortArray63[local465] & 0xFFFF;
				@Pc(482) int local482 = local476 >> 10 & 0x3F;
				@Pc(488) int local488 = local476 >> 7 & 0x7;
				@Pc(492) int local492 = local476 & 0x7F;
				local482 = local482 + arg1 & 0x3F;
				@Pc(502) int local502 = local488 + arg2;
				if (local502 < 0) {
					local502 = 0;
				} else if (local502 > 7) {
					local502 = 7;
				}
				@Pc(516) int local516 = local492 + arg3;
				if (local516 < 0) {
					local516 = 0;
				} else if (local516 > 127) {
					local516 = 127;
				}
				this.aShortArray63[local465] = (short) (local482 << 10 | local502 << 7 | local516);
			}
			this.aBoolean245 = true;
		}
	}
}
