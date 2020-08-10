import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Js5Index {

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "[I")
	public int[] groupCapacities;

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "[[I")
	public int[][] fileIds;

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "[I")
	public int[] groupChecksums;

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "I")
	public int version;

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
	public int size;

	@OriginalMember(owner = "client!fo", name = "i", descriptor = "Lclient!gf;")
	public IntHashTable groupNameHashTable;

	@OriginalMember(owner = "client!fo", name = "k", descriptor = "[[I")
	public int[][] fileNameHashes;

	@OriginalMember(owner = "client!fo", name = "l", descriptor = "[I")
	public int[] groupSizes;

	@OriginalMember(owner = "client!fo", name = "q", descriptor = "[Lclient!gf;")
	public IntHashTable[] fileNameHashTables;

	@OriginalMember(owner = "client!fo", name = "s", descriptor = "[I")
	public int[] groupNameHashes;

	@OriginalMember(owner = "client!fo", name = "u", descriptor = "[I")
	public int[] groupIds;

	@OriginalMember(owner = "client!fo", name = "v", descriptor = "[I")
	public int[] groupVersions;

	@OriginalMember(owner = "client!fo", name = "w", descriptor = "I")
	public int capacity;

	@OriginalMember(owner = "client!fo", name = "t", descriptor = "I")
	public final int checksum;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "([BI)V")
	public Js5Index(@OriginalArg(0) byte[] bytes, @OriginalArg(1) int expectedChecksum) {
		this.checksum = Static12.method2321(bytes.length, bytes);
		if (this.checksum != expectedChecksum) {
			throw new RuntimeException();
		}
		this.read(bytes);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "([BI)V")
	private void read(@OriginalArg(0) byte[] bytes) {
		@Pc(8) Buffer buffer = new Buffer(Js5Compression.uncompress(bytes));
		@Pc(12) int protocol = buffer.readUnsignedByte();
		if (protocol != 5 && protocol != 6) {
			throw new RuntimeException();
		}
		if (protocol >= 6) {
			this.version = buffer.readInt();
		} else {
			this.version = 0;
		}
		@Pc(44) int prevGroupId = 0;
		@Pc(48) int flags = buffer.readUnsignedByte();
		this.size = buffer.readUnsignedShort();
		@Pc(55) int maxGroupId = -1;
		this.groupIds = new int[this.size];
		for (@Pc(62) int i = 0; i < this.size; i++) {
			this.groupIds[i] = prevGroupId += buffer.readUnsignedShort();
			if (this.groupIds[i] > maxGroupId) {
				maxGroupId = this.groupIds[i];
			}
		}
		this.capacity = maxGroupId + 1;
		this.groupSizes = new int[this.capacity];
		this.groupChecksums = new int[this.capacity];
		this.fileIds = new int[this.capacity][];
		this.groupCapacities = new int[this.capacity];
		this.groupVersions = new int[this.capacity];
		if (flags != 0) {
			this.groupNameHashes = new int[this.capacity];
			for (@Pc(137) int groupId = 0; groupId < this.capacity; groupId++) {
				this.groupNameHashes[groupId] = -1;
			}
			for (@Pc(151) int i = 0; i < this.size; i++) {
				this.groupNameHashes[this.groupIds[i]] = buffer.readInt();
			}
			this.groupNameHashTable = new IntHashTable(this.groupNameHashes);
		}
		for (@Pc(181) int i = 0; i < this.size; i++) {
			this.groupChecksums[this.groupIds[i]] = buffer.readInt();
		}
		for (@Pc(204) int i = 0; i < this.size; i++) {
			this.groupVersions[this.groupIds[i]] = buffer.readInt();
		}
		for (@Pc(223) int i = 0; i < this.size; i++) {
			this.groupSizes[this.groupIds[i]] = buffer.readUnsignedShort();
		}
		for (@Pc(242) int i = 0; i < this.size; i++) {
			@Pc(258) int prevFileId = 0;
			@Pc(260) int maxFileId = -1;
			@Pc(265) int groupId = this.groupIds[i];
			@Pc(270) int groupSize = this.groupSizes[groupId];
			this.fileIds[groupId] = new int[groupSize];
			for (@Pc(278) int j = 0; j < groupSize; j++) {
				@Pc(300) int fileId = this.fileIds[groupId][j] = prevFileId += buffer.readUnsignedShort();
				if (fileId > maxFileId) {
					maxFileId = fileId;
				}
			}
			this.groupCapacities[groupId] = maxFileId + 1;
			if (maxFileId + 1 == groupSize) {
				this.fileIds[groupId] = null;
			}
		}
		if (flags == 0) {
			return;
		}
		this.fileNameHashes = new int[maxGroupId + 1][];
		this.fileNameHashTables = new IntHashTable[maxGroupId + 1];
		for (@Pc(353) int i = 0; i < this.size; i++) {
			@Pc(366) int groupId = this.groupIds[i];
			@Pc(371) int groupSize = this.groupSizes[groupId];
			this.fileNameHashes[groupId] = new int[this.groupCapacities[groupId]];
			for (@Pc(382) int fileId = 0; fileId < this.groupCapacities[groupId]; fileId++) {
				this.fileNameHashes[groupId][fileId] = -1;
			}
			for (@Pc(404) int j = 0; j < groupSize; j++) {
				@Pc(420) int fileId;
				if (this.fileIds[groupId] == null) {
					fileId = j;
				} else {
					fileId = this.fileIds[groupId][j];
				}
				this.fileNameHashes[groupId][fileId] = buffer.readInt();
			}
			this.fileNameHashTables[groupId] = new IntHashTable(this.fileNameHashes[groupId]);
		}
	}
}
