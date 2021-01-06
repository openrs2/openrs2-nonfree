import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class VorbisMapping {

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
	public final int submaps;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
	public int mux;

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "[I")
	public final int[] submapFloor;

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "[I")
	public final int[] submapResidue;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
	public VorbisMapping() {
		VorbisSound.readBits(16);
		this.submaps = VorbisSound.readBit() == 0 ? 1 : VorbisSound.readBits(4) + 1;
		if (VorbisSound.readBit() != 0) {
			VorbisSound.readBits(8);
		}
		VorbisSound.readBits(2);
		if (this.submaps > 1) {
			this.mux = VorbisSound.readBits(4);
		}
		this.submapFloor = new int[this.submaps];
		this.submapResidue = new int[this.submaps];
		for (@Pc(42) int i = 0; i < this.submaps; i++) {
			VorbisSound.readBits(8);
			this.submapFloor[i] = VorbisSound.readBits(8);
			this.submapResidue[i] = VorbisSound.readBits(8);
		}
	}
}
