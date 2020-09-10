import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class ParamType extends SecondaryNode {

	@OriginalMember(owner = "client!jc", name = "B", descriptor = "Ljava/lang/String;")
	public String defaultString;

	@OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
	public int defaultInt;

	@OriginalMember(owner = "client!jc", name = "M", descriptor = "C")
	private char type;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!fd;I)V")
	public final void decode(@OriginalArg(0) Buffer buffer) {
		while (true) {
			@Pc(9) int code = buffer.readUnsignedByte();
			if (code == 0) {
				return;
			}
			this.decode(buffer, code);
		}
	}

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "(I)Z")
	public final boolean isString() {
		return this.type == 's';
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!fd;IZ)V")
	private void decode(@OriginalArg(0) Buffer buffer, @OriginalArg(1) int code) {
		if (code == 1) {
			this.type = Cp1252Charset.decodeChar(buffer.readByte());
		} else if (code == 2) {
			this.defaultInt = buffer.readInt();
		} else if (code == 5) {
			this.defaultString = buffer.readString();
		}
	}
}
