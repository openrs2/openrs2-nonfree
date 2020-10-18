import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public final class VertexNormal {

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
	public int y;

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
	public int triangles;

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
	public int x;

	@OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
	public int z;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
	public VertexNormal() {
	}

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lclient!ci;)V")
	public VertexNormal(@OriginalArg(0) VertexNormal normal) {
		this.z = normal.z;
		this.triangles = normal.triangles;
		this.x = normal.x;
		this.y = normal.y;
	}
}
