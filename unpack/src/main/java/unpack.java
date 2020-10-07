import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("unpack!unpack")
public class unpack {

	@OriginalMember(owner = "unpack!unpack", name = "cache", descriptor = "Ljava/util/Hashtable;")
	protected final Hashtable<String, byte[]> cache = new Hashtable<>();

	@OriginalMember(owner = "unpack!unpack", name = "<init>", descriptor = "()V")
	protected unpack() {
	}

	@OriginalMember(owner = "unpack!unpack", name = "<init>", descriptor = "([B)V")
	public unpack(@OriginalArg(0) byte[] in) throws IOException {
		@Pc(9) byte[] temp = new byte[1000];
		@Pc(17) ZipInputStream zip = new ZipInputStream(new ByteArrayInputStream(in));
		while (true) {
			@Pc(26) String path;
			do {
				@Pc(20) ZipEntry entry = zip.getNextEntry();
				if (entry == null) {
					zip.close();
					return;
				}
				path = entry.getName();
			} while (!path.endsWith(".class"));
			@Pc(38) String name = path.substring(0, path.length() - 6);
			name = name.replace('/', '.');
			@Pc(47) ByteArrayOutputStream out = new ByteArrayOutputStream();
			while (true) {
				@Pc(53) int len = zip.read(temp, 0, 1000);
				if (len == -1) {
					@Pc(66) byte[] bytes = out.toByteArray();
					this.cache.put(name, bytes);
					break;
				}
				out.write(temp, 0, len);
			}
		}
	}

	@OriginalMember(owner = "unpack!unpack", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public final byte[] get(@OriginalArg(0) String name) {
		return this.cache.remove(name);
	}
}
