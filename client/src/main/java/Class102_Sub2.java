import java.awt.Component;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public final class Class102_Sub2 extends Class102 {

	@OriginalMember(owner = "client!nm", name = "M", descriptor = "I")
	private final int anInt3600;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lsignlink!pm;I)V")
	public Class102_Sub2(@OriginalArg(0) SignLink arg0, @OriginalArg(1) int arg1) {
		Static5.anInterface5_1 = arg0.getAudioSource();
		this.anInt3600 = arg1;
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V")
	@Override
	public final void method2999(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static5.anInterface5_1.open(this.anInt3600, arg0);
	}

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "()V")
	@Override
	protected final void method3011() {
		Static5.anInterface5_1.flush(this.anInt3600);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public final void method3006(@OriginalArg(0) Component arg0) throws Exception {
		Static5.anInterface5_1.init(arg0, Static4.aBoolean183, Static7.anInt5394);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "()I")
	@Override
	protected final int method3002() {
		return Static5.anInterface5_1.getBufferedSampleCount(this.anInt3600);
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "()V")
	@Override
	protected final void method3004() {
		Static5.anInterface5_1.close(this.anInt3600);
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "()V")
	@Override
	protected final void method3005() {
		Static5.anInterface5_1.write(this.anInt3600, this.anIntArray393);
	}
}
