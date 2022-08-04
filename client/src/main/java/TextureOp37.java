import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class TextureOp37 extends TextureOp {

	@OriginalMember(owner = "client!rg", name = "X", descriptor = "I")
	private int anInt4505 = 0;

	@OriginalMember(owner = "client!rg", name = "V", descriptor = "I")
	private int anInt4503 = 8192;

	@OriginalMember(owner = "client!rg", name = "db", descriptor = "I")
	private int anInt4508 = 2048;

	@OriginalMember(owner = "client!rg", name = "W", descriptor = "I")
	private int anInt4504 = 0;

	@OriginalMember(owner = "client!rg", name = "lb", descriptor = "I")
	private int anInt4515 = 2048;

	@OriginalMember(owner = "client!rg", name = "cb", descriptor = "I")
	private int anInt4507 = 12288;

	@OriginalMember(owner = "client!rg", name = "nb", descriptor = "I")
	private int anInt4517 = 4096;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
	public TextureOp37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(III)Z")
	private boolean method3687(@OriginalArg(0) int x, @OriginalArg(1) int y) {
		@Pc(9) int local9 = (y - x) * this.anInt4507 >> 12;
		@Pc(24) int local24 = TextureOp.COSINE[local9 * 255 >> 12 & 0xFF];
		local24 = (local24 << 12) / this.anInt4507;
		local24 = (local24 << 12) / this.anInt4503;
		local24 = this.anInt4517 * local24 >> 12;
		return local24 > x + y && -local24 < x + y;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(IIB)Z")
	private boolean method3690(@OriginalArg(1) int x, @OriginalArg(0) int y) {
		@Pc(13) int local13 = (y + x) * this.anInt4507 >> 12;
		@Pc(23) int local23 = TextureOp.COSINE[local13 * 255 >> 12 & 0xFF];
		local23 = (local23 << 12) / this.anInt4507;
		local23 = (local23 << 12) / this.anInt4503;
		local23 = local23 * this.anInt4517 >> 12;
		return local23 > y - x && y - x > -local23;
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(B)V")
	@Override
	public final void postDecode() {
		TextureOp.createTrigonometryTables();
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt4508 = buffer.readUnsignedShort();
		} else if (code == 1) {
			this.anInt4505 = buffer.readUnsignedShort();
		} else if (code == 2) {
			this.anInt4504 = buffer.readUnsignedShort();
		} else if (code == 3) {
			this.anInt4515 = buffer.readUnsignedShort();
		} else if (code == 4) {
			this.anInt4507 = buffer.readUnsignedShort();
		} else if (code == 5) {
			this.anInt4517 = buffer.readUnsignedShort();
		} else if (code == 6) {
			this.anInt4503 = buffer.readUnsignedShort();
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(12) int[] dest = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			@Pc(22) int local22 = Texture.normalisedY[y] - 2048;
			for (@Pc(24) int x = 0; x < Texture.width; x++) {
				@Pc(33) int local33 = Texture.normalisedX[x] - 2048;
				@Pc(38) int local38 = local33 + this.anInt4508;
				local38 = local38 >= -2048 ? local38 : local38 + 4096;
				@Pc(53) int local53 = local22 + this.anInt4505;
				local38 = local38 <= 2048 ? local38 : local38 - 4096;
				local53 = local53 >= -2048 ? local53 : local53 + 4096;
				local53 = local53 <= 2048 ? local53 : local53 - 4096;
				@Pc(87) int local87 = local33 + this.anInt4504;
				@Pc(92) int local92 = local22 + this.anInt4515;
				local87 = local87 >= -2048 ? local87 : local87 + 4096;
				local87 = local87 <= 2048 ? local87 : local87 - 4096;
				local92 = local92 >= -2048 ? local92 : local92 + 4096;
				local92 = local92 <= 2048 ? local92 : local92 - 4096;
				dest[x] = this.method3687(local38, local53) || this.method3690(local87, local92) ? 4096 : 0;
			}
		}
		return dest;
	}
}
