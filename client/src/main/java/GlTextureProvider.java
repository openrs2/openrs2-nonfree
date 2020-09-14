import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public interface GlTextureProvider {

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)Z")
	boolean method441(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(IB)Z")
	boolean method442(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(II)Z")
	boolean method443(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "(II)I")
	int method444(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(FII)[I")
	int[] method445(@OriginalArg(2) int id, @OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "(II)I")
	int method446(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(BI)I")
	int method447(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IZ)Z")
	boolean isGlTextureReady(@OriginalArg(0) int id);

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(IB)[I")
	int[] method449(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(IZ)I")
	int method450(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "(II)V")
	void method451(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZFZII)Lclient!vn;")
	SoftwareSprite method452(@OriginalArg(4) int id, @OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!nk", name = "g", descriptor = "(II)Z")
	boolean isLowDetail(@OriginalArg(1) int id);

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(BII)V")
	void method454(@OriginalArg(2) int id, @OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!nk", name = "h", descriptor = "(II)I")
	int method455(@OriginalArg(0) int arg0);
}
