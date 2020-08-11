import java.io.IOException;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!unpackclass")
public final class unpackclass extends unpack {

	@OriginalMember(owner = "unpackclass!unpackclass", name = "a", descriptor = "[I")
	private int[] CONSTANT_POOL_ENTRY_LENGTHS = new int[] { 0, 3, 0, 5, 5, 9, 9, 3, 3, 5, 5, 5, 5 };

	@OriginalMember(owner = "unpackclass!unpackclass", name = "b", descriptor = "Lunpackclass!e;")
	private Buffer in = new Buffer(null);

	@OriginalMember(owner = "unpackclass!unpackclass", name = "c", descriptor = "Lunpackclass!e;")
	private Buffer newArrayBuffer = new Buffer(null);

	@OriginalMember(owner = "unpackclass!unpackclass", name = "d", descriptor = "Lunpackclass!e;")
	private Buffer localVariableBuffer = new Buffer(null);

	@OriginalMember(owner = "unpackclass!unpackclass", name = "e", descriptor = "Lunpackclass!e;")
	private Buffer wideLocalVariableBuffer = new Buffer(null);

	@OriginalMember(owner = "unpackclass!unpackclass", name = "f", descriptor = "Lunpackclass!e;")
	private Buffer sipushAndSwitchBuffer = new Buffer(null);

	@OriginalMember(owner = "unpackclass!unpackclass", name = "g", descriptor = "Lunpackclass!e;")
	private Buffer constantBuffer = new Buffer(null);

	@OriginalMember(owner = "unpackclass!unpackclass", name = "h", descriptor = "Lunpackclass!e;")
	private Buffer wideConstantBuffer = new Buffer(null);

	@OriginalMember(owner = "unpackclass!unpackclass", name = "i", descriptor = "Lunpackclass!e;")
	private Buffer classBuffer = new Buffer(null);

	@OriginalMember(owner = "unpackclass!unpackclass", name = "j", descriptor = "Lunpackclass!e;")
	private Buffer fieldRefBuffer = new Buffer(null);

	@OriginalMember(owner = "unpackclass!unpackclass", name = "k", descriptor = "Lunpackclass!e;")
	private Buffer methodRefBuffer = new Buffer(null);

	@OriginalMember(owner = "unpackclass!unpackclass", name = "l", descriptor = "Lunpackclass!e;")
	private Buffer interfaceMethodRefBuffer = new Buffer(null);

	@OriginalMember(owner = "unpackclass!unpackclass", name = "m", descriptor = "Lunpackclass!e;")
	private Buffer branchBuffer = new Buffer(null);

	@OriginalMember(owner = "unpackclass!unpackclass", name = "n", descriptor = "Lunpackclass!e;")
	private Buffer bipushBuffer = new Buffer(null);

	@OriginalMember(owner = "unpackclass!unpackclass", name = "o", descriptor = "Lunpackclass!e;")
	private Buffer wideIincBuffer = new Buffer(null);

	@OriginalMember(owner = "unpackclass!unpackclass", name = "p", descriptor = "Lunpackclass!e;")
	private Buffer iincBuffer = new Buffer(null);

	@OriginalMember(owner = "unpackclass!unpackclass", name = "q", descriptor = "Lunpackclass!e;")
	private Buffer multiANewArrayBuffer = new Buffer(null);

	@OriginalMember(owner = "unpackclass!unpackclass", name = "I", descriptor = "Lunpackclass!f;")
	private LinkedList constantPool = new LinkedList();

	@OriginalMember(owner = "unpackclass!unpackclass", name = "J", descriptor = "I")
	private int constantPoolSize = 1;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "K", descriptor = "[I")
	private int[] OPCODE_FLAGS = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 16, 1026, 1026, 1026, 1026, 1026, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1026, 1026, 1026, 1026, 1026, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1026, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 1026, 0, 0, 0, 0, 0, 0, 0, 0, 64, 64, 64, 64, 128, 128, 128, 0, 4, 32, 0, 32, 0, 0, 32, 32, 0, 0, 0, 32, 256, 256, 512, 512, 16, 4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "unpackclass!unpackclass", name = "A", descriptor = "[Lunpackclass!s;")
	private ConstantPoolEntry[] utf8Entries;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "u", descriptor = "[Lunpackclass!s;")
	private ConstantPoolEntry[] intEntries;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "w", descriptor = "[Lunpackclass!s;")
	private ConstantPoolEntry[] longEntries;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "v", descriptor = "[Lunpackclass!s;")
	private ConstantPoolEntry[] floatEntries;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "x", descriptor = "[Lunpackclass!s;")
	private ConstantPoolEntry[] doubleEntries;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "y", descriptor = "[Lunpackclass!s;")
	private ConstantPoolEntry[] fieldNameAndTypeEntries;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "z", descriptor = "[Lunpackclass!s;")
	private ConstantPoolEntry[] methodNameAndTypeEntries;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "r", descriptor = "[Lunpackclass!s;")
	private ConstantPoolEntry[] fieldRefEntries;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "s", descriptor = "[Lunpackclass!s;")
	private ConstantPoolEntry[] methodRefEntries;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "t", descriptor = "[Lunpackclass!s;")
	private ConstantPoolEntry[] interfaceMethodRefEntries;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "B", descriptor = "[Lunpackclass!s;")
	private ConstantPoolEntry[] stringEntries;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "C", descriptor = "[Lunpackclass!s;")
	private ConstantPoolEntry[] classEntries;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "E", descriptor = "Lunpackclass!s;")
	private ConstantPoolEntry code;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "F", descriptor = "Lunpackclass!s;")
	private ConstantPoolEntry exceptions;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "D", descriptor = "Lunpackclass!s;")
	private ConstantPoolEntry constantValue;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "G", descriptor = "Lunpackclass!s;")
	private final ConstantPoolEntry sourceFile;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "H", descriptor = "Lunpackclass!s;")
	private final ConstantPoolEntry lineNumberTable;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "a", descriptor = "(Lunpackclass!e;[Lunpackclass!s;)Lunpackclass!s;")
	private static ConstantPoolEntry readEntry1(@OriginalArg(0) Buffer buffer, @OriginalArg(1) ConstantPoolEntry[] entries) {
		return entries[buffer.readUnsignedShort()];
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "b", descriptor = "(Lunpackclass!e;[Lunpackclass!s;)Lunpackclass!s;")
	private static ConstantPoolEntry readEntry2(@OriginalArg(0) Buffer buffer, @OriginalArg(1) ConstantPoolEntry[] entries) {
		return entries[buffer.readUnsignedShort()];
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "d", descriptor = "(Lunpackclass!e;[Lunpackclass!s;)Lunpackclass!s;")
	private static ConstantPoolEntry readEntry3(@OriginalArg(0) Buffer buffer, @OriginalArg(1) ConstantPoolEntry[] entries) {
		return entries[buffer.readUnsignedShort()];
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "a", descriptor = "(Ljava/lang/String;)Lunpackclass!s;")
	private static ConstantPoolEntry createUtf8Entry(@OriginalArg(0) String value) {
		@Pc(3) ConstantPoolEntry entry = new ConstantPoolEntry();
		entry.tag = 1;
		entry.bytesValue = value.getBytes();
		return entry;
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "a", descriptor = "([B)I")
	private static int getMethodDescriptorSize(@OriginalArg(0) byte[] descriptor) {
		@Pc(1) int size = 1;
		@Pc(3) int index = 1;
		@Pc(5) boolean className = false;
		while (true) {
			@Pc(10) byte chr = descriptor[index++];
			if (className) {
				if (chr == ';') {
					className = false;
				}
			} else {
				if (chr == ')') {
					return size;
				}
				if (chr != '[') {
					size++;
					if (chr == 'J' || chr == 'D') {
						size++;
					}
					if (chr == 'L') {
						className = true;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "<init>", descriptor = "([BZ)V")
	public unpackclass(@OriginalArg(0) byte[] bytes, @OriginalArg(1) boolean readLineNumberTable) throws IOException {
		@Pc(572) Js5File file = new Js5File(bytes, true, true);
		this.in.bytes = file.fetchFile(1, 0);
		this.in.position = this.in.bytes.length - 20;
		this.utf8Entries = this.createEntries(1);
		this.intEntries = this.createEntries(3);
		this.longEntries = this.createEntries(5);
		this.floatEntries = this.createEntries(4);
		this.doubleEntries = this.createEntries(6);
		this.fieldNameAndTypeEntries = this.createEntries(12);
		this.methodNameAndTypeEntries = this.createEntries(12);
		this.fieldRefEntries = this.createEntries(9);
		this.methodRefEntries = this.createEntries(10);
		this.interfaceMethodRefEntries = this.createEntries(11);
		this.stringEntries = new ConstantPoolEntry[this.utf8Entries.length];
		this.classEntries = new ConstantPoolEntry[this.utf8Entries.length];
		this.utf8Entries[0] = this.code = createUtf8Entry("Code");
		this.utf8Entries[1] = this.exceptions = createUtf8Entry("Exceptions");
		this.utf8Entries[2] = createUtf8Entry("Synthetic");
		this.utf8Entries[3] = this.constantValue = createUtf8Entry("ConstantValue");
		this.utf8Entries[4] = this.sourceFile = createUtf8Entry("SourceFile");
		this.utf8Entries[5] = this.lineNumberTable = createUtf8Entry("LineNumberTable");
		this.in.position = 0;
		this.readUtf8Entries();
		this.readEntryNames(this.fieldNameAndTypeEntries);
		this.readEntryNames(this.methodNameAndTypeEntries);
		this.readEntryDescriptors(this.fieldNameAndTypeEntries, this.utf8Entries);
		this.readEntryDescriptors(this.methodNameAndTypeEntries, this.utf8Entries);
		this.readEntryClassNames(this.fieldRefEntries);
		this.readEntryClassNames(this.methodRefEntries);
		this.readEntryClassNames(this.interfaceMethodRefEntries);
		this.readEntryDescriptors(this.fieldRefEntries, this.fieldNameAndTypeEntries);
		this.readEntryDescriptors(this.methodRefEntries, this.methodNameAndTypeEntries);
		this.readEntryDescriptors(this.interfaceMethodRefEntries, this.methodNameAndTypeEntries);
		this.readNumericEntries(this.intEntries, 24);
		this.readNumericEntries(this.intEntries, 16);
		this.readNumericEntries(this.intEntries, 8);
		this.readNumericEntries(this.intEntries, 0);
		this.readNumericEntries(this.longEntries, 56);
		this.readNumericEntries(this.longEntries, 48);
		this.readNumericEntries(this.longEntries, 40);
		this.readNumericEntries(this.longEntries, 32);
		this.readNumericEntries(this.longEntries, 24);
		this.readNumericEntries(this.longEntries, 16);
		this.readNumericEntries(this.longEntries, 8);
		this.readNumericEntries(this.longEntries, 0);
		this.readNumericEntries(this.floatEntries, 24);
		this.readNumericEntries(this.floatEntries, 16);
		this.readNumericEntries(this.floatEntries, 8);
		this.readNumericEntries(this.floatEntries, 0);
		this.readNumericEntries(this.doubleEntries, 56);
		this.readNumericEntries(this.doubleEntries, 48);
		this.readNumericEntries(this.doubleEntries, 40);
		this.readNumericEntries(this.doubleEntries, 32);
		this.readNumericEntries(this.doubleEntries, 24);
		this.readNumericEntries(this.doubleEntries, 16);
		this.readNumericEntries(this.doubleEntries, 8);
		this.readNumericEntries(this.doubleEntries, 0);
		@Pc(881) int classes = file.getGroupCapacity();
		for (@Pc(883) int i = 0; i < classes; i++) {
			this.in.bytes = file.fetchFile(0, i);
			this.readClass(readLineNumberTable);
		}
		this.CONSTANT_POOL_ENTRY_LENGTHS = null;
		this.in = null;
		this.newArrayBuffer = null;
		this.localVariableBuffer = null;
		this.wideLocalVariableBuffer = null;
		this.sipushAndSwitchBuffer = null;
		this.constantBuffer = null;
		this.wideConstantBuffer = null;
		this.classBuffer = null;
		this.fieldRefBuffer = null;
		this.methodRefBuffer = null;
		this.interfaceMethodRefBuffer = null;
		this.branchBuffer = null;
		this.bipushBuffer = null;
		this.wideIincBuffer = null;
		this.iincBuffer = null;
		this.multiANewArrayBuffer = null;
		this.fieldRefEntries = null;
		this.methodRefEntries = null;
		this.interfaceMethodRefEntries = null;
		this.intEntries = null;
		this.floatEntries = null;
		this.longEntries = null;
		this.doubleEntries = null;
		this.fieldNameAndTypeEntries = null;
		this.methodNameAndTypeEntries = null;
		this.utf8Entries = null;
		this.stringEntries = null;
		this.classEntries = null;
		this.constantValue = null;
		this.code = null;
		this.exceptions = null;
		this.constantPool = null;
		this.OPCODE_FLAGS = null;
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "a", descriptor = "(Lunpackclass!s;)V")
	private void addConstantPoolEntry(@OriginalArg(0) ConstantPoolEntry entry) {
		if (entry.isLinked()) {
			return;
		}
		this.constantPool.addTail(entry);
		entry.index = this.constantPoolSize++;
		if (entry.tag == 5 || entry.tag == 6) {
			this.constantPoolSize++;
		}
		if (entry.name != null) {
			this.addConstantPoolEntry(entry.name);
		}
		if (entry.descriptor != null) {
			this.addConstantPoolEntry(entry.descriptor);
		}
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "c", descriptor = "(Lunpackclass!e;[Lunpackclass!s;)Lunpackclass!s;")
	private ConstantPoolEntry readAndAddEntry(@OriginalArg(0) Buffer buffer, @OriginalArg(1) ConstantPoolEntry[] entries) {
		@Pc(4) ConstantPoolEntry entry = entries[buffer.readUnsignedShort()];
		this.addConstantPoolEntry(entry);
		return entry;
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "a", descriptor = "(Lunpackclass!e;[Lunpackclass!s;I)Lunpackclass!s;")
	private ConstantPoolEntry readClass(@OriginalArg(0) Buffer buffer, @OriginalArg(1) ConstantPoolEntry[] entries) {
		@Pc(2) int index = buffer.readUnsignedShort();
		@Pc(6) ConstantPoolEntry entry = entries[index];
		if (entry == null) {
			entry = new ConstantPoolEntry();
			entry.tag = 7;
			entry.name = this.utf8Entries[index];
			entries[index] = entry;
		}
		return entry;
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "b", descriptor = "(Lunpackclass!e;[Lunpackclass!s;I)Lunpackclass!s;")
	private ConstantPoolEntry readNamedEntry(@OriginalArg(0) Buffer buffer, @OriginalArg(1) ConstantPoolEntry[] entries, @OriginalArg(2) int tag) {
		@Pc(2) int index = buffer.readUnsignedShort();
		@Pc(6) ConstantPoolEntry entry = entries[index];
		if (entry == null) {
			entry = new ConstantPoolEntry();
			entry.tag = tag;
			entry.name = this.utf8Entries[index];
			entries[index] = entry;
		}
		this.addConstantPoolEntry(entry);
		return entry;
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "a", descriptor = "()Lunpackclass!s;")
	private ConstantPoolEntry readCatchType() {
		@Pc(3) int indexPlusOne = this.in.readUnsignedShort();
		if (indexPlusOne == 0) {
			return null;
		}
		@Pc(8) int index = indexPlusOne - 1;
		@Pc(13) ConstantPoolEntry entry = this.classEntries[index];
		if (entry == null) {
			entry = new ConstantPoolEntry();
			entry.tag = 7;
			entry.name = this.utf8Entries[index];
			this.classEntries[index] = entry;
		}
		this.addConstantPoolEntry(entry);
		return entry;
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "a", descriptor = "(I)[Lunpackclass!s;")
	private ConstantPoolEntry[] createEntries(@OriginalArg(0) int tag) {
		@Pc(4) ConstantPoolEntry[] entries = new ConstantPoolEntry[this.in.readUnsignedShort()];
		for (@Pc(6) int i = 0; i < entries.length; i++) {
			entries[i] = new ConstantPoolEntry();
			entries[i].tag = tag;
		}
		return entries;
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "b", descriptor = "()V")
	private void readUtf8Entries() {
		for (@Pc(1) int i = 6; i < this.utf8Entries.length; i++) {
			@Pc(6) int position;
			for (position = this.in.position; this.in.bytes[position] != 0; position++) {
			}
			@Pc(20) int len = position - this.in.position;
			this.utf8Entries[i].bytesValue = new byte[len];
			this.in.readBytes(this.utf8Entries[i].bytesValue, len);
			this.in.position++;
		}
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "a", descriptor = "([Lunpackclass!s;)V")
	private void readEntryNames(@OriginalArg(0) ConstantPoolEntry[] entries) {
		for (@Pc(1) int i = 0; i < entries.length; i++) {
			entries[i].name = readEntry1(this.in, this.utf8Entries);
		}
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "b", descriptor = "([Lunpackclass!s;)V")
	private void readEntryClassNames(@OriginalArg(0) ConstantPoolEntry[] entries) {
		for (@Pc(1) int i = 0; i < entries.length; i++) {
			entries[i].name = this.readClass(this.in, this.classEntries);
		}
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "a", descriptor = "([Lunpackclass!s;[Lunpackclass!s;)V")
	private void readEntryDescriptors(@OriginalArg(0) ConstantPoolEntry[] entries, @OriginalArg(1) ConstantPoolEntry[] descriptors) {
		for (@Pc(1) int i = 0; i < entries.length; i++) {
			entries[i].descriptor = readEntry1(this.in, descriptors);
		}
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "a", descriptor = "([Lunpackclass!s;I)V")
	private void readNumericEntries(@OriginalArg(0) ConstantPoolEntry[] entries, @OriginalArg(1) int shift) {
		@Pc(1) long accumulator = 0L;
		for (@Pc(3) int i = 0; i < entries.length; i++) {
			accumulator += (long) this.in.readUnsignedByte() << shift;
			entries[i].longValue += accumulator;
		}
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "c", descriptor = "()[Lunpackclass!g;")
	private Member[] createMembers() {
		@Pc(4) Member[] members = new Member[this.in.readUnsignedShort()];
		for (@Pc(6) int i = 0; i < members.length; i++) {
			members[i] = new Member();
		}
		return members;
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "a", descriptor = "([Lunpackclass!g;)V")
	private void createAttributes(@OriginalArg(0) Member[] members) {
		for (@Pc(1) int i = 0; i < members.length; i++) {
			members[i].attributes = new Attribute[this.in.readUnsignedByte()];
			for (@Pc(12) int j = 0; j < members[i].attributes.length; j++) {
				members[i].attributes[j] = new Attribute();
			}
		}
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "b", descriptor = "([Lunpackclass!g;)V")
	private void readAttributeNames(@OriginalArg(0) Member[] members) {
		for (@Pc(1) int i = 0; i < members.length; i++) {
			for (@Pc(4) int j = 0; j < members[i].attributes.length; j++) {
				members[i].attributes[j].name = this.readAndAddEntry(this.in, this.utf8Entries);
			}
		}
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "c", descriptor = "([Lunpackclass!g;)I")
	private int getMembersLength(@OriginalArg(0) Member[] members) {
		@Pc(4) int len = members.length * 8;
		for (@Pc(6) int i = 0; i < members.length; i++) {
			len += members[i].attributes.length * 6;
			for (@Pc(19) int j = 0; j < members[i].attributes.length; j++) {
				@Pc(27) Attribute attribute = members[i].attributes[j];
				if (attribute.name == this.constantValue) {
					len += 2;
				}
				if (attribute.name == this.code) {
					@Pc(39) int len2 = len + 12;
					len2 += attribute.code.length;
					len = len2 + attribute.code.exceptionTable.length * 8;
					if (attribute.code.lineNumberTable != null) {
						@Pc(59) int len3 = len + 8;
						len = len3 + attribute.code.lineNumberTable.length * 4;
					}
				}
				if (attribute.name == this.exceptions) {
					@Pc(74) int len2 = len + 2;
					len = len2 + attribute.exceptions.length * 2;
				}
			}
		}
		return len;
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "a", descriptor = "(Z)V")
	private void readClass(@OriginalArg(0) boolean readLineNumberTable) {
		this.in.position = this.in.bytes.length - 6;
		@Pc(13) ConstantPoolEntry[] interfaces = new ConstantPoolEntry[this.in.readUnsignedShort()];
		@Pc(16) Member[] fields = this.createMembers();
		@Pc(19) Member[] methods = this.createMembers();
		this.in.position = 0;
		this.createAttributes(fields);
		this.createAttributes(methods);
		this.readAttributeNames(fields);
		this.readAttributeNames(methods);
		for (@Pc(37) int i = 0; i < methods.length; i++) {
			for (@Pc(40) int j = 0; j < methods[i].attributes.length; j++) {
				@Pc(48) Attribute attribute = methods[i].attributes[j];
				if (attribute.name == this.exceptions) {
					attribute.exceptions = new ConstantPoolEntry[this.in.readUnsignedByte()];
				}
			}
		}
		for (@Pc(74) int i = 0; i < methods.length; i++) {
			for (@Pc(77) int j = 0; j < methods[i].attributes.length; j++) {
				@Pc(85) Attribute attribute = methods[i].attributes[j];
				if (attribute.name == this.code) {
					attribute.code = new Code();
					attribute.code.exceptionTable = new ExceptionTableEntry[this.in.readUnsignedByte()];
					for (@Pc(104) int k = 0; k < attribute.code.exceptionTable.length; k++) {
						attribute.code.exceptionTable[k] = new ExceptionTableEntry();
					}
				}
			}
		}
		for (@Pc(135) int i = 0; i < methods.length; i++) {
			for (@Pc(138) int j = 0; j < methods[i].attributes.length; j++) {
				@Pc(146) Attribute attribute = methods[i].attributes[j];
				if (attribute.name == this.code) {
					attribute.code.maxStack = this.in.readUnsignedByte();
				}
			}
		}
		for (@Pc(172) int i = 0; i < methods.length; i++) {
			for (@Pc(175) int j = 0; j < methods[i].attributes.length; j++) {
				@Pc(183) Attribute attribute = methods[i].attributes[j];
				if (attribute.name == this.code) {
					attribute.code.maxLocals = this.in.readUnsignedByte();
				}
			}
		}
		@Pc(209) int lineNumberTableLen = 0;
		for (@Pc(211) int i = 0; i < methods.length; i++) {
			for (@Pc(214) int j = 0; j < methods[i].attributes.length; j++) {
				@Pc(222) Attribute attribute = methods[i].attributes[j];
				if (attribute.name == this.code) {
					@Pc(231) int position = this.in.position;
					if (this.in.readUnsignedSmart() > 0) {
						@Pc(237) int lines = 1;
						while (this.in.readUnsignedSmart() != 0) {
							lines++;
						}
						if (readLineNumberTable) {
							this.in.position = position;
							this.addConstantPoolEntry(this.lineNumberTable);
							attribute.code.lineNumberTable = new LineNumberTableEntry[lines];
							@Pc(260) int startPc = -1;
							for (@Pc(262) int k = 0; k < lines; k++) {
								startPc += this.in.readUnsignedSmart();
								attribute.code.lineNumberTable[k] = new LineNumberTableEntry();
								attribute.code.lineNumberTable[k].startPc = startPc;
							}
							this.in.position++;
						} else {
							lineNumberTableLen += lines;
						}
					}
				}
			}
		}
		if (readLineNumberTable) {
			@Pc(317) int lineNumber = 0;
			for (@Pc(319) int i = 0; i < methods.length; i++) {
				for (@Pc(322) int j = 0; j < methods[i].attributes.length; j++) {
					@Pc(330) Attribute attribute = methods[i].attributes[j];
					if (attribute.name == this.code && attribute.code.lineNumberTable != null) {
						for (@Pc(341) int k = 0; k < attribute.code.lineNumberTable.length; k++) {
							lineNumber += this.in.readUnsignedShort();
							attribute.code.lineNumberTable[k].lineNumber = lineNumber;
						}
					}
				}
			}
		} else {
			@Pc(378) Buffer in = this.in;
			in.position += lineNumberTableLen * 2;
		}
		@Pc(391) int accessFlagsMsb = this.in.readUnsignedByte() << 8;
		for (@Pc(393) int i = 0; i < fields.length; i++) {
			fields[i].accessFlags = this.in.readUnsignedByte() << 8;
		}
		for (@Pc(410) int i = 0; i < methods.length; i++) {
			methods[i].accessFlags = this.in.readUnsignedByte() << 8;
		}
		@Pc(431) int accessFlags = accessFlagsMsb + this.in.readUnsignedByte();
		for (@Pc(433) int i = 0; i < fields.length; i++) {
			fields[i].accessFlags += this.in.readUnsignedByte();
		}
		for (@Pc(451) int i = 0; i < methods.length; i++) {
			methods[i].accessFlags += this.in.readUnsignedByte();
		}
		@Pc(471) int sourceFileIndex = this.in.readUnsignedShort();
		@Pc(484) ConstantPoolEntry sourceFile;
		if (sourceFileIndex > 0) {
			this.addConstantPoolEntry(this.sourceFile);
			sourceFile = this.utf8Entries[sourceFileIndex - 1];
			this.addConstantPoolEntry(sourceFile);
		} else {
			sourceFile = null;
		}
		for (@Pc(492) int i = 0; i < methods.length; i++) {
			for (@Pc(495) int j = 0; j < methods[i].attributes.length; j++) {
				@Pc(503) Attribute attribute = methods[i].attributes[j];
				if (attribute.name == this.exceptions) {
					for (@Pc(510) int k = 0; k < attribute.exceptions.length; k++) {
						attribute.exceptions[k] = this.readNamedEntry(this.in, this.classEntries, 7);
					}
				}
			}
		}
		for (@Pc(543) int i = 0; i < methods.length; i++) {
			for (@Pc(546) int j = 0; j < methods[i].attributes.length; j++) {
				@Pc(554) Attribute attribute = methods[i].attributes[j];
				if (attribute.name == this.code) {
					for (@Pc(561) int k = 0; k < attribute.code.exceptionTable.length; k++) {
						attribute.code.exceptionTable[k].catchType = this.readCatchType();
					}
				}
			}
		}
		@Pc(598) ConstantPoolEntry thisClass = this.readNamedEntry(this.in, this.classEntries, 7);
		@Pc(606) ConstantPoolEntry superClass = this.readNamedEntry(this.in, this.classEntries, 7);
		for (@Pc(608) int i = 0; i < interfaces.length; i++) {
			interfaces[i] = this.readNamedEntry(this.in, this.classEntries, 7);
		}
		for (@Pc(626) int i = 0; i < fields.length; i++) {
			fields[i].nameAndType = readEntry1(this.in, this.fieldNameAndTypeEntries);
			this.addConstantPoolEntry(fields[i].nameAndType.name);
			this.addConstantPoolEntry(fields[i].nameAndType.descriptor);
		}
		for (@Pc(657) int i = 0; i < methods.length; i++) {
			methods[i].nameAndType = readEntry1(this.in, this.methodNameAndTypeEntries);
			this.addConstantPoolEntry(methods[i].nameAndType.name);
			this.addConstantPoolEntry(methods[i].nameAndType.descriptor);
		}
		@Pc(690) int minorVersion = this.in.readUnsignedShort();
		@Pc(694) int majorVersion = this.in.readUnsignedShort();
		for (@Pc(696) int i = 0; i < fields.length; i++) {
			for (@Pc(699) int j = 0; j < fields[i].attributes.length; j++) {
				@Pc(707) Attribute attribute = fields[i].attributes[j];
				if (attribute.name == this.constantValue) {
					@Pc(717) ConstantPoolEntry nameAndType = fields[i].nameAndType;
					@Pc(720) ConstantPoolEntry descriptor = nameAndType.descriptor;
					@Pc(725) byte type = descriptor.bytesValue[0];
					if (type == 'J') {
						attribute.constantValue = this.readAndAddEntry(this.in, this.longEntries);
					} else if (type == 'F') {
						attribute.constantValue = this.readAndAddEntry(this.in, this.floatEntries);
					} else if (type == 'D') {
						attribute.constantValue = this.readAndAddEntry(this.in, this.doubleEntries);
					} else if (type == 'L') {
						attribute.constantValue = this.readNamedEntry(this.in, this.stringEntries, 8);
					} else {
						attribute.constantValue = this.readAndAddEntry(this.in, this.intEntries);
					}
				}
			}
		}
		for (@Pc(797) int i = 0; i < methods.length; i++) {
			for (@Pc(800) int j = 0; j < methods[i].attributes.length; j++) {
				@Pc(808) Attribute attribute = methods[i].attributes[j];
				if (attribute.name == this.code) {
					@Pc(815) int prevStartPc = 0;
					for (@Pc(817) int k = 0; k < attribute.code.exceptionTable.length; k++) {
						@Pc(822) int startPc = this.in.readUnsignedShort();
						if (startPc == 0) {
							startPc = prevStartPc;
						} else if (startPc == prevStartPc) {
							startPc = 0;
						}
						@Pc(837) ExceptionTableEntry entry = attribute.code.exceptionTable[k];
						prevStartPc = startPc;
						entry.startPc = startPc;
					}
				}
			}
		}
		for (@Pc(863) int i = 0; i < methods.length; i++) {
			for (@Pc(866) int j = 0; j < methods[i].attributes.length; j++) {
				@Pc(874) Attribute attribute = methods[i].attributes[j];
				if (attribute.name == this.code) {
					for (@Pc(881) int k = 0; k < attribute.code.exceptionTable.length; k++) {
						attribute.code.exceptionTable[k].endPcToHandlerPc = this.in.readShort();
					}
				}
			}
		}
		for (@Pc(913) int i = 0; i < methods.length; i++) {
			for (@Pc(916) int j = 0; j < methods[i].attributes.length; j++) {
				@Pc(924) Attribute attribute = methods[i].attributes[j];
				if (attribute.name == this.code) {
					for (@Pc(931) int k = 0; k < attribute.code.exceptionTable.length; k++) {
						attribute.code.exceptionTable[k].reverseHandlerPc = this.in.readUnsignedShort();
					}
				}
			}
		}
		@Pc(965) int codePosition = this.in.position;
		@Pc(967) int newArrayLen = 0;
		@Pc(969) int localVariableLen = 0;
		@Pc(971) int wideLocalVariableLen = 0;
		@Pc(973) int sipushAndSwitchLen = 0;
		@Pc(975) int constantLen = 0;
		@Pc(977) int wideConstantLen = 0;
		@Pc(979) int classLen = 0;
		@Pc(981) int fieldRefLen = 0;
		@Pc(983) int methodRefLen = 0;
		@Pc(985) int interfaceMethodRefLen = 0;
		@Pc(987) int branchLen = 0;
		@Pc(989) int bipushLen = 0;
		@Pc(991) int wideIincLen = 0;
		@Pc(993) int multiANewArrayLen = 0;
		for (@Pc(995) int i = 0; i < methods.length; i++) {
			for (@Pc(998) int j = 0; j < methods[i].attributes.length; j++) {
				@Pc(1006) Attribute attribute = methods[i].attributes[j];
				if (attribute.name == this.code) {
					@Pc(1013) int len = 0;
					while (true) {
						@Pc(1017) int opcode = this.in.readUnsignedByte();
						if (opcode == 204) {
							attribute.code.length = len;
							break;
						}
						@Pc(1025) int flags = this.OPCODE_FLAGS[opcode];
						len++;
						if ((flags & 0x1) != 0) {
							throw new RuntimeException("invalid opcode " + opcode);
						}
						if ((flags & 0x2) != 0) {
							localVariableLen++;
						}
						if ((flags & 0x4) != 0) {
							constantLen += 2;
						}
						if ((flags & 0x10) != 0) {
							wideConstantLen += 2;
						}
						if ((flags & 0x20) != 0) {
							classLen += 2;
						}
						if ((flags & 0x40) != 0) {
							fieldRefLen += 2;
						}
						if ((flags & 0x80) != 0) {
							methodRefLen += 2;
						}
						if ((flags & 0x100) != 0) {
							branchLen += 2;
						}
						if ((flags & 0x200) != 0) {
							branchLen += 4;
						}
						if (opcode == 16) {
							bipushLen++;
						}
						if (opcode == 17) {
							sipushAndSwitchLen += 2;
						}
						if (opcode == 132) {
							multiANewArrayLen++;
						}
						if (opcode == 170) {
							@Pc(1102) int cases = this.in.readVarInt() + 1;
							branchLen += (cases + 1) * 4;
							sipushAndSwitchLen += 4;
						}
						if (opcode == 171) {
							@Pc(1118) int cases = this.in.readVarInt();
							branchLen += (cases + 1) * 4;
							sipushAndSwitchLen += cases * 4;
						}
						if (opcode == 185) {
							interfaceMethodRefLen += 2;
						}
						if (opcode == 188) {
							newArrayLen++;
						}
						if (opcode == 196) {
							@Pc(1147) int wideOpcode = this.in.readUnsignedByte();
							@Pc(1152) int wideFlags = this.OPCODE_FLAGS[wideOpcode];
							if ((wideFlags & 0x400) == 0) {
								throw new RuntimeException("invalid opcode " + wideOpcode + " as operand to wide");
							}
							wideLocalVariableLen += 2;
							if (wideOpcode == 132) {
								wideIincLen += 2;
							}
						}
					}
				}
			}
		}
		@Pc(1198) int codeLen = this.in.position - codePosition;
		this.in.position = codePosition;
		this.newArrayBuffer.bytes = this.in.bytes;
		this.newArrayBuffer.position = this.in.position + codeLen;
		this.localVariableBuffer.bytes = this.in.bytes;
		this.localVariableBuffer.position = this.newArrayBuffer.position + newArrayLen;
		this.wideLocalVariableBuffer.bytes = this.in.bytes;
		this.wideLocalVariableBuffer.position = this.localVariableBuffer.position + localVariableLen;
		this.sipushAndSwitchBuffer.bytes = this.in.bytes;
		this.sipushAndSwitchBuffer.position = this.wideLocalVariableBuffer.position + wideLocalVariableLen;
		this.constantBuffer.bytes = this.in.bytes;
		this.constantBuffer.position = this.sipushAndSwitchBuffer.position + sipushAndSwitchLen;
		this.wideConstantBuffer.bytes = this.in.bytes;
		this.wideConstantBuffer.position = this.constantBuffer.position + constantLen;
		this.classBuffer.bytes = this.in.bytes;
		this.classBuffer.position = this.wideConstantBuffer.position + wideConstantLen;
		this.fieldRefBuffer.bytes = this.in.bytes;
		this.fieldRefBuffer.position = this.classBuffer.position + classLen;
		this.methodRefBuffer.bytes = this.in.bytes;
		this.methodRefBuffer.position = this.fieldRefBuffer.position + fieldRefLen;
		this.interfaceMethodRefBuffer.bytes = this.in.bytes;
		this.interfaceMethodRefBuffer.position = this.methodRefBuffer.position + methodRefLen;
		this.branchBuffer.bytes = this.in.bytes;
		this.branchBuffer.position = this.interfaceMethodRefBuffer.position + interfaceMethodRefLen;
		this.bipushBuffer.bytes = this.in.bytes;
		this.bipushBuffer.position = this.branchBuffer.position + branchLen;
		this.wideIincBuffer.bytes = this.in.bytes;
		this.wideIincBuffer.position = this.bipushBuffer.position + bipushLen;
		this.iincBuffer.bytes = this.in.bytes;
		this.iincBuffer.position = this.wideIincBuffer.position + wideIincLen;
		this.multiANewArrayBuffer.bytes = this.in.bytes;
		this.multiANewArrayBuffer.position = this.iincBuffer.position + multiANewArrayLen;
		@Pc(1414) int maxOpcodes = 0;
		@Pc(1416) int maxBranches = 0;
		@Pc(1418) int maxWideBranches = 0;
		for (@Pc(1420) int i = 0; i < methods.length; i++) {
			for (@Pc(1423) int j = 0; j < methods[i].attributes.length; j++) {
				@Pc(1431) Attribute attribute = methods[i].attributes[j];
				if (attribute.name == this.code) {
					@Pc(1440) int opcodes = attribute.code.length;
					@Pc(1442) int len = 0;
					@Pc(1444) int branches = 0;
					@Pc(1446) int wideBranches = 0;
					for (@Pc(1448) int k = 0; k < opcodes; k++) {
						@Pc(1453) int opcode = this.in.readUnsignedByte();
						@Pc(1458) int flags = this.OPCODE_FLAGS[opcode];
						len++;
						if ((flags & 0x1) != 0) {
							throw new RuntimeException("invalid opcode " + opcode);
						}
						if ((flags & 0x2) != 0) {
							len++;
						}
						if ((flags & 0x4) != 0) {
							@Pc(1493) ConstantPoolEntry entry;
							if (opcode == 18) {
								entry = this.readAndAddEntry(this.constantBuffer, this.intEntries);
							} else if (opcode == 19) {
								entry = this.readAndAddEntry(this.constantBuffer, this.floatEntries);
							} else if (opcode == 186) {
								entry = this.readNamedEntry(this.constantBuffer, this.stringEntries, 8);
							} else if (opcode == 203) {
								entry = this.readNamedEntry(this.constantBuffer, this.classEntries, 7);
							} else {
								throw new RuntimeException("opcode " + opcode + " marked as conref");
							}
							if (entry.index >= 256) {
								len += 2;
							} else {
								len++;
							}
						}
						if ((flags & 0x10) != 0) {
							if (opcode == 20) {
								this.readAndAddEntry(this.wideConstantBuffer, this.longEntries);
							} else if (opcode == 202) {
								this.readAndAddEntry(this.wideConstantBuffer, this.doubleEntries);
							} else {
								throw new RuntimeException("opcode " + opcode + " marked as conref2");
							}
							len += 2;
						}
						if ((flags & 0x20) != 0) {
							this.readNamedEntry(this.classBuffer, this.classEntries, 7);
							len += 2;
						}
						if ((flags & 0x40) != 0) {
							this.readAndAddEntry(this.fieldRefBuffer, this.fieldRefEntries);
							len += 2;
						}
						if ((flags & 0x80) != 0) {
							this.readAndAddEntry(this.methodRefBuffer, this.methodRefEntries);
							len += 2;
						}
						if ((flags & 0x100) != 0) {
							branches++;
							len += 2;
						}
						if ((flags & 0x200) != 0) {
							wideBranches++;
							len += 4;
						}
						if (opcode == 16) {
							len++;
						}
						if (opcode == 17) {
							len += 2;
						}
						if (opcode == 132) {
							len++;
						}
						if (opcode == 170) {
							@Pc(1659) int len2 = len + 3 & 0xFFFFFFFC;
							@Pc(1665) int cases = this.in.readVarInt() + 1;
							len2 += 8;
							wideBranches += cases + 1;
							len = len2 + (cases + 1) * 4;
						}
						if (opcode == 171) {
							@Pc(1689) int len2 = len + 3 & 0xFFFFFFFC;
							@Pc(1693) int cases = this.in.readVarInt();
							len2 += 4;
							wideBranches += cases + 1;
							len2 += (cases + 1) * 4;
							len = len2 + cases * 4;
						}
						if (opcode == 185) {
							this.readAndAddEntry(this.interfaceMethodRefBuffer, this.interfaceMethodRefEntries);
							len += 4;
						}
						if (opcode == 188) {
							len++;
						}
						if (opcode == 197) {
							len++;
						}
						if (opcode == 196) {
							@Pc(1740) int wideOpcode = this.in.readUnsignedByte();
							@Pc(1741) int len2 = len + 1;
							@Pc(1746) int wideFlags = this.OPCODE_FLAGS[wideOpcode];
							if ((wideFlags & 0x400) == 0) {
								throw new RuntimeException("invalid opcode " + wideOpcode + " as operand to wide");
							}
							len = len2 + 2;
							if (wideOpcode == 132) {
								len += 2;
							}
						}
					}
					this.in.position++;
					attribute.code.length = len;
					if (opcodes > maxOpcodes) {
						maxOpcodes = opcodes;
					}
					if (branches > maxBranches) {
						maxBranches = branches;
					}
					if (wideBranches > maxWideBranches) {
						maxWideBranches = wideBranches;
					}
				}
			}
		}
		this.in.position = codePosition;
		@Pc(1817) Buffer buffer = this.constantBuffer;
		buffer.position -= constantLen;
		buffer = this.wideConstantBuffer;
		buffer.position -= wideConstantLen;
		buffer = this.classBuffer;
		buffer.position -= classLen;
		buffer = this.fieldRefBuffer;
		buffer.position -= fieldRefLen;
		buffer = this.methodRefBuffer;
		buffer.position -= methodRefLen;
		buffer = this.interfaceMethodRefBuffer;
		buffer.position -= interfaceMethodRefLen;
		@Pc(1859) int outLen = 24;
		if (sourceFile != null) {
			outLen += 8;
		}
		for (@Pc(1867) ConstantPoolEntry entry = (ConstantPoolEntry) this.constantPool.head(); entry != null; entry = (ConstantPoolEntry) this.constantPool.next()) {
			outLen += this.CONSTANT_POOL_ENTRY_LENGTHS[entry.tag];
			if (entry.bytesValue != null) {
				outLen += entry.bytesValue.length;
			}
		}
		@Pc(1899) int outLen2 = outLen + interfaces.length * 2;
		outLen2 += this.getMembersLength(fields);
		outLen2 += this.getMembersLength(methods);
		@Pc(1916) Buffer out = new Buffer(outLen2);
		out.writeInt(0xCAFEBABE);
		out.writeShort(minorVersion);
		out.writeShort(majorVersion);
		out.writeShort(this.constantPoolSize);
		this.constantPoolSize = 1;
		for (@Pc(1937) ConstantPoolEntry entry = (ConstantPoolEntry) this.constantPool.head(); entry != null; entry = (ConstantPoolEntry) this.constantPool.next()) {
			entry.unlink();
			out.writeByte(entry.tag);
			if (entry.name != null) {
				out.writeShort(entry.name.index);
			}
			if (entry.descriptor != null) {
				out.writeShort(entry.descriptor.index);
			}
			if (entry.tag == 3 || entry.tag == 4) {
				out.writeInt((int) entry.longValue);
			}
			if (entry.tag == 5 || entry.tag == 6) {
				out.writeLong(entry.longValue);
			}
			if (entry.bytesValue != null) {
				out.writeShort(entry.bytesValue.length);
				out.writeBytes(entry.bytesValue, entry.bytesValue.length);
			}
		}
		out.writeShort(accessFlags);
		out.writeShort(thisClass.index);
		out.writeShort(superClass.index);
		out.writeShort(interfaces.length);
		for (@Pc(2025) int i = 0; i < interfaces.length; i++) {
			out.writeShort(interfaces[i].index);
		}
		out.writeShort(fields.length);
		for (@Pc(2043) int i = 0; i < fields.length; i++) {
			out.writeShort(fields[i].accessFlags);
			out.writeShort(fields[i].nameAndType.name.index);
			out.writeShort(fields[i].nameAndType.descriptor.index);
			out.writeShort(fields[i].attributes.length);
			for (@Pc(2075) int j = 0; j < fields[i].attributes.length; j++) {
				@Pc(2083) Attribute attribute = fields[i].attributes[j];
				out.writeShort(attribute.name.index);
				if (attribute.name == this.constantValue) {
					out.writeInt(2);
					out.writeShort(attribute.constantValue.index);
				} else {
					out.writeInt(0);
				}
			}
		}
		out.writeShort(methods.length);
		@Pc(2127) int[] pcPosition = new int[maxOpcodes + 1];
		@Pc(2130) int[] branchSources = new int[maxBranches];
		@Pc(2133) int[] branchTargets = new int[maxBranches];
		@Pc(2136) int[] wideBranchPositions = new int[maxWideBranches];
		@Pc(2139) int[] wideBranchSources = new int[maxWideBranches];
		@Pc(2142) int[] wideBranchTargets = new int[maxWideBranches];
		for (@Pc(2144) int i = 0; i < methods.length; i++) {
			out.writeShort(methods[i].accessFlags);
			out.writeShort(methods[i].nameAndType.name.index);
			out.writeShort(methods[i].nameAndType.descriptor.index);
			out.writeShort(methods[i].attributes.length);
			for (@Pc(2176) int j = 0; j < methods[i].attributes.length; j++) {
				@Pc(2184) Attribute attribute = methods[i].attributes[j];
				out.writeShort(attribute.name.index);
				if (attribute.name == this.code) {
					@Pc(2207) int len = attribute.code.length + attribute.code.exceptionTable.length * 8 + 12;
					if (attribute.code.lineNumberTable != null) {
						len += attribute.code.lineNumberTable.length * 4 + 8;
					}
					out.writeInt(len);
					out.writeShort(attribute.code.maxStack);
					out.writeShort(attribute.code.maxLocals);
					out.writeInt(attribute.code.length);
					@Pc(2243) int position = out.position;
					@Pc(2245) int branches = 0;
					@Pc(2247) int wideBranches = 0;
					@Pc(2249) int pc = 0;
					while (true) {
						@Pc(2253) int opcode = this.in.readUnsignedByte();
						if (opcode == 204) {
							pcPosition[pc] = out.position;
							for (@Pc(2812) int k = 0; k < branches; k++) {
								out.position = pcPosition[branchSources[k]] + 1;
								out.writeShort(pcPosition[branchSources[k] + branchTargets[k]] - pcPosition[branchSources[k]]);
							}
							for (@Pc(2845) int k = 0; k < wideBranches; k++) {
								out.position = wideBranchPositions[k];
								out.writeInt(pcPosition[wideBranchSources[k] + wideBranchTargets[k]] - pcPosition[wideBranchSources[k]]);
							}
							out.position = pcPosition[pc];
							out.writeShort(attribute.code.exceptionTable.length);
							for (@Pc(2885) int k = 0; k < attribute.code.exceptionTable.length; k++) {
								out.writeShort(pcPosition[attribute.code.exceptionTable[k].startPc] - position);
								@Pc(2907) int handlerPc = pc - attribute.code.exceptionTable[k].reverseHandlerPc;
								out.writeShort(pcPosition[handlerPc - attribute.code.exceptionTable[k].endPcToHandlerPc] - position);
								out.writeShort(pcPosition[handlerPc] - position);
								@Pc(2935) ConstantPoolEntry entry = attribute.code.exceptionTable[k].catchType;
								out.writeShort(entry == null ? 0 : entry.index);
							}
							if (attribute.code.lineNumberTable == null) {
								out.writeShort(0);
							} else {
								out.writeShort(1);
								out.writeShort(this.lineNumberTable.index);
								out.writeInt(attribute.code.lineNumberTable.length * 4 + 2);
								out.writeShort(attribute.code.lineNumberTable.length);
								for (@Pc(2980) int k = 0; k < attribute.code.lineNumberTable.length; k++) {
									out.writeShort(pcPosition[attribute.code.lineNumberTable[k].startPc] - position);
									out.writeShort(attribute.code.lineNumberTable[k].lineNumber);
								}
							}
							break;
						}
						@Pc(2261) int flags = this.OPCODE_FLAGS[opcode];
						pcPosition[pc] = out.position;
						out.writeByte(opcode);
						if ((flags & 0x1) != 0) {
							throw new RuntimeException("invalid opcode " + opcode);
						}
						if ((flags & 0x2) != 0) {
							out.writeByte(this.localVariableBuffer.readUnsignedByte());
						}
						if ((flags & 0x4) != 0) {
							@Pc(2306) ConstantPoolEntry entry;
							if (opcode == 18) {
								entry = readEntry2(this.constantBuffer, this.intEntries);
							} else if (opcode == 19) {
								entry = readEntry2(this.constantBuffer, this.floatEntries);
							} else if (opcode == 186) {
								entry = readEntry3(this.constantBuffer, this.stringEntries);
							} else if (opcode == 203) {
								entry = readEntry3(this.constantBuffer, this.classEntries);
							} else {
								throw new RuntimeException("opcode " + opcode + " marked as conref");
							}
							@Pc(2353) int index = entry.index;
							if (index >= 256) {
								out.bytes[out.position - 1] = 19;
								out.writeShort(index);
							} else {
								out.bytes[out.position - 1] = 18;
								out.writeByte(index);
							}
						}
						if ((flags & 0x10) != 0) {
							@Pc(2392) ConstantPoolEntry entry;
							if (opcode == 20) {
								entry = readEntry2(this.wideConstantBuffer, this.longEntries);
							} else if (opcode == 202) {
								entry = readEntry2(this.wideConstantBuffer, this.doubleEntries);
							} else {
								throw new RuntimeException("opcode " + opcode + " marked as conref2");
							}
							out.bytes[out.position - 1] = 20;
							out.writeShort(entry.index);
						}
						if ((flags & 0x20) != 0) {
							out.writeShort(readEntry3(this.classBuffer, this.classEntries).index);
						}
						if ((flags & 0x40) != 0) {
							out.writeShort(readEntry2(this.fieldRefBuffer, this.fieldRefEntries).index);
						}
						if ((flags & 0x80) != 0) {
							out.writeShort(readEntry2(this.methodRefBuffer, this.methodRefEntries).index);
						}
						if ((flags & 0x100) != 0) {
							@Pc(2472) int target = this.branchBuffer.readShort();
							out.position += 2;
							branchSources[branches] = pc;
							branchTargets[branches] = target;
							branches++;
						}
						if ((flags & 0x200) != 0) {
							@Pc(2495) int target = this.branchBuffer.readInt();
							wideBranchPositions[wideBranches] = out.position;
							out.position += 4;
							wideBranchSources[wideBranches] = pc;
							wideBranchTargets[wideBranches] = target;
							wideBranches++;
						}
						if (opcode == 16) {
							out.writeByte(this.bipushBuffer.readUnsignedByte());
						}
						if (opcode == 17) {
							out.writeShort(this.sipushAndSwitchBuffer.readUnsignedShort());
						}
						if (opcode == 132) {
							out.writeByte(this.iincBuffer.readUnsignedByte());
						}
						if (opcode == 170) {
							while ((out.position - position & 0x3) != 0) {
								out.writeByte(0);
							}
							@Pc(2557) int defaultTarget = this.branchBuffer.readInt();
							wideBranchPositions[wideBranches] = out.position;
							out.position += 4;
							wideBranchSources[wideBranches] = pc;
							wideBranchTargets[wideBranches] = defaultTarget;
							wideBranches++;
							@Pc(2581) int low = this.sipushAndSwitchBuffer.readInt();
							@Pc(2587) int high = low + this.in.readVarInt();
							out.writeInt(low);
							out.writeInt(high);
							for (@Pc(2595) int k = low; k != high + 1; k++) {
								@Pc(2600) int target = this.branchBuffer.readInt();
								wideBranchPositions[wideBranches] = out.position;
								out.position += 4;
								wideBranchSources[wideBranches] = pc;
								wideBranchTargets[wideBranches] = target;
								wideBranches++;
							}
						}
						if (opcode == 171) {
							while ((out.position - position & 0x3) != 0) {
								out.writeByte(0);
							}
							@Pc(2644) int defaultTarget = this.branchBuffer.readInt();
							wideBranchPositions[wideBranches] = out.position;
							out.position += 4;
							wideBranchSources[wideBranches] = pc;
							wideBranchTargets[wideBranches] = defaultTarget;
							wideBranches++;
							@Pc(2668) int cases = this.in.readVarInt();
							out.writeInt(cases);
							@Pc(2673) int key = 0;
							for (@Pc(2675) int k = 0; k < cases; k++) {
								key += this.sipushAndSwitchBuffer.readInt();
								out.writeInt(key);
								@Pc(2689) int target = this.branchBuffer.readInt();
								wideBranchPositions[wideBranches] = out.position;
								out.position += 4;
								wideBranchSources[wideBranches] = pc;
								wideBranchTargets[wideBranches] = target;
								wideBranches++;
							}
						}
						if (opcode == 185) {
							@Pc(2722) ConstantPoolEntry entry = readEntry2(this.interfaceMethodRefBuffer, this.interfaceMethodRefEntries);
							out.writeShort(entry.index);
							@Pc(2729) ConstantPoolEntry nameAndType = entry.descriptor;
							@Pc(2732) ConstantPoolEntry descriptor = nameAndType.descriptor;
							@Pc(2735) byte[] descriptorBytes = descriptor.bytesValue;
							out.writeByte(getMethodDescriptorSize(descriptorBytes));
							out.writeByte(0);
						}
						if (opcode == 188) {
							out.writeByte(this.newArrayBuffer.readUnsignedByte());
						}
						if (opcode == 197) {
							out.writeByte(this.multiANewArrayBuffer.readUnsignedByte());
						}
						if (opcode == 196) {
							@Pc(2765) int wideOpcode = this.in.readUnsignedByte();
							out.writeByte(wideOpcode);
							@Pc(2773) int wideFlags = this.OPCODE_FLAGS[wideOpcode];
							if ((wideFlags & 0x400) == 0) {
								throw new RuntimeException("invalid opcode " + wideOpcode + " as operand to wide");
							}
							out.writeShort(this.wideLocalVariableBuffer.readUnsignedShort());
							if (wideOpcode == 132) {
								out.writeShort(this.wideIincBuffer.readUnsignedShort());
							}
						}
						pc++;
					}
				} else if (attribute.name == this.exceptions) {
					out.writeInt(attribute.exceptions.length * 2 + 2);
					out.writeShort(attribute.exceptions.length);
					for (@Pc(3034) int k = 0; k < attribute.exceptions.length; k++) {
						out.writeShort(attribute.exceptions[k].index);
					}
				} else {
					out.writeInt(0);
				}
			}
		}
		if (sourceFile == null) {
			out.writeShort(0);
		} else {
			out.writeShort(1);
			out.writeShort(this.sourceFile.index);
			out.writeInt(2);
			out.writeShort(sourceFile.index);
		}
		super.cache.put((new String(thisClass.name.bytesValue)).replace('/', '.'), out.bytes);
	}
}
