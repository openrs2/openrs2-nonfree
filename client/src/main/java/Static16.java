import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

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
			@Pc(86) int local86 = Static1.anIntArrayArrayArray1[Static5.anInt5195][local69][local71] * 3;
			@Pc(98) int local98 = Static1.anIntArrayArrayArray1[Static5.anInt5195][local69 + 1][local71] * 3;
			@Pc(131) int local131 = (Static1.anIntArrayArrayArray1[Static5.anInt5195][local69 + 2][local71] + Static1.anIntArrayArrayArray1[Static5.anInt5195][local69 + 2][local71] - Static1.anIntArrayArrayArray1[Static5.anInt5195][local69 + 3][local71]) * 3;
			@Pc(139) int local139 = Static1.anIntArrayArrayArray1[Static5.anInt5195][local69][local71];
			@Pc(143) int local143 = local98 - local86;
			@Pc(153) int local153 = local86 + local131 - local98 * 2;
			@Pc(170) int local170 = Static1.anIntArrayArrayArray1[Static5.anInt5195][local69 + 2][local71] + local98 - local131 - local139;
			local27[local71] = (float) local139 + ((float) local143 + ((float) local153 + (float) local170 * local65) * local65) * local65;
		}
		Static7.anInt5678 = (int) local27[2] - Static7.originZ * 128;
		Static2.anInt1931 = (int) local27[1] * -1;
		@Pc(213) float[] local213 = new float[3];
		Static3.anInt2519 = (int) local27[0] - Static5.originX * 128;
		@Pc(227) int local227 = Static1.anInt126 * 2;
		for (@Pc(229) int local229 = 0; local229 < 3; local229++) {
			@Pc(244) int local244 = Static1.anIntArrayArrayArray1[Static4.anInt3024][local227][local229] * 3;
			@Pc(256) int local256 = Static1.anIntArrayArrayArray1[Static4.anInt3024][local227 + 1][local229] * 3;
			@Pc(289) int local289 = (Static1.anIntArrayArrayArray1[Static4.anInt3024][local227 + 2][local229] + Static1.anIntArrayArrayArray1[Static4.anInt3024][local227 + 2][local229] - Static1.anIntArrayArrayArray1[Static4.anInt3024][local227 + 3][local229]) * 3;
			@Pc(297) int local297 = Static1.anIntArrayArrayArray1[Static4.anInt3024][local227][local229];
			@Pc(302) int local302 = local256 - local244;
			@Pc(320) int local320 = local256 + Static1.anIntArrayArrayArray1[Static4.anInt3024][local227 + 2][local229] - local289 - local297;
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

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V")
	private static void method1498() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) int local13 = 0; local13 < 104; local13++) {
			for (@Pc(18) int local18 = 0; local18 < 104; local18++) {
				if (Static9.method279(local7, local13, true, local18, SceneGraph.tiles)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)[F")
	public static float[] method1553(@OriginalArg(1) int arg0) {
		@Pc(7) float local7 = Static25.method2773() + Static25.method2776();
		@Pc(9) int local9 = Static25.method2778();
		@Pc(18) float local18 = (float) (local9 >> 16 & 0xFF) / 255.0F;
		@Pc(31) float local31 = (float) (local9 & 0xFF) / 255.0F;
		Static4.aFloatArray64[3] = 1.0F;
		@Pc(44) float local44 = (float) (local9 >> 8 & 0xFF) / 255.0F;
		@Pc(46) float local46 = 0.58823526F;
		Static4.aFloatArray64[0] = local7 * local18 * ((float) (arg0 >> 16 & 0xFF) / 255.0F) * local46;
		Static4.aFloatArray64[2] = local31 * ((float) (arg0 & 0xFF) / 255.0F) * local46 * local7;
		Static4.aFloatArray64[1] = local44 * ((float) (arg0 >> 8 & 0xFF) / 255.0F) * local46 * local7;
		return Static4.aFloatArray64;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	public static void method1556() {
		Sprites.scrollbar = null;
		Fonts.p11FullSoftware = null;
		Sprites.nameIcons = null;
		Sprites.mapDots = null;
		Sprites.cross = null;
		Fonts.p12Full = null;
		Sprites.hintHeadIcons = null;
		Sprites.headIconsPrayer = null;
		Fonts.b12Full = null;
		Sprites.headIconsPk = null;
		Fonts.p11Full = null;
		Sprites.compass = null;
		Sprites.hitBarDefault = null;
		Sprites.hintMapEdge = null;
		Sprites.mapFlag = null;
		Sprites.hintMapMarkers = null;
		Sprites.hitMarks = null;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
	public static void method1557() {
		Static10.method384(false);
		System.gc();
		Static9.method233(25);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIII)V")
	public static void method1559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) int local11 = 0; local11 < Static1.anInt113; local11++) {
			if (Static5.anIntArray383[local11] + Static6.anIntArray540[local11] > arg0 && Static6.anIntArray540[local11] < arg0 + arg3 && arg1 < Static7.anIntArray638[local11] + Static7.anIntArray616[local11] && arg2 + arg1 > Static7.anIntArray638[local11]) {
				Static6.aBooleanArray24[local11] = true;
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
	public static void method1563() {
		Static4.aClass185Array3 = null;
		Static14.method1069(InterfaceList.topLevelInterface, 0, 0, 0, GameShell.canvasHeight, 0, GameShell.canvasWidth, -1);
		if (Static4.aClass185Array3 != null) {
			Static30.method3554(Static7.anInt5589, -1412584499, Static1.aClass185_2.anInt5967, Static4.aClass185Array3, GameShell.canvasHeight, GameShell.canvasWidth, 0, Static4.anInt3317, 0);
			Static4.aClass185Array3 = null;
		}
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V")
	public static void method1576() {
		for (@Pc(7) int local7 = -1; local7 < PlayerList.size; local7++) {
			@Pc(20) int local20;
			if (local7 == -1) {
				local20 = 2047;
			} else {
				local20 = PlayerList.ids[local7];
			}
			@Pc(30) Player local30 = PlayerList.players[local20];
			if (local30 != null) {
				Static15.method1428(local30.getSize(), local30);
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
	public static void method2014() {
		@Pc(8) int local8 = Static11.method561();
		if (local8 == 0) {
			Static1.aByteArrayArrayArray2 = null;
			Static24.method2680(0);
		} else if (local8 == 1) {
			Static36.method4462((byte) 0);
			Static24.method2680(512);
			if (Static4.tileFlags != null) {
				method1498();
			}
		} else {
			Static36.method4462((byte) (Static2.anInt1997 - 4 & 0xFF));
			Static24.method2680(2);
		}
		Player.previousLevel = Player.level;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)V")
	public static void method2016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static4.anInt3068 = Static5.environments[arg0][arg1].anInt6035;
		Static7.anInt5363 = Static5.environments[arg0][arg1].anInt6037;
		Static6.anInt5211 = Static5.environments[arg0][arg1].anInt6033;
		Static25.method2775((float) Static4.anInt3068, (float) Static7.anInt5363, (float) Static6.anInt5211);
	}

}
