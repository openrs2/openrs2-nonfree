import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public final class TextureOp2 extends TextureOp {

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
	public TextureOp2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(1) int y) {
		return Texture.widthFractions;
	}
}
