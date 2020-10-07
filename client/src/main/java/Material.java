import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public interface Material {

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "()V")
	void unbind();

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "()V")
	void bind();

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "()I")
	int getFlags();

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
	void setArgument(@OriginalArg(0) int arg);
}
