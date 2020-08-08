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
public final class Class52 implements Runnable {

	@OriginalMember(owner = "client!eo", name = "n", descriptor = "[B")
	private byte[] aByteArray11;

	@OriginalMember(owner = "client!eo", name = "y", descriptor = "Lsignlink!vk;")
	private Class197 aClass197_3;

	@OriginalMember(owner = "client!eo", name = "f", descriptor = "Z")
	private boolean aBoolean81 = false;

	@OriginalMember(owner = "client!eo", name = "j", descriptor = "I")
	private int anInt1366 = 0;

	@OriginalMember(owner = "client!eo", name = "s", descriptor = "Z")
	private boolean aBoolean83 = false;

	@OriginalMember(owner = "client!eo", name = "z", descriptor = "I")
	private int anInt1373 = 0;

	@OriginalMember(owner = "client!eo", name = "o", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!eo", name = "x", descriptor = "Lsignlink!pm;")
	private final Class196 aClass196_1;

	@OriginalMember(owner = "client!eo", name = "r", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Ljava/net/Socket;Lsignlink!pm;)V")
	public Class52(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class196 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass196_1 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I[BIB)V")
	public final void method1099(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean81) {
			return;
		}
		while (arg2 > 0) {
			@Pc(27) int local27 = this.anInputStream1.read(arg1, arg0, arg2);
			if (local27 <= 0) {
				throw new EOFException();
			}
			arg2 -= local27;
			arg0 += local27;
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)I")
	public final int method1101() throws IOException {
		return this.aBoolean81 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "(I)V")
	public final void method1103() {
		if (this.aBoolean81) {
			return;
		}
		synchronized (this) {
			this.aBoolean81 = true;
			this.notifyAll();
		}
		if (this.aClass197_3 != null) {
			while (this.aClass197_3.anInt6107 == 0) {
				Static37.method4640(1L);
			}
			if (this.aClass197_3.anInt6107 == 1) {
				try {
					((Thread) this.aClass197_3.anObject6).join();
				} catch (@Pc(58) InterruptedException local58) {
				}
			}
		}
		this.aClass197_3 = null;
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(B)V")
	public final void method1104() {
		if (!this.aBoolean81) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)I")
	public final int method1105() throws IOException {
		return this.aBoolean81 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!eo", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() {
		this.method1103();
	}

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "(B)V")
	public final void method1106() throws IOException {
		if (!this.aBoolean81 && this.aBoolean83) {
			this.aBoolean83 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!eo", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			while (true) {
				@Pc(40) int var1;
				@Pc(25) int var2;
				label87:
				{
					synchronized (this) {
						label88:
						{
							if (this.anInt1373 == this.anInt1366) {
								if (this.aBoolean81) {
									break label88;
								}
								try {
									this.wait();
								} catch (@Pc(22) InterruptedException local22) {
								}
							}
							var2 = this.anInt1366;
							if (this.anInt1366 <= this.anInt1373) {
								var1 = this.anInt1373 - this.anInt1366;
							} else {
								var1 = 5000 - this.anInt1366;
							}
							break label87;
						}
					}
					try {
						if (this.anInputStream1 != null) {
							this.anInputStream1.close();
						}
						if (this.anOutputStream1 != null) {
							this.anOutputStream1.close();
						}
						if (this.aSocket1 != null) {
							this.aSocket1.close();
						}
					} catch (@Pc(123) IOException local123) {
					}
					this.aByteArray11 = null;
					break;
				}
				if (var1 > 0) {
					try {
						this.anOutputStream1.write(this.aByteArray11, var2, var1);
					} catch (@Pc(71) IOException local71) {
						this.aBoolean83 = true;
					}
					this.anInt1366 = (var1 + this.anInt1366) % 5000;
					try {
						if (this.anInt1373 == this.anInt1366) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(97) IOException local97) {
						this.aBoolean83 = true;
					}
				}
			}
		} catch (@Pc(128) Exception local128) {
			Static26.method3059(local128, null);
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I[BII)V")
	public final void method1107(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean81) {
			return;
		}
		if (this.aBoolean83) {
			this.aBoolean83 = false;
			throw new IOException();
		}
		if (this.aByteArray11 == null) {
			this.aByteArray11 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(41) int local41 = 0; local41 < arg1; local41++) {
				this.aByteArray11[this.anInt1373] = arg0[local41];
				this.anInt1373 = (this.anInt1373 + 1) % 5000;
				if ((this.anInt1366 + 4900) % 5000 == this.anInt1373) {
					throw new IOException();
				}
			}
			if (this.aClass197_3 == null) {
				this.aClass197_3 = this.aClass196_1.method4883(3, this);
			}
			this.notifyAll();
		}
	}
}
