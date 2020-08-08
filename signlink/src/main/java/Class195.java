import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("signlink!kd")
public final class Class195 {

	@OriginalMember(owner = "signlink!kd", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "signlink!kd", name = "d", descriptor = "Ljava/io/File;")
	private final File aFile1;

	@OriginalMember(owner = "signlink!kd", name = "b", descriptor = "J")
	private final long aLong216;

	@OriginalMember(owner = "signlink!kd", name = "c", descriptor = "J")
	private long aLong217;

	@OriginalMember(owner = "signlink!kd", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
	public Class195(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aFile1 = arg0;
		this.aLong216 = arg2;
		this.aLong217 = 0L;
		@Pc(40) int local40 = this.aRandomAccessFile1.read();
		if (local40 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local40);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "signlink!kd", name = "b", descriptor = "(B)Ljava/io/File;")
	public final File method4850() {
		return this.aFile1;
	}

	@OriginalMember(owner = "signlink!kd", name = "a", descriptor = "(IIZ[B)V")
	public final void method4851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aLong216 < this.aLong217 + (long) arg0) {
			this.aRandomAccessFile1.seek(this.aLong216);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg2, arg1, arg0);
			this.aLong217 += arg0;
		}
	}

	@OriginalMember(owner = "signlink!kd", name = "a", descriptor = "(JB)V")
	public final void method4852(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong217 = arg0;
	}

	@OriginalMember(owner = "signlink!kd", name = "a", descriptor = "(I)V")
	public final void method4853() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "signlink!kd", name = "a", descriptor = "([BIII)I")
	public final int method4854(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg2, arg1);
		if (local6 > 0) {
			this.aLong217 += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "signlink!kd", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("Warning! fileondisk " + this.aFile1 + " not closed correctly using close(). Auto-closing instead. ");
			this.method4853();
		}
	}

	@OriginalMember(owner = "signlink!kd", name = "a", descriptor = "(B)J")
	public final long method4855() throws IOException {
		return this.aRandomAccessFile1.length();
	}
}
