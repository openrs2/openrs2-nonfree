import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

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

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
	public static void method1557() {
		WorldMap.clear(false);
		System.gc();
		Static9.method233(25);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIII)V")
	public static void method1559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) int i = 0; i < InterfaceList.rectangles; i++) {
			if (InterfaceList.rectangleWidth[i] + InterfaceList.rectangleX[i] > arg0 && InterfaceList.rectangleX[i] < arg0 + arg3 && arg1 < InterfaceList.rectangleY[i] + InterfaceList.rectangleHeight[i] && arg2 + arg1 > InterfaceList.rectangleY[i]) {
				InterfaceList.rectangleRedraw[i] = true;
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
	public static void method1563() {
		Static4.aClass185Array3 = null;
		Static14.method1069(InterfaceList.topLevelInterface, 0, 0, 0, GameShell.canvasHeight, 0, GameShell.canvasWidth, -1);
		if (Static4.aClass185Array3 != null) {
			Static30.method3554(Static7.anInt5589, 0xABCDABCD, Static1.aClass185_2.rectangle, Static4.aClass185Array3, GameShell.canvasHeight, GameShell.canvasWidth, 0, Static4.anInt3317, 0);
			Static4.aClass185Array3 = null;
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
	public static void method2016(@OriginalArg(0) int x, @OriginalArg(1) int z) {
		Static4.anInt3068 = Static5.environments[x][z].anInt6035;
		Static7.anInt5363 = Static5.environments[x][z].anInt6037;
		Static6.anInt5211 = Static5.environments[x][z].anInt6033;
		Static25.method2775((float) Static4.anInt3068, (float) Static7.anInt5363, (float) Static6.anInt5211);
	}

}
