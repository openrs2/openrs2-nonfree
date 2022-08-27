import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class VarbitType {

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
	public int baseVar;

	@OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
	public int startBit;

	@OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
	public int endBit;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!fd;B)V")
	public void decode(@OriginalArg(0) Buffer buffer) {
		while (true) {
			@Pc(15) int code = buffer.readUnsignedByte();
			if (code == 0) {
				return;
			}
			this.decode(buffer, code);
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!fd;BI)V")
	private void decode(@OriginalArg(0) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 1) {
			this.baseVar = buffer.readUnsignedShort();
			this.startBit = buffer.readUnsignedByte();
			this.endBit = buffer.readUnsignedByte();
		}
	}
}
