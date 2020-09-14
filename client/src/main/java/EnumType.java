import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class EnumType extends SecondaryNode {

	@OriginalMember(owner = "client!cj", name = "z", descriptor = "C")
	public char valueType;

	@OriginalMember(owner = "client!cj", name = "B", descriptor = "I")
	private int defaultInt;

	@OriginalMember(owner = "client!cj", name = "K", descriptor = "C")
	public char keyType;

	@OriginalMember(owner = "client!cj", name = "O", descriptor = "Lclient!ic;")
	private HashTable inverseTable;

	@OriginalMember(owner = "client!cj", name = "W", descriptor = "Lclient!ic;")
	public HashTable table;

	@OriginalMember(owner = "client!cj", name = "J", descriptor = "Ljava/lang/String;")
	private String defaultString = "null";

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)I")
	public final int getInt(@OriginalArg(1) int key) {
		if (this.table == null) {
			return this.defaultInt;
		} else {
			@Pc(17) IntNode node = (IntNode) this.table.get(key);
			return node == null ? this.defaultInt : node.value;
		}
	}

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V")
	private void inverseStrings() {
		this.inverseTable = new HashTable(this.table.getBucketCount());
		for (@Pc(22) StringNode node = (StringNode) this.table.head(); node != null; node = (StringNode) this.table.next()) {
			@Pc(34) EnumStringEntry entry = new EnumStringEntry(node.value, (int) node.key);
			this.inverseTable.put(StringUtils.longHashCode(node.value), entry);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!fd;I)V")
	private void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 1) {
			this.keyType = Cp1252Charset.decodeChar(buffer.readByte());
		} else if (code == 2) {
			this.valueType = Cp1252Charset.decodeChar(buffer.readByte());
		} else if (code == 3) {
			this.defaultString = buffer.readString();
		} else if (code == 4) {
			this.defaultInt = buffer.readInt();
		} else if (code == 5 || code == 6) {
			@Pc(68) int size = buffer.readUnsignedShort();
			this.table = new HashTable(IntUtils.clp2(size));
			for (@Pc(78) int i = 0; i < size; i++) {
				@Pc(87) int key = buffer.readInt();
				@Pc(99) Node node;
				if (code == 5) {
					node = new StringNode(buffer.readString());
				} else {
					node = new IntNode(buffer.readInt());
				}
				this.table.put(key, node);
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(II)Z")
	public final boolean containsValue(@OriginalArg(1) int value) {
		if (this.table == null) {
			return false;
		}
		if (this.inverseTable == null) {
			this.inverseInts();
		}
		@Pc(32) IntNode node = (IntNode) this.inverseTable.get(value);
		return node != null;
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(II)Ljava/lang/String;")
	public final String getString(@OriginalArg(0) int key) {
		if (this.table == null) {
			return this.defaultString;
		} else {
			@Pc(18) StringNode node = (StringNode) this.table.get(key);
			return node == null ? this.defaultString : node.value;
		}
	}

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)V")
	private void inverseInts() {
		this.inverseTable = new HashTable(this.table.getBucketCount());
		for (@Pc(24) IntNode node = (IntNode) this.table.head(); node != null; node = (IntNode) this.table.next()) {
			@Pc(33) IntNode inverseNode = new IntNode((int) node.key);
			this.inverseTable.put(node.value, inverseNode);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZLclient!fd;)V")
	public final void decode(@OriginalArg(1) Buffer buffer) {
		while (true) {
			@Pc(9) int code = buffer.readUnsignedByte();
			if (code == 0) {
				return;
			}
			this.decode(buffer, code);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public final boolean containsValue(@OriginalArg(1) String value) {
		if (this.table == null) {
			return false;
		}
		if (this.inverseTable == null) {
			this.inverseStrings();
		}
		for (@Pc(36) EnumStringEntry node = (EnumStringEntry) this.inverseTable.get(StringUtils.longHashCode(value)); node != null; node = (EnumStringEntry) this.inverseTable.nextWithKey()) {
			if (node.value.equals(value)) {
				return true;
			}
		}
		return false;
	}
}
