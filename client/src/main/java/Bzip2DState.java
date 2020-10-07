import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public final class Bzip2DState {

	@OriginalMember(owner = "client!km", name = "cb", descriptor = "[I")
	public static int[] tt;

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "[B")
	public byte[] strmNextIn;

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
	public int strmTotalOutLo32;

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
	public int bsBuff;

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
	public int origPtr;

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
	public int stateOutLen;

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
	public int tPos;

	@OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
	public int blockSize100k;

	@OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
	public int k0;

	@OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
	public int nInUse;

	@OriginalMember(owner = "client!kf", name = "w", descriptor = "[B")
	public byte[] strmNextOut;

	@OriginalMember(owner = "client!kf", name = "z", descriptor = "I")
	public int strmTotalInLo32;

	@OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
	public int strmAvailOut;

	@OriginalMember(owner = "client!kf", name = "D", descriptor = "B")
	public byte stateOutCh;

	@OriginalMember(owner = "client!kf", name = "H", descriptor = "I")
	public int nblockused;

	@OriginalMember(owner = "client!kf", name = "M", descriptor = "I")
	public int saveNblock;

	@OriginalMember(owner = "client!kf", name = "O", descriptor = "I")
	public int bsLive;

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "[[B")
	public final byte[][] len = new byte[6][258];

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "[I")
	public final int[] cftab = new int[257];

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "[Z")
	public final boolean[] inUse = new boolean[256];

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "[B")
	public final byte[] mfta = new byte[4096];

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "[I")
	public final int[] minLens = new int[6];

	@OriginalMember(owner = "client!kf", name = "x", descriptor = "[[I")
	public final int[][] base = new int[6][258];

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "[I")
	public final int[] mtfbase = new int[16];

	@OriginalMember(owner = "client!kf", name = "G", descriptor = "[I")
	public final int[] unfztab = new int[256];

	@OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
	public int strmNextInPtr = 0;

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "[Z")
	public final boolean[] inUse16 = new boolean[16];

	@OriginalMember(owner = "client!kf", name = "I", descriptor = "[B")
	public final byte[] seqToUnseq = new byte[256];

	@OriginalMember(owner = "client!kf", name = "E", descriptor = "[[I")
	public final int[][] limit = new int[6][258];

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "[B")
	public final byte[] selectorMtf = new byte[18002];

	@OriginalMember(owner = "client!kf", name = "F", descriptor = "[[I")
	public final int[][] perm = new int[6][258];

	@OriginalMember(owner = "client!kf", name = "J", descriptor = "[B")
	public final byte[] selector = new byte[18002];

	@OriginalMember(owner = "client!kf", name = "N", descriptor = "I")
	public int strmNextOutPtr = 0;
}
