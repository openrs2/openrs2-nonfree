import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class SkyBoxSphereType {

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
	public int anInt4696;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
	public int anInt4697;

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
	public int anInt4698;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "Z")
	public boolean aBoolean327;

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
	public int anInt4700;

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
	public int anInt4706;

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
	public int anInt4703 = 16777215;

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
	public int anInt4707 = 8;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILclient!fd;I)V")
	private void decode(@OriginalArg(2) Buffer buffer, @OriginalArg(3) int code, @OriginalArg(1) int id) {
		if (code == 1) {
			this.anInt4707 = buffer.readUnsignedShort();
		} else if (code == 2) {
			this.aBoolean327 = true;
		} else if (code == 3) {
			this.anInt4696 = buffer.readShort();
			this.anInt4697 = buffer.readShort();
			this.anInt4700 = buffer.readShort();
		} else if (code == 4) {
			this.anInt4706 = buffer.readUnsignedByte();
		} else if (code == 5) {
			this.anInt4698 = buffer.readUnsignedShort();
		} else if (code == 6) {
			this.anInt4703 = buffer.readUnsignedMedium();
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BILclient!fd;)V")
	public final void decode(@OriginalArg(2) Buffer buffer, @OriginalArg(1) int id) {
		while (true) {
			@Pc(9) int code = buffer.readUnsignedByte();
			if (code == 0) {
				return;
			}
			this.decode(buffer, code, id);
		}
	}
}
