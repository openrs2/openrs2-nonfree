import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class PostProcessorManager {
	@OriginalMember(owner = "client!di", name = "n", descriptor = "[I")
	private static final int[] colorBuffers = new int[2];

	@OriginalMember(owner = "client!di", name = "f", descriptor = "Lclient!ll;")
	private static final LinkedList processors = new LinkedList();

	@OriginalMember(owner = "client!di", name = "a", descriptor = "I")
	private static int y = 0;

	@OriginalMember(owner = "client!di", name = "b", descriptor = "I")
	private static int x = 0;

	@OriginalMember(owner = "client!di", name = "c", descriptor = "I")
	private static int height = -1;

	@OriginalMember(owner = "client!di", name = "d", descriptor = "I")
	private static int frameBuffer = -1;

	@OriginalMember(owner = "client!di", name = "e", descriptor = "I")
	private static int width = -1;

	@OriginalMember(owner = "client!di", name = "g", descriptor = "Z")
	private static boolean depthBufferChanged = true;

	@OriginalMember(owner = "client!di", name = "h", descriptor = "Z")
	private static boolean frameBufferComplete = false;

	@OriginalMember(owner = "client!di", name = "i", descriptor = "Z")
	private static boolean nextDepthTexture = false;

	@OriginalMember(owner = "client!di", name = "j", descriptor = "Z")
	private static boolean colorBufferChanged = true;

	@OriginalMember(owner = "client!di", name = "k", descriptor = "I")
	private static int colorAttachments = 0;

	@OriginalMember(owner = "client!di", name = "l", descriptor = "Z")
	private static boolean depthTexture = false;

	@OriginalMember(owner = "client!di", name = "m", descriptor = "Z")
	private static boolean attachmentsChanged = true;

	@OriginalMember(owner = "client!di", name = "o", descriptor = "I")
	private static int colorBufferInternalFormat = -1;

	@OriginalMember(owner = "client!di", name = "p", descriptor = "I")
	private static int depthBuffer = -1;

	@OriginalMember(owner = "client!di", name = "q", descriptor = "Lclient!dd;")
	private static BloomPostProcessor bloom;

	@OriginalMember(owner = "client!di", name = "c", descriptor = "()V")
	public static void init() {
		if (!GlRenderer.arbFboSupported || !GlRenderer.arbTextureRectangleSupported) {
			return;
		}
		@Pc(5) GL gl = GlRenderer.gl;
		@Pc(8) int[] maxColorAttachments = new int[1];
		gl.glGetIntegerv(GL.GL_MAX_COLOR_ATTACHMENTS, maxColorAttachments, 0);
		if (maxColorAttachments[0] >= 2) {
			gl.glGenTextures(2, colorBuffers, 0);
			frameBuffer = GlFrameBufferAllocator.allocateFrameBuffer();
		}
		for (@Pc(29) Node node = processors.head(); node != null; node = processors.next()) {
			@Pc(34) PostProcessor processor = (PostProcessor) node;
			if (!processor.init()) {
				processor.unlink();
			}
		}
		if (bloom == null) {
			bloom = new BloomPostProcessor();
		}
		if (!bloom.isInitialised() && !bloom.init()) {
			bloom.quit();
		}
		update();
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "()V")
	private static void update() {
		@Pc(1) int maxColorDepth = 0;
		@Pc(3) int colorAttachments = 0;
		@Pc(5) boolean alpha = true;
		@Pc(7) boolean depth = false;
		for (@Pc(12) PostProcessor processor = (PostProcessor) processors.head(); processor != null; processor = (PostProcessor) processors.next()) {
			@Pc(17) int colorDepth = processor.getColorDepth();
			if (colorDepth > maxColorDepth) {
				maxColorDepth = colorDepth;
			}
			alpha |= processor.hasAlpha();
			depth |= processor.hasDepthTexture();
			colorAttachments += processor.getColorAttachments();
		}
		@Pc(55) int format;
		if (maxColorDepth == 2) {
			format = alpha ? GlTextureAllocator.GL_RGBA32F : GlTextureAllocator.GL_RGB32F;
		} else if (maxColorDepth == 1) {
			format = alpha ? GlTextureAllocator.GL_RGBA16F : GlTextureAllocator.GL_RGB16F;
		} else {
			format = alpha ? GlTextureAllocator.GL_RGBA : GlTextureAllocator.GL_RGB;
		}
		if (format != colorBufferInternalFormat) {
			colorBufferInternalFormat = format;
			colorBufferChanged = true;
		}
		@Pc(86) int prevColorAttachments = PostProcessorManager.colorAttachments > 2 ? 2 : PostProcessorManager.colorAttachments;
		@Pc(93) int nextColorAttachments = colorAttachments > 2 ? 2 : colorAttachments;
		if (prevColorAttachments != nextColorAttachments) {
			colorBufferChanged = true;
			attachmentsChanged = true;
		}
		if (depth != depthTexture) {
			nextDepthTexture = depth;
			depthBufferChanged = true;
		}
		PostProcessorManager.colorAttachments = colorAttachments;
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "()Z")
	public static boolean enableBloom() {
		if (isBloomEnabled()) {
			return true;
		} else if (!isBloomSupported()) {
			return false;
		} else if (enable(bloom)) {
			return true;
		} else {
			disableBloom();
			return false;
		}
	}

	@OriginalMember(owner = "client!di", name = "d", descriptor = "()V")
	public static void disableBloom() {
		if (bloom.isEnabled()) {
			disable(bloom);
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIII)Z")
	public static boolean setViewport(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height) {
		if (frameBuffer == -1 || processors.isEmpty()) {
			frameBufferComplete = false;
			return false;
		}
		PostProcessorManager.x = x;
		PostProcessorManager.y = y;
		@Pc(16) boolean changed = false;
		if (PostProcessorManager.width != width || PostProcessorManager.height != height) {
			PostProcessorManager.width = width;
			PostProcessorManager.height = height;
			for (@Pc(30) Node processor = processors.head(); processor != processors.sentinel; processor = processor.next) {
				((PostProcessor) processor).setSize(PostProcessorManager.width, PostProcessorManager.height);
			}
			colorBufferChanged = true;
			depthBufferChanged = true;
		}
		@Pc(49) GL gl = GlRenderer.gl;
		if (depthBufferChanged) {
			if (depthBuffer != -1 && nextDepthTexture != depthTexture) {
				if (depthTexture) {
					GlTextureAllocator.freeTexture(depthBuffer);
				} else {
					GlFrameBufferAllocator.freeRenderBuffer(depthBuffer);
				}
				depthBuffer = -1;
			}
			if (depthBuffer == -1) {
				depthTexture = nextDepthTexture;
				if (depthTexture) {
					depthBuffer = GlTextureAllocator.allocateTexture();
				} else {
					depthBuffer = GlFrameBufferAllocator.allocateRenderBuffer();
				}
				attachmentsChanged = true;
			}
			if (depthTexture) {
				gl.glBindTexture(GL.GL_TEXTURE_RECTANGLE, depthBuffer);
				GlTextureAllocator.allocateTextureStorage(GlTextureAllocator.GL_TEXTURE_RECTANGLE, GlTextureAllocator.GL_DEPTH_COMPONENT, PostProcessorManager.width, PostProcessorManager.height, GlTextureAllocator.GL_DEPTH_COMPONENT, GlTextureAllocator.GL_UNSIGNED_BYTE, null);
			} else {
				gl.glBindRenderbufferEXT(GL.GL_RENDERBUFFER, depthBuffer);
				gl.glRenderbufferStorageEXT(GL.GL_RENDERBUFFER, GL.GL_DEPTH_COMPONENT, PostProcessorManager.width, PostProcessorManager.height);
			}
			depthBufferChanged = false;
			changed = true;
		}
		if (colorBufferChanged) {
			gl.glBindTexture(GL.GL_TEXTURE_RECTANGLE, colorBuffers[0]);
			GlTextureAllocator.allocateTextureStorageRectangle(colorBufferInternalFormat, PostProcessorManager.width, PostProcessorManager.height);
			gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
			gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
			if (colorAttachments > 1) {
				gl.glBindTexture(GL.GL_TEXTURE_RECTANGLE, colorBuffers[1]);
				GlTextureAllocator.allocateTextureStorageRectangle(colorBufferInternalFormat, PostProcessorManager.width, PostProcessorManager.height);
				gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
				gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
			} else {
				gl.glBindTexture(GL.GL_TEXTURE_RECTANGLE, colorBuffers[1]);
				GlTextureAllocator.allocateTextureStorageRectangle(colorBufferInternalFormat, 0, 0);
			}
			colorBufferChanged = false;
			changed = true;
		}
		GlFrameBufferAllocator.pushFrameBuffer(frameBuffer);
		if (attachmentsChanged) {
			gl.glFramebufferTexture2DEXT(GL.GL_FRAMEBUFFER, GL.GL_COLOR_ATTACHMENT0, GL.GL_TEXTURE_RECTANGLE, colorBuffers[0], 0);
			gl.glFramebufferTexture2DEXT(GL.GL_FRAMEBUFFER, GL.GL_COLOR_ATTACHMENT1, GL.GL_TEXTURE_RECTANGLE, colorAttachments > 1 ? colorBuffers[1] : 0, 0);
			if (depthTexture) {
				gl.glFramebufferTexture2DEXT(GL.GL_FRAMEBUFFER, GL.GL_DEPTH_ATTACHMENT, GL.GL_TEXTURE_RECTANGLE, depthBuffer, 0);
			} else {
				gl.glFramebufferRenderbufferEXT(GL.GL_FRAMEBUFFER, GL.GL_DEPTH_ATTACHMENT, GL.GL_RENDERBUFFER, depthBuffer);
			}
			gl.glDrawBuffer(GL.GL_COLOR_ATTACHMENT0);
			attachmentsChanged = false;
			changed = true;
		}
		if (changed) {
			if (GlFrameBufferAllocator.isFrameBufferComplete()) {
				frameBufferComplete = true;
			} else {
				GlFrameBufferAllocator.popFrameBuffer();
				colorBufferChanged = true;
				depthBufferChanged = true;
				attachmentsChanged = true;
				frameBufferComplete = false;
			}
		}
		GlRenderer.method1584(-PostProcessorManager.x, PostProcessorManager.y + PostProcessorManager.height - GlRenderer.canvasHeight);
		return frameBufferComplete;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!bc;)Z")
	private static boolean enable(@OriginalArg(0) PostProcessor processor) {
		if (frameBuffer != -1) {
			if (processor.isInitialised() || processor.init()) {
				if (width != -1 && height != -1) {
					processor.setSize(width, height);
				}
				processor.enabled = true;
				processors.addTail(processor);
				update();
				return true;
			}
			processor.quit();
		}
		return false;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!bc;Z)V")
	private static void disable(@OriginalArg(0) PostProcessor processor) {
		processor.enabled = false;
		processor.unlink();
		update();
	}

	@OriginalMember(owner = "client!di", name = "e", descriptor = "()Z")
	public static boolean isBloomSupported() {
		return frameBuffer != -1 && bloom.isInitialised();
	}

	@OriginalMember(owner = "client!di", name = "g", descriptor = "()Z")
	public static boolean isFrameBufferSupported() {
		return frameBuffer != -1;
	}

	@OriginalMember(owner = "client!di", name = "h", descriptor = "()V")
	public static void process() {
		if (!frameBufferComplete) {
			return;
		}
		@Pc(4) GL gl = GlRenderer.gl;
		GlRenderer.method1596();
		GlRaster.resetClip();
		gl.glDisable(GL.GL_BLEND);
		gl.glDisable(GL.GL_ALPHA_TEST);
		GlRenderer.disableDepthMask();
		@Pc(15) int colorBufferIndex = 0;
		@Pc(17) int prevColorBufferIndex = 1;
		@Pc(29) PostProcessor next;
		for (@Pc(22) PostProcessor current = (PostProcessor) processors.head(); current != null; current = next) {
			next = (PostProcessor) processors.next();
			@Pc(33) int colorAttachments = current.getColorAttachments();
			for (@Pc(35) int i = 0; i < colorAttachments; i++) {
				current.preProcess(i, width, height, PostProcessorManager.colorBuffers[colorBufferIndex], depthBuffer);
				if (next == null && i == colorAttachments - 1) {
					y = GlRenderer.canvasHeight - y;
					GlRenderer.method1584(0, 0);
					gl.glDrawBuffer(GL.GL_COLOR_ATTACHMENT0);
					GlFrameBufferAllocator.popFrameBuffer();
					gl.glBegin(GL.GL_QUADS);
					gl.glTexCoord2f(0.0F, 0.0F);
					gl.glMultiTexCoord2f(GL.GL_TEXTURE1, 0.0F, 0.0F);
					gl.glVertex2i(x, y - height);
					gl.glTexCoord2f((float) width, 0.0F);
					gl.glMultiTexCoord2f(GL.GL_TEXTURE1, 1.0F, 0.0F);
					gl.glVertex2i(x + width, y - height);
					gl.glTexCoord2f((float) width, (float) height);
					gl.glMultiTexCoord2f(GL.GL_TEXTURE1, 1.0F, 1.0F);
					gl.glVertex2i(x + width, y);
					gl.glTexCoord2f(0.0F, (float) height);
					gl.glMultiTexCoord2f(GL.GL_TEXTURE1, 0.0F, 1.0F);
					gl.glVertex2i(x, y);
					gl.glEnd();
				} else {
					gl.glDrawBuffer(prevColorBufferIndex + GL.GL_COLOR_ATTACHMENT0);
					gl.glBegin(GL.GL_QUADS);
					gl.glTexCoord2f(0.0F, 0.0F);
					gl.glMultiTexCoord2f(GL.GL_TEXTURE1, 0.0F, 0.0F);
					gl.glVertex2i(0, 0);
					gl.glTexCoord2f((float) width, 0.0F);
					gl.glMultiTexCoord2f(GL.GL_TEXTURE1, 1.0F, 0.0F);
					gl.glVertex2i(width, 0);
					gl.glTexCoord2f((float) width, (float) height);
					gl.glMultiTexCoord2f(GL.GL_TEXTURE1, 1.0F, 1.0F);
					gl.glVertex2i(width, height);
					gl.glTexCoord2f(0.0F, (float) height);
					gl.glMultiTexCoord2f(GL.GL_TEXTURE1, 0.0F, 1.0F);
					gl.glVertex2i(0, height);
					gl.glEnd();
				}
				current.postProcess(i);
				prevColorBufferIndex = prevColorBufferIndex + 1 & 0x1;
				colorBufferIndex = colorBufferIndex + 1 & 0x1;
			}
		}
		gl.glEnable(GL.GL_ALPHA_TEST);
		gl.glEnable(GL.GL_BLEND);
		GlRenderer.enableDepthMask();
	}

	@OriginalMember(owner = "client!di", name = "i", descriptor = "()Z")
	public static boolean isBloomEnabled() {
		return frameBuffer != -1 && bloom.isEnabled();
	}

	@OriginalMember(owner = "client!di", name = "j", descriptor = "()V")
	public static void quit() {
		if (frameBuffer != -1) {
			GlFrameBufferAllocator.freeFrameBuffer(frameBuffer);
			frameBuffer = -1;
			GlRenderer.gl.glDeleteTextures(2, colorBuffers, 0);
			colorBuffers[0] = -1;
			colorBuffers[1] = -1;
		}
		if (depthBuffer != -1) {
			if (depthTexture) {
				GlTextureAllocator.freeTexture(depthBuffer);
			} else {
				GlFrameBufferAllocator.freeRenderBuffer(depthBuffer);
			}
			depthBuffer = -1;
		}
		if (!processors.isEmpty()) {
			for (@Pc(39) Node processor = processors.head(); processor != processors.sentinel; processor = processor.next) {
				((PostProcessor) processor).quit();
			}
		}
		if (bloom != null && bloom.isInitialised()) {
			bloom.quit();
		}
		colorBufferChanged = true;
		depthBufferChanged = true;
		attachmentsChanged = true;
		height = -1;
		width = -1;
	}
}
