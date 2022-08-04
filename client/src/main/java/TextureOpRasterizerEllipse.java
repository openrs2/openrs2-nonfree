import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class TextureOpRasterizerEllipse extends TextureOpRasterizerShape {

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!fd;Z)Lclient!am;")
	public static TextureOpRasterizerEllipse create(@OriginalArg(0) Buffer buffer) {
		return new TextureOpRasterizerEllipse(buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readUnsignedMedium(), buffer.readUnsignedMedium(), buffer.readUnsignedByte());
	}

	@OriginalMember(owner = "client!am", name = "t", descriptor = "I")
	private final int x;

	@OriginalMember(owner = "client!am", name = "u", descriptor = "I")
	private final int horizontalRadius;

	@OriginalMember(owner = "client!am", name = "q", descriptor = "I")
	private final int y;

	@OriginalMember(owner = "client!am", name = "p", descriptor = "I")
	private final int verticalRadius;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(IIIIIII)V")
	private TextureOpRasterizerEllipse(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int horizontalRadius, @OriginalArg(3) int verticalRadius, @OriginalArg(4) int fillColor, @OriginalArg(5) int outlineColor, @OriginalArg(6) int outlineWidth) {
		super(fillColor, outlineColor, outlineWidth);
		this.x = x;
		this.horizontalRadius = horizontalRadius;
		this.y = y;
		this.verticalRadius = verticalRadius;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIB)V")
	@Override
	public final void render(@OriginalArg(0) int width, @OriginalArg(1) int height) {
		@Pc(10) int x = this.x * width >> 12;
		@Pc(21) int horizontalRadius = this.horizontalRadius * width >> 12;
		@Pc(28) int verticalRadius = this.verticalRadius * height >> 12;
		@Pc(35) int y = this.y * height >> 12;
		Static18.method1745(horizontalRadius, this.fillColor, x, this.outlineColor, this.outlineWidth, y, verticalRadius);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(III)V")
	@Override
	public final void renderFill(@OriginalArg(1) int width, @OriginalArg(2) int height) {
		@Pc(10) int x = this.x * width >> 12;
		@Pc(17) int horizontalRadius = this.horizontalRadius * width >> 12;
		@Pc(24) int verticalRadius = this.verticalRadius * height >> 12;
		@Pc(31) int y = this.y * height >> 12;
		Static28.method3323(verticalRadius, x, this.fillColor, y, horizontalRadius);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIZ)V")
	@Override
	public final void renderOutline(@OriginalArg(0) int width, @OriginalArg(1) int height) {
	}
}
