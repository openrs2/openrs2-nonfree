import java.awt.Component;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public abstract class Class19 {

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public abstract void method894(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)I")
	public abstract int method899();

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public abstract void method900(@OriginalArg(0) Component arg0);
}
