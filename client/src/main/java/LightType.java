import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class LightType {

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
	public int anInt5481 = 2048;

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
	public int anInt5484 = 2048;

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
	public int anInt5480 = 0;

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
	public int anInt5482 = 0;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILclient!fd;B)V")
	private void decode(@OriginalArg(2) Buffer buffer, @OriginalArg(0) int id, @OriginalArg(1) int code) {
		if (code == 1) {
			this.anInt5482 = buffer.readUnsignedByte();
		} else if (code == 2) {
			this.anInt5481 = buffer.readUnsignedShort();
		} else if (code == 3) {
			this.anInt5484 = buffer.readUnsignedShort();
		} else if (code == 4) {
			this.anInt5480 = buffer.readShort();
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZLclient!fd;I)V")
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int id) {
		while (true) {
			@Pc(5) int code = buffer.readUnsignedByte();
			if (code == 0) {
				return;
			}
			this.decode(buffer, id, code);
		}
	}
}
