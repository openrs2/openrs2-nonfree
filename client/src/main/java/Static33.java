import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.security.InvalidParameterException;
import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIII[F)V")
	public static void method4070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6) {
		if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !IntUtils.isPowerOfTwo(arg2)) {
			throw new InvalidParameterException("width must be power of 2");
		} else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !IntUtils.isPowerOfTwo(arg3)) {
			throw new InvalidParameterException("height must be power of 2");
		} else {
			@Pc(32) byte local32;
			if (arg4 == 6406) {
				local32 = 1;
			} else if (arg4 == 6409) {
				local32 = 1;
			} else if (arg4 == 32841) {
				local32 = 1;
			} else if (arg4 == 6410) {
				local32 = 2;
			} else if (arg4 == 6407) {
				local32 = 3;
			} else if (arg4 == 6408) {
				local32 = 4;
			} else {
				throw new InvalidParameterException("Invalid external format");
			}
			@Pc(70) GL gl = GlRenderer.gl;
			@Pc(72) int local72 = 0;
			@Pc(79) int local79 = arg2 < arg3 ? arg2 : arg3;
			@Pc(83) int local83 = arg2 >> 1;
			@Pc(87) int local87 = arg3 >> 1;
			@Pc(89) float[] local89 = arg6;
			@Pc(96) float[] local96 = new float[local83 * local87 * local32];
			while (true) {
				gl.glTexImage2D(arg0, local72, arg1, arg2, arg3, GL.GL_POINTS, arg4, GL.GL_FLOAT, FloatBuffer.wrap(local89));
				if (local79 <= 1) {
					return;
				}
				@Pc(115) int local115 = arg2 * local32;
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
				arg2 = local83;
				arg3 = local87;
				local83 >>= 1;
				local87 >>= 1;
				local79 >>= 1;
				local72++;
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIII[I)V")
	public static void method4072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !IntUtils.isPowerOfTwo(arg2)) {
			throw new InvalidParameterException("width must be power of 2");
		} else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !IntUtils.isPowerOfTwo(arg3)) {
			throw new InvalidParameterException("height must be power of 2");
		} else if (arg4 == 32993 || arg4 == 6408) {
			@Pc(40) GL gl = GlRenderer.gl;
			@Pc(42) int local42 = 0;
			@Pc(49) int local49 = arg2 < arg3 ? arg2 : arg3;
			@Pc(53) int local53 = arg2 >> 1;
			@Pc(57) int local57 = arg3 >> 1;
			@Pc(59) int[] local59 = arg6;
			@Pc(64) int[] local64 = new int[local53 * local57];
			while (true) {
				gl.glTexImage2D(arg0, local42, arg1, arg2, arg3, GL.GL_POINTS, arg4, arg5, IntBuffer.wrap(local59));
				if (local49 <= 1) {
					return;
				}
				@Pc(81) int local81 = 0;
				@Pc(83) int local83 = 0;
				@Pc(87) int local87 = arg2;
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
					local83 += arg2;
					local87 += arg2;
				}
				@Pc(270) int[] local270 = local64;
				local64 = local59;
				local59 = local270;
				arg2 = local53;
				arg3 = local57;
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
		@Pc(3) Component local3 = Static26.method2942(arg0);
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
		@Pc(56) Skybox local56 = local17.skybox;
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
				Static1.aClass4_Sub3_Sub10_2 = new Skybox();
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

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IILclient!vh;IIII)Z")
	public static boolean method4155(@OriginalArg(1) int z, @OriginalArg(2) LocType locType, @OriginalArg(4) int x, @OriginalArg(6) int angle) {
		@Pc(10) MsiType msiType = MsiTypeList.get(locType.mapSceneId);
		if (msiType.spriteId == -1) {
			return true;
		}
		@Pc(22) int angle2;
		if (locType.mapSceneRotated) {
			angle += locType.mapSceneAngleOffset;
			angle2 = angle & 0x3;
		} else {
			angle2 = 0;
		}
		@Pc(45) SoftwareIndexedSprite sprite = msiType.getSprite(locType.mapSceneFlipVertical, angle2);
		if (sprite == null) {
			return false;
		}
		@Pc(53) int width = locType.width;
		@Pc(56) int length = locType.length;
		if ((angle2 & 0x1) == 1) {
			width = locType.length;
			length = locType.width;
		}
		@Pc(73) int local73 = sprite.innerWidth;
		@Pc(76) int local76 = sprite.innerHeight;
		if (msiType.aBoolean303) {
			local73 = width * 4;
			local76 = length * 4;
		}
		if (msiType.anInt4306 == 0) {
			sprite.method1315(x * 4 + 48, (104 - z - length) * 4 + 48, local73, local76);
		} else {
			sprite.method1316(x * 4 + 48, (104 - length - z) * 4 + 48, local73, local76, msiType.anInt4306);
		}
		return true;
	}

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "(B)V")
	public static void method4202() {
		if (SceneGraph.isAllLevelsVisible() || Static2.visibleLevel == Player.level) {
			Static12.method638();
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
		for (@Pc(14) int local14 = 0; local14 < Static1.mapBytes.length; local14++) {
			if (Static3.mapGroupIds[local14] != -1 && Static1.mapBytes[local14] == null) {
				Static1.mapBytes[local14] = client.js5Archive5.fetchFile(Static3.mapGroupIds[local14], 0);
				if (Static1.mapBytes[local14] == null) {
					ready = false;
					Static3.anInt2886++;
				}
			}
			if (Static1.locGroupIds[local14] != -1 && Static5.locBytes[local14] == null) {
				Static5.locBytes[local14] = client.js5Archive5.fetchFile(Static1.locGroupIds[local14], 0, Static5.xteaKeys[local14]);
				if (Static5.locBytes[local14] == null) {
					ready = false;
					Static3.anInt2886++;
				}
			}
			if (GlRenderer.enabled) {
				if (Static4.underwaterMapGroupIds[local14] != -1 && Static7.underwaterMapBytes[local14] == null) {
					Static7.underwaterMapBytes[local14] = client.js5Archive5.fetchFile(Static4.underwaterMapGroupIds[local14], 0);
					if (Static7.underwaterMapBytes[local14] == null) {
						ready = false;
						Static3.anInt2886++;
					}
				}
				if (Static3.underwaterLocGroupIds[local14] != -1 && Static1.underwaterLocBytes[local14] == null) {
					Static1.underwaterLocBytes[local14] = client.js5Archive5.fetchFile(Static3.underwaterLocGroupIds[local14], 0);
					if (Static1.underwaterLocBytes[local14] == null) {
						Static3.anInt2886++;
						ready = false;
					}
				}
			}
			if (Static6.npcGroupIds != null && Static7.npcBytes[local14] == null && Static6.npcGroupIds[local14] != -1) {
				Static7.npcBytes[local14] = client.js5Archive5.fetchFile(Static6.npcGroupIds[local14], 0, Static5.xteaKeys[local14]);
				if (Static7.npcBytes[local14] == null) {
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
			Static37.method4716(LocalisedText.LOADING + "<br>(100%)", true);
		}
		Static9.method763();
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
		Static9.method763();
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
				Static14.method1062();
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
					Static2.aClass103ArrayArray1[x][z].method2238(SceneGraph.tileHeights[0], x * 8, z * 8);
				}
			}
		}
		for (@Pc(751) int x = 0; x < 104; x++) {
			for (@Pc(758) int z = 0; z < 104; z++) {
				Static8.sortObjStack(x, z);
			}
		}
		Static16.method2014();
		Static9.method763();
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
		Static35.method4306();
		Static9.method763();
		GameShell.resetTimer();
	}

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "(I)V")
	public static void method3007() {
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

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IILclient!wf;II)V")
	public static void method3010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int arg3) {
		Static9.method763();
		if (GlRenderer.enabled) {
			GlRaster.setClip(arg0, arg3, arg2.width + arg0, arg2.height + arg3);
		} else {
			SoftwareRaster.setClip(arg0, arg3, arg0 + arg2.width, arg3 + arg2.height);
		}
		if (MiniMap.state != 2 && MiniMap.state != 5 && Static5.aClass4_Sub3_Sub14_4 != null) {
			@Pc(92) int local92 = (int) Static5.aFloat97 + Static6.anInt3585 & 0x7FF;
			@Pc(101) int local101 = 464 - PlayerList.self.zFine / 32;
			@Pc(109) int local109 = PlayerList.self.xFine / 32 + 48;
			if (GlRenderer.enabled) {
				((GlSprite) Static5.aClass4_Sub3_Sub14_4).renderRotatedTransparent(arg0, arg3, arg2.width, arg2.height, local109, local101, local92, Static6.anInt4761 + 256, (GlSprite) arg2.method4729(false));
			} else {
				((SoftwareSprite) Static5.aClass4_Sub3_Sub14_4).renderRotatedTransparent(arg0, arg3, arg2.width, arg2.height, local109, local101, local92, Static6.anInt4761 + 256, arg2.anIntArray672, arg2.anIntArray657);
			}
			if (Static7.mapElements != null) {
				for (@Pc(158) int local158 = 0; local158 < Static7.mapElements.size; local158++) {
					if (Static7.mapElements.elements[local158] != null && Static7.mapElements.positions[local158] >> 28 == Player.level) {
						@Pc(188) int local188 = (Static7.mapElements.positions[local158] >> 14 & 0x3FFF) - Static5.originX;
						@Pc(197) int local197 = (Static7.mapElements.positions[local158] & 0x3FFF) - Static7.originZ;
						if (local188 >= 0 && local188 < 104 && local197 >= 0 && local197 < 104) {
							@Pc(227) int local227 = local188 * 4 + 2 - PlayerList.self.xFine / 32;
							@Pc(239) int local239 = local197 * 4 + 2 - PlayerList.self.zFine / 32;
							Static35.method4360(arg3, arg2, arg0, Static7.mapElements.elements[local158].id, local227, local239);
						}
					}
				}
			}
			for (@Pc(258) int local258 = 0; local258 < Static6.anInt4434; local258++) {
				@Pc(277) int local277 = Static3.anIntArray189[local258] * 4 + 2 - PlayerList.self.xFine / 32;
				@Pc(292) int local292 = Static2.anIntArray187[local258] * 4 + 2 - PlayerList.self.zFine / 32;
				@Pc(298) LocType local298 = LocTypeList.get(Static1.anIntArray15[local258]);
				if (local298.multiLocs != null) {
					local298 = local298.getMultiLoc();
					if (local298 == null || local298.anInt5526 == -1) {
						continue;
					}
				}
				Static35.method4360(arg3, arg2, arg0, local298.anInt5526, local277, local292);
			}
			for (@Pc(329) int local329 = 0; local329 < 104; local329++) {
				for (@Pc(334) int local334 = 0; local334 < 104; local334++) {
					@Pc(347) LinkedList local347 = Static4.objStacks[Player.level][local329][local334];
					if (local347 != null) {
						@Pc(362) int local362 = local329 * 4 + 2 - PlayerList.self.xFine / 32;
						@Pc(374) int local374 = local334 * 4 + 2 - PlayerList.self.zFine / 32;
						Static11.method525(arg0, arg2, arg3, local362, local374, Sprites.mapDots[0]);
					}
				}
			}
			for (@Pc(394) int local394 = 0; local394 < NpcList.size; local394++) {
				@Pc(407) Npc local407 = NpcList.npcs[NpcList.ids[local394]];
				if (local407 != null && local407.isVisible()) {
					@Pc(418) NpcType local418 = local407.type;
					if (local418 != null && local418.multiNpcs != null) {
						local418 = local418.getMultiNpc();
					}
					if (local418 != null && local418.aBoolean356 && local418.aBoolean357) {
						@Pc(448) int local448 = local407.xFine / 32 - PlayerList.self.xFine / 32;
						@Pc(459) int local459 = local407.zFine / 32 - PlayerList.self.zFine / 32;
						if (local418.anInt5267 == -1) {
							Static11.method525(arg0, arg2, arg3, local448, local459, Sprites.mapDots[1]);
						} else {
							Static35.method4360(arg3, arg2, arg0, local418.anInt5267, local448, local459);
						}
					}
				}
			}
			for (@Pc(493) int local493 = 0; local493 < PlayerList.size; local493++) {
				@Pc(502) Player local502 = PlayerList.players[PlayerList.ids[local493]];
				if (local502 != null && local502.isVisible()) {
					@Pc(520) int local520 = local502.xFine / 32 - PlayerList.self.xFine / 32;
					@Pc(522) boolean local522 = false;
					@Pc(533) int local533 = local502.zFine / 32 - PlayerList.self.zFine / 32;
					@Pc(540) long local540 = Base37.encode(local502.username);
					for (@Pc(542) int local542 = 0; local542 < FriendsList.size; local542++) {
						if (local540 == FriendsList.encodedUsernames[local542] && FriendsList.worlds[local542] != 0) {
							local522 = true;
							break;
						}
					}
					@Pc(567) boolean local567 = false;
					for (@Pc(569) int local569 = 0; local569 < ClanChat.size; local569++) {
						if (ClanChat.members[local569].key == local540) {
							local567 = true;
							break;
						}
					}
					@Pc(588) boolean local588 = false;
					if (PlayerList.self.team != 0 && local502.team != 0 && PlayerList.self.team == local502.team) {
						local588 = true;
					}
					if (local522) {
						Static11.method525(arg0, arg2, arg3, local520, local533, Sprites.mapDots[3]);
					} else if (local567) {
						Static11.method525(arg0, arg2, arg3, local520, local533, Sprites.mapDots[5]);
					} else if (local588) {
						Static11.method525(arg0, arg2, arg3, local520, local533, Sprites.mapDots[4]);
					} else {
						Static11.method525(arg0, arg2, arg3, local520, local533, Sprites.mapDots[2]);
					}
				}
			}
			@Pc(670) int local670 = 0;
			@Pc(672) HintArrow[] local672 = HintArrowManager.HINT_ARROWS;
			while (local672.length > local670) {
				@Pc(684) HintArrow local684 = local672[local670];
				if (local684 != null && local684.type != 0 && client.loop % 20 < 10) {
					if (local684.type == 1 && local684.target >= 0 && local684.target < NpcList.npcs.length) {
						@Pc(717) Npc local717 = NpcList.npcs[local684.target];
						if (local717 != null) {
							@Pc(731) int local731 = local717.zFine / 32 - PlayerList.self.zFine / 32;
							@Pc(742) int local742 = local717.xFine / 32 - PlayerList.self.xFine / 32;
							Static30.method3619(arg2, 360000, arg0, local731, arg3, local742, local684.headIcon);
						}
					}
					if (local684.type == 2) {
						@Pc(774) int local774 = (local684.z - Static7.originZ) * 4 + 2 - PlayerList.self.zFine / 32;
						@Pc(779) int local779 = local684.radius * 4;
						@Pc(795) int local795 = (local684.x - Static5.originX) * 4 + 2 - PlayerList.self.xFine / 32;
						local779 *= local779;
						Static30.method3619(arg2, local779, arg0, local774, arg3, local795, local684.headIcon);
					}
					if (local684.type == 10 && local684.target >= 0 && local684.target < PlayerList.players.length) {
						@Pc(834) Player local834 = PlayerList.players[local684.target];
						if (local834 != null) {
							@Pc(847) int local847 = local834.xFine / 32 - PlayerList.self.xFine / 32;
							@Pc(858) int local858 = local834.zFine / 32 - PlayerList.self.zFine / 32;
							Static30.method3619(arg2, 360000, arg0, local858, arg3, local847, local684.headIcon);
						}
					}
				}
				local670++;
			}
			if (MiniMap.flagX != 0) {
				@Pc(895) int local895 = MiniMap.flagX * 4 + PlayerList.self.getSize() * 2 + 2 - PlayerList.self.xFine / 32 - 2;
				@Pc(917) int local917 = MiniMap.flagY * 4 + PlayerList.self.getSize() * 2 + 2 - PlayerList.self.zFine / 32 - 2;
				Static11.method525(arg0, arg2, arg3, local895, local917, Sprites.mapFlag[MiniMap.aBoolean147 ? 1 : 0]);
			}
			if (GlRenderer.enabled) {
				GlRaster.fillRect(arg0 + arg2.width / 2 - 1, arg2.height / 2 + arg3 - 1, 3, 3, 16777215);
			} else {
				SoftwareRaster.fillRect(arg0 + arg2.width / 2 - 1, arg2.height / 2 + arg3 - 1, 3, 3, 16777215);
			}
		} else if (GlRenderer.enabled) {
			@Pc(64) Sprite local64 = arg2.method4729(false);
			if (local64 != null) {
				local64.renderTransparent(arg0, arg3);
			}
		} else {
			SoftwareRaster.method4210(arg0, arg3, arg2.anIntArray672, arg2.anIntArray657);
		}
		Static6.aBooleanArray24[arg1] = true;
	}

}
