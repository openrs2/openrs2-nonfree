import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class161 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!tb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static7.aClass161_1 != null) {
			Static6.anInt4595 = -1;
		}
	}

	@OriginalMember(owner = "client!tb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static7.aClass161_1 != null) {
			@Pc(9) char local9 = arg0.getKeyChar();
			if (local9 != '\u0000' && local9 != '\uffff' && Static30.method424(local9)) {
				@Pc(27) int local27 = Static6.anInt4861 + 1 & 0x7F;
				if (local27 != Static5.anInt4304) {
					Static2.anIntArray125[Static6.anInt4861] = -1;
					Static5.aCharArray2[Static6.anInt4861] = local9;
					Static6.anInt4861 = local27;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!tb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!tb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static7.aClass161_1 == null) {
			return;
		}
		Static5.anInt4279 = 0;
		@Pc(7) int local7 = arg0.getKeyCode();
		@Pc(19) int local19;
		if (local7 >= 0 && local7 < Static5.anIntArray445.length) {
			local19 = Static5.anIntArray445[local7];
			if ((local19 & 0x80) != 0) {
				local19 = -1;
			}
		} else {
			local19 = -1;
		}
		if (Static6.anInt4595 >= 0 && local19 >= 0) {
			Static7.anIntArray596[Static6.anInt4595] = local19;
			Static6.anInt4595 = Static6.anInt4595 + 1 & 0x7F;
			if (Static6.anInt4595 == Static4.anInt3314) {
				Static6.anInt4595 = -1;
			}
		}
		if (local19 >= 0) {
			@Pc(71) int local71 = Static6.anInt4861 + 1 & 0x7F;
			if (local71 != Static5.anInt4304) {
				Static2.anIntArray125[Static6.anInt4861] = local19;
				Static5.aCharArray2[Static6.anInt4861] = '\u0000';
				Static6.anInt4861 = local71;
			}
		}
		@Pc(87) int local87 = arg0.getModifiers();
		if ((local87 & 0xA) != 0 || local19 == 85 || local19 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!tb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static7.aClass161_1 != null) {
			Static5.anInt4279 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			@Pc(25) int local25;
			if (local10 >= 0 && local10 < Static5.anIntArray445.length) {
				local25 = Static5.anIntArray445[local10] & 0xFFFFFF7F;
			} else {
				local25 = -1;
			}
			if (Static6.anInt4595 >= 0 && local25 >= 0) {
				Static7.anIntArray596[Static6.anInt4595] = ~local25;
				Static6.anInt4595 = Static6.anInt4595 + 1 & 0x7F;
				if (Static4.anInt3314 == Static6.anInt4595) {
					Static6.anInt4595 = -1;
				}
			}
		}
		arg0.consume();
	}
}
