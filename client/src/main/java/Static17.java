import java.awt.Canvas;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Locale;
import javax.media.opengl.GL;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLDrawable;
import javax.media.opengl.GLDrawableFactory;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)V")
	private static void method1626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = Static3.anIntArray169[arg0];
		@Pc(17) int local17 = Static3.anIntArray169[arg0 + 1];
		@Pc(23) int local23 = Static3.anIntArray169[arg0 + 2];
		@Pc(29) int local29 = Static3.anIntArray169[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(42) int local42 = Static3.anIntArray169[local33 + 1];
			if (local42 < local17) {
				Static3.anIntArray169[local7] = Static3.anIntArray169[local33];
				Static3.anIntArray169[local7 + 1] = local42;
				Static3.anIntArray169[local7 + 2] = Static3.anIntArray169[local33 + 2];
				Static3.anIntArray169[local7 + 3] = Static3.anIntArray169[local33 + 3];
				local7 += 4;
				Static3.anIntArray169[local33] = Static3.anIntArray169[local7];
				Static3.anIntArray169[local33 + 1] = Static3.anIntArray169[local7 + 1];
				Static3.anIntArray169[local33 + 2] = Static3.anIntArray169[local7 + 2];
				Static3.anIntArray169[local33 + 3] = Static3.anIntArray169[local7 + 3];
			}
		}
		Static3.anIntArray169[local7] = local11;
		Static3.anIntArray169[local7 + 1] = local17;
		Static3.anIntArray169[local7 + 2] = local23;
		Static3.anIntArray169[local7 + 3] = local29;
		method1626(arg0, local7);
		method1626(local7 + 4, arg1);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II[I[I)V")
	private static void method1627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		method1634();
		while (method1631()) {
			@Pc(4) int local4 = Static3.anInt2093;
			@Pc(6) int local6 = Static3.anInt2092;
			@Pc(8) int local8 = Static3.anInt2098;
			if (arg2 != null) {
				@Pc(14) int local14 = local8 - Static6.anInt5183;
				if (local4 < arg2[local14] + Static6.anInt5185) {
					local4 = arg2[local14] + Static6.anInt5185;
				}
				if (local6 > arg2[local14] + arg3[local14] + Static6.anInt5185) {
					local6 = arg2[local14] + arg3[local14] + Static6.anInt5185;
				}
			}
			Static34.method4225(local4, local8, local6 - local4, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "([III)V")
	public static void method1628(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method1633(arg0, arg0.length, arg1, arg2, null, null);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "([III[I[I)V")
	public static void method1630(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method1633(arg0, arg0.length, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "()Z")
	private static boolean method1631() {
		@Pc(1) int local1 = Static3.anInt2095;
		@Pc(3) int local3 = Static3.anInt2097;
		@Pc(5) int local5 = Static3.anInt2098;
		while (local3 >= local1) {
			local5++;
			Static3.anInt2098 = local5;
			if (local5 >= Static6.anInt5187) {
				return false;
			}
			@Pc(18) int local18 = Static3.anInt2096;
			while (local1 < Static3.anInt2094) {
				@Pc(27) int local27 = Static3.anIntArray169[local1 + 1];
				if (local5 < local27) {
					break;
				}
				@Pc(35) int local35 = Static3.anIntArray169[local1];
				@Pc(41) int local41 = Static3.anIntArray169[local1 + 2];
				@Pc(47) int local47 = Static3.anIntArray169[local1 + 3];
				@Pc(57) int local57 = (local41 - local35 << 16) / (local47 - local27);
				@Pc(63) int local63 = (local35 << 16) + 32768;
				Static3.anIntArray169[local1] = local63;
				Static3.anIntArray169[local1 + 2] = local57;
				local1 += 4;
			}
			for (@Pc(77) int local77 = local18; local77 < local1; local77 += 4) {
				@Pc(86) int local86 = Static3.anIntArray169[local77 + 3];
				if (local5 >= local86) {
					Static3.anIntArray169[local77] = Static3.anIntArray169[local18];
					Static3.anIntArray169[local77 + 1] = Static3.anIntArray169[local18 + 1];
					Static3.anIntArray169[local77 + 2] = Static3.anIntArray169[local18 + 2];
					Static3.anIntArray169[local77 + 3] = Static3.anIntArray169[local18 + 3];
					local18 += 4;
				}
			}
			if (local18 == Static3.anInt2094) {
				Static3.anInt2094 = 0;
				return false;
			}
			method1635(local18, local1);
			Static3.anInt2096 = local18;
			Static3.anInt2095 = local1;
			local3 = local18;
		}
		Static3.anInt2093 = Static3.anIntArray169[local3] >> 16;
		Static3.anInt2092 = Static3.anIntArray169[local3 + 4] >> 16;
		@Pc(160) int[] local160 = Static3.anIntArray169;
		local160[local3] += Static3.anIntArray169[local3 + 2];
		local160 = Static3.anIntArray169;
		local160[local3 + 4] += Static3.anIntArray169[local3 + 6];
		@Pc(184) int local184 = local3 + 8;
		Static3.anInt2097 = local184;
		return true;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "([III)V")
	private static void method1632(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = Static3.anInt2094 + (arg1 << 1);
		if (Static3.anIntArray169 == null || Static3.anIntArray169.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (@Pc(16) int local16 = 0; local16 < Static3.anInt2094; local16++) {
				local14[local16] = Static3.anIntArray169[local16];
			}
			Static3.anIntArray169 = local14;
		}
		@Pc(37) int local37 = arg1 - 2;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39 += 2) {
			@Pc(48) int local48 = arg0[local37 + 1];
			@Pc(54) int local54 = arg0[local39 + 1];
			if (local48 < local54) {
				Static3.anIntArray169[Static3.anInt2094++] = arg0[local37];
				Static3.anIntArray169[Static3.anInt2094++] = local48;
				Static3.anIntArray169[Static3.anInt2094++] = arg0[local39];
				Static3.anIntArray169[Static3.anInt2094++] = local54;
			} else if (local54 < local48) {
				Static3.anIntArray169[Static3.anInt2094++] = arg0[local39];
				Static3.anIntArray169[Static3.anInt2094++] = local54;
				Static3.anIntArray169[Static3.anInt2094++] = arg0[local37];
				Static3.anIntArray169[Static3.anInt2094++] = local48;
			}
			local37 = local39;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "([IIIII[I[I)V")
	private static void method1633(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5) {
		if (arg4 != null && Static6.anInt5187 - Static6.anInt5183 != arg4.length) {
			throw new IllegalStateException();
		}
		method1636();
		method1632(arg0, arg1);
		method1627(arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "()V")
	private static void method1634() {
		if (Static3.anInt2094 < 0) {
			Static3.anInt2097 = 0;
			Static3.anInt2095 = 0;
			Static3.anInt2096 = 0;
			Static3.anInt2098 = 2147483646;
			return;
		}
		method1626(0, Static3.anInt2094);
		@Pc(17) int local17 = Static3.anIntArray169[1];
		if (local17 < Static6.anInt5183) {
			local17 = Static6.anInt5183;
		}
		@Pc(26) int local26;
		for (local26 = 0; local26 < Static3.anInt2094; local26 += 4) {
			@Pc(35) int local35 = Static3.anIntArray169[local26 + 1];
			if (local17 < local35) {
				break;
			}
			@Pc(43) int local43 = Static3.anIntArray169[local26];
			@Pc(49) int local49 = Static3.anIntArray169[local26 + 2];
			@Pc(55) int local55 = Static3.anIntArray169[local26 + 3];
			@Pc(65) int local65 = (local49 - local43 << 16) / (local55 - local35);
			@Pc(71) int local71 = (local43 << 16) + 32768;
			Static3.anIntArray169[local26] = local71 + (local17 - local35) * local65;
			Static3.anIntArray169[local26 + 2] = local65;
		}
		Static3.anInt2096 = 0;
		Static3.anInt2095 = local26;
		Static3.anInt2097 = local26;
		Static3.anInt2098 = local17 - 1;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)V")
	private static void method1635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(6) boolean local6 = true;
				for (@Pc(10) int local10 = arg0 + 4; local10 < arg1; local10 += 4) {
					@Pc(19) int local19 = Static3.anIntArray169[local10 - 4];
					@Pc(23) int local23 = Static3.anIntArray169[local10];
					if (local19 > local23) {
						local6 = false;
						Static3.anIntArray169[local10 - 4] = local23;
						Static3.anIntArray169[local10] = local19;
						@Pc(44) int local44 = Static3.anIntArray169[local10 - 2];
						Static3.anIntArray169[local10 - 2] = Static3.anIntArray169[local10 + 2];
						Static3.anIntArray169[local10 + 2] = local44;
						local44 = Static3.anIntArray169[local10 - 1];
						Static3.anIntArray169[local10 - 1] = Static3.anIntArray169[local10 + 3];
						Static3.anIntArray169[local10 + 3] = local44;
					}
				}
				if (!local6) {
					arg1 -= 4;
					continue;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "()V")
	private static void method1636() {
		Static3.anInt2094 = 0;
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	public static String method2265(@OriginalArg(0) String arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			@Pc(13) char local13 = arg0.charAt(local6);
			if (local13 == '<' || local13 == '>') {
				local4 += 3;
			}
		}
		@Pc(29) StringBuffer local29 = new StringBuffer(local2 + local4);
		for (@Pc(31) int local31 = 0; local31 < local2; local31++) {
			@Pc(38) char local38 = arg0.charAt(local31);
			if (local38 == '<') {
				local29.append("<lt>");
			} else if (local38 == '>') {
				local29.append("<gt>");
			} else {
				local29.append(local38);
			}
		}
		return local29.toString();
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "([[B[[B[I[I[III)I")
	public static int method2270(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg2[arg5];
		@Pc(9) int local9 = local3 + arg4[arg5];
		@Pc(13) int local13 = arg2[arg6];
		@Pc(19) int local19 = local13 + arg4[arg6];
		@Pc(21) int local21 = local3;
		if (local13 > local3) {
			local21 = local13;
		}
		@Pc(28) int local28 = local9;
		if (local19 < local9) {
			local28 = local19;
		}
		@Pc(37) int local37 = arg3[arg5];
		if (arg3[arg6] < local37) {
			local37 = arg3[arg6];
		}
		@Pc(50) byte[] local50 = arg1[arg5];
		@Pc(54) byte[] local54 = arg0[arg6];
		@Pc(58) int local58 = local21 - local3;
		@Pc(62) int local62 = local21 - local13;
		for (@Pc(64) int local64 = local21; local64 < local28; local64++) {
			@Pc(77) int local77 = local50[local58++] + local54[local62++];
			if (local77 < local37) {
				local37 = local77;
			}
		}
		return -local37;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IBI)V")
	public static void method1654(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static1.anInt772 == 2) {
			Static5.anInt4066 = arg0;
			Static5.anInt3656 = arg1;
		}
		Static5.aFloat97 = arg1;
		Static5.aFloat147 = arg0;
		Static28.method3252();
		Static5.aBoolean248 = true;
	}

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "(B)V")
	public static void method1655() {
		Static6.aBoolean335 = true;
	}
}
