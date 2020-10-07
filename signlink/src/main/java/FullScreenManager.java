import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("signlink!c")
public final class FullScreenManager {

	@OriginalMember(owner = "signlink!c", name = "b", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode previousDisplayMode;

	@OriginalMember(owner = "signlink!c", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice device;

	@OriginalMember(owner = "signlink!c", name = "<init>", descriptor = "()V")
	public FullScreenManager() throws Exception {
		@Pc(3) GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.device = env.getDefaultScreenDevice();
		if (!this.device.isFullScreenSupported()) {
			@Pc(15) GraphicsDevice[] devices = env.getScreenDevices();
			for (@Pc(17) int i = 0; i < devices.length; i++) {
				@Pc(27) GraphicsDevice d = devices[i];
				if (d != null && d.isFullScreenSupported()) {
					this.device = d;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "signlink!c", name = "a", descriptor = "(Z)V")
	public final void exit() {
		if (this.previousDisplayMode != null) {
			this.device.setDisplayMode(this.previousDisplayMode);
			if (!this.device.getDisplayMode().equals(this.previousDisplayMode)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.previousDisplayMode = null;
		}
		this.setFullScreenWindow(null);
	}

	@OriginalMember(owner = "signlink!c", name = "a", descriptor = "(IIIBLjava/awt/Frame;I)V")
	public final void enter(@OriginalArg(4) Frame frame, @OriginalArg(1) int width, @OriginalArg(0) int height, @OriginalArg(2) int bitDepth, @OriginalArg(5) int refreshRate) {
		this.previousDisplayMode = this.device.getDisplayMode();
		if (this.previousDisplayMode == null) {
			throw new NullPointerException();
		}
		frame.setUndecorated(true);
		frame.enableInputMethods(false);
		this.setFullScreenWindow(frame);
		if (refreshRate == 0) {
			@Pc(41) boolean foundMode = false;
			@Pc(45) int previousRefreshRate = this.previousDisplayMode.getRefreshRate();
			@Pc(49) DisplayMode[] displayModes = this.device.getDisplayModes();
			for (@Pc(51) int i = 0; i < displayModes.length; i++) {
				if (displayModes[i].getWidth() == width && height == displayModes[i].getHeight() && displayModes[i].getBitDepth() == bitDepth) {
					@Pc(82) int r = displayModes[i].getRefreshRate();
					if (!foundMode || Math.abs(r - previousRefreshRate) < Math.abs(refreshRate - previousRefreshRate)) {
						refreshRate = r;
						foundMode = true;
					}
				}
			}
			if (!foundMode) {
				refreshRate = previousRefreshRate;
			}
		}
		this.device.setDisplayMode(new DisplayMode(width, height, bitDepth, refreshRate));
	}

	@OriginalMember(owner = "signlink!c", name = "a", descriptor = "(I)[I")
	public final int[] getDisplayModes() {
		@Pc(3) DisplayMode[] displayModes = this.device.getDisplayModes();
		@Pc(9) int[] result = new int[displayModes.length << 2];
		for (@Pc(17) int i = 0; i < displayModes.length; i++) {
			result[i << 2] = displayModes[i].getWidth();
			result[(i << 2) + 1] = displayModes[i].getHeight();
			result[(i << 2) + 2] = displayModes[i].getBitDepth();
			result[(i << 2) + 3] = displayModes[i].getRefreshRate();
		}
		return result;
	}

	@OriginalMember(owner = "signlink!c", name = "a", descriptor = "(Ljava/awt/Frame;B)V")
	private void setFullScreenWindow(@OriginalArg(0) Frame frame) {
		@Pc(1) boolean wasValid = false;
		try {
			@Pc(6) Field valid = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			valid.setAccessible(true);
			@Pc(24) boolean v = (Boolean) valid.get(this.device);
			if (v) {
				valid.set(this.device, Boolean.FALSE);
				wasValid = true;
			}
		} catch (@Pc(36) Throwable ex) {
		}
		try {
			this.device.setFullScreenWindow(frame);
		} finally {
			if (wasValid) {
				try {
					@Pc(65) Field valid = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					valid.set(this.device, Boolean.TRUE);
				} catch (@Pc(72) Throwable ex) {
				}
			}
		}
	}
}
