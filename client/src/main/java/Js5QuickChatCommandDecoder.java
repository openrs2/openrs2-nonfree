import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Js5QuickChatCommandDecoder implements QuickChatCommandDecoder {

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(J[IBI)Ljava/lang/String;")
	@Override
	public final String decode(@OriginalArg(3) int command, @OriginalArg(1) int[] params, @OriginalArg(0) long value) {
		if (command == 0) {
			@Pc(18) EnumType type = EnumTypeList.get(params[0]);
			return type.getString((int) value);
		} else if (command == 1 || command == 10) {
			@Pc(38) ObjType type = ObjTypeList.get((int) value);
			return type.name;
		} else if (command == 6 || command == 7 || command == 11) {
			return EnumTypeList.get(params[0]).getString((int) value);
		} else {
			return null;
		}
	}
}
