import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class StructType extends SecondaryNode {

	@OriginalMember(owner = "client!ro", name = "C", descriptor = "Lclient!ic;")
	private HashTable params;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!fd;BI)V")
	private void decode(@OriginalArg(0) Buffer buffer, @OriginalArg(2) int code) {
		if (code != 249) {
			return;
		}
		@Pc(12) int size = buffer.readUnsignedByte();
		if (this.params == null) {
			@Pc(21) int buckets = IntUtils.clp2(size);
			this.params = new HashTable(buckets);
		}
		for (@Pc(29) int i = 0; i < size; i++) {
			@Pc(41) boolean string = buffer.readUnsignedByte() == 1;
			@Pc(45) int id = buffer.readUnsignedMedium();
			@Pc(54) Node node;
			if (string) {
				node = new StringNode(buffer.readString());
			} else {
				node = new IntNode(buffer.readInt());
			}
			this.params.put(id, node);
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(III)I")
	public final int getParam(@OriginalArg(1) int id, @OriginalArg(0) int defaultValue) {
		if (this.params == null) {
			return defaultValue;
		} else {
			@Pc(19) IntNode node = (IntNode) this.params.get(id);
			return node == null ? defaultValue : node.value;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!fd;I)V")
	public final void decode(@OriginalArg(0) Buffer buffer) {
		while (true) {
			@Pc(9) int code = buffer.readUnsignedByte();
			if (code == 0) {
				return;
			}
			this.decode(buffer, code);
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;")
	public final String getParam(@OriginalArg(1) int id, @OriginalArg(0) String defaultValue) {
		if (this.params == null) {
			return defaultValue;
		} else {
			@Pc(22) StringNode node = (StringNode) this.params.get(id);
			return node == null ? defaultValue : node.value;
		}
	}
}
