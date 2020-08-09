import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!aa")
public abstract class Class199 {

	@OriginalMember(owner = "unpackclass!aa", name = "q", descriptor = "Z")
	private static boolean aBoolean435;

	@OriginalMember(owner = "unpackclass!aa", name = "r", descriptor = "I")
	private static int anInt6143;

	@OriginalMember(owner = "unpackclass!aa", name = "m", descriptor = "Lunpackclass!k;")
	private static final GzipDecompressor aClass207_2 = new GzipDecompressor();

	@OriginalMember(owner = "unpackclass!aa", name = "a", descriptor = "I")
	protected int anInt6141;

	@OriginalMember(owner = "unpackclass!aa", name = "b", descriptor = "[I")
	protected int[] anIntArray696;

	@OriginalMember(owner = "unpackclass!aa", name = "c", descriptor = "[I")
	private int[] anIntArray697;

	@OriginalMember(owner = "unpackclass!aa", name = "d", descriptor = "[I")
	private int[] anIntArray698;

	@OriginalMember(owner = "unpackclass!aa", name = "e", descriptor = "[I")
	private int[] anIntArray699;

	@OriginalMember(owner = "unpackclass!aa", name = "f", descriptor = "[I")
	private int[] anIntArray700;

	@OriginalMember(owner = "unpackclass!aa", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray56;

	@OriginalMember(owner = "unpackclass!aa", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray57;

	@OriginalMember(owner = "unpackclass!aa", name = "i", descriptor = "[Lunpackclass!i;")
	private Class205[] aClass205Array2;

	@OriginalMember(owner = "unpackclass!aa", name = "j", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray34;

	@OriginalMember(owner = "unpackclass!aa", name = "k", descriptor = "[I")
	private int[] anIntArray701;

	@OriginalMember(owner = "unpackclass!aa", name = "l", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray3;

	@OriginalMember(owner = "unpackclass!aa", name = "n", descriptor = "I")
	private int anInt6142;

	@OriginalMember(owner = "unpackclass!aa", name = "o", descriptor = "Z")
	protected final boolean aBoolean433;

	@OriginalMember(owner = "unpackclass!aa", name = "p", descriptor = "Z")
	private final boolean aBoolean434;

	@OriginalMember(owner = "unpackclass!aa", name = "b", descriptor = "([B)[B")
	private static byte[] method4935(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Buffer local4 = new Buffer(arg0);
		@Pc(7) int local7 = local4.readUnsignedByte();
		@Pc(10) int local10 = local4.readInt();
		if (local10 < 0 || anInt6143 != 0 && local10 > anInt6143) {
			throw new RuntimeException();
		} else if (local7 == 0) {
			@Pc(26) byte[] local26 = new byte[local10];
			local4.readBytes(local26, local10);
			return local26;
		} else {
			@Pc(36) int local36 = local4.readInt();
			if (local36 < 0 || anInt6143 != 0 && local36 > anInt6143) {
				throw new RuntimeException();
			}
			@Pc(50) byte[] local50 = new byte[local36];
			if (local7 == 1) {
				Bzip2Decompressor.bunzip2(local50, local36, arg0, local10);
			} else {
				aClass207_2.gunzip(local4, local50);
			}
			return local50;
		}
	}

	@OriginalMember(owner = "unpackclass!aa", name = "<init>", descriptor = "(ZZ)V")
	protected Class199(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean433 = arg0;
		this.aBoolean434 = arg1;
	}

	@OriginalMember(owner = "unpackclass!aa", name = "a", descriptor = "([B)V")
	protected final void method4927(@OriginalArg(0) byte[] arg0) {
		this.anInt6142 = Buffer.crc32(arg0, arg0.length);
		@Pc(13) Buffer local13 = new Buffer(method4935(arg0));
		@Pc(16) int local16 = local13.readUnsignedByte();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local16);
		}
		if (local16 >= 6) {
			local13.readInt();
		}
		@Pc(42) int local42 = local13.readUnsignedByte();
		this.anInt6141 = local13.readUnsignedShort();
		@Pc(48) int local48 = 0;
		@Pc(50) int local50 = -1;
		this.anIntArray696 = new int[this.anInt6141];
		for (@Pc(57) int local57 = 0; local57 < this.anInt6141; local57++) {
			this.anIntArray696[local57] = local48 += local13.readUnsignedShort();
			if (this.anIntArray696[local57] > local50) {
				local50 = this.anIntArray696[local57];
			}
		}
		this.anIntArray698 = new int[local50 + 1];
		this.anIntArray699 = new int[local50 + 1];
		this.anIntArray700 = new int[local50 + 1];
		this.anIntArrayArray56 = new int[local50 + 1][];
		this.anObjectArray34 = new Object[local50 + 1];
		this.anIntArray701 = new int[local50 + 1];
		this.anObjectArrayArray3 = new Object[local50 + 1][];
		if (local42 != 0) {
			this.anIntArray697 = new int[local50 + 1];
			for (@Pc(142) int local142 = 0; local142 < local50 + 1; local142++) {
				this.anIntArray697[local142] = -1;
			}
			for (@Pc(157) int local157 = 0; local157 < this.anInt6141; local157++) {
				this.anIntArray697[this.anIntArray696[local157]] = local13.readInt();
			}
			new Class205(this.anIntArray697);
		}
		for (@Pc(179) int local179 = 0; local179 < this.anInt6141; local179++) {
			this.anIntArray698[this.anIntArray696[local179]] = local13.readInt();
		}
		for (@Pc(197) int local197 = 0; local197 < this.anInt6141; local197++) {
			this.anIntArray699[this.anIntArray696[local197]] = local13.readInt();
		}
		for (@Pc(215) int local215 = 0; local215 < this.anInt6141; local215++) {
			this.anIntArray700[this.anIntArray696[local215]] = local13.readUnsignedShort();
		}
		for (@Pc(233) int local233 = 0; local233 < this.anInt6141; local233++) {
			@Pc(240) int local240 = this.anIntArray696[local233];
			@Pc(245) int local245 = this.anIntArray700[local240];
			@Pc(247) int local247 = 0;
			@Pc(249) int local249 = -1;
			this.anIntArrayArray56[local240] = new int[local245];
			for (@Pc(257) int local257 = 0; local257 < local245; local257++) {
				@Pc(273) int local273 = this.anIntArrayArray56[local240][local257] = local247 += local13.readUnsignedShort();
				if (local273 > local249) {
					local249 = local273;
				}
			}
			this.anIntArray701[local240] = local249 + 1;
			if (local249 + 1 == local245) {
				this.anIntArrayArray56[local240] = null;
			}
		}
		if (local42 == 0) {
			return;
		}
		this.anIntArrayArray57 = new int[local50 + 1][];
		this.aClass205Array2 = new Class205[local50 + 1];
		for (@Pc(320) int local320 = 0; local320 < this.anInt6141; local320++) {
			@Pc(327) int local327 = this.anIntArray696[local320];
			@Pc(332) int local332 = this.anIntArray700[local327];
			this.anIntArrayArray57[local327] = new int[this.anIntArray701[local327]];
			for (@Pc(343) int local343 = 0; local343 < this.anIntArray701[local327]; local343++) {
				this.anIntArrayArray57[local327][local343] = -1;
			}
			for (@Pc(361) int local361 = 0; local361 < local332; local361++) {
				@Pc(375) int local375;
				if (this.anIntArrayArray56[local327] == null) {
					local375 = local361;
				} else {
					local375 = this.anIntArrayArray56[local327][local361];
				}
				this.anIntArrayArray57[local327][local375] = local13.readInt();
			}
			this.aClass205Array2[local327] = new Class205(this.anIntArrayArray57[local327]);
		}
	}

	@OriginalMember(owner = "unpackclass!aa", name = "a", descriptor = "(I)Z")
	private boolean method4928(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < this.anIntArray701.length && this.anIntArray701[arg0] != 0) {
			return true;
		} else if (aBoolean435) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "unpackclass!aa", name = "a", descriptor = "(II)Z")
	private boolean method4929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.anIntArray701.length && arg1 < this.anIntArray701[arg0]) {
			return true;
		} else if (aBoolean435) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "unpackclass!aa", name = "b", descriptor = "(II)[B")
	public final byte[] method4930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method4931(arg0, arg1, null);
	}

	@OriginalMember(owner = "unpackclass!aa", name = "a", descriptor = "(II[I)[B")
	private byte[] method4931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method4929(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray3[arg0] == null || this.anObjectArrayArray3[arg0][arg1] == null) {
			@Pc(23) boolean local23 = this.method4934(arg0, arg2);
			if (!local23) {
				this.method4932(arg0);
				@Pc(33) boolean local33 = this.method4934(arg0, arg2);
				if (!local33) {
					return null;
				}
			}
		}
		@Pc(46) byte[] local46 = ByteArray.unwrap(this.anObjectArrayArray3[arg0][arg1], false);
		if (this.aBoolean434) {
			this.anObjectArrayArray3[arg0][arg1] = null;
			if (this.anIntArray701[arg0] == 1) {
				this.anObjectArrayArray3[arg0] = null;
			}
		}
		return local46;
	}

	@OriginalMember(owner = "unpackclass!aa", name = "b", descriptor = "(I)V")
	private void method4932(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "unpackclass!aa", name = "c", descriptor = "(I)I")
	public final int method4933() {
		return this.method4928(0) ? this.anIntArray701[0] : 0;
	}

	@OriginalMember(owner = "unpackclass!aa", name = "a", descriptor = "(I[I)Z")
	private boolean method4934(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (!this.method4928(arg0)) {
			return false;
		} else if (this.anObjectArray34[arg0] == null) {
			return false;
		} else {
			@Pc(19) int local19 = this.anIntArray700[arg0];
			@Pc(24) int[] local24 = this.anIntArrayArray56[arg0];
			if (this.anObjectArrayArray3[arg0] == null) {
				this.anObjectArrayArray3[arg0] = new Object[this.anIntArray701[arg0]];
			}
			@Pc(43) Object[] local43 = this.anObjectArrayArray3[arg0];
			@Pc(45) boolean local45 = true;
			for (@Pc(47) int local47 = 0; local47 < local19; local47++) {
				@Pc(53) int local53;
				if (local24 == null) {
					local53 = local47;
				} else {
					local53 = local24[local47];
				}
				if (local43[local53] == null) {
					local45 = false;
					break;
				}
			}
			if (local45) {
				return true;
			}
			@Pc(100) byte[] local100;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local100 = ByteArray.unwrap(this.anObjectArray34[arg0], false);
			} else {
				local100 = ByteArray.unwrap(this.anObjectArray34[arg0], true);
				@Pc(105) Buffer local105 = new Buffer(local100);
				local105.xteaDecrypt(arg1, local105.bytes.length);
			}
			@Pc(124) byte[] local124;
			try {
				local124 = method4935(local100);
			} catch (@Pc(126) RuntimeException local126) {
				throw TracingException.wrap(local126, "T3 - " + (arg1 != null) + "," + arg0 + "," + local100.length + "," + Buffer.crc32(local100, local100.length) + "," + Buffer.crc32(local100, local100.length - 2) + "," + this.anIntArray698[arg0] + "," + this.anInt6142);
			}
			if (this.aBoolean433) {
				this.anObjectArray34[arg0] = null;
			}
			if (local19 > 1) {
				@Pc(191) int local191 = local124.length;
				local191--;
				@Pc(198) int local198 = local124[local191] & 0xFF;
				local191 -= local19 * local198 * 4;
				@Pc(211) Buffer local211 = new Buffer(local124);
				@Pc(214) int[] local214 = new int[local19];
				local211.position = local191;
				for (@Pc(219) int local219 = 0; local219 < local198; local219++) {
					@Pc(223) int local223 = 0;
					for (@Pc(225) int local225 = 0; local225 < local19; local225++) {
						local223 += local211.readInt();
						local214[local225] += local223;
					}
				}
				@Pc(250) byte[][] local250 = new byte[local19][];
				for (@Pc(252) int local252 = 0; local252 < local19; local252++) {
					local250[local252] = new byte[local214[local252]];
					local214[local252] = 0;
				}
				local211.position = local191;
				@Pc(274) int local274 = 0;
				for (@Pc(276) int local276 = 0; local276 < local198; local276++) {
					@Pc(280) int local280 = 0;
					for (@Pc(282) int local282 = 0; local282 < local19; local282++) {
						local280 += local211.readInt();
						Class208.method4926(local124, local274, local250[local282], local214[local282], local280);
						local214[local282] += local280;
						local274 += local280;
					}
				}
				for (@Pc(320) int local320 = 0; local320 < local19; local320++) {
					@Pc(326) int local326;
					if (local24 == null) {
						local326 = local320;
					} else {
						local326 = local24[local320];
					}
					if (this.aBoolean434) {
						local43[local326] = local250[local320];
					} else {
						local43[local326] = ByteArray.wrap(local250[local320]);
					}
				}
			} else {
				@Pc(361) int local361;
				if (local24 == null) {
					local361 = 0;
				} else {
					local361 = local24[0];
				}
				if (this.aBoolean434) {
					local43[local361] = local124;
				} else {
					local43[local361] = ByteArray.wrap(local124);
				}
			}
			return true;
		}
	}
}
