import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class AreaSound extends Node {

	@OriginalMember(owner = "client!gn", name = "o", descriptor = "Lclient!pc;")
	public SoundPcmStream secondaryStream;

	@OriginalMember(owner = "client!gn", name = "s", descriptor = "I")
	public int maxZFine;

	@OriginalMember(owner = "client!gn", name = "t", descriptor = "[I")
	public int[] sounds;

	@OriginalMember(owner = "client!gn", name = "u", descriptor = "I")
	public int minZFine;

	@OriginalMember(owner = "client!gn", name = "x", descriptor = "I")
	public int sound;

	@OriginalMember(owner = "client!gn", name = "y", descriptor = "I")
	public int maxInterval;

	@OriginalMember(owner = "client!gn", name = "z", descriptor = "I")
	public int maxXFine;

	@OriginalMember(owner = "client!gn", name = "B", descriptor = "Lclient!pc;")
	public SoundPcmStream primaryStream;

	@OriginalMember(owner = "client!gn", name = "C", descriptor = "I")
	public int minInterval;

	@OriginalMember(owner = "client!gn", name = "G", descriptor = "Z")
	public boolean multiLocOrNpc;

	@OriginalMember(owner = "client!gn", name = "I", descriptor = "Lclient!p;")
	public Npc npc;

	@OriginalMember(owner = "client!gn", name = "J", descriptor = "I")
	public int radius;

	@OriginalMember(owner = "client!gn", name = "K", descriptor = "I")
	public int minXFine;

	@OriginalMember(owner = "client!gn", name = "L", descriptor = "Lclient!f;")
	public Player player;

	@OriginalMember(owner = "client!gn", name = "M", descriptor = "I")
	public int remainingLoops;

	@OriginalMember(owner = "client!gn", name = "N", descriptor = "Lclient!vh;")
	public LocType locType;

	@OriginalMember(owner = "client!gn", name = "O", descriptor = "I")
	public int level;

	@OriginalMember(owner = "client!gn", name = "P", descriptor = "I")
	public int volume;

	@OriginalMember(owner = "client!gn", name = "r", descriptor = "I")
	public int movementSpeed = 0;

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)V")
	public final void update() {
		@Pc(9) int prevSound = this.sound;
		if (this.locType != null) {
			@Pc(96) LocType locType = this.locType.getMultiLoc();
			if (locType == null) {
				this.minInterval = 0;
				this.radius = 0;
				this.sounds = null;
				this.volume = 0;
				this.sound = -1;
				this.maxInterval = 0;
			} else {
				this.sound = locType.sound;
				this.minInterval = locType.soundMinInterval;
				this.maxInterval = locType.soundMaxInterval;
				this.radius = locType.soundRadius * 128;
				this.volume = locType.soundVolume;
				this.sounds = locType.sounds;
			}
		} else if (this.npc != null) {
			@Pc(21) int sound = Npc.getSound(this.npc);
			if (prevSound != sound) {
				this.sound = sound;
				@Pc(36) NpcType npcType = this.npc.type;
				if (npcType.multiNpcs != null) {
					npcType = npcType.getMultiNpc();
				}
				if (npcType == null) {
					this.volume = this.radius = 0;
				} else {
					this.radius = npcType.soundRadius * 128;
					this.volume = npcType.soundVolume;
				}
			}
		} else if (this.player != null) {
			this.sound = Player.getSound(this.player);
			this.radius = this.player.soundRadius * 128;
			this.volume = this.player.soundVolume;
		}
		if (this.sound != prevSound && this.primaryStream != null) {
			client.soundStream.removeSubStream(this.primaryStream);
			this.primaryStream = null;
		}
	}
}
