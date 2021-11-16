import java.nio.ByteBuffer;
import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!em;[I[[FIILclient!pi;[[FI[[FI[[I)V")
	public static void method1778(@OriginalArg(0) Light arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class135 arg5, @OriginalArg(6) float[][] arg6, @OriginalArg(8) float[][] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[][] arg9) {
		@Pc(11) int[] local11 = new int[arg1.length / 2];
		for (@Pc(20) int local20 = 0; local20 < local11.length; local20++) {
			@Pc(34) int local34 = arg1[local20 + local20];
			@Pc(42) int local42 = arg1[local20 + local20 + 1];
			if (arg8 == 1) {
				@Pc(47) int local47 = local34;
				local34 = local42;
				local42 = 128 - local47;
			} else if (arg8 == 2) {
				local34 = 128 - local34;
				local42 = 128 - local42;
			} else if (arg8 == 3) {
				@Pc(81) int local81 = local34;
				local34 = 128 - local42;
				local42 = local81;
			}
			@Pc(109) float local109;
			@Pc(125) float local125;
			@Pc(117) float local117;
			if (local34 == 0 && local42 == 0) {
				local109 = arg6[arg4][arg3];
				local125 = arg7[arg4][arg3];
				local117 = arg2[arg4][arg3];
			} else if (local34 == 128 && local42 == 0) {
				local109 = arg6[arg4 + 1][arg3];
				local117 = arg2[arg4 + 1][arg3];
				local125 = arg7[arg4 + 1][arg3];
			} else if (local34 == 128 && local42 == 128) {
				local109 = arg6[arg4 + 1][arg3 + 1];
				local117 = arg2[arg4 + 1][arg3 + 1];
				local125 = arg7[arg4 + 1][arg3 + 1];
			} else if (local34 == 0 && local42 == 128) {
				local125 = arg7[arg4][arg3 + 1];
				local109 = arg6[arg4][arg3 + 1];
				local117 = arg2[arg4][arg3 + 1];
			} else {
				@Pc(151) float local151 = arg7[arg4][arg3];
				@Pc(156) float local156 = (float) local34 / 128.0F;
				@Pc(162) float local162 = arg2[arg4][arg3];
				local162 += (arg2[arg4 + 1][arg3] - local162) * local156;
				local151 += local156 * (arg7[arg4 + 1][arg3] - local151);
				@Pc(198) float local198 = arg6[arg4][arg3];
				@Pc(206) float local206 = arg2[arg4][arg3 + 1];
				local198 += (arg6[arg4 + 1][arg3] - local198) * local156;
				@Pc(225) float local225 = (float) local42 / 128.0F;
				@Pc(233) float local233 = arg7[arg4][arg3 + 1];
				@Pc(241) float local241 = arg6[arg4][arg3 + 1];
				local241 += (arg6[arg4 + 1][arg3 + 1] - local241) * local156;
				local109 = local198 + (local241 - local198) * local225;
				local233 += (arg7[arg4 + 1][arg3 + 1] - local233) * local156;
				local206 += local156 * (arg2[arg4 + 1][arg3 + 1] - local206);
				local117 = local162 + local225 * (local206 - local162);
				local125 = local151 + (local233 - local151) * local225;
			}
			@Pc(401) int local401 = local34 + (arg4 << 7);
			@Pc(407) int local407 = (arg3 << 7) + local42;
			@Pc(415) int local415 = Static9.method206(local34, arg4, local42, arg9, arg3);
			local11[local20] = arg5.method3435(arg0, local401, local415, local407, local109, local125, local117);
		}
		arg5.method3431(local11);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIIII)V")
	public static void method4379(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		ArrayUtils.fillRange(Static5.anIntArrayArray36[arg3], arg1 - arg4, arg4 + arg1, arg2);
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = arg0;
		@Pc(26) int local26 = arg4 * arg4;
		@Pc(34) int local34 = arg0 * arg0;
		@Pc(38) int local38 = local26 << 1;
		@Pc(42) int local42 = arg0 << 1;
		@Pc(46) int local46 = local34 << 1;
		@Pc(54) int local54 = local34 - local38 * (local42 - 1);
		@Pc(63) int local63 = local46 + (1 - local42) * local26;
		@Pc(67) int local67 = local26 << 2;
		@Pc(75) int local75 = local46 * 3;
		@Pc(83) int local83 = local38 * ((arg0 << 1) - 3);
		@Pc(87) int local87 = local34 << 2;
		@Pc(93) int local93 = local87;
		@Pc(99) int local99 = (arg0 - 1) * local67;
		while (local22 > 0) {
			if (local63 < 0) {
				while (local63 < 0) {
					local20++;
					local63 += local75;
					local54 += local93;
					local93 += local87;
					local75 += local87;
				}
			}
			local22--;
			if (local54 < 0) {
				local54 += local93;
				local63 += local75;
				local75 += local87;
				local93 += local87;
				local20++;
			}
			@Pc(150) int local150 = arg3 - local22;
			local63 += -local99;
			@Pc(159) int local159 = arg1 + local20;
			local99 -= local67;
			@Pc(167) int local167 = local22 + arg3;
			local54 += -local83;
			local83 -= local67;
			@Pc(181) int local181 = arg1 - local20;
			ArrayUtils.fillRange(Static5.anIntArrayArray36[local150], local181, local159, arg2);
			ArrayUtils.fillRange(Static5.anIntArrayArray36[local167], local181, local159, arg2);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
	public static void logout() {
		if (Protocol.socket != null) {
			Protocol.socket.close();
			Protocol.socket = null;
		}
		Static24.method2697();
		SceneGraph.clear();
		for (@Pc(18) int level = 0; level < 4; level++) {
			PathFinder.collisionMaps[level].clear();
		}
		WorldMap.clear(false);
		System.gc();
		MidiPlayer.method971();
		MusicPlayer.groupId = -1;
		MusicPlayer.jingle = false;
		AreaSoundManager.clear(true);
		Static7.originZ = 0;
		Static4.centralZoneX = 0;
		Static1.centralZoneZ = 0;
		Static5.dynamicArea = false;
		Static5.originX = 0;
		for (@Pc(57) int i = 0; i < HintArrowManager.HINT_ARROWS.length; i++) {
			HintArrowManager.HINT_ARROWS[i] = null;
		}
		NpcList.size = 0;
		PlayerList.size = 0;
		for (@Pc(78) int i = 0; i < 2048; i++) {
			PlayerList.players[i] = null;
			PlayerList.appearanceCache[i] = null;
		}
		for (@Pc(96) int i = 0; i < 32768; i++) {
			NpcList.npcs[i] = null;
		}
		for (@Pc(110) int level = 0; level < 4; level++) {
			for (@Pc(117) int x = 0; x < 104; x++) {
				for (@Pc(122) int z = 0; z < 104; z++) {
					Static4.objStacks[level][x][z] = null;
				}
			}
		}
		Static24.method2563();
		Protocol.verifyId = 0;
		VarpDomain.clear();
		Static11.method605(true);
		try {
			BrowserControl.call(GameShell.signLink.applet, "loggedout");
		} catch (@Pc(159) Throwable local159) {
		}
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "()V")
	public static void method1855() {
		Static3.aBoolean160 = GlRenderer.extTexture3dSupported;
		method1859();
		method1856();
		method1857();
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "()V")
	private static void method1856() {
		@Pc(1) GL gl = GlRenderer.gl;
		if (Static3.aBoolean160) {
			@Pc(6) int[] ids = new int[1];
			gl.glGenTextures(1, ids, 0);
			gl.glBindTexture(GL.GL_TEXTURE_3D, ids[0]);
			Static3.aByteBuffer3.position(0);
			gl.glTexImage3D(GL.GL_TEXTURE_3D, GL.GL_POINTS, GL.GL_LUMINANCE_ALPHA, 64, 64, 64, GL.GL_POINTS, GL.GL_LUMINANCE_ALPHA, GL.GL_UNSIGNED_BYTE, Static3.aByteBuffer3);
			gl.glTexParameteri(GL.GL_TEXTURE_3D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
			gl.glTexParameteri(GL.GL_TEXTURE_3D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
			Static3.anInt2342 = ids[0];
			GlCleaner.onCardTexture += Static3.aByteBuffer3.limit() * 2;
			return;
		}
		Static3.anIntArray198 = new int[64];
		gl.glGenTextures(64, Static3.anIntArray198, 0);
		for (@Pc(65) int i = 0; i < 64; i++) {
			GlRenderer.setTextureId(Static3.anIntArray198[i]);
			Static3.aByteBuffer3.position(i * 64 * 64 * 2);
			gl.glTexImage2D(GL.GL_TEXTURE_2D, GL.GL_POINTS, GL.GL_LUMINANCE_ALPHA, 64, 64, GL.GL_POINTS, GL.GL_LUMINANCE_ALPHA, GL.GL_UNSIGNED_BYTE, Static3.aByteBuffer3);
			gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
			gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
		}
		GlCleaner.onCardTexture += Static3.aByteBuffer3.limit() * 2;
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "()V")
	private static void method1857() {
		@Pc(1) GL gl = GlRenderer.gl;
		if (Static3.aBoolean160) {
			@Pc(6) int[] ids = new int[1];
			gl.glGenTextures(1, ids, 0);
			gl.glBindTexture(GL.GL_TEXTURE_3D, ids[0]);
			Static3.aByteBuffer2.position(0);
			gl.glTexImage3D(GL.GL_TEXTURE_3D, GL.GL_POINTS, GL.GL_LUMINANCE_ALPHA, 64, 64, 64, GL.GL_POINTS, GL.GL_LUMINANCE_ALPHA, GL.GL_UNSIGNED_BYTE, Static3.aByteBuffer2);
			gl.glTexParameteri(GL.GL_TEXTURE_3D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
			gl.glTexParameteri(GL.GL_TEXTURE_3D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
			Static3.anInt2341 = ids[0];
			GlCleaner.onCardTexture += Static3.aByteBuffer2.limit() * 2;
			return;
		}
		Static3.anIntArray199 = new int[64];
		gl.glGenTextures(64, Static3.anIntArray199, 0);
		for (@Pc(65) int i = 0; i < 64; i++) {
			GlRenderer.setTextureId(Static3.anIntArray199[i]);
			Static3.aByteBuffer2.position(i * 64 * 64 * 2);
			gl.glTexImage2D(GL.GL_TEXTURE_2D, GL.GL_POINTS, GL.GL_LUMINANCE_ALPHA, 64, 64, GL.GL_POINTS, GL.GL_LUMINANCE_ALPHA, GL.GL_UNSIGNED_BYTE, Static3.aByteBuffer2);
			gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
			gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
		}
		GlCleaner.onCardTexture += Static3.aByteBuffer2.limit() * 2;
	}

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "()V")
	public static void method1858() {
		if (Static3.anInt2342 != -1) {
			@Pc(4) GL gl = GlRenderer.gl;
			@Pc(11) int[] ids = new int[] { Static3.anInt2342 };
			gl.glDeleteTextures(1, ids, 0);
			Static3.anInt2342 = -1;
			GlCleaner.onCardTexture -= Static3.aByteBuffer3.limit() * 2;
		}
		if (Static3.anIntArray198 != null) {
			@Pc(29) GL gl = GlRenderer.gl;
			gl.glDeleteTextures(64, Static3.anIntArray198, 0);
			Static3.anIntArray198 = null;
			GlCleaner.onCardTexture -= Static3.aByteBuffer3.limit() * 2;
		}
		if (Static3.anInt2341 != -1) {
			@Pc(48) GL gl = GlRenderer.gl;
			@Pc(55) int[] ids = new int[] { Static3.anInt2341 };
			gl.glDeleteTextures(1, ids, 0);
			Static3.anInt2341 = -1;
			GlCleaner.onCardTexture -= Static3.aByteBuffer2.limit() * 2;
		}
		if (Static3.anIntArray199 != null) {
			@Pc(73) GL gl = GlRenderer.gl;
			gl.glDeleteTextures(64, Static3.anIntArray199, 0);
			Static3.anIntArray199 = null;
			GlCleaner.onCardTexture -= Static3.aByteBuffer2.limit() * 2;
		}
	}

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "()V")
	public static void method1859() {
		if (Static3.aByteBuffer3 == null) {
			@Pc(5) Class41_Sub1_Sub1 local5 = new Class41_Sub1_Sub1();
			@Pc(11) byte[] local11 = local5.method938();
			Static3.aByteBuffer3 = ByteBuffer.allocateDirect(local11.length);
			Static3.aByteBuffer3.position(0);
			Static3.aByteBuffer3.put(local11);
			Static3.aByteBuffer3.flip();
		}
		if (Static3.aByteBuffer2 != null) {
			return;
		}
		@Pc(32) Class41_Sub2_Sub1 local32 = new Class41_Sub2_Sub1();
		@Pc(38) byte[] local38 = local32.method3156();
		Static3.aByteBuffer2 = ByteBuffer.allocateDirect(local38.length);
		Static3.aByteBuffer2.position(0);
		Static3.aByteBuffer2.put(local38);
		Static3.aByteBuffer2.flip();
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "()V")
	public static void method1868() {
		Static3.aClass4_Sub10_4 = null;
		Static3.aClass4_Sub10_5 = null;
		Static3.aByteBuffer5 = null;
		Static3.aByteBuffer4 = null;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		Static3.anInt2973 = arg0;
		Static3.anInt2967 = arg1;
		Static3.anInt2972 = arg2;
		Static3.anInt2966 = arg3;
		Static3.anInt2969 = arg4;
		Static3.anInt2968 = arg5;
		Static3.anInt2970 = arg6;
		Static3.anInt2971 = arg7;
	}

}
