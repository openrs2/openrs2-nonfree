import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class106 {

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "[I")
	private static final int[] anIntArray258 = new int[256];

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "Z")
	private boolean aBoolean201 = false;

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
	private int anInt2887 = 0;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "[B")
	private byte[] aByteArray30 = new byte[100000];

	static {
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(14) int local14 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".indexOf(local7);
			if (local14 == -1) {
				local14 = 74;
			}
			anIntArray258[local7] = local14 * 9;
		}
	}

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(IZLjava/awt/Component;)V")
	public Class106(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) {
		this.anInt2887 = Static4.anInt2888 * 9;
		this.aBoolean201 = false;
		@Pc(30) Font local30 = new Font("Helvetica", 1, arg0);
		@Pc(34) FontMetrics local34 = arg2.getFontMetrics(local30);
		for (@Pc(36) int local36 = 0; local36 < Static4.anInt2888; local36++) {
			this.method2334(local30, local34, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(local36), local36, false);
		}
		if (this.aBoolean201) {
			this.anInt2887 = Static4.anInt2888 * 9;
			this.aBoolean201 = false;
			@Pc(70) Font local70 = new Font("Helvetica", 0, arg0);
			@Pc(74) FontMetrics local74 = arg2.getFontMetrics(local70);
			for (@Pc(76) int local76 = 0; local76 < Static4.anInt2888; local76++) {
				this.method2334(local70, local74, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(local76), local76, false);
			}
			if (!this.aBoolean201) {
				this.anInt2887 = Static4.anInt2888 * 9;
				this.aBoolean201 = false;
				for (@Pc(103) int local103 = 0; local103 < Static4.anInt2888; local103++) {
					this.method2334(local70, local74, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(local103), local103, true);
				}
			}
		}
		@Pc(121) byte[] local121 = new byte[this.anInt2887];
		for (@Pc(123) int local123 = 0; local123 < this.anInt2887; local123++) {
			local121[local123] = this.aByteArray30[local123];
		}
		this.aByteArray30 = local121;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/String;)I")
	public final int method2326(@OriginalArg(0) String arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0.length(); local3++) {
			if (arg0.charAt(local3) == '@' && local3 + 4 < arg0.length() && arg0.charAt(local3 + 4) == '@') {
				local3 += 4;
			} else if (arg0.charAt(local3) == '~' && local3 + 4 < arg0.length() && arg0.charAt(local3 + 4) == '~') {
				local3 += 4;
			} else {
				local1 += this.aByteArray30[anIntArray258[arg0.charAt(local3)] + 7];
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIII[B)V")
	private void method2327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		@Pc(7) int local7 = arg1 + arg4[arg0 + 5];
		@Pc(15) int local15 = arg2 - arg4[arg0 + 6];
		@Pc(21) int local21 = arg4[arg0 + 3];
		@Pc(27) int local27 = arg4[arg0 + 4];
		@Pc(47) int local47 = arg4[arg0] * 16384 + arg4[arg0 + 1] * 128 + arg4[arg0 + 2];
		@Pc(53) int local53 = local7 + local15 * Static6.anInt5188;
		@Pc(57) int local57 = Static6.anInt5188 - local21;
		@Pc(59) int local59 = 0;
		if (local15 < Static6.anInt5183) {
			@Pc(66) int local66 = Static6.anInt5183 - local15;
			local27 -= local66;
			local15 = Static6.anInt5183;
			local47 += local66 * local21;
			local53 += local66 * Static6.anInt5188;
		}
		if (local15 + local27 >= Static6.anInt5187) {
			local27 -= local15 + local27 + 1 - Static6.anInt5187;
		}
		if (local7 < Static6.anInt5185) {
			@Pc(106) int local106 = Static6.anInt5185 - local7;
			local21 -= local106;
			local7 = Static6.anInt5185;
			local47 += local106;
			local53 += local106;
			local59 = local106;
			local57 += local106;
		}
		if (local7 + local21 >= Static6.anInt5186) {
			@Pc(141) int local141 = local7 + local21 + 1 - Static6.anInt5186;
			local21 -= local141;
			local59 += local141;
			local57 += local141;
		}
		if (local21 <= 0 || local27 <= 0) {
			return;
		}
		if (this.aBoolean201) {
			this.method2335(Static6.anIntArray561, arg4, arg3, local47, local53, local21, local27, local57, local59);
		} else {
			this.method2331(Static6.anIntArray561, arg4, arg3, local47, local53, local21, local27, local57, local59);
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "()I")
	public final int method2328() {
		return this.aByteArray30[6];
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/String;IIIZ)V")
	public final void method2330(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = this.method2326(arg0) / 2;
		@Pc(8) int local8 = this.method2328();
		if (arg1 - local5 <= Static6.anInt5186 && (arg1 + local5 >= Static6.anInt5185 && (arg2 - local8 <= Static6.anInt5187 && arg2 >= 0))) {
			this.method2333(arg0, arg1 - local5, arg2, arg3, true);
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method2331(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (@Pc(12) int local12 = -arg6; local12 < 0; local12++) {
			for (@Pc(16) int local16 = local4; local16 < 0; local16++) {
				@Pc(21) int local21 = arg3 + 1;
				@Pc(26) int local26;
				if (arg1[arg3] == 0) {
					local26 = arg4 + 1;
				} else {
					local26 = arg4 + 1;
					arg0[arg4] = arg2;
				}
				@Pc(33) int local33 = local21 + 1;
				@Pc(38) int local38;
				if (arg1[local21] == 0) {
					local38 = local26 + 1;
				} else {
					local38 = local26 + 1;
					arg0[local26] = arg2;
				}
				@Pc(45) int local45 = local33 + 1;
				@Pc(50) int local50;
				if (arg1[local33] == 0) {
					local50 = local38 + 1;
				} else {
					local50 = local38 + 1;
					arg0[local38] = arg2;
				}
				arg3 = local45 + 1;
				if (arg1[local45] == 0) {
					arg4 = local50 + 1;
				} else {
					arg4 = local50 + 1;
					arg0[local50] = arg2;
				}
			}
			for (@Pc(70) int local70 = arg5; local70 < 0; local70++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "()I")
	public final int method2332() {
		return this.aByteArray30[8] - 1;
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(Ljava/lang/String;IIIZ)V")
	private void method2333(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aBoolean201 || arg3 == 0) {
			arg4 = false;
		}
		for (@Pc(8) int local8 = 0; local8 < arg0.length(); local8++) {
			@Pc(18) int local18 = anIntArray258[arg0.charAt(local8)];
			if (arg4) {
				this.method2327(local18, arg1 + 1, arg2, 1, this.aByteArray30);
				this.method2327(local18, arg1, arg2 + 1, 1, this.aByteArray30);
			}
			this.method2327(local18, arg1, arg2, arg3, this.aByteArray30);
			arg1 += this.aByteArray30[local18 + 7];
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V")
	private void method2334(@OriginalArg(0) Font arg0, @OriginalArg(1) FontMetrics arg1, @OriginalArg(2) char arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) int local3 = arg1.charWidth(arg2);
		@Pc(5) int local5 = local3;
		if (arg4) {
			try {
				if (arg2 == '/') {
					arg4 = false;
				}
				if (arg2 == 'f' || arg2 == 't' || arg2 == 'w' || arg2 == 'v' || arg2 == 'k' || arg2 == 'x' || arg2 == 'y' || arg2 == 'A' || arg2 == 'V' || arg2 == 'W') {
					local3++;
				}
			} catch (@Pc(45) Exception local45) {
			}
		}
		@Pc(48) int local48 = arg1.getMaxAscent();
		@Pc(54) int local54 = arg1.getMaxAscent() + arg1.getMaxDescent();
		@Pc(57) int local57 = arg1.getHeight();
		@Pc(62) Image local62 = Static5.aCanvas115.createImage(local3, local54);
		@Pc(65) Graphics local65 = local62.getGraphics();
		local65.setColor(Color.black);
		local65.fillRect(0, 0, local3, local54);
		local65.setColor(Color.white);
		local65.setFont(arg0);
		local65.drawString(arg2 + "", 0, local48);
		if (arg4) {
			local65.drawString(arg2 + "", 1, local48);
		}
		@Pc(111) int[] local111 = new int[local3 * local54];
		@Pc(123) PixelGrabber local123 = new PixelGrabber(local62, 0, 0, local3, local54, local111, 0, local3);
		try {
			local123.grabPixels();
		} catch (@Pc(128) Exception local128) {
		}
		local62.flush();
		@Pc(134) int local134 = 0;
		@Pc(136) int local136 = 0;
		@Pc(138) int local138 = local3;
		@Pc(140) int local140 = local54;
		label135:
		for (@Pc(142) int local142 = 0; local142 < local54; local142++) {
			for (@Pc(147) int local147 = 0; local147 < local3; local147++) {
				@Pc(158) int local158 = local111[local147 + local142 * local3];
				if ((local158 & 0xFFFFFF) != 0) {
					local136 = local142;
					break label135;
				}
			}
		}
		label123:
		for (@Pc(171) int local171 = 0; local171 < local3; local171++) {
			for (@Pc(176) int local176 = 0; local176 < local54; local176++) {
				@Pc(187) int local187 = local111[local171 + local176 * local3];
				if ((local187 & 0xFFFFFF) != 0) {
					local134 = local171;
					break label123;
				}
			}
		}
		label111:
		for (@Pc(202) int local202 = local54 - 1; local202 >= 0; local202--) {
			for (@Pc(206) int local206 = 0; local206 < local3; local206++) {
				@Pc(217) int local217 = local111[local206 + local202 * local3];
				if ((local217 & 0xFFFFFF) != 0) {
					local140 = local202 + 1;
					break label111;
				}
			}
		}
		label99:
		for (@Pc(234) int local234 = local3 - 1; local234 >= 0; local234--) {
			for (@Pc(238) int local238 = 0; local238 < local54; local238++) {
				@Pc(249) int local249 = local111[local234 + local238 * local3];
				if ((local249 & 0xFFFFFF) != 0) {
					local138 = local234 + 1;
					break label99;
				}
			}
		}
		this.aByteArray30[arg3 * 9] = (byte) (this.anInt2887 / 16384);
		this.aByteArray30[arg3 * 9 + 1] = (byte) (this.anInt2887 / 128 & 0x7F);
		this.aByteArray30[arg3 * 9 + 2] = (byte) (this.anInt2887 & 0x7F);
		this.aByteArray30[arg3 * 9 + 3] = (byte) (local138 - local134);
		this.aByteArray30[arg3 * 9 + 4] = (byte) (local140 - local136);
		this.aByteArray30[arg3 * 9 + 5] = (byte) local134;
		this.aByteArray30[arg3 * 9 + 6] = (byte) (local48 - local136);
		this.aByteArray30[arg3 * 9 + 7] = (byte) local5;
		this.aByteArray30[arg3 * 9 + 8] = (byte) local57;
		for (@Pc(371) int local371 = local136; local371 < local140; local371++) {
			for (@Pc(376) int local376 = local134; local376 < local138; local376++) {
				@Pc(389) int local389 = local111[local376 + local371 * local3] & 0xFF;
				if (local389 > 30 && local389 < 230) {
					this.aBoolean201 = true;
				}
				this.aByteArray30[this.anInt2887++] = (byte) local389;
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "([I[BIIIIIII)V")
	private void method2335(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		for (@Pc(2) int local2 = -arg6; local2 < 0; local2++) {
			for (@Pc(7) int local7 = -arg5; local7 < 0; local7++) {
				@Pc(16) int local16 = arg1[arg3++] & 0xFF;
				if (local16 <= 30) {
					arg4++;
				} else if (local16 >= 230) {
					arg0[arg4++] = arg2;
				} else {
					@Pc(32) int local32 = arg0[arg4];
					arg0[arg4++] = ((arg2 & 0xFF00FF) * local16 + (local32 & 0xFF00FF) * (256 - local16) & 0xFF00FF00) + ((arg2 & 0xFF00) * local16 + (local32 & 0xFF00) * (256 - local16) & 0xFF0000) >> 8;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}
}
