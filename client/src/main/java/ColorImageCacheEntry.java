import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public final class ColorImageCacheEntry extends Node {

	@OriginalMember(owner = "client!ea", name = "y", descriptor = "Lclient!mc;")
	public static final ColorImageCacheEntry VALID = new ColorImageCacheEntry(0, 0);

	@OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
	public final int row;

	@OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
	public final int index;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(II)V")
	public ColorImageCacheEntry(@OriginalArg(0) int row, @OriginalArg(1) int index) {
		this.row = row;
		this.index = index;
	}
}
