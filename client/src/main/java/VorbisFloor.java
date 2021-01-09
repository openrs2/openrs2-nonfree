import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class VorbisFloor {

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "[I")
	private static final int[] RANGES = new int[] { 256, 128, 86, 64 };

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "[F")
	private static final float[] INVERSE_DB_TABLE = new float[] { 1.0649863E-7F, 1.1341951E-7F, 1.2079015E-7F, 1.2863978E-7F, 1.369995E-7F, 1.459025E-7F, 1.5538409E-7F, 1.6548181E-7F, 1.7623574E-7F, 1.8768856E-7F, 1.998856E-7F, 2.128753E-7F, 2.2670913E-7F, 2.4144197E-7F, 2.5713223E-7F, 2.7384212E-7F, 2.9163792E-7F, 3.1059022E-7F, 3.307741E-7F, 3.5226967E-7F, 3.7516213E-7F, 3.995423E-7F, 4.255068E-7F, 4.5315863E-7F, 4.8260745E-7F, 5.1397E-7F, 5.4737063E-7F, 5.829419E-7F, 6.208247E-7F, 6.611694E-7F, 7.041359E-7F, 7.4989464E-7F, 7.98627E-7F, 8.505263E-7F, 9.057983E-7F, 9.646621E-7F, 1.0273513E-6F, 1.0941144E-6F, 1.1652161E-6F, 1.2409384E-6F, 1.3215816E-6F, 1.4074654E-6F, 1.4989305E-6F, 1.5963394E-6F, 1.7000785E-6F, 1.8105592E-6F, 1.9282195E-6F, 2.053526E-6F, 2.1869757E-6F, 2.3290977E-6F, 2.4804558E-6F, 2.6416496E-6F, 2.813319E-6F, 2.9961443E-6F, 3.1908505E-6F, 3.39821E-6F, 3.619045E-6F, 3.8542307E-6F, 4.1047006E-6F, 4.371447E-6F, 4.6555283E-6F, 4.958071E-6F, 5.280274E-6F, 5.623416E-6F, 5.988857E-6F, 6.3780467E-6F, 6.7925284E-6F, 7.2339453E-6F, 7.704048E-6F, 8.2047E-6F, 8.737888E-6F, 9.305725E-6F, 9.910464E-6F, 1.0554501E-5F, 1.1240392E-5F, 1.1970856E-5F, 1.2748789E-5F, 1.3577278E-5F, 1.4459606E-5F, 1.5399271E-5F, 1.6400005E-5F, 1.7465769E-5F, 1.8600793E-5F, 1.9809577E-5F, 2.1096914E-5F, 2.2467912E-5F, 2.3928002E-5F, 2.5482977E-5F, 2.7139005E-5F, 2.890265E-5F, 3.078091E-5F, 3.2781227E-5F, 3.4911533E-5F, 3.718028E-5F, 3.9596467E-5F, 4.2169668E-5F, 4.491009E-5F, 4.7828602E-5F, 5.0936775E-5F, 5.424693E-5F, 5.7772202E-5F, 6.152657E-5F, 6.552491E-5F, 6.9783084E-5F, 7.4317984E-5F, 7.914758E-5F, 8.429104E-5F, 8.976875E-5F, 9.560242E-5F, 1.0181521E-4F, 1.0843174E-4F, 1.1547824E-4F, 1.2298267E-4F, 1.3097477E-4F, 1.3948625E-4F, 1.4855085E-4F, 1.5820454E-4F, 1.6848555E-4F, 1.7943469E-4F, 1.9109536E-4F, 2.0351382E-4F, 2.167393E-4F, 2.3082423E-4F, 2.4582449E-4F, 2.6179955E-4F, 2.7881275E-4F, 2.9693157E-4F, 3.1622787E-4F, 3.3677815E-4F, 3.5866388E-4F, 3.8197188E-4F, 4.0679457E-4F, 4.3323037E-4F, 4.613841E-4F, 4.913675E-4F, 5.2329927E-4F, 5.573062E-4F, 5.935231E-4F, 6.320936E-4F, 6.731706E-4F, 7.16917E-4F, 7.635063E-4F, 8.1312325E-4F, 8.6596457E-4F, 9.2223985E-4F, 9.821722E-4F, 0.0010459992F, 0.0011139743F, 0.0011863665F, 0.0012634633F, 0.0013455702F, 0.0014330129F, 0.0015261382F, 0.0016253153F, 0.0017309374F, 0.0018434235F, 0.0019632196F, 0.0020908006F, 0.0022266726F, 0.0023713743F, 0.0025254795F, 0.0026895993F, 0.0028643848F, 0.0030505287F, 0.003248769F, 0.0034598925F, 0.0036847359F, 0.0039241905F, 0.0041792067F, 0.004450795F, 0.004740033F, 0.005048067F, 0.0053761187F, 0.005725489F, 0.0060975635F, 0.0064938175F, 0.0069158226F, 0.0073652514F, 0.007843887F, 0.008353627F, 0.008896492F, 0.009474637F, 0.010090352F, 0.01074608F, 0.011444421F, 0.012188144F, 0.012980198F, 0.013823725F, 0.014722068F, 0.015678791F, 0.016697686F, 0.017782796F, 0.018938422F, 0.020169148F, 0.021479854F, 0.022875736F, 0.02436233F, 0.025945531F, 0.027631618F, 0.029427277F, 0.031339627F, 0.03337625F, 0.035545226F, 0.037855156F, 0.0403152F, 0.042935107F, 0.045725275F, 0.048696756F, 0.05186135F, 0.05523159F, 0.05882085F, 0.062643364F, 0.06671428F, 0.07104975F, 0.075666964F, 0.08058423F, 0.08582105F, 0.09139818F, 0.097337745F, 0.1036633F, 0.11039993F, 0.11757434F, 0.12521498F, 0.13335215F, 0.14201812F, 0.15124726F, 0.16107617F, 0.1715438F, 0.18269168F, 0.19456401F, 0.20720787F, 0.22067343F, 0.23501402F, 0.25028655F, 0.26655158F, 0.28387362F, 0.3023213F, 0.32196787F, 0.34289113F, 0.36517414F, 0.3889052F, 0.41417846F, 0.44109413F, 0.4697589F, 0.50028646F, 0.53279793F, 0.5674221F, 0.6042964F, 0.64356697F, 0.6853896F, 0.72993004F, 0.777365F, 0.8278826F, 0.88168305F, 0.9389798F, 1.0F };

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "[Z")
	private static boolean[] step2Flag;

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "([II)I")
	private static int highNeighbour(@OriginalArg(0) int[] v, @OriginalArg(1) int i) {
		@Pc(3) int currentX = v[i];
		@Pc(5) int hi = -1;
		@Pc(7) int hx = Integer.MAX_VALUE;
		for (@Pc(9) int j = 0; j < i; j++) {
			@Pc(16) int x = v[j];
			if (x > currentX && x < hx) {
				hi = j;
				hx = x;
			}
		}
		return hi;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([II)I")
	private static int lowNeighbour(@OriginalArg(0) int[] v, @OriginalArg(1) int i) {
		@Pc(3) int currentX = v[i];
		@Pc(5) int lo = -1;
		@Pc(7) int lx = Integer.MIN_VALUE;
		for (@Pc(9) int j = 0; j < i; j++) {
			@Pc(16) int x = v[j];
			if (x < currentX && x > lx) {
				lo = j;
				lx = x;
			}
		}
		return lo;
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "[I")
	private static int[] currentXList;

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "[I")
	private static int[] y;

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "[I")
	private final int[] classList;

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "[I")
	private final int[] classDimensions;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "[I")
	private final int[] subclasses;

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "[I")
	private final int[] classMasterBooks;

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "[[I")
	private final int[][] subclassBooks;

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
	private final int multiplier;

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "[I")
	private final int[] xList;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
	public VorbisFloor() {
		@Pc(4) int type = VorbisSound.readBits(16);
		if (type != 1) {
			throw new RuntimeException();
		}
		@Pc(14) int partitions = VorbisSound.readBits(5);
		@Pc(16) int maxClass = 0;
		this.classList = new int[partitions];
		for (@Pc(22) int i = 0; i < partitions; i++) {
			@Pc(28) int clazz = VorbisSound.readBits(4);
			this.classList[i] = clazz;
			if (clazz >= maxClass) {
				maxClass = clazz + 1;
			}
		}
		this.classDimensions = new int[maxClass];
		this.subclasses = new int[maxClass];
		this.classMasterBooks = new int[maxClass];
		this.subclassBooks = new int[maxClass][];
		for (@Pc(60) int i = 0; i < maxClass; i++) {
			this.classDimensions[i] = VorbisSound.readBits(3) + 1;
			@Pc(79) int subclass = this.subclasses[i] = VorbisSound.readBits(2);
			if (subclass != 0) {
				this.classMasterBooks[i] = VorbisSound.readBits(8);
			}
			@Pc(91) int len = 0x1 << subclass;
			@Pc(94) int[] subclassBooks = new int[len];
			this.subclassBooks[i] = subclassBooks;
			for (@Pc(101) int j = 0; j < len; j++) {
				subclassBooks[j] = VorbisSound.readBits(8) - 1;
			}
		}
		this.multiplier = VorbisSound.readBits(2) + 1;
		@Pc(124) int rangeBits = VorbisSound.readBits(4);
		@Pc(126) int xListLen = 2;
		for (@Pc(128) int i = 0; i < partitions; i++) {
			xListLen += this.classDimensions[this.classList[i]];
		}
		this.xList = new int[xListLen];
		this.xList[0] = 0;
		this.xList[1] = 0x1 << rangeBits;
		@Pc(161) int values = 2;
		for (@Pc(163) int i = 0; i < partitions; i++) {
			@Pc(171) int clazz = this.classList[i];
			for (@Pc(173) int j = 0; j < this.classDimensions[clazz]; j++) {
				this.xList[values++] = VorbisSound.readBits(rangeBits);
			}
		}
		if (currentXList == null || currentXList.length < values) {
			currentXList = new int[values];
			y = new int[values];
			step2Flag = new boolean[values];
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([FI)V")
	public final void synthesize(@OriginalArg(0) float[] floor, @OriginalArg(1) int n) {
		@Pc(3) int xListLen = this.xList.length;
		@Pc(10) int range = RANGES[this.multiplier - 1];
		step2Flag[0] = step2Flag[1] = true;
		for (@Pc(20) int i = 2; i < xListLen; i++) {
			@Pc(27) int lowNeighbourOffset = lowNeighbour(currentXList, i);
			@Pc(31) int highNeighbourOffset = highNeighbour(currentXList, i);
			@Pc(49) int predicted = this.renderPoint(currentXList[lowNeighbourOffset], y[lowNeighbourOffset], currentXList[highNeighbourOffset], y[highNeighbourOffset], currentXList[i]);
			@Pc(53) int value = y[i];
			@Pc(57) int highRoom = range - predicted;
			@Pc(68) int room = (highRoom < predicted ? highRoom : predicted) << 1;
			if (value == 0) {
				step2Flag[i] = false;
				y[i] = predicted;
			} else {
				step2Flag[lowNeighbourOffset] = step2Flag[highNeighbourOffset] = true;
				step2Flag[i] = true;
				if (value >= room) {
					y[i] = highRoom > predicted ? value + predicted - predicted : predicted + highRoom - value - 1;
				} else {
					y[i] = (value & 0x1) == 0 ? predicted + value / 2 : predicted - (value + 1) / 2;
				}
			}
		}
		this.sort(0, xListLen - 1);
		@Pc(144) int lx = 0;
		@Pc(151) int ly = y[0] * this.multiplier;
		for (@Pc(153) int i = 1; i < xListLen; i++) {
			if (step2Flag[i]) {
				@Pc(164) int hx = currentXList[i];
				@Pc(171) int hy = y[i] * this.multiplier;
				this.renderLine(lx, ly, hx, hy, floor, n);
				if (hx >= n) {
					return;
				}
				lx = hx;
				ly = hy;
			}
		}
		@Pc(193) float inverseDB = INVERSE_DB_TABLE[ly];
		for (@Pc(195) int i = lx; i < n; i++) {
			floor[i] *= inverseDB;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
	private void sort(@OriginalArg(0) int lo, @OriginalArg(1) int hi) {
		if (lo >= hi) {
			return;
		}
		@Pc(5) int mid = lo;
		@Pc(9) int pivot = currentXList[lo];
		@Pc(13) int tempY = y[lo];
		@Pc(17) boolean tempStep2Flag = step2Flag[lo];
		for (@Pc(21) int i = lo + 1; i <= hi; i++) {
			@Pc(28) int value = currentXList[i];
			if (value < pivot) {
				currentXList[mid] = value;
				y[mid] = y[i];
				step2Flag[mid] = step2Flag[i];
				mid++;
				currentXList[i] = currentXList[mid];
				y[i] = y[mid];
				step2Flag[i] = step2Flag[mid];
			}
		}
		currentXList[mid] = pivot;
		y[mid] = tempY;
		step2Flag[mid] = tempStep2Flag;
		this.sort(lo, mid - 1);
		this.sort(mid + 1, hi);
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "()Z")
	public final boolean decodePacket() {
		@Pc(5) boolean nonZero = VorbisSound.readBit() != 0;
		if (!nonZero) {
			return false;
		}
		@Pc(13) int xListLen = this.xList.length;
		for (@Pc(15) int i = 0; i < xListLen; i++) {
			currentXList[i] = this.xList[i];
		}
		@Pc(34) int range = RANGES[this.multiplier - 1];
		@Pc(40) int logRange = IntUtils.bitCount(range - 1);
		y[0] = VorbisSound.readBits(logRange);
		y[1] = VorbisSound.readBits(logRange);
		@Pc(52) int offset = 2;
		for (@Pc(54) int i = 0; i < this.classList.length; i++) {
			@Pc(64) int clazz = this.classList[i];
			@Pc(69) int cDim = this.classDimensions[clazz];
			@Pc(74) int cBits = this.subclasses[clazz];
			@Pc(80) int cSub = (0x1 << cBits) - 1;
			@Pc(82) int cVal = 0;
			if (cBits > 0) {
				cVal = VorbisSound.codebooks[this.classMasterBooks[clazz]].decodeScalar();
			}
			for (@Pc(94) int j = 0; j < cDim; j++) {
				@Pc(106) int book = this.subclassBooks[clazz][cVal & cSub];
				cVal >>>= cBits;
				y[offset++] = book >= 0 ? VorbisSound.codebooks[book].decodeScalar() : 0;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII[FI)V")
	private void renderLine(@OriginalArg(0) int x0, @OriginalArg(1) int y0, @OriginalArg(2) int x1, @OriginalArg(3) int y1, @OriginalArg(4) float[] v, @OriginalArg(5) int vLen) {
		@Pc(3) int dy = y1 - y0;
		@Pc(7) int adx = x1 - x0;
		@Pc(14) int ady = dy < 0 ? -dy : dy;
		@Pc(18) int base = dy / adx;
		@Pc(20) int y = y0;
		@Pc(22) int err = 0;
		@Pc(32) int sy = dy < 0 ? base - 1 : base + 1;
		ady -= (base < 0 ? -base : base) * adx;
		v[x0] *= INVERSE_DB_TABLE[y0];
		if (x1 > vLen) {
			x1 = vLen;
		}
		for (@Pc(61) int x = x0 + 1; x < x1; x++) {
			err += ady;
			if (err >= adx) {
				err -= adx;
				y += sy;
			} else {
				y += base;
			}
			v[x] *= INVERSE_DB_TABLE[y];
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII)I")
	private int renderPoint(@OriginalArg(0) int x0, @OriginalArg(1) int y0, @OriginalArg(2) int x1, @OriginalArg(3) int y1, @OriginalArg(4) int X) {
		@Pc(3) int dy = y1 - y0;
		@Pc(7) int adx = x1 - x0;
		@Pc(14) int ady = dy < 0 ? -dy : dy;
		@Pc(20) int err = ady * (X - x0);
		@Pc(24) int off = err / adx;
		return dy < 0 ? y0 - off : y0 + off;
	}
}
