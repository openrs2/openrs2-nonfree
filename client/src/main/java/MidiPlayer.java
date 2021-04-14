import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class MidiPlayer {
	@OriginalMember(owner = "client!da", name = "m", descriptor = "Lclient!ld;")
	private static MidiPcmStream stream;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "Lclient!fh;")
	private static Js5 instrumentsArchive;

	@OriginalMember(owner = "client!ta", name = "u", descriptor = "Lclient!fh;")
	private static Js5 synthArchive;

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "Lclient!fh;")
	private static Js5 vorbisArchive;

	@OriginalMember(owner = "client!ci", name = "n", descriptor = "Lclient!jk;")
	private static SoundBank soundBank;

	@OriginalMember(owner = "client!qj", name = "S", descriptor = "I")
	private static int state = 0;

	@OriginalMember(owner = "client!fo", name = "n", descriptor = "Lclient!fh;")
	private static Js5 songArchive;

	@OriginalMember(owner = "client!wh", name = "B", descriptor = "I")
	private static int songGroupId;

	@OriginalMember(owner = "client!eg", name = "H", descriptor = "I")
	private static int songFileId;

	@OriginalMember(owner = "client!ul", name = "V", descriptor = "Lclient!tg;")
	private static Song song;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
	private static int volumeFadeRate;

	@OriginalMember(owner = "client!rk", name = "s", descriptor = "Z")
	private static boolean aBoolean321;

	@OriginalMember(owner = "client!ul", name = "U", descriptor = "I")
	private static int volume;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!ld;Lclient!fh;Lclient!fh;ZLclient!fh;)Z")
	public static boolean init(@OriginalArg(0) MidiPcmStream stream, @OriginalArg(1) Js5 instrumentsArchive, @OriginalArg(2) Js5 vorbisArchive, @OriginalArg(4) Js5 synthArchive) {
		MidiPlayer.stream = stream;
		MidiPlayer.instrumentsArchive = instrumentsArchive;
		MidiPlayer.synthArchive = synthArchive;
		MidiPlayer.vorbisArchive = vorbisArchive;
		return true;
	}

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "(B)Z")
	public static boolean method639() {
		try {
			if (state == 2) {
				if (song == null) {
					song = Song.create(songArchive, songGroupId, songFileId);
					if (song == null) {
						return false;
					}
				}
				if (soundBank == null) {
					soundBank = new SoundBank(synthArchive, vorbisArchive);
				}
				if (stream.isSongReady(instrumentsArchive, soundBank, song)) {
					stream.releaseInstruments();
					stream.setVolume(volume);
					stream.method2504(song, aBoolean321);
					soundBank = null;
					song = null;
					songArchive = null;
					state = 0;
					return true;
				}
			}
		} catch (@Pc(61) Exception ex) {
			ex.printStackTrace();
			stream.method2501();
			soundBank = null;
			state = 0;
			songArchive = null;
			song = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "(II)V")
	public static void method971() {
		songGroupId = -1;
		volumeFadeRate = 2;
		songArchive = null;
		state = 1;
		songFileId = -1;
		aBoolean321 = false;
		volume = 0;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!fh;IBIIZ)V")
	public static void playFadeOut(@OriginalArg(1) Js5 archive, @OriginalArg(5) int groupId, @OriginalArg(4) int volume) {
		volumeFadeRate = 2;
		songGroupId = groupId;
		songArchive = archive;
		aBoolean321 = false;
		songFileId = 0;
		MidiPlayer.volume = volume;
		state = 1;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIZLclient!fh;)V")
	public static void playImmediate(@OriginalArg(5) Js5 archive, @OriginalArg(3) int groupId, @OriginalArg(0) int volume) {
		songFileId = 0;
		MidiPlayer.volume = volume;
		volumeFadeRate = 10000;
		songGroupId = groupId;
		songArchive = archive;
		aBoolean321 = false;
		state = 1;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
	public static void method4718() {
		stream.method2501();
		state = 1;
		songArchive = null;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
	public static void loop() {
		try {
			if (state == 1) {
				@Pc(19) int volume = stream.getVolume();
				if (volume > 0 && stream.isValid()) {
					@Pc(31) int volume2 = volume - volumeFadeRate;
					if (volume2 < 0) {
						volume2 = 0;
					}
					stream.setVolume(volume2);
					return;
				}
				stream.method2501();
				stream.clearInstruments();
				if (songArchive == null) {
					state = 0;
				} else {
					state = 2;
				}
				song = null;
				soundBank = null;
			}
		} catch (@Pc(62) Exception ex) {
			ex.printStackTrace();
			stream.method2501();
			song = null;
			songArchive = null;
			soundBank = null;
			state = 0;
		}
	}

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "(I)Z")
	public static boolean isPlaying() {
		return state == 0 ? stream.isValid() : true;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)V")
	public static void setVolume(@OriginalArg(0) int volume) {
		if (state == 0) {
			stream.setVolume(volume);
		} else {
			MidiPlayer.volume = volume;
		}
	}
}
