import java.applet.Applet;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("loader!g")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "I")
	public static int anInt6099;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!g", name = "c", descriptor = "Ljava/lang/String;")
	private String aString372;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String method4831(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(16) RuntimeException_Sub2 local16 = (RuntimeException_Sub2) arg0;
			arg0 = local16.aThrowable2;
			local6 = local16.aString372 + " | ";
		} else {
			local6 = "";
		}
		@Pc(33) StringWriter local33 = new StringWriter();
		@Pc(38) PrintWriter local38 = new PrintWriter(local33);
		arg0.printStackTrace(local38);
		local38.close();
		@Pc(46) String local46 = local33.toString();
		@Pc(54) BufferedReader local54 = new BufferedReader(new StringReader(local46));
		@Pc(57) String local57 = local54.readLine();
		while (true) {
			@Pc(60) String local60 = local54.readLine();
			if (local60 == null) {
				return local6 + "| " + local57;
			}
			@Pc(67) int local67 = local60.indexOf(40);
			@Pc(74) int local74 = local60.indexOf(41, local67 + 1);
			@Pc(80) String local80;
			if (local67 == -1) {
				local80 = local60;
			} else {
				local80 = local60.substring(0, local67);
			}
			@Pc(90) String local90 = local80.trim();
			local90 = local90.substring(local90.lastIndexOf(32) + 1);
			local90 = local90.substring(local90.lastIndexOf(9) + 1);
			@Pc(115) String local115 = local6 + local90;
			if (local67 != -1 && local74 != -1) {
				@Pc(129) int local129 = local60.indexOf(".java:", local67);
				if (local129 >= 0) {
					local115 = local115 + local60.substring(local129 + 5, local74);
				}
			}
			local6 = local115 + ' ';
		}
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method4832(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg0.indexOf(arg2); local5 != -1; local5 = arg0.indexOf(arg2, local5 + arg1.length())) {
			arg0 = arg0.substring(0, local5) + arg1 + arg0.substring(local5 + arg2.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method4833(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method4832(arg0, "\n", "%0a"));
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/Throwable;ZLjava/applet/Applet;Ljava/lang/String;)V")
	public static void method4834(@OriginalArg(0) Throwable arg0, @OriginalArg(2) Applet arg1, @OriginalArg(3) String arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg0 != null) {
				local1 = method4831(arg0);
			}
			if (arg2 != null) {
				if (arg0 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg2;
			}
			method4833(local1);
			@Pc(42) String local42 = method4832(local1, "%3a", ":");
			local42 = method4832(local42, "%40", "@");
			local42 = method4832(local42, "%26", "&");
			local42 = method4832(local42, "%23", "#");
			@Pc(90) URL local90 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt6099 + "&v1=" + Class196.aString377 + "&v2=" + Class196.aString378 + "&e=" + local42);
			@Pc(96) DataInputStream local96 = new DataInputStream(local90.openStream());
			local96.read();
			local96.close();
		} catch (@Pc(103) Exception local103) {
		}
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!g;")
	private static RuntimeException_Sub2 method4835(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub2 local5;
		if (arg0 instanceof RuntimeException_Sub2) {
			local5 = (RuntimeException_Sub2) arg0;
			local5.aString372 = local5.aString372 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString372 = arg1;
	}
}
