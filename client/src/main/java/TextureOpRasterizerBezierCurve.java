import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class TextureOpRasterizerBezierCurve extends TextureOpRasterizerShape {

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZLclient!fd;)Lclient!in;")
	public static TextureOpRasterizerBezierCurve create(@OriginalArg(1) Buffer buffer) {
		return new TextureOpRasterizerBezierCurve(buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readUnsignedMedium(), buffer.readUnsignedByte());
	}

	@OriginalMember(owner = "client!in", name = "w", descriptor = "I")
	private final int y1;

	@OriginalMember(owner = "client!in", name = "r", descriptor = "I")
	private final int x0;

	@OriginalMember(owner = "client!in", name = "v", descriptor = "I")
	private final int y0;

	@OriginalMember(owner = "client!in", name = "l", descriptor = "I")
	private final int x1;

	@OriginalMember(owner = "client!in", name = "s", descriptor = "I")
	private final int x2;

	@OriginalMember(owner = "client!in", name = "n", descriptor = "I")
	private final int y2;

	@OriginalMember(owner = "client!in", name = "t", descriptor = "I")
	private final int x3;

	@OriginalMember(owner = "client!in", name = "m", descriptor = "I")
	private final int y3;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(IIIIIIIIII)V")
	private TextureOpRasterizerBezierCurve(@OriginalArg(0) int x0, @OriginalArg(1) int y0, @OriginalArg(2) int x1, @OriginalArg(3) int y1, @OriginalArg(4) int x2, @OriginalArg(5) int y2, @OriginalArg(6) int x3, @OriginalArg(7) int y3, @OriginalArg(8) int color, @OriginalArg(9) int outlineWidth) {
		super(-1, color, outlineWidth);
		this.y1 = y1;
		this.x0 = x0;
		this.y0 = y0;
		this.x1 = x1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIZ)V")
	@Override
	public final void renderOutline(@OriginalArg(0) int width, @OriginalArg(1) int height) {
		@Pc(10) int x0 = width * this.x0 >> 12;
		@Pc(17) int x1 = width * this.x1 >> 12;
		@Pc(24) int y1 = height * this.y1 >> 12;
		@Pc(31) int x2 = width * this.x2 >> 12;
		@Pc(38) int y0 = height * this.y0 >> 12;
		@Pc(45) int y2 = height * this.y2 >> 12;
		@Pc(62) int y3 = height * this.y3 >> 12;
		@Pc(69) int x3 = width * this.x3 >> 12;
		Static22.method4693(x1, y1, this.outlineColor, x2, x3, y0, y3, y2, x0);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(III)V")
	@Override
	public final void renderFill(@OriginalArg(1) int width, @OriginalArg(2) int height) {
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIB)V")
	@Override
	public final void render(@OriginalArg(0) int width, @OriginalArg(1) int height) {
	}
}
