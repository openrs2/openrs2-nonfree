import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Js5 {

	@OriginalMember(owner = "client!jk", name = "q", descriptor = "Z")
	private static final boolean RAISE_EXCEPTIONS = false;

	@OriginalMember(owner = "client!fh", name = "s", descriptor = "[[Ljava/lang/Object;")
	private Object[][] unpacked;

	@OriginalMember(owner = "client!fh", name = "H", descriptor = "[Ljava/lang/Object;")
	private Object[] packed;

	@OriginalMember(owner = "client!fh", name = "L", descriptor = "Lclient!fo;")
	private Js5Index index = null;

	@OriginalMember(owner = "client!fh", name = "p", descriptor = "Z")
	private final boolean discardUnpacked;

	@OriginalMember(owner = "client!fh", name = "G", descriptor = "Lclient!ga;")
	private final Js5ResourceProvider provider;

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "Z")
	private final boolean discardPacked;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lclient!ga;ZZ)V")
	public Js5(@OriginalArg(0) Js5ResourceProvider provider, @OriginalArg(1) boolean discardPacked, @OriginalArg(2) boolean discardUnpacked) {
		this.discardUnpacked = discardUnpacked;
		this.provider = provider;
		this.discardPacked = discardPacked;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z")
	public final boolean isFileReady(@OriginalArg(0) String group, @OriginalArg(2) String file) {
		if (!this.isIndexReady()) {
			return false;
		}
		group = group.toLowerCase();
		file = file.toLowerCase();
		@Pc(25) int groupId = this.index.groupNameHashTable.get(StringUtils.hashCode(group));
		if (this.isGroupValid(groupId)) {
			@Pc(52) int fileId = this.index.fileNameHashTables[groupId].get(StringUtils.hashCode(file));
			return this.isFileReady(groupId, fileId);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)V")
	private void prefetchGroup(@OriginalArg(1) int group) {
		this.provider.prefetchGroup(group);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public final int getPercentageComplete(@OriginalArg(0) String group) {
		if (this.isIndexReady()) {
			group = group.toLowerCase();
			@Pc(30) int groupId = this.index.groupNameHashTable.get(StringUtils.hashCode(group));
			return this.getPercentageComplete(groupId);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZ)[B")
	public final byte[] fetchFile(@OriginalArg(0) int id) {
		if (!this.isIndexReady()) {
			return null;
		} else if (this.index.groupCapacities.length == 1) {
			return this.fetchFile(0, id);
		} else if (!this.isGroupValid(id)) {
			return null;
		} else if (this.index.groupCapacities[id] == 1) {
			return this.fetchFile(id, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public final boolean isGroupNameValid(@OriginalArg(0) String group) {
		if (this.isIndexReady()) {
			group = group.toLowerCase();
			@Pc(27) int groupId = this.index.groupNameHashTable.get(StringUtils.hashCode(group));
			return groupId >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)I")
	public final int getPercentageComplete() {
		if (!this.isIndexReady()) {
			return 0;
		}
		@Pc(13) int total = 0;
		@Pc(15) int complete = 0;
		for (@Pc(17) int i = 0; i < this.packed.length; i++) {
			if (this.index.groupSizes[i] > 0) {
				complete += this.getPercentageComplete(i);
				total += 100;
			}
		}
		if (total == 0) {
			return 100;
		} else {
			return complete * 100 / total;
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)I")
	private int getPercentageComplete(@OriginalArg(0) int group) {
		if (this.isGroupValid(group)) {
			return this.packed[group] == null ? this.provider.getPercentageComplete(group) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)Z")
	private boolean isIndexReady() {
		if (this.index == null) {
			this.index = this.provider.fetchIndex();
			if (this.index == null) {
				return false;
			}
			this.packed = new Object[this.index.capacity];
			this.unpacked = new Object[this.index.capacity][];
		}
		return true;
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V")
	public final void discardUnpacked() {
		if (this.unpacked != null) {
			for (@Pc(11) int i = 0; i < this.unpacked.length; i++) {
				this.unpacked[i] = null;
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZII)[B")
	public final byte[] fetchFileNoDiscard(@OriginalArg(2) int group, @OriginalArg(1) int file) {
		if (!this.isFileValid(group, file)) {
			return null;
		}
		if (this.unpacked[group] == null || this.unpacked[group][file] == null) {
			@Pc(29) boolean success = this.unpackGroup(group, null);
			if (!success) {
				this.fetchGroup(group);
				@Pc(41) boolean success2 = this.unpackGroup(group, null);
				if (!success2) {
					return null;
				}
			}
		}
		return ByteArray.unwrap(this.unpacked[group][file], false);
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)I")
	public final int capacity() {
		return this.isIndexReady() ? this.index.groupCapacities.length : -1;
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(II)V")
	private void fetchGroup(@OriginalArg(1) int group) {
		if (this.discardPacked) {
			this.packed[group] = this.provider.fetchGroup(group);
		} else {
			this.packed[group] = ByteArray.wrap(this.provider.fetchGroup(group));
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)Z")
	private boolean isFileValid(@OriginalArg(2) int group, @OriginalArg(0) int file) {
		if (!this.isIndexReady()) {
			return false;
		} else if (group >= 0 && file >= 0 && group < this.index.groupCapacities.length && file < this.index.groupCapacities[group]) {
			return true;
		} else if (RAISE_EXCEPTIONS) {
			throw new IllegalArgumentException(group + "," + file);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I[II)Z")
	private boolean unpackGroup(@OriginalArg(2) int group, @OriginalArg(1) int[] key) {
		if (!this.isGroupValid(group)) {
			return false;
		} else if (this.packed[group] == null) {
			return false;
		} else {
			@Pc(27) int[] fileIds = this.index.fileIds[group];
			@Pc(33) int groupSize = this.index.groupSizes[group];
			@Pc(35) boolean valid = true;
			if (this.unpacked[group] == null) {
				this.unpacked[group] = new Object[this.index.groupCapacities[group]];
			}
			@Pc(57) Object[] unpacked = this.unpacked[group];
			for (@Pc(59) int i = 0; i < groupSize; i++) {
				@Pc(71) int fileId;
				if (fileIds == null) {
					fileId = i;
				} else {
					fileId = fileIds[i];
				}
				if (unpacked[fileId] == null) {
					valid = false;
					break;
				}
			}
			if (valid) {
				return true;
			}
			@Pc(123) byte[] compressed;
			if (key == null || key[0] == 0 && key[1] == 0 && key[2] == 0 && key[3] == 0) {
				compressed = ByteArray.unwrap(this.packed[group], false);
			} else {
				compressed = ByteArray.unwrap(this.packed[group], true);
				@Pc(128) Buffer buffer = new Buffer(compressed);
				buffer.xteaDecrypt(key, buffer.bytes.length);
			}
			@Pc(151) byte[] uncompressed;
			try {
				uncompressed = Js5Compression.uncompress(compressed);
			} catch (@Pc(153) RuntimeException ex) {
				System.out.println("T3 - " + (key != null) + "," + group + "," + compressed.length + "," + Buffer.crc32(compressed, compressed.length) + "," + Buffer.crc32(compressed, compressed.length - 2) + "," + this.index.groupChecksums[group] + "," + this.index.checksum);
				uncompressed = new byte[] { 0 };
			}
			if (this.discardPacked) {
				this.packed[group] = null;
			}
			if (groupSize > 1) {
				@Pc(226) int position = uncompressed.length;
				@Pc(229) int[] lens = new int[groupSize];
				position--;
				@Pc(236) int stripes = uncompressed[position] & 0xFF;
				@Pc(241) Buffer buffer = new Buffer(uncompressed);
				position -= groupSize * stripes * 4;
				buffer.position = position;
				for (@Pc(254) int i = 0; i < stripes; i++) {
					@Pc(259) int len = 0;
					for (@Pc(261) int j = 0; j < groupSize; j++) {
						if (fileIds != null) {
						}
						len += buffer.readInt();
						lens[j] += len;
					}
				}
				@Pc(289) byte[][] extracted = new byte[groupSize][];
				for (@Pc(291) int i = 0; i < groupSize; i++) {
					extracted[i] = new byte[lens[i]];
					lens[i] = 0;
				}
				buffer.position = position;
				@Pc(313) int off = 0;
				for (@Pc(315) int i = 0; i < stripes; i++) {
					@Pc(320) int len = 0;
					for (@Pc(322) int j = 0; j < groupSize; j++) {
						len += buffer.readInt();
						ArrayUtils.copy(uncompressed, off, extracted[j], lens[j], len);
						off += len;
						lens[j] += len;
					}
				}
				for (@Pc(366) int i = 0; i < groupSize; i++) {
					@Pc(373) int fileId;
					if (fileIds == null) {
						fileId = i;
					} else {
						fileId = fileIds[i];
					}
					if (this.discardUnpacked) {
						unpacked[fileId] = extracted[i];
					} else {
						unpacked[fileId] = ByteArray.wrap(extracted[i]);
					}
				}
			} else {
				@Pc(409) int fileId;
				if (fileIds == null) {
					fileId = 0;
				} else {
					fileId = fileIds[0];
				}
				if (this.discardUnpacked) {
					unpacked[fileId] = uncompressed;
				} else {
					unpacked[fileId] = ByteArray.wrap(uncompressed);
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)Z")
	public final boolean isGroupReady(@OriginalArg(0) int group) {
		if (!this.isGroupValid(group)) {
			return false;
		} else if (this.packed[group] == null) {
			this.fetchGroup(group);
			return this.packed[group] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZZB)V")
	public final void discardNames(@OriginalArg(0) boolean groups) {
		if (!this.isIndexReady()) {
			return;
		}
		this.index.fileNameHashTables = null;
		this.index.fileNameHashes = null;
		if (groups) {
			this.index.groupNameHashes = null;
			this.index.groupNameHashTable = null;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void prefetchGroup(@OriginalArg(1) String group) {
		if (this.isIndexReady()) {
			group = group.toLowerCase();
			@Pc(32) int groupId = this.index.groupNameHashTable.get(StringUtils.hashCode(group));
			this.prefetchGroup(groupId);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
	public final byte[] fetchFile(@OriginalArg(2) String group, @OriginalArg(1) String file) {
		if (!this.isIndexReady()) {
			return null;
		}
		group = group.toLowerCase();
		file = file.toLowerCase();
		@Pc(31) int groupId = this.index.groupNameHashTable.get(StringUtils.hashCode(group));
		if (this.isGroupValid(groupId)) {
			@Pc(50) int fileId = this.index.fileNameHashTables[groupId].get(StringUtils.hashCode(file));
			return this.fetchFile(groupId, fileId);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(II)Z")
	public final boolean isFileReady(@OriginalArg(0) int id) {
		if (!this.isIndexReady()) {
			return false;
		} else if (this.index.groupCapacities.length == 1) {
			return this.isFileReady(0, id);
		} else if (!this.isGroupValid(id)) {
			return false;
		} else if (this.index.groupCapacities[id] == 1) {
			return this.isFileReady(id, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)Z")
	public final boolean fetchAll() {
		if (!this.isIndexReady()) {
			return false;
		}
		@Pc(14) boolean success = true;
		for (@Pc(16) int i = 0; i < this.index.groupIds.length; i++) {
			@Pc(32) int groupId = this.index.groupIds[i];
			if (this.packed[groupId] == null) {
				this.fetchGroup(groupId);
				if (this.packed[groupId] == null) {
					success = false;
				}
			}
		}
		return success;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II[II)[B")
	public final byte[] fetchFile(@OriginalArg(1) int group, @OriginalArg(0) int file, @OriginalArg(2) int[] key) {
		if (!this.isFileValid(group, file)) {
			return null;
		}
		if (this.unpacked[group] == null || this.unpacked[group][file] == null) {
			@Pc(32) boolean success = this.unpackGroup(group, key);
			if (!success) {
				this.fetchGroup(group);
				@Pc(45) boolean success2 = this.unpackGroup(group, key);
				if (!success2) {
					return null;
				}
			}
		}
		@Pc(62) byte[] bytes = ByteArray.unwrap(this.unpacked[group][file], false);
		if (this.discardUnpacked) {
			this.unpacked[group][file] = null;
			if (this.index.groupCapacities[group] == 1) {
				this.unpacked[group] = null;
			}
		}
		return bytes;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public final int getGroupId(@OriginalArg(1) String group) {
		if (this.isIndexReady()) {
			group = group.toLowerCase();
			@Pc(22) int groupId = this.index.groupNameHashTable.get(StringUtils.hashCode(group));
			return this.isGroupValid(groupId) ? groupId : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZI)[I")
	public final int[] getFileIds(@OriginalArg(1) int group) {
		if (!this.isGroupValid(group)) {
			return null;
		}
		@Pc(27) int[] fileIds = this.index.fileIds[group];
		if (fileIds == null) {
			fileIds = new int[this.index.groupSizes[group]];
			@Pc(38) int i = 0;
			while (i < fileIds.length) {
				fileIds[i] = i++;
			}
		}
		return fileIds;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(Ljava/lang/String;I)Z")
	public final boolean isGroupReady(@OriginalArg(0) String group) {
		if (this.isIndexReady()) {
			group = group.toLowerCase();
			@Pc(28) int groupId = this.index.groupNameHashTable.get(StringUtils.hashCode(group));
			return this.isGroupReady(groupId);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "(II)Z")
	private boolean isGroupValid(@OriginalArg(0) int group) {
		if (!this.isIndexReady()) {
			return false;
		} else if (group >= 0 && group < this.index.groupCapacities.length && this.index.groupCapacities[group] != 0) {
			return true;
		} else if (RAISE_EXCEPTIONS) {
			throw new IllegalArgumentException(Integer.toString(group));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(IB)I")
	public final int getGroupId(@OriginalArg(0) int groupNameHash) {
		if (this.isIndexReady()) {
			@Pc(17) int groupId = this.index.groupNameHashTable.get(groupNameHash);
			return this.isGroupValid(groupId) ? groupId : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(ZI)V")
	public final void discardUnpacked(@OriginalArg(1) int group) {
		if (this.isGroupValid(group) && this.unpacked != null) {
			this.unpacked[group] = null;
		}
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(I)I")
	public final int getChecksum() {
		if (!this.isIndexReady()) {
			throw new IllegalStateException("");
		}
		return this.index.checksum;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZI)Z")
	public final boolean isFileReady(@OriginalArg(0) int group, @OriginalArg(2) int file) {
		if (!this.isFileValid(group, file)) {
			return false;
		} else if (this.unpacked[group] != null && this.unpacked[group][file] != null) {
			return true;
		} else if (this.packed[group] == null) {
			this.fetchGroup(group);
			return this.packed[group] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "(II)I")
	public final int getGroupCapacity(@OriginalArg(0) int group) {
		return this.isGroupValid(group) ? this.index.groupCapacities[group] : 0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBI)[B")
	public final byte[] fetchFile(@OriginalArg(0) int group, @OriginalArg(2) int file) {
		return this.fetchFile(group, file, null);
	}
}
