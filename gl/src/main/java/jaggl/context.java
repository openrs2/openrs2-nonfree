package jaggl;

import java.awt.Component;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.HashSet;
import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("gl!jaggl/context")
public final class context {

	@OriginalMember(owner = "gl!jaggl/context", name = "extensionsString", descriptor = "Ljava/util/HashSet;")
	private static HashSet extensionsString = null;

	@OriginalMember(owner = "gl!jaggl/context", name = "gl", descriptor = "Lgl!jaggl/opengl;")
	private static final opengl gl = new opengl();

	@OriginalMember(owner = "gl!jaggl/context", name = "choosePixelFormat", descriptor = "(Ljava/awt/Component;II)Z")
	public static boolean choosePixelFormat(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Boolean local8 = (Boolean) AccessController.doPrivileged(new PrivilegedAction() {

			@OriginalMember(owner = "gl!jaggl/context$2", name = "run", descriptor = "()Ljava/lang/Object;")
			@Override
			public final Object run() {
				return context.choosePixelFormat1(arg0, arg1, arg2);
			}
		});
		return local8;
	}

	@OriginalMember(owner = "gl!jaggl/context", name = "createContext", descriptor = "()Z")
	public static native boolean createContext();

	@OriginalMember(owner = "gl!jaggl/context", name = "releaseContext", descriptor = "()Z")
	public static native boolean releaseContext();

	@OriginalMember(owner = "gl!jaggl/context", name = "destroy", descriptor = "()Z")
	public static native boolean destroy();

	@OriginalMember(owner = "gl!jaggl/context", name = "swapBuffers", descriptor = "()Z")
	public static native boolean swapBuffers();

	@OriginalMember(owner = "gl!jaggl/context", name = "getLastError", descriptor = "()I")
	public static native int getLastError();

	@OriginalMember(owner = "gl!jaggl/context", name = "setSwapInterval", descriptor = "(I)V")
	public static native void setSwapInterval(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!jaggl/context", name = "getExtensionsString", descriptor = "()Ljava/lang/String;")
	private static native String getExtensionsString();

	@OriginalMember(owner = "gl!jaggl/context", name = "isExtensionAvailable", descriptor = "(Ljava/lang/String;)Z")
	public static boolean isExtensionAvailable(@OriginalArg(0) String arg0) {
		if (extensionsString == null) {
			@Pc(14) String local14 = gl.glGetString(GL.GL_EXTENSIONS) + " " + getExtensionsString();
			@Pc(18) String[] local18 = local14.split(" ");
			extensionsString = new HashSet(local18.length);
			for (@Pc(26) int local26 = 0; local26 < local18.length; local26++) {
				extensionsString.add(local18[local26]);
			}
		}
		return extensionsString.contains(arg0);
	}

	@OriginalMember(owner = "gl!jaggl/context", name = "makeCurrent", descriptor = "()Z")
	public static boolean makeCurrent() {
		extensionsString = null;
		return makeCurrent1();
	}

	@OriginalMember(owner = "gl!jaggl/context", name = "getAlphaBits", descriptor = "()I")
	public static native int getAlphaBits();

	@OriginalMember(owner = "gl!jaggl/context", name = "choosePixelFormat1", descriptor = "(Ljava/awt/Component;II)Z")
	public static native boolean choosePixelFormat1(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "gl!jaggl/context", name = "makeCurrent1", descriptor = "()Z")
	private static native boolean makeCurrent1();
}
