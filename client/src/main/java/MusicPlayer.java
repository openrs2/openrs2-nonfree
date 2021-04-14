import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class MusicPlayer {
	@OriginalMember(owner = "client!si", name = "i", descriptor = "I")
	public static int groupId = -1;

	@OriginalMember(owner = "client!la", name = "cb", descriptor = "Z")
	public static boolean jingle = false;

	@OriginalMember(owner = "client!uj", name = "I", descriptor = "I")
	public static int titleSong;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIII)V")
	public static void playJingle(@OriginalArg(3) int groupId, @OriginalArg(1) int volume, @OriginalArg(2) int arg1) {
		volume = Preferences.musicVolume * volume >> 8;
		if (volume != 0 && groupId != -1) {
			MidiPlayer.playImmediate(client.js5Archive11, groupId, volume);
			jingle = true;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BII)V")
	public static void playSong(@OriginalArg(2) int groupId, @OriginalArg(1) int volume) {
		volume = volume * Preferences.musicVolume >> 8;
		if (groupId == -1 && !jingle) {
			MidiPlayer.method4718();
		} else if (groupId != -1 && (MusicPlayer.groupId != groupId || !MidiPlayer.isPlaying()) && volume != 0 && !jingle) {
			MidiPlayer.playFadeOut(client.js5Archive6, groupId, volume);
		}
		MusicPlayer.groupId = groupId;
	}
}
