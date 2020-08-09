import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class4_Sub3_Sub3 extends Class4_Sub3 {

	@OriginalMember(owner = "client!cj", name = "z", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!cj", name = "B", descriptor = "I")
	private int anInt642;

	@OriginalMember(owner = "client!cj", name = "K", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!cj", name = "O", descriptor = "Lclient!ic;")
	private Class84 aClass84_2;

	@OriginalMember(owner = "client!cj", name = "W", descriptor = "Lclient!ic;")
	public Class84 aClass84_3;

	@OriginalMember(owner = "client!cj", name = "J", descriptor = "Ljava/lang/String;")
	private String aString50 = "null";

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)I")
	public final int method601(@OriginalArg(1) int arg0) {
		if (this.aClass84_3 == null) {
			return this.anInt642;
		} else {
			@Pc(17) Class4_Sub32 local17 = (Class4_Sub32) this.aClass84_3.method1844((long) arg0);
			return local17 == null ? this.anInt642 : local17.anInt5434;
		}
	}

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V")
	private void method602() {
		this.aClass84_2 = new Class84(this.aClass84_3.method1839());
		for (@Pc(22) Class4_Sub26 local22 = (Class4_Sub26) this.aClass84_3.method1842(); local22 != null; local22 = (Class4_Sub26) this.aClass84_3.method1843()) {
			@Pc(34) Class4_Sub22 local34 = new Class4_Sub22(local22.aString278, (int) local22.key);
			this.aClass84_2.method1840(local34, Static24.method2682(local22.aString278));
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!fd;I)V")
	private void method603(@OriginalArg(1) Buffer arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static29.method3522(arg0.readByte());
		} else if (arg1 == 2) {
			this.aChar1 = Static29.method3522(arg0.readByte());
		} else if (arg1 == 3) {
			this.aString50 = arg0.readString();
		} else if (arg1 == 4) {
			this.anInt642 = arg0.readInt();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(68) int local68 = arg0.readUnsignedShort();
			this.aClass84_3 = new Class84(Static24.method2595(local68));
			for (@Pc(78) int local78 = 0; local78 < local68; local78++) {
				@Pc(87) int local87 = arg0.readInt();
				@Pc(99) Node local99;
				if (arg1 == 5) {
					local99 = new Class4_Sub26(arg0.readString());
				} else {
					local99 = new Class4_Sub32(arg0.readInt());
				}
				this.aClass84_3.method1840(local99, (long) local87);
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(II)Z")
	public final boolean method604(@OriginalArg(1) int arg0) {
		if (this.aClass84_3 == null) {
			return false;
		}
		if (this.aClass84_2 == null) {
			this.method607();
		}
		@Pc(32) Class4_Sub32 local32 = (Class4_Sub32) this.aClass84_2.method1844((long) arg0);
		return local32 != null;
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(II)Ljava/lang/String;")
	public final String method606(@OriginalArg(0) int arg0) {
		if (this.aClass84_3 == null) {
			return this.aString50;
		} else {
			@Pc(18) Class4_Sub26 local18 = (Class4_Sub26) this.aClass84_3.method1844((long) arg0);
			return local18 == null ? this.aString50 : local18.aString278;
		}
	}

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)V")
	private void method607() {
		this.aClass84_2 = new Class84(this.aClass84_3.method1839());
		for (@Pc(24) Class4_Sub32 local24 = (Class4_Sub32) this.aClass84_3.method1842(); local24 != null; local24 = (Class4_Sub32) this.aClass84_3.method1843()) {
			@Pc(33) Class4_Sub32 local33 = new Class4_Sub32((int) local24.key);
			this.aClass84_2.method1840(local33, (long) local24.anInt5434);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZLclient!fd;)V")
	public final void method609(@OriginalArg(1) Buffer arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.readUnsignedByte();
			if (local9 == 0) {
				return;
			}
			this.method603(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public final boolean method611(@OriginalArg(1) String arg0) {
		if (this.aClass84_3 == null) {
			return false;
		}
		if (this.aClass84_2 == null) {
			this.method602();
		}
		for (@Pc(36) Class4_Sub22 local36 = (Class4_Sub22) this.aClass84_2.method1844(Static24.method2682(arg0)); local36 != null; local36 = (Class4_Sub22) this.aClass84_2.method1846()) {
			if (local36.aString248.equals(arg0)) {
				return true;
			}
		}
		return false;
	}
}
