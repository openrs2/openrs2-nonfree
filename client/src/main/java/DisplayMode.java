import java.awt.Frame;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class DisplayMode {

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "[I")
	public static final int[] CRC32_TABLE = new int[256];

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "[Lclient!ub;")
	private static DisplayMode[] modes;

	static {
		for (@Pc(6) int i = 0; i < 256; i++) {
			@Pc(11) int crc = i;
			for (@Pc(13) int j = 0; j < 8; j++) {
				if ((crc & 0x1) == 1) {
					crc = crc >>> 1 ^ 0xEDB88320;
				} else {
					crc >>>= 1;
				}
			}
			CRC32_TABLE[i] = crc;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILsignlink!pm;)[Lclient!ub;")
	private static DisplayMode[] getModesInternal(@OriginalArg(1) SignLink signLink) {
		if (!signLink.isFullScreenSupported()) {
			return new DisplayMode[0];
		}
		@Pc(17) PrivilegedRequest request = signLink.getDisplayModes();
		while (request.status == 0) {
			ThreadUtils.sleep(10L);
		}
		if (request.status == 2) {
			return new DisplayMode[0];
		}
		@Pc(39) int[] result = (int[]) request.result;
		@Pc(45) DisplayMode[] modes = new DisplayMode[result.length >> 2];
		for (@Pc(53) int i = 0; i < modes.length; i++) {
			@Pc(65) DisplayMode mode = new DisplayMode();
			modes[i] = mode;
			mode.width = result[i << 2];
			mode.height = result[(i << 2) + 1];
			mode.bitDepth = result[(i << 2) + 2];
			mode.refreshRate = result[(i << 2) + 3];
		}
		return modes;
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)[Lclient!ub;")
	public static DisplayMode[] getModes() {
		if (modes == null) {
			@Pc(9) DisplayMode[] modes = getModesInternal(GameShell.signLink);
			@Pc(13) DisplayMode[] validModes = new DisplayMode[modes.length];
			@Pc(15) int validModesSize = 0;
			mode:
			for (@Pc(17) int i = 0; i < modes.length; i++) {
				@Pc(25) DisplayMode mode = modes[i];
				if ((mode.bitDepth <= 0 || mode.bitDepth >= 24) && mode.width >= 800 && mode.height >= 600) {
					for (@Pc(46) int j = 0; j < validModesSize; j++) {
						@Pc(53) DisplayMode other = validModes[j];
						if (mode.width == other.width && other.height == mode.height) {
							if (mode.bitDepth > other.bitDepth) {
								validModes[j] = mode;
							}
							continue mode;
						}
					}
					validModes[validModesSize] = mode;
					validModesSize++;
				}
			}
			DisplayMode.modes = new DisplayMode[validModesSize];
			ArrayUtils.copy(validModes, 0, DisplayMode.modes, 0, validModesSize);
			@Pc(107) int[] resolutions = new int[DisplayMode.modes.length];
			for (@Pc(109) int i = 0; i < DisplayMode.modes.length; i++) {
				@Pc(117) DisplayMode mode = DisplayMode.modes[i];
				resolutions[i] = mode.height * mode.width;
			}
			ArrayUtils.sort(resolutions, DisplayMode.modes);
		}
		return modes;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIILsignlink!pm;I)Ljava/awt/Frame;")
	public static Frame enterFullScreen(@OriginalArg(4) SignLink signLink, @OriginalArg(1) int width, @OriginalArg(2) int height, @OriginalArg(0) int bitDepth) {
		if (!signLink.isFullScreenSupported()) {
			return null;
		}
		@Pc(26) DisplayMode[] modes = getModesInternal(signLink);
		if (modes == null) {
			return null;
		}
		@Pc(34) boolean valid = false;
		for (@Pc(36) int i = 0; i < modes.length; i++) {
			if (width == modes[i].width && height == modes[i].height && (!valid || bitDepth < modes[i].bitDepth)) {
				valid = true;
				bitDepth = modes[i].bitDepth;
			}
		}
		if (!valid) {
			return null;
		}
		@Pc(109) PrivilegedRequest request = signLink.enterFullScreen(width, height, bitDepth);
		while (request.status == 0) {
			ThreadUtils.sleep(10L);
		}
		@Pc(124) Frame frame = (Frame) request.result;
		if (frame == null) {
			return null;
		} else if (request.status == 2) {
			exitFullScreen(signLink, frame);
			return null;
		} else {
			return frame;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lsignlink!pm;Ljava/awt/Frame;Z)V")
	public static void exitFullScreen(@OriginalArg(0) SignLink signLink, @OriginalArg(1) Frame frame) {
		while (true) {
			@Pc(10) PrivilegedRequest request = signLink.exitFullScreen(frame);
			while (request.status == 0) {
				ThreadUtils.sleep(10L);
			}
			if (request.status == 1) {
				frame.setVisible(false);
				frame.dispose();
				return;
			}
			ThreadUtils.sleep(100L);
		}
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
	public int height;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
	public int width;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
	private int refreshRate;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
	private int bitDepth;

}
