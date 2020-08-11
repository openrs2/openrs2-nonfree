import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Js5CacheQueue implements Runnable {

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "Lclient!uk;")
	private final SecondaryLinkedList queue = new SecondaryLinkedList();

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "Z")
	private boolean stop = false;

	@OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
	public int size = 0;

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "Ljava/lang/Thread;")
	private Thread thread;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
	public Js5CacheQueue() {
		@Pc(20) PrivilegedRequest request = GameShell.signLink.startThread(this, 5);
		while (request.status == 0) {
			ThreadUtils.sleep(10L);
		}
		if (request.status == 2) {
			throw new RuntimeException();
		}
		this.thread = (Thread) request.result;
	}

	@OriginalMember(owner = "client!ja", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		while (!this.stop) {
			@Pc(15) Js5CacheRequest request;
			synchronized (this.queue) {
				request = (Js5CacheRequest) this.queue.removeHead();
				if (request == null) {
					try {
						this.queue.wait();
					} catch (@Pc(30) InterruptedException ex) {
					}
					continue;
				}
				this.size--;
			}
			try {
				if (request.type == 2) {
					request.cache.write((int) request.secondaryKey, request.data, request.data.length);
				} else if (request.type == 3) {
					request.data = request.cache.read((int) request.secondaryKey);
				}
			} catch (@Pc(76) Exception ex) {
				TracingException.report(ex, null);
			}
			request.incomplete = false;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILclient!fm;I)Lclient!al;")
	public final Js5CacheRequest read(@OriginalArg(1) Cache cache, @OriginalArg(2) int group) {
		@Pc(7) Js5CacheRequest request = new Js5CacheRequest();
		request.type = 3;
		request.cache = cache;
		request.urgent = false;
		request.secondaryKey = group;
		this.enqueue(request);
		return request;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BLclient!fm;[BI)Lclient!al;")
	public final Js5CacheRequest write(@OriginalArg(1) Cache cache, @OriginalArg(3) int group, @OriginalArg(2) byte[] data) {
		@Pc(15) Js5CacheRequest request = new Js5CacheRequest();
		request.secondaryKey = group;
		request.cache = cache;
		request.urgent = false;
		request.type = 2;
		request.data = data;
		this.enqueue(request);
		return request;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
	public final void stop() {
		this.stop = true;
		synchronized (this.queue) {
			this.queue.notifyAll();
		}
		try {
			this.thread.join();
		} catch (@Pc(27) InterruptedException ex) {
		}
		this.thread = null;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILclient!al;)V")
	private void enqueue(@OriginalArg(1) Js5CacheRequest request) {
		synchronized (this.queue) {
			this.queue.addTail(request);
			this.size++;
			this.queue.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BLclient!fm;I)Lclient!al;")
	public final Js5CacheRequest readSynchronous(@OriginalArg(1) Cache cache, @OriginalArg(2) int group) {
		@Pc(5) Js5CacheRequest request = new Js5CacheRequest();
		request.type = 1;
		synchronized (this.queue) {
			@Pc(23) Js5CacheRequest other = (Js5CacheRequest) this.queue.head();
			while (true) {
				if (other == null) {
					break;
				}
				if (other.secondaryKey == (long) group && cache == other.cache && other.type == 2) {
					request.data = other.data;
					request.incomplete = false;
					return request;
				}
				other = (Js5CacheRequest) this.queue.next();
			}
		}
		request.data = cache.read(group);
		request.incomplete = false;
		request.urgent = true;
		return request;
	}
}
