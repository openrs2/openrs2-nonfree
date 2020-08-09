import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class187 {

	@OriginalMember(owner = "client!wj", name = "o", descriptor = "F")
	public float aFloat152 = 0.25F;

	@OriginalMember(owner = "client!wj", name = "q", descriptor = "F")
	public float aFloat153 = 1.0F;

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "F")
	public float aFloat151 = 1.0F;

	@OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
	public final int anInt6034;

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "F")
	public final float aFloat149;

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
	public final int anInt6033;

	@OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
	public final int anInt6035;

	@OriginalMember(owner = "client!wj", name = "u", descriptor = "I")
	public final int anInt6043;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "F")
	public final float aFloat148;

	@OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
	public final int anInt6037;

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "F")
	public final float aFloat150;

	@OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
	public final int anInt6036;

	@OriginalMember(owner = "client!wj", name = "t", descriptor = "Lclient!ib;")
	public Class4_Sub3_Sub10 aClass4_Sub3_Sub10_7;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
	public Class187() {
		this.anInt6034 = Static4.anInt3364;
		this.aFloat149 = 1.2F;
		this.anInt6033 = -50;
		this.anInt6035 = -50;
		this.anInt6043 = 0;
		this.aFloat148 = 1.1523438F;
		this.anInt6037 = -60;
		this.aFloat150 = 0.69921875F;
		this.anInt6036 = Static4.anInt3365;
		if (Static2.anIntArray163 != null) {
			this.aClass4_Sub3_Sub10_7 = Static19.method1838(Static2.anIntArray163[0], Static2.anIntArray163[1], Static2.anIntArray163[2], Static2.anIntArray163[3], Static2.anIntArray163[4], Static2.anIntArray163[5]);
		}
	}

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lclient!fd;)V")
	public Class187(@OriginalArg(0) Buffer arg0) {
		@Pc(16) int local16 = arg0.readUnsignedByte();
		if ((local16 & 0x1) == 0) {
			this.anInt6034 = Static4.anInt3364;
		} else {
			this.anInt6034 = arg0.readInt();
		}
		if ((local16 & 0x2) == 0) {
			this.aFloat148 = 1.1523438F;
		} else {
			this.aFloat148 = (float) arg0.readUnsignedShort() / 256.0F;
		}
		if ((local16 & 0x4) == 0) {
			this.aFloat150 = 0.69921875F;
		} else {
			this.aFloat150 = (float) arg0.readUnsignedShort() / 256.0F;
		}
		if ((local16 & 0x8) == 0) {
			this.aFloat149 = 1.2F;
		} else {
			this.aFloat149 = (float) arg0.readUnsignedShort() / 256.0F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt6033 = -50;
			this.anInt6035 = -50;
			this.anInt6037 = -60;
		} else {
			this.anInt6035 = arg0.readShort();
			this.anInt6037 = arg0.readShort();
			this.anInt6033 = arg0.readShort();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt6036 = Static4.anInt3365;
		} else {
			this.anInt6036 = arg0.readInt();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt6043 = 0;
		} else {
			this.anInt6043 = arg0.readUnsignedShort();
		}
		if ((local16 & 0x80) != 0) {
			this.aClass4_Sub3_Sub10_7 = Static19.method1838(arg0.readUnsignedShort(), arg0.readUnsignedShort(), arg0.readUnsignedShort(), arg0.readUnsignedShort(), arg0.readUnsignedShort(), arg0.readUnsignedShort());
		} else if (Static2.anIntArray163 != null) {
			this.aClass4_Sub3_Sub10_7 = Static19.method1838(Static2.anIntArray163[0], Static2.anIntArray163[1], Static2.anIntArray163[2], Static2.anIntArray163[3], Static2.anIntArray163[4], Static2.anIntArray163[5]);
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!fd;I)V")
	public final void method4786(@OriginalArg(0) Buffer arg0) {
		this.aFloat151 = (float) (arg0.readUnsignedByte() * 8) / 255.0F;
		this.aFloat152 = (float) (arg0.readUnsignedByte() * 8) / 255.0F;
		this.aFloat153 = (float) (arg0.readUnsignedByte() * 8) / 255.0F;
	}
}
