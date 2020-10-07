import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class SkyBoxType {

	@OriginalMember(owner = "client!qm", name = "i", descriptor = "[I")
	public int[] anIntArray466;

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
	public int anInt4399 = -1;

	@OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
	public int anInt4405 = -1;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIILclient!fd;)V")
	private void decode(@OriginalArg(3) Buffer buffer, @OriginalArg(2) int id, @OriginalArg(1) int code) {
		if (code == 1) {
			this.anInt4405 = buffer.readUnsignedShort();
		} else if (code == 2) {
			this.anIntArray466 = new int[buffer.readUnsignedByte()];
			for (@Pc(26) int local26 = 0; local26 < this.anIntArray466.length; local26++) {
				this.anIntArray466[local26] = buffer.readUnsignedShort();
			}
		} else if (code == 3) {
			this.anInt4399 = buffer.readUnsignedByte();
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IILclient!fd;)V")
	public final void decode(@OriginalArg(2) Buffer buffer, @OriginalArg(1) int id) {
		while (true) {
			@Pc(15) int code = buffer.readUnsignedByte();
			if (code == 0) {
				return;
			}
			this.decode(buffer, id, code);
		}
	}
}
