import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class MapList {
	@OriginalMember(owner = "client!ii", name = "a", descriptor = "Lclient!ic;")
	public static final HashTable areas = new HashTable(16);

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "Lclient!fh;")
	public static Js5 archive;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!fh;)V")
	public static void init(@OriginalArg(0) Js5 archive) {
		MapList.archive = archive;
		areas.clear();
		@Pc(9) int groupId = MapList.archive.getGroupId("details");
		@Pc(14) int[] fileIds = MapList.archive.getFileIds(groupId);
		for (@Pc(16) int i = 0; i < fileIds.length; i++) {
			areas.put(fileIds[i], Map.create(fileIds[i], new Buffer(MapList.archive.fetchFile(groupId, fileIds[i]))));
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)Lclient!wg;")
	public static Map get(@OriginalArg(0) int id) {
		return (Map) areas.get(id);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)Lclient!wg;")
	public static Map getContainingSource(@OriginalArg(0) int x, @OriginalArg(1) int z) {
		for (@Pc(4) Map map = (Map) areas.head(); map != null; map = (Map) areas.next()) {
			if (map.valid && map.containsSource(x, z)) {
				return map;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)Lclient!uk;")
	public static SecondaryLinkedList getAllContainingSource(@OriginalArg(0) int x, @OriginalArg(1) int z) {
		@Pc(3) SecondaryLinkedList maps = new SecondaryLinkedList();
		for (@Pc(8) Map map = (Map) MapList.areas.head(); map != null; map = (Map) MapList.areas.next()) {
			if (map.valid && map.containsSource(x, z)) {
				maps.addTail(map);
			}
		}
		return maps;
	}
}
