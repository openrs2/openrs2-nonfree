import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public final class GlCleanerProgram extends Node {

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
	public final int id;

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "[Lclient!ec;")
	public final GlShader[] shaders;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(I[Lclient!ec;)V")
	public GlCleanerProgram(@OriginalArg(0) int id, @OriginalArg(1) GlShader[] shaders) {
		this.id = id;
		this.shaders = shaders;
	}
}
