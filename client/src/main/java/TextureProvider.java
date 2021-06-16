import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public interface TextureProvider {

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IFIIIZ)[I")
	int[] method415(@OriginalArg(2) int id, @OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)Z")
	boolean isTextureReady(@OriginalArg(0) int id);

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IB)Lclient!mi;")
	Material getMaterial(@OriginalArg(0) int id);
}
