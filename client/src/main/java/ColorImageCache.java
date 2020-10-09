import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class ColorImageCache {

	@OriginalMember(owner = "client!md", name = "m", descriptor = "I")
	private int singleRow = -1;

	@OriginalMember(owner = "client!md", name = "h", descriptor = "I")
	private int size = 0;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "Lclient!ll;")
	private LinkedList recentlyUsed = new LinkedList();

	@OriginalMember(owner = "client!md", name = "r", descriptor = "Z")
	public boolean invalid = false;

	@OriginalMember(owner = "client!md", name = "q", descriptor = "I")
	private final int capacity;

	@OriginalMember(owner = "client!md", name = "g", descriptor = "I")
	private final int height;

	@OriginalMember(owner = "client!md", name = "f", descriptor = "[Lclient!mc;")
	private ColorImageCacheEntry[] entries;

	@OriginalMember(owner = "client!md", name = "k", descriptor = "[[[I")
	private int[][][] pixels;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(III)V")
	public ColorImageCache(@OriginalArg(0) int capacity, @OriginalArg(1) int height, @OriginalArg(2) int width) {
		this.capacity = capacity;
		this.height = height;
		this.entries = new ColorImageCacheEntry[this.height];
		this.pixels = new int[this.capacity][3][width];
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
	public final void clear() {
		for (@Pc(11) int i = 0; i < this.capacity; i++) {
			this.pixels[i][0] = null;
			this.pixels[i][1] = null;
			this.pixels[i][2] = null;
			this.pixels[i] = null;
		}
		this.pixels = null;
		this.entries = null;
		this.recentlyUsed.clear();
		this.recentlyUsed = null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)[[[I")
	public final int[][][] get() {
		if (this.capacity != this.height) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int row = 0; row < this.capacity; row++) {
			this.entries[row] = ColorImageCacheEntry.VALID;
		}
		return this.pixels;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II)[[I")
	public final int[][] get(@OriginalArg(0) int row) {
		if (this.height == this.capacity) {
			this.invalid = this.entries[row] == null;
			this.entries[row] = ColorImageCacheEntry.VALID;
			return this.pixels[row];
		} else if (this.capacity == 1) {
			this.invalid = row != this.singleRow;
			this.singleRow = row;
			return this.pixels[0];
		} else {
			@Pc(30) ColorImageCacheEntry entry = this.entries[row];
			if (entry == null) {
				this.invalid = true;
				if (this.capacity <= this.size) {
					@Pc(47) ColorImageCacheEntry lruEntry = (ColorImageCacheEntry) this.recentlyUsed.tail();
					entry = new ColorImageCacheEntry(row, lruEntry.index);
					this.entries[lruEntry.row] = null;
					lruEntry.unlink();
				} else {
					entry = new ColorImageCacheEntry(row, this.size);
					this.size++;
				}
				this.entries[row] = entry;
			} else {
				this.invalid = false;
			}
			this.recentlyUsed.addHead(entry);
			return this.pixels[entry.index];
		}
	}
}
