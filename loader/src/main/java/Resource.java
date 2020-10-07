import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!b")
public final class Resource {

	@OriginalMember(owner = "loader!b", name = "d", descriptor = "[I")
	public int[] checksum = new int[20];

	@OriginalMember(owner = "loader!b", name = "e", descriptor = "I")
	public final int uncompressedSize;

	@OriginalMember(owner = "loader!b", name = "c", descriptor = "[Ljava/lang/String;")
	public final String[] loadingMessages;

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "Ljava/lang/String;")
	public final String source;

	@OriginalMember(owner = "loader!b", name = "f", descriptor = "I")
	public final int compressedSize;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/lang/String;")
	public final String destination;

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Resource(@OriginalArg(0) String destination, @OriginalArg(1) String source, @OriginalArg(2) String[] loadingMessages, @OriginalArg(3) int uncompressedSize, @OriginalArg(4) int compressedSize, @OriginalArg(5) int[] checksum) {
		this.uncompressedSize = uncompressedSize;
		this.loadingMessages = loadingMessages;
		this.source = source;
		this.compressedSize = compressedSize;
		this.destination = destination;
		this.checksum = checksum;
	}
}
