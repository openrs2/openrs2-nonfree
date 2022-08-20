import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Camera {
	@OriginalMember(owner = "client!jj", name = "bb", descriptor = "[Z")
	public static final boolean[] shakeEnabled = new boolean[5];

	@OriginalMember(owner = "client!vb", name = "S", descriptor = "[I")
	public static final int[] anIntArray625 = new int[5];

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "[I")
	public static final int[] anIntArray626 = new int[5];

	@OriginalMember(owner = "client!af", name = "A", descriptor = "[I")
	public static final int[] anIntArray13 = new int[5];

	@OriginalMember(owner = "client!af", name = "D", descriptor = "[I")
	public static final int[] anIntArray14 = new int[5];

	@OriginalMember(owner = "client!c", name = "L", descriptor = "[[[I")
	public static final int[][][] splines = new int[2][][];

	@OriginalMember(owner = "client!og", name = "db", descriptor = "F")
	public static float pitch = 128.0F;

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "F")
	public static float yaw = 0.0F;
	@OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
	public static int yawOffset = 0;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
	public static void reset() {
		for (@Pc(7) int index = 0; index < 5; index++) {
			shakeEnabled[index] = false;
		}
		Static5.anInt5195 = -1;
		Static6.anInt4838 = 0;
		Static1.anInt212 = 0;
		Static4.anInt3024 = -1;
		Static1.anInt772 = 1;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V")
	public static void smoothReset() {
		for (@Pc(3) int index = 0; index < 5; index++) {
			shakeEnabled[index] = false;
		}
		Static5.anInt5195 = -1;
		Static1.anInt772 = 5;
		Static6.anInt4838 = 0;
		Static1.anInt212 = 0;
		Static4.anInt3024 = -1;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIZII)V")
	public static void moveTo(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		Static5.anInt4165 = arg5;
		Static4.anInt2977 = arg1;
		Static5.anInt3490 = arg2;
		Static4.anInt3131 = arg3;
		Static7.anInt5236 = arg0;
		if (arg4 && Static5.anInt3490 >= 100) {
			Static3.anInt2519 = Static4.anInt2977 * 128 + 64;
			Static7.anInt5678 = Static5.anInt4165 * 128 + 64;
			Static2.anInt1931 = SceneGraph.getTileHeight(Player.level, Static3.anInt2519, Static7.anInt5678) - Static4.anInt3131;
		}
		Static1.anInt772 = 2;
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(IIIIII)V")
	public static void lookAt(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static3.anInt2497 = arg3;
		Static5.anInt3572 = arg0;
		Static1.anInt212 = arg4;
		Static6.anInt4838 = arg1;
		Static4.anInt3302 = arg2;
		if (Static1.anInt212 >= 100) {
			@Pc(31) int local31 = Static4.anInt3302 * 128 + 64;
			@Pc(37) int local37 = Static3.anInt2497 * 128 + 64;
			@Pc(46) int local46 = SceneGraph.getTileHeight(Player.level, local31, local37) - Static5.anInt3572;
			@Pc(50) int local50 = local31 - Static3.anInt2519;
			@Pc(55) int local55 = local46 - Static2.anInt1931;
			@Pc(60) int local60 = local37 - Static7.anInt5678;
			@Pc(71) int local71 = (int) Math.sqrt((double) (local60 * local60 + local50 * local50));
			Static5.anInt4066 = (int) (Math.atan2((double) local55, (double) local71) * 325.949D) & 0x7FF;
			Static5.anInt3656 = (int) (Math.atan2((double) local50, (double) local60) * -325.949D) & 0x7FF;
			if (Static5.anInt4066 < 128) {
				Static5.anInt4066 = 128;
			}
			if (Static5.anInt4066 > 383) {
				Static5.anInt4066 = 383;
			}
		}
		Static1.anInt772 = 2;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IBI)V")
	public static void forceAngle(@OriginalArg(2) int yaw, @OriginalArg(0) int pitch) {
		if (Static1.anInt772 == 2) {
			Static5.anInt4066 = pitch;
			Static5.anInt3656 = yaw;
		}
		Camera.yaw = yaw;
		Camera.pitch = pitch;
		Static28.method3252();
		Static5.aBoolean248 = true;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	public static void incY() {
		if (Static6.aBoolean330) {
			return;
		}
		Static5.aBoolean248 = true;
		if (Preferences.aBoolean293) {
			pitch = (int) pitch + 47 & 0xFFFFFFF0;
		} else {
			Static1.aFloat20 += (12.0F - Static1.aFloat20) / 2.0F;
		}
		Static6.aBoolean330 = true;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
	public static void decY() {
		if (Static6.aBoolean330) {
			return;
		}
		Static6.aBoolean330 = true;
		Static5.aBoolean248 = true;
		if (Preferences.aBoolean293) {
			pitch = (int) pitch - 17 & 0xFFFFFFF0;
		} else {
			Static1.aFloat20 += (-Static1.aFloat20 - 12.0F) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(B)V")
	public static void incX() {
		if (Static7.aBoolean401) {
			return;
		}
		if (Preferences.aBoolean293) {
			yaw = (int) yaw + 191 & 0xFFFFFF80;
		} else {
			Static4.aFloat79 += (24.0F - Static4.aFloat79) / 2.0F;
		}
		Static7.aBoolean401 = true;
		Static5.aBoolean248 = true;
	}

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "(I)V")
	public static void decX() {
		if (Static7.aBoolean401) {
			return;
		}
		Static5.aBoolean248 = true;
		if (Preferences.aBoolean293) {
			yaw = (int) yaw - 65 & 0xFFFFFF80;
		} else {
			Static4.aFloat79 += (-Static4.aFloat79 - 24.0F) / 2.0F;
		}
		Static7.aBoolean401 = true;
	}

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "(B)V")
	public static void method1496() {
		if (Static5.anInt5195 == -1 || Static4.anInt3024 == -1) {
			return;
		}
		@Pc(24) int local24 = ((Static2.anInt1165 - Static7.anInt5946) * Static2.anInt915 >> 16) + Static7.anInt5946;
		@Pc(27) float[] local27 = new float[3];
		Static2.anInt915 += local24;
		if (Static2.anInt915 < 65535) {
			Static1.aBoolean35 = false;
			Static7.aBoolean388 = false;
		} else {
			Static2.anInt915 = 65535;
			if (Static7.aBoolean388) {
				Static1.aBoolean35 = false;
			} else {
				Static1.aBoolean35 = true;
			}
			Static7.aBoolean388 = true;
		}
		@Pc(65) float local65 = (float) Static2.anInt915 / 65535.0F;
		@Pc(69) int local69 = Static6.anInt4384 * 2;
		for (@Pc(71) int local71 = 0; local71 < 3; local71++) {
			@Pc(86) int local86 = splines[Static5.anInt5195][local69][local71] * 3;
			@Pc(98) int local98 = splines[Static5.anInt5195][local69 + 1][local71] * 3;
			@Pc(131) int local131 = (splines[Static5.anInt5195][local69 + 2][local71] + splines[Static5.anInt5195][local69 + 2][local71] - splines[Static5.anInt5195][local69 + 3][local71]) * 3;
			@Pc(139) int local139 = splines[Static5.anInt5195][local69][local71];
			@Pc(143) int local143 = local98 - local86;
			@Pc(153) int local153 = local86 + local131 - local98 * 2;
			@Pc(170) int local170 = splines[Static5.anInt5195][local69 + 2][local71] + local98 - local131 - local139;
			local27[local71] = (float) local139 + ((float) local143 + ((float) local153 + (float) local170 * local65) * local65) * local65;
		}
		Static7.anInt5678 = (int) local27[2] - Static7.originZ * 128;
		Static2.anInt1931 = (int) local27[1] * -1;
		@Pc(213) float[] local213 = new float[3];
		Static3.anInt2519 = (int) local27[0] - Static5.originX * 128;
		@Pc(227) int local227 = Static1.anInt126 * 2;
		for (@Pc(229) int local229 = 0; local229 < 3; local229++) {
			@Pc(244) int local244 = splines[Static4.anInt3024][local227][local229] * 3;
			@Pc(256) int local256 = splines[Static4.anInt3024][local227 + 1][local229] * 3;
			@Pc(289) int local289 = (splines[Static4.anInt3024][local227 + 2][local229] + splines[Static4.anInt3024][local227 + 2][local229] - splines[Static4.anInt3024][local227 + 3][local229]) * 3;
			@Pc(297) int local297 = splines[Static4.anInt3024][local227][local229];
			@Pc(302) int local302 = local256 - local244;
			@Pc(320) int local320 = local256 + splines[Static4.anInt3024][local227 + 2][local229] - local289 - local297;
			@Pc(329) int local329 = local289 + local244 - local256 * 2;
			local213[local229] = local65 * ((local65 * (float) local320 + (float) local329) * local65 + (float) local302) + (float) local297;
		}
		@Pc(361) float local361 = local213[0] - local27[0];
		@Pc(369) float local369 = local213[2] - local27[2];
		@Pc(379) float local379 = (local213[1] - local27[1]) * -1.0F;
		@Pc(389) double local389 = Math.sqrt((double) (local361 * local361 + local369 * local369));
		Static1.aFloat15 = (float) Math.atan2((double) local379, local389);
		Static7.aFloat154 = -((float) Math.atan2((double) local361, (double) local369));
		Static5.anInt3656 = (int) ((double) Static7.aFloat154 * 325.949D) & 0x7FF;
		Static5.anInt4066 = (int) ((double) Static1.aFloat15 * 325.949D) & 0x7FF;
	}
}
