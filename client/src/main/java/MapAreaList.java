import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class MapAreaList {
	@OriginalMember(owner = "client!ii", name = "a", descriptor = "Lclient!ic;")
	public static final HashTable areas = new HashTable(16);

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "Lclient!fh;")
	public static Js5 archive;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!fh;)V")
	public static void init(@OriginalArg(0) Js5 archive) {
		MapAreaList.archive = archive;
		areas.clear();
		@Pc(9) int groupId = MapAreaList.archive.getGroupId("details");
		@Pc(14) int[] fileIds = MapAreaList.archive.getFileIds(groupId);
		for (@Pc(16) int i = 0; i < fileIds.length; i++) {
			areas.put(fileIds[i], MapArea.create(fileIds[i], new Buffer(MapAreaList.archive.fetchFile(groupId, fileIds[i]))));
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)Lclient!wg;")
	public static MapArea get(@OriginalArg(0) int id) {
		return (MapArea) areas.get(id);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)Lclient!wg;")
	public static MapArea getContainingSource(@OriginalArg(0) int x, @OriginalArg(1) int z) {
		for (@Pc(4) MapArea area = (MapArea) areas.head(); area != null; area = (MapArea) areas.next()) {
			if (area.valid && area.containsSource(x, z)) {
				return area;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)Lclient!uk;")
	public static SecondaryLinkedList getAllContainingSource(@OriginalArg(0) int x, @OriginalArg(1) int z) {
		@Pc(3) SecondaryLinkedList areas = new SecondaryLinkedList();
		for (@Pc(8) MapArea area = (MapArea) MapAreaList.areas.head(); area != null; area = (MapArea) MapAreaList.areas.next()) {
			if (area.valid && area.containsSource(x, z)) {
				areas.addTail(area);
			}
		}
		return areas;
	}
}
