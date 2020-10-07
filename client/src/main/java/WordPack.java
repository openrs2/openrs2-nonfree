import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class WordPack {
	@OriginalMember(owner = "client!ef", name = "a", descriptor = "Lclient!oj;")
	private static HuffmanCodec huffmanCodec;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!oj;)V")
	public static void init(@OriginalArg(1) HuffmanCodec huffmanCodec) {
		WordPack.huffmanCodec = huffmanCodec;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILclient!fd;)Ljava/lang/String;")
	public static String readString(@OriginalArg(1) Buffer buffer) {
		return readStringInternal(buffer);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZILclient!fd;)Ljava/lang/String;")
	private static String readStringInternal(@OriginalArg(2) Buffer buffer) {
		try {
			@Pc(12) int len = buffer.readUnsignedShortSmart();
			if (len > 32767) {
				len = 32767;
			}
			@Pc(24) byte[] bytes = new byte[len];
			buffer.position += huffmanCodec.decode(buffer.bytes, buffer.position, bytes, 0, len);
			return Cp1252Charset.decodeString(bytes, 0, len);
		} catch (@Pc(48) Exception ex) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!fd;Ljava/lang/String;I)I")
	public static int writeString(@OriginalArg(0) Buffer buffer, @OriginalArg(1) String s) {
		@Pc(6) int previousPosition = buffer.position;
		@Pc(10) byte[] bytes = Cp1252Charset.encodeString(s);
		buffer.writeUnsignedShortSmart(bytes.length);
		buffer.position += huffmanCodec.encode(bytes, 0, buffer.bytes, buffer.position, bytes.length);
		return buffer.position - previousPosition;
	}
}
