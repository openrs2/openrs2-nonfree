import java.util.zip.CRC32;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Js5ResourceProviderImpl extends Js5ResourceProvider {

	@OriginalMember(owner = "client!wn", name = "B", descriptor = "Ljava/util/zip/CRC32;")
	private static final CRC32 crc32 = new CRC32();

	@OriginalMember(owner = "client!wb", name = "z", descriptor = "[B")
	private byte[] groupStatus;

	@OriginalMember(owner = "client!wb", name = "C", descriptor = "Lclient!fo;")
	private Js5Index index;

	@OriginalMember(owner = "client!wb", name = "Q", descriptor = "Z")
	private boolean prefetchAll;

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
	private int verifiedGroups = 0;

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "Lclient!ic;")
	private final HashTable requests = new HashTable(16);

	@OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
	private int group = 0;

	@OriginalMember(owner = "client!wb", name = "R", descriptor = "Lclient!ll;")
	private final LinkedList prefetchQueue = new LinkedList();

	@OriginalMember(owner = "client!wb", name = "T", descriptor = "J")
	private long orphanCheckTime = 0L;

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "Lclient!fm;")
	private final Cache cache;

	@OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
	private final int archive;

	@OriginalMember(owner = "client!wb", name = "P", descriptor = "Z")
	private boolean verifyAll;

	@OriginalMember(owner = "client!wb", name = "S", descriptor = "Lclient!ll;")
	private LinkedList groupQueue;

	@OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
	private final int expectedVersion;

	@OriginalMember(owner = "client!wb", name = "U", descriptor = "Z")
	private final boolean discardOrphans;

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
	private final int expectedChecksum;

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "Lclient!ja;")
	private final Js5CacheQueue cacheQueue;

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "Lclient!fm;")
	private final Cache masterCache;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "Lclient!en;")
	private final Js5NetQueue netQueue;

	@OriginalMember(owner = "client!wb", name = "F", descriptor = "Lclient!ng;")
	private Js5Request indexRequest;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(ILclient!fm;Lclient!fm;Lclient!en;Lclient!ja;IIZ)V")
	public Js5ResourceProviderImpl(@OriginalArg(0) int archive, @OriginalArg(1) Cache cache, @OriginalArg(2) Cache masterCache, @OriginalArg(3) Js5NetQueue netQueue, @OriginalArg(4) Js5CacheQueue cacheQueue, @OriginalArg(5) int expectedChecksum, @OriginalArg(6) int expectedVersion, @OriginalArg(7) boolean dicardOrphans) {
		this.cache = cache;
		this.archive = archive;
		if (this.cache == null) {
			this.verifyAll = false;
		} else {
			this.verifyAll = true;
			this.groupQueue = new LinkedList();
		}
		this.expectedVersion = expectedVersion;
		this.discardOrphans = dicardOrphans;
		this.expectedChecksum = expectedChecksum;
		this.cacheQueue = cacheQueue;
		this.masterCache = masterCache;
		this.netQueue = netQueue;
		if (this.masterCache != null) {
			this.indexRequest = this.cacheQueue.readSynchronous(this.masterCache, this.archive);
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)I")
	public final int getTotalVerifiedGroups() {
		if (this.index == null) {
			return 0;
		} else if (this.verifyAll) {
			@Pc(27) Node node = this.groupQueue.head();
			return node == null ? 0 : (int) node.key;
		} else {
			return this.index.size;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)Lclient!fo;")
	@Override
	public final Js5Index fetchIndex() {
		if (this.index != null) {
			return this.index;
		}
		if (this.indexRequest == null) {
			if (this.netQueue.isUrgentRequestQueueFull()) {
				return null;
			}
			this.indexRequest = this.netQueue.read(255, this.archive, true, (byte) 0);
		}
		if (this.indexRequest.incomplete) {
			return null;
		}
		@Pc(53) byte[] data = this.indexRequest.getData();
		if (this.indexRequest instanceof Js5CacheRequest) {
			try {
				if (data == null) {
					throw new RuntimeException();
				}
				this.index = new Js5Index(data, this.expectedChecksum);
				if (this.expectedVersion != this.index.version) {
					throw new RuntimeException();
				}
			} catch (@Pc(149) RuntimeException ex) {
				this.index = null;
				if (this.netQueue.isUrgentRequestQueueFull()) {
					this.indexRequest = null;
				} else {
					this.indexRequest = this.netQueue.read(255, this.archive, true, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (data == null) {
					throw new RuntimeException();
				}
				this.index = new Js5Index(data, this.expectedChecksum);
			} catch (@Pc(74) RuntimeException ex) {
				this.netQueue.rekey();
				this.index = null;
				if (this.netQueue.isUrgentRequestQueueFull()) {
					this.indexRequest = null;
				} else {
					this.indexRequest = this.netQueue.read(255, this.archive, true, (byte) 0);
				}
				return null;
			}
			if (this.masterCache != null) {
				this.cacheQueue.write(this.masterCache, this.archive, data);
			}
		}
		if (this.cache != null) {
			this.verifiedGroups = 0;
			this.groupStatus = new byte[this.index.capacity];
		}
		this.indexRequest = null;
		return this.index;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)I")
	public final int getIndexPercentageComplete() {
		if (this.fetchIndex() != null) {
			return 100;
		} else if (this.indexRequest == null) {
			return 0;
		} else {
			return this.indexRequest.getPercentageComplete();
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)V")
	@Override
	public final void prefetchGroup(@OriginalArg(0) int group) {
		if (this.cache == null) {
			return;
		}
		for (@Pc(22) Node node = this.prefetchQueue.head(); node != null; node = this.prefetchQueue.next()) {
			if (node.key == (long) group) {
				return;
			}
		}
		@Pc(48) Node node = new Node();
		node.key = group;
		this.prefetchQueue.addTail(node);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V")
	public final void processPrefetchQueue() {
		if (this.groupQueue == null || this.fetchIndex() == null) {
			return;
		}
		for (@Pc(22) Node node = this.prefetchQueue.head(); node != null; node = this.prefetchQueue.next()) {
			@Pc(32) int group = (int) node.key;
			if (group < 0 || group >= this.index.capacity || this.index.groupSizes[group] == 0) {
				node.unlink();
			} else {
				if (this.groupStatus[group] == 0) {
					this.fetchGroupInner(group, 1);
				}
				if (this.groupStatus[group] == -1) {
					this.fetchGroupInner(group, 2);
				}
				if (this.groupStatus[group] == 1) {
					node.unlink();
				}
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)I")
	public final int getVerifiedGroups() {
		return this.verifiedGroups;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V")
	public final void prefetchAll() {
		if (this.cache != null) {
			this.prefetchAll = true;
			if (this.groupQueue == null) {
				this.groupQueue = new LinkedList();
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)[B")
	@Override
	public final byte[] fetchGroup(@OriginalArg(1) int group) {
		@Pc(9) Js5Request request = this.fetchGroupInner(group, 0);
		if (request == null) {
			return null;
		} else {
			@Pc(25) byte[] data = request.getData();
			request.unlink();
			return data;
		}
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)I")
	public final int getIndexSize() {
		return this.index == null ? 0 : this.index.size;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)I")
	@Override
	public final int getPercentageComplete(@OriginalArg(0) int group) {
		@Pc(9) Js5Request request = (Js5Request) this.requests.get(group);
		return request == null ? 0 : request.getPercentageComplete();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)Lclient!ng;")
	private Js5Request fetchGroupInner(@OriginalArg(1) int group, @OriginalArg(2) int type) {
		@Pc(13) Js5Request request = (Js5Request) this.requests.get(group);
		if (request != null && type == 0 && !request.urgent && request.incomplete) {
			request.unlink();
			request = null;
		}
		if (request == null) {
			if (type == 0) {
				if (this.cache == null || this.groupStatus[group] == -1) {
					if (this.netQueue.isUrgentRequestQueueFull()) {
						return null;
					}
					request = this.netQueue.read(this.archive, group, true, (byte) 2);
				} else {
					request = this.cacheQueue.readSynchronous(this.cache, group);
				}
			} else if (type == 1) {
				if (this.cache == null) {
					throw new RuntimeException();
				}
				request = this.cacheQueue.read(this.cache, group);
			} else if (type == 2) {
				if (this.cache == null) {
					throw new RuntimeException();
				}
				if (this.groupStatus[group] != -1) {
					throw new RuntimeException();
				}
				if (this.netQueue.isPrefetchRequestQueueFull()) {
					return null;
				}
				request = this.netQueue.read(this.archive, group, false, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.requests.put(group, request);
		}
		if (request.incomplete) {
			return null;
		}
		@Pc(169) byte[] data = request.getData();
		if (!(request instanceof Js5CacheRequest)) {
			try {
				if (data == null || data.length <= 2) {
					throw new RuntimeException();
				}
				crc32.reset();
				crc32.update(data, 0, data.length - 2);
				@Pc(197) int checksum = (int) crc32.getValue();
				if (this.index.groupChecksums[group] != checksum) {
					throw new RuntimeException();
				}
				this.netQueue.errors = 0;
				this.netQueue.response = 0;
			} catch (@Pc(219) RuntimeException ex) {
				this.netQueue.rekey();
				request.unlink();
				if (request.urgent && !this.netQueue.isUrgentRequestQueueFull()) {
					@Pc(244) Js5NetRequest newRequest = this.netQueue.read(this.archive, group, true, (byte) 2);
					this.requests.put(group, newRequest);
				}
				return null;
			}
			data[data.length - 2] = (byte) (this.index.groupVersions[group] >>> 8);
			data[data.length - 1] = (byte) this.index.groupVersions[group];
			if (this.cache != null) {
				this.cacheQueue.write(this.cache, group, data);
				if (this.groupStatus[group] != 1) {
					this.verifiedGroups++;
					this.groupStatus[group] = 1;
				}
			}
			if (!request.urgent) {
				request.unlink();
			}
			return request;
		}
		try {
			if (data == null || data.length <= 2) {
				throw new RuntimeException();
			}
			crc32.reset();
			crc32.update(data, 0, data.length - 2);
			@Pc(346) int checksum = (int) crc32.getValue();
			if (this.index.groupChecksums[group] != checksum) {
				throw new RuntimeException();
			}
			@Pc(378) int truncatedVersion = (data[data.length - 1] & 0xFF) + ((data[data.length - 2] & 0xFF) << 8);
			if ((this.index.groupVersions[group] & 0xFFFF) != truncatedVersion) {
				throw new RuntimeException();
			}
			if (this.groupStatus[group] != 1) {
				if (this.groupStatus[group] != 0) {
				}
				this.verifiedGroups++;
				this.groupStatus[group] = 1;
			}
			if (!request.urgent) {
				request.unlink();
			}
			return request;
		} catch (@Pc(428) Exception ex) {
			this.groupStatus[group] = -1;
			request.unlink();
			if (request.urgent && !this.netQueue.isUrgentRequestQueueFull()) {
				@Pc(455) Js5NetRequest newRequest = this.netQueue.read(this.archive, group, true, (byte) 2);
				this.requests.put(group, newRequest);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)V")
	public final void tick() {
		if (this.groupQueue != null) {
			if (this.fetchIndex() == null) {
				return;
			}
			if (this.verifyAll) {
				@Pc(175) boolean done = true;
				for (@Pc(182) Node node = this.groupQueue.head(); node != null; node = this.groupQueue.next()) {
					@Pc(188) int group = (int) node.key;
					if (this.groupStatus[group] == 0) {
						this.fetchGroupInner(group, 1);
					}
					if (this.groupStatus[group] == 0) {
						done = false;
					} else {
						node.unlink();
					}
				}
				while (this.group < this.index.groupSizes.length) {
					if (this.index.groupSizes[this.group] == 0) {
						this.group++;
					} else {
						if (this.cacheQueue.size >= 250) {
							done = false;
							break;
						}
						if (this.groupStatus[this.group] == 0) {
							this.fetchGroupInner(this.group, 1);
						}
						if (this.groupStatus[this.group] == 0) {
							done = false;
							@Pc(290) Node node = new Node();
							node.key = this.group;
							this.groupQueue.addTail(node);
						}
						this.group++;
					}
				}
				if (done) {
					this.verifyAll = false;
					this.group = 0;
				}
			} else if (this.prefetchAll) {
				@Pc(31) boolean done = true;
				for (@Pc(36) Node node = this.groupQueue.head(); node != null; node = this.groupQueue.next()) {
					@Pc(42) int group = (int) node.key;
					if (this.groupStatus[group] != 1) {
						this.fetchGroupInner(group, 2);
					}
					if (this.groupStatus[group] == 1) {
						node.unlink();
					} else {
						done = false;
					}
				}
				while (this.group < this.index.groupSizes.length) {
					if (this.index.groupSizes[this.group] == 0) {
						this.group++;
					} else {
						if (this.netQueue.isPrefetchRequestQueueFull()) {
							done = false;
							break;
						}
						if (this.groupStatus[this.group] != 1) {
							this.fetchGroupInner(this.group, 2);
						}
						if (this.groupStatus[this.group] != 1) {
							done = false;
							@Pc(145) Node node = new Node();
							node.key = this.group;
							this.groupQueue.addTail(node);
						}
						this.group++;
					}
				}
				if (done) {
					this.prefetchAll = false;
					this.group = 0;
				}
			} else {
				this.groupQueue = null;
			}
		}
		if (!this.discardOrphans || this.orphanCheckTime > MonotonicClock.currentTimeMillis()) {
			return;
		}
		for (@Pc(335) Js5Request request = (Js5Request) this.requests.head(); request != null; request = (Js5Request) this.requests.next()) {
			if (!request.incomplete) {
				if (request.orphan) {
					if (!request.urgent) {
						throw new RuntimeException();
					}
					request.unlink();
				} else {
					request.orphan = true;
				}
			}
		}
		this.orphanCheckTime = MonotonicClock.currentTimeMillis() + 1000L;
	}
}
