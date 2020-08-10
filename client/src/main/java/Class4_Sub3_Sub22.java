import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class4_Sub3_Sub22 extends Class4_Sub3 {

	@OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
	public int anInt5991 = 12800;

	@OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
	public int anInt5996 = 12800;

	@OriginalMember(owner = "client!wg", name = "I", descriptor = "Z")
	public boolean aBoolean420 = true;

	@OriginalMember(owner = "client!wg", name = "T", descriptor = "I")
	public int anInt6007 = 0;

	@OriginalMember(owner = "client!wg", name = "N", descriptor = "I")
	public int anInt6002 = 0;

	@OriginalMember(owner = "client!wg", name = "C", descriptor = "I")
	public int anInt5995 = -1;

	@OriginalMember(owner = "client!wg", name = "S", descriptor = "I")
	public int anInt6006 = -1;

	@OriginalMember(owner = "client!wg", name = "X", descriptor = "Ljava/lang/String;")
	public final String aString359;

	@OriginalMember(owner = "client!wg", name = "U", descriptor = "Ljava/lang/String;")
	public final String aString358;

	@OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
	public final int anInt5992;

	@OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
	public final int anInt5993;

	@OriginalMember(owner = "client!wg", name = "M", descriptor = "Lclient!ll;")
	public final LinkedList aClass112_31;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
	public Class4_Sub3_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		this.aString359 = arg2;
		this.aBoolean420 = arg5;
		this.aString358 = arg1;
		this.anInt5992 = arg3;
		this.anInt5993 = arg0;
		this.anInt5995 = arg4;
		this.anInt6006 = arg6;
		if (this.anInt6006 == 255) {
			this.anInt6006 = 0;
		}
		this.aClass112_31 = new LinkedList();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(III[II)Z")
	public final boolean method4753(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		for (@Pc(16) Class4_Sub7 local16 = (Class4_Sub7) this.aClass112_31.head(); local16 != null; local16 = (Class4_Sub7) this.aClass112_31.next()) {
			if (local16.method978(arg3, arg0, arg1)) {
				local16.method981(arg0, arg3, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)Z")
	public final boolean method4754(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class4_Sub7 local11 = (Class4_Sub7) this.aClass112_31.head(); local11 != null; local11 = (Class4_Sub7) this.aClass112_31.next()) {
			if (local11.method980(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "([IIBI)Z")
	public final boolean method4755(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(19) Class4_Sub7 local19 = (Class4_Sub7) this.aClass112_31.head(); local19 != null; local19 = (Class4_Sub7) this.aClass112_31.next()) {
			if (local19.method980(arg1, arg2)) {
				local19.method981(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIB[I)Z")
	public final boolean method4758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(11) Class4_Sub7 local11 = (Class4_Sub7) this.aClass112_31.head(); local11 != null; local11 = (Class4_Sub7) this.aClass112_31.next()) {
			if (local11.method979(arg0, arg1)) {
				local11.method983(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V")
	public final void method4759() {
		this.anInt5996 = 12800;
		this.anInt6007 = 0;
		this.anInt6002 = 0;
		this.anInt5991 = 12800;
		for (@Pc(23) Class4_Sub7 local23 = (Class4_Sub7) this.aClass112_31.head(); local23 != null; local23 = (Class4_Sub7) this.aClass112_31.next()) {
			if (this.anInt6002 < local23.anInt1178) {
				this.anInt6002 = local23.anInt1178;
			}
			if (this.anInt5991 > local23.anInt1186) {
				this.anInt5991 = local23.anInt1186;
			}
			if (local23.anInt1176 < this.anInt5996) {
				this.anInt5996 = local23.anInt1176;
			}
			if (this.anInt6007 < local23.anInt1179) {
				this.anInt6007 = local23.anInt1179;
			}
		}
	}
}
