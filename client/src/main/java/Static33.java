import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.security.InvalidParameterException;
import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIII[F)V")
	public static void method4070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int format, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6) {
		if (width == 0 || width == Integer.MIN_VALUE || !IntUtils.isPowerOfTwo(width)) {
			throw new InvalidParameterException("width must be power of 2");
		} else if (height == 0 || height == Integer.MIN_VALUE || !IntUtils.isPowerOfTwo(height)) {
			throw new InvalidParameterException("height must be power of 2");
		} else {
			@Pc(32) byte local32;
			if (format == 6406) {
				local32 = 1;
			} else if (format == 6409) {
				local32 = 1;
			} else if (format == 32841) {
				local32 = 1;
			} else if (format == 6410) {
				local32 = 2;
			} else if (format == 6407) {
				local32 = 3;
			} else if (format == 6408) {
				local32 = 4;
			} else {
				throw new InvalidParameterException("Invalid external format");
			}
			@Pc(70) GL gl = GlRenderer.gl;
			@Pc(72) int local72 = 0;
			@Pc(79) int local79 = width < height ? width : height;
			@Pc(83) int local83 = width >> 1;
			@Pc(87) int local87 = height >> 1;
			@Pc(89) float[] local89 = arg6;
			@Pc(96) float[] local96 = new float[local83 * local87 * local32];
			while (true) {
				gl.glTexImage2D(arg0, local72, arg1, width, height, GL.GL_POINTS, format, GL.GL_FLOAT, FloatBuffer.wrap(local89));
				if (local79 <= 1) {
					return;
				}
				@Pc(115) int local115 = width * local32;
				for (@Pc(117) int local117 = 0; local117 < local32; local117++) {
					@Pc(122) int local122 = local117;
					@Pc(124) int local124 = local117;
					@Pc(128) int local128 = local117 + local115;
					for (@Pc(130) int local130 = 0; local130 < local87; local130++) {
						for (@Pc(135) int local135 = 0; local135 < local83; local135++) {
							@Pc(142) float local142 = local89[local124];
							@Pc(146) int local146 = local124 + local32;
							local142 += local89[local146];
							local124 = local146 + local32;
							local142 += local89[local128];
							@Pc(166) int local166 = local128 + local32;
							local142 += local89[local166];
							local128 = local166 + local32;
							local96[local122] = local142 * 0.25F;
							local122 += local32;
						}
						local124 += local115;
						local128 += local115;
					}
				}
				@Pc(202) float[] local202 = local96;
				local96 = local89;
				local89 = local202;
				width = local83;
				height = local87;
				local83 >>= 1;
				local87 >>= 1;
				local79 >>= 1;
				local72++;
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIII[I)V")
	public static void method4072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int format, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		if (width == 0 || width == Integer.MIN_VALUE || !IntUtils.isPowerOfTwo(width)) {
			throw new InvalidParameterException("width must be power of 2");
		} else if (height == 0 || height == Integer.MIN_VALUE || !IntUtils.isPowerOfTwo(height)) {
			throw new InvalidParameterException("height must be power of 2");
		} else if (format == 32993 || format == 6408) {
			@Pc(40) GL gl = GlRenderer.gl;
			@Pc(42) int local42 = 0;
			@Pc(49) int local49 = width < height ? width : height;
			@Pc(53) int local53 = width >> 1;
			@Pc(57) int local57 = height >> 1;
			@Pc(59) int[] local59 = arg6;
			@Pc(64) int[] local64 = new int[local53 * local57];
			while (true) {
				gl.glTexImage2D(arg0, local42, arg1, width, height, GL.GL_POINTS, format, arg5, IntBuffer.wrap(local59));
				if (local49 <= 1) {
					return;
				}
				@Pc(81) int local81 = 0;
				@Pc(83) int local83 = 0;
				@Pc(87) int local87 = width;
				for (@Pc(89) int local89 = 0; local89 < local57; local89++) {
					for (@Pc(94) int local94 = 0; local94 < local53; local94++) {
						@Pc(100) int local100 = local83 + 1;
						@Pc(102) int local102 = local59[local83];
						local83 = local100 + 1;
						@Pc(107) int local107 = local59[local100];
						@Pc(110) int local110 = local87 + 1;
						@Pc(112) int local112 = local59[local87];
						local87 = local110 + 1;
						@Pc(117) int local117 = local59[local110];
						@Pc(123) int local123 = local102 >> 24 & 0xFF;
						@Pc(129) int local129 = local102 >> 16 & 0xFF;
						@Pc(135) int local135 = local102 >> 8 & 0xFF;
						@Pc(139) int local139 = local102 & 0xFF;
						local123 += local107 >> 24 & 0xFF;
						local129 += local107 >> 16 & 0xFF;
						local135 += local107 >> 8 & 0xFF;
						local139 += local107 & 0xFF;
						local123 += local112 >> 24 & 0xFF;
						local129 += local112 >> 16 & 0xFF;
						local135 += local112 >> 8 & 0xFF;
						local139 += local112 & 0xFF;
						local123 += local117 >> 24 & 0xFF;
						local129 += local117 >> 16 & 0xFF;
						local135 += local117 >> 8 & 0xFF;
						local139 += local117 & 0xFF;
						local64[local81++] = (local123 & 0x3FC) << 22 | (local129 & 0x3FC) << 14 | (local135 & 0x3FC) << 6 | local139 >> 2 & 0xFF;
					}
					local83 += width;
					local87 += width;
				}
				@Pc(270) int[] local270 = local64;
				local64 = local59;
				local59 = local270;
				width = local53;
				height = local57;
				local53 >>= 1;
				local57 >>= 1;
				local49 >>= 1;
				local42++;
			}
		} else {
			throw new InvalidParameterException("Invalid external format");
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!wf;B)V")
	public static void method4118(@OriginalArg(0) Component arg0) {
		@Pc(3) Component local3 = InterfaceList.method2942(arg0);
		@Pc(12) int local12;
		@Pc(15) int local15;
		if (local3 == null) {
			local15 = GameShell.canvasHeight;
			local12 = GameShell.canvasWidth;
		} else {
			local12 = local3.width;
			local15 = local3.height;
		}
		Static11.method526(arg0, local12, local15, false);
		Static36.method3812(arg0, local12, local15);
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(III)Z")
	public static boolean method4119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < SceneGraph.anInt4112; local1++) {
			@Pc(8) Class184 local8 = SceneGraph.aClass184Array12[local1];
			if (local8.anInt5873 == 1) {
				@Pc(17) int local17 = local8.anInt5862 - arg0;
				if (local17 > 0) {
					@Pc(29) int local29 = local8.anInt5860 + (local8.anInt5864 * local17 >> 8);
					@Pc(39) int local39 = local8.anInt5879 + (local8.anInt5874 * local17 >> 8);
					@Pc(49) int local49 = local8.anInt5872 + (local8.anInt5869 * local17 >> 8);
					@Pc(59) int local59 = local8.anInt5881 + (local8.anInt5868 * local17 >> 8);
					if (arg2 >= local29 && arg2 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt5873 == 2) {
				@Pc(83) int local83 = arg0 - local8.anInt5862;
				if (local83 > 0) {
					@Pc(95) int local95 = local8.anInt5860 + (local8.anInt5864 * local83 >> 8);
					@Pc(105) int local105 = local8.anInt5879 + (local8.anInt5874 * local83 >> 8);
					@Pc(115) int local115 = local8.anInt5872 + (local8.anInt5869 * local83 >> 8);
					@Pc(125) int local125 = local8.anInt5881 + (local8.anInt5868 * local83 >> 8);
					if (arg2 >= local95 && arg2 <= local105 && arg1 >= local115 && arg1 <= local125) {
						return true;
					}
				}
			} else if (local8.anInt5873 == 3) {
				@Pc(149) int local149 = local8.anInt5860 - arg2;
				if (local149 > 0) {
					@Pc(161) int local161 = local8.anInt5862 + (local8.anInt5861 * local149 >> 8);
					@Pc(171) int local171 = local8.anInt5877 + (local8.anInt5878 * local149 >> 8);
					@Pc(181) int local181 = local8.anInt5872 + (local8.anInt5869 * local149 >> 8);
					@Pc(191) int local191 = local8.anInt5881 + (local8.anInt5868 * local149 >> 8);
					if (arg0 >= local161 && arg0 <= local171 && arg1 >= local181 && arg1 <= local191) {
						return true;
					}
				}
			} else if (local8.anInt5873 == 4) {
				@Pc(215) int local215 = arg2 - local8.anInt5860;
				if (local215 > 0) {
					@Pc(227) int local227 = local8.anInt5862 + (local8.anInt5861 * local215 >> 8);
					@Pc(237) int local237 = local8.anInt5877 + (local8.anInt5878 * local215 >> 8);
					@Pc(247) int local247 = local8.anInt5872 + (local8.anInt5869 * local215 >> 8);
					@Pc(257) int local257 = local8.anInt5881 + (local8.anInt5868 * local215 >> 8);
					if (arg0 >= local227 && arg0 <= local237 && arg1 >= local247 && arg1 <= local257) {
						return true;
					}
				}
			} else if (local8.anInt5873 == 5) {
				@Pc(281) int local281 = arg1 - local8.anInt5872;
				if (local281 > 0) {
					@Pc(293) int local293 = local8.anInt5862 + (local8.anInt5861 * local281 >> 8);
					@Pc(303) int local303 = local8.anInt5877 + (local8.anInt5878 * local281 >> 8);
					@Pc(313) int local313 = local8.anInt5860 + (local8.anInt5864 * local281 >> 8);
					@Pc(323) int local323 = local8.anInt5879 + (local8.anInt5874 * local281 >> 8);
					if (arg0 >= local293 && arg0 <= local303 && arg2 >= local313 && arg2 <= local323) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIZ)I")
	public static int method4153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static6.aBoolean335) {
			arg2 = 1000000;
			Static6.aBoolean335 = false;
		}
		@Pc(17) Environment local17 = Static5.environments[arg3][arg1];
		@Pc(27) float local27 = local17.aFloat148 * ((float) arg0 * 0.1F + 0.7F);
		@Pc(30) int local30 = local17.anInt6034;
		@Pc(33) float local33 = local17.aFloat150;
		@Pc(36) float local36 = local17.aFloat149;
		@Pc(39) int local39 = local17.anInt6036;
		@Pc(48) int local48 = local17.anInt6043;
		if (!Preferences.fog) {
			local48 = 0;
		}
		@Pc(56) SkyBoxCube local56 = local17.skybox;
		@Pc(59) float local59 = local17.aFloat152;
		@Pc(62) float local62 = local17.aFloat151;
		@Pc(65) float local65 = local17.aFloat153;
		if (local30 != Static4.anInt3171 || Static4.aFloat146 != local27 || Static5.aFloat96 != local33 || Static6.aFloat90 != local36 || Static2.anInt1325 != local39 || local48 != Static2.anInt1317 || local56 != Static2.aClass4_Sub3_Sub10_3 || Static4.aFloat59 != local59 || Static1.aFloat24 != local65 || Static3.aFloat51 != local62) {
			Static5.anInt3764 = Static1.anInt131;
			Static6.anInt4801 = Static4.anInt3196;
			Static7.aFloat144 = Static6.aFloat108;
			Static4.aFloat62 = Static3.aFloat63;
			Static1.aFloat5 = Static4.aFloat85;
			Static2.aFloat42 = Static5.aFloat102;
			Static3.aClass4_Sub3_Sub10_4 = Static1.aClass4_Sub3_Sub10_1;
			Static6.anInt4793 = Static1.anInt611;
			Static3.aFloat54 = Static4.aFloat58;
			Static1.aFloat21 = Static4.aFloat145;
			if (Static1.aClass4_Sub3_Sub10_2 == null || Static3.aClass4_Sub3_Sub10_4 == Static1.aClass4_Sub3_Sub10_2) {
				Static1.aClass4_Sub3_Sub10_2 = new SkyBoxCube();
			}
			Static2.anInt1317 = local48;
			Static6.aFloat90 = local36;
			Static4.aFloat146 = local27;
			Static3.anInt2579 = 0;
			Static4.anInt3171 = local30;
			Static1.aFloat24 = local65;
			Static2.aClass4_Sub3_Sub10_3 = local56;
			Static5.aFloat96 = local33;
			Static3.aFloat51 = local62;
			Static2.anInt1325 = local39;
			Static4.aFloat59 = local59;
		}
		if (Static3.anInt2579 < 65536) {
			Static3.anInt2579 += arg2 * 250;
			if (Static3.anInt2579 >= 65536) {
				Static4.aFloat145 = Static4.aFloat59;
				Static3.aFloat63 = Static5.aFloat96;
				Static4.aFloat58 = Static3.aFloat51;
				Static1.aClass4_Sub3_Sub10_1 = Static2.aClass4_Sub3_Sub10_3;
				Static1.anInt611 = Static2.anInt1317;
				Static4.aFloat85 = Static1.aFloat24;
				Static5.aFloat102 = Static4.aFloat146;
				Static4.anInt3196 = Static2.anInt1325;
				Static3.anInt2579 = 65536;
				Static3.aClass4_Sub3_Sub10_4 = null;
				Static6.aFloat108 = Static6.aFloat90;
				Static1.anInt131 = Static4.anInt3171;
			} else {
				@Pc(209) int local209 = 65536 - Static3.anInt2579 >> 8;
				@Pc(214) float local214 = (float) Static3.anInt2579 / 65536.0F;
				@Pc(218) int local218 = Static3.anInt2579 >> 8;
				Static1.anInt611 = Static6.anInt4793 * local209 + Static2.anInt1317 * local218 >> 8;
				Static1.anInt131 = (local209 * (Static5.anInt3764 & 0xFF00FF) + (Static4.anInt3171 & 0xFF00FF) * local218 & 0xFF00FF00) + (local218 * (Static4.anInt3171 & 0xFF00) + (Static5.anInt3764 & 0xFF00) * local209 & 0xFF0000) >> 8;
				@Pc(268) float local268 = (float) (65536 - Static3.anInt2579) / 65536.0F;
				Static5.aFloat102 = local214 * Static4.aFloat146 + Static2.aFloat42 * local268;
				Static6.aFloat108 = local214 * Static6.aFloat90 + Static7.aFloat144 * local268;
				Static4.aFloat145 = local268 * Static1.aFloat21 + local214 * Static4.aFloat59;
				Static3.aFloat63 = local214 * Static5.aFloat96 + Static4.aFloat62 * local268;
				Static4.anInt3196 = ((Static6.anInt4801 & 0xFF00) * local209 + (Static2.anInt1325 & 0xFF00) * local218 & 0xFF0000) + ((Static2.anInt1325 & 0xFF00FF) * local218 + local209 * (Static6.anInt4801 & 0xFF00FF) & 0xFF00FF00) >> 8;
				Static4.aFloat58 = local268 * Static3.aFloat54 + Static3.aFloat51 * local214;
				Static4.aFloat85 = Static1.aFloat24 * local214 + Static1.aFloat5 * local268;
				if (Static2.aClass4_Sub3_Sub10_3 != Static3.aClass4_Sub3_Sub10_4) {
					if (Static3.aClass4_Sub3_Sub10_4 == null || Static2.aClass4_Sub3_Sub10_3 == null) {
						Static1.aClass4_Sub3_Sub10_1 = null;
					} else {
						Static1.aClass4_Sub3_Sub10_1 = Static1.aClass4_Sub3_Sub10_2.method1835(Static3.aClass4_Sub3_Sub10_4, Static2.aClass4_Sub3_Sub10_3, (float) Static3.anInt2579 / 65536.0F);
					}
				}
			}
		}
		return Static4.anInt3196;
	}

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "(B)V")
	public static void method4202() {
		if (SceneGraph.isAllLevelsVisible() || Static2.visibleLevel == Player.level) {
			MiniMap.renderMap();
			if (Player.level != Player.previousLevel) {
				Static16.method2014();
			}
		} else {
			Static8.method2(false, Static4.centralZoneX, false, PlayerList.self.movementQueueZ[0], PlayerList.self.movementQueueX[0], Static1.centralZoneZ, Player.level);
		}
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V")
	public static void method3000() {
		Static32.method3917(false);
		Static3.anInt2886 = 0;
		@Pc(12) boolean ready = true;
		for (@Pc(14) int i = 0; i < Static1.mapBytes.length; i++) {
			if (Static3.mapGroupIds[i] != -1 && Static1.mapBytes[i] == null) {
				Static1.mapBytes[i] = client.js5Archive5.fetchFile(Static3.mapGroupIds[i], 0);
				if (Static1.mapBytes[i] == null) {
					ready = false;
					Static3.anInt2886++;
				}
			}
			if (Static1.locGroupIds[i] != -1 && Static5.locBytes[i] == null) {
				Static5.locBytes[i] = client.js5Archive5.fetchFile(Static1.locGroupIds[i], 0, Static5.xteaKeys[i]);
				if (Static5.locBytes[i] == null) {
					ready = false;
					Static3.anInt2886++;
				}
			}
			if (GlRenderer.enabled) {
				if (Static4.underwaterMapGroupIds[i] != -1 && Static7.underwaterMapBytes[i] == null) {
					Static7.underwaterMapBytes[i] = client.js5Archive5.fetchFile(Static4.underwaterMapGroupIds[i], 0);
					if (Static7.underwaterMapBytes[i] == null) {
						ready = false;
						Static3.anInt2886++;
					}
				}
				if (Static3.underwaterLocGroupIds[i] != -1 && Static1.underwaterLocBytes[i] == null) {
					Static1.underwaterLocBytes[i] = client.js5Archive5.fetchFile(Static3.underwaterLocGroupIds[i], 0);
					if (Static1.underwaterLocBytes[i] == null) {
						Static3.anInt2886++;
						ready = false;
					}
				}
			}
			if (Static6.npcGroupIds != null && Static7.npcBytes[i] == null && Static6.npcGroupIds[i] != -1) {
				Static7.npcBytes[i] = client.js5Archive5.fetchFile(Static6.npcGroupIds[i], 0, Static5.xteaKeys[i]);
				if (Static7.npcBytes[i] == null) {
					ready = false;
					Static3.anInt2886++;
				}
			}
		}
		if (Static7.mapElements == null) {
			if (Static2.map == null || !client.js5Archive23.isGroupNameValid(Static2.map.group + "_labels")) {
				Static7.mapElements = new MapElementList(0);
			} else if (client.js5Archive23.isGroupReady(Static2.map.group + "_labels")) {
				Static7.mapElements = MapElementList.create(client.js5Archive23, Static2.map.group + "_labels", LoginManager.mapMembers);
			} else {
				Static3.anInt2886++;
				ready = false;
			}
		}
		if (!ready) {
			Static6.anInt4659 = 1;
			return;
		}
		Static7.anInt5486 = 0;
		@Pc(272) boolean locReady = true;
		for (@Pc(274) int i = 0; i < Static1.mapBytes.length; i++) {
			@Pc(282) byte[] bytes = Static5.locBytes[i];
			if (bytes != null) {
				@Pc(294) int x = (Static7.mapSquares[i] >> 8) * 64 - Static5.originX;
				@Pc(305) int z = (Static7.mapSquares[i] & 0xFF) * 64 - Static7.originZ;
				if (Static5.dynamicArea) {
					z = 10;
					x = 10;
				}
				locReady &= Static28.isLocFileReady(z, x, bytes);
			}
			if (GlRenderer.enabled) {
				@Pc(325) byte[] underwaterBytes = Static1.underwaterLocBytes[i];
				if (underwaterBytes != null) {
					@Pc(338) int x = (Static7.mapSquares[i] >> 8) * 64 - Static5.originX;
					@Pc(349) int z = (Static7.mapSquares[i] & 0xFF) * 64 - Static7.originZ;
					if (Static5.dynamicArea) {
						x = 10;
						z = 10;
					}
					locReady &= Static28.isLocFileReady(z, x, underwaterBytes);
				}
			}
		}
		if (!locReady) {
			Static6.anInt4659 = 2;
			return;
		}
		@Pc(374) boolean hasUnderwaterLevel = false;
		if (Static6.anInt4659 != 0) {
			Static37.renderLoadingText(LocalisedText.LOADING + "<br>(100%)", true);
		}
		Static9.audioLoop();
		Static24.method2697();
		if (GlRenderer.enabled && Preferences.highDetailWater) {
			for (@Pc(398) int i = 0; i < Static1.mapBytes.length; i++) {
				if (Static1.underwaterLocBytes[i] != null || Static7.underwaterMapBytes[i] != null) {
					hasUnderwaterLevel = true;
					break;
				}
			}
		}
		SceneGraph.init(GlRenderer.enabled ? 28 : 25, hasUnderwaterLevel);
		for (@Pc(430) int i = 0; i < 4; i++) {
			PathFinder.collisionMaps[i].clear();
		}
		for (@Pc(447) int level = 0; level < 4; level++) {
			for (@Pc(454) int x = 0; x < 104; x++) {
				for (@Pc(461) int z = 0; z < 104; z++) {
					Static4.tileFlags[level][x][z] = 0;
				}
			}
		}
		AreaSoundManager.clear(false);
		if (GlRenderer.enabled) {
			Static2.aClass56_Sub1_2.clear();
			for (@Pc(492) int x = 0; x < 13; x++) {
				for (@Pc(499) int z = 0; z < 13; z++) {
					Static2.aClass103ArrayArray1[x][z].aBoolean197 = true;
				}
			}
		}
		if (GlRenderer.enabled) {
			LightingManager.method3110();
		}
		if (GlRenderer.enabled) {
			Static37.method4677();
		}
		Static9.audioLoop();
		System.gc();
		Static32.method3917(true);
		Static31.method3803(false);
		if (!Static5.dynamicArea) {
			Static21.method2009(false);
			Static32.method3917(true);
			if (GlRenderer.enabled) {
				@Pc(553) int x = PlayerList.self.movementQueueX[0] >> 3;
				@Pc(560) int z = PlayerList.self.movementQueueZ[0] >> 3;
				Static16.method2016(x, z);
			}
			Static37.method4710(false);
			if (Static7.npcBytes != null) {
				Static14.readNpcSpawns();
			}
		}
		if (Static5.dynamicArea) {
			Static26.method4359(false);
			Static32.method3917(true);
			if (GlRenderer.enabled) {
				@Pc(591) int z = PlayerList.self.movementQueueZ[0] >> 3;
				@Pc(598) int x = PlayerList.self.movementQueueX[0] >> 3;
				Static16.method2016(x, z);
			}
			Static24.method2708(false);
		}
		Static24.method2697();
		Static32.method3917(true);
		Static31.method3778(PathFinder.collisionMaps, Static5.dynamicArea ? Static7.zones : (int[][][]) null, false);
		if (GlRenderer.enabled) {
			LightingManager.method3122();
		}
		Static32.method3917(true);
		@Pc(630) int firstVisibleLevel = Static5.firstVisibleLevel;
		if (firstVisibleLevel > Player.level) {
			firstVisibleLevel = Player.level;
		}
		if (firstVisibleLevel >= Player.level - 1) {
		}
		if (SceneGraph.isAllLevelsVisible()) {
			SceneGraph.setFirstVisibleLevel(0);
		} else {
			SceneGraph.setFirstVisibleLevel(Static5.firstVisibleLevel);
		}
		Static38.method4791();
		if (GlRenderer.enabled && hasUnderwaterLevel) {
			SceneGraph.setUnderwater(true);
			Static31.method3803(true);
			if (!Static5.dynamicArea) {
				Static21.method2009(true);
				Static32.method3917(true);
				Static37.method4710(true);
			}
			if (Static5.dynamicArea) {
				Static26.method4359(true);
				Static32.method3917(true);
				Static24.method2708(true);
			}
			Static24.method2697();
			Static32.method3917(true);
			Static31.method3778(PathFinder.collisionMaps, Static5.dynamicArea ? Static7.zones : (int[][][]) null, true);
			Static32.method3917(true);
			Static38.method4791();
			SceneGraph.setUnderwater(false);
		}
		if (GlRenderer.enabled) {
			for (@Pc(718) int x = 0; x < 13; x++) {
				for (@Pc(723) int z = 0; z < 13; z++) {
					Static2.aClass103ArrayArray1[x][z].buffer(x * 8, z * 8, SceneGraph.tileHeights[0]);
				}
			}
		}
		for (@Pc(751) int x = 0; x < 104; x++) {
			for (@Pc(758) int z = 0; z < 104; z++) {
				Static8.sortObjStack(x, z);
			}
		}
		Static16.method2014();
		Static9.audioLoop();
		ChangeLocRequest.flush();
		Static24.method2697();
		Static4.aBoolean189 = false;
		if (GlRenderer.enabled) {
			Static23.method1936(true);
		}
		if (GameShell.frame != null && Protocol.socket != null && Static4.anInt3304 == 25) {
			Protocol.outboundBuffer.writeOpcode(236);
			Protocol.outboundBuffer.writeInt(1057001181);
		}
		if (!Static5.dynamicArea) {
			@Pc(822) int x0 = (Static4.centralZoneX - 6) / 8;
			@Pc(828) int x1 = (Static4.centralZoneX + 6) / 8;
			@Pc(834) int z0 = (Static1.centralZoneZ - 6) / 8;
			@Pc(840) int z1 = (Static1.centralZoneZ + 6) / 8;
			for (@Pc(844) int x = x0 - 1; x <= x1 + 1; x++) {
				for (@Pc(853) int z = z0 - 1; z <= z1 + 1; z++) {
					if (x < x0 || x > x1 || z < z0 || z1 < z) {
						client.js5Archive5.prefetchGroup("m" + x + "_" + z);
						client.js5Archive5.prefetchGroup("l" + x + "_" + z);
					}
				}
			}
		}
		if (Static4.anInt3304 == 28) {
			Static9.method233(10);
		} else {
			Static9.method233(30);
			if (Protocol.socket != null) {
				Protocol.outboundBuffer.writeOpcode(113);
			}
		}
		WorldMap.method4306();
		Static9.audioLoop();
		GameShell.resetTimer();
	}

}
