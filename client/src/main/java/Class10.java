import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class10 {

	@OriginalMember(owner = "client!ak", name = "g", descriptor = "J")
	private long aLong5;

	@OriginalMember(owner = "client!ak", name = "p", descriptor = "Lclient!lh;")
	private SecondaryNode aClass4_Sub3_1;

	@OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
	private final int anInt132;

	@OriginalMember(owner = "client!ak", name = "o", descriptor = "[Lclient!lh;")
	private final SecondaryNode[] aClass4_Sub3Array1;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(I)V")
	public Class10(@OriginalArg(0) int arg0) {
		this.anInt132 = arg0;
		this.aClass4_Sub3Array1 = new SecondaryNode[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(22) SecondaryNode local22 = this.aClass4_Sub3Array1[local10] = new SecondaryNode();
			local22.secondaryNext = local22;
			local22.secondaryPrev = local22;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)Lclient!lh;")
	public final SecondaryNode method117() {
		if (this.aClass4_Sub3_1 == null) {
			return null;
		}
		@Pc(30) SecondaryNode local30 = this.aClass4_Sub3Array1[(int) ((long) (this.anInt132 - 1) & this.aLong5)];
		while (local30 != this.aClass4_Sub3_1) {
			if (this.aLong5 == this.aClass4_Sub3_1.secondaryKey) {
				@Pc(45) SecondaryNode local45 = this.aClass4_Sub3_1;
				this.aClass4_Sub3_1 = this.aClass4_Sub3_1.secondaryNext;
				return local45;
			}
			this.aClass4_Sub3_1 = this.aClass4_Sub3_1.secondaryNext;
		}
		this.aClass4_Sub3_1 = null;
		return null;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BJ)Lclient!lh;")
	public final SecondaryNode method118(@OriginalArg(1) long arg0) {
		this.aLong5 = arg0;
		@Pc(26) SecondaryNode local26 = this.aClass4_Sub3Array1[(int) (arg0 & (long) (this.anInt132 - 1))];
		for (this.aClass4_Sub3_1 = local26.secondaryNext; this.aClass4_Sub3_1 != local26; this.aClass4_Sub3_1 = this.aClass4_Sub3_1.secondaryNext) {
			if (arg0 == this.aClass4_Sub3_1.secondaryKey) {
				@Pc(44) SecondaryNode local44 = this.aClass4_Sub3_1;
				this.aClass4_Sub3_1 = this.aClass4_Sub3_1.secondaryNext;
				return local44;
			}
		}
		this.aClass4_Sub3_1 = null;
		return null;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(JLclient!lh;I)V")
	public final void method119(@OriginalArg(0) long arg0, @OriginalArg(1) SecondaryNode arg1) {
		if (arg1.secondaryPrev != null) {
			arg1.unlinkSecondary();
		}
		@Pc(32) SecondaryNode local32 = this.aClass4_Sub3Array1[(int) (arg0 & (long) (this.anInt132 - 1))];
		arg1.secondaryPrev = local32.secondaryPrev;
		arg1.secondaryKey = arg0;
		arg1.secondaryNext = local32;
		arg1.secondaryPrev.secondaryNext = arg1;
		arg1.secondaryNext.secondaryPrev = arg1;
	}
}
