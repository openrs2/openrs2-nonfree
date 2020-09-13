import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class InvType extends SecondaryNode {

	@OriginalMember(owner = "client!fn", name = "y", descriptor = "I")
	public int size = 0;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!fd;II)V")
	private void decode(@OriginalArg(0) Buffer buffer, @OriginalArg(1) int code) {
		if (code == 2) {
			this.size = buffer.readUnsignedShort();
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILclient!fd;)V")
	public final void decode(@OriginalArg(1) Buffer buffer) {
		while (true) {
			@Pc(8) int code = buffer.readUnsignedByte();
			if (code == 0) {
				return;
			}
			this.decode(buffer, code);
		}
	}
}
