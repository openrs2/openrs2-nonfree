import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public final class MapChunk extends Node {

	@OriginalMember(owner = "client!e", name = "z", descriptor = "I")
	public final int displayMinX;

	@OriginalMember(owner = "client!e", name = "s", descriptor = "I")
	private final int sourceMinX;

	@OriginalMember(owner = "client!e", name = "u", descriptor = "I")
	private final int displayLevel;

	@OriginalMember(owner = "client!e", name = "y", descriptor = "I")
	private final int sourceMinZ;

	@OriginalMember(owner = "client!e", name = "w", descriptor = "I")
	private final int sourceMaxZ;

	@OriginalMember(owner = "client!e", name = "C", descriptor = "I")
	private final int sourceMaxX;

	@OriginalMember(owner = "client!e", name = "p", descriptor = "I")
	private final int sourceLevel;

	@OriginalMember(owner = "client!e", name = "r", descriptor = "I")
	public final int displayMaxZ;

	@OriginalMember(owner = "client!e", name = "o", descriptor = "I")
	public final int displayMinZ;

	@OriginalMember(owner = "client!e", name = "q", descriptor = "I")
	public final int displayMaxX;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public MapChunk(@OriginalArg(0) int sourceLevel, @OriginalArg(1) int displayLevel, @OriginalArg(2) int sourceMinX, @OriginalArg(3) int sourceMinZ, @OriginalArg(4) int sourceMaxX, @OriginalArg(5) int sourceMaxZ, @OriginalArg(6) int displayMinX, @OriginalArg(7) int displayMinZ, @OriginalArg(8) int displayMaxX, @OriginalArg(9) int displayMaxZ) {
		this.displayMinX = displayMinX;
		this.sourceMinX = sourceMinX;
		this.displayLevel = displayLevel;
		this.sourceMinZ = sourceMinZ;
		this.sourceMaxZ = sourceMaxZ;
		this.sourceMaxX = sourceMaxX;
		this.sourceLevel = sourceLevel;
		this.displayMaxZ = displayMaxZ;
		this.displayMinZ = displayMinZ;
		this.displayMaxX = displayMaxX;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BIII)Z")
	public final boolean containsSource(@OriginalArg(3) int level, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		return this.sourceLevel == level && x >= this.sourceMinX && x <= this.sourceMaxX && z >= this.sourceMinZ && this.sourceMaxZ >= z;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(III)Z")
	public final boolean containsDisplay(@OriginalArg(0) int x, @OriginalArg(1) int z) {
		return x >= this.displayMinX && x <= this.displayMaxX && z >= this.displayMinZ && z <= this.displayMaxZ;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IBI)Z")
	public final boolean containsSource(@OriginalArg(2) int x, @OriginalArg(0) int z) {
		return x >= this.sourceMinX && x <= this.sourceMaxX && z >= this.sourceMinZ && z <= this.sourceMaxZ;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIB[I)V")
	public final void convertSourceToDisplay(@OriginalArg(1) int x, @OriginalArg(0) int z, @OriginalArg(3) int[] position) {
		position[0] = this.displayLevel;
		position[2] = this.displayMinZ + z - this.sourceMinZ;
		position[1] = this.displayMinX + x - this.sourceMinX;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II[II)V")
	public final void convertDisplayToSource(@OriginalArg(1) int x, @OriginalArg(0) int z, @OriginalArg(2) int[] position) {
		position[1] = x + this.sourceMinX - this.displayMinX;
		position[0] = this.sourceLevel;
		position[2] = this.sourceMinZ + z - this.displayMinZ;
	}
}
