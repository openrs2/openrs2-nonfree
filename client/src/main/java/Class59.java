import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public abstract class Class59 {

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "Ljava/awt/Image;")
	protected Image anImage5;

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "[I")
	protected int[] anIntArray568;

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
	protected int anInt5200;

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
	protected int anInt5201;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
	public abstract void method4238(@OriginalArg(1) Graphics arg0);

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZIIILjava/awt/Graphics;I)V")
	public abstract void method4240(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/awt/Component;IIB)V")
	public abstract void method4242(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
	public final void method4244() {
		Static34.method4224(this.anIntArray568, this.anInt5201, this.anInt5200);
	}
}
