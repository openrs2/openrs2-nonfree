import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public interface GlTextureProvider {

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)Z")
	boolean method441(@OriginalArg(0) int id);

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(IB)Z")
	boolean method442(@OriginalArg(0) int id);

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(II)Z")
	boolean method443(@OriginalArg(1) int id);

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "(II)I")
	int getMaterialType(@OriginalArg(0) int id);

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(FII)[I")
	int[] method445(@OriginalArg(2) int id, @OriginalArg(0) float brightness);

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "(II)I")
	int getAverageColor(@OriginalArg(0) int id);

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(BI)I")
	int method447(@OriginalArg(1) int id);

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IZ)Z")
	boolean isGlTextureReady(@OriginalArg(0) int id);

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(IB)[I")
	int[] getPixels(@OriginalArg(0) int id);

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(IZ)I")
	int method450(@OriginalArg(0) int id);

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "(II)V")
	void method451(@OriginalArg(1) int id);

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZFZII)Lclient!vn;")
	SoftwareSprite getSprite(@OriginalArg(4) int id, @OriginalArg(0) boolean alpha, @OriginalArg(1) float brightness, @OriginalArg(3) int size);

	@OriginalMember(owner = "client!nk", name = "g", descriptor = "(II)Z")
	boolean isLowDetail(@OriginalArg(1) int id);

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(BII)V")
	void method454(@OriginalArg(2) int id, @OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!nk", name = "h", descriptor = "(II)I")
	int getMaterialArg(@OriginalArg(0) int id);
}
