import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class MidiPcmStream extends PcmStream {

	@OriginalMember(owner = "client!ld", name = "Hb", descriptor = "J")
	private long aLong110;

	@OriginalMember(owner = "client!ld", name = "Ib", descriptor = "J")
	private long timeMillis;

	@OriginalMember(owner = "client!ld", name = "Jb", descriptor = "I")
	private int track;

	@OriginalMember(owner = "client!ld", name = "Kb", descriptor = "Z")
	private boolean aBoolean212;

	@OriginalMember(owner = "client!ld", name = "Lb", descriptor = "I")
	private int time;

	@OriginalMember(owner = "client!ld", name = "Nb", descriptor = "Lclient!tg;")
	private Song song;

	@OriginalMember(owner = "client!ld", name = "Ob", descriptor = "I")
	private int anInt3091;

	@OriginalMember(owner = "client!ld", name = "Pb", descriptor = "Z")
	private boolean aBoolean213;

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "[I")
	private final int[] anIntArray274 = new int[16];

	@OriginalMember(owner = "client!ld", name = "Y", descriptor = "[[Lclient!ej;")
	private final MidiNote[][] aClass4_Sub9ArrayArray1 = new MidiNote[16][128];

	@OriginalMember(owner = "client!ld", name = "M", descriptor = "[I")
	private final int[] channelPortamento = new int[16];

	@OriginalMember(owner = "client!ld", name = "N", descriptor = "[I")
	private final int[] anIntArray278 = new int[16];

	@OriginalMember(owner = "client!ld", name = "kb", descriptor = "[I")
	private final int[] channelParameter = new int[16];

	@OriginalMember(owner = "client!ld", name = "gb", descriptor = "[I")
	private final int[] defaultChannelProgram = new int[16];

	@OriginalMember(owner = "client!ld", name = "T", descriptor = "[I")
	public final int[] anIntArray279 = new int[16];

	@OriginalMember(owner = "client!ld", name = "hb", descriptor = "[I")
	private final int[] channelProgram = new int[16];

	@OriginalMember(owner = "client!ld", name = "z", descriptor = "[I")
	public final int[] anIntArray275 = new int[16];

	@OriginalMember(owner = "client!ld", name = "V", descriptor = "[I")
	private final int[] channelExpression = new int[16];

	@OriginalMember(owner = "client!ld", name = "lb", descriptor = "[I")
	private final int[] channelVolume = new int[16];

	@OriginalMember(owner = "client!ld", name = "db", descriptor = "[I")
	private final int[] channelPan = new int[16];

	@OriginalMember(owner = "client!ld", name = "ib", descriptor = "[I")
	public final int[] channelFlags = new int[16];

	@OriginalMember(owner = "client!ld", name = "Z", descriptor = "I")
	private int volume = 256;

	@OriginalMember(owner = "client!ld", name = "E", descriptor = "[I")
	private final int[] channelBank = new int[16];

	@OriginalMember(owner = "client!ld", name = "yb", descriptor = "[I")
	private final int[] anIntArray289 = new int[16];

	@OriginalMember(owner = "client!ld", name = "Bb", descriptor = "I")
	private final int anInt3085 = 1000000;

	@OriginalMember(owner = "client!ld", name = "ab", descriptor = "[I")
	private final int[] channelModulation = new int[16];

	@OriginalMember(owner = "client!ld", name = "qb", descriptor = "[I")
	private final int[] channelPitch = new int[16];

	@OriginalMember(owner = "client!ld", name = "Fb", descriptor = "[[Lclient!ej;")
	private final MidiNote[][] notes = new MidiNote[16][128];

	@OriginalMember(owner = "client!ld", name = "Gb", descriptor = "Lclient!go;")
	private final MidiDecoder decoder = new MidiDecoder();

	@OriginalMember(owner = "client!ld", name = "Mb", descriptor = "Lclient!bn;")
	private final MidiNoteStream noteStream = new MidiNoteStream(this);

	@OriginalMember(owner = "client!ld", name = "ob", descriptor = "Lclient!ic;")
	private final HashTable instruments = new HashTable(128);

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
	public MidiPcmStream() {
		this.method2478();
		this.reset(true);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)V")
	private void setDefaultProgram() {
		this.defaultChannelProgram[9] = 128;
		this.channelBank[9] = 128;
		this.setProgram(9, 128);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!ej;I)I")
	private int getVolume(@OriginalArg(0) MidiNote note) {
		if (this.anIntArray289[note.channel] == 0) {
			return 0;
		}
		@Pc(30) int volume = this.channelExpression[note.channel] * this.channelVolume[note.channel] + 4096 >> 13;
		volume = volume * volume + 16384 >> 15;
		@Pc(41) Class157 local41 = note.aClass157_1;
		volume = volume * note.anInt1293 + 16384 >> 15;
		volume = this.volume * volume + 128 >> 8;
		@Pc(71) int volume2 = volume * this.anIntArray289[note.channel] + 128 >> 8;
		if (local41.anInt4841 > 0) {
			volume2 = (int) ((double) volume2 * Math.pow(0.5D, (double) note.anInt1304 * 1.953125E-5D * (double) local41.anInt4841) + 0.5D);
		}
		if (local41.aByteArray65 != null) {
			@Pc(106) int local106 = local41.aByteArray65[note.anInt1299 + 1];
			@Pc(109) int local109 = note.anInt1289;
			if (note.anInt1299 < local41.aByteArray65.length - 2) {
				@Pc(131) int local131 = (local41.aByteArray65[note.anInt1299] & 0xFF) << 8;
				@Pc(143) int local143 = (local41.aByteArray65[note.anInt1299 + 2] & 0xFF) << 8;
				local106 += (local109 - local131) * (local41.aByteArray65[note.anInt1299 + 3] - local106) / (local143 - local131);
			}
			volume2 = local106 * volume2 + 32 >> 6;
		}
		if (note.anInt1288 > 0 && local41.aByteArray64 != null) {
			@Pc(188) int local188 = note.anInt1288;
			@Pc(196) int local196 = local41.aByteArray64[note.anInt1300 + 1];
			if (note.anInt1300 < local41.aByteArray64.length - 2) {
				@Pc(218) int local218 = (local41.aByteArray64[note.anInt1300] & 0xFF) << 8;
				@Pc(230) int local230 = (local41.aByteArray64[note.anInt1300 + 2] & 0xFF) << 8;
				local196 += (local41.aByteArray64[note.anInt1300 + 3] - local196) * (local188 - local218) / (local230 - local218);
			}
			volume2 = local196 * volume2 + 32 >> 6;
		}
		return volume2;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(III)V")
	private void setChannelPressure(@OriginalArg(1) int channel, @OriginalArg(2) int pressure) {
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(III)V")
	private synchronized void method2478() {
		for (@Pc(8) int i = 0; i < 16; i++) {
			this.anIntArray289[i] = 256;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)V")
	public final synchronized void setVolume(@OriginalArg(1) int volume) {
		this.volume = volume;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(Lclient!ej;I)I")
	private int getPan(@OriginalArg(0) MidiNote note) {
		@Pc(12) int pan = this.channelPan[note.channel];
		return pan >= 8192 ? 16384 - ((16384 - pan) * (128 - note.pan) + 32 >> 6) : pan * note.pan + 32 >> 6;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(BI)V")
	private void method2481(@OriginalArg(1) int channel) {
		if ((this.channelFlags[channel] & 0x4) == 0) {
			return;
		}
		for (@Pc(19) MidiNote note = (MidiNote) this.noteStream.notes.head(); note != null; note = (MidiNote) this.noteStream.notes.next()) {
			if (note.channel == channel) {
				note.anInt1294 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)V")
	private void method2482(@OriginalArg(0) int channel) {
		if ((this.channelFlags[channel] & 0x2) == 0) {
			return;
		}
		for (@Pc(26) MidiNote note = (MidiNote) this.noteStream.notes.head(); note != null; note = (MidiNote) this.noteStream.notes.next()) {
			if (channel == note.channel && this.notes[channel][note.midiKey] == null && note.anInt1288 < 0) {
				note.anInt1288 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZILclient!tg;Z)V")
	private synchronized void method2483(@OriginalArg(2) Song song, @OriginalArg(0) boolean arg0, @OriginalArg(3) boolean allSoundOff) {
		this.method2510(allSoundOff);
		this.decoder.init(song.midiBytes);
		this.aLong110 = 0L;
		this.aBoolean212 = arg0;
		@Pc(24) int tracks = this.decoder.getTrackCount();
		for (@Pc(26) int i = 0; i < tracks; i++) {
			this.decoder.loadTrackPosition(i);
			this.decoder.addDeltaTime(i);
			this.decoder.saveTrackPosition(i);
		}
		this.track = this.decoder.getNextTrack();
		this.time = this.decoder.times[this.track];
		this.timeMillis = this.decoder.getTimeMillis(this.time);
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(B)V")
	public final synchronized void clearInstruments() {
		for (@Pc(7) MidiInstrument instrument = (MidiInstrument) this.instruments.head(); instrument != null; instrument = (MidiInstrument) this.instruments.next()) {
			instrument.unlink();
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
	@Override
	public final synchronized void skip(@OriginalArg(0) int len) {
		if (this.decoder.isValid()) {
			@Pc(18) int local18 = this.decoder.division * this.anInt3085 / Static7.sampleRate;
			do {
				@Pc(27) long local27 = this.aLong110 + (long) len * (long) local18;
				if (this.timeMillis - local27 >= 0L) {
					this.aLong110 = local27;
					break;
				}
				@Pc(58) int local58 = (int) ((this.timeMillis + (long) local18 - this.aLong110 - 1L) / (long) local18);
				this.aLong110 += (long) local58 * (long) local18;
				len -= local58;
				this.noteStream.skip(local58);
				this.method2498();
			} while (this.decoder.isValid());
		}
		this.noteStream.skip(len);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZII)V")
	private void noteOn(@OriginalArg(2) int channel, @OriginalArg(3) int key, @OriginalArg(0) int velocity) {
		this.noteOff(channel, key, 64);
		if ((this.channelFlags[channel] & 0x2) != 0) {
			for (@Pc(26) MidiNote note = (MidiNote) this.noteStream.notes.tail(); note != null; note = (MidiNote) this.noteStream.notes.prev()) {
				if (note.channel == channel && note.anInt1288 < 0) {
					this.notes[channel][note.midiKey] = null;
					this.notes[channel][key] = note;
					@Pc(66) int local66 = (note.anInt1297 * note.anInt1285 >> 12) + note.anInt1290;
					note.anInt1297 = 4096;
					note.anInt1290 += key - note.midiKey << 8;
					note.anInt1285 = local66 - note.anInt1290;
					note.midiKey = key;
					return;
				}
			}
		}
		@Pc(112) MidiInstrument instrument = (MidiInstrument) this.instruments.get((long) this.channelProgram[channel]);
		if (instrument == null) {
			return;
		}
		@Pc(121) PcmSound sound = instrument.sounds[key];
		if (sound == null) {
			return;
		}
		@Pc(130) MidiNote note = new MidiNote();
		note.sound = sound;
		note.instrument = instrument;
		note.channel = channel;
		note.aClass157_1 = instrument.aClass157Array1[key];
		note.anInt1283 = instrument.aByteArray56[key];
		note.midiKey = key;
		note.anInt1293 = instrument.aByteArray58[key] * velocity * velocity * instrument.anInt4326 + 1024 >> 11;
		note.pan = instrument.keyPan[key] & 0xFF;
		note.anInt1290 = (key << 8) - (instrument.aShortArray80[key] & 0x7FFF);
		note.anInt1299 = 0;
		note.anInt1300 = 0;
		note.anInt1289 = 0;
		note.anInt1288 = -1;
		note.anInt1304 = 0;
		if (this.anIntArray279[channel] == 0) {
			note.stream = SoundPcmStream.create(sound, this.method2503(note), this.getVolume(note), this.getPan(note));
		} else {
			note.stream = SoundPcmStream.create(sound, this.method2503(note), 0, this.getPan(note));
			this.method2502(note, instrument.aShortArray80[key] < 0);
		}
		if (instrument.aShortArray80[key] < 0) {
			note.stream.method3359(-1);
		}
		if (note.anInt1283 >= 0) {
			@Pc(286) MidiNote local286 = this.aClass4_Sub9ArrayArray1[channel][note.anInt1283];
			if (local286 != null && local286.anInt1288 < 0) {
				this.notes[channel][local286.midiKey] = null;
				local286.anInt1288 = 0;
			}
			this.aClass4_Sub9ArrayArray1[channel][note.anInt1283] = note;
		}
		this.noteStream.notes.addTail(note);
		this.notes[channel][key] = note;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)V")
	private void noteOff(@OriginalArg(3) int channel, @OriginalArg(2) int key, @OriginalArg(1) int velocity) {
		@Pc(12) MidiNote note = this.notes[channel][key];
		if (note == null) {
			return;
		}
		this.notes[channel][key] = null;
		if ((this.channelFlags[channel] & 0x2) == 0) {
			note.anInt1288 = 0;
			return;
		}
		for (@Pc(47) MidiNote other = (MidiNote) this.noteStream.notes.head(); other != null; other = (MidiNote) this.noteStream.notes.next()) {
			if (other.channel == note.channel && other.anInt1288 < 0 && note != other) {
				note.anInt1288 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(III)V")
	private void method2487(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray274[arg1] = arg0;
		this.anIntArray275[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)I")
	public final int getVolume() {
		return this.volume;
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(BI)V")
	private void allSoundOff(@OriginalArg(1) int channel) {
		for (@Pc(12) MidiNote note = (MidiNote) this.noteStream.notes.head(); note != null; note = (MidiNote) this.noteStream.notes.next()) {
			if (channel < 0 || channel == note.channel) {
				if (note.stream != null) {
					note.stream.method3360(Static7.sampleRate / 100);
					if (note.stream.method3372()) {
						this.noteStream.mixer.addSubStream(note.stream);
					}
					note.release();
				}
				if (note.anInt1288 < 0) {
					this.notes[note.channel][note.midiKey] = null;
				}
				note.unlink();
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZIII)V")
	private void setKeyPressure(@OriginalArg(3) int key, @OriginalArg(2) int channel, @OriginalArg(1) int pressure) {
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!ej;)Z")
	public final boolean method2491(@OriginalArg(1) MidiNote note) {
		if (note.stream != null) {
			return false;
		}
		if (note.anInt1288 >= 0) {
			note.unlink();
			if (note.anInt1283 > 0 && note == this.aClass4_Sub9ArrayArray1[note.channel][note.anInt1283]) {
				this.aClass4_Sub9ArrayArray1[note.channel][note.anInt1283] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)V")
	private void processMessage(@OriginalArg(0) int message) {
		@Pc(9) int type = message & 0xF0;
		if (type == 128) {
			@Pc(21) int key = message >> 8 & 0x7F;
			@Pc(27) int velocity = message >> 16 & 0x7F;
			@Pc(31) int channel = message & 0xF;
			this.noteOff(channel, key, velocity);
		} else if (type == 144) {
			@Pc(49) int velocity = message >> 16 & 0x7F;
			@Pc(55) int key = message >> 8 & 0x7F;
			@Pc(59) int channel = message & 0xF;
			if (velocity > 0) {
				this.noteOn(channel, key, velocity);
			} else {
				this.noteOff(channel, key, 64);
			}
		} else if (type == 160) {
			@Pc(89) int channel = message & 0xF;
			@Pc(95) int key = message >> 8 & 0x7F;
			@Pc(101) int pressure = message >> 16 & 0x7F;
			this.setKeyPressure(key, channel, pressure);
		} else if (type == 176) {
			@Pc(125) int controller = message >> 8 & 0x7F;
			@Pc(129) int channel = message & 0xF;
			@Pc(135) int value = message >> 16 & 0x7F;
			if (controller == 0) {
				this.channelBank[channel] = (this.channelBank[channel] & 0xFFE03FFF) + (value << 14);
			}
			if (controller == 32) {
				this.channelBank[channel] = (value << 7) + (this.channelBank[channel] & 0xFFFFC07F);
			}
			if (controller == 1) {
				this.channelModulation[channel] = (value << 7) + (this.channelModulation[channel] & 0xFFFFC07F);
			}
			if (controller == 33) {
				this.channelModulation[channel] = (this.channelModulation[channel] & 0xFFFFFF80) + value;
			}
			if (controller == 5) {
				this.channelPortamento[channel] = (value << 7) + (this.channelPortamento[channel] & 0xFFFFC07F);
			}
			if (controller == 37) {
				this.channelPortamento[channel] = value + (this.channelPortamento[channel] & 0xFFFFFF80);
			}
			if (controller == 7) {
				this.channelVolume[channel] = (this.channelVolume[channel] & 0xFFFFC07F) + (value << 7);
			}
			if (controller == 39) {
				this.channelVolume[channel] = value + (this.channelVolume[channel] & 0xFFFFFF80);
			}
			if (controller == 10) {
				this.channelPan[channel] = (this.channelPan[channel] & 0xFFFFC07F) + (value << 7);
			}
			if (controller == 42) {
				this.channelPan[channel] = (this.channelPan[channel] & 0xFFFFFF80) + value;
			}
			if (controller == 11) {
				this.channelExpression[channel] = (value << 7) + (this.channelExpression[channel] & 0xFFFFC07F);
			}
			if (controller == 43) {
				this.channelExpression[channel] = (this.channelExpression[channel] & 0xFFFFFF80) + value;
			}
			if (controller == 64) {
				if (value < 64) {
					this.channelFlags[channel] &= -2;
				} else {
					this.channelFlags[channel] |= 1;
				}
			}
			if (controller == 65) {
				if (value < 64) {
					this.method2482(channel);
					this.channelFlags[channel] &= -3;
				} else {
					this.channelFlags[channel] |= 2;
				}
			}
			if (controller == 99) {
				this.channelParameter[channel] = (this.channelParameter[channel] & 0x7F) + (value << 7);
			}
			if (controller == 98) {
				this.channelParameter[channel] = (this.channelParameter[channel] & 0x3F80) + value;
			}
			if (controller == 101) {
				this.channelParameter[channel] = (value << 7) + (this.channelParameter[channel] & 0x7F) + 16384;
			}
			if (controller == 100) {
				this.channelParameter[channel] = (this.channelParameter[channel] & 0x3F80) + value + 16384;
			}
			if (controller == 120) {
				this.allSoundOff(channel);
			}
			if (controller == 121) {
				this.resetAllControllers(channel);
			}
			if (controller == 123) {
				this.allNotesOff(channel);
			}
			if (controller == 6) {
				@Pc(524) int parameter = this.channelParameter[channel];
				if (parameter == 16384) {
					this.anIntArray278[channel] = (value << 7) + (this.anIntArray278[channel] & 0xFFFFC07F);
				}
			}
			if (controller == 38) {
				@Pc(553) int parameter = this.channelParameter[channel];
				if (parameter == 16384) {
					this.anIntArray278[channel] = (this.anIntArray278[channel] & 0xFFFFFF80) + value;
				}
			}
			if (controller == 16) {
				this.anIntArray279[channel] = (this.anIntArray279[channel] & 0xFFFFC07F) + (value << 7);
			}
			if (controller == 48) {
				this.anIntArray279[channel] = value + (this.anIntArray279[channel] & 0xFFFFFF80);
			}
			if (controller == 81) {
				if (value < 64) {
					this.method2481(channel);
					this.channelFlags[channel] &= -5;
				} else {
					this.channelFlags[channel] |= 4;
				}
			}
			if (controller == 17) {
				this.method2487((value << 7) + (this.anIntArray274[channel] & 0xFFFFC07F), channel);
			}
			if (controller == 49) {
				this.method2487((this.anIntArray274[channel] & 0xFFFFFF80) + value, channel);
			}
		} else if (type == 192) {
			@Pc(684) int channel = message & 0xF;
			@Pc(690) int program = message >> 8 & 0x7F;
			this.setProgram(channel, program + this.channelBank[channel]);
		} else if (type == 208) {
			@Pc(708) int channel = message & 0xF;
			@Pc(714) int pressure = message >> 8 & 0x7F;
			this.setChannelPressure(channel, pressure);
		} else if (type == 224) {
			@Pc(736) int pitch = (message >> 9 & 0x3F80) + (message >> 8 & 0x7F);
			@Pc(740) int channel = message & 0xF;
			this.setPitch(channel, pitch);
		} else {
			@Pc(750) int status = message & 0xFF;
			if (status == 255) {
				this.reset(true);
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "(III)V")
	private void setProgram(@OriginalArg(1) int channel, @OriginalArg(2) int program) {
		if (this.channelProgram[channel] != program) {
			this.channelProgram[channel] = program;
			for (@Pc(29) int key = 0; key < 128; key++) {
				this.aClass4_Sub9ArrayArray1[channel][key] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(II)V")
	private void allNotesOff(@OriginalArg(1) int channel) {
		for (@Pc(8) MidiNote note = (MidiNote) this.noteStream.notes.head(); note != null; note = (MidiNote) this.noteStream.notes.next()) {
			if ((channel < 0 || note.channel == channel) && note.anInt1288 < 0) {
				this.notes[note.channel][note.midiKey] = null;
				note.anInt1288 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IBI)V")
	private void setPitch(@OriginalArg(2) int channel, @OriginalArg(0) int pitch) {
		this.channelPitch[channel] = pitch;
	}

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "(B)Z")
	public final synchronized boolean isValid() {
		return this.decoder.isValid();
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "([III)V")
	@Override
	public final synchronized void read(@OriginalArg(0) int[] samples, @OriginalArg(1) int off, @OriginalArg(2) int len) {
		if (this.decoder.isValid()) {
			@Pc(18) int local18 = this.anInt3085 * this.decoder.division / Static7.sampleRate;
			do {
				@Pc(27) long local27 = (long) local18 * (long) len + this.aLong110;
				if (this.timeMillis - local27 >= 0L) {
					this.aLong110 = local27;
					break;
				}
				@Pc(59) int local59 = (int) (((long) local18 + this.timeMillis - this.aLong110 - 1L) / (long) local18);
				len -= local59;
				this.aLong110 += (long) local18 * (long) local59;
				this.noteStream.read(samples, off, local59);
				off += local59;
				this.method2498();
			} while (this.decoder.isValid());
		}
		this.noteStream.read(samples, off, len);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "()I")
	@Override
	public final synchronized int method3346() {
		return 0;
	}

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "(B)V")
	private void method2498() {
		@Pc(8) int track = this.track;
		@Pc(11) int time = this.time;
		@Pc(14) long timeMillis = this.timeMillis;
		if (this.song != null && this.anInt3091 == time) {
			this.method2483(this.song, this.aBoolean212, this.aBoolean213);
			this.method2498();
			return;
		}
		while (time == this.time) {
			while (time == this.decoder.times[track]) {
				this.decoder.loadTrackPosition(track);
				@Pc(71) int event = this.decoder.getNextEvent(track);
				if (event == 1) {
					this.decoder.loadEndOfTrackPosition();
					this.decoder.saveTrackPosition(track);
					if (this.decoder.hasNextTrack()) {
						if (this.song != null) {
							this.method2504(this.song, this.aBoolean212);
							this.method2498();
							return;
						}
						if (!this.aBoolean212 || time == 0) {
							this.reset(true);
							this.decoder.release();
							return;
						}
						this.decoder.setStartMillis(timeMillis);
					}
					break;
				}
				if ((event & 0x80) != 0) {
					this.processMessage(event);
				}
				this.decoder.addDeltaTime(track);
				this.decoder.saveTrackPosition(track);
			}
			track = this.decoder.getNextTrack();
			time = this.decoder.times[track];
			timeMillis = this.decoder.getTimeMillis(time);
		}
		this.timeMillis = timeMillis;
		this.time = time;
		this.track = track;
		if (this.song != null && this.anInt3091 < time) {
			this.track = -1;
			this.time = this.anInt3091;
			this.timeMillis = this.decoder.getTimeMillis(this.time);
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(IZ)V")
	private void reset(@OriginalArg(1) boolean allSoundOff) {
		if (allSoundOff) {
			this.allSoundOff(-1);
		} else {
			this.allNotesOff(-1);
		}
		this.resetAllControllers(-1);
		for (@Pc(23) int i = 0; i < 16; i++) {
			this.channelProgram[i] = this.defaultChannelProgram[i];
		}
		for (@Pc(39) int i = 0; i < 16; i++) {
			this.channelBank[i] = this.defaultChannelProgram[i] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "()Lclient!tf;")
	@Override
	public final synchronized PcmStream nextSubStream() {
		return null;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(IB)V")
	private void resetAllControllers(@OriginalArg(0) int channel) {
		if (channel < 0) {
			for (@Pc(18) int i = 0; i < 16; i++) {
				this.resetAllControllers(i);
			}
			return;
		}
		this.channelVolume[channel] = 12800;
		this.channelPan[channel] = 8192;
		this.channelExpression[channel] = 16383;
		this.channelPitch[channel] = 8192;
		this.channelModulation[channel] = 0;
		this.channelPortamento[channel] = 8192;
		this.method2482(channel);
		this.method2481(channel);
		this.channelFlags[channel] = 0;
		this.channelParameter[channel] = 32767;
		this.anIntArray278[channel] = 256;
		this.anIntArray279[channel] = 0;
		this.method2487(8192, channel);
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
	public final synchronized void method2501() {
		this.method2510(true);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!ej;BZ)V")
	public final void method2502(@OriginalArg(0) MidiNote note, @OriginalArg(2) boolean arg1) {
		@Pc(8) int local8 = note.sound.samples.length;
		@Pc(35) int local35;
		if (arg1 && note.sound.aBoolean288) {
			@Pc(22) int local22 = local8 + local8 - note.sound.start;
			local35 = (int) ((long) local22 * (long) this.anIntArray279[note.channel] >> 6);
			@Pc(39) int local39 = local8 << 8;
			if (local39 <= local35) {
				note.stream.method3364();
				local35 = local39 + local39 - local35 - 1;
			}
		} else {
			local35 = (int) ((long) local8 * (long) this.anIntArray279[note.channel] >> 6);
		}
		note.stream.method3369(local35);
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "()Lclient!tf;")
	@Override
	public final synchronized PcmStream firstSubStream() {
		return this.noteStream;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(ILclient!ej;)I")
	private int method2503(@OriginalArg(1) MidiNote note) {
		@Pc(10) int local10 = note.anInt1290 + (note.anInt1297 * note.anInt1285 >> 12);
		@Pc(13) Class157 local13 = note.aClass157_1;
		@Pc(31) int local31 = local10 + (this.anIntArray278[note.channel] * (this.channelPitch[note.channel] - 8192) >> 12);
		if (local13.anInt4847 > 0 && (local13.anInt4840 > 0 || this.channelModulation[note.channel] > 0)) {
			@Pc(57) int local57 = local13.anInt4840 << 2;
			@Pc(62) int local62 = local13.anInt4845 << 1;
			if (note.anInt1287 < local62) {
				local57 = local57 * note.anInt1287 / local62;
			}
			@Pc(88) int local88 = local57 + (this.channelModulation[note.channel] >> 7);
			@Pc(97) double local97 = Math.sin((double) (note.anInt1284 & 0x1FF) * 0.01227184630308513D);
			local31 += (int) (local97 * (double) local88);
		}
		@Pc(132) int local132 = (int) ((double) (note.sound.rate * 256) * Math.pow(2.0D, (double) local31 * 3.255208333333333E-4D) / (double) Static7.sampleRate + 0.5D);
		return local132 < 1 ? 1 : local132;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZLclient!tg;B)V")
	public final synchronized void method2504(@OriginalArg(1) Song song, @OriginalArg(0) boolean arg0) {
		this.method2483(song, arg0, true);
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(IBI)V")
	public final synchronized void init() {
		this.setDefaultProgram();
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!ej;III[I)Z")
	public final boolean method2506(@OriginalArg(0) MidiNote note, @OriginalArg(4) int[] samples, @OriginalArg(1) int off, @OriginalArg(2) int len) {
		note.anInt1303 = Static7.sampleRate / 100;
		if (note.anInt1288 >= 0 && (note.stream == null || note.stream.method3365())) {
			note.release();
			note.unlink();
			if (note.anInt1283 > 0 && this.aClass4_Sub9ArrayArray1[note.channel][note.anInt1283] == note) {
				this.aClass4_Sub9ArrayArray1[note.channel][note.anInt1283] = null;
			}
			return true;
		}
		@Pc(58) int local58 = note.anInt1297;
		@Pc(60) boolean local60 = false;
		if (local58 > 0) {
			@Pc(89) int local89 = local58 - (int) (Math.pow(2.0D, (double) this.channelPortamento[note.channel] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local89 < 0) {
				local89 = 0;
			}
			note.anInt1297 = local89;
		}
		note.stream.method3353(this.method2503(note));
		@Pc(126) double local126 = (double) ((note.midiKey - 60 << 8) + (note.anInt1285 * note.anInt1297 >> 12)) * 5.086263020833333E-6D;
		@Pc(129) Class157 local129 = note.aClass157_1;
		note.anInt1287++;
		note.anInt1284 += local129.anInt4847;
		if (local129.anInt4841 > 0) {
			if (local129.anInt4839 > 0) {
				note.anInt1304 += (int) (Math.pow(2.0D, (double) local129.anInt4839 * local126) * 128.0D + 0.5D);
			} else {
				note.anInt1304 += 128;
			}
			if (local129.anInt4841 * note.anInt1304 >= 819200) {
				local60 = true;
			}
		}
		if (local129.aByteArray65 != null) {
			if (local129.anInt4842 > 0) {
				note.anInt1289 += (int) (Math.pow(2.0D, (double) local129.anInt4842 * local126) * 128.0D + 0.5D);
			} else {
				note.anInt1289 += 128;
			}
			while (local129.aByteArray65.length - 2 > note.anInt1299 && (local129.aByteArray65[note.anInt1299 + 2] & 0xFF) << 8 < note.anInt1289) {
				note.anInt1299 += 2;
			}
			if (local129.aByteArray65.length - 2 == note.anInt1299 && local129.aByteArray65[note.anInt1299 + 1] == 0) {
				local60 = true;
			}
		}
		if (note.anInt1288 >= 0 && local129.aByteArray64 != null && (this.channelFlags[note.channel] & 0x1) == 0 && (note.anInt1283 < 0 || this.aClass4_Sub9ArrayArray1[note.channel][note.anInt1283] != note)) {
			if (local129.anInt4848 <= 0) {
				note.anInt1288 += 128;
			} else {
				note.anInt1288 += (int) (Math.pow(2.0D, local126 * (double) local129.anInt4848) * 128.0D + 0.5D);
			}
			while (local129.aByteArray64.length - 2 > note.anInt1300 && note.anInt1288 > (local129.aByteArray64[note.anInt1300 + 2] & 0xFF) << 8) {
				note.anInt1300 += 2;
			}
			if (local129.aByteArray64.length - 2 == note.anInt1300) {
				local60 = true;
			}
		}
		if (!local60) {
			note.stream.method3352(note.anInt1303, this.getVolume(note), this.getPan(note));
			return false;
		}
		note.stream.method3360(note.anInt1303);
		if (samples == null) {
			note.stream.skip(len);
		} else {
			note.stream.read(samples, off, len);
		}
		if (note.stream.method3372()) {
			this.noteStream.mixer.addSubStream(note.stream);
		}
		note.release();
		if (note.anInt1288 >= 0) {
			note.unlink();
			if (note.anInt1283 > 0 && this.aClass4_Sub9ArrayArray1[note.channel][note.anInt1283] == note) {
				this.aClass4_Sub9ArrayArray1[note.channel][note.anInt1283] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "(B)V")
	public final synchronized void releaseInstruments() {
		for (@Pc(19) MidiInstrument instrument = (MidiInstrument) this.instruments.head(); instrument != null; instrument = (MidiInstrument) this.instruments.next()) {
			instrument.release();
		}
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(IZ)V")
	private synchronized void method2510(@OriginalArg(1) boolean allSoundOff) {
		this.decoder.release();
		this.song = null;
		this.reset(allSoundOff);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILclient!tg;Lclient!fh;Lclient!jk;)Z")
	public final synchronized boolean isSongReady(@OriginalArg(3) Js5 archive, @OriginalArg(4) SoundBank bank, @OriginalArg(2) Song song) {
		song.createPrograms();
		@Pc(9) boolean ready = true;
		@Pc(24) int[] samplingRates = new int[] { 22050 };
		for (@Pc(36) ByteArrayNode node = (ByteArrayNode) song.programs.head(); node != null; node = (ByteArrayNode) song.programs.next()) {
			@Pc(43) int program = (int) node.key;
			@Pc(53) MidiInstrument instrument = (MidiInstrument) this.instruments.get(program);
			if (instrument == null) {
				instrument = MidiInstrument.create(archive, program);
				if (instrument == null) {
					ready = false;
					continue;
				}
				this.instruments.put(program, instrument);
			}
			if (!instrument.isReady(bank, samplingRates, node.value)) {
				ready = false;
			}
		}
		if (ready) {
			song.releasePrograms();
		}
		return ready;
	}
}
