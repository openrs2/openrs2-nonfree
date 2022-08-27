import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class ImageProducerFrameBuffer extends FrameBuffer implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!tm", name = "E", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel model;

	@OriginalMember(owner = "client!tm", name = "N", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer consumer;

	@OriginalMember(owner = "client!tm", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer consumer) {
		this.consumer = consumer;
		consumer.setDimensions(this.width, this.height);
		consumer.setProperties(null);
		consumer.setColorModel(this.model);
		consumer.setHints(14);
	}

	@OriginalMember(owner = "client!tm", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer consumer) {
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZIIILjava/awt/Graphics;I)V")
	@Override
	public void draw(@OriginalArg(4) Graphics graphics, @OriginalArg(5) int x, @OriginalArg(2) int y, @OriginalArg(1) int width, @OriginalArg(3) int height) {
		this.setPixels(x, y, width, height);
		@Pc(9) Shape clip = graphics.getClip();
		graphics.clipRect(x, y, width, height);
		graphics.drawImage(this.image, 0, 0, this);
		graphics.setClip(clip);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V")
	private synchronized void setPixels() {
		if (this.consumer != null) {
			this.consumer.setPixels(0, 0, this.width, this.height, this.model, this.pixels, 0, this.width);
			this.consumer.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
	@Override
	public void draw(@OriginalArg(1) Graphics graphics) {
		this.setPixels();
		graphics.drawImage(this.image, 0, 0, this);
	}

	@OriginalMember(owner = "client!tm", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image image, @OriginalArg(1) int flags, @OriginalArg(2) int x, @OriginalArg(3) int y, @OriginalArg(4) int width, @OriginalArg(5) int height) {
		return true;
	}

	@OriginalMember(owner = "client!tm", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer consumer) {
		this.addConsumer(consumer);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIBII)V")
	private synchronized void setPixels(@OriginalArg(0) int x, @OriginalArg(3) int y, @OriginalArg(1) int width, @OriginalArg(4) int height) {
		if (this.consumer != null) {
			this.consumer.setPixels(x, y, width, height, this.model, this.pixels, this.width * y + x, this.width);
			this.consumer.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!tm", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer consumer) {
		return this.consumer == consumer;
	}

	@OriginalMember(owner = "client!tm", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer consumer) {
		if (this.consumer == consumer) {
			this.consumer = null;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ljava/awt/Component;IIB)V")
	@Override
	public void init(@OriginalArg(0) Component component, @OriginalArg(1) int width, @OriginalArg(2) int height) {
		this.width = width;
		this.height = height;
		this.pixels = new int[width * height + 1];
		this.model = new DirectColorModel(32, 0xFF0000, 0x00FF00, 0x0000FF);
		this.image = component.createImage(this);
		this.setPixels();
		component.prepareImage(this.image, this);
		this.setPixels();
		component.prepareImage(this.image, this);
		this.setPixels();
		component.prepareImage(this.image, this);
		this.makeTarget();
	}
}
