import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("signlink!c")
public final class Class192 {

	@OriginalMember(owner = "signlink!c", name = "b", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "signlink!c", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "signlink!c", name = "<init>", descriptor = "()V")
	public Class192() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(15) GraphicsDevice[] local15 = local3.getScreenDevices();
			for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
				@Pc(27) GraphicsDevice local27 = local15[local17];
				if (local27 != null && local27.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local27;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "signlink!c", name = "a", descriptor = "(Z)V")
	public final void method4842() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method4845(null);
	}

	@OriginalMember(owner = "signlink!c", name = "a", descriptor = "(IIIBLjava/awt/Frame;I)V")
	public final void method4843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Frame arg3, @OriginalArg(5) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg3.setUndecorated(true);
		arg3.enableInputMethods(false);
		this.method4845(arg3);
		if (arg4 == 0) {
			@Pc(41) boolean local41 = false;
			@Pc(45) int local45 = this.aDisplayMode1.getRefreshRate();
			@Pc(49) DisplayMode[] local49 = this.aGraphicsDevice1.getDisplayModes();
			for (@Pc(51) int local51 = 0; local51 < local49.length; local51++) {
				if (arg1 == local49[local51].getWidth() && local49[local51].getHeight() == arg0 && arg2 == local49[local51].getBitDepth()) {
					@Pc(82) int local82 = local49[local51].getRefreshRate();
					if (!local41 || Math.abs(local82 - local45) < Math.abs(arg4 - local45)) {
						arg4 = local82;
						local41 = true;
					}
				}
			}
			if (!local41) {
				arg4 = local45;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg1, arg0, arg2, arg4));
	}

	@OriginalMember(owner = "signlink!c", name = "a", descriptor = "(I)[I")
	public final int[] method4844() {
		@Pc(3) DisplayMode[] local3 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(9) int[] local9 = new int[local3.length << 2];
		for (@Pc(17) int local17 = 0; local17 < local3.length; local17++) {
			local9[local17 << 2] = local3[local17].getWidth();
			local9[(local17 << 2) + 1] = local3[local17].getHeight();
			local9[(local17 << 2) + 2] = local3[local17].getBitDepth();
			local9[(local17 << 2) + 3] = local3[local17].getRefreshRate();
		}
		return local9;
	}

	@OriginalMember(owner = "signlink!c", name = "a", descriptor = "(Ljava/awt/Frame;B)V")
	private void method4845(@OriginalArg(0) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(24) boolean local24 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local24) {
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
				local1 = true;
			}
		} catch (@Pc(36) Throwable local36) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(65) Field local65 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local65.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(72) Throwable local72) {
				}
			}
		}
	}
}
