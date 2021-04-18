import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class FontMetricsList {
	@OriginalMember(owner = "client!be", name = "a", descriptor = "Lclient!cc;")
	public static final SoftLruHashTable fontMetrics = new SoftLruHashTable(4);

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Lclient!ke;")
	public static SoftwareFont get(@OriginalArg(1) int id) {
		@Pc(6) SoftwareFont font = (SoftwareFont) fontMetrics.get(id);
		if (font != null) {
			return font;
		}
		@Pc(22) byte[] bytes = client.js5Archive13.fetchFile(id, 0);
		@Pc(35) SoftwareFont newFont = new SoftwareFont(bytes);
		newFont.setNameIcons(Sprites.nameIcons, null);
		fontMetrics.put(id, newFont);
		return newFont;
	}
}
