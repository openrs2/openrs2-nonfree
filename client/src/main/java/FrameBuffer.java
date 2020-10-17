import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public abstract class FrameBuffer {

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BIILjava/awt/Component;)Lclient!ob;")
	public static FrameBuffer create(@OriginalArg(3) Component component, @OriginalArg(2) int width, @OriginalArg(1) int height) {
		try {
			@Pc(12) Class<?> clazz = Class.forName("BufferedImageFrameBuffer");
			@Pc(16) FrameBuffer buffer = (FrameBuffer) clazz.getDeclaredConstructor().newInstance();
			buffer.init(component, width, height);
			return buffer;
		} catch (@Pc(25) Throwable ex) {
			@Pc(29) ImageProducerFrameBuffer buffer = new ImageProducerFrameBuffer();
			buffer.init(component, width, height);
			return buffer;
		}
	}

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "Ljava/awt/Image;")
	protected Image image;

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "[I")
	protected int[] pixels;

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
	protected int height;

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
	protected int width;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
	public abstract void draw(@OriginalArg(1) Graphics graphics);

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZIIILjava/awt/Graphics;I)V")
	public abstract void draw(@OriginalArg(4) Graphics graphics, @OriginalArg(5) int x, @OriginalArg(2) int y, @OriginalArg(1) int width, @OriginalArg(3) int height);

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/awt/Component;IIB)V")
	public abstract void init(@OriginalArg(0) Component component, @OriginalArg(1) int width, @OriginalArg(2) int height);

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
	public final void makeTarget() {
		SoftwareRaster.setPixels(this.pixels, this.width, this.height);
	}
}
