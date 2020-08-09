import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class4_Sub3_Sub23 extends Class4_Sub3 {

	@OriginalMember(owner = "client!wh", name = "z", descriptor = "[I")
	public int[] anIntArray676;

	@OriginalMember(owner = "client!wh", name = "C", descriptor = "Ljava/lang/String;")
	public String aString362;

	@OriginalMember(owner = "client!wh", name = "D", descriptor = "[I")
	public int[] anIntArray677;

	@OriginalMember(owner = "client!wh", name = "F", descriptor = "[C")
	public char[] aCharArray4;

	@OriginalMember(owner = "client!wh", name = "J", descriptor = "[C")
	public char[] aCharArray5;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLclient!fd;)V")
	public final void method4772(@OriginalArg(1) Buffer arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.readUnsignedByte();
			if (local5 == 0) {
				return;
			}
			this.method4779(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(CI)I")
	public final int method4774(@OriginalArg(0) char arg0) {
		if (this.anIntArray676 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray676.length; local20++) {
			if (this.aCharArray5[local20] == arg0) {
				return this.anIntArray676[local20];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(CI)I")
	public final int method4777(@OriginalArg(0) char arg0) {
		if (this.anIntArray677 == null) {
			return -1;
		}
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray677.length; local21++) {
			if (this.aCharArray4[local21] == arg0) {
				return this.anIntArray677[local21];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)V")
	public final void method4778() {
		if (this.anIntArray676 != null) {
			for (@Pc(8) int local8 = 0; local8 < this.anIntArray676.length; local8++) {
				this.anIntArray676[local8] |= 32768;
			}
		}
		if (this.anIntArray677 != null) {
			for (@Pc(39) int local39 = 0; local39 < this.anIntArray677.length; local39++) {
				this.anIntArray677[local39] |= 32768;
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILclient!fd;I)V")
	private void method4779(@OriginalArg(1) Buffer arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString362 = arg0.readString();
		} else if (arg1 == 2) {
			@Pc(95) int local95 = arg0.readUnsignedByte();
			this.anIntArray677 = new int[local95];
			this.aCharArray4 = new char[local95];
			for (@Pc(105) int local105 = 0; local105 < local95; local105++) {
				this.anIntArray677[local105] = arg0.readUnsignedShort();
				@Pc(119) byte local119 = arg0.readByte();
				this.aCharArray4[local105] = local119 == 0 ? 0 : Static29.method3522(local119);
			}
		} else if (arg1 == 3) {
			@Pc(39) int local39 = arg0.readUnsignedByte();
			this.aCharArray5 = new char[local39];
			this.anIntArray676 = new int[local39];
			for (@Pc(49) int local49 = 0; local49 < local39; local49++) {
				this.anIntArray676[local49] = arg0.readUnsignedShort();
				@Pc(69) byte local69 = arg0.readByte();
				this.aCharArray5[local49] = local69 == 0 ? 0 : Static29.method3522(local69);
			}
		} else if (arg1 != 4) {
		}
	}
}
