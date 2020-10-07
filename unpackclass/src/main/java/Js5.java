import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!aa")
public abstract class Js5 {

	@OriginalMember(owner = "unpackclass!aa", name = "q", descriptor = "Z")
	private static boolean RAISE_EXCEPTIONS;

	@OriginalMember(owner = "unpackclass!aa", name = "r", descriptor = "I")
	private static int MAX_LENGTH;

	@OriginalMember(owner = "unpackclass!aa", name = "m", descriptor = "Lunpackclass!k;")
	private static final GzipDecompressor GZIP_DECOMPRESSOR = new GzipDecompressor();

	@OriginalMember(owner = "unpackclass!aa", name = "a", descriptor = "I")
	protected int size;

	@OriginalMember(owner = "unpackclass!aa", name = "b", descriptor = "[I")
	protected int[] groupIds;

	@OriginalMember(owner = "unpackclass!aa", name = "c", descriptor = "[I")
	private int[] groupNameHashes;

	@OriginalMember(owner = "unpackclass!aa", name = "d", descriptor = "[I")
	private int[] groupChecksums;

	@OriginalMember(owner = "unpackclass!aa", name = "e", descriptor = "[I")
	private int[] groupVersions;

	@OriginalMember(owner = "unpackclass!aa", name = "f", descriptor = "[I")
	private int[] groupSizes;

	@OriginalMember(owner = "unpackclass!aa", name = "g", descriptor = "[[I")
	private int[][] fileIds;

	@OriginalMember(owner = "unpackclass!aa", name = "h", descriptor = "[[I")
	private int[][] fileNameHashes;

	@OriginalMember(owner = "unpackclass!aa", name = "i", descriptor = "[Lunpackclass!i;")
	private IntHashTable[] fileNameHashTables;

	@OriginalMember(owner = "unpackclass!aa", name = "j", descriptor = "[Ljava/lang/Object;")
	protected Object[] packed;

	@OriginalMember(owner = "unpackclass!aa", name = "k", descriptor = "[I")
	private int[] groupCapacities;

	@OriginalMember(owner = "unpackclass!aa", name = "l", descriptor = "[[Ljava/lang/Object;")
	private Object[][] unpacked;

	@OriginalMember(owner = "unpackclass!aa", name = "n", descriptor = "I")
	private int checksum;

	@OriginalMember(owner = "unpackclass!aa", name = "o", descriptor = "Z")
	protected final boolean discardPacked;

	@OriginalMember(owner = "unpackclass!aa", name = "p", descriptor = "Z")
	private final boolean discardUnpacked;

	@OriginalMember(owner = "unpackclass!aa", name = "b", descriptor = "([B)[B")
	private static byte[] uncompress(@OriginalArg(0) byte[] in) {
		@Pc(4) Buffer buffer = new Buffer(in);
		@Pc(7) int type = buffer.readUnsignedByte();
		@Pc(10) int len = buffer.readInt();
		if (len < 0 || MAX_LENGTH != 0 && len > MAX_LENGTH) {
			throw new RuntimeException();
		} else if (type == 0) {
			@Pc(26) byte[] out = new byte[len];
			buffer.readBytes(out, len);
			return out;
		} else {
			@Pc(36) int uncompressedLen = buffer.readInt();
			if (uncompressedLen < 0 || MAX_LENGTH != 0 && uncompressedLen > MAX_LENGTH) {
				throw new RuntimeException();
			}
			@Pc(50) byte[] out = new byte[uncompressedLen];
			if (type == 1) {
				Bzip2Decompressor.bunzip2(out, uncompressedLen, in, len);
			} else {
				GZIP_DECOMPRESSOR.gunzip(buffer, out);
			}
			return out;
		}
	}

	@OriginalMember(owner = "unpackclass!aa", name = "<init>", descriptor = "(ZZ)V")
	protected Js5(@OriginalArg(0) boolean discardPacked, @OriginalArg(1) boolean discardUnpacked) {
		this.discardPacked = discardPacked;
		this.discardUnpacked = discardUnpacked;
	}

	@OriginalMember(owner = "unpackclass!aa", name = "a", descriptor = "([B)V")
	protected final void decode(@OriginalArg(0) byte[] bytes) {
		this.checksum = Buffer.crc32(bytes, bytes.length);
		@Pc(13) Buffer buffer = new Buffer(uncompress(bytes));
		@Pc(16) int protocol = buffer.readUnsignedByte();
		if (protocol != 5 && protocol != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + protocol);
		}
		if (protocol >= 6) {
			buffer.readInt();
		}
		@Pc(42) int flags = buffer.readUnsignedByte();
		this.size = buffer.readUnsignedShort();
		@Pc(48) int prevGroupId = 0;
		@Pc(50) int maxGroupId = -1;
		this.groupIds = new int[this.size];
		for (@Pc(57) int i = 0; i < this.size; i++) {
			this.groupIds[i] = prevGroupId += buffer.readUnsignedShort();
			if (this.groupIds[i] > maxGroupId) {
				maxGroupId = this.groupIds[i];
			}
		}
		this.groupChecksums = new int[maxGroupId + 1];
		this.groupVersions = new int[maxGroupId + 1];
		this.groupSizes = new int[maxGroupId + 1];
		this.fileIds = new int[maxGroupId + 1][];
		this.packed = new Object[maxGroupId + 1];
		this.groupCapacities = new int[maxGroupId + 1];
		this.unpacked = new Object[maxGroupId + 1][];
		if (flags != 0) {
			this.groupNameHashes = new int[maxGroupId + 1];
			for (@Pc(142) int groupId = 0; groupId < maxGroupId + 1; groupId++) {
				this.groupNameHashes[groupId] = -1;
			}
			for (@Pc(157) int i = 0; i < this.size; i++) {
				this.groupNameHashes[this.groupIds[i]] = buffer.readInt();
			}
			new IntHashTable(this.groupNameHashes);
		}
		for (@Pc(179) int i = 0; i < this.size; i++) {
			this.groupChecksums[this.groupIds[i]] = buffer.readInt();
		}
		for (@Pc(197) int i = 0; i < this.size; i++) {
			this.groupVersions[this.groupIds[i]] = buffer.readInt();
		}
		for (@Pc(215) int i = 0; i < this.size; i++) {
			this.groupSizes[this.groupIds[i]] = buffer.readUnsignedShort();
		}
		for (@Pc(233) int i = 0; i < this.size; i++) {
			@Pc(240) int groupId = this.groupIds[i];
			@Pc(245) int groupSize = this.groupSizes[groupId];
			@Pc(247) int prevFileId = 0;
			@Pc(249) int maxFileId = -1;
			this.fileIds[groupId] = new int[groupSize];
			for (@Pc(257) int j = 0; j < groupSize; j++) {
				@Pc(273) int fileId = this.fileIds[groupId][j] = prevFileId += buffer.readUnsignedShort();
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
		for (@Pc(320) int i = 0; i < this.size; i++) {
			@Pc(327) int groupId = this.groupIds[i];
			@Pc(332) int groupSize = this.groupSizes[groupId];
			this.fileNameHashes[groupId] = new int[this.groupCapacities[groupId]];
			for (@Pc(343) int fileId = 0; fileId < this.groupCapacities[groupId]; fileId++) {
				this.fileNameHashes[groupId][fileId] = -1;
			}
			for (@Pc(361) int j = 0; j < groupSize; j++) {
				@Pc(375) int fileId;
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

	@OriginalMember(owner = "unpackclass!aa", name = "a", descriptor = "(I)Z")
	private boolean isGroupValid(@OriginalArg(0) int group) {
		if (group >= 0 && group < this.groupCapacities.length && this.groupCapacities[group] != 0) {
			return true;
		} else if (RAISE_EXCEPTIONS) {
			throw new IllegalArgumentException(Integer.toString(group));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "unpackclass!aa", name = "a", descriptor = "(II)Z")
	private boolean isFileValid(@OriginalArg(0) int group, @OriginalArg(1) int file) {
		if (group >= 0 && file >= 0 && group < this.groupCapacities.length && file < this.groupCapacities[group]) {
			return true;
		} else if (RAISE_EXCEPTIONS) {
			throw new IllegalArgumentException(group + "," + file);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "unpackclass!aa", name = "b", descriptor = "(II)[B")
	public final byte[] fetchFile(@OriginalArg(0) int group, @OriginalArg(1) int file) {
		return this.fetchFile(group, file, null);
	}

	@OriginalMember(owner = "unpackclass!aa", name = "a", descriptor = "(II[I)[B")
	private byte[] fetchFile(@OriginalArg(0) int group, @OriginalArg(1) int file, @OriginalArg(2) int[] key) {
		if (!this.isFileValid(group, file)) {
			return null;
		}
		if (this.unpacked[group] == null || this.unpacked[group][file] == null) {
			@Pc(23) boolean success = this.unpackGroup(group, key);
			if (!success) {
				this.fetchGroup(group);
				@Pc(33) boolean success2 = this.unpackGroup(group, key);
				if (!success2) {
					return null;
				}
			}
		}
		@Pc(46) byte[] bytes = ByteArray.unwrap(this.unpacked[group][file], false);
		if (this.discardUnpacked) {
			this.unpacked[group][file] = null;
			if (this.groupCapacities[group] == 1) {
				this.unpacked[group] = null;
			}
		}
		return bytes;
	}

	@OriginalMember(owner = "unpackclass!aa", name = "b", descriptor = "(I)V")
	private void fetchGroup(@OriginalArg(0) int group) {
	}

	@OriginalMember(owner = "unpackclass!aa", name = "c", descriptor = "(I)I")
	public final int getGroupCapacity() {
		return this.isGroupValid(0) ? this.groupCapacities[0] : 0;
	}

	@OriginalMember(owner = "unpackclass!aa", name = "a", descriptor = "(I[I)Z")
	private boolean unpackGroup(@OriginalArg(0) int group, @OriginalArg(1) int[] key) {
		if (!this.isGroupValid(group)) {
			return false;
		} else if (this.packed[group] == null) {
			return false;
		} else {
			@Pc(19) int groupSize = this.groupSizes[group];
			@Pc(24) int[] fileIds = this.fileIds[group];
			if (this.unpacked[group] == null) {
				this.unpacked[group] = new Object[this.groupCapacities[group]];
			}
			@Pc(43) Object[] unpacked = this.unpacked[group];
			@Pc(45) boolean valid = true;
			for (@Pc(47) int i = 0; i < groupSize; i++) {
				@Pc(53) int fileId;
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
			@Pc(100) byte[] compressed;
			if (key == null || key[0] == 0 && key[1] == 0 && key[2] == 0 && key[3] == 0) {
				compressed = ByteArray.unwrap(this.packed[group], false);
			} else {
				compressed = ByteArray.unwrap(this.packed[group], true);
				@Pc(105) Buffer buffer = new Buffer(compressed);
				buffer.xteaDecrypt(key, buffer.bytes.length);
			}
			@Pc(124) byte[] uncompressed;
			try {
				uncompressed = uncompress(compressed);
			} catch (@Pc(126) RuntimeException ex) {
				throw TracingException.wrap(ex, "T3 - " + (key != null) + "," + group + "," + compressed.length + "," + Buffer.crc32(compressed, compressed.length) + "," + Buffer.crc32(compressed, compressed.length - 2) + "," + this.groupChecksums[group] + "," + this.checksum);
			}
			if (this.discardPacked) {
				this.packed[group] = null;
			}
			if (groupSize > 1) {
				@Pc(191) int position = uncompressed.length;
				position--;
				@Pc(198) int stripes = uncompressed[position] & 0xFF;
				position -= groupSize * stripes * 4;
				@Pc(211) Buffer buffer = new Buffer(uncompressed);
				@Pc(214) int[] lens = new int[groupSize];
				buffer.position = position;
				for (@Pc(219) int i = 0; i < stripes; i++) {
					@Pc(223) int len = 0;
					for (@Pc(225) int j = 0; j < groupSize; j++) {
						len += buffer.readInt();
						lens[j] += len;
					}
				}
				@Pc(250) byte[][] extracted = new byte[groupSize][];
				for (@Pc(252) int i = 0; i < groupSize; i++) {
					extracted[i] = new byte[lens[i]];
					lens[i] = 0;
				}
				buffer.position = position;
				@Pc(274) int off = 0;
				for (@Pc(276) int i = 0; i < stripes; i++) {
					@Pc(280) int len = 0;
					for (@Pc(282) int j = 0; j < groupSize; j++) {
						len += buffer.readInt();
						ArrayUtils.copy(uncompressed, off, extracted[j], lens[j], len);
						lens[j] += len;
						off += len;
					}
				}
				for (@Pc(320) int i = 0; i < groupSize; i++) {
					@Pc(326) int fileId;
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
				@Pc(361) int fileId;
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
}
