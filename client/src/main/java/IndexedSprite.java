import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public abstract class IndexedSprite {

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
	public int xOffset;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
	public int yOffset;

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
	public int width;

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
	public int innerHeight;

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
	public int innerWidth;

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
	public int height;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
	protected IndexedSprite() {
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V")
	public abstract void renderTransparent(@OriginalArg(0) int x, @OriginalArg(1) int y);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)V")
	public abstract void renderAlpha(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int alpha);
}
