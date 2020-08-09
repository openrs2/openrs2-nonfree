import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class145 {

	@OriginalMember(owner = "client!qm", name = "i", descriptor = "[I")
	public int[] anIntArray466;

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
	public int anInt4399 = -1;

	@OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
	public int anInt4405 = -1;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIILclient!fd;)V")
	private void method3617(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Buffer arg2) {
		if (arg0 == 1) {
			this.anInt4405 = arg2.readUnsignedShort();
		} else if (arg0 == 2) {
			this.anIntArray466 = new int[arg2.readUnsignedByte()];
			for (@Pc(26) int local26 = 0; local26 < this.anIntArray466.length; local26++) {
				this.anIntArray466[local26] = arg2.readUnsignedShort();
			}
		} else if (arg0 == 3) {
			this.anInt4399 = arg2.readUnsignedByte();
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IILclient!fd;)V")
	public final void method3618(@OriginalArg(1) int arg0, @OriginalArg(2) Buffer arg1) {
		while (true) {
			@Pc(15) int local15 = arg1.readUnsignedByte();
			if (local15 == 0) {
				return;
			}
			this.method3617(local15, arg0, arg1);
		}
	}
}
