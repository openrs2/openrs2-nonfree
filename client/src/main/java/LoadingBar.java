import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class LoadingBar {
	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZLclient!gl;Z)V")
	public static void render(@OriginalArg(0) boolean renderBackground, @OriginalArg(1) Font font) {
		if (GlRenderer.enabled || renderBackground) {
			@Pc(10) int height = GameShell.canvasHeight;
			@Pc(16) int width = height * 956 / 503;
			TitleScreen.titleBg.renderResizedTransparent((GameShell.canvasWidth - width) / 2, 0, width, height);
			TitleScreen.logo.renderTransparent(GameShell.canvasWidth / 2 - TitleScreen.logo.width / 2, 18);
		}
		font.renderCenter(client.game == 1 ? LocalisedText.GAME1_LOADING : LocalisedText.GAME0_LOADING, GameShell.canvasWidth / 2, GameShell.canvasHeight / 2 - 26, 0xFFFFFF, -1);
		@Pc(70) int local70 = GameShell.canvasHeight / 2 - 18;
		if (GlRenderer.enabled) {
			GlRaster.drawRect(GameShell.canvasWidth / 2 - 152, local70, 304, 34, 0x8C1111);
			GlRaster.drawRect(GameShell.canvasWidth / 2 - 151, local70 + 1, 302, 32, 0);
			GlRaster.fillRect(GameShell.canvasWidth / 2 - 150, local70 + 2, client.mainLoadPercentage * 3, 30, 0x8C1111);
			GlRaster.fillRect(GameShell.canvasWidth / 2 + client.mainLoadPercentage * 3 - 150, local70 + 2, 300 - client.mainLoadPercentage * 3, 30, 0);
		} else {
			SoftwareRaster.drawRect(GameShell.canvasWidth / 2 - 152, local70, 304, 34, 0x8C1111);
			SoftwareRaster.drawRect(GameShell.canvasWidth / 2 - 151, local70 + 1, 302, 32, 0);
			SoftwareRaster.fillRect(GameShell.canvasWidth / 2 - 150, local70 + 2, client.mainLoadPercentage * 3, 30, 0x8C1111);
			SoftwareRaster.fillRect(client.mainLoadPercentage * 3 + GameShell.canvasWidth / 2 - 150, local70 + 2, 300 - client.mainLoadPercentage * 3, 30, 0);
		}
		font.renderCenter(client.mainLoadSecondaryText, GameShell.canvasWidth / 2, GameShell.canvasHeight / 2 + 4, 0xFFFFFF, -1);
	}
}
