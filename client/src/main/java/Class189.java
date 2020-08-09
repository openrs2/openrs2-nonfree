import java.io.EOFException;
import java.io.File;
import java.io.IOException;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class189 {

	@OriginalMember(owner = "client!wl", name = "u", descriptor = "[J")
	public static final long[] aLongArray58 = new long[256];

	@OriginalMember(owner = "client!wl", name = "r", descriptor = "I")
	private int anInt6061;

	@OriginalMember(owner = "client!wl", name = "s", descriptor = "J")
	private long aLong209;

	@OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
	private int anInt6057 = 0;

	@OriginalMember(owner = "client!wl", name = "q", descriptor = "J")
	private long aLong208 = -1L;

	@OriginalMember(owner = "client!wl", name = "l", descriptor = "J")
	private long aLong207 = -1L;

	@OriginalMember(owner = "client!wl", name = "p", descriptor = "Lsignlink!kd;")
	private final FileOnDisk aClass195_1;

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "J")
	private long aLong205;

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "J")
	private long aLong206;

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "[B")
	private final byte[] aByteArray76;

	@OriginalMember(owner = "client!wl", name = "t", descriptor = "J")
	private long aLong210;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "[B")
	private final byte[] aByteArray75;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(12) long local12 = (long) local4;
			for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
				if ((local12 & 0x1L) == 1L) {
					local12 = local12 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local12 >>>= 1;
				}
			}
			aLongArray58[local4] = local12;
		}
	}

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lsignlink!kd;II)V")
	public Class189(@OriginalArg(0) FileOnDisk arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass195_1 = arg0;
		this.aLong206 = this.aLong205 = arg0.length();
		this.aByteArray76 = new byte[arg1];
		this.aLong210 = 0L;
		this.aByteArray75 = new byte[arg2];
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I[BIB)V")
	public final void method4795(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (this.aLong206 < (long) arg2 + this.aLong210) {
				this.aLong206 = this.aLong210 + (long) arg2;
			}
			if (this.aLong208 != -1L && (this.aLong210 < this.aLong208 || this.aLong210 > this.aLong208 + (long) this.anInt6057)) {
				this.method4800();
			}
			if (this.aLong208 != -1L && this.aLong208 + (long) this.aByteArray75.length < (long) arg2 + this.aLong210) {
				@Pc(99) int local99 = (int) ((long) this.aByteArray75.length + this.aLong208 - this.aLong210);
				arg2 -= local99;
				Static8.method80(arg1, arg0, this.aByteArray75, (int) (this.aLong210 - this.aLong208), local99);
				arg0 += local99;
				this.aLong210 += local99;
				this.anInt6057 = this.aByteArray75.length;
				this.method4800();
			}
			if (arg2 > this.aByteArray75.length) {
				@Pc(149) long local149 = -1L;
				@Pc(151) long local151 = -1L;
				if (this.aLong210 != this.aLong209) {
					this.aClass195_1.seek(this.aLong210);
					this.aLong209 = this.aLong210;
				}
				this.aClass195_1.write(arg1, arg0, arg2);
				if (this.aLong210 >= this.aLong207 && this.aLong207 + (long) this.anInt6061 > this.aLong210) {
					local151 = this.aLong210;
				} else if (this.aLong210 <= this.aLong207 && (long) arg2 + this.aLong210 > this.aLong207) {
					local151 = this.aLong207;
				}
				this.aLong209 += arg2;
				if ((long) arg2 + this.aLong210 > this.aLong207 && (long) arg2 + this.aLong210 <= (long) this.anInt6061 + this.aLong207) {
					local149 = (long) arg2 + this.aLong210;
				} else if (this.aLong210 < (long) this.anInt6061 + this.aLong207 && this.aLong207 + (long) this.anInt6061 <= (long) arg2 + this.aLong210) {
					local149 = this.aLong207 + (long) this.anInt6061;
				}
				if (this.aLong209 > this.aLong205) {
					this.aLong205 = this.aLong209;
				}
				if (local151 > -1L && local149 > local151) {
					@Pc(328) int local328 = (int) (local149 - local151);
					Static8.method80(arg1, (int) ((long) arg0 + local151 - this.aLong210), this.aByteArray76, (int) (local151 - this.aLong207), local328);
				}
				this.aLong210 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong208 == -1L) {
					this.aLong208 = this.aLong210;
				}
				Static8.method80(arg1, arg0, this.aByteArray75, (int) (this.aLong210 - this.aLong208), arg2);
				this.aLong210 += arg2;
				if ((long) this.anInt6057 < this.aLong210 - this.aLong208) {
					this.anInt6057 = (int) (this.aLong210 - this.aLong208);
				}
			}
		} catch (@Pc(419) IOException local419) {
			this.aLong209 = -1L;
			throw local419;
		}
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V")
	private void method4796() throws IOException {
		this.anInt6061 = 0;
		if (this.aLong209 != this.aLong210) {
			this.aClass195_1.seek(this.aLong210);
			this.aLong209 = this.aLong210;
		}
		this.aLong207 = this.aLong210;
		while (this.anInt6061 < this.aByteArray76.length) {
			@Pc(49) int local49 = this.aByteArray76.length - this.anInt6061;
			if (local49 > 200000000) {
				local49 = 200000000;
			}
			@Pc(67) int local67 = this.aClass195_1.read(this.aByteArray76, local49, this.anInt6061);
			if (local67 == -1) {
				break;
			}
			this.aLong209 += local67;
			this.anInt6061 += local67;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)J")
	public final long method4797() {
		return this.aLong206;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZJ)V")
	public final void method4798(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method4802());
		}
		this.aLong210 = arg0;
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)V")
	private void method4800() throws IOException {
		if (this.aLong208 == -1L) {
			return;
		}
		if (this.aLong208 != this.aLong209) {
			this.aClass195_1.seek(this.aLong208);
			this.aLong209 = this.aLong208;
		}
		this.aClass195_1.write(this.aByteArray75, 0, this.anInt6057);
		this.aLong209 += this.anInt6057;
		if (this.aLong209 > this.aLong205) {
			this.aLong205 = this.aLong209;
		}
		@Pc(58) long local58 = -1L;
		if ((long) this.anInt6057 + this.aLong208 > this.aLong207 && this.aLong208 + (long) this.anInt6057 <= (long) this.anInt6061 + this.aLong207) {
			local58 = this.aLong208 + (long) this.anInt6057;
		} else if (this.aLong208 < this.aLong207 + (long) this.anInt6061 && this.aLong207 + (long) this.anInt6061 <= this.aLong208 + (long) this.anInt6057) {
			local58 = (long) this.anInt6061 + this.aLong207;
		}
		@Pc(129) long local129 = -1L;
		if (this.aLong207 <= this.aLong208 && this.aLong208 < (long) this.anInt6061 + this.aLong207) {
			local129 = this.aLong208;
		} else if (this.aLong208 <= this.aLong207 && this.aLong207 < this.aLong208 + (long) this.anInt6057) {
			local129 = this.aLong207;
		}
		if (local129 > -1L && local129 < local58) {
			@Pc(203) int local203 = (int) (local58 - local129);
			Static8.method80(this.aByteArray75, (int) (local129 - this.aLong208), this.aByteArray76, (int) (local129 - this.aLong207), local203);
		}
		this.aLong208 = -1L;
		this.anInt6057 = 0;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I[BII)V")
	public final void method4801(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.aLong208 != -1L && this.aLong210 >= this.aLong208 && this.aLong208 + (long) this.anInt6057 >= (long) arg2 + this.aLong210) {
				Static8.method80(this.aByteArray75, (int) (this.aLong210 - this.aLong208), arg0, 0, arg2);
				this.aLong210 += arg2;
				return;
			}
			@Pc(76) int local76 = arg2;
			@Pc(81) long local81 = this.aLong210;
			if (this.aLong207 <= this.aLong210 && this.aLong207 + (long) this.anInt6061 > this.aLong210) {
				@Pc(110) int local110 = (int) ((long) this.anInt6061 + this.aLong207 - this.aLong210);
				if (local110 > arg2) {
					local110 = arg2;
				}
				Static8.method80(this.aByteArray76, (int) (this.aLong210 - this.aLong207), arg0, 0, local110);
				arg2 -= local110;
				this.aLong210 += local110;
				arg1 = local110;
			}
			if (this.aByteArray76.length < arg2) {
				this.aClass195_1.seek(this.aLong210);
				this.aLong209 = this.aLong210;
				while (arg2 > 0) {
					@Pc(178) int local178 = this.aClass195_1.read(arg0, arg2, arg1);
					if (local178 == -1) {
						break;
					}
					this.aLong209 += local178;
					arg2 -= local178;
					arg1 += local178;
					this.aLong210 += local178;
				}
			} else if (arg2 > 0) {
				@Pc(212) int local212 = arg2;
				this.method4796();
				if (this.anInt6061 < arg2) {
					local212 = this.anInt6061;
				}
				arg2 -= local212;
				Static8.method80(this.aByteArray76, 0, arg0, arg1, local212);
				this.aLong210 += local212;
				arg1 += local212;
			}
			if (this.aLong208 != -1L) {
				if (this.aLong210 < this.aLong208 && arg2 > 0) {
					@Pc(280) int local280 = arg1 + (int) (this.aLong208 - this.aLong210);
					if (local280 > arg2 + arg1) {
						local280 = arg2 + arg1;
					}
					while (local280 > arg1) {
						arg0[arg1++] = 0;
						this.aLong210++;
						arg2--;
					}
				}
				@Pc(316) long local316 = -1L;
				@Pc(318) long local318 = -1L;
				if (local81 <= this.aLong208 && this.aLong208 < local81 + (long) local76) {
					local318 = this.aLong208;
				} else if (local81 >= this.aLong208 && (long) this.anInt6057 + this.aLong208 > local81) {
					local318 = local81;
				}
				if ((long) this.anInt6057 + this.aLong208 > local81 && this.aLong208 + (long) this.anInt6057 <= (long) local76 + local81) {
					local316 = (long) this.anInt6057 + this.aLong208;
				} else if (this.aLong208 < (long) local76 + local81 && (long) local76 + local81 <= (long) this.anInt6057 + this.aLong208) {
					local316 = (long) local76 + local81;
				}
				if (local318 > -1L && local316 > local318) {
					@Pc(440) int local440 = (int) (local316 - local318);
					Static8.method80(this.aByteArray75, (int) (local318 - this.aLong208), arg0, (int) (local318 - local81), local440);
					if (local316 > this.aLong210) {
						arg2 = (int) ((long) arg2 + this.aLong210 - local316);
						this.aLong210 = local316;
					}
				}
			}
		} catch (@Pc(479) IOException local479) {
			this.aLong209 = -1L;
			throw local479;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "(B)Ljava/io/File;")
	private File method4802() {
		return this.aClass195_1.getFile();
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I[B)V")
	public final void method4803(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method4801(arg0, 0, arg0.length);
	}
}
