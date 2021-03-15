import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class NpcType {

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "[S")
	private short[] recolorSource;

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "Lclient!ic;")
	private HashTable params;

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "[S")
	private short[] retextureDestination;

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "[I")
	private int[] anIntArray588;

	@OriginalMember(owner = "client!ua", name = "t", descriptor = "[[I")
	private int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!ua", name = "D", descriptor = "[I")
	private int[] anIntArray589;

	@OriginalMember(owner = "client!ua", name = "E", descriptor = "[I")
	public int[] multiNpcs;

	@OriginalMember(owner = "client!ua", name = "F", descriptor = "[S")
	private short[] rextureSource;

	@OriginalMember(owner = "client!ua", name = "M", descriptor = "I")
	public int id;

	@OriginalMember(owner = "client!ua", name = "Q", descriptor = "[S")
	private short[] recolorDestination;

	@OriginalMember(owner = "client!ua", name = "jb", descriptor = "[B")
	private byte[] aByteArray68;

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
	public int anInt5233 = -1;

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "Z")
	public boolean aBoolean354 = true;

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
	public int crawlSound = -1;

	@OriginalMember(owner = "client!ua", name = "G", descriptor = "I")
	public int idleSound = -1;

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
	public int prayerIcon = -1;

	@OriginalMember(owner = "client!ua", name = "H", descriptor = "I")
	public int walkSound = -1;

	@OriginalMember(owner = "client!ua", name = "I", descriptor = "S")
	public short aShort47 = 0;

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
	public int anInt5241 = -1;

	@OriginalMember(owner = "client!ua", name = "y", descriptor = "I")
	public int anInt5246 = -1;

	@OriginalMember(owner = "client!ua", name = "x", descriptor = "I")
	public int anInt5245 = -1;

	@OriginalMember(owner = "client!ua", name = "B", descriptor = "I")
	public int soundRadius = 0;

	@OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
	public int anInt5243 = 32;

	@OriginalMember(owner = "client!ua", name = "P", descriptor = "Z")
	public boolean aBoolean357 = true;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "B")
	public byte aByte18 = 7;

	@OriginalMember(owner = "client!ua", name = "K", descriptor = "I")
	private int anInt5254 = 0;

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
	public int anInt5240 = -1;

	@OriginalMember(owner = "client!ua", name = "z", descriptor = "I")
	private int anInt5247 = 128;

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "S")
	public short aShort46 = 0;

	@OriginalMember(owner = "client!ua", name = "W", descriptor = "I")
	public int size = 1;

	@OriginalMember(owner = "client!ua", name = "bb", descriptor = "I")
	private int multiNpcVarp = -1;

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
	private int multiNpcVarbit = -1;

	@OriginalMember(owner = "client!ua", name = "db", descriptor = "B")
	public byte aByte20 = -16;

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
	public int soundVolume = 255;

	@OriginalMember(owner = "client!ua", name = "ab", descriptor = "I")
	private int anInt5265 = 128;

	@OriginalMember(owner = "client!ua", name = "cb", descriptor = "I")
	public int anInt5267 = -1;

	@OriginalMember(owner = "client!ua", name = "gb", descriptor = "Z")
	public boolean aBoolean358 = true;

	@OriginalMember(owner = "client!ua", name = "V", descriptor = "I")
	public int basId = -1;

	@OriginalMember(owner = "client!ua", name = "fb", descriptor = "B")
	public byte aByte21 = 0;

	@OriginalMember(owner = "client!ua", name = "u", descriptor = "Z")
	public boolean aBoolean356 = true;

	@OriginalMember(owner = "client!ua", name = "A", descriptor = "I")
	public int runSound = -1;

	@OriginalMember(owner = "client!ua", name = "S", descriptor = "I")
	public int anInt5258 = -1;

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
	private int anInt5239 = 0;

	@OriginalMember(owner = "client!ua", name = "ib", descriptor = "[Ljava/lang/String;")
	public final String[] ops = new String[5];

	@OriginalMember(owner = "client!ua", name = "X", descriptor = "B")
	public byte aByte19 = -96;

	@OriginalMember(owner = "client!ua", name = "Z", descriptor = "I")
	public int anInt5264 = -1;

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "Z")
	public boolean aBoolean355 = false;

	@OriginalMember(owner = "client!ua", name = "lb", descriptor = "Ljava/lang/String;")
	public String name = "null";

	@OriginalMember(owner = "client!ua", name = "T", descriptor = "I")
	public int anInt5259 = -1;

	@OriginalMember(owner = "client!ua", name = "ob", descriptor = "Z")
	public boolean aBoolean359 = false;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)Z")
	public final boolean isMultiNpcValid() {
		if (this.multiNpcs == null) {
			return true;
		}
		@Pc(10) int value = -1;
		if (this.multiNpcVarbit != -1) {
			value = VarpDomain.getVarbit(this.multiNpcVarbit);
		} else if (this.multiNpcVarp != -1) {
			value = VarpDomain.varps[this.multiNpcVarp];
		}
		if (value < 0 || value >= this.multiNpcs.length - 1 || this.multiNpcs[value] == -1) {
			@Pc(60) int defaultMultiNpc = this.multiNpcs[this.multiNpcs.length - 1];
			return defaultMultiNpc != -1;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public final String getParam(@OriginalArg(1) int id, @OriginalArg(2) String defaultValue) {
		if (this.params == null) {
			return defaultValue;
		} else {
			@Pc(23) StringNode node = (StringNode) this.params.get(id);
			return node == null ? defaultValue : node.value;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!fd;BI)V")
	private void decode(@OriginalArg(0) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 1) {
			@Pc(15) int local15 = buffer.readUnsignedByte();
			this.anIntArray589 = new int[local15];
			for (@Pc(21) int local21 = 0; local21 < local15; local21++) {
				this.anIntArray589[local21] = buffer.readUnsignedShort();
				if (this.anIntArray589[local21] == 65535) {
					this.anIntArray589[local21] = -1;
				}
			}
		} else if (code == 2) {
			this.name = buffer.readString();
		} else if (code == 12) {
			this.size = buffer.readUnsignedByte();
		} else if (code >= 30 && code < 35) {
			this.ops[code - 30] = buffer.readString();
			if (this.ops[code - 30].equalsIgnoreCase(LocalisedText.HIDDEN)) {
				this.ops[code - 30] = null;
			}
		} else if (code == 40) {
			@Pc(117) int local117 = buffer.readUnsignedByte();
			this.recolorSource = new short[local117];
			this.recolorDestination = new short[local117];
			for (@Pc(127) int local127 = 0; local127 < local117; local127++) {
				this.recolorSource[local127] = (short) buffer.readUnsignedShort();
				this.recolorDestination[local127] = (short) buffer.readUnsignedShort();
			}
		} else if (code == 41) {
			@Pc(869) int local869 = buffer.readUnsignedByte();
			this.rextureSource = new short[local869];
			this.retextureDestination = new short[local869];
			for (@Pc(879) int local879 = 0; local879 < local869; local879++) {
				this.rextureSource[local879] = (short) buffer.readUnsignedShort();
				this.retextureDestination[local879] = (short) buffer.readUnsignedShort();
			}
		} else if (code == 42) {
			@Pc(840) int local840 = buffer.readUnsignedByte();
			this.aByteArray68 = new byte[local840];
			for (@Pc(846) int local846 = 0; local846 < local840; local846++) {
				this.aByteArray68[local846] = buffer.readByte();
			}
		} else if (code == 60) {
			@Pc(811) int local811 = buffer.readUnsignedByte();
			this.anIntArray588 = new int[local811];
			for (@Pc(817) int local817 = 0; local817 < local811; local817++) {
				this.anIntArray588[local817] = buffer.readUnsignedShort();
			}
		} else if (code == 93) {
			this.aBoolean356 = false;
		} else if (code == 95) {
			this.anInt5246 = buffer.readUnsignedShort();
		} else if (code == 97) {
			this.anInt5247 = buffer.readUnsignedShort();
		} else if (code == 98) {
			this.anInt5265 = buffer.readUnsignedShort();
		} else if (code == 99) {
			this.aBoolean359 = true;
		} else if (code == 100) {
			this.anInt5254 = buffer.readByte();
		} else if (code == 101) {
			this.anInt5239 = buffer.readByte() * 5;
		} else if (code == 102) {
			this.prayerIcon = buffer.readUnsignedShort();
		} else if (code == 103) {
			this.anInt5243 = buffer.readUnsignedShort();
		} else if (code == 106 || code == 118) {
			this.multiNpcVarbit = buffer.readUnsignedShort();
			@Pc(248) int defaultMultiNpc = -1;
			if (this.multiNpcVarbit == 65535) {
				this.multiNpcVarbit = -1;
			}
			this.multiNpcVarp = buffer.readUnsignedShort();
			if (this.multiNpcVarp == 65535) {
				this.multiNpcVarp = -1;
			}
			if (code == 118) {
				defaultMultiNpc = buffer.readUnsignedShort();
				if (defaultMultiNpc == 65535) {
					defaultMultiNpc = -1;
				}
			}
			@Pc(289) int len = buffer.readUnsignedByte();
			this.multiNpcs = new int[len + 2];
			for (@Pc(297) int i = 0; i <= len; i++) {
				this.multiNpcs[i] = buffer.readUnsignedShort();
				if (this.multiNpcs[i] == 65535) {
					this.multiNpcs[i] = -1;
				}
			}
			this.multiNpcs[len + 1] = defaultMultiNpc;
		} else if (code == 107) {
			this.aBoolean357 = false;
		} else if (code == 109) {
			this.aBoolean358 = false;
		} else if (code == 111) {
			this.aBoolean354 = false;
		} else if (code == 113) {
			this.aShort47 = (short) buffer.readUnsignedShort();
			this.aShort46 = (short) buffer.readUnsignedShort();
		} else if (code == 114) {
			this.aByte19 = buffer.readByte();
			this.aByte20 = buffer.readByte();
		} else if (code == 115) {
			buffer.readUnsignedByte();
			buffer.readUnsignedByte();
		} else if (code == 119) {
			this.aByte21 = buffer.readByte();
		} else if (code == 121) {
			this.anIntArrayArray46 = new int[this.anIntArray589.length][];
			@Pc(714) int local714 = buffer.readUnsignedByte();
			for (@Pc(716) int local716 = 0; local716 < local714; local716++) {
				@Pc(723) int local723 = buffer.readUnsignedByte();
				@Pc(731) int[] local731 = this.anIntArrayArray46[local723] = new int[3];
				local731[0] = buffer.readByte();
				local731[1] = buffer.readByte();
				local731[2] = buffer.readByte();
			}
		} else if (code == 122) {
			this.anInt5240 = buffer.readUnsignedShort();
		} else if (code == 123) {
			this.anInt5259 = buffer.readUnsignedShort();
		} else if (code == 125) {
			this.aByte18 = buffer.readByte();
		} else if (code == 127) {
			this.basId = buffer.readUnsignedShort();
		} else if (code == 128) {
			buffer.readUnsignedByte();
		} else if (code == 134) {
			this.idleSound = buffer.readUnsignedShort();
			if (this.idleSound == 65535) {
				this.idleSound = -1;
			}
			this.crawlSound = buffer.readUnsignedShort();
			if (this.crawlSound == 65535) {
				this.crawlSound = -1;
			}
			this.walkSound = buffer.readUnsignedShort();
			if (this.walkSound == 65535) {
				this.walkSound = -1;
			}
			this.runSound = buffer.readUnsignedShort();
			if (this.runSound == 65535) {
				this.runSound = -1;
			}
			this.soundRadius = buffer.readUnsignedByte();
		} else if (code == 135) {
			this.anInt5245 = buffer.readUnsignedByte();
			this.anInt5264 = buffer.readUnsignedShort();
		} else if (code == 136) {
			this.anInt5233 = buffer.readUnsignedByte();
			this.anInt5258 = buffer.readUnsignedShort();
		} else if (code == 137) {
			this.anInt5241 = buffer.readUnsignedShort();
		} else if (code == 140) {
			this.soundVolume = buffer.readUnsignedByte();
		} else if (code == 141) {
			this.aBoolean355 = true;
		} else if (code == 142) {
			this.anInt5267 = buffer.readUnsignedShort();
		} else if (code >= 150 && code < 155) {
			this.ops[code - 150] = buffer.readString();
			if (!NpcTypeList.allowMembers || this.ops[code - 150].equalsIgnoreCase(LocalisedText.HIDDEN)) {
				this.ops[code - 150] = null;
			}
		} else if (code == 249) {
			@Pc(576) int size = buffer.readUnsignedByte();
			if (this.params == null) {
				@Pc(583) int buckets = IntUtils.clp2(size);
				this.params = new HashTable(buckets);
			}
			for (@Pc(591) int i = 0; i < size; i++) {
				@Pc(607) boolean string = buffer.readUnsignedByte() == 1;
				@Pc(611) int id = buffer.readUnsignedMedium();
				@Pc(620) Node node;
				if (string) {
					node = new StringNode(buffer.readString());
				} else {
					node = new IntNode(buffer.readInt());
				}
				this.params.put(id, node);
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)Z")
	public final boolean hasAreaSound() {
		if (this.multiNpcs == null) {
			return this.idleSound != -1 || this.walkSound != -1 || this.runSound != -1;
		}
		for (@Pc(30) int i = 0; i < this.multiNpcs.length; i++) {
			if (this.multiNpcs[i] != -1) {
				@Pc(54) NpcType type = NpcTypeList.get(this.multiNpcs[i]);
				if (type.idleSound != -1 || type.walkSound != -1 || type.runSound != -1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V")
	public final void postDecode() {
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(III)I")
	public final int getParam(@OriginalArg(2) int id, @OriginalArg(1) int defaultValue) {
		if (this.params == null) {
			return defaultValue;
		} else {
			@Pc(25) IntNode node = (IntNode) this.params.get(id);
			return node == null ? defaultValue : node.value;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!fd;B)V")
	public final void decode(@OriginalArg(0) Buffer buffer) {
		while (true) {
			@Pc(17) int code = buffer.readUnsignedByte();
			if (code == 0) {
				return;
			}
			this.decode(buffer, code);
		}
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)Lclient!ua;")
	public final NpcType getMultiNpc() {
		@Pc(13) int value = -1;
		if (this.multiNpcVarbit != -1) {
			value = VarpDomain.getVarbit(this.multiNpcVarbit);
		} else if (this.multiNpcVarp != -1) {
			value = VarpDomain.varps[this.multiNpcVarp];
		}
		if (value < 0 || value >= this.multiNpcs.length - 1 || this.multiNpcs[value] == -1) {
			@Pc(68) int defaultMultiNpc = this.multiNpcs[this.multiNpcs.length - 1];
			return defaultMultiNpc == -1 ? null : NpcTypeList.get(defaultMultiNpc);
		} else {
			return NpcTypeList.get(this.multiNpcs[value]);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!eg;BII)Lclient!vg;")
	public final Model method4266(@OriginalArg(0) int arg0, @OriginalArg(1) SeqType arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.multiNpcs != null) {
			@Pc(13) NpcType local13 = this.getMultiNpc();
			return local13 == null ? null : local13.method4266(arg0, arg1, arg2, arg3);
		} else if (this.anIntArray588 == null) {
			return null;
		} else {
			@Pc(40) Model local40 = (Model) NpcTypeList.headModels.get((long) this.id);
			if (local40 == null) {
				@Pc(52) boolean local52 = false;
				for (@Pc(54) int local54 = 0; local54 < this.anIntArray588.length; local54++) {
					if (!NpcTypeList.modelsArchive.isFileReady(this.anIntArray588[local54], 0)) {
						local52 = true;
					}
				}
				if (local52) {
					return null;
				}
				@Pc(87) RawModel[] local87 = new RawModel[this.anIntArray588.length];
				for (@Pc(89) int local89 = 0; local89 < this.anIntArray588.length; local89++) {
					local87[local89] = RawModel.create(NpcTypeList.modelsArchive, this.anIntArray588[local89]);
				}
				@Pc(122) RawModel local122;
				if (local87.length == 1) {
					local122 = local87[0];
				} else {
					local122 = new RawModel(local87, local87.length);
				}
				if (this.recolorSource != null) {
					for (@Pc(132) int i = 0; i < this.recolorSource.length; i++) {
						if (this.aByteArray68 == null || this.aByteArray68.length <= i) {
							local122.recolor(this.recolorSource[i], this.recolorDestination[i]);
						} else {
							local122.recolor(this.recolorSource[i], Static7.aShortArray111[this.aByteArray68[i] & 0xFF]);
						}
					}
				}
				if (this.rextureSource != null) {
					for (@Pc(184) int i = 0; i < this.rextureSource.length; i++) {
						local122.retexture(this.rextureSource[i], this.retextureDestination[i]);
					}
				}
				local40 = local122.createModel(64, 768, -50, -10, -50);
				NpcTypeList.headModels.put((long) this.id, local40);
			}
			if (arg1 != null) {
				local40 = arg1.method1017(arg2, arg0, local40, arg3);
			}
			return local40;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIILclient!eg;Lclient!eg;I[Lclient!re;III)Lclient!vg;")
	public final Model method4268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) SeqType arg2, @OriginalArg(4) SeqType arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class150[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.multiNpcs != null) {
			@Pc(13) NpcType local13 = this.getMultiNpc();
			return local13 == null ? null : local13.method4268(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
		@Pc(39) Model local39 = (Model) NpcTypeList.models.get((long) this.id);
		if (local39 == null) {
			@Pc(44) boolean local44 = false;
			for (@Pc(46) int local46 = 0; local46 < this.anIntArray589.length; local46++) {
				if (this.anIntArray589[local46] != -1 && !NpcTypeList.modelsArchive.isFileReady(this.anIntArray589[local46], 0)) {
					local44 = true;
				}
			}
			if (local44) {
				return null;
			}
			@Pc(81) RawModel[] local81 = new RawModel[this.anIntArray589.length];
			for (@Pc(83) int local83 = 0; local83 < this.anIntArray589.length; local83++) {
				if (this.anIntArray589[local83] != -1) {
					local81[local83] = RawModel.create(NpcTypeList.modelsArchive, this.anIntArray589[local83]);
					if (this.anIntArrayArray46 != null && this.anIntArrayArray46[local83] != null && local81[local83] != null) {
						local81[local83].translate(this.anIntArrayArray46[local83][0], this.anIntArrayArray46[local83][1], this.anIntArrayArray46[local83][2]);
					}
				}
			}
			@Pc(146) BasType local146 = null;
			if (this.basId != -1) {
				local146 = BasTypeList.get(this.basId);
			}
			if (local146 != null && local146.anIntArrayArray7 != null) {
				for (@Pc(165) int local165 = 0; local165 < local146.anIntArrayArray7.length; local165++) {
					if (local146.anIntArrayArray7[local165] != null && local165 < local81.length && local81[local165] != null) {
						@Pc(193) int local193 = local146.anIntArrayArray7[local165][0];
						@Pc(200) int local200 = local146.anIntArrayArray7[local165][3];
						@Pc(207) int local207 = local146.anIntArrayArray7[local165][2];
						@Pc(214) int local214 = local146.anIntArrayArray7[local165][1];
						@Pc(221) int local221 = local146.anIntArrayArray7[local165][4];
						@Pc(228) int local228 = local146.anIntArrayArray7[local165][5];
						if (this.anIntArrayArray45 == null) {
							this.anIntArrayArray45 = new int[local146.anIntArrayArray7.length][];
						}
						if (this.anIntArrayArray45[local165] == null) {
							@Pc(252) int[] local252 = this.anIntArrayArray45[local165] = new int[15];
							if (local200 == 0 && local221 == 0 && local228 == 0) {
								local252[13] = -local214;
								local252[0] = local252[4] = local252[8] = 32768;
								local252[12] = -local193;
								local252[14] = -local207;
							} else {
								@Pc(271) int local271 = MathUtils.COSINE[local200] >> 1;
								@Pc(277) int local277 = MathUtils.SINE[local200] >> 1;
								@Pc(283) int local283 = MathUtils.COSINE[local221] >> 1;
								@Pc(289) int local289 = MathUtils.SINE[local221] >> 1;
								@Pc(295) int local295 = MathUtils.COSINE[local228] >> 1;
								@Pc(301) int local301 = MathUtils.SINE[local228] >> 1;
								@Pc(309) int local309 = local295 * local277 + 16384 >> 15;
								local252[8] = local283 * local271 + 16384 >> 15;
								local252[5] = -local277;
								local252[1] = local289 * local309 + -local301 * local283 + 16384 >> 15;
								local252[4] = local271 * local295 + 16384 >> 15;
								@Pc(357) int local357 = local301 * local277 + 16384 >> 15;
								local252[6] = local295 * -local289 + local283 * local357 + 16384 >> 15;
								local252[3] = local301 * local271 + 16384 >> 15;
								local252[2] = local271 * local289 + 16384 >> 15;
								local252[0] = local357 * local289 + local295 * local283 + 16384 >> 15;
								local252[7] = -local301 * -local289 + local309 * local283 + 16384 >> 15;
								local252[12] = local252[6] * -local207 + local252[0] * -local193 + -local214 * local252[3] + 16384 >> 15;
								local252[13] = -local214 * local252[4] + local252[1] * -local193 + local252[7] * -local207 + 16384 >> 15;
								local252[14] = local252[8] * -local207 + -local193 * local252[2] + -local214 * local252[5] + 16384 >> 15;
							}
							local252[10] = local214;
							local252[11] = local207;
							local252[9] = local193;
						}
						if (local200 != 0 || local221 != 0 || local228 != 0) {
							local81[local165].method2754(local200, local221, local228);
						}
						if (local193 != 0 || local214 != 0 || local207 != 0) {
							local81[local165].translate(local193, local214, local207);
						}
					}
				}
			}
			@Pc(597) RawModel local597;
			if (local81.length == 1) {
				local597 = local81[0];
			} else {
				local597 = new RawModel(local81, local81.length);
			}
			if (this.recolorSource != null) {
				for (@Pc(610) int i = 0; i < this.recolorSource.length; i++) {
					if (this.aByteArray68 == null || i >= this.aByteArray68.length) {
						local597.recolor(this.recolorSource[i], this.recolorDestination[i]);
					} else {
						local597.recolor(this.recolorSource[i], Static7.aShortArray111[this.aByteArray68[i] & 0xFF]);
					}
				}
			}
			if (this.rextureSource != null) {
				for (@Pc(665) int i = 0; i < this.rextureSource.length; i++) {
					local597.retexture(this.rextureSource[i], this.retextureDestination[i]);
				}
			}
			local39 = local597.createModel(this.anInt5254 + 64, this.anInt5239 + 850, -30, -50, -30);
			if (GlRenderer.enabled) {
				((GlModel) local39).method3872(false, false, false, false, false, true);
			}
			NpcTypeList.models.put((long) this.id, local39);
		}
		@Pc(718) boolean local718 = false;
		@Pc(720) boolean local720 = false;
		@Pc(722) boolean local722 = false;
		@Pc(724) boolean local724 = false;
		@Pc(731) int local731 = arg5 == null ? 0 : arg5.length;
		for (@Pc(733) int local733 = 0; local733 < local731; local733++) {
			if (arg5[local733] != null) {
				@Pc(752) SeqType local752 = SeqTypeList.get(arg5[local733].anInt4456);
				if (local752.anIntArray95 != null) {
					Static2.aClass46Array1[local733] = local752;
					local718 = true;
					@Pc(769) int local769 = arg5[local733].anInt4462;
					@Pc(774) int local774 = arg5[local733].anInt4464;
					@Pc(779) int local779 = local752.anIntArray95[local769];
					Static1.aClass4_Sub3_Sub19Array1[local733] = SeqTypeList.getAnimFrameset(local779 >>> 16);
					local779 &= 65535;
					Static5.anIntArray398[local733] = local779;
					if (Static1.aClass4_Sub3_Sub19Array1[local733] != null) {
						local722 |= Static1.aClass4_Sub3_Sub19Array1[local733].method4151(local779);
						local720 |= Static1.aClass4_Sub3_Sub19Array1[local733].method4150(local779);
						local724 |= local752.aBoolean72;
					}
					if ((local752.tween || SeqType.forceTween) && local774 != -1 && local774 < local752.anIntArray95.length) {
						Static6.anIntArray528[local733] = local752.anIntArray94[local769];
						Static1.anIntArray47[local733] = arg5[local733].anInt4460;
						@Pc(861) int local861 = local752.anIntArray95[local774];
						Static5.aClass4_Sub3_Sub19Array3[local733] = SeqTypeList.getAnimFrameset(local861 >>> 16);
						local861 &= 65535;
						Static4.anIntArray654[local733] = local861;
						if (Static5.aClass4_Sub3_Sub19Array3[local733] != null) {
							local722 |= Static5.aClass4_Sub3_Sub19Array3[local733].method4151(local861);
							local720 |= Static5.aClass4_Sub3_Sub19Array3[local733].method4150(local861);
						}
					} else {
						Static6.anIntArray528[local733] = 0;
						Static1.anIntArray47[local733] = 0;
						Static5.aClass4_Sub3_Sub19Array3[local733] = null;
						Static4.anIntArray654[local733] = -1;
					}
				}
			}
		}
		if (!local718 && arg3 == null && arg2 == null) {
			@Pc(934) Model local934 = local39.method3831(true, true, true);
			if (this.anInt5247 != 128 || this.anInt5265 != 128) {
				local934.resize(this.anInt5247, this.anInt5265, this.anInt5247);
			}
			return local934;
		}
		@Pc(956) int local956 = -1;
		@Pc(958) int local958 = -1;
		@Pc(960) AnimFrameset local960 = null;
		@Pc(962) AnimFrameset local962 = null;
		@Pc(964) int local964 = 0;
		if (arg3 != null) {
			@Pc(973) int local973 = arg3.anIntArray95[arg0];
			@Pc(977) int local977 = local973 >>> 16;
			local960 = SeqTypeList.getAnimFrameset(local977);
			local958 = local973 & 0xFFFF;
			if (local960 != null) {
				local722 |= local960.method4151(local958);
				local720 |= local960.method4150(local958);
				local724 |= arg3.aBoolean72;
			}
			if ((arg3.tween || SeqType.forceTween) && arg4 != -1 && arg4 < arg3.anIntArray95.length) {
				@Pc(1031) int local1031 = arg3.anIntArray95[arg4];
				local964 = arg3.anIntArray94[arg0];
				@Pc(1040) int local1040 = local1031 >>> 16;
				local956 = local1031 & 0xFFFF;
				if (local1040 == local977) {
					local962 = local960;
				} else {
					local962 = SeqTypeList.getAnimFrameset(local956 >>> 16);
				}
				if (local962 != null) {
					local722 |= local962.method4151(local956);
					local720 |= local962.method4150(local956);
				}
			}
		}
		@Pc(1080) int local1080 = -1;
		@Pc(1082) int local1082 = -1;
		@Pc(1084) int local1084 = 0;
		@Pc(1086) AnimFrameset local1086 = null;
		@Pc(1088) AnimFrameset local1088 = null;
		if (arg2 != null) {
			@Pc(1096) int local1096 = arg2.anIntArray95[arg7];
			@Pc(1100) int local1100 = local1096 >>> 16;
			local1082 = local1096 & 0xFFFF;
			local1086 = SeqTypeList.getAnimFrameset(local1100);
			if (local1086 != null) {
				local722 |= local1086.method4151(local1082);
				local720 |= local1086.method4150(local1082);
				local724 |= arg2.aBoolean72;
			}
			if ((arg2.tween || SeqType.forceTween) && arg6 != -1 && arg6 < arg2.anIntArray95.length) {
				local1084 = arg2.anIntArray94[arg7];
				@Pc(1158) int local1158 = arg2.anIntArray95[arg6];
				@Pc(1162) int local1162 = local1158 >>> 16;
				local1080 = local1158 & 0xFFFF;
				if (local1162 == local1100) {
					local1088 = local1086;
				} else {
					local1088 = SeqTypeList.getAnimFrameset(local1080 >>> 16);
				}
				if (local1088 != null) {
					local722 |= local1088.method4151(local1080);
					local720 |= local1088.method4150(local1080);
				}
			}
		}
		@Pc(1218) Model local1218 = local39.method3831(!local720, !local722, !local724);
		@Pc(1220) int local1220 = 1;
		for (@Pc(1228) int local1228 = 0; local1228 < local731; local1228++) {
			if (Static1.aClass4_Sub3_Sub19Array1[local1228] != null) {
				local1218.method3839(Static1.aClass4_Sub3_Sub19Array1[local1228], Static5.anIntArray398[local1228], Static5.aClass4_Sub3_Sub19Array3[local1228], Static4.anIntArray654[local1228], Static1.anIntArray47[local1228] - 1, Static6.anIntArray528[local1228], local1220, Static2.aClass46Array1[local1228].aBoolean72, this.anIntArrayArray45[local1228]);
			}
			local1220 <<= 1;
		}
		if (local960 != null && local1086 != null) {
			local1218.method3816(local960, local958, local962, local956, arg8 - 1, local964, local1086, local1082, local1088, local1080, arg1 - 1, local1084, arg3.aBooleanArray6, arg3.aBoolean72 | arg2.aBoolean72);
		} else if (local960 != null) {
			local1218.method3835(local960, local958, local962, local956, arg8 - 1, local964, arg3.aBoolean72);
		} else if (local1086 != null) {
			local1218.method3835(local1086, local1082, local1088, local1080, arg1 - 1, local1084, arg2.aBoolean72);
		}
		for (@Pc(1342) int local1342 = 0; local1342 < local731; local1342++) {
			Static1.aClass4_Sub3_Sub19Array1[local1342] = null;
			Static5.aClass4_Sub3_Sub19Array3[local1342] = null;
			Static2.aClass46Array1[local1342] = null;
		}
		if (this.anInt5247 != 128 || this.anInt5265 != 128) {
			local1218.resize(this.anInt5247, this.anInt5265, this.anInt5247);
		}
		return local1218;
	}
}
