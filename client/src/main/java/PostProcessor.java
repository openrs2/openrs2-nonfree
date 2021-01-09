import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public abstract class PostProcessor extends Node {

	@OriginalMember(owner = "client!bc", name = "t", descriptor = "Z")
	public boolean enabled;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(B)I")
	public final int getColorAttachments() {
		return 1;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "()I")
	public int getColorDepth() {
		return 0;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)Z")
	public final boolean isEnabled() {
		return this.enabled;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
	public abstract void postProcess(@OriginalArg(0) int colorAttachment);

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "()V")
	public abstract void quit();

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(IIIII)V")
	public abstract void preProcess(@OriginalArg(0) int colorAttachment, @OriginalArg(1) int width, @OriginalArg(2) int height, @OriginalArg(3) int colorBuffer, @OriginalArg(4) int depthBuffer);

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "()Z")
	public abstract boolean init();

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)Z")
	public final boolean hasAlpha() {
		return false;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V")
	public abstract void setSize(@OriginalArg(0) int width, @OriginalArg(1) int height);

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "()Z")
	public abstract boolean isInitialised();

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "(B)Z")
	public final boolean hasDepthTexture() {
		return false;
	}
}
