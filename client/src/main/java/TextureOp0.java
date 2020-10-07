import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class TextureOp0 extends TextureOp {

	@OriginalMember(owner = "client!qb", name = "V", descriptor = "I")
	private int anInt4259;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(I)V")
	private TextureOp0(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt4259 = 4096;
		this.anInt4259 = arg0;
	}

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
	public TextureOp0() {
		this(4096);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt4259 = (buffer.readUnsignedByte() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] method4694(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			ArrayUtils.fill(local15, 0, Static2.anInt1626, this.anInt4259);
		}
		return local15;
	}
}
