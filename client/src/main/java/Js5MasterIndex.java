import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Js5MasterIndex {

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "Lclient!fd;")
	private Buffer buffer;

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "[Lclient!wb;")
	private Class62_Sub1[] aClass62_Sub1Array1;

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
	public final void method2706() {
		if (this.aClass62_Sub1Array1 == null) {
			return;
		}
		for (@Pc(12) int i = 0; i < this.aClass62_Sub1Array1.length; i++) {
			if (this.aClass62_Sub1Array1[i] != null) {
				this.aClass62_Sub1Array1[i].method4666();
			}
		}
		for (@Pc(43) int i = 0; i < this.aClass62_Sub1Array1.length; i++) {
			if (this.aClass62_Sub1Array1[i] != null) {
				this.aClass62_Sub1Array1[i].method4673();
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
			this.aClass62_Sub1Array1 = new Class62_Sub1[(this.buffer.bytes.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!fm;BLclient!fm;ZI)Lclient!wb;")
	private Class62_Sub1 method2712(@OriginalArg(0) Cache arg0, @OriginalArg(2) Cache arg1, @OriginalArg(4) int archive) {
		if (this.buffer == null) {
			throw new RuntimeException();
		}
		this.buffer.position = archive * 8 + 5;
		if (this.buffer.bytes.length <= this.buffer.position) {
			throw new RuntimeException();
		} else if (this.aClass62_Sub1Array1[archive] == null) {
			@Pc(48) int checksum = this.buffer.readInt();
			@Pc(55) int version = this.buffer.readInt();
			@Pc(76) Class62_Sub1 local76 = new Class62_Sub1(archive, arg1, arg0, this.netQueue, this.cacheQueue, checksum, version, true);
			this.aClass62_Sub1Array1[archive] = local76;
			return local76;
		} else {
			return this.aClass62_Sub1Array1[archive];
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!fm;Lclient!fm;IB)Lclient!wb;")
	public final Class62_Sub1 method2714(@OriginalArg(0) Cache arg0, @OriginalArg(1) Cache arg1, @OriginalArg(2) int archive) {
		return this.method2712(arg0, arg1, archive);
	}
}
