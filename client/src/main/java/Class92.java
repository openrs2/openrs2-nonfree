import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class92 implements Runnable {

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "Lclient!uk;")
	private final Class175 aClass175_10 = new Class175();

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "Z")
	private boolean aBoolean174 = false;

	@OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
	public int anInt2520 = 0;

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
	public Class92() {
		@Pc(20) PrivilegedRequest local20 = GameShell.signLink.startThread(this, 5);
		while (local20.status == 0) {
			ThreadUtils.sleep(10L);
		}
		if (local20.status == 2) {
			throw new RuntimeException();
		}
		this.aThread1 = (Thread) local20.result;
	}

	@OriginalMember(owner = "client!ja", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		while (!this.aBoolean174) {
			@Pc(15) Class4_Sub3_Sub1_Sub1 local15;
			synchronized (this.aClass175_10) {
				local15 = (Class4_Sub3_Sub1_Sub1) this.aClass175_10.method4336();
				if (local15 == null) {
					try {
						this.aClass175_10.wait();
					} catch (@Pc(30) InterruptedException local30) {
					}
					continue;
				}
				this.anInt2520--;
			}
			try {
				if (local15.anInt181 == 2) {
					local15.aClass60_1.method1482(local15.aByteArray3.length, local15.aByteArray3, (int) local15.aLong213);
				} else if (local15.anInt181 == 3) {
					local15.aByteArray3 = local15.aClass60_1.method1481((int) local15.aLong213);
				}
			} catch (@Pc(76) Exception local76) {
				Static26.method3059(local76, null);
			}
			local15.aBoolean364 = false;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILclient!fm;I)Lclient!al;")
	public final Class4_Sub3_Sub1_Sub1 method1965(@OriginalArg(1) Class60 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class4_Sub3_Sub1_Sub1 local7 = new Class4_Sub3_Sub1_Sub1();
		local7.anInt181 = 3;
		local7.aClass60_1 = arg0;
		local7.aBoolean363 = false;
		local7.aLong213 = arg1;
		this.method1972(local7);
		return local7;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BLclient!fm;[BI)Lclient!al;")
	public final Class4_Sub3_Sub1_Sub1 method1968(@OriginalArg(1) Class60 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class4_Sub3_Sub1_Sub1 local15 = new Class4_Sub3_Sub1_Sub1();
		local15.aLong213 = arg2;
		local15.aClass60_1 = arg0;
		local15.aBoolean363 = false;
		local15.anInt181 = 2;
		local15.aByteArray3 = arg1;
		this.method1972(local15);
		return local15;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
	public final void method1971() {
		this.aBoolean174 = true;
		synchronized (this.aClass175_10) {
			this.aClass175_10.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(27) InterruptedException local27) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILclient!al;)V")
	private void method1972(@OriginalArg(1) Class4_Sub3_Sub1_Sub1 arg0) {
		synchronized (this.aClass175_10) {
			this.aClass175_10.method4333(arg0);
			this.anInt2520++;
			this.aClass175_10.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BLclient!fm;I)Lclient!al;")
	public final Class4_Sub3_Sub1_Sub1 method1973(@OriginalArg(1) Class60 arg0, @OriginalArg(2) int arg1) {
		@Pc(5) Class4_Sub3_Sub1_Sub1 local5 = new Class4_Sub3_Sub1_Sub1();
		local5.anInt181 = 1;
		synchronized (this.aClass175_10) {
			@Pc(23) Class4_Sub3_Sub1_Sub1 local23 = (Class4_Sub3_Sub1_Sub1) this.aClass175_10.method4332();
			while (true) {
				if (local23 == null) {
					break;
				}
				if (local23.aLong213 == (long) arg1 && arg0 == local23.aClass60_1 && local23.anInt181 == 2) {
					local5.aByteArray3 = local23.aByteArray3;
					local5.aBoolean364 = false;
					return local5;
				}
				local23 = (Class4_Sub3_Sub1_Sub1) this.aClass175_10.method4340();
			}
		}
		local5.aByteArray3 = arg0.method1481(arg1);
		local5.aBoolean364 = false;
		local5.aBoolean363 = true;
		return local5;
	}
}
