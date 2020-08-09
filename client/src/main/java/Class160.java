import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public final class Class160 {

	@OriginalMember(owner = "client!t", name = "c", descriptor = "I")
	public int anInt4976;

	@OriginalMember(owner = "client!t", name = "h", descriptor = "B")
	private byte aByte17;

	@OriginalMember(owner = "client!t", name = "i", descriptor = "I")
	public int anInt4980;

	@OriginalMember(owner = "client!t", name = "j", descriptor = "I")
	public int anInt4981;

	@OriginalMember(owner = "client!t", name = "k", descriptor = "I")
	public int anInt4982;

	@OriginalMember(owner = "client!t", name = "l", descriptor = "I")
	public int anInt4983;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
	public Class160() {
	}

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!fd;)V")
	public Class160(@OriginalArg(0) Buffer arg0) {
		this.aByte17 = arg0.readByte();
		this.anInt4983 = arg0.readUnsignedShort();
		this.anInt4982 = arg0.readInt();
		this.anInt4976 = arg0.readInt();
		this.anInt4980 = arg0.readInt();
		this.anInt4981 = arg0.readInt();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)I")
	public final int method4078() {
		return (this.aByte17 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(I)I")
	public final int method4081() {
		return this.aByte17 & 0x7;
	}
}
