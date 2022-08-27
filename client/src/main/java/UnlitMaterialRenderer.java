import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public final class UnlitMaterialRenderer implements MaterialRenderer {

	@OriginalMember(owner = "client!q", name = "b", descriptor = "()V")
	@Override
	public void bind() {
		if (Preferences.highDetailLighting) {
			GlRenderer.setLightingEnabled(false);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "()V")
	@Override
	public void unbind() {
		if (Preferences.highDetailLighting) {
			GlRenderer.setLightingEnabled(true);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
	@Override
	public void setArgument(@OriginalArg(0) int arg) {
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "()I")
	@Override
	public int getFlags() {
		return 0;
	}
}
