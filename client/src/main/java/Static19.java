import java.nio.ByteBuffer;
import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZI)V")
	public static void method1773(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class4_Sub3_Sub9 local14 = Static12.method2322(6, arg1);
		local14.method1520();
		local14.anInt1993 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "(I)Lclient!gb;")
	public static Class63_Sub1 method1777() {
		return Static3.aClass63_Sub1Array2.length <= Static6.anInt3224 ? null : Static3.aClass63_Sub1Array2[Static6.anInt3224++];
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!em;[I[[FIILclient!pi;[[FI[[FI[[I)V")
	public static void method1778(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class135 arg5, @OriginalArg(6) float[][] arg6, @OriginalArg(8) float[][] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[][] arg9) {
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

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method1791(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "(I)V")
	public static void method1793() {
		Static3.aClass26_26.method515();
	}

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "(I)I")
	public static int method1794() {
		return Static5.anInt4279;
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V")
	public static void method4376() {
		Static1.aClass26_2.method511();
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIZ)Ljava/lang/String;")
	public static String method4377(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(46) int local46 = 2;
		for (@Pc(50) int local50 = arg0 / 10; local50 != 0; local50 /= 10) {
			local46++;
		}
		@Pc(65) char[] local65 = new char[local46];
		local65[0] = '+';
		for (@Pc(73) int local73 = local46 - 1; local73 > 0; local73--) {
			@Pc(78) int local78 = arg0;
			arg0 /= 10;
			@Pc(89) int local89 = local78 - arg0 * 10;
			if (local89 >= 10) {
				local65[local73] = (char) (local89 + 87);
			} else {
				local65[local73] = (char) (local89 + 48);
			}
		}
		return new String(local65);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZI)V")
	public static void method4378(@OriginalArg(0) boolean arg0) {
		if (arg0 != Static5.aBoolean301) {
			Static5.aBoolean301 = arg0;
			Static13.method884();
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIIII)V")
	public static void method4379(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static18.method1656(Static5.anIntArrayArray36[arg3], arg2, arg1 - arg4, arg4 + arg1);
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
			Static18.method1656(Static5.anIntArrayArray36[local150], arg2, local181, local159);
			Static18.method1656(Static5.anIntArrayArray36[local167], arg2, local181, local159);
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(B[I[J)V")
	public static void method1805(@OriginalArg(1) int[] arg0, @OriginalArg(2) long[] arg1) {
		Static11.method572(arg1.length - 1, arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(II)Ljava/lang/String;")
	private static String method1807(@OriginalArg(0) int arg0) {
		return arg0 >= 999999999 ? "*" : Integer.toString(arg0);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)Lclient!wf;")
	public static Class185 method1813(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(19) int local19 = arg0 & 0xFFFF;
		if (Static5.aClass185ArrayArray115[local7] == null || Static5.aClass185ArrayArray115[local7][local19] == null) {
			@Pc(34) boolean local34 = Static15.method1364(local7);
			if (!local34) {
				return null;
			}
		}
		return Static5.aClass185ArrayArray115[local7][local19];
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)Lclient!jc;")
	public static Class4_Sub3_Sub12 method1815(@OriginalArg(0) int arg0) {
		@Pc(16) Class4_Sub3_Sub12 local16 = (Class4_Sub3_Sub12) Static5.aClass40_14.method889((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(28) byte[] local28 = Static4.aClass58_74.method1372(11, arg0);
		@Pc(32) Class4_Sub3_Sub12 local32 = new Class4_Sub3_Sub12();
		if (local28 != null) {
			local32.method1992(new Buffer(local28));
		}
		Static5.aClass40_14.method888((long) arg0, local32);
		return local32;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(II)Lclient!qa;")
	public static Class140 method1816(@OriginalArg(1) int arg0) {
		@Pc(6) Class140 local6 = (Class140) Static7.aClass26_56.method518((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(27) byte[] local27 = Static6.aClass58_85.method1372(3, arg0);
		@Pc(31) Class140 local31 = new Class140();
		if (local27 != null) {
			local31.method3496(new Buffer(local27));
		}
		Static7.aClass26_56.method510(local31, (long) arg0);
		return local31;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
	public static void method1818() {
		if (Static3.aClass52_7 != null) {
			Static3.aClass52_7.close();
			Static3.aClass52_7 = null;
		}
		Static24.method2697();
		Static35.method4310();
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			Static7.aClass30Array1[local18].method579();
		}
		Static10.method384(false);
		System.gc();
		Static13.method971();
		Static6.anInt4844 = -1;
		Static4.aBoolean210 = false;
		Static31.method3733(true);
		Static7.anInt5479 = 0;
		Static4.anInt3360 = 0;
		Static1.anInt5 = 0;
		Static5.aBoolean294 = false;
		Static5.anInt3983 = 0;
		for (@Pc(57) int local57 = 0; local57 < Static7.aClass94Array1.length; local57++) {
			Static7.aClass94Array1[local57] = null;
		}
		Static6.anInt4451 = 0;
		Static3.anInt2510 = 0;
		for (@Pc(78) int local78 = 0; local78 < 2048; local78++) {
			Static5.aClass53_Sub1_Sub1Array1[local78] = null;
			Static6.aClass4_Sub10Array1[local78] = null;
		}
		for (@Pc(96) int local96 = 0; local96 < 32768; local96++) {
			Static3.aClass53_Sub1_Sub2Array1[local96] = null;
		}
		for (@Pc(110) int local110 = 0; local110 < 4; local110++) {
			for (@Pc(117) int local117 = 0; local117 < 104; local117++) {
				for (@Pc(122) int local122 = 0; local122 < 104; local122++) {
					Static4.aClass112ArrayArrayArray1[local110][local117][local122] = null;
				}
			}
		}
		Static24.method2563();
		Static7.anInt5426 = 0;
		Static12.method778();
		Static11.method605(true);
		try {
			BrowserControl.call(GameShell.signLink.applet, "loggedout");
		} catch (@Pc(159) Throwable local159) {
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!wf;ILjava/lang/String;)Ljava/lang/String;")
	public static String method1820(@OriginalArg(0) Class185 arg0, @OriginalArg(2) String arg1) {
		if (arg1.indexOf("%") == -1) {
			return arg1;
		}
		while (true) {
			@Pc(21) int local21 = arg1.indexOf("%1");
			if (local21 == -1) {
				while (true) {
					@Pc(54) int local54 = arg1.indexOf("%2");
					if (local54 == -1) {
						while (true) {
							@Pc(90) int local90 = arg1.indexOf("%3");
							if (local90 == -1) {
								while (true) {
									@Pc(126) int local126 = arg1.indexOf("%4");
									if (local126 == -1) {
										while (true) {
											@Pc(162) int local162 = arg1.indexOf("%5");
											if (local162 == -1) {
												while (true) {
													@Pc(194) int local194 = arg1.indexOf("%dns");
													if (local194 == -1) {
														return arg1;
													}
													@Pc(200) String local200 = "";
													if (Static1.aClass197_2 != null) {
														if (Static1.aClass197_2.result == null) {
															local200 = Static27.method3226(Static1.aClass197_2.intArg1);
														} else {
															local200 = (String) Static1.aClass197_2.result;
														}
													}
													arg1 = arg1.substring(0, local194) + local200 + arg1.substring(local194 + 4);
												}
											}
											arg1 = arg1.substring(0, local162) + method1807(Static36.method4464(4, arg0)) + arg1.substring(local162 + 2);
										}
									}
									arg1 = arg1.substring(0, local126) + method1807(Static36.method4464(3, arg0)) + arg1.substring(local126 + 2);
								}
							}
							arg1 = arg1.substring(0, local90) + method1807(Static36.method4464(2, arg0)) + arg1.substring(local90 + 2);
						}
					}
					arg1 = arg1.substring(0, local54) + method1807(Static36.method4464(1, arg0)) + arg1.substring(local54 + 2);
				}
			}
			arg1 = arg1.substring(0, local21) + method1807(Static36.method4464(0, arg0)) + arg1.substring(local21 + 2);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lgl!javax/media/opengl/GL;IIII)Z")
	public static boolean method1837(@OriginalArg(0) GL arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static17.method1600(arg4);
		arg0.glFramebufferTexture2DEXT(GL.GL_FRAMEBUFFER, GL.GL_COLOR_ATTACHMENT0, arg2, arg1, 0);
		arg0.glReadBuffer(GL.GL_COLOR_ATTACHMENT0);
		@Pc(15) int local15 = arg0.glCheckFramebufferStatusEXT(GL.GL_FRAMEBUFFER);
		if (local15 == GL.GL_FRAMEBUFFER_COMPLETE) {
			arg0.glCopyTexImage2D(GL.GL_TEXTURE_2D, GL.GL_POINTS, GL.GL_RGB, 0, 0, arg3, arg3, GL.GL_POINTS);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(IIIIII)Lclient!ib;")
	public static Class4_Sub3_Sub10 method1838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(29) long local29 = (long) arg0 * 67481L ^ (long) arg1 * 97549L ^ (long) arg2 * 475427L ^ (long) arg3 * 986053L ^ (long) arg4 * 32147369L ^ (long) arg5 * 76724863L;
		@Pc(35) Class4_Sub3_Sub10 local35 = (Class4_Sub3_Sub10) Static3.aClass40_11.method889(local29);
		if (local35 == null) {
			@Pc(49) Class4_Sub3_Sub10 local49 = new Class4_Sub3_Sub10(arg0, arg1, arg2, arg3, arg4, arg5);
			Static3.aClass40_11.method888(local29, local49);
			return local49;
		} else {
			return local35;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)I")
	public static int method1848(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BLclient!fh;)V")
	public static void method1850(@OriginalArg(1) Class58 arg0) {
		Static2.aClass58_36 = arg0;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "()V")
	public static void method1855() {
		Static3.aBoolean160 = Static3.aBoolean137;
		method1859();
		method1856();
		method1857();
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "()V")
	private static void method1856() {
		@Pc(1) GL local1 = Static3.aGL1;
		if (Static3.aBoolean160) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(GL.GL_TEXTURE_3D, local6[0]);
			Static3.aByteBuffer3.position(0);
			local1.glTexImage3D(GL.GL_TEXTURE_3D, GL.GL_POINTS, GL.GL_LUMINANCE_ALPHA, 64, 64, 64, GL.GL_POINTS, GL.GL_LUMINANCE_ALPHA, GL.GL_UNSIGNED_BYTE, Static3.aByteBuffer3);
			local1.glTexParameteri(GL.GL_TEXTURE_3D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
			local1.glTexParameteri(GL.GL_TEXTURE_3D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
			Static3.anInt2342 = local6[0];
			Static4.anInt3330 += Static3.aByteBuffer3.limit() * 2;
			return;
		}
		Static3.anIntArray198 = new int[64];
		local1.glGenTextures(64, Static3.anIntArray198, 0);
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static17.method1600(Static3.anIntArray198[local65]);
			Static3.aByteBuffer3.position(local65 * 64 * 64 * 2);
			local1.glTexImage2D(GL.GL_TEXTURE_2D, GL.GL_POINTS, GL.GL_LUMINANCE_ALPHA, 64, 64, GL.GL_POINTS, GL.GL_LUMINANCE_ALPHA, GL.GL_UNSIGNED_BYTE, Static3.aByteBuffer3);
			local1.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
			local1.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
		}
		Static4.anInt3330 += Static3.aByteBuffer3.limit() * 2;
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "()V")
	private static void method1857() {
		@Pc(1) GL local1 = Static3.aGL1;
		if (Static3.aBoolean160) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(GL.GL_TEXTURE_3D, local6[0]);
			Static3.aByteBuffer2.position(0);
			local1.glTexImage3D(GL.GL_TEXTURE_3D, GL.GL_POINTS, GL.GL_LUMINANCE_ALPHA, 64, 64, 64, GL.GL_POINTS, GL.GL_LUMINANCE_ALPHA, GL.GL_UNSIGNED_BYTE, Static3.aByteBuffer2);
			local1.glTexParameteri(GL.GL_TEXTURE_3D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
			local1.glTexParameteri(GL.GL_TEXTURE_3D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
			Static3.anInt2341 = local6[0];
			Static4.anInt3330 += Static3.aByteBuffer2.limit() * 2;
			return;
		}
		Static3.anIntArray199 = new int[64];
		local1.glGenTextures(64, Static3.anIntArray199, 0);
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static17.method1600(Static3.anIntArray199[local65]);
			Static3.aByteBuffer2.position(local65 * 64 * 64 * 2);
			local1.glTexImage2D(GL.GL_TEXTURE_2D, GL.GL_POINTS, GL.GL_LUMINANCE_ALPHA, 64, 64, GL.GL_POINTS, GL.GL_LUMINANCE_ALPHA, GL.GL_UNSIGNED_BYTE, Static3.aByteBuffer2);
			local1.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
			local1.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
		}
		Static4.anInt3330 += Static3.aByteBuffer2.limit() * 2;
	}

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "()V")
	public static void method1858() {
		if (Static3.anInt2342 != -1) {
			@Pc(4) GL local4 = Static3.aGL1;
			@Pc(11) int[] local11 = new int[] { Static3.anInt2342 };
			local4.glDeleteTextures(1, local11, 0);
			Static3.anInt2342 = -1;
			Static4.anInt3330 -= Static3.aByteBuffer3.limit() * 2;
		}
		if (Static3.anIntArray198 != null) {
			@Pc(29) GL local29 = Static3.aGL1;
			local29.glDeleteTextures(64, Static3.anIntArray198, 0);
			Static3.anIntArray198 = null;
			Static4.anInt3330 -= Static3.aByteBuffer3.limit() * 2;
		}
		if (Static3.anInt2341 != -1) {
			@Pc(48) GL local48 = Static3.aGL1;
			@Pc(55) int[] local55 = new int[] { Static3.anInt2341 };
			local48.glDeleteTextures(1, local55, 0);
			Static3.anInt2341 = -1;
			Static4.anInt3330 -= Static3.aByteBuffer2.limit() * 2;
		}
		if (Static3.anIntArray199 != null) {
			@Pc(73) GL local73 = Static3.aGL1;
			local73.glDeleteTextures(64, Static3.anIntArray199, 0);
			Static3.anIntArray199 = null;
			Static4.anInt3330 -= Static3.aByteBuffer2.limit() * 2;
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

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!fh;)V")
	public static void method2393(@OriginalArg(0) Class58 arg0) {
		Static3.aClass58_65 = arg0;
		Static3.aClass84_14.clear();
		@Pc(9) int local9 = Static3.aClass58_65.method1362("details");
		@Pc(14) int[] local14 = Static3.aClass58_65.method1363(local9);
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			Static3.aClass84_14.put((long) local14[local16], Static16.method1562(local14[local16], new Buffer(Static3.aClass58_65.method1372(local9, local14[local16]))));
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)Lclient!wg;")
	public static Class4_Sub3_Sub22 method2394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class4_Sub3_Sub22 local4 = (Class4_Sub3_Sub22) Static3.aClass84_14.head(); local4 != null; local4 = (Class4_Sub3_Sub22) Static3.aClass84_14.next()) {
			if (local4.aBoolean420 && local4.method4754(arg0, arg1)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)Lclient!uk;")
	public static SecondaryLinkedList method2395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) SecondaryLinkedList local3 = new SecondaryLinkedList();
		for (@Pc(8) Class4_Sub3_Sub22 local8 = (Class4_Sub3_Sub22) Static3.aClass84_14.head(); local8 != null; local8 = (Class4_Sub3_Sub22) Static3.aClass84_14.next()) {
			if (local8.aBoolean420 && local8.method4754(arg0, arg1)) {
				local3.addTail(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIII)V")
	public static void method2396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = Static3.anInt2972 - Static3.anInt2973;
		@Pc(7) int local7 = Static3.anInt2966 - Static3.anInt2967;
		if (Static3.anInt2972 < Static3.anInt2965) {
			local3++;
		}
		if (Static3.anInt2966 < Static3.anInt2960) {
			local7++;
		}
		for (@Pc(17) int local17 = 0; local17 < local3; local17++) {
			@Pc(28) int local28 = arg0 * local17 >> 16;
			@Pc(38) int local38 = arg0 * (local17 + 1) >> 16;
			@Pc(42) int local42 = local38 - local28;
			if (local42 > 0) {
				@Pc(50) int local50 = local17 + Static3.anInt2973 >> 6;
				if (local50 >= 0 && local50 <= Static3.anIntArrayArrayArray7.length - 1) {
					@Pc(142) int[][] local142 = Static3.anIntArrayArrayArray7[local50];
					@Pc(146) byte[][] local146 = Static3.aByteArrayArrayArray14[local50];
					@Pc(150) byte[][] local150 = Static3.aByteArrayArrayArray13[local50];
					@Pc(154) byte[][] local154 = Static3.aByteArrayArrayArray10[local50];
					@Pc(158) byte[][] local158 = Static3.aByteArrayArrayArray11[local50];
					@Pc(162) byte[][] local162 = Static3.aByteArrayArrayArray12[local50];
					@Pc(166) int local166 = local28 + Static3.anInt2969;
					@Pc(170) int local170 = local38 + Static3.anInt2969;
					for (@Pc(172) int local172 = 0; local172 < local7; local172++) {
						@Pc(183) int local183 = arg1 * local172 >> 16;
						@Pc(193) int local193 = arg1 * (local172 + 1) >> 16;
						@Pc(197) int local197 = local193 - local183;
						if (local197 > 0) {
							@Pc(203) int local203 = local183 + Static3.anInt2968;
							@Pc(207) int local207 = local193 + Static3.anInt2968;
							@Pc(213) int local213 = local172 + Static3.anInt2967 >> 6;
							@Pc(219) int local219 = local172 + Static3.anInt2967 & 0x3F;
							@Pc(225) int local225 = local17 + Static3.anInt2973 & 0x3F;
							@Pc(231) int local231 = (local219 << 6) + local225;
							@Pc(250) int local250;
							if (local213 < 0 || local213 > local142.length - 1 || local142[local213] == null) {
								if (Static3.aClass4_Sub3_Sub22_3.anInt5995 != -1) {
									local250 = Static3.aClass4_Sub3_Sub22_3.anInt5995;
								} else if ((local17 + Static3.anInt2973 & 0x4) == (local172 + Static3.anInt2967 & 0x4)) {
									local250 = Static3.anIntArray266[Static1.anInt549 + 1];
								} else {
									local250 = 4936552;
								}
								if (local213 < 0 || local213 > local142.length - 1) {
									if (local250 == 0) {
										local250 = 1;
									}
									Static33.method4205(local166, local203, local42, local197, local250);
									continue;
								}
							} else {
								local250 = local142[local213][local231];
							}
							if (local250 == 0) {
								local250 = 1;
							}
							@Pc(316) int local316 = local146[local213] == null ? 0 : Static3.anIntArray266[local146[local213][local231] & 0xFF];
							@Pc(332) int local332 = local154[local213] == null ? 0 : Static3.anIntArray266[local154[local213][local231] & 0xFF];
							if (local316 == 0 && local332 == 0) {
								Static33.method4205(local166, local203, local42, local197, local250);
							} else {
								if (local316 != 0) {
									if (local316 == -1) {
										local316 = 1;
									}
									@Pc(362) byte local362 = local150[local213] == null ? 0 : local150[local213][local231];
									@Pc(366) int local366 = local362 & 0xFC;
									if (local366 == 0 || local42 <= 1 || local197 <= 1) {
										Static33.method4205(local166, local203, local42, local197, local316);
									} else {
										Static20.method2409(Static6.anIntArray561, local166, local203, local250, local316, local42, local197, local366 >> 2, local362 & 0x3, true);
									}
								}
								if (local332 != 0) {
									if (local332 == -1) {
										local332 = local250;
									}
									@Pc(409) byte local409 = local158[local213][local231];
									@Pc(413) int local413 = local409 & 0xFC;
									if (local413 == 0 || local42 <= 1 || local197 <= 1) {
										Static33.method4205(local166, local203, local42, local197, local332);
									}
									Static20.method2409(Static6.anIntArray561, local166, local203, 0, local332, local42, local197, local413 >> 2, local409 & 0x3, local316 == 0);
								}
							}
							if (local162[local213] != null) {
								@Pc(459) int local459 = local162[local213][local231] & 0xFF;
								if (local459 != 0) {
									@Pc(467) int local467;
									if (local42 == 1) {
										local467 = local166;
									} else {
										local467 = local170 - 1;
									}
									@Pc(477) int local477;
									if (local197 == 1) {
										local477 = local203;
									} else {
										local477 = local207 - 1;
									}
									@Pc(484) int local484 = 13421772;
									if (local459 >= 5 && local459 <= 8 || local459 >= 13 && local459 <= 16 || local459 >= 21 && local459 <= 24 || local459 == 27 || local459 == 28) {
										local484 = 13369344;
										local459 -= 4;
									}
									if (local459 == 1) {
										Static34.method4212(local166, local203, local197, local484);
									} else if (local459 == 2) {
										Static34.method4214(local166, local203, local42, local484);
									} else if (local459 == 3) {
										Static34.method4212(local467, local203, local197, local484);
									} else if (local459 == 4) {
										Static34.method4214(local166, local477, local42, local484);
									} else if (local459 == 9) {
										Static34.method4212(local166, local203, local197, 16777215);
										Static34.method4214(local166, local203, local42, local484);
									} else if (local459 == 10) {
										Static34.method4212(local467, local203, local197, 16777215);
										Static34.method4214(local166, local203, local42, local484);
									} else if (local459 == 11) {
										Static34.method4212(local467, local203, local197, 16777215);
										Static34.method4214(local166, local477, local42, local484);
									} else if (local459 == 12) {
										Static34.method4212(local166, local203, local197, 16777215);
										Static34.method4214(local166, local477, local42, local484);
									} else if (local459 == 17) {
										Static34.method4214(local166, local203, 1, local484);
									} else if (local459 == 18) {
										Static34.method4214(local467, local203, 1, local484);
									} else if (local459 == 19) {
										Static34.method4214(local467, local477, 1, local484);
									} else if (local459 == 20) {
										Static34.method4214(local166, local477, 1, local484);
									} else if (local459 == 25) {
										for (@Pc(644) int local644 = 0; local644 < local197; local644++) {
											Static34.method4214(local166 + local644, local477 - local644, 1, local484);
										}
									} else if (local459 == 26) {
										for (@Pc(664) int local664 = 0; local664 < local197; local664++) {
											Static34.method4214(local166 + local664, local203 + local664, 1, local484);
										}
									}
								}
							}
						}
					}
				} else {
					@Pc(62) int local62 = local28 + Static3.anInt2969;
					for (@Pc(68) int local68 = 0; local68 < local7; local68++) {
						@Pc(81) int local81 = (arg1 * local68 >> 16) + Static3.anInt2968;
						@Pc(93) int local93 = (arg1 * (local68 + 1) >> 16) + Static3.anInt2968;
						@Pc(97) int local97 = local93 - local81;
						@Pc(104) int local104;
						if (Static3.aClass4_Sub3_Sub22_3.anInt5995 != -1) {
							local104 = Static3.aClass4_Sub3_Sub22_3.anInt5995;
						} else if ((local17 + Static3.anInt2973 & 0x4) == (local68 + Static3.anInt2967 & 0x4)) {
							local104 = Static3.anIntArray266[Static1.anInt549 + 1];
						} else {
							local104 = 4936552;
						}
						if (local104 == 0) {
							local104 = 1;
						}
						Static33.method4205(local62, local81, local42, local97, local104);
					}
				}
			}
		}
		for (@Pc(684) int local684 = -2; local684 < local3 + 2; local684++) {
			@Pc(697) int local697 = arg0 * local684 >> 16;
			@Pc(707) int local707 = arg0 * (local684 + 1) >> 16;
			@Pc(711) int local711 = local707 - local697;
			if (local711 > 0) {
				@Pc(717) int local717 = local697 + Static3.anInt2969;
				@Pc(727) int local727 = local684 + Static3.anInt2973 >> 6;
				if (local727 >= 0 && local727 <= Static3.anIntArrayArrayArray6.length - 1) {
					@Pc(740) int[][] local740 = Static3.anIntArrayArrayArray6[local727];
					for (@Pc(742) int local742 = -2; local742 < local7 + 2; local742++) {
						@Pc(755) int local755 = arg1 * local742 >> 16;
						@Pc(765) int local765 = arg1 * (local742 + 1) >> 16;
						@Pc(769) int local769 = local765 - local755;
						if (local769 > 0) {
							@Pc(775) int local775 = local755 + Static3.anInt2968;
							@Pc(785) int local785 = local742 + Static3.anInt2967 >> 6;
							if (local785 >= 0 && local785 <= local740.length - 1) {
								@Pc(808) int local808 = ((local742 + Static3.anInt2967 & 0x3F) << 6) + (local684 + Static3.anInt2973 & 0x3F);
								if (local740[local785] != null) {
									@Pc(819) int local819 = local740[local785][local808];
									@Pc(823) int local823 = local819 & 0x1FFF;
									if (local823 != 0) {
										@Pc(832) Class143 local832 = Static15.method1400(local823 - 1);
										@Pc(838) int local838 = local819 >> 13 & 0x3;
										@Pc(849) boolean local849 = (local819 >> 15 & 0x1) == 1;
										@Pc(855) Class56_Sub1 local855 = local832.method3557(local849, local838);
										if (local855 != null) {
											@Pc(864) int local864 = local711 * local855.anInt3408 / 4;
											@Pc(871) int local871 = local769 * local855.anInt3413 / 4;
											if (local832.aBoolean303) {
												@Pc(880) int local880 = local819 >> 16 & 0xF;
												@Pc(886) int local886 = local819 >> 20 & 0xF;
												if ((local838 & 0x1) == 1) {
													@Pc(893) int local893 = local880;
													local880 = local886;
													local886 = local893;
												}
												local864 = local880 * local711;
												local871 = local886 * local769;
											}
											if (local864 != 0 && local871 != 0) {
												if (local832.anInt4306 == 0) {
													local855.method1315(local717, local775 + local769 - local871, local864, local871);
												} else {
													local855.method1316(local717, local775 + local769 - local871, local864, local871, local832.anInt4306);
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
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "()Lclient!ll;")
	public static LinkedList method2397() {
		@Pc(3) int local3 = Static3.anInt2972 - Static3.anInt2973;
		@Pc(7) int local7 = Static3.anInt2966 - Static3.anInt2967;
		@Pc(15) int local15 = (Static3.anInt2970 - Static3.anInt2969 << 16) / local3;
		@Pc(23) int local23 = (Static3.anInt2971 - Static3.anInt2968 << 16) / local7;
		return Static20.method2410(local15, local23);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!fd;)V")
	public static void method2398(@OriginalArg(0) Buffer arg0) {
		label83:
		while (true) {
			if (arg0.position < arg0.bytes.length) {
				@Pc(7) boolean local7 = false;
				@Pc(9) int local9 = 0;
				@Pc(11) int local11 = 0;
				if (arg0.readUnsignedByte() == 1) {
					local7 = true;
					local9 = arg0.readUnsignedByte();
					local11 = arg0.readUnsignedByte();
				}
				@Pc(30) int local30 = arg0.readUnsignedByte();
				@Pc(34) int local34 = arg0.readUnsignedByte();
				@Pc(40) int local40 = local30 * 64 - Static3.anInt2962;
				@Pc(50) int local50 = Static3.anInt2960 + Static3.anInt2961 - local34 * 64 - 1;
				if (local40 >= 0 && local50 - 63 >= 0 && local40 + 63 < Static3.anInt2965 && local50 < Static3.anInt2960) {
					@Pc(68) int local68 = local40 >> 6;
					@Pc(72) int local72 = local50 >> 6;
					@Pc(74) int local74 = 0;
					while (true) {
						if (local74 >= 64) {
							continue label83;
						}
						for (@Pc(79) int local79 = 0; local79 < 64; local79++) {
							if (!local7 || local74 >= local9 * 8 && local74 < local9 * 8 + 8 && local79 >= local11 * 8 && local79 < local11 * 8 + 8) {
								@Pc(113) byte local113 = arg0.readByte();
								if (local113 != 0) {
									if (Static3.aByteArrayArrayArray14[local68][local72] == null) {
										Static3.aByteArrayArrayArray14[local68][local72] = new byte[4096];
									}
									Static3.aByteArrayArrayArray14[local68][local72][(63 - local79 << 6) + local74] = local113;
									@Pc(146) byte local146 = arg0.readByte();
									if (Static3.aByteArrayArrayArray13[local68][local72] == null) {
										Static3.aByteArrayArrayArray13[local68][local72] = new byte[4096];
									}
									Static3.aByteArrayArrayArray13[local68][local72][(63 - local79 << 6) + local74] = local146;
								}
							}
						}
						local74++;
					}
				}
				@Pc(180) int local180 = 0;
				while (true) {
					if (local180 >= (local7 ? 64 : 4096)) {
						continue label83;
					}
					@Pc(191) byte local191 = arg0.readByte();
					if (local191 != 0) {
						arg0.position++;
					}
					local180++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "()V")
	public static void method2400() {
		for (@Pc(1) int local1 = 0; local1 < Static3.aClass138_6.anInt4219; local1++) {
			if (Static3.aClass138_6.aClass4_Sub3_Sub7Array1[local1] != null) {
				Static3.aClass175_12.addTail(Static3.aClass138_6.aClass4_Sub3_Sub7Array1[local1]);
			}
		}
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

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
	public static void method2402(@OriginalArg(0) int arg0) {
		Static3.aClass4_Sub3_Sub22_3 = (Class4_Sub3_Sub22) Static3.aClass84_14.get((long) arg0);
	}
}
