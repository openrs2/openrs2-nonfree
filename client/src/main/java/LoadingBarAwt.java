import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class LoadingBarAwt {
	@OriginalMember(owner = "client!ce", name = "b", descriptor = "Ljava/awt/Font;")
	public static Font font;

	@OriginalMember(owner = "client!bo", name = "o", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics fontMetrics;

	@OriginalMember(owner = "client!ea", name = "E", descriptor = "Ljava/awt/Image;")
	public static Image loadingBar;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ljava/awt/Color;ZZILjava/lang/String;)V")
	public static void render(@OriginalArg(0) Color color, @OriginalArg(1) boolean redraw, @OriginalArg(3) int percentage, @OriginalArg(4) String text) {
		try {
			@Pc(2) Graphics graphics = GameShell.canvas.getGraphics();
			if (font == null) {
				font = new java.awt.Font("Helvetica", Font.BOLD, 13);
				fontMetrics = GameShell.canvas.getFontMetrics(font);
			}
			if (redraw) {
				graphics.setColor(Color.black);
				graphics.fillRect(0, 0, GameShell.canvasWidth, GameShell.canvasHeight);
			}
			if (color == null) {
				color = new Color(140, 17, 17);
			}
			try {
				if (loadingBar == null) {
					loadingBar = GameShell.canvas.createImage(304, 34);
				}
				@Pc(48) Graphics loadingBarGraphics = loadingBar.getGraphics();
				loadingBarGraphics.setColor(color);
				loadingBarGraphics.drawRect(0, 0, 303, 33);
				loadingBarGraphics.fillRect(2, 2, percentage * 3, 30);
				loadingBarGraphics.setColor(Color.black);
				loadingBarGraphics.drawRect(1, 1, 301, 31);
				loadingBarGraphics.fillRect(percentage * 3 + 2, 2, 300 - percentage * 3, 30);
				loadingBarGraphics.setFont(font);
				loadingBarGraphics.setColor(Color.white);
				loadingBarGraphics.drawString(text, (304 - fontMetrics.stringWidth(text)) / 2, 22);
				graphics.drawImage(loadingBar, GameShell.canvasWidth / 2 - 152, GameShell.canvasHeight / 2 - 18, null);
			} catch (@Pc(128) Exception ex) {
				@Pc(134) int x = GameShell.canvasWidth / 2 - 152;
				@Pc(140) int y = GameShell.canvasHeight / 2 - 18;
				graphics.setColor(color);
				graphics.drawRect(x, y, 303, 33);
				graphics.fillRect(x + 2, y + 2, percentage * 3, 30);
				graphics.setColor(Color.black);
				graphics.drawRect(x + 1, y + 1, 301, 31);
				graphics.fillRect(percentage * 3 + x + 2, y + 2, 300 - percentage * 3, 30);
				graphics.setFont(font);
				graphics.setColor(Color.white);
				graphics.drawString(text, x + (304 - fontMetrics.stringWidth(text)) / 2, y + 22);
			}
			if (client.mainLoadPrimaryText != null) {
				graphics.setFont(font);
				graphics.setColor(Color.white);
				graphics.drawString(client.mainLoadPrimaryText, GameShell.canvasWidth / 2 - fontMetrics.stringWidth(client.mainLoadPrimaryText) / 2, GameShell.canvasHeight / 2 - 26);
			}
		} catch (@Pc(243) Exception ex) {
			GameShell.canvas.repaint();
		}
	}

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "(B)V")
	public static void clear() {
		loadingBar = null;
		font = null;
		fontMetrics = null;
	}
}
