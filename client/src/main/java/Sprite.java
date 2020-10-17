import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public abstract class Sprite extends SecondaryNode {

	@OriginalMember(owner = "client!uj", name = "y", descriptor = "I")
	public int innerWidth;

	@OriginalMember(owner = "client!uj", name = "A", descriptor = "I")
	protected int yOffset;

	@OriginalMember(owner = "client!uj", name = "C", descriptor = "I")
	protected int xOffset;

	@OriginalMember(owner = "client!uj", name = "E", descriptor = "I")
	public int height;

	@OriginalMember(owner = "client!uj", name = "G", descriptor = "I")
	public int width;

	@OriginalMember(owner = "client!uj", name = "J", descriptor = "I")
	public int innerHeight;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
	protected Sprite() {
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIII)V")
	public abstract void renderResizedAlpha(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int alpha);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)V")
	public abstract void renderTransparent(@OriginalArg(0) int x, @OriginalArg(1) int y);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIII)V")
	public abstract void renderResizedTransparent(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height);

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(IIIIII)V")
	protected abstract void renderRotatedScaledTransparent(@OriginalArg(0) int pivotX, @OriginalArg(1) int pivotY, @OriginalArg(2) int x, @OriginalArg(3) int y, @OriginalArg(4) int angle, @OriginalArg(5) int scale);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IBIII)V")
	public final void renderRotatedScaledTransparent(@OriginalArg(0) int y, @OriginalArg(2) int angle, @OriginalArg(3) int x, @OriginalArg(4) int scale) {
		@Pc(4) int halfInnerWidth = this.innerWidth << 3;
		x = (halfInnerWidth & 0xF) + (x << 4);
		@Pc(21) int halfInnerHeight = this.innerHeight << 3;
		y = (halfInnerHeight & 0xF) + (y << 4);
		this.renderRotatedScaledTransparent(halfInnerWidth, halfInnerHeight, x, y, angle, scale);
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(II)V")
	public abstract void render(@OriginalArg(0) int x, @OriginalArg(1) int y);

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(II)V")
	public abstract void renderHorizontalFlipTransparent(@OriginalArg(0) int x, @OriginalArg(1) int y);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)V")
	public abstract void renderAlpha(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int alpha);
}
