import java.io.IOException;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Js5NetQueue {

	@OriginalMember(owner = "client!en", name = "z", descriptor = "I")
	private int latency;

	@OriginalMember(owner = "client!en", name = "B", descriptor = "J")
	private long previousLoop;

	@OriginalMember(owner = "client!en", name = "C", descriptor = "Lclient!eo;")
	private BufferedSocket socket;

	@OriginalMember(owner = "client!en", name = "H", descriptor = "Lclient!ul;")
	private Js5NetRequest current;

	@OriginalMember(owner = "client!en", name = "t", descriptor = "Lclient!uk;")
	private final SecondaryLinkedList pendingUrgentRequests = new SecondaryLinkedList();

	@OriginalMember(owner = "client!en", name = "w", descriptor = "Lclient!uk;")
	private final SecondaryLinkedList inFlightUrgentRequests = new SecondaryLinkedList();

	@OriginalMember(owner = "client!en", name = "x", descriptor = "Lclient!uk;")
	private final SecondaryLinkedList pendingPrefetchRequests = new SecondaryLinkedList();

	@OriginalMember(owner = "client!en", name = "y", descriptor = "Lclient!uk;")
	private final SecondaryLinkedList inFlightPrefetchRequests = new SecondaryLinkedList();

	@OriginalMember(owner = "client!en", name = "A", descriptor = "Lclient!fd;")
	private final Buffer outBuffer = new Buffer(4);

	@OriginalMember(owner = "client!en", name = "E", descriptor = "I")
	public volatile int errors = 0;

	@OriginalMember(owner = "client!en", name = "F", descriptor = "I")
	public volatile int response = 0;

	@OriginalMember(owner = "client!en", name = "G", descriptor = "B")
	private byte encryptionKey = 0;

	@OriginalMember(owner = "client!en", name = "D", descriptor = "Lclient!fd;")
	private final Buffer inBuffer = new Buffer(8);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)I")
	private int getPrefetchRequestCount() {
		return this.pendingPrefetchRequests.size() + this.inFlightPrefetchRequests.size();
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V")
	public final void closeServer() {
		if (this.socket == null) {
			return;
		}
		try {
			this.outBuffer.position = 0;
			this.outBuffer.writeByte(7);
			this.outBuffer.writeMedium(0);
			this.socket.write(this.outBuffer.bytes, 4);
		} catch (@Pc(36) IOException ex) {
			try {
				this.socket.close();
			} catch (@Pc(42) Exception closeEx) {
			}
			this.socket = null;
			this.errors++;
			this.response = -2;
		}
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(I)Z")
	public final boolean isUrgentRequestQueueFull() {
		return this.getUrgentRequestCount() >= 20;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V")
	public final void breakConnection() {
		if (this.socket != null) {
			this.socket.breakConnection();
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILclient!eo;Z)V")
	public final void start(@OriginalArg(1) BufferedSocket socket, @OriginalArg(2) boolean loggedIn) {
		if (this.socket != null) {
			try {
				this.socket.close();
			} catch (@Pc(15) Exception ex) {
			}
			this.socket = null;
		}
		this.socket = socket;
		this.writeConnected();
		this.writeLoggedIn(loggedIn);
		this.current = null;
		this.inBuffer.position = 0;
		while (true) {
			@Pc(41) Js5NetRequest urgentRequest = (Js5NetRequest) this.inFlightUrgentRequests.removeHead();
			if (urgentRequest == null) {
				while (true) {
					@Pc(64) Js5NetRequest prefetchRequest = (Js5NetRequest) this.inFlightPrefetchRequests.removeHead();
					if (prefetchRequest == null) {
						if (this.encryptionKey != 0) {
							try {
								this.outBuffer.position = 0;
								this.outBuffer.writeByte(4);
								this.outBuffer.writeByte(this.encryptionKey);
								this.outBuffer.writeShort(0);
								this.socket.write(this.outBuffer.bytes, 4);
							} catch (@Pc(113) IOException ex) {
								try {
									this.socket.close();
								} catch (@Pc(119) Exception closeEx) {
								}
								this.socket = null;
								this.errors++;
								this.response = -2;
							}
						}
						this.latency = 0;
						this.previousLoop = MonotonicClock.currentTimeMillis();
						return;
					}
					this.pendingPrefetchRequests.addTail(prefetchRequest);
				}
			}
			this.pendingUrgentRequests.addTail(urgentRequest);
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(BIZII)Lclient!ul;")
	public final Js5NetRequest read(@OriginalArg(1) int archive, @OriginalArg(4) int group, @OriginalArg(2) boolean urgent, @OriginalArg(0) byte trailerLen) {
		@Pc(16) long key = group + (archive << 16);
		@Pc(20) Js5NetRequest request = new Js5NetRequest();
		request.trailerLen = trailerLen;
		request.urgent = urgent;
		request.secondaryKey = key;
		if (urgent) {
			if (this.getUrgentRequestCount() >= 20) {
				throw new RuntimeException();
			}
			this.pendingUrgentRequests.addTail(request);
		} else if (this.getPrefetchRequestCount() < 20) {
			this.pendingPrefetchRequests.addTail(request);
		} else {
			throw new RuntimeException();
		}
		return request;
	}

	@OriginalMember(owner = "client!en", name = "f", descriptor = "(I)V")
	public final void quit() {
		if (this.socket != null) {
			this.socket.close();
		}
	}

	@OriginalMember(owner = "client!en", name = "g", descriptor = "(I)V")
	public final void rekey() {
		try {
			this.socket.close();
		} catch (@Pc(9) Exception ex) {
		}
		this.socket = null;
		this.encryptionKey = (byte) (Math.random() * 255.0D + 1.0D);
		this.response = -1;
		this.errors++;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)I")
	public final int getUrgentRequestCount() {
		return this.pendingUrgentRequests.size() + this.inFlightUrgentRequests.size();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(BZ)V")
	public final void writeLoggedIn(@OriginalArg(1) boolean loggedIn) {
		if (this.socket == null) {
			return;
		}
		try {
			this.outBuffer.position = 0;
			this.outBuffer.writeByte(loggedIn ? 2 : 3);
			this.outBuffer.writeMedium(0);
			this.socket.write(this.outBuffer.bytes, 4);
		} catch (@Pc(43) IOException ex) {
			try {
				this.socket.close();
			} catch (@Pc(49) Exception closeEx) {
			}
			this.errors++;
			this.socket = null;
			this.response = -2;
		}
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(Z)Z")
	public final boolean isPrefetchRequestQueueFull() {
		return this.getPrefetchRequestCount() >= 20;
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(B)V")
	private void writeConnected() {
		if (this.socket == null) {
			return;
		}
		try {
			this.outBuffer.position = 0;
			this.outBuffer.writeByte(6);
			this.outBuffer.writeMedium(3);
			this.socket.write(this.outBuffer.bytes, 4);
		} catch (@Pc(38) IOException ex) {
			try {
				this.socket.close();
			} catch (@Pc(44) Exception closeEx) {
			}
			this.socket = null;
			this.response = -2;
			this.errors++;
		}
	}

	@OriginalMember(owner = "client!en", name = "h", descriptor = "(I)Z")
	public final boolean loop() {
		if (this.socket != null) {
			@Pc(11) long now = MonotonicClock.currentTimeMillis();
			@Pc(18) int duration = (int) (now - this.previousLoop);
			this.previousLoop = now;
			if (duration > 200) {
				duration = 200;
			}
			this.latency += duration;
			if (this.latency > 30000) {
				try {
					this.socket.close();
				} catch (@Pc(46) Exception ex) {
				}
				this.socket = null;
			}
		}
		if (this.socket == null) {
			return this.getUrgentRequestCount() == 0 && this.getPrefetchRequestCount() == 0;
		}
		try {
			this.socket.checkError();
			for (@Pc(87) Js5NetRequest request = (Js5NetRequest) this.pendingUrgentRequests.head(); request != null; request = (Js5NetRequest) this.pendingUrgentRequests.next()) {
				this.outBuffer.position = 0;
				this.outBuffer.writeByte(1);
				this.outBuffer.writeMedium((int) request.secondaryKey);
				this.socket.write(this.outBuffer.bytes, 4);
				this.inFlightUrgentRequests.addTail(request);
			}
			for (@Pc(146) Js5NetRequest request = (Js5NetRequest) this.pendingPrefetchRequests.head(); request != null; request = (Js5NetRequest) this.pendingPrefetchRequests.next()) {
				this.outBuffer.position = 0;
				this.outBuffer.writeByte(0);
				this.outBuffer.writeMedium((int) request.secondaryKey);
				this.socket.write(this.outBuffer.bytes, 4);
				this.inFlightPrefetchRequests.addTail(request);
			}
			for (@Pc(188) int i = 0; i < 100; i++) {
				@Pc(198) int available = this.socket.available();
				if (available < 0) {
					throw new IOException();
				}
				if (available == 0) {
					break;
				}
				@Pc(213) byte needed = 0;
				if (this.current == null) {
					needed = 8;
				} else if (this.current.blockPosition == 0) {
					needed = 1;
				}
				this.latency = 0;
				if (needed <= 0) {
					@Pc(242) int remaining = 512 - this.current.blockPosition;
					@Pc(253) int len = this.current.data.bytes.length - this.current.trailerLen;
					if (remaining > len - this.current.data.position) {
						remaining = len - this.current.data.position;
					}
					if (remaining > available) {
						remaining = available;
					}
					this.socket.read(this.current.data.bytes, this.current.data.position, remaining);
					if (this.encryptionKey != 0) {
						for (@Pc(301) int j = 0; j < remaining; j++) {
							this.current.data.bytes[this.current.data.position + j] ^= this.encryptionKey;
						}
					}
					@Pc(336) Buffer data = this.current.data;
					data.position += remaining;
					@Pc(343) Js5NetRequest request = this.current;
					request.blockPosition += remaining;
					if (this.current.data.position == len) {
						this.current.unlinkSecondary();
						this.current.incomplete = false;
						this.current = null;
					} else if (this.current.blockPosition == 512) {
						this.current.blockPosition = 0;
					}
				} else {
					@Pc(391) int remaining = needed - this.inBuffer.position;
					if (remaining > available) {
						remaining = available;
					}
					this.socket.read(this.inBuffer.bytes, this.inBuffer.position, remaining);
					if (this.encryptionKey != 0) {
						for (@Pc(416) int j = 0; j < remaining; j++) {
							this.inBuffer.bytes[this.inBuffer.position + j] = (byte) (this.inBuffer.bytes[this.inBuffer.position + j] ^ this.encryptionKey);
						}
					}
					@Pc(451) Buffer inBuffer = this.inBuffer;
					inBuffer.position += remaining;
					if (this.inBuffer.position >= needed) {
						if (this.current == null) {
							this.inBuffer.position = 0;
							@Pc(473) int archive = this.inBuffer.readUnsignedByte();
							@Pc(478) int group = this.inBuffer.readUnsignedShort();
							@Pc(483) int flags = this.inBuffer.readUnsignedByte();
							@Pc(487) int compressionType = flags & 0x7F;
							@Pc(498) boolean prefetch = (flags & 0x80) != 0;
							@Pc(503) int len = this.inBuffer.readInt();
							@Pc(510) long key = group + (archive << 16);
							@Pc(520) Js5NetRequest request;
							if (prefetch) {
								for (request = (Js5NetRequest) this.inFlightPrefetchRequests.head(); request != null && request.secondaryKey != key; request = (Js5NetRequest) this.inFlightPrefetchRequests.next()) {
								}
							} else {
								for (request = (Js5NetRequest) this.inFlightUrgentRequests.head(); request != null && key != request.secondaryKey; request = (Js5NetRequest) this.inFlightUrgentRequests.next()) {
								}
							}
							if (request == null) {
								throw new IOException();
							}
							this.current = request;
							@Pc(581) int headerLen = compressionType == 0 ? 5 : 9;
							this.current.data = new Buffer(this.current.trailerLen + len + headerLen);
							this.current.data.writeByte(compressionType);
							this.current.data.writeInt(len);
							this.current.blockPosition = 8;
							this.inBuffer.position = 0;
						} else if (this.current.blockPosition != 0) {
							throw new IOException();
						} else if (this.inBuffer.bytes[0] == -1) {
							this.inBuffer.position = 0;
							this.current.blockPosition = 1;
						} else {
							this.current = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(657) IOException ex) {
			try {
				this.socket.close();
			} catch (@Pc(663) Exception closeEx) {
			}
			this.socket = null;
			this.errors++;
			this.response = -2;
			return this.getUrgentRequestCount() == 0 && this.getPrefetchRequestCount() == 0;
		}
	}
}
