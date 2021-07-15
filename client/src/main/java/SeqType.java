import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class SeqType {

	@OriginalMember(owner = "client!tj", name = "h", descriptor = "Z")
	public static boolean forceTween = false;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
	public int id;

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "[Z")
	public boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "[I")
	private int[] anIntArray93;

	@OriginalMember(owner = "client!eg", name = "v", descriptor = "[I")
	public int[] anIntArray94;

	@OriginalMember(owner = "client!eg", name = "z", descriptor = "[I")
	public int[] frames;

	@OriginalMember(owner = "client!eg", name = "F", descriptor = "[[I")
	public int[][] sounds;

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
	public int anInt1224 = -1;

	@OriginalMember(owner = "client!eg", name = "l", descriptor = "Z")
	public boolean tween = false;

	@OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
	public int anInt1238 = 2;

	@OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
	public int anInt1237 = -1;

	@OriginalMember(owner = "client!eg", name = "x", descriptor = "Z")
	public boolean aBoolean71 = false;

	@OriginalMember(owner = "client!eg", name = "A", descriptor = "I")
	public int anInt1240 = -1;

	@OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
	public int anInt1232 = -1;

	@OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
	public int anInt1239 = 99;

	@OriginalMember(owner = "client!eg", name = "y", descriptor = "Z")
	public boolean aBoolean72 = false;

	@OriginalMember(owner = "client!eg", name = "E", descriptor = "I")
	public int anInt1242 = -1;

	@OriginalMember(owner = "client!eg", name = "B", descriptor = "Z")
	public boolean aBoolean73 = false;

	@OriginalMember(owner = "client!eg", name = "G", descriptor = "I")
	public int anInt1243 = 5;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZIILclient!vg;II)Lclient!vg;")
	public final Model method1014(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Model arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = this.anIntArray94[arg1];
		arg1 = this.frames[arg1];
		@Pc(21) AnimFrameset local21 = SeqTypeList.getAnimFrameset(arg1 >> 16);
		arg1 &= 65535;
		if (local21 == null) {
			return arg2.method3831(true, true, true);
		}
		@Pc(35) AnimFrameset local35 = null;
		arg3 &= 3;
		if ((this.tween || forceTween) && arg0 != -1 && this.frames.length > arg0) {
			arg0 = this.frames[arg0];
			local35 = SeqTypeList.getAnimFrameset(arg0 >> 16);
			arg0 &= 65535;
		}
		@Pc(124) Model local124;
		if (local35 == null) {
			local124 = arg2.method3831(!local21.isAlphaTransformed(arg1), !local21.isColorTransformed(arg1), !this.aBoolean72);
		} else {
			local124 = arg2.method3831(!local21.isAlphaTransformed(arg1) & !local35.isAlphaTransformed(arg0), !local21.isColorTransformed(arg1) & !local35.isColorTransformed(arg0), !this.aBoolean72);
		}
		if (this.aBoolean72 && GlRenderer.enabled) {
			if (arg3 == 1) {
				((GlModel) local124).method3848();
			} else if (arg3 == 2) {
				((GlModel) local124).method3849();
			} else if (arg3 == 3) {
				((GlModel) local124).method3862();
			}
		} else if (arg3 == 1) {
			local124.method3827();
		} else if (arg3 == 2) {
			local124.method3828();
		} else if (arg3 == 3) {
			local124.method3820();
		}
		local124.method3835(local21, arg1, local35, arg0, arg4 - 1, local10, this.aBoolean72);
		if (this.aBoolean72 && GlRenderer.enabled) {
			if (arg3 == 1) {
				((GlModel) local124).method3862();
			} else if (arg3 == 2) {
				((GlModel) local124).method3849();
			} else if (arg3 == 3) {
				((GlModel) local124).method3848();
			}
		} else if (arg3 == 1) {
			local124.method3820();
		} else if (arg3 == 2) {
			local124.method3828();
		} else if (arg3 == 3) {
			local124.method3827();
		}
		return local124;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!fd;Z)V")
	public final void decode(@OriginalArg(0) Buffer buffer) {
		while (true) {
			@Pc(14) int code = buffer.readUnsignedByte();
			if (code == 0) {
				return;
			}
			this.decode(buffer, code);
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZIILclient!vg;I)Lclient!vg;")
	public final Model method1017(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Model arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anIntArray94[arg3];
		@Pc(19) int local19 = this.frames[arg3];
		@Pc(25) AnimFrameset local25 = SeqTypeList.getAnimFrameset(local19 >> 16);
		local19 &= 65535;
		if (local25 == null) {
			return arg2.method3831(true, true, true);
		}
		@Pc(39) AnimFrameset local39 = null;
		if ((this.tween || forceTween) && arg1 != -1 && arg1 < this.frames.length) {
			arg1 = this.frames[arg1];
			local39 = SeqTypeList.getAnimFrameset(arg1 >> 16);
			arg1 &= 65535;
		}
		@Pc(73) AnimFrameset local73 = null;
		@Pc(75) int local75 = 0;
		@Pc(77) int local77 = 0;
		@Pc(79) AnimFrameset local79 = null;
		if (this.anIntArray93 != null) {
			if (arg3 < this.anIntArray93.length) {
				local77 = this.anIntArray93[arg3];
				if (local77 != 65535) {
					local73 = SeqTypeList.getAnimFrameset(local77 >> 16);
					local77 &= 65535;
				}
			}
			if ((this.tween || forceTween) && arg1 != -1 && arg1 < this.anIntArray93.length) {
				local75 = this.anIntArray93[arg1];
				if (local75 != 65535) {
					local79 = SeqTypeList.getAnimFrameset(local75 >> 16);
					local75 &= 65535;
				}
			}
		}
		@Pc(152) boolean shareAlpha = !local25.isAlphaTransformed(local19);
		@Pc(161) boolean shareColors = !local25.isColorTransformed(local19);
		if (local73 != null) {
			shareAlpha &= !local73.isAlphaTransformed(local77);
			shareColors &= !local73.isColorTransformed(local77);
		}
		if (local39 != null) {
			shareAlpha &= !local39.isAlphaTransformed(arg1);
			shareColors &= !local39.isColorTransformed(arg1);
		}
		if (local79 != null) {
			shareAlpha &= !local79.isAlphaTransformed(local75);
			shareColors &= !local79.isColorTransformed(local75);
		}
		@Pc(246) Model local246 = arg2.method3831(shareAlpha, shareColors, !this.aBoolean72);
		local246.method3835(local25, local19, local39, arg1, arg0 - 1, local8, this.aBoolean72);
		if (local73 != null) {
			local246.method3835(local73, local77, local79, local75, arg0 - 1, local8, this.aBoolean72);
		}
		return local246;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIILclient!vg;I)Lclient!vg;")
	public final Model method1018(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Model arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anIntArray94[arg0];
		arg0 = this.frames[arg0];
		@Pc(27) AnimFrameset local27 = SeqTypeList.getAnimFrameset(arg0 >> 16);
		arg0 &= 65535;
		if (local27 == null) {
			return arg2.method3836(true, true, true);
		}
		@Pc(43) AnimFrameset local43 = null;
		if ((this.tween || forceTween) && arg3 != -1 && arg3 < this.frames.length) {
			arg3 = this.frames[arg3];
			local43 = SeqTypeList.getAnimFrameset(arg3 >> 16);
			arg3 &= 65535;
		}
		@Pc(102) Model local102;
		if (local43 == null) {
			local102 = arg2.method3836(!local27.isAlphaTransformed(arg0), !local27.isColorTransformed(arg0), !this.aBoolean72);
		} else {
			local102 = arg2.method3836(!local27.isAlphaTransformed(arg0) & !local43.isAlphaTransformed(arg3), !local27.isColorTransformed(arg0) & !local43.isColorTransformed(arg3), !this.aBoolean72);
		}
		local102.method3835(local27, arg0, local43, arg3, arg1 - 1, local8, this.aBoolean72);
		return local102;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!fd;II)V")
	private void decode(@OriginalArg(0) Buffer buffer, @OriginalArg(1) int code) {
		if (code == 1) {
			@Pc(8) int len = buffer.readUnsignedShort();
			this.anIntArray94 = new int[len];
			for (@Pc(14) int i = 0; i < len; i++) {
				this.anIntArray94[i] = buffer.readUnsignedShort();
			}
			this.frames = new int[len];
			for (@Pc(33) int i = 0; i < len; i++) {
				this.frames[i] = buffer.readUnsignedShort();
			}
			for (@Pc(52) int i = 0; i < len; i++) {
				this.frames[i] = (buffer.readUnsignedShort() << 16) + this.frames[i];
			}
		} else if (code == 2) {
			this.anInt1242 = buffer.readUnsignedShort();
		} else if (code == 3) {
			this.aBooleanArray6 = new boolean[256];
			@Pc(335) int local335 = buffer.readUnsignedByte();
			for (@Pc(337) int i = 0; i < local335; i++) {
				this.aBooleanArray6[buffer.readUnsignedByte()] = true;
			}
		} else if (code == 4) {
			this.aBoolean73 = true;
		} else if (code == 5) {
			this.anInt1243 = buffer.readUnsignedByte();
		} else if (code == 6) {
			this.anInt1224 = buffer.readUnsignedShort();
		} else if (code == 7) {
			this.anInt1232 = buffer.readUnsignedShort();
		} else if (code == 8) {
			this.anInt1239 = buffer.readUnsignedByte();
		} else if (code == 9) {
			this.anInt1240 = buffer.readUnsignedByte();
		} else if (code == 10) {
			this.anInt1237 = buffer.readUnsignedByte();
		} else if (code == 11) {
			this.anInt1238 = buffer.readUnsignedByte();
		} else if (code == 12) {
			@Pc(249) int local249 = buffer.readUnsignedByte();
			this.anIntArray93 = new int[local249];
			for (@Pc(255) int i = 0; i < local249; i++) {
				this.anIntArray93[i] = buffer.readUnsignedShort();
			}
			for (@Pc(270) int i = 0; i < local249; i++) {
				this.anIntArray93[i] += buffer.readUnsignedShort() << 16;
			}
		} else if (code == 13) {
			@Pc(181) int local181 = buffer.readUnsignedShort();
			this.sounds = new int[local181][];
			for (@Pc(187) int i = 0; i < local181; i++) {
				@Pc(198) int local198 = buffer.readUnsignedByte();
				if (local198 > 0) {
					this.sounds[i] = new int[local198];
					this.sounds[i][0] = buffer.readUnsignedMedium();
					for (@Pc(221) int j = 1; j < local198; j++) {
						this.sounds[i][j] = buffer.readUnsignedShort();
					}
				}
			}
		} else if (code == 14) {
			this.aBoolean72 = true;
		} else if (code == 15) {
			this.tween = true;
		} else if (code == 16) {
			this.aBoolean71 = true;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIILclient!vg;)Lclient!vg;")
	public final Model method1021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Model arg4) {
		@Pc(10) int local10 = this.anIntArray94[arg2];
		arg2 = this.frames[arg2];
		@Pc(21) AnimFrameset local21 = SeqTypeList.getAnimFrameset(arg2 >> 16);
		arg2 &= 65535;
		if (local21 == null) {
			return arg4.method3833(true, true, true);
		}
		arg3 &= 3;
		@Pc(40) AnimFrameset local40 = null;
		if ((this.tween || forceTween) && arg0 != -1 && arg0 < this.frames.length) {
			arg0 = this.frames[arg0];
			local40 = SeqTypeList.getAnimFrameset(arg0 >> 16);
			arg0 &= 65535;
		}
		@Pc(116) Model local116;
		if (local40 == null) {
			local116 = arg4.method3833(!local21.isAlphaTransformed(arg2), !local21.isColorTransformed(arg2), !this.aBoolean72);
		} else {
			local116 = arg4.method3833(!local21.isAlphaTransformed(arg2) & !local40.isAlphaTransformed(arg0), !local21.isColorTransformed(arg2) & !local40.isColorTransformed(arg0), !this.aBoolean72);
		}
		if (GlRenderer.enabled && this.aBoolean72) {
			if (arg3 == 1) {
				((GlModel) local116).method3848();
			} else if (arg3 == 2) {
				((GlModel) local116).method3849();
			} else if (arg3 == 3) {
				((GlModel) local116).method3862();
			}
		} else if (arg3 == 1) {
			local116.method3827();
		} else if (arg3 == 2) {
			local116.method3828();
		} else if (arg3 == 3) {
			local116.method3820();
		}
		local116.method3835(local21, arg2, local40, arg0, arg1 - 1, local10, this.aBoolean72);
		if (GlRenderer.enabled && this.aBoolean72) {
			if (arg3 == 1) {
				((GlModel) local116).method3862();
			} else if (arg3 == 2) {
				((GlModel) local116).method3849();
			} else if (arg3 == 3) {
				((GlModel) local116).method3848();
			}
		} else if (arg3 == 1) {
			local116.method3820();
		} else if (arg3 == 2) {
			local116.method3828();
		} else if (arg3 == 3) {
			local116.method3827();
		}
		return local116;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
	public final void postDecode() {
		if (this.anInt1240 == -1) {
			if (this.aBooleanArray6 == null) {
				this.anInt1240 = 0;
			} else {
				this.anInt1240 = 2;
			}
		}
		if (this.anInt1237 != -1) {
			return;
		}
		if (this.aBooleanArray6 == null) {
			this.anInt1237 = 0;
		} else {
			this.anInt1237 = 2;
		}
	}
}
