import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public abstract class PcmStream extends Node {

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!tf;B)V")
	public static void setInactive(@OriginalArg(0) PcmStream stream) {
		stream.active = false;
		if (stream.sound != null) {
			stream.sound.position = 0;
		}
		for (@Pc(25) PcmStream subStream = stream.firstSubStream(); subStream != null; subStream = stream.nextSubStream()) {
			setInactive(subStream);
		}
	}

	@OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
	public int anInt4094;

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "Lclient!eb;")
	public Sound sound;

	@OriginalMember(owner = "client!tf", name = "q", descriptor = "Lclient!tf;")
	public PcmStream aClass4_Sub6_8;

	@OriginalMember(owner = "client!tf", name = "r", descriptor = "Z")
	public volatile boolean active = true;

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
	public abstract void skip(@OriginalArg(0) int len);

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "()I")
	public abstract int method3346();

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "()I")
	public int method3347() {
		return 255;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "([III)V")
	public abstract void read(@OriginalArg(0) int[] samples, @OriginalArg(1) int off, @OriginalArg(2) int len);

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "()Lclient!tf;")
	public abstract PcmStream nextSubStream();

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "()Lclient!tf;")
	public abstract PcmStream firstSubStream();

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "([III)V")
	protected final void readIfActive(@OriginalArg(0) int[] samples, @OriginalArg(1) int off, @OriginalArg(2) int len) {
		if (this.active) {
			this.read(samples, off, len);
		} else {
			this.skip(len);
		}
	}
}
