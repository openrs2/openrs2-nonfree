import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public interface TextureProvider {

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IFIIIZ)[I")
	int[] getPixels(@OriginalArg(2) int id, @OriginalArg(3) int width, @OriginalArg(0) int height, @OriginalArg(1) float brightness);

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)Z")
	boolean isTextureReady(@OriginalArg(0) int id);

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IB)Lclient!mi;")
	Material getMaterial(@OriginalArg(0) int id);
}
