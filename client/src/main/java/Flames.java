import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Flames {
	@OriginalMember(owner = "client!mc", name = "A", descriptor = "[I")
	private static final int[] anIntArray314 = new int[256];

	@OriginalMember(owner = "client!wj", name = "x", descriptor = "[I")
	private static final int[] anIntArray679 = new int[] { 12543016, 15504954, 15914854, 16773818 };

	@OriginalMember(owner = "client!ln", name = "F", descriptor = "I")
	private static int runesId;

	@OriginalMember(owner = "client!eo", name = "v", descriptor = "[Lclient!fe;")
	private static SoftwareIndexedSprite[] runes;

	@OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
	private static int anInt1943 = 0;

	@OriginalMember(owner = "client!id", name = "e", descriptor = "[I")
	private static int[] anIntArray196;

	@OriginalMember(owner = "client!k", name = "b", descriptor = "Lclient!vn;")
	private static SoftwareSprite aClass4_Sub3_Sub14_Sub1_4;

	@OriginalMember(owner = "client!g", name = "B", descriptor = "[I")
	private static int[] anIntArray159;

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "[I")
	private static int[] anIntArray544;

	@OriginalMember(owner = "client!t", name = "n", descriptor = "[I")
	private static int[] anIntArray541;

	@OriginalMember(owner = "client!em", name = "A", descriptor = "[I")
	private static int[] anIntArray100;

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
	private static int anInt3897 = 0;

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
	private static int anInt2665 = 0;

	@OriginalMember(owner = "client!i", name = "b", descriptor = "I")
	private static int anInt2297 = 0;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!fh;I)V")
	public static void init(@OriginalArg(0) Js5 archive) {
		runesId = archive.getGroupId("runes");
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILclient!fh;)Z")
	public static boolean isReady(@OriginalArg(1) Js5 archive) {
		return archive.isFileReady(runesId);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLclient!fh;)V")
	public static void method2005(@OriginalArg(1) Js5 archive) {
		runes = SpriteLoader.loadSoftwareIndexedSpritesAutoDetect(archive, runesId);
		anIntArray196 = new int[256];
		for (@Pc(15) int local15 = 0; local15 < 3; local15++) {
			@Pc(27) float local27 = (float) (anIntArray679[local15] >> 16 & 0xFF);
			@Pc(37) int local37 = anIntArray679[local15 + 1] >> 16 & 0xFF;
			@Pc(44) float local44 = ((float) local37 - local27) / 64.0F;
			@Pc(53) float local53 = (float) (anIntArray679[local15] >> 8 & 0xFF);
			@Pc(60) float local60 = (float) (anIntArray679[local15] & 0xFF);
			@Pc(70) int local70 = anIntArray679[local15 + 1] >> 8 & 0xFF;
			@Pc(77) float local77 = ((float) local70 - local53) / 64.0F;
			@Pc(85) int local85 = anIntArray679[local15 + 1] & 0xFF;
			@Pc(92) float local92 = ((float) local85 - local60) / 64.0F;
			for (@Pc(94) int local94 = 0; local94 < 64; local94++) {
				anIntArray196[local94 + local15 * 64] = (int) local27 << 16 | (int) local53 << 8 | (int) local60;
				local53 += local77;
				local27 += local44;
				local60 += local92;
			}
		}
		for (@Pc(138) int local138 = 192; local138 < 255; local138++) {
			anIntArray196[local138] = anIntArray679[3];
		}
		anIntArray159 = new int[32768];
		anIntArray544 = new int[32768];
		setRune(null);
		anIntArray541 = new int[32768];
		anIntArray100 = new int[32768];
		aClass4_Sub3_Sub14_Sub1_4 = new SoftwareSprite(128, 254);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)V")
	public static void render(@OriginalArg(2) int x, @OriginalArg(1) int y) {
		if (anInt1943 > 0) {
			method2702(anInt1943);
			anInt1943 = 0;
		}
		@Pc(15) int local15 = 0;
		@Pc(23) int local23 = SoftwareRaster.width * y;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < 255; local29++) {
			@Pc(49) int local49 = (256 - local29) * anIntArray314[local29] / 256;
			if (local49 < 0) {
				local49 = 0;
			}
			local15 += local49;
			for (@Pc(61) int local61 = local49; local61 < 128; local61++) {
				@Pc(74) int local74 = SoftwareRaster.pixels[x + local23++];
				@Pc(79) int local79 = anIntArray100[local15++];
				if (local79 == 0) {
					aClass4_Sub3_Sub14_Sub1_4.pixels[local27++] = local74;
				} else {
					@Pc(96) int local96 = local79 + 18;
					if (local96 > 255) {
						local96 = 255;
					}
					@Pc(108) int local108 = 256 - local79 - 18;
					if (local108 > 255) {
						local108 = 255;
					}
					@Pc(120) int local120 = anIntArray196[local79];
					aClass4_Sub3_Sub14_Sub1_4.pixels[local27++] = (local108 * (local74 & 0xFF00FF) + (local120 & 0xFF00FF) * local96 & 0xFF00FF00) + (local108 * (local74 & 0xFF00) + (local120 & 0xFF00) * local96 & 0xFF0000) >> 8;
				}
			}
			for (@Pc(160) int local160 = 0; local160 < local49; local160++) {
				aClass4_Sub3_Sub14_Sub1_4.pixels[local27++] = SoftwareRaster.pixels[x + local23++];
			}
			local23 += SoftwareRaster.width - 128;
		}
		if (GlRenderer.enabled) {
			GlRaster.drawPixels(aClass4_Sub3_Sub14_Sub1_4.pixels, x, y, aClass4_Sub3_Sub14_Sub1_4.width, aClass4_Sub3_Sub14_Sub1_4.height);
		} else {
			aClass4_Sub3_Sub14_Sub1_4.render(x, y);
		}
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)V")
	public static void method1059() {
		anInt1943++;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V")
	private static void method2702(@OriginalArg(0) int arg0) {
		if (arg0 > 256) {
			arg0 = 256;
		}
		if (arg0 > 10) {
			arg0 = 10;
		}
		anInt3897 += arg0 * 128;
		if (anIntArray159.length < anInt3897) {
			anInt3897 -= anIntArray159.length;
			@Pc(41) int id = (int) (Math.random() * 12.0D);
			setRune(runes[id]);
		}
		@Pc(48) int local48 = 0;
		@Pc(52) int local52 = arg0 * 128;
		@Pc(59) int local59 = (256 - arg0) * 128;
		for (@Pc(61) int local61 = 0; local61 < local59; local61++) {
			@Pc(94) int local94 = anIntArray100[local52 + local48] - arg0 * anIntArray159[anInt3897 + local48 & anIntArray159.length - 1] / 6;
			if (local94 < 0) {
				local94 = 0;
			}
			anIntArray100[local48++] = local94;
		}
		for (@Pc(114) int local114 = 256 - arg0; local114 < 256; local114++) {
			@Pc(125) int local125 = local114 * 128;
			for (@Pc(127) int local127 = 0; local127 < 128; local127++) {
				@Pc(135) int local135 = (int) (Math.random() * 100.0D);
				if (local135 < 50 && local127 > 10 && local127 < 118) {
					anIntArray100[local125 + local127] = 255;
				} else {
					anIntArray100[local125 + local127] = 0;
				}
			}
		}
		for (@Pc(170) int local170 = 0; local170 < 256 - arg0; local170++) {
			anIntArray314[local170] = anIntArray314[local170 + arg0];
		}
		for (@Pc(197) int local197 = 256 - arg0; local197 < 256; local197++) {
			anIntArray314[local197] = (int) (Math.sin((double) anInt2665 / 14.0D) * 16.0D + Math.sin((double) anInt2665 / 15.0D) * 14.0D + Math.sin((double) anInt2665 / 16.0D) * 12.0D);
			anInt2665++;
		}
		anInt2297 += arg0;
		@Pc(247) int local247 = (arg0 + (client.loop & 0x1)) / 2;
		if (local247 <= 0) {
			return;
		}
		for (@Pc(251) int local251 = 0; local251 < anInt2297; local251++) {
			@Pc(261) int local261 = (int) (Math.random() * 124.0D) + 2;
			@Pc(268) int local268 = (int) (Math.random() * 128.0D) + 128;
			anIntArray100[(local268 << 7) + local261] = 192;
		}
		anInt2297 = 0;
		for (@Pc(283) int local283 = 0; local283 < 256; local283++) {
			@Pc(288) int local288 = 0;
			@Pc(292) int local292 = local283 * 128;
			for (@Pc(295) int local295 = -local247; local295 < 128; local295++) {
				if (local295 + local247 < 128) {
					local288 += anIntArray100[local247 + local295 + local292];
				}
				if (local295 - local247 - 1 >= 0) {
					local288 -= anIntArray100[local292 + local295 - local247 - 1];
				}
				if (local295 >= 0) {
					anIntArray541[local295 + local292] = local288 / (local247 * 2 + 1);
				}
			}
		}
		for (@Pc(361) int local361 = 0; local361 < 128; local361++) {
			@Pc(368) int local368 = 0;
			for (@Pc(371) int local371 = -local247; local371 < 256; local371++) {
				@Pc(382) int local382 = local371 * 128;
				if (local371 + local247 < 256) {
					local368 += anIntArray541[local382 + local361 + local247 * 128];
				}
				if (local371 - local247 - 1 >= 0) {
					local368 -= anIntArray541[local382 + local361 - local247 * 128 - 128];
				}
				if (local371 >= 0) {
					anIntArray100[local382 + local361] = local368 / (local247 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!fe;)V")
	private static void setRune(@OriginalArg(1) SoftwareIndexedSprite sprite) {
		for (@Pc(7) int local7 = 0; local7 < anIntArray159.length; local7++) {
			anIntArray159[local7] = 0;
		}
		for (@Pc(22) int local22 = 0; local22 < 5000; local22++) {
			@Pc(41) int local41 = (int) (Math.random() * 128.0D * (double) 256);
			anIntArray159[local41] = (int) (Math.random() * 284.0D);
		}
		for (@Pc(53) int local53 = 0; local53 < 20; local53++) {
			for (@Pc(58) int local58 = 1; local58 < 255; local58++) {
				for (@Pc(69) int local69 = 1; local69 < 127; local69++) {
					@Pc(78) int local78 = (local58 << 7) + local69;
					anIntArray544[local78] = (anIntArray159[local78 + 128] + anIntArray159[local78 + 1] + anIntArray159[local78 - 1] + anIntArray159[local78 - 128]) / 4;
				}
			}
			@Pc(115) int[] local115 = anIntArray159;
			anIntArray159 = anIntArray544;
			anIntArray544 = local115;
		}
		if (sprite == null) {
			return;
		}
		@Pc(127) int local127 = 0;
		for (@Pc(129) int local129 = 0; local129 < sprite.height; local129++) {
			for (@Pc(139) int local139 = 0; local139 < sprite.width; local139++) {
				if (sprite.pixels[local127++] != 0) {
					@Pc(161) int local161 = local139 + sprite.xOffset + 16;
					@Pc(168) int local168 = local129 + sprite.yOffset + 16;
					@Pc(174) int local174 = (local168 << 7) + local161;
					anIntArray159[local174] = 0;
				}
			}
		}
	}
}
