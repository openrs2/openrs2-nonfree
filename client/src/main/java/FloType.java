import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class FloType {

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
	public static int anInt549 = 0;

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "Z")
	public boolean aBoolean273 = true;

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "Z")
	public boolean aBoolean274 = true;

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
	public int anInt3868 = 8;

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
	public int anInt3870 = -1;

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
	public int anInt3869 = 0;

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
	public int anInt3874 = 1190717;

	@OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
	public int anInt3871 = 16;

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "Z")
	public boolean aBoolean275 = false;

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
	public int anInt3877 = -1;

	@OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
	public int anInt3876 = 128;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILclient!fd;I)V")
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(0) int id) {
		while (true) {
			@Pc(15) int code = buffer.readUnsignedByte();
			if (code == 0) {
				return;
			}
			this.decode(buffer, id, code);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIILclient!fd;)V")
	private void decode(@OriginalArg(3) Buffer buffer, @OriginalArg(2) int id, @OriginalArg(0) int code) {
		if (code == 1) {
			this.anInt3869 = ColorUtils.rgbToHslTransparent(buffer.readUnsignedMedium());
		} else if (code == 2) {
			this.anInt3877 = buffer.readUnsignedByte();
		} else if (code == 3) {
			this.anInt3877 = buffer.readUnsignedShort();
			if (this.anInt3877 == 65535) {
				this.anInt3877 = -1;
			}
		} else if (code == 5) {
			this.aBoolean274 = false;
		} else if (code == 7) {
			this.anInt3870 = ColorUtils.rgbToHslTransparent(buffer.readUnsignedMedium());
		} else if (code == 8) {
			anInt549 = id;
		} else if (code == 9) {
			this.anInt3876 = buffer.readUnsignedShort();
		} else if (code == 10) {
			this.aBoolean273 = false;
		} else if (code == 11) {
			this.anInt3868 = buffer.readUnsignedByte();
		} else if (code == 12) {
			this.aBoolean275 = true;
		} else if (code == 13) {
			this.anInt3874 = buffer.readUnsignedMedium();
		} else if (code == 14) {
			this.anInt3871 = buffer.readUnsignedByte();
		}
	}
}
