import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class QuickChatPhraseType extends SecondaryNode {

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "[I")
	private static final int[] DYNAMIC_COMMAND_PARAM_LENGTHS = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "[I")
	private static final int[] DYNAMIC_COMMAND_DECODE_BYTES = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "[I")
	public static final int[] DYNAMIC_COMMAND_ENCODE_BYTES = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!ij", name = "z", descriptor = "[I")
	private int[] dynamicCommands;

	@OriginalMember(owner = "client!ij", name = "A", descriptor = "[[I")
	private int[][] dynamicCommandParams;

	@OriginalMember(owner = "client!ij", name = "O", descriptor = "[I")
	public int[] automaticResponses;

	@OriginalMember(owner = "client!ij", name = "S", descriptor = "[Ljava/lang/String;")
	private String[] text;

	@OriginalMember(owner = "client!ij", name = "H", descriptor = "Z")
	public boolean searchable = true;

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)I")
	public final int getDynamicCommandCount() {
		return this.dynamicCommands == null ? 0 : this.dynamicCommands.length;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)I")
	public final int getDynamicCommandParam(@OriginalArg(2) int i, @OriginalArg(0) int j) {
		if (this.dynamicCommands == null || i < 0 || i > this.dynamicCommands.length) {
			return -1;
		} else if (this.dynamicCommandParams[i] == null || j < 0 || j > this.dynamicCommandParams[i].length) {
			return -1;
		} else {
			return this.dynamicCommandParams[i][j];
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)I")
	public final int getDynamicCommand(@OriginalArg(0) int i) {
		return this.dynamicCommands == null || i < 0 || i > this.dynamicCommands.length ? -1 : this.dynamicCommands[i];
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZLclient!fd;)V")
	private void decode(@OriginalArg(2) Buffer buffer, @OriginalArg(0) int code) {
		if (code == 1) {
			this.text = StringUtils.split(buffer.readString(), '<');
		} else if (code == 2) {
			@Pc(103) int len = buffer.readUnsignedByte();
			this.automaticResponses = new int[len];
			for (@Pc(109) int i = 0; i < len; i++) {
				this.automaticResponses[i] = buffer.readUnsignedShort();
			}
		} else if (code == 3) {
			@Pc(27) int len = buffer.readUnsignedByte();
			this.dynamicCommandParams = new int[len][];
			this.dynamicCommands = new int[len];
			for (@Pc(37) int i = 0; i < len; i++) {
				@Pc(48) int command = buffer.readUnsignedShort();
				this.dynamicCommands[i] = command;
				this.dynamicCommandParams[i] = new int[DYNAMIC_COMMAND_PARAM_LENGTHS[command]];
				for (@Pc(63) int j = 0; j < DYNAMIC_COMMAND_PARAM_LENGTHS[command]; j++) {
					this.dynamicCommandParams[i][j] = buffer.readUnsignedShort();
				}
			}
		} else if (code == 4) {
			this.searchable = false;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!fd;I)V")
	public final void decode(@OriginalArg(0) Buffer buffer) {
		while (true) {
			@Pc(14) int code = buffer.readUnsignedByte();
			if (code == 0) {
				return;
			}
			this.decode(buffer, code);
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILclient!fd;)Ljava/lang/String;")
	public final String decodeMessage(@OriginalArg(1) Buffer buffer) {
		@Pc(16) StringBuffer s = new StringBuffer(80);
		if (this.dynamicCommands != null) {
			for (@Pc(21) int i = 0; i < this.dynamicCommands.length; i++) {
				s.append(this.text[i]);
				s.append(QuickChatPhraseTypeList.decodeCommand(this.dynamicCommands[i], this.dynamicCommandParams[i], buffer.readVarLong(DYNAMIC_COMMAND_DECODE_BYTES[this.dynamicCommands[i]])));
			}
		}
		s.append(this.text[this.text.length - 1]);
		return s.toString();
	}

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)V")
	public final void method1910() {
		if (this.automaticResponses != null) {
			for (@Pc(20) int i = 0; i < this.automaticResponses.length; i++) {
				this.automaticResponses[i] |= 32768;
			}
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "([IBLclient!fd;)V")
	public final void encodeMessage(@OriginalArg(2) Buffer buffer, @OriginalArg(0) int[] values) {
		if (this.dynamicCommands == null) {
			return;
		}
		for (@Pc(13) int i = 0; i < this.dynamicCommands.length && i < values.length; i++) {
			@Pc(29) int bytes = DYNAMIC_COMMAND_ENCODE_BYTES[this.getDynamicCommand(i)];
			if (bytes > 0) {
				buffer.writeVarLong(values[i], bytes);
			}
		}
	}

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)Ljava/lang/String;")
	public final String getText() {
		@Pc(6) StringBuffer s = new StringBuffer(80);
		if (this.text == null) {
			return "";
		}
		s.append(this.text[0]);
		for (@Pc(31) int i = 1; i < this.text.length; i++) {
			s.append("...");
			s.append(this.text[i]);
		}
		return s.toString();
	}
}
