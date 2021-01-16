import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class MapArea extends SecondaryNode {

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILclient!fd;)Lclient!wg;")
	public static MapArea create(@OriginalArg(0) int id, @OriginalArg(2) Buffer buffer) {
		@Pc(41) MapArea area = new MapArea(id, buffer.readString(), buffer.readString(), buffer.readInt(), buffer.readInt(), buffer.readUnsignedByte() == 1, buffer.readUnsignedByte());
		@Pc(49) int len = buffer.readUnsignedByte();
		for (@Pc(51) int i = 0; i < len; i++) {
			area.chunks.addTail(new MapAreaChunk(buffer.readUnsignedByte(), buffer.readUnsignedByte(), buffer.readUnsignedShort(), buffer.readUnsignedShort(), buffer.readUnsignedShort(), buffer.readUnsignedShort(), buffer.readUnsignedShort(), buffer.readUnsignedShort(), buffer.readUnsignedShort(), buffer.readUnsignedShort()));
		}
		area.computeBounds();
		return area;
	}

	@OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
	public int displayMinX = 12800;

	@OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
	public int displayMinZ = 12800;

	@OriginalMember(owner = "client!wg", name = "I", descriptor = "Z")
	public boolean valid = true;

	@OriginalMember(owner = "client!wg", name = "T", descriptor = "I")
	public int displayMaxZ = 0;

	@OriginalMember(owner = "client!wg", name = "N", descriptor = "I")
	public int displayMaxX = 0;

	@OriginalMember(owner = "client!wg", name = "C", descriptor = "I")
	public int backgroundColor = -1;

	@OriginalMember(owner = "client!wg", name = "S", descriptor = "I")
	public int defaultZoom = -1;

	@OriginalMember(owner = "client!wg", name = "X", descriptor = "Ljava/lang/String;")
	public final String name;

	@OriginalMember(owner = "client!wg", name = "U", descriptor = "Ljava/lang/String;")
	public final String group;

	@OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
	public final int defaultPosition;

	@OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
	public final int id;

	@OriginalMember(owner = "client!wg", name = "M", descriptor = "Lclient!ll;")
	public final LinkedList chunks;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
	private MapArea(@OriginalArg(0) int id, @OriginalArg(1) String group, @OriginalArg(2) String name, @OriginalArg(3) int defaultPosition, @OriginalArg(4) int backgroundColor, @OriginalArg(5) boolean valid, @OriginalArg(6) int defaultZoom) {
		this.name = name;
		this.valid = valid;
		this.group = group;
		this.defaultPosition = defaultPosition;
		this.id = id;
		this.backgroundColor = backgroundColor;
		this.defaultZoom = defaultZoom;
		if (this.defaultZoom == 255) {
			this.defaultZoom = 0;
		}
		this.chunks = new LinkedList();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(III[II)Z")
	public final boolean convertSourceToDisplay(@OriginalArg(2) int level, @OriginalArg(4) int x, @OriginalArg(0) int z, @OriginalArg(3) int[] position) {
		for (@Pc(16) MapAreaChunk chunk = (MapAreaChunk) this.chunks.head(); chunk != null; chunk = (MapAreaChunk) this.chunks.next()) {
			if (chunk.containsSource(level, x, z)) {
				chunk.convertSourceToDisplay(x, z, position);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)Z")
	public final boolean containsSource(@OriginalArg(1) int x, @OriginalArg(2) int z) {
		for (@Pc(11) MapAreaChunk chunk = (MapAreaChunk) this.chunks.head(); chunk != null; chunk = (MapAreaChunk) this.chunks.next()) {
			if (chunk.containsSource(x, z)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "([IIBI)Z")
	public final boolean convertSourceToDisplay(@OriginalArg(3) int x, @OriginalArg(1) int z, @OriginalArg(0) int[] position) {
		for (@Pc(19) MapAreaChunk chunk = (MapAreaChunk) this.chunks.head(); chunk != null; chunk = (MapAreaChunk) this.chunks.next()) {
			if (chunk.containsSource(x, z)) {
				chunk.convertSourceToDisplay(x, z, position);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIB[I)Z")
	public final boolean convertDisplayToSource(@OriginalArg(0) int x, @OriginalArg(1) int z, @OriginalArg(3) int[] position) {
		for (@Pc(11) MapAreaChunk chunk = (MapAreaChunk) this.chunks.head(); chunk != null; chunk = (MapAreaChunk) this.chunks.next()) {
			if (chunk.containsDisplay(x, z)) {
				chunk.convertDisplayToSource(x, z, position);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V")
	public final void computeBounds() {
		this.displayMinZ = 12800;
		this.displayMaxZ = 0;
		this.displayMaxX = 0;
		this.displayMinX = 12800;
		for (@Pc(23) MapAreaChunk chunk = (MapAreaChunk) this.chunks.head(); chunk != null; chunk = (MapAreaChunk) this.chunks.next()) {
			if (chunk.displayMaxX > this.displayMaxX) {
				this.displayMaxX = chunk.displayMaxX;
			}
			if (chunk.displayMinX < this.displayMinX) {
				this.displayMinX = chunk.displayMinX;
			}
			if (chunk.displayMinZ < this.displayMinZ) {
				this.displayMinZ = chunk.displayMinZ;
			}
			if (chunk.displayMaxZ > this.displayMaxZ) {
				this.displayMaxZ = chunk.displayMaxZ;
			}
		}
	}
}
