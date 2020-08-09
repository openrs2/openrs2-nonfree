import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class178 {

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
	public int anInt5481 = 2048;

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
	public int anInt5484 = 2048;

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
	public int anInt5480 = 0;

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
	public int anInt5482 = 0;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILclient!fd;B)V")
	private void method4437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		if (arg1 == 1) {
			this.anInt5482 = arg2.readUnsignedByte();
		} else if (arg1 == 2) {
			this.anInt5481 = arg2.readUnsignedShort();
		} else if (arg1 == 3) {
			this.anInt5484 = arg2.readUnsignedShort();
		} else if (arg1 == 4) {
			this.anInt5480 = arg2.readShort();
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZLclient!fd;I)V")
	public final void method4438(@OriginalArg(1) Buffer arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.readUnsignedByte();
			if (local5 == 0) {
				return;
			}
			this.method4437(arg1, local5, arg0);
		}
	}
}
