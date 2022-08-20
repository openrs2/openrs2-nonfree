import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class NpcType {

	@OriginalMember(owner = "client!fm", name = "h", descriptor = "[Lclient!eg;")
	private static final SeqType[] aClass46Array1 = new SeqType[14];

	@OriginalMember(owner = "client!cj", name = "C", descriptor = "[Lclient!te;")
	private static final AnimFrameset[] aClass4_Sub3_Sub19Array1 = new AnimFrameset[14];

	@OriginalMember(owner = "client!o", name = "J", descriptor = "[I")
	private static final int[] anIntArray398 = new int[14];

	@OriginalMember(owner = "client!sj", name = "A", descriptor = "[I")
	private static final int[] anIntArray528 = new int[14];

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "[I")
	private static final int[] anIntArray47 = new int[14];

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "[Lclient!te;")
	private static final AnimFrameset[] aClass4_Sub3_Sub19Array3 = new AnimFrameset[14];

	@OriginalMember(owner = "client!jo", name = "O", descriptor = "[I")
	private static final int[] anIntArray654 = new int[14];

	@OriginalMember(owner = "client!un", name = "z", descriptor = "[S")
	public static short[] recolorPalette = new short[256];

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "[S")
	private short[] recolorSource;

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "Lclient!ic;")
	private HashTable params;

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "[S")
	private short[] retextureDestination;

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "[I")
	private int[] headModelIds;

	@OriginalMember(owner = "client!ua", name = "t", descriptor = "[[I")
	private int[][] bodyTranslate;

	@OriginalMember(owner = "client!ua", name = "D", descriptor = "[I")
	private int[] bodyModelIds;

	@OriginalMember(owner = "client!ua", name = "E", descriptor = "[I")
	public int[] multiNpcs;

	@OriginalMember(owner = "client!ua", name = "F", descriptor = "[S")
	private short[] rextureSource;

	@OriginalMember(owner = "client!ua", name = "M", descriptor = "I")
	public int id;

	@OriginalMember(owner = "client!ua", name = "Q", descriptor = "[S")
	private short[] recolorDestination;

	@OriginalMember(owner = "client!ua", name = "jb", descriptor = "[B")
	private byte[] recolorDestinationIndex;

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
	public int cursor2Op = -1;

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "Z")
	public boolean shadow = true;

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
	public int cursor = -1;

	@OriginalMember(owner = "client!ua", name = "y", descriptor = "I")
	public int combatLevel = -1;

	@OriginalMember(owner = "client!ua", name = "x", descriptor = "I")
	public int cursor1Op = -1;

	@OriginalMember(owner = "client!ua", name = "B", descriptor = "I")
	public int soundRadius = 0;

	@OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
	public int turnSpeed = 32;

	@OriginalMember(owner = "client!ua", name = "P", descriptor = "Z")
	public boolean interactive = true;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "B")
	public byte spawnDirection = 7;

	@OriginalMember(owner = "client!ua", name = "K", descriptor = "I")
	private int ambient = 0;

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
	public int hitBarId = -1;

	@OriginalMember(owner = "client!ua", name = "z", descriptor = "I")
	private int resizeXZ = 128;

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
	private int resizeY = 128;

	@OriginalMember(owner = "client!ua", name = "cb", descriptor = "I")
	public int mapElement = -1;

	@OriginalMember(owner = "client!ua", name = "gb", descriptor = "Z")
	public boolean aBoolean358 = true;

	@OriginalMember(owner = "client!ua", name = "V", descriptor = "I")
	public int basId = -1;

	@OriginalMember(owner = "client!ua", name = "fb", descriptor = "B")
	public byte movementFlags = 0;

	@OriginalMember(owner = "client!ua", name = "u", descriptor = "Z")
	public boolean miniMapVisible = true;

	@OriginalMember(owner = "client!ua", name = "A", descriptor = "I")
	public int runSound = -1;

	@OriginalMember(owner = "client!ua", name = "S", descriptor = "I")
	public int cursor2 = -1;

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
	private int contrast = 0;

	@OriginalMember(owner = "client!ua", name = "ib", descriptor = "[Ljava/lang/String;")
	public final String[] ops = new String[5];

	@OriginalMember(owner = "client!ua", name = "X", descriptor = "B")
	public byte aByte19 = -96;

	@OriginalMember(owner = "client!ua", name = "Z", descriptor = "I")
	public int cursor1 = -1;

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
			@Pc(15) int len = buffer.readUnsignedByte();
			this.bodyModelIds = new int[len];
			for (@Pc(21) int i = 0; i < len; i++) {
				this.bodyModelIds[i] = buffer.readUnsignedShort();
				if (this.bodyModelIds[i] == 65535) {
					this.bodyModelIds[i] = -1;
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
			@Pc(117) int len = buffer.readUnsignedByte();
			this.recolorSource = new short[len];
			this.recolorDestination = new short[len];
			for (@Pc(127) int i = 0; i < len; i++) {
				this.recolorSource[i] = (short) buffer.readUnsignedShort();
				this.recolorDestination[i] = (short) buffer.readUnsignedShort();
			}
		} else if (code == 41) {
			@Pc(869) int len = buffer.readUnsignedByte();
			this.rextureSource = new short[len];
			this.retextureDestination = new short[len];
			for (@Pc(879) int i = 0; i < len; i++) {
				this.rextureSource[i] = (short) buffer.readUnsignedShort();
				this.retextureDestination[i] = (short) buffer.readUnsignedShort();
			}
		} else if (code == 42) {
			@Pc(840) int len = buffer.readUnsignedByte();
			this.recolorDestinationIndex = new byte[len];
			for (@Pc(846) int i = 0; i < len; i++) {
				this.recolorDestinationIndex[i] = buffer.readByte();
			}
		} else if (code == 60) {
			@Pc(811) int len = buffer.readUnsignedByte();
			this.headModelIds = new int[len];
			for (@Pc(817) int i = 0; i < len; i++) {
				this.headModelIds[i] = buffer.readUnsignedShort();
			}
		} else if (code == 93) {
			this.miniMapVisible = false;
		} else if (code == 95) {
			this.combatLevel = buffer.readUnsignedShort();
		} else if (code == 97) {
			this.resizeXZ = buffer.readUnsignedShort();
		} else if (code == 98) {
			this.resizeY = buffer.readUnsignedShort();
		} else if (code == 99) {
			this.aBoolean359 = true;
		} else if (code == 100) {
			this.ambient = buffer.readByte();
		} else if (code == 101) {
			this.contrast = buffer.readByte() * 5;
		} else if (code == 102) {
			this.prayerIcon = buffer.readUnsignedShort();
		} else if (code == 103) {
			this.turnSpeed = buffer.readUnsignedShort();
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
			this.interactive = false;
		} else if (code == 109) {
			this.aBoolean358 = false;
		} else if (code == 111) {
			this.shadow = false;
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
			this.movementFlags = buffer.readByte();
		} else if (code == 121) {
			this.bodyTranslate = new int[this.bodyModelIds.length][];
			@Pc(714) int count = buffer.readUnsignedByte();
			for (@Pc(716) int i = 0; i < count; i++) {
				@Pc(723) int index = buffer.readUnsignedByte();
				@Pc(731) int[] translation = this.bodyTranslate[index] = new int[3];
				translation[0] = buffer.readByte();
				translation[1] = buffer.readByte();
				translation[2] = buffer.readByte();
			}
		} else if (code == 122) {
			this.hitBarId = buffer.readUnsignedShort();
		} else if (code == 123) {
			this.anInt5259 = buffer.readUnsignedShort();
		} else if (code == 125) {
			this.spawnDirection = buffer.readByte();
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
			this.cursor1Op = buffer.readUnsignedByte();
			this.cursor1 = buffer.readUnsignedShort();
		} else if (code == 136) {
			this.cursor2Op = buffer.readUnsignedByte();
			this.cursor2 = buffer.readUnsignedShort();
		} else if (code == 137) {
			this.cursor = buffer.readUnsignedShort();
		} else if (code == 140) {
			this.soundVolume = buffer.readUnsignedByte();
		} else if (code == 141) {
			this.aBoolean355 = true;
		} else if (code == 142) {
			this.mapElement = buffer.readUnsignedShort();
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
	public final Model getHeadModel(@OriginalArg(0) int arg0, @OriginalArg(1) SeqType arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.multiNpcs != null) {
			@Pc(13) NpcType type = this.getMultiNpc();
			return type == null ? null : type.getHeadModel(arg0, arg1, arg2, arg3);
		} else if (this.headModelIds == null) {
			return null;
		} else {
			@Pc(40) Model model = (Model) NpcTypeList.headModels.get(this.id);
			if (model == null) {
				@Pc(52) boolean incomplete = false;
				for (@Pc(54) int local54 = 0; local54 < this.headModelIds.length; local54++) {
					if (!NpcTypeList.modelsArchive.isFileReady(this.headModelIds[local54], 0)) {
						incomplete = true;
					}
				}
				if (incomplete) {
					return null;
				}
				@Pc(87) RawModel[] local87 = new RawModel[this.headModelIds.length];
				for (@Pc(89) int local89 = 0; local89 < this.headModelIds.length; local89++) {
					local87[local89] = RawModel.create(NpcTypeList.modelsArchive, this.headModelIds[local89]);
				}
				@Pc(122) RawModel local122;
				if (local87.length == 1) {
					local122 = local87[0];
				} else {
					local122 = new RawModel(local87, local87.length);
				}
				if (this.recolorSource != null) {
					for (@Pc(132) int i = 0; i < this.recolorSource.length; i++) {
						if (this.recolorDestinationIndex == null || this.recolorDestinationIndex.length <= i) {
							local122.recolor(this.recolorSource[i], this.recolorDestination[i]);
						} else {
							local122.recolor(this.recolorSource[i], recolorPalette[this.recolorDestinationIndex[i] & 0xFF]);
						}
					}
				}
				if (this.rextureSource != null) {
					for (@Pc(184) int i = 0; i < this.rextureSource.length; i++) {
						local122.retexture(this.rextureSource[i], this.retextureDestination[i]);
					}
				}
				model = local122.createModel(64, 768, -50, -10, -50);
				NpcTypeList.headModels.put((long) this.id, model);
			}
			if (arg1 != null) {
				model = arg1.method1017(arg2, arg0, model, arg3);
			}
			return model;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIILclient!eg;Lclient!eg;I[Lclient!re;III)Lclient!vg;")
	public final Model getBodyModel(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) SeqType arg2, @OriginalArg(4) SeqType arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Seq[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.multiNpcs != null) {
			@Pc(13) NpcType type = this.getMultiNpc();
			return type == null ? null : type.getBodyModel(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
		@Pc(39) Model model = (Model) NpcTypeList.bodyModels.get(this.id);
		if (model == null) {
			@Pc(44) boolean incomplete = false;
			for (@Pc(46) int i = 0; i < this.bodyModelIds.length; i++) {
				if (this.bodyModelIds[i] != -1 && !NpcTypeList.modelsArchive.isFileReady(this.bodyModelIds[i], 0)) {
					incomplete = true;
				}
			}
			if (incomplete) {
				return null;
			}
			@Pc(81) RawModel[] models = new RawModel[this.bodyModelIds.length];
			for (@Pc(83) int i = 0; i < this.bodyModelIds.length; i++) {
				if (this.bodyModelIds[i] != -1) {
					models[i] = RawModel.create(NpcTypeList.modelsArchive, this.bodyModelIds[i]);
					if (this.bodyTranslate != null && this.bodyTranslate[i] != null && models[i] != null) {
						models[i].translate(this.bodyTranslate[i][0], this.bodyTranslate[i][1], this.bodyTranslate[i][2]);
					}
				}
			}
			@Pc(146) BasType basType = null;
			if (this.basId != -1) {
				basType = BasTypeList.get(this.basId);
			}
			if (basType != null && basType.equipmentTransforms != null) {
				for (@Pc(165) int slot = 0; slot < basType.equipmentTransforms.length; slot++) {
					if (basType.equipmentTransforms[slot] != null && slot < models.length && models[slot] != null) {
						@Pc(193) int dx = basType.equipmentTransforms[slot][0];
						@Pc(200) int local200 = basType.equipmentTransforms[slot][3];
						@Pc(207) int dz = basType.equipmentTransforms[slot][2];
						@Pc(214) int dy = basType.equipmentTransforms[slot][1];
						@Pc(221) int local221 = basType.equipmentTransforms[slot][4];
						@Pc(228) int local228 = basType.equipmentTransforms[slot][5];
						if (this.anIntArrayArray45 == null) {
							this.anIntArrayArray45 = new int[basType.equipmentTransforms.length][];
						}
						if (this.anIntArrayArray45[slot] == null) {
							@Pc(252) int[] local252 = this.anIntArrayArray45[slot] = new int[15];
							if (local200 == 0 && local221 == 0 && local228 == 0) {
								local252[13] = -dy;
								local252[0] = local252[4] = local252[8] = 32768;
								local252[12] = -dx;
								local252[14] = -dz;
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
								local252[12] = local252[6] * -dz + local252[0] * -dx + -dy * local252[3] + 16384 >> 15;
								local252[13] = -dy * local252[4] + local252[1] * -dx + local252[7] * -dz + 16384 >> 15;
								local252[14] = local252[8] * -dz + -dx * local252[2] + -dy * local252[5] + 16384 >> 15;
							}
							local252[10] = dy;
							local252[11] = dz;
							local252[9] = dx;
						}
						if (local200 != 0 || local221 != 0 || local228 != 0) {
							models[slot].rotate(local200, local221, local228);
						}
						if (dx != 0 || dy != 0 || dz != 0) {
							models[slot].translate(dx, dy, dz);
						}
					}
				}
			}
			@Pc(597) RawModel model2;
			if (models.length == 1) {
				model2 = models[0];
			} else {
				model2 = new RawModel(models, models.length);
			}
			if (this.recolorSource != null) {
				for (@Pc(610) int i = 0; i < this.recolorSource.length; i++) {
					if (this.recolorDestinationIndex == null || i >= this.recolorDestinationIndex.length) {
						model2.recolor(this.recolorSource[i], this.recolorDestination[i]);
					} else {
						model2.recolor(this.recolorSource[i], recolorPalette[this.recolorDestinationIndex[i] & 0xFF]);
					}
				}
			}
			if (this.rextureSource != null) {
				for (@Pc(665) int i = 0; i < this.rextureSource.length; i++) {
					model2.retexture(this.rextureSource[i], this.retextureDestination[i]);
				}
			}
			model = model2.createModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
			if (GlRenderer.enabled) {
				((GlModel) model).method3872(false, false, false, false, false, true);
			}
			NpcTypeList.bodyModels.put(this.id, model);
		}
		@Pc(718) boolean local718 = false;
		@Pc(720) boolean alphaTransformed = false;
		@Pc(722) boolean colorTransformed = false;
		@Pc(724) boolean normalsTransformed = false;
		@Pc(731) int local731 = arg5 == null ? 0 : arg5.length;
		for (@Pc(733) int local733 = 0; local733 < local731; local733++) {
			if (arg5[local733] != null) {
				@Pc(752) SeqType local752 = SeqTypeList.get(arg5[local733].seqId);
				if (local752.frames != null) {
					aClass46Array1[local733] = local752;
					local718 = true;
					@Pc(769) int local769 = arg5[local733].anInt4462;
					@Pc(774) int local774 = arg5[local733].anInt4464;
					@Pc(779) int local779 = local752.frames[local769];
					aClass4_Sub3_Sub19Array1[local733] = SeqTypeList.getAnimFrameset(local779 >>> 16);
					local779 &= 65535;
					anIntArray398[local733] = local779;
					if (aClass4_Sub3_Sub19Array1[local733] != null) {
						colorTransformed |= aClass4_Sub3_Sub19Array1[local733].isColorTransformed(local779);
						alphaTransformed |= aClass4_Sub3_Sub19Array1[local733].isAlphaTransformed(local779);
						normalsTransformed |= local752.aBoolean72;
					}
					if ((local752.tween || SeqType.forceTween) && local774 != -1 && local774 < local752.frames.length) {
						anIntArray528[local733] = local752.anIntArray94[local769];
						anIntArray47[local733] = arg5[local733].anInt4460;
						@Pc(861) int local861 = local752.frames[local774];
						aClass4_Sub3_Sub19Array3[local733] = SeqTypeList.getAnimFrameset(local861 >>> 16);
						local861 &= 65535;
						anIntArray654[local733] = local861;
						if (aClass4_Sub3_Sub19Array3[local733] != null) {
							colorTransformed |= aClass4_Sub3_Sub19Array3[local733].isColorTransformed(local861);
							alphaTransformed |= aClass4_Sub3_Sub19Array3[local733].isAlphaTransformed(local861);
						}
					} else {
						anIntArray528[local733] = 0;
						anIntArray47[local733] = 0;
						aClass4_Sub3_Sub19Array3[local733] = null;
						anIntArray654[local733] = -1;
					}
				}
			}
		}
		if (!local718 && arg3 == null && arg2 == null) {
			@Pc(934) Model model2 = model.method3831(true, true, true);
			if (this.resizeXZ != 128 || this.resizeY != 128) {
				model2.resize(this.resizeXZ, this.resizeY, this.resizeXZ);
			}
			return model2;
		}
		@Pc(956) int local956 = -1;
		@Pc(958) int local958 = -1;
		@Pc(960) AnimFrameset local960 = null;
		@Pc(962) AnimFrameset local962 = null;
		@Pc(964) int local964 = 0;
		if (arg3 != null) {
			@Pc(973) int local973 = arg3.frames[arg0];
			@Pc(977) int local977 = local973 >>> 16;
			local960 = SeqTypeList.getAnimFrameset(local977);
			local958 = local973 & 0xFFFF;
			if (local960 != null) {
				colorTransformed |= local960.isColorTransformed(local958);
				alphaTransformed |= local960.isAlphaTransformed(local958);
				normalsTransformed |= arg3.aBoolean72;
			}
			if ((arg3.tween || SeqType.forceTween) && arg4 != -1 && arg4 < arg3.frames.length) {
				@Pc(1031) int local1031 = arg3.frames[arg4];
				local964 = arg3.anIntArray94[arg0];
				@Pc(1040) int local1040 = local1031 >>> 16;
				local956 = local1031 & 0xFFFF;
				if (local1040 == local977) {
					local962 = local960;
				} else {
					local962 = SeqTypeList.getAnimFrameset(local956 >>> 16);
				}
				if (local962 != null) {
					colorTransformed |= local962.isColorTransformed(local956);
					alphaTransformed |= local962.isAlphaTransformed(local956);
				}
			}
		}
		@Pc(1080) int local1080 = -1;
		@Pc(1082) int local1082 = -1;
		@Pc(1084) int local1084 = 0;
		@Pc(1086) AnimFrameset local1086 = null;
		@Pc(1088) AnimFrameset local1088 = null;
		if (arg2 != null) {
			@Pc(1096) int local1096 = arg2.frames[arg7];
			@Pc(1100) int local1100 = local1096 >>> 16;
			local1082 = local1096 & 0xFFFF;
			local1086 = SeqTypeList.getAnimFrameset(local1100);
			if (local1086 != null) {
				colorTransformed |= local1086.isColorTransformed(local1082);
				alphaTransformed |= local1086.isAlphaTransformed(local1082);
				normalsTransformed |= arg2.aBoolean72;
			}
			if ((arg2.tween || SeqType.forceTween) && arg6 != -1 && arg6 < arg2.frames.length) {
				local1084 = arg2.anIntArray94[arg7];
				@Pc(1158) int local1158 = arg2.frames[arg6];
				@Pc(1162) int local1162 = local1158 >>> 16;
				local1080 = local1158 & 0xFFFF;
				if (local1162 == local1100) {
					local1088 = local1086;
				} else {
					local1088 = SeqTypeList.getAnimFrameset(local1080 >>> 16);
				}
				if (local1088 != null) {
					colorTransformed |= local1088.isColorTransformed(local1080);
					alphaTransformed |= local1088.isAlphaTransformed(local1080);
				}
			}
		}
		@Pc(1218) Model model2 = model.method3831(!alphaTransformed, !colorTransformed, !normalsTransformed);
		@Pc(1220) int part = 1;
		for (@Pc(1228) int local1228 = 0; local1228 < local731; local1228++) {
			if (aClass4_Sub3_Sub19Array1[local1228] != null) {
				model2.method3839(aClass4_Sub3_Sub19Array1[local1228], anIntArray398[local1228], aClass4_Sub3_Sub19Array3[local1228], anIntArray654[local1228], anIntArray47[local1228] - 1, anIntArray528[local1228], part, aClass46Array1[local1228].aBoolean72, this.anIntArrayArray45[local1228]);
			}
			part <<= 1;
		}
		if (local960 != null && local1086 != null) {
			model2.method3816(local960, local958, local962, local956, arg8 - 1, local964, local1086, local1082, local1088, local1080, arg1 - 1, local1084, arg3.aBooleanArray6, arg3.aBoolean72 | arg2.aBoolean72);
		} else if (local960 != null) {
			model2.method3835(local960, local958, local962, local956, arg8 - 1, local964, arg3.aBoolean72);
		} else if (local1086 != null) {
			model2.method3835(local1086, local1082, local1088, local1080, arg1 - 1, local1084, arg2.aBoolean72);
		}
		for (@Pc(1342) int local1342 = 0; local1342 < local731; local1342++) {
			aClass4_Sub3_Sub19Array1[local1342] = null;
			aClass4_Sub3_Sub19Array3[local1342] = null;
			aClass46Array1[local1342] = null;
		}
		if (this.resizeXZ != 128 || this.resizeY != 128) {
			model2.resize(this.resizeXZ, this.resizeY, this.resizeXZ);
		}
		return model2;
	}
}
