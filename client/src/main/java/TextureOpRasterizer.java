import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class TextureOpRasterizer extends TextureOp {

	@OriginalMember(owner = "client!km", name = "T", descriptor = "[Lclient!lc;")
	private TextureOpRasterizerShape[] ops;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V")
	public TextureOpRasterizer() {
		super(0, true);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(9) int[] dest = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			this.render(this.monochromeImageCache.get());
		}
		return dest;
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(15) int[][] entry = this.colorImageCache.get(y);
		if (this.colorImageCache.invalid) {
			@Pc(26) int width = Texture.width;
			@Pc(28) int height = Texture.height;
			@Pc(32) int[][] src = new int[height][width];
			@Pc(37) int[][][] dest = this.colorImageCache.get();
			this.render(src);
			for (@Pc(43) int y0 = 0; y0 < Texture.height; y0++) {
				@Pc(50) int[][] destRow = dest[y0];
				@Pc(54) int[] destGreen = destRow[1];
				@Pc(58) int[] destBlue = destRow[2];
				@Pc(62) int[] srcRow = src[y0];
				@Pc(66) int[] destRed = destRow[0];
				for (@Pc(68) int x = 0; x < Texture.width; x++) {
					@Pc(79) int rgb = srcRow[x];
					destBlue[x] = (rgb & 0xFF) << 4;
					destGreen[x] = rgb >> 4 & 0xFF0;
					destRed[x] = rgb >> 12 & 0xFF0;
				}
			}
		}
		return entry;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.ops = new TextureOpRasterizerShape[buffer.readUnsignedByte()];
			for (@Pc(11) int i = 0; i < this.ops.length; i++) {
				@Pc(24) int op = buffer.readUnsignedByte();
				if (op == 0) {
					this.ops[i] = TextureOpRasterizerLine.create(buffer);
				} else if (op == 1) {
					this.ops[i] = TextureOpRasterizerBezierCurve.create(buffer);
				} else if (op == 2) {
					this.ops[i] = TextureOpRasterizerRectangle.create(buffer);
				} else if (op == 3) {
					this.ops[i] = TextureOpRasterizerEllipse.create(buffer);
				}
			}
		} else if (code == 1) {
			this.monochrome = buffer.readUnsignedByte() == 1;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(B[[I)V")
	private void render(@OriginalArg(1) int[][] pixels) {
		@Pc(15) int width = Texture.width;
		@Pc(17) int height = Texture.height;
		Static35.method4335(pixels);
		Static18.method4374(Texture.heightMask, Texture.widthMask);
		if (this.ops == null) {
			return;
		}
		for (@Pc(32) int i = 0; i < this.ops.length; i++) {
			@Pc(46) TextureOpRasterizerShape op = this.ops[i];
			@Pc(49) int outlineColor = op.outlineColor;
			@Pc(52) int fillColor = op.fillColor;
			if (fillColor >= 0) {
				if (outlineColor >= 0) {
					op.render(width, height);
				} else {
					op.renderFill(width, height);
				}
			} else if (outlineColor >= 0) {
				op.renderOutline(width, height);
			}
		}
	}
}
