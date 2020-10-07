import java.applet.Applet;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!g")
public final class TracingException extends RuntimeException {

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "I")
	public static int clientCrc;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "Ljava/lang/Throwable;")
	private final Throwable cause;

	@OriginalMember(owner = "loader!g", name = "c", descriptor = "Ljava/lang/String;")
	private String message;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String toString(@OriginalArg(0) Throwable ex) throws IOException {
		@Pc(6) String message;
		if (ex instanceof TracingException) {
			@Pc(16) TracingException tracingException = (TracingException) ex;
			ex = tracingException.cause;
			message = tracingException.message + " | ";
		} else {
			message = "";
		}
		@Pc(33) StringWriter stringWriter = new StringWriter();
		@Pc(38) PrintWriter printWriter = new PrintWriter(stringWriter);
		ex.printStackTrace(printWriter);
		printWriter.close();
		@Pc(46) String stackTrace = stringWriter.toString();
		@Pc(54) BufferedReader reader = new BufferedReader(new StringReader(stackTrace));
		@Pc(57) String firstLine = reader.readLine();
		while (true) {
			@Pc(60) String line = reader.readLine();
			if (line == null) {
				return message + "| " + firstLine;
			}
			@Pc(67) int openingBracketIndex = line.indexOf('(');
			@Pc(74) int closingBracketIndex = line.indexOf(')', openingBracketIndex + 1);
			@Pc(80) String classAndMethodName;
			if (openingBracketIndex == -1) {
				classAndMethodName = line;
			} else {
				classAndMethodName = line.substring(0, openingBracketIndex);
			}
			@Pc(90) String trimmedClassAndMethodName = classAndMethodName.trim();
			trimmedClassAndMethodName = trimmedClassAndMethodName.substring(trimmedClassAndMethodName.lastIndexOf(' ') + 1);
			trimmedClassAndMethodName = trimmedClassAndMethodName.substring(trimmedClassAndMethodName.lastIndexOf('\t') + 1);
			@Pc(115) String formattedLine = message + trimmedClassAndMethodName;
			if (openingBracketIndex != -1 && closingBracketIndex != -1) {
				@Pc(129) int javaSuffixIndex = line.indexOf(".java:", openingBracketIndex);
				if (javaSuffixIndex >= 0) {
					formattedLine = formattedLine + line.substring(javaSuffixIndex + 5, closingBracketIndex);
				}
			}
			message = formattedLine + ' ';
		}
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String replace(@OriginalArg(0) String s, @OriginalArg(3) String target, @OriginalArg(2) String replacement) {
		for (@Pc(5) int i = s.indexOf(target); i != -1; i = s.indexOf(target, i + replacement.length())) {
			s = s.substring(0, i) + replacement + s.substring(i + target.length());
		}
		return s;
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void print(@OriginalArg(0) String message) {
		System.out.println("Error: " + replace(message, "%0a", "\n"));
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/Throwable;ZLjava/applet/Applet;Ljava/lang/String;)V")
	public static void report(@OriginalArg(0) Throwable ex, @OriginalArg(2) Applet applet, @OriginalArg(3) String suffix) {
		try {
			@Pc(1) String message = "";
			if (ex != null) {
				message = toString(ex);
			}
			if (suffix != null) {
				if (ex != null) {
					message = message + " | ";
				}
				message = message + suffix;
			}
			print(message);
			@Pc(42) String encodedMessage = replace(message, ":", "%3a");
			encodedMessage = replace(encodedMessage, "@", "%40");
			encodedMessage = replace(encodedMessage, "&", "%26");
			encodedMessage = replace(encodedMessage, "#", "%23");
			@Pc(90) URL url = new URL(applet.getCodeBase(), "loadererror.ws?c=" + clientCrc + "&v1=" + SignLink.javaVendor + "&v2=" + SignLink.javaVersion + "&e=" + encodedMessage);
			@Pc(96) DataInputStream in = new DataInputStream(url.openStream());
			in.read();
			in.close();
		} catch (@Pc(103) Exception reportEx) {
		}
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!g;")
	private static TracingException wrap(@OriginalArg(0) Throwable cause, @OriginalArg(1) String message) {
		@Pc(5) TracingException ex;
		if (cause instanceof TracingException) {
			ex = (TracingException) cause;
			ex.message = ex.message + ' ' + message;
		} else {
			ex = new TracingException(cause, message);
		}
		return ex;
	}

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private TracingException(@OriginalArg(0) Throwable cause, @OriginalArg(1) String message) {
		this.cause = cause;
		this.message = message;
	}
}
