import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class TextureOpRasterizerRectangle extends TextureOpRasterizerShape {

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!fd;I)Lclient!gg;")
	public static TextureOpRasterizerRectangle create(@OriginalArg(0) Buffer buffer) {
		return new TextureOpRasterizerRectangle(buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readUnsignedMedium(), buffer.readUnsignedMedium(), buffer.readUnsignedByte());
	}

	@OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
	private final int x1;

	@OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
	private final int y1;

	@OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
	private final int x0;

	@OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
	private final int y0;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(IIIIIII)V")
	private TextureOpRasterizerRectangle(@OriginalArg(0) int x0, @OriginalArg(1) int y0, @OriginalArg(2) int x1, @OriginalArg(3) int y1, @OriginalArg(4) int fillColor, @OriginalArg(5) int outlineColor, @OriginalArg(6) int outlineWidth) {
		super(fillColor, outlineColor, outlineWidth);
		this.x1 = x1;
		this.y1 = y1;
		this.x0 = x0;
		this.y0 = y0;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIB)V")
	@Override
	public void render(@OriginalArg(0) int width, @OriginalArg(1) int height) {
		@Pc(6) int x0 = this.x0 * width >> 12;
		@Pc(17) int y0 = this.y0 * height >> 12;
		@Pc(24) int x1 = this.x1 * width >> 12;
		@Pc(31) int y1 = this.y1 * height >> 12;
		Static36.method4566(x0, this.outlineColor, this.fillColor, this.outlineWidth, y1, x1, y0);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIZ)V")
	@Override
	public void renderOutline(@OriginalArg(0) int width, @OriginalArg(1) int height) {
		@Pc(10) int x0 = this.x0 * width >> 12;
		@Pc(17) int x1 = this.x1 * width >> 12;
		@Pc(24) int y0 = this.y0 * height >> 12;
		@Pc(31) int y1 = this.y1 * height >> 12;
		Static32.method3997(x0, this.outlineColor, y0, this.outlineWidth, y1, x1);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)V")
	@Override
	public void renderFill(@OriginalArg(1) int width, @OriginalArg(2) int height) {
		@Pc(10) int x0 = this.x0 * width >> 12;
		@Pc(17) int x1 = this.x1 * width >> 12;
		@Pc(30) int y0 = this.y0 * height >> 12;
		@Pc(37) int y1 = this.y1 * height >> 12;
		Static29.method3429(x0, y1, x1, y0, this.fillColor);
	}
}
