import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public interface Interface3 {

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IFIIIZ)[I")
	int[] method415(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)Z")
	boolean method416(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IB)Lclient!mi;")
	Class119 method417(@OriginalArg(0) int arg0);
}
