import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class TextureOpRasterizerLine extends TextureOpRasterizerShape {

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(Lclient!fd;I)Lclient!de;")
	public static TextureOpRasterizerLine create(@OriginalArg(0) Buffer buffer) {
		return new TextureOpRasterizerLine(buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readUnsignedMedium(), buffer.readUnsignedByte());
	}

	@OriginalMember(owner = "client!de", name = "y", descriptor = "I")
	private final int x1;

	@OriginalMember(owner = "client!de", name = "u", descriptor = "I")
	private final int y0;

	@OriginalMember(owner = "client!de", name = "w", descriptor = "I")
	private final int x0;

	@OriginalMember(owner = "client!de", name = "v", descriptor = "I")
	private final int y1;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(IIIIII)V")
	private TextureOpRasterizerLine(@OriginalArg(0) int x0, @OriginalArg(1) int y0, @OriginalArg(2) int x1, @OriginalArg(3) int y1, @OriginalArg(4) int color, @OriginalArg(5) int outlineWidth) {
		super(-1, color, outlineWidth);
		this.x1 = x1;
		this.y0 = y0;
		this.x0 = x0;
		this.y1 = y1;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III)V")
	@Override
	public void renderFill(@OriginalArg(1) int width, @OriginalArg(2) int height) {
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIZ)V")
	@Override
	public void renderOutline(@OriginalArg(0) int width, @OriginalArg(1) int height) {
		@Pc(6) int x0 = this.x0 * width >> 12;
		@Pc(25) int x1 = this.x1 * width >> 12;
		@Pc(32) int y1 = this.y1 * height >> 12;
		@Pc(39) int y0 = this.y0 * height >> 12;
		Static32.method4022(y0, y1, this.outlineColor, x0, x1);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIB)V")
	@Override
	public void render(@OriginalArg(0) int width, @OriginalArg(1) int height) {
	}
}
