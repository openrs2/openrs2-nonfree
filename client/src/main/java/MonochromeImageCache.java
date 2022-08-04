import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class MonochromeImageCache {

	@OriginalMember(owner = "client!da", name = "a", descriptor = "[I")
	public static final int[] PERLIN_FADE = new int[4096];

	@OriginalMember(owner = "client!da", name = "g", descriptor = "I")
	private int size = 0;

	@OriginalMember(owner = "client!da", name = "n", descriptor = "I")
	private int singleRow = -1;

	@OriginalMember(owner = "client!da", name = "s", descriptor = "Lclient!ll;")
	private LinkedList recentlyUsed = new LinkedList();

	@OriginalMember(owner = "client!da", name = "t", descriptor = "Z")
	public boolean invalid = false;

	@OriginalMember(owner = "client!da", name = "k", descriptor = "I")
	private final int height;

	@OriginalMember(owner = "client!da", name = "f", descriptor = "[Lclient!ol;")
	private MonochromeImageCacheEntry[] entries;

	@OriginalMember(owner = "client!da", name = "b", descriptor = "I")
	private final int capacity;

	@OriginalMember(owner = "client!da", name = "i", descriptor = "[[I")
	private int[][] pixels;

	static {
		for (@Pc(6) int t = 0; t < 4096; t++) {
			PERLIN_FADE[t] = TextureOp.perlinFade(t);
		}
	}

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(III)V")
	public MonochromeImageCache(@OriginalArg(0) int capacity, @OriginalArg(1) int height, @OriginalArg(2) int width) {
		this.height = height;
		this.entries = new MonochromeImageCacheEntry[this.height];
		this.capacity = capacity;
		this.pixels = new int[this.capacity][width];
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)[[I")
	public final int[][] get() {
		if (this.capacity != this.height) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(29) int row = 0; row < this.capacity; row++) {
			this.entries[row] = MonochromeImageCacheEntry.VALID;
		}
		return this.pixels;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)[I")
	public final int[] get(@OriginalArg(0) int row) {
		if (this.capacity == this.height) {
			this.invalid = this.entries[row] == null;
			this.entries[row] = MonochromeImageCacheEntry.VALID;
			return this.pixels[row];
		} else if (this.capacity == 1) {
			this.invalid = row != this.singleRow;
			this.singleRow = row;
			return this.pixels[0];
		} else {
			@Pc(33) MonochromeImageCacheEntry entry = this.entries[row];
			if (entry == null) {
				this.invalid = true;
				if (this.capacity > this.size) {
					entry = new MonochromeImageCacheEntry(row, this.size);
					this.size++;
				} else {
					@Pc(69) MonochromeImageCacheEntry lruEntry = (MonochromeImageCacheEntry) this.recentlyUsed.tail();
					entry = new MonochromeImageCacheEntry(row, lruEntry.index);
					this.entries[lruEntry.row] = null;
					lruEntry.unlink();
				}
				this.entries[row] = entry;
			} else {
				this.invalid = false;
			}
			this.recentlyUsed.addHead(entry);
			return this.pixels[entry.index];
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
	public final void clear() {
		for (@Pc(7) int i = 0; i < this.capacity; i++) {
			this.pixels[i] = null;
		}
		this.pixels = null;
		this.entries = null;
		this.recentlyUsed.clear();
		this.recentlyUsed = null;
	}
}
