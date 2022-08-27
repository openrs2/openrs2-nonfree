import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public final class MidiNote extends Node {

	@OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
	public int anInt1283;

	@OriginalMember(owner = "client!ej", name = "t", descriptor = "Lclient!pc;")
	public SoundPcmStream stream;

	@OriginalMember(owner = "client!ej", name = "u", descriptor = "Lclient!pb;")
	public PcmSound sound;

	@OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
	public int anInt1284;

	@OriginalMember(owner = "client!ej", name = "y", descriptor = "I")
	public int anInt1285;

	@OriginalMember(owner = "client!ej", name = "A", descriptor = "I")
	public int anInt1287;

	@OriginalMember(owner = "client!ej", name = "B", descriptor = "I")
	public int anInt1288;

	@OriginalMember(owner = "client!ej", name = "C", descriptor = "I")
	public int anInt1289;

	@OriginalMember(owner = "client!ej", name = "D", descriptor = "I")
	public int anInt1290;

	@OriginalMember(owner = "client!ej", name = "E", descriptor = "I")
	public int pan;

	@OriginalMember(owner = "client!ej", name = "G", descriptor = "I")
	public int anInt1293;

	@OriginalMember(owner = "client!ej", name = "H", descriptor = "I")
	public int anInt1294;

	@OriginalMember(owner = "client!ej", name = "J", descriptor = "Lclient!qh;")
	public MidiInstrument instrument;

	@OriginalMember(owner = "client!ej", name = "K", descriptor = "I")
	public int midiKey;

	@OriginalMember(owner = "client!ej", name = "L", descriptor = "I")
	public int anInt1297;

	@OriginalMember(owner = "client!ej", name = "N", descriptor = "Lclient!si;")
	public Class157 aClass157_1;

	@OriginalMember(owner = "client!ej", name = "O", descriptor = "I")
	public int anInt1299;

	@OriginalMember(owner = "client!ej", name = "P", descriptor = "I")
	public int anInt1300;

	@OriginalMember(owner = "client!ej", name = "Q", descriptor = "I")
	public int channel;

	@OriginalMember(owner = "client!ej", name = "S", descriptor = "I")
	public int anInt1303;

	@OriginalMember(owner = "client!ej", name = "T", descriptor = "I")
	public int anInt1304;

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
	public void release() {
		this.stream = null;
		this.aClass157_1 = null;
		this.instrument = null;
		this.sound = null;
	}
}
