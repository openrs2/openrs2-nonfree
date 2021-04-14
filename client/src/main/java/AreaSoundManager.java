import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class AreaSoundManager {
	@OriginalMember(owner = "client!am", name = "o", descriptor = "Lclient!ll;")
	private static final LinkedList locSounds = new LinkedList();

	@OriginalMember(owner = "client!fl", name = "W", descriptor = "Lclient!ll;")
	private static final LinkedList npcSounds = new LinkedList();

	@OriginalMember(owner = "client!p", name = "nc", descriptor = "Lclient!ic;")
	private static final HashTable playerSounds = new HashTable(16);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V")
	public static void redraw(@OriginalArg(0) int level, @OriginalArg(3) int x, @OriginalArg(2) int z, @OriginalArg(4) int loops) {
		for (@Pc(10) AreaSound areaSound = (AreaSound) locSounds.head(); areaSound != null; areaSound = (AreaSound) locSounds.next()) {
			redraw(level, x, z, loops, areaSound);
		}
		for (@Pc(31) AreaSound areaSound = (AreaSound) npcSounds.head(); areaSound != null; areaSound = (AreaSound) npcSounds.next()) {
			@Pc(40) byte movementSpeed = 1;
			@Pc(45) BasType basType = areaSound.npc.getBasType();
			if (areaSound.npc.movementSeqId == basType.readySeqId) {
				movementSpeed = 0;
			} else if (areaSound.npc.movementSeqId == basType.anInt831 || areaSound.npc.movementSeqId == basType.anInt829 || areaSound.npc.movementSeqId == basType.anInt857 || areaSound.npc.movementSeqId == basType.anInt867) {
				movementSpeed = 2;
			} else if (areaSound.npc.movementSeqId == basType.anInt854 || areaSound.npc.movementSeqId == basType.anInt833 || areaSound.npc.movementSeqId == basType.anInt861 || basType.anInt852 == areaSound.npc.movementSeqId) {
				movementSpeed = 3;
			}
			if (movementSpeed != areaSound.movementSpeed) {
				@Pc(135) int sound = Npc.getSound(areaSound.npc);
				if (areaSound.sound != sound) {
					if (areaSound.primaryStream != null) {
						client.soundStream.removeSubStream(areaSound.primaryStream);
						areaSound.primaryStream = null;
					}
					areaSound.sound = sound;
				}
				areaSound.movementSpeed = movementSpeed;
			}
			areaSound.minXFine = areaSound.npc.xFine;
			areaSound.maxXFine = areaSound.npc.xFine + areaSound.npc.getSize() * 64;
			areaSound.minZFine = areaSound.npc.zFine;
			areaSound.maxZFine = areaSound.npc.zFine + areaSound.npc.getSize() * 64;
			redraw(level, x, z, loops, areaSound);
		}
		for (@Pc(217) AreaSound areaSound = (AreaSound) playerSounds.head(); areaSound != null; areaSound = (AreaSound) playerSounds.next()) {
			@Pc(222) byte movementSpeed = 1;
			@Pc(227) BasType basType = areaSound.player.getBasType();
			if (basType.readySeqId == areaSound.player.movementSeqId) {
				movementSpeed = 0;
			} else if (basType.anInt831 == areaSound.player.movementSeqId || basType.anInt829 == areaSound.player.movementSeqId || areaSound.player.movementSeqId == basType.anInt857 || areaSound.player.movementSeqId == basType.anInt867) {
				movementSpeed = 2;
			} else if (areaSound.player.movementSeqId == basType.anInt854 || areaSound.player.movementSeqId == basType.anInt833 || areaSound.player.movementSeqId == basType.anInt861 || areaSound.player.movementSeqId == basType.anInt852) {
				movementSpeed = 3;
			}
			if (areaSound.movementSpeed != movementSpeed) {
				@Pc(318) int sound = Player.getSound(areaSound.player);
				if (areaSound.sound != sound) {
					if (areaSound.primaryStream != null) {
						client.soundStream.removeSubStream(areaSound.primaryStream);
						areaSound.primaryStream = null;
					}
					areaSound.sound = sound;
				}
				areaSound.movementSpeed = movementSpeed;
			}
			areaSound.minXFine = areaSound.player.xFine;
			areaSound.maxXFine = areaSound.player.xFine + areaSound.player.getSize() * 64;
			areaSound.minZFine = areaSound.player.zFine;
			areaSound.maxZFine = areaSound.player.zFine + areaSound.player.getSize() * 64;
			redraw(level, x, z, loops, areaSound);
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILclient!f;)V")
	public static void update(@OriginalArg(1) Player player) {
		@Pc(20) AreaSound areaSound = (AreaSound) playerSounds.get(Base37.encode(player.username));
		if (areaSound == null) {
			add(Player.level, player.movementQueueX[0], player.movementQueueZ[0], null, 0, null, player);
		} else {
			areaSound.update();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!f;)V")
	public static void remove(@OriginalArg(1) Player player) {
		@Pc(19) AreaSound areaSound = (AreaSound) playerSounds.get(Base37.encode(player.username));
		if (areaSound == null) {
			return;
		}
		if (areaSound.primaryStream != null) {
			client.soundStream.removeSubStream(areaSound.primaryStream);
			areaSound.primaryStream = null;
		}
		areaSound.unlink();
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(ZI)V")
	public static void clear(@OriginalArg(0) boolean pathingEntities) {
		for (@Pc(8) AreaSound areaSound = (AreaSound) locSounds.head(); areaSound != null; areaSound = (AreaSound) locSounds.next()) {
			if (areaSound.primaryStream != null) {
				client.soundStream.removeSubStream(areaSound.primaryStream);
				areaSound.primaryStream = null;
			}
			if (areaSound.secondaryStream != null) {
				client.soundStream.removeSubStream(areaSound.secondaryStream);
				areaSound.secondaryStream = null;
			}
			areaSound.unlink();
		}
		if (!pathingEntities) {
			return;
		}
		for (@Pc(54) AreaSound areaSound = (AreaSound) npcSounds.head(); areaSound != null; areaSound = (AreaSound) npcSounds.next()) {
			if (areaSound.primaryStream != null) {
				client.soundStream.removeSubStream(areaSound.primaryStream);
				areaSound.primaryStream = null;
			}
			areaSound.unlink();
		}
		for (@Pc(83) AreaSound areaSound = (AreaSound) playerSounds.head(); areaSound != null; areaSound = (AreaSound) playerSounds.next()) {
			if (areaSound.primaryStream != null) {
				client.soundStream.removeSubStream(areaSound.primaryStream);
				areaSound.primaryStream = null;
			}
			areaSound.unlink();
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILclient!vh;ILclient!p;ILclient!f;II)V")
	public static void add(@OriginalArg(7) int level, @OriginalArg(2) int x, @OriginalArg(4) int z, @OriginalArg(1) LocType locType, @OriginalArg(6) int angle, @OriginalArg(3) Npc npc, @OriginalArg(5) Player player) {
		@Pc(9) AreaSound sound = new AreaSound();
		sound.level = level;
		sound.minZFine = z * 128;
		sound.minXFine = x * 128;
		if (locType != null) {
			sound.maxInterval = locType.anInt5530;
			sound.minInterval = locType.anInt5555;
			sound.sounds = locType.anIntArray632;
			sound.volume = locType.soundVolume;
			@Pc(156) int width = locType.width;
			sound.radius = locType.soundRadius * 128;
			sound.locType = locType;
			@Pc(168) int length = locType.length;
			if (angle == 1 || angle == 3) {
				width = locType.length;
				length = locType.width;
			}
			sound.maxXFine = (width + x) * 128;
			sound.sound = locType.sound;
			sound.maxZFine = (length + z) * 128;
			if (locType.multiLocs != null) {
				sound.multiLocOrNpc = true;
				sound.update();
			}
			if (sound.sounds != null) {
				sound.remainingLoops = (int) ((double) (sound.maxInterval - sound.minInterval) * Math.random()) + sound.minInterval;
			}
			locSounds.addTail(sound);
		} else if (npc != null) {
			sound.npc = npc;
			@Pc(86) NpcType npcType = npc.type;
			if (npcType.multiNpcs != null) {
				sound.multiLocOrNpc = true;
				npcType = npcType.getMultiNpc();
			}
			if (npcType != null) {
				sound.maxXFine = (npcType.size + x) * 128;
				sound.maxZFine = (npcType.size + z) * 128;
				sound.sound = Npc.getSound(npc);
				sound.volume = npcType.soundVolume;
				sound.radius = npcType.soundRadius * 128;
			}
			npcSounds.addTail(sound);
		} else if (player != null) {
			sound.player = player;
			sound.maxXFine = (x + player.getSize()) * 128;
			sound.maxZFine = (player.getSize() + z) * 128;
			sound.sound = Player.getSound(player);
			sound.volume = player.soundVolume;
			sound.radius = player.soundRadius * 128;
			playerSounds.put(Base37.encode(player.username), sound);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLclient!p;)V")
	public static void remove(@OriginalArg(1) Npc npc) {
		for (@Pc(14) AreaSound areaSound = (AreaSound) npcSounds.head(); areaSound != null; areaSound = (AreaSound) npcSounds.next()) {
			if (npc == areaSound.npc) {
				if (areaSound.primaryStream != null) {
					client.soundStream.removeSubStream(areaSound.primaryStream);
					areaSound.primaryStream = null;
				}
				areaSound.unlink();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V")
	public static void updateMulti() {
		for (@Pc(6) AreaSound areaSound = (AreaSound) locSounds.head(); areaSound != null; areaSound = (AreaSound) locSounds.next()) {
			if (areaSound.multiLocOrNpc) {
				areaSound.update();
			}
		}
		for (@Pc(36) AreaSound areaSound = (AreaSound) npcSounds.head(); areaSound != null; areaSound = (AreaSound) npcSounds.next()) {
			if (areaSound.multiLocOrNpc) {
				areaSound.update();
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILclient!vh;III)V")
	public static void remove(@OriginalArg(2) int level, @OriginalArg(4) int x, @OriginalArg(0) int z, @OriginalArg(1) LocType locType) {
		for (@Pc(15) AreaSound areaSound = (AreaSound) locSounds.head(); areaSound != null; areaSound = (AreaSound) locSounds.next()) {
			if (areaSound.level == level && areaSound.minXFine == x * 128 && areaSound.minZFine == z * 128 && locType.id == areaSound.locType.id) {
				if (areaSound.primaryStream != null) {
					client.soundStream.removeSubStream(areaSound.primaryStream);
					areaSound.primaryStream = null;
				}
				if (areaSound.secondaryStream != null) {
					client.soundStream.removeSubStream(areaSound.secondaryStream);
					areaSound.secondaryStream = null;
				}
				areaSound.unlink();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZIIILclient!gn;I)V")
	private static void redraw(@OriginalArg(1) int level, @OriginalArg(2) int x, @OriginalArg(5) int z, @OriginalArg(3) int loops, @OriginalArg(4) AreaSound areaSound) {
		if (areaSound.sound == -1 && areaSound.sounds == null) {
			return;
		}
		@Pc(16) int distance = 0;
		@Pc(23) int volume = areaSound.volume * Preferences.areaSoundsVolume >> 8;
		if (x > areaSound.maxXFine) {
			distance = x - areaSound.maxXFine;
		} else if (areaSound.minXFine > x) {
			distance = areaSound.minXFine - x;
		}
		if (z > areaSound.maxZFine) {
			distance += z - areaSound.maxZFine;
		} else if (areaSound.minZFine > z) {
			distance += areaSound.minZFine - z;
		}
		if (areaSound.radius == 0 || areaSound.radius < distance - 64 || Preferences.areaSoundsVolume == 0 || areaSound.level != level) {
			if (areaSound.primaryStream != null) {
				client.soundStream.removeSubStream(areaSound.primaryStream);
				areaSound.primaryStream = null;
			}
			if (areaSound.secondaryStream != null) {
				client.soundStream.removeSubStream(areaSound.secondaryStream);
				areaSound.secondaryStream = null;
			}
			return;
		}
		@Pc(145) int distance2 = distance - 64;
		if (distance2 < 0) {
			distance2 = 0;
		}
		@Pc(164) int volume2 = (areaSound.radius - distance2) * volume / areaSound.radius;
		if (areaSound.primaryStream != null) {
			areaSound.primaryStream.setVolume(volume2);
		} else if (areaSound.sound >= 0) {
			@Pc(186) SynthSound synthSound = SynthSound.create(client.js5Archive4, areaSound.sound, 0);
			if (synthSound != null) {
				@Pc(195) PcmSound pcmSound = synthSound.toPcmSound().resample(client.resampler);
				@Pc(200) SoundPcmStream stream = SoundPcmStream.create(pcmSound, volume2);
				stream.method3359(-1);
				client.soundStream.addSubStream(stream);
				areaSound.primaryStream = stream;
			}
		}
		if (areaSound.secondaryStream != null) {
			areaSound.secondaryStream.setVolume(volume2);
			if (!areaSound.secondaryStream.isLinked()) {
				areaSound.secondaryStream = null;
			}
		} else if (areaSound.sounds != null && (areaSound.remainingLoops -= loops) <= 0) {
			@Pc(234) int index = (int) ((double) areaSound.sounds.length * Math.random());
			@Pc(242) SynthSound synthSound = SynthSound.create(client.js5Archive4, areaSound.sounds[index], 0);
			if (synthSound != null) {
				@Pc(249) PcmSound pcmSound = synthSound.toPcmSound().resample(client.resampler);
				@Pc(254) SoundPcmStream stream = SoundPcmStream.create(pcmSound, volume2);
				stream.method3359(0);
				client.soundStream.addSubStream(stream);
				areaSound.remainingLoops = (int) (Math.random() * (double) (areaSound.maxInterval - areaSound.minInterval)) + areaSound.minInterval;
				areaSound.secondaryStream = stream;
			}
		}
	}
}
