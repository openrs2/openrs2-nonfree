import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public final class Class142 {

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "Z")
	public boolean aBoolean302 = true;

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
	public final int anInt4301;

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
	public final int anInt4298;

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
	public final int anInt4297;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
	public final int anInt4294;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
	public final int anInt4299;

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
	public final int anInt4296;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt4301 = arg3;
		this.anInt4298 = arg0;
		this.anInt4297 = arg4;
		this.anInt4294 = arg5;
		this.anInt4299 = arg2;
		this.aBoolean302 = arg6;
		this.anInt4296 = arg1;
	}
}
