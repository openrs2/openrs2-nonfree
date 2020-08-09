import java.util.zip.Inflater;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!k")
public final class GzipDecompressor {

	@OriginalMember(owner = "unpackclass!k", name = "a", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater inflater;

	@OriginalMember(owner = "unpackclass!k", name = "<init>", descriptor = "()V")
	public GzipDecompressor() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "unpackclass!k", name = "<init>", descriptor = "(III)V")
	private GzipDecompressor(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "unpackclass!k", name = "a", descriptor = "(Lunpackclass!e;[B)V")
	public final void gunzip(@OriginalArg(0) Buffer in, @OriginalArg(1) byte[] out) {
		if (in.bytes[in.position] != 0x1F || in.bytes[in.position + 1] != (byte) 0x8B) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.inflater == null) {
			this.inflater = new Inflater(true);
		}
		try {
			this.inflater.setInput(in.bytes, in.position + 10, in.bytes.length - in.position - 10 - 8);
			this.inflater.inflate(out);
		} catch (@Pc(55) Exception ex) {
			this.inflater.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.inflater.reset();
	}
}
