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
	public static void forceAngle(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static1.anInt772 == 2) {
			Static5.anInt4066 = arg0;
			Static5.anInt3656 = arg1;
		}
		Static5.aFloat97 = arg1;
		Static5.aFloat147 = arg0;
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
			Static5.aFloat147 = (int) Static5.aFloat147 + 47 & 0xFFFFFFF0;
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
			Static5.aFloat147 = (int) Static5.aFloat147 - 17 & 0xFFFFFFF0;
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
			Static5.aFloat97 = (int) Static5.aFloat97 + 191 & 0xFFFFFF80;
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
			Static5.aFloat97 = (int) Static5.aFloat97 - 65 & 0xFFFFFF80;
		} else {
			Static4.aFloat79 += (-Static4.aFloat79 - 24.0F) / 2.0F;
		}
		Static7.aBoolean401 = true;
	}
}
