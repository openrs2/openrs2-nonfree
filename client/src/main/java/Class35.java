import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class35 {

	@OriginalMember(owner = "client!da", name = "a", descriptor = "[I")
	public static final int[] anIntArray61 = new int[4096];

	@OriginalMember(owner = "client!da", name = "g", descriptor = "I")
	private int anInt872 = 0;

	@OriginalMember(owner = "client!da", name = "n", descriptor = "I")
	private int anInt875 = -1;

	@OriginalMember(owner = "client!da", name = "s", descriptor = "Lclient!ll;")
	private Class112 aClass112_4 = new Class112();

	@OriginalMember(owner = "client!da", name = "t", descriptor = "Z")
	public boolean aBoolean51 = false;

	@OriginalMember(owner = "client!da", name = "k", descriptor = "I")
	private final int anInt874;

	@OriginalMember(owner = "client!da", name = "f", descriptor = "[Lclient!ol;")
	private Class4_Sub20[] aClass4_Sub20Array1;

	@OriginalMember(owner = "client!da", name = "b", descriptor = "I")
	private final int anInt869;

	@OriginalMember(owner = "client!da", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	static {
		for (@Pc(6) int local6 = 0; local6 < 4096; local6++) {
			anIntArray61[local6] = Static26.method2983(local6);
		}
	}

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(III)V")
	public Class35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt874 = arg1;
		this.aClass4_Sub20Array1 = new Class4_Sub20[this.anInt874];
		this.anInt869 = arg0;
		this.anIntArrayArray8 = new int[this.anInt869][arg2];
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)[[I")
	public final int[][] method729() {
		if (this.anInt869 != this.anInt874) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt869; local29++) {
			this.aClass4_Sub20Array1[local29] = Static5.aClass4_Sub20_1;
		}
		return this.anIntArrayArray8;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)[I")
	public final int[] method730(@OriginalArg(0) int arg0) {
		if (this.anInt869 == this.anInt874) {
			this.aBoolean51 = this.aClass4_Sub20Array1[arg0] == null;
			this.aClass4_Sub20Array1[arg0] = Static5.aClass4_Sub20_1;
			return this.anIntArrayArray8[arg0];
		} else if (this.anInt869 == 1) {
			this.aBoolean51 = arg0 != this.anInt875;
			this.anInt875 = arg0;
			return this.anIntArrayArray8[0];
		} else {
			@Pc(33) Class4_Sub20 local33 = this.aClass4_Sub20Array1[arg0];
			if (local33 == null) {
				this.aBoolean51 = true;
				if (this.anInt869 > this.anInt872) {
					local33 = new Class4_Sub20(arg0, this.anInt872);
					this.anInt872++;
				} else {
					@Pc(69) Class4_Sub20 local69 = (Class4_Sub20) this.aClass112_4.method2613();
					local33 = new Class4_Sub20(arg0, local69.anInt3905);
					this.aClass4_Sub20Array1[local69.anInt3908] = null;
					local69.method4817();
				}
				this.aClass4_Sub20Array1[arg0] = local33;
			} else {
				this.aBoolean51 = false;
			}
			this.aClass112_4.method2607(local33);
			return this.anIntArrayArray8[local33.anInt3905];
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
	public final void method733() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt869; local7++) {
			this.anIntArrayArray8[local7] = null;
		}
		this.anIntArrayArray8 = null;
		this.aClass4_Sub20Array1 = null;
		this.aClass112_4.method2606();
		this.aClass112_4 = null;
	}
}
