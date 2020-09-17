import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public interface QuickChatCommandDecoder {

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(J[IBI)Ljava/lang/String;")
	String decode(@OriginalArg(3) int command, @OriginalArg(1) int[] params, @OriginalArg(0) long value);
}
