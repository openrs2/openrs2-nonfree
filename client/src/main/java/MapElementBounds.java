import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public final class MapElementBounds extends Node {

	@OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
	public int iconMinX = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
	public int iconMaxY = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
	public int iconMinY = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
	public int textMaxX = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
	public int textMaxY = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
	public int textMinX = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
	public int iconMaxX = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
	public int textMinY = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!nb", name = "I", descriptor = "Lclient!fg;")
	public final MapElement element;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lclient!fg;)V")
	public MapElementBounds(@OriginalArg(0) MapElement element) {
		this.element = element;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)Z")
	public boolean isHovering(@OriginalArg(0) int x, @OriginalArg(2) int y) {
		if (x >= this.iconMinX && x <= this.iconMaxX && y >= this.iconMinY && y <= this.iconMaxY) {
			return true;
		} else {
			return x >= this.textMinX && x <= this.textMaxX && y >= this.textMinY && y <= this.textMaxY;
		}
	}
}
