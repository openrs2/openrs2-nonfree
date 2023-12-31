import java.awt.Component;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public abstract class MouseWheel {

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "(I)Lclient!bh;")
	public static MouseWheel create() {
		try {
			return (MouseWheel) Class.forName("JavaMouseWheel").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable ex) {
			return null;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public abstract void stop(@OriginalArg(0) Component component);

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)I")
	public abstract int getWheelRotation();

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public abstract void start(@OriginalArg(0) Component component);
}
