import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class MidiNoteStream extends PcmStream {

	@OriginalMember(owner = "client!bn", name = "y", descriptor = "Lclient!ll;")
	public final LinkedList notes = new LinkedList();

	@OriginalMember(owner = "client!bn", name = "K", descriptor = "Lclient!lo;")
	public final MixerPcmStream mixer = new MixerPcmStream();

	@OriginalMember(owner = "client!bn", name = "z", descriptor = "Lclient!ld;")
	private final MidiPcmStream parent;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lclient!ld;)V")
	public MidiNoteStream(@OriginalArg(0) MidiPcmStream parent) {
		this.parent = parent;
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)V")
	@Override
	public void skip(@OriginalArg(0) int len) {
		this.mixer.skip(len);
		for (@Pc(15) MidiNote note = (MidiNote) this.notes.head(); note != null; note = (MidiNote) this.notes.next()) {
			if (!this.parent.method2491(note)) {
				@Pc(28) int len2 = len;
				do {
					if (note.anInt1303 >= len2) {
						this.skip(note, len2);
						note.anInt1303 -= len2;
						break;
					}
					this.skip(note, note.anInt1303);
					len2 -= note.anInt1303;
				} while (!this.parent.method2506(note, null, 0, len2));
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILclient!ej;I[IIB)V")
	private void read(@OriginalArg(1) MidiNote note, @OriginalArg(3) int[] samples, @OriginalArg(2) int off, @OriginalArg(4) int arg4, @OriginalArg(0) int arg0) {
		if ((this.parent.channelFlags[note.channel] & 0x4) != 0 && note.anInt1288 < 0) {
			@Pc(28) int local28 = this.parent.anIntArray275[note.channel] / Static7.sampleRate;
			while (true) {
				@Pc(39) int local39 = (local28 + 1048575 - note.anInt1294) / local28;
				if (arg0 < local39) {
					note.anInt1294 += local28 * arg0;
					break;
				}
				note.stream.read(samples, off, local39);
				off += local39;
				@Pc(56) int local56 = 262144 / local28;
				@Pc(59) SoundPcmStream local59 = note.stream;
				@Pc(63) int local63 = Static7.sampleRate / 100;
				arg0 -= local39;
				if (local63 > local56) {
					local63 = local56;
				}
				note.anInt1294 += local28 * local39 - 1048576;
				if (this.parent.anIntArray279[note.channel] == 0) {
					note.stream = SoundPcmStream.create(note.sound, local59.method3368(), local59.getVolume(), local59.getPan());
				} else {
					note.stream = SoundPcmStream.create(note.sound, local59.method3368(), 0, local59.getPan());
					this.parent.method2502(note, note.instrument.aShortArray80[note.midiKey] < 0);
					note.stream.method3379(local63, local59.getVolume());
				}
				if (note.instrument.aShortArray80[note.midiKey] < 0) {
					note.stream.setLoops(-1);
				}
				local59.method3360(local63);
				local59.read(samples, off, arg4 - off);
				if (local59.method3372()) {
					this.mixer.addSubStream(local59);
				}
			}
		}
		note.stream.read(samples, off, arg0);
	}

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "()Lclient!tf;")
	@Override
	public PcmStream firstSubStream() {
		@Pc(9) MidiNote note = (MidiNote) this.notes.head();
		if (note == null) {
			return null;
		} else if (note.stream == null) {
			return this.nextSubStream();
		} else {
			return note.stream;
		}
	}

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "()Lclient!tf;")
	@Override
	public PcmStream nextSubStream() {
		@Pc(9) MidiNote note;
		do {
			note = (MidiNote) this.notes.next();
			if (note == null) {
				return null;
			}
		} while (note.stream == null);
		return note.stream;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "([III)V")
	@Override
	public void read(@OriginalArg(0) int[] samples, @OriginalArg(1) int off, @OriginalArg(2) int len) {
		this.mixer.read(samples, off, len);
		for (@Pc(17) MidiNote note = (MidiNote) this.notes.head(); note != null; note = (MidiNote) this.notes.next()) {
			if (!this.parent.method2491(note)) {
				@Pc(28) int off2 = off;
				@Pc(30) int len2 = len;
				do {
					if (note.anInt1303 >= len2) {
						this.read(note, samples, off2, len2 + off2, len2);
						note.anInt1303 -= len2;
						break;
					}
					this.read(note, samples, off2, off2 + len2, note.anInt1303);
					len2 -= note.anInt1303;
					off2 += note.anInt1303;
				} while (!this.parent.method2506(note, samples, off2, len2));
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IILclient!ej;)V")
	private void skip(@OriginalArg(2) MidiNote instrument, @OriginalArg(1) int len) {
		if ((this.parent.channelFlags[instrument.channel] & 0x4) != 0 && instrument.anInt1288 < 0) {
			@Pc(28) int local28 = this.parent.anIntArray275[instrument.channel] / Static7.sampleRate;
			@Pc(38) int local38 = (local28 + 1048575 - instrument.anInt1294) / local28;
			instrument.anInt1294 = local28 * len + instrument.anInt1294 & 0xFFFFF;
			if (len >= local38) {
				if (this.parent.anIntArray279[instrument.channel] == 0) {
					instrument.stream = SoundPcmStream.create(instrument.sound, instrument.stream.method3368(), instrument.stream.getVolume(), instrument.stream.getPan());
				} else {
					instrument.stream = SoundPcmStream.create(instrument.sound, instrument.stream.method3368(), 0, instrument.stream.getPan());
					this.parent.method2502(instrument, instrument.instrument.aShortArray80[instrument.midiKey] < 0);
				}
				if (instrument.instrument.aShortArray80[instrument.midiKey] < 0) {
					instrument.stream.setLoops(-1);
				}
				len = instrument.anInt1294 / local28;
			}
		}
		instrument.stream.skip(len);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "()I")
	@Override
	public int method3346() {
		return 0;
	}
}
