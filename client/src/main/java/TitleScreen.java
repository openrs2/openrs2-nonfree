import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class TitleScreen {
	@OriginalMember(owner = "client!gg", name = "v", descriptor = "Z")
	private static boolean loaded;

	@OriginalMember(owner = "client!ro", name = "I", descriptor = "I")
	private static int titleBgId = -1;

	@OriginalMember(owner = "client!bi", name = "B", descriptor = "I")
	private static int logoId = -1;

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "Lclient!uj;")
	public static Sprite titleBg;

	@OriginalMember(owner = "client!rh", name = "ob", descriptor = "Lclient!ma;")
	public static IndexedSprite logo;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!fh;I)I")
	public static int getReady(@OriginalArg(0) Js5 archive) {
		@Pc(5) int ready = 0;
		if (archive.isFileReady(titleBgId)) {
			ready++;
		}
		if (archive.isFileReady(logoId)) {
			ready++;
		}
		return ready;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)I")
	public static int getTotal() {
		return 2;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILclient!fh;)V")
	public static void init(@OriginalArg(1) Js5 archive) {
		titleBgId = archive.getGroupId("titlebg");
		logoId = archive.getGroupId("logo");
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!fh;)V")
	public static void load(@OriginalArg(1) Js5 archive) {
		if (loaded) {
			return;
		}
		if (GlRenderer.enabled) {
			GlRaster.clear();
		} else {
			SoftwareRaster.clear();
		}
		titleBg = SpriteLoader.loadSpriteAutoDetect(archive, titleBgId);
		@Pc(24) int height = GameShell.canvasHeight;
		@Pc(30) int width = height * 956 / 503;
		titleBg.renderResizedTransparent((GameShell.canvasWidth - width) / 2, 0, width, height);
		logo = SpriteLoader.loadIndexedSpriteAutoDetect(archive, logoId);
		logo.renderTransparent(GameShell.canvasWidth / 2 - logo.width / 2, 18);
		loaded = true;
	}

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)V")
	public static void clear() {
		if (loaded) {
			loaded = false;
			titleBg = null;
			logo = null;
		}
	}
}
