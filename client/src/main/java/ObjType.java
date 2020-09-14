import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

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
	private int anInt5049 = -1;

	@OriginalMember(owner = "client!td", name = "s", descriptor = "I")
	private int ambient = 0;

	@OriginalMember(owner = "client!td", name = "G", descriptor = "I")
	private int anInt5070 = -1;

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
	public int anInt5090 = -1;

	@OriginalMember(owner = "client!td", name = "A", descriptor = "I")
	public int lentLink = -1;

	@OriginalMember(owner = "client!td", name = "H", descriptor = "I")
	private int anInt5071 = -1;

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
	public int anInt5062 = 0;

	@OriginalMember(owner = "client!td", name = "lb", descriptor = "I")
	public int yAngle2d = 0;

	@OriginalMember(owner = "client!td", name = "gb", descriptor = "[Ljava/lang/String;")
	public String[] inventoryOps = new String[] { null, null, null, null, LocalisedText.DROP };

	@OriginalMember(owner = "client!td", name = "hb", descriptor = "Z")
	public boolean members = false;

	@OriginalMember(owner = "client!td", name = "V", descriptor = "I")
	public int anInt5081 = -1;

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
	private int anInt5097 = -1;

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
	public final Class53_Sub3 method4121(@OriginalArg(0) boolean arg0) {
		@Pc(4) int local4 = this.anInt5081;
		@Pc(11) int local11 = this.anInt5049;
		@Pc(28) int local28 = this.anInt5071;
		if (arg0) {
			local11 = this.anInt5070;
			local4 = this.anInt5090;
			local28 = this.anInt5097;
		}
		if (local4 == -1) {
			return null;
		}
		@Pc(51) Class53_Sub3 local51 = Static25.method2752(ObjTypeList.modelsArchive, local4);
		if (local11 != -1) {
			@Pc(59) Class53_Sub3 local59 = Static25.method2752(ObjTypeList.modelsArchive, local11);
			if (local28 == -1) {
				@Pc(73) Class53_Sub3[] local73 = new Class53_Sub3[] { local51, local59 };
				local51 = new Class53_Sub3(local73, 2);
			} else {
				@Pc(86) Class53_Sub3 local86 = Static25.method2752(ObjTypeList.modelsArchive, local28);
				@Pc(101) Class53_Sub3[] local101 = new Class53_Sub3[] { local51, local59, local86 };
				local51 = new Class53_Sub3(local101, 3);
			}
		}
		if (!arg0 && (this.manWearXOff != 0 || this.manWearYOff != 0 || this.manWearZOff != 0)) {
			local51.method2743(this.manWearXOff, this.manWearYOff, this.manWearZOff);
		}
		if (arg0 && (this.womanWearXOff != 0 || this.womanWearYOff != 0 || this.womanWearZOff != 0)) {
			local51.method2743(this.womanWearXOff, this.womanWearYOff, this.womanWearZOff);
		}
		if (this.recolorSource != null) {
			for (@Pc(167) int local167 = 0; local167 < this.recolorSource.length; local167++) {
				local51.method2768(this.recolorSource[local167], this.recolorDestination[local167]);
			}
		}
		if (this.retextureSource != null) {
			for (@Pc(191) int local191 = 0; local191 < this.retextureSource.length; local191++) {
				local51.method2753(this.retextureSource[local191], this.retextureDestination[local191]);
			}
		}
		return local51;
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
		this.anInt5062 = template.anInt5062;
		this.members = link.members;
		this.yOffset2d = template.yOffset2d;
		this.zoom2d = template.zoom2d;
		this.retextureDestination = template.retextureDestination;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIILclient!qk;Lclient!eg;I)Lclient!vg;")
	public final Model method4123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) PlayerAppearance arg3, @OriginalArg(5) Class46 arg4, @OriginalArg(6) int arg5) {
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
			@Pc(72) Class53_Sub3 local72 = Static25.method2752(ObjTypeList.modelsArchive, this.model);
			if (local72 == null) {
				return null;
			}
			if (this.recolorSource != null) {
				for (@Pc(83) int local83 = 0; local83 < this.recolorSource.length; local83++) {
					if (this.recolorDestinationPalette == null || local83 >= this.recolorDestinationPalette.length) {
						local72.method2768(this.recolorSource[local83], this.recolorDestination[local83]);
					} else {
						local72.method2768(this.recolorSource[local83], Static4.aShortArray126[this.recolorDestinationPalette[local83] & 0xFF]);
					}
				}
			}
			if (this.retextureSource != null) {
				for (@Pc(131) int local131 = 0; local131 < this.retextureSource.length; local131++) {
					local72.method2753(this.retextureSource[local131], this.retextureDestination[local131]);
				}
			}
			if (arg3 != null) {
				for (@Pc(154) int local154 = 0; local154 < 5; local154++) {
					if (arg3.colors[local154] < Static6.aShortArrayArray6[local154].length) {
						local72.method2768(Static7.aShortArray113[local154], Static6.aShortArrayArray6[local154][arg3.colors[local154]]);
					}
					if (arg3.colors[local154] < Static1.aShortArrayArray1[local154].length) {
						local72.method2768(Static4.aShortArray46[local154], Static1.aShortArrayArray1[local154][arg3.colors[local154]]);
					}
				}
			}
			local62 = local72.method2761(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
				local62.method3824(this.resizeX, this.resizeY, this.resizeZ);
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
	public final Class53_Sub3 method4125(@OriginalArg(1) boolean arg0) {
		@Pc(14) int local14 = this.manHead2;
		@Pc(17) int local17 = this.manHead;
		if (arg0) {
			local17 = this.womanHead;
			local14 = this.womanHead2;
		}
		if (local17 == -1) {
			return null;
		}
		@Pc(36) Class53_Sub3 local36 = Static25.method2752(ObjTypeList.modelsArchive, local17);
		if (local14 != -1) {
			@Pc(47) Class53_Sub3 local47 = Static25.method2752(ObjTypeList.modelsArchive, local14);
			@Pc(58) Class53_Sub3[] local58 = new Class53_Sub3[] { local36, local47 };
			local36 = new Class53_Sub3(local58, 2);
		}
		if (this.recolorSource != null) {
			for (@Pc(69) int local69 = 0; local69 < this.recolorSource.length; local69++) {
				local36.method2768(this.recolorSource[local69], this.recolorDestination[local69]);
			}
		}
		if (this.retextureSource != null) {
			for (@Pc(96) int local96 = 0; local96 < this.retextureSource.length; local96++) {
				local36.method2753(this.retextureSource[local96], this.retextureDestination[local96]);
			}
		}
		return local36;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
	public final void postDecode() {
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BZ)Z")
	public final boolean method4128(@OriginalArg(1) boolean arg0) {
		@Pc(7) int local7 = this.anInt5049;
		@Pc(10) int local10 = this.anInt5071;
		@Pc(17) int local17 = this.anInt5081;
		if (arg0) {
			local10 = this.anInt5097;
			local7 = this.anInt5070;
			local17 = this.anInt5090;
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
		this.anInt5090 = link.anInt5090;
		this.manHead2 = link.manHead2;
		this.manHead = link.manHead;
		this.anInt5070 = link.anInt5070;
		this.anInt5071 = link.anInt5071;
		this.xOffset2d = template.xOffset2d;
		this.womanWearYOff = link.womanWearYOff;
		this.anInt5049 = link.anInt5049;
		this.params = link.params;
		this.recolorSource = link.recolorSource;
		this.anInt5062 = template.anInt5062;
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
		this.anInt5081 = link.anInt5081;
		this.retextureSource = link.retextureSource;
		this.womanWearXOff = link.womanWearXOff;
		this.womanHead = link.womanHead;
		this.zoom2d = template.zoom2d;
		this.anInt5097 = link.anInt5097;
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
	public final boolean method4134(@OriginalArg(0) boolean arg0) {
		@Pc(2) int local2 = this.manHead;
		@Pc(9) int local9 = this.manHead2;
		if (arg0) {
			local2 = this.womanHead;
			local9 = this.womanHead2;
		}
		if (local2 == -1) {
			return true;
		}
		@Pc(25) boolean local25 = true;
		if (!ObjTypeList.modelsArchive.isFileReady(local2, 0)) {
			local25 = false;
		}
		if (local9 != -1 && !ObjTypeList.modelsArchive.isFileReady(local9, 0)) {
			local25 = false;
		}
		return local25;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!qk;I)Lclient!na;")
	public final SoftwareModel method4135(@OriginalArg(0) PlayerAppearance arg0) {
		@Pc(11) Class53_Sub3 local11 = Static25.method2752(ObjTypeList.modelsArchive, this.model);
		if (local11 == null) {
			return null;
		}
		if (this.recolorSource != null) {
			for (@Pc(23) int local23 = 0; local23 < this.recolorSource.length; local23++) {
				if (this.recolorDestinationPalette == null || this.recolorDestinationPalette.length <= local23) {
					local11.method2768(this.recolorSource[local23], this.recolorDestination[local23]);
				} else {
					local11.method2768(this.recolorSource[local23], Static4.aShortArray126[this.recolorDestinationPalette[local23] & 0xFF]);
				}
			}
		}
		if (this.retextureSource != null) {
			for (@Pc(73) int local73 = 0; local73 < this.retextureSource.length; local73++) {
				local11.method2753(this.retextureSource[local73], this.retextureDestination[local73]);
			}
		}
		if (arg0 != null) {
			for (@Pc(100) int local100 = 0; local100 < 5; local100++) {
				if (Static6.aShortArrayArray6[local100].length > arg0.colors[local100]) {
					local11.method2768(Static7.aShortArray113[local100], Static6.aShortArrayArray6[local100][arg0.colors[local100]]);
				}
				if (Static1.aShortArrayArray1[local100].length > arg0.colors[local100]) {
					local11.method2768(Static4.aShortArray46[local100], Static1.aShortArrayArray1[local100][arg0.colors[local100]]);
				}
			}
		}
		@Pc(168) SoftwareModel local168 = local11.method2759(this.ambient + 64, this.contrast + 768, -50, -10, -50);
		if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
			local168.method3824(this.resizeX, this.resizeY, this.resizeZ);
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
			this.anInt5081 = buffer.readUnsignedShort();
		} else if (code == 24) {
			this.anInt5049 = buffer.readUnsignedShort();
		} else if (code == 25) {
			this.anInt5090 = buffer.readUnsignedShort();
		} else if (code == 26) {
			this.anInt5070 = buffer.readUnsignedShort();
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
			this.anInt5071 = buffer.readUnsignedShort();
		} else if (code == 79) {
			this.anInt5097 = buffer.readUnsignedShort();
		} else if (code == 90) {
			this.manHead = buffer.readUnsignedShort();
		} else if (code == 91) {
			this.womanHead = buffer.readUnsignedShort();
		} else if (code == 92) {
			this.manHead2 = buffer.readUnsignedShort();
		} else if (code == 93) {
			this.womanHead2 = buffer.readUnsignedShort();
		} else if (code == 95) {
			this.anInt5062 = buffer.readUnsignedShort();
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
				@Pc(469) int bucketCount = IntUtils.clp2(size);
				this.params = new HashTable(bucketCount);
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
