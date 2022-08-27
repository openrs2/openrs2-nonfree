import java.io.EOFException;
import java.io.File;
import java.io.IOException;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class BufferedFile {

	@OriginalMember(owner = "client!wl", name = "u", descriptor = "[J")
	public static final long[] CRC64_TABLE = new long[256];

	@OriginalMember(owner = "client!wl", name = "r", descriptor = "I")
	private int readLen;

	@OriginalMember(owner = "client!wl", name = "s", descriptor = "J")
	private long physicalPosition;

	@OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
	private int writeLen = 0;

	@OriginalMember(owner = "client!wl", name = "q", descriptor = "J")
	private long writePosition = -1L;

	@OriginalMember(owner = "client!wl", name = "l", descriptor = "J")
	private long readPosition = -1L;

	@OriginalMember(owner = "client!wl", name = "p", descriptor = "Lsignlink!kd;")
	private final FileOnDisk file;

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "J")
	private long physicalLength;

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "J")
	private long virtualLength;

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "[B")
	private final byte[] readBuffer;

	@OriginalMember(owner = "client!wl", name = "t", descriptor = "J")
	private long virtualPosition;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "[B")
	private final byte[] writeBuffer;

	static {
		for (@Pc(4) int i = 0; i < 256; i++) {
			@Pc(12) long crc = i;
			for (@Pc(14) int j = 0; j < 8; j++) {
				if ((crc & 0x1L) == 1L) {
					crc = crc >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					crc >>>= 1;
				}
			}
			CRC64_TABLE[i] = crc;
		}
	}

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lsignlink!kd;II)V")
	public BufferedFile(@OriginalArg(0) FileOnDisk file, @OriginalArg(1) int readBufferSize, @OriginalArg(2) int writeBufferSize) throws IOException {
		this.file = file;
		this.virtualLength = this.physicalLength = file.length();
		this.readBuffer = new byte[readBufferSize];
		this.virtualPosition = 0L;
		this.writeBuffer = new byte[writeBufferSize];
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I[BIB)V")
	public void write(@OriginalArg(1) byte[] b, @OriginalArg(0) int off, @OriginalArg(2) int len) throws IOException {
		try {
			if (this.virtualPosition + (long) len > this.virtualLength) {
				this.virtualLength = this.virtualPosition + (long) len;
			}
			if (this.writePosition != -1L && (this.virtualPosition < this.writePosition || this.virtualPosition > this.writePosition + (long) this.writeLen)) {
				this.flush();
			}
			if (this.writePosition != -1L && this.writePosition + (long) this.writeBuffer.length < (long) len + this.virtualPosition) {
				@Pc(99) int n = (int) ((long) this.writeBuffer.length + this.writePosition - this.virtualPosition);
				len -= n;
				ArrayUtils.copy(b, off, this.writeBuffer, (int) (this.virtualPosition - this.writePosition), n);
				off += n;
				this.virtualPosition += n;
				this.writeLen = this.writeBuffer.length;
				this.flush();
			}
			if (len > this.writeBuffer.length) {
				@Pc(149) long end = -1L;
				@Pc(151) long start = -1L;
				if (this.virtualPosition != this.physicalPosition) {
					this.file.seek(this.virtualPosition);
					this.physicalPosition = this.virtualPosition;
				}
				this.file.write(b, off, len);
				if (this.virtualPosition >= this.readPosition && this.readPosition + (long) this.readLen > this.virtualPosition) {
					start = this.virtualPosition;
				} else if (this.virtualPosition <= this.readPosition && (long) len + this.virtualPosition > this.readPosition) {
					start = this.readPosition;
				}
				this.physicalPosition += len;
				if ((long) len + this.virtualPosition > this.readPosition && (long) len + this.virtualPosition <= (long) this.readLen + this.readPosition) {
					end = (long) len + this.virtualPosition;
				} else if (this.virtualPosition < (long) this.readLen + this.readPosition && this.readPosition + (long) this.readLen <= (long) len + this.virtualPosition) {
					end = this.readPosition + (long) this.readLen;
				}
				if (this.physicalPosition > this.physicalLength) {
					this.physicalLength = this.physicalPosition;
				}
				if (start > -1L && end > start) {
					@Pc(328) int copyLen = (int) (end - start);
					ArrayUtils.copy(b, (int) ((long) off + start - this.virtualPosition), this.readBuffer, (int) (start - this.readPosition), copyLen);
				}
				this.virtualPosition += len;
			} else if (len > 0) {
				if (this.writePosition == -1L) {
					this.writePosition = this.virtualPosition;
				}
				ArrayUtils.copy(b, off, this.writeBuffer, (int) (this.virtualPosition - this.writePosition), len);
				this.virtualPosition += len;
				if ((long) this.writeLen < this.virtualPosition - this.writePosition) {
					this.writeLen = (int) (this.virtualPosition - this.writePosition);
				}
			}
		} catch (@Pc(419) IOException ex) {
			this.physicalPosition = -1L;
			throw ex;
		}
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V")
	private void fill() throws IOException {
		this.readLen = 0;
		if (this.physicalPosition != this.virtualPosition) {
			this.file.seek(this.virtualPosition);
			this.physicalPosition = this.virtualPosition;
		}
		this.readPosition = this.virtualPosition;
		while (this.readLen < this.readBuffer.length) {
			@Pc(49) int len = this.readBuffer.length - this.readLen;
			if (len > 200000000) {
				len = 200000000;
			}
			@Pc(67) int n = this.file.read(this.readBuffer, this.readLen, len);
			if (n == -1) {
				break;
			}
			this.physicalPosition += n;
			this.readLen += n;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)J")
	public long length() {
		return this.virtualLength;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZJ)V")
	public void seek(@OriginalArg(1) long position) throws IOException {
		if (position < 0L) {
			throw new IOException("Invalid seek to " + position + " in file " + this.getFile());
		}
		this.virtualPosition = position;
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)V")
	private void flush() throws IOException {
		if (this.writePosition == -1L) {
			return;
		}
		if (this.writePosition != this.physicalPosition) {
			this.file.seek(this.writePosition);
			this.physicalPosition = this.writePosition;
		}
		this.file.write(this.writeBuffer, 0, this.writeLen);
		this.physicalPosition += this.writeLen;
		if (this.physicalPosition > this.physicalLength) {
			this.physicalLength = this.physicalPosition;
		}
		@Pc(58) long start = -1L;
		if ((long) this.writeLen + this.writePosition > this.readPosition && this.writePosition + (long) this.writeLen <= (long) this.readLen + this.readPosition) {
			start = this.writePosition + (long) this.writeLen;
		} else if (this.writePosition < this.readPosition + (long) this.readLen && this.readPosition + (long) this.readLen <= this.writePosition + (long) this.writeLen) {
			start = (long) this.readLen + this.readPosition;
		}
		@Pc(129) long end = -1L;
		if (this.readPosition <= this.writePosition && this.writePosition < (long) this.readLen + this.readPosition) {
			end = this.writePosition;
		} else if (this.writePosition <= this.readPosition && this.readPosition < this.writePosition + (long) this.writeLen) {
			end = this.readPosition;
		}
		if (end > -1L && end < start) {
			@Pc(203) int copyLen = (int) (start - end);
			ArrayUtils.copy(this.writeBuffer, (int) (end - this.writePosition), this.readBuffer, (int) (end - this.readPosition), copyLen);
		}
		this.writePosition = -1L;
		this.writeLen = 0;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I[BII)V")
	public void read(@OriginalArg(1) byte[] b, @OriginalArg(2) int off, @OriginalArg(3) int len) throws IOException {
		try {
			if (b.length < len) {
				throw new ArrayIndexOutOfBoundsException(len - b.length);
			}
			if (this.writePosition != -1L && this.virtualPosition >= this.writePosition && this.writePosition + (long) this.writeLen >= (long) len + this.virtualPosition) {
				ArrayUtils.copy(this.writeBuffer, (int) (this.virtualPosition - this.writePosition), b, 0, len);
				this.virtualPosition += len;
				return;
			}
			@Pc(76) int originalLen = len;
			@Pc(81) long originalPosition = this.virtualPosition;
			if (this.virtualPosition >= this.readPosition && this.virtualPosition < this.readPosition + (long) this.readLen) {
				@Pc(110) int n = (int) ((long) this.readLen + this.readPosition - this.virtualPosition);
				if (n > len) {
					n = len;
				}
				ArrayUtils.copy(this.readBuffer, (int) (this.virtualPosition - this.readPosition), b, 0, n);
				len -= n;
				this.virtualPosition += n;
				off = n;
			}
			if (len > this.readBuffer.length) {
				this.file.seek(this.virtualPosition);
				this.physicalPosition = this.virtualPosition;
				while (len > 0) {
					@Pc(178) int n = this.file.read(b, off, len);
					if (n == -1) {
						break;
					}
					this.physicalPosition += n;
					len -= n;
					off += n;
					this.virtualPosition += n;
				}
			} else if (len > 0) {
				@Pc(212) int copyLen = len;
				this.fill();
				if (this.readLen < len) {
					copyLen = this.readLen;
				}
				len -= copyLen;
				ArrayUtils.copy(this.readBuffer, 0, b, off, copyLen);
				this.virtualPosition += copyLen;
				off += copyLen;
			}
			if (this.writePosition != -1L) {
				if (this.virtualPosition < this.writePosition && len > 0) {
					@Pc(280) int end = (int) (this.writePosition - this.virtualPosition) + off;
					if (end > len + off) {
						end = len + off;
					}
					while (off < end) {
						b[off++] = 0;
						this.virtualPosition++;
						len--;
					}
				}
				@Pc(316) long end = -1L;
				@Pc(318) long start = -1L;
				if (originalPosition <= this.writePosition && this.writePosition < originalPosition + (long) originalLen) {
					start = this.writePosition;
				} else if (originalPosition >= this.writePosition && (long) this.writeLen + this.writePosition > originalPosition) {
					start = originalPosition;
				}
				if ((long) this.writeLen + this.writePosition > originalPosition && this.writePosition + (long) this.writeLen <= (long) originalLen + originalPosition) {
					end = (long) this.writeLen + this.writePosition;
				} else if (this.writePosition < (long) originalLen + originalPosition && (long) originalLen + originalPosition <= (long) this.writeLen + this.writePosition) {
					end = (long) originalLen + originalPosition;
				}
				if (start > -1L && start < end) {
					@Pc(440) int copyLen = (int) (end - start);
					ArrayUtils.copy(this.writeBuffer, (int) (start - this.writePosition), b, (int) (start - originalPosition), copyLen);
					if (end > this.virtualPosition) {
						len = (int) ((long) len + this.virtualPosition - end);
						this.virtualPosition = end;
					}
				}
			}
		} catch (@Pc(479) IOException ex) {
			this.physicalPosition = -1L;
			throw ex;
		}
		if (len > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "(B)Ljava/io/File;")
	private File getFile() {
		return this.file.getFile();
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I[B)V")
	public void read(@OriginalArg(1) byte[] b) throws IOException {
		this.read(b, 0, b.length);
	}
}
