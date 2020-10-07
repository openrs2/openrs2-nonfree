import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public abstract class Class4_Sub4 extends Node {

	@OriginalMember(owner = "client!bc", name = "t", descriptor = "Z")
	public boolean aBoolean54;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(B)I")
	public final int method753() {
		return 1;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "()I")
	public int method754() {
		return 0;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)Z")
	public final boolean method755() {
		return this.aBoolean54;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
	public abstract void method756(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "()V")
	public abstract void method760();

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(IIIII)V")
	public abstract void method761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "()Z")
	public abstract boolean method762();

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)Z")
	public final boolean method764() {
		return false;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V")
	public abstract void method765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "()Z")
	public abstract boolean method766();

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "(B)Z")
	public final boolean method767() {
		return false;
	}
}
