package jaggl.X11;

import java.io.File;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!jaggl/X11/dri")
public final class dri {

	@OriginalMember(owner = "gl!jaggl/X11/dri", name = "bind", descriptor = "()V")
	public static void bind() {
		@Pc(3) String osName = System.getProperty("os.name").toLowerCase();
		if (osName.startsWith("linux") || (new File("/usr/lib/dri")).exists() || (new File("/usr/X11R6/lib/modules/dri")).exists()) {
			@Pc(22) boolean success = open("libGL.so.1");
			if (!success) {
				open("/usr/lib/libGL.so.1");
			}
		}
	}

	@OriginalMember(owner = "gl!jaggl/X11/dri", name = "open", descriptor = "(Ljava/lang/String;)Z")
	private static native boolean open(@OriginalArg(0) String path);

	@OriginalMember(owner = "gl!jaggl/X11/dri", name = "close", descriptor = "()Z")
	public static native boolean close();
}
