import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Sprites {
	@OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
	public static int p11FullId;

	@OriginalMember(owner = "client!wj", name = "p", descriptor = "I")
	public static int p12FullId;

	@OriginalMember(owner = "client!me", name = "c", descriptor = "I")
	public static int b12FullId;

	@OriginalMember(owner = "client!gn", name = "D", descriptor = "I")
	private static int hitMarksId;

	@OriginalMember(owner = "client!qj", name = "Y", descriptor = "I")
	private static int hitBarDefaultId;

	@OriginalMember(owner = "client!qd", name = "I", descriptor = "I")
	private static int headIconsPkId;

	@OriginalMember(owner = "client!fo", name = "o", descriptor = "I")
	private static int headIconsPrayerId;

	@OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
	private static int hintHeadIconsId;

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
	private static int hintMapMarkersId;

	@OriginalMember(owner = "client!u", name = "c", descriptor = "I")
	private static int mapFlagId;

	@OriginalMember(owner = "client!rn", name = "F", descriptor = "I")
	private static int crossId;

	@OriginalMember(owner = "client!ho", name = "U", descriptor = "I")
	private static int mapDotsId;

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
	private static int scrollbarId;

	@OriginalMember(owner = "client!il", name = "e", descriptor = "I")
	private static int nameIconsId;

	@OriginalMember(owner = "client!fa", name = "ab", descriptor = "I")
	private static int floorShadowsId;

	@OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
	private static int compassId;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
	private static int hintMapEdgeId;

	@OriginalMember(owner = "client!dg", name = "q", descriptor = "[Lclient!uj;")
	public static Sprite[] hitMarks;

	@OriginalMember(owner = "client!eg", name = "s", descriptor = "[Lclient!uj;")
	public static Sprite[] hitBarDefault;

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "[Lclient!uj;")
	public static Sprite[] headIconsPk;

	@OriginalMember(owner = "client!al", name = "S", descriptor = "[Lclient!uj;")
	public static Sprite[] headIconsPrayer;

	@OriginalMember(owner = "client!ri", name = "X", descriptor = "[Lclient!uj;")
	public static Sprite[] hintHeadIcons;

	@OriginalMember(owner = "client!ck", name = "fb", descriptor = "[Lclient!uj;")
	public static Sprite[] hintMapMarkers;

	@OriginalMember(owner = "client!am", name = "z", descriptor = "[Lclient!uj;")
	public static Sprite[] mapFlag;

	@OriginalMember(owner = "client!se", name = "W", descriptor = "[Lclient!uj;")
	public static Sprite[] cross;

	@OriginalMember(owner = "client!dn", name = "T", descriptor = "[Lclient!uj;")
	public static Sprite[] mapDots;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "[Lclient!ma;")
	public static IndexedSprite[] scrollbar;

	@OriginalMember(owner = "client!im", name = "k", descriptor = "[Lclient!ma;")
	public static IndexedSprite[] nameIcons;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "[Lclient!fe;")
	public static SoftwareIndexedSprite[] floorShadows;

	@OriginalMember(owner = "client!si", name = "q", descriptor = "Lclient!uj;")
	public static Sprite compass;

	@OriginalMember(owner = "client!dg", name = "p", descriptor = "[Lclient!uj;")
	public static Sprite[] hintMapEdge;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!fh;I)I")
	public static int getReady(@OriginalArg(0) Js5 archive) {
		@Pc(5) int ready = 0;
		if (archive.isFileReady(hitMarksId)) {
			ready++;
		}
		if (archive.isFileReady(hitBarDefaultId)) {
			ready++;
		}
		if (archive.isFileReady(headIconsPkId)) {
			ready++;
		}
		if (archive.isFileReady(headIconsPrayerId)) {
			ready++;
		}
		if (archive.isFileReady(hintHeadIconsId)) {
			ready++;
		}
		if (archive.isFileReady(hintMapMarkersId)) {
			ready++;
		}
		if (archive.isFileReady(mapFlagId)) {
			ready++;
		}
		if (archive.isFileReady(crossId)) {
			ready++;
		}
		if (archive.isFileReady(mapDotsId)) {
			ready++;
		}
		if (archive.isFileReady(scrollbarId)) {
			ready++;
		}
		if (archive.isFileReady(nameIconsId)) {
			ready++;
		}
		if (archive.isFileReady(floorShadowsId)) {
			ready++;
		}
		if (archive.isFileReady(compassId)) {
			ready++;
		}
		if (archive.isFileReady(hintMapEdgeId)) {
			ready++;
		}
		return ready;
	}

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(I)I")
	public static int getTotal() {
		return 14;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!fh;I)V")
	public static void init(@OriginalArg(0) Js5 archive) {
		p11FullId = archive.getGroupId("p11_full");
		p12FullId = archive.getGroupId("p12_full");
		b12FullId = archive.getGroupId("b12_full");
		hitMarksId = archive.getGroupId("hitmarks");
		hitBarDefaultId = archive.getGroupId("hitbar_default");
		headIconsPkId = archive.getGroupId("headicons_pk");
		headIconsPrayerId = archive.getGroupId("headicons_prayer");
		hintHeadIconsId = archive.getGroupId("hint_headicons");
		hintMapMarkersId = archive.getGroupId("hint_mapmarkers");
		mapFlagId = archive.getGroupId("mapflag");
		crossId = archive.getGroupId("cross");
		mapDotsId = archive.getGroupId("mapdots");
		scrollbarId = archive.getGroupId("scrollbar");
		nameIconsId = archive.getGroupId("name_icons");
		floorShadowsId = archive.getGroupId("floorshadows");
		compassId = archive.getGroupId("compass");
		hintMapEdgeId = archive.getGroupId("hint_mapedge");
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!fh;B)V")
	public static void load(@OriginalArg(0) Js5 archive) {
		hitMarks = SpriteLoader.loadAlphaSprites(archive, hitMarksId);
		hitBarDefault = SpriteLoader.loadAlphaSprites(archive, hitBarDefaultId);
		headIconsPk = SpriteLoader.loadAlphaSprites(archive, headIconsPkId);
		headIconsPrayer = SpriteLoader.loadAlphaSprites(archive, headIconsPrayerId);
		hintHeadIcons = SpriteLoader.loadAlphaSprites(archive, hintHeadIconsId);
		hintMapMarkers = SpriteLoader.loadAlphaSprites(archive, hintMapMarkersId);
		mapFlag = SpriteLoader.loadSprites(archive, mapFlagId);
		cross = SpriteLoader.loadSprites(archive, crossId);
		mapDots = SpriteLoader.loadSprites(archive, mapDotsId);
		scrollbar = SpriteLoader.loadIndexedSprites(archive, scrollbarId);
		nameIcons = SpriteLoader.loadIndexedSprites(archive, nameIconsId);
		Fonts.p11Full.setNameIcons(nameIcons, null);
		Fonts.p12Full.setNameIcons(nameIcons, null);
		Fonts.b12Full.setNameIcons(nameIcons, null);
		if (GlRenderer.enabled) {
			floorShadows = SpriteLoader.loadSoftwareIndexedSprites(archive, floorShadowsId);
			for (@Pc(94) int i = 0; i < floorShadows.length; i++) {
				floorShadows[i].method1320();
			}
		}
		@Pc(115) SoftwareSprite compass = SpriteLoader.loadSoftwareSprite(archive, compassId, 0);
		compass.method2176();
		if (GlRenderer.enabled) {
			Sprites.compass = new GlSprite(compass);
		} else {
			Sprites.compass = compass;
		}
		@Pc(134) SoftwareSprite[] hintMapEdge = SpriteLoader.loadSoftwareSprites(archive, hintMapEdgeId);
		for (@Pc(136) int i = 0; i < hintMapEdge.length; i++) {
			hintMapEdge[i].method2176();
		}
		if (GlRenderer.enabled) {
			Sprites.hintMapEdge = new Sprite[hintMapEdge.length];
			for (@Pc(168) int i = 0; i < hintMapEdge.length; i++) {
				Sprites.hintMapEdge[i] = new GlSprite(hintMapEdge[i]);
			}
		} else {
			Sprites.hintMapEdge = hintMapEdge;
		}
	}
}
