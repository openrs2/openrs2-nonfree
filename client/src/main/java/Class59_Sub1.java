import java.awt.Component;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class59_Sub1 extends Class59 {

	@OriginalMember(owner = "client!fk", name = "A", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/awt/Component;IIB)V")
	@Override
	public final void method4242(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5201 = arg1;
		this.anInt5200 = arg2;
		this.anIntArray568 = new int[arg1 * arg2 + 1];
		@Pc(28) DataBufferInt local28 = new DataBufferInt(this.anIntArray568, this.anIntArray568.length);
		@Pc(36) DirectColorModel local36 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(46) WritableRaster local46 = Raster.createWritableRaster(local36.createCompatibleSampleModel(this.anInt5201, this.anInt5200), local28, null);
		this.anImage5 = new BufferedImage(local36, local46, false, new Hashtable());
		this.aComponent1 = arg0;
		this.method4244();
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZIIILjava/awt/Graphics;I)V")
	@Override
	public final void method4240(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4) {
		@Pc(6) Shape local6 = arg3.getClip();
		arg3.clipRect(arg4, arg1, arg0, arg2);
		arg3.drawImage(this.anImage5, 0, 0, this.aComponent1);
		arg3.setClip(local6);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
	@Override
	public final void method4238(@OriginalArg(1) Graphics arg0) {
		arg0.drawImage(this.anImage5, 0, 0, this.aComponent1);
	}
}
