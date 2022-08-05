import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class LightingManager {
	@OriginalMember(owner = "client!od", name = "p", descriptor = "[F")
	private static final float[] tempPosition = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!od", name = "a", descriptor = "I")
	public static int width;

	@OriginalMember(owner = "client!od", name = "b", descriptor = "I")
	public static int length;

	@OriginalMember(owner = "client!od", name = "c", descriptor = "[Lclient!em;")
	public static Light[] lights;

	@OriginalMember(owner = "client!od", name = "d", descriptor = "I")
	private static int anInt3734;

	@OriginalMember(owner = "client!od", name = "e", descriptor = "I")
	private static int anInt3735;

	@OriginalMember(owner = "client!od", name = "f", descriptor = "[[[I")
	private static int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!od", name = "i", descriptor = "I")
	private static int anInt3737;

	@OriginalMember(owner = "client!od", name = "j", descriptor = "[I")
	private static int[] anIntArray403;

	@OriginalMember(owner = "client!od", name = "k", descriptor = "I")
	public static int height;

	@OriginalMember(owner = "client!od", name = "l", descriptor = "[Z")
	private static boolean[] enabledLights;

	@OriginalMember(owner = "client!od", name = "m", descriptor = "I")
	private static int anInt3739;

	@OriginalMember(owner = "client!od", name = "n", descriptor = "I")
	private static int anInt3740;

	@OriginalMember(owner = "client!od", name = "o", descriptor = "[I")
	private static int[] anIntArray404;

	@OriginalMember(owner = "client!od", name = "g", descriptor = "[Z")
	private static boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!od", name = "h", descriptor = "I")
	public static int lightCount = 0;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(III)V")
	public static void method3109() {
		height = 4;
		width = 104;
		length = 104;
		anIntArrayArrayArray10 = new int[height][width][length];
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "()V")
	public static void method3110() {
		lightCount = 0;
		for (@Pc(3) int y = 0; y < height; y++) {
			for (@Pc(8) int x = 0; x < width; x++) {
				for (@Pc(13) int z = 0; z < length; z++) {
					anIntArrayArrayArray10[y][x][z] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZ)V")
	public static void method3111(@OriginalArg(0) int loop, @OriginalArg(1) boolean disableFlicker) {
		for (@Pc(1) int i = 0; i < lightCount; i++) {
			lights[i].method1076(loop, disableFlicker);
		}
		anInt3734 = -1;
		anInt3737 = -1;
		anInt3740 = -1;
		anInt3735 = -1;
		anInt3739 = -1;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "()V")
	public static void method3112() {
		for (@Pc(1) int i = 0; i < 4; i++) {
			anIntArray403[i] = -1;
			disableLight(i);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!em;)V")
	public static void addLight(@OriginalArg(0) Light light) {
		if (lightCount >= 255) {
			System.out.println("Number of lights added exceeds maximum!");
		} else {
			lights[lightCount++] = light;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIII)V")
	public static void method3114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int y, @OriginalArg(4) int x, @OriginalArg(5) int z) {
		if (!Preferences.highDetailLighting || anInt3734 == y && anInt3737 == x && anInt3740 == z && anInt3735 == x && anInt3739 == z) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			aBooleanArray20[local20] = false;
		}
		@Pc(31) int local31 = 0;
		@Pc(39) int local39 = anIntArrayArrayArray10[y][x][z];
		while (true) {
			label72:
			while (local39 != 0) {
				@Pc(47) int local47 = (local39 & 0xFF) - 1;
				local39 >>>= 8;
				for (@Pc(53) int local53 = 0; local53 < 4; local53++) {
					if (local47 == anIntArray403[local53]) {
						aBooleanArray20[local53] = true;
						continue label72;
					}
				}
				anIntArray404[local31++] = local47;
			}
			for (@Pc(76) int local76 = 0; local76 < local31; local76++) {
				for (@Pc(81) int local81 = 0; local81 < 4; local81++) {
					if (!aBooleanArray20[local81]) {
						anIntArray403[local81] = anIntArray404[local76];
						aBooleanArray20[local81] = true;
						enableLight(local81, lights[anIntArray404[local76]], arg0, arg1, arg2);
						break;
					}
				}
			}
			for (@Pc(115) int local115 = 0; local115 < 4; local115++) {
				if (!aBooleanArray20[local115]) {
					anIntArray403[local115] = -1;
					disableLight(local115);
				}
			}
			anInt3734 = y;
			anInt3737 = x;
			anInt3740 = z;
			anInt3735 = x;
			anInt3739 = z;
			return;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!Preferences.highDetailLighting || anInt3734 == arg3 && anInt3737 == arg4 && anInt3740 == arg5 && anInt3735 == arg6 && anInt3739 == arg7) {
			return;
		}
		for (@Pc(20) int i = 0; i < 4; i++) {
			aBooleanArray20[i] = false;
		}
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		label112:
		for (@Pc(35) int local35 = arg4; local35 <= arg6; local35++) {
			label110:
			for (@Pc(40) int local40 = arg5; local40 <= arg7; local40++) {
				@Pc(51) int local51 = anIntArrayArrayArray10[arg3][local35][local40];
				while (true) {
					while (true) {
						label96:
						while (true) {
							if (local51 == 0) {
								continue label110;
							}
							@Pc(59) int local59 = (local51 & 0xFF) - 1;
							local51 >>>= 8;
							for (@Pc(65) int local65 = 0; local65 < local33; local65++) {
								if (local59 == anIntArray404[local65]) {
									continue label96;
								}
							}
							for (@Pc(78) int local78 = 0; local78 < 4; local78++) {
								if (local59 == anIntArray403[local78]) {
									if (!aBooleanArray20[local78]) {
										aBooleanArray20[local78] = true;
										local31++;
										if (local31 == 4) {
											break label112;
										}
									}
									continue label96;
								}
							}
							anIntArray404[local33++] = local59;
							local31++;
							if (local31 == 4) {
								break label112;
							}
						}
					}
				}
			}
		}
		for (@Pc(118) int local118 = 0; local118 < local33; local118++) {
			for (@Pc(123) int local123 = 0; local123 < 4; local123++) {
				if (!aBooleanArray20[local123]) {
					anIntArray403[local123] = anIntArray404[local118];
					aBooleanArray20[local123] = true;
					enableLight(local123, lights[anIntArray404[local118]], arg0, arg1, arg2);
					break;
				}
			}
		}
		for (@Pc(157) int local157 = 0; local157 < 4; local157++) {
			if (!aBooleanArray20[local157]) {
				anIntArray403[local157] = -1;
				disableLight(local157);
			}
		}
		anInt3734 = arg3;
		anInt3737 = arg4;
		anInt3740 = arg5;
		anInt3735 = arg6;
		anInt3739 = arg7;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II[[[Lclient!nh;)V")
	public static void method3116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Tile[][][] tiles) {
		if (!Preferences.highDetailLighting) {
			return;
		}
		@Pc(4) GL gl = GlRenderer.gl;
		MaterialManager.setMaterial(0, 0);
		GlRenderer.setTextureCombineRgbMode(0);
		GlRenderer.resetTextureMatrix();
		GlRenderer.setTextureId(GlRenderer.anInt2075);
		gl.glDepthMask(false);
		GlRenderer.setLightingEnabled(false);
		gl.glBlendFunc(GL.GL_DST_COLOR, GL.GL_ONE);
		gl.glFogfv(GL.GL_FOG_COLOR, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_CONSTANT);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_OPERAND0_RGB, GL.GL_SRC_ALPHA);
		nextLight:
		for (@Pc(56) int i = 0; i < lightCount; i++) {
			@Pc(63) Light light = lights[i];
			@Pc(66) int level = light.level;
			if (light.linkBelow) {
				level--;
			}
			if (light.groundModel != null) {
				@Pc(76) int local76 = 0;
				@Pc(84) int z0 = (light.z >> 7) - light.radius;
				@Pc(92) int z1 = (light.z >> 7) + light.radius;
				if (z1 >= Static2.anInt1344) {
					z1 = Static2.anInt1344 - 1;
				}
				if (z0 < Static1.anInt890) {
					local76 = Static1.anInt890 - z0;
					z0 = Static1.anInt890;
				}
				for (@Pc(112) int z = z0; z <= z1; z++) {
					@Pc(121) short local121 = light.aShortArray28[local76++];
					@Pc(133) int x0 = (light.x >> 7) + (local121 >> 8) - light.radius;
					@Pc(141) int x1 = x0 + (local121 & 0xFF) - 1;
					if (x0 < Static6.anInt4978) {
						x0 = Static6.anInt4978;
					}
					if (x1 >= Static2.anInt5778) {
						x1 = Static2.anInt5778 - 1;
					}
					for (@Pc(155) int x = x0; x <= x1; x++) {
						@Pc(160) Tile tile = null;
						if (level >= 0) {
							tile = tiles[level][x][z];
						}
						if (level < 0 || tile != null && tile.aBoolean257) {
							GlRenderer.method1613(201.5F - (float) light.level * 50.0F - 1.5F);
							gl.glTexEnvfv(GL.GL_TEXTURE_ENV, GL.GL_TEXTURE_ENV_COLOR, new float[] { 0.0F, 0.0F, 0.0F, light.alpha }, 0);
							light.groundModel.render();
							continue nextLight;
						}
					}
				}
			}
		}
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_TEXTURE);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_OPERAND0_RGB, GL.GL_SRC_COLOR);
		gl.glBlendFunc(GL.GL_SRC_ALPHA, GL.GL_ONE_MINUS_SRC_ALPHA);
		gl.glDepthMask(true);
		gl.glFogfv(GL.GL_FOG_COLOR, Static4.aFloatArray39, 0);
		gl.glEnableClientState(GL.GL_TEXTURE_COORD_ARRAY);
		GlRenderer.method1618();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIII)V")
	public static void method3117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!Preferences.highDetailLighting) {
			return;
		}
		label43:
		for (@Pc(4) int i = 0; i < 4; i++) {
			if (anIntArray403[i] != -1) {
				@Pc(20) int local20 = anIntArrayArrayArray10[arg0][arg1][arg2];
				while (local20 != 0) {
					@Pc(28) int local28 = (local20 & 0xFF) - 1;
					local20 >>>= 8;
					if (local28 == anIntArray403[i]) {
						continue label43;
					}
				}
				@Pc(47) int local47 = anIntArrayArrayArray10[arg0][arg3][arg4];
				while (local47 != 0) {
					@Pc(55) int local55 = (local47 & 0xFF) - 1;
					local47 >>>= 8;
					if (local55 == anIntArray403[i]) {
						continue label43;
					}
				}
			}
			anIntArray403[i] = -1;
			disableLight(i);
		}
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "()V")
	public static void method3118() {
		@Pc(1) GL gl = GlRenderer.gl;
		for (@Pc(3) int i = 0; i < 4; i++) {
			@Pc(10) int light = i + 16388;
			gl.glLightfv(light, GL.GL_AMBIENT, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			gl.glLightf(light, GL.GL_LINEAR_ATTENUATION, 0.0F);
			gl.glLightf(light, GL.GL_CONSTANT_ATTENUATION, 0.0F);
		}
		for (@Pc(47) int i = 0; i < 4; i++) {
			anIntArray403[i] = -1;
			disableLight(i);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIII)V")
	public static void method3119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int y, @OriginalArg(5) int x, @OriginalArg(6) int z) {
		if (!Preferences.highDetailLighting) {
			return;
		}
		if (arg0 == 1 && x > 0) {
			method3114(arg1, arg2, arg3, y, x - 1, z);
		} else if (arg0 == 4 && x < width - 1) {
			method3114(arg1, arg2, arg3, y, x + 1, z);
		} else if (arg0 == 8 && z > 0) {
			method3114(arg1, arg2, arg3, y, x, z - 1);
		} else if (arg0 == 2 && z < length - 1) {
			method3114(arg1, arg2, arg3, y, x, z + 1);
		} else if (arg0 == 16 && x > 0 && z < length - 1) {
			method3114(arg1, arg2, arg3, y, x - 1, z + 1);
		} else if (arg0 == 32 && x < width - 1 && z < length - 1) {
			method3114(arg1, arg2, arg3, y, x + 1, z + 1);
		} else if (arg0 == 128 && x > 0 && z > 0) {
			method3114(arg1, arg2, arg3, y, x - 1, z - 1);
		} else if (arg0 == 64 && x < width - 1 && z > 0) {
			method3114(arg1, arg2, arg3, y, x + 1, z - 1);
		}
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "()V")
	public static void method3120() {
		lights = new Light[255];
		anIntArray403 = new int[4];
		enabledLights = new boolean[4];
		anIntArray404 = new int[4];
		aBooleanArray20 = new boolean[4];
		anIntArrayArrayArray10 = new int[height][width][length];
	}

	@OriginalMember(owner = "client!od", name = "f", descriptor = "()V")
	public static void method3122() {
		for (@Pc(1) int i = 0; i < lightCount; i++) {
			@Pc(8) Light light = lights[i];
			@Pc(11) int minY = light.level;
			if (light.aBoolean78) {
				minY = 0;
			}
			@Pc(19) int maxY = light.level;
			if (light.aBoolean79) {
				maxY = 3;
			}
			for (@Pc(26) int y = minY; y <= maxY; y++) {
				@Pc(31) int local31 = 0;
				@Pc(39) int minZ = (light.z >> 7) - light.radius;
				if (minZ < 0) {
					local31 = -minZ;
					minZ = 0;
				}
				@Pc(55) int maxZ = (light.z >> 7) + light.radius;
				if (maxZ > length - 1) {
					maxZ = length - 1;
				}
				for (@Pc(66) int z = minZ; z <= maxZ; z++) {
					@Pc(75) short local75 = light.aShortArray28[local31++];
					@Pc(87) int minX = (light.x >> 7) + (local75 >> 8) - light.radius;
					@Pc(95) int maxX = minX + (local75 & 0xFF) - 1;
					if (minX < 0) {
						minX = 0;
					}
					if (maxX > width - 1) {
						maxX = width - 1;
					}
					for (@Pc(110) int x = minX; x <= maxX; x++) {
						@Pc(121) int local121 = anIntArrayArrayArray10[y][x][z];
						if ((local121 & 0xFF) == 0) {
							anIntArrayArrayArray10[y][x][z] = local121 | i + 1;
						} else if ((local121 & 0xFF00) == 0) {
							anIntArrayArrayArray10[y][x][z] = local121 | i + 1 << 8;
						} else if ((local121 & 0xFF0000) == 0) {
							anIntArrayArrayArray10[y][x][z] = local121 | i + 1 << 16;
						} else if ((local121 & 0xFF000000) == 0) {
							anIntArrayArrayArray10[y][x][z] = local121 | i + 1 << 24;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "g", descriptor = "()V")
	public static void method3123() {
		lights = null;
		anIntArray403 = null;
		enabledLights = null;
		anIntArray404 = null;
		aBooleanArray20 = null;
		anIntArrayArrayArray10 = null;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
	private static void disableLight(@OriginalArg(0) int i) {
		if (enabledLights[i]) {
			enabledLights[i] = false;
			@Pc(14) int light = i + 16384 + 4;
			@Pc(16) GL gl = GlRenderer.gl;
			gl.glDisable(light);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!em;III)V")
	private static void enableLight(@OriginalArg(0) int i, @OriginalArg(1) Light light, @OriginalArg(2) int x, @OriginalArg(3) int y, @OriginalArg(4) int z) {
		@Pc(5) int lightId = i + 16384 + 4;
		@Pc(7) GL gl = GlRenderer.gl;
		if (!enabledLights[i]) {
			gl.glEnable(lightId);
			enabledLights[i] = true;
		}
		gl.glLightf(lightId, GL.GL_QUADRATIC_ATTENUATION, light.quadraticAttenuation);
		gl.glLightfv(lightId, GL.GL_DIFFUSE, light.diffuse, 0);
		tempPosition[0] = light.x - x;
		tempPosition[1] = light.y - y;
		tempPosition[2] = light.z - z;
		gl.glLightfv(lightId, GL.GL_POSITION, tempPosition, 0);
	}
}
