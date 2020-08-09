import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class73 {

	@OriginalMember(owner = "client!h", name = "b", descriptor = "I")
	public int anInt2131;

	@OriginalMember(owner = "client!h", name = "c", descriptor = "I")
	public int anInt2132;

	@OriginalMember(owner = "client!h", name = "e", descriptor = "I")
	public int anInt2133;

	@OriginalMember(owner = "client!h", name = "g", descriptor = "I")
	private int anInt2135;

	@OriginalMember(owner = "client!h", name = "h", descriptor = "I")
	private int anInt2136;

	@OriginalMember(owner = "client!h", name = "i", descriptor = "I")
	private int anInt2137;

	@OriginalMember(owner = "client!h", name = "j", descriptor = "I")
	private int anInt2138;

	@OriginalMember(owner = "client!h", name = "k", descriptor = "I")
	private int anInt2139;

	@OriginalMember(owner = "client!h", name = "f", descriptor = "I")
	private int anInt2134 = 2;

	@OriginalMember(owner = "client!h", name = "d", descriptor = "[I")
	private int[] anIntArray178 = new int[2];

	@OriginalMember(owner = "client!h", name = "a", descriptor = "[I")
	private int[] anIntArray177 = new int[2];

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
	public Class73() {
		this.anIntArray178[0] = 0;
		this.anIntArray178[1] = 65535;
		this.anIntArray177[0] = 0;
		this.anIntArray177[1] = 65535;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "()V")
	public final void method1673() {
		this.anInt2135 = 0;
		this.anInt2136 = 0;
		this.anInt2139 = 0;
		this.anInt2137 = 0;
		this.anInt2138 = 0;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!fd;)V")
	public final void method1674(@OriginalArg(0) Buffer arg0) {
		this.anInt2133 = arg0.readUnsignedByte();
		this.anInt2132 = arg0.readInt();
		this.anInt2131 = arg0.readInt();
		this.method1676(arg0);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)I")
	public final int method1675(@OriginalArg(0) int arg0) {
		if (this.anInt2138 >= this.anInt2135) {
			this.anInt2137 = this.anIntArray177[this.anInt2136++] << 15;
			if (this.anInt2136 >= this.anInt2134) {
				this.anInt2136 = this.anInt2134 - 1;
			}
			this.anInt2135 = (int) ((double) this.anIntArray178[this.anInt2136] / 65536.0D * (double) arg0);
			if (this.anInt2135 > this.anInt2138) {
				this.anInt2139 = ((this.anIntArray177[this.anInt2136] << 15) - this.anInt2137) / (this.anInt2135 - this.anInt2138);
			}
		}
		this.anInt2137 += this.anInt2139;
		this.anInt2138++;
		return this.anInt2137 - this.anInt2139 >> 15;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Lclient!fd;)V")
	public final void method1676(@OriginalArg(0) Buffer arg0) {
		this.anInt2134 = arg0.readUnsignedByte();
		this.anIntArray178 = new int[this.anInt2134];
		this.anIntArray177 = new int[this.anInt2134];
		for (@Pc(16) int local16 = 0; local16 < this.anInt2134; local16++) {
			this.anIntArray178[local16] = arg0.readUnsignedShort();
			this.anIntArray177[local16] = arg0.readUnsignedShort();
		}
	}
}
