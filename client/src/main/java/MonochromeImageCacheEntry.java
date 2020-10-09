import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public final class MonochromeImageCacheEntry extends Node {

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "Lclient!ol;")
	public static final MonochromeImageCacheEntry VALID = new MonochromeImageCacheEntry(0, 0);

	@OriginalMember(owner = "client!ol", name = "s", descriptor = "I")
	public final int row;

	@OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
	public final int index;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(II)V")
	public MonochromeImageCacheEntry(@OriginalArg(0) int row, @OriginalArg(1) int index) {
		this.row = row;
		this.index = index;
	}
}
