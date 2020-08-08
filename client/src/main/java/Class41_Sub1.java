import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class Class41_Sub1 extends Class41 {

	@OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
	private int anInt1112;

	@OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
	private int anInt1116;

	@OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
	private int anInt1117;

	@OriginalMember(owner = "client!ea", name = "C", descriptor = "[B")
	private byte[] aByteArray8;

	@OriginalMember(owner = "client!ea", name = "N", descriptor = "I")
	private int anInt1124;

	@OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
	private final int anInt1113;

	@OriginalMember(owner = "client!ea", name = "L", descriptor = "I")
	private final int anInt1122;

	@OriginalMember(owner = "client!ea", name = "F", descriptor = "I")
	private final int anInt1119;

	@OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
	private int anInt1110;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class41_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt1113 = (int) (arg6 * 4096.0F);
		this.anInt1122 = (int) (arg7 * 4096.0F);
		this.anInt1110 = this.anInt1119 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)V")
	protected void method934(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray8[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
	@Override
	protected final void method3141() {
		this.anInt1110 = this.anInt1119;
		this.anInt1117 >>= 4;
		if (this.anInt1117 < 0) {
			this.anInt1117 = 0;
		} else if (this.anInt1117 > 255) {
			this.anInt1117 = 255;
		}
		this.method934(this.anInt1112++, (byte) this.anInt1117);
		this.anInt1117 = 0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
	@Override
	protected final void method3144() {
		this.anInt1117 = 0;
		this.anInt1112 = 0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIB)V")
	@Override
	protected final void method3146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			this.anInt1116 = 4096;
			this.anInt1124 = this.anInt1113 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt1124 = this.anInt1124 * this.anInt1124 >> 12;
			this.anInt1117 = this.anInt1124;
			return;
		}
		this.anInt1116 = this.anInt1124 * this.anInt1122 >> 12;
		if (this.anInt1116 < 0) {
			this.anInt1116 = 0;
		} else if (this.anInt1116 > 4096) {
			this.anInt1116 = 4096;
		}
		this.anInt1124 = this.anInt1113 - (arg1 < 0 ? -arg1 : arg1);
		this.anInt1124 = this.anInt1124 * this.anInt1124 >> 12;
		this.anInt1124 = this.anInt1124 * this.anInt1116 >> 12;
		this.anInt1117 += this.anInt1110 * this.anInt1124 >> 12;
		this.anInt1110 = this.anInt1110 * this.anInt1119 >> 12;
	}
}
