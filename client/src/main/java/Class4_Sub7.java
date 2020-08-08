import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public final class Class4_Sub7 extends Node {

	@OriginalMember(owner = "client!e", name = "z", descriptor = "I")
	public final int anInt1186;

	@OriginalMember(owner = "client!e", name = "s", descriptor = "I")
	private final int anInt1180;

	@OriginalMember(owner = "client!e", name = "u", descriptor = "I")
	private final int anInt1182;

	@OriginalMember(owner = "client!e", name = "y", descriptor = "I")
	private final int anInt1185;

	@OriginalMember(owner = "client!e", name = "w", descriptor = "I")
	private final int anInt1183;

	@OriginalMember(owner = "client!e", name = "C", descriptor = "I")
	private final int anInt1188;

	@OriginalMember(owner = "client!e", name = "p", descriptor = "I")
	private final int anInt1177;

	@OriginalMember(owner = "client!e", name = "r", descriptor = "I")
	public final int anInt1179;

	@OriginalMember(owner = "client!e", name = "o", descriptor = "I")
	public final int anInt1176;

	@OriginalMember(owner = "client!e", name = "q", descriptor = "I")
	public final int anInt1178;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class4_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt1186 = arg6;
		this.anInt1180 = arg2;
		this.anInt1182 = arg1;
		this.anInt1185 = arg3;
		this.anInt1183 = arg5;
		this.anInt1188 = arg4;
		this.anInt1177 = arg0;
		this.anInt1179 = arg9;
		this.anInt1176 = arg7;
		this.anInt1178 = arg8;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BIII)Z")
	public final boolean method978(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt1177 == arg2 && arg0 >= this.anInt1180 && arg0 <= this.anInt1188 && arg1 >= this.anInt1185 && this.anInt1183 >= arg1;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(III)Z")
	public final boolean method979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.anInt1186 && arg0 <= this.anInt1178 && arg1 >= this.anInt1176 && arg1 <= this.anInt1179;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IBI)Z")
	public final boolean method980(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt1180 <= arg1 && arg1 <= this.anInt1188 && this.anInt1185 <= arg0 && arg0 <= this.anInt1183;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIB[I)V")
	public final void method981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[0] = this.anInt1182;
		arg2[2] = this.anInt1176 + arg0 - this.anInt1185;
		arg2[1] = this.anInt1186 + arg1 - this.anInt1180;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II[II)V")
	public final void method983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		arg2[1] = arg1 + this.anInt1180 - this.anInt1186;
		arg2[0] = this.anInt1177;
		arg2[2] = this.anInt1185 + arg0 - this.anInt1176;
	}
}
