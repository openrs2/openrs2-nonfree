import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class ClientScript extends SecondaryNode {

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B[B)Lclient!jl;")
	public static ClientScript decode(@OriginalArg(1) byte[] bytes) {
		@Pc(9) ClientScript script = new ClientScript();
		@Pc(14) Buffer buffer = new Buffer(bytes);
		buffer.position = buffer.bytes.length - 2;
		@Pc(25) int trailerLen = buffer.readUnsignedShort();
		@Pc(35) int trailerPos = buffer.bytes.length - trailerLen - 12 - 2;
		buffer.position = trailerPos;
		@Pc(42) int instructions = buffer.readInt();
		script.intLocals = buffer.readUnsignedShort();
		script.stringLocals = buffer.readUnsignedShort();
		script.intArgs = buffer.readUnsignedShort();
		script.stringArgs = buffer.readUnsignedShort();
		@Pc(66) int switches = buffer.readUnsignedByte();
		if (switches > 0) {
			script.switchTables = new HashTable[switches];
			for (@Pc(77) int i = 0; i < switches; i++) {
				@Pc(84) int cases = buffer.readUnsignedShort();
				@Pc(91) HashTable table = new HashTable(IntUtils.clp2(cases));
				script.switchTables[i] = table;
				while (cases-- > 0) {
					@Pc(103) int value = buffer.readInt();
					@Pc(107) int offset = buffer.readInt();
					table.put(value, new IntNode(offset));
				}
			}
		}
		@Pc(129) int i = 0;
		buffer.position = 0;
		script.name = buffer.readStringFast();
		script.stringOperands = new String[instructions];
		script.opcodes = new int[instructions];
		script.intOperands = new int[instructions];
		while (buffer.position < trailerPos) {
			@Pc(161) int opcode = buffer.readUnsignedShort();
			if (opcode == 3) {
				script.stringOperands[i] = buffer.readString().intern();
			} else if (opcode >= 100 || opcode == 21 || opcode == 38 || opcode == 39) {
				script.intOperands[i] = buffer.readUnsignedByte();
			} else {
				script.intOperands[i] = buffer.readInt();
			}
			script.opcodes[i++] = opcode;
		}
		return script;
	}

	@OriginalMember(owner = "client!jl", name = "y", descriptor = "I")
	public int trigger;

	@OriginalMember(owner = "client!jl", name = "z", descriptor = "I")
	public int stringArgs;

	@OriginalMember(owner = "client!jl", name = "A", descriptor = "[I")
	public int[] intOperands;

	@OriginalMember(owner = "client!jl", name = "C", descriptor = "[I")
	public int[] opcodes;

	@OriginalMember(owner = "client!jl", name = "D", descriptor = "[Ljava/lang/String;")
	public String[] stringOperands;

	@OriginalMember(owner = "client!jl", name = "E", descriptor = "[Lclient!ic;")
	public HashTable[] switchTables;

	@OriginalMember(owner = "client!jl", name = "G", descriptor = "I")
	public int intArgs;

	@OriginalMember(owner = "client!jl", name = "I", descriptor = "Ljava/lang/String;")
	public String name;

	@OriginalMember(owner = "client!jl", name = "J", descriptor = "I")
	public int stringLocals;

	@OriginalMember(owner = "client!jl", name = "L", descriptor = "I")
	public int intLocals;
}
