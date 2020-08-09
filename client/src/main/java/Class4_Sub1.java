import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public abstract class Class4_Sub1 extends Node {

	@OriginalMember(owner = "client!jo", name = "z", descriptor = "Lclient!md;")
	protected Class114 aClass114_41;

	@OriginalMember(owner = "client!jo", name = "F", descriptor = "Lclient!da;")
	protected Class35 aClass35_41;

	@OriginalMember(owner = "client!jo", name = "R", descriptor = "I")
	public int anInt5832;

	@OriginalMember(owner = "client!jo", name = "y", descriptor = "Z")
	public boolean aBoolean397;

	@OriginalMember(owner = "client!jo", name = "D", descriptor = "[Lclient!jo;")
	public final Class4_Sub1[] aClass4_Sub1Array42;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(IZ)V")
	protected Class4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean397 = arg1;
		this.aClass4_Sub1Array42 = new Class4_Sub1[arg0];
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIB)[[I")
	protected final int[][] method4686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aClass4_Sub1Array42[arg0].aBoolean397) {
			return this.aClass4_Sub1Array42[arg0].method4695(arg1);
		}
		@Pc(27) int[][] local27 = new int[3][];
		@Pc(35) int[] local35 = this.aClass4_Sub1Array42[arg0].method4694(arg1);
		local27[0] = local35;
		local27[2] = local35;
		local27[1] = local35;
		return local27;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(BLclient!fd;I)V")
	public void method4687(@OriginalArg(1) Buffer arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)I")
	public int method4688() {
		return -1;
	}

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "(B)I")
	public int method4691() {
		return -1;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)[I")
	public int[] method4694(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(II)[[I")
	public int[][] method4695(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "(I)V")
	public void method4696() {
		if (this.aBoolean397) {
			this.aClass35_41.method733();
			this.aClass35_41 = null;
		} else {
			this.aClass114_41.method2693();
			this.aClass114_41 = null;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)V")
	public final void method4697(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt5832 == 255 ? arg0 : this.anInt5832;
		if (this.aBoolean397) {
			this.aClass35_41 = new Class35(local12, arg0, arg1);
		} else {
			this.aClass114_41 = new Class114(local12, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(III)[I")
	protected final int[] method4699(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass4_Sub1Array42[arg1].aBoolean397 ? this.aClass4_Sub1Array42[arg1].method4694(arg0) : this.aClass4_Sub1Array42[arg1].method4695(arg0)[0];
	}

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "(B)V")
	public void method4700() {
	}
}
