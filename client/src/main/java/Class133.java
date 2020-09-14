import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class133 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
	public int anInt4111;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
	private int anInt4116;

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
	public int anInt4119;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IILclient!fd;)V")
	public final void method3398(@OriginalArg(1) int arg0, @OriginalArg(2) Buffer arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.readUnsignedByte();
			if (local5 == 0) {
				return;
			}
			this.method3399(arg1, local5, arg0);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLclient!fd;II)V")
	private void method3399(@OriginalArg(1) Buffer arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt4116 = arg0.readUnsignedShort();
		} else if (arg1 == 2) {
			this.anInt4119 = arg0.readUnsignedByte();
			this.anInt4111 = arg0.readUnsignedByte();
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)Lclient!vn;")
	public final SoftwareSprite method3401() {
		@Pc(17) SoftwareSprite local17 = (SoftwareSprite) Static6.aClass26_46.get((long) this.anInt4116);
		if (local17 != null) {
			return local17;
		}
		@Pc(30) SoftwareSprite local30 = Static31.method3691(Static3.aClass58_58, this.anInt4116);
		if (local30 != null) {
			Static6.aClass26_46.put((long) this.anInt4116, local30);
		}
		return local30;
	}
}
