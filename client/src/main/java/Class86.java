import java.applet.Applet;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import netscape.javascript.JSObject;

@OriginalClass("client!ie")
public final class Class86 {

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;")
	public static Object method1851(@OriginalArg(0) Applet arg0, @OriginalArg(2) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([Ljava/lang/Object;ILjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;")
	public static Object method1852(@OriginalArg(0) Object[] arg0, @OriginalArg(2) Applet arg1, @OriginalArg(3) String arg2) throws Throwable {
		return JSObject.getWindow(arg1).call(arg2, arg0);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)V")
	public static void method1853(@OriginalArg(1) String arg0, @OriginalArg(2) Applet arg1) throws Throwable {
		JSObject.getWindow(arg1).eval(arg0);
	}
}
