import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class VarpType {

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
	public int clientCode = 0;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!fd;BI)V")
	private void decode(@OriginalArg(0) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 5) {
			this.clientCode = buffer.readUnsignedShort();
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!fd;I)V")
	public void decode(@OriginalArg(0) Buffer buffer) {
		while (true) {
			@Pc(5) int code = buffer.readUnsignedByte();
			if (code == 0) {
				return;
			}
			this.decode(buffer, code);
		}
	}
}
