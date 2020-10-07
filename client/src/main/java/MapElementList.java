import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class MapElementList {

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!fh;ILjava/lang/String;Z)Lclient!po;")
	public static MapElementList create(@OriginalArg(0) Js5 archive, @OriginalArg(2) String group, @OriginalArg(3) boolean allowMembers) {
		@Pc(10) int groupId = archive.getGroupId(group);
		if (groupId == -1) {
			return new MapElementList(0);
		}
		@Pc(23) int[] fileIds = archive.getFileIds(groupId);
		@Pc(29) MapElementList local29 = new MapElementList(fileIds.length);
		@Pc(31) int i = 0;
		@Pc(39) int j = 0;
		while (true) {
			while (i < local29.size) {
				@Pc(59) Buffer buffer = new Buffer(archive.fetchFile(groupId, fileIds[j++]));
				@Pc(63) int position = buffer.readInt();
				@Pc(67) int id = buffer.readUnsignedShort();
				@Pc(71) int members = buffer.readUnsignedByte();
				if (!allowMembers && members == 1) {
					local29.size--;
				} else {
					local29.positions[i] = position;
					local29.elements[i] = new MapElement();
					local29.elements[i].id = id;
					i++;
				}
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!po", name = "f", descriptor = "I")
	public int size;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "[I")
	public final int[] positions;

	@OriginalMember(owner = "client!po", name = "e", descriptor = "[Lclient!fg;")
	public final MapElement[] elements;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(I)V")
	public MapElementList(@OriginalArg(0) int size) {
		this.size = size;
		this.positions = new int[this.size];
		this.elements = new MapElement[this.size];
	}
}
