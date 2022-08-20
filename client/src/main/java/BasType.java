import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class BasType {

	@OriginalMember(owner = "client!nd", name = "y", descriptor = "Lclient!d;")
	public static final BasType DEFAULT = new BasType();

	@OriginalMember(owner = "client!d", name = "F", descriptor = "[[I")
	public int[][] equipmentTransforms;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "I")
	public int runFollow180SeqId = -1;

	@OriginalMember(owner = "client!d", name = "h", descriptor = "I")
	public int runCcwSeqId = -1;

	@OriginalMember(owner = "client!d", name = "l", descriptor = "I")
	public int anInt838 = 0;

	@OriginalMember(owner = "client!d", name = "m", descriptor = "I")
	public int crawlCwSeqId = -1;

	@OriginalMember(owner = "client!d", name = "z", descriptor = "I")
	public int anInt851 = 0;

	@OriginalMember(owner = "client!d", name = "r", descriptor = "I")
	public int crawlCcwSeqId = -1;

	@OriginalMember(owner = "client!d", name = "B", descriptor = "I")
	public int runCwSeqId = -1;

	@OriginalMember(owner = "client!d", name = "C", descriptor = "I")
	public int crawlSeqId = -1;

	@OriginalMember(owner = "client!d", name = "p", descriptor = "I")
	public int anInt841 = -1;

	@OriginalMember(owner = "client!d", name = "s", descriptor = "I")
	public int anInt844 = 0;

	@OriginalMember(owner = "client!d", name = "D", descriptor = "I")
	public int walkFollowCcwSeqId = -1;

	@OriginalMember(owner = "client!d", name = "c", descriptor = "I")
	public int anInt830 = 0;

	@OriginalMember(owner = "client!d", name = "w", descriptor = "I")
	public int anInt848 = 0;

	@OriginalMember(owner = "client!d", name = "q", descriptor = "I")
	public int walkCcwSeqId = -1;

	@OriginalMember(owner = "client!d", name = "u", descriptor = "I")
	public int walkSeqId = -1;

	@OriginalMember(owner = "client!d", name = "v", descriptor = "I")
	public int anInt847 = 0;

	@OriginalMember(owner = "client!d", name = "A", descriptor = "I")
	public int crawlFollowCcwSeqId = -1;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "I")
	public int walkFollow180SeqId = -1;

	@OriginalMember(owner = "client!d", name = "y", descriptor = "I")
	public int anInt850 = 0;

	@OriginalMember(owner = "client!d", name = "f", descriptor = "I")
	public int crawlFollow180SeqId = -1;

	@OriginalMember(owner = "client!d", name = "o", descriptor = "I")
	public int walkFollowCwSeqId = -1;

	@OriginalMember(owner = "client!d", name = "G", descriptor = "I")
	public int runFollowCwSeqId = -1;

	@OriginalMember(owner = "client!d", name = "L", descriptor = "I")
	public int crawlFollowCwSeqId = -1;

	@OriginalMember(owner = "client!d", name = "K", descriptor = "I")
	public int readySeqId = -1;

	@OriginalMember(owner = "client!d", name = "P", descriptor = "I")
	public int walkCwSeqId = -1;

	@OriginalMember(owner = "client!d", name = "e", descriptor = "I")
	public int readyCwSeqId = -1;

	@OriginalMember(owner = "client!d", name = "g", descriptor = "I")
	public int readyCcwSeqId = -1;

	@OriginalMember(owner = "client!d", name = "d", descriptor = "I")
	public int runSeqId = -1;

	@OriginalMember(owner = "client!d", name = "E", descriptor = "I")
	public int anInt856 = 0;

	@OriginalMember(owner = "client!d", name = "M", descriptor = "I")
	public int anInt862 = 0;

	@OriginalMember(owner = "client!d", name = "R", descriptor = "I")
	public int runFollowCcwSeqId = -1;

	@OriginalMember(owner = "client!d", name = "N", descriptor = "I")
	public int anInt863 = 0;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!fd;B)V")
	public final void decode(@OriginalArg(0) Buffer buffer) {
		while (true) {
			@Pc(17) int code = buffer.readUnsignedByte();
			if (code == 0) {
				return;
			}
			this.decode(buffer, code);
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IILclient!fd;)V")
	private void decode(@OriginalArg(2) Buffer buffer, @OriginalArg(1) int code) {
		if (code == 1) {
			this.readySeqId = buffer.readUnsignedShort();
			this.walkSeqId = buffer.readUnsignedShort();
			if (this.readySeqId == 65535) {
				this.readySeqId = -1;
			}
			if (this.walkSeqId == 65535) {
				this.walkSeqId = -1;
			}
		} else if (code == 2) {
			this.crawlSeqId = buffer.readUnsignedShort();
		} else if (code == 3) {
			this.crawlFollow180SeqId = buffer.readUnsignedShort();
		} else if (code == 4) {
			this.crawlFollowCcwSeqId = buffer.readUnsignedShort();
		} else if (code == 5) {
			this.crawlFollowCwSeqId = buffer.readUnsignedShort();
		} else if (code == 6) {
			this.runSeqId = buffer.readUnsignedShort();
		} else if (code == 7) {
			this.runFollow180SeqId = buffer.readUnsignedShort();
		} else if (code == 8) {
			this.runFollowCcwSeqId = buffer.readUnsignedShort();
		} else if (code == 9) {
			this.runFollowCwSeqId = buffer.readUnsignedShort();
		} else if (code == 26) {
			this.anInt844 = (short) (buffer.readUnsignedByte() * 4);
			this.anInt847 = (short) (buffer.readUnsignedByte() * 4);
		} else if (code == 27) {
			if (this.equipmentTransforms == null) {
				this.equipmentTransforms = new int[12][];
			}
			@Pc(138) int slot = buffer.readUnsignedByte();
			this.equipmentTransforms[slot] = new int[6];
			for (@Pc(146) int i = 0; i < 6; i++) {
				this.equipmentTransforms[slot][i] = buffer.readShort();
			}
		} else if (code == 29) {
			this.anInt830 = buffer.readUnsignedByte();
		} else if (code == 30) {
			this.anInt862 = buffer.readUnsignedShort();
		} else if (code == 31) {
			this.anInt856 = buffer.readUnsignedByte();
		} else if (code == 32) {
			this.anInt838 = buffer.readUnsignedShort();
		} else if (code == 33) {
			this.anInt850 = buffer.readShort();
		} else if (code == 34) {
			this.anInt863 = buffer.readUnsignedByte();
		} else if (code == 35) {
			this.anInt848 = buffer.readUnsignedShort();
		} else if (code == 36) {
			this.anInt851 = buffer.readShort();
		} else if (code == 37) {
			this.anInt841 = buffer.readUnsignedByte();
		} else if (code == 38) {
			this.readyCcwSeqId = buffer.readUnsignedShort();
		} else if (code == 39) {
			this.readyCwSeqId = buffer.readUnsignedShort();
		} else if (code == 40) {
			this.walkFollow180SeqId = buffer.readUnsignedShort();
		} else if (code == 41) {
			this.walkFollowCcwSeqId = buffer.readUnsignedShort();
		} else if (code == 42) {
			this.walkFollowCwSeqId = buffer.readUnsignedShort();
		} else if (code == 43) {
			buffer.readUnsignedShort();
		} else if (code == 44) {
			buffer.readUnsignedShort();
		} else if (code == 45) {
			buffer.readUnsignedShort();
		} else if (code == 46) {
			this.crawlCcwSeqId = buffer.readUnsignedShort();
		} else if (code == 47) {
			this.crawlCwSeqId = buffer.readUnsignedShort();
		} else if (code == 48) {
			this.runCcwSeqId = buffer.readUnsignedShort();
		} else if (code == 49) {
			this.runCwSeqId = buffer.readUnsignedShort();
		} else if (code == 50) {
			this.walkCcwSeqId = buffer.readUnsignedShort();
		} else if (code == 51) {
			this.walkCwSeqId = buffer.readUnsignedShort();
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
	public final void postDecode() {
	}
}
