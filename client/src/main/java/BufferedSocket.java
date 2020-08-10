import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class BufferedSocket implements Runnable {

	@OriginalMember(owner = "client!eo", name = "n", descriptor = "[B")
	private byte[] buffer;

	@OriginalMember(owner = "client!eo", name = "y", descriptor = "Lsignlink!vk;")
	private PrivilegedRequest thread;

	@OriginalMember(owner = "client!eo", name = "f", descriptor = "Z")
	private boolean closed = false;

	@OriginalMember(owner = "client!eo", name = "j", descriptor = "I")
	private int readPointer = 0;

	@OriginalMember(owner = "client!eo", name = "s", descriptor = "Z")
	private boolean error = false;

	@OriginalMember(owner = "client!eo", name = "z", descriptor = "I")
	private int writePointer = 0;

	@OriginalMember(owner = "client!eo", name = "o", descriptor = "Ljava/net/Socket;")
	private final Socket socket;

	@OriginalMember(owner = "client!eo", name = "x", descriptor = "Lsignlink!pm;")
	private final SignLink signLink;

	@OriginalMember(owner = "client!eo", name = "r", descriptor = "Ljava/io/InputStream;")
	private InputStream in;

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "Ljava/io/OutputStream;")
	private OutputStream out;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Ljava/net/Socket;Lsignlink!pm;)V")
	public BufferedSocket(@OriginalArg(0) Socket socket, @OriginalArg(1) SignLink signLink) throws IOException {
		this.socket = socket;
		this.signLink = signLink;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.in = this.socket.getInputStream();
		this.out = this.socket.getOutputStream();
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I[BIB)V")
	public final void read(@OriginalArg(1) byte[] b, @OriginalArg(0) int off, @OriginalArg(2) int len) throws IOException {
		if (this.closed) {
			return;
		}
		while (len > 0) {
			@Pc(27) int n = this.in.read(b, off, len);
			if (n <= 0) {
				throw new EOFException();
			}
			len -= n;
			off += n;
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)I")
	public final int available() throws IOException {
		return this.closed ? 0 : this.in.available();
	}

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "(I)V")
	public final void close() {
		if (this.closed) {
			return;
		}
		synchronized (this) {
			this.closed = true;
			this.notifyAll();
		}
		if (this.thread != null) {
			while (this.thread.status == 0) {
				ThreadUtils.sleep(1L);
			}
			if (this.thread.status == 1) {
				try {
					((Thread) this.thread.result).join();
				} catch (@Pc(58) InterruptedException ex) {
				}
			}
		}
		this.thread = null;
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(B)V")
	public final void breakConnection() {
		if (!this.closed) {
			this.in = new BrokenInputStream();
			this.out = new BrokenOutputStream();
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)I")
	public final int read() throws IOException {
		return this.closed ? 0 : this.in.read();
	}

	@OriginalMember(owner = "client!eo", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() {
		this.close();
	}

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "(B)V")
	public final void checkError() throws IOException {
		if (!this.closed && this.error) {
			this.error = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!eo", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			while (true) {
				@Pc(40) int len;
				@Pc(25) int off;
				ready:
				{
					synchronized (this) {
						close:
						{
							if (this.writePointer == this.readPointer) {
								if (this.closed) {
									break close;
								}
								try {
									this.wait();
								} catch (@Pc(22) InterruptedException ex) {
								}
							}
							off = this.readPointer;
							if (this.readPointer <= this.writePointer) {
								len = this.writePointer - this.readPointer;
							} else {
								len = 5000 - this.readPointer;
							}
							break ready;
						}
					}
					try {
						if (this.in != null) {
							this.in.close();
						}
						if (this.out != null) {
							this.out.close();
						}
						if (this.socket != null) {
							this.socket.close();
						}
					} catch (@Pc(123) IOException ex) {
					}
					this.buffer = null;
					break;
				}
				if (len > 0) {
					try {
						this.out.write(this.buffer, off, len);
					} catch (@Pc(71) IOException ex) {
						this.error = true;
					}
					this.readPointer = (this.readPointer + len) % 5000;
					try {
						if (this.writePointer == this.readPointer) {
							this.out.flush();
						}
					} catch (@Pc(97) IOException ex) {
						this.error = true;
					}
				}
			}
		} catch (@Pc(128) Exception ex) {
			TracingException.report(ex, null);
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I[BII)V")
	public final void write(@OriginalArg(1) byte[] b, @OriginalArg(2) int len) throws IOException {
		if (this.closed) {
			return;
		}
		if (this.error) {
			this.error = false;
			throw new IOException();
		}
		if (this.buffer == null) {
			this.buffer = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(41) int i = 0; i < len; i++) {
				this.buffer[this.writePointer] = b[i];
				this.writePointer = (this.writePointer + 1) % 5000;
				if ((this.readPointer + 4900) % 5000 == this.writePointer) {
					throw new IOException();
				}
			}
			if (this.thread == null) {
				this.thread = this.signLink.startThread(this, 3);
			}
			this.notifyAll();
		}
	}
}
