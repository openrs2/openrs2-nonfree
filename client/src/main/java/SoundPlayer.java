import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class SoundPlayer {
	@OriginalMember(owner = "client!lf", name = "db", descriptor = "[I")
	public static final int[] ids = new int[50];

	@OriginalMember(owner = "client!vh", name = "B", descriptor = "[I")
	public static final int[] loops = new int[50];

	@OriginalMember(owner = "client!il", name = "f", descriptor = "[I")
	public static final int[] delays = new int[50];

	@OriginalMember(owner = "client!al", name = "K", descriptor = "[I")
	public static final int[] volumes = new int[50];

	@OriginalMember(owner = "client!md", name = "o", descriptor = "[Lclient!ag;")
	public static final SynthSound[] sounds = new SynthSound[50];

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "[I")
	public static final int[] positions = new int[50];

	@OriginalMember(owner = "client!re", name = "c", descriptor = "I")
	public static int size = 0;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BIIII)V")
	public static void play(@OriginalArg(1) int delay, @OriginalArg(2) int id, @OriginalArg(3) int loops, @OriginalArg(4) int volume) {
		if (Preferences.soundEffectsVolume == 0 || loops == 0 || size >= 50 || id == -1) {
			return;
		}
		ids[size] = id;
		SoundPlayer.loops[size] = loops;
		delays[size] = delay;
		sounds[size] = null;
		positions[size] = 0;
		volumes[size] = volume;
		size++;
	}

	@OriginalMember(owner = "client!og", name = "f", descriptor = "(B)V")
	public static void loop() {
		for (@Pc(3) int i = 0; i < size; i++) {
			@Pc(10) int local10 = delays[i]--;
			if (delays[i] >= -10) {
				@Pc(89) SynthSound sound = sounds[i];
				if (sound == null) {
					sound = SynthSound.create(client.js5Archive4, ids[i], 0);
					if (sound == null) {
						continue;
					}
					@Pc(104) int[] delays = SoundPlayer.delays;
					delays[i] += sound.getStart();
					sounds[i] = sound;
				}
				if (delays[i] < 0) {
					@Pc(223) int volume;
					if (positions[i] == 0) {
						volume = volumes[i] * Preferences.soundEffectsVolume >> 8;
					} else {
						@Pc(137) int minDistance = (positions[i] & 0xFF) * 128;
						@Pc(145) int x = positions[i] >> 16 & 0xFF;
						@Pc(155) int xFine = x * 128 + 64 - PlayerList.self.xFine;
						if (xFine < 0) {
							xFine = -xFine;
						}
						@Pc(171) int z = positions[i] >> 8 & 0xFF;
						@Pc(181) int zFine = z * 128 + 64 - PlayerList.self.zFine;
						if (zFine < 0) {
							zFine = -zFine;
						}
						@Pc(192) int distance = zFine + xFine - 128;
						if (minDistance < distance) {
							delays[i] = -100;
							continue;
						}
						if (distance < 0) {
							distance = 0;
						}
						volume = (minDistance - distance) * Preferences.areaSoundsVolume * volumes[i] / minDistance >> 8;
					}
					if (volume > 0) {
						@Pc(240) PcmSound pcmSound = sound.toPcmSound().resample(client.resampler);
						@Pc(245) SoundPcmStream stream = SoundPcmStream.create(pcmSound, volume);
						stream.method3359(loops[i] - 1);
						client.soundStream.addSubStream(stream);
					}
					delays[i] = -100;
				}
			} else {
				size--;
				for (@Pc(24) int j = i; j < size; j++) {
					ids[j] = ids[j + 1];
					sounds[j] = sounds[j + 1];
					loops[j] = loops[j + 1];
					delays[j] = delays[j + 1];
					positions[j] = positions[j + 1];
					volumes[j] = volumes[j + 1];
				}
				i--;
			}
		}
		if (MusicPlayer.jingle && !MidiPlayer.isPlaying()) {
			if (Preferences.musicVolume != 0 && MusicPlayer.groupId != -1) {
				MidiPlayer.playImmediate(client.js5Archive6, MusicPlayer.groupId, Preferences.musicVolume);
			}
			MusicPlayer.jingle = false;
		} else if (Preferences.musicVolume != 0 && MusicPlayer.groupId != -1 && !MidiPlayer.isPlaying()) {
			Protocol.outboundBuffer.writeOpcode(250);
			Protocol.outboundBuffer.writeInt(MusicPlayer.groupId);
			MusicPlayer.groupId = -1;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!eg;IIIZZ)V")
	public static void playSeqSound(@OriginalArg(0) SeqType seqType, @OriginalArg(2) int xFine, @OriginalArg(1) int zFine, @OriginalArg(3) int index, @OriginalArg(4) boolean self) {
		if (size >= 50 || (seqType == null || seqType.sounds == null || seqType.sounds.length <= index || seqType.sounds[index] == null)) {
			return;
		}
		@Pc(34) int sound = seqType.sounds[index][0];
		@Pc(38) int id = sound >> 8;
		@Pc(44) int loops = sound >> 5 & 0x7;
		@Pc(52) int minDistance = sound & 0x1F;
		if (seqType.sounds[index].length > 1) {
			@Pc(69) int alternativeIdIndex = (int) ((double) seqType.sounds[index].length * Math.random());
			if (alternativeIdIndex > 0) {
				id = seqType.sounds[index][alternativeIdIndex];
			}
		}
		if (minDistance == 0) {
			if (self) {
				play(0, id, loops, 255);
			}
		} else if (Preferences.areaSoundsVolume != 0) {
			ids[size] = id;
			SoundPlayer.loops[size] = loops;
			@Pc(113) int z = (zFine - 64) / 128;
			delays[size] = 0;
			sounds[size] = null;
			volumes[size] = 255;
			@Pc(131) int x = (xFine - 64) / 128;
			positions[size] = minDistance + (z << 8) + (x << 16);
			size++;
		}
	}
}
