import java.io.InputStream;

import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!ia", name = "read", descriptor = "()I")
	@Override
	public final int read() {
		ThreadUtils.sleep(30000L);
		return -1;
	}
}
