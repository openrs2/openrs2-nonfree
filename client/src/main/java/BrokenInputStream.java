import java.io.InputStream;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public final class BrokenInputStream extends InputStream {

	@OriginalMember(owner = "client!ia", name = "read", descriptor = "()I")
	@Override
	public final int read() {
		ThreadUtils.sleep(30000L);
		return -1;
	}
}
