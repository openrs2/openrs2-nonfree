import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class LocType {

	@OriginalMember(owner = "client!ng", name = "z", descriptor = "[Lclient!ml;")
	private static final RawModel[] tempModels = new RawModel[4];

	@OriginalMember(owner = "client!om", name = "j", descriptor = "[S")
	public static short[] recolorPalette = new short[256];

	@OriginalMember(owner = "client!im", name = "h", descriptor = "Lclient!jh;")
	public static Class96 aClass96_1 = new Class96();

	@OriginalMember(owner = "client!rg", name = "Z", descriptor = "Z")
	public static boolean singleLevelVisible = false;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "[S")
	private short[] recolorDestination;

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "[I")
	private int[] shapes;

	@OriginalMember(owner = "client!vh", name = "t", descriptor = "[S")
	private short[] retextureDestination;

	@OriginalMember(owner = "client!vh", name = "E", descriptor = "[S")
	private short[] retextureSource;

	@OriginalMember(owner = "client!vh", name = "T", descriptor = "[I")
	private int[] models;

	@OriginalMember(owner = "client!vh", name = "V", descriptor = "[I")
	public int[] multiLocs;

	@OriginalMember(owner = "client!vh", name = "fb", descriptor = "[S")
	private short[] recolorSource;

	@OriginalMember(owner = "client!vh", name = "lb", descriptor = "Lclient!ic;")
	private HashTable params;

	@OriginalMember(owner = "client!vh", name = "rb", descriptor = "[I")
	public int[] sounds;

	@OriginalMember(owner = "client!vh", name = "sb", descriptor = "[B")
	private byte[] recolorDestinationIndex;

	@OriginalMember(owner = "client!vh", name = "Bb", descriptor = "I")
	public int id;

	@OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
	public int cursor1Op = -1;

	@OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
	private int contrast = 0;

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "B")
	private byte hillType = 0;

	@OriginalMember(owner = "client!vh", name = "m", descriptor = "Z")
	public boolean aBoolean372 = true;

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
	public int wallDecorOffsetScale = 16;

	@OriginalMember(owner = "client!vh", name = "y", descriptor = "I")
	public int soundRadius = 0;

	@OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
	public int length = 1;

	@OriginalMember(owner = "client!vh", name = "M", descriptor = "I")
	public int soundMaxInterval = 0;

	@OriginalMember(owner = "client!vh", name = "U", descriptor = "Z")
	public boolean members = false;

	@OriginalMember(owner = "client!vh", name = "ab", descriptor = "I")
	public int blockedSides = 0;

	@OriginalMember(owner = "client!vh", name = "P", descriptor = "I")
	public int cursor2Op = -1;

	@OriginalMember(owner = "client!vh", name = "S", descriptor = "[Ljava/lang/String;")
	public String[] ops = new String[5];

	@OriginalMember(owner = "client!vh", name = "I", descriptor = "I")
	public int width = 1;

	@OriginalMember(owner = "client!vh", name = "w", descriptor = "I")
	public int anInt5517 = -1;

	@OriginalMember(owner = "client!vh", name = "F", descriptor = "I")
	private int translateX = 0;

	@OriginalMember(owner = "client!vh", name = "v", descriptor = "Z")
	private boolean aBoolean373 = false;

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
	private int totalSeqWeight = 0;

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
	public int blockWalk = 2;

	@OriginalMember(owner = "client!vh", name = "X", descriptor = "I")
	private int multiLocVarbit = -1;

	@OriginalMember(owner = "client!vh", name = "db", descriptor = "Z")
	public boolean aBoolean377 = true;

	@OriginalMember(owner = "client!vh", name = "J", descriptor = "I")
	public int cursor2 = -1;

	@OriginalMember(owner = "client!vh", name = "L", descriptor = "Z")
	public boolean blockRange = true;

	@OriginalMember(owner = "client!vh", name = "ib", descriptor = "Z")
	public boolean mapSceneRotated = false;

	@OriginalMember(owner = "client!vh", name = "H", descriptor = "I")
	public int mapElement = -1;

	@OriginalMember(owner = "client!vh", name = "Y", descriptor = "I")
	private int translateY = 0;

	@OriginalMember(owner = "client!vh", name = "nb", descriptor = "S")
	private short aShort48 = -1;

	@OriginalMember(owner = "client!vh", name = "kb", descriptor = "Z")
	public boolean aBoolean380 = true;

	@OriginalMember(owner = "client!vh", name = "R", descriptor = "Ljava/lang/String;")
	public String name = "null";

	@OriginalMember(owner = "client!vh", name = "u", descriptor = "[I")
	private int[] seqWeights = null;

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "Z")
	public boolean aBoolean371 = false;

	@OriginalMember(owner = "client!vh", name = "D", descriptor = "I")
	public int seqId = -1;

	@OriginalMember(owner = "client!vh", name = "mb", descriptor = "I")
	public int occlusionMode = -1;

	@OriginalMember(owner = "client!vh", name = "A", descriptor = "I")
	public int sound = -1;

	@OriginalMember(owner = "client!vh", name = "G", descriptor = "I")
	public int soundVolume = 255;

	@OriginalMember(owner = "client!vh", name = "ub", descriptor = "Z")
	public boolean mapSceneFlipVertical = false;

	@OriginalMember(owner = "client!vh", name = "qb", descriptor = "I")
	public int mapSceneAngleOffset = 0;

	@OriginalMember(owner = "client!vh", name = "yb", descriptor = "I")
	public int cursor1 = -1;

	@OriginalMember(owner = "client!vh", name = "C", descriptor = "I")
	public int interactivity = -1;

	@OriginalMember(owner = "client!vh", name = "ob", descriptor = "Z")
	private boolean aBoolean381 = false;

	@OriginalMember(owner = "client!vh", name = "r", descriptor = "I")
	public int mapSceneId = -1;

	@OriginalMember(owner = "client!vh", name = "N", descriptor = "I")
	private int multiLocVarp = -1;

	@OriginalMember(owner = "client!vh", name = "vb", descriptor = "I")
	private int resizeZ = 128;

	@OriginalMember(owner = "client!vh", name = "K", descriptor = "I")
	private int ambient = 0;

	@OriginalMember(owner = "client!vh", name = "eb", descriptor = "I")
	private int translateZ = 0;

	@OriginalMember(owner = "client!vh", name = "zb", descriptor = "I")
	private int resizeY = 128;

	@OriginalMember(owner = "client!vh", name = "Cb", descriptor = "Z")
	public boolean aBoolean384 = false;

	@OriginalMember(owner = "client!vh", name = "Z", descriptor = "I")
	private int resizeX = 128;

	@OriginalMember(owner = "client!vh", name = "jb", descriptor = "Z")
	public boolean aBoolean379 = false;

	@OriginalMember(owner = "client!vh", name = "Eb", descriptor = "I")
	public int soundMinInterval = 0;

	@OriginalMember(owner = "client!vh", name = "Ab", descriptor = "Z")
	public boolean aBoolean383 = false;

	@OriginalMember(owner = "client!vh", name = "W", descriptor = "Z")
	public boolean forceDecor = false;

	@OriginalMember(owner = "client!vh", name = "Fb", descriptor = "Z")
	public boolean breakRouteFinding = false;

	@OriginalMember(owner = "client!vh", name = "Hb", descriptor = "[I")
	public int[] seqIds = null;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)Z")
	public boolean isReady() {
		if (this.models == null) {
			return true;
		}
		@Pc(13) boolean ready = true;
		for (@Pc(15) int i = 0; i < this.models.length; i++) {
			ready &= LocTypeList.modelsArchive.isFileReady(this.models[i] & 0xFFFF, 0);
		}
		return ready;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZII[[I[[IZIIILclient!fe;)Lclient!jh;")
	public Class96 method4450(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) SoftwareIndexedSprite arg9) {
		if (GlRenderer.enabled) {
			@Pc(210) long local210;
			if (this.shapes == null) {
				local210 = (this.id << 10) + arg7;
			} else {
				local210 = arg7 + (this.id << 10) + (arg2 << 3);
			}
			@Pc(226) Class96 local226 = (Class96) LocTypeList.aClass26_18.get(local210);
			@Pc(233) GlModel local233;
			@Pc(236) SoftwareIndexedSprite local236;
			if (local226 == null) {
				local233 = this.method4456(arg2, false, arg7);
				if (local233 == null) {
					aClass96_1.entity = null;
					aClass96_1.sprite = null;
					return aClass96_1;
				}
				if (arg2 == 10 && arg7 > 3) {
					local233.method3815(256);
				}
				if (arg6) {
					local236 = local233.method3854(arg9);
				} else {
					local236 = null;
				}
				@Pc(281) Class96 local281 = new Class96();
				local281.entity = local233;
				local281.sprite = local236;
				LocTypeList.aClass26_18.put(local210, local281);
			} else {
				local233 = (GlModel) local226.entity;
				local236 = local226.sprite;
			}
			@Pc(297) boolean local297 = arg1 & this.aBoolean373;
			@Pc(329) GlModel local329 = local233.method3852(this.hillType != 3, this.hillType == 0, true, true, true, !local297, true, true, true);
			if (this.hillType != 0) {
				local329.method3859(this.hillType, this.aShort48, local233, arg4, arg5, arg0, arg3, arg8);
			}
			local329.method3872(this.interactivity == 0 && !this.aBoolean379, true, true, this.interactivity == 0, true, false);
			local329.aBoolean325 = local297;
			aClass96_1.entity = local329;
			aClass96_1.sprite = local236;
			return aClass96_1;
		}
		@Pc(24) long local24;
		if (this.shapes == null) {
			local24 = arg7 + (this.id << 10);
		} else {
			local24 = (this.id << 10) + (arg2 << 3) + arg7;
		}
		@Pc(46) boolean local46;
		if (arg1 && this.aBoolean373) {
			local24 |= Long.MIN_VALUE;
			local46 = true;
		} else {
			local46 = false;
		}
		@Pc(60) Entity local60 = (Entity) LocTypeList.aClass26_18.get(local24);
		if (local60 == null) {
			@Pc(69) RawModel local69 = this.method4452(arg7, arg2);
			if (local69 == null) {
				aClass96_1.entity = null;
				return aClass96_1;
			}
			local69.method2760();
			if (arg2 == 10 && arg7 > 3) {
				local69.method2740();
			}
			if (local46) {
				local69.ambient = (short) (this.ambient + 64);
				local69.contrast = (short) (this.contrast * 5 + 768);
				local60 = local69;
				local69.calculateNormals();
			} else {
				local60 = new SoftwareModel(local69, this.ambient + 64, this.contrast * 5 + 768, -50, -10, -50);
			}
			LocTypeList.aClass26_18.put(local24, local60);
		}
		if (local46) {
			local60 = ((RawModel) local60).method2749();
		}
		if (this.hillType != 0) {
			if (local60 instanceof SoftwareModel) {
				local60 = ((SoftwareModel) local60).method2910(this.hillType, this.aShort48, arg4, arg5, arg0, arg3, arg8, true);
			} else if (local60 instanceof RawModel) {
				local60 = ((RawModel) local60).method2766(this.hillType, this.aShort48, arg4, arg5, arg0, arg3, arg8);
			}
		}
		aClass96_1.entity = local60;
		return aClass96_1;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BII)I")
	public int getParam(@OriginalArg(2) int id, @OriginalArg(1) int defaultValue) {
		if (this.params == null) {
			return defaultValue;
		} else {
			@Pc(27) IntNode node = (IntNode) this.params.get(id);
			return node == null ? defaultValue : node.value;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IBI)Lclient!ml;")
	private RawModel method4452(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) RawModel local3 = null;
		@Pc(18) boolean local18 = this.aBoolean381;
		if (arg1 == 2 && arg0 > 3) {
			local18 = !local18;
		}
		if (this.shapes == null) {
			if (arg1 != 10) {
				return null;
			}
			if (this.models == null) {
				return null;
			}
			@Pc(53) int local53 = this.models.length;
			for (@Pc(55) int local55 = 0; local55 < local53; local55++) {
				@Pc(67) int local67 = this.models[local55];
				if (local18) {
					local67 += 65536;
				}
				local3 = (RawModel) LocTypeList.aClass26_43.get((long) local67);
				if (local3 == null) {
					local3 = RawModel.create(LocTypeList.modelsArchive, local67 & 0xFFFF);
					if (local3 == null) {
						return null;
					}
					if (local18) {
						local3.method2748();
					}
					LocTypeList.aClass26_43.put((long) local67, local3);
				}
				if (local53 > 1) {
					tempModels[local55] = local3;
				}
			}
			if (local53 > 1) {
				local3 = new RawModel(tempModels, local53);
			}
		} else {
			@Pc(128) int local128 = -1;
			for (@Pc(130) int local130 = 0; local130 < this.shapes.length; local130++) {
				if (arg1 == this.shapes[local130]) {
					local128 = local130;
					break;
				}
			}
			if (local128 == -1) {
				return null;
			}
			@Pc(159) int local159 = this.models[local128];
			if (local18) {
				local159 += 65536;
			}
			local3 = (RawModel) LocTypeList.aClass26_43.get((long) local159);
			if (local3 == null) {
				local3 = RawModel.create(LocTypeList.modelsArchive, local159 & 0xFFFF);
				if (local3 == null) {
					return null;
				}
				if (local18) {
					local3.method2748();
				}
				LocTypeList.aClass26_43.put((long) local159, local3);
			}
		}
		@Pc(213) boolean resize;
		if (this.resizeX == 128 && this.resizeY == 128 && this.resizeZ == 128) {
			resize = false;
		} else {
			resize = true;
		}
		@Pc(229) boolean translate;
		if (this.translateX == 0 && this.translateY == 0 && this.translateZ == 0) {
			translate = false;
		} else {
			translate = true;
		}
		@Pc(262) RawModel model = new RawModel(local3, arg0 == 0 && !resize && !translate, this.recolorSource == null, this.retextureSource == null, true);
		if (arg1 == 4 && arg0 > 3) {
			model.method2740();
			model.translate(45, 0, -45);
		}
		arg0 &= 3;
		if (arg0 == 1) {
			model.method2742();
		} else if (arg0 == 2) {
			model.method2745();
		} else if (arg0 == 3) {
			model.method2747();
		}
		if (this.recolorSource != null) {
			for (@Pc(313) int i = 0; i < this.recolorSource.length; i++) {
				if (this.recolorDestinationIndex == null || i >= this.recolorDestinationIndex.length) {
					model.recolor(this.recolorSource[i], this.recolorDestination[i]);
				} else {
					model.recolor(this.recolorSource[i], recolorPalette[this.recolorDestinationIndex[i] & 0xFF]);
				}
			}
		}
		if (this.retextureSource != null) {
			for (@Pc(364) int i = 0; i < this.retextureSource.length; i++) {
				model.retexture(this.retextureSource[i], this.retextureDestination[i]);
			}
		}
		if (resize) {
			model.resize(this.resizeX, this.resizeY, this.resizeZ);
		}
		if (translate) {
			model.translate(this.translateX, this.translateY, this.translateZ);
		}
		return model;
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)Lclient!vh;")
	public LocType getMultiLoc() {
		@Pc(1) int value = -1;
		if (this.multiLocVarbit != -1) {
			value = VarpDomain.getVarbit(this.multiLocVarbit);
		} else if (this.multiLocVarp != -1) {
			value = VarpDomain.varps[this.multiLocVarp];
		}
		if (value < 0 || value >= this.multiLocs.length - 1 || this.multiLocs[value] == -1) {
			@Pc(61) int defaultMultiLoc = this.multiLocs[this.multiLocs.length - 1];
			return defaultMultiLoc == -1 ? null : LocTypeList.get(defaultMultiLoc);
		} else {
			return LocTypeList.get(this.multiLocs[value]);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILclient!fd;)V")
	public void decode(@OriginalArg(1) Buffer buffer) {
		while (true) {
			@Pc(9) int code = buffer.readUnsignedByte();
			if (code == 0) {
				return;
			}
			this.decode(buffer, code);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZIZ)Lclient!s;")
	private GlModel method4456(@OriginalArg(0) int shape, @OriginalArg(1) boolean arg1, @OriginalArg(2) int angle) {
		@Pc(12) int local12 = this.ambient + 64;
		@Pc(19) int local19 = this.contrast * 5 + 768;
		@Pc(75) GlModel model;
		if (this.shapes == null) {
			if (shape != 10) {
				return null;
			}
			if (this.models == null) {
				return null;
			}
			@Pc(38) int modelsLen = this.models.length;
			if (modelsLen == 0) {
				return null;
			}
			@Pc(45) long key = 0L;
			for (@Pc(47) int i = 0; i < modelsLen; i++) {
				key = key * 67783L + (long) this.models[i];
			}
			if (arg1) {
				key = ~key;
			}
			model = (GlModel) LocTypeList.aClass26_43.get(key);
			if (model == null) {
				@Pc(80) RawModel rawModel = null;
				for (@Pc(82) int i = 0; i < modelsLen; i++) {
					rawModel = RawModel.create(LocTypeList.modelsArchive, this.models[i] & 0xFFFF);
					if (rawModel == null) {
						return null;
					}
					if (modelsLen > 1) {
						tempModels[i] = rawModel;
					}
				}
				if (modelsLen > 1) {
					rawModel = new RawModel(tempModels, modelsLen);
				}
				model = new GlModel(rawModel, local12, local19, arg1);
				LocTypeList.aClass26_43.put(key, model);
			}
		} else {
			@Pc(142) int modelIndex = -1;
			for (@Pc(144) int i = 0; i < this.shapes.length; i++) {
				if (this.shapes[i] == shape) {
					modelIndex = i;
					break;
				}
			}
			if (modelIndex == -1) {
				return null;
			}
			@Pc(173) int key = this.models[modelIndex];
			if (arg1) {
				key += 65536;
			}
			model = (GlModel) LocTypeList.aClass26_43.get(key);
			if (model == null) {
				@Pc(197) RawModel rawModel = RawModel.create(LocTypeList.modelsArchive, key & 0xFFFF);
				if (rawModel == null) {
					return null;
				}
				model = new GlModel(rawModel, local12, local19, arg1);
				LocTypeList.aClass26_43.put(key, model);
			}
		}
		@Pc(218) boolean local218 = this.aBoolean381;
		@Pc(234) boolean local234 = this.resizeY == 128 && this.translateY == 0;
		if (shape == 2 && angle > 3) {
			local218 = !local218;
		}
		@Pc(276) boolean local276 = angle == 0 && this.resizeX == 128 && this.resizeZ == 128 && this.translateX == 0 && this.translateZ == 0 && !local218;
		@Pc(326) GlModel local326 = model.method3852(local276, local234, this.recolorSource == null, model.method3847() == local12, angle == 0 && !local218, true, model.method3869() == local19, !local218, this.retextureSource == null);
		if (local218) {
			local326.method3850();
		}
		if (shape == 4 && angle > 3) {
			local326.method3857();
			local326.translate(45, 0, -45);
		}
		angle &= 3;
		if (angle == 1) {
			local326.method3862();
		} else if (angle == 2) {
			local326.method3849();
		} else if (angle == 3) {
			local326.method3848();
		}
		if (this.recolorSource != null) {
			for (@Pc(386) int i = 0; i < this.recolorSource.length; i++) {
				local326.recolor(this.recolorSource[i], this.recolorDestination[i]);
			}
		}
		if (this.retextureSource != null) {
			for (@Pc(410) int i = 0; i < this.retextureSource.length; i++) {
				local326.retexture(this.retextureSource[i], this.retextureDestination[i]);
			}
		}
		if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
			local326.resize(this.resizeX, this.resizeY, this.resizeZ);
		}
		if (this.translateX != 0 || this.translateY != 0 || this.translateZ != 0) {
			local326.translate(this.translateX, this.translateY, this.translateZ);
		}
		if (local12 != local326.method3847()) {
			local326.method3855(local12);
		}
		if (local326.method3869() != local19) {
			local326.method3861(local19);
		}
		return local326;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)Z")
	public boolean isReady(@OriginalArg(0) int shape) {
		if (this.shapes != null) {
			for (@Pc(16) int i = 0; i < this.shapes.length; i++) {
				if (this.shapes[i] == shape) {
					return LocTypeList.modelsArchive.isFileReady(this.models[i] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.models == null) {
			return true;
		} else if (shape == 10) {
			@Pc(61) boolean ready = true;
			for (@Pc(63) int i = 0; i < this.models.length; i++) {
				ready &= LocTypeList.modelsArchive.isFileReady(this.models[i] & 0xFFFF, 0);
			}
			return ready;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I[[IIIIIZIII[[ILclient!eg;Lclient!fe;I)Lclient!jh;")
	public Class96 method4458(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[][] arg9, @OriginalArg(11) SeqType arg10, @OriginalArg(12) SoftwareIndexedSprite arg11, @OriginalArg(13) int arg12) {
		if (!GlRenderer.enabled) {
			@Pc(182) long local182;
			if (this.shapes == null) {
				local182 = (this.id << 10) + arg6;
			} else {
				local182 = arg6 + (arg7 << 3) + (this.id << 10);
			}
			@Pc(198) SoftwareModel local198 = (SoftwareModel) LocTypeList.aClass26_32.get(local182);
			if (local198 == null) {
				@Pc(207) RawModel local207 = this.method4452(arg6, arg7);
				if (local207 == null) {
					return null;
				}
				local198 = new SoftwareModel(local207, this.ambient + 64, this.contrast * 5 + 768, -50, -10, -50);
				LocTypeList.aClass26_32.put(local182, local198);
			}
			@Pc(236) boolean local236 = false;
			if (arg10 != null) {
				local236 = true;
				local198 = (SoftwareModel) arg10.method1021(arg12, arg8, arg2, arg6, local198);
			}
			if (arg7 == 10 && arg6 > 3) {
				if (!local236) {
					local198 = (SoftwareModel) local198.method3833(true, true, true);
					local236 = true;
				}
				local198.method3815(256);
			}
			if (this.hillType != 0) {
				if (!local236) {
					local198 = (SoftwareModel) local198.method3833(true, true, true);
				}
				local198 = local198.method2910(this.hillType, this.aShort48, arg1, arg9, arg0, arg4, arg3, false);
			}
			aClass96_1.entity = local198;
			return aClass96_1;
		}
		@Pc(27) long local27;
		if (this.shapes == null) {
			local27 = (this.id << 10) + arg6;
		} else {
			local27 = arg6 + (arg7 << 3) + (this.id << 10);
		}
		@Pc(47) GlModel local47 = (GlModel) LocTypeList.aClass26_32.get(local27);
		if (local47 == null) {
			local47 = this.method4456(arg7, true, arg6);
			if (local47 == null) {
				return null;
			}
			local47.createBones();
			local47.method3872(false, false, false, false, false, true);
			LocTypeList.aClass26_32.put(local27, local47);
		}
		@Pc(78) GlModel local78 = local47;
		@Pc(80) boolean local80 = false;
		if (arg10 != null) {
			local78 = (GlModel) arg10.method1014(arg12, arg2, local47, arg6, arg8);
			local80 = true;
		}
		if (arg7 == 10 && arg6 > 3) {
			if (!local80) {
				local80 = true;
				local78 = (GlModel) local78.method3833(true, true, true);
			}
			local78.method3815(256);
		}
		if (arg5) {
			aClass96_1.sprite = local78.method3854(arg11);
		} else {
			aClass96_1.sprite = null;
		}
		if (this.hillType != 0) {
			if (!local80) {
				local78 = (GlModel) local78.method3833(true, true, true);
			}
			local78.method3859(this.hillType, this.aShort48, local78, arg1, arg9, arg0, arg4, arg3);
		}
		aClass96_1.entity = local78;
		return aClass96_1;
	}

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "(I)I")
	public int method4460() {
		if (this.seqIds == null) {
			return -1;
		}
		@Pc(23) int local23 = (int) ((double) this.totalSeqWeight * Math.random());
		@Pc(25) int local25;
		for (local25 = 0; this.seqWeights[local25] <= local23; local25++) {
			local23 -= this.seqWeights[local25];
		}
		return this.seqIds[local25];
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IILclient!fd;)V")
	private void decode(@OriginalArg(2) Buffer buffer, @OriginalArg(0) int code) {
		if (code == 1) {
			@Pc(1037) int len = buffer.readUnsignedByte();
			if (len > 0) {
				if (this.models == null || singleLevelVisible) {
					this.models = new int[len];
					this.shapes = new int[len];
					for (@Pc(1067) int i = 0; i < len; i++) {
						this.models[i] = buffer.readUnsignedShort();
						this.shapes[i] = buffer.readUnsignedByte();
					}
				} else {
					buffer.position += len * 3;
				}
			}
		} else if (code == 2) {
			this.name = buffer.readString();
		} else if (code == 5) {
			@Pc(989) int len = buffer.readUnsignedByte();
			if (len > 0) {
				if (this.models == null || singleLevelVisible) {
					this.shapes = null;
					this.models = new int[len];
					for (@Pc(1008) int i = 0; i < len; i++) {
						this.models[i] = buffer.readUnsignedShort();
					}
				} else {
					buffer.position += len * 2;
				}
			}
		} else if (code == 14) {
			this.width = buffer.readUnsignedByte();
		} else if (code == 15) {
			this.length = buffer.readUnsignedByte();
		} else if (code == 17) {
			this.blockWalk = 0;
			this.blockRange = false;
		} else if (code == 18) {
			this.blockRange = false;
		} else if (code == 19) {
			this.interactivity = buffer.readUnsignedByte();
		} else if (code == 21) {
			this.hillType = 1;
		} else if (code == 22) {
			this.aBoolean373 = true;
		} else if (code == 23) {
			this.occlusionMode = 1;
		} else if (code == 24) {
			this.seqId = buffer.readUnsignedShort();
			if (this.seqId == 65535) {
				this.seqId = -1;
			}
		} else if (code == 27) {
			this.blockWalk = 1;
		} else if (code == 28) {
			this.wallDecorOffsetScale = buffer.readUnsignedByte();
		} else if (code == 29) {
			this.ambient = buffer.readByte();
		} else if (code == 39) {
			this.contrast = buffer.readByte() * 5;
		} else if (code >= 30 && code < 35) {
			this.ops[code - 30] = buffer.readString();
			if (this.ops[code - 30].equalsIgnoreCase(LocalisedText.HIDDEN)) {
				this.ops[code - 30] = null;
			}
		} else if (code == 40) {
			@Pc(913) int len = buffer.readUnsignedByte();
			this.recolorSource = new short[len];
			this.recolorDestination = new short[len];
			for (@Pc(923) int i = 0; i < len; i++) {
				this.recolorSource[i] = (short) buffer.readUnsignedShort();
				this.recolorDestination[i] = (short) buffer.readUnsignedShort();
			}
		} else if (code == 41) {
			@Pc(875) int len = buffer.readUnsignedByte();
			this.retextureDestination = new short[len];
			this.retextureSource = new short[len];
			for (@Pc(885) int i = 0; i < len; i++) {
				this.retextureSource[i] = (short) buffer.readUnsignedShort();
				this.retextureDestination[i] = (short) buffer.readUnsignedShort();
			}
		} else if (code == 42) {
			@Pc(188) int len = buffer.readUnsignedByte();
			this.recolorDestinationIndex = new byte[len];
			for (@Pc(194) int i = 0; i < len; i++) {
				this.recolorDestinationIndex[i] = buffer.readByte();
			}
		} else if (code == 62) {
			this.aBoolean381 = true;
		} else if (code == 64) {
			this.aBoolean377 = false;
		} else if (code == 65) {
			this.resizeX = buffer.readUnsignedShort();
		} else if (code == 66) {
			this.resizeY = buffer.readUnsignedShort();
		} else if (code == 67) {
			this.resizeZ = buffer.readUnsignedShort();
		} else if (code == 69) {
			this.blockedSides = buffer.readUnsignedByte();
		} else if (code == 70) {
			this.translateX = buffer.readShort();
		} else if (code == 71) {
			this.translateY = buffer.readShort();
		} else if (code == 72) {
			this.translateZ = buffer.readShort();
		} else if (code == 73) {
			this.forceDecor = true;
		} else if (code == 74) {
			this.breakRouteFinding = true;
		} else if (code == 75) {
			this.anInt5517 = buffer.readUnsignedByte();
		} else if (code == 77 || code == 92) {
			@Pc(732) int defaultMultiLoc = -1;
			this.multiLocVarbit = buffer.readUnsignedShort();
			if (this.multiLocVarbit == 65535) {
				this.multiLocVarbit = -1;
			}
			this.multiLocVarp = buffer.readUnsignedShort();
			if (this.multiLocVarp == 65535) {
				this.multiLocVarp = -1;
			}
			if (code == 92) {
				defaultMultiLoc = buffer.readUnsignedShort();
				if (defaultMultiLoc == 65535) {
					defaultMultiLoc = -1;
				}
			}
			@Pc(778) int len = buffer.readUnsignedByte();
			this.multiLocs = new int[len + 2];
			for (@Pc(786) int i = 0; i <= len; i++) {
				this.multiLocs[i] = buffer.readUnsignedShort();
				if (this.multiLocs[i] == 65535) {
					this.multiLocs[i] = -1;
				}
			}
			this.multiLocs[len + 1] = defaultMultiLoc;
		} else if (code == 78) {
			this.sound = buffer.readUnsignedShort();
			this.soundRadius = buffer.readUnsignedByte();
		} else if (code == 79) {
			this.soundMinInterval = buffer.readUnsignedShort();
			this.soundMaxInterval = buffer.readUnsignedShort();
			this.soundRadius = buffer.readUnsignedByte();
			@Pc(323) int len = buffer.readUnsignedByte();
			this.sounds = new int[len];
			for (@Pc(329) int i = 0; i < len; i++) {
				this.sounds[i] = buffer.readUnsignedShort();
			}
		} else if (code == 81) {
			this.hillType = 2;
			this.aShort48 = (short) (buffer.readUnsignedByte() * 256);
		} else if (code == 82) {
			this.aBoolean383 = true;
		} else if (code == 88) {
			this.aBoolean372 = false;
		} else if (code == 89) {
			this.aBoolean380 = false;
		} else if (code == 90) {
			this.aBoolean371 = true;
		} else if (code == 91) {
			this.members = true;
		} else if (code == 93) {
			this.hillType = 3;
			this.aShort48 = (short) buffer.readUnsignedShort();
		} else if (code == 94) {
			this.hillType = 4;
		} else if (code == 95) {
			this.hillType = 5;
		} else if (code == 96) {
			this.aBoolean384 = true;
		} else if (code == 97) {
			this.mapSceneRotated = true;
		} else if (code == 98) {
			this.aBoolean379 = true;
		} else if (code == 99) {
			this.cursor1Op = buffer.readUnsignedByte();
			this.cursor1 = buffer.readUnsignedShort();
		} else if (code == 100) {
			this.cursor2Op = buffer.readUnsignedByte();
			this.cursor2 = buffer.readUnsignedShort();
		} else if (code == 101) {
			this.mapSceneAngleOffset = buffer.readUnsignedByte();
		} else if (code == 102) {
			this.mapSceneId = buffer.readUnsignedShort();
		} else if (code == 103) {
			this.occlusionMode = 0;
		} else if (code == 104) {
			this.soundVolume = buffer.readUnsignedByte();
		} else if (code == 105) {
			this.mapSceneFlipVertical = true;
		} else if (code == 106) {
			@Pc(501) int len = buffer.readUnsignedByte();
			this.seqWeights = new int[len];
			this.seqIds = new int[len];
			for (@Pc(511) int i = 0; i < len; i++) {
				this.seqIds[i] = buffer.readUnsignedShort();
				@Pc(525) int weight = buffer.readUnsignedByte();
				this.seqWeights[i] = weight;
				this.totalSeqWeight += weight;
			}
		} else if (code == 107) {
			this.mapElement = buffer.readUnsignedShort();
		} else if (code >= 150 && code < 155) {
			this.ops[code - 150] = buffer.readString();
			if (!LocTypeList.allowMembers || this.ops[code - 150].equalsIgnoreCase(LocalisedText.HIDDEN)) {
				this.ops[code - 150] = null;
			}
		} else if (code == 249) {
			@Pc(600) int size = buffer.readUnsignedByte();
			if (this.params == null) {
				@Pc(608) int buckets = IntUtils.clp2(size);
				this.params = new HashTable(buckets);
			}
			for (@Pc(616) int i = 0; i < size; i++) {
				@Pc(628) boolean string = buffer.readUnsignedByte() == 1;
				@Pc(632) int id = buffer.readUnsignedMedium();
				@Pc(641) Node node;
				if (string) {
					node = new StringNode(buffer.readString());
				} else {
					node = new IntNode(buffer.readInt());
				}
				this.params.put(id, node);
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "(I)Z")
	public boolean hasAreaSound() {
		if (this.multiLocs == null) {
			return this.sound != -1 || this.sounds != null;
		}
		for (@Pc(31) int i = 0; i < this.multiLocs.length; i++) {
			if (this.multiLocs[i] != -1) {
				@Pc(54) LocType type = LocTypeList.get(this.multiLocs[i]);
				if (type.sound != -1 || type.sounds != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BI)Z")
	public boolean method4465(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.seqId) {
			return true;
		} else {
			if (this.seqIds != null) {
				for (@Pc(26) int i = 0; i < this.seqIds.length; i++) {
					if (arg0 == this.seqIds[i]) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "(I)V")
	public void postDecode() {
		if (this.interactivity == -1) {
			this.interactivity = 0;
			if (this.models != null && (this.shapes == null || this.shapes[0] == 10)) {
				this.interactivity = 1;
			}
			for (@Pc(35) int i = 0; i < 5; i++) {
				if (this.ops[i] != null) {
					this.interactivity = 1;
					break;
				}
			}
		}
		if (this.anInt5517 == -1) {
			this.anInt5517 = this.blockWalk == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String getParam(@OriginalArg(1) int id, @OriginalArg(0) String defaultValue) {
		if (this.params == null) {
			return defaultValue;
		} else {
			@Pc(25) StringNode node = (StringNode) this.params.get(id);
			return node == null ? defaultValue : node.value;
		}
	}
}
