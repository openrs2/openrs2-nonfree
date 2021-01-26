import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class TextureOp29SubOp0 extends TextureOp29SubOp {

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(Lclient!fd;I)Lclient!de;")
	public static TextureOp29SubOp0 create(@OriginalArg(0) Buffer buffer) {
		return new TextureOp29SubOp0(buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readUnsignedMedium(), buffer.readUnsignedByte());
	}

	@OriginalMember(owner = "client!de", name = "y", descriptor = "I")
	private final int anInt955;

	@OriginalMember(owner = "client!de", name = "u", descriptor = "I")
	private final int anInt951;

	@OriginalMember(owner = "client!de", name = "w", descriptor = "I")
	private final int anInt953;

	@OriginalMember(owner = "client!de", name = "v", descriptor = "I")
	private final int anInt952;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(IIIIII)V")
	private TextureOp29SubOp0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt955 = arg2;
		this.anInt951 = arg1;
		this.anInt953 = arg0;
		this.anInt952 = arg3;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III)V")
	@Override
	public final void method1935(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIZ)V")
	@Override
	public final void method1938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg0 * this.anInt953 >> 12;
		@Pc(25) int local25 = this.anInt955 * arg0 >> 12;
		@Pc(32) int local32 = this.anInt952 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt951 * arg1 >> 12;
		Static32.method4022(local39, local32, this.anInt2466, local6, local25);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIB)V")
	@Override
	public final void method1934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
