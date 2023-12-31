import java.util.zip.Inflater;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class GzipDecompressor {

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater inflater;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
	public GzipDecompressor() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(III)V")
	private GzipDecompressor(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!fd;B[B)V")
	public void gunzip(@OriginalArg(0) Buffer in, @OriginalArg(2) byte[] out) {
		if (in.bytes[in.position] != 0x1F || in.bytes[in.position + 1] != (byte) 0x8B) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.inflater == null) {
			this.inflater = new Inflater(true);
		}
		try {
			this.inflater.setInput(in.bytes, in.position + 10, in.bytes.length - in.position - 18);
			this.inflater.inflate(out);
		} catch (@Pc(61) Exception ex) {
			this.inflater.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.inflater.reset();
	}
}
