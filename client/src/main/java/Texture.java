import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Texture extends SecondaryNode {

	@OriginalMember(owner = "client!ln", name = "S", descriptor = "[I")
	private final int[] anIntArray307;

	@OriginalMember(owner = "client!ln", name = "B", descriptor = "[I")
	private final int[] anIntArray306;

	@OriginalMember(owner = "client!ln", name = "J", descriptor = "Lclient!jo;")
	private final TextureOp aClass4_Sub1_2;

	@OriginalMember(owner = "client!ln", name = "P", descriptor = "Lclient!jo;")
	private final TextureOp aClass4_Sub1_3;

	@OriginalMember(owner = "client!ln", name = "y", descriptor = "Lclient!jo;")
	private final TextureOp aClass4_Sub1_1;

	@OriginalMember(owner = "client!ln", name = "O", descriptor = "[Lclient!jo;")
	private final TextureOp[] aClass4_Sub1Array19;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!fd;)V")
	public Texture(@OriginalArg(0) Buffer buffer) {
		@Pc(5) int local5 = 0;
		@Pc(9) int local9 = buffer.readUnsignedByte();
		this.aClass4_Sub1Array19 = new TextureOp[local9];
		@Pc(15) int local15 = 0;
		@Pc(18) int[][] local18 = new int[local9][];
		for (@Pc(20) int local20 = 0; local20 < local9; local20++) {
			@Pc(27) TextureOp local27 = TextureOp.decode(buffer);
			if (local27.method4688() >= 0) {
				local5++;
			}
			if (local27.method4691() >= 0) {
				local15++;
			}
			@Pc(46) int local46 = local27.aClass4_Sub1Array42.length;
			local18[local20] = new int[local46];
			for (@Pc(53) int local53 = 0; local53 < local46; local53++) {
				local18[local20][local53] = buffer.readUnsignedByte();
			}
			this.aClass4_Sub1Array19[local20] = local27;
		}
		this.anIntArray306 = new int[local15];
		@Pc(85) int local85 = 0;
		this.anIntArray307 = new int[local5];
		@Pc(91) int local91 = 0;
		for (@Pc(93) int local93 = 0; local93 < local9; local93++) {
			@Pc(101) TextureOp local101 = this.aClass4_Sub1Array19[local93];
			@Pc(105) int local105 = local101.aClass4_Sub1Array42.length;
			for (@Pc(107) int local107 = 0; local107 < local105; local107++) {
				local101.aClass4_Sub1Array42[local107] = this.aClass4_Sub1Array19[local18[local93][local107]];
			}
			@Pc(129) int local129 = local101.method4688();
			@Pc(133) int local133 = local101.method4691();
			if (local129 > 0) {
				this.anIntArray307[local91++] = local129;
			}
			if (local133 > 0) {
				this.anIntArray306[local85++] = local133;
			}
			local18[local93] = null;
		}
		this.aClass4_Sub1_3 = this.aClass4_Sub1Array19[buffer.readUnsignedByte()];
		this.aClass4_Sub1_1 = this.aClass4_Sub1Array19[buffer.readUnsignedByte()];
		this.aClass4_Sub1_2 = this.aClass4_Sub1Array19[buffer.readUnsignedByte()];
		@Pc(190) int[][] local190 = null;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(DIILclient!kj;Lclient!fh;IZ)Lclient!vn;")
	public final SoftwareSprite method2645(@OriginalArg(0) double arg0, @OriginalArg(2) int width, @OriginalArg(3) TextureProvider arg2, @OriginalArg(4) Js5 arg3, @OriginalArg(5) int height) {
		Static9.method200(arg0);
		Static6.anInterface3_1 = arg2;
		Static1.aClass58_7 = arg3;
		Static11.method524(width, height);
		@Pc(27) SoftwareSprite local27 = new SoftwareSprite(width, height);
		for (@Pc(29) int local29 = 0; local29 < this.aClass4_Sub1Array19.length; local29++) {
			this.aClass4_Sub1Array19[local29].createImageCache(height, width);
		}
		@Pc(51) int local51 = 0;
		for (@Pc(53) int local53 = 0; local53 < height; local53++) {
			@Pc(73) int[] local73;
			@Pc(75) int[] local75;
			@Pc(77) int[] local77;
			if (this.aClass4_Sub1_3.monochrome) {
				@Pc(71) int[] local71 = this.aClass4_Sub1_3.method4694(local53);
				local73 = local71;
				local75 = local71;
				local77 = local71;
			} else {
				@Pc(85) int[][] local85 = this.aClass4_Sub1_3.method4695(local53);
				local75 = local85[1];
				local77 = local85[2];
				local73 = local85[0];
			}
			for (@Pc(101) int local101 = width - 1; local101 >= 0; local101--) {
				@Pc(112) int local112 = local73[local101] >> 4;
				@Pc(118) int local118 = local75[local101] >> 4;
				if (local118 > 255) {
					local118 = 255;
				}
				if (local118 < 0) {
					local118 = 0;
				}
				if (local112 > 255) {
					local112 = 255;
				}
				if (local112 < 0) {
					local112 = 0;
				}
				@Pc(148) int local148 = Static4.anIntArray267[local112];
				@Pc(152) int local152 = Static4.anIntArray267[local118];
				@Pc(158) int local158 = local77[local101] >> 4;
				if (local158 > 255) {
					local158 = 255;
				}
				if (local158 < 0) {
					local158 = 0;
				}
				@Pc(175) int local175 = Static4.anIntArray267[local158];
				local27.pixels[local51++] = local175 + (local148 << 16) + (local152 << 8);
			}
		}
		for (@Pc(207) int local207 = 0; local207 < this.aClass4_Sub1Array19.length; local207++) {
			this.aClass4_Sub1Array19[local207].clearImageCache();
		}
		return local27;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IBILclient!fh;DLclient!kj;Z)[I")
	public final int[] method2646(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Js5 arg2, @OriginalArg(4) double arg3, @OriginalArg(5) TextureProvider arg4, @OriginalArg(6) boolean arg5) {
		@Pc(12) int[] local12 = new int[arg1 * arg0 * 4];
		Static9.method200(arg3);
		Static6.anInterface3_1 = arg4;
		Static1.aClass58_7 = arg2;
		Static11.method524(arg0, arg1);
		for (@Pc(25) int local25 = 0; local25 < this.aClass4_Sub1Array19.length; local25++) {
			this.aClass4_Sub1Array19[local25].createImageCache(arg1, arg0);
		}
		@Pc(47) int local47 = 0;
		for (@Pc(57) int local57 = 0; local57 < arg1; local57++) {
			if (arg5) {
				local47 = local57;
			}
			@Pc(83) int[] local83;
			@Pc(91) int[] local91;
			@Pc(87) int[] local87;
			if (this.aClass4_Sub1_3.monochrome) {
				@Pc(99) int[] local99 = this.aClass4_Sub1_3.method4694(local57);
				local91 = local99;
				local83 = local99;
				local87 = local99;
			} else {
				@Pc(79) int[][] local79 = this.aClass4_Sub1_3.method4695(local57);
				local83 = local79[0];
				local87 = local79[2];
				local91 = local79[1];
			}
			@Pc(117) int[] local117;
			if (this.aClass4_Sub1_1.monochrome) {
				local117 = this.aClass4_Sub1_1.method4694(local57);
			} else {
				local117 = this.aClass4_Sub1_1.method4695(local57)[0];
			}
			for (@Pc(129) int local129 = arg0 - 1; local129 >= 0; local129--) {
				@Pc(137) int local137 = local83[local129] >> 4;
				if (local137 > 255) {
					local137 = 255;
				}
				if (local137 < 0) {
					local137 = 0;
				}
				@Pc(153) int local153 = local91[local129] >> 4;
				@Pc(159) int local159 = local87[local129] >> 4;
				if (local153 > 255) {
					local153 = 255;
				}
				@Pc(168) int local168 = Static4.anIntArray267[local137];
				if (local153 < 0) {
					local153 = 0;
				}
				if (local159 > 255) {
					local159 = 255;
				}
				@Pc(185) int local185 = Static4.anIntArray267[local153];
				if (local159 < 0) {
					local159 = 0;
				}
				@Pc(194) int local194 = Static4.anIntArray267[local159];
				@Pc(208) int local208;
				if (local168 == 0 && local185 == 0 && local194 == 0) {
					local208 = 0;
				} else {
					local208 = local117[local129] >> 4;
					if (local208 > 255) {
						local208 = 255;
					}
					if (local208 < 0) {
						local208 = 0;
					}
				}
				local12[local47++] = (local185 << 8) + (local168 << 16) + (local208 << 24) + local194;
				if (arg5) {
					local47 += arg0 - 1;
				}
			}
		}
		for (@Pc(261) int local261 = 0; local261 < this.aClass4_Sub1Array19.length; local261++) {
			this.aClass4_Sub1Array19[local261].clearImageCache();
		}
		return local12;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IBZLclient!kj;Lclient!fh;I)[F")
	public final float[] method2648(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) TextureProvider arg2, @OriginalArg(4) Js5 arg3, @OriginalArg(5) int arg4) {
		Static6.anInterface3_1 = arg2;
		@Pc(29) float[] local29 = new float[arg4 * 4 * arg0];
		Static1.aClass58_7 = arg3;
		Static11.method524(arg4, arg0);
		for (@Pc(37) int local37 = 0; local37 < this.aClass4_Sub1Array19.length; local37++) {
			this.aClass4_Sub1Array19[local37].createImageCache(arg0, arg4);
		}
		@Pc(59) int local59 = 0;
		for (@Pc(61) int local61 = 0; local61 < arg0; local61++) {
			if (arg1) {
				local59 = local61 << 2;
			}
			@Pc(89) int[] local89;
			@Pc(85) int[] local85;
			@Pc(93) int[] local93;
			if (this.aClass4_Sub1_3.monochrome) {
				@Pc(101) int[] local101 = this.aClass4_Sub1_3.method4694(local61);
				local93 = local101;
				local85 = local101;
				local89 = local101;
			} else {
				@Pc(81) int[][] local81 = this.aClass4_Sub1_3.method4695(local61);
				local85 = local81[1];
				local89 = local81[0];
				local93 = local81[2];
			}
			@Pc(117) int[] local117;
			if (this.aClass4_Sub1_1.monochrome) {
				local117 = this.aClass4_Sub1_1.method4694(local61);
			} else {
				local117 = this.aClass4_Sub1_1.method4695(local61)[0];
			}
			@Pc(137) int[] local137;
			if (this.aClass4_Sub1_2.monochrome) {
				local137 = this.aClass4_Sub1_2.method4694(local61);
			} else {
				local137 = this.aClass4_Sub1_2.method4695(local61)[0];
			}
			for (@Pc(151) int local151 = arg4 - 1; local151 >= 0; local151--) {
				@Pc(163) float local163 = (float) local117[local151] / 4096.0F;
				@Pc(176) float local176 = ((float) local137[local151] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local163 < 0.0F) {
					local163 = 0.0F;
				} else if (local163 > 1.0F) {
					local163 = 1.0F;
				}
				@Pc(193) int local193 = local59 + 1;
				local29[local59] = (float) local89[local151] * local176;
				local29[local193++] = local176 * (float) local85[local151];
				local29[local193++] = (float) local93[local151] * local176;
				local59 = local193 + 1;
				local29[local193] = local163;
				if (arg1) {
					local59 += (arg4 << 2) - 4;
				}
			}
		}
		for (@Pc(243) int local243 = 0; local243 < this.aClass4_Sub1Array19.length; local243++) {
			this.aClass4_Sub1Array19[local243].clearImageCache();
		}
		return local29;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!kj;Lclient!fh;I)Z")
	public final boolean isReady(@OriginalArg(0) TextureProvider arg0, @OriginalArg(1) Js5 spritesArchive) {
		if (Static6.anInt4366 > 0) {
			for (@Pc(26) int i = 0; i < this.anIntArray307.length; i++) {
				if (!spritesArchive.isFileReady(Static6.anInt4366, this.anIntArray307[i])) {
					return false;
				}
			}
		} else {
			for (@Pc(49) int i = 0; i < this.anIntArray307.length; i++) {
				if (!spritesArchive.isFileReady(this.anIntArray307[i])) {
					return false;
				}
			}
		}
		for (@Pc(69) int i = 0; i < this.anIntArray306.length; i++) {
			if (!arg0.isTextureReady(this.anIntArray306[i])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILclient!kj;Lclient!fh;IDIZ)Lclient!jn;")
	public final SoftwareAlphaSprite method2650(@OriginalArg(0) int arg0, @OriginalArg(1) TextureProvider arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(4) double arg3, @OriginalArg(5) int arg4) {
		Static9.method200(arg3);
		Static6.anInterface3_1 = arg1;
		Static1.aClass58_7 = arg2;
		Static11.method524(arg4, arg0);
		@Pc(30) SoftwareAlphaSprite local30 = new SoftwareAlphaSprite(arg4, arg0);
		for (@Pc(32) int local32 = 0; local32 < this.aClass4_Sub1Array19.length; local32++) {
			this.aClass4_Sub1Array19[local32].createImageCache(arg0, arg4);
		}
		@Pc(54) int local54 = 0;
		for (@Pc(56) int local56 = 0; local56 < arg0; local56++) {
			@Pc(81) int[] local81;
			@Pc(77) int[] local77;
			@Pc(79) int[] local79;
			if (this.aClass4_Sub1_3.monochrome) {
				@Pc(75) int[] local75 = this.aClass4_Sub1_3.method4694(local56);
				local77 = local75;
				local79 = local75;
				local81 = local75;
			} else {
				@Pc(89) int[][] local89 = this.aClass4_Sub1_3.method4695(local56);
				local81 = local89[0];
				local77 = local89[1];
				local79 = local89[2];
			}
			@Pc(113) int[] local113;
			if (this.aClass4_Sub1_1.monochrome) {
				local113 = this.aClass4_Sub1_1.method4694(local56);
			} else {
				local113 = this.aClass4_Sub1_1.method4695(local56)[0];
			}
			for (@Pc(125) int local125 = arg4 - 1; local125 >= 0; local125--) {
				@Pc(136) int local136 = local81[local125] >> 4;
				@Pc(142) int local142 = local79[local125] >> 4;
				if (local136 > 255) {
					local136 = 255;
				}
				@Pc(153) int local153 = local77[local125] >> 4;
				if (local153 > 255) {
					local153 = 255;
				}
				if (local142 > 255) {
					local142 = 255;
				}
				if (local136 < 0) {
					local136 = 0;
				}
				if (local142 < 0) {
					local142 = 0;
				}
				@Pc(184) int local184 = Static4.anIntArray267[local142];
				@Pc(188) int local188 = Static4.anIntArray267[local136];
				if (local153 < 0) {
					local153 = 0;
				}
				@Pc(197) int local197 = Static4.anIntArray267[local153];
				@Pc(214) int local214;
				if (local188 == 0 && local197 == 0 && local184 == 0) {
					local214 = 0;
				} else {
					local214 = local113[local125] >> 4;
					if (local214 > 255) {
						local214 = 255;
					}
					if (local214 < 0) {
						local214 = 0;
					}
				}
				local30.pixels[local54++] = (local197 << 8) + (local214 << 24) + (local188 << 16) + local184;
			}
		}
		for (@Pc(271) int local271 = 0; local271 < this.aClass4_Sub1Array19.length; local271++) {
			this.aClass4_Sub1Array19[local271].clearImageCache();
		}
		return local30;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(DZILclient!fh;Lclient!kj;IZI)[I")
	public final int[] method2653(@OriginalArg(0) double arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Js5 spritesArchive, @OriginalArg(4) TextureProvider arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		Static9.method200(arg0);
		Static6.anInterface3_1 = arg3;
		Static1.aClass58_7 = spritesArchive;
		Static11.method524(arg6, arg4);
		@Pc(21) int[] local21 = new int[arg6 * arg4];
		for (@Pc(23) int local23 = 0; local23 < this.aClass4_Sub1Array19.length; local23++) {
			this.aClass4_Sub1Array19[local23].createImageCache(arg4, arg6);
		}
		@Pc(45) int local45;
		@Pc(43) byte local43;
		@Pc(47) int local47;
		if (arg5) {
			local47 = arg6 - 1;
			local45 = -1;
			local43 = -1;
		} else {
			local43 = 1;
			local45 = arg6;
			local47 = 0;
		}
		@Pc(59) int local59 = 0;
		for (@Pc(61) int local61 = 0; local61 < arg4; local61++) {
			if (arg1) {
				local59 = local61;
			}
			@Pc(88) int[] local88;
			@Pc(96) int[] local96;
			@Pc(92) int[] local92;
			if (this.aClass4_Sub1_3.monochrome) {
				@Pc(104) int[] local104 = this.aClass4_Sub1_3.method4694(local61);
				local96 = local104;
				local92 = local104;
				local88 = local104;
			} else {
				@Pc(84) int[][] local84 = this.aClass4_Sub1_3.method4695(local61);
				local88 = local84[0];
				local92 = local84[2];
				local96 = local84[1];
			}
			for (@Pc(112) int local112 = local47; local112 != local45; local112 += local43) {
				@Pc(125) int local125 = local88[local112] >> 4;
				@Pc(131) int local131 = local96[local112] >> 4;
				if (local131 > 255) {
					local131 = 255;
				}
				@Pc(142) int local142 = local92[local112] >> 4;
				if (local125 > 255) {
					local125 = 255;
				}
				if (local142 > 255) {
					local142 = 255;
				}
				if (local131 < 0) {
					local131 = 0;
				}
				if (local125 < 0) {
					local125 = 0;
				}
				@Pc(172) int local172 = Static4.anIntArray267[local131];
				@Pc(176) int local176 = Static4.anIntArray267[local125];
				if (local142 < 0) {
					local142 = 0;
				}
				@Pc(188) int local188 = Static4.anIntArray267[local142];
				local21[local59++] = local188 + (local176 << 16) + (local172 << 8);
				if (arg1) {
					local59 += arg6 - 1;
				}
			}
		}
		for (@Pc(226) int local226 = 0; local226 < this.aClass4_Sub1Array19.length; local226++) {
			this.aClass4_Sub1Array19[local226].clearImageCache();
		}
		return local21;
	}
}
