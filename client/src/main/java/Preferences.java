import java.io.IOException;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Preferences {
	@OriginalMember(owner = "client!al", name = "X", descriptor = "I")
	public static int brightness = 3;

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "Z")
	public static boolean allLevelsVisible = true;

	@OriginalMember(owner = "client!jo", name = "G", descriptor = "Z")
	public static boolean roofsVisible = true;

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "Z")
	public static boolean groundDecoration = true;

	@OriginalMember(owner = "client!r", name = "n", descriptor = "Z")
	public static boolean highDetailTextures = true;

	@OriginalMember(owner = "client!fl", name = "ab", descriptor = "Z")
	public static boolean manyIdleAnimations = true;

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "Z")
	public static boolean flickeringEffects = true;

	@OriginalMember(owner = "client!bn", name = "L", descriptor = "Z")
	public static boolean groundTextures = true;

	@OriginalMember(owner = "client!ej", name = "v", descriptor = "Z")
	public static boolean characterShadows = true;

	@OriginalMember(owner = "client!i", name = "c", descriptor = "I")
	public static int sceneryShadows = 2;

	@OriginalMember(owner = "client!dn", name = "U", descriptor = "Z")
	public static boolean highDetailLighting = true;

	@OriginalMember(owner = "client!wa", name = "cc", descriptor = "Z")
	public static boolean highDetailWater = true;

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "Z")
	public static boolean fog = true;

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
	public static int antiAliasingMode = 0;

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "Z")
	public static boolean stereo = true;

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
	public static int soundEffectsVolume = 127;

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
	public static int musicVolume = 255;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
	public static int areaSoundsVolume = 127;

	@OriginalMember(owner = "client!mo", name = "gb", descriptor = "I")
	public static int fullScreenWidth = 0;

	@OriginalMember(owner = "client!jj", name = "jb", descriptor = "I")
	public static int fullScreenHeight = 0;

	@OriginalMember(owner = "client!ne", name = "ab", descriptor = "I")
	public static int particles = 2;

	@OriginalMember(owner = "client!ol", name = "t", descriptor = "I")
	public static int favouriteWorlds = 0;

	@OriginalMember(owner = "client!no", name = "ab", descriptor = "I")
	public static int windowMode = 0;

	@OriginalMember(owner = "client!on", name = "q", descriptor = "Z")
	public static boolean safeMode = false;

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "Z")
	public static boolean aBoolean293;

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
	public static int buildArea = 0;

	@OriginalMember(owner = "client!vl", name = "q", descriptor = "Z")
	public static boolean hdr = false;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "Z")
	public static boolean customCursors = true;

	@OriginalMember(owner = "client!fg", name = "z", descriptor = "Z")
	public static boolean sentToServer = true;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lsignlink!pm;I)V")
	public static void read(@OriginalArg(0) SignLink signLink) {
		@Pc(3) FileOnDisk file = null;
		brightness = 3;
		setAllLevelsVisible(true);
		characterShadows = true;
		highDetailTextures = true;
		roofsVisible = true;
		areaSoundsVolume = 127;
		groundTextures = true;
		groundDecoration = true;
		highDetailLighting = true;
		flickeringEffects = true;
		highDetailWater = true;
		stereo = true;
		fullScreenWidth = 0;
		fog = true;
		sceneryShadows = 2;
		soundEffectsVolume = 127;
		fullScreenHeight = 0;
		Static2.anInt1125 = 0;
		manyIdleAnimations = true;
		antiAliasingMode = 0;
		musicVolume = 255;
		if (GameShell.maxMemory < 96) {
			setParticles(0);
		} else {
			setParticles(2);
		}
		safeMode = false;
		windowMode = 0;
		hdr = false;
		buildArea = 0;
		customCursors = true;
		favouriteWorlds = 0;
		aBoolean293 = false;
		try {
			@Pc(84) PrivilegedRequest request = signLink.openPreferences("openrs2");
			while (request.status == 0) {
				ThreadUtils.sleep(1L);
			}
			if (request.status == 1) {
				file = (FileOnDisk) request.result;
				@Pc(102) int off = 0;
				@Pc(108) byte[] bytes = new byte[(int) file.length()];
				while (off < bytes.length) {
					@Pc(126) int n = file.read(bytes, off, bytes.length - off);
					if (n == -1) {
						throw new IOException("EOF");
					}
					off += n;
				}
				decode(new Buffer(bytes));
			}
		} catch (@Pc(153) Exception ex) {
		}
		try {
			if (file != null) {
				file.close();
			}
		} catch (@Pc(160) Exception ex) {
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!fd;I)V")
	public static void decode(@OriginalArg(0) Buffer buffer) {
		if (buffer.bytes.length - buffer.position < 1) {
			return;
		}
		@Pc(20) int version = buffer.readUnsignedByte();
		if (version < 0 || version > 11) {
			return;
		}
		@Pc(39) byte len;
		if (version == 11) {
			len = 33;
		} else if (version == 10) {
			len = 32;
		} else if (version == 9) {
			len = 31;
		} else if (version == 8) {
			len = 30;
		} else if (version == 7) {
			len = 29;
		} else if (version == 6) {
			len = 28;
		} else if (version == 5) {
			len = 28;
		} else if (version == 4) {
			len = 24;
		} else if (version == 3) {
			len = 23;
		} else if (version == 2) {
			len = 22;
		} else if (version == 1) {
			len = 23;
		} else {
			len = 19;
		}
		if (len > buffer.bytes.length - buffer.position) {
			return;
		}
		brightness = buffer.readUnsignedByte();
		if (brightness < 1) {
			brightness = 1;
		} else if (brightness > 4) {
			brightness = 4;
		}
		setAllLevelsVisible(buffer.readUnsignedByte() == 1);
		roofsVisible = buffer.readUnsignedByte() == 1;
		groundDecoration = buffer.readUnsignedByte() == 1;
		highDetailTextures = buffer.readUnsignedByte() == 1;
		manyIdleAnimations = buffer.readUnsignedByte() == 1;
		flickeringEffects = buffer.readUnsignedByte() == 1;
		groundTextures = buffer.readUnsignedByte() == 1;
		characterShadows = buffer.readUnsignedByte() == 1;
		sceneryShadows = buffer.readUnsignedByte();
		if (sceneryShadows > 2) {
			sceneryShadows = 2;
		}
		if (version < 2) {
			highDetailLighting = buffer.readUnsignedByte() == 1;
			buffer.readUnsignedByte();
		} else {
			highDetailLighting = buffer.readUnsignedByte() == 1;
		}
		highDetailWater = buffer.readUnsignedByte() == 1;
		fog = buffer.readUnsignedByte() == 1;
		antiAliasingMode = buffer.readUnsignedByte();
		if (antiAliasingMode > 2) {
			antiAliasingMode = 2;
		}
		Static2.anInt1125 = antiAliasingMode;
		stereo = buffer.readUnsignedByte() == 1;
		soundEffectsVolume = buffer.readUnsignedByte();
		if (soundEffectsVolume > 127) {
			soundEffectsVolume = 127;
		}
		musicVolume = buffer.readUnsignedByte();
		areaSoundsVolume = buffer.readUnsignedByte();
		if (areaSoundsVolume > 127) {
			areaSoundsVolume = 127;
		}
		if (version >= 1) {
			fullScreenWidth = buffer.readUnsignedShort();
			fullScreenHeight = buffer.readUnsignedShort();
		}
		if (version >= 3 && version < 6) {
			buffer.readUnsignedByte();
		}
		if (version >= 4) {
			@Pc(369) int particles = buffer.readUnsignedByte();
			if (GameShell.maxMemory < 96) {
				particles = 0;
			}
			setParticles(particles);
		}
		if (version >= 5) {
			favouriteWorlds = buffer.readInt();
		}
		if (version >= 6) {
			windowMode = buffer.readUnsignedByte();
		}
		if (version >= 7) {
			safeMode = buffer.readUnsignedByte() == 1;
		}
		if (version >= 8) {
			aBoolean293 = buffer.readUnsignedByte() == 1;
		}
		if (version >= 9) {
			buildArea = buffer.readUnsignedByte();
		}
		if (version >= 10) {
			hdr = buffer.readUnsignedByte() != 0;
		}
		if (version >= 11) {
			customCursors = buffer.readUnsignedByte() != 0;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILsignlink!pm;)V")
	public static void write(@OriginalArg(1) SignLink signLink) {
		@Pc(3) FileOnDisk file = null;
		try {
			@Pc(12) PrivilegedRequest request = signLink.openPreferences("openrs2");
			while (request.status == 0) {
				ThreadUtils.sleep(1L);
			}
			if (request.status == 1) {
				file = (FileOnDisk) request.result;
				@Pc(36) Buffer buffer = encode();
				file.write(buffer.bytes, 0, buffer.position);
			}
		} catch (@Pc(46) Exception ex) {
		}
		try {
			if (file != null) {
				file.close();
			}
		} catch (@Pc(57) Exception ex) {
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)Lclient!fd;")
	public static Buffer encode() {
		@Pc(13) Buffer buffer = new Buffer(34);
		buffer.writeByte(11);
		buffer.writeByte(brightness);
		buffer.writeByte(allLevelsVisible ? 1 : 0);
		buffer.writeByte(roofsVisible ? 1 : 0);
		buffer.writeByte(groundDecoration ? 1 : 0);
		buffer.writeByte(highDetailTextures ? 1 : 0);
		buffer.writeByte(manyIdleAnimations ? 1 : 0);
		buffer.writeByte(flickeringEffects ? 1 : 0);
		buffer.writeByte(groundTextures ? 1 : 0);
		buffer.writeByte(characterShadows ? 1 : 0);
		buffer.writeByte(sceneryShadows);
		buffer.writeByte(highDetailLighting ? 1 : 0);
		buffer.writeByte(highDetailWater ? 1 : 0);
		buffer.writeByte(fog ? 1 : 0);
		buffer.writeByte(antiAliasingMode);
		buffer.writeByte(stereo ? 1 : 0);
		buffer.writeByte(soundEffectsVolume);
		buffer.writeByte(musicVolume);
		buffer.writeByte(areaSoundsVolume);
		buffer.writeShort(fullScreenWidth);
		buffer.writeShort(fullScreenHeight);
		buffer.writeByte(getParticles());
		buffer.writeInt(favouriteWorlds);
		buffer.writeByte(windowMode);
		buffer.writeByte(safeMode ? 1 : 0);
		buffer.writeByte(aBoolean293 ? 1 : 0);
		buffer.writeByte(buildArea);
		buffer.writeByte(hdr ? 1 : 0);
		buffer.writeByte(customCursors ? 1 : 0);
		return buffer;
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "()I")
	public static int getParticles() {
		return particles;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
	public static void setParticles(@OriginalArg(0) int p) {
		particles = p;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BZ)V")
	public static void setAllLevelsVisible(@OriginalArg(1) boolean visible) {
		allLevelsVisible = visible;
		LocType.singleLevelVisible = !SceneGraph.isAllLevelsVisible();
	}

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "(B)I")
	public static int toInt() {
		return ((areaSoundsVolume == 0 ? 0 : 1) << 22) + ((musicVolume == 0 ? 0 : 1) << 21) + ((soundEffectsVolume == 0 ? 0 : 1) << 20) + ((fog ? 1 : 0) << 16) + ((highDetailLighting ? 1 : 0) << 13) + ((sceneryShadows & 0x3) << 11) + ((groundTextures ? 1 : 0) << 9) + ((flickeringEffects ? 1 : 0) << 8) + ((manyIdleAnimations ? 1 : 0) << 7) + ((roofsVisible ? 1 : 0) << 4) + ((allLevelsVisible ? 1 : 0) << 3) + (brightness & 0x7) + ((groundDecoration ? 1 : 0) << 5) + ((highDetailTextures ? 1 : 0) << 6) + ((characterShadows ? 1 : 0) << 10) + ((highDetailWater ? 1 : 0) << 15) + (buildArea << 17) + ((stereo ? 1 : 0) << 19) + (getParticles() << 23);
	}
}
