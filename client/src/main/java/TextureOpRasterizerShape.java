import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public abstract class TextureOpRasterizerShape {

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	public final int fillColor;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	protected final int outlineWidth;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
	public final int outlineColor;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(III)V")
	protected TextureOpRasterizerShape(@OriginalArg(0) int fillColor, @OriginalArg(1) int outlineColor, @OriginalArg(2) int outlineWidth) {
		this.fillColor = fillColor;
		this.outlineWidth = outlineWidth;
		this.outlineColor = outlineColor;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIB)V")
	public abstract void render(@OriginalArg(0) int width, @OriginalArg(1) int height);

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)V")
	public abstract void renderFill(@OriginalArg(1) int width, @OriginalArg(2) int height);

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIZ)V")
	public abstract void renderOutline(@OriginalArg(0) int width, @OriginalArg(1) int height);
}
