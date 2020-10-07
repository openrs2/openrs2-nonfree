import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("unpackclass!h")
public final class Bzip2DState {

	@OriginalMember(owner = "unpackclass!h", name = "s", descriptor = "[I")
	public static int[] tt;

	@OriginalMember(owner = "unpackclass!h", name = "a", descriptor = "[B")
	public byte[] strmNextIn;

	@OriginalMember(owner = "unpackclass!h", name = "b", descriptor = "I")
	public int strmNextInPtr;

	@OriginalMember(owner = "unpackclass!h", name = "c", descriptor = "I")
	public int strmTotalInLo32;

	@OriginalMember(owner = "unpackclass!h", name = "d", descriptor = "[B")
	public byte[] strmNextOut;

	@OriginalMember(owner = "unpackclass!h", name = "e", descriptor = "I")
	public int strmNextOutPtr;

	@OriginalMember(owner = "unpackclass!h", name = "f", descriptor = "I")
	public int strmAvailOut;

	@OriginalMember(owner = "unpackclass!h", name = "g", descriptor = "I")
	public int strmTotalOutLo32;

	@OriginalMember(owner = "unpackclass!h", name = "h", descriptor = "B")
	public byte stateOutCh;

	@OriginalMember(owner = "unpackclass!h", name = "i", descriptor = "I")
	public int stateOutLen;

	@OriginalMember(owner = "unpackclass!h", name = "j", descriptor = "I")
	public int bsBuff;

	@OriginalMember(owner = "unpackclass!h", name = "k", descriptor = "I")
	public int bsLive;

	@OriginalMember(owner = "unpackclass!h", name = "l", descriptor = "I")
	public int blockSize100k;

	@OriginalMember(owner = "unpackclass!h", name = "m", descriptor = "I")
	public int origPtr;

	@OriginalMember(owner = "unpackclass!h", name = "n", descriptor = "I")
	public int tPos;

	@OriginalMember(owner = "unpackclass!h", name = "o", descriptor = "I")
	public int k0;

	@OriginalMember(owner = "unpackclass!h", name = "q", descriptor = "I")
	public int nblockUsed;

	@OriginalMember(owner = "unpackclass!h", name = "t", descriptor = "I")
	public int nInUse;

	@OriginalMember(owner = "unpackclass!h", name = "G", descriptor = "I")
	public int saveNblock;

	@OriginalMember(owner = "unpackclass!h", name = "p", descriptor = "[I")
	public final int[] unfztab = new int[256];

	@OriginalMember(owner = "unpackclass!h", name = "r", descriptor = "[I")
	public final int[] cftab = new int[257];

	@OriginalMember(owner = "unpackclass!h", name = "u", descriptor = "[Z")
	public final boolean[] inUse = new boolean[256];

	@OriginalMember(owner = "unpackclass!h", name = "v", descriptor = "[Z")
	public final boolean[] inUse16 = new boolean[16];

	@OriginalMember(owner = "unpackclass!h", name = "w", descriptor = "[B")
	public final byte[] seqToUnseq = new byte[256];

	@OriginalMember(owner = "unpackclass!h", name = "x", descriptor = "[B")
	public final byte[] mtfa = new byte[4096];

	@OriginalMember(owner = "unpackclass!h", name = "y", descriptor = "[I")
	public final int[] mtfbase = new int[16];

	@OriginalMember(owner = "unpackclass!h", name = "z", descriptor = "[B")
	public final byte[] selector = new byte[18002];

	@OriginalMember(owner = "unpackclass!h", name = "A", descriptor = "[B")
	public final byte[] selectorMtf = new byte[18002];

	@OriginalMember(owner = "unpackclass!h", name = "B", descriptor = "[[B")
	public final byte[][] len = new byte[6][258];

	@OriginalMember(owner = "unpackclass!h", name = "C", descriptor = "[[I")
	public final int[][] limit = new int[6][258];

	@OriginalMember(owner = "unpackclass!h", name = "D", descriptor = "[[I")
	public final int[][] base = new int[6][258];

	@OriginalMember(owner = "unpackclass!h", name = "E", descriptor = "[[I")
	public final int[][] perm = new int[6][258];

	@OriginalMember(owner = "unpackclass!h", name = "F", descriptor = "[I")
	public final int[] minLens = new int[6];
}
