import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Js5Compression {
	@OriginalMember(owner = "client!gh", name = "e", descriptor = "Lclient!jb;")
	private static final GzipDecompressor GZIP_DECOMPRESSOR = new GzipDecompressor();

	@OriginalMember(owner = "client!wf", name = "Tc", descriptor = "I")
	private static final int MAX_LENGTH = 0;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z[B)[B")
	public static byte[] uncompress(@OriginalArg(1) byte[] in) {
		@Pc(8) Buffer buffer = new Buffer(in);
		@Pc(12) int type = buffer.readUnsignedByte();
		@Pc(16) int len = buffer.readInt();
		if (len < 0 || MAX_LENGTH != 0 && len > MAX_LENGTH) {
			throw new RuntimeException();
		} else if (type == 0) {
			@Pc(47) byte[] out = new byte[len];
			buffer.readBytes(out, len);
			return out;
		} else {
			@Pc(59) int uncompressedLen = buffer.readInt();
			if (uncompressedLen < 0 || MAX_LENGTH != 0 && uncompressedLen > MAX_LENGTH) {
				throw new RuntimeException();
			}
			@Pc(84) byte[] out = new byte[uncompressedLen];
			if (type == 1) {
				Bzip2Decompressor.bunzip2(out, uncompressedLen, in, len);
			} else {
				GZIP_DECOMPRESSOR.gunzip(buffer, out);
			}
			return out;
		}
	}
}
