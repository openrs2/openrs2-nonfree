import java.nio.ByteBuffer;
import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class GlModel extends Model {

	@OriginalMember(owner = "client!s", name = "n", descriptor = "[S")
	private short[] aShortArray87;

	@OriginalMember(owner = "client!s", name = "o", descriptor = "[I")
	public int[] anIntArray502;

	@OriginalMember(owner = "client!s", name = "p", descriptor = "[S")
	private short[] aShortArray88;

	@OriginalMember(owner = "client!s", name = "q", descriptor = "Lclient!ff;")
	public Class57 aClass57_1;

	@OriginalMember(owner = "client!s", name = "r", descriptor = "Lclient!ff;")
	private Class57 aClass57_2;

	@OriginalMember(owner = "client!s", name = "s", descriptor = "[S")
	private short[] aShortArray89;

	@OriginalMember(owner = "client!s", name = "t", descriptor = "[I")
	private int[] anIntArray503;

	@OriginalMember(owner = "client!s", name = "u", descriptor = "S")
	private short aShort43;

	@OriginalMember(owner = "client!s", name = "v", descriptor = "[S")
	private short[] aShortArray90;

	@OriginalMember(owner = "client!s", name = "w", descriptor = "S")
	private short aShort44;

	@OriginalMember(owner = "client!s", name = "x", descriptor = "Lclient!ff;")
	private Class57 aClass57_3;

	@OriginalMember(owner = "client!s", name = "y", descriptor = "[S")
	private short[] aShortArray91;

	@OriginalMember(owner = "client!s", name = "z", descriptor = "[I")
	public int[] anIntArray504;

	@OriginalMember(owner = "client!s", name = "A", descriptor = "[S")
	private short[] aShortArray92;

	@OriginalMember(owner = "client!s", name = "B", descriptor = "[Lclient!u;")
	public Class167[] aClass167Array3;

	@OriginalMember(owner = "client!s", name = "C", descriptor = "Lclient!rj;")
	private Class152 aClass152_1;

	@OriginalMember(owner = "client!s", name = "H", descriptor = "Lclient!ff;")
	private Class57 aClass57_4;

	@OriginalMember(owner = "client!s", name = "I", descriptor = "[S")
	private short[] aShortArray93;

	@OriginalMember(owner = "client!s", name = "J", descriptor = "[I")
	private int[] anIntArray505;

	@OriginalMember(owner = "client!s", name = "K", descriptor = "[S")
	private short[] aShortArray94;

	@OriginalMember(owner = "client!s", name = "N", descriptor = "[F")
	private float[] aFloatArray54;

	@OriginalMember(owner = "client!s", name = "O", descriptor = "Lclient!ff;")
	private Class57 aClass57_5;

	@OriginalMember(owner = "client!s", name = "P", descriptor = "Lclient!ba;")
	public Class15 aClass15_1;

	@OriginalMember(owner = "client!s", name = "R", descriptor = "[B")
	private byte[] aByteArray62;

	@OriginalMember(owner = "client!s", name = "S", descriptor = "[S")
	private short[] aShortArray95;

	@OriginalMember(owner = "client!s", name = "T", descriptor = "[F")
	private float[] aFloatArray55;

	@OriginalMember(owner = "client!s", name = "U", descriptor = "[I")
	private int[] anIntArray506;

	@OriginalMember(owner = "client!s", name = "V", descriptor = "[S")
	private short[] aShortArray96;

	@OriginalMember(owner = "client!s", name = "W", descriptor = "[S")
	private short[] aShortArray97;

	@OriginalMember(owner = "client!s", name = "X", descriptor = "[I")
	public int[] anIntArray507;

	@OriginalMember(owner = "client!s", name = "Y", descriptor = "[S")
	private short[] aShortArray98;

	@OriginalMember(owner = "client!s", name = "ab", descriptor = "[[I")
	private int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!s", name = "bb", descriptor = "Lclient!lk;")
	private GlBuffer aClass111_7;

	@OriginalMember(owner = "client!s", name = "db", descriptor = "[B")
	private byte[] aByteArray63;

	@OriginalMember(owner = "client!s", name = "fb", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!s", name = "lb", descriptor = "[Lclient!sk;")
	public Class158[] aClass158Array3;

	@OriginalMember(owner = "client!s", name = "F", descriptor = "I")
	public int anInt4689 = 0;

	@OriginalMember(owner = "client!s", name = "E", descriptor = "I")
	private int anInt4688 = 0;

	@OriginalMember(owner = "client!s", name = "D", descriptor = "B")
	private byte aByte15 = 0;

	@OriginalMember(owner = "client!s", name = "M", descriptor = "I")
	private int anInt4690 = 0;

	@OriginalMember(owner = "client!s", name = "Z", descriptor = "Z")
	public boolean aBoolean325 = false;

	@OriginalMember(owner = "client!s", name = "hb", descriptor = "B")
	private byte aByte16 = 0;

	@OriginalMember(owner = "client!s", name = "jb", descriptor = "I")
	private int anInt4691 = 0;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
	public GlModel() {
	}

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Lclient!ml;IIZ)V")
	public GlModel(@OriginalArg(0) Class53_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(26) int[] local26 = new int[arg0.anInt3353];
		this.anIntArray506 = new int[arg0.anInt3356 + 1];
		for (@Pc(35) int local35 = 0; local35 < arg0.anInt3353; local35++) {
			if ((arg0.aByteArray40 == null || arg0.aByteArray40[local35] != 2) && (arg0.aShortArray51 == null || arg0.aShortArray51[local35] == -1 || !Static4.anInterface4_1.method442(arg0.aShortArray51[local35] & 0xFFFF))) {
				local26[this.anInt4690++] = local35;
				@Pc(87) int local87 = this.anIntArray506[arg0.anIntArray331[local35]]++;
				local87 = this.anIntArray506[arg0.anIntArray330[local35]]++;
				local87 = this.anIntArray506[arg0.anIntArray332[local35]]++;
			}
		}
		@Pc(118) long[] local118 = new long[this.anInt4690];
		for (@Pc(120) int local120 = 0; local120 < this.anInt4690; local120++) {
			@Pc(128) int local128 = local26[local120];
			@Pc(130) int local130 = 0;
			@Pc(132) byte local132 = 0;
			@Pc(134) int local134 = 0;
			@Pc(136) int local136 = 0;
			@Pc(138) short local138 = -1;
			if (arg0.aShortArray51 != null) {
				local138 = arg0.aShortArray51[local128];
				if (local138 != -1) {
					local134 = Static4.anInterface4_1.method444(local138 & 0xFFFF);
					local136 = Static4.anInterface4_1.method455(local138 & 0xFFFF);
				}
			}
			@Pc(185) boolean local185 = arg0.aByteArray33 != null && arg0.aByteArray33[local128] != 0 || local138 != -1 && !Static4.anInterface4_1.method443(local138 & 0xFFFF);
			if ((arg3 || local185) && arg0.aByteArray37 != null) {
				local130 += arg0.aByteArray37[local128] << 17;
			}
			if (local185) {
				local130 += 65536;
			}
			@Pc(215) int local215 = local130 + ((local134 & 0xFF) << 8);
			local215 += local136 & 0xFF;
			@Pc(229) int local229 = local132 + ((local138 & 0xFFFF) << 16);
			local229 += local120 & 0xFFFF;
			local118[local120] = ((long) local215 << 32) + (long) local229;
		}
		Static19.method1805(local26, local118);
		this.anInt4689 = arg0.anInt3356;
		this.anInt4688 = arg0.anInt3355;
		this.anIntArray507 = arg0.anIntArray329;
		this.anIntArray504 = arg0.anIntArray324;
		this.anIntArray502 = arg0.anIntArray326;
		this.anIntArray503 = arg0.anIntArray323;
		this.aShortArray96 = arg0.aShortArray52;
		this.aClass158Array3 = arg0.aClass158Array1;
		this.aClass167Array3 = arg0.aClass167Array1;
		@Pc(292) int local292 = this.anInt4690 * 3;
		this.aShortArray95 = new short[local292];
		this.aShortArray90 = new short[local292];
		this.aShortArray87 = new short[local292];
		this.aShortArray89 = new short[local292];
		this.aFloatArray55 = new float[local292];
		this.aFloatArray54 = new float[local292];
		this.aShortArray92 = new short[this.anInt4690];
		this.aByteArray63 = new byte[this.anInt4690];
		this.aShortArray94 = new short[this.anInt4690];
		this.aShortArray97 = new short[this.anInt4690];
		this.aShortArray98 = new short[this.anInt4690];
		this.aShortArray91 = new short[this.anInt4690];
		if (arg0.anIntArray325 != null) {
			this.aByteArray62 = new byte[this.anInt4690];
		}
		if (arg0.aShortArray54 != null) {
			this.aShortArray88 = new short[this.anInt4690];
		}
		this.aClass15_1 = new Class15();
		this.aClass57_1 = new Class57();
		this.aClass57_5 = new Class57();
		if (Preferences.highDetailLighting) {
			this.aClass57_2 = new Class57();
		}
		this.aClass57_3 = new Class57();
		this.aClass57_4 = new Class57();
		this.aShort43 = (short) arg1;
		this.aShort44 = (short) arg2;
		this.aShortArray93 = new short[local292];
		Static6.aLongArray43 = new long[local292];
		@Pc(411) int local411 = 0;
		for (@Pc(413) int local413 = 0; local413 < this.anInt4688; local413++) {
			@Pc(422) int local422 = this.anIntArray506[local413];
			this.anIntArray506[local413] = local411;
			local411 += local422;
		}
		this.anIntArray506[this.anInt4688] = local411;
		@Pc(441) int[] local441 = null;
		@Pc(443) int[] local443 = null;
		@Pc(445) int[] local445 = null;
		@Pc(448) float[][] local448 = null;
		if (arg0.aByteArray35 != null) {
			@Pc(454) int local454 = arg0.anInt3352;
			@Pc(457) int[] local457 = new int[local454];
			@Pc(460) int[] local460 = new int[local454];
			@Pc(463) int[] local463 = new int[local454];
			@Pc(466) int[] local466 = new int[local454];
			@Pc(469) int[] local469 = new int[local454];
			@Pc(472) int[] local472 = new int[local454];
			for (@Pc(474) int local474 = 0; local474 < local454; local474++) {
				local457[local474] = Integer.MAX_VALUE;
				local460[local474] = -2147483647;
				local463[local474] = Integer.MAX_VALUE;
				local466[local474] = -2147483647;
				local469[local474] = Integer.MAX_VALUE;
				local472[local474] = -2147483647;
			}
			for (@Pc(505) int local505 = 0; local505 < this.anInt4690; local505++) {
				@Pc(513) int local513 = local26[local505];
				if (arg0.aByteArray35[local513] != -1) {
					@Pc(526) int local526 = arg0.aByteArray35[local513] & 0xFF;
					for (@Pc(528) int local528 = 0; local528 < 3; local528++) {
						@Pc(538) int local538;
						if (local528 == 0) {
							local538 = arg0.anIntArray331[local513];
						} else if (local528 == 1) {
							local538 = arg0.anIntArray330[local513];
						} else {
							local538 = arg0.anIntArray332[local513];
						}
						@Pc(558) int local558 = arg0.anIntArray329[local538];
						@Pc(563) int local563 = arg0.anIntArray324[local538];
						@Pc(568) int local568 = arg0.anIntArray326[local538];
						if (local558 < local457[local526]) {
							local457[local526] = local558;
						}
						if (local558 > local460[local526]) {
							local460[local526] = local558;
						}
						if (local563 < local463[local526]) {
							local463[local526] = local563;
						}
						if (local563 > local466[local526]) {
							local466[local526] = local563;
						}
						if (local568 < local469[local526]) {
							local469[local526] = local568;
						}
						if (local568 > local472[local526]) {
							local472[local526] = local568;
						}
					}
				}
			}
			local441 = new int[local454];
			local443 = new int[local454];
			local445 = new int[local454];
			local448 = new float[local454][];
			for (@Pc(640) int local640 = 0; local640 < local454; local640++) {
				@Pc(648) byte local648 = arg0.aByteArray38[local640];
				if (local648 > 0) {
					local441[local640] = (local457[local640] + local460[local640]) / 2;
					local443[local640] = (local463[local640] + local466[local640]) / 2;
					local445[local640] = (local469[local640] + local472[local640]) / 2;
					@Pc(698) float local698;
					@Pc(729) float local729;
					@Pc(700) float local700;
					if (local648 == 1) {
						@Pc(694) short local694 = arg0.aShortArray60[local640];
						if (local694 == 0) {
							local698 = 1.0F;
							local700 = 1.0F;
						} else if (local694 > 0) {
							local698 = 1.0F;
							local700 = (float) local694 / 1024.0F;
						} else {
							local700 = 1.0F;
							local698 = (float) -local694 / 1024.0F;
						}
						local729 = 64.0F / (float) (arg0.aShortArray55[local640] & 0xFFFF);
					} else if (local648 == 2) {
						local698 = 64.0F / (float) (arg0.aShortArray60[local640] & 0xFFFF);
						local729 = 64.0F / (float) (arg0.aShortArray55[local640] & 0xFFFF);
						local700 = 64.0F / (float) (arg0.aShortArray58[local640] & 0xFFFF);
					} else {
						local698 = (float) arg0.aShortArray60[local640] / 1024.0F;
						local729 = (float) arg0.aShortArray55[local640] / 1024.0F;
						local700 = (float) arg0.aShortArray58[local640] / 1024.0F;
					}
					local448[local640] = Static31.method3864(arg0.aShortArray59[local640], arg0.aShortArray56[local640], arg0.aShortArray57[local640], arg0.aByteArray36[local640] & 0xFF, local698, local729, local700);
				}
			}
		}
		for (@Pc(817) int local817 = 0; local817 < this.anInt4690; local817++) {
			@Pc(825) int local825 = local26[local817];
			@Pc(832) int local832 = arg0.aShortArray53[local825] & 0xFFFF;
			@Pc(837) short local837;
			if (arg0.aShortArray51 == null) {
				local837 = -1;
			} else {
				local837 = arg0.aShortArray51[local825];
			}
			@Pc(848) int local848;
			if (arg0.aByteArray35 == null) {
				local848 = -1;
			} else {
				local848 = arg0.aByteArray35[local825];
			}
			@Pc(859) int local859;
			if (arg0.aByteArray33 == null) {
				local859 = 0;
			} else {
				local859 = arg0.aByteArray33[local825] & 0xFF;
			}
			@Pc(869) float local869 = 0.0F;
			@Pc(871) float local871 = 0.0F;
			@Pc(873) float local873 = 0.0F;
			@Pc(875) float local875 = 0.0F;
			@Pc(877) float local877 = 0.0F;
			@Pc(879) float local879 = 0.0F;
			@Pc(881) byte local881 = 0;
			@Pc(883) byte local883 = 0;
			@Pc(885) int local885 = 0;
			if (local837 != -1) {
				if (local848 == -1) {
					local869 = 0.0F;
					local871 = 1.0F;
					local873 = 1.0F;
					local875 = 1.0F;
					local881 = 1;
					local877 = 0.0F;
					local879 = 0.0F;
					local883 = 2;
				} else {
					local848 &= 255;
					@Pc(917) byte local917 = arg0.aByteArray38[local848];
					if (local917 == 0) {
						@Pc(924) int local924 = arg0.anIntArray331[local825];
						@Pc(929) int local929 = arg0.anIntArray330[local825];
						@Pc(934) int local934 = arg0.anIntArray332[local825];
						@Pc(939) short local939 = arg0.aShortArray59[local848];
						@Pc(944) short local944 = arg0.aShortArray56[local848];
						@Pc(949) short local949 = arg0.aShortArray57[local848];
						@Pc(955) float local955 = (float) arg0.anIntArray329[local939];
						@Pc(961) float local961 = (float) arg0.anIntArray324[local939];
						@Pc(967) float local967 = (float) arg0.anIntArray326[local939];
						@Pc(975) float local975 = (float) arg0.anIntArray329[local944] - local955;
						@Pc(983) float local983 = (float) arg0.anIntArray324[local944] - local961;
						@Pc(991) float local991 = (float) arg0.anIntArray326[local944] - local967;
						@Pc(999) float local999 = (float) arg0.anIntArray329[local949] - local955;
						@Pc(1007) float local1007 = (float) arg0.anIntArray324[local949] - local961;
						@Pc(1015) float local1015 = (float) arg0.anIntArray326[local949] - local967;
						@Pc(1023) float local1023 = (float) arg0.anIntArray329[local924] - local955;
						@Pc(1031) float local1031 = (float) arg0.anIntArray324[local924] - local961;
						@Pc(1039) float local1039 = (float) arg0.anIntArray326[local924] - local967;
						@Pc(1047) float local1047 = (float) arg0.anIntArray329[local929] - local955;
						@Pc(1055) float local1055 = (float) arg0.anIntArray324[local929] - local961;
						@Pc(1063) float local1063 = (float) arg0.anIntArray326[local929] - local967;
						@Pc(1071) float local1071 = (float) arg0.anIntArray329[local934] - local955;
						@Pc(1079) float local1079 = (float) arg0.anIntArray324[local934] - local961;
						@Pc(1087) float local1087 = (float) arg0.anIntArray326[local934] - local967;
						@Pc(1095) float local1095 = local983 * local1015 - local991 * local1007;
						@Pc(1103) float local1103 = local991 * local999 - local975 * local1015;
						@Pc(1111) float local1111 = local975 * local1007 - local983 * local999;
						@Pc(1119) float local1119 = local1007 * local1111 - local1015 * local1103;
						@Pc(1127) float local1127 = local1015 * local1095 - local999 * local1111;
						@Pc(1135) float local1135 = local999 * local1103 - local1007 * local1095;
						@Pc(1149) float local1149 = 1.0F / (local1119 * local975 + local1127 * local983 + local1135 * local991);
						local869 = (local1119 * local1023 + local1127 * local1031 + local1135 * local1039) * local1149;
						local873 = (local1119 * local1047 + local1127 * local1055 + local1135 * local1063) * local1149;
						local877 = (local1119 * local1071 + local1127 * local1079 + local1135 * local1087) * local1149;
						local1119 = local983 * local1111 - local991 * local1103;
						local1127 = local991 * local1095 - local975 * local1111;
						local1135 = local975 * local1103 - local983 * local1095;
						local1149 = 1.0F / (local1119 * local999 + local1127 * local1007 + local1135 * local1015);
						local871 = (local1119 * local1023 + local1127 * local1031 + local1135 * local1039) * local1149;
						local875 = (local1119 * local1047 + local1127 * local1055 + local1135 * local1063) * local1149;
						local879 = (local1119 * local1071 + local1127 * local1079 + local1135 * local1087) * local1149;
					} else {
						@Pc(1277) int local1277 = arg0.anIntArray331[local825];
						@Pc(1282) int local1282 = arg0.anIntArray330[local825];
						@Pc(1287) int local1287 = arg0.anIntArray332[local825];
						@Pc(1291) int local1291 = local441[local848];
						@Pc(1295) int local1295 = local443[local848];
						@Pc(1299) int local1299 = local445[local848];
						@Pc(1303) float[] local1303 = local448[local848];
						@Pc(1308) byte local1308 = arg0.aByteArray39[local848];
						@Pc(1316) float local1316 = (float) arg0.aByteArray34[local848] / 256.0F;
						if (local917 == 1) {
							@Pc(1329) float local1329 = (float) (arg0.aShortArray58[local848] & 0xFFFF) / 1024.0F;
							Static31.method3871(arg0.anIntArray329[local1277], arg0.anIntArray324[local1277], arg0.anIntArray326[local1277], local1291, local1295, local1299, local1303, local1329, local1308, local1316);
							local869 = Static6.aFloat115;
							local871 = Static6.aFloat118;
							Static31.method3871(arg0.anIntArray329[local1282], arg0.anIntArray324[local1282], arg0.anIntArray326[local1282], local1291, local1295, local1299, local1303, local1329, local1308, local1316);
							local873 = Static6.aFloat115;
							local875 = Static6.aFloat118;
							Static31.method3871(arg0.anIntArray329[local1287], arg0.anIntArray324[local1287], arg0.anIntArray326[local1287], local1291, local1295, local1299, local1303, local1329, local1308, local1316);
							local877 = Static6.aFloat115;
							local879 = Static6.aFloat118;
							@Pc(1405) float local1405 = local1329 / 2.0F;
							if ((local1308 & 0x1) == 0) {
								if (local873 - local869 > local1405) {
									local873 -= local1329;
									local881 = 1;
								} else if (local869 - local873 > local1405) {
									local873 += local1329;
									local881 = 2;
								}
								if (local877 - local869 > local1405) {
									local877 -= local1329;
									local883 = 1;
								} else if (local869 - local877 > local1405) {
									local877 += local1329;
									local883 = 2;
								}
							} else {
								if (local875 - local871 > local1405) {
									local875 -= local1329;
									local881 = 1;
								} else if (local871 - local875 > local1405) {
									local875 += local1329;
									local881 = 2;
								}
								if (local879 - local871 > local1405) {
									local879 -= local1329;
									local883 = 1;
								} else if (local871 - local879 > local1405) {
									local879 += local1329;
									local883 = 2;
								}
							}
						} else if (local917 == 2) {
							@Pc(1522) float local1522 = (float) arg0.aByteArray32[local848] / 256.0F;
							@Pc(1530) float local1530 = (float) arg0.aByteArray31[local848] / 256.0F;
							@Pc(1540) int local1540 = arg0.anIntArray329[local1282] - arg0.anIntArray329[local1277];
							@Pc(1550) int local1550 = arg0.anIntArray324[local1282] - arg0.anIntArray324[local1277];
							@Pc(1560) int local1560 = arg0.anIntArray326[local1282] - arg0.anIntArray326[local1277];
							@Pc(1570) int local1570 = arg0.anIntArray329[local1287] - arg0.anIntArray329[local1277];
							@Pc(1580) int local1580 = arg0.anIntArray324[local1287] - arg0.anIntArray324[local1277];
							@Pc(1590) int local1590 = arg0.anIntArray326[local1287] - arg0.anIntArray326[local1277];
							@Pc(1598) int local1598 = local1550 * local1590 - local1580 * local1560;
							@Pc(1606) int local1606 = local1560 * local1570 - local1590 * local1540;
							@Pc(1614) int local1614 = local1540 * local1580 - local1570 * local1550;
							@Pc(1624) float local1624 = 64.0F / (float) (arg0.aShortArray60[local848] & 0xFFFF);
							@Pc(1634) float local1634 = 64.0F / (float) (arg0.aShortArray55[local848] & 0xFFFF);
							@Pc(1644) float local1644 = 64.0F / (float) (arg0.aShortArray58[local848] & 0xFFFF);
							@Pc(1667) float local1667 = ((float) local1598 * local1303[0] + (float) local1606 * local1303[1] + (float) local1614 * local1303[2]) / local1624;
							@Pc(1690) float local1690 = ((float) local1598 * local1303[3] + (float) local1606 * local1303[4] + (float) local1614 * local1303[5]) / local1634;
							@Pc(1713) float local1713 = ((float) local1598 * local1303[6] + (float) local1606 * local1303[7] + (float) local1614 * local1303[8]) / local1644;
							local885 = Static32.method3877(local1667, local1690, local1713);
							Static31.method3856(arg0.anIntArray329[local1277], arg0.anIntArray324[local1277], arg0.anIntArray326[local1277], local1291, local1295, local1299, local885, local1303, local1308, local1316, local1522, local1530);
							local869 = Static6.aFloat119;
							local871 = Static6.aFloat116;
							Static31.method3856(arg0.anIntArray329[local1282], arg0.anIntArray324[local1282], arg0.anIntArray326[local1282], local1291, local1295, local1299, local885, local1303, local1308, local1316, local1522, local1530);
							local873 = Static6.aFloat119;
							local875 = Static6.aFloat116;
							Static31.method3856(arg0.anIntArray329[local1287], arg0.anIntArray324[local1287], arg0.anIntArray326[local1287], local1291, local1295, local1299, local885, local1303, local1308, local1316, local1522, local1530);
							local877 = Static6.aFloat119;
							local879 = Static6.aFloat116;
						} else if (local917 == 3) {
							Static31.method3874(arg0.anIntArray329[local1277], arg0.anIntArray324[local1277], arg0.anIntArray326[local1277], local1291, local1295, local1299, local1303, local1308, local1316);
							local869 = Static6.aFloat120;
							local871 = Static6.aFloat117;
							Static31.method3874(arg0.anIntArray329[local1282], arg0.anIntArray324[local1282], arg0.anIntArray326[local1282], local1291, local1295, local1299, local1303, local1308, local1316);
							local873 = Static6.aFloat120;
							local875 = Static6.aFloat117;
							Static31.method3874(arg0.anIntArray329[local1287], arg0.anIntArray324[local1287], arg0.anIntArray326[local1287], local1291, local1295, local1299, local1303, local1308, local1316);
							local877 = Static6.aFloat120;
							local879 = Static6.aFloat117;
							if ((local1308 & 0x1) == 0) {
								if (local873 - local869 > 0.5F) {
									local873--;
									local881 = 1;
								} else if (local869 - local873 > 0.5F) {
									local873++;
									local881 = 2;
								}
								if (local877 - local869 > 0.5F) {
									local877--;
									local883 = 1;
								} else if (local869 - local877 > 0.5F) {
									local877++;
									local883 = 2;
								}
							} else {
								if (local875 - local871 > 0.5F) {
									local875--;
									local881 = 1;
								} else if (local871 - local875 > 0.5F) {
									local875++;
									local881 = 2;
								}
								if (local879 - local871 > 0.5F) {
									local879--;
									local883 = 1;
								} else if (local871 - local879 > 0.5F) {
									local879++;
									local883 = 2;
								}
							}
						}
					}
				}
			}
			arg0.method2764();
			@Pc(1981) byte local1981;
			if (arg0.aByteArray40 == null) {
				local1981 = 0;
			} else {
				local1981 = arg0.aByteArray40[local825];
			}
			if (local1981 == 0) {
				@Pc(2009) long local2009 = (long) (local848 << 2) + ((long) (local885 << 24) + (long) (local832 << 8) + (long) local859 << 32);
				@Pc(2014) int local2014 = arg0.anIntArray331[local825];
				@Pc(2019) Class31 local2019 = arg0.aClass31Array1[local2014];
				this.aShortArray94[local817] = this.method3853(arg0, local2014, local2009, local2019.anInt621, local2019.anInt619, local2019.anInt625, local2019.anInt620, local869, local871);
				@Pc(2043) int local2043 = arg0.anIntArray330[local825];
				@Pc(2048) Class31 local2048 = arg0.aClass31Array1[local2043];
				this.aShortArray97[local817] = this.method3853(arg0, local2043, local2009 + (long) local881, local2048.anInt621, local2048.anInt619, local2048.anInt625, local2048.anInt620, local873, local875);
				@Pc(2075) int local2075 = arg0.anIntArray332[local825];
				@Pc(2080) Class31 local2080 = arg0.aClass31Array1[local2075];
				this.aShortArray98[local817] = this.method3853(arg0, local2075, local2009 + (long) local883, local2080.anInt621, local2080.anInt619, local2080.anInt625, local2080.anInt620, local877, local879);
			} else if (local1981 == 1) {
				@Pc(2111) Class120 local2111 = arg0.aClass120Array1[local825];
				@Pc(2152) long local2152 = (long) ((local848 << 2) + (local2111.anInt3342 > 0 ? 1024 : 2048) + (local2111.anInt3339 + 256 << 12) + (local2111.anInt3343 + 256 << 22)) + ((long) (local885 << 24) + (long) (local832 << 8) + (long) local859 << 32);
				this.aShortArray94[local817] = this.method3853(arg0, arg0.anIntArray331[local825], local2152, local2111.anInt3342, local2111.anInt3339, local2111.anInt3343, 0, local869, local871);
				this.aShortArray97[local817] = this.method3853(arg0, arg0.anIntArray330[local825], local2152 + (long) local881, local2111.anInt3342, local2111.anInt3339, local2111.anInt3343, 0, local873, local875);
				this.aShortArray98[local817] = this.method3853(arg0, arg0.anIntArray332[local825], local2152 + (long) local883, local2111.anInt3342, local2111.anInt3339, local2111.anInt3343, 0, local877, local879);
			}
			if (arg0.aShortArray51 == null) {
				this.aShortArray91[local817] = -1;
			} else {
				this.aShortArray91[local817] = arg0.aShortArray51[local825];
			}
			if (this.aByteArray62 != null) {
				this.aByteArray62[local817] = (byte) arg0.anIntArray325[local825];
			}
			this.aShortArray92[local817] = arg0.aShortArray53[local825];
			if (arg0.aByteArray33 != null) {
				this.aByteArray63[local817] = arg0.aByteArray33[local825];
			}
			if (arg0.aShortArray54 != null) {
				this.aShortArray88[local817] = arg0.aShortArray54[local825];
			}
		}
		@Pc(2284) int local2284 = 0;
		@Pc(2286) short local2286 = -10000;
		for (@Pc(2288) int local2288 = 0; local2288 < this.anInt4690; local2288++) {
			@Pc(2297) short local2297 = this.aShortArray91[local2288];
			if (local2297 != local2286) {
				local2284++;
				local2286 = local2297;
			}
		}
		this.anIntArray505 = new int[local2284 + 1];
		@Pc(2313) int local2313 = 0;
		@Pc(2315) short local2315 = -10000;
		for (@Pc(2317) int local2317 = 0; local2317 < this.anInt4690; local2317++) {
			@Pc(2326) short local2326 = this.aShortArray91[local2317];
			if (local2326 != local2315) {
				this.anIntArray505[local2313++] = local2317;
				local2315 = local2326;
			}
		}
		this.anIntArray505[local2313] = this.anInt4690;
		Static6.aLongArray43 = null;
		this.aShortArray95 = Static31.method3860(this.aShortArray95, this.anInt4691);
		this.aShortArray90 = Static31.method3860(this.aShortArray90, this.anInt4691);
		this.aShortArray87 = Static31.method3860(this.aShortArray87, this.anInt4691);
		this.aShortArray89 = Static31.method3860(this.aShortArray89, this.anInt4691);
		this.aFloatArray55 = Static32.method3875(this.aFloatArray55, this.anInt4691);
		this.aFloatArray54 = Static32.method3875(this.aFloatArray54, this.anInt4691);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III)Lclient!vc;")
	@Override
	public final Entity method3809() {
		this.aBoolean325 = false;
		if (this.aClass152_1 != null) {
			this.aShortArray95 = this.aClass152_1.aShortArray84;
			this.aShortArray90 = this.aClass152_1.aShortArray82;
			this.aShortArray87 = this.aClass152_1.aShortArray83;
			this.aShortArray89 = this.aClass152_1.aShortArray85;
			this.aClass152_1 = null;
		}
		return this;
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "()I")
	@Override
	public final int method3818() {
		if (!this.aClass15_1.aBoolean15) {
			this.method3865();
		}
		return this.aClass15_1.aShort3;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(SS)V")
	public final void method3845(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4690; local1++) {
			if (this.aShortArray91[local1] == arg0) {
				this.aShortArray91[local1] = arg1;
			}
		}
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = 0;
		if (arg0 != -1) {
			local20 = Static4.anInterface4_1.method450(arg0 & 0xFFFF);
			local22 = Static4.anInterface4_1.method447(arg0 & 0xFFFF);
		}
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		if (arg1 != -1) {
			local41 = Static4.anInterface4_1.method450(arg1 & 0xFFFF);
			local43 = Static4.anInterface4_1.method447(arg1 & 0xFFFF);
		}
		if (local20 != local41 || local22 != local43) {
			this.aClass57_5.aBoolean103 = false;
		}
	}

	@OriginalMember(owner = "client!s", name = "i", descriptor = "()I")
	@Override
	public final int method3829() {
		if (!this.aClass15_1.aBoolean15) {
			this.method3865();
		}
		return this.aClass15_1.aShort4;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIIIJILclient!ne;)V")
	@Override
	public final void method3805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class20_Sub3 arg10) {
		if (this.anInt4691 == 0) {
			return;
		}
		if (!this.aClass15_1.aBoolean15) {
			this.method3865();
		}
		@Pc(13) short local13 = this.aClass15_1.aShort7;
		@Pc(17) short local17 = this.aClass15_1.aShort8;
		@Pc(21) short local21 = this.aClass15_1.aShort2;
		if (arg10 != null) {
			arg10.method2970(arg0, arg9, arg5, arg6, arg7);
		}
		@Pc(40) int local40 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(50) int local50 = arg6 * arg1 + local40 * arg2 >> 16;
		@Pc(62) int local62 = local50 + (local13 * arg2 + local21 * arg1 >> 16);
		if (local62 <= 50) {
			return;
		}
		@Pc(79) int local79 = local50 + (-local13 * arg2 + local17 * arg1 >> 16);
		if (local79 >= 3584) {
			return;
		}
		@Pc(93) int local93 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(99) int local99 = local93 + local13 << 9;
		if (local99 / local62 <= Static7.anInt5437) {
			return;
		}
		@Pc(111) int local111 = local93 - local13 << 9;
		if (local111 / local62 >= Static4.anInt3123) {
			return;
		}
		@Pc(127) int local127 = arg6 * arg2 - local40 * arg1 >> 16;
		@Pc(141) int local141 = local127 + (local13 * arg1 + local21 * arg2 >> 16) << 9;
		if (local141 / local62 <= Static7.anInt6030) {
			return;
		}
		@Pc(162) int local162 = local127 + (-local13 * arg1 + local17 * arg2 >> 16) << 9;
		if (local162 / local62 >= Static1.anInt403) {
			return;
		}
		@Pc(170) int local170 = 0;
		@Pc(172) int local172 = 0;
		if (arg0 != 0) {
			local170 = Class109.anIntArray299[arg0];
			local172 = Class109.anIntArray298[arg0];
		}
		if (arg8 > 0L && Static1.aBoolean8 && local79 > 0) {
			@Pc(196) int local196;
			@Pc(200) int local200;
			if (local93 > 0) {
				local196 = local111 / local62;
				local200 = local99 / local79;
			} else {
				local196 = local111 / local79;
				local200 = local99 / local62;
			}
			@Pc(215) int local215;
			@Pc(219) int local219;
			if (local127 > 0) {
				local215 = local162 / local62;
				local219 = local141 / local79;
			} else {
				local215 = local162 / local79;
				local219 = local141 / local62;
			}
			if (Static7.anInt5333 >= local196 && Static7.anInt5333 <= local200 && Static1.anInt3 >= local215 && Static1.anInt3 <= local219) {
				@Pc(242) int local242 = 999999;
				@Pc(244) int local244 = -999999;
				@Pc(246) int local246 = 999999;
				@Pc(248) int local248 = -999999;
				@Pc(252) short local252 = this.aClass15_1.aShort4;
				@Pc(256) short local256 = this.aClass15_1.aShort5;
				@Pc(260) short local260 = this.aClass15_1.aShort3;
				@Pc(264) short local264 = this.aClass15_1.aShort6;
				@Pc(299) int[] local299 = new int[] { local252, local256, local252, local256, local252, local256, local252, local256 };
				@Pc(334) int[] local334 = new int[] { local260, local260, local264, local264, local260, local260, local264, local264 };
				@Pc(369) int[] local369 = new int[] { local17, local17, local17, local17, local21, local21, local21, local21 };
				for (@Pc(371) int local371 = 0; local371 < 8; local371++) {
					@Pc(378) int local378 = local299[local371];
					@Pc(382) int local382 = local369[local371];
					@Pc(386) int local386 = local334[local371];
					if (arg0 != 0) {
						@Pc(398) int local398 = local386 * local170 + local378 * local172 >> 16;
						local386 = local386 * local172 - local378 * local170 >> 16;
						local378 = local398;
					}
					@Pc(414) int local414 = local378 + arg5;
					@Pc(418) int local418 = local382 + arg6;
					@Pc(422) int local422 = local386 + arg7;
					@Pc(432) int local432 = local422 * arg3 + local414 * arg4 >> 16;
					local422 = local422 * arg4 - local414 * arg3 >> 16;
					local414 = local432;
					local432 = local418 * arg2 - local422 * arg1 >> 16;
					local422 = local418 * arg1 + local422 * arg2 >> 16;
					if (local422 > 0) {
						@Pc(474) int local474 = (local414 << 9) / local422;
						@Pc(480) int local480 = (local432 << 9) / local422;
						if (local474 < local242) {
							local242 = local474;
						}
						if (local474 > local244) {
							local244 = local474;
						}
						if (local480 < local246) {
							local246 = local480;
						}
						if (local480 > local248) {
							local248 = local480;
						}
					}
				}
				if (Static7.anInt5333 >= local242 && Static7.anInt5333 <= local244 && Static1.anInt3 >= local246 && Static1.anInt3 <= local248) {
					if (this.aBoolean324) {
						Static5.aLongArray57[Static7.anInt5623++] = arg8;
					} else {
						if (Static6.anIntArray509.length < this.anInt4691) {
							Static6.anIntArray509 = new int[this.anInt4691];
							Static6.anIntArray508 = new int[this.anInt4691];
						}
						@Pc(541) int local541 = 0;
						label124:
						while (true) {
							if (local541 >= this.anInt4688) {
								@Pc(698) int local698 = 0;
								while (true) {
									if (local698 >= this.anInt4690) {
										break label124;
									}
									@Pc(707) short local707 = this.aShortArray94[local698];
									@Pc(712) short local712 = this.aShortArray97[local698];
									@Pc(717) short local717 = this.aShortArray98[local698];
									if (this.method3868(Static7.anInt5333, Static1.anInt3, Static6.anIntArray508[local707], Static6.anIntArray508[local712], Static6.anIntArray508[local717], Static6.anIntArray509[local707], Static6.anIntArray509[local712], Static6.anIntArray509[local717])) {
										Static5.aLongArray57[Static7.anInt5623++] = arg8;
										break label124;
									}
									local698++;
								}
							}
							@Pc(550) int local550 = this.anIntArray507[local541];
							@Pc(555) int local555 = this.anIntArray504[local541];
							@Pc(560) int local560 = this.anIntArray502[local541];
							if (arg0 != 0) {
								@Pc(572) int local572 = local560 * local170 + local550 * local172 >> 16;
								local560 = local560 * local172 - local550 * local170 >> 16;
								local550 = local572;
							}
							@Pc(588) int local588 = local550 + arg5;
							@Pc(592) int local592 = local555 + arg6;
							@Pc(596) int local596 = local560 + arg7;
							@Pc(606) int local606 = local596 * arg3 + local588 * arg4 >> 16;
							local596 = local596 * arg4 - local588 * arg3 >> 16;
							local588 = local606;
							local606 = local592 * arg2 - local596 * arg1 >> 16;
							local596 = local592 * arg1 + local596 * arg2 >> 16;
							if (local596 < 50) {
								break;
							}
							@Pc(650) int local650 = (local588 << 9) / local596;
							@Pc(656) int local656 = (local606 << 9) / local596;
							@Pc(661) int local661 = this.anIntArray506[local541];
							@Pc(668) int local668 = this.anIntArray506[local541 + 1];
							for (@Pc(670) int local670 = local661; local670 < local668; local670++) {
								@Pc(680) int local680 = this.aShortArray93[local670] - 1;
								if (local680 == -1) {
									break;
								}
								Static6.anIntArray509[local680] = local650;
								Static6.anIntArray508[local680] = local656;
							}
							local541++;
						}
					}
				}
			}
		}
		@Pc(753) GL local753 = GlRenderer.gl;
		local753.glPushMatrix();
		local753.glTranslatef((float) arg5, (float) arg6, (float) arg7);
		local753.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
		this.method3858();
		local753.glPopMatrix();
		if (arg10 != null) {
			arg10.method2953(arg0, arg1, arg2, arg3, arg4, arg9, arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I[IIIIZ)V")
	@Override
	protected final void method3843(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(2) int local2 = arg1.length;
		if (arg0 == 0) {
			arg2 <<= 4;
			arg3 <<= 4;
			arg4 <<= 4;
			@Pc(18) int local18 = 0;
			Static6.anInt4692 = 0;
			Static6.anInt4693 = 0;
			Static6.anInt4694 = 0;
			for (@Pc(26) int local26 = 0; local26 < local2; local26++) {
				@Pc(33) int local33 = arg1[local26];
				if (local33 < this.anIntArrayArray39.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray39[local33];
					for (@Pc(45) int local45 = 0; local45 < local43.length; local45++) {
						@Pc(53) int local53 = local43[local45];
						Static6.anInt4692 += this.anIntArray507[local53];
						Static6.anInt4693 += this.anIntArray504[local53];
						Static6.anInt4694 += this.anIntArray502[local53];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				Static6.anInt4692 = Static6.anInt4692 / local18 + arg2;
				Static6.anInt4693 = Static6.anInt4693 / local18 + arg3;
				Static6.anInt4694 = Static6.anInt4694 / local18 + arg4;
			} else {
				Static6.anInt4692 = arg2;
				Static6.anInt4693 = arg3;
				Static6.anInt4694 = arg4;
			}
		} else if (arg0 == 1) {
			arg2 <<= 4;
			arg3 <<= 4;
			arg4 <<= 4;
			for (@Pc(124) int local124 = 0; local124 < local2; local124++) {
				@Pc(131) int local131 = arg1[local124];
				if (local131 < this.anIntArrayArray39.length) {
					@Pc(141) int[] local141 = this.anIntArrayArray39[local131];
					for (@Pc(143) int local143 = 0; local143 < local141.length; local143++) {
						@Pc(151) int local151 = local141[local143];
						@Pc(153) int[] local153 = this.anIntArray507;
						local153[local151] += arg2;
						local153 = this.anIntArray504;
						local153[local151] += arg3;
						local153 = this.anIntArray502;
						local153[local151] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (@Pc(185) int local185 = 0; local185 < local2; local185++) {
				@Pc(192) int local192 = arg1[local185];
				if (local192 < this.anIntArrayArray39.length) {
					@Pc(202) int[] local202 = this.anIntArrayArray39[local192];
					for (@Pc(204) int local204 = 0; local204 < local202.length; local204++) {
						@Pc(212) int local212 = local202[local204];
						@Pc(214) int[] local214 = this.anIntArray507;
						local214[local212] -= Static6.anInt4692;
						local214 = this.anIntArray504;
						local214[local212] -= Static6.anInt4693;
						local214 = this.anIntArray502;
						local214[local212] -= Static6.anInt4694;
						if (arg4 != 0) {
							@Pc(242) int local242 = Class109.anIntArray299[arg4];
							@Pc(246) int local246 = Class109.anIntArray298[arg4];
							@Pc(264) int local264 = this.anIntArray504[local212] * local242 + this.anIntArray507[local212] * local246 + 32767 >> 16;
							this.anIntArray504[local212] = this.anIntArray504[local212] * local246 + 32767 - this.anIntArray507[local212] * local242 >> 16;
							this.anIntArray507[local212] = local264;
						}
						if (arg2 != 0) {
							@Pc(296) int local296 = Class109.anIntArray299[arg2];
							@Pc(300) int local300 = Class109.anIntArray298[arg2];
							@Pc(318) int local318 = this.anIntArray504[local212] * local300 + 32767 - this.anIntArray502[local212] * local296 >> 16;
							this.anIntArray502[local212] = this.anIntArray504[local212] * local296 + this.anIntArray502[local212] * local300 + 32767 >> 16;
							this.anIntArray504[local212] = local318;
						}
						if (arg3 != 0) {
							@Pc(350) int local350 = Class109.anIntArray299[arg3];
							@Pc(354) int local354 = Class109.anIntArray298[arg3];
							@Pc(372) int local372 = this.anIntArray502[local212] * local350 + this.anIntArray507[local212] * local354 + 32767 >> 16;
							this.anIntArray502[local212] = this.anIntArray502[local212] * local354 + 32767 - this.anIntArray507[local212] * local350 >> 16;
							this.anIntArray507[local212] = local372;
						}
						@Pc(400) int[] local400 = this.anIntArray507;
						local400[local212] += Static6.anInt4692;
						local400 = this.anIntArray504;
						local400[local212] += Static6.anInt4693;
						local400 = this.anIntArray502;
						local400[local212] += Static6.anInt4694;
					}
				}
			}
			if (arg5 && this.aShortArray95 != null) {
				for (@Pc(433) int local433 = 0; local433 < local2; local433++) {
					@Pc(440) int local440 = arg1[local433];
					if (local440 < this.anIntArrayArray39.length) {
						@Pc(450) int[] local450 = this.anIntArrayArray39[local440];
						for (@Pc(452) int local452 = 0; local452 < local450.length; local452++) {
							@Pc(460) int local460 = local450[local452];
							@Pc(465) int local465 = this.anIntArray506[local460];
							@Pc(472) int local472 = this.anIntArray506[local460 + 1];
							for (@Pc(474) int local474 = local465; local474 < local472; local474++) {
								@Pc(484) int local484 = this.aShortArray93[local474] - 1;
								if (local484 == -1) {
									break;
								}
								if (arg4 != 0) {
									@Pc(494) int local494 = Class109.anIntArray299[arg4];
									@Pc(498) int local498 = Class109.anIntArray298[arg4];
									@Pc(516) int local516 = this.aShortArray90[local484] * local494 + this.aShortArray95[local484] * local498 + 32767 >> 16;
									this.aShortArray90[local484] = (short) (this.aShortArray90[local484] * local498 + 32767 - this.aShortArray95[local484] * local494 >> 16);
									this.aShortArray95[local484] = (short) local516;
								}
								if (arg2 != 0) {
									@Pc(550) int local550 = Class109.anIntArray299[arg2];
									@Pc(554) int local554 = Class109.anIntArray298[arg2];
									@Pc(572) int local572 = this.aShortArray90[local484] * local554 + 32767 - this.aShortArray87[local484] * local550 >> 16;
									this.aShortArray87[local484] = (short) (this.aShortArray90[local484] * local550 + this.aShortArray87[local484] * local554 + 32767 >> 16);
									this.aShortArray90[local484] = (short) local572;
								}
								if (arg3 != 0) {
									@Pc(606) int local606 = Class109.anIntArray299[arg3];
									@Pc(610) int local610 = Class109.anIntArray298[arg3];
									@Pc(628) int local628 = this.aShortArray87[local484] * local606 + this.aShortArray95[local484] * local610 + 32767 >> 16;
									this.aShortArray87[local484] = (short) (this.aShortArray87[local484] * local610 + 32767 - this.aShortArray95[local484] * local606 >> 16);
									this.aShortArray95[local484] = (short) local628;
								}
							}
						}
					}
				}
				if (this.aClass57_2 != null) {
					this.aClass57_2.aBoolean103 = false;
				}
			}
		} else if (arg0 == 3) {
			for (@Pc(675) int local675 = 0; local675 < local2; local675++) {
				@Pc(682) int local682 = arg1[local675];
				if (local682 < this.anIntArrayArray39.length) {
					@Pc(692) int[] local692 = this.anIntArrayArray39[local682];
					for (@Pc(694) int local694 = 0; local694 < local692.length; local694++) {
						@Pc(702) int local702 = local692[local694];
						@Pc(704) int[] local704 = this.anIntArray507;
						local704[local702] -= Static6.anInt4692;
						local704 = this.anIntArray504;
						local704[local702] -= Static6.anInt4693;
						local704 = this.anIntArray502;
						local704[local702] -= Static6.anInt4694;
						this.anIntArray507[local702] = this.anIntArray507[local702] * arg2 >> 7;
						this.anIntArray504[local702] = this.anIntArray504[local702] * arg3 >> 7;
						this.anIntArray502[local702] = this.anIntArray502[local702] * arg4 >> 7;
						local704 = this.anIntArray507;
						local704[local702] += Static6.anInt4692;
						local704 = this.anIntArray504;
						local704[local702] += Static6.anInt4693;
						local704 = this.anIntArray502;
						local704[local702] += Static6.anInt4694;
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray40 != null && this.aByteArray63 != null) {
				for (@Pc(802) int local802 = 0; local802 < local2; local802++) {
					@Pc(809) int local809 = arg1[local802];
					if (local809 < this.anIntArrayArray40.length) {
						@Pc(819) int[] local819 = this.anIntArrayArray40[local809];
						for (@Pc(821) int local821 = 0; local821 < local819.length; local821++) {
							@Pc(829) int local829 = local819[local821];
							@Pc(840) int local840 = (this.aByteArray63[local829] & 0xFF) + arg2 * 8;
							if (local840 < 0) {
								local840 = 0;
							} else if (local840 > 255) {
								local840 = 255;
							}
							this.aByteArray63[local829] = (byte) local840;
						}
						if (local819.length > 0) {
							this.aClass57_5.aBoolean103 = false;
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray40 != null) {
			for (@Pc(876) int local876 = 0; local876 < local2; local876++) {
				@Pc(883) int local883 = arg1[local876];
				if (local883 < this.anIntArrayArray40.length) {
					@Pc(893) int[] local893 = this.anIntArrayArray40[local883];
					for (@Pc(895) int local895 = 0; local895 < local893.length; local895++) {
						@Pc(903) int local903 = local893[local895];
						@Pc(910) int local910 = this.aShortArray92[local903] & 0xFFFF;
						@Pc(916) int local916 = local910 >> 10 & 0x3F;
						@Pc(922) int local922 = local910 >> 7 & 0x7;
						@Pc(926) int local926 = local910 & 0x7F;
						local916 = local916 + arg2 & 0x3F;
						@Pc(938) int local938 = local922 + arg3 / 4;
						if (local938 < 0) {
							local938 = 0;
						} else if (local938 > 7) {
							local938 = 7;
						}
						@Pc(952) int local952 = local926 + arg4;
						if (local952 < 0) {
							local952 = 0;
						} else if (local952 > 127) {
							local952 = 127;
						}
						this.aShortArray92[local903] = (short) (local916 << 10 | local938 << 7 | local952);
					}
					if (local893.length > 0) {
						this.aClass57_5.aBoolean103 = false;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "()I")
	@Override
	public final int method3813() {
		if (!this.aClass15_1.aBoolean15) {
			this.method3865();
		}
		return this.aClass15_1.aShort8;
	}

	@OriginalMember(owner = "client!s", name = "o", descriptor = "()I")
	public final int method3847() {
		return this.aShort43;
	}

	@OriginalMember(owner = "client!s", name = "p", descriptor = "()V")
	public final void method3848() {
		if (this.aShortArray95 == null) {
			this.method3827();
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInt4689; local7++) {
			@Pc(16) int local16 = this.anIntArray502[local7];
			this.anIntArray502[local7] = this.anIntArray507[local7];
			this.anIntArray507[local7] = -local16;
		}
		for (@Pc(34) int local34 = 0; local34 < this.anInt4691; local34++) {
			@Pc(43) short local43 = this.aShortArray87[local34];
			this.aShortArray87[local34] = this.aShortArray95[local34];
			this.aShortArray95[local34] = (short) -local43;
		}
		this.aClass15_1.aBoolean15 = false;
		this.aClass57_1.aBoolean103 = false;
		if (this.aClass57_2 != null) {
			this.aClass57_2.aBoolean103 = false;
		}
	}

	@OriginalMember(owner = "client!s", name = "f", descriptor = "()I")
	@Override
	public final int method3826() {
		if (!this.aClass15_1.aBoolean15) {
			this.method3865();
		}
		return this.aClass15_1.aShort7;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIIJ)V")
	@Override
	public final void method3822(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6) {
		if (this.anInt4691 == 0) {
			return;
		}
		@Pc(5) GL local5 = GlRenderer.gl;
		local5.glPushMatrix();
		if (arg2 != 0) {
			local5.glRotatef((float) arg2 * 0.17578125F, 1.0F, 0.0F, 0.0F);
		}
		local5.glTranslatef((float) arg3, (float) arg4, (float) arg5);
		if (arg0 != 0) {
			local5.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
		}
		if (arg1 != 0) {
			local5.glRotatef((float) -arg1 * 0.17578125F, 0.0F, 0.0F, 1.0F);
		}
		this.method3858();
		local5.glPopMatrix();
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
	@Override
	public final void method3815(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class109.anIntArray299[arg0];
		@Pc(7) int local7 = Class109.anIntArray298[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4689; local9++) {
			@Pc(29) int local29 = this.anIntArray502[local9] * local3 + this.anIntArray507[local9] * local7 >> 16;
			this.anIntArray502[local9] = this.anIntArray502[local9] * local7 - this.anIntArray507[local9] * local3 >> 16;
			this.anIntArray507[local9] = local29;
		}
		this.aClass15_1.aBoolean15 = false;
		this.aClass57_1.aBoolean103 = false;
	}

	@OriginalMember(owner = "client!s", name = "q", descriptor = "()V")
	public final void method3849() {
		if (this.aShortArray95 == null) {
			this.method3828();
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInt4689; local7++) {
			this.anIntArray507[local7] = -this.anIntArray507[local7];
			this.anIntArray502[local7] = -this.anIntArray502[local7];
		}
		for (@Pc(33) int local33 = 0; local33 < this.anInt4691; local33++) {
			this.aShortArray95[local33] = (short) -this.aShortArray95[local33];
			this.aShortArray87[local33] = (short) -this.aShortArray87[local33];
		}
		this.aClass15_1.aBoolean15 = false;
		this.aClass57_1.aBoolean103 = false;
		if (this.aClass57_2 != null) {
			this.aClass57_2.aBoolean103 = false;
		}
	}

	@OriginalMember(owner = "client!s", name = "r", descriptor = "()V")
	public final void method3850() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4689; local1++) {
			this.anIntArray502[local1] = -this.anIntArray502[local1];
		}
		if (this.aShortArray87 != null) {
			for (@Pc(21) int local21 = 0; local21 < this.anInt4691; local21++) {
				this.aShortArray87[local21] = (short) -this.aShortArray87[local21];
			}
		}
		for (@Pc(39) int local39 = 0; local39 < this.anInt4690; local39++) {
			@Pc(48) short local48 = this.aShortArray94[local39];
			this.aShortArray94[local39] = this.aShortArray98[local39];
			this.aShortArray98[local39] = local48;
		}
		this.aClass15_1.aBoolean15 = false;
		this.aClass57_1.aBoolean103 = false;
		if (this.aClass57_2 != null) {
			this.aClass57_2.aBoolean103 = false;
		}
		this.aClass57_4.aBoolean103 = false;
	}

	@OriginalMember(owner = "client!s", name = "j", descriptor = "()Z")
	@Override
	protected final boolean method3830() {
		if (this.anIntArrayArray39 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt4689; local6++) {
			@Pc(12) int[] local12 = this.anIntArray507;
			local12[local6] <<= 4;
			local12 = this.anIntArray504;
			local12[local6] <<= 4;
			local12 = this.anIntArray502;
			local12[local6] <<= 4;
		}
		Static6.anInt4692 = 0;
		Static6.anInt4693 = 0;
		Static6.anInt4694 = 0;
		return true;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "()Z")
	@Override
	public final boolean method3808() {
		return this.aBoolean325 && this.anIntArray507 != null && this.aShortArray95 != null;
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(I)V")
	@Override
	public final void method3832(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class109.anIntArray299[arg0];
		@Pc(7) int local7 = Class109.anIntArray298[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4689; local9++) {
			@Pc(29) int local29 = this.anIntArray504[local9] * local7 - this.anIntArray502[local9] * local3 >> 16;
			this.anIntArray502[local9] = this.anIntArray504[local9] * local3 + this.anIntArray502[local9] * local7 >> 16;
			this.anIntArray504[local9] = local29;
		}
		this.aClass15_1.aBoolean15 = false;
		this.aClass57_1.aBoolean103 = false;
	}

	@OriginalMember(owner = "client!s", name = "s", descriptor = "()V")
	private void method3851() {
		if (Static6.aClass4_Sub10_9.bytes.length < this.anInt4690 * 12) {
			Static6.aClass4_Sub10_9 = new Buffer((this.anInt4690 + 100) * 12);
		} else {
			Static6.aClass4_Sub10_9.position = 0;
		}
		if (GlRenderer.bigEndian) {
			for (@Pc(25) int local25 = 0; local25 < this.anInt4690; local25++) {
				Static6.aClass4_Sub10_9.writeInt(this.aShortArray94[local25]);
				Static6.aClass4_Sub10_9.writeInt(this.aShortArray97[local25]);
				Static6.aClass4_Sub10_9.writeInt(this.aShortArray98[local25]);
			}
		} else {
			for (@Pc(55) int local55 = 0; local55 < this.anInt4690; local55++) {
				Static6.aClass4_Sub10_9.writeIntLE(this.aShortArray94[local55]);
				Static6.aClass4_Sub10_9.writeIntLE(this.aShortArray97[local55]);
				Static6.aClass4_Sub10_9.writeIntLE(this.aShortArray98[local55]);
			}
		}
		if (!GlRenderer.arbVboSupported) {
			@Pc(115) ByteBuffer local115 = ByteBuffer.allocateDirect(Static6.aClass4_Sub10_9.position);
			local115.put(Static6.aClass4_Sub10_9.bytes, 0, Static6.aClass4_Sub10_9.position);
			local115.flip();
			this.aClass57_4.aBoolean103 = true;
			this.aClass57_4.aByteBuffer1 = local115;
			this.aClass57_4.aClass111_1 = null;
			return;
		}
		@Pc(88) GlBuffer local88 = new GlBuffer();
		@Pc(95) ByteBuffer local95 = ByteBuffer.wrap(Static6.aClass4_Sub10_9.bytes, 0, Static6.aClass4_Sub10_9.position);
		local88.setArrayBuffer(local95);
		this.aClass57_4.aBoolean103 = true;
		this.aClass57_4.aByteBuffer1 = null;
		this.aClass57_4.aClass111_1 = local88;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZZZZZZZZZZZ)Lclient!s;")
	public final GlModel method3852(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) boolean arg6, @OriginalArg(9) boolean arg7, @OriginalArg(10) boolean arg8) {
		@Pc(3) GlModel local3 = new GlModel();
		local3.anInt4689 = this.anInt4689;
		local3.anInt4688 = this.anInt4688;
		local3.anInt4691 = this.anInt4691;
		local3.anInt4690 = this.anInt4690;
		if (arg0) {
			local3.anIntArray507 = this.anIntArray507;
			local3.anIntArray502 = this.anIntArray502;
		} else {
			local3.anIntArray507 = Static24.method2566(this.anIntArray507);
			local3.anIntArray502 = Static24.method2566(this.anIntArray502);
		}
		if (arg1) {
			local3.anIntArray504 = this.anIntArray504;
		} else {
			local3.anIntArray504 = Static24.method2566(this.anIntArray504);
		}
		if (arg0 && arg1) {
			local3.aClass57_1 = this.aClass57_1;
			local3.aClass15_1 = this.aClass15_1;
		} else {
			local3.aClass57_1 = new Class57();
			local3.aClass15_1 = new Class15();
		}
		if (arg2) {
			local3.aShortArray92 = this.aShortArray92;
		} else {
			local3.aShortArray92 = Static15.method1396(this.aShortArray92);
		}
		local3.aByteArray63 = this.aByteArray63;
		if (arg2 && arg3 && (arg6 && arg4 || Preferences.highDetailLighting)) {
			local3.aClass57_5 = this.aClass57_5;
		} else {
			local3.aClass57_5 = new Class57();
		}
		if (arg4) {
			local3.aShortArray95 = this.aShortArray95;
			local3.aShortArray90 = this.aShortArray90;
			local3.aShortArray87 = this.aShortArray87;
			local3.aShortArray89 = this.aShortArray89;
		} else {
			local3.aShortArray95 = Static15.method1396(this.aShortArray95);
			local3.aShortArray90 = Static15.method1396(this.aShortArray90);
			local3.aShortArray87 = Static15.method1396(this.aShortArray87);
			local3.aShortArray89 = Static15.method1396(this.aShortArray89);
		}
		if (!Preferences.highDetailLighting) {
			local3.aClass57_2 = null;
		} else if (arg4 && arg5 && arg6) {
			local3.aClass57_2 = this.aClass57_2;
		} else {
			local3.aClass57_2 = new Class57();
		}
		local3.aFloatArray55 = this.aFloatArray55;
		local3.aFloatArray54 = this.aFloatArray54;
		local3.aClass57_3 = this.aClass57_3;
		if (arg7) {
			local3.aShortArray94 = this.aShortArray94;
			local3.aShortArray97 = this.aShortArray97;
			local3.aShortArray98 = this.aShortArray98;
			local3.aClass57_4 = this.aClass57_4;
		} else {
			local3.aShortArray94 = Static15.method1396(this.aShortArray94);
			local3.aShortArray97 = Static15.method1396(this.aShortArray97);
			local3.aShortArray98 = Static15.method1396(this.aShortArray98);
			local3.aClass57_4 = new Class57();
		}
		if (arg8) {
			local3.aShortArray91 = this.aShortArray91;
		} else {
			local3.aShortArray91 = Static15.method1396(this.aShortArray91);
		}
		local3.anIntArray503 = this.anIntArray503;
		local3.anIntArrayArray39 = this.anIntArrayArray39;
		local3.aByteArray62 = this.aByteArray62;
		local3.anIntArrayArray40 = this.anIntArrayArray40;
		local3.anIntArray505 = this.anIntArray505;
		local3.aShortArray93 = this.aShortArray93;
		local3.anIntArray506 = this.anIntArray506;
		local3.aShort43 = this.aShort43;
		local3.aShort44 = this.aShort44;
		local3.aClass158Array3 = this.aClass158Array3;
		local3.aClass167Array3 = this.aClass167Array3;
		local3.aShortArray96 = this.aShortArray96;
		local3.aShortArray88 = this.aShortArray88;
		return local3;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!ml;IJIIIIFF)S")
	private short method3853(@OriginalArg(0) Class53_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(4) int local4 = this.anIntArray506[arg1];
		@Pc(11) int local11 = this.anIntArray506[arg1 + 1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = local4; local15 < local11; local15++) {
			@Pc(23) short local23 = this.aShortArray93[local15];
			if (local23 == 0) {
				local13 = local15;
				break;
			}
			if (Static6.aLongArray43[local15] == arg2) {
				return (short) (local23 - 1);
			}
		}
		this.aShortArray93[local13] = (short) (this.anInt4691 + 1);
		Static6.aLongArray43[local13] = arg2;
		this.aShortArray95[this.anInt4691] = (short) arg3;
		this.aShortArray90[this.anInt4691] = (short) arg4;
		this.aShortArray87[this.anInt4691] = (short) arg5;
		this.aShortArray89[this.anInt4691] = (short) arg6;
		this.aFloatArray55[this.anInt4691] = arg7;
		this.aFloatArray54[this.anInt4691] = arg8;
		return (short) this.anInt4691++;
	}

	@OriginalMember(owner = "client!s", name = "l", descriptor = "()I")
	@Override
	public final int method3841() {
		if (!this.aClass15_1.aBoolean15) {
			this.method3865();
		}
		return this.aClass15_1.aShort6;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!fe;)Lclient!fe;")
	public final SoftwareIndexedSprite method3854(@OriginalArg(0) SoftwareIndexedSprite arg0) {
		if (this.anInt4691 == 0) {
			return null;
		}
		if (!this.aClass15_1.aBoolean15) {
			this.method3865();
		}
		@Pc(26) int local26;
		@Pc(40) int local40;
		if (Static4.anInt3366 > 0) {
			local26 = this.aClass15_1.aShort4 - (this.aClass15_1.aShort2 * Static4.anInt3366 >> 8) >> 3;
			local40 = this.aClass15_1.aShort5 - (this.aClass15_1.aShort8 * Static4.anInt3366 >> 8) >> 3;
		} else {
			local26 = this.aClass15_1.aShort4 - (this.aClass15_1.aShort8 * Static4.anInt3366 >> 8) >> 3;
			local40 = this.aClass15_1.aShort5 - (this.aClass15_1.aShort2 * Static4.anInt3366 >> 8) >> 3;
		}
		@Pc(85) int local85;
		@Pc(99) int local99;
		if (Static4.anInt3363 > 0) {
			local85 = this.aClass15_1.aShort3 - (this.aClass15_1.aShort2 * Static4.anInt3363 >> 8) >> 3;
			local99 = this.aClass15_1.aShort6 - (this.aClass15_1.aShort8 * Static4.anInt3363 >> 8) >> 3;
		} else {
			local85 = this.aClass15_1.aShort3 - (this.aClass15_1.aShort8 * Static4.anInt3363 >> 8) >> 3;
			local99 = this.aClass15_1.aShort6 - (this.aClass15_1.aShort2 * Static4.anInt3363 >> 8) >> 3;
		}
		@Pc(134) int local134 = local40 + 1 - local26;
		@Pc(140) int local140 = local99 + 1 - local85;
		@Pc(151) SoftwareIndexedSprite local151;
		if (arg0 == null || arg0.aByteArray15.length < local134 * local140) {
			local151 = new SoftwareIndexedSprite(local134, local140, 0);
		} else {
			local151 = arg0;
			arg0.anInt3412 = arg0.anInt3408 = local134;
			arg0.anInt3410 = arg0.anInt3413 = local140;
			arg0.method1309();
		}
		local151.anInt3404 = local26;
		local151.anInt3405 = local85;
		if (Static6.anIntArray509.length < this.anInt4691) {
			Static6.anIntArray509 = new int[this.anInt4691];
			Static6.anIntArray508 = new int[this.anInt4691];
		}
		for (@Pc(194) int local194 = 0; local194 < this.anInt4688; local194++) {
			@Pc(216) int local216 = (this.anIntArray507[local194] - (this.anIntArray504[local194] * Static4.anInt3366 >> 8) >> 3) - local26;
			@Pc(234) int local234 = (this.anIntArray502[local194] - (this.anIntArray504[local194] * Static4.anInt3363 >> 8) >> 3) - local85;
			@Pc(239) int local239 = this.anIntArray506[local194];
			@Pc(246) int local246 = this.anIntArray506[local194 + 1];
			for (@Pc(248) int local248 = local239; local248 < local246; local248++) {
				@Pc(258) int local258 = this.aShortArray93[local248] - 1;
				if (local258 == -1) {
					break;
				}
				Static6.anIntArray509[local258] = local216;
				Static6.anIntArray508[local258] = local234;
			}
		}
		for (@Pc(276) int local276 = 0; local276 < this.anInt4690; local276++) {
			if (this.aByteArray63[local276] <= 128) {
				@Pc(292) short local292 = this.aShortArray94[local276];
				@Pc(297) short local297 = this.aShortArray97[local276];
				@Pc(302) short local302 = this.aShortArray98[local276];
				@Pc(306) int local306 = Static6.anIntArray509[local292];
				@Pc(310) int local310 = Static6.anIntArray509[local297];
				@Pc(314) int local314 = Static6.anIntArray509[local302];
				@Pc(318) int local318 = Static6.anIntArray508[local292];
				@Pc(322) int local322 = Static6.anIntArray508[local297];
				@Pc(326) int local326 = Static6.anIntArray508[local302];
				if ((local306 - local310) * (local322 - local326) - (local322 - local318) * (local314 - local310) > 0) {
					Static23.method2552(local151.aByteArray15, local318, local322, local326, local306, local310, local314, local134);
				}
			}
		}
		return local151;
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(I)V")
	public final void method3855(@OriginalArg(0) int arg0) {
		this.aShort43 = (short) arg0;
		this.aClass57_5.aBoolean103 = false;
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(ZZZ)Lclient!vg;")
	@Override
	public final Model method3836(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		return this.method3873(arg0, arg1, arg2, Static6.aClass53_Sub4_Sub2_4, Static6.aClass53_Sub4_Sub2_3);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected final void method3837(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		if (arg0 == 0) {
			@Pc(8) int local8 = arg2 << 4;
			@Pc(12) int local12 = arg3 << 4;
			@Pc(16) int local16 = arg4 << 4;
			@Pc(18) int local18 = 0;
			Static6.anInt4692 = 0;
			Static6.anInt4693 = 0;
			Static6.anInt4694 = 0;
			for (@Pc(26) int local26 = 0; local26 < local2; local26++) {
				@Pc(33) int local33 = arg1[local26];
				if (local33 < this.anIntArrayArray39.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray39[local33];
					for (@Pc(45) int local45 = 0; local45 < local43.length; local45++) {
						@Pc(53) int local53 = local43[local45];
						if (this.aShortArray96 == null || (arg6 & this.aShortArray96[local53]) != 0) {
							Static6.anInt4692 += this.anIntArray507[local53];
							Static6.anInt4693 += this.anIntArray504[local53];
							Static6.anInt4694 += this.anIntArray502[local53];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				Static6.anInt4692 = Static6.anInt4692 / local18 + local8;
				Static6.anInt4693 = Static6.anInt4693 / local18 + local12;
				Static6.anInt4694 = Static6.anInt4694 / local18 + local16;
				Static6.aBoolean326 = true;
			} else {
				Static6.anInt4692 = local8;
				Static6.anInt4693 = local12;
				Static6.anInt4694 = local16;
			}
		} else if (arg0 == 1) {
			if (arg7 != null) {
				@Pc(147) int local147 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 16384 >> 15;
				@Pc(169) int local169 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 16384 >> 15;
				@Pc(191) int local191 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 16384 >> 15;
				arg2 = local147;
				arg3 = local169;
				arg4 = local191;
			}
			@Pc(201) int local201 = arg2 << 4;
			@Pc(205) int local205 = arg3 << 4;
			@Pc(209) int local209 = arg4 << 4;
			for (@Pc(211) int local211 = 0; local211 < local2; local211++) {
				@Pc(218) int local218 = arg1[local211];
				if (local218 < this.anIntArrayArray39.length) {
					@Pc(228) int[] local228 = this.anIntArrayArray39[local218];
					for (@Pc(230) int local230 = 0; local230 < local228.length; local230++) {
						@Pc(238) int local238 = local228[local230];
						if (this.aShortArray96 == null || (arg6 & this.aShortArray96[local238]) != 0) {
							@Pc(251) int[] local251 = this.anIntArray507;
							local251[local238] += local201;
							local251 = this.anIntArray504;
							local251[local238] += local205;
							local251 = this.anIntArray502;
							local251[local238] += local209;
						}
					}
				}
			}
		} else if (arg0 == 2) {
			if (arg7 == null) {
				for (@Pc(1087) int local1087 = 0; local1087 < local2; local1087++) {
					@Pc(1094) int local1094 = arg1[local1087];
					if (local1094 < this.anIntArrayArray39.length) {
						@Pc(1104) int[] local1104 = this.anIntArrayArray39[local1094];
						for (@Pc(1106) int local1106 = 0; local1106 < local1104.length; local1106++) {
							@Pc(1114) int local1114 = local1104[local1106];
							if (this.aShortArray96 == null || (arg6 & this.aShortArray96[local1114]) != 0) {
								@Pc(1127) int[] local1127 = this.anIntArray507;
								local1127[local1114] -= Static6.anInt4692;
								local1127 = this.anIntArray504;
								local1127[local1114] -= Static6.anInt4693;
								local1127 = this.anIntArray502;
								local1127[local1114] -= Static6.anInt4694;
								if (arg4 != 0) {
									@Pc(1155) int local1155 = Class109.anIntArray299[arg4];
									@Pc(1159) int local1159 = Class109.anIntArray298[arg4];
									@Pc(1177) int local1177 = this.anIntArray504[local1114] * local1155 + this.anIntArray507[local1114] * local1159 + 32767 >> 16;
									this.anIntArray504[local1114] = this.anIntArray504[local1114] * local1159 + 32767 - this.anIntArray507[local1114] * local1155 >> 16;
									this.anIntArray507[local1114] = local1177;
								}
								if (arg2 != 0) {
									@Pc(1209) int local1209 = Class109.anIntArray299[arg2];
									@Pc(1213) int local1213 = Class109.anIntArray298[arg2];
									@Pc(1231) int local1231 = this.anIntArray504[local1114] * local1213 + 32767 - this.anIntArray502[local1114] * local1209 >> 16;
									this.anIntArray502[local1114] = this.anIntArray504[local1114] * local1209 + this.anIntArray502[local1114] * local1213 + 32767 >> 16;
									this.anIntArray504[local1114] = local1231;
								}
								if (arg3 != 0) {
									@Pc(1263) int local1263 = Class109.anIntArray299[arg3];
									@Pc(1267) int local1267 = Class109.anIntArray298[arg3];
									@Pc(1285) int local1285 = this.anIntArray502[local1114] * local1263 + this.anIntArray507[local1114] * local1267 + 32767 >> 16;
									this.anIntArray502[local1114] = this.anIntArray502[local1114] * local1267 + 32767 - this.anIntArray507[local1114] * local1263 >> 16;
									this.anIntArray507[local1114] = local1285;
								}
								@Pc(1313) int[] local1313 = this.anIntArray507;
								local1313[local1114] += Static6.anInt4692;
								local1313 = this.anIntArray504;
								local1313[local1114] += Static6.anInt4693;
								local1313 = this.anIntArray502;
								local1313[local1114] += Static6.anInt4694;
							}
						}
					}
				}
				if (arg5 && this.aShortArray95 != null) {
					for (@Pc(1346) int local1346 = 0; local1346 < local2; local1346++) {
						@Pc(1353) int local1353 = arg1[local1346];
						if (local1353 < this.anIntArrayArray39.length) {
							@Pc(1363) int[] local1363 = this.anIntArrayArray39[local1353];
							for (@Pc(1365) int local1365 = 0; local1365 < local1363.length; local1365++) {
								@Pc(1373) int local1373 = local1363[local1365];
								if (this.aShortArray96 == null || (arg6 & this.aShortArray96[local1373]) != 0) {
									@Pc(1389) int local1389 = this.anIntArray506[local1373];
									@Pc(1396) int local1396 = this.anIntArray506[local1373 + 1];
									for (@Pc(1398) int local1398 = local1389; local1398 < local1396; local1398++) {
										@Pc(1408) int local1408 = this.aShortArray93[local1398] - 1;
										if (local1408 == -1) {
											break;
										}
										if (arg4 != 0) {
											@Pc(1418) int local1418 = Class109.anIntArray299[arg4];
											@Pc(1422) int local1422 = Class109.anIntArray298[arg4];
											@Pc(1440) int local1440 = this.aShortArray90[local1408] * local1418 + this.aShortArray95[local1408] * local1422 + 32767 >> 16;
											this.aShortArray90[local1408] = (short) (this.aShortArray90[local1408] * local1422 + 32767 - this.aShortArray95[local1408] * local1418 >> 16);
											this.aShortArray95[local1408] = (short) local1440;
										}
										if (arg2 != 0) {
											@Pc(1474) int local1474 = Class109.anIntArray299[arg2];
											@Pc(1478) int local1478 = Class109.anIntArray298[arg2];
											@Pc(1496) int local1496 = this.aShortArray90[local1408] * local1478 + 32767 - this.aShortArray87[local1408] * local1474 >> 16;
											this.aShortArray87[local1408] = (short) (this.aShortArray90[local1408] * local1474 + this.aShortArray87[local1408] * local1478 + 32767 >> 16);
											this.aShortArray90[local1408] = (short) local1496;
										}
										if (arg3 != 0) {
											@Pc(1530) int local1530 = Class109.anIntArray299[arg3];
											@Pc(1534) int local1534 = Class109.anIntArray298[arg3];
											@Pc(1552) int local1552 = this.aShortArray87[local1408] * local1530 + this.aShortArray95[local1408] * local1534 + 32767 >> 16;
											this.aShortArray87[local1408] = (short) (this.aShortArray87[local1408] * local1534 + 32767 - this.aShortArray95[local1408] * local1530 >> 16);
											this.aShortArray95[local1408] = (short) local1552;
										}
									}
								}
							}
						}
					}
					if (this.aClass57_2 != null) {
						this.aClass57_2.aBoolean103 = false;
					}
				}
			} else {
				@Pc(289) int local289 = arg7[9] << 4;
				@Pc(295) int local295 = arg7[10] << 4;
				@Pc(301) int local301 = arg7[11] << 4;
				@Pc(307) int local307 = arg7[12] << 4;
				@Pc(313) int local313 = arg7[13] << 4;
				@Pc(319) int local319 = arg7[14] << 4;
				if (Static6.aBoolean326) {
					@Pc(343) int local343 = arg7[0] * Static6.anInt4692 + arg7[3] * Static6.anInt4693 + arg7[6] * Static6.anInt4694 + 16384 >> 15;
					@Pc(365) int local365 = arg7[1] * Static6.anInt4692 + arg7[4] * Static6.anInt4693 + arg7[7] * Static6.anInt4694 + 16384 >> 15;
					@Pc(387) int local387 = arg7[2] * Static6.anInt4692 + arg7[5] * Static6.anInt4693 + arg7[8] * Static6.anInt4694 + 16384 >> 15;
					local343 += local307;
					local365 += local313;
					local387 += local319;
					Static6.anInt4692 = local343;
					Static6.anInt4693 = local365;
					Static6.anInt4694 = local387;
					Static6.aBoolean326 = false;
				}
				@Pc(410) int[] local410 = new int[9];
				@Pc(416) int local416 = Class109.anIntArray298[arg2] >> 1;
				@Pc(422) int local422 = Class109.anIntArray299[arg2] >> 1;
				@Pc(428) int local428 = Class109.anIntArray298[arg3] >> 1;
				@Pc(434) int local434 = Class109.anIntArray299[arg3] >> 1;
				@Pc(440) int local440 = Class109.anIntArray298[arg4] >> 1;
				@Pc(446) int local446 = Class109.anIntArray299[arg4] >> 1;
				@Pc(454) int local454 = local422 * local440 + 16384 >> 15;
				@Pc(462) int local462 = local422 * local446 + 16384 >> 15;
				local410[0] = local428 * local440 + local434 * local462 + 16384 >> 15;
				local410[1] = -local428 * local446 + local434 * local454 + 16384 >> 15;
				local410[2] = local434 * local416 + 16384 >> 15;
				local410[3] = local416 * local446 + 16384 >> 15;
				local410[4] = local416 * local440 + 16384 >> 15;
				local410[5] = -local422;
				local410[6] = -local434 * local440 + local428 * local462 + 16384 >> 15;
				local410[7] = local434 * local446 + local428 * local454 + 16384 >> 15;
				local410[8] = local428 * local416 + 16384 >> 15;
				@Pc(590) int local590 = local410[0] * -Static6.anInt4692 + local410[1] * -Static6.anInt4693 + local410[2] * -Static6.anInt4694 + 16384 >> 15;
				@Pc(615) int local615 = local410[3] * -Static6.anInt4692 + local410[4] * -Static6.anInt4693 + local410[5] * -Static6.anInt4694 + 16384 >> 15;
				@Pc(640) int local640 = local410[6] * -Static6.anInt4692 + local410[7] * -Static6.anInt4693 + local410[8] * -Static6.anInt4694 + 16384 >> 15;
				@Pc(644) int local644 = local590 + Static6.anInt4692;
				@Pc(648) int local648 = local615 + Static6.anInt4693;
				@Pc(652) int local652 = local640 + Static6.anInt4694;
				@Pc(655) int[] local655 = new int[9];
				for (@Pc(657) int local657 = 0; local657 < 3; local657++) {
					for (@Pc(662) int local662 = 0; local662 < 3; local662++) {
						@Pc(667) int local667 = 0;
						for (@Pc(669) int local669 = 0; local669 < 3; local669++) {
							local667 += local410[local657 * 3 + local669] * arg7[local662 * 3 + local669];
						}
						local655[local657 * 3 + local662] = local667 + 16384 >> 15;
					}
				}
				@Pc(730) int local730 = local410[0] * local307 + local410[1] * local313 + local410[2] * local319 + 16384 >> 15;
				@Pc(752) int local752 = local410[3] * local307 + local410[4] * local313 + local410[5] * local319 + 16384 >> 15;
				@Pc(774) int local774 = local410[6] * local307 + local410[7] * local313 + local410[8] * local319 + 16384 >> 15;
				local730 += local644;
				local752 += local648;
				local774 += local652;
				@Pc(789) int[] local789 = new int[9];
				for (@Pc(791) int local791 = 0; local791 < 3; local791++) {
					for (@Pc(796) int local796 = 0; local796 < 3; local796++) {
						@Pc(801) int local801 = 0;
						for (@Pc(803) int local803 = 0; local803 < 3; local803++) {
							local801 += arg7[local791 * 3 + local803] * local655[local796 + local803 * 3];
						}
						local789[local791 * 3 + local796] = local801 + 16384 >> 15;
					}
				}
				@Pc(864) int local864 = arg7[0] * local730 + arg7[1] * local752 + arg7[2] * local774 + 16384 >> 15;
				@Pc(886) int local886 = arg7[3] * local730 + arg7[4] * local752 + arg7[5] * local774 + 16384 >> 15;
				@Pc(908) int local908 = arg7[6] * local730 + arg7[7] * local752 + arg7[8] * local774 + 16384 >> 15;
				local864 += local289;
				local886 += local295;
				local908 += local301;
				for (@Pc(922) int local922 = 0; local922 < local2; local922++) {
					@Pc(929) int local929 = arg1[local922];
					if (local929 < this.anIntArrayArray39.length) {
						@Pc(939) int[] local939 = this.anIntArrayArray39[local929];
						for (@Pc(941) int local941 = 0; local941 < local939.length; local941++) {
							@Pc(949) int local949 = local939[local941];
							if (this.aShortArray96 == null || (arg6 & this.aShortArray96[local949]) != 0) {
								@Pc(991) int local991 = local789[0] * this.anIntArray507[local949] + local789[1] * this.anIntArray504[local949] + local789[2] * this.anIntArray502[local949] + 16384 >> 15;
								@Pc(1022) int local1022 = local789[3] * this.anIntArray507[local949] + local789[4] * this.anIntArray504[local949] + local789[5] * this.anIntArray502[local949] + 16384 >> 15;
								@Pc(1053) int local1053 = local789[6] * this.anIntArray507[local949] + local789[7] * this.anIntArray504[local949] + local789[8] * this.anIntArray502[local949] + 16384 >> 15;
								local991 += local864;
								local1022 += local886;
								local1053 += local908;
								this.anIntArray507[local949] = local991;
								this.anIntArray504[local949] = local1022;
								this.anIntArray502[local949] = local1053;
							}
						}
					}
				}
			}
		} else if (arg0 == 3) {
			if (arg7 == null) {
				for (@Pc(2228) int local2228 = 0; local2228 < local2; local2228++) {
					@Pc(2235) int local2235 = arg1[local2228];
					if (local2235 < this.anIntArrayArray39.length) {
						@Pc(2245) int[] local2245 = this.anIntArrayArray39[local2235];
						for (@Pc(2247) int local2247 = 0; local2247 < local2245.length; local2247++) {
							@Pc(2255) int local2255 = local2245[local2247];
							if (this.aShortArray96 == null || (arg6 & this.aShortArray96[local2255]) != 0) {
								@Pc(2268) int[] local2268 = this.anIntArray507;
								local2268[local2255] -= Static6.anInt4692;
								local2268 = this.anIntArray504;
								local2268[local2255] -= Static6.anInt4693;
								local2268 = this.anIntArray502;
								local2268[local2255] -= Static6.anInt4694;
								this.anIntArray507[local2255] = this.anIntArray507[local2255] * arg2 >> 7;
								this.anIntArray504[local2255] = this.anIntArray504[local2255] * arg3 >> 7;
								this.anIntArray502[local2255] = this.anIntArray502[local2255] * arg4 >> 7;
								local2268 = this.anIntArray507;
								local2268[local2255] += Static6.anInt4692;
								local2268 = this.anIntArray504;
								local2268[local2255] += Static6.anInt4693;
								local2268 = this.anIntArray502;
								local2268[local2255] += Static6.anInt4694;
							}
						}
					}
				}
			} else {
				@Pc(1605) int local1605 = arg7[9] << 4;
				@Pc(1611) int local1611 = arg7[10] << 4;
				@Pc(1617) int local1617 = arg7[11] << 4;
				@Pc(1623) int local1623 = arg7[12] << 4;
				@Pc(1629) int local1629 = arg7[13] << 4;
				@Pc(1635) int local1635 = arg7[14] << 4;
				if (Static6.aBoolean326) {
					@Pc(1659) int local1659 = arg7[0] * Static6.anInt4692 + arg7[3] * Static6.anInt4693 + arg7[6] * Static6.anInt4694 + 16384 >> 15;
					@Pc(1681) int local1681 = arg7[1] * Static6.anInt4692 + arg7[4] * Static6.anInt4693 + arg7[7] * Static6.anInt4694 + 16384 >> 15;
					@Pc(1703) int local1703 = arg7[2] * Static6.anInt4692 + arg7[5] * Static6.anInt4693 + arg7[8] * Static6.anInt4694 + 16384 >> 15;
					local1659 += local1623;
					local1681 += local1629;
					local1703 += local1635;
					Static6.anInt4692 = local1659;
					Static6.anInt4693 = local1681;
					Static6.anInt4694 = local1703;
					Static6.aBoolean326 = false;
				}
				@Pc(1729) int local1729 = arg2 << 15 >> 7;
				@Pc(1735) int local1735 = arg3 << 15 >> 7;
				@Pc(1741) int local1741 = arg4 << 15 >> 7;
				@Pc(1750) int local1750 = local1729 * -Static6.anInt4692 + 16384 >> 15;
				@Pc(1759) int local1759 = local1735 * -Static6.anInt4693 + 16384 >> 15;
				@Pc(1768) int local1768 = local1741 * -Static6.anInt4694 + 16384 >> 15;
				@Pc(1772) int local1772 = local1750 + Static6.anInt4692;
				@Pc(1776) int local1776 = local1759 + Static6.anInt4693;
				@Pc(1780) int local1780 = local1768 + Static6.anInt4694;
				@Pc(1783) int[] local1783 = new int[] { local1729 * arg7[0] + 16384 >> 15, local1729 * arg7[3] + 16384 >> 15, local1729 * arg7[6] + 16384 >> 15, local1735 * arg7[1] + 16384 >> 15, local1735 * arg7[4] + 16384 >> 15, local1735 * arg7[7] + 16384 >> 15, local1741 * arg7[2] + 16384 >> 15, local1741 * arg7[5] + 16384 >> 15, local1741 * arg7[8] + 16384 >> 15 };
				@Pc(1899) int local1899 = local1729 * local1623 + 16384 >> 15;
				@Pc(1907) int local1907 = local1735 * local1629 + 16384 >> 15;
				@Pc(1915) int local1915 = local1741 * local1635 + 16384 >> 15;
				local1899 += local1772;
				local1907 += local1776;
				local1915 += local1780;
				@Pc(1930) int[] local1930 = new int[9];
				for (@Pc(1932) int local1932 = 0; local1932 < 3; local1932++) {
					for (@Pc(1937) int local1937 = 0; local1937 < 3; local1937++) {
						@Pc(1942) int local1942 = 0;
						for (@Pc(1944) int local1944 = 0; local1944 < 3; local1944++) {
							local1942 += arg7[local1932 * 3 + local1944] * local1783[local1937 + local1944 * 3];
						}
						local1930[local1932 * 3 + local1937] = local1942 + 16384 >> 15;
					}
				}
				@Pc(2005) int local2005 = arg7[0] * local1899 + arg7[1] * local1907 + arg7[2] * local1915 + 16384 >> 15;
				@Pc(2027) int local2027 = arg7[3] * local1899 + arg7[4] * local1907 + arg7[5] * local1915 + 16384 >> 15;
				@Pc(2049) int local2049 = arg7[6] * local1899 + arg7[7] * local1907 + arg7[8] * local1915 + 16384 >> 15;
				local2005 += local1605;
				local2027 += local1611;
				local2049 += local1617;
				for (@Pc(2063) int local2063 = 0; local2063 < local2; local2063++) {
					@Pc(2070) int local2070 = arg1[local2063];
					if (local2070 < this.anIntArrayArray39.length) {
						@Pc(2080) int[] local2080 = this.anIntArrayArray39[local2070];
						for (@Pc(2082) int local2082 = 0; local2082 < local2080.length; local2082++) {
							@Pc(2090) int local2090 = local2080[local2082];
							if (this.aShortArray96 == null || (arg6 & this.aShortArray96[local2090]) != 0) {
								@Pc(2132) int local2132 = local1930[0] * this.anIntArray507[local2090] + local1930[1] * this.anIntArray504[local2090] + local1930[2] * this.anIntArray502[local2090] + 16384 >> 15;
								@Pc(2163) int local2163 = local1930[3] * this.anIntArray507[local2090] + local1930[4] * this.anIntArray504[local2090] + local1930[5] * this.anIntArray502[local2090] + 16384 >> 15;
								@Pc(2194) int local2194 = local1930[6] * this.anIntArray507[local2090] + local1930[7] * this.anIntArray504[local2090] + local1930[8] * this.anIntArray502[local2090] + 16384 >> 15;
								local2132 += local2005;
								local2163 += local2027;
								local2194 += local2049;
								this.anIntArray507[local2090] = local2132;
								this.anIntArray504[local2090] = local2163;
								this.anIntArray502[local2090] = local2194;
							}
						}
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray40 != null && this.aByteArray63 != null) {
				for (@Pc(2366) int local2366 = 0; local2366 < local2; local2366++) {
					@Pc(2373) int local2373 = arg1[local2366];
					if (local2373 < this.anIntArrayArray40.length) {
						@Pc(2383) int[] local2383 = this.anIntArrayArray40[local2373];
						for (@Pc(2385) int local2385 = 0; local2385 < local2383.length; local2385++) {
							@Pc(2393) int local2393 = local2383[local2385];
							if (this.aShortArray88 == null || (arg6 & this.aShortArray88[local2393]) != 0) {
								@Pc(2415) int local2415 = (this.aByteArray63[local2393] & 0xFF) + arg2 * 8;
								if (local2415 < 0) {
									local2415 = 0;
								} else if (local2415 > 255) {
									local2415 = 255;
								}
								this.aByteArray63[local2393] = (byte) local2415;
							}
						}
						if (local2383.length > 0) {
							this.aClass57_5.aBoolean103 = false;
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray40 != null) {
			for (@Pc(2451) int local2451 = 0; local2451 < local2; local2451++) {
				@Pc(2458) int local2458 = arg1[local2451];
				if (local2458 < this.anIntArrayArray40.length) {
					@Pc(2468) int[] local2468 = this.anIntArrayArray40[local2458];
					for (@Pc(2470) int local2470 = 0; local2470 < local2468.length; local2470++) {
						@Pc(2478) int local2478 = local2468[local2470];
						if (this.aShortArray88 == null || (arg6 & this.aShortArray88[local2478]) != 0) {
							@Pc(2496) int local2496 = this.aShortArray92[local2478] & 0xFFFF;
							@Pc(2502) int local2502 = local2496 >> 10 & 0x3F;
							@Pc(2508) int local2508 = local2496 >> 7 & 0x7;
							@Pc(2512) int local2512 = local2496 & 0x7F;
							local2502 = local2502 + arg2 & 0x3F;
							@Pc(2524) int local2524 = local2508 + arg3 / 4;
							if (local2524 < 0) {
								local2524 = 0;
							} else if (local2524 > 7) {
								local2524 = 7;
							}
							@Pc(2538) int local2538 = local2512 + arg4;
							if (local2538 < 0) {
								local2538 = 0;
							} else if (local2538 > 127) {
								local2538 = 127;
							}
							this.aShortArray92[local2478] = (short) (local2502 << 10 | local2524 << 7 | local2538);
						}
					}
					if (local2468.length > 0) {
						this.aClass57_5.aBoolean103 = false;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(I)V")
	public final void method3857() {
		if (this.aShortArray95 == null) {
			this.method3815(256);
			return;
		}
		@Pc(10) int local10 = Class109.anIntArray299[256];
		@Pc(14) int local14 = Class109.anIntArray298[256];
		for (@Pc(16) int local16 = 0; local16 < this.anInt4689; local16++) {
			@Pc(36) int local36 = this.anIntArray502[local16] * local10 + this.anIntArray507[local16] * local14 >> 16;
			this.anIntArray502[local16] = this.anIntArray502[local16] * local14 - this.anIntArray507[local16] * local10 >> 16;
			this.anIntArray507[local16] = local36;
		}
		for (@Pc(64) int local64 = 0; local64 < this.anInt4691; local64++) {
			@Pc(84) int local84 = this.aShortArray87[local64] * local10 + this.aShortArray95[local64] * local14 >> 16;
			this.aShortArray87[local64] = (short) (this.aShortArray87[local64] * local14 - this.aShortArray95[local64] * local10 >> 16);
			this.aShortArray95[local64] = (short) local84;
		}
		this.aClass15_1.aBoolean15 = false;
		this.aClass57_1.aBoolean103 = false;
		if (this.aClass57_2 != null) {
			this.aClass57_2.aBoolean103 = false;
		}
	}

	@OriginalMember(owner = "client!s", name = "t", descriptor = "()V")
	private void method3858() {
		@Pc(1) GL local1 = GlRenderer.gl;
		if (this.anInt4690 == 0) {
			return;
		}
		if (this.aByte15 != 0) {
			this.method3870(true, !this.aClass57_1.aBoolean103 && (this.aByte15 & 0x1) != 0, !this.aClass57_5.aBoolean103 && (this.aByte15 & 0x2) != 0, this.aClass57_2 != null && !this.aClass57_2.aBoolean103 && (this.aByte15 & 0x4) != 0, false);
		}
		this.method3870(false, !this.aClass57_1.aBoolean103, !this.aClass57_5.aBoolean103, this.aClass57_2 != null && !this.aClass57_2.aBoolean103, !this.aClass57_3.aBoolean103);
		if (!this.aClass57_4.aBoolean103) {
			this.method3851();
		}
		if (this.aByte16 != 0) {
			if ((this.aByte16 & 0x1) != 0) {
				this.anIntArray507 = null;
				this.anIntArray504 = null;
				this.anIntArray502 = null;
				this.aShortArray93 = null;
				this.anIntArray506 = null;
			}
			if ((this.aByte16 & 0x2) != 0) {
				this.aShortArray92 = null;
				this.aByteArray63 = null;
			}
			if ((this.aByte16 & 0x4) != 0) {
				this.aShortArray95 = null;
				this.aShortArray90 = null;
				this.aShortArray87 = null;
				this.aShortArray89 = null;
			}
			if ((this.aByte16 & 0x8) != 0) {
				this.aFloatArray55 = null;
				this.aFloatArray54 = null;
			}
			if ((this.aByte16 & 0x10) != 0) {
				this.aShortArray94 = null;
				this.aShortArray97 = null;
				this.aShortArray98 = null;
			}
			this.aByte16 = 0;
		}
		@Pc(172) GlBuffer local172 = null;
		if (this.aClass57_1.aClass111_1 != null) {
			this.aClass57_1.aClass111_1.bindArray();
			local172 = this.aClass57_1.aClass111_1;
			local1.glVertexPointer(3, GL.GL_FLOAT, this.aClass57_1.anInt1745, (long) this.aClass57_1.anInt1744);
		}
		if (this.aClass57_5.aClass111_1 != null) {
			if (local172 != this.aClass57_5.aClass111_1) {
				this.aClass57_5.aClass111_1.bindArray();
				local172 = this.aClass57_5.aClass111_1;
			}
			local1.glColorPointer(4, GL.GL_UNSIGNED_BYTE, this.aClass57_5.anInt1745, (long) this.aClass57_5.anInt1744);
		}
		if (Preferences.highDetailLighting && this.aClass57_2.aClass111_1 != null) {
			if (local172 != this.aClass57_2.aClass111_1) {
				this.aClass57_2.aClass111_1.bindArray();
				local172 = this.aClass57_2.aClass111_1;
			}
			local1.glNormalPointer(GL.GL_FLOAT, this.aClass57_2.anInt1745, (long) this.aClass57_2.anInt1744);
		}
		if (this.aClass57_3.aClass111_1 != null) {
			if (local172 != this.aClass57_3.aClass111_1) {
				this.aClass57_3.aClass111_1.bindArray();
				@Pc(269) GlBuffer local269 = this.aClass57_3.aClass111_1;
			}
			local1.glTexCoordPointer(2, GL.GL_FLOAT, this.aClass57_3.anInt1745, (long) this.aClass57_3.anInt1744);
		}
		if (this.aClass57_4.aClass111_1 != null) {
			this.aClass57_4.aClass111_1.bindElementArray();
		}
		if (this.aClass57_1.aClass111_1 == null || this.aClass57_5.aClass111_1 == null || Preferences.highDetailLighting && this.aClass57_2.aClass111_1 == null || this.aClass57_3.aClass111_1 == null) {
			if (GlRenderer.arbVboSupported) {
				local1.glBindBufferARB(GL.GL_ARRAY_BUFFER, 0);
			}
			if (this.aClass57_1.aClass111_1 == null) {
				this.aClass57_1.aByteBuffer1.position(this.aClass57_1.anInt1744);
				local1.glVertexPointer(3, GL.GL_FLOAT, this.aClass57_1.anInt1745, this.aClass57_1.aByteBuffer1);
			}
			if (this.aClass57_5.aClass111_1 == null) {
				this.aClass57_5.aByteBuffer1.position(this.aClass57_5.anInt1744);
				local1.glColorPointer(4, GL.GL_UNSIGNED_BYTE, this.aClass57_5.anInt1745, this.aClass57_5.aByteBuffer1);
			}
			if (Preferences.highDetailLighting && this.aClass57_2.aClass111_1 == null) {
				this.aClass57_2.aByteBuffer1.position(this.aClass57_2.anInt1744);
				local1.glNormalPointer(GL.GL_FLOAT, this.aClass57_2.anInt1745, this.aClass57_2.aByteBuffer1);
			}
			if (this.aClass57_3.aClass111_1 == null) {
				this.aClass57_3.aByteBuffer1.position(this.aClass57_3.anInt1744);
				local1.glTexCoordPointer(2, GL.GL_FLOAT, this.aClass57_3.anInt1745, this.aClass57_3.aByteBuffer1);
			}
		}
		if (this.aClass57_4.aClass111_1 == null && GlRenderer.arbVboSupported) {
			local1.glBindBufferARB(GL.GL_ELEMENT_ARRAY_BUFFER, 0);
		}
		@Pc(417) int local417 = this.anIntArray505.length - 1;
		for (@Pc(419) int local419 = 0; local419 < local417; local419++) {
			@Pc(427) int local427 = this.anIntArray505[local419];
			@Pc(434) int local434 = this.anIntArray505[local419 + 1];
			@Pc(439) short local439 = this.aShortArray91[local427];
			if (local439 == -1) {
				GlRenderer.setTextureId(-1);
				Static24.method2652(0, 0);
			} else {
				Static4.anInterface4_1.method451(local439 & 0xFFFF);
			}
			if (this.aClass57_4.aClass111_1 == null) {
				this.aClass57_4.aByteBuffer1.position(local427 * 12);
				local1.glDrawElements(GL.GL_TRIANGLES, (local434 - local427) * 3, GL.GL_UNSIGNED_INT, this.aClass57_4.aByteBuffer1);
			} else {
				local1.glDrawElements(GL.GL_TRIANGLES, (local434 - local427) * 3, GL.GL_UNSIGNED_INT, (long) (local427 * 12));
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "k", descriptor = "()I")
	@Override
	public final int method3838() {
		if (!this.aClass15_1.aBoolean15) {
			this.method3865();
		}
		return this.aClass15_1.aShort5;
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "()V")
	@Override
	protected final void method3819() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4689; local1++) {
			this.anIntArray507[local1] = this.anIntArray507[local1] + 7 >> 4;
			this.anIntArray504[local1] = this.anIntArray504[local1] + 7 >> 4;
			this.anIntArray502[local1] = this.anIntArray502[local1] + 7 >> 4;
		}
		this.aClass15_1.aBoolean15 = false;
		this.aClass57_1.aBoolean103 = false;
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(III)V")
	@Override
	public final void method3824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4689; local1++) {
			this.anIntArray507[local1] = this.anIntArray507[local1] * arg0 >> 7;
			this.anIntArray504[local1] = this.anIntArray504[local1] * arg1 >> 7;
			this.anIntArray502[local1] = this.anIntArray502[local1] * arg2 >> 7;
		}
		this.aClass15_1.aBoolean15 = false;
		this.aClass57_1.aBoolean103 = false;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IILclient!s;[[I[[IIII)V")
	public final void method3859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) GlModel arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!arg2.aClass15_1.aBoolean15) {
			arg2.method3865();
		}
		@Pc(11) int local11 = arg5 + arg2.aClass15_1.aShort4;
		@Pc(17) int local17 = arg5 + arg2.aClass15_1.aShort5;
		@Pc(23) int local23 = arg7 + arg2.aClass15_1.aShort3;
		@Pc(29) int local29 = arg7 + arg2.aClass15_1.aShort6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local11 < 0 || local17 + 128 >> 7 >= arg3.length || local23 < 0 || local29 + 128 >> 7 >= arg3[0].length)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg4 == null) {
				return;
			}
			if (local11 < 0 || local17 + 128 >> 7 >= arg4.length || local23 < 0 || local29 + 128 >> 7 >= arg4[0].length) {
				return;
			}
		} else {
			@Pc(100) int local100 = local11 >> 7;
			@Pc(106) int local106 = local17 + 127 >> 7;
			@Pc(110) int local110 = local23 >> 7;
			@Pc(116) int local116 = local29 + 127 >> 7;
			if (arg3[local100][local110] == arg6 && arg3[local106][local110] == arg6 && arg3[local100][local116] == arg6 && arg3[local106][local116] == arg6) {
				return;
			}
		}
		if (arg0 == 1) {
			for (@Pc(150) int local150 = 0; local150 < this.anInt4688; local150++) {
				@Pc(161) int local161 = this.anIntArray507[local150] + arg5;
				@Pc(168) int local168 = this.anIntArray502[local150] + arg7;
				@Pc(172) int local172 = local161 & 0x7F;
				@Pc(176) int local176 = local168 & 0x7F;
				@Pc(180) int local180 = local161 >> 7;
				@Pc(184) int local184 = local168 >> 7;
				@Pc(206) int local206 = arg3[local180][local184] * (128 - local172) + arg3[local180 + 1][local184] * local172 >> 7;
				@Pc(232) int local232 = arg3[local180][local184 + 1] * (128 - local172) + arg3[local180 + 1][local184 + 1] * local172 >> 7;
				@Pc(244) int local244 = local206 * (128 - local176) + local232 * local176 >> 7;
				this.anIntArray504[local150] = this.anIntArray504[local150] + local244 - arg6;
			}
		} else if (arg0 == 2) {
			@Pc(266) short local266 = arg2.aClass15_1.aShort8;
			for (@Pc(268) int local268 = 0; local268 < this.anInt4688; local268++) {
				@Pc(281) int local281 = (this.anIntArray504[local268] << 16) / local266;
				if (local281 < arg1) {
					@Pc(291) int local291 = this.anIntArray507[local268] + arg5;
					@Pc(298) int local298 = this.anIntArray502[local268] + arg7;
					@Pc(302) int local302 = local291 & 0x7F;
					@Pc(306) int local306 = local298 & 0x7F;
					@Pc(310) int local310 = local291 >> 7;
					@Pc(314) int local314 = local298 >> 7;
					@Pc(336) int local336 = arg3[local310][local314] * (128 - local302) + arg3[local310 + 1][local314] * local302 >> 7;
					@Pc(362) int local362 = arg3[local310][local314 + 1] * (128 - local302) + arg3[local310 + 1][local314 + 1] * local302 >> 7;
					@Pc(374) int local374 = local336 * (128 - local306) + local362 * local306 >> 7;
					this.anIntArray504[local268] += (local374 - arg6) * (arg1 - local281) / arg1;
				}
			}
		} else if (arg0 == 3) {
			@Pc(404) int local404 = (arg1 & 0xFF) * 4;
			@Pc(412) int local412 = (arg1 >> 8 & 0xFF) * 4;
			this.method3840(arg3, arg5, arg6, arg7, local404, local412);
		} else if (arg0 == 4) {
			@Pc(432) int local432 = arg2.aClass15_1.aShort2 - arg2.aClass15_1.aShort8;
			for (@Pc(434) int local434 = 0; local434 < this.anInt4688; local434++) {
				@Pc(445) int local445 = this.anIntArray507[local434] + arg5;
				@Pc(452) int local452 = this.anIntArray502[local434] + arg7;
				@Pc(456) int local456 = local445 & 0x7F;
				@Pc(460) int local460 = local452 & 0x7F;
				@Pc(464) int local464 = local445 >> 7;
				@Pc(468) int local468 = local452 >> 7;
				@Pc(490) int local490 = arg4[local464][local468] * (128 - local456) + arg4[local464 + 1][local468] * local456 >> 7;
				@Pc(516) int local516 = arg4[local464][local468 + 1] * (128 - local456) + arg4[local464 + 1][local468 + 1] * local456 >> 7;
				@Pc(528) int local528 = local490 * (128 - local460) + local516 * local460 >> 7;
				this.anIntArray504[local434] = this.anIntArray504[local434] + local528 + local432 - arg6;
			}
		} else if (arg0 == 5) {
			@Pc(556) int local556 = arg2.aClass15_1.aShort2 - arg2.aClass15_1.aShort8;
			for (@Pc(558) int local558 = 0; local558 < this.anInt4688; local558++) {
				@Pc(569) int local569 = this.anIntArray507[local558] + arg5;
				@Pc(576) int local576 = this.anIntArray502[local558] + arg7;
				@Pc(580) int local580 = local569 & 0x7F;
				@Pc(584) int local584 = local576 & 0x7F;
				@Pc(588) int local588 = local569 >> 7;
				@Pc(592) int local592 = local576 >> 7;
				@Pc(614) int local614 = arg3[local588][local592] * (128 - local580) + arg3[local588 + 1][local592] * local580 >> 7;
				@Pc(640) int local640 = arg3[local588][local592 + 1] * (128 - local580) + arg3[local588 + 1][local592 + 1] * local580 >> 7;
				@Pc(652) int local652 = local614 * (128 - local584) + local640 * local584 >> 7;
				local614 = arg4[local588][local592] * (128 - local580) + arg4[local588 + 1][local592] * local580 >> 7;
				local640 = arg4[local588][local592 + 1] * (128 - local580) + arg4[local588 + 1][local592 + 1] * local580 >> 7;
				@Pc(712) int local712 = local614 * (128 - local584) + local640 * local584 >> 7;
				@Pc(716) int local716 = local652 - local712;
				this.anIntArray504[local558] = ((this.anIntArray504[local558] << 8) / local556 * local716 >> 8) + local652 - arg6;
			}
		}
		this.aClass57_1.aBoolean103 = false;
		this.aClass15_1.aBoolean15 = false;
	}

	@OriginalMember(owner = "client!s", name = "f", descriptor = "(I)V")
	public final void method3861(@OriginalArg(0) int arg0) {
		this.aShort44 = (short) arg0;
		if (this.aClass57_2 != null) {
			this.aClass57_2.aBoolean103 = false;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!vc;IIIZ)V")
	@Override
	public final void method3807(@OriginalArg(0) Entity arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) GlModel local2 = (GlModel) arg0;
		if (this.anInt4690 == 0 || local2.anInt4690 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt4688;
		@Pc(15) int[] local15 = local2.anIntArray507;
		@Pc(18) int[] local18 = local2.anIntArray504;
		@Pc(21) int[] local21 = local2.anIntArray502;
		@Pc(24) short[] local24 = local2.aShortArray95;
		@Pc(27) short[] local27 = local2.aShortArray90;
		@Pc(30) short[] local30 = local2.aShortArray87;
		@Pc(33) short[] local33 = local2.aShortArray89;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) short[] local52;
		if (this.aClass152_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass152_1.aShortArray84;
			local44 = this.aClass152_1.aShortArray82;
			local48 = this.aClass152_1.aShortArray83;
			local52 = this.aClass152_1.aShortArray85;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) short[] local80;
		if (local2.aClass152_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass152_1.aShortArray84;
			local72 = local2.aClass152_1.aShortArray82;
			local76 = local2.aClass152_1.aShortArray83;
			local80 = local2.aClass152_1.aShortArray85;
		}
		@Pc(92) int[] local92 = local2.anIntArray506;
		@Pc(95) short[] local95 = local2.aShortArray93;
		if (!local2.aClass15_1.aBoolean15) {
			local2.method3865();
		}
		@Pc(105) short local105 = local2.aClass15_1.aShort8;
		@Pc(109) short local109 = local2.aClass15_1.aShort2;
		@Pc(113) short local113 = local2.aClass15_1.aShort4;
		@Pc(117) short local117 = local2.aClass15_1.aShort5;
		@Pc(121) short local121 = local2.aClass15_1.aShort3;
		@Pc(125) short local125 = local2.aClass15_1.aShort6;
		for (@Pc(127) int local127 = 0; local127 < this.anInt4688; local127++) {
			@Pc(138) int local138 = this.anIntArray504[local127] - arg2;
			if (local138 >= local105 && local138 <= local109) {
				@Pc(152) int local152 = this.anIntArray507[local127] - arg1;
				if (local152 >= local113 && local152 <= local117) {
					@Pc(166) int local166 = this.anIntArray502[local127] - arg3;
					if (local166 >= local121 && local166 <= local125) {
						@Pc(175) int local175 = -1;
						@Pc(180) int local180 = this.anIntArray506[local127];
						@Pc(187) int local187 = this.anIntArray506[local127 + 1];
						for (@Pc(189) int local189 = local180; local189 < local187; local189++) {
							local175 = this.aShortArray93[local189] - 1;
							if (local175 == -1 || this.aShortArray89[local175] != 0) {
								break;
							}
						}
						if (local175 != -1) {
							for (@Pc(217) int local217 = 0; local217 < local12; local217++) {
								if (local152 == local15[local217] && local166 == local21[local217] && local138 == local18[local217]) {
									@Pc(237) int local237 = -1;
									@Pc(241) int local241 = local92[local217];
									@Pc(247) int local247 = local92[local217 + 1];
									for (@Pc(249) int local249 = local241; local249 < local247; local249++) {
										local237 = local95[local249] - 1;
										if (local237 == -1 || local33[local237] != 0) {
											break;
										}
									}
									if (local237 != -1) {
										if (local40 == null) {
											this.aClass152_1 = new Class152();
											local40 = this.aClass152_1.aShortArray84 = Static15.method1396(this.aShortArray95);
											local44 = this.aClass152_1.aShortArray82 = Static15.method1396(this.aShortArray90);
											local48 = this.aClass152_1.aShortArray83 = Static15.method1396(this.aShortArray87);
											local52 = this.aClass152_1.aShortArray85 = Static15.method1396(this.aShortArray89);
										}
										if (local68 == null) {
											@Pc(325) Class152 local325 = local2.aClass152_1 = new Class152();
											local68 = local325.aShortArray84 = Static15.method1396(local24);
											local72 = local325.aShortArray82 = Static15.method1396(local27);
											local76 = local325.aShortArray83 = Static15.method1396(local30);
											local80 = local325.aShortArray85 = Static15.method1396(local33);
										}
										@Pc(358) short local358 = this.aShortArray95[local175];
										@Pc(363) short local363 = this.aShortArray90[local175];
										@Pc(368) short local368 = this.aShortArray87[local175];
										@Pc(373) short local373 = this.aShortArray89[local175];
										@Pc(377) int local377 = local92[local217];
										@Pc(383) int local383 = local92[local217 + 1];
										for (@Pc(385) int local385 = local377; local385 < local383; local385++) {
											@Pc(394) int local394 = local95[local385] - 1;
											if (local394 == -1) {
												break;
											}
											if (local80[local394] != 0) {
												local68[local394] += local358;
												local72[local394] += local363;
												local76[local394] += local368;
												local80[local394] += local373;
											}
										}
										@Pc(440) short local440 = local24[local237];
										@Pc(444) short local444 = local27[local237];
										@Pc(448) short local448 = local30[local237];
										@Pc(452) short local452 = local33[local237];
										@Pc(457) int local457 = this.anIntArray506[local127];
										@Pc(464) int local464 = this.anIntArray506[local127 + 1];
										for (@Pc(466) int local466 = local457; local466 < local464; local466++) {
											@Pc(476) int local476 = this.aShortArray93[local466] - 1;
											if (local476 == -1) {
												break;
											}
											if (local52[local476] != 0) {
												local40[local476] += local440;
												local44[local476] += local444;
												local48[local476] += local448;
												local52[local476] += local452;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "u", descriptor = "()V")
	public final void method3862() {
		if (this.aShortArray95 == null) {
			this.method3820();
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInt4689; local7++) {
			@Pc(16) int local16 = this.anIntArray507[local7];
			this.anIntArray507[local7] = this.anIntArray502[local7];
			this.anIntArray502[local7] = -local16;
		}
		for (@Pc(34) int local34 = 0; local34 < this.anInt4691; local34++) {
			@Pc(43) short local43 = this.aShortArray95[local34];
			this.aShortArray95[local34] = this.aShortArray87[local34];
			this.aShortArray87[local34] = (short) -local43;
		}
		this.aClass15_1.aBoolean15 = false;
		this.aClass57_1.aBoolean103 = false;
		if (this.aClass57_2 != null) {
			this.aClass57_2.aBoolean103 = false;
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(III)V")
	@Override
	public final void method3823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4689; local1++) {
			@Pc(7) int[] local7 = this.anIntArray507;
			local7[local1] += arg0;
			local7 = this.anIntArray504;
			local7[local1] += arg1;
			local7 = this.anIntArray502;
			local7[local1] += arg2;
		}
		this.aClass15_1.aBoolean15 = false;
		this.aClass57_1.aBoolean103 = false;
	}

	@OriginalMember(owner = "client!s", name = "h", descriptor = "()V")
	@Override
	public final void method3828() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4689; local1++) {
			this.anIntArray507[local1] = -this.anIntArray507[local1];
			this.anIntArray502[local1] = -this.anIntArray502[local1];
		}
		this.aClass15_1.aBoolean15 = false;
		this.aClass57_1.aBoolean103 = false;
	}

	@OriginalMember(owner = "client!s", name = "v", descriptor = "()V")
	private void method3865() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt4688; local17++) {
			@Pc(26) int local26 = this.anIntArray507[local17];
			@Pc(31) int local31 = this.anIntArray504[local17];
			@Pc(36) int local36 = this.anIntArray502[local17];
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
			@Pc(91) int local91 = local26 * local26 + local36 * local36 + local31 * local31;
			if (local91 > local15) {
				local15 = local91;
			}
		}
		this.aClass15_1.aShort4 = (short) local1;
		this.aClass15_1.aShort5 = (short) local7;
		this.aClass15_1.aShort8 = (short) local3;
		this.aClass15_1.aShort2 = (short) local9;
		this.aClass15_1.aShort3 = (short) local5;
		this.aClass15_1.aShort6 = (short) local11;
		this.aClass15_1.aShort7 = (short) (Math.sqrt((double) local13) + 0.99D);
		Math.sqrt((double) local15);
		this.aClass15_1.aBoolean15 = true;
	}

	@OriginalMember(owner = "client!s", name = "w", descriptor = "()V")
	public final void method3866() {
		if (this.anIntArray503 != null) {
			@Pc(5) int[] local5 = new int[256];
			@Pc(7) int local7 = 0;
			for (@Pc(9) int local9 = 0; local9 < this.anInt4689; local9++) {
				@Pc(20) int local20 = this.anIntArray503[local9] & 0xFF;
				@Pc(24) int local24 = local5[local20]++;
				if (local20 > local7) {
					local7 = local20;
				}
			}
			this.anIntArrayArray39 = new int[local7 + 1][];
			for (@Pc(42) int local42 = 0; local42 <= local7; local42++) {
				this.anIntArrayArray39[local42] = new int[local5[local42]];
				local5[local42] = 0;
			}
			@Pc(61) int local61 = 0;
			while (local61 < this.anInt4689) {
				@Pc(72) int local72 = this.anIntArray503[local61] & 0xFF;
				this.anIntArrayArray39[local72][local5[local72]++] = local61++;
			}
			this.anIntArray503 = null;
		}
		if (this.aByteArray62 == null) {
			return;
		}
		@Pc(97) int[] local97 = new int[256];
		@Pc(99) int local99 = 0;
		for (@Pc(101) int local101 = 0; local101 < this.anInt4690; local101++) {
			@Pc(112) int local112 = this.aByteArray62[local101] & 0xFF;
			@Pc(116) int local116 = local97[local112]++;
			if (local112 > local99) {
				local99 = local112;
			}
		}
		this.anIntArrayArray40 = new int[local99 + 1][];
		for (@Pc(134) int local134 = 0; local134 <= local99; local134++) {
			this.anIntArrayArray40[local134] = new int[local97[local134]];
			local97[local134] = 0;
		}
		@Pc(153) int local153 = 0;
		while (local153 < this.anInt4690) {
			@Pc(164) int local164 = this.aByteArray62[local153] & 0xFF;
			this.anIntArrayArray40[local164][local97[local164]++] = local153++;
		}
		this.aByteArray62 = null;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(SS)V")
	public final void method3867(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4690; local1++) {
			if (this.aShortArray92[local1] == arg0) {
				this.aShortArray92[local1] = arg1;
			}
		}
		this.aClass57_5.aBoolean103 = false;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method3868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!s", name = "x", descriptor = "()I")
	public final int method3869() {
		return this.aShort44;
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "()V")
	@Override
	public final void method3820() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4689; local1++) {
			@Pc(10) int local10 = this.anIntArray507[local1];
			this.anIntArray507[local1] = this.anIntArray502[local1];
			this.anIntArray502[local1] = -local10;
		}
		this.aClass15_1.aBoolean15 = false;
		this.aClass57_1.aBoolean103 = false;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZZZZZ)V")
	private void method3870(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		@Pc(1) int local1 = 0;
		if (arg1) {
			this.aClass57_1.anInt1744 = 0;
			local1 += 12;
		}
		if (arg2) {
			this.aClass57_5.anInt1744 = local1;
			local1 += 4;
		}
		if (arg3) {
			this.aClass57_2.anInt1744 = local1;
			local1 += 12;
		}
		if (arg4) {
			this.aClass57_3.anInt1744 = local1;
			local1 += 8;
		}
		if (local1 == 0) {
			return;
		}
		if (Static6.aClass4_Sub10_9.bytes.length < this.anInt4691 * local1) {
			Static6.aClass4_Sub10_9 = new Buffer((this.anInt4691 + 100) * local1);
		} else {
			Static6.aClass4_Sub10_9.position = 0;
		}
		if (arg1) {
			if (GlRenderer.bigEndian) {
				for (@Pc(60) int local60 = 0; local60 < this.anInt4688; local60++) {
					@Pc(71) int local71 = Float.floatToRawIntBits((float) this.anIntArray507[local60]);
					@Pc(78) int local78 = Float.floatToRawIntBits((float) this.anIntArray504[local60]);
					@Pc(85) int local85 = Float.floatToRawIntBits((float) this.anIntArray502[local60]);
					@Pc(90) int local90 = this.anIntArray506[local60];
					@Pc(97) int local97 = this.anIntArray506[local60 + 1];
					for (@Pc(99) int local99 = local90; local99 < local97; local99++) {
						@Pc(109) int local109 = this.aShortArray93[local99] - 1;
						if (local109 == -1) {
							break;
						}
						Static6.aClass4_Sub10_9.position = local109 * local1;
						Static6.aClass4_Sub10_9.writeInt(local71);
						Static6.aClass4_Sub10_9.writeInt(local78);
						Static6.aClass4_Sub10_9.writeInt(local85);
					}
				}
			} else {
				for (@Pc(137) int local137 = 0; local137 < this.anInt4688; local137++) {
					@Pc(148) int local148 = Float.floatToRawIntBits((float) this.anIntArray507[local137]);
					@Pc(155) int local155 = Float.floatToRawIntBits((float) this.anIntArray504[local137]);
					@Pc(162) int local162 = Float.floatToRawIntBits((float) this.anIntArray502[local137]);
					@Pc(167) int local167 = this.anIntArray506[local137];
					@Pc(174) int local174 = this.anIntArray506[local137 + 1];
					for (@Pc(176) int local176 = local167; local176 < local174; local176++) {
						@Pc(186) int local186 = this.aShortArray93[local176] - 1;
						if (local186 == -1) {
							break;
						}
						Static6.aClass4_Sub10_9.position = local186 * local1;
						Static6.aClass4_Sub10_9.writeIntLE(local148);
						Static6.aClass4_Sub10_9.writeIntLE(local155);
						Static6.aClass4_Sub10_9.writeIntLE(local162);
					}
				}
			}
		}
		if (arg2) {
			if (Preferences.highDetailLighting) {
				for (@Pc(645) int local645 = 0; local645 < this.anInt4690; local645++) {
					@Pc(665) int local665 = Static31.method3863(this.aShortArray92[local645], this.aShortArray91[local645], this.aShort43, this.aByteArray63[local645]);
					Static6.aClass4_Sub10_9.position = this.aClass57_5.anInt1744 + this.aShortArray94[local645] * local1;
					Static6.aClass4_Sub10_9.writeInt(local665);
					Static6.aClass4_Sub10_9.position = this.aClass57_5.anInt1744 + this.aShortArray97[local645] * local1;
					Static6.aClass4_Sub10_9.writeInt(local665);
					Static6.aClass4_Sub10_9.position = this.aClass57_5.anInt1744 + this.aShortArray98[local645] * local1;
					Static6.aClass4_Sub10_9.writeInt(local665);
				}
			} else {
				@Pc(220) int local220 = (int) Static4.aFloatArray40[0];
				@Pc(225) int local225 = (int) Static4.aFloatArray40[1];
				@Pc(230) int local230 = (int) Static4.aFloatArray40[2];
				@Pc(245) int local245 = (int) Math.sqrt((double) (local220 * local220 + local225 * local225 + local230 * local230));
				@Pc(252) int local252 = (int) ((float) this.aShort43 * 1.3F);
				@Pc(259) int local259 = this.aShort44 * local245 >> 8;
				for (@Pc(261) int local261 = 0; local261 < this.anInt4690; local261++) {
					@Pc(270) short local270 = this.aShortArray94[local261];
					@Pc(275) short local275 = this.aShortArray89[local270];
					@Pc(281) int local281;
					if (local275 < 0) {
						local281 = -local275 - 1;
					} else {
						if (local275 == 0) {
							local281 = local252 + (local220 * this.aShortArray95[local270] + local225 * this.aShortArray90[local270] + local230 * this.aShortArray87[local270]) / (local259 + local259 / 2);
						} else {
							local281 = local252 + (local220 * this.aShortArray95[local270] + local225 * this.aShortArray90[local270] + local230 * this.aShortArray87[local270]) / (local259 * local275);
						}
						if (local281 < 0) {
							local281 = 0;
						} else if (local281 > 16384) {
							local281 = 16384;
						}
						this.aShortArray89[local270] = (short) (-local281 - 1);
					}
					@Pc(364) short local364 = this.aShortArray97[local261];
					@Pc(369) short local369 = this.aShortArray89[local364];
					@Pc(375) int local375;
					if (local369 < 0) {
						local375 = -local369 - 1;
					} else {
						if (local369 == 0) {
							local375 = local252 + (local220 * this.aShortArray95[local364] + local225 * this.aShortArray90[local364] + local230 * this.aShortArray87[local364]) / (local259 + local259 / 2);
						} else {
							local375 = local252 + (local220 * this.aShortArray95[local364] + local225 * this.aShortArray90[local364] + local230 * this.aShortArray87[local364]) / (local259 * local369);
						}
						if (local375 < 0) {
							local375 = 0;
						} else if (local375 > 16384) {
							local375 = 16384;
						}
						this.aShortArray89[local364] = (short) (-local375 - 1);
					}
					@Pc(458) short local458 = this.aShortArray98[local261];
					@Pc(463) short local463 = this.aShortArray89[local458];
					@Pc(469) int local469;
					if (local463 < 0) {
						local469 = -local463 - 1;
					} else {
						if (local463 == 0) {
							local469 = local252 + (local220 * this.aShortArray95[local458] + local225 * this.aShortArray90[local458] + local230 * this.aShortArray87[local458]) / (local259 + local259 / 2);
						} else {
							local469 = local252 + (local220 * this.aShortArray95[local458] + local225 * this.aShortArray90[local458] + local230 * this.aShortArray87[local458]) / (local259 * local463);
						}
						if (local469 < 0) {
							local469 = 0;
						} else if (local469 > 16384) {
							local469 = 16384;
						}
						this.aShortArray89[local458] = (short) (-local469 - 1);
					}
					@Pc(562) int local562 = Static31.method3863(this.aShortArray92[local261], this.aShortArray91[local261], local281, this.aByteArray63[local261]);
					@Pc(577) int local577 = Static31.method3863(this.aShortArray92[local261], this.aShortArray91[local261], local375, this.aByteArray63[local261]);
					@Pc(592) int local592 = Static31.method3863(this.aShortArray92[local261], this.aShortArray91[local261], local469, this.aByteArray63[local261]);
					Static6.aClass4_Sub10_9.position = this.aClass57_5.anInt1744 + local270 * local1;
					Static6.aClass4_Sub10_9.writeInt(local562);
					Static6.aClass4_Sub10_9.position = this.aClass57_5.anInt1744 + local364 * local1;
					Static6.aClass4_Sub10_9.writeInt(local577);
					Static6.aClass4_Sub10_9.position = this.aClass57_5.anInt1744 + local458 * local1;
					Static6.aClass4_Sub10_9.writeInt(local592);
				}
				this.aShortArray95 = null;
				this.aShortArray90 = null;
				this.aShortArray87 = null;
			}
		}
		if (arg3) {
			@Pc(723) float local723 = 3.0F / (float) this.aShort44;
			@Pc(734) float local734 = 3.0F / (float) (this.aShort44 + this.aShort44 / 2);
			Static6.aClass4_Sub10_9.position = this.aClass57_2.anInt1744;
			if (GlRenderer.bigEndian) {
				for (@Pc(743) int local743 = 0; local743 < this.anInt4691; local743++) {
					@Pc(752) short local752 = this.aShortArray89[local743];
					if (local752 == 0) {
						Static6.aClass4_Sub10_9.writeFloat((float) this.aShortArray95[local743] * local734);
						Static6.aClass4_Sub10_9.writeFloat((float) this.aShortArray90[local743] * local734);
						Static6.aClass4_Sub10_9.writeFloat((float) this.aShortArray87[local743] * local734);
					} else {
						@Pc(790) float local790 = local723 / (float) local752;
						Static6.aClass4_Sub10_9.writeFloat((float) this.aShortArray95[local743] * local790);
						Static6.aClass4_Sub10_9.writeFloat((float) this.aShortArray90[local743] * local790);
						Static6.aClass4_Sub10_9.writeFloat((float) this.aShortArray87[local743] * local790);
					}
					@Pc(821) Buffer local821 = Static6.aClass4_Sub10_9;
					local821.position += local1 - 12;
				}
			} else {
				for (@Pc(833) int local833 = 0; local833 < this.anInt4691; local833++) {
					@Pc(842) short local842 = this.aShortArray89[local833];
					if (local842 == 0) {
						Static6.aClass4_Sub10_9.writeFloatLE((float) this.aShortArray95[local833] * local734);
						Static6.aClass4_Sub10_9.writeFloatLE((float) this.aShortArray90[local833] * local734);
						Static6.aClass4_Sub10_9.writeFloatLE((float) this.aShortArray87[local833] * local734);
					} else {
						@Pc(880) float local880 = local723 / (float) local842;
						Static6.aClass4_Sub10_9.writeFloatLE((float) this.aShortArray95[local833] * local880);
						Static6.aClass4_Sub10_9.writeFloatLE((float) this.aShortArray90[local833] * local880);
						Static6.aClass4_Sub10_9.writeFloatLE((float) this.aShortArray87[local833] * local880);
					}
					@Pc(911) Buffer local911 = Static6.aClass4_Sub10_9;
					local911.position += local1 - 12;
				}
			}
		}
		if (arg4) {
			Static6.aClass4_Sub10_9.position = this.aClass57_3.anInt1744;
			if (GlRenderer.bigEndian) {
				for (@Pc(931) int local931 = 0; local931 < this.anInt4691; local931++) {
					Static6.aClass4_Sub10_9.writeFloat(this.aFloatArray55[local931]);
					Static6.aClass4_Sub10_9.writeFloat(this.aFloatArray54[local931]);
					@Pc(950) Buffer local950 = Static6.aClass4_Sub10_9;
					local950.position += local1 - 8;
				}
			} else {
				for (@Pc(962) int local962 = 0; local962 < this.anInt4691; local962++) {
					Static6.aClass4_Sub10_9.writeFloatLE(this.aFloatArray55[local962]);
					Static6.aClass4_Sub10_9.writeFloatLE(this.aFloatArray54[local962]);
					@Pc(981) Buffer local981 = Static6.aClass4_Sub10_9;
					local981.position += local1 - 8;
				}
			}
		}
		Static6.aClass4_Sub10_9.position = local1 * this.anInt4691;
		if (arg0) {
			if (GlRenderer.aBoolean129) {
				@Pc(1007) ByteBuffer local1007 = ByteBuffer.wrap(Static6.aClass4_Sub10_9.bytes, 0, Static6.aClass4_Sub10_9.position);
				if (this.aClass111_7 == null) {
					this.aClass111_7 = new GlBuffer(true);
					this.aClass111_7.setArrayBuffer(local1007);
				} else {
					this.aClass111_7.updateArrayBuffer(local1007);
				}
				if (arg1) {
					this.aClass57_1.aBoolean103 = true;
					this.aClass57_1.aByteBuffer1 = null;
					this.aClass57_1.aClass111_1 = this.aClass111_7;
					this.aClass57_1.anInt1745 = local1;
				}
				if (arg2) {
					this.aClass57_5.aBoolean103 = true;
					this.aClass57_5.aByteBuffer1 = null;
					this.aClass57_5.aClass111_1 = this.aClass111_7;
					this.aClass57_5.anInt1745 = local1;
				}
				if (arg3) {
					this.aClass57_2.aBoolean103 = true;
					this.aClass57_2.aByteBuffer1 = null;
					this.aClass57_2.aClass111_1 = this.aClass111_7;
					this.aClass57_2.anInt1745 = local1;
				}
				if (arg4) {
					this.aClass57_3.aBoolean103 = true;
					this.aClass57_3.aByteBuffer1 = null;
					this.aClass57_3.aClass111_1 = this.aClass111_7;
					this.aClass57_3.anInt1745 = local1;
				}
			} else {
				if (Static6.aByteBuffer15 == null || Static6.aByteBuffer15.capacity() < Static6.aClass4_Sub10_9.position) {
					Static6.aByteBuffer15 = ByteBuffer.allocateDirect(Static6.aClass4_Sub10_9.position + local1 * 100);
				} else {
					Static6.aByteBuffer15.clear();
				}
				Static6.aByteBuffer15.put(Static6.aClass4_Sub10_9.bytes, 0, Static6.aClass4_Sub10_9.position);
				Static6.aByteBuffer15.flip();
				if (arg1) {
					this.aClass57_1.aBoolean103 = true;
					this.aClass57_1.aByteBuffer1 = Static6.aByteBuffer15;
					this.aClass57_1.aClass111_1 = null;
					this.aClass57_1.anInt1745 = local1;
				}
				if (arg2) {
					this.aClass57_5.aBoolean103 = true;
					this.aClass57_5.aByteBuffer1 = Static6.aByteBuffer15;
					this.aClass57_1.aClass111_1 = null;
					this.aClass57_5.anInt1745 = local1;
				}
				if (arg3) {
					this.aClass57_2.aBoolean103 = true;
					this.aClass57_2.aByteBuffer1 = Static6.aByteBuffer15;
					this.aClass57_2.aClass111_1 = null;
					this.aClass57_2.anInt1745 = local1;
				}
				if (arg4) {
					this.aClass57_3.aBoolean103 = true;
					this.aClass57_3.aByteBuffer1 = Static6.aByteBuffer15;
					this.aClass57_3.aClass111_1 = null;
					this.aClass57_3.anInt1745 = local1;
				}
			}
		} else if (GlRenderer.arbVboSupported) {
			@Pc(1211) GlBuffer local1211 = new GlBuffer();
			@Pc(1218) ByteBuffer local1218 = ByteBuffer.wrap(Static6.aClass4_Sub10_9.bytes, 0, Static6.aClass4_Sub10_9.position);
			local1211.setArrayBuffer(local1218);
			if (arg1) {
				this.aClass57_1.aBoolean103 = true;
				this.aClass57_1.aByteBuffer1 = null;
				this.aClass57_1.aClass111_1 = local1211;
				this.aClass57_1.anInt1745 = local1;
			}
			if (arg2) {
				this.aClass57_5.aBoolean103 = true;
				this.aClass57_5.aByteBuffer1 = null;
				this.aClass57_5.aClass111_1 = local1211;
				this.aClass57_5.anInt1745 = local1;
			}
			if (arg3) {
				this.aClass57_2.aBoolean103 = true;
				this.aClass57_2.aByteBuffer1 = null;
				this.aClass57_2.aClass111_1 = local1211;
				this.aClass57_2.anInt1745 = local1;
			}
			if (arg4) {
				this.aClass57_3.aBoolean103 = true;
				this.aClass57_3.aByteBuffer1 = null;
				this.aClass57_3.aClass111_1 = local1211;
				this.aClass57_3.anInt1745 = local1;
			}
		} else {
			@Pc(1298) ByteBuffer local1298 = ByteBuffer.allocateDirect(Static6.aClass4_Sub10_9.position);
			local1298.put(Static6.aClass4_Sub10_9.bytes, 0, Static6.aClass4_Sub10_9.position);
			local1298.flip();
			if (arg1) {
				this.aClass57_1.aBoolean103 = true;
				this.aClass57_1.aByteBuffer1 = local1298;
				this.aClass57_1.aClass111_1 = null;
				this.aClass57_1.anInt1745 = local1;
			}
			if (arg2) {
				this.aClass57_5.aBoolean103 = true;
				this.aClass57_5.aByteBuffer1 = local1298;
				this.aClass57_1.aClass111_1 = null;
				this.aClass57_5.anInt1745 = local1;
			}
			if (arg3) {
				this.aClass57_2.aBoolean103 = true;
				this.aClass57_2.aByteBuffer1 = local1298;
				this.aClass57_2.aClass111_1 = null;
				this.aClass57_2.anInt1745 = local1;
			}
			if (arg4) {
				this.aClass57_3.aBoolean103 = true;
				this.aClass57_3.aByteBuffer1 = local1298;
				this.aClass57_3.aClass111_1 = null;
				this.aClass57_3.anInt1745 = local1;
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(ZZZ)Lclient!vg;")
	@Override
	public final Model method3833(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		return this.method3873(arg0, arg1, arg2, Static6.aClass53_Sub4_Sub2_6, Static6.aClass53_Sub4_Sub2_5);
	}

	@OriginalMember(owner = "client!s", name = "m", descriptor = "()I")
	@Override
	public final int method3842() {
		if (!this.aClass15_1.aBoolean15) {
			this.method3865();
		}
		return this.aClass15_1.aShort2;
	}

	@OriginalMember(owner = "client!s", name = "g", descriptor = "()V")
	@Override
	public final void method3827() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4689; local1++) {
			@Pc(10) int local10 = this.anIntArray502[local1];
			this.anIntArray502[local1] = this.anIntArray507[local1];
			this.anIntArray507[local1] = -local10;
		}
		this.aClass15_1.aBoolean15 = false;
		this.aClass57_1.aBoolean103 = false;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
	@Override
	public final void method3817(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class109.anIntArray299[arg0];
		@Pc(7) int local7 = Class109.anIntArray298[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4689; local9++) {
			@Pc(29) int local29 = this.anIntArray504[local9] * local3 + this.anIntArray507[local9] * local7 >> 16;
			this.anIntArray504[local9] = this.anIntArray504[local9] * local7 - this.anIntArray507[local9] * local3 >> 16;
			this.anIntArray507[local9] = local29;
		}
		this.aClass15_1.aBoolean15 = false;
		this.aClass57_1.aBoolean103 = false;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZZZZZZZ)V")
	public final void method3872(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		if (this.aByte15 != 0) {
			throw new IllegalArgumentException();
		} else if (this.anInt4691 != 0) {
			if (arg5) {
				@Pc(26) boolean local26 = !this.aClass57_5.aBoolean103 && (arg1 || arg2 && !Preferences.highDetailLighting);
				this.method3870(false, !this.aClass57_1.aBoolean103 && arg0, local26, this.aClass57_2 != null && !this.aClass57_2.aBoolean103 && arg2, !this.aClass57_3.aBoolean103);
				if (!this.aClass57_4.aBoolean103 && arg3 && arg1) {
					this.method3851();
				}
			}
			if (arg0) {
				if (this.aClass57_1.aBoolean103) {
					if (!this.aClass15_1.aBoolean15) {
						this.method3865();
					}
					this.anIntArray507 = null;
					this.anIntArray504 = null;
					this.anIntArray502 = null;
					this.aShortArray93 = null;
					this.anIntArray506 = null;
				} else {
					this.aByte16 = (byte) (this.aByte16 | 0x1);
				}
			}
			if (arg1) {
				if (this.aClass57_5.aBoolean103) {
					this.aShortArray92 = null;
					this.aByteArray63 = null;
				} else {
					this.aByte16 = (byte) (this.aByte16 | 0x2);
				}
			}
			if (arg2 && Preferences.highDetailLighting) {
				if (this.aClass57_2.aBoolean103) {
					this.aShortArray95 = null;
					this.aShortArray90 = null;
					this.aShortArray87 = null;
					this.aShortArray89 = null;
				} else {
					this.aByte16 = (byte) (this.aByte16 | 0x4);
				}
			}
			if (this.aClass57_3.aBoolean103) {
				this.aFloatArray55 = null;
				this.aFloatArray54 = null;
			} else {
				this.aByte16 = (byte) (this.aByte16 | 0x8);
			}
			if (arg3 && arg1) {
				if (this.aClass57_4.aBoolean103 && this.aClass57_5.aBoolean103) {
					this.aShortArray94 = null;
					this.aShortArray97 = null;
					this.aShortArray98 = null;
				} else {
					this.aByte16 = (byte) (this.aByte16 | 0x10);
				}
			}
			if (arg4) {
				this.anIntArray503 = null;
				this.aByteArray62 = null;
				this.anIntArrayArray39 = null;
				this.anIntArrayArray40 = null;
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZZZ)Lclient!vg;")
	@Override
	public final Model method3831(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		return this.method3873(arg0, arg1, arg2, Static6.aClass53_Sub4_Sub2_2, Static6.aClass53_Sub4_Sub2_1);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZZZLclient!s;Lclient!s;)Lclient!vg;")
	private Model method3873(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) GlModel arg3, @OriginalArg(4) GlModel arg4) {
		arg3.anInt4689 = this.anInt4689;
		arg3.anInt4688 = this.anInt4688;
		arg3.anInt4691 = this.anInt4691;
		arg3.anInt4690 = this.anInt4690;
		arg3.aShort43 = this.aShort43;
		arg3.aShort44 = this.aShort44;
		arg3.aByte15 = (byte) ((arg0 && arg1 ? 0 : 2) | 0x1 | (arg2 ? 0 : 4));
		if (arg3.anIntArray507 == null || arg3.anIntArray507.length < this.anInt4689) {
			arg3.anIntArray507 = new int[this.anInt4689 + 100];
			arg3.anIntArray504 = new int[this.anInt4689 + 100];
			arg3.anIntArray502 = new int[this.anInt4689 + 100];
		}
		for (@Pc(73) int local73 = 0; local73 < this.anInt4689; local73++) {
			arg3.anIntArray507[local73] = this.anIntArray507[local73];
			arg3.anIntArray504[local73] = this.anIntArray504[local73];
			arg3.anIntArray502[local73] = this.anIntArray502[local73];
		}
		if (arg3.aClass57_1 == null) {
			arg3.aClass57_1 = new Class57();
		}
		arg3.aClass57_1.aBoolean103 = false;
		if (arg3.aClass15_1 == null) {
			arg3.aClass15_1 = new Class15();
		}
		arg3.aClass15_1.aBoolean15 = false;
		if (arg0) {
			arg3.aByteArray63 = this.aByteArray63;
		} else {
			if (arg4.aByteArray63 == null || arg4.aByteArray63.length < this.anInt4690) {
				arg4.aByteArray63 = new byte[this.anInt4690 + 100];
			}
			arg3.aByteArray63 = arg4.aByteArray63;
			for (@Pc(156) int local156 = 0; local156 < this.anInt4690; local156++) {
				arg3.aByteArray63[local156] = this.aByteArray63[local156];
			}
		}
		if (arg1) {
			arg3.aShortArray92 = this.aShortArray92;
		} else {
			if (arg4.aShortArray92 == null || arg4.aShortArray92.length < this.anInt4690) {
				arg4.aShortArray92 = new short[this.anInt4690 + 100];
			}
			arg3.aShortArray92 = arg4.aShortArray92;
			for (@Pc(199) int local199 = 0; local199 < this.anInt4690; local199++) {
				arg3.aShortArray92[local199] = this.aShortArray92[local199];
			}
		}
		if (arg0 && arg1) {
			arg3.aClass57_5 = this.aClass57_5;
		} else {
			if (arg4.aClass57_5 == null) {
				arg4.aClass57_5 = new Class57();
			}
			arg3.aClass57_5 = arg4.aClass57_5;
			arg3.aClass57_5.aBoolean103 = false;
		}
		if (arg2 || this.aShortArray95 == null) {
			arg3.aShortArray95 = this.aShortArray95;
			arg3.aShortArray90 = this.aShortArray90;
			arg3.aShortArray87 = this.aShortArray87;
			arg3.aShortArray89 = this.aShortArray89;
			arg3.aClass57_2 = this.aClass57_2;
		} else {
			if (arg4.aShortArray95 == null || arg4.aShortArray95.length < this.anInt4691) {
				arg4.aShortArray95 = new short[this.anInt4691 + 100];
				arg4.aShortArray90 = new short[this.anInt4691 + 100];
				arg4.aShortArray87 = new short[this.anInt4691 + 100];
				arg4.aShortArray89 = new short[this.anInt4691 + 100];
			}
			arg3.aShortArray95 = arg4.aShortArray95;
			arg3.aShortArray90 = arg4.aShortArray90;
			arg3.aShortArray87 = arg4.aShortArray87;
			arg3.aShortArray89 = arg4.aShortArray89;
			for (@Pc(319) int local319 = 0; local319 < this.anInt4691; local319++) {
				arg3.aShortArray95[local319] = this.aShortArray95[local319];
				arg3.aShortArray90[local319] = this.aShortArray90[local319];
				arg3.aShortArray87[local319] = this.aShortArray87[local319];
				arg3.aShortArray89[local319] = this.aShortArray89[local319];
			}
			if (Preferences.highDetailLighting) {
				if (arg4.aClass57_2 == null) {
					arg4.aClass57_2 = new Class57();
				}
				arg3.aClass57_2 = arg4.aClass57_2;
				arg3.aClass57_2.aBoolean103 = false;
			} else {
				arg3.aClass57_2 = null;
			}
		}
		arg3.aFloatArray55 = this.aFloatArray55;
		arg3.aFloatArray54 = this.aFloatArray54;
		arg3.anIntArray503 = this.anIntArray503;
		arg3.anIntArrayArray39 = this.anIntArrayArray39;
		arg3.aShortArray94 = this.aShortArray94;
		arg3.aShortArray97 = this.aShortArray97;
		arg3.aShortArray98 = this.aShortArray98;
		arg3.aShortArray91 = this.aShortArray91;
		arg3.aByteArray62 = this.aByteArray62;
		arg3.anIntArrayArray40 = this.anIntArrayArray40;
		arg3.aClass57_3 = this.aClass57_3;
		arg3.aClass57_4 = this.aClass57_4;
		arg3.anIntArray505 = this.anIntArray505;
		arg3.aShortArray93 = this.aShortArray93;
		arg3.anIntArray506 = this.anIntArray506;
		arg3.aBoolean324 = this.aBoolean324;
		arg3.aShortArray96 = this.aShortArray96;
		arg3.aShortArray88 = this.aShortArray88;
		arg3.aClass158Array3 = this.aClass158Array3;
		arg3.aClass167Array3 = this.aClass167Array3;
		return arg3;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIII)V")
	@Override
	protected final void method3834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == 0) {
			@Pc(3) int local3 = 0;
			Static6.anInt4692 = 0;
			Static6.anInt4693 = 0;
			Static6.anInt4694 = 0;
			for (@Pc(11) int local11 = 0; local11 < this.anInt4689; local11++) {
				Static6.anInt4692 += this.anIntArray507[local11];
				Static6.anInt4693 += this.anIntArray504[local11];
				Static6.anInt4694 += this.anIntArray502[local11];
				local3++;
			}
			if (local3 > 0) {
				Static6.anInt4692 = Static6.anInt4692 / local3 + arg1;
				Static6.anInt4693 = Static6.anInt4693 / local3 + arg2;
				Static6.anInt4694 = Static6.anInt4694 / local3 + arg3;
			} else {
				Static6.anInt4692 = arg1;
				Static6.anInt4693 = arg2;
				Static6.anInt4694 = arg3;
			}
		} else if (arg0 == 1) {
			for (@Pc(72) int local72 = 0; local72 < this.anInt4689; local72++) {
				@Pc(78) int[] local78 = this.anIntArray507;
				local78[local72] += arg1;
				local78 = this.anIntArray504;
				local78[local72] += arg2;
				local78 = this.anIntArray502;
				local78[local72] += arg3;
			}
		} else if (arg0 == 2) {
			for (@Pc(108) int local108 = 0; local108 < this.anInt4689; local108++) {
				@Pc(114) int[] local114 = this.anIntArray507;
				local114[local108] -= Static6.anInt4692;
				local114 = this.anIntArray504;
				local114[local108] -= Static6.anInt4693;
				local114 = this.anIntArray502;
				local114[local108] -= Static6.anInt4694;
				if (arg3 != 0) {
					@Pc(142) int local142 = Class109.anIntArray299[arg3];
					@Pc(146) int local146 = Class109.anIntArray298[arg3];
					@Pc(164) int local164 = this.anIntArray504[local108] * local142 + this.anIntArray507[local108] * local146 + 32767 >> 16;
					this.anIntArray504[local108] = this.anIntArray504[local108] * local146 + 32767 - this.anIntArray507[local108] * local142 >> 16;
					this.anIntArray507[local108] = local164;
				}
				if (arg1 != 0) {
					@Pc(196) int local196 = Class109.anIntArray299[arg1];
					@Pc(200) int local200 = Class109.anIntArray298[arg1];
					@Pc(218) int local218 = this.anIntArray504[local108] * local200 + 32767 - this.anIntArray502[local108] * local196 >> 16;
					this.anIntArray502[local108] = this.anIntArray504[local108] * local196 + this.anIntArray502[local108] * local200 + 32767 >> 16;
					this.anIntArray504[local108] = local218;
				}
				if (arg2 != 0) {
					@Pc(250) int local250 = Class109.anIntArray299[arg2];
					@Pc(254) int local254 = Class109.anIntArray298[arg2];
					@Pc(272) int local272 = this.anIntArray502[local108] * local250 + this.anIntArray507[local108] * local254 + 32767 >> 16;
					this.anIntArray502[local108] = this.anIntArray502[local108] * local254 + 32767 - this.anIntArray507[local108] * local250 >> 16;
					this.anIntArray507[local108] = local272;
				}
				@Pc(300) int[] local300 = this.anIntArray507;
				local300[local108] += Static6.anInt4692;
				local300 = this.anIntArray504;
				local300[local108] += Static6.anInt4693;
				local300 = this.anIntArray502;
				local300[local108] += Static6.anInt4694;
			}
		} else if (arg0 == 3) {
			for (@Pc(330) int local330 = 0; local330 < this.anInt4689; local330++) {
				@Pc(336) int[] local336 = this.anIntArray507;
				local336[local330] -= Static6.anInt4692;
				local336 = this.anIntArray504;
				local336[local330] -= Static6.anInt4693;
				local336 = this.anIntArray502;
				local336[local330] -= Static6.anInt4694;
				this.anIntArray507[local330] = this.anIntArray507[local330] * arg1 / 128;
				this.anIntArray504[local330] = this.anIntArray504[local330] * arg2 / 128;
				this.anIntArray502[local330] = this.anIntArray502[local330] * arg3 / 128;
				local336 = this.anIntArray507;
				local336[local330] += Static6.anInt4692;
				local336 = this.anIntArray504;
				local336[local330] += Static6.anInt4693;
				local336 = this.anIntArray502;
				local336[local330] += Static6.anInt4694;
			}
		} else if (arg0 == 5) {
			for (@Pc(426) int local426 = 0; local426 < this.anInt4690; local426++) {
				@Pc(441) int local441 = (this.aByteArray63[local426] & 0xFF) + arg1 * 8;
				if (local441 < 0) {
					local441 = 0;
				} else if (local441 > 255) {
					local441 = 255;
				}
				this.aByteArray63[local426] = (byte) local441;
			}
			this.aClass57_5.aBoolean103 = false;
		} else if (arg0 == 7) {
			for (@Pc(469) int local469 = 0; local469 < this.anInt4690; local469++) {
				@Pc(480) int local480 = this.aShortArray92[local469] & 0xFFFF;
				@Pc(486) int local486 = local480 >> 10 & 0x3F;
				@Pc(492) int local492 = local480 >> 7 & 0x7;
				@Pc(496) int local496 = local480 & 0x7F;
				local486 = local486 + arg1 & 0x3F;
				@Pc(508) int local508 = local492 + arg2 / 4;
				if (local508 < 0) {
					local508 = 0;
				} else if (local508 > 7) {
					local508 = 7;
				}
				@Pc(522) int local522 = local496 + arg3;
				if (local522 < 0) {
					local522 = 0;
				} else if (local522 > 127) {
					local522 = 127;
				}
				this.aShortArray92[local469] = (short) (local486 << 10 | local508 << 7 | local522);
			}
			this.aClass57_5.aBoolean103 = false;
		}
	}
}
