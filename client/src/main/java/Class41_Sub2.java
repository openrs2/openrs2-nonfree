import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public class Class41_Sub2 extends Class41 {

	@OriginalMember(owner = "client!rn", name = "r", descriptor = "I")
	private int anInt3776;

	@OriginalMember(owner = "client!rn", name = "s", descriptor = "I")
	private int anInt3777;

	@OriginalMember(owner = "client!rn", name = "t", descriptor = "[B")
	private byte[] aByteArray48;

	@OriginalMember(owner = "client!rn", name = "y", descriptor = "[I")
	private final int[] anIntArray406 = new int[this.anInt3772];

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class41_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < this.anInt3772; local15++) {
			this.anIntArray406[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIB)V")
	@Override
	protected final void method3146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3776 += arg1 * this.anIntArray406[arg0] >> 12;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V")
	@Override
	protected final void method3141() {
		this.anInt3776 = Math.abs(this.anInt3776);
		if (this.anInt3776 >= 4096) {
			this.anInt3776 = 4095;
		}
		this.setPixel(this.anInt3777++, (byte) (this.anInt3776 >> 4));
		this.anInt3776 = 0;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IB)V")
	protected void setPixel(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray48[this.anInt3777++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
	@Override
	protected final void method3144() {
		this.anInt3777 = 0;
		this.anInt3776 = 0;
	}
}
