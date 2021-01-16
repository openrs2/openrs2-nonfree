import java.util.Date;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class ScriptRunner {
	@OriginalMember(owner = "client!tm", name = "O", descriptor = "[I")
	private static final int[] intStack = new int[1000];

	@OriginalMember(owner = "client!df", name = "g", descriptor = "[Ljava/lang/String;")
	private static final String[] stringStack = new String[1000];

	@OriginalMember(owner = "client!va", name = "c", descriptor = "[Lclient!ui;")
	private static final GoSubFrame[] callStack = new GoSubFrame[50];

	@OriginalMember(owner = "client!fd", name = "nb", descriptor = "I")
	private static int fp = 0;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "[I")
	private static int[] intLocals;

	@OriginalMember(owner = "client!kn", name = "D", descriptor = "[Ljava/lang/String;")
	private static String[] stringLocals;

	@OriginalMember(owner = "client!un", name = "w", descriptor = "[I")
	private static final int[] arrayLengths = new int[5];

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "[[I")
	private static final int[][] arrays = new int[5][5000];

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILclient!jl;)V")
	private static void run(@OriginalArg(2) ClientScript script, @OriginalArg(0) int maxCycles) {
		fp = 0;
		@Pc(5) int isp = 0;
		@Pc(11) int pc = -1;
		@Pc(13) int ssp = 0;
		@Pc(16) int[] opcodes = script.opcodes;
		@Pc(23) int[] intOperands = script.intOperands;
		@Pc(25) int opcode = -1;
		try {
			@Pc(27) int cycles = 0;
			label4473:
			while (true) {
				cycles++;
				if (cycles > maxCycles) {
					throw new RuntimeException("slow");
				}
				pc++;
				opcode = opcodes[pc];
				if (opcode < 100) {
					if (opcode == 0) {
						intStack[isp++] = intOperands[pc];
						continue;
					}
					if (opcode == 1) {
						@Pc(70) int local70 = intOperands[pc];
						intStack[isp++] = VarpDomain.varps[local70];
						continue;
					}
					if (opcode == 2) {
						@Pc(89) int local89 = intOperands[pc];
						isp--;
						VarpDomain.setVarpClient(local89, intStack[isp]);
						continue;
					}
					if (opcode == 3) {
						stringStack[ssp++] = script.stringOperands[pc];
						continue;
					}
					if (opcode == 6) {
						pc += intOperands[pc];
						continue;
					}
					if (opcode == 7) {
						isp -= 2;
						if (intStack[isp] != intStack[isp + 1]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 8) {
						isp -= 2;
						if (intStack[isp] == intStack[isp + 1]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 9) {
						isp -= 2;
						if (intStack[isp] < intStack[isp + 1]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 10) {
						isp -= 2;
						if (intStack[isp + 1] < intStack[isp]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 21) {
						if (fp == 0) {
							return;
						}
						@Pc(242) GoSubFrame frame = callStack[--fp];
						stringLocals = frame.stringLocals;
						script = frame.script;
						pc = frame.pc;
						intOperands = script.intOperands;
						intLocals = frame.intLocals;
						opcodes = script.opcodes;
						continue;
					}
					if (opcode == 25) {
						@Pc(270) int local270 = intOperands[pc];
						intStack[isp++] = VarpDomain.getVarbit(local270);
						continue;
					}
					if (opcode == 27) {
						@Pc(287) int local287 = intOperands[pc];
						isp--;
						VarpDomain.setVarbitClient(local287, intStack[isp]);
						continue;
					}
					if (opcode == 31) {
						isp -= 2;
						if (intStack[isp] <= intStack[isp + 1]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 32) {
						isp -= 2;
						if (intStack[isp + 1] <= intStack[isp]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 33) {
						intStack[isp++] = intLocals[intOperands[pc]];
						continue;
					}
					if (opcode == 34) {
						@Pc(367) int local = intOperands[pc];
						isp--;
						intLocals[local] = intStack[isp];
						continue;
					}
					if (opcode == 35) {
						stringStack[ssp++] = stringLocals[intOperands[pc]];
						continue;
					}
					if (opcode == 36) {
						@Pc(399) int local = intOperands[pc];
						ssp--;
						stringLocals[local] = stringStack[ssp];
						continue;
					}
					if (opcode == 37) {
						@Pc(413) int len = intOperands[pc];
						@Pc(417) int ssp2 = ssp - len;
						@Pc(423) String value = StringUtils.join(stringStack, ssp2, len);
						ssp = ssp2 + 1;
						stringStack[ssp2] = value;
						continue;
					}
					if (opcode == 38) {
						isp--;
						continue;
					}
					if (opcode == 39) {
						ssp--;
						continue;
					}
					if (opcode == 40) {
						@Pc(457) int scriptId = intOperands[pc];
						@Pc(461) ClientScript callee = ClientScriptList.get(scriptId);
						@Pc(465) int[] calleeIntLocals = new int[callee.intLocals];
						@Pc(469) String[] calleeStringLocals = new String[callee.stringLocals];
						for (@Pc(471) int i = 0; i < callee.intArgs; i++) {
							calleeIntLocals[i] = intStack[i + isp - callee.intArgs];
						}
						for (@Pc(496) int i = 0; i < callee.stringArgs; i++) {
							calleeStringLocals[i] = stringStack[ssp + i - callee.stringArgs];
						}
						isp -= callee.intArgs;
						ssp -= callee.stringArgs;
						@Pc(534) GoSubFrame frame = new GoSubFrame();
						frame.intLocals = intLocals;
						frame.stringLocals = stringLocals;
						frame.pc = pc;
						frame.script = script;
						if (fp >= callStack.length) {
							throw new RuntimeException();
						}
						callStack[fp++] = frame;
						stringLocals = calleeStringLocals;
						script = callee;
						pc = -1;
						opcodes = callee.opcodes;
						intLocals = calleeIntLocals;
						intOperands = callee.intOperands;
						continue;
					}
					if (opcode == 42) {
						intStack[isp++] = VarcDomain.varcs[intOperands[pc]];
						continue;
					}
					if (opcode == 43) {
						@Pc(605) int local605 = intOperands[pc];
						isp--;
						VarcDomain.varcs[local605] = intStack[isp];
						DelayedStateChange.setVarcClient(local605);
						continue;
					}
					if (opcode == 44) {
						@Pc(627) int type = intOperands[pc] & 0xFFFF;
						@Pc(633) int id = intOperands[pc] >> 16;
						isp--;
						@Pc(638) int len = intStack[isp];
						if (len >= 0 && len <= 5000) {
							@Pc(651) byte defaultValue = -1;
							if (type == 105) {
								defaultValue = 0;
							}
							arrayLengths[id] = len;
							@Pc(664) int i = 0;
							while (true) {
								if (i >= len) {
									continue label4473;
								}
								arrays[id][i] = defaultValue;
								i++;
							}
						}
						throw new RuntimeException();
					}
					if (opcode == 45) {
						@Pc(690) int id = intOperands[pc];
						@Pc(692) int isp2 = isp - 1;
						@Pc(695) int index = intStack[isp2];
						if (index >= 0 && index < arrayLengths[id]) {
							isp = isp2 + 1;
							intStack[isp2] = arrays[id][index];
							continue;
						}
						throw new RuntimeException();
					}
					if (opcode == 46) {
						@Pc(730) int id = intOperands[pc];
						isp -= 2;
						@Pc(735) int index = intStack[isp];
						if (index >= 0 && index < arrayLengths[id]) {
							arrays[id][index] = intStack[isp + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (opcode == 47) {
						@Pc(771) String local771 = VarcDomain.varcstrs[intOperands[pc]];
						if (local771 == null) {
							local771 = "null";
						}
						stringStack[ssp++] = local771;
						continue;
					}
					if (opcode == 48) {
						@Pc(790) int local790 = intOperands[pc];
						ssp--;
						VarcDomain.varcstrs[local790] = stringStack[ssp];
						DelayedStateChange.setVarcstrClient(local790);
						continue;
					}
					if (opcode == 51) {
						@Pc(814) HashTable table = script.switchTables[intOperands[pc]];
						isp--;
						@Pc(826) IntNode node = (IntNode) table.get(intStack[isp]);
						if (node != null) {
							pc += node.value;
						}
						continue;
					}
				}
				@Pc(846) boolean local846;
				if (intOperands[pc] == 1) {
					local846 = true;
				} else {
					local846 = false;
				}
				if (opcode < 300) {
					if (opcode == 100) {
						isp -= 3;
						@Pc(14769) int local14769 = intStack[isp + 2];
						@Pc(14773) int local14773 = intStack[isp];
						@Pc(14779) int local14779 = intStack[isp + 1];
						if (local14779 != 0) {
							@Pc(14790) Component local14790 = InterfaceList.getComponent(local14773);
							if (local14790.aClass185Array4 == null) {
								local14790.aClass185Array4 = new Component[local14769 + 1];
							}
							if (local14769 >= local14790.aClass185Array4.length) {
								@Pc(14815) Component[] local14815 = new Component[local14769 + 1];
								for (@Pc(14817) int local14817 = 0; local14817 < local14790.aClass185Array4.length; local14817++) {
									local14815[local14817] = local14790.aClass185Array4[local14817];
								}
								local14790.aClass185Array4 = local14815;
							}
							if (local14769 > 0 && local14790.aClass185Array4[local14769 - 1] == null) {
								throw new RuntimeException("Gap at:" + (local14769 - 1));
							}
							@Pc(14865) Component local14865 = new Component();
							local14865.anInt5937 = local14865.id = local14790.id;
							local14865.if3 = true;
							local14865.anInt5968 = local14769;
							local14865.type = local14779;
							local14790.aClass185Array4[local14769] = local14865;
							if (local846) {
								Static3.aClass185_8 = local14865;
							} else {
								Static4.aClass185_9 = local14865;
							}
							Static28.method3270(local14790);
							continue;
						}
						throw new RuntimeException();
					}
					if (opcode == 101) {
						@Pc(14911) Component local14911 = local846 ? Static3.aClass185_8 : Static4.aClass185_9;
						if (local14911.anInt5968 == -1) {
							if (!local846) {
								throw new RuntimeException("Tried to cc_delete static active-component!");
							}
							throw new RuntimeException("Tried to .cc_delete static .active-component!");
						}
						@Pc(14935) Component local14935 = InterfaceList.getComponent(local14911.id);
						local14935.aClass185Array4[local14911.anInt5968] = null;
						Static28.method3270(local14935);
						continue;
					}
					if (opcode == 102) {
						isp--;
						@Pc(14959) Component local14959 = InterfaceList.getComponent(intStack[isp]);
						local14959.aClass185Array4 = null;
						Static28.method3270(local14959);
						continue;
					}
					if (opcode == 200) {
						@Pc(14972) int local14972 = isp - 2;
						@Pc(14976) int local14976 = intStack[local14972];
						@Pc(14982) int local14982 = intStack[local14972 + 1];
						@Pc(14987) Component local14987 = Static23.method2425(local14976, local14982);
						if (local14987 != null && local14982 != -1) {
							isp = local14972 + 1;
							intStack[local14972] = 1;
							if (local846) {
								Static3.aClass185_8 = local14987;
							} else {
								Static4.aClass185_9 = local14987;
							}
							continue;
						}
						isp = local14972 + 1;
						intStack[local14972] = 0;
						continue;
					}
					if (opcode == 201) {
						@Pc(15022) int local15022 = isp - 1;
						@Pc(15025) int local15025 = intStack[local15022];
						@Pc(15031) Component local15031 = InterfaceList.getComponent(local15025);
						if (local15031 == null) {
							isp = local15022 + 1;
							intStack[local15022] = 0;
						} else {
							isp = local15022 + 1;
							intStack[local15022] = 1;
							if (local846) {
								Static3.aClass185_8 = local15031;
							} else {
								Static4.aClass185_9 = local15031;
							}
						}
						continue;
					}
				} else if (opcode < 500) {
					if (opcode == 403) {
						isp -= 2;
						@Pc(14650) int local14650 = intStack[isp];
						@Pc(14656) int local14656 = intStack[isp + 1];
						for (@Pc(14658) int local14658 = 0; local14658 < PlayerAppearance.anIntArray550.length; local14658++) {
							if (local14650 == PlayerAppearance.anIntArray550[local14658]) {
								PlayerList.self.appearance.method3604(local14658, local14656);
								continue label4473;
							}
						}
						@Pc(14684) int local14684 = 0;
						while (true) {
							if (PlayerAppearance.anIntArray487.length <= local14684) {
								continue label4473;
							}
							if (PlayerAppearance.anIntArray487[local14684] == local14650) {
								PlayerList.self.appearance.method3604(local14684, local14656);
								continue label4473;
							}
							local14684++;
						}
					}
					if (opcode == 404) {
						isp -= 2;
						@Pc(14722) int local14722 = intStack[isp];
						@Pc(14728) int local14728 = intStack[isp + 1];
						PlayerList.self.appearance.setColor(local14722, local14728);
						continue;
					}
					if (opcode == 410) {
						isp--;
						@Pc(14748) boolean local14748 = intStack[isp] != 0;
						PlayerList.self.appearance.setGender(local14748);
						continue;
					}
				} else if (opcode >= 1000 && opcode < 1100 || opcode >= 2000 && opcode < 2100) {
					@Pc(885) Component local885;
					if (opcode < 2000) {
						local885 = local846 ? Static3.aClass185_8 : Static4.aClass185_9;
					} else {
						isp--;
						local885 = InterfaceList.getComponent(intStack[isp]);
						opcode -= 1000;
					}
					if (opcode == 1000) {
						isp -= 4;
						local885.anInt5928 = intStack[isp];
						local885.anInt5951 = intStack[isp + 1];
						@Pc(919) int local919 = intStack[isp + 2];
						if (local919 < 0) {
							local919 = 0;
						} else if (local919 > 5) {
							local919 = 5;
						}
						@Pc(936) int local936 = intStack[isp + 3];
						local885.aByte26 = (byte) local919;
						if (local936 < 0) {
							local936 = 0;
						} else if (local936 > 5) {
							local936 = 5;
						}
						local885.aByte25 = (byte) local936;
						Static28.method3270(local885);
						Static33.method4118(local885);
						if (local885.anInt5968 == -1) {
							DelayedStateChange.method4405(local885.id);
						}
						continue;
					}
					if (opcode == 1001) {
						isp -= 4;
						local885.anInt5927 = intStack[isp];
						local885.anInt5950 = intStack[isp + 1];
						local885.anInt5957 = 0;
						local885.anInt5920 = 0;
						@Pc(1002) int local1002 = intStack[isp + 3];
						if (local1002 < 0) {
							local1002 = 0;
						} else if (local1002 > 4) {
							local1002 = 4;
						}
						@Pc(1021) int local1021 = intStack[isp + 2];
						if (local1021 < 0) {
							local1021 = 0;
						} else if (local1021 > 4) {
							local1021 = 4;
						}
						local885.aByte27 = (byte) local1002;
						local885.aByte24 = (byte) local1021;
						Static28.method3270(local885);
						Static33.method4118(local885);
						if (local885.type == 0) {
							Static34.method4251(false, local885);
						}
						continue;
					}
					if (opcode == 1003) {
						isp--;
						@Pc(1075) boolean local1075 = intStack[isp] == 1;
						if (local1075 != local885.aBoolean417) {
							local885.aBoolean417 = local1075;
							Static28.method3270(local885);
						}
						if (local885.anInt5968 == -1) {
							DelayedStateChange.method4026(local885.id);
						}
						continue;
					}
					if (opcode == 1004) {
						isp -= 2;
						local885.anInt5908 = intStack[isp];
						local885.anInt5970 = intStack[isp + 1];
						Static28.method3270(local885);
						Static33.method4118(local885);
						if (local885.type == 0) {
							Static34.method4251(false, local885);
						}
						continue;
					}
					if (opcode == 1005) {
						isp--;
						local885.aBoolean407 = intStack[isp] == 1;
						continue;
					}
				} else if (opcode >= 1100 && opcode < 1200 || opcode >= 2100 && opcode < 2200) {
					@Pc(1190) Component local1190;
					if (opcode >= 2000) {
						isp--;
						local1190 = InterfaceList.getComponent(intStack[isp]);
						opcode -= 1000;
					} else {
						local1190 = local846 ? Static3.aClass185_8 : Static4.aClass185_9;
					}
					if (opcode == 1100) {
						isp -= 2;
						local1190.anInt5932 = intStack[isp];
						if (local1190.anInt5885 - local1190.anInt5893 < local1190.anInt5932) {
							local1190.anInt5932 = local1190.anInt5885 - local1190.anInt5893;
						}
						if (local1190.anInt5932 < 0) {
							local1190.anInt5932 = 0;
						}
						local1190.anInt5931 = intStack[isp + 1];
						if (local1190.anInt5931 > local1190.anInt5887 - local1190.anInt5949) {
							local1190.anInt5931 = local1190.anInt5887 - local1190.anInt5949;
						}
						if (local1190.anInt5931 < 0) {
							local1190.anInt5931 = 0;
						}
						Static28.method3270(local1190);
						if (local1190.anInt5968 == -1) {
							DelayedStateChange.method111(local1190.id);
						}
						continue;
					}
					if (opcode == 1101) {
						isp--;
						local1190.anInt5933 = intStack[isp];
						Static28.method3270(local1190);
						if (local1190.anInt5968 == -1) {
							DelayedStateChange.method4092(local1190.id);
						}
						continue;
					}
					if (opcode == 1102) {
						isp--;
						local1190.aBoolean413 = intStack[isp] == 1;
						Static28.method3270(local1190);
						continue;
					}
					if (opcode == 1103) {
						isp--;
						local1190.anInt5903 = intStack[isp];
						Static28.method3270(local1190);
						continue;
					}
					if (opcode == 1104) {
						isp--;
						local1190.anInt5899 = intStack[isp];
						Static28.method3270(local1190);
						continue;
					}
					if (opcode == 1105) {
						isp--;
						local1190.anInt5947 = intStack[isp];
						Static28.method3270(local1190);
						continue;
					}
					if (opcode == 1106) {
						isp--;
						local1190.anInt5958 = intStack[isp];
						Static28.method3270(local1190);
						continue;
					}
					if (opcode == 1107) {
						isp--;
						local1190.aBoolean410 = intStack[isp] == 1;
						Static28.method3270(local1190);
						continue;
					}
					if (opcode == 1108) {
						local1190.anInt5939 = 1;
						isp--;
						local1190.anInt5895 = intStack[isp];
						Static28.method3270(local1190);
						if (local1190.anInt5968 == -1) {
							DelayedStateChange.method779(local1190.id);
						}
						continue;
					}
					if (opcode == 1109) {
						isp -= 6;
						local1190.anInt5963 = intStack[isp];
						local1190.anInt5906 = intStack[isp + 1];
						local1190.anInt5944 = intStack[isp + 2];
						local1190.anInt5976 = intStack[isp + 3];
						local1190.anInt5886 = intStack[isp + 4];
						local1190.anInt5918 = intStack[isp + 5];
						Static28.method3270(local1190);
						if (local1190.anInt5968 == -1) {
							DelayedStateChange.method1994(local1190.id);
							DelayedStateChange.method1224(local1190.id);
						}
						continue;
					}
					if (opcode == 1110) {
						isp--;
						@Pc(1529) int local1529 = intStack[isp];
						if (local1529 != local1190.anInt5891) {
							local1190.anInt5897 = 0;
							local1190.anInt5891 = local1529;
							local1190.anInt5979 = 1;
							local1190.anInt5892 = 0;
							Static28.method3270(local1190);
						}
						if (local1190.anInt5968 == -1) {
							DelayedStateChange.method680(local1190.id);
						}
						continue;
					}
					if (opcode == 1111) {
						isp--;
						local1190.aBoolean418 = intStack[isp] == 1;
						Static28.method3270(local1190);
						continue;
					}
					if (opcode == 1112) {
						ssp--;
						@Pc(1590) String local1590 = stringStack[ssp];
						if (!local1590.equals(local1190.aString351)) {
							local1190.aString351 = local1590;
							Static28.method3270(local1190);
						}
						if (local1190.anInt5968 == -1) {
							DelayedStateChange.method4678(local1190.id);
						}
						continue;
					}
					if (opcode == 1113) {
						isp--;
						local1190.anInt5954 = intStack[isp];
						Static28.method3270(local1190);
						continue;
					}
					if (opcode == 1114) {
						isp -= 3;
						local1190.anInt5924 = intStack[isp];
						local1190.anInt5922 = intStack[isp + 1];
						local1190.anInt5948 = intStack[isp + 2];
						Static28.method3270(local1190);
						continue;
					}
					if (opcode == 1115) {
						isp--;
						local1190.aBoolean415 = intStack[isp] == 1;
						Static28.method3270(local1190);
						continue;
					}
					if (opcode == 1116) {
						isp--;
						local1190.anInt5975 = intStack[isp];
						Static28.method3270(local1190);
						continue;
					}
					if (opcode == 1117) {
						isp--;
						local1190.anInt5934 = intStack[isp];
						Static28.method3270(local1190);
						continue;
					}
					if (opcode == 1118) {
						isp--;
						local1190.aBoolean404 = intStack[isp] == 1;
						Static28.method3270(local1190);
						continue;
					}
					if (opcode == 1119) {
						isp--;
						local1190.aBoolean406 = intStack[isp] == 1;
						Static28.method3270(local1190);
						continue;
					}
					if (opcode == 1120) {
						isp -= 2;
						local1190.anInt5885 = intStack[isp];
						local1190.anInt5887 = intStack[isp + 1];
						Static28.method3270(local1190);
						if (local1190.type == 0) {
							Static34.method4251(false, local1190);
						}
						continue;
					}
					if (opcode == 1121) {
						isp -= 2;
						local1190.aShort50 = (short) intStack[isp];
						local1190.aShort49 = (short) intStack[isp + 1];
						Static28.method3270(local1190);
						continue;
					}
					if (opcode == 1122) {
						isp--;
						local1190.aBoolean412 = intStack[isp] == 1;
						Static28.method3270(local1190);
						continue;
					}
					if (opcode == 1123) {
						isp--;
						local1190.anInt5918 = intStack[isp];
						Static28.method3270(local1190);
						if (local1190.anInt5968 == -1) {
							DelayedStateChange.method1994(local1190.id);
						}
						continue;
					}
					if (opcode == 1124) {
						isp--;
						@Pc(1875) int local1875 = intStack[isp];
						local1190.aBoolean409 = local1875 == 1;
						Static28.method3270(local1190);
						continue;
					}
				} else if (opcode >= 1200 && opcode < 1300 || opcode >= 2200 && opcode < 2300) {
					@Pc(1917) Component local1917;
					if (opcode < 2000) {
						local1917 = local846 ? Static3.aClass185_8 : Static4.aClass185_9;
					} else {
						opcode -= 1000;
						isp--;
						local1917 = InterfaceList.getComponent(intStack[isp]);
					}
					Static28.method3270(local1917);
					if (opcode == 1200 || opcode == 1205 || opcode == 1208 || opcode == 1209) {
						isp -= 2;
						@Pc(1955) int local1955 = intStack[isp + 1];
						@Pc(1959) int local1959 = intStack[isp];
						if (local1917.anInt5968 == -1) {
							DelayedStateChange.method676(local1917.id);
							DelayedStateChange.method1994(local1917.id);
							DelayedStateChange.method1224(local1917.id);
						}
						if (local1959 == -1) {
							local1917.anInt5939 = 1;
							local1917.anInt5895 = -1;
							local1917.anInt5938 = -1;
							continue;
						}
						local1917.anInt5962 = local1955;
						if (opcode == 1208 || opcode == 1209) {
							local1917.aBoolean419 = true;
						} else {
							local1917.aBoolean419 = false;
						}
						local1917.anInt5938 = local1959;
						@Pc(2020) ObjType local2020 = ObjTypeList.get(local1959);
						local1917.anInt5906 = local2020.yOffset2d;
						local1917.anInt5963 = local2020.xOffset2d;
						local1917.anInt5944 = local2020.xAngle2d;
						local1917.anInt5976 = local2020.yAngle2d;
						local1917.anInt5918 = local2020.zoom2d;
						local1917.anInt5886 = local2020.anInt5062;
						if (opcode == 1205) {
							local1917.aBoolean405 = false;
						} else {
							local1917.aBoolean405 = true;
						}
						if (local1917.anInt5957 > 0) {
							local1917.anInt5918 = local1917.anInt5918 * 32 / local1917.anInt5957;
						} else if (local1917.anInt5927 > 0) {
							local1917.anInt5918 = local1917.anInt5918 * 32 / local1917.anInt5927;
						}
						continue;
					}
					if (opcode == 1201) {
						local1917.anInt5939 = 2;
						isp--;
						local1917.anInt5895 = intStack[isp];
						if (local1917.anInt5968 == -1) {
							DelayedStateChange.method779(local1917.id);
						}
						continue;
					}
					if (opcode == 1202) {
						local1917.anInt5939 = 3;
						local1917.anInt5895 = PlayerList.self.appearance.method3611();
						if (local1917.anInt5968 == -1) {
							DelayedStateChange.method779(local1917.id);
						}
						continue;
					}
					if (opcode == 1203) {
						local1917.anInt5939 = 6;
						isp--;
						local1917.anInt5895 = intStack[isp];
						if (local1917.anInt5968 == -1) {
							DelayedStateChange.method779(local1917.id);
						}
						continue;
					}
					if (opcode == 1204) {
						local1917.anInt5939 = 5;
						isp--;
						local1917.anInt5895 = intStack[isp];
						if (local1917.anInt5968 == -1) {
							DelayedStateChange.method779(local1917.id);
						}
						continue;
					}
					if (opcode == 1206) {
						isp -= 4;
						local1917.anInt5972 = intStack[isp];
						local1917.anInt5916 = intStack[isp + 1];
						local1917.anInt5977 = intStack[isp + 2];
						local1917.anInt5898 = intStack[isp + 3];
						Static28.method3270(local1917);
						continue;
					}
					if (opcode == 1207) {
						isp -= 2;
						local1917.anInt5965 = intStack[isp];
						local1917.anInt5917 = intStack[isp + 1];
						Static28.method3270(local1917);
						continue;
					}
				} else if (opcode >= 1300 && opcode < 1400 || opcode >= 2300 && opcode < 2400) {
					@Pc(2274) Component local2274;
					if (opcode < 2000) {
						local2274 = local846 ? Static3.aClass185_8 : Static4.aClass185_9;
					} else {
						opcode -= 1000;
						isp--;
						local2274 = InterfaceList.getComponent(intStack[isp]);
					}
					if (opcode == 1300) {
						isp--;
						@Pc(2295) int local2295 = intStack[isp] - 1;
						if (local2295 >= 0 && local2295 <= 9) {
							ssp--;
							local2274.method4722(stringStack[ssp], local2295);
							continue;
						}
						ssp--;
						continue;
					}
					if (opcode == 1301) {
						isp -= 2;
						@Pc(2323) int local2323 = intStack[isp + 1];
						@Pc(2327) int local2327 = intStack[isp];
						local2274.aClass185_17 = Static23.method2425(local2327, local2323);
						continue;
					}
					if (opcode == 1302) {
						isp--;
						local2274.aBoolean402 = intStack[isp] == 1;
						continue;
					}
					if (opcode == 1303) {
						isp--;
						local2274.anInt5896 = intStack[isp];
						continue;
					}
					if (opcode == 1304) {
						isp--;
						local2274.anInt5953 = intStack[isp];
						continue;
					}
					if (opcode == 1305) {
						ssp--;
						local2274.aString352 = stringStack[ssp];
						continue;
					}
					if (opcode == 1306) {
						ssp--;
						local2274.aString355 = stringStack[ssp];
						continue;
					}
					if (opcode == 1307) {
						local2274.aStringArray43 = null;
						continue;
					}
					if (opcode == 1308) {
						@Pc(2421) int local2421 = isp - 1;
						local2274.anInt5890 = intStack[local2421];
						isp = local2421 - 1;
						local2274.anInt5930 = intStack[isp];
						continue;
					}
					if (opcode == 1309) {
						@Pc(2439) int local2439 = isp - 1;
						@Pc(2442) int local2442 = intStack[local2439];
						isp = local2439 - 1;
						@Pc(2447) int local2447 = intStack[isp];
						if (local2447 >= 1 && local2447 <= 10) {
							local2274.method4725(local2447 - 1, local2442);
						}
						continue;
					}
					if (opcode == 1310) {
						ssp--;
						local2274.aString354 = stringStack[ssp];
						continue;
					}
				} else {
					if (opcode >= 1400 && opcode < 1500 || opcode >= 2400 && opcode < 2500) {
						@Pc(2505) Component local2505;
						if (opcode < 2000) {
							local2505 = local846 ? Static3.aClass185_8 : Static4.aClass185_9;
						} else {
							isp--;
							local2505 = InterfaceList.getComponent(intStack[isp]);
							opcode -= 1000;
						}
						ssp--;
						@Pc(2522) String local2522 = stringStack[ssp];
						@Pc(2524) int[] local2524 = null;
						if (local2522.length() > 0 && local2522.charAt(local2522.length() - 1) == 'Y') {
							isp--;
							@Pc(2544) int local2544 = intStack[isp];
							if (local2544 > 0) {
								local2524 = new int[local2544];
								while (local2544-- > 0) {
									isp--;
									local2524[local2544] = intStack[isp];
								}
							}
							local2522 = local2522.substring(0, local2522.length() - 1);
						}
						@Pc(2581) Object[] local2581 = new Object[local2522.length() + 1];
						for (@Pc(2586) int local2586 = local2581.length - 1; local2586 >= 1; local2586--) {
							if (local2522.charAt(local2586 - 1) == 's') {
								ssp--;
								local2581[local2586] = stringStack[ssp];
							} else {
								isp--;
								local2581[local2586] = Integer.valueOf(intStack[isp]);
							}
						}
						isp--;
						@Pc(2627) int local2627 = intStack[isp];
						if (local2627 == -1) {
							local2581 = null;
						} else {
							local2581[0] = Integer.valueOf(local2627);
						}
						local2505.aBoolean403 = true;
						if (opcode == 1400) {
							local2505.anObjectArray29 = local2581;
						} else if (opcode == 1401) {
							local2505.anObjectArray8 = local2581;
						} else if (opcode == 1402) {
							local2505.anObjectArray30 = local2581;
						} else if (opcode == 1403) {
							local2505.anObjectArray26 = local2581;
						} else if (opcode == 1404) {
							local2505.anObjectArray28 = local2581;
						} else if (opcode == 1405) {
							local2505.anObjectArray11 = local2581;
						} else if (opcode == 1406) {
							local2505.anObjectArray17 = local2581;
						} else if (opcode == 1407) {
							local2505.anObjectArray24 = local2581;
							local2505.anIntArray669 = local2524;
						} else if (opcode == 1408) {
							local2505.anObjectArray16 = local2581;
						} else if (opcode == 1409) {
							local2505.anObjectArray18 = local2581;
						} else if (opcode == 1410) {
							local2505.anObjectArray7 = local2581;
						} else if (opcode == 1411) {
							local2505.anObjectArray15 = local2581;
						} else if (opcode == 1412) {
							local2505.anObjectArray9 = local2581;
						} else if (opcode == 1414) {
							local2505.anIntArray670 = local2524;
							local2505.anObjectArray3 = local2581;
						} else if (opcode == 1415) {
							local2505.anObjectArray25 = local2581;
							local2505.anIntArray667 = local2524;
						} else if (opcode == 1416) {
							local2505.anObjectArray13 = local2581;
						} else if (opcode == 1417) {
							local2505.anObjectArray20 = local2581;
						} else if (opcode == 1418) {
							local2505.anObjectArray6 = local2581;
						} else if (opcode == 1419) {
							local2505.anObjectArray10 = local2581;
						} else if (opcode == 1420) {
							local2505.anObjectArray12 = local2581;
						} else if (opcode == 1421) {
							local2505.anObjectArray23 = local2581;
						} else if (opcode == 1422) {
							local2505.anObjectArray31 = local2581;
						} else if (opcode == 1423) {
							local2505.anObjectArray19 = local2581;
						} else if (opcode == 1424) {
							local2505.anObjectArray4 = local2581;
						} else if (opcode == 1425) {
							local2505.anObjectArray14 = local2581;
						} else if (opcode == 1426) {
							local2505.anObjectArray5 = local2581;
						} else if (opcode == 1427) {
							local2505.anObjectArray32 = local2581;
						} else if (opcode == 1428) {
							local2505.anObjectArray27 = local2581;
							local2505.anIntArray673 = local2524;
						} else if (opcode == 1429) {
							local2505.anObjectArray21 = local2581;
							local2505.anIntArray665 = local2524;
						}
						continue;
					}
					if (opcode < 1600) {
						@Pc(14557) Component local14557 = local846 ? Static3.aClass185_8 : Static4.aClass185_9;
						if (opcode == 1500) {
							intStack[isp++] = local14557.anInt5960;
							continue;
						}
						if (opcode == 1501) {
							intStack[isp++] = local14557.anInt5888;
							continue;
						}
						if (opcode == 1502) {
							intStack[isp++] = local14557.anInt5893;
							continue;
						}
						if (opcode == 1503) {
							intStack[isp++] = local14557.anInt5949;
							continue;
						}
						if (opcode == 1504) {
							intStack[isp++] = local14557.aBoolean417 ? 1 : 0;
							continue;
						}
						if (opcode == 1505) {
							intStack[isp++] = local14557.anInt5937;
							continue;
						}
					} else if (opcode < 1700) {
						@Pc(2934) Component local2934 = local846 ? Static3.aClass185_8 : Static4.aClass185_9;
						if (opcode == 1600) {
							intStack[isp++] = local2934.anInt5932;
							continue;
						}
						if (opcode == 1601) {
							intStack[isp++] = local2934.anInt5931;
							continue;
						}
						if (opcode == 1602) {
							stringStack[ssp++] = local2934.aString351;
							continue;
						}
						if (opcode == 1603) {
							intStack[isp++] = local2934.anInt5885;
							continue;
						}
						if (opcode == 1604) {
							intStack[isp++] = local2934.anInt5887;
							continue;
						}
						if (opcode == 1605) {
							intStack[isp++] = local2934.anInt5918;
							continue;
						}
						if (opcode == 1606) {
							intStack[isp++] = local2934.anInt5944;
							continue;
						}
						if (opcode == 1607) {
							intStack[isp++] = local2934.anInt5886;
							continue;
						}
						if (opcode == 1608) {
							intStack[isp++] = local2934.anInt5976;
							continue;
						}
						if (opcode == 1609) {
							intStack[isp++] = local2934.anInt5903;
							continue;
						}
						if (opcode == 1610) {
							intStack[isp++] = local2934.anInt5963;
							continue;
						}
						if (opcode == 1611) {
							intStack[isp++] = local2934.anInt5906;
							continue;
						}
						if (opcode == 1612) {
							intStack[isp++] = local2934.anInt5947;
							continue;
						}
					} else if (opcode < 1800) {
						@Pc(3109) Component local3109 = local846 ? Static3.aClass185_8 : Static4.aClass185_9;
						if (opcode == 1700) {
							intStack[isp++] = local3109.anInt5938;
							continue;
						}
						if (opcode == 1701) {
							if (local3109.anInt5938 == -1) {
								intStack[isp++] = 0;
							} else {
								intStack[isp++] = local3109.anInt5962;
							}
							continue;
						}
						if (opcode == 1702) {
							intStack[isp++] = local3109.anInt5968;
							continue;
						}
					} else if (opcode < 1900) {
						@Pc(3170) Component local3170 = local846 ? Static3.aClass185_8 : Static4.aClass185_9;
						if (opcode == 1800) {
							intStack[isp++] = InterfaceList.getServerActiveProperties(local3170).getTargetMask();
							continue;
						}
						if (opcode == 1801) {
							isp--;
							@Pc(3193) int local3193 = intStack[isp];
							local3193--;
							if (local3170.aStringArray43 != null && local3170.aStringArray43.length > local3193 && local3170.aStringArray43[local3193] != null) {
								stringStack[ssp++] = local3170.aStringArray43[local3193];
								continue;
							}
							stringStack[ssp++] = "";
							continue;
						}
						if (opcode == 1802) {
							if (local3170.aString352 == null) {
								stringStack[ssp++] = "";
							} else {
								stringStack[ssp++] = local3170.aString352;
							}
							continue;
						}
					} else if (opcode < 2600) {
						@Pc(14466) int local14466 = isp - 1;
						@Pc(14470) Component local14470 = InterfaceList.getComponent(intStack[local14466]);
						if (opcode == 2500) {
							isp = local14466 + 1;
							intStack[local14466] = local14470.anInt5960;
							continue;
						}
						if (opcode == 2501) {
							isp = local14466 + 1;
							intStack[local14466] = local14470.anInt5888;
							continue;
						}
						if (opcode == 2502) {
							isp = local14466 + 1;
							intStack[local14466] = local14470.anInt5893;
							continue;
						}
						if (opcode == 2503) {
							isp = local14466 + 1;
							intStack[local14466] = local14470.anInt5949;
							continue;
						}
						if (opcode == 2504) {
							isp = local14466 + 1;
							intStack[local14466] = local14470.aBoolean417 ? 1 : 0;
							continue;
						}
						if (opcode == 2505) {
							isp = local14466 + 1;
							intStack[local14466] = local14470.anInt5937;
							continue;
						}
					} else if (opcode < 2700) {
						isp--;
						@Pc(14299) Component local14299 = InterfaceList.getComponent(intStack[isp]);
						if (opcode == 2600) {
							intStack[isp++] = local14299.anInt5932;
							continue;
						}
						if (opcode == 2601) {
							intStack[isp++] = local14299.anInt5931;
							continue;
						}
						if (opcode == 2602) {
							stringStack[ssp++] = local14299.aString351;
							continue;
						}
						if (opcode == 2603) {
							intStack[isp++] = local14299.anInt5885;
							continue;
						}
						if (opcode == 2604) {
							intStack[isp++] = local14299.anInt5887;
							continue;
						}
						if (opcode == 2605) {
							intStack[isp++] = local14299.anInt5918;
							continue;
						}
						if (opcode == 2606) {
							intStack[isp++] = local14299.anInt5944;
							continue;
						}
						if (opcode == 2607) {
							intStack[isp++] = local14299.anInt5886;
							continue;
						}
						if (opcode == 2608) {
							intStack[isp++] = local14299.anInt5976;
							continue;
						}
						if (opcode == 2609) {
							intStack[isp++] = local14299.anInt5903;
							continue;
						}
						if (opcode == 2610) {
							intStack[isp++] = local14299.anInt5963;
							continue;
						}
						if (opcode == 2611) {
							intStack[isp++] = local14299.anInt5906;
							continue;
						}
						if (opcode == 2612) {
							intStack[isp++] = local14299.anInt5947;
							continue;
						}
					} else if (opcode < 2800) {
						if (opcode == 2700) {
							@Pc(14115) int local14115 = isp - 1;
							@Pc(14119) Component local14119 = InterfaceList.getComponent(intStack[local14115]);
							isp = local14115 + 1;
							intStack[local14115] = local14119.anInt5938;
							continue;
						}
						if (opcode == 2701) {
							@Pc(14134) int local14134 = isp - 1;
							@Pc(14138) Component local14138 = InterfaceList.getComponent(intStack[local14134]);
							if (local14138.anInt5938 == -1) {
								isp = local14134 + 1;
								intStack[local14134] = 0;
							} else {
								isp = local14134 + 1;
								intStack[local14134] = local14138.anInt5962;
							}
							continue;
						}
						if (opcode == 2702) {
							@Pc(14166) int local14166 = isp - 1;
							@Pc(14169) int local14169 = intStack[local14166];
							@Pc(14176) SubInterface local14176 = (SubInterface) InterfaceList.subInterfaces.get((long) local14169);
							if (local14176 == null) {
								isp = local14166 + 1;
								intStack[local14166] = 0;
							} else {
								isp = local14166 + 1;
								intStack[local14166] = 1;
							}
							continue;
						}
						if (opcode == 2703) {
							@Pc(14202) int local14202 = isp - 1;
							@Pc(14206) Component local14206 = InterfaceList.getComponent(intStack[local14202]);
							if (local14206.aClass185Array4 == null) {
								isp = local14202 + 1;
								intStack[local14202] = 0;
								continue;
							}
							@Pc(14221) int local14221 = local14206.aClass185Array4.length;
							for (@Pc(14223) int local14223 = 0; local14223 < local14206.aClass185Array4.length; local14223++) {
								if (local14206.aClass185Array4[local14223] == null) {
									local14221 = local14223;
									break;
								}
							}
							isp = local14202 + 1;
							intStack[local14202] = local14221;
							continue;
						}
						if (opcode == 2704 || opcode == 2705) {
							@Pc(14255) int local14255 = isp - 2;
							@Pc(14259) int local14259 = intStack[local14255];
							@Pc(14265) int local14265 = intStack[local14255 + 1];
							@Pc(14272) SubInterface local14272 = (SubInterface) InterfaceList.subInterfaces.get((long) local14259);
							if (local14272 != null && local14272.id == local14265) {
								isp = local14255 + 1;
								intStack[local14255] = 1;
								continue;
							}
							isp = local14255 + 1;
							intStack[local14255] = 0;
							continue;
						}
					} else if (opcode < 2900) {
						isp--;
						@Pc(3273) Component local3273 = InterfaceList.getComponent(intStack[isp]);
						if (opcode == 2800) {
							intStack[isp++] = InterfaceList.getServerActiveProperties(local3273).getTargetMask();
							continue;
						}
						if (opcode == 2801) {
							isp--;
							@Pc(3297) int local3297 = intStack[isp];
							local3297--;
							if (local3273.aStringArray43 != null && local3297 < local3273.aStringArray43.length && local3273.aStringArray43[local3297] != null) {
								stringStack[ssp++] = local3273.aStringArray43[local3297];
								continue;
							}
							stringStack[ssp++] = "";
							continue;
						}
						if (opcode == 2802) {
							if (local3273.aString352 == null) {
								stringStack[ssp++] = "";
							} else {
								stringStack[ssp++] = local3273.aString352;
							}
							continue;
						}
					} else if (opcode < 3200) {
						if (opcode == 3100) {
							ssp--;
							@Pc(13872) String local13872 = stringStack[ssp];
							Static26.method4357("", 0, local13872);
							continue;
						}
						if (opcode == 3101) {
							isp -= 2;
							Static38.method4793(PlayerList.self, intStack[isp], intStack[isp + 1]);
							continue;
						}
						if (opcode == 3103) {
							Static21.method2063();
							continue;
						}
						if (opcode == 3104) {
							ssp--;
							@Pc(13921) String local13921 = stringStack[ssp];
							@Pc(13923) int local13923 = 0;
							if (StringUtils.isInt(local13921)) {
								local13923 = StringUtils.parseInt(local13921);
							}
							Protocol.outboundBuffer.writeOpcode(219);
							Protocol.outboundBuffer.writeInt(local13923);
							continue;
						}
						if (opcode == 3105) {
							ssp--;
							@Pc(13955) String local13955 = stringStack[ssp];
							Protocol.outboundBuffer.writeOpcode(149);
							Protocol.outboundBuffer.writeLong(Base37.encode(local13955));
							continue;
						}
						if (opcode == 3106) {
							ssp--;
							@Pc(13986) String local13986 = stringStack[ssp];
							Protocol.outboundBuffer.writeOpcode(164);
							Protocol.outboundBuffer.writeByte(local13986.length() + 1);
							Protocol.outboundBuffer.writeString(local13986);
							continue;
						}
						if (opcode == 3107) {
							isp--;
							@Pc(14014) int local14014 = intStack[isp];
							ssp--;
							@Pc(14019) String local14019 = stringStack[ssp];
							Static8.method7(local14014, local14019);
							continue;
						}
						if (opcode == 3108) {
							isp -= 3;
							@Pc(14033) int local14033 = intStack[isp];
							@Pc(14039) int local14039 = intStack[isp + 2];
							@Pc(14045) int local14045 = intStack[isp + 1];
							@Pc(14049) Component local14049 = InterfaceList.getComponent(local14039);
							Static15.method1401(local14049, local14033, local14045);
							continue;
						}
						if (opcode == 3109) {
							isp -= 2;
							@Pc(14069) int local14069 = intStack[isp + 1];
							@Pc(14073) int local14073 = intStack[isp];
							@Pc(14079) Component local14079 = local846 ? Static3.aClass185_8 : Static4.aClass185_9;
							Static15.method1401(local14079, local14073, local14069);
							continue;
						}
						if (opcode == 3110) {
							isp--;
							@Pc(14098) int local14098 = intStack[isp];
							Protocol.outboundBuffer.writeOpcode(231);
							Protocol.outboundBuffer.writeShort(local14098);
							continue;
						}
					} else if (opcode < 3300) {
						if (opcode == 3200) {
							isp -= 3;
							Static15.method1227(intStack[isp + 2], intStack[isp], intStack[isp + 1], 255);
							continue;
						}
						if (opcode == 3201) {
							isp--;
							Static36.method4444(255, intStack[isp]);
							continue;
						}
						if (opcode == 3202) {
							isp -= 2;
							Static23.method1933(255, intStack[isp + 1], intStack[isp]);
							continue;
						}
					} else if (opcode < 3400) {
						if (opcode == 3300) {
							intStack[isp++] = client.loop;
							continue;
						}
						if (opcode == 3301) {
							@Pc(13111) int local13111 = isp - 2;
							@Pc(13117) int local13117 = intStack[local13111 + 1];
							@Pc(13121) int local13121 = intStack[local13111];
							isp = local13111 + 1;
							intStack[local13111] = Inv.getItemType(local13121, local13117);
							continue;
						}
						if (opcode == 3302) {
							@Pc(13138) int local13138 = isp - 2;
							@Pc(13142) int local13142 = intStack[local13138];
							@Pc(13148) int local13148 = intStack[local13138 + 1];
							isp = local13138 + 1;
							intStack[local13138] = Inv.getItemCount(local13142, local13148);
							continue;
						}
						if (opcode == 3303) {
							@Pc(13164) int local13164 = isp - 2;
							@Pc(13168) int local13168 = intStack[local13164];
							@Pc(13174) int local13174 = intStack[local13164 + 1];
							isp = local13164 + 1;
							intStack[local13164] = Inv.getSlotTotal(local13168, local13174);
							continue;
						}
						if (opcode == 3304) {
							@Pc(13191) int local13191 = isp - 1;
							@Pc(13194) int local13194 = intStack[local13191];
							isp = local13191 + 1;
							intStack[local13191] = InvTypeList.get(local13194).size;
							continue;
						}
						if (opcode == 3305) {
							@Pc(13209) int local13209 = isp - 1;
							@Pc(13212) int local13212 = intStack[local13209];
							isp = local13209 + 1;
							intStack[local13209] = Static7.anIntArray501[local13212];
							continue;
						}
						if (opcode == 3306) {
							@Pc(13227) int local13227 = isp - 1;
							@Pc(13230) int local13230 = intStack[local13227];
							isp = local13227 + 1;
							intStack[local13227] = Static7.anIntArray599[local13230];
							continue;
						}
						if (opcode == 3307) {
							@Pc(13245) int local13245 = isp - 1;
							@Pc(13248) int local13248 = intStack[local13245];
							isp = local13245 + 1;
							intStack[local13245] = Static7.anIntArray637[local13248];
							continue;
						}
						if (opcode == 3308) {
							@Pc(13263) int local13263 = Player.level;
							@Pc(13270) int local13270 = Static5.originX + (PlayerList.self.xFine >> 7);
							@Pc(13277) int local13277 = Static7.originZ + (PlayerList.self.zFine >> 7);
							intStack[isp++] = (local13270 << 14) + (local13263 << 28) + local13277;
							continue;
						}
						if (opcode == 3309) {
							@Pc(13299) int local13299 = isp - 1;
							@Pc(13302) int local13302 = intStack[local13299];
							isp = local13299 + 1;
							intStack[local13299] = local13302 >> 14 & 0x3FFF;
							continue;
						}
						if (opcode == 3310) {
							@Pc(13321) int local13321 = isp - 1;
							@Pc(13324) int local13324 = intStack[local13321];
							isp = local13321 + 1;
							intStack[local13321] = local13324 >> 28;
							continue;
						}
						if (opcode == 3311) {
							@Pc(13339) int local13339 = isp - 1;
							@Pc(13342) int local13342 = intStack[local13339];
							isp = local13339 + 1;
							intStack[local13339] = local13342 & 0x3FFF;
							continue;
						}
						if (opcode == 3312) {
							intStack[isp++] = LoginManager.mapMembers ? 1 : 0;
							continue;
						}
						if (opcode == 3313) {
							@Pc(13371) int local13371 = isp - 2;
							@Pc(13377) int local13377 = intStack[local13371 + 1];
							@Pc(13383) int local13383 = intStack[local13371] + 32768;
							isp = local13371 + 1;
							intStack[local13371] = Inv.getItemType(local13383, local13377);
							continue;
						}
						if (opcode == 3314) {
							@Pc(13398) int local13398 = isp - 2;
							@Pc(13404) int local13404 = intStack[local13398 + 1];
							@Pc(13410) int local13410 = intStack[local13398] + 32768;
							isp = local13398 + 1;
							intStack[local13398] = Inv.getItemCount(local13410, local13404);
							continue;
						}
						if (opcode == 3315) {
							@Pc(13424) int local13424 = isp - 2;
							@Pc(13430) int local13430 = intStack[local13424] + 32768;
							@Pc(13436) int local13436 = intStack[local13424 + 1];
							isp = local13424 + 1;
							intStack[local13424] = Inv.getSlotTotal(local13430, local13436);
							continue;
						}
						if (opcode == 3316) {
							if (LoginManager.staffModLevel >= 2) {
								intStack[isp++] = LoginManager.staffModLevel;
							} else {
								intStack[isp++] = 0;
							}
							continue;
						}
						if (opcode == 3317) {
							intStack[isp++] = Static5.anInt4329;
							continue;
						}
						if (opcode == 3318) {
							intStack[isp++] = client.worldId;
							continue;
						}
						if (opcode == 3321) {
							intStack[isp++] = Static2.anInt2248;
							continue;
						}
						if (opcode == 3322) {
							intStack[isp++] = Static3.anInt2048;
							continue;
						}
						if (opcode == 3323) {
							if (LoginManager.playerModLevel >= 5 && LoginManager.playerModLevel <= 9) {
								intStack[isp++] = 1;
								continue;
							}
							intStack[isp++] = 0;
							continue;
						}
						if (opcode == 3324) {
							if (LoginManager.playerModLevel >= 5 && LoginManager.playerModLevel <= 9) {
								intStack[isp++] = LoginManager.playerModLevel;
								continue;
							}
							intStack[isp++] = 0;
							continue;
						}
						if (opcode == 3325) {
							intStack[isp++] = LoginManager.playerMember ? 1 : 0;
							continue;
						}
						if (opcode == 3326) {
							intStack[isp++] = PlayerList.self.combatLevel;
							continue;
						}
						if (opcode == 3327) {
							intStack[isp++] = PlayerList.self.appearance.female ? 1 : 0;
							continue;
						}
						if (opcode == 3328) {
							intStack[isp++] = LoginManager.playerUnderage && !LoginManager.parentalChatConsent ? 1 : 0;
							continue;
						}
						if (opcode == 3329) {
							intStack[isp++] = LoginManager.mapQuickChat ? 1 : 0;
							continue;
						}
						if (opcode == 3330) {
							@Pc(13650) int local13650 = isp - 1;
							@Pc(13653) int local13653 = intStack[local13650];
							isp = local13650 + 1;
							intStack[local13650] = Inv.getFreeSpace(local13653);
							continue;
						}
						if (opcode == 3331) {
							@Pc(13668) int local13668 = isp - 2;
							@Pc(13674) int local13674 = intStack[local13668 + 1];
							@Pc(13678) int local13678 = intStack[local13668];
							isp = local13668 + 1;
							intStack[local13668] = Inv.getTotalParam(local13678, local13674, false);
							continue;
						}
						if (opcode == 3332) {
							@Pc(13694) int local13694 = isp - 2;
							@Pc(13700) int local13700 = intStack[local13694 + 1];
							@Pc(13704) int local13704 = intStack[local13694];
							isp = local13694 + 1;
							intStack[local13694] = Inv.getTotalParam(local13704, local13700, true);
							continue;
						}
						if (opcode == 3333) {
							intStack[isp++] = LoginManager.anInt1407;
							continue;
						}
						if (opcode == 3335) {
							intStack[isp++] = client.language;
							continue;
						}
						if (opcode == 3336) {
							@Pc(13748) int local13748 = isp - 4;
							@Pc(13752) int local13752 = intStack[local13748];
							@Pc(13758) int local13758 = intStack[local13748 + 1];
							@Pc(13764) int local13764 = intStack[local13748 + 2];
							local13752 += local13758 << 14;
							local13752 += local13764 << 28;
							@Pc(13782) int local13782 = intStack[local13748 + 3];
							local13752 += local13782;
							isp = local13748 + 1;
							intStack[local13748] = local13752;
							continue;
						}
						if (opcode == 3337) {
							intStack[isp++] = client.affiliate;
							continue;
						}
					} else if (opcode < 3500) {
						if (opcode == 3400) {
							isp -= 2;
							@Pc(3379) int local3379 = intStack[isp];
							@Pc(3385) int local3385 = intStack[isp + 1];
							@Pc(3389) EnumType local3389 = EnumTypeList.get(local3379);
							if (local3389.valueType == 's') {
							}
							stringStack[ssp++] = local3389.getString(local3385);
							continue;
						}
						if (opcode == 3408) {
							isp -= 4;
							@Pc(3414) int local3414 = intStack[isp + 1];
							@Pc(3418) int local3418 = intStack[isp];
							@Pc(3424) int local3424 = intStack[isp + 2];
							@Pc(3430) int local3430 = intStack[isp + 3];
							@Pc(3434) EnumType local3434 = EnumTypeList.get(local3424);
							if (local3418 == local3434.keyType && local3414 == local3434.valueType) {
								if (local3414 == 115) {
									stringStack[ssp++] = local3434.getString(local3430);
								} else {
									intStack[isp++] = local3434.getInt(local3430);
								}
								continue;
							}
							throw new RuntimeException("C3408-1");
						}
						if (opcode == 3409) {
							@Pc(3481) int local3481 = isp - 3;
							@Pc(3485) int local3485 = intStack[local3481];
							@Pc(3491) int local3491 = intStack[local3481 + 1];
							@Pc(3497) int local3497 = intStack[local3481 + 2];
							if (local3491 == -1) {
								throw new RuntimeException("C3409-2");
							}
							@Pc(3510) EnumType local3510 = EnumTypeList.get(local3491);
							if (local3510.valueType != local3485) {
								throw new RuntimeException("C3409-1");
							}
							isp = local3481 + 1;
							intStack[local3481] = local3510.containsValue(local3497) ? 1 : 0;
							continue;
						}
						if (opcode == 3410) {
							ssp--;
							@Pc(3545) String local3545 = stringStack[ssp];
							@Pc(3547) int local3547 = isp - 1;
							@Pc(3550) int local3550 = intStack[local3547];
							if (local3550 == -1) {
								throw new RuntimeException("C3410-2");
							}
							@Pc(3564) EnumType local3564 = EnumTypeList.get(local3550);
							if (local3564.valueType != 's') {
								throw new RuntimeException("C3410-1");
							}
							isp = local3547 + 1;
							intStack[local3547] = local3564.containsValue(local3545) ? 1 : 0;
							continue;
						}
						if (opcode == 3411) {
							@Pc(3597) int local3597 = isp - 1;
							@Pc(3600) int local3600 = intStack[local3597];
							@Pc(3604) EnumType local3604 = EnumTypeList.get(local3600);
							isp = local3597 + 1;
							intStack[local3597] = local3604.table.size();
							continue;
						}
					} else if (opcode < 3700) {
						if (opcode == 3600) {
							if (FriendsList.state == 0) {
								intStack[isp++] = -2;
							} else if (FriendsList.state == 1) {
								intStack[isp++] = -1;
							} else {
								intStack[isp++] = FriendsList.size;
							}
							continue;
						}
						if (opcode == 3601) {
							isp--;
							@Pc(12342) int local12342 = intStack[isp];
							if (FriendsList.state == 2 && local12342 < FriendsList.size) {
								stringStack[ssp++] = FriendsList.usernames[local12342];
								continue;
							}
							stringStack[ssp++] = "";
							continue;
						}
						if (opcode == 3602) {
							@Pc(12374) int local12374 = isp - 1;
							@Pc(12377) int local12377 = intStack[local12374];
							if (FriendsList.state == 2 && local12377 < FriendsList.size) {
								isp = local12374 + 1;
								intStack[local12374] = FriendsList.worlds[local12377];
								continue;
							}
							isp = local12374 + 1;
							intStack[local12374] = 0;
							continue;
						}
						if (opcode == 3603) {
							@Pc(12404) int local12404 = isp - 1;
							@Pc(12407) int local12407 = intStack[local12404];
							if (FriendsList.state == 2 && local12407 < FriendsList.size) {
								isp = local12404 + 1;
								intStack[local12404] = FriendsList.anIntArray517[local12407];
								continue;
							}
							isp = local12404 + 1;
							intStack[local12404] = 0;
							continue;
						}
						if (opcode == 3604) {
							ssp--;
							@Pc(12441) String local12441 = stringStack[ssp];
							isp--;
							@Pc(12446) int local12446 = intStack[isp];
							Static21.method2060(local12446, local12441);
							continue;
						}
						if (opcode == 3605) {
							ssp--;
							@Pc(12462) String local12462 = stringStack[ssp];
							FriendsList.add(Base37.encode(local12462));
							continue;
						}
						if (opcode == 3606) {
							ssp--;
							@Pc(12478) String local12478 = stringStack[ssp];
							FriendsList.remove(Base37.encode(local12478));
							continue;
						}
						if (opcode == 3607) {
							ssp--;
							@Pc(12499) String local12499 = stringStack[ssp];
							IgnoreList.add(Base37.encode(local12499), false);
							continue;
						}
						if (opcode == 3608) {
							ssp--;
							@Pc(12520) String local12520 = stringStack[ssp];
							IgnoreList.remove(Base37.encode(local12520));
							continue;
						}
						if (opcode == 3609) {
							ssp--;
							@Pc(12536) String local12536 = stringStack[ssp];
							if (local12536.startsWith("<img=0>") || local12536.startsWith("<img=1>")) {
								local12536 = local12536.substring(7);
							}
							intStack[isp++] = FriendsList.contains(local12536) ? 1 : 0;
							continue;
						}
						if (opcode == 3610) {
							isp--;
							@Pc(12571) int local12571 = intStack[isp];
							if (FriendsList.state == 2 && local12571 < FriendsList.size) {
								stringStack[ssp++] = FriendsList.worldNames[local12571];
								continue;
							}
							stringStack[ssp++] = "";
							continue;
						}
						if (opcode == 3611) {
							if (Static2.aString108 == null) {
								stringStack[ssp++] = "";
							} else {
								stringStack[ssp++] = Static29.method3464(Static2.aString108);
							}
							continue;
						}
						if (opcode == 3612) {
							if (Static2.aString108 == null) {
								intStack[isp++] = 0;
							} else {
								intStack[isp++] = Static4.anInt3260;
							}
							continue;
						}
						if (opcode == 3613) {
							isp--;
							@Pc(12645) int local12645 = intStack[isp];
							if (Static2.aString108 != null && local12645 < Static4.anInt3260) {
								stringStack[ssp++] = Static29.method3464(Static6.clanMembers[local12645].username);
								continue;
							}
							stringStack[ssp++] = "";
							continue;
						}
						if (opcode == 3614) {
							@Pc(12678) int local12678 = isp - 1;
							@Pc(12681) int local12681 = intStack[local12678];
							if (Static2.aString108 != null && Static4.anInt3260 > local12681) {
								isp = local12678 + 1;
								intStack[local12678] = Static6.clanMembers[local12681].world;
								continue;
							}
							isp = local12678 + 1;
							intStack[local12678] = 0;
							continue;
						}
						if (opcode == 3615) {
							@Pc(12716) int local12716 = isp - 1;
							@Pc(12719) int local12719 = intStack[local12716];
							if (Static2.aString108 != null && Static4.anInt3260 > local12719) {
								isp = local12716 + 1;
								intStack[local12716] = Static6.clanMembers[local12719].rank;
								continue;
							}
							isp = local12716 + 1;
							intStack[local12716] = 0;
							continue;
						}
						if (opcode == 3616) {
							intStack[isp++] = Static4.aByte6;
							continue;
						}
						if (opcode == 3617) {
							ssp--;
							@Pc(12761) String local12761 = stringStack[ssp];
							Static34.method4236(local12761);
							continue;
						}
						if (opcode == 3618) {
							intStack[isp++] = Static5.aByte13;
							continue;
						}
						if (opcode == 3619) {
							ssp--;
							@Pc(12786) String local12786 = stringStack[ssp];
							Static29.method3475(Base37.encode(local12786));
							continue;
						}
						if (opcode == 3620) {
							Static12.method685();
							continue;
						}
						if (opcode == 3621) {
							if (FriendsList.state == 0) {
								intStack[isp++] = -1;
							} else {
								intStack[isp++] = IgnoreList.size;
							}
							continue;
						}
						if (opcode == 3622) {
							isp--;
							@Pc(12831) int local12831 = intStack[isp];
							if (FriendsList.state != 0 && IgnoreList.size > local12831) {
								stringStack[ssp++] = Base37.decodeTitleCase(IgnoreList.encodedUsernames[local12831]);
								continue;
							}
							stringStack[ssp++] = "";
							continue;
						}
						if (opcode == 3623) {
							ssp--;
							@Pc(12863) String local12863 = stringStack[ssp];
							if (local12863.startsWith("<img=0>") || local12863.startsWith("<img=1>")) {
								local12863 = local12863.substring(7);
							}
							intStack[isp++] = IgnoreList.contains(local12863) ? 1 : 0;
							continue;
						}
						if (opcode == 3624) {
							@Pc(12894) int local12894 = isp - 1;
							@Pc(12897) int local12897 = intStack[local12894];
							if (Static6.clanMembers != null && local12897 < Static4.anInt3260 && Static6.clanMembers[local12897].username.equalsIgnoreCase(PlayerList.self.name)) {
								isp = local12894 + 1;
								intStack[local12894] = 1;
								continue;
							}
							isp = local12894 + 1;
							intStack[local12894] = 0;
							continue;
						}
						if (opcode == 3625) {
							if (Static6.aString268 == null) {
								stringStack[ssp++] = "";
							} else {
								stringStack[ssp++] = Static29.method3464(Static6.aString268);
							}
							continue;
						}
						if (opcode == 3626) {
							isp--;
							@Pc(12954) int local12954 = intStack[isp];
							if (Static2.aString108 != null && Static4.anInt3260 > local12954) {
								stringStack[ssp++] = Static6.clanMembers[local12954].worldName;
								continue;
							}
							stringStack[ssp++] = "";
							continue;
						}
						if (opcode == 3627) {
							@Pc(12981) int local12981 = isp - 1;
							@Pc(12984) int local12984 = intStack[local12981];
							if (FriendsList.state == 2 && local12984 >= 0 && FriendsList.size > local12984) {
								isp = local12981 + 1;
								intStack[local12981] = FriendsList.aBooleanArray7[local12984] ? 1 : 0;
								continue;
							}
							isp = local12981 + 1;
							intStack[local12981] = 0;
							continue;
						}
						if (opcode == 3628) {
							ssp--;
							@Pc(13020) String local13020 = stringStack[ssp];
							if (local13020.startsWith("<img=0>") || local13020.startsWith("<img=1>")) {
								local13020 = local13020.substring(7);
							}
							intStack[isp++] = FriendsList.indexOf(local13020);
							continue;
						}
						if (opcode == 3629) {
							intStack[isp++] = client.country;
							continue;
						}
						if (opcode == 3630) {
							ssp--;
							@Pc(13064) String local13064 = stringStack[ssp];
							IgnoreList.add(Base37.encode(local13064), true);
							continue;
						}
						if (opcode == 3631) {
							@Pc(13079) int local13079 = isp - 1;
							@Pc(13082) int local13082 = intStack[local13079];
							isp = local13079 + 1;
							intStack[local13079] = IgnoreList.aBooleanArray5[local13082] ? 1 : 0;
							continue;
						}
					} else if (opcode < 4000) {
						if (opcode == 3903) {
							@Pc(3628) int local3628 = isp - 1;
							@Pc(3631) int local3631 = intStack[local3628];
							isp = local3628 + 1;
							intStack[local3628] = StockMarketManager.offers[local3631].getType();
							continue;
						}
						if (opcode == 3904) {
							@Pc(3650) int local3650 = isp - 1;
							@Pc(3653) int local3653 = intStack[local3650];
							isp = local3650 + 1;
							intStack[local3650] = StockMarketManager.offers[local3653].item;
							continue;
						}
						if (opcode == 3905) {
							@Pc(3670) int local3670 = isp - 1;
							@Pc(3673) int local3673 = intStack[local3670];
							isp = local3670 + 1;
							intStack[local3670] = StockMarketManager.offers[local3673].price;
							continue;
						}
						if (opcode == 3906) {
							@Pc(3690) int local3690 = isp - 1;
							@Pc(3693) int local3693 = intStack[local3690];
							isp = local3690 + 1;
							intStack[local3690] = StockMarketManager.offers[local3693].count;
							continue;
						}
						if (opcode == 3907) {
							@Pc(3708) int local3708 = isp - 1;
							@Pc(3711) int local3711 = intStack[local3708];
							isp = local3708 + 1;
							intStack[local3708] = StockMarketManager.offers[local3711].completedCount;
							continue;
						}
						if (opcode == 3908) {
							@Pc(3726) int local3726 = isp - 1;
							@Pc(3729) int local3729 = intStack[local3726];
							isp = local3726 + 1;
							intStack[local3726] = StockMarketManager.offers[local3729].completedGold;
							continue;
						}
						if (opcode == 3910) {
							@Pc(3745) int local3745 = isp - 1;
							@Pc(3748) int local3748 = intStack[local3745];
							@Pc(3754) int local3754 = StockMarketManager.offers[local3748].getStatus();
							isp = local3745 + 1;
							intStack[local3745] = local3754 == 0 ? 1 : 0;
							continue;
						}
						if (opcode == 3911) {
							@Pc(3776) int local3776 = isp - 1;
							@Pc(3779) int local3779 = intStack[local3776];
							@Pc(3785) int local3785 = StockMarketManager.offers[local3779].getStatus();
							isp = local3776 + 1;
							intStack[local3776] = local3785 == 2 ? 1 : 0;
							continue;
						}
						if (opcode == 3912) {
							@Pc(3803) int local3803 = isp - 1;
							@Pc(3806) int local3806 = intStack[local3803];
							@Pc(3814) int local3814 = StockMarketManager.offers[local3806].getStatus();
							isp = local3803 + 1;
							intStack[local3803] = local3814 == 5 ? 1 : 0;
							continue;
						}
						if (opcode == 3913) {
							@Pc(3835) int local3835 = isp - 1;
							@Pc(3838) int local3838 = intStack[local3835];
							@Pc(3844) int local3844 = StockMarketManager.offers[local3838].getStatus();
							isp = local3835 + 1;
							intStack[local3835] = local3844 == 1 ? 1 : 0;
							continue;
						}
					} else if (opcode < 4100) {
						if (opcode == 4000) {
							@Pc(11734) int local11734 = isp - 2;
							@Pc(11740) int local11740 = intStack[local11734 + 1];
							@Pc(11744) int local11744 = intStack[local11734];
							isp = local11734 + 1;
							intStack[local11734] = local11744 + local11740;
							continue;
						}
						if (opcode == 4001) {
							@Pc(11758) int local11758 = isp - 2;
							@Pc(11762) int local11762 = intStack[local11758];
							@Pc(11768) int local11768 = intStack[local11758 + 1];
							isp = local11758 + 1;
							intStack[local11758] = local11762 - local11768;
							continue;
						}
						if (opcode == 4002) {
							@Pc(11784) int local11784 = isp - 2;
							@Pc(11788) int local11788 = intStack[local11784];
							@Pc(11794) int local11794 = intStack[local11784 + 1];
							isp = local11784 + 1;
							intStack[local11784] = local11788 * local11794;
							continue;
						}
						if (opcode == 4003) {
							@Pc(11810) int local11810 = isp - 2;
							@Pc(11816) int local11816 = intStack[local11810 + 1];
							@Pc(11820) int local11820 = intStack[local11810];
							isp = local11810 + 1;
							intStack[local11810] = local11820 / local11816;
							continue;
						}
						if (opcode == 4004) {
							@Pc(11835) int local11835 = isp - 1;
							@Pc(11838) int local11838 = intStack[local11835];
							isp = local11835 + 1;
							intStack[local11835] = (int) ((double) local11838 * Math.random());
							continue;
						}
						if (opcode == 4005) {
							@Pc(11856) int local11856 = isp - 1;
							@Pc(11859) int local11859 = intStack[local11856];
							isp = local11856 + 1;
							intStack[local11856] = (int) ((double) (local11859 + 1) * Math.random());
							continue;
						}
						if (opcode == 4006) {
							@Pc(11876) int local11876 = isp - 5;
							@Pc(11880) int local11880 = intStack[local11876];
							@Pc(11886) int local11886 = intStack[local11876 + 2];
							@Pc(11892) int local11892 = intStack[local11876 + 3];
							@Pc(11898) int local11898 = intStack[local11876 + 1];
							@Pc(11904) int local11904 = intStack[local11876 + 4];
							isp = local11876 + 1;
							intStack[local11876] = (local11904 - local11886) * (local11898 - local11880) / (local11892 - local11886) + local11880;
							continue;
						}
						if (opcode == 4007) {
							@Pc(11930) int local11930 = isp - 2;
							@Pc(11935) long local11935 = (long) intStack[local11930];
							@Pc(11942) long local11942 = (long) intStack[local11930 + 1];
							isp = local11930 + 1;
							intStack[local11930] = (int) (local11942 * local11935 / 100L + local11935);
							continue;
						}
						if (opcode == 4008) {
							@Pc(11962) int local11962 = isp - 2;
							@Pc(11966) int local11966 = intStack[local11962];
							@Pc(11972) int local11972 = intStack[local11962 + 1];
							isp = local11962 + 1;
							intStack[local11962] = 0x1 << local11972 | local11966;
							continue;
						}
						if (opcode == 4009) {
							@Pc(11987) int local11987 = isp - 2;
							@Pc(11991) int local11991 = intStack[local11987];
							@Pc(11997) int local11997 = intStack[local11987 + 1];
							isp = local11987 + 1;
							intStack[local11987] = -(0x1 << local11997) - 1 & local11991;
							continue;
						}
						if (opcode == 4010) {
							@Pc(12016) int local12016 = isp - 2;
							@Pc(12020) int local12020 = intStack[local12016];
							@Pc(12026) int local12026 = intStack[local12016 + 1];
							isp = local12016 + 1;
							intStack[local12016] = (local12020 & 0x1 << local12026) == 0 ? 0 : 1;
							continue;
						}
						if (opcode == 4011) {
							@Pc(12048) int local12048 = isp - 2;
							@Pc(12052) int local12052 = intStack[local12048];
							@Pc(12058) int local12058 = intStack[local12048 + 1];
							isp = local12048 + 1;
							intStack[local12048] = local12052 % local12058;
							continue;
						}
						if (opcode == 4012) {
							@Pc(12072) int local12072 = isp - 2;
							@Pc(12076) int local12076 = intStack[local12072];
							@Pc(12082) int local12082 = intStack[local12072 + 1];
							if (local12076 == 0) {
								isp = local12072 + 1;
								intStack[local12072] = 0;
							} else {
								isp = local12072 + 1;
								intStack[local12072] = (int) Math.pow((double) local12076, (double) local12082);
							}
							continue;
						}
						if (opcode == 4013) {
							@Pc(12110) int local12110 = isp - 2;
							@Pc(12114) int local12114 = intStack[local12110];
							@Pc(12120) int local12120 = intStack[local12110 + 1];
							if (local12114 == 0) {
								isp = local12110 + 1;
								intStack[local12110] = 0;
							} else if (local12120 == 0) {
								isp = local12110 + 1;
								intStack[local12110] = Integer.MAX_VALUE;
							} else {
								isp = local12110 + 1;
								intStack[local12110] = (int) Math.pow((double) local12114, 1.0D / (double) local12120);
							}
							continue;
						}
						if (opcode == 4014) {
							@Pc(12160) int local12160 = isp - 2;
							@Pc(12164) int local12164 = intStack[local12160];
							@Pc(12170) int local12170 = intStack[local12160 + 1];
							isp = local12160 + 1;
							intStack[local12160] = local12170 & local12164;
							continue;
						}
						if (opcode == 4015) {
							@Pc(12185) int local12185 = isp - 2;
							@Pc(12191) int local12191 = intStack[local12185 + 1];
							@Pc(12195) int local12195 = intStack[local12185];
							isp = local12185 + 1;
							intStack[local12185] = local12191 | local12195;
							continue;
						}
						if (opcode == 4016) {
							@Pc(12209) int local12209 = isp - 2;
							@Pc(12213) int local12213 = intStack[local12209];
							@Pc(12219) int local12219 = intStack[local12209 + 1];
							isp = local12209 + 1;
							intStack[local12209] = local12219 <= local12213 ? local12219 : local12213;
							continue;
						}
						if (opcode == 4017) {
							@Pc(12235) int local12235 = isp - 2;
							@Pc(12239) int local12239 = intStack[local12235];
							@Pc(12245) int local12245 = intStack[local12235 + 1];
							isp = local12235 + 1;
							intStack[local12235] = local12239 > local12245 ? local12239 : local12245;
							continue;
						}
						if (opcode == 4018) {
							@Pc(12266) int local12266 = isp - 3;
							@Pc(12271) long local12271 = (long) intStack[local12266];
							@Pc(12278) long local12278 = (long) intStack[local12266 + 2];
							@Pc(12285) long local12285 = (long) intStack[local12266 + 1];
							isp = local12266 + 1;
							intStack[local12266] = (int) (local12278 * local12271 / local12285);
							continue;
						}
					} else if (opcode < 4200) {
						if (opcode == 4100) {
							@Pc(10985) int local10985 = ssp - 1;
							@Pc(10988) String local10988 = stringStack[local10985];
							isp--;
							@Pc(10993) int local10993 = intStack[isp];
							ssp = local10985 + 1;
							stringStack[local10985] = local10988 + local10993;
							continue;
						}
						if (opcode == 4101) {
							@Pc(11013) int local11013 = ssp - 2;
							@Pc(11017) String local11017 = stringStack[local11013];
							@Pc(11023) String local11023 = stringStack[local11013 + 1];
							ssp = local11013 + 1;
							stringStack[local11013] = local11017 + local11023;
							continue;
						}
						if (opcode == 4102) {
							isp--;
							@Pc(11048) int local11048 = intStack[isp];
							@Pc(11050) int local11050 = ssp - 1;
							@Pc(11053) String local11053 = stringStack[local11050];
							ssp = local11050 + 1;
							stringStack[local11050] = local11053 + IntUtils.toString(local11048);
							continue;
						}
						if (opcode == 4103) {
							@Pc(11075) int local11075 = ssp - 1;
							@Pc(11078) String local11078 = stringStack[local11075];
							ssp = local11075 + 1;
							stringStack[local11075] = local11078.toLowerCase();
							continue;
						}
						if (opcode == 4104) {
							isp--;
							@Pc(11097) int local11097 = intStack[isp];
							@Pc(11104) long local11104 = (long) local11097 * 86400000L + 1014768000000L;
							Static7.aCalendar2.setTime(new Date(local11104));
							@Pc(11114) int local11114 = Static7.aCalendar2.get(5);
							@Pc(11118) int local11118 = Static7.aCalendar2.get(2);
							@Pc(11122) int local11122 = Static7.aCalendar2.get(1);
							stringStack[ssp++] = local11114 + "-" + Static6.aStringArray25[local11118] + "-" + local11122;
							continue;
						}
						if (opcode == 4105) {
							@Pc(11151) int local11151 = ssp - 2;
							@Pc(11157) String local11157 = stringStack[local11151 + 1];
							@Pc(11161) String local11161 = stringStack[local11151];
							if (PlayerList.self.appearance != null && PlayerList.self.appearance.female) {
								ssp = local11151 + 1;
								stringStack[local11151] = local11157;
								continue;
							}
							ssp = local11151 + 1;
							stringStack[local11151] = local11161;
							continue;
						}
						if (opcode == 4106) {
							isp--;
							@Pc(11192) int local11192 = intStack[isp];
							stringStack[ssp++] = Integer.toString(local11192);
							continue;
						}
						if (opcode == 4107) {
							ssp -= 2;
							intStack[isp++] = IntUtils.signum(StringUtils.compare(stringStack[ssp], stringStack[ssp + 1], client.language));
							continue;
						}
						if (opcode == 4108) {
							@Pc(11229) int local11229 = isp - 2;
							@Pc(11235) int local11235 = intStack[local11229 + 1];
							@Pc(11239) int local11239 = intStack[local11229];
							ssp--;
							@Pc(11244) String local11244 = stringStack[ssp];
							isp = local11229 + 1;
							intStack[local11229] = Static31.method3656(local11235).method2274(local11244, local11239);
							continue;
						}
						if (opcode == 4109) {
							@Pc(11260) int local11260 = isp - 2;
							ssp--;
							@Pc(11265) String local11265 = stringStack[ssp];
							@Pc(11269) int local11269 = intStack[local11260];
							@Pc(11275) int local11275 = intStack[local11260 + 1];
							isp = local11260 + 1;
							intStack[local11260] = Static31.method3656(local11275).method2261(local11265, local11269);
							continue;
						}
						if (opcode == 4110) {
							@Pc(11292) int local11292 = ssp - 2;
							@Pc(11296) String local11296 = stringStack[local11292];
							@Pc(11302) String local11302 = stringStack[local11292 + 1];
							isp--;
							if (intStack[isp] == 1) {
								ssp = local11292 + 1;
								stringStack[local11292] = local11296;
							} else {
								ssp = local11292 + 1;
								stringStack[local11292] = local11302;
							}
							continue;
						}
						if (opcode == 4111) {
							@Pc(11329) int local11329 = ssp - 1;
							@Pc(11332) String local11332 = stringStack[local11329];
							ssp = local11329 + 1;
							stringStack[local11329] = StringUtils.escape(local11332);
							continue;
						}
						if (opcode == 4112) {
							@Pc(11347) int local11347 = ssp - 1;
							@Pc(11350) String local11350 = stringStack[local11347];
							isp--;
							@Pc(11355) int local11355 = intStack[isp];
							if (local11355 == -1) {
								throw new RuntimeException("null char");
							}
							ssp = local11347 + 1;
							stringStack[local11347] = local11350 + (char) local11355;
							continue;
						}
						if (opcode == 4113) {
							@Pc(11387) int local11387 = isp - 1;
							@Pc(11390) int local11390 = intStack[local11387];
							isp = local11387 + 1;
							intStack[local11387] = Cp1252Charset.isPrintable((char) local11390) ? 1 : 0;
							continue;
						}
						if (opcode == 4114) {
							@Pc(11412) int local11412 = isp - 1;
							@Pc(11415) int local11415 = intStack[local11412];
							isp = local11412 + 1;
							intStack[local11412] = CharUtils.isLetterOrDigit((char) local11415) ? 1 : 0;
							continue;
						}
						if (opcode == 4115) {
							@Pc(11434) int local11434 = isp - 1;
							@Pc(11437) int local11437 = intStack[local11434];
							isp = local11434 + 1;
							intStack[local11434] = CharUtils.isLetter((char) local11437) ? 1 : 0;
							continue;
						}
						if (opcode == 4116) {
							@Pc(11456) int local11456 = isp - 1;
							@Pc(11459) int local11459 = intStack[local11456];
							isp = local11456 + 1;
							intStack[local11456] = CharUtils.isDigit((char) local11459) ? 1 : 0;
							continue;
						}
						if (opcode == 4117) {
							ssp--;
							@Pc(11484) String local11484 = stringStack[ssp];
							if (local11484 == null) {
								intStack[isp++] = 0;
							} else {
								intStack[isp++] = local11484.length();
							}
							continue;
						}
						if (opcode == 4118) {
							isp -= 2;
							@Pc(11510) int local11510 = ssp - 1;
							@Pc(11513) String local11513 = stringStack[local11510];
							@Pc(11517) int local11517 = intStack[isp];
							@Pc(11523) int local11523 = intStack[isp + 1];
							ssp = local11510 + 1;
							stringStack[local11510] = local11513.substring(local11517, local11523);
							continue;
						}
						if (opcode == 4119) {
							@Pc(11539) int local11539 = ssp - 1;
							@Pc(11542) String local11542 = stringStack[local11539];
							@Pc(11544) boolean local11544 = false;
							@Pc(11550) StringBuffer local11550 = new StringBuffer(local11542.length());
							for (@Pc(11552) int local11552 = 0; local11552 < local11542.length(); local11552++) {
								@Pc(11564) char local11564 = local11542.charAt(local11552);
								if (local11564 == '<') {
									local11544 = true;
								} else if (local11564 == '>') {
									local11544 = false;
								} else if (!local11544) {
									local11550.append(local11564);
								}
							}
							ssp = local11539 + 1;
							stringStack[local11539] = local11550.toString();
							continue;
						}
						if (opcode == 4120) {
							@Pc(11602) int local11602 = isp - 2;
							ssp--;
							@Pc(11607) String local11607 = stringStack[ssp];
							@Pc(11611) int local11611 = intStack[local11602];
							@Pc(11617) int local11617 = intStack[local11602 + 1];
							isp = local11602 + 1;
							intStack[local11602] = local11607.indexOf(local11611, local11617);
							continue;
						}
						if (opcode == 4121) {
							@Pc(11634) int local11634 = isp - 1;
							@Pc(11637) int local11637 = intStack[local11634];
							ssp -= 2;
							@Pc(11642) String local11642 = stringStack[ssp];
							@Pc(11648) String local11648 = stringStack[ssp + 1];
							isp = local11634 + 1;
							intStack[local11634] = local11642.indexOf(local11648, local11637);
							continue;
						}
						if (opcode == 4122) {
							@Pc(11665) int local11665 = isp - 1;
							@Pc(11668) int local11668 = intStack[local11665];
							isp = local11665 + 1;
							intStack[local11665] = Character.toLowerCase((char) local11668);
							continue;
						}
						if (opcode == 4123) {
							@Pc(11683) int local11683 = isp - 1;
							@Pc(11686) int local11686 = intStack[local11683];
							isp = local11683 + 1;
							intStack[local11683] = Character.toUpperCase((char) local11686);
							continue;
						}
						if (opcode == 4124) {
							@Pc(11703) int local11703 = isp - 1;
							@Pc(11712) boolean local11712 = intStack[local11703] != 0;
							isp = local11703 - 1;
							@Pc(11717) int local11717 = intStack[isp];
							stringStack[ssp++] = LongUtils.fixedPointToString((long) local11717, local11712, 0, client.language);
							continue;
						}
					} else if (opcode < 4300) {
						if (opcode == 4200) {
							isp--;
							@Pc(10588) int local10588 = intStack[isp];
							stringStack[ssp++] = ObjTypeList.get(local10588).name;
							continue;
						}
						if (opcode == 4201) {
							isp -= 2;
							@Pc(10609) int local10609 = intStack[isp + 1];
							@Pc(10613) int local10613 = intStack[isp];
							@Pc(10617) ObjType local10617 = ObjTypeList.get(local10613);
							if (local10609 >= 1 && local10609 <= 5 && local10617.ops[local10609 - 1] != null) {
								stringStack[ssp++] = local10617.ops[local10609 - 1];
								continue;
							}
							stringStack[ssp++] = "";
							continue;
						}
						if (opcode == 4202) {
							isp -= 2;
							@Pc(10662) int local10662 = intStack[isp];
							@Pc(10668) int local10668 = intStack[isp + 1];
							@Pc(10672) ObjType local10672 = ObjTypeList.get(local10662);
							if (local10668 >= 1 && local10668 <= 5 && local10672.inventoryOps[local10668 - 1] != null) {
								stringStack[ssp++] = local10672.inventoryOps[local10668 - 1];
								continue;
							}
							stringStack[ssp++] = "";
							continue;
						}
						if (opcode == 4203) {
							@Pc(10712) int local10712 = isp - 1;
							@Pc(10715) int local10715 = intStack[local10712];
							isp = local10712 + 1;
							intStack[local10712] = ObjTypeList.get(local10715).cost;
							continue;
						}
						if (opcode == 4204) {
							@Pc(10732) int local10732 = isp - 1;
							@Pc(10735) int local10735 = intStack[local10732];
							isp = local10732 + 1;
							intStack[local10732] = ObjTypeList.get(local10735).stackable == 1 ? 1 : 0;
							continue;
						}
						if (opcode == 4205) {
							@Pc(10760) int local10760 = isp - 1;
							@Pc(10763) int local10763 = intStack[local10760];
							@Pc(10767) ObjType local10767 = ObjTypeList.get(local10763);
							if (local10767.certificateTemplate == -1 && local10767.certificateLink >= 0) {
								isp = local10760 + 1;
								intStack[local10760] = local10767.certificateLink;
								continue;
							}
							isp = local10760 + 1;
							intStack[local10760] = local10763;
							continue;
						}
						if (opcode == 4206) {
							@Pc(10797) int local10797 = isp - 1;
							@Pc(10800) int local10800 = intStack[local10797];
							@Pc(10804) ObjType local10804 = ObjTypeList.get(local10800);
							if (local10804.certificateTemplate >= 0 && local10804.certificateLink >= 0) {
								isp = local10797 + 1;
								intStack[local10797] = local10804.certificateLink;
								continue;
							}
							isp = local10797 + 1;
							intStack[local10797] = local10800;
							continue;
						}
						if (opcode == 4207) {
							@Pc(10836) int local10836 = isp - 1;
							@Pc(10839) int local10839 = intStack[local10836];
							isp = local10836 + 1;
							intStack[local10836] = ObjTypeList.get(local10839).members ? 1 : 0;
							continue;
						}
						if (opcode == 4208) {
							isp -= 2;
							@Pc(10865) int local10865 = intStack[isp + 1];
							@Pc(10869) int local10869 = intStack[isp];
							@Pc(10873) ParamType local10873 = ParamTypeList.get(local10865);
							if (local10873.isString()) {
								stringStack[ssp++] = ObjTypeList.get(local10869).getParam(local10865, local10873.defaultString);
							} else {
								intStack[isp++] = ObjTypeList.get(local10869).getParam(local10865, local10873.defaultInt);
							}
							continue;
						}
						if (opcode == 4210) {
							ssp--;
							@Pc(10915) String local10915 = stringStack[ssp];
							@Pc(10917) int local10917 = isp - 1;
							@Pc(10920) int local10920 = intStack[local10917];
							Static30.method3598(local10915, local10920 == 1);
							isp = local10917 + 1;
							intStack[local10917] = Static2.anInt5734;
							continue;
						}
						if (opcode == 4211) {
							if (Static7.aShortArray114 != null && Static2.anInt5734 > Static4.anInt3497) {
								intStack[isp++] = Static7.aShortArray114[Static4.anInt3497++] & 0xFFFF;
								continue;
							}
							intStack[isp++] = -1;
							continue;
						}
						if (opcode == 4212) {
							Static4.anInt3497 = 0;
							continue;
						}
					} else if (opcode < 4400) {
						if (opcode == 4300) {
							isp -= 2;
							@Pc(3882) int local3882 = intStack[isp + 1];
							@Pc(3886) int local3886 = intStack[isp];
							@Pc(3890) ParamType local3890 = ParamTypeList.get(local3882);
							if (local3890.isString()) {
								stringStack[ssp++] = NpcTypeList.get(local3886).getParam(local3882, local3890.defaultString);
							} else {
								intStack[isp++] = NpcTypeList.get(local3886).getParam(local3882, local3890.defaultInt);
							}
							continue;
						}
					} else if (opcode >= 4500) {
						if (opcode >= 4600) {
							if (opcode < 5100) {
								if (opcode == 5000) {
									intStack[isp++] = Static7.anInt5413;
									continue;
								}
								if (opcode == 5001) {
									isp -= 3;
									Static7.anInt5413 = intStack[isp];
									Static6.anInt4837 = intStack[isp + 1];
									Static6.anInt5016 = intStack[isp + 2];
									Protocol.outboundBuffer.writeOpcode(234);
									Protocol.outboundBuffer.writeByte(Static7.anInt5413);
									Protocol.outboundBuffer.writeByte(Static6.anInt4837);
									Protocol.outboundBuffer.writeByte(Static6.anInt5016);
									continue;
								}
								if (opcode == 5002) {
									ssp--;
									@Pc(4007) String local4007 = stringStack[ssp];
									isp -= 2;
									@Pc(4012) int local4012 = intStack[isp];
									@Pc(4018) int local4018 = intStack[isp + 1];
									Protocol.outboundBuffer.writeOpcode(90);
									Protocol.outboundBuffer.writeLong(Base37.encode(local4007));
									Protocol.outboundBuffer.writeByte(local4012 - 1);
									Protocol.outboundBuffer.writeByte(local4018);
									continue;
								}
								if (opcode == 5003) {
									isp--;
									@Pc(4050) int local4050 = intStack[isp];
									@Pc(4052) String local4052 = null;
									if (local4050 < 100) {
										local4052 = Static6.aStringArray31[local4050];
									}
									if (local4052 == null) {
										local4052 = "";
									}
									stringStack[ssp++] = local4052;
									continue;
								}
								if (opcode == 5004) {
									@Pc(4077) int local4077 = -1;
									@Pc(4079) int local4079 = isp - 1;
									@Pc(4082) int local4082 = intStack[local4079];
									if (local4082 < 100 && Static6.aStringArray31[local4082] != null) {
										local4077 = Static5.anIntArray447[local4082];
									}
									isp = local4079 + 1;
									intStack[local4079] = local4077;
									continue;
								}
								if (opcode == 5005) {
									intStack[isp++] = Static6.anInt4837;
									continue;
								}
								if (opcode == 5008) {
									ssp--;
									@Pc(4125) String local4125 = stringStack[ssp];
									if (local4125.startsWith("::")) {
										Static27.method3185(local4125);
										continue;
									}
									if (LoginManager.staffModLevel == 0 && (LoginManager.playerUnderage && !LoginManager.parentalChatConsent || LoginManager.mapQuickChat)) {
										continue;
									}
									@Pc(4152) String local4152 = local4125.toLowerCase();
									@Pc(4154) byte local4154 = 0;
									@Pc(4156) byte local4156 = 0;
									if (local4152.startsWith(Text.CHATCOL0)) {
										local4125 = local4125.substring(Text.CHATCOL0.length());
										local4154 = 0;
									} else if (local4152.startsWith(Text.CHATCOL1)) {
										local4154 = 1;
										local4125 = local4125.substring(Text.CHATCOL1.length());
									} else if (local4152.startsWith(Text.CHATCOL2)) {
										local4125 = local4125.substring(Text.CHATCOL2.length());
										local4154 = 2;
									} else if (local4152.startsWith(Text.CHATCOL3)) {
										local4125 = local4125.substring(Text.CHATCOL3.length());
										local4154 = 3;
									} else if (local4152.startsWith(Text.CHATCOL4)) {
										local4125 = local4125.substring(Text.CHATCOL4.length());
										local4154 = 4;
									} else if (local4152.startsWith(Text.CHATCOL5)) {
										local4125 = local4125.substring(Text.CHATCOL5.length());
										local4154 = 5;
									} else if (local4152.startsWith(Text.CHATCOL6)) {
										local4125 = local4125.substring(Text.CHATCOL6.length());
										local4154 = 6;
									} else if (local4152.startsWith(Text.CHATCOL7)) {
										local4154 = 7;
										local4125 = local4125.substring(Text.CHATCOL7.length());
									} else if (local4152.startsWith(Text.CHATCOL8)) {
										local4125 = local4125.substring(Text.CHATCOL8.length());
										local4154 = 8;
									} else if (local4152.startsWith(Text.CHATCOL9)) {
										local4125 = local4125.substring(Text.CHATCOL9.length());
										local4154 = 9;
									} else if (local4152.startsWith(Text.CHATCOL10)) {
										local4154 = 10;
										local4125 = local4125.substring(Text.CHATCOL10.length());
									} else if (local4152.startsWith(Text.CHATCOL11)) {
										local4125 = local4125.substring(Text.CHATCOL11.length());
										local4154 = 11;
									} else if (client.language != 0) {
										if (local4152.startsWith(LocalisedText.CHATCOL0)) {
											local4125 = local4125.substring(LocalisedText.CHATCOL0.length());
											local4154 = 0;
										} else if (local4152.startsWith(LocalisedText.CHATCOL1)) {
											local4125 = local4125.substring(LocalisedText.CHATCOL1.length());
											local4154 = 1;
										} else if (local4152.startsWith(LocalisedText.CHATCOL2)) {
											local4154 = 2;
											local4125 = local4125.substring(LocalisedText.CHATCOL2.length());
										} else if (local4152.startsWith(LocalisedText.CHATCOL3)) {
											local4154 = 3;
											local4125 = local4125.substring(LocalisedText.CHATCOL3.length());
										} else if (local4152.startsWith(LocalisedText.CHATCOL4)) {
											local4154 = 4;
											local4125 = local4125.substring(LocalisedText.CHATCOL4.length());
										} else if (local4152.startsWith(LocalisedText.CHATCOL5)) {
											local4125 = local4125.substring(LocalisedText.CHATCOL5.length());
											local4154 = 5;
										} else if (local4152.startsWith(LocalisedText.CHATCOL6)) {
											local4125 = local4125.substring(LocalisedText.CHATCOL6.length());
											local4154 = 6;
										} else if (local4152.startsWith(LocalisedText.CHATCOL7)) {
											local4154 = 7;
											local4125 = local4125.substring(LocalisedText.CHATCOL7.length());
										} else if (local4152.startsWith(LocalisedText.CHATCOL8)) {
											local4125 = local4125.substring(LocalisedText.CHATCOL8.length());
											local4154 = 8;
										} else if (local4152.startsWith(LocalisedText.CHATCOL9)) {
											local4154 = 9;
											local4125 = local4125.substring(LocalisedText.CHATCOL9.length());
										} else if (local4152.startsWith(LocalisedText.CHATCOL10)) {
											local4125 = local4125.substring(LocalisedText.CHATCOL10.length());
											local4154 = 10;
										} else if (local4152.startsWith(LocalisedText.CHATCOL11)) {
											local4154 = 11;
											local4125 = local4125.substring(LocalisedText.CHATCOL11.length());
										}
									}
									@Pc(4473) String local4473 = local4125.toLowerCase();
									if (local4473.startsWith(Text.CHATEFFECT1)) {
										local4125 = local4125.substring(Text.CHATEFFECT1.length());
										local4156 = 1;
									} else if (local4473.startsWith(Text.CHATEFFECT2)) {
										local4156 = 2;
										local4125 = local4125.substring(Text.CHATEFFECT2.length());
									} else if (local4473.startsWith(Text.CHATEFFECT3)) {
										local4156 = 3;
										local4125 = local4125.substring(Text.CHATEFFECT3.length());
									} else if (local4473.startsWith(Text.CHATEFFECT4)) {
										local4125 = local4125.substring(Text.CHATEFFECT4.length());
										local4156 = 4;
									} else if (local4473.startsWith(Text.CHATEFFECT5)) {
										local4156 = 5;
										local4125 = local4125.substring(Text.CHATEFFECT5.length());
									} else if (client.language != 0) {
										if (local4473.startsWith(LocalisedText.CHATEFFECT1)) {
											local4125 = local4125.substring(LocalisedText.CHATEFFECT1.length());
											local4156 = 1;
										} else if (local4473.startsWith(LocalisedText.CHATEFFECT2)) {
											local4125 = local4125.substring(LocalisedText.CHATEFFECT2.length());
											local4156 = 2;
										} else if (local4473.startsWith(LocalisedText.CHATEFFECT3)) {
											local4156 = 3;
											local4125 = local4125.substring(LocalisedText.CHATEFFECT3.length());
										} else if (local4473.startsWith(LocalisedText.CHATEFFECT4)) {
											local4156 = 4;
											local4125 = local4125.substring(LocalisedText.CHATEFFECT4.length());
										} else if (local4473.startsWith(LocalisedText.CHATEFFECT5)) {
											local4125 = local4125.substring(LocalisedText.CHATEFFECT5.length());
											local4156 = 5;
										}
									}
									Protocol.outboundBuffer.writeOpcode(186);
									Protocol.outboundBuffer.writeByte(0);
									@Pc(4616) int local4616 = Protocol.outboundBuffer.position;
									Protocol.outboundBuffer.writeByte(local4154);
									Protocol.outboundBuffer.writeByte(local4156);
									WordPack.writeString(Protocol.outboundBuffer, local4125);
									Protocol.outboundBuffer.writeByteLength(Protocol.outboundBuffer.position - local4616);
									continue;
								}
								if (opcode == 5009) {
									ssp -= 2;
									@Pc(4647) String local4647 = stringStack[ssp];
									@Pc(4653) String local4653 = stringStack[ssp + 1];
									if (LoginManager.staffModLevel != 0 || (!LoginManager.playerUnderage || LoginManager.parentalChatConsent) && !LoginManager.mapQuickChat) {
										Protocol.outboundBuffer.writeOpcode(157);
										Protocol.outboundBuffer.writeByte(0);
										@Pc(4680) int local4680 = Protocol.outboundBuffer.position;
										Protocol.outboundBuffer.writeLong(Base37.encode(local4647));
										WordPack.writeString(Protocol.outboundBuffer, local4653);
										Protocol.outboundBuffer.writeByteLength(Protocol.outboundBuffer.position - local4680);
									}
									continue;
								}
								if (opcode == 5010) {
									@Pc(4708) String local4708 = null;
									isp--;
									@Pc(4713) int local4713 = intStack[isp];
									if (local4713 < 100) {
										local4708 = Static3.aStringArray16[local4713];
									}
									if (local4708 == null) {
										local4708 = "";
									}
									stringStack[ssp++] = local4708;
									continue;
								}
								if (opcode == 5011) {
									isp--;
									@Pc(4745) int local4745 = intStack[isp];
									@Pc(4747) String local4747 = null;
									if (local4745 < 100) {
										local4747 = Static1.aStringArray4[local4745];
									}
									if (local4747 == null) {
										local4747 = "";
									}
									stringStack[ssp++] = local4747;
									continue;
								}
								if (opcode == 5012) {
									@Pc(4777) int local4777 = isp - 1;
									@Pc(4780) int local4780 = intStack[local4777];
									@Pc(4782) int local4782 = -1;
									if (local4780 < 100) {
										local4782 = Static7.anIntArray598[local4780];
									}
									isp = local4777 + 1;
									intStack[local4777] = local4782;
									continue;
								}
								if (opcode == 5015) {
									@Pc(4812) String local4812;
									if (PlayerList.self == null || PlayerList.self.name == null) {
										local4812 = LoginManager.username;
									} else {
										local4812 = PlayerList.self.method1173();
									}
									stringStack[ssp++] = local4812;
									continue;
								}
								if (opcode == 5016) {
									intStack[isp++] = Static6.anInt5016;
									continue;
								}
								if (opcode == 5017) {
									intStack[isp++] = Static5.anInt3469;
									continue;
								}
								if (opcode == 5050) {
									isp--;
									@Pc(4852) int local4852 = intStack[isp];
									stringStack[ssp++] = QuickChatCatTypeList.get(local4852).description;
									continue;
								}
								if (opcode == 5051) {
									@Pc(4872) int local4872 = isp - 1;
									@Pc(4875) int local4875 = intStack[local4872];
									@Pc(4879) QuickChatCatType local4879 = QuickChatCatTypeList.get(local4875);
									if (local4879.subcategories == null) {
										isp = local4872 + 1;
										intStack[local4872] = 0;
									} else {
										isp = local4872 + 1;
										intStack[local4872] = local4879.subcategories.length;
									}
									continue;
								}
								if (opcode == 5052) {
									@Pc(4903) int local4903 = isp - 2;
									@Pc(4909) int local4909 = intStack[local4903 + 1];
									@Pc(4913) int local4913 = intStack[local4903];
									@Pc(4917) QuickChatCatType local4917 = QuickChatCatTypeList.get(local4913);
									@Pc(4922) int local4922 = local4917.subcategories[local4909];
									isp = local4903 + 1;
									intStack[local4903] = local4922;
									continue;
								}
								if (opcode == 5053) {
									@Pc(4934) int local4934 = isp - 1;
									@Pc(4937) int local4937 = intStack[local4934];
									@Pc(4943) QuickChatCatType local4943 = QuickChatCatTypeList.get(local4937);
									if (local4943.phrases == null) {
										isp = local4934 + 1;
										intStack[local4934] = 0;
									} else {
										isp = local4934 + 1;
										intStack[local4934] = local4943.phrases.length;
									}
									continue;
								}
								if (opcode == 5054) {
									@Pc(4968) int local4968 = isp - 2;
									@Pc(4972) int local4972 = intStack[local4968];
									@Pc(4978) int local4978 = intStack[local4968 + 1];
									isp = local4968 + 1;
									intStack[local4968] = QuickChatCatTypeList.get(local4972).phrases[local4978];
									continue;
								}
								if (opcode == 5055) {
									isp--;
									@Pc(5000) int local5000 = intStack[isp];
									stringStack[ssp++] = QuickChatPhraseTypeList.get(local5000).getText();
									continue;
								}
								if (opcode == 5056) {
									@Pc(5018) int local5018 = isp - 1;
									@Pc(5021) int local5021 = intStack[local5018];
									@Pc(5025) QuickChatPhraseType local5025 = QuickChatPhraseTypeList.get(local5021);
									if (local5025.automaticResponses == null) {
										isp = local5018 + 1;
										intStack[local5018] = 0;
									} else {
										isp = local5018 + 1;
										intStack[local5018] = local5025.automaticResponses.length;
									}
									continue;
								}
								if (opcode == 5057) {
									@Pc(5051) int local5051 = isp - 2;
									@Pc(5055) int local5055 = intStack[local5051];
									@Pc(5061) int local5061 = intStack[local5051 + 1];
									isp = local5051 + 1;
									intStack[local5051] = QuickChatPhraseTypeList.get(local5055).automaticResponses[local5061];
									continue;
								}
								if (opcode == 5058) {
									Static1.aClass27_1 = new QuickChatPhrase();
									isp--;
									Static1.aClass27_1.id = intStack[isp];
									Static1.aClass27_1.type = QuickChatPhraseTypeList.get(Static1.aClass27_1.id);
									Static1.aClass27_1.values = new int[Static1.aClass27_1.type.getDynamicCommandCount()];
									continue;
								}
								if (opcode == 5059) {
									Protocol.outboundBuffer.writeOpcode(222);
									Protocol.outboundBuffer.writeByte(0);
									@Pc(5125) int local5125 = Protocol.outboundBuffer.position;
									Protocol.outboundBuffer.writeByte(0);
									Protocol.outboundBuffer.writeShort(Static1.aClass27_1.id);
									Static1.aClass27_1.type.encodeMessage(Protocol.outboundBuffer, Static1.aClass27_1.values);
									Protocol.outboundBuffer.writeByteLength(Protocol.outboundBuffer.position - local5125);
									continue;
								}
								if (opcode == 5060) {
									ssp--;
									@Pc(5165) String local5165 = stringStack[ssp];
									Protocol.outboundBuffer.writeOpcode(42);
									Protocol.outboundBuffer.writeByte(0);
									@Pc(5178) int local5178 = Protocol.outboundBuffer.position;
									Protocol.outboundBuffer.writeLong(Base37.encode(local5165));
									Protocol.outboundBuffer.writeShort(Static1.aClass27_1.id);
									Static1.aClass27_1.type.encodeMessage(Protocol.outboundBuffer, Static1.aClass27_1.values);
									Protocol.outboundBuffer.writeByteLength(Protocol.outboundBuffer.position - local5178);
									continue;
								}
								if (opcode == 5061) {
									Protocol.outboundBuffer.writeOpcode(222);
									Protocol.outboundBuffer.writeByte(0);
									@Pc(5227) int local5227 = Protocol.outboundBuffer.position;
									Protocol.outboundBuffer.writeByte(1);
									Protocol.outboundBuffer.writeShort(Static1.aClass27_1.id);
									Static1.aClass27_1.type.encodeMessage(Protocol.outboundBuffer, Static1.aClass27_1.values);
									Protocol.outboundBuffer.writeByteLength(Protocol.outboundBuffer.position - local5227);
									continue;
								}
								if (opcode == 5062) {
									@Pc(5259) int local5259 = isp - 2;
									@Pc(5263) int local5263 = intStack[local5259];
									@Pc(5269) int local5269 = intStack[local5259 + 1];
									isp = local5259 + 1;
									intStack[local5259] = QuickChatCatTypeList.get(local5263).subcategoryShortcuts[local5269];
									continue;
								}
								if (opcode == 5063) {
									@Pc(5288) int local5288 = isp - 2;
									@Pc(5292) int local5292 = intStack[local5288];
									@Pc(5298) int local5298 = intStack[local5288 + 1];
									isp = local5288 + 1;
									intStack[local5288] = QuickChatCatTypeList.get(local5292).phraseShortcuts[local5298];
									continue;
								}
								if (opcode == 5064) {
									@Pc(5316) int local5316 = isp - 2;
									@Pc(5322) int local5322 = intStack[local5316 + 1];
									@Pc(5326) int local5326 = intStack[local5316];
									if (local5322 == -1) {
										isp = local5316 + 1;
										intStack[local5316] = -1;
									} else {
										isp = local5316 + 1;
										intStack[local5316] = QuickChatCatTypeList.get(local5326).getSubcategoryByShortcut((char) local5322);
									}
									continue;
								}
								if (opcode == 5065) {
									@Pc(5357) int local5357 = isp - 2;
									@Pc(5363) int local5363 = intStack[local5357 + 1];
									@Pc(5367) int local5367 = intStack[local5357];
									if (local5363 == -1) {
										isp = local5357 + 1;
										intStack[local5357] = -1;
									} else {
										isp = local5357 + 1;
										intStack[local5357] = QuickChatCatTypeList.get(local5367).getPhraseByShortcut((char) local5363);
									}
									continue;
								}
								if (opcode == 5066) {
									@Pc(5396) int local5396 = isp - 1;
									@Pc(5399) int local5399 = intStack[local5396];
									isp = local5396 + 1;
									intStack[local5396] = QuickChatPhraseTypeList.get(local5399).getDynamicCommandCount();
									continue;
								}
								if (opcode == 5067) {
									@Pc(5417) int local5417 = isp - 2;
									@Pc(5421) int local5421 = intStack[local5417];
									@Pc(5427) int local5427 = intStack[local5417 + 1];
									@Pc(5434) int local5434 = QuickChatPhraseTypeList.get(local5421).getDynamicCommand(local5427);
									isp = local5417 + 1;
									intStack[local5417] = local5434;
									continue;
								}
								if (opcode == 5068) {
									isp -= 2;
									@Pc(5451) int local5451 = intStack[isp];
									@Pc(5457) int local5457 = intStack[isp + 1];
									Static1.aClass27_1.values[local5451] = local5457;
									continue;
								}
								if (opcode == 5069) {
									isp -= 2;
									@Pc(5475) int local5475 = intStack[isp];
									@Pc(5481) int local5481 = intStack[isp + 1];
									Static1.aClass27_1.values[local5475] = local5481;
									continue;
								}
								if (opcode == 5070) {
									@Pc(5494) int local5494 = isp - 3;
									@Pc(5498) int local5498 = intStack[local5494];
									@Pc(5504) int local5504 = intStack[local5494 + 2];
									@Pc(5510) int local5510 = intStack[local5494 + 1];
									@Pc(5514) QuickChatPhraseType local5514 = QuickChatPhraseTypeList.get(local5498);
									if (local5514.getDynamicCommand(local5510) != 0) {
										throw new RuntimeException("bad command");
									}
									isp = local5494 + 1;
									intStack[local5494] = local5514.getDynamicCommandParam(local5510, local5504);
									continue;
								}
								if (opcode == 5071) {
									ssp--;
									@Pc(5548) String local5548 = stringStack[ssp];
									@Pc(5551) int local5551 = isp - 1;
									@Pc(5560) boolean local5560 = intStack[local5551] == 1;
									Static24.method2699(local5560, local5548);
									isp = local5551 + 1;
									intStack[local5551] = Static2.anInt5734;
									continue;
								}
								if (opcode == 5072) {
									if (Static7.aShortArray114 != null && Static2.anInt5734 > Static4.anInt3497) {
										intStack[isp++] = Static7.aShortArray114[Static4.anInt3497++] & 0xFFFF;
										continue;
									}
									intStack[isp++] = -1;
									continue;
								}
								if (opcode == 5073) {
									Static4.anInt3497 = 0;
									continue;
								}
							} else if (opcode < 5200) {
								if (opcode == 5100) {
									if (Keyboard.pressedKeys[86]) {
										intStack[isp++] = 1;
									} else {
										intStack[isp++] = 0;
									}
									continue;
								}
								if (opcode == 5101) {
									if (Keyboard.pressedKeys[82]) {
										intStack[isp++] = 1;
									} else {
										intStack[isp++] = 0;
									}
									continue;
								}
								if (opcode == 5102) {
									if (Keyboard.pressedKeys[81]) {
										intStack[isp++] = 1;
									} else {
										intStack[isp++] = 0;
									}
									continue;
								}
							} else if (opcode < 5300) {
								if (opcode == 5200) {
									isp--;
									Static21.method2076(intStack[isp]);
									continue;
								}
								if (opcode == 5201) {
									intStack[isp++] = Static21.method1997();
									continue;
								}
								if (opcode == 5205) {
									isp--;
									Static24.method2947(false, -1, -1, intStack[isp]);
									continue;
								}
								if (opcode == 5206) {
									@Pc(9428) int local9428 = isp - 1;
									@Pc(9431) int local9431 = intStack[local9428];
									@Pc(9441) MapArea local9441 = MapAreaList.getContainingSource(local9431 >> 14 & 0x3FFF, local9431 & 0x3FFF);
									if (local9441 == null) {
										isp = local9428 + 1;
										intStack[local9428] = -1;
									} else {
										isp = local9428 + 1;
										intStack[local9428] = local9441.id;
									}
									continue;
								}
								if (opcode == 5207) {
									isp--;
									@Pc(9470) MapArea local9470 = MapAreaList.get(intStack[isp]);
									if (local9470 != null && local9470.name != null) {
										stringStack[ssp++] = local9470.name;
										continue;
									}
									stringStack[ssp++] = "";
									continue;
								}
								if (opcode == 5208) {
									@Pc(9497) int local9497 = isp + 1;
									intStack[isp] = Static7.anInt5331;
									isp = local9497 + 1;
									intStack[local9497] = Static7.anInt5680;
									continue;
								}
								if (opcode == 5209) {
									@Pc(9512) int local9512 = isp + 1;
									intStack[isp] = Static1.anInt331 + Static3.anInt2962;
									isp = local9512 + 1;
									intStack[local9512] = Static3.anInt2961 + Static3.anInt2960 - Static7.anInt5231 - 1;
									continue;
								}
								if (opcode == 5210) {
									@Pc(9539) int local9539 = isp - 1;
									@Pc(9542) int local9542 = intStack[local9539];
									@Pc(9545) MapArea local9545 = MapAreaList.get(local9542);
									if (local9545 == null) {
										@Pc(9570) int local9570 = local9539 + 1;
										intStack[local9539] = 0;
										isp = local9570 + 1;
										intStack[local9570] = 0;
									} else {
										@Pc(9550) int local9550 = local9539 + 1;
										intStack[local9539] = local9545.defaultPosition >> 14 & 0x3FFF;
										isp = local9550 + 1;
										intStack[local9550] = local9545.defaultPosition & 0x3FFF;
									}
									continue;
								}
								if (opcode == 5211) {
									@Pc(9585) int local9585 = isp - 1;
									@Pc(9588) int local9588 = intStack[local9585];
									@Pc(9591) MapArea local9591 = MapAreaList.get(local9588);
									if (local9591 == null) {
										@Pc(9618) int local9618 = local9585 + 1;
										intStack[local9585] = 0;
										isp = local9618 + 1;
										intStack[local9618] = 0;
									} else {
										@Pc(9597) int local9597 = local9585 + 1;
										intStack[local9585] = local9591.displayMaxX - local9591.displayMinX;
										isp = local9597 + 1;
										intStack[local9597] = local9591.displayMaxZ - local9591.displayMinZ;
									}
									continue;
								}
								if (opcode == 5212) {
									@Pc(9635) MapElement local9635 = Static11.method492();
									if (local9635 == null) {
										@Pc(9641) int local9641 = isp + 1;
										intStack[isp] = -1;
										isp = local9641 + 1;
										intStack[local9641] = -1;
									} else {
										@Pc(9653) int local9653 = isp + 1;
										intStack[isp] = local9635.id;
										@Pc(9678) int local9678 = Static3.anInt2962 + local9635.x << 14 | local9635.level << 28 | Static3.anInt2961 + Static3.anInt2960 - local9635.z - 1;
										isp = local9653 + 1;
										intStack[local9653] = local9678;
									}
									continue;
								}
								if (opcode == 5213) {
									@Pc(9692) MapElement local9692 = Static24.method2713();
									if (local9692 == null) {
										@Pc(9733) int local9733 = isp + 1;
										intStack[isp] = -1;
										isp = local9733 + 1;
										intStack[local9733] = -1;
									} else {
										@Pc(9697) int local9697 = isp + 1;
										intStack[isp] = local9692.id;
										@Pc(9723) int local9723 = Static3.anInt2960 + Static3.anInt2961 - local9692.z - 1 | local9692.level << 28 | local9692.x + Static3.anInt2962 << 14;
										isp = local9697 + 1;
										intStack[local9697] = local9723;
									}
									continue;
								}
								if (opcode == 5214) {
									isp--;
									@Pc(9750) int local9750 = intStack[isp];
									@Pc(9753) MapArea local9753 = Static10.method305();
									if (local9753 != null) {
										@Pc(9775) boolean local9775 = local9753.convertSourceToDisplay(local9750 >> 28 & 0x3, local9750 >> 14 & 0x3FFF, local9750 & 0x3FFF, Static2.anIntArray162);
										if (local9775) {
											Static20.method1970(Static2.anIntArray162[1], Static2.anIntArray162[2]);
										}
									}
									continue;
								}
								if (opcode == 5215) {
									@Pc(9792) int local9792 = isp - 2;
									@Pc(9798) int local9798 = intStack[local9792 + 1];
									@Pc(9802) int local9802 = intStack[local9792];
									@Pc(9812) SecondaryLinkedList local9812 = MapAreaList.getAllContainingSource(local9802 >> 14 & 0x3FFF, local9802 & 0x3FFF);
									@Pc(9814) boolean local9814 = false;
									for (@Pc(9819) MapArea local9819 = (MapArea) local9812.head(); local9819 != null; local9819 = (MapArea) local9812.next()) {
										if (local9819.id == local9798) {
											local9814 = true;
											break;
										}
									}
									if (local9814) {
										isp = local9792 + 1;
										intStack[local9792] = 1;
									} else {
										isp = local9792 + 1;
										intStack[local9792] = 0;
									}
									continue;
								}
								if (opcode == 5218) {
									@Pc(9861) int local9861 = isp - 1;
									@Pc(9864) int local9864 = intStack[local9861];
									@Pc(9867) MapArea local9867 = MapAreaList.get(local9864);
									if (local9867 == null) {
										isp = local9861 + 1;
										intStack[local9861] = -1;
									} else {
										isp = local9861 + 1;
										intStack[local9861] = local9867.defaultZoom;
									}
									continue;
								}
								if (opcode == 5220) {
									intStack[isp++] = WorldMap.loadPercentage == 100 ? 1 : 0;
									continue;
								}
								if (opcode == 5221) {
									isp--;
									@Pc(9912) int local9912 = intStack[isp];
									Static20.method1970(local9912 >> 14 & 0x3FFF, local9912 & 0x3FFF);
									continue;
								}
								if (opcode == 5222) {
									@Pc(9933) MapArea local9933 = Static10.method305();
									if (local9933 == null) {
										@Pc(9938) int local9938 = isp + 1;
										intStack[isp] = -1;
										isp = local9938 + 1;
										intStack[local9938] = -1;
									} else {
										@Pc(9963) boolean local9963 = local9933.convertDisplayToSource(Static3.anInt2962 + Static1.anInt331, Static3.anInt2960 + Static3.anInt2961 - Static7.anInt5231 - 1, Static2.anIntArray162);
										if (local9963) {
											@Pc(9980) int local9980 = isp + 1;
											intStack[isp] = Static2.anIntArray162[1];
											isp = local9980 + 1;
											intStack[local9980] = Static2.anIntArray162[2];
										} else {
											@Pc(9968) int local9968 = isp + 1;
											intStack[isp] = -1;
											isp = local9968 + 1;
											intStack[local9968] = -1;
										}
									}
									continue;
								}
								if (opcode == 5223) {
									isp -= 2;
									@Pc(10003) int local10003 = intStack[isp + 1];
									@Pc(10007) int local10007 = intStack[isp];
									Static24.method2947(false, local10003 & 0x3FFF, local10003 >> 14 & 0x3FFF, local10007);
									continue;
								}
								if (opcode == 5224) {
									@Pc(10031) int local10031 = isp - 1;
									@Pc(10034) int local10034 = intStack[local10031];
									@Pc(10039) MapArea local10039 = Static10.method305();
									if (local10039 == null) {
										@Pc(10045) int local10045 = local10031 + 1;
										intStack[local10031] = -1;
										isp = local10045 + 1;
										intStack[local10045] = -1;
									} else {
										@Pc(10072) boolean local10072 = local10039.convertSourceToDisplay(local10034 >> 28 & 0x3, local10034 >> 14 & 0x3FFF, local10034 & 0x3FFF, Static2.anIntArray162);
										if (local10072) {
											@Pc(10077) int local10077 = local10031 + 1;
											intStack[local10031] = Static2.anIntArray162[1];
											isp = local10077 + 1;
											intStack[local10077] = Static2.anIntArray162[2];
										} else {
											@Pc(10093) int local10093 = local10031 + 1;
											intStack[local10031] = -1;
											isp = local10093 + 1;
											intStack[local10093] = -1;
										}
									}
									continue;
								}
								if (opcode == 5225) {
									@Pc(10109) int local10109 = isp - 1;
									@Pc(10112) int local10112 = intStack[local10109];
									@Pc(10115) MapArea local10115 = Static10.method305();
									if (local10115 == null) {
										@Pc(10164) int local10164 = local10109 + 1;
										intStack[local10109] = -1;
										isp = local10164 + 1;
										intStack[local10164] = -1;
									} else {
										@Pc(10131) boolean local10131 = local10115.convertDisplayToSource(local10112 >> 14 & 0x3FFF, local10112 & 0x3FFF, Static2.anIntArray162);
										if (local10131) {
											@Pc(10136) int local10136 = local10109 + 1;
											intStack[local10109] = Static2.anIntArray162[1];
											isp = local10136 + 1;
											intStack[local10136] = Static2.anIntArray162[2];
										} else {
											@Pc(10152) int local10152 = local10109 + 1;
											intStack[local10109] = -1;
											isp = local10152 + 1;
											intStack[local10152] = -1;
										}
									}
									continue;
								}
								if (opcode == 5226) {
									isp--;
									Static31.method3661(intStack[isp]);
									continue;
								}
								if (opcode == 5227) {
									isp -= 2;
									@Pc(10196) int local10196 = intStack[isp];
									@Pc(10202) int local10202 = intStack[isp + 1];
									Static24.method2947(true, local10202 & 0x3FFF, local10202 >> 14 & 0x3FFF, local10196);
									continue;
								}
								if (opcode == 5228) {
									isp--;
									Static6.aBoolean317 = intStack[isp] == 1;
									continue;
								}
								if (opcode == 5229) {
									intStack[isp++] = Static6.aBoolean317 ? 1 : 0;
									continue;
								}
								if (opcode == 5230) {
									isp--;
									@Pc(10262) int local10262 = intStack[isp];
									Static37.method4641(local10262);
									continue;
								}
								if (opcode == 5231) {
									isp -= 2;
									@Pc(10276) int local10276 = intStack[isp];
									@Pc(10289) boolean local10289 = intStack[isp + 1] == 1;
									if (Static3.aClass84_9 == null) {
										continue;
									}
									@Pc(10299) Node local10299 = Static3.aClass84_9.get((long) local10276);
									if (local10299 != null && !local10289) {
										local10299.unlink();
										continue;
									}
									if (local10299 == null && local10289) {
										@Pc(10313) Node local10313 = new Node();
										Static3.aClass84_9.put((long) local10276, local10313);
									}
									continue;
								}
								if (opcode == 5232) {
									@Pc(10331) int local10331 = isp - 1;
									@Pc(10334) int local10334 = intStack[local10331];
									if (Static3.aClass84_9 == null) {
										isp = local10331 + 1;
										intStack[local10331] = 0;
									} else {
										@Pc(10350) Node local10350 = Static3.aClass84_9.get((long) local10334);
										isp = local10331 + 1;
										intStack[local10331] = local10350 == null ? 0 : 1;
									}
									continue;
								}
								if (opcode == 5233) {
									isp -= 2;
									@Pc(10369) int local10369 = intStack[isp];
									@Pc(10380) boolean local10380 = intStack[isp + 1] == 1;
									if (Static3.aClass84_10 == null) {
										continue;
									}
									@Pc(10389) Node local10389 = Static3.aClass84_10.get((long) local10369);
									if (local10389 != null && !local10380) {
										local10389.unlink();
										continue;
									}
									if (local10389 == null && local10380) {
										@Pc(10403) Node local10403 = new Node();
										Static3.aClass84_10.put((long) local10369, local10403);
									}
									continue;
								}
								if (opcode == 5234) {
									@Pc(10425) int local10425 = isp - 1;
									@Pc(10428) int local10428 = intStack[local10425];
									if (Static3.aClass84_10 == null) {
										isp = local10425 + 1;
										intStack[local10425] = 0;
									} else {
										@Pc(10444) Node local10444 = Static3.aClass84_10.get((long) local10428);
										isp = local10425 + 1;
										intStack[local10425] = local10444 == null ? 0 : 1;
									}
									continue;
								}
								if (opcode == 5235) {
									intStack[isp++] = WorldMap.currentMap == null ? -1 : WorldMap.currentMap.id;
									continue;
								}
							} else if (opcode < 5400) {
								if (opcode == 5300) {
									@Pc(5696) int local5696 = isp - 2;
									@Pc(5700) int local5700 = intStack[local5696];
									@Pc(5706) int local5706 = intStack[local5696 + 1];
									Static35.method4512(false, 3, local5700, local5706);
									isp = local5696 + 1;
									intStack[local5696] = GameShell.fullScreenFrame == null ? 0 : 1;
									continue;
								}
								if (opcode == 5301) {
									if (GameShell.fullScreenFrame != null) {
										Static35.method4512(false, Preferences.displayMode, -1, -1);
									}
									continue;
								}
								if (opcode == 5302) {
									@Pc(5750) DisplayMode[] local5750 = DisplayMode.getModes();
									intStack[isp++] = local5750.length;
									continue;
								}
								if (opcode == 5303) {
									@Pc(5766) int local5766 = isp - 1;
									@Pc(5769) int local5769 = intStack[local5766];
									@Pc(5772) DisplayMode[] local5772 = DisplayMode.getModes();
									intStack[local5766++] = local5772[local5769].width;
									isp = local5766 + 1;
									intStack[local5766] = local5772[local5769].height;
									continue;
								}
								if (opcode == 5305) {
									@Pc(5796) int local5796 = Preferences.fullScreenWidth;
									@Pc(5798) int local5798 = Preferences.fullScreenHeight;
									@Pc(5800) int local5800 = -1;
									@Pc(5803) DisplayMode[] local5803 = DisplayMode.getModes();
									for (@Pc(5805) int local5805 = 0; local5805 < local5803.length; local5805++) {
										@Pc(5813) DisplayMode local5813 = local5803[local5805];
										if (local5813.width == local5796 && local5813.height == local5798) {
											local5800 = local5805;
											break;
										}
									}
									intStack[isp++] = local5800;
									continue;
								}
								if (opcode == 5306) {
									intStack[isp++] = Static11.method557();
									continue;
								}
								if (opcode == 5307) {
									isp--;
									@Pc(5862) int local5862 = intStack[isp];
									if (local5862 < 0 || local5862 > 2) {
										local5862 = 0;
									}
									Static35.method4512(false, local5862, -1, -1);
									continue;
								}
								if (opcode == 5308) {
									intStack[isp++] = Preferences.displayMode;
									continue;
								}
								if (opcode == 5309) {
									isp--;
									@Pc(5907) int local5907 = intStack[isp];
									if (local5907 < 0 || local5907 > 2) {
										local5907 = 0;
									}
									Preferences.displayMode = local5907;
									Preferences.write(GameShell.signLink);
									continue;
								}
							} else if (opcode < 5500) {
								if (opcode == 5400) {
									ssp -= 2;
									@Pc(8724) String local8724 = stringStack[ssp + 1];
									isp--;
									@Pc(8729) int local8729 = intStack[isp];
									@Pc(8733) String local8733 = stringStack[ssp];
									Protocol.outboundBuffer.writeOpcode(243);
									Protocol.outboundBuffer.writeByte(Buffer.getStringLength(local8733) + Buffer.getStringLength(local8724) + 1);
									Protocol.outboundBuffer.writeString(local8733);
									Protocol.outboundBuffer.writeString(local8724);
									Protocol.outboundBuffer.writeByte(local8729);
									continue;
								}
								if (opcode == 5401) {
									isp -= 2;
									Static7.aShortArray124[intStack[isp]] = (short) Static28.method3276(intStack[isp + 1]);
									Static22.method2413();
									Static9.method198();
									Static19.method4376();
									Static13.method1010();
									Static13.method933();
									continue;
								}
								if (opcode == 5405) {
									isp -= 2;
									@Pc(8807) int local8807 = intStack[isp];
									@Pc(8813) int local8813 = intStack[isp + 1];
									if (local8807 >= 0 && local8807 < 2) {
										Static1.anIntArrayArrayArray1[local8807] = new int[local8813 << 1][4];
									}
									continue;
								}
								if (opcode == 5406) {
									isp -= 7;
									@Pc(8846) int local8846 = intStack[isp + 1] << 1;
									@Pc(8850) int local8850 = intStack[isp];
									@Pc(8856) int local8856 = intStack[isp + 3];
									@Pc(8862) int local8862 = intStack[isp + 2];
									@Pc(8868) int local8868 = intStack[isp + 4];
									@Pc(8874) int local8874 = intStack[isp + 5];
									@Pc(8880) int local8880 = intStack[isp + 6];
									if (local8850 >= 0 && local8850 < 2 && Static1.anIntArrayArrayArray1[local8850] != null && local8846 >= 0 && Static1.anIntArrayArrayArray1[local8850].length > local8846) {
										Static1.anIntArrayArrayArray1[local8850][local8846] = new int[] { (local8862 >> 14 & 0x3FFF) * 128, local8856, (local8862 & 0x3FFF) * 128, local8880 };
										Static1.anIntArrayArrayArray1[local8850][local8846 + 1] = new int[] { (local8868 >> 14 & 0x3FFF) * 128, local8874, (local8868 & 0x3FFF) * 128 };
									}
									continue;
								}
								if (opcode == 5407) {
									@Pc(8979) int local8979 = isp - 1;
									@Pc(8986) int local8986 = Static1.anIntArrayArrayArray1[intStack[local8979]].length >> 1;
									isp = local8979 + 1;
									intStack[local8979] = local8986;
									continue;
								}
								if (opcode == 5411) {
									if (GameShell.fullScreenFrame != null) {
										Static35.method4512(false, Preferences.displayMode, -1, -1);
									}
									if (GameShell.frame == null) {
										Static37.openUrl(Static36.method4436(), false);
									} else {
										System.exit(0);
									}
									continue;
								}
								if (opcode == 5419) {
									@Pc(9027) String local9027 = "";
									if (Static1.reverseDnsRequest != null) {
										if (Static1.reverseDnsRequest.result == null) {
											local9027 = Static27.method3226(Static1.reverseDnsRequest.intArg1);
										} else {
											local9027 = (String) Static1.reverseDnsRequest.result;
										}
									}
									stringStack[ssp++] = local9027;
									continue;
								}
								if (opcode == 5420) {
									intStack[isp++] = SignLink.anInt6106 == 3 ? 1 : 0;
									continue;
								}
								if (opcode == 5421) {
									if (GameShell.fullScreenFrame != null) {
										Static35.method4512(false, Preferences.displayMode, -1, -1);
									}
									ssp--;
									@Pc(9090) String local9090 = stringStack[ssp];
									isp--;
									@Pc(9100) boolean local9100 = intStack[isp] == 1;
									@Pc(9110) String local9110 = Static36.method4436() + local9090;
									if (GameShell.frame != null || local9100 && SignLink.anInt6106 != 3 && SignLink.osName.startsWith("win") && !client.haveIe6) {
										Static6.aString269 = local9110;
										Static4.aBoolean206 = local9100;
										Static1.aClass197_1 = GameShell.signLink.openUrl(local9110);
										continue;
									}
									Static37.openUrl(local9110, local9100);
									continue;
								}
								if (opcode == 5422) {
									ssp -= 2;
									@Pc(9150) String local9150 = stringStack[ssp];
									@Pc(9156) String local9156 = stringStack[ssp + 1];
									isp--;
									@Pc(9161) int local9161 = intStack[isp];
									if (local9150.length() > 0) {
										if (Static7.aStringArray38 == null) {
											Static7.aStringArray38 = new String[Static5.anIntArray681[client.game]];
										}
										Static7.aStringArray38[local9161] = local9150;
									}
									if (local9156.length() > 0) {
										if (Static2.aStringArray42 == null) {
											Static2.aStringArray42 = new String[Static5.anIntArray681[client.game]];
										}
										Static2.aStringArray42[local9161] = local9156;
									}
									continue;
								}
								if (opcode == 5423) {
									ssp--;
									System.out.println(stringStack[ssp]);
									continue;
								}
								if (opcode == 5424) {
									isp -= 11;
									Static5.anInt4293 = intStack[isp];
									Static3.anInt2587 = intStack[isp + 1];
									Static1.anInt497 = intStack[isp + 2];
									Static3.anInt2586 = intStack[isp + 3];
									Static1.anInt771 = intStack[isp + 4];
									Static4.anInt3336 = intStack[isp + 5];
									Static1.anInt593 = intStack[isp + 6];
									Static4.anInt2741 = intStack[isp + 7];
									Static1.anInt881 = intStack[isp + 8];
									Static1.anInt504 = intStack[isp + 9];
									Static4.anInt2920 = intStack[isp + 10];
									client.js5Archive8.isFileReady(Static1.anInt771);
									client.js5Archive8.isFileReady(Static4.anInt3336);
									client.js5Archive8.isFileReady(Static1.anInt593);
									client.js5Archive8.isFileReady(Static4.anInt2741);
									client.js5Archive8.isFileReady(Static1.anInt881);
									Static7.aBoolean389 = true;
									continue;
								}
								if (opcode == 5425) {
									Static36.method4447();
									Static7.aBoolean389 = false;
									continue;
								}
								if (opcode == 5426) {
									isp--;
									Static4.anInt3407 = intStack[isp];
									continue;
								}
								if (opcode == 5427) {
									isp -= 2;
									Static2.anInt1937 = intStack[isp];
									Static3.anInt2232 = intStack[isp + 1];
									continue;
								}
								if (opcode == 5428) {
									@Pc(9351) int local9351 = isp - 2;
									@Pc(9357) int local9357 = intStack[local9351 + 1];
									@Pc(9361) int local9361 = intStack[local9351];
									isp = local9351 + 1;
									intStack[local9351] = Static14.method1176(local9361, local9357) ? 1 : 0;
									continue;
								}
							} else if (opcode < 5600) {
								if (opcode == 5500) {
									isp -= 4;
									@Pc(8424) int local8424 = intStack[isp];
									@Pc(8430) int local8430 = intStack[isp + 1];
									@Pc(8436) int local8436 = intStack[isp + 2];
									@Pc(8442) int local8442 = intStack[isp + 3];
									Static37.method4773(local8436, (local8424 >> 14 & 0x3FFF) - Static5.originX, local8442, local8430, false, (local8424 & 0x3FFF) - Static7.originZ);
									continue;
								}
								if (opcode == 5501) {
									isp -= 4;
									@Pc(8472) int local8472 = intStack[isp];
									@Pc(8478) int local8478 = intStack[isp + 1];
									@Pc(8484) int local8484 = intStack[isp + 2];
									@Pc(8490) int local8490 = intStack[isp + 3];
									Static23.method2536(local8478, local8484, (local8472 >> 14 & 0x3FFF) - Static5.originX, (local8472 & 0x3FFF) - Static7.originZ, local8490);
									continue;
								}
								if (opcode == 5502) {
									isp -= 6;
									@Pc(8521) int local8521 = intStack[isp];
									if (local8521 >= 2) {
										throw new RuntimeException();
									}
									Static5.anInt5195 = local8521;
									@Pc(8539) int local8539 = intStack[isp + 1];
									if (Static1.anIntArrayArrayArray1[Static5.anInt5195].length >> 1 <= local8539 + 1) {
										throw new RuntimeException();
									}
									Static2.anInt915 = 0;
									Static6.anInt4384 = local8539;
									Static7.anInt5946 = intStack[isp + 2];
									Static2.anInt1165 = intStack[isp + 3];
									@Pc(8575) int local8575 = intStack[isp + 4];
									if (local8575 >= 2) {
										throw new RuntimeException();
									}
									Static4.anInt3024 = local8575;
									@Pc(8591) int local8591 = intStack[isp + 5];
									if (Static1.anIntArrayArrayArray1[Static4.anInt3024].length >> 1 <= local8591 + 1) {
										throw new RuntimeException();
									}
									Static1.anInt772 = 3;
									Static1.anInt126 = local8591;
									continue;
								}
								if (opcode == 5503) {
									Static24.method2563();
									continue;
								}
								if (opcode == 5504) {
									isp -= 2;
									Static17.method1654(intStack[isp], intStack[isp + 1]);
									continue;
								}
								if (opcode == 5505) {
									intStack[isp++] = (int) Static5.aFloat147;
									continue;
								}
								if (opcode == 5506) {
									intStack[isp++] = (int) Static5.aFloat97;
									continue;
								}
								if (opcode == 5507) {
									Static21.method2007();
									continue;
								}
								if (opcode == 5508) {
									Static26.method2973();
									continue;
								}
								if (opcode == 5509) {
									Static20.method1924();
									continue;
								}
								if (opcode == 5510) {
									Static33.method3007();
									continue;
								}
								if (opcode == 5512) {
									Static8.method11();
									continue;
								}
							} else if (opcode < 5700) {
								if (opcode == 5600) {
									ssp -= 2;
									isp--;
									@Pc(5950) int local5950 = intStack[isp];
									@Pc(5954) String local5954 = stringStack[ssp];
									@Pc(5960) String local5960 = stringStack[ssp + 1];
									if (Static4.anInt3304 == 10 && LoginManager.autoStep == 0 && LoginManager.step == 0 && CreateManager.step == 0 && WorldList.step == 0) {
										LoginManager.login(local5954, local5960, local5950);
									}
									continue;
								}
								if (opcode == 5601) {
									Static15.method4619();
									continue;
								}
								if (opcode == 5602) {
									if (LoginManager.step == 0) {
										LoginManager.reply = -2;
									}
									continue;
								}
								if (opcode == 5603) {
									isp -= 4;
									if (Static4.anInt3304 == 10 && LoginManager.autoStep == 0 && LoginManager.step == 0 && CreateManager.step == 0 && WorldList.step == 0) {
										CreateManager.checkInfo(intStack[isp], intStack[isp + 1], intStack[isp + 2], intStack[isp + 3]);
									}
									continue;
								}
								if (opcode == 5604) {
									ssp--;
									if (Static4.anInt3304 == 10 && LoginManager.autoStep == 0 && LoginManager.step == 0 && CreateManager.step == 0 && WorldList.step == 0) {
										CreateManager.checkName(Base37.encode(stringStack[ssp]));
									}
									continue;
								}
								if (opcode == 5605) {
									isp -= 7;
									ssp -= 3;
									if (Static4.anInt3304 == 10 && LoginManager.autoStep == 0 && LoginManager.step == 0 && CreateManager.step == 0 && WorldList.step == 0) {
										CreateManager.createAccount(Base37.encode(stringStack[ssp]), stringStack[ssp + 1], stringStack[ssp + 2], intStack[isp], intStack[isp + 1], intStack[isp + 2], intStack[isp + 3], intStack[isp + 4] == 1, intStack[isp + 5] == 1, intStack[isp + 6] == 1);
									}
									continue;
								}
								if (opcode == 5606) {
									if (CreateManager.step == 0) {
										CreateManager.reply = -2;
									}
									continue;
								}
								if (opcode == 5607) {
									intStack[isp++] = LoginManager.reply;
									continue;
								}
								if (opcode == 5608) {
									intStack[isp++] = LoginManager.hopTime;
									continue;
								}
								if (opcode == 5609) {
									intStack[isp++] = CreateManager.reply;
									continue;
								}
								if (opcode == 5610) {
									for (@Pc(6245) int local6245 = 0; local6245 < 5; local6245++) {
										stringStack[ssp++] = CreateManager.suggestedNames.length > local6245 ? Static29.method3464(CreateManager.suggestedNames[local6245]) : "";
									}
									CreateManager.suggestedNames = null;
									continue;
								}
								if (opcode == 5611) {
									intStack[isp++] = LoginManager.disallowResult;
									continue;
								}
							} else if (opcode < 6100) {
								if (opcode == 6001) {
									isp--;
									@Pc(6301) int local6301 = intStack[isp];
									if (local6301 < 1) {
										local6301 = 1;
									}
									if (local6301 > 4) {
										local6301 = 4;
									}
									Preferences.brightness = local6301;
									if (!GlRenderer.enabled || !Preferences.highDetailLighting) {
										if (Preferences.brightness == 1) {
											ColorUtils.setBrightness(0.9F);
										}
										if (Preferences.brightness == 2) {
											ColorUtils.setBrightness(0.8F);
										}
										if (Preferences.brightness == 3) {
											ColorUtils.setBrightness(0.7F);
										}
										if (Preferences.brightness == 4) {
											ColorUtils.setBrightness(0.6F);
										}
									}
									if (GlRenderer.enabled) {
										Static17.method1655();
										if (!Preferences.highDetailLighting) {
											Static36.method4455();
										}
									}
									Static9.method198();
									Preferences.write(GameShell.signLink);
									Preferences.sentToServer = false;
									continue;
								}
								if (opcode == 6002) {
									isp--;
									Preferences.setAllLevelsVisible(intStack[isp] == 1);
									LocTypeList.clear();
									Static36.method4455();
									Static16.method2014();
									Preferences.write(GameShell.signLink);
									Preferences.sentToServer = false;
									continue;
								}
								if (opcode == 6003) {
									isp--;
									Preferences.roofsVisible = intStack[isp] == 1;
									Static16.method2014();
									Preferences.write(GameShell.signLink);
									Preferences.sentToServer = false;
									continue;
								}
								if (opcode == 6005) {
									isp--;
									Preferences.groundDecoration = intStack[isp] == 1;
									Static36.method4455();
									Preferences.write(GameShell.signLink);
									Preferences.sentToServer = false;
									continue;
								}
								if (opcode == 6006) {
									isp--;
									Preferences.highDetailTextures = intStack[isp] == 1;
									((Js5GlTextureProvider) Static4.anInterface4_1).setLowDetail(!Preferences.highDetailTextures);
									Preferences.write(GameShell.signLink);
									Preferences.sentToServer = false;
									continue;
								}
								if (opcode == 6007) {
									isp--;
									Preferences.manyIdleAnimations = intStack[isp] == 1;
									Preferences.write(GameShell.signLink);
									Preferences.sentToServer = false;
									continue;
								}
								if (opcode == 6008) {
									isp--;
									Preferences.flickeringEffects = intStack[isp] == 1;
									Preferences.write(GameShell.signLink);
									Preferences.sentToServer = false;
									continue;
								}
								if (opcode == 6009) {
									isp--;
									Preferences.groundTextures = intStack[isp] == 1;
									Preferences.write(GameShell.signLink);
									Preferences.sentToServer = false;
									continue;
								}
								if (opcode == 6010) {
									isp--;
									Preferences.characterShadows = intStack[isp] == 1;
									Preferences.write(GameShell.signLink);
									Preferences.sentToServer = false;
									continue;
								}
								if (opcode == 6011) {
									isp--;
									@Pc(6587) int local6587 = intStack[isp];
									if (local6587 < 0 || local6587 > 2) {
										local6587 = 0;
									}
									Preferences.sceneryShadows = local6587;
									Preferences.write(GameShell.signLink);
									Preferences.sentToServer = false;
									continue;
								}
								if (opcode == 6012) {
									if (GlRenderer.enabled) {
										MaterialManager.setMaterial(0, 0);
									}
									isp--;
									Preferences.highDetailLighting = intStack[isp] == 1;
									if (GlRenderer.enabled && Preferences.highDetailLighting) {
										ColorUtils.setBrightness(0.7F);
									} else {
										if (Preferences.brightness == 1) {
											ColorUtils.setBrightness(0.9F);
										}
										if (Preferences.brightness == 2) {
											ColorUtils.setBrightness(0.8F);
										}
										if (Preferences.brightness == 3) {
											ColorUtils.setBrightness(0.7F);
										}
										if (Preferences.brightness == 4) {
											ColorUtils.setBrightness(0.6F);
										}
									}
									Static36.method4455();
									Preferences.write(GameShell.signLink);
									Preferences.sentToServer = false;
									continue;
								}
								if (opcode == 6014) {
									isp--;
									Preferences.highDetailWater = intStack[isp] == 1;
									if (GlRenderer.enabled) {
										Static36.method4455();
									}
									Preferences.write(GameShell.signLink);
									Preferences.sentToServer = false;
									continue;
								}
								if (opcode == 6015) {
									isp--;
									Preferences.fog = intStack[isp] == 1;
									if (GlRenderer.enabled) {
										Static17.method1655();
									}
									Preferences.write(GameShell.signLink);
									Preferences.sentToServer = false;
									continue;
								}
								if (opcode == 6016) {
									isp--;
									@Pc(6730) int local6730 = intStack[isp];
									if (GlRenderer.enabled) {
										GameShell.replaceCanvas = true;
									}
									if (local6730 < 0 || local6730 > 2) {
										local6730 = 0;
									}
									Static2.anInt1125 = local6730;
									continue;
								}
								if (opcode == 6017) {
									isp--;
									Preferences.stereo = intStack[isp] == 1;
									Static9.method199();
									Preferences.write(GameShell.signLink);
									Preferences.sentToServer = false;
									continue;
								}
								if (opcode == 6018) {
									isp--;
									@Pc(6779) int local6779 = intStack[isp];
									if (local6779 < 0) {
										local6779 = 0;
									}
									if (local6779 > 127) {
										local6779 = 127;
									}
									Preferences.soundEffectsVolume = local6779;
									Preferences.write(GameShell.signLink);
									Preferences.sentToServer = false;
									continue;
								}
								if (opcode == 6019) {
									isp--;
									@Pc(6806) int local6806 = intStack[isp];
									if (local6806 < 0) {
										local6806 = 0;
									}
									if (local6806 > 255) {
										local6806 = 255;
									}
									if (Preferences.musicVolume != local6806) {
										if (Preferences.musicVolume == 0 && Static6.anInt4844 != -1) {
											Static28.method3251(local6806, Static6.anInt4844, client.js5Archive6);
											Static4.aBoolean210 = false;
										} else if (local6806 == 0) {
											Static37.method4718();
											Static4.aBoolean210 = false;
										} else {
											Static29.method3541(local6806);
										}
										Preferences.musicVolume = local6806;
									}
									Preferences.write(GameShell.signLink);
									Preferences.sentToServer = false;
									continue;
								}
								if (opcode == 6020) {
									isp--;
									@Pc(6882) int local6882 = intStack[isp];
									if (local6882 < 0) {
										local6882 = 0;
									}
									if (local6882 > 127) {
										local6882 = 127;
									}
									Preferences.areaSoundsVolume = local6882;
									Preferences.write(GameShell.signLink);
									Preferences.sentToServer = false;
									continue;
								}
								if (opcode == 6021) {
									isp--;
									Static2.aBoolean119 = intStack[isp] == 1;
									Static16.method2014();
									continue;
								}
								if (opcode == 6023) {
									@Pc(6933) boolean local6933 = false;
									@Pc(6935) int local6935 = isp - 1;
									@Pc(6938) int local6938 = intStack[local6935];
									if (local6938 < 0) {
										local6938 = 0;
									}
									if (local6938 > 2) {
										local6938 = 2;
									}
									if (GameShell.maxMemory < 96) {
										local6938 = 0;
										local6933 = true;
									}
									Preferences.setParticles(local6938);
									Preferences.write(GameShell.signLink);
									Preferences.sentToServer = false;
									isp = local6935 + 1;
									intStack[local6935] = local6933 ? 0 : 1;
									continue;
								}
								if (opcode == 6024) {
									isp--;
									@Pc(6985) int local6985 = intStack[isp];
									if (local6985 < 0 || local6985 > 2) {
										local6985 = 0;
									}
									Preferences.antiAliasingMode = local6985;
									Preferences.write(GameShell.signLink);
									continue;
								}
								if (opcode == 6027) {
									isp--;
									@Pc(7015) int local7015 = intStack[isp];
									if (!GlRenderer.enabled) {
										continue;
									}
									if (local7015 < 0 || local7015 > 1) {
										local7015 = 0;
									}
									Static10.setHdrEnabled(local7015 == 1);
									continue;
								}
								if (opcode == 6028) {
									isp--;
									Preferences.customCursors = intStack[isp] != 0;
									Preferences.write(GameShell.signLink);
									continue;
								}
							} else if (opcode < 6200) {
								if (opcode == 6101) {
									intStack[isp++] = Preferences.brightness;
									continue;
								}
								if (opcode == 6102) {
									intStack[isp++] = SceneGraph.isAllLevelsVisible() ? 1 : 0;
									continue;
								}
								if (opcode == 6103) {
									intStack[isp++] = Preferences.roofsVisible ? 1 : 0;
									continue;
								}
								if (opcode == 6105) {
									intStack[isp++] = Preferences.groundDecoration ? 1 : 0;
									continue;
								}
								if (opcode == 6106) {
									intStack[isp++] = Preferences.highDetailTextures ? 1 : 0;
									continue;
								}
								if (opcode == 6107) {
									intStack[isp++] = Preferences.manyIdleAnimations ? 1 : 0;
									continue;
								}
								if (opcode == 6108) {
									intStack[isp++] = Preferences.flickeringEffects ? 1 : 0;
									continue;
								}
								if (opcode == 6109) {
									intStack[isp++] = Preferences.groundTextures ? 1 : 0;
									continue;
								}
								if (opcode == 6110) {
									intStack[isp++] = Preferences.characterShadows ? 1 : 0;
									continue;
								}
								if (opcode == 6111) {
									intStack[isp++] = Preferences.sceneryShadows;
									continue;
								}
								if (opcode == 6112) {
									intStack[isp++] = Preferences.highDetailLighting ? 1 : 0;
									continue;
								}
								if (opcode == 6114) {
									intStack[isp++] = Preferences.highDetailWater ? 1 : 0;
									continue;
								}
								if (opcode == 6115) {
									intStack[isp++] = Preferences.fog ? 1 : 0;
									continue;
								}
								if (opcode == 6116) {
									intStack[isp++] = Static2.anInt1125;
									continue;
								}
								if (opcode == 6117) {
									intStack[isp++] = Preferences.stereo ? 1 : 0;
									continue;
								}
								if (opcode == 6118) {
									intStack[isp++] = Preferences.soundEffectsVolume;
									continue;
								}
								if (opcode == 6119) {
									intStack[isp++] = Preferences.musicVolume;
									continue;
								}
								if (opcode == 6120) {
									intStack[isp++] = Preferences.areaSoundsVolume;
									continue;
								}
								if (opcode == 6121) {
									if (GlRenderer.enabled) {
										intStack[isp++] = GlRenderer.arbMultisampleSupported ? 1 : 0;
									} else {
										intStack[isp++] = 0;
									}
									continue;
								}
								if (opcode == 6123) {
									intStack[isp++] = Preferences.getParticles();
									continue;
								}
								if (opcode == 6124) {
									intStack[isp++] = Preferences.antiAliasingMode;
									continue;
								}
								if (opcode == 6126) {
									if (GlRenderer.enabled) {
										intStack[isp++] = PostProcessorManager.isBloomSupported() ? 1 : 0;
									} else {
										intStack[isp++] = 0;
									}
									continue;
								}
								if (opcode == 6127) {
									intStack[isp++] = Preferences.hdr ? 1 : 0;
									continue;
								}
								if (opcode == 6128) {
									intStack[isp++] = Preferences.customCursors ? 1 : 0;
									continue;
								}
							} else if (opcode < 6300) {
								if (opcode == 6200) {
									isp -= 2;
									Static7.aShort45 = (short) intStack[isp];
									if (Static7.aShort45 <= 0) {
										Static7.aShort45 = 256;
									}
									Static4.aShort25 = (short) intStack[isp + 1];
									if (Static4.aShort25 <= 0) {
										Static4.aShort25 = 205;
									}
									continue;
								}
								if (opcode == 6201) {
									isp -= 2;
									Static3.aShort13 = (short) intStack[isp];
									if (Static3.aShort13 <= 0) {
										Static3.aShort13 = 256;
									}
									Static3.aShort12 = (short) intStack[isp + 1];
									if (Static3.aShort12 <= 0) {
										Static3.aShort12 = 320;
									}
									continue;
								}
								if (opcode == 6202) {
									isp -= 4;
									Static4.aShort18 = (short) intStack[isp];
									if (Static4.aShort18 <= 0) {
										Static4.aShort18 = 1;
									}
									Static1.aShort1 = (short) intStack[isp + 1];
									if (Static1.aShort1 <= 0) {
										Static1.aShort1 = 32767;
									} else if (Static4.aShort18 > Static1.aShort1) {
										Static1.aShort1 = Static4.aShort18;
									}
									Static1.aShort9 = (short) intStack[isp + 2];
									if (Static1.aShort9 <= 0) {
										Static1.aShort9 = 1;
									}
									Static7.aShort11 = (short) intStack[isp + 3];
									if (Static7.aShort11 <= 0) {
										Static7.aShort11 = 32767;
									} else if (Static1.aShort9 > Static7.aShort11) {
										Static7.aShort11 = Static1.aShort9;
									}
									continue;
								}
								if (opcode == 6203) {
									Static32.method3924(0, false, Static3.aClass185_5.anInt5949, 0, Static3.aClass185_5.anInt5893);
									@Pc(8371) int local8371 = isp + 1;
									intStack[isp] = Static6.anInt4546;
									isp = local8371 + 1;
									intStack[local8371] = Static2.anInt1333;
									continue;
								}
								if (opcode == 6204) {
									@Pc(8387) int local8387 = isp + 1;
									intStack[isp] = Static3.aShort13;
									isp = local8387 + 1;
									intStack[local8387] = Static3.aShort12;
									continue;
								}
								if (opcode == 6205) {
									@Pc(8404) int local8404 = isp + 1;
									intStack[isp] = Static7.aShort45;
									isp = local8404 + 1;
									intStack[local8404] = Static4.aShort25;
									continue;
								}
							} else if (opcode < 6400) {
								if (opcode == 6300) {
									intStack[isp++] = (int) (MonotonicClock.currentTimeMillis() / 60000L);
									continue;
								}
								if (opcode == 6301) {
									intStack[isp++] = (int) (MonotonicClock.currentTimeMillis() / 86400000L) - 11745;
									continue;
								}
								if (opcode == 6302) {
									@Pc(7466) int local7466 = isp - 3;
									@Pc(7470) int local7470 = intStack[local7466];
									@Pc(7476) int local7476 = intStack[local7466 + 2];
									@Pc(7482) int local7482 = intStack[local7466 + 1];
									Static7.aCalendar2.clear();
									Static7.aCalendar2.set(11, 12);
									Static7.aCalendar2.set(local7476, local7482, local7470);
									isp = local7466 + 1;
									intStack[local7466] = (int) (Static7.aCalendar2.getTime().getTime() / 86400000L) - 11745;
									continue;
								}
								if (opcode == 6303) {
									Static7.aCalendar2.clear();
									Static7.aCalendar2.setTime(new Date(MonotonicClock.currentTimeMillis()));
									intStack[isp++] = Static7.aCalendar2.get(1);
									continue;
								}
								if (opcode == 6304) {
									@Pc(7537) int local7537 = isp - 1;
									@Pc(7540) int local7540 = intStack[local7537];
									@Pc(7542) boolean local7542 = true;
									if (local7540 < 0) {
										local7542 = (local7540 + 1) % 4 == 0;
									} else if (local7540 < 1582) {
										local7542 = local7540 % 4 == 0;
									} else if (local7540 % 4 != 0) {
										local7542 = false;
									} else if (local7540 % 100 != 0) {
										local7542 = true;
									} else if (local7540 % 400 != 0) {
										local7542 = false;
									}
									isp = local7537 + 1;
									intStack[local7537] = local7542 ? 1 : 0;
									continue;
								}
							} else if (opcode < 6500) {
								if (opcode == 6405) {
									intStack[isp++] = Static26.method2988() ? 1 : 0;
									continue;
								}
								if (opcode == 6406) {
									intStack[isp++] = Static14.method1079() ? 1 : 0;
									continue;
								}
							} else if (opcode < 6600) {
								if (opcode == 6500) {
									if (Static4.anInt3304 == 10 && LoginManager.autoStep == 0 && LoginManager.step == 0 && CreateManager.step == 0) {
										intStack[isp++] = WorldList.fetch() == -1 ? 0 : 1;
										continue;
									}
									intStack[isp++] = 1;
									continue;
								}
								if (opcode == 6501) {
									@Pc(7710) World world = WorldList.head();
									if (world == null) {
										@Pc(7758) int local7758 = isp + 1;
										intStack[isp] = -1;
										intStack[local7758++] = 0;
										@Pc(7768) int local7768 = ssp + 1;
										stringStack[ssp] = "";
										intStack[local7758++] = 0;
										ssp = local7768 + 1;
										stringStack[local7768] = "";
										isp = local7758 + 1;
										intStack[local7758] = 0;
									} else {
										@Pc(7716) int local7716 = isp + 1;
										intStack[isp] = world.id;
										intStack[local7716++] = world.flags;
										@Pc(7728) int local7728 = ssp + 1;
										stringStack[ssp] = world.activity;
										@Pc(7735) Country country = world.getCountry();
										intStack[local7716++] = country.flag;
										ssp = local7728 + 1;
										stringStack[local7728] = country.name;
										isp = local7716 + 1;
										intStack[local7716] = world.players;
									}
									continue;
								}
								if (opcode == 6502) {
									@Pc(7796) World world = WorldList.next();
									if (world == null) {
										@Pc(7801) int local7801 = isp + 1;
										intStack[isp] = -1;
										intStack[local7801++] = 0;
										@Pc(7811) int local7811 = ssp + 1;
										stringStack[ssp] = "";
										intStack[local7801++] = 0;
										ssp = local7811 + 1;
										stringStack[local7811] = "";
										isp = local7801 + 1;
										intStack[local7801] = 0;
									} else {
										@Pc(7833) int local7833 = isp + 1;
										intStack[isp] = world.id;
										intStack[local7833++] = world.flags;
										@Pc(7845) int local7845 = ssp + 1;
										stringStack[ssp] = world.activity;
										@Pc(7852) Country country = world.getCountry();
										intStack[local7833++] = country.flag;
										ssp = local7845 + 1;
										stringStack[local7845] = country.name;
										isp = local7833 + 1;
										intStack[local7833] = world.players;
									}
									continue;
								}
								if (opcode == 6503) {
									@Pc(7880) int local7880 = isp - 1;
									@Pc(7883) int id = intStack[local7880];
									if (Static4.anInt3304 == 10 && LoginManager.autoStep == 0 && LoginManager.step == 0 && CreateManager.step == 0) {
										isp = local7880 + 1;
										intStack[local7880] = WorldList.switchWorld(id) ? 1 : 0;
										continue;
									}
									isp = local7880 + 1;
									intStack[local7880] = 0;
									continue;
								}
								if (opcode == 6504) {
									isp--;
									Preferences.favouriteWorlds = intStack[isp];
									Preferences.write(GameShell.signLink);
									continue;
								}
								if (opcode == 6505) {
									intStack[isp++] = Preferences.favouriteWorlds;
									continue;
								}
								if (opcode == 6506) {
									@Pc(7950) int local7950 = isp - 1;
									@Pc(7953) int id = intStack[local7950];
									@Pc(7957) World world = WorldList.get(id);
									if (world == null) {
										@Pc(7963) int local7963 = local7950 + 1;
										intStack[local7950] = -1;
										@Pc(7968) int local7968 = ssp + 1;
										stringStack[ssp] = "";
										intStack[local7963++] = 0;
										ssp = local7968 + 1;
										stringStack[local7968] = "";
										isp = local7963 + 1;
										intStack[local7963] = 0;
									} else {
										@Pc(7990) int local7990 = local7950 + 1;
										intStack[local7950] = world.flags;
										@Pc(7996) int local7996 = ssp + 1;
										stringStack[ssp] = world.activity;
										@Pc(8003) Country country = world.getCountry();
										intStack[local7990++] = country.flag;
										ssp = local7996 + 1;
										stringStack[local7996] = country.name;
										isp = local7990 + 1;
										intStack[local7990] = world.players;
									}
									continue;
								}
								if (opcode == 6507) {
									isp -= 4;
									@Pc(8031) int primaryField = intStack[isp];
									@Pc(8044) boolean primaryDesc = intStack[isp + 1] == 1;
									@Pc(8050) int secondaryField = intStack[isp + 2];
									@Pc(8063) boolean secondaryDesc = intStack[isp + 3] == 1;
									WorldList.sort(primaryField, primaryDesc, secondaryField, secondaryDesc);
									continue;
								}
							} else if (opcode < 6700) {
								if (opcode == 6600) {
									isp--;
									Preferences.aBoolean293 = intStack[isp] == 1;
									Preferences.write(GameShell.signLink);
									continue;
								}
								if (opcode == 6601) {
									intStack[isp++] = Preferences.aBoolean293 ? 1 : 0;
									continue;
								}
							} else if (opcode < 6900) {
								if (opcode == 6800) {
									isp--;
									@Pc(8089) int local8089 = intStack[isp];
									@Pc(8093) MelType local8093 = MelTypeList.get(local8089);
									if (local8093.text == null) {
										stringStack[ssp++] = "";
									} else {
										stringStack[ssp++] = local8093.text;
									}
									continue;
								}
								if (opcode == 6801) {
									@Pc(8119) int local8119 = isp - 1;
									@Pc(8122) int local8122 = intStack[local8119];
									@Pc(8126) MelType local8126 = MelTypeList.get(local8122);
									isp = local8119 + 1;
									intStack[local8119] = local8126.sprite;
									continue;
								}
								if (opcode == 6802) {
									@Pc(8141) int local8141 = isp - 1;
									@Pc(8144) int local8144 = intStack[local8141];
									@Pc(8148) MelType local8148 = MelTypeList.get(local8144);
									isp = local8141 + 1;
									intStack[local8141] = local8148.textSize;
									continue;
								}
								if (opcode == 6803) {
									@Pc(8163) int local8163 = isp - 1;
									@Pc(8166) int local8166 = intStack[local8163];
									@Pc(8170) MelType local8170 = MelTypeList.get(local8166);
									isp = local8163 + 1;
									intStack[local8163] = local8170.category;
									continue;
								}
							}
						} else if (opcode == 4500) {
							isp -= 2;
							@Pc(10481) int local10481 = intStack[isp];
							@Pc(10487) int local10487 = intStack[isp + 1];
							@Pc(10491) ParamType local10491 = ParamTypeList.get(local10487);
							if (local10491.isString()) {
								stringStack[ssp++] = StructTypeList.get(local10481).getParam(local10487, local10491.defaultString);
							} else {
								intStack[isp++] = StructTypeList.get(local10481).getParam(local10487, local10491.defaultInt);
							}
							continue;
						}
					} else if (opcode == 4400) {
						isp -= 2;
						@Pc(10538) int local10538 = intStack[isp];
						@Pc(10544) int local10544 = intStack[isp + 1];
						@Pc(10548) ParamType local10548 = ParamTypeList.get(local10544);
						if (local10548.isString()) {
							stringStack[ssp++] = LocTypeList.get(local10538).getParam(local10544, local10548.defaultString);
						} else {
							intStack[isp++] = LocTypeList.get(local10538).getParam(local10544, local10548.defaultInt);
						}
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(15060) Exception ex) {
			if (script.name == null) {
				if (client.modeWhere != 0) {
					Static26.method4357("", 0, "Clientscript error - check log for details");
				}
				TracingException.report(ex, "CS2 - scr:" + script.key + " op:" + opcode);
			} else {
				@Pc(15069) StringBuffer buffer = new StringBuffer(30);
				buffer.append("%0a - in: ").append(script.name);
				for (@Pc(15080) int local15080 = fp - 1; local15080 >= 0; local15080--) {
					buffer.append("%0a - via: ").append(callStack[local15080].script.name);
				}
				if (opcode == 40) {
					@Pc(15103) int local15103 = intOperands[pc];
					buffer.append("%0a - non-existant gosub script-num: ").append(Integer.toString(local15103));
				}
				if (client.modeWhere != 0) {
					Static26.method4357("", 0, "Clientscript error in: " + script.name);
				}
				TracingException.report(ex, "CS2 - scr:" + script.key + " op:" + opcode + buffer.toString());
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIII)V")
	public static void method2710(@OriginalArg(0) int trigger, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) ClientScript script = ClientScriptList.get(trigger, arg1, arg2);
		if (script == null) {
			return;
		}
		intLocals = new int[script.intLocals];
		stringLocals = new String[script.stringLocals];
		if (script.trigger == 15 || script.trigger == 17 || script.trigger == 16) {
			@Pc(49) int x = 0;
			@Pc(51) int y = 0;
			if (Static5.aClass185_12 != null) {
				x = Static5.aClass185_12.anInt5960;
				y = Static5.aClass185_12.anInt5888;
			}
			intLocals[1] = Mouse.y - y;
			intLocals[0] = Mouse.x - x;
		}
		run(script, 200000);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!io;ZI)V")
	public static void method519(@OriginalArg(0) HookRequest arg0, @OriginalArg(2) int maxCycles) {
		@Pc(8) Object[] args = arg0.arguments;
		@Pc(14) int scriptId = (Integer) args[0];
		@Pc(18) ClientScript script = ClientScriptList.get(scriptId);
		if (script == null) {
			return;
		}
		stringLocals = new String[script.stringLocals];
		@Pc(29) int intLocalIndex = 0;
		intLocals = new int[script.intLocals];
		@Pc(35) int stringLocalIndex = 0;
		for (@Pc(37) int i = 1; i < args.length; i++) {
			if (args[i] instanceof Integer) {
				@Pc(56) int value = (Integer) args[i];
				if (value == 0x80000001) {
					value = arg0.mouseX;
				}
				if (value == 0x80000002) {
					value = arg0.mouseY;
				}
				if (value == 0x80000003) {
					value = arg0.source == null ? -1 : arg0.source.id;
				}
				if (value == 0x80000004) {
					value = arg0.op;
				}
				if (value == 0x80000005) {
					value = arg0.source == null ? -1 : arg0.source.anInt5968;
				}
				if (value == 0x80000006) {
					value = arg0.target == null ? -1 : arg0.target.id;
				}
				if (value == 0x80000007) {
					value = arg0.target == null ? -1 : arg0.target.anInt5968;
				}
				if (value == 0x80000008) {
					value = arg0.keyCode;
				}
				if (value == 0x80000009) {
					value = arg0.keyChar;
				}
				intLocals[intLocalIndex++] = value;
			} else if (args[i] instanceof String) {
				@Pc(168) String value = (String) args[i];
				if (value.equals("event_opbase")) {
					value = arg0.opBase;
				}
				stringLocals[stringLocalIndex++] = value;
			}
		}
		run(script, maxCycles);
	}
}
