import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!ic;Lclient!oh;B)Lclient!ih;")
	public static Class4_Sub12 method4237(@OriginalArg(0) HashTable arg0, @OriginalArg(1) FloType arg1) {
		@Pc(27) long local27 = ((long) arg1.anInt3868 << 56) + ((long) arg1.anInt3874 << 32) + (long) (arg1.anInt3876 + (arg1.texture + 1 << 16));
		@Pc(39) Class4_Sub12 local39 = (Class4_Sub12) arg0.get(local27);
		if (local39 == null) {
			local39 = new Class4_Sub12(arg1.texture, (float) arg1.anInt3876, true, false, arg1.anInt3874);
			arg0.put(local27, local39);
		}
		return local39;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBIIII)V")
	public static void method4241(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static5.anInt4230 < arg2 || Static4.anInt3086 > arg1) {
			return;
		}
		@Pc(23) boolean local23;
		if (Static2.anInt902 > arg4) {
			arg4 = Static2.anInt902;
			local23 = false;
		} else if (arg4 > Static3.anInt2553) {
			arg4 = Static3.anInt2553;
			local23 = false;
		} else {
			local23 = true;
		}
		@Pc(51) boolean local51;
		if (arg0 < Static2.anInt902) {
			arg0 = Static2.anInt902;
			local51 = false;
		} else if (Static3.anInt2553 < arg0) {
			arg0 = Static3.anInt2553;
			local51 = false;
		} else {
			local51 = true;
		}
		@Pc(71) int local71;
		if (Static4.anInt3086 <= arg2) {
			local71 = arg2 + 1;
			ArrayUtils.fillRange(Static5.anIntArrayArray36[arg2], arg4, arg0, arg3);
		} else {
			local71 = Static4.anInt3086;
		}
		@Pc(89) int local89;
		if (Static5.anInt4230 < arg1) {
			local89 = Static5.anInt4230;
		} else {
			local89 = arg1 - 1;
			ArrayUtils.fillRange(Static5.anIntArrayArray36[arg1], arg4, arg0, arg3);
		}
		if (local23 && local51) {
			for (@Pc(106) int local106 = local71; local106 <= local89; local106++) {
				@Pc(113) int[] local113 = Static5.anIntArrayArray36[local106];
				local113[arg4] = local113[arg0] = arg3;
			}
		} else if (local23) {
			for (@Pc(149) int local149 = local71; local149 <= local89; local149++) {
				Static5.anIntArrayArray36[local149][arg4] = arg3;
			}
		} else if (local51) {
			for (@Pc(133) int local133 = local71; local133 <= local89; local133++) {
				Static5.anIntArrayArray36[local133][arg0] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V")
	public static void method4243(@OriginalArg(1) int arg0) {
		if (InterfaceList.load(arg0)) {
			Static29.method3495(InterfaceList.components[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)Z")
	public static boolean setBuildArea(@OriginalArg(1) int buildArea) {
		if (Static7.buildArea == buildArea) {
			return false;
		}
		PathFinder.costs = new int[104][104];
		PathFinder.parents = new int[104][104];
		Static7.zones = new int[4][13][13];
		Static1.anIntArrayArray2 = new int[104][104];
		for (@Pc(36) int level = 0; level < 4; level++) {
			PathFinder.collisionMaps[level] = new CollisionMap(104, 104);
		}
		Static4.tileFlags = new byte[4][104][104];
		Static1.aByteArrayArrayArray2 = new byte[4][104][104];
		Static4.objStacks = new LinkedList[4][104][104];
		if (GlRenderer.enabled) {
			LightingManager.method3109();
			Static14.method1205();
			Static5.environments = new Environment[13][13];
		}
		Static7.buildArea = buildArea;
		return true;
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(III)V")
	public static void method3186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static2.aBoolean101 = true;
		Static5.anInt3715 = arg0;
		Static1.anInt315 = arg1;
		Static7.anInt5803 = arg2;
		Static1.anInt528 = -1;
		Static1.anInt420 = -1;
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(IIIIII)V")
	public static void method4706(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		ArrayUtils.fillRange(Static5.anIntArrayArray36[arg3++], arg1, arg2, arg0);
		ArrayUtils.fillRange(Static5.anIntArrayArray36[arg4--], arg1, arg2, arg0);
		for (@Pc(31) int local31 = arg3; local31 <= arg4; local31++) {
			@Pc(42) int[] local42 = Static5.anIntArrayArray36[local31];
			local42[arg1] = local42[arg2] = arg0;
		}
	}

	@OriginalMember(owner = "client!og", name = "h", descriptor = "(B)V")
	public static void method4709() {
		FloTypeList.removeSoft();
		FluTypeList.removeSoft();
		IdkTypeList.removeSoft();
		LocTypeList.removeSoft();
		NpcTypeList.removeSoft();
		ObjTypeList.removeSoft();
		SeqTypeList.removeSoft();
		SpotAnimTypeList.removeSoft();
		VarbitTypeList.removeSoft();
		VarpTypeList.removeSoft();
		BasTypeList.removeSoft();
		MsiTypeList.removeSoft();
		MelTypeList.removeSoft();
		SkyBoxTypeList.removeSoft();
		SkyBoxSphereTypeList.removeSoft();
		LightTypeList.removeSoft();
		CursorTypeList.removeSoft();
		PlayerAppearance.removeSoft();
		Component.removeSoft();
		HintArrowManager.removeSoft();
		ShadowModelList.removeSoft();
		HitBarList.hitBars.removeSoft();
		FontMetricsList.fontMetrics.removeSoft();
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIIFIZ)[[I")
	public static int[][] method3234(@OriginalArg(6) float arg0) {
		@Pc(17) int[][] local17 = new int[256][64];
		@Pc(21) TextureOp34 op = new TextureOp34();
		op.anInt2625 = 4;
		op.anInt2631 = 8;
		op.anInt2628 = 3;
		op.anInt2620 = (int) (arg0 * 4096.0F);
		op.aBoolean181 = false;
		op.postDecode();
		Texture.setSize(64, 256);
		for (@Pc(48) int y = 0; y < 256; y++) {
			op.method2053(local17[y], y);
		}
		return local17;
	}

}
