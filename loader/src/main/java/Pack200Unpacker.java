import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.jar.JarOutputStream;
import java.util.jar.Pack200;
import java.util.zip.GZIPInputStream;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!a")
public final class Pack200Unpacker extends unpack {

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(I[B)[B")
	private static byte[] pack200ToJar(@OriginalArg(1) byte[] in) throws IOException {
		@Pc(5) byte[] inWithHeader = new byte[in.length + 2];
		inWithHeader[0] = 0x1F;
		inWithHeader[1] = (byte) 0x8B;
		System.arraycopy(in, 0, inWithHeader, 2, in.length);
		@Pc(24) ByteArrayOutputStream out = new ByteArrayOutputStream();
		Pack200.newUnpacker().unpack(new GZIPInputStream(new ByteArrayInputStream(inWithHeader)), new JarOutputStream(out));
		return out.toByteArray();
	}

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "([B)V")
	public Pack200Unpacker(@OriginalArg(0) byte[] in) throws IOException {
		super(pack200ToJar(in));
	}
}
