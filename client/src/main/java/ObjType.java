import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class ObjType {

	@OriginalMember(owner = "client!td", name = "i", descriptor = "[B")
	private byte[] recolorDestinationPalette;

	@OriginalMember(owner = "client!td", name = "l", descriptor = "I")
	private int model;

	@OriginalMember(owner = "client!td", name = "q", descriptor = "Lclient!ic;")
	public HashTable params;

	@OriginalMember(owner = "client!td", name = "z", descriptor = "I")
	public int id;

	@OriginalMember(owner = "client!td", name = "D", descriptor = "[S")
	private short[] recolorDestination;

	@OriginalMember(owner = "client!td", name = "M", descriptor = "[I")
	public int[] countCount;

	@OriginalMember(owner = "client!td", name = "N", descriptor = "[S")
	private short[] retextureSource;

	@OriginalMember(owner = "client!td", name = "T", descriptor = "[S")
	private short[] recolorSource;

	@OriginalMember(owner = "client!td", name = "ob", descriptor = "[S")
	private short[] retextureDestination;

	@OriginalMember(owner = "client!td", name = "wb", descriptor = "[I")
	public int[] countObj;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "I")
	public int cursor2Op = -1;

	@OriginalMember(owner = "client!td", name = "m", descriptor = "I")
	public int dummyItem = 0;

	@OriginalMember(owner = "client!td", name = "j", descriptor = "I")
	private int manHead2 = -1;

	@OriginalMember(owner = "client!td", name = "J", descriptor = "I")
	public int cursor1 = -1;

	@OriginalMember(owner = "client!td", name = "d", descriptor = "I")
	private int manWear2 = -1;

	@OriginalMember(owner = "client!td", name = "s", descriptor = "I")
	private int ambient = 0;

	@OriginalMember(owner = "client!td", name = "G", descriptor = "I")
	private int womanWear1 = -1;

	@OriginalMember(owner = "client!td", name = "o", descriptor = "I")
	public int zoom2d = 2000;

	@OriginalMember(owner = "client!td", name = "B", descriptor = "I")
	private int resizeZ = 128;

	@OriginalMember(owner = "client!td", name = "b", descriptor = "I")
	private int resizeY = 128;

	@OriginalMember(owner = "client!td", name = "w", descriptor = "I")
	private int womanWearZOff = 0;

	@OriginalMember(owner = "client!td", name = "c", descriptor = "I")
	private int manWearYOff = 0;

	@OriginalMember(owner = "client!td", name = "O", descriptor = "I")
	public int stackable = 0;

	@OriginalMember(owner = "client!td", name = "y", descriptor = "I")
	public int xOffset2d = 0;

	@OriginalMember(owner = "client!td", name = "C", descriptor = "Ljava/lang/String;")
	public String name = "null";

	@OriginalMember(owner = "client!td", name = "f", descriptor = "I")
	private int contrast = 0;

	@OriginalMember(owner = "client!td", name = "R", descriptor = "I")
	private int manHead = -1;

	@OriginalMember(owner = "client!td", name = "W", descriptor = "I")
	private int womanHead = -1;

	@OriginalMember(owner = "client!td", name = "Y", descriptor = "I")
	private int womanHead2 = -1;

	@OriginalMember(owner = "client!td", name = "U", descriptor = "I")
	public int xAngle2d = 0;

	@OriginalMember(owner = "client!td", name = "eb", descriptor = "I")
	public int womanWear2 = -1;

	@OriginalMember(owner = "client!td", name = "A", descriptor = "I")
	public int lentLink = -1;

	@OriginalMember(owner = "client!td", name = "H", descriptor = "I")
	private int manWear3 = -1;

	@OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
	public int lentTemplate = -1;

	@OriginalMember(owner = "client!td", name = "db", descriptor = "I")
	public int certificateTemplate = -1;

	@OriginalMember(owner = "client!td", name = "X", descriptor = "I")
	private int manWearXOff = 0;

	@OriginalMember(owner = "client!td", name = "ib", descriptor = "I")
	private int womanWearXOff = 0;

	@OriginalMember(owner = "client!td", name = "S", descriptor = "I")
	private int manWearZOff = 0;

	@OriginalMember(owner = "client!td", name = "u", descriptor = "Z")
	public boolean stockMarket = false;

	@OriginalMember(owner = "client!td", name = "rb", descriptor = "I")
	public int certificateLink = -1;

	@OriginalMember(owner = "client!td", name = "v", descriptor = "I")
	public int zAngle2d = 0;

	@OriginalMember(owner = "client!td", name = "lb", descriptor = "I")
	public int yAngle2d = 0;

	@OriginalMember(owner = "client!td", name = "gb", descriptor = "[Ljava/lang/String;")
	public String[] inventoryOps = new String[] { null, null, null, null, LocalisedText.DROP };

	@OriginalMember(owner = "client!td", name = "hb", descriptor = "Z")
	public boolean members = false;

	@OriginalMember(owner = "client!td", name = "V", descriptor = "I")
	public int manWear1 = -1;

	@OriginalMember(owner = "client!td", name = "qb", descriptor = "I")
	public int team = 0;

	@OriginalMember(owner = "client!td", name = "pb", descriptor = "I")
	public int yOffset2d = 0;

	@OriginalMember(owner = "client!td", name = "bb", descriptor = "I")
	public int cursor1Op = -1;

	@OriginalMember(owner = "client!td", name = "g", descriptor = "I")
	private int womanWearYOff = 0;

	@OriginalMember(owner = "client!td", name = "kb", descriptor = "I")
	private int resizeX = 128;

	@OriginalMember(owner = "client!td", name = "t", descriptor = "I")
	public int cursor2 = -1;

	@OriginalMember(owner = "client!td", name = "ub", descriptor = "I")
	public int cost = 1;

	@OriginalMember(owner = "client!td", name = "tb", descriptor = "[Ljava/lang/String;")
	public String[] ops = new String[] { null, null, LocalisedText.TAKE, null, null };

	@OriginalMember(owner = "client!td", name = "nb", descriptor = "I")
	private int womanWear3 = -1;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!fd;B)V")
	public final void decode(@OriginalArg(0) Buffer buffer) {
		while (true) {
			@Pc(5) int code = buffer.readUnsignedByte();
			if (code == 0) {
				return;
			}
			this.decode(buffer, code);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZZ)Lclient!ml;")
	public final RawModel getBodyModel(@OriginalArg(0) boolean female) {
		@Pc(4) int wear1 = this.manWear1;
		@Pc(11) int wear2 = this.manWear2;
		@Pc(28) int wear3 = this.manWear3;
		if (female) {
			wear2 = this.womanWear1;
			wear1 = this.womanWear2;
			wear3 = this.womanWear3;
		}
		if (wear1 == -1) {
			return null;
		}
		@Pc(51) RawModel model = RawModel.create(ObjTypeList.modelsArchive, wear1);
		if (wear2 != -1) {
			@Pc(59) RawModel model2 = RawModel.create(ObjTypeList.modelsArchive, wear2);
			if (wear3 == -1) {
				@Pc(73) RawModel[] models = new RawModel[] { model, model2 };
				model = new RawModel(models, 2);
			} else {
				@Pc(86) RawModel model3 = RawModel.create(ObjTypeList.modelsArchive, wear3);
				@Pc(101) RawModel[] models = new RawModel[] { model, model2, model3 };
				model = new RawModel(models, 3);
			}
		}
		if (!female && (this.manWearXOff != 0 || this.manWearYOff != 0 || this.manWearZOff != 0)) {
			model.translate(this.manWearXOff, this.manWearYOff, this.manWearZOff);
		}
		if (female && (this.womanWearXOff != 0 || this.womanWearYOff != 0 || this.womanWearZOff != 0)) {
			model.translate(this.womanWearXOff, this.womanWearYOff, this.womanWearZOff);
		}
		if (this.recolorSource != null) {
			for (@Pc(167) int i = 0; i < this.recolorSource.length; i++) {
				model.recolor(this.recolorSource[i], this.recolorDestination[i]);
			}
		}
		if (this.retextureSource != null) {
			for (@Pc(191) int i = 0; i < this.retextureSource.length; i++) {
				model.retexture(this.retextureSource[i], this.retextureDestination[i]);
			}
		}
		return model;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!td;Lclient!td;I)V")
	public final void generateCertificate(@OriginalArg(0) ObjType link, @OriginalArg(1) ObjType template) {
		this.cost = link.cost;
		this.recolorDestinationPalette = template.recolorDestinationPalette;
		this.recolorDestination = template.recolorDestination;
		this.retextureSource = template.retextureSource;
		this.yAngle2d = template.yAngle2d;
		this.xAngle2d = template.xAngle2d;
		this.xOffset2d = template.xOffset2d;
		this.recolorSource = template.recolorSource;
		this.model = template.model;
		this.name = link.name;
		this.stackable = 1;
		this.zAngle2d = template.zAngle2d;
		this.members = link.members;
		this.yOffset2d = template.yOffset2d;
		this.zoom2d = template.zoom2d;
		this.retextureDestination = template.retextureDestination;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIILclient!qk;Lclient!eg;I)Lclient!vg;")
	public final Model method4123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) PlayerAppearance arg3, @OriginalArg(5) SeqType arg4, @OriginalArg(6) int arg5) {
		if (this.countObj != null && arg1 > 1) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (arg1 >= this.countCount[local15] && this.countCount[local15] != 0) {
					local13 = this.countObj[local15];
				}
			}
			if (local13 != -1) {
				return ObjTypeList.get(local13).method4123(arg0, 1, arg2, arg3, arg4, arg5);
			}
		}
		@Pc(62) Model local62 = (Model) ObjTypeList.models.get((long) this.id);
		if (local62 == null) {
			@Pc(72) RawModel local72 = RawModel.create(ObjTypeList.modelsArchive, this.model);
			if (local72 == null) {
				return null;
			}
			if (this.recolorSource != null) {
				for (@Pc(83) int i = 0; i < this.recolorSource.length; i++) {
					if (this.recolorDestinationPalette == null || i >= this.recolorDestinationPalette.length) {
						local72.recolor(this.recolorSource[i], this.recolorDestination[i]);
					} else {
						local72.recolor(this.recolorSource[i], Static4.aShortArray126[this.recolorDestinationPalette[i] & 0xFF]);
					}
				}
			}
			if (this.retextureSource != null) {
				for (@Pc(131) int i = 0; i < this.retextureSource.length; i++) {
					local72.retexture(this.retextureSource[i], this.retextureDestination[i]);
				}
			}
			if (arg3 != null) {
				for (@Pc(154) int i = 0; i < 5; i++) {
					if (arg3.colors[i] < PlayerAppearance.destinationBodyColors[i].length) {
						local72.recolor(PlayerAppearance.sourceBodyColors[i], PlayerAppearance.destinationBodyColors[i][arg3.colors[i]]);
					}
					if (arg3.colors[i] < PlayerAppearance.destinationSkinColors[i].length) {
						local72.recolor(PlayerAppearance.sourceSkinColors[i], PlayerAppearance.destinationSkinColors[i][arg3.colors[i]]);
					}
				}
			}
			local62 = local72.createModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
				local62.resize(this.resizeX, this.resizeY, this.resizeZ);
			}
			local62.aBoolean324 = true;
			if (GlRenderer.enabled) {
				((GlModel) local62).method3872(false, false, false, false, false, true);
			}
			ObjTypeList.models.put((long) this.id, local62);
		}
		if (arg4 != null) {
			local62 = arg4.method1017(arg5, arg2, local62, arg0);
		}
		return local62;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZI)Lclient!td;")
	public final ObjType method4124(@OriginalArg(1) int arg0) {
		if (this.countObj != null && arg0 > 1) {
			@Pc(21) int local21 = -1;
			for (@Pc(23) int local23 = 0; local23 < 10; local23++) {
				if (this.countCount[local23] <= arg0 && this.countCount[local23] != 0) {
					local21 = this.countObj[local23];
				}
			}
			if (local21 != -1) {
				return ObjTypeList.get(local21);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IZ)Lclient!ml;")
	public final RawModel getHeadModel(@OriginalArg(1) boolean female) {
		@Pc(14) int head2 = this.manHead2;
		@Pc(17) int head = this.manHead;
		if (female) {
			head = this.womanHead;
			head2 = this.womanHead2;
		}
		if (head == -1) {
			return null;
		}
		@Pc(36) RawModel model = RawModel.create(ObjTypeList.modelsArchive, head);
		if (head2 != -1) {
			@Pc(47) RawModel model2 = RawModel.create(ObjTypeList.modelsArchive, head2);
			@Pc(58) RawModel[] models = new RawModel[] { model, model2 };
			model = new RawModel(models, 2);
		}
		if (this.recolorSource != null) {
			for (@Pc(69) int i = 0; i < this.recolorSource.length; i++) {
				model.recolor(this.recolorSource[i], this.recolorDestination[i]);
			}
		}
		if (this.retextureSource != null) {
			for (@Pc(96) int i = 0; i < this.retextureSource.length; i++) {
				model.retexture(this.retextureSource[i], this.retextureDestination[i]);
			}
		}
		return model;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
	public final void postDecode() {
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BZ)Z")
	public final boolean method4128(@OriginalArg(1) boolean female) {
		@Pc(7) int local7 = this.manWear2;
		@Pc(10) int local10 = this.manWear3;
		@Pc(17) int local17 = this.manWear1;
		if (female) {
			local10 = this.womanWear3;
			local7 = this.womanWear1;
			local17 = this.womanWear2;
		}
		if (local17 == -1) {
			return true;
		}
		@Pc(37) boolean local37 = true;
		if (!ObjTypeList.modelsArchive.isFileReady(local17, 0)) {
			local37 = false;
		}
		if (local7 != -1 && !ObjTypeList.modelsArchive.isFileReady(local7, 0)) {
			local37 = false;
		}
		if (local10 != -1 && !ObjTypeList.modelsArchive.isFileReady(local10, 0)) {
			local37 = false;
		}
		return local37;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public final String getParam(@OriginalArg(2) int id, @OriginalArg(1) String defaultValue) {
		if (this.params == null) {
			return defaultValue;
		} else {
			@Pc(20) StringNode node = (StringNode) this.params.get(id);
			return node == null ? defaultValue : node.value;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!td;Lclient!td;)V")
	public final void generateLent(@OriginalArg(1) ObjType link, @OriginalArg(2) ObjType template) {
		this.womanWear2 = link.womanWear2;
		this.manHead2 = link.manHead2;
		this.manHead = link.manHead;
		this.womanWear1 = link.womanWear1;
		this.manWear3 = link.manWear3;
		this.xOffset2d = template.xOffset2d;
		this.womanWearYOff = link.womanWearYOff;
		this.manWear2 = link.manWear2;
		this.params = link.params;
		this.recolorSource = link.recolorSource;
		this.zAngle2d = template.zAngle2d;
		this.womanHead2 = link.womanHead2;
		this.manWearYOff = link.manWearYOff;
		this.manWearZOff = link.manWearZOff;
		this.team = link.team;
		this.yAngle2d = template.yAngle2d;
		this.manWearXOff = link.manWearXOff;
		this.model = template.model;
		this.inventoryOps = new String[5];
		this.members = link.members;
		this.recolorDestination = link.recolorDestination;
		this.womanWearZOff = link.womanWearZOff;
		this.yOffset2d = template.yOffset2d;
		this.retextureDestination = link.retextureDestination;
		this.xAngle2d = template.xAngle2d;
		this.manWear1 = link.manWear1;
		this.retextureSource = link.retextureSource;
		this.womanWearXOff = link.womanWearXOff;
		this.womanHead = link.womanHead;
		this.zoom2d = template.zoom2d;
		this.womanWear3 = link.womanWear3;
		this.ops = link.ops;
		this.name = link.name;
		this.cost = 0;
		this.recolorDestinationPalette = link.recolorDestinationPalette;
		if (link.inventoryOps != null) {
			for (@Pc(158) int local158 = 0; local158 < 4; local158++) {
				this.inventoryOps[local158] = link.inventoryOps[local158];
			}
		}
		this.inventoryOps[4] = LocalisedText.LENT_ITEM_RETURN;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(III)I")
	public final int getParam(@OriginalArg(0) int id, @OriginalArg(2) int defaultValue) {
		if (this.params == null) {
			return defaultValue;
		} else {
			@Pc(26) IntNode node = (IntNode) this.params.get(id);
			return node == null ? defaultValue : node.value;
		}
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(ZI)Z")
	public final boolean isHeadModelReady(@OriginalArg(0) boolean female) {
		@Pc(2) int head = this.manHead;
		@Pc(9) int head2 = this.manHead2;
		if (female) {
			head = this.womanHead;
			head2 = this.womanHead2;
		}
		if (head == -1) {
			return true;
		}
		@Pc(25) boolean ready = true;
		if (!ObjTypeList.modelsArchive.isFileReady(head, 0)) {
			ready = false;
		}
		if (head2 != -1 && !ObjTypeList.modelsArchive.isFileReady(head2, 0)) {
			ready = false;
		}
		return ready;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!qk;I)Lclient!na;")
	public final SoftwareModel method4135(@OriginalArg(0) PlayerAppearance arg0) {
		@Pc(11) RawModel local11 = RawModel.create(ObjTypeList.modelsArchive, this.model);
		if (local11 == null) {
			return null;
		}
		if (this.recolorSource != null) {
			for (@Pc(23) int i = 0; i < this.recolorSource.length; i++) {
				if (this.recolorDestinationPalette == null || this.recolorDestinationPalette.length <= i) {
					local11.recolor(this.recolorSource[i], this.recolorDestination[i]);
				} else {
					local11.recolor(this.recolorSource[i], Static4.aShortArray126[this.recolorDestinationPalette[i] & 0xFF]);
				}
			}
		}
		if (this.retextureSource != null) {
			for (@Pc(73) int i = 0; i < this.retextureSource.length; i++) {
				local11.retexture(this.retextureSource[i], this.retextureDestination[i]);
			}
		}
		if (arg0 != null) {
			for (@Pc(100) int i = 0; i < 5; i++) {
				if (PlayerAppearance.destinationBodyColors[i].length > arg0.colors[i]) {
					local11.recolor(PlayerAppearance.sourceBodyColors[i], PlayerAppearance.destinationBodyColors[i][arg0.colors[i]]);
				}
				if (PlayerAppearance.destinationSkinColors[i].length > arg0.colors[i]) {
					local11.recolor(PlayerAppearance.sourceSkinColors[i], PlayerAppearance.destinationSkinColors[i][arg0.colors[i]]);
				}
			}
		}
		@Pc(168) SoftwareModel local168 = local11.createSoftwareModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
		if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
			local168.resize(this.resizeX, this.resizeY, this.resizeZ);
		}
		return local168;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IILclient!fd;)V")
	private void decode(@OriginalArg(2) Buffer buffer, @OriginalArg(0) int code) {
		if (code == 1) {
			this.model = buffer.readUnsignedShort();
		} else if (code == 2) {
			this.name = buffer.readString();
		} else if (code == 4) {
			this.zoom2d = buffer.readUnsignedShort();
		} else if (code == 5) {
			this.xAngle2d = buffer.readUnsignedShort();
		} else if (code == 6) {
			this.yAngle2d = buffer.readUnsignedShort();
		} else if (code == 7) {
			this.xOffset2d = buffer.readUnsignedShort();
			if (this.xOffset2d > 32767) {
				this.xOffset2d -= 65536;
			}
		} else if (code == 8) {
			this.yOffset2d = buffer.readUnsignedShort();
			if (this.yOffset2d > 32767) {
				this.yOffset2d -= 65536;
			}
		} else if (code == 11) {
			this.stackable = 1;
		} else if (code == 12) {
			this.cost = buffer.readInt();
		} else if (code == 16) {
			this.members = true;
		} else if (code == 23) {
			this.manWear1 = buffer.readUnsignedShort();
		} else if (code == 24) {
			this.manWear2 = buffer.readUnsignedShort();
		} else if (code == 25) {
			this.womanWear2 = buffer.readUnsignedShort();
		} else if (code == 26) {
			this.womanWear1 = buffer.readUnsignedShort();
		} else if (code >= 30 && code < 35) {
			this.ops[code - 30] = buffer.readString();
			if (this.ops[code - 30].equalsIgnoreCase(LocalisedText.HIDDEN)) {
				this.ops[code - 30] = null;
			}
		} else if (code >= 35 && code < 40) {
			this.inventoryOps[code - 35] = buffer.readString();
		} else if (code == 40) {
			@Pc(657) int size = buffer.readUnsignedByte();
			this.recolorSource = new short[size];
			this.recolorDestination = new short[size];
			for (@Pc(667) int i = 0; i < size; i++) {
				this.recolorSource[i] = (short) buffer.readUnsignedShort();
				this.recolorDestination[i] = (short) buffer.readUnsignedShort();
			}
		} else if (code == 41) {
			@Pc(162) int size = buffer.readUnsignedByte();
			this.retextureDestination = new short[size];
			this.retextureSource = new short[size];
			for (@Pc(172) int i = 0; i < size; i++) {
				this.retextureSource[i] = (short) buffer.readUnsignedShort();
				this.retextureDestination[i] = (short) buffer.readUnsignedShort();
			}
		} else if (code == 42) {
			@Pc(632) int size = buffer.readUnsignedByte();
			this.recolorDestinationPalette = new byte[size];
			for (@Pc(638) int i = 0; i < size; i++) {
				this.recolorDestinationPalette[i] = buffer.readByte();
			}
		} else if (code == 65) {
			this.stockMarket = true;
		} else if (code == 78) {
			this.manWear3 = buffer.readUnsignedShort();
		} else if (code == 79) {
			this.womanWear3 = buffer.readUnsignedShort();
		} else if (code == 90) {
			this.manHead = buffer.readUnsignedShort();
		} else if (code == 91) {
			this.womanHead = buffer.readUnsignedShort();
		} else if (code == 92) {
			this.manHead2 = buffer.readUnsignedShort();
		} else if (code == 93) {
			this.womanHead2 = buffer.readUnsignedShort();
		} else if (code == 95) {
			this.zAngle2d = buffer.readUnsignedShort();
		} else if (code == 96) {
			this.dummyItem = buffer.readUnsignedByte();
		} else if (code == 97) {
			this.certificateLink = buffer.readUnsignedShort();
		} else if (code == 98) {
			this.certificateTemplate = buffer.readUnsignedShort();
		} else if (code >= 100 && code < 110) {
			if (this.countObj == null) {
				this.countCount = new int[10];
				this.countObj = new int[10];
			}
			this.countObj[code - 100] = buffer.readUnsignedShort();
			this.countCount[code - 100] = buffer.readUnsignedShort();
		} else if (code == 110) {
			this.resizeX = buffer.readUnsignedShort();
		} else if (code == 111) {
			this.resizeY = buffer.readUnsignedShort();
		} else if (code == 112) {
			this.resizeZ = buffer.readUnsignedShort();
		} else if (code == 113) {
			this.ambient = buffer.readByte();
		} else if (code == 114) {
			this.contrast = buffer.readByte() * 5;
		} else if (code == 115) {
			this.team = buffer.readUnsignedByte();
		} else if (code == 121) {
			this.lentLink = buffer.readUnsignedShort();
		} else if (code == 122) {
			this.lentTemplate = buffer.readUnsignedShort();
		} else if (code == 125) {
			this.manWearXOff = buffer.readByte();
			this.manWearYOff = buffer.readByte();
			this.manWearZOff = buffer.readByte();
		} else if (code == 126) {
			this.womanWearXOff = buffer.readByte();
			this.womanWearYOff = buffer.readByte();
			this.womanWearZOff = buffer.readByte();
		} else if (code == 127) {
			this.cursor1Op = buffer.readUnsignedByte();
			this.cursor1 = buffer.readUnsignedShort();
		} else if (code == 128) {
			this.cursor2Op = buffer.readUnsignedByte();
			this.cursor2 = buffer.readUnsignedShort();
		} else if (code == 129) {
			buffer.readUnsignedByte();
			buffer.readUnsignedShort();
		} else if (code == 130) {
			buffer.readUnsignedByte();
			buffer.readUnsignedShort();
		} else if (code == 249) {
			@Pc(461) int size = buffer.readUnsignedByte();
			if (this.params == null) {
				@Pc(469) int buckets = IntUtils.clp2(size);
				this.params = new HashTable(buckets);
			}
			for (@Pc(477) int i = 0; i < size; i++) {
				@Pc(495) boolean string = buffer.readUnsignedByte() == 1;
				@Pc(499) int id = buffer.readUnsignedMedium();
				@Pc(508) Node node;
				if (string) {
					node = new StringNode(buffer.readString());
				} else {
					node = new IntNode(buffer.readInt());
				}
				this.params.put(id, node);
			}
		}
	}
}
