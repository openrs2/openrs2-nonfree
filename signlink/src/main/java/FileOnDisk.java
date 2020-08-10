import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("signlink!kd")
public final class FileOnDisk {

	@OriginalMember(owner = "signlink!kd", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile randomAccessFile;

	@OriginalMember(owner = "signlink!kd", name = "d", descriptor = "Ljava/io/File;")
	private final File file;

	@OriginalMember(owner = "signlink!kd", name = "b", descriptor = "J")
	private final long maxLength;

	@OriginalMember(owner = "signlink!kd", name = "c", descriptor = "J")
	private long position;

	@OriginalMember(owner = "signlink!kd", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public FileOnDisk(@OriginalArg(0) File file, @OriginalArg(1) String mode, @OriginalArg(2) long maxLength) throws IOException {
		if (maxLength == -1L) {
			maxLength = Long.MAX_VALUE;
		}
		if (file.length() > maxLength) {
			file.delete();
		}
		this.randomAccessFile = new RandomAccessFile(file, mode);
		this.file = file;
		this.maxLength = maxLength;
		this.position = 0L;
		@Pc(40) int firstByte = this.randomAccessFile.read();
		if (firstByte != -1 && !mode.equals("r")) {
			this.randomAccessFile.seek(0L);
			this.randomAccessFile.write(firstByte);
		}
		this.randomAccessFile.seek(0L);
	}

	@OriginalMember(owner = "signlink!kd", name = "b", descriptor = "(B)Ljava/io/File;")
	public final File getFile() {
		return this.file;
	}

	@OriginalMember(owner = "signlink!kd", name = "a", descriptor = "(IIZ[B)V")
	public final void write(@OriginalArg(3) byte[] bytes, @OriginalArg(1) int off, @OriginalArg(0) int len) throws IOException {
		if (this.position + (long) len > this.maxLength) {
			this.randomAccessFile.seek(this.maxLength);
			this.randomAccessFile.write(1);
			throw new EOFException();
		} else {
			this.randomAccessFile.write(bytes, off, len);
			this.position += len;
		}
	}

	@OriginalMember(owner = "signlink!kd", name = "a", descriptor = "(JB)V")
	public final void seek(@OriginalArg(0) long position) throws IOException {
		this.randomAccessFile.seek(position);
		this.position = position;
	}

	@OriginalMember(owner = "signlink!kd", name = "a", descriptor = "(I)V")
	public final void close() throws IOException {
		if (this.randomAccessFile != null) {
			this.randomAccessFile.close();
			this.randomAccessFile = null;
		}
	}

	@OriginalMember(owner = "signlink!kd", name = "a", descriptor = "([BIII)I")
	public final int read(@OriginalArg(0) byte[] bytes, @OriginalArg(3) int off, @OriginalArg(2) int len) throws IOException {
		@Pc(6) int n = this.randomAccessFile.read(bytes, off, len);
		if (n > 0) {
			this.position += n;
		}
		return n;
	}

	@OriginalMember(owner = "signlink!kd", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		if (this.randomAccessFile != null) {
			System.out.println("Warning! fileondisk " + this.file + " not closed correctly using close(). Auto-closing instead. ");
			this.close();
		}
	}

	@OriginalMember(owner = "signlink!kd", name = "a", descriptor = "(B)J")
	public final long length() throws IOException {
		return this.randomAccessFile.length();
	}
}
