import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class MidiDecoder {

	@OriginalMember(owner = "client!go", name = "b", descriptor = "[B")
	private static final byte[] STATUS_LENGTHS = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!go", name = "c", descriptor = "I")
	public int division;

	@OriginalMember(owner = "client!go", name = "d", descriptor = "[I")
	public int[] times;

	@OriginalMember(owner = "client!go", name = "e", descriptor = "J")
	private long startMillis;

	@OriginalMember(owner = "client!go", name = "f", descriptor = "[I")
	private int[] positions;

	@OriginalMember(owner = "client!go", name = "g", descriptor = "[I")
	private int[] statuses;

	@OriginalMember(owner = "client!go", name = "h", descriptor = "I")
	private int tempo;

	@OriginalMember(owner = "client!go", name = "i", descriptor = "[I")
	private int[] startPositions;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "Lclient!fd;")
	private final Buffer buffer = new Buffer(null);

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V")
	public MidiDecoder() {
	}

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "([B)V")
	public MidiDecoder(@OriginalArg(0) byte[] bytes) {
		this.init(bytes);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I)J")
	public final long getTimeMillis(@OriginalArg(0) int time) {
		return this.startMillis + (long) time * (long) this.tempo;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "()V")
	public final void release() {
		this.buffer.bytes = null;
		this.startPositions = null;
		this.positions = null;
		this.times = null;
		this.statuses = null;
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V")
	public final void addDeltaTime(@OriginalArg(0) int track) {
		@Pc(4) int deltaTime = this.buffer.readVarInt();
		@Pc(6) int[] times = this.times;
		times[track] += deltaTime;
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "()V")
	public final void loadEndOfTrackPosition() {
		this.buffer.position = -1;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "([B)V")
	public final void init(@OriginalArg(0) byte[] bytes) {
		this.buffer.bytes = bytes;
		this.buffer.position = 10;
		@Pc(12) int tracks = this.buffer.readUnsignedShort();
		this.division = this.buffer.readUnsignedShort();
		this.tempo = 500000;
		this.startPositions = new int[tracks];
		@Pc(27) int i = 0;
		while (i < tracks) {
			@Pc(35) int id = this.buffer.readInt();
			@Pc(40) int len = this.buffer.readInt();
			if (id == 0x4D54726B) {
				this.startPositions[i] = this.buffer.position;
				i++;
			}
			@Pc(53) Buffer buffer = this.buffer;
			buffer.position += len;
		}
		this.startMillis = 0L;
		this.positions = new int[tracks];
		for (@Pc(68) int j = 0; j < tracks; j++) {
			this.positions[j] = this.startPositions[j];
		}
		this.times = new int[tracks];
		this.statuses = new int[tracks];
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(J)V")
	public final void setStartMillis(@OriginalArg(0) long millis) {
		this.startMillis = millis;
		@Pc(6) int tracks = this.positions.length;
		for (@Pc(8) int i = 0; i < tracks; i++) {
			this.times[i] = 0;
			this.statuses[i] = 0;
			this.buffer.position = this.startPositions[i];
			this.addDeltaTime(i);
			this.positions[i] = this.buffer.position;
		}
	}

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(I)V")
	public final void loadTrackPosition(@OriginalArg(0) int track) {
		this.buffer.position = this.positions[track];
	}

	@OriginalMember(owner = "client!go", name = "c", descriptor = "()Z")
	public final boolean isValid() {
		return this.buffer.bytes != null;
	}

	@OriginalMember(owner = "client!go", name = "d", descriptor = "()Z")
	public final boolean hasNextTrack() {
		@Pc(3) int tracks = this.positions.length;
		for (@Pc(5) int i = 0; i < tracks; i++) {
			if (this.positions[i] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!go", name = "e", descriptor = "()I")
	public final int getNextTrack() {
		@Pc(3) int tracks = this.positions.length;
		@Pc(5) int track = -1;
		@Pc(7) int minTime = Integer.MAX_VALUE;
		for (@Pc(9) int i = 0; i < tracks; i++) {
			if (this.positions[i] >= 0 && this.times[i] < minTime) {
				track = i;
				minTime = this.times[i];
			}
		}
		return track;
	}

	@OriginalMember(owner = "client!go", name = "g", descriptor = "()I")
	public final int getTrackCount() {
		return this.positions.length;
	}

	@OriginalMember(owner = "client!go", name = "d", descriptor = "(I)I")
	private int getNextEventInternal(@OriginalArg(0) int track) {
		@Pc(7) byte statusByte = this.buffer.bytes[this.buffer.position];
		@Pc(13) int status;
		if (statusByte < 0) {
			status = statusByte & 0xFF;
			this.statuses[track] = status;
			this.buffer.position++;
		} else {
			status = this.statuses[track];
		}
		if (status != 240 && status != 247) {
			return this.getNextEvent(track, status);
		}
		@Pc(42) int len = this.buffer.readVarInt();
		if (status == 247 && len > 0) {
			@Pc(57) int status2 = this.buffer.bytes[this.buffer.position] & 0xFF;
			if (status2 >= 241 && status2 <= 243 || status2 == 246 || status2 == 248 || status2 >= 250 && status2 <= 252 || status2 == 254) {
				this.buffer.position++;
				this.statuses[track] = status2;
				return this.getNextEvent(track, status2);
			}
		}
		@Pc(97) Buffer buffer = this.buffer;
		buffer.position += len;
		return 0;
	}

	@OriginalMember(owner = "client!go", name = "e", descriptor = "(I)V")
	public final void saveTrackPosition(@OriginalArg(0) int track) {
		this.positions[track] = this.buffer.position;
	}

	@OriginalMember(owner = "client!go", name = "f", descriptor = "(I)I")
	public final int getNextEvent(@OriginalArg(0) int track) {
		return this.getNextEventInternal(track);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(II)I")
	private int getNextEvent(@OriginalArg(0) int track, @OriginalArg(1) int status) {
		if (status != 255) {
			@Pc(78) byte len = STATUS_LENGTHS[status - 128];
			@Pc(80) int event = status;
			if (len >= 1) {
				event = status | this.buffer.readUnsignedByte() << 8;
			}
			if (len >= 2) {
				event |= this.buffer.readUnsignedByte() << 16;
			}
			return event;
		}
		@Pc(7) int type = this.buffer.readUnsignedByte();
		@Pc(12) int len = this.buffer.readVarInt();
		if (type == 47) {
			@Pc(17) Buffer buffer = this.buffer;
			buffer.position += len;
			return 1;
		} else if (type == 81) {
			@Pc(32) int tempo = this.buffer.readUnsignedMedium();
			@Pc(33) int skipBytes = len - 3;
			@Pc(38) int time = this.times[track];
			this.startMillis += (long) time * (long) (this.tempo - tempo);
			this.tempo = tempo;
			@Pc(56) Buffer buffer = this.buffer;
			buffer.position += skipBytes;
			return 2;
		} else {
			@Pc(65) Buffer buffer = this.buffer;
			buffer.position += len;
			return 3;
		}
	}
}
