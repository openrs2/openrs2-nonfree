import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public interface Interface2 {

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "()V")
	void method3483();

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "()V")
	void method3484();

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "()I")
	int method3485();

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
	void method3486(@OriginalArg(0) int arg0);
}
