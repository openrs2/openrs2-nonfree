import java.io.IOException;
import java.io.OutputStream;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public final class OutputStream_Sub1 extends OutputStream {

	@OriginalMember(owner = "client!ok", name = "write", descriptor = "(I)V")
	@Override
	public final void write(@OriginalArg(0) int arg0) throws IOException {
		throw new IOException();
	}
}
