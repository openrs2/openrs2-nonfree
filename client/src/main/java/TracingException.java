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

@OriginalClass("client!bk")
public final class TracingException extends RuntimeException {

	@OriginalMember(owner = "client!mo", name = "Z", descriptor = "Lsignlink!pm;")
	public static SignLink signLink;

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
	public static int clientVersion;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZLjava/lang/Throwable;)Ljava/lang/String;")
	public static String toString(@OriginalArg(1) Throwable ex) throws IOException {
		@Pc(14) String message;
		if (ex instanceof TracingException) {
			@Pc(19) TracingException tracingException = (TracingException) ex;
			message = tracingException.message + " | ";
			ex = tracingException.cause;
		} else {
			message = "";
		}
		@Pc(36) StringWriter stringWriter = new StringWriter();
		@Pc(41) PrintWriter printWriter = new PrintWriter(stringWriter);
		ex.printStackTrace(printWriter);
		printWriter.close();
		@Pc(49) String stackTrace = stringWriter.toString();
		@Pc(57) BufferedReader reader = new BufferedReader(new StringReader(stackTrace));
		@Pc(60) String firstLine = reader.readLine();
		while (true) {
			@Pc(63) String line = reader.readLine();
			if (line == null) {
				return message + "| " + firstLine;
			}
			@Pc(72) int openingBracketIndex = line.indexOf('(');
			@Pc(79) int closingBracketIndex = line.indexOf(')', openingBracketIndex + 1);
			@Pc(88) String classAndMethodName;
			if (openingBracketIndex == -1) {
				classAndMethodName = line;
			} else {
				classAndMethodName = line.substring(0, openingBracketIndex);
			}
			@Pc(95) String trimmedClassAndmethodName = classAndMethodName.trim();
			trimmedClassAndmethodName = trimmedClassAndmethodName.substring(trimmedClassAndmethodName.lastIndexOf(' ') + 1);
			trimmedClassAndmethodName = trimmedClassAndmethodName.substring(trimmedClassAndmethodName.lastIndexOf('\t') + 1);
			@Pc(120) String formattedLine = message + trimmedClassAndmethodName;
			if (openingBracketIndex != -1 && closingBracketIndex != -1) {
				@Pc(136) int javaSuffixIndex = line.indexOf(".java:", openingBracketIndex);
				if (javaSuffixIndex >= 0) {
					formattedLine = formattedLine + line.substring(javaSuffixIndex + 5, closingBracketIndex);
				}
			}
			message = formattedLine + ' ';
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	private static String replace(@OriginalArg(0) String s, @OriginalArg(2) String target, @OriginalArg(1) String replacement) {
		for (@Pc(21) int i = s.indexOf(target); i != -1; i = s.indexOf(target, i + replacement.length())) {
			s = s.substring(0, i) + replacement + s.substring(i + target.length());
		}
		return s;
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(Ljava/lang/String;I)V")
	private static void print(@OriginalArg(0) String message) {
		System.out.println("Error: " + replace(message, "%0a", "\n"));
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/lang/String;)V")
	public static void report(@OriginalArg(0) Throwable ex, @OriginalArg(2) String suffix) {
		try {
			@Pc(13) String message = "";
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
			@Pc(54) String encodedMessage = replace(message, ":", "%3a");
			encodedMessage = replace(encodedMessage, "@", "%40");
			encodedMessage = replace(encodedMessage, "&", "%26");
			encodedMessage = replace(encodedMessage, "#", "%23");
			if (signLink.applet == null) {
				return;
			}
			@Pc(115) PrivilegedRequest request = signLink.openUrlStream(new URL(signLink.applet.getCodeBase(), "clienterror.ws?c=" + clientVersion + "&u=" + LoginManager.encodedUsername + "&v1=" + SignLink.javaVendor + "&v2=" + SignLink.javaVersion + "&e=" + encodedMessage));
			while (request.status == 0) {
				ThreadUtils.sleep(1L);
			}
			if (request.status == 1) {
				@Pc(133) DataInputStream in = (DataInputStream) request.result;
				in.read();
				in.close();
			}
		} catch (@Pc(140) Exception reportEx) {
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!bk;")
	public static TracingException wrap(@OriginalArg(0) Throwable cause, @OriginalArg(1) String message) {
		@Pc(12) TracingException ex;
		if (cause instanceof TracingException) {
			ex = (TracingException) cause;
			ex.message = ex.message + ' ' + message;
		} else {
			ex = new TracingException(cause, message);
		}
		return ex;
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "Ljava/lang/String;")
	private String message;

	@OriginalMember(owner = "client!bk", name = "h", descriptor = "Ljava/lang/Throwable;")
	private final Throwable cause;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private TracingException(@OriginalArg(0) Throwable cause, @OriginalArg(1) String message) {
		this.message = message;
		this.cause = cause;
	}
}
