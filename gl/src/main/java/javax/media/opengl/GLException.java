package javax.media.opengl;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!javax/media/opengl/GLException")
public final class GLException extends RuntimeException {

	@OriginalMember(owner = "gl!javax/media/opengl/GLException", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public GLException(@OriginalArg(0) String message) {
		super(message);
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLException", name = "<init>", descriptor = "(Ljava/lang/Throwable;)V")
	public GLException(@OriginalArg(0) Throwable cause) {
		super(cause);
	}
}
