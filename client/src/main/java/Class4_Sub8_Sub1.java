import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public final class Class4_Sub8_Sub1 extends Class4_Sub8 {

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "Z")
	public boolean aBoolean288;

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
	public int anInt4085;

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "[B")
	public byte[] aByteArray52;

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
	public int anInt4084;

	@OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
	public int anInt4086;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(I[BII)V")
	public Class4_Sub8_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4085 = arg0;
		this.aByteArray52 = arg1;
		this.anInt4084 = arg2;
		this.anInt4086 = arg3;
	}

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class4_Sub8_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4085 = arg0;
		this.aByteArray52 = arg1;
		this.anInt4084 = arg2;
		this.anInt4086 = arg3;
		this.aBoolean288 = arg4;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!ud;)Lclient!pb;")
	public final Class4_Sub8_Sub1 method3338(@OriginalArg(0) Class170 arg0) {
		this.aByteArray52 = arg0.method4305(this.aByteArray52);
		this.anInt4085 = arg0.method4302(this.anInt4085);
		if (this.anInt4084 == this.anInt4086) {
			this.anInt4084 = this.anInt4086 = arg0.method4303(this.anInt4084);
		} else {
			this.anInt4084 = arg0.method4303(this.anInt4084);
			this.anInt4086 = arg0.method4303(this.anInt4086);
			if (this.anInt4084 == this.anInt4086) {
				this.anInt4084--;
			}
		}
		return this;
	}
}
