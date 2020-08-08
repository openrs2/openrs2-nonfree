import java.awt.Component;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("signlink!le")
public interface Interface5 {

	@OriginalMember(owner = "signlink!le", name = "a", descriptor = "(I[I)V")
	void method4856(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "signlink!le", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
	void method4857(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "signlink!le", name = "c", descriptor = "(II)I")
	int method4858(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "signlink!le", name = "a", descriptor = "(II)V")
	void method4859(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "signlink!le", name = "b", descriptor = "(II)V")
	void method4860(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "signlink!le", name = "a", descriptor = "(IBI)V")
	void method4861(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;
}
