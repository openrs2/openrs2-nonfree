import java.awt.Component;
import java.awt.Point;
import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIII)Z")
	public static boolean method874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static2.anInt1028 == -1 || Static2.aClass112_5.isEmpty()) {
			Static2.aBoolean58 = false;
			return false;
		}
		Static2.anInt1026 = arg0;
		Static2.anInt1025 = arg1;
		@Pc(16) boolean local16 = false;
		if (Static2.anInt1029 != arg2 || Static2.anInt1027 != arg3) {
			Static2.anInt1029 = arg2;
			Static2.anInt1027 = arg3;
			for (@Pc(30) Node local30 = Static2.aClass112_5.head(); local30 != Static2.aClass112_5.sentinel; local30 = local30.next) {
				((Class4_Sub4) local30).method765(Static2.anInt1029, Static2.anInt1027);
			}
			Static2.aBoolean60 = true;
			Static2.aBoolean57 = true;
		}
		@Pc(49) GL local49 = Static3.aGL1;
		if (Static2.aBoolean57) {
			if (Static2.anInt1032 != -1 && Static2.aBoolean59 != Static2.aBoolean61) {
				if (Static2.aBoolean61) {
					Static33.method4169(Static2.anInt1032);
				} else {
					Static9.method214(Static2.anInt1032);
				}
				Static2.anInt1032 = -1;
			}
			if (Static2.anInt1032 == -1) {
				Static2.aBoolean61 = Static2.aBoolean59;
				if (Static2.aBoolean61) {
					Static2.anInt1032 = Static33.method4172();
				} else {
					Static2.anInt1032 = Static9.method207();
				}
				Static2.aBoolean62 = true;
			}
			if (Static2.aBoolean61) {
				local49.glBindTexture(GL.GL_TEXTURE_RECTANGLE, Static2.anInt1032);
				Static33.method4166(Static6.anInt5134, Static6.anInt5143, Static2.anInt1029, Static2.anInt1027, Static6.anInt5143, Static6.anInt5147, null);
			} else {
				local49.glBindRenderbufferEXT(GL.GL_RENDERBUFFER, Static2.anInt1032);
				local49.glRenderbufferStorageEXT(GL.GL_RENDERBUFFER, GL.GL_DEPTH_COMPONENT, Static2.anInt1029, Static2.anInt1027);
			}
			Static2.aBoolean57 = false;
			local16 = true;
		}
		if (Static2.aBoolean60) {
			local49.glBindTexture(GL.GL_TEXTURE_RECTANGLE, Static2.anIntArray83[0]);
			Static33.method4167(Static2.anInt1031, Static2.anInt1029, Static2.anInt1027);
			local49.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
			local49.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
			if (Static2.anInt1030 > 1) {
				local49.glBindTexture(GL.GL_TEXTURE_RECTANGLE, Static2.anIntArray83[1]);
				Static33.method4167(Static2.anInt1031, Static2.anInt1029, Static2.anInt1027);
				local49.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
				local49.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
			} else {
				local49.glBindTexture(GL.GL_TEXTURE_RECTANGLE, Static2.anIntArray83[1]);
				Static33.method4167(Static2.anInt1031, 0, 0);
			}
			Static2.aBoolean60 = false;
			local16 = true;
		}
		Static9.method216(Static2.anInt1028);
		if (Static2.aBoolean62) {
			local49.glFramebufferTexture2DEXT(GL.GL_FRAMEBUFFER, GL.GL_COLOR_ATTACHMENT0, GL.GL_TEXTURE_RECTANGLE, Static2.anIntArray83[0], 0);
			local49.glFramebufferTexture2DEXT(GL.GL_FRAMEBUFFER, GL.GL_COLOR_ATTACHMENT1, GL.GL_TEXTURE_RECTANGLE, Static2.anInt1030 > 1 ? Static2.anIntArray83[1] : 0, 0);
			if (Static2.aBoolean61) {
				local49.glFramebufferTexture2DEXT(GL.GL_FRAMEBUFFER, GL.GL_DEPTH_ATTACHMENT, GL.GL_TEXTURE_RECTANGLE, Static2.anInt1032, 0);
			} else {
				local49.glFramebufferRenderbufferEXT(GL.GL_FRAMEBUFFER, GL.GL_DEPTH_ATTACHMENT, GL.GL_RENDERBUFFER, Static2.anInt1032);
			}
			local49.glDrawBuffer(GL.GL_COLOR_ATTACHMENT0);
			Static2.aBoolean62 = false;
			local16 = true;
		}
		if (local16) {
			if (Static9.method217()) {
				Static2.aBoolean58 = true;
			} else {
				Static9.method215();
				Static2.aBoolean60 = true;
				Static2.aBoolean57 = true;
				Static2.aBoolean62 = true;
				Static2.aBoolean58 = false;
			}
		}
		Static16.method1584(-Static2.anInt1026, Static2.anInt1025 + Static2.anInt1027 - Static3.anInt2083);
		return Static2.aBoolean58;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!bc;)Z")
	public static boolean method875(@OriginalArg(0) Class4_Sub4 arg0) {
		if (Static2.anInt1028 != -1) {
			if (arg0.method766() || arg0.method762()) {
				if (Static2.anInt1029 != -1 && Static2.anInt1027 != -1) {
					arg0.method765(Static2.anInt1029, Static2.anInt1027);
				}
				arg0.aBoolean54 = true;
				Static2.aClass112_5.addTail(arg0);
				Static12.method870();
				return true;
			}
			arg0.method760();
		}
		return false;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!bc;Z)V")
	public static void method876(@OriginalArg(0) Class4_Sub4 arg0) {
		arg0.aBoolean54 = false;
		arg0.unlink();
		Static12.method870();
	}

	@OriginalMember(owner = "client!di", name = "e", descriptor = "()Z")
	public static boolean method877() {
		return Static2.anInt1028 != -1 && Static2.aClass4_Sub4_Sub1_1.method766();
	}

	@OriginalMember(owner = "client!di", name = "g", descriptor = "()Z")
	public static boolean method879() {
		return Static2.anInt1028 != -1;
	}

	@OriginalMember(owner = "client!di", name = "h", descriptor = "()V")
	public static void method880() {
		if (!Static2.aBoolean58) {
			return;
		}
		@Pc(4) GL local4 = Static3.aGL1;
		Static17.method1596();
		Static18.method1698();
		local4.glDisable(GL.GL_BLEND);
		local4.glDisable(GL.GL_ALPHA_TEST);
		Static16.method1589();
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 1;
		@Pc(29) Class4_Sub4 local29;
		for (@Pc(22) Class4_Sub4 local22 = (Class4_Sub4) Static2.aClass112_5.head(); local22 != null; local22 = local29) {
			local29 = (Class4_Sub4) Static2.aClass112_5.next();
			@Pc(33) int local33 = local22.method753();
			for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
				local22.method761(local35, Static2.anInt1029, Static2.anInt1027, Static2.anIntArray83[local15], Static2.anInt1032);
				if (local29 == null && local35 == local33 - 1) {
					Static2.anInt1025 = Static3.anInt2083 - Static2.anInt1025;
					Static16.method1584(0, 0);
					local4.glDrawBuffer(GL.GL_COLOR_ATTACHMENT0);
					Static9.method215();
					local4.glBegin(GL.GL_QUADS);
					local4.glTexCoord2f(0.0F, 0.0F);
					local4.glMultiTexCoord2f(GL.GL_TEXTURE1, 0.0F, 0.0F);
					local4.glVertex2i(Static2.anInt1026, Static2.anInt1025 - Static2.anInt1027);
					local4.glTexCoord2f((float) Static2.anInt1029, 0.0F);
					local4.glMultiTexCoord2f(GL.GL_TEXTURE1, 1.0F, 0.0F);
					local4.glVertex2i(Static2.anInt1026 + Static2.anInt1029, Static2.anInt1025 - Static2.anInt1027);
					local4.glTexCoord2f((float) Static2.anInt1029, (float) Static2.anInt1027);
					local4.glMultiTexCoord2f(GL.GL_TEXTURE1, 1.0F, 1.0F);
					local4.glVertex2i(Static2.anInt1026 + Static2.anInt1029, Static2.anInt1025);
					local4.glTexCoord2f(0.0F, (float) Static2.anInt1027);
					local4.glMultiTexCoord2f(GL.GL_TEXTURE1, 0.0F, 1.0F);
					local4.glVertex2i(Static2.anInt1026, Static2.anInt1025);
					local4.glEnd();
				} else {
					local4.glDrawBuffer(local17 + GL.GL_COLOR_ATTACHMENT0);
					local4.glBegin(GL.GL_QUADS);
					local4.glTexCoord2f(0.0F, 0.0F);
					local4.glMultiTexCoord2f(GL.GL_TEXTURE1, 0.0F, 0.0F);
					local4.glVertex2i(0, 0);
					local4.glTexCoord2f((float) Static2.anInt1029, 0.0F);
					local4.glMultiTexCoord2f(GL.GL_TEXTURE1, 1.0F, 0.0F);
					local4.glVertex2i(Static2.anInt1029, 0);
					local4.glTexCoord2f((float) Static2.anInt1029, (float) Static2.anInt1027);
					local4.glMultiTexCoord2f(GL.GL_TEXTURE1, 1.0F, 1.0F);
					local4.glVertex2i(Static2.anInt1029, Static2.anInt1027);
					local4.glTexCoord2f(0.0F, (float) Static2.anInt1027);
					local4.glMultiTexCoord2f(GL.GL_TEXTURE1, 0.0F, 1.0F);
					local4.glVertex2i(0, Static2.anInt1027);
					local4.glEnd();
				}
				local22.method756(local35);
				local17 = local17 + 1 & 0x1;
				local15 = local15 + 1 & 0x1;
			}
		}
		local4.glEnable(GL.GL_ALPHA_TEST);
		local4.glEnable(GL.GL_BLEND);
		Static16.method1591();
	}

	@OriginalMember(owner = "client!di", name = "i", descriptor = "()Z")
	public static boolean method881() {
		return Static2.anInt1028 != -1 && Static2.aClass4_Sub4_Sub1_1.method755();
	}

	@OriginalMember(owner = "client!di", name = "j", descriptor = "()V")
	public static void method882() {
		if (Static2.anInt1028 != -1) {
			Static9.method211(Static2.anInt1028);
			Static2.anInt1028 = -1;
			Static3.aGL1.glDeleteTextures(2, Static2.anIntArray83, 0);
			Static2.anIntArray83[0] = -1;
			Static2.anIntArray83[1] = -1;
		}
		if (Static2.anInt1032 != -1) {
			if (Static2.aBoolean61) {
				Static33.method4169(Static2.anInt1032);
			} else {
				Static9.method214(Static2.anInt1032);
			}
			Static2.anInt1032 = -1;
		}
		if (!Static2.aClass112_5.isEmpty()) {
			for (@Pc(39) Node local39 = Static2.aClass112_5.head(); local39 != Static2.aClass112_5.sentinel; local39 = local39.next) {
				((Class4_Sub4) local39).method760();
			}
		}
		if (Static2.aClass4_Sub4_Sub1_1 != null && Static2.aClass4_Sub4_Sub1_1.method766()) {
			Static2.aClass4_Sub4_Sub1_1.method760();
		}
		Static2.aBoolean60 = true;
		Static2.aBoolean57 = true;
		Static2.aBoolean62 = true;
		Static2.anInt1027 = -1;
		Static2.anInt1029 = -1;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method883(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static2.aClass124_1);
		arg0.addMouseMotionListener(Static2.aClass124_1);
		arg0.addFocusListener(Static2.aClass124_1);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
	public static void method884() {
		Static3.aClass26_22.clear();
		Static1.aClass26_2.clear();
		Static5.aClass26_39.clear();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!fh;I)Lclient!qh;")
	public static Class4_Sub23 method887(@OriginalArg(0) int arg0, @OriginalArg(1) Js5 arg1) {
		@Pc(17) byte[] local17 = arg1.fetchFile(arg0);
		return local17 == null ? null : new Class4_Sub23(local17);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method891(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static2.aClass124_1);
		arg0.removeMouseMotionListener(Static2.aClass124_1);
		arg0.removeFocusListener(Static2.aClass124_1);
		Static2.anInt1306 = 0;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)Ljava/lang/String;")
	private static String method892(@OriginalArg(1) int arg0) {
		if (arg0 >= 100000) {
			return arg0 < 10000000 ? "<col=ffffff>" + arg0 / 1000 + LocalisedText.THOUSAND_SHORT + "</col>" : "<col=00ff80>" + arg0 / 1000000 + LocalisedText.MILLION_SHORT + "</col>";
		} else {
			return "<col=ffff00>" + arg0 + "</col>";
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILclient!qc;)V")
	public static void method939(@OriginalArg(1) Class53_Sub1 arg0) {
		arg0.aBoolean284 = false;
		if (arg0.anInt4005 != -1) {
			@Pc(19) Class46 local19 = Static23.method2494(arg0.anInt4005);
			if (local19 == null || local19.anIntArray95 == null) {
				arg0.anInt4005 = -1;
			} else {
				arg0.anInt4000++;
				if (arg0.anInt4046 < local19.anIntArray95.length && local19.anIntArray94[arg0.anInt4046] < arg0.anInt4000) {
					arg0.anInt4019++;
					arg0.anInt4000 = 1;
					arg0.anInt4046++;
					Static29.method3461(local19, arg0.anInt4002, arg0.anInt3974, arg0.anInt4046, arg0 == Static4.aClass53_Sub1_Sub1_2);
				}
				if (arg0.anInt4046 >= local19.anIntArray95.length) {
					arg0.anInt4000 = 0;
					arg0.anInt4046 = 0;
					Static29.method3461(local19, arg0.anInt4002, arg0.anInt3974, arg0.anInt4046, Static4.aClass53_Sub1_Sub1_2 == arg0);
				}
				arg0.anInt4019 = arg0.anInt4046 + 1;
				if (arg0.anInt4019 >= local19.anIntArray95.length) {
					arg0.anInt4019 = 0;
				}
			}
		}
		if (arg0.anInt3961 != -1 && Static2.anInt954 >= arg0.anInt3984) {
			@Pc(149) Class110 local149 = Static21.method2004(arg0.anInt3961);
			@Pc(152) int local152 = local149.anInt3134;
			if (local152 == -1) {
				arg0.anInt3961 = -1;
			} else {
				label303:
				{
					@Pc(166) Class46 local166 = Static23.method2494(local152);
					if (local149.aBoolean222) {
						if (local166.anInt1240 == 3) {
							if (arg0.anInt4030 > 0 && arg0.anInt4034 <= Static2.anInt954 && Static2.anInt954 > arg0.anInt3966) {
								arg0.anInt3961 = -1;
								break label303;
							}
						} else if (local166.anInt1240 == 1 && arg0.anInt4030 > 0 && arg0.anInt4034 <= Static2.anInt954 && arg0.anInt3966 < Static2.anInt954) {
							arg0.anInt3984 = Static2.anInt954 + 1;
							break label303;
						}
					}
					if (local166 == null || local166.anIntArray95 == null) {
						arg0.anInt3961 = -1;
					} else {
						if (arg0.anInt4026 < 0) {
							arg0.anInt4026 = 0;
							Static29.method3461(local166, arg0.anInt4002, arg0.anInt3974, 0, arg0 == Static4.aClass53_Sub1_Sub1_2);
						}
						arg0.anInt3968++;
						if (local166.anIntArray95.length > arg0.anInt4026 && local166.anIntArray94[arg0.anInt4026] < arg0.anInt3968) {
							arg0.anInt3968 = 1;
							arg0.anInt4026++;
							Static29.method3461(local166, arg0.anInt4002, arg0.anInt3974, arg0.anInt4026, Static4.aClass53_Sub1_Sub1_2 == arg0);
						}
						if (arg0.anInt4026 >= local166.anIntArray95.length) {
							if (local149.aBoolean222) {
								arg0.anInt3989++;
								arg0.anInt4026 -= local166.anInt1242;
								if (local166.anInt1239 <= arg0.anInt3989) {
									arg0.anInt3961 = -1;
								} else if (arg0.anInt4026 >= 0 && local166.anIntArray95.length > arg0.anInt4026) {
									Static29.method3461(local166, arg0.anInt4002, arg0.anInt3974, arg0.anInt4026, Static4.aClass53_Sub1_Sub1_2 == arg0);
								} else {
									arg0.anInt3961 = -1;
								}
							} else {
								arg0.anInt3961 = -1;
							}
						}
						arg0.anInt3976 = arg0.anInt4026 + 1;
						if (arg0.anInt3976 >= local166.anIntArray95.length) {
							if (local149.aBoolean222) {
								arg0.anInt3976 -= local166.anInt1242;
								if (local166.anInt1239 <= arg0.anInt3989 + 1) {
									arg0.anInt3976 = -1;
								} else if (arg0.anInt3976 < 0 || arg0.anInt3976 >= local166.anIntArray95.length) {
									arg0.anInt3976 = -1;
								}
							} else {
								arg0.anInt3976 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt4007 != -1 && arg0.anInt3996 <= 1) {
			@Pc(458) Class46 local458 = Static23.method2494(arg0.anInt4007);
			if (local458.anInt1240 == 3) {
				if (arg0.anInt4030 > 0 && Static2.anInt954 >= arg0.anInt4034 && arg0.anInt3966 < Static2.anInt954) {
					arg0.anInt4007 = -1;
				}
			} else if (local458.anInt1240 == 1 && arg0.anInt4030 > 0 && Static2.anInt954 >= arg0.anInt4034 && Static2.anInt954 > arg0.anInt3966) {
				arg0.anInt3996 = 2;
			}
		}
		if (arg0.anInt4007 != -1 && arg0.anInt3996 == 0) {
			@Pc(538) Class46 local538 = Static23.method2494(arg0.anInt4007);
			if (local538 == null || local538.anIntArray95 == null) {
				arg0.anInt4007 = -1;
			} else {
				arg0.anInt4044++;
				if (local538.anIntArray95.length > arg0.anInt3970 && arg0.anInt4044 > local538.anIntArray94[arg0.anInt3970]) {
					arg0.anInt3970++;
					arg0.anInt4044 = 1;
					Static29.method3461(local538, arg0.anInt4002, arg0.anInt3974, arg0.anInt3970, arg0 == Static4.aClass53_Sub1_Sub1_2);
				}
				if (arg0.anInt3970 >= local538.anIntArray95.length) {
					arg0.anInt4001++;
					arg0.anInt3970 -= local538.anInt1242;
					if (local538.anInt1239 <= arg0.anInt4001) {
						arg0.anInt4007 = -1;
					} else if (arg0.anInt3970 >= 0 && arg0.anInt3970 < local538.anIntArray95.length) {
						Static29.method3461(local538, arg0.anInt4002, arg0.anInt3974, arg0.anInt3970, arg0 == Static4.aClass53_Sub1_Sub1_2);
					} else {
						arg0.anInt4007 = -1;
					}
				}
				arg0.anInt4011 = arg0.anInt3970 + 1;
				if (arg0.anInt4011 >= local538.anIntArray95.length) {
					arg0.anInt4011 -= local538.anInt1242;
					if (arg0.anInt4001 + 1 >= local538.anInt1239) {
						arg0.anInt4011 = -1;
					} else if (arg0.anInt4011 < 0 || arg0.anInt4011 >= local538.anIntArray95.length) {
						arg0.anInt4011 = -1;
					}
				}
				arg0.aBoolean284 = local538.aBoolean73;
			}
		}
		if (arg0.anInt3996 > 0) {
			arg0.anInt3996--;
		}
		for (@Pc(746) int local746 = 0; local746 < arg0.aClass150Array3.length; local746++) {
			@Pc(760) Class150 local760 = arg0.aClass150Array3[local746];
			if (local760 != null) {
				if (local760.anInt4461 > 0) {
					local760.anInt4461--;
				} else {
					@Pc(782) Class46 local782 = Static23.method2494(local760.anInt4456);
					if (local782 == null || local782.anIntArray95 == null) {
						arg0.aClass150Array3[local746] = null;
					} else {
						local760.anInt4460++;
						if (local782.anIntArray95.length > local760.anInt4462 && local782.anIntArray94[local760.anInt4462] < local760.anInt4460) {
							local760.anInt4460 = 1;
							local760.anInt4462++;
							Static29.method3461(local782, arg0.anInt4002, arg0.anInt3974, local760.anInt4462, arg0 == Static4.aClass53_Sub1_Sub1_2);
						}
						if (local760.anInt4462 >= local782.anIntArray95.length) {
							local760.anInt4462 -= local782.anInt1242;
							local760.anInt4465++;
							if (local782.anInt1239 <= local760.anInt4465) {
								arg0.aClass150Array3[local746] = null;
							} else if (local760.anInt4462 >= 0 && local782.anIntArray95.length > local760.anInt4462) {
								Static29.method3461(local782, arg0.anInt4002, arg0.anInt3974, local760.anInt4462, arg0 == Static4.aClass53_Sub1_Sub1_2);
							} else {
								arg0.aClass150Array3[local746] = null;
							}
						}
						local760.anInt4464 = local760.anInt4462 + 1;
						if (local782.anIntArray95.length <= local760.anInt4464) {
							local760.anInt4464 -= local782.anInt1242;
							if (local760.anInt4465 + 1 >= local782.anInt1239) {
								local760.anInt4464 = -1;
							} else if (local760.anInt4464 < 0 || local760.anInt4464 >= local782.anIntArray95.length) {
								local760.anInt4464 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
	public static void method941() {
		Static6.aClass26_52.clear();
		Static2.aClass26_11.clear();
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IZIZLclient!qk;IIIZ)Lclient!uj;")
	public static Class4_Sub3_Sub14 method965(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class144 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7) {
		@Pc(9) Class162 local9 = Static35.method4361(arg6);
		if (arg2 > 1 && local9.anIntArray552 != null) {
			@Pc(19) int local19 = -1;
			for (@Pc(21) int local21 = 0; local21 < 10; local21++) {
				if (local9.anIntArray551[local21] <= arg2 && local9.anIntArray551[local21] != 0) {
					local19 = local9.anIntArray552[local21];
				}
			}
			if (local19 != -1) {
				local9 = Static35.method4361(local19);
			}
		}
		@Pc(61) Class53_Sub4_Sub1 local61 = local9.method4135(arg4);
		if (local61 == null) {
			return null;
		}
		@Pc(68) Class4_Sub3_Sub14_Sub1 local68 = null;
		if (local9.anInt5089 != -1) {
			local68 = (Class4_Sub3_Sub14_Sub1) method965(1, false, 10, true, arg4, 0, local9.anInt5100, true);
			if (local68 == null) {
				return null;
			}
		} else if (local9.anInt5077 != -1) {
			local68 = (Class4_Sub3_Sub14_Sub1) method965(arg0, false, arg2, false, arg4, arg5, local9.anInt5067, true);
			if (local68 == null) {
				return null;
			}
		}
		@Pc(116) int[] local116 = Static6.anIntArray561;
		@Pc(118) int local118 = Static6.anInt5184;
		@Pc(121) int[] local121 = new int[4];
		@Pc(123) int local123 = Static6.anInt5188;
		Static34.method4223(local121);
		@Pc(131) Class4_Sub3_Sub14_Sub1 local131 = new Class4_Sub3_Sub14_Sub1(36, 32);
		Static34.method4224(local131.anIntArray241, 36, 32);
		Static23.method2561();
		Static23.method2556(16, 16);
		Static4.aBoolean216 = false;
		@Pc(145) int local145 = local9.anInt5057;
		if (arg3) {
			local145 = (int) ((double) local145 * 1.5D);
		} else if (arg0 == 2) {
			local145 = (int) ((double) local145 * 1.04D);
		}
		@Pc(174) int local174 = local145 * Class109.anIntArray298[local9.anInt5080] >> 16;
		@Pc(191) int local191 = Class109.anIntArray299[local9.anInt5080] * local145 >> 16;
		local61.method3822(local9.anInt5095, local9.anInt5062, local9.anInt5080, local9.anInt5065, local191 + local9.anInt5098 - local61.method3813() / 2, local9.anInt5098 + local174, -1L);
		if (arg0 >= 1) {
			local131.method2174(1);
			if (arg0 >= 2) {
				local131.method2174(16777215);
			}
			Static34.method4224(local131.anIntArray241, 36, 32);
		}
		if (arg5 != 0) {
			local131.method2168(arg5);
		}
		if (local9.anInt5089 != -1) {
			local68.method4506(0, 0);
		} else if (local9.anInt5077 != -1) {
			Static34.method4224(local68.anIntArray241, 36, 32);
			local131.method4506(0, 0);
			local131 = local68;
		}
		if (arg1 && (local9.anInt5075 == 1 || arg2 != 1) && arg2 != -1) {
			Static1.aClass4_Sub3_Sub5_Sub2_1.method2259(method892(arg2), 0, 9, 16776960, 1);
		}
		Static34.method4224(local116, local123, local118);
		Static34.method4226(local121);
		Static23.method2561();
		Static4.aBoolean216 = true;
		return Static3.aBoolean138 && !arg7 ? new Class4_Sub3_Sub14_Sub2(local131) : local131;
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(II)V")
	public static void method966(@OriginalArg(0) int arg0) {
		if (!Static2.aBoolean69) {
			arg0 = -1;
		}
		if (Static7.anInt5345 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(23) Class133 local23 = Static22.method2390(arg0);
			@Pc(27) Class4_Sub3_Sub14_Sub1 local27 = local23.method3401();
			if (local27 == null) {
				arg0 = -1;
			} else {
				GameShell.signLink.setCursor(GameShell.canvas, local27.anInt5602, local27.anInt5612, local27.method2170(), new Point(local23.anInt4119, local23.anInt4111));
				Static7.anInt5345 = arg0;
			}
		}
		if (arg0 == -1 && Static7.anInt5345 != -1) {
			GameShell.signLink.setCursor(GameShell.canvas, -1, -1, null, new Point());
			Static7.anInt5345 = -1;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	public static void method967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(3) Class4_Sub30 local3 = new Class4_Sub30();
		local3.anInt4994 = arg6;
		local3.anInt4997 = arg3;
		local3.anInt5007 = arg10;
		local3.anInt5010 = arg11;
		local3.anInt4998 = arg4;
		local3.anInt5008 = arg5;
		local3.anInt5004 = arg7;
		local3.anInt4995 = arg0;
		local3.anInt4999 = arg2;
		local3.anInt4993 = arg9;
		local3.anInt4992 = arg1;
		local3.anInt5003 = arg8;
		Static5.aClass112_27.addTail(local3);
	}

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "(I)V")
	public static void method968() {
		Static19.method1855();
		Static6.anInterface2Array1 = new Interface2[8];
		Static6.anInterface2Array1[1] = new Class81();
		Static6.anInterface2Array1[2] = new Class70();
		Static6.anInterface2Array1[3] = new Class21();
		Static6.anInterface2Array1[4] = new Class16();
		Static6.anInterface2Array1[5] = new Class23();
		Static6.anInterface2Array1[6] = new Class139();
		Static6.anInterface2Array1[7] = new Class6();
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "([IIIIII)V")
	private static void method970(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class4_Sub19 local7 = Static1.aClass4_Sub19ArrayArrayArray1[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class142 local13 = local7.aClass142_1;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt4294;
			if (local18 != 0) {
				for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
					arg0[arg1] = local18;
					arg0[arg1 + 1] = local18;
					arg0[arg1 + 2] = local18;
					arg0[arg1 + 3] = local18;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(58) Class166 local58 = local7.aClass166_1;
		if (local58 == null) {
			return;
		}
		@Pc(64) int local64 = local58.anInt5224;
		@Pc(67) int local67 = local58.anInt5226;
		@Pc(70) int local70 = local58.anInt5227;
		@Pc(73) int local73 = local58.anInt5225;
		@Pc(77) int[] local77 = Static4.anIntArrayArray28[local64];
		@Pc(81) int[] local81 = Static6.anIntArrayArray25[local67];
		@Pc(83) int local83 = 0;
		if (local70 != 0) {
			for (@Pc(87) int local87 = 0; local87 < 4; local87++) {
				@Pc(96) int local96 = local83 + 1;
				arg0[arg1] = local77[local81[local83]] == 0 ? local70 : local73;
				arg0[arg1 + 1] = local77[local81[local96++]] == 0 ? local70 : local73;
				arg0[arg1 + 2] = local77[local81[local96++]] == 0 ? local70 : local73;
				@Pc(137) int local137 = arg1 + 3;
				local83 = local96 + 1;
				arg0[local137] = local77[local81[local96]] == 0 ? local70 : local73;
				arg1 += 512;
			}
			return;
		}
		for (@Pc(157) int local157 = 0; local157 < 4; local157++) {
			@Pc(164) int local164 = local83 + 1;
			if (local77[local81[local83]] != 0) {
				arg0[arg1] = local73;
			}
			@Pc(175) int local175 = local164 + 1;
			if (local77[local81[local164]] != 0) {
				arg0[arg1 + 1] = local73;
			}
			@Pc(188) int local188 = local175 + 1;
			if (local77[local81[local175]] != 0) {
				arg0[arg1 + 2] = local73;
			}
			local83 = local188 + 1;
			if (local77[local81[local188]] != 0) {
				arg0[arg1 + 3] = local73;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "(II)V")
	public static void method971() {
		Static7.anInt6022 = -1;
		Static3.anInt5397 = 2;
		Static2.aClass58_42 = null;
		Static5.anInt4357 = 1;
		Static2.anInt1244 = -1;
		Static6.aBoolean321 = false;
		Static7.anInt5391 = 0;
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V")
	public static void method933() {
		for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
			Static2.aBooleanArray8[local15] = true;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)Lclient!hi;")
	public static Class79 method935(@OriginalArg(1) int arg0) {
		@Pc(17) Class79 local17 = (Class79) Static3.aClass26_26.get((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(29) byte[] local29 = Static6.aClass58_94.fetchFile(16, arg0);
		@Pc(33) Class79 local33 = new Class79();
		if (local29 != null) {
			local33.method1747(new Buffer(local29));
		}
		Static3.aClass26_26.put((long) arg0, local33);
		return local33;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IBIII)Lclient!eh;")
	public static Class47 method936(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(39) long local39 = (long) arg2 & 0xFFFFL | ((long) arg0 & 0xFFFFL) << 48 | ((long) arg1 & 0xFFFFL) << 32 | ((long) arg3 & 0xFFFFL) << 16;
		@Pc(45) Class47 local45 = (Class47) Static2.aClass26_11.get(local39);
		if (local45 != null) {
			return local45;
		}
		@Pc(52) Class105[] local52 = null;
		@Pc(56) Class145 local56 = Static35.method4364(arg2);
		if (local56.anIntArray466 != null) {
			local52 = new Class105[local56.anIntArray466.length];
			for (@Pc(68) int local68 = 0; local68 < local52.length; local68++) {
				@Pc(83) Class153 local83 = Static37.method4731(local56.anIntArray466[local68]);
				local52[local68] = new Class105(local83.anInt4706, local83.anInt4698, local83.anInt4696, local83.anInt4697, local83.anInt4700, local83.anInt4707, local83.anInt4703, local83.aBoolean327);
			}
		}
		@Pc(120) Class47 local120 = new Class47(local56.anInt4405, local52, local56.anInt4399, arg0, arg1, arg3);
		Static2.aClass26_11.put(local39, local120);
		return local120;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!ec;")
	public static Class43 method991(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(1) GL local1 = Static3.aGL1;
		@Pc(5) int local5 = local1.glCreateShaderObjectARB(arg1);
		local1.glShaderSourceARB(local5, 1, new String[] { arg0 }, new int[] { arg0.length() }, 0);
		local1.glCompileShaderARB(local5);
		local1.glGetObjectParameterivARB(local5, GL.GL_COMPILE_STATUS, Static2.anIntArray91, 0);
		if (Static2.anIntArray91[0] == 0) {
			if (Static2.anIntArray91[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			local1.glGetObjectParameterivARB(local5, GL.GL_INFO_LOG_LENGTH, Static2.anIntArray91, 1);
			if (Static2.anIntArray91[1] > 1) {
				@Pc(59) byte[] local59 = new byte[Static2.anIntArray91[1]];
				local1.glGetInfoLogARB(local5, Static2.anIntArray91[1], Static2.anIntArray91, 0, local59, 0);
				System.out.println(new String(local59));
			}
			if (Static2.anIntArray91[0] == 0) {
				local1.glDeleteObjectARB(local5);
				return null;
			}
		}
		return new Class43(local5, arg1);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IJII)Z")
	public static boolean method1004(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = (int) arg1 >> 20 & 0x3;
		@Pc(23) int local23 = (int) arg1 >> 14 & 0x1F;
		@Pc(30) int local30 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
		if (local23 == 10 || local23 == 11 || local23 == 22) {
			@Pc(49) Class181 local49 = Static8.method99(local30);
			@Pc(52) int local52 = local49.anInt5538;
			@Pc(63) int local63;
			@Pc(66) int local66;
			if (local12 == 0 || local12 == 2) {
				local66 = local49.anInt5516;
				local63 = local49.anInt5527;
			} else {
				local63 = local49.anInt5516;
				local66 = local49.anInt5527;
			}
			if (local12 != 0) {
				local52 = (local52 << local12 & 0xF) + (local52 >> 4 - local12);
			}
			Static15.method1337(Static4.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, local52, local63, arg0, Static4.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local66, arg2);
		} else {
			Static15.method1337(Static4.aClass53_Sub1_Sub1_2.anIntArray422[0], local12, 0, 0, arg0, Static4.aClass53_Sub1_Sub1_2.anIntArray426[0], local23 + 1, 0, arg2);
		}
		return true;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)Z")
	public static boolean method1005(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(12) int local12 = Static6.aShortArray100[arg0];
		if (local12 >= 2000) {
			local12 -= 2000;
		}
		return local12 == 1009;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIII)V")
	public static void method1007(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1012) {
			Static24.method2710(10, arg0, arg2);
		} else if (arg1 == 1002) {
			Static24.method2710(11, arg0, arg2);
		} else if (arg1 == 1008) {
			Static24.method2710(12, arg0, arg2);
		} else if (arg1 == 1003) {
			Static24.method2710(13, arg0, arg2);
		} else if (arg1 == 1011) {
			Static24.method2710(14, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)V")
	public static void method1008() {
		for (@Pc(1) int local1 = 0; local1 < Static5.anInt4309; local1++) {
			for (@Pc(6) int local6 = 0; local6 < Static7.anInt5632; local6++) {
				for (@Pc(11) int local11 = 0; local11 < Static7.anInt5590; local11++) {
					@Pc(22) Class4_Sub19 local22 = Static1.aClass4_Sub19ArrayArrayArray1[local1][local6][local11];
					if (local22 != null) {
						@Pc(27) Class179 local27 = local22.aClass179_1;
						if (local27 != null && local27.aClass53_5.method3808()) {
							Static20.method1951(local27.aClass53_5, local1, local6, local11, 1, 1);
							if (local27.aClass53_4 != null && local27.aClass53_4.method3808()) {
								Static20.method1951(local27.aClass53_4, local1, local6, local11, 1, 1);
								local27.aClass53_5.method3807(local27.aClass53_4, 0, 0, 0, false);
								local27.aClass53_4 = local27.aClass53_4.method3809();
							}
							local27.aClass53_5 = local27.aClass53_5.method3809();
						}
						for (@Pc(83) int local83 = 0; local83 < local22.anInt3554; local83++) {
							@Pc(92) Class33 local92 = local22.aClass33Array3[local83];
							if (local92 != null && local92.aClass53_1.method3808()) {
								Static20.method1951(local92.aClass53_1, local1, local6, local11, local92.anInt825 + 1 - local92.anInt824, local92.anInt817 + 1 - local92.anInt826);
								local92.aClass53_1 = local92.aClass53_1.method3809();
							}
						}
						@Pc(131) Class42 local131 = local22.aClass42_1;
						if (local131 != null && local131.aClass53_2.method3808()) {
							Static26.method2981(local131.aClass53_2, local1, local6, local11);
							local131.aClass53_2 = local131.aClass53_2.method3809();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)Z")
	public static boolean method1009(@OriginalArg(1) int arg0) {
		if (Static3.aClass4_Sub3_Sub14_Sub1_3 == null) {
			if (Static3.aBoolean138 || Static5.aClass4_Sub3_Sub14_4 == null) {
				Static3.aClass4_Sub3_Sub14_Sub1_3 = new Class4_Sub3_Sub14_Sub1(512, 512);
			} else {
				Static3.aClass4_Sub3_Sub14_Sub1_3 = (Class4_Sub3_Sub14_Sub1) Static5.aClass4_Sub3_Sub14_4;
			}
			@Pc(38) int[] local38 = Static3.aClass4_Sub3_Sub14_Sub1_3.anIntArray241;
			@Pc(41) int local41 = local38.length;
			for (@Pc(43) int local43 = 0; local43 < local41; local43++) {
				local38[local43] = 1;
			}
			for (@Pc(57) int local57 = 1; local57 < 103; local57++) {
				@Pc(80) int local80 = (103 - local57) * 512 * 4 + 24628;
				for (@Pc(84) int local84 = 1; local84 < 103; local84++) {
					if ((Static4.aByteArrayArrayArray17[arg0][local84][local57] & 0x18) == 0) {
						method970(local38, local80, arg0, local84, local57);
					}
					if (arg0 < 3 && (Static4.aByteArrayArrayArray17[arg0 + 1][local84][local57] & 0x8) != 0) {
						method970(local38, local80, arg0 + 1, local84, local57);
					}
					local80 += 4;
				}
			}
			Static6.anInt4434 = 0;
			for (@Pc(147) int local147 = 0; local147 < 104; local147++) {
				for (@Pc(154) int local154 = 0; local154 < 104; local154++) {
					@Pc(168) long local168 = Static22.method2414(arg0, local147, local154);
					if (local168 == 0L) {
						local168 = Static20.method1960(arg0, local147, local154);
					}
					if (local168 == 0L) {
						local168 = Static25.method2726(arg0, local147, local154);
					}
					if (local168 == 0L) {
						local168 = Static37.method4739(arg0, local147, local154);
					}
					if (local168 != 0L) {
						@Pc(227) Class181 local227 = Static8.method99(Integer.MAX_VALUE & (int) (local168 >>> 32));
						if (!local227.aBoolean375 || Static7.aBoolean370) {
							@Pc(235) int local235 = local227.anInt5526;
							if (local227.anIntArray631 != null) {
								for (@Pc(241) int local241 = 0; local241 < local227.anIntArray631.length; local241++) {
									if (local227.anIntArray631[local241] != -1) {
										@Pc(264) Class181 local264 = Static8.method99(local227.anIntArray631[local241]);
										if (local264.anInt5526 >= 0) {
											local235 = local264.anInt5526;
										}
									}
								}
							}
							if (local235 >= 0) {
								@Pc(280) boolean local280 = false;
								@Pc(284) Class82 local284 = Static22.method2191(local235);
								@Pc(288) int local288 = local147;
								@Pc(293) int local293 = local154;
								if (local284 != null && local284.aBoolean156) {
									local280 = true;
								}
								if (local280) {
									@Pc(309) int[][] local309 = Static7.aClass30Array1[arg0].anIntArrayArray6;
									for (@Pc(311) int local311 = 0; local311 < 10; local311++) {
										@Pc(321) int local321 = (int) (Math.random() * 4.0D);
										if (local321 == 0 && local288 > 0 && local288 > local147 - 3 && (local309[local288 - 1][local293] & 0x2C0108) == 0) {
											local288--;
										}
										if (local321 == 1 && local288 < 103 && local288 < local147 + 3 && (local309[local288 + 1][local293] & 0x2C0180) == 0) {
											local288++;
										}
										if (local321 == 2 && local293 > 0 && local154 - 3 < local293 && (local309[local288][local293 - 1] & 0x2C0102) == 0) {
											local293--;
										}
										if (local321 == 3 && local293 < 103 && local154 + 3 > local293 && (local309[local288][local293 + 1] & 0x2C0120) == 0) {
											local293++;
										}
									}
								}
								Static1.anIntArray15[Static6.anInt4434] = local227.anInt5553;
								Static3.anIntArray189[Static6.anInt4434] = local288;
								Static2.anIntArray187[Static6.anInt4434] = local293;
								Static6.anInt4434++;
							}
						}
					}
				}
			}
		}
		Static3.aClass4_Sub3_Sub14_Sub1_3.method2178();
		@Pc(504) int local504 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + 238 - 10;
		@Pc(515) int local515 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		for (@Pc(517) int local517 = 1; local517 < 103; local517++) {
			for (@Pc(522) int local522 = 1; local522 < 103; local522++) {
				if ((Static4.aByteArrayArrayArray17[arg0][local522][local517] & 0x18) == 0 && !Static37.method4780(local504, arg0, local515, local517, local522)) {
					if (Static3.aBoolean138) {
						Static6.anIntArray561 = null;
					} else {
						Static4.aClass59_1.method4244();
					}
					return false;
				}
				if (arg0 < 3 && (Static4.aByteArrayArrayArray17[arg0 + 1][local522][local517] & 0x8) != 0 && !Static37.method4780(local504, arg0 + 1, local515, local517, local522)) {
					if (Static3.aBoolean138) {
						Static6.anIntArray561 = null;
					} else {
						Static4.aClass59_1.method4244();
					}
					return false;
				}
			}
		}
		if (Static3.aBoolean138) {
			@Pc(624) int[] local624 = Static3.aClass4_Sub3_Sub14_Sub1_3.anIntArray241;
			@Pc(627) int local627 = local624.length;
			for (@Pc(629) int local629 = 0; local629 < local627; local629++) {
				if (local624[local629] == 0) {
					local624[local629] = 1;
				}
			}
			Static5.aClass4_Sub3_Sub14_4 = new Class4_Sub3_Sub14_Sub2(Static3.aClass4_Sub3_Sub14_Sub1_3);
		} else {
			Static5.aClass4_Sub3_Sub14_4 = Static3.aClass4_Sub3_Sub14_Sub1_3;
		}
		if (Static3.aBoolean138) {
			Static6.anIntArray561 = null;
		} else {
			Static4.aClass59_1.method4244();
		}
		Static3.aClass4_Sub3_Sub14_Sub1_3 = null;
		return true;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
	public static void method1010() {
		Static5.aClass26_39.clear();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIIBIII)V")
	public static void method1011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(5) Class4_Sub25 local5 = null;
		for (@Pc(10) Class4_Sub25 local10 = (Class4_Sub25) Static2.aClass112_7.head(); local10 != null; local10 = (Class4_Sub25) Static2.aClass112_7.next()) {
			if (arg1 == local10.anInt4438 && arg3 == local10.anInt4445 && local10.anInt4441 == arg5 && arg7 == local10.anInt4437) {
				local5 = local10;
				break;
			}
		}
		if (local5 == null) {
			local5 = new Class4_Sub25();
			local5.anInt4441 = arg5;
			local5.anInt4438 = arg1;
			local5.anInt4437 = arg7;
			local5.anInt4445 = arg3;
			Static16.method4654(local5);
			Static2.aClass112_7.addTail(local5);
		}
		local5.anInt4446 = arg8;
		local5.anInt4435 = arg0;
		local5.anInt4436 = arg4;
		local5.anInt4433 = arg2;
		local5.anInt4442 = arg6;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZIIII)V")
	public static void method1015(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static4.anInt3086 <= arg3 && arg3 <= Static5.anInt4230) {
			arg0 = Static8.method9(Static2.anInt902, arg0, Static3.anInt2553);
			arg1 = Static8.method9(Static2.anInt902, arg1, Static3.anInt2553);
			Static20.method1975(arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIB)V")
	public static void method1019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) Class4_Sub3_Sub9 local10 = Static12.method2322(8, arg3);
		local10.method1520();
		local10.anInt2001 = arg0;
		local10.anInt1994 = arg1;
		local10.anInt1993 = arg2;
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "()V")
	public static void method1027() {
		Static22.method2303();
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!fh;)V")
	public static void method1028(@OriginalArg(0) Js5 arg0) {
		Static2.aClass58_37 = arg0;
	}
}
