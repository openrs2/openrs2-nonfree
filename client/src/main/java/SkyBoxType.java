import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class SkyBoxType {

	@OriginalMember(owner = "client!qm", name = "i", descriptor = "[I")
	public int[] spheres;

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
	public int defaultSphereIndex = -1;

	@OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
	public int textureId = -1;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIILclient!fd;)V")
	private void decode(@OriginalArg(3) Buffer buffer, @OriginalArg(2) int id, @OriginalArg(1) int code) {
		if (code == 1) {
			this.textureId = buffer.readUnsignedShort();
		} else if (code == 2) {
			this.spheres = new int[buffer.readUnsignedByte()];
			for (@Pc(26) int i = 0; i < this.spheres.length; i++) {
				this.spheres[i] = buffer.readUnsignedShort();
			}
		} else if (code == 3) {
			this.defaultSphereIndex = buffer.readUnsignedByte();
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IILclient!fd;)V")
	public void decode(@OriginalArg(2) Buffer buffer, @OriginalArg(1) int id) {
		while (true) {
			@Pc(15) int code = buffer.readUnsignedByte();
			if (code == 0) {
				return;
			}
			this.decode(buffer, id, code);
		}
	}
}
