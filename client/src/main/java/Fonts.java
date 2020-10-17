import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Fonts {
	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Lclient!gl;")
	public static Font p11Full;

	@OriginalMember(owner = "client!df", name = "d", descriptor = "Lclient!ke;")
	public static SoftwareFont p11FullSoftware;

	@OriginalMember(owner = "client!of", name = "Z", descriptor = "Lclient!gl;")
	public static Font p12Full;

	@OriginalMember(owner = "client!ph", name = "db", descriptor = "Lclient!gl;")
	public static Font b12Full;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!fh;Lclient!fh;I)I")
	public static int getReady(@OriginalArg(1) Js5 spritesArchive, @OriginalArg(0) Js5 fontMetricsArchive) {
		@Pc(1) int ready = 0;
		if (spritesArchive.isFileReady(Sprites.p11FullId)) {
			ready++;
		}
		if (spritesArchive.isFileReady(Sprites.p12FullId)) {
			ready++;
		}
		if (spritesArchive.isFileReady(Sprites.b12FullId)) {
			ready++;
		}
		if (fontMetricsArchive.isFileReady(Sprites.p11FullId)) {
			ready++;
		}
		if (fontMetricsArchive.isFileReady(Sprites.p12FullId)) {
			ready++;
		}
		if (fontMetricsArchive.isFileReady(Sprites.b12FullId)) {
			ready++;
		}
		return ready;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)I")
	public static int getTotal() {
		return 6;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!fh;Lclient!fh;B)V")
	public static void load(@OriginalArg(0) Js5 spritesArchive, @OriginalArg(1) Js5 fontMetricsArchive) {
		p11Full = SpriteLoader.loadFont(spritesArchive, fontMetricsArchive, Sprites.p11FullId);
		if (GlRenderer.enabled) {
			p11FullSoftware = SpriteLoader.loadSoftwareFont(spritesArchive, fontMetricsArchive, Sprites.p11FullId);
		} else {
			p11FullSoftware = (SoftwareFont) p11Full;
		}
		p12Full = SpriteLoader.loadFont(spritesArchive, fontMetricsArchive, Sprites.p12FullId);
		b12Full = SpriteLoader.loadFont(spritesArchive, fontMetricsArchive, Sprites.b12FullId);
	}
}
