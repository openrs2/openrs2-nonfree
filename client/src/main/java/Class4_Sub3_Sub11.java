import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class4_Sub3_Sub11 extends Class4_Sub3 {

	@OriginalMember(owner = "client!ij", name = "z", descriptor = "[I")
	private int[] anIntArray210;

	@OriginalMember(owner = "client!ij", name = "A", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!ij", name = "O", descriptor = "[I")
	public int[] anIntArray212;

	@OriginalMember(owner = "client!ij", name = "S", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray17;

	@OriginalMember(owner = "client!ij", name = "H", descriptor = "Z")
	public boolean aBoolean163 = true;

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)I")
	public final int method1903() {
		return this.anIntArray210 == null ? 0 : this.anIntArray210.length;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)I")
	public final int method1904(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray210 == null || arg1 < 0 || arg1 > this.anIntArray210.length) {
			return -1;
		} else if (this.anIntArrayArray20[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray20[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray20[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)I")
	public final int method1905(@OriginalArg(0) int arg0) {
		return this.anIntArray210 == null || arg0 < 0 || arg0 > this.anIntArray210.length ? -1 : this.anIntArray210[arg0];
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZLclient!fd;)V")
	private void method1906(@OriginalArg(0) int arg0, @OriginalArg(2) Buffer arg1) {
		if (arg0 == 1) {
			this.aStringArray17 = Static12.method721('<', arg1.readString());
		} else if (arg0 == 2) {
			@Pc(103) int local103 = arg1.readUnsignedByte();
			this.anIntArray212 = new int[local103];
			for (@Pc(109) int local109 = 0; local109 < local103; local109++) {
				this.anIntArray212[local109] = arg1.readUnsignedShort();
			}
		} else if (arg0 == 3) {
			@Pc(27) int local27 = arg1.readUnsignedByte();
			this.anIntArrayArray20 = new int[local27][];
			this.anIntArray210 = new int[local27];
			for (@Pc(37) int local37 = 0; local37 < local27; local37++) {
				@Pc(48) int local48 = arg1.readUnsignedShort();
				this.anIntArray210[local37] = local48;
				this.anIntArrayArray20[local37] = new int[Static5.anIntArray456[local48]];
				for (@Pc(63) int local63 = 0; local63 < Static5.anIntArray456[local48]; local63++) {
					this.anIntArrayArray20[local37][local63] = arg1.readUnsignedShort();
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean163 = false;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!fd;I)V")
	public final void method1908(@OriginalArg(0) Buffer arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.readUnsignedByte();
			if (local14 == 0) {
				return;
			}
			this.method1906(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILclient!fd;)Ljava/lang/String;")
	public final String method1909(@OriginalArg(1) Buffer arg0) {
		@Pc(16) StringBuffer local16 = new StringBuffer(80);
		if (this.anIntArray210 != null) {
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray210.length; local21++) {
				local16.append(this.aStringArray17[local21]);
				local16.append(Static20.method1940(arg0.readVarLong(Static3.anIntArray191[this.anIntArray210[local21]]), this.anIntArray210[local21], this.anIntArrayArray20[local21]));
			}
		}
		local16.append(this.aStringArray17[this.aStringArray17.length - 1]);
		return local16.toString();
	}

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)V")
	public final void method1910() {
		if (this.anIntArray212 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray212.length; local20++) {
				this.anIntArray212[local20] |= 32768;
			}
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "([IBLclient!fd;)V")
	public final void method1911(@OriginalArg(0) int[] arg0, @OriginalArg(2) Buffer arg1) {
		if (this.anIntArray210 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anIntArray210.length && local13 < arg0.length; local13++) {
			@Pc(29) int local29 = Static2.anIntArray64[this.method1905(local13)];
			if (local29 > 0) {
				arg1.writeVarLong((long) arg0[local13], local29);
			}
		}
	}

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)Ljava/lang/String;")
	public final String method1913() {
		@Pc(6) StringBuffer local6 = new StringBuffer(80);
		if (this.aStringArray17 == null) {
			return "";
		}
		local6.append(this.aStringArray17[0]);
		for (@Pc(31) int local31 = 1; local31 < this.aStringArray17.length; local31++) {
			local6.append("...");
			local6.append(this.aStringArray17[local31]);
		}
		return local6.toString();
	}
}
