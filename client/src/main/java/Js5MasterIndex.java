import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Js5MasterIndex {

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "Lclient!fd;")
	private Buffer buffer;

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "[Lclient!wb;")
	private Js5CachedResourceProvider[] resourceProviders;

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "Lclient!en;")
	private final Js5NetQueue netQueue;

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "Lclient!ja;")
	private final Js5CacheQueue cacheQueue;

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "Lclient!ul;")
	private Js5NetRequest request;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lclient!en;Lclient!ja;)V")
	public Js5MasterIndex(@OriginalArg(0) Js5NetQueue netQueue, @OriginalArg(1) Js5CacheQueue cacheQueue) {
		this.netQueue = netQueue;
		this.cacheQueue = cacheQueue;
		if (!this.netQueue.isUrgentRequestQueueFull()) {
			this.request = this.netQueue.read(255, 255, true, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V")
	public final void loop() {
		if (this.resourceProviders == null) {
			return;
		}
		for (@Pc(12) int i = 0; i < this.resourceProviders.length; i++) {
			if (this.resourceProviders[i] != null) {
				this.resourceProviders[i].processPrefetchQueue();
			}
		}
		for (@Pc(43) int i = 0; i < this.resourceProviders.length; i++) {
			if (this.resourceProviders[i] != null) {
				this.resourceProviders[i].loop();
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)Z")
	public final boolean isReady() {
		if (this.buffer != null) {
			return true;
		}
		if (this.request == null) {
			if (this.netQueue.isUrgentRequestQueueFull()) {
				return false;
			}
			this.request = this.netQueue.read(255, 255, true, (byte) 0);
		}
		if (this.request.incomplete) {
			return false;
		} else {
			this.buffer = new Buffer(this.request.getData());
			this.resourceProviders = new Js5CachedResourceProvider[(this.buffer.bytes.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!fm;BLclient!fm;ZI)Lclient!wb;")
	private Js5CachedResourceProvider getResourceProviderInternal(@OriginalArg(0) Cache masterCache, @OriginalArg(2) Cache cache, @OriginalArg(4) int archive) {
		if (this.buffer == null) {
			throw new RuntimeException();
		}
		this.buffer.position = archive * 8 + 5;
		if (this.buffer.bytes.length <= this.buffer.position) {
			throw new RuntimeException();
		} else if (this.resourceProviders[archive] == null) {
			@Pc(48) int checksum = this.buffer.readInt();
			@Pc(55) int version = this.buffer.readInt();
			@Pc(76) Js5CachedResourceProvider provider = new Js5CachedResourceProvider(archive, cache, masterCache, this.netQueue, this.cacheQueue, checksum, version, true);
			this.resourceProviders[archive] = provider;
			return provider;
		} else {
			return this.resourceProviders[archive];
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!fm;Lclient!fm;IB)Lclient!wb;")
	public final Js5CachedResourceProvider getResourceProvider(@OriginalArg(0) Cache masterCache, @OriginalArg(1) Cache cache, @OriginalArg(2) int archive) {
		return this.getResourceProviderInternal(masterCache, cache, archive);
	}
}
