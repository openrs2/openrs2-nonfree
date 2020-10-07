import java.applet.Applet;

import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public final class BrowserControl {

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;")
	public static Object call(@OriginalArg(0) Applet applet, @OriginalArg(2) String methodName) throws Throwable {
		return JSObject.getWindow(applet).call(methodName, (Object[]) null);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([Ljava/lang/Object;ILjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;")
	public static Object call(@OriginalArg(2) Applet applet, @OriginalArg(3) String methodName, @OriginalArg(0) Object[] args) throws Throwable {
		return JSObject.getWindow(applet).call(methodName, args);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)V")
	public static void eval(@OriginalArg(2) Applet applet, @OriginalArg(1) String s) throws Throwable {
		JSObject.getWindow(applet).eval(s);
	}
}
