import java.awt.Component;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class BufferedImageFrameBuffer extends FrameBuffer {

	@OriginalMember(owner = "client!fk", name = "A", descriptor = "Ljava/awt/Component;")
	private Component component;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/awt/Component;IIB)V")
	@Override
	public final void init(@OriginalArg(0) Component component, @OriginalArg(1) int width, @OriginalArg(2) int height) {
		this.width = width;
		this.height = height;
		this.pixels = new int[width * height + 1];
		@Pc(28) DataBufferInt buffer = new DataBufferInt(this.pixels, this.pixels.length);
		@Pc(36) DirectColorModel model = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(46) WritableRaster raster = Raster.createWritableRaster(model.createCompatibleSampleModel(this.width, this.height), buffer, null);
		this.image = new BufferedImage(model, raster, false, new Hashtable<String, Object>());
		this.component = component;
		this.makeTarget();
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZIIILjava/awt/Graphics;I)V")
	@Override
	public final void draw(@OriginalArg(4) Graphics graphics, @OriginalArg(5) int x, @OriginalArg(2) int y, @OriginalArg(1) int width, @OriginalArg(3) int height) {
		@Pc(6) Shape clip = graphics.getClip();
		graphics.clipRect(x, y, width, height);
		graphics.drawImage(this.image, 0, 0, this.component);
		graphics.setClip(clip);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
	@Override
	public final void draw(@OriginalArg(1) Graphics graphics) {
		graphics.drawImage(this.image, 0, 0, this.component);
	}
}
