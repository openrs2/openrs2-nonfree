import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Component {

	@OriginalMember(owner = "client!me", name = "g", descriptor = "Lclient!on;")
	private static final ServerActiveProperties DEFAULT_SERVER_ACTIVE_PROPERTIES = new ServerActiveProperties(0, -1);

	@OriginalMember(owner = "client!bl", name = "cb", descriptor = "Lclient!cc;")
	private static final SoftLruHashTable fonts = new SoftLruHashTable(20);

	@OriginalMember(owner = "client!af", name = "v", descriptor = "Lclient!cc;")
	private static final SoftLruHashTable models = new SoftLruHashTable(50);

	@OriginalMember(owner = "client!ri", name = "V", descriptor = "Lclient!cc;")
	private static final SoftLruHashTable sprites = new SoftLruHashTable(200);

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "(B)V")
	public static void clear() {
		sprites.clear();
		models.clear();
		fonts.clear();
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZI)V")
	public static void clean() {
		sprites.clean(50);
		models.clean(50);
		fonts.clean(50);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	public static void removeSoft() {
		sprites.removeSoft();
		models.removeSoft();
		fonts.removeSoft();
	}

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "[Ljava/lang/Object;")
	public Object[] onInvTransmit;

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "[Ljava/lang/Object;")
	public Object[] onSubChange;

	@OriginalMember(owner = "client!wf", name = "r", descriptor = "[Ljava/lang/Object;")
	public Object[] onCamFinished;

	@OriginalMember(owner = "client!wf", name = "s", descriptor = "Z")
	public boolean horizontalFlip;

	@OriginalMember(owner = "client!wf", name = "t", descriptor = "[Ljava/lang/Object;")
	public Object[] onChatTransmit;

	@OriginalMember(owner = "client!wf", name = "w", descriptor = "[Ljava/lang/Object;")
	public Object[] onDragComplete;

	@OriginalMember(owner = "client!wf", name = "y", descriptor = "[I")
	public int[] anIntArray657;

	@OriginalMember(owner = "client!wf", name = "B", descriptor = "[Ljava/lang/Object;")
	public Object[] onHold;

	@OriginalMember(owner = "client!wf", name = "D", descriptor = "[Ljava/lang/Object;")
	public Object[] onMouseRepeat;

	@OriginalMember(owner = "client!wf", name = "E", descriptor = "[Ljava/lang/Object;")
	public Object[] onKey;

	@OriginalMember(owner = "client!wf", name = "F", descriptor = "[B")
	public byte[] aByteArray73;

	@OriginalMember(owner = "client!wf", name = "H", descriptor = "[I")
	public int[] anIntArray658;

	@OriginalMember(owner = "client!wf", name = "I", descriptor = "Z")
	public boolean verticalFlip;

	@OriginalMember(owner = "client!wf", name = "J", descriptor = "[Ljava/lang/Object;")
	public Object[] onDrag;

	@OriginalMember(owner = "client!wf", name = "L", descriptor = "I")
	public int modelId;

	@OriginalMember(owner = "client!wf", name = "Q", descriptor = "I")
	public int anInt5898;

	@OriginalMember(owner = "client!wf", name = "U", descriptor = "[[I")
	public int[][] cs1Scripts;

	@OriginalMember(owner = "client!wf", name = "X", descriptor = "[I")
	public int[] anIntArray659;

	@OriginalMember(owner = "client!wf", name = "bb", descriptor = "[Ljava/lang/Object;")
	public Object[] onFriendTransmit;

	@OriginalMember(owner = "client!wf", name = "db", descriptor = "[I")
	public int[] objTypes;

	@OriginalMember(owner = "client!wf", name = "fb", descriptor = "[Ljava/lang/Object;")
	public Object[] onTargetEnter;

	@OriginalMember(owner = "client!wf", name = "ib", descriptor = "[I")
	public int[] objCounts;

	@OriginalMember(owner = "client!wf", name = "jb", descriptor = "[Ljava/lang/Object;")
	public Object[] onStockTransmit;

	@OriginalMember(owner = "client!wf", name = "kb", descriptor = "[I")
	public int[] anIntArray662;

	@OriginalMember(owner = "client!wf", name = "lb", descriptor = "[I")
	public int[] anIntArray663;

	@OriginalMember(owner = "client!wf", name = "nb", descriptor = "[I")
	public int[] anIntArray664;

	@OriginalMember(owner = "client!wf", name = "qb", descriptor = "[I")
	public int[] varcstrTriggers;

	@OriginalMember(owner = "client!wf", name = "rb", descriptor = "[I")
	public int[] opCursors;

	@OriginalMember(owner = "client!wf", name = "sb", descriptor = "[Ljava/lang/Object;")
	public Object[] onClickRepeat;

	@OriginalMember(owner = "client!wf", name = "tb", descriptor = "Ljava/lang/String;")
	public String pauseText;

	@OriginalMember(owner = "client!wf", name = "ub", descriptor = "I")
	public int type;

	@OriginalMember(owner = "client!wf", name = "xb", descriptor = "[Ljava/lang/Object;")
	public Object[] onTimer;

	@OriginalMember(owner = "client!wf", name = "Ab", descriptor = "[Ljava/lang/Object;")
	public Object[] onTargetLeave;

	@OriginalMember(owner = "client!wf", name = "Cb", descriptor = "I")
	public int anInt5916;

	@OriginalMember(owner = "client!wf", name = "Eb", descriptor = "I")
	public int anInt5917;

	@OriginalMember(owner = "client!wf", name = "Hb", descriptor = "[Ljava/lang/Object;")
	public Object[] onOp;

	@OriginalMember(owner = "client!wf", name = "Pb", descriptor = "[Ljava/lang/Object;")
	public Object[] onDialogAbort;

	@OriginalMember(owner = "client!wf", name = "Yb", descriptor = "[I")
	public int[] statTriggers;

	@OriginalMember(owner = "client!wf", name = "ac", descriptor = "[Ljava/lang/Object;")
	public Object[] onScrollWheel;

	@OriginalMember(owner = "client!wf", name = "ic", descriptor = "[Ljava/lang/Object;")
	public Object[] onVarcstrTransmit;

	@OriginalMember(owner = "client!wf", name = "kc", descriptor = "[Ljava/lang/Object;")
	public Object[] anObjectArray22;

	@OriginalMember(owner = "client!wf", name = "mc", descriptor = "[Ljava/lang/Object;")
	public Object[] onClanTransmit;

	@OriginalMember(owner = "client!wf", name = "oc", descriptor = "[I")
	public int[] cs1ComparisonOpcodes;

	@OriginalMember(owner = "client!wf", name = "pc", descriptor = "[I")
	public int[] varpTriggers;

	@OriginalMember(owner = "client!wf", name = "yc", descriptor = "[B")
	public byte[] aByteArray74;

	@OriginalMember(owner = "client!wf", name = "Ac", descriptor = "[Ljava/lang/Object;")
	public Object[] onVarpTransmit;

	@OriginalMember(owner = "client!wf", name = "Cc", descriptor = "[Ljava/lang/String;")
	public String[] ops;

	@OriginalMember(owner = "client!wf", name = "Ec", descriptor = "[Ljava/lang/Object;")
	public Object[] onStatTransmit;

	@OriginalMember(owner = "client!wf", name = "Gc", descriptor = "[Ljava/lang/String;")
	public String[] objOps;

	@OriginalMember(owner = "client!wf", name = "Ic", descriptor = "[Ljava/lang/Object;")
	public Object[] onMouseOver;

	@OriginalMember(owner = "client!wf", name = "Mc", descriptor = "[Ljava/lang/Object;")
	public Object[] onVarcTransmit;

	@OriginalMember(owner = "client!wf", name = "Nc", descriptor = "[I")
	public int[] inventoryTriggers;

	@OriginalMember(owner = "client!wf", name = "Wc", descriptor = "[I")
	public int[] cs1ComparisonOperands;

	@OriginalMember(owner = "client!wf", name = "Yc", descriptor = "[Lclient!wf;")
	public Component[] createdComponents;

	@OriginalMember(owner = "client!wf", name = "bd", descriptor = "[Ljava/lang/Object;")
	public Object[] onMouseLeave;

	@OriginalMember(owner = "client!wf", name = "fd", descriptor = "I")
	public int anInt5965;

	@OriginalMember(owner = "client!wf", name = "gd", descriptor = "[I")
	public int[] anIntArray672;

	@OriginalMember(owner = "client!wf", name = "hd", descriptor = "[Ljava/lang/Object;")
	public Object[] onClick;

	@OriginalMember(owner = "client!wf", name = "md", descriptor = "[Ljava/lang/Object;")
	public Object[] onRelease;

	@OriginalMember(owner = "client!wf", name = "od", descriptor = "[Ljava/lang/Object;")
	public Object[] onMiscTransmit;

	@OriginalMember(owner = "client!wf", name = "rd", descriptor = "[Ljava/lang/Object;")
	public Object[] onResize;

	@OriginalMember(owner = "client!wf", name = "yd", descriptor = "I")
	public int anInt5977;

	@OriginalMember(owner = "client!wf", name = "Ad", descriptor = "[I")
	public int[] varcTriggers;

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "Lclient!wf;")
	public Component dragComponent = null;

	@OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
	public int modelZAngle = 0;

	@OriginalMember(owner = "client!wf", name = "z", descriptor = "Ljava/lang/String;")
	public String text = "";

	@OriginalMember(owner = "client!wf", name = "P", descriptor = "I")
	public int anInt5897 = 0;

	@OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
	public int anInt5890 = -1;

	@OriginalMember(owner = "client!wf", name = "V", descriptor = "Z")
	public boolean aBoolean408 = false;

	@OriginalMember(owner = "client!wf", name = "n", descriptor = "Z")
	public boolean dragRender = false;

	@OriginalMember(owner = "client!wf", name = "p", descriptor = "Z")
	public boolean hasHook = false;

	@OriginalMember(owner = "client!wf", name = "Y", descriptor = "I")
	public int transparency = 0;

	@OriginalMember(owner = "client!wf", name = "gb", descriptor = "I")
	public int anInt5907 = 0;

	@OriginalMember(owner = "client!wf", name = "i", descriptor = "Ljava/lang/String;")
	public String aString349 = LocalisedText.OK;

	@OriginalMember(owner = "client!wf", name = "M", descriptor = "I")
	public int dragDeadZone = 0;

	@OriginalMember(owner = "client!wf", name = "N", descriptor = "B")
	public byte widthMode = 0;

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
	public int scrollWidth = 0;

	@OriginalMember(owner = "client!wf", name = "yb", descriptor = "I")
	public int id = -1;

	@OriginalMember(owner = "client!wf", name = "ob", descriptor = "Z")
	public boolean lineDirection = false;

	@OriginalMember(owner = "client!wf", name = "Db", descriptor = "Z")
	public boolean aBoolean411 = false;

	@OriginalMember(owner = "client!wf", name = "Mb", descriptor = "I")
	public int textHorizontalAlignment = 0;

	@OriginalMember(owner = "client!wf", name = "Ub", descriptor = "Z")
	public boolean alpha = false;

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "Ljava/lang/String;")
	public String aString350 = "";

	@OriginalMember(owner = "client!wf", name = "wb", descriptor = "I")
	public int anInt5913 = -1;

	@OriginalMember(owner = "client!wf", name = "Zb", descriptor = "I")
	public int scrollX = 0;

	@OriginalMember(owner = "client!wf", name = "W", descriptor = "I")
	public int anInt5902 = 0;

	@OriginalMember(owner = "client!wf", name = "eb", descriptor = "Ljava/lang/String;")
	public String aString353 = "";

	@OriginalMember(owner = "client!wf", name = "Vb", descriptor = "Z")
	public boolean fill = false;

	@OriginalMember(owner = "client!wf", name = "bc", descriptor = "I")
	public int color = 0;

	@OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
	public int width = 0;

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
	public int y = 0;

	@OriginalMember(owner = "client!wf", name = "pb", descriptor = "I")
	public int anInt5910 = -1;

	@OriginalMember(owner = "client!wf", name = "Rb", descriptor = "I")
	public int baseX = 0;

	@OriginalMember(owner = "client!wf", name = "vc", descriptor = "Z")
	public boolean hidden = false;

	@OriginalMember(owner = "client!wf", name = "Fb", descriptor = "I")
	public int modelZoom = 100;

	@OriginalMember(owner = "client!wf", name = "lc", descriptor = "Z")
	public boolean aBoolean414 = false;

	@OriginalMember(owner = "client!wf", name = "Ib", descriptor = "I")
	public int anInt5920 = 0;

	@OriginalMember(owner = "client!wf", name = "wc", descriptor = "Z")
	public boolean modelOrthographic = false;

	@OriginalMember(owner = "client!wf", name = "R", descriptor = "I")
	public int lineWidth = 1;

	@OriginalMember(owner = "client!wf", name = "jc", descriptor = "I")
	public int updatedVarcsReaderIndex = 0;

	@OriginalMember(owner = "client!wf", name = "Lb", descriptor = "I")
	public int anInt5923 = -1;

	@OriginalMember(owner = "client!wf", name = "cc", descriptor = "I")
	public int graphicShadow = 0;

	@OriginalMember(owner = "client!wf", name = "Bb", descriptor = "Z")
	public boolean tiled = false;

	@OriginalMember(owner = "client!wf", name = "xc", descriptor = "I")
	public int modelXAngle = 0;

	@OriginalMember(owner = "client!wf", name = "T", descriptor = "I")
	public int modelRotationSpeed = 0;

	@OriginalMember(owner = "client!wf", name = "Tb", descriptor = "B")
	public byte yMode = 0;

	@OriginalMember(owner = "client!wf", name = "Jc", descriptor = "I")
	public int height = 0;

	@OriginalMember(owner = "client!wf", name = "ec", descriptor = "I")
	public int updatedVarpsReaderIndex = 0;

	@OriginalMember(owner = "client!wf", name = "Wb", descriptor = "I")
	public int anInt5930 = -1;

	@OriginalMember(owner = "client!wf", name = "gc", descriptor = "I")
	public int objId = -1;

	@OriginalMember(owner = "client!wf", name = "Qc", descriptor = "I")
	public int dragDeadTime = 0;

	@OriginalMember(owner = "client!wf", name = "G", descriptor = "Z")
	public boolean showObjCount = true;

	@OriginalMember(owner = "client!wf", name = "Pc", descriptor = "S")
	public short aShort49 = 3000;

	@OriginalMember(owner = "client!wf", name = "zc", descriptor = "I")
	public int lastTransmitTimer = -1;

	@OriginalMember(owner = "client!wf", name = "Xb", descriptor = "I")
	public int scrollY = 0;

	@OriginalMember(owner = "client!wf", name = "mb", descriptor = "I")
	private int anInt5909 = 1;

	@OriginalMember(owner = "client!wf", name = "Hc", descriptor = "I")
	public int textLineHeight = 0;

	@OriginalMember(owner = "client!wf", name = "qc", descriptor = "Z")
	public boolean textShadow = false;

	@OriginalMember(owner = "client!wf", name = "tc", descriptor = "I")
	public int updatedStatsReaderIndex = 0;

	@OriginalMember(owner = "client!wf", name = "Z", descriptor = "I")
	public int anInt5904 = 0;

	@OriginalMember(owner = "client!wf", name = "uc", descriptor = "I")
	public int anInt5943 = 0;

	@OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
	public int anInt5892 = 0;

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
	public int scrollHeight = 0;

	@OriginalMember(owner = "client!wf", name = "vb", descriptor = "I")
	public int anInt5912 = 0;

	@OriginalMember(owner = "client!wf", name = "fc", descriptor = "I")
	public int layer = -1;

	@OriginalMember(owner = "client!wf", name = "Bc", descriptor = "B")
	public byte xMode = 0;

	@OriginalMember(owner = "client!wf", name = "Qb", descriptor = "I")
	public int baseWidth = 0;

	@OriginalMember(owner = "client!wf", name = "Kb", descriptor = "I")
	public int textVerticalAlignment = 0;

	@OriginalMember(owner = "client!wf", name = "Ob", descriptor = "I")
	public int anInt5926 = -1;

	@OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
	public int modelSeqId = -1;

	@OriginalMember(owner = "client!wf", name = "ed", descriptor = "I")
	public int anInt5964 = 0;

	@OriginalMember(owner = "client!wf", name = "hb", descriptor = "I")
	public int aspectRatioHeight = 1;

	@OriginalMember(owner = "client!wf", name = "Sb", descriptor = "I")
	private int anInt5929 = -1;

	@OriginalMember(owner = "client!wf", name = "cd", descriptor = "I")
	public int objCount = 0;

	@OriginalMember(owner = "client!wf", name = "Rc", descriptor = "I")
	public int textFont = -1;

	@OriginalMember(owner = "client!wf", name = "O", descriptor = "Ljava/lang/String;")
	public String opBase = "";

	@OriginalMember(owner = "client!wf", name = "Oc", descriptor = "I")
	public int updatedVarcstrsReaderIndex = 0;

	@OriginalMember(owner = "client!wf", name = "h", descriptor = "Lclient!on;")
	public ServerActiveProperties serverActiveProperties = DEFAULT_SERVER_ACTIVE_PROPERTIES;

	@OriginalMember(owner = "client!wf", name = "id", descriptor = "I")
	public int anInt5966 = 0;

	@OriginalMember(owner = "client!wf", name = "Kc", descriptor = "I")
	public int baseHeight = 0;

	@OriginalMember(owner = "client!wf", name = "Uc", descriptor = "I")
	public int anInt5957 = 0;

	@OriginalMember(owner = "client!wf", name = "pd", descriptor = "I")
	public int anInt5971 = 0;

	@OriginalMember(owner = "client!wf", name = "jd", descriptor = "I")
	public int rectangle = -1;

	@OriginalMember(owner = "client!wf", name = "dd", descriptor = "I")
	public int modelXOffset = 0;

	@OriginalMember(owner = "client!wf", name = "rc", descriptor = "Z")
	public boolean if3 = false;

	@OriginalMember(owner = "client!wf", name = "K", descriptor = "Z")
	public boolean noClickThrough = false;

	@OriginalMember(owner = "client!wf", name = "hc", descriptor = "I")
	public int modelType = 1;

	@OriginalMember(owner = "client!wf", name = "Vc", descriptor = "I")
	public int angle = 0;

	@OriginalMember(owner = "client!wf", name = "S", descriptor = "I")
	public int rectangleLoop = -1;

	@OriginalMember(owner = "client!wf", name = "cb", descriptor = "I")
	public int modelYOffset = 0;

	@OriginalMember(owner = "client!wf", name = "vd", descriptor = "I")
	public int modelYAngle = 0;

	@OriginalMember(owner = "client!wf", name = "nc", descriptor = "I")
	public int updatedInventoriesReaderIndex = 0;

	@OriginalMember(owner = "client!wf", name = "Zc", descriptor = "I")
	public int x = 0;

	@OriginalMember(owner = "client!wf", name = "xd", descriptor = "S")
	public short aShort50 = 0;

	@OriginalMember(owner = "client!wf", name = "wd", descriptor = "B")
	public byte heightMode = 0;

	@OriginalMember(owner = "client!wf", name = "Fc", descriptor = "I")
	public int graphic = -1;

	@OriginalMember(owner = "client!wf", name = "kd", descriptor = "I")
	public int createdComponentId = -1;

	@OriginalMember(owner = "client!wf", name = "Lc", descriptor = "I")
	public int baseY = 0;

	@OriginalMember(owner = "client!wf", name = "ud", descriptor = "I")
	public int outline = 0;

	@OriginalMember(owner = "client!wf", name = "Cd", descriptor = "Z")
	public boolean objWearColor = false;

	@OriginalMember(owner = "client!wf", name = "Jb", descriptor = "I")
	public int anInt5921 = 0;

	@OriginalMember(owner = "client!wf", name = "qd", descriptor = "I")
	public int anInt5972 = -1;

	@OriginalMember(owner = "client!wf", name = "zd", descriptor = "Ljava/lang/String;")
	public String targetVerb = "";

	@OriginalMember(owner = "client!wf", name = "Dd", descriptor = "I")
	public int anInt5979 = 1;

	@OriginalMember(owner = "client!wf", name = "nd", descriptor = "I")
	public int aspectRatioWidth = 1;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public void setOp(@OriginalArg(2) int i, @OriginalArg(0) String op) {
		if (this.ops == null || i >= this.ops.length) {
			@Pc(15) String[] ops = new String[i + 1];
			if (this.ops != null) {
				for (@Pc(20) int j = 0; j < this.ops.length; j++) {
					ops[j] = this.ops[j];
				}
			}
			this.ops = ops;
		}
		this.ops[i] = op;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!eg;Lclient!qk;IBIIZ)Lclient!vg;")
	public Model getModel(@OriginalArg(0) SeqType arg0, @OriginalArg(1) PlayerAppearance arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(14) int local14;
		@Pc(17) int local17;
		if (arg5) {
			local17 = this.anInt5929;
			local14 = this.anInt5909;
		} else {
			local14 = this.modelType;
			local17 = this.modelId;
		}
		Static3.aBoolean178 = false;
		if (local14 == 0) {
			return null;
		} else if (local14 == 1 && local17 == -1) {
			return null;
		} else if (local14 == 1) {
			@Pc(61) Model model = (Model) models.get((long) (local17 + (local14 << 16)));
			if (model == null) {
				@Pc(68) RawModel local68 = RawModel.create(InterfaceList.modelsArchive, local17);
				if (local68 == null) {
					Static3.aBoolean178 = true;
					return null;
				}
				model = local68.createModel(64, 768, -50, -10, -50);
				models.put((long) (local17 + (local14 << 16)), model);
			}
			if (arg0 != null) {
				model = arg0.method1017(arg4, arg2, model, arg3);
			}
			return model;
		} else if (local14 == 2) {
			@Pc(120) Model model = NpcTypeList.get(local17).getHeadModel(arg2, arg0, arg4, arg3);
			if (model == null) {
				Static3.aBoolean178 = true;
				return null;
			} else {
				return model;
			}
		} else if (local14 == 3) {
			if (arg1 == null) {
				return null;
			}
			@Pc(149) Model model = arg1.method3612(arg4, arg0, arg2, arg3);
			if (model == null) {
				Static3.aBoolean178 = true;
				return null;
			} else {
				return model;
			}
		} else if (local14 == 4) {
			@Pc(166) ObjType local166 = ObjTypeList.get(local17);
			@Pc(176) Model model = local166.getModel(arg3, 10, arg2, arg1, arg0, arg4);
			if (model == null) {
				Static3.aBoolean178 = true;
				return null;
			} else {
				return model;
			}
		} else if (local14 == 6) {
			@Pc(204) Model model = NpcTypeList.get(local17).getBodyModel(arg3, 0, null, arg0, arg2, null, 0, 0, arg4);
			if (model == null) {
				Static3.aBoolean178 = true;
				return null;
			} else {
				return model;
			}
		} else if (local14 != 7) {
			return null;
		} else if (arg1 == null) {
			return null;
		} else {
			@Pc(227) int local227 = this.modelId & 0xFFFF;
			@Pc(230) int local230 = this.anInt5913;
			@Pc(235) int local235 = this.modelId >>> 16;
			@Pc(246) Model model = arg1.method3609(arg0, local227, local230, arg3, arg4, local235, arg2);
			if (model == null) {
				Static3.aBoolean178 = true;
				return null;
			} else {
				return model;
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BI)Lclient!uj;")
	public Sprite method4724(@OriginalArg(1) int arg0) {
		Static3.aBoolean178 = false;
		if (arg0 < 0 || arg0 >= this.anIntArray658.length) {
			return null;
		}
		@Pc(27) int id = this.anIntArray658[arg0];
		if (id == -1) {
			return null;
		}
		@Pc(39) Sprite sprite = (Sprite) sprites.get(id);
		if (sprite != null) {
			return sprite;
		}
		@Pc(50) Sprite newSprite = SpriteLoader.loadSprite(InterfaceList.spritesArchive, id);
		if (newSprite == null) {
			Static3.aBoolean178 = true;
		} else {
			sprites.put(id, newSprite);
		}
		return newSprite;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)V")
	public void setOpCursor(@OriginalArg(0) int i, @OriginalArg(1) int cursor) {
		if (this.opCursors == null || i >= this.opCursors.length) {
			@Pc(23) int[] opCursors = new int[i + 1];
			if (this.opCursors != null) {
				for (@Pc(30) int j = 0; j < this.opCursors.length; j++) {
					opCursors[j] = this.opCursors[j];
				}
				for (@Pc(53) int j = this.opCursors.length; j < i; j++) {
					opCursors[j] = -1;
				}
			}
			this.opCursors = opCursors;
		}
		this.opCursors[i] = cursor;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)Lclient!eh;")
	public SkyBox method4726() {
		return this.anInt5972 == -1 ? null : SkyBoxTypeList.getSkyBox(this.anInt5972, this.anInt5916, this.anInt5977, this.anInt5898);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!fd;I)V")
	public void decodeIf1(@OriginalArg(0) Buffer buffer) {
		this.if3 = false;
		this.type = buffer.readUnsignedByte();
		this.anInt5912 = buffer.readUnsignedByte();
		this.anInt5904 = buffer.readUnsignedShort();
		this.baseX = buffer.readShort();
		this.baseY = buffer.readShort();
		this.baseWidth = buffer.readUnsignedShort();
		this.baseHeight = buffer.readUnsignedShort();
		this.heightMode = 0;
		this.xMode = 0;
		this.yMode = 0;
		this.widthMode = 0;
		this.transparency = buffer.readUnsignedByte();
		this.layer = buffer.readUnsignedShort();
		if (this.layer == 65535) {
			this.layer = -1;
		} else {
			this.layer += this.id & 0xFFFF0000;
		}
		this.anInt5923 = buffer.readUnsignedShort();
		if (this.anInt5923 == 65535) {
			this.anInt5923 = -1;
		}
		@Pc(110) int local110 = buffer.readUnsignedByte();
		if (local110 > 0) {
			this.cs1ComparisonOpcodes = new int[local110];
			this.cs1ComparisonOperands = new int[local110];
			for (@Pc(126) int local126 = 0; local126 < local110; local126++) {
				this.cs1ComparisonOpcodes[local126] = buffer.readUnsignedByte();
				this.cs1ComparisonOperands[local126] = buffer.readUnsignedShort();
			}
		}
		@Pc(154) int local154 = buffer.readUnsignedByte();
		if (local154 > 0) {
			this.cs1Scripts = new int[local154][];
			for (@Pc(162) int local162 = 0; local162 < local154; local162++) {
				@Pc(173) int local173 = buffer.readUnsignedShort();
				this.cs1Scripts[local162] = new int[local173];
				for (@Pc(181) int local181 = 0; local181 < local173; local181++) {
					this.cs1Scripts[local162][local181] = buffer.readUnsignedShort();
					if (this.cs1Scripts[local162][local181] == 65535) {
						this.cs1Scripts[local162][local181] = -1;
					}
				}
			}
		}
		@Pc(217) int events = 0;
		if (this.type == 0) {
			this.scrollHeight = buffer.readUnsignedShort();
			this.hidden = buffer.readUnsignedByte() == 1;
		}
		if (this.type == 1) {
			buffer.readUnsignedShort();
			buffer.readUnsignedByte();
		}
		if (this.type == 2) {
			this.widthMode = 3;
			this.heightMode = 3;
			this.objCounts = new int[this.baseHeight * this.baseWidth];
			this.objTypes = new int[this.baseWidth * this.baseHeight];
			@Pc(282) int local282 = buffer.readUnsignedByte();
			@Pc(286) int local286 = buffer.readUnsignedByte();
			if (local282 == 1) {
				events = 0x10000000;
			}
			@Pc(297) int local297 = buffer.readUnsignedByte();
			if (local286 == 1) {
				events |= 0x40000000;
			}
			@Pc(309) int local309 = buffer.readUnsignedByte();
			if (local297 == 1) {
				events |= Integer.MIN_VALUE;
			}
			if (local309 == 1) {
				events |= 0x20000000;
			}
			this.anInt5943 = buffer.readUnsignedByte();
			this.anInt5964 = buffer.readUnsignedByte();
			this.anIntArray663 = new int[20];
			this.anIntArray664 = new int[20];
			this.anIntArray658 = new int[20];
			for (@Pc(350) int local350 = 0; local350 < 20; local350++) {
				@Pc(357) int local357 = buffer.readUnsignedByte();
				if (local357 == 1) {
					this.anIntArray664[local350] = buffer.readShort();
					this.anIntArray663[local350] = buffer.readShort();
					this.anIntArray658[local350] = buffer.readInt();
				} else {
					this.anIntArray658[local350] = -1;
				}
			}
			this.objOps = new String[5];
			for (@Pc(399) int i = 0; i < 5; i++) {
				@Pc(408) String op = buffer.readString();
				if (op.length() > 0) {
					this.objOps[i] = op;
					events |= 0x1 << i + 23;
				}
			}
		}
		if (this.type == 3) {
			this.fill = buffer.readUnsignedByte() == 1;
		}
		if (this.type == 4 || this.type == 1) {
			this.textHorizontalAlignment = buffer.readUnsignedByte();
			this.textVerticalAlignment = buffer.readUnsignedByte();
			this.textLineHeight = buffer.readUnsignedByte();
			this.textFont = buffer.readUnsignedShort();
			if (this.textFont == 65535) {
				this.textFont = -1;
			}
			this.textShadow = buffer.readUnsignedByte() == 1;
		}
		if (this.type == 4) {
			this.text = buffer.readString();
			this.aString350 = buffer.readString();
		}
		if (this.type == 1 || this.type == 3 || this.type == 4) {
			this.color = buffer.readInt();
		}
		if (this.type == 3 || this.type == 4) {
			this.anInt5902 = buffer.readInt();
			this.anInt5966 = buffer.readInt();
			this.anInt5971 = buffer.readInt();
		}
		if (this.type == 5) {
			this.graphic = buffer.readInt();
			this.anInt5926 = buffer.readInt();
		}
		if (this.type == 6) {
			this.modelType = 1;
			this.modelId = buffer.readUnsignedShort();
			this.anInt5909 = 1;
			if (this.modelId == 65535) {
				this.modelId = -1;
			}
			this.anInt5929 = buffer.readUnsignedShort();
			if (this.anInt5929 == 65535) {
				this.anInt5929 = -1;
			}
			this.modelSeqId = buffer.readUnsignedShort();
			if (this.modelSeqId == 65535) {
				this.modelSeqId = -1;
			}
			this.anInt5910 = buffer.readUnsignedShort();
			if (this.anInt5910 == 65535) {
				this.anInt5910 = -1;
			}
			this.modelZoom = buffer.readUnsignedShort();
			this.modelXAngle = buffer.readUnsignedShort();
			this.modelYAngle = buffer.readUnsignedShort();
		}
		if (this.type == 7) {
			this.heightMode = 3;
			this.widthMode = 3;
			this.objCounts = new int[this.baseWidth * this.baseHeight];
			this.objTypes = new int[this.baseHeight * this.baseWidth];
			this.textHorizontalAlignment = buffer.readUnsignedByte();
			this.textFont = buffer.readUnsignedShort();
			if (this.textFont == 65535) {
				this.textFont = -1;
			}
			this.textShadow = buffer.readUnsignedByte() == 1;
			this.color = buffer.readInt();
			this.anInt5943 = buffer.readShort();
			this.anInt5964 = buffer.readShort();
			@Pc(729) int local729 = buffer.readUnsignedByte();
			if (local729 == 1) {
				events |= 0x40000000;
			}
			this.objOps = new String[5];
			for (@Pc(743) int i = 0; i < 5; i++) {
				@Pc(750) String op = buffer.readString();
				if (op.length() > 0) {
					this.objOps[i] = op;
					events |= 0x1 << i + 23;
				}
			}
		}
		if (this.type == 8) {
			this.text = buffer.readString();
		}
		if (this.anInt5912 == 2 || this.type == 2) {
			this.targetVerb = buffer.readString();
			this.aString353 = buffer.readString();
			@Pc(808) int local808 = buffer.readUnsignedShort() & 0x3F;
			events |= local808 << 11;
		}
		if (this.anInt5912 == 1 || this.anInt5912 == 4 || this.anInt5912 == 5 || this.anInt5912 == 6) {
			this.aString349 = buffer.readString();
			if (this.aString349.length() == 0) {
				if (this.anInt5912 == 1) {
					this.aString349 = LocalisedText.OK;
				}
				if (this.anInt5912 == 4) {
					this.aString349 = LocalisedText.SELECT;
				}
				if (this.anInt5912 == 5) {
					this.aString349 = LocalisedText.SELECT;
				}
				if (this.anInt5912 == 6) {
					this.aString349 = LocalisedText.CONTINUE;
				}
			}
		}
		if (this.anInt5912 == 1 || this.anInt5912 == 4 || this.anInt5912 == 5) {
			events |= 0x400000;
		}
		if (this.anInt5912 == 6) {
			events |= 0x1;
		}
		this.serverActiveProperties = new ServerActiveProperties(events, -1);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZB)Lclient!uj;")
	public Sprite method4729(@OriginalArg(0) boolean arg0) {
		Static3.aBoolean178 = false;
		@Pc(12) int local12;
		if (arg0) {
			local12 = this.anInt5926;
		} else {
			local12 = this.graphic;
		}
		if (local12 == -1) {
			return null;
		}
		@Pc(66) long key = ((this.verticalFlip ? 1L : 0L) << 39) + ((long) this.outline << 36) + (long) local12 + ((this.alpha ? 1L : 0L) << 35) + ((this.horizontalFlip ? 1L : 0L) << 38) + ((long) this.graphicShadow << 40);
		@Pc(72) Sprite sprite = (Sprite) sprites.get(key);
		if (sprite != null) {
			return sprite;
		}
		@Pc(86) SoftwareSprite newSprite;
		if (this.alpha) {
			newSprite = SpriteLoader.loadSoftwareAlphaSprite(InterfaceList.spritesArchive, local12);
		} else {
			newSprite = SpriteLoader.loadSoftwareSprite(InterfaceList.spritesArchive, local12, 0);
		}
		if (newSprite == null) {
			Static3.aBoolean178 = true;
			return null;
		}
		if (this.horizontalFlip) {
			newSprite.flipHorizontal();
		}
		if (this.verticalFlip) {
			newSprite.flipVertical();
		}
		if (this.outline > 0) {
			newSprite.method2177(this.outline);
		}
		if (this.outline >= 1) {
			newSprite.addOutline(1);
		}
		if (this.outline >= 2) {
			newSprite.addOutline(0xFFFFFF);
		}
		if (this.graphicShadow != 0) {
			newSprite.addShadow(this.graphicShadow);
		}
		@Pc(156) Sprite newSprite2;
		if (!GlRenderer.enabled) {
			newSprite2 = newSprite;
		} else if (newSprite instanceof SoftwareAlphaSprite) {
			newSprite2 = new GlAlphaSprite(newSprite);
		} else {
			newSprite2 = new GlSprite(newSprite);
		}
		sprites.put(key, newSprite2);
		return newSprite2;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILclient!fd;)[I")
	private int[] readTriggers(@OriginalArg(1) Buffer buffer) {
		@Pc(9) int len = buffer.readUnsignedByte();
		if (len == 0) {
			return null;
		}
		@Pc(27) int[] triggers = new int[len];
		for (@Pc(29) int i = 0; i < len; i++) {
			triggers[i] = buffer.readInt();
		}
		return triggers;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(ILclient!fd;)V")
	public void decodeIf3(@OriginalArg(1) Buffer buffer) {
		this.if3 = true;
		buffer.position++;
		this.type = buffer.readUnsignedByte();
		if ((this.type & 0x80) != 0) {
			this.type &= 127;
			buffer.readString();
		}
		this.anInt5904 = buffer.readUnsignedShort();
		this.baseX = buffer.readShort();
		this.baseY = buffer.readShort();
		this.baseWidth = buffer.readUnsignedShort();
		this.baseHeight = buffer.readUnsignedShort();
		this.widthMode = buffer.readByte();
		this.heightMode = buffer.readByte();
		this.xMode = buffer.readByte();
		this.yMode = buffer.readByte();
		this.layer = buffer.readUnsignedShort();
		if (this.layer == 65535) {
			this.layer = -1;
		} else {
			this.layer += this.id & 0xFFFF0000;
		}
		this.hidden = buffer.readUnsignedByte() == 1;
		if (this.type == 0) {
			this.scrollWidth = buffer.readUnsignedShort();
			this.scrollHeight = buffer.readUnsignedShort();
			this.noClickThrough = buffer.readUnsignedByte() == 1;
		}
		if (this.type == 5) {
			this.graphic = buffer.readInt();
			this.angle = buffer.readUnsignedShort();
			@Pc(160) int local160 = buffer.readUnsignedByte();
			this.alpha = (local160 & 0x2) != 0;
			this.tiled = (local160 & 0x1) != 0;
			this.transparency = buffer.readUnsignedByte();
			this.outline = buffer.readUnsignedByte();
			this.graphicShadow = buffer.readInt();
			this.horizontalFlip = buffer.readUnsignedByte() == 1;
			this.verticalFlip = buffer.readUnsignedByte() == 1;
			this.color = buffer.readInt();
		}
		if (this.type == 6) {
			this.modelType = 1;
			this.modelId = buffer.readUnsignedShort();
			if (this.modelId == 65535) {
				this.modelId = -1;
			}
			this.anInt5907 = buffer.readShort();
			this.anInt5921 = buffer.readShort();
			this.modelXAngle = buffer.readUnsignedShort();
			this.modelYAngle = buffer.readUnsignedShort();
			this.modelZAngle = buffer.readUnsignedShort();
			this.modelZoom = buffer.readUnsignedShort();
			this.modelSeqId = buffer.readUnsignedShort();
			if (this.modelSeqId == 65535) {
				this.modelSeqId = -1;
			}
			this.modelOrthographic = buffer.readUnsignedByte() == 1;
			this.aShort50 = (short) buffer.readUnsignedShort();
			this.aShort49 = (short) buffer.readUnsignedShort();
			this.aBoolean411 = buffer.readUnsignedByte() == 1;
			if (this.widthMode != 0) {
				this.anInt5957 = buffer.readUnsignedShort();
			}
			if (this.heightMode != 0) {
				this.anInt5920 = buffer.readUnsignedShort();
			}
		}
		if (this.type == 4) {
			this.textFont = buffer.readUnsignedShort();
			if (this.textFont == 65535) {
				this.textFont = -1;
			}
			this.text = buffer.readString();
			this.textLineHeight = buffer.readUnsignedByte();
			this.textHorizontalAlignment = buffer.readUnsignedByte();
			this.textVerticalAlignment = buffer.readUnsignedByte();
			this.textShadow = buffer.readUnsignedByte() == 1;
			this.color = buffer.readInt();
		}
		if (this.type == 3) {
			this.color = buffer.readInt();
			this.fill = buffer.readUnsignedByte() == 1;
			this.transparency = buffer.readUnsignedByte();
		}
		if (this.type == 9) {
			this.lineWidth = buffer.readUnsignedByte();
			this.color = buffer.readInt();
			this.lineDirection = buffer.readUnsignedByte() == 1;
		}
		@Pc(460) int local460 = buffer.readUnsignedMedium();
		@Pc(464) int local464 = buffer.readUnsignedByte();
		if (local464 != 0) {
			this.aByteArray74 = new byte[10];
			this.anIntArray662 = new int[10];
			this.aByteArray73 = new byte[10];
			while (local464 != 0) {
				@Pc(493) int local493 = (local464 >> 4) - 1;
				@Pc(501) int local501 = buffer.readUnsignedByte() | local464 << 8;
				local501 &= 4095;
				if (local501 == 4095) {
					this.anIntArray662[local493] = -1;
				} else {
					this.anIntArray662[local493] = local501;
				}
				this.aByteArray74[local493] = buffer.readByte();
				this.aByteArray73[local493] = buffer.readByte();
				local464 = buffer.readUnsignedByte();
			}
		}
		this.opBase = buffer.readString();
		@Pc(551) int local551 = buffer.readUnsignedByte();
		@Pc(555) int local555 = local551 >> 4;
		@Pc(559) int ops = local551 & 0xF;
		if (ops > 0) {
			this.ops = new String[ops];
			for (@Pc(571) int i = 0; i < ops; i++) {
				this.ops[i] = buffer.readString();
			}
		}
		if (local555 > 0) {
			@Pc(596) int local596 = buffer.readUnsignedByte();
			this.opCursors = new int[local596 + 1];
			for (@Pc(604) int local604 = 0; local604 < this.opCursors.length; local604++) {
				this.opCursors[local604] = -1;
			}
			this.opCursors[local596] = buffer.readUnsignedShort();
		}
		if (local555 > 1) {
			@Pc(638) int local638 = buffer.readUnsignedByte();
			this.opCursors[local638] = buffer.readUnsignedShort();
		}
		this.pauseText = buffer.readString();
		if (this.pauseText.equals("")) {
			this.pauseText = null;
		}
		@Pc(661) int local661 = -1;
		this.dragDeadZone = buffer.readUnsignedByte();
		this.dragDeadTime = buffer.readUnsignedByte();
		this.dragRender = buffer.readUnsignedByte() == 1;
		this.targetVerb = buffer.readString();
		if (ServerActiveProperties.getTargetMask(local460) != 0) {
			local661 = buffer.readUnsignedShort();
			if (local661 == 65535) {
				local661 = -1;
			}
			this.anInt5930 = buffer.readUnsignedShort();
			if (this.anInt5930 == 65535) {
				this.anInt5930 = -1;
			}
			this.anInt5890 = buffer.readUnsignedShort();
			if (this.anInt5890 == 65535) {
				this.anInt5890 = -1;
			}
		}
		this.serverActiveProperties = new ServerActiveProperties(local460, local661);
		this.anObjectArray22 = this.readArguments(buffer);
		this.onMouseOver = this.readArguments(buffer);
		this.onMouseLeave = this.readArguments(buffer);
		this.onTargetLeave = this.readArguments(buffer);
		this.onTargetEnter = this.readArguments(buffer);
		this.onVarpTransmit = this.readArguments(buffer);
		this.onInvTransmit = this.readArguments(buffer);
		this.onStatTransmit = this.readArguments(buffer);
		this.onTimer = this.readArguments(buffer);
		this.onOp = this.readArguments(buffer);
		this.onMouseRepeat = this.readArguments(buffer);
		this.onClick = this.readArguments(buffer);
		this.onClickRepeat = this.readArguments(buffer);
		this.onRelease = this.readArguments(buffer);
		this.onHold = this.readArguments(buffer);
		this.onDrag = this.readArguments(buffer);
		this.onDragComplete = this.readArguments(buffer);
		this.onScrollWheel = this.readArguments(buffer);
		this.onVarcTransmit = this.readArguments(buffer);
		this.onVarcstrTransmit = this.readArguments(buffer);
		this.varpTriggers = this.readTriggers(buffer);
		this.inventoryTriggers = this.readTriggers(buffer);
		this.statTriggers = this.readTriggers(buffer);
		this.varcTriggers = this.readTriggers(buffer);
		this.varcstrTriggers = this.readTriggers(buffer);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IBI)V")
	public void swapObjs(@OriginalArg(0) int i, @OriginalArg(2) int j) {
		@Pc(8) int temp = this.objTypes[i];
		this.objTypes[i] = this.objTypes[j];
		this.objTypes[j] = temp;
		temp = this.objCounts[i];
		this.objCounts[i] = this.objCounts[j];
		this.objCounts[j] = temp;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(B[Lclient!ma;)Lclient!gl;")
	public Font getFont(@OriginalArg(1) IndexedSprite[] nameIcons) {
		Static3.aBoolean178 = false;
		if (this.textFont == -1) {
			return null;
		}
		@Pc(28) Font font = (Font) fonts.get(this.textFont);
		if (font != null) {
			return font;
		}
		@Pc(42) Font newFont = SpriteLoader.loadFont(InterfaceList.spritesArchive, InterfaceList.fontMetricsArchive, this.textFont);
		if (newFont == null) {
			Static3.aBoolean178 = true;
		} else {
			newFont.setNameIcons(nameIcons, null);
			fonts.put(this.textFont, newFont);
		}
		return newFont;
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)Z")
	public boolean method4738() {
		if (this.anIntArray672 != null) {
			return true;
		}
		@Pc(19) SoftwareIndexedSprite local19 = SpriteLoader.loadSoftwareIndexedSprite(InterfaceList.spritesArchive, this.graphic);
		if (local19 == null) {
			return false;
		}
		local19.method1320();
		this.anIntArray657 = new int[local19.height];
		this.anIntArray672 = new int[local19.height];
		for (@Pc(44) int local44 = 0; local44 < local19.height; local44++) {
			@Pc(54) int local54 = 0;
			for (@Pc(56) int local56 = 0; local56 < local19.width; local56++) {
				if (local19.pixels[local56 + local44 * local19.width] != 0) {
					local54 = local56;
					break;
				}
			}
			@Pc(88) int local88 = local19.width;
			for (@Pc(90) int local90 = local54; local90 < local19.width; local90++) {
				if (local19.pixels[local19.width * local44 + local90] == 0) {
					local88 = local90;
					break;
				}
			}
			this.anIntArray672[local44] = local54;
			this.anIntArray657[local44] = local88 - local54;
		}
		return true;
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(ILclient!fd;)[Ljava/lang/Object;")
	private Object[] readArguments(@OriginalArg(1) Buffer buffer) {
		@Pc(5) int len = buffer.readUnsignedByte();
		if (len == 0) {
			return null;
		}
		@Pc(19) Object[] arguments = new Object[len];
		for (@Pc(21) int i = 0; i < len; i++) {
			@Pc(32) int type = buffer.readUnsignedByte();
			if (type == 0) {
				arguments[i] = Integer.valueOf(buffer.readInt());
			} else if (type == 1) {
				arguments[i] = buffer.readString();
			}
		}
		this.hasHook = true;
		return arguments;
	}
}
