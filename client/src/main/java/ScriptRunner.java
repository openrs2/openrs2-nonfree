import java.util.Calendar;
import java.util.Date;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class ScriptRunner {
	@OriginalMember(owner = "client!ra", name = "o", descriptor = "[Ljava/lang/String;")
	private static final String[] MONTHS = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

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

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "Lclient!wf;")
	private static Component primaryActiveComponent;

	@OriginalMember(owner = "client!jc", name = "D", descriptor = "Lclient!wf;")
	private static Component secondaryActiveComponent;

	@OriginalMember(owner = "client!am", name = "y", descriptor = "Lclient!cd;")
	private static QuickChatPhrase activePhrase;

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "Ljava/util/Calendar;")
	private static final Calendar calendar = Calendar.getInstance();

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "[I")
	private static final int[] coord = new int[3];

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
			nextOp:
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
						@Pc(70) int id = intOperands[pc];
						intStack[isp++] = VarpDomain.varps[id];
						continue;
					}
					if (opcode == 2) {
						@Pc(89) int id = intOperands[pc];
						isp--;
						VarpDomain.setVarpClient(id, intStack[isp]);
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
						@Pc(270) int id = intOperands[pc];
						intStack[isp++] = VarpDomain.getVarbit(id);
						continue;
					}
					if (opcode == 27) {
						@Pc(287) int id = intOperands[pc];
						isp--;
						VarpDomain.setVarbitClient(id, intStack[isp]);
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
						@Pc(605) int id = intOperands[pc];
						isp--;
						VarcDomain.varcs[id] = intStack[isp];
						DelayedStateChange.setVarcClient(id);
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
									continue nextOp;
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
						@Pc(771) String value = VarcDomain.varcstrs[intOperands[pc]];
						if (value == null) {
							value = "null";
						}
						stringStack[ssp++] = value;
						continue;
					}
					if (opcode == 48) {
						@Pc(790) int id = intOperands[pc];
						ssp--;
						VarcDomain.varcstrs[id] = stringStack[ssp];
						DelayedStateChange.setVarcstrClient(id);
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
				@Pc(846) boolean secondary;
				if (intOperands[pc] == 1) {
					secondary = true;
				} else {
					secondary = false;
				}
				if (opcode < 300) {
					if (opcode == 100) {
						isp -= 3;
						@Pc(14769) int createdComponentId = intStack[isp + 2];
						@Pc(14773) int componentId = intStack[isp];
						@Pc(14779) int type = intStack[isp + 1];
						if (type != 0) {
							@Pc(14790) Component component = InterfaceList.getComponent(componentId);
							if (component.createdComponents == null) {
								component.createdComponents = new Component[createdComponentId + 1];
							}
							if (createdComponentId >= component.createdComponents.length) {
								@Pc(14815) Component[] createdComponents = new Component[createdComponentId + 1];
								for (@Pc(14817) int i = 0; i < component.createdComponents.length; i++) {
									createdComponents[i] = component.createdComponents[i];
								}
								component.createdComponents = createdComponents;
							}
							if (createdComponentId > 0 && component.createdComponents[createdComponentId - 1] == null) {
								throw new RuntimeException("Gap at:" + (createdComponentId - 1));
							}
							@Pc(14865) Component createdComponent = new Component();
							createdComponent.layer = createdComponent.id = component.id;
							createdComponent.if3 = true;
							createdComponent.createdComponentId = createdComponentId;
							createdComponent.type = type;
							component.createdComponents[createdComponentId] = createdComponent;
							if (secondary) {
								secondaryActiveComponent = createdComponent;
							} else {
								primaryActiveComponent = createdComponent;
							}
							Static28.method3270(component);
							continue;
						}
						throw new RuntimeException();
					}
					if (opcode == 101) {
						@Pc(14911) Component createdComponent = secondary ? secondaryActiveComponent : primaryActiveComponent;
						if (createdComponent.createdComponentId == -1) {
							if (secondary) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							} else {
								throw new RuntimeException("Tried to cc_delete static active-component!");
							}
						}
						@Pc(14935) Component component = InterfaceList.getComponent(createdComponent.id);
						component.createdComponents[createdComponent.createdComponentId] = null;
						Static28.method3270(component);
						continue;
					}
					if (opcode == 102) {
						isp--;
						@Pc(14959) Component component = InterfaceList.getComponent(intStack[isp]);
						component.createdComponents = null;
						Static28.method3270(component);
						continue;
					}
					if (opcode == 200) {
						@Pc(14972) int isp2 = isp - 2;
						@Pc(14976) int componentId = intStack[isp2];
						@Pc(14982) int createdComponentId = intStack[isp2 + 1];
						@Pc(14987) Component component = InterfaceList.getCreatedComponent(componentId, createdComponentId);
						if (component != null && createdComponentId != -1) {
							isp = isp2 + 1;
							intStack[isp2] = 1;
							if (secondary) {
								secondaryActiveComponent = component;
							} else {
								primaryActiveComponent = component;
							}
							continue;
						}
						isp = isp2 + 1;
						intStack[isp2] = 0;
						continue;
					}
					if (opcode == 201) {
						@Pc(15022) int isp2 = isp - 1;
						@Pc(15025) int componentId = intStack[isp2];
						@Pc(15031) Component component = InterfaceList.getComponent(componentId);
						if (component == null) {
							isp = isp2 + 1;
							intStack[isp2] = 0;
						} else {
							isp = isp2 + 1;
							intStack[isp2] = 1;
							if (secondary) {
								secondaryActiveComponent = component;
							} else {
								primaryActiveComponent = component;
							}
						}
						continue;
					}
				} else if (opcode < 500) {
					if (opcode == 403) {
						isp -= 2;
						@Pc(14650) int local14650 = intStack[isp];
						@Pc(14656) int local14656 = intStack[isp + 1];
						for (@Pc(14658) int i = 0; i < PlayerAppearance.anIntArray550.length; i++) {
							if (local14650 == PlayerAppearance.anIntArray550[i]) {
								PlayerList.self.appearance.method3604(i, local14656);
								continue nextOp;
							}
						}
						@Pc(14684) int i = 0;
						while (true) {
							if (PlayerAppearance.anIntArray487.length <= i) {
								continue nextOp;
							}
							if (PlayerAppearance.anIntArray487[i] == local14650) {
								PlayerList.self.appearance.method3604(i, local14656);
								continue nextOp;
							}
							i++;
						}
					}
					if (opcode == 404) {
						isp -= 2;
						@Pc(14722) int i = intStack[isp];
						@Pc(14728) int color = intStack[isp + 1];
						PlayerList.self.appearance.setColor(i, color);
						continue;
					}
					if (opcode == 410) {
						isp--;
						@Pc(14748) boolean female = intStack[isp] != 0;
						PlayerList.self.appearance.setGender(female);
						continue;
					}
				} else if (opcode >= 1000 && opcode < 1100 || opcode >= 2000 && opcode < 2100) {
					@Pc(885) Component component;
					if (opcode < 2000) {
						component = secondary ? secondaryActiveComponent : primaryActiveComponent;
					} else {
						isp--;
						component = InterfaceList.getComponent(intStack[isp]);
						opcode -= 1000;
					}
					if (opcode == 1000) {
						isp -= 4;
						component.baseX = intStack[isp];
						component.baseY = intStack[isp + 1];
						@Pc(919) int xMode = intStack[isp + 2];
						if (xMode < 0) {
							xMode = 0;
						} else if (xMode > 5) {
							xMode = 5;
						}
						@Pc(936) int yMode = intStack[isp + 3];
						component.xMode = (byte) xMode;
						if (yMode < 0) {
							yMode = 0;
						} else if (yMode > 5) {
							yMode = 5;
						}
						component.yMode = (byte) yMode;
						Static28.method3270(component);
						Static33.method4118(component);
						if (component.createdComponentId == -1) {
							DelayedStateChange.method4405(component.id);
						}
						continue;
					}
					if (opcode == 1001) {
						isp -= 4;
						component.baseWidth = intStack[isp];
						component.baseHeight = intStack[isp + 1];
						component.anInt5957 = 0;
						component.anInt5920 = 0;
						@Pc(1002) int heightMode = intStack[isp + 3];
						if (heightMode < 0) {
							heightMode = 0;
						} else if (heightMode > 4) {
							heightMode = 4;
						}
						@Pc(1021) int widthMode = intStack[isp + 2];
						if (widthMode < 0) {
							widthMode = 0;
						} else if (widthMode > 4) {
							widthMode = 4;
						}
						component.heightMode = (byte) heightMode;
						component.widthMode = (byte) widthMode;
						Static28.method3270(component);
						Static33.method4118(component);
						if (component.type == 0) {
							Static34.method4251(false, component);
						}
						continue;
					}
					if (opcode == 1003) {
						isp--;
						@Pc(1075) boolean hidden = intStack[isp] == 1;
						if (hidden != component.hidden) {
							component.hidden = hidden;
							Static28.method3270(component);
						}
						if (component.createdComponentId == -1) {
							DelayedStateChange.method4026(component.id);
						}
						continue;
					}
					if (opcode == 1004) {
						isp -= 2;
						component.aspectRatioHeight = intStack[isp];
						component.aspectRatioWidth = intStack[isp + 1];
						Static28.method3270(component);
						Static33.method4118(component);
						if (component.type == 0) {
							Static34.method4251(false, component);
						}
						continue;
					}
					if (opcode == 1005) {
						isp--;
						component.noClickThrough = intStack[isp] == 1;
						continue;
					}
				} else if (opcode >= 1100 && opcode < 1200 || opcode >= 2100 && opcode < 2200) {
					@Pc(1190) Component component;
					if (opcode >= 2000) {
						isp--;
						component = InterfaceList.getComponent(intStack[isp]);
						opcode -= 1000;
					} else {
						component = secondary ? secondaryActiveComponent : primaryActiveComponent;
					}
					if (opcode == 1100) {
						isp -= 2;
						component.scrollX = intStack[isp];
						if (component.scrollWidth - component.width < component.scrollX) {
							component.scrollX = component.scrollWidth - component.width;
						}
						if (component.scrollX < 0) {
							component.scrollX = 0;
						}
						component.scrollY = intStack[isp + 1];
						if (component.scrollY > component.scrollHeight - component.height) {
							component.scrollY = component.scrollHeight - component.height;
						}
						if (component.scrollY < 0) {
							component.scrollY = 0;
						}
						Static28.method3270(component);
						if (component.createdComponentId == -1) {
							DelayedStateChange.method111(component.id);
						}
						continue;
					}
					if (opcode == 1101) {
						isp--;
						component.color = intStack[isp];
						Static28.method3270(component);
						if (component.createdComponentId == -1) {
							DelayedStateChange.method4092(component.id);
						}
						continue;
					}
					if (opcode == 1102) {
						isp--;
						component.fill = intStack[isp] == 1;
						Static28.method3270(component);
						continue;
					}
					if (opcode == 1103) {
						isp--;
						component.transparency = intStack[isp];
						Static28.method3270(component);
						continue;
					}
					if (opcode == 1104) {
						isp--;
						component.lineWidth = intStack[isp];
						Static28.method3270(component);
						continue;
					}
					if (opcode == 1105) {
						isp--;
						component.graphic = intStack[isp];
						Static28.method3270(component);
						continue;
					}
					if (opcode == 1106) {
						isp--;
						component.angle = intStack[isp];
						Static28.method3270(component);
						continue;
					}
					if (opcode == 1107) {
						isp--;
						component.tiled = intStack[isp] == 1;
						Static28.method3270(component);
						continue;
					}
					if (opcode == 1108) {
						component.modelType = 1;
						isp--;
						component.modelId = intStack[isp];
						Static28.method3270(component);
						if (component.createdComponentId == -1) {
							DelayedStateChange.method779(component.id);
						}
						continue;
					}
					if (opcode == 1109) {
						isp -= 6;
						component.modelXOffset = intStack[isp];
						component.modelYOffset = intStack[isp + 1];
						component.modelXAngle = intStack[isp + 2];
						component.modelYAngle = intStack[isp + 3];
						component.modelZAngle = intStack[isp + 4];
						component.modelZoom = intStack[isp + 5];
						Static28.method3270(component);
						if (component.createdComponentId == -1) {
							DelayedStateChange.method1994(component.id);
							DelayedStateChange.method1224(component.id);
						}
						continue;
					}
					if (opcode == 1110) {
						isp--;
						@Pc(1529) int seqId = intStack[isp];
						if (seqId != component.modelSeqId) {
							component.anInt5897 = 0;
							component.modelSeqId = seqId;
							component.anInt5979 = 1;
							component.anInt5892 = 0;
							Static28.method3270(component);
						}
						if (component.createdComponentId == -1) {
							DelayedStateChange.method680(component.id);
						}
						continue;
					}
					if (opcode == 1111) {
						isp--;
						component.modelOrthographic = intStack[isp] == 1;
						Static28.method3270(component);
						continue;
					}
					if (opcode == 1112) {
						ssp--;
						@Pc(1590) String text = stringStack[ssp];
						if (!text.equals(component.text)) {
							component.text = text;
							Static28.method3270(component);
						}
						if (component.createdComponentId == -1) {
							DelayedStateChange.method4678(component.id);
						}
						continue;
					}
					if (opcode == 1113) {
						isp--;
						component.textFont = intStack[isp];
						Static28.method3270(component);
						continue;
					}
					if (opcode == 1114) {
						isp -= 3;
						component.textHorizontalAlignment = intStack[isp];
						component.textVerticalAlignment = intStack[isp + 1];
						component.textLineHeight = intStack[isp + 2];
						Static28.method3270(component);
						continue;
					}
					if (opcode == 1115) {
						isp--;
						component.textShadow = intStack[isp] == 1;
						Static28.method3270(component);
						continue;
					}
					if (opcode == 1116) {
						isp--;
						component.outline = intStack[isp];
						Static28.method3270(component);
						continue;
					}
					if (opcode == 1117) {
						isp--;
						component.graphicShadow = intStack[isp];
						Static28.method3270(component);
						continue;
					}
					if (opcode == 1118) {
						isp--;
						component.horizontalFlip = intStack[isp] == 1;
						Static28.method3270(component);
						continue;
					}
					if (opcode == 1119) {
						isp--;
						component.verticalFlip = intStack[isp] == 1;
						Static28.method3270(component);
						continue;
					}
					if (opcode == 1120) {
						isp -= 2;
						component.scrollWidth = intStack[isp];
						component.scrollHeight = intStack[isp + 1];
						Static28.method3270(component);
						if (component.type == 0) {
							Static34.method4251(false, component);
						}
						continue;
					}
					if (opcode == 1121) {
						isp -= 2;
						component.aShort50 = (short) intStack[isp];
						component.aShort49 = (short) intStack[isp + 1];
						Static28.method3270(component);
						continue;
					}
					if (opcode == 1122) {
						isp--;
						component.alpha = intStack[isp] == 1;
						Static28.method3270(component);
						continue;
					}
					if (opcode == 1123) {
						isp--;
						component.modelZoom = intStack[isp];
						Static28.method3270(component);
						if (component.createdComponentId == -1) {
							DelayedStateChange.method1994(component.id);
						}
						continue;
					}
					if (opcode == 1124) {
						isp--;
						@Pc(1875) int lineDirection = intStack[isp];
						component.lineDirection = lineDirection == 1;
						Static28.method3270(component);
						continue;
					}
				} else if (opcode >= 1200 && opcode < 1300 || opcode >= 2200 && opcode < 2300) {
					@Pc(1917) Component component;
					if (opcode < 2000) {
						component = secondary ? secondaryActiveComponent : primaryActiveComponent;
					} else {
						opcode -= 1000;
						isp--;
						component = InterfaceList.getComponent(intStack[isp]);
					}
					Static28.method3270(component);
					if (opcode == 1200 || opcode == 1205 || opcode == 1208 || opcode == 1209) {
						isp -= 2;
						@Pc(1955) int objCount = intStack[isp + 1];
						@Pc(1959) int objId = intStack[isp];
						if (component.createdComponentId == -1) {
							DelayedStateChange.method676(component.id);
							DelayedStateChange.method1994(component.id);
							DelayedStateChange.method1224(component.id);
						}
						if (objId == -1) {
							component.modelType = 1;
							component.modelId = -1;
							component.objId = -1;
							continue;
						}
						component.objCount = objCount;
						if (opcode == 1208 || opcode == 1209) {
							component.objWearColor = true;
						} else {
							component.objWearColor = false;
						}
						component.objId = objId;
						@Pc(2020) ObjType objType = ObjTypeList.get(objId);
						component.modelYOffset = objType.yOffset2d;
						component.modelXOffset = objType.xOffset2d;
						component.modelXAngle = objType.xAngle2d;
						component.modelYAngle = objType.yAngle2d;
						component.modelZoom = objType.zoom2d;
						component.modelZAngle = objType.anInt5062;
						if (opcode == 1205) {
							component.showObjCount = false;
						} else {
							component.showObjCount = true;
						}
						if (component.anInt5957 > 0) {
							component.modelZoom = component.modelZoom * 32 / component.anInt5957;
						} else if (component.baseWidth > 0) {
							component.modelZoom = component.modelZoom * 32 / component.baseWidth;
						}
						continue;
					}
					if (opcode == 1201) {
						component.modelType = 2;
						isp--;
						component.modelId = intStack[isp];
						if (component.createdComponentId == -1) {
							DelayedStateChange.method779(component.id);
						}
						continue;
					}
					if (opcode == 1202) {
						component.modelType = 3;
						component.modelId = PlayerList.self.appearance.method3611();
						if (component.createdComponentId == -1) {
							DelayedStateChange.method779(component.id);
						}
						continue;
					}
					if (opcode == 1203) {
						component.modelType = 6;
						isp--;
						component.modelId = intStack[isp];
						if (component.createdComponentId == -1) {
							DelayedStateChange.method779(component.id);
						}
						continue;
					}
					if (opcode == 1204) {
						component.modelType = 5;
						isp--;
						component.modelId = intStack[isp];
						if (component.createdComponentId == -1) {
							DelayedStateChange.method779(component.id);
						}
						continue;
					}
					if (opcode == 1206) {
						isp -= 4;
						component.anInt5972 = intStack[isp];
						component.anInt5916 = intStack[isp + 1];
						component.anInt5977 = intStack[isp + 2];
						component.anInt5898 = intStack[isp + 3];
						Static28.method3270(component);
						continue;
					}
					if (opcode == 1207) {
						isp -= 2;
						component.anInt5965 = intStack[isp];
						component.anInt5917 = intStack[isp + 1];
						Static28.method3270(component);
						continue;
					}
				} else if (opcode >= 1300 && opcode < 1400 || opcode >= 2300 && opcode < 2400) {
					@Pc(2274) Component component;
					if (opcode < 2000) {
						component = secondary ? secondaryActiveComponent : primaryActiveComponent;
					} else {
						opcode -= 1000;
						isp--;
						component = InterfaceList.getComponent(intStack[isp]);
					}
					if (opcode == 1300) {
						isp--;
						@Pc(2295) int i = intStack[isp] - 1;
						if (i >= 0 && i <= 9) {
							ssp--;
							component.setOp(i, stringStack[ssp]);
							continue;
						}
						ssp--;
						continue;
					}
					if (opcode == 1301) {
						isp -= 2;
						@Pc(2323) int createdComponentId = intStack[isp + 1];
						@Pc(2327) int componentId = intStack[isp];
						component.dragComponent = InterfaceList.getCreatedComponent(componentId, createdComponentId);
						continue;
					}
					if (opcode == 1302) {
						isp--;
						component.dragRender = intStack[isp] == 1;
						continue;
					}
					if (opcode == 1303) {
						isp--;
						component.dragDeadZone = intStack[isp];
						continue;
					}
					if (opcode == 1304) {
						isp--;
						component.dragDeadTime = intStack[isp];
						continue;
					}
					if (opcode == 1305) {
						ssp--;
						component.opBase = stringStack[ssp];
						continue;
					}
					if (opcode == 1306) {
						ssp--;
						component.targetVerb = stringStack[ssp];
						continue;
					}
					if (opcode == 1307) {
						component.ops = null;
						continue;
					}
					if (opcode == 1308) {
						@Pc(2421) int isp2 = isp - 1;
						component.anInt5890 = intStack[isp2];
						isp = isp2 - 1;
						component.anInt5930 = intStack[isp];
						continue;
					}
					if (opcode == 1309) {
						@Pc(2439) int isp2 = isp - 1;
						@Pc(2442) int cursor = intStack[isp2];
						isp = isp2 - 1;
						@Pc(2447) int op = intStack[isp];
						if (op >= 1 && op <= 10) {
							component.setOpCursor(op - 1, cursor);
						}
						continue;
					}
					if (opcode == 1310) {
						ssp--;
						component.pauseText = stringStack[ssp];
						continue;
					}
				} else {
					if (opcode >= 1400 && opcode < 1500 || opcode >= 2400 && opcode < 2500) {
						@Pc(2505) Component component;
						if (opcode < 2000) {
							component = secondary ? secondaryActiveComponent : primaryActiveComponent;
						} else {
							isp--;
							component = InterfaceList.getComponent(intStack[isp]);
							opcode -= 1000;
						}
						ssp--;
						@Pc(2522) String descriptor = stringStack[ssp];
						@Pc(2524) int[] triggers = null;
						if (descriptor.length() > 0 && descriptor.charAt(descriptor.length() - 1) == 'Y') {
							isp--;
							@Pc(2544) int i = intStack[isp];
							if (i > 0) {
								triggers = new int[i];
								while (i-- > 0) {
									isp--;
									triggers[i] = intStack[isp];
								}
							}
							descriptor = descriptor.substring(0, descriptor.length() - 1);
						}
						@Pc(2581) Object[] arguments = new Object[descriptor.length() + 1];
						for (@Pc(2586) int i = arguments.length - 1; i >= 1; i--) {
							if (descriptor.charAt(i - 1) == 's') {
								ssp--;
								arguments[i] = stringStack[ssp];
							} else {
								isp--;
								arguments[i] = Integer.valueOf(intStack[isp]);
							}
						}
						isp--;
						@Pc(2627) int scriptId = intStack[isp];
						if (scriptId == -1) {
							arguments = null;
						} else {
							arguments[0] = Integer.valueOf(scriptId);
						}
						component.aBoolean403 = true;
						if (opcode == 1400) {
							component.onClick = arguments;
						} else if (opcode == 1401) {
							component.onHold = arguments;
						} else if (opcode == 1402) {
							component.onRelease = arguments;
						} else if (opcode == 1403) {
							component.onMouseOver = arguments;
						} else if (opcode == 1404) {
							component.onMouseLeave = arguments;
						} else if (opcode == 1405) {
							component.onDrag = arguments;
						} else if (opcode == 1406) {
							component.onTargetLeave = arguments;
						} else if (opcode == 1407) {
							component.onVarpTransmit = arguments;
							component.varpTriggers = triggers;
						} else if (opcode == 1408) {
							component.onTimer = arguments;
						} else if (opcode == 1409) {
							component.onOp = arguments;
						} else if (opcode == 1410) {
							component.onDragComplete = arguments;
						} else if (opcode == 1411) {
							component.onClickRepeat = arguments;
						} else if (opcode == 1412) {
							component.onMouseRepeat = arguments;
						} else if (opcode == 1414) {
							component.inventoryTriggers = triggers;
							component.onInvTransmit = arguments;
						} else if (opcode == 1415) {
							component.onStatTransmit = arguments;
							component.statTriggers = triggers;
						} else if (opcode == 1416) {
							component.onTargetEnter = arguments;
						} else if (opcode == 1417) {
							component.onScrollWheel = arguments;
						} else if (opcode == 1418) {
							component.onChatTransmit = arguments;
						} else if (opcode == 1419) {
							component.onKey = arguments;
						} else if (opcode == 1420) {
							component.onFriendTransmit = arguments;
						} else if (opcode == 1421) {
							component.onClanTransmit = arguments;
						} else if (opcode == 1422) {
							component.onMiscTransmit = arguments;
						} else if (opcode == 1423) {
							component.onDialogAbort = arguments;
						} else if (opcode == 1424) {
							component.onSubChange = arguments;
						} else if (opcode == 1425) {
							component.onStockTransmit = arguments;
						} else if (opcode == 1426) {
							component.onCamFinished = arguments;
						} else if (opcode == 1427) {
							component.onResize = arguments;
						} else if (opcode == 1428) {
							component.onVarcTransmit = arguments;
							component.varcTriggers = triggers;
						} else if (opcode == 1429) {
							component.onVarcstrTransmit = arguments;
							component.varcstrTriggers = triggers;
						}
						continue;
					}
					if (opcode < 1600) {
						@Pc(14557) Component component = secondary ? secondaryActiveComponent : primaryActiveComponent;
						if (opcode == 1500) {
							intStack[isp++] = component.x;
							continue;
						}
						if (opcode == 1501) {
							intStack[isp++] = component.y;
							continue;
						}
						if (opcode == 1502) {
							intStack[isp++] = component.width;
							continue;
						}
						if (opcode == 1503) {
							intStack[isp++] = component.height;
							continue;
						}
						if (opcode == 1504) {
							intStack[isp++] = component.hidden ? 1 : 0;
							continue;
						}
						if (opcode == 1505) {
							intStack[isp++] = component.layer;
							continue;
						}
					} else if (opcode < 1700) {
						@Pc(2934) Component component = secondary ? secondaryActiveComponent : primaryActiveComponent;
						if (opcode == 1600) {
							intStack[isp++] = component.scrollX;
							continue;
						}
						if (opcode == 1601) {
							intStack[isp++] = component.scrollY;
							continue;
						}
						if (opcode == 1602) {
							stringStack[ssp++] = component.text;
							continue;
						}
						if (opcode == 1603) {
							intStack[isp++] = component.scrollWidth;
							continue;
						}
						if (opcode == 1604) {
							intStack[isp++] = component.scrollHeight;
							continue;
						}
						if (opcode == 1605) {
							intStack[isp++] = component.modelZoom;
							continue;
						}
						if (opcode == 1606) {
							intStack[isp++] = component.modelXAngle;
							continue;
						}
						if (opcode == 1607) {
							intStack[isp++] = component.modelZAngle;
							continue;
						}
						if (opcode == 1608) {
							intStack[isp++] = component.modelYAngle;
							continue;
						}
						if (opcode == 1609) {
							intStack[isp++] = component.transparency;
							continue;
						}
						if (opcode == 1610) {
							intStack[isp++] = component.modelXOffset;
							continue;
						}
						if (opcode == 1611) {
							intStack[isp++] = component.modelYOffset;
							continue;
						}
						if (opcode == 1612) {
							intStack[isp++] = component.graphic;
							continue;
						}
					} else if (opcode < 1800) {
						@Pc(3109) Component component = secondary ? secondaryActiveComponent : primaryActiveComponent;
						if (opcode == 1700) {
							intStack[isp++] = component.objId;
							continue;
						}
						if (opcode == 1701) {
							if (component.objId == -1) {
								intStack[isp++] = 0;
							} else {
								intStack[isp++] = component.objCount;
							}
							continue;
						}
						if (opcode == 1702) {
							intStack[isp++] = component.createdComponentId;
							continue;
						}
					} else if (opcode < 1900) {
						@Pc(3170) Component component = secondary ? secondaryActiveComponent : primaryActiveComponent;
						if (opcode == 1800) {
							intStack[isp++] = InterfaceList.getServerActiveProperties(component).getTargetMask();
							continue;
						}
						if (opcode == 1801) {
							isp--;
							@Pc(3193) int i = intStack[isp];
							i--;
							if (component.ops != null && component.ops.length > i && component.ops[i] != null) {
								stringStack[ssp++] = component.ops[i];
								continue;
							}
							stringStack[ssp++] = "";
							continue;
						}
						if (opcode == 1802) {
							if (component.opBase == null) {
								stringStack[ssp++] = "";
							} else {
								stringStack[ssp++] = component.opBase;
							}
							continue;
						}
					} else if (opcode < 2600) {
						@Pc(14466) int isp2 = isp - 1;
						@Pc(14470) Component component = InterfaceList.getComponent(intStack[isp2]);
						if (opcode == 2500) {
							isp = isp2 + 1;
							intStack[isp2] = component.x;
							continue;
						}
						if (opcode == 2501) {
							isp = isp2 + 1;
							intStack[isp2] = component.y;
							continue;
						}
						if (opcode == 2502) {
							isp = isp2 + 1;
							intStack[isp2] = component.width;
							continue;
						}
						if (opcode == 2503) {
							isp = isp2 + 1;
							intStack[isp2] = component.height;
							continue;
						}
						if (opcode == 2504) {
							isp = isp2 + 1;
							intStack[isp2] = component.hidden ? 1 : 0;
							continue;
						}
						if (opcode == 2505) {
							isp = isp2 + 1;
							intStack[isp2] = component.layer;
							continue;
						}
					} else if (opcode < 2700) {
						isp--;
						@Pc(14299) Component component = InterfaceList.getComponent(intStack[isp]);
						if (opcode == 2600) {
							intStack[isp++] = component.scrollX;
							continue;
						}
						if (opcode == 2601) {
							intStack[isp++] = component.scrollY;
							continue;
						}
						if (opcode == 2602) {
							stringStack[ssp++] = component.text;
							continue;
						}
						if (opcode == 2603) {
							intStack[isp++] = component.scrollWidth;
							continue;
						}
						if (opcode == 2604) {
							intStack[isp++] = component.scrollHeight;
							continue;
						}
						if (opcode == 2605) {
							intStack[isp++] = component.modelZoom;
							continue;
						}
						if (opcode == 2606) {
							intStack[isp++] = component.modelXAngle;
							continue;
						}
						if (opcode == 2607) {
							intStack[isp++] = component.modelZAngle;
							continue;
						}
						if (opcode == 2608) {
							intStack[isp++] = component.modelYAngle;
							continue;
						}
						if (opcode == 2609) {
							intStack[isp++] = component.transparency;
							continue;
						}
						if (opcode == 2610) {
							intStack[isp++] = component.modelXOffset;
							continue;
						}
						if (opcode == 2611) {
							intStack[isp++] = component.modelYOffset;
							continue;
						}
						if (opcode == 2612) {
							intStack[isp++] = component.graphic;
							continue;
						}
					} else if (opcode < 2800) {
						if (opcode == 2700) {
							@Pc(14115) int isp2 = isp - 1;
							@Pc(14119) Component component = InterfaceList.getComponent(intStack[isp2]);
							isp = isp2 + 1;
							intStack[isp2] = component.objId;
							continue;
						}
						if (opcode == 2701) {
							@Pc(14134) int isp2 = isp - 1;
							@Pc(14138) Component component = InterfaceList.getComponent(intStack[isp2]);
							if (component.objId == -1) {
								isp = isp2 + 1;
								intStack[isp2] = 0;
							} else {
								isp = isp2 + 1;
								intStack[isp2] = component.objCount;
							}
							continue;
						}
						if (opcode == 2702) {
							@Pc(14166) int isp2 = isp - 1;
							@Pc(14169) int componentId = intStack[isp2];
							@Pc(14176) SubInterface subInterface = (SubInterface) InterfaceList.subInterfaces.get(componentId);
							if (subInterface == null) {
								isp = isp2 + 1;
								intStack[isp2] = 0;
							} else {
								isp = isp2 + 1;
								intStack[isp2] = 1;
							}
							continue;
						}
						if (opcode == 2703) {
							@Pc(14202) int isp2 = isp - 1;
							@Pc(14206) Component component = InterfaceList.getComponent(intStack[isp2]);
							if (component.createdComponents == null) {
								isp = isp2 + 1;
								intStack[isp2] = 0;
								continue;
							}
							@Pc(14221) int nextSubId = component.createdComponents.length;
							for (@Pc(14223) int i = 0; i < component.createdComponents.length; i++) {
								if (component.createdComponents[i] == null) {
									nextSubId = i;
									break;
								}
							}
							isp = isp2 + 1;
							intStack[isp2] = nextSubId;
							continue;
						}
						if (opcode == 2704 || opcode == 2705) {
							@Pc(14255) int isp2 = isp - 2;
							@Pc(14259) int componentId = intStack[isp2];
							@Pc(14265) int interfaceId = intStack[isp2 + 1];
							@Pc(14272) SubInterface subInterface = (SubInterface) InterfaceList.subInterfaces.get(componentId);
							if (subInterface != null && subInterface.id == interfaceId) {
								isp = isp2 + 1;
								intStack[isp2] = 1;
								continue;
							}
							isp = isp2 + 1;
							intStack[isp2] = 0;
							continue;
						}
					} else if (opcode < 2900) {
						isp--;
						@Pc(3273) Component component = InterfaceList.getComponent(intStack[isp]);
						if (opcode == 2800) {
							intStack[isp++] = InterfaceList.getServerActiveProperties(component).getTargetMask();
							continue;
						}
						if (opcode == 2801) {
							isp--;
							@Pc(3297) int op = intStack[isp];
							op--;
							if (component.ops != null && op < component.ops.length && component.ops[op] != null) {
								stringStack[ssp++] = component.ops[op];
								continue;
							}
							stringStack[ssp++] = "";
							continue;
						}
						if (opcode == 2802) {
							if (component.opBase == null) {
								stringStack[ssp++] = "";
							} else {
								stringStack[ssp++] = component.opBase;
							}
							continue;
						}
					} else if (opcode < 3200) {
						if (opcode == 3100) {
							ssp--;
							@Pc(13872) String message = stringStack[ssp];
							Chat.add(0, "", message);
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
							@Pc(13921) String valueString = stringStack[ssp];
							@Pc(13923) int value = 0;
							if (StringUtils.isInt(valueString)) {
								value = StringUtils.parseInt(valueString);
							}
							Protocol.outboundBuffer.writeOpcode(219);
							Protocol.outboundBuffer.writeInt(value);
							continue;
						}
						if (opcode == 3105) {
							ssp--;
							@Pc(13955) String username = stringStack[ssp];
							Protocol.outboundBuffer.writeOpcode(149);
							Protocol.outboundBuffer.writeLong(Base37.encode(username));
							continue;
						}
						if (opcode == 3106) {
							ssp--;
							@Pc(13986) String string = stringStack[ssp];
							Protocol.outboundBuffer.writeOpcode(164);
							Protocol.outboundBuffer.writeByte(string.length() + 1);
							Protocol.outboundBuffer.writeString(string);
							continue;
						}
						if (opcode == 3107) {
							isp--;
							@Pc(14014) int op = intStack[isp];
							ssp--;
							@Pc(14019) String username = stringStack[ssp];
							Static8.method7(op, username);
							continue;
						}
						if (opcode == 3108) {
							isp -= 3;
							@Pc(14033) int x = intStack[isp];
							@Pc(14039) int componentId = intStack[isp + 2];
							@Pc(14045) int y = intStack[isp + 1];
							@Pc(14049) Component component = InterfaceList.getComponent(componentId);
							Static15.method1401(component, x, y);
							continue;
						}
						if (opcode == 3109) {
							isp -= 2;
							@Pc(14069) int y = intStack[isp + 1];
							@Pc(14073) int x = intStack[isp];
							@Pc(14079) Component component = secondary ? secondaryActiveComponent : primaryActiveComponent;
							Static15.method1401(component, x, y);
							continue;
						}
						if (opcode == 3110) {
							isp--;
							@Pc(14098) int objId = intStack[isp];
							Protocol.outboundBuffer.writeOpcode(231);
							Protocol.outboundBuffer.writeShort(objId);
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
							@Pc(13111) int isp2 = isp - 2;
							@Pc(13117) int slot = intStack[isp2 + 1];
							@Pc(13121) int invId = intStack[isp2];
							isp = isp2 + 1;
							intStack[isp2] = Inv.getItemType(invId, slot);
							continue;
						}
						if (opcode == 3302) {
							@Pc(13138) int isp2 = isp - 2;
							@Pc(13142) int invId = intStack[isp2];
							@Pc(13148) int slot = intStack[isp2 + 1];
							isp = isp2 + 1;
							intStack[isp2] = Inv.getItemCount(invId, slot);
							continue;
						}
						if (opcode == 3303) {
							@Pc(13164) int isp2 = isp - 2;
							@Pc(13168) int invId = intStack[isp2];
							@Pc(13174) int objId = intStack[isp2 + 1];
							isp = isp2 + 1;
							intStack[isp2] = Inv.getSlotTotal(invId, objId);
							continue;
						}
						if (opcode == 3304) {
							@Pc(13191) int isp2 = isp - 1;
							@Pc(13194) int invId = intStack[isp2];
							isp = isp2 + 1;
							intStack[isp2] = InvTypeList.get(invId).size;
							continue;
						}
						if (opcode == 3305) {
							@Pc(13209) int isp2 = isp - 1;
							@Pc(13212) int skill = intStack[isp2];
							isp = isp2 + 1;
							intStack[isp2] = PlayerSkillXpTable.boostedLevels[skill];
							continue;
						}
						if (opcode == 3306) {
							@Pc(13227) int isp2 = isp - 1;
							@Pc(13230) int skill = intStack[isp2];
							isp = isp2 + 1;
							intStack[isp2] = PlayerSkillXpTable.baseLevels[skill];
							continue;
						}
						if (opcode == 3307) {
							@Pc(13245) int isp2 = isp - 1;
							@Pc(13248) int skill = intStack[isp2];
							isp = isp2 + 1;
							intStack[isp2] = PlayerSkillXpTable.experience[skill];
							continue;
						}
						if (opcode == 3308) {
							@Pc(13263) int level = Player.level;
							@Pc(13270) int x = Static5.originX + (PlayerList.self.xFine >> 7);
							@Pc(13277) int z = Static7.originZ + (PlayerList.self.zFine >> 7);
							intStack[isp++] = (x << 14) + (level << 28) + z;
							continue;
						}
						if (opcode == 3309) {
							@Pc(13299) int isp2 = isp - 1;
							@Pc(13302) int coord = intStack[isp2];
							isp = isp2 + 1;
							intStack[isp2] = coord >> 14 & 0x3FFF;
							continue;
						}
						if (opcode == 3310) {
							@Pc(13321) int isp2 = isp - 1;
							@Pc(13324) int coord = intStack[isp2];
							isp = isp2 + 1;
							intStack[isp2] = coord >> 28;
							continue;
						}
						if (opcode == 3311) {
							@Pc(13339) int isp2 = isp - 1;
							@Pc(13342) int coord = intStack[isp2];
							isp = isp2 + 1;
							intStack[isp2] = coord & 0x3FFF;
							continue;
						}
						if (opcode == 3312) {
							intStack[isp++] = LoginManager.mapMembers ? 1 : 0;
							continue;
						}
						if (opcode == 3313) {
							@Pc(13371) int isp2 = isp - 2;
							@Pc(13377) int slot = intStack[isp2 + 1];
							@Pc(13383) int invId = intStack[isp2] + 32768;
							isp = isp2 + 1;
							intStack[isp2] = Inv.getItemType(invId, slot);
							continue;
						}
						if (opcode == 3314) {
							@Pc(13398) int isp2 = isp - 2;
							@Pc(13404) int slot = intStack[isp2 + 1];
							@Pc(13410) int invId = intStack[isp2] + 32768;
							isp = isp2 + 1;
							intStack[isp2] = Inv.getItemCount(invId, slot);
							continue;
						}
						if (opcode == 3315) {
							@Pc(13424) int isp2 = isp - 2;
							@Pc(13430) int invId = intStack[isp2] + 32768;
							@Pc(13436) int slot = intStack[isp2 + 1];
							isp = isp2 + 1;
							intStack[isp2] = Inv.getSlotTotal(invId, slot);
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
							intStack[isp++] = Static5.rebootTimer;
							continue;
						}
						if (opcode == 3318) {
							intStack[isp++] = client.worldId;
							continue;
						}
						if (opcode == 3321) {
							intStack[isp++] = Static2.runEnergy;
							continue;
						}
						if (opcode == 3322) {
							intStack[isp++] = Static3.weight;
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
							@Pc(13650) int isp2 = isp - 1;
							@Pc(13653) int invId = intStack[isp2];
							isp = isp2 + 1;
							intStack[isp2] = Inv.getFreeSpace(invId);
							continue;
						}
						if (opcode == 3331) {
							@Pc(13668) int isp2 = isp - 2;
							@Pc(13674) int paramId = intStack[isp2 + 1];
							@Pc(13678) int invId = intStack[isp2];
							isp = isp2 + 1;
							intStack[isp2] = Inv.getTotalParam(invId, paramId, false);
							continue;
						}
						if (opcode == 3332) {
							@Pc(13694) int isp2 = isp - 2;
							@Pc(13700) int paramId = intStack[isp2 + 1];
							@Pc(13704) int invId = intStack[isp2];
							isp = isp2 + 1;
							intStack[isp2] = Inv.getTotalParam(invId, paramId, true);
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
							@Pc(13748) int isp2 = isp - 4;
							@Pc(13752) int coord = intStack[isp2];
							@Pc(13758) int x = intStack[isp2 + 1];
							@Pc(13764) int level = intStack[isp2 + 2];
							coord += x << 14;
							coord += level << 28;
							@Pc(13782) int z = intStack[isp2 + 3];
							coord += z;
							isp = isp2 + 1;
							intStack[isp2] = coord;
							continue;
						}
						if (opcode == 3337) {
							intStack[isp++] = client.affiliate;
							continue;
						}
					} else if (opcode < 3500) {
						if (opcode == 3400) {
							isp -= 2;
							@Pc(3379) int id = intStack[isp];
							@Pc(3385) int key = intStack[isp + 1];
							@Pc(3389) EnumType type = EnumTypeList.get(id);
							if (type.valueType == 's') {
							}
							stringStack[ssp++] = type.getString(key);
							continue;
						}
						if (opcode == 3408) {
							isp -= 4;
							@Pc(3414) int valueType = intStack[isp + 1];
							@Pc(3418) int keyType = intStack[isp];
							@Pc(3424) int id = intStack[isp + 2];
							@Pc(3430) int key = intStack[isp + 3];
							@Pc(3434) EnumType type = EnumTypeList.get(id);
							if (keyType == type.keyType && valueType == type.valueType) {
								if (valueType == 115) {
									stringStack[ssp++] = type.getString(key);
								} else {
									intStack[isp++] = type.getInt(key);
								}
								continue;
							}
							throw new RuntimeException("C3408-1");
						}
						if (opcode == 3409) {
							@Pc(3481) int isp2 = isp - 3;
							@Pc(3485) int valueType = intStack[isp2];
							@Pc(3491) int id = intStack[isp2 + 1];
							@Pc(3497) int value = intStack[isp2 + 2];
							if (id == -1) {
								throw new RuntimeException("C3409-2");
							}
							@Pc(3510) EnumType type = EnumTypeList.get(id);
							if (type.valueType != valueType) {
								throw new RuntimeException("C3409-1");
							}
							isp = isp2 + 1;
							intStack[isp2] = type.containsValue(value) ? 1 : 0;
							continue;
						}
						if (opcode == 3410) {
							ssp--;
							@Pc(3545) String value = stringStack[ssp];
							@Pc(3547) int isp2 = isp - 1;
							@Pc(3550) int id = intStack[isp2];
							if (id == -1) {
								throw new RuntimeException("C3410-2");
							}
							@Pc(3564) EnumType type = EnumTypeList.get(id);
							if (type.valueType != 's') {
								throw new RuntimeException("C3410-1");
							}
							isp = isp2 + 1;
							intStack[isp2] = type.containsValue(value) ? 1 : 0;
							continue;
						}
						if (opcode == 3411) {
							@Pc(3597) int isp2 = isp - 1;
							@Pc(3600) int id = intStack[isp2];
							@Pc(3604) EnumType type = EnumTypeList.get(id);
							isp = isp2 + 1;
							intStack[isp2] = type.table.size();
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
							@Pc(12342) int i = intStack[isp];
							if (FriendsList.state == 2 && i < FriendsList.size) {
								stringStack[ssp++] = FriendsList.usernames[i];
								continue;
							}
							stringStack[ssp++] = "";
							continue;
						}
						if (opcode == 3602) {
							@Pc(12374) int isp2 = isp - 1;
							@Pc(12377) int i = intStack[isp2];
							if (FriendsList.state == 2 && i < FriendsList.size) {
								isp = isp2 + 1;
								intStack[isp2] = FriendsList.worlds[i];
								continue;
							}
							isp = isp2 + 1;
							intStack[isp2] = 0;
							continue;
						}
						if (opcode == 3603) {
							@Pc(12404) int isp2 = isp - 1;
							@Pc(12407) int i = intStack[isp2];
							if (FriendsList.state == 2 && i < FriendsList.size) {
								isp = isp2 + 1;
								intStack[isp2] = FriendsList.ranks[i];
								continue;
							}
							isp = isp2 + 1;
							intStack[isp2] = 0;
							continue;
						}
						if (opcode == 3604) {
							ssp--;
							@Pc(12441) String username = stringStack[ssp];
							isp--;
							@Pc(12446) int rank = intStack[isp];
							FriendsList.setRank(username, rank);
							continue;
						}
						if (opcode == 3605) {
							ssp--;
							@Pc(12462) String username = stringStack[ssp];
							FriendsList.add(Base37.encode(username));
							continue;
						}
						if (opcode == 3606) {
							ssp--;
							@Pc(12478) String username = stringStack[ssp];
							FriendsList.remove(Base37.encode(username));
							continue;
						}
						if (opcode == 3607) {
							ssp--;
							@Pc(12499) String username = stringStack[ssp];
							IgnoreList.add(Base37.encode(username), false);
							continue;
						}
						if (opcode == 3608) {
							ssp--;
							@Pc(12520) String username = stringStack[ssp];
							IgnoreList.remove(Base37.encode(username));
							continue;
						}
						if (opcode == 3609) {
							ssp--;
							@Pc(12536) String username = stringStack[ssp];
							if (username.startsWith("<img=0>") || username.startsWith("<img=1>")) {
								username = username.substring(7);
							}
							intStack[isp++] = FriendsList.contains(username) ? 1 : 0;
							continue;
						}
						if (opcode == 3610) {
							isp--;
							@Pc(12571) int i = intStack[isp];
							if (FriendsList.state == 2 && i < FriendsList.size) {
								stringStack[ssp++] = FriendsList.worldNames[i];
								continue;
							}
							stringStack[ssp++] = "";
							continue;
						}
						if (opcode == 3611) {
							if (ClanChat.name == null) {
								stringStack[ssp++] = "";
							} else {
								stringStack[ssp++] = Base37.toTitleCase(ClanChat.name);
							}
							continue;
						}
						if (opcode == 3612) {
							if (ClanChat.name == null) {
								intStack[isp++] = 0;
							} else {
								intStack[isp++] = ClanChat.size;
							}
							continue;
						}
						if (opcode == 3613) {
							isp--;
							@Pc(12645) int i = intStack[isp];
							if (ClanChat.name != null && i < ClanChat.size) {
								stringStack[ssp++] = Base37.toTitleCase(ClanChat.members[i].username);
								continue;
							}
							stringStack[ssp++] = "";
							continue;
						}
						if (opcode == 3614) {
							@Pc(12678) int isp2 = isp - 1;
							@Pc(12681) int i = intStack[isp2];
							if (ClanChat.name != null && ClanChat.size > i) {
								isp = isp2 + 1;
								intStack[isp2] = ClanChat.members[i].world;
								continue;
							}
							isp = isp2 + 1;
							intStack[isp2] = 0;
							continue;
						}
						if (opcode == 3615) {
							@Pc(12716) int isp2 = isp - 1;
							@Pc(12719) int i = intStack[isp2];
							if (ClanChat.name != null && ClanChat.size > i) {
								isp = isp2 + 1;
								intStack[isp2] = ClanChat.members[i].rank;
								continue;
							}
							isp = isp2 + 1;
							intStack[isp2] = 0;
							continue;
						}
						if (opcode == 3616) {
							intStack[isp++] = ClanChat.minKick;
							continue;
						}
						if (opcode == 3617) {
							ssp--;
							@Pc(12761) String username = stringStack[ssp];
							ClanChat.kick(username);
							continue;
						}
						if (opcode == 3618) {
							intStack[isp++] = ClanChat.rank;
							continue;
						}
						if (opcode == 3619) {
							ssp--;
							@Pc(12786) String name = stringStack[ssp];
							ClanChat.join(Base37.encode(name));
							continue;
						}
						if (opcode == 3620) {
							ClanChat.leave();
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
							@Pc(12831) int isp2 = intStack[isp];
							if (FriendsList.state != 0 && IgnoreList.size > isp2) {
								stringStack[ssp++] = Base37.decodeTitleCase(IgnoreList.encodedUsernames[isp2]);
								continue;
							}
							stringStack[ssp++] = "";
							continue;
						}
						if (opcode == 3623) {
							ssp--;
							@Pc(12863) String username = stringStack[ssp];
							if (username.startsWith("<img=0>") || username.startsWith("<img=1>")) {
								username = username.substring(7);
							}
							intStack[isp++] = IgnoreList.contains(username) ? 1 : 0;
							continue;
						}
						if (opcode == 3624) {
							@Pc(12894) int isp2 = isp - 1;
							@Pc(12897) int i = intStack[isp2];
							if (ClanChat.members != null && i < ClanChat.size && ClanChat.members[i].username.equalsIgnoreCase(PlayerList.self.username)) {
								isp = isp2 + 1;
								intStack[isp2] = 1;
								continue;
							}
							isp = isp2 + 1;
							intStack[isp2] = 0;
							continue;
						}
						if (opcode == 3625) {
							if (ClanChat.owner == null) {
								stringStack[ssp++] = "";
							} else {
								stringStack[ssp++] = Base37.toTitleCase(ClanChat.owner);
							}
							continue;
						}
						if (opcode == 3626) {
							isp--;
							@Pc(12954) int i = intStack[isp];
							if (ClanChat.name != null && ClanChat.size > i) {
								stringStack[ssp++] = ClanChat.members[i].worldName;
								continue;
							}
							stringStack[ssp++] = "";
							continue;
						}
						if (opcode == 3627) {
							@Pc(12981) int isp2 = isp - 1;
							@Pc(12984) int i = intStack[isp2];
							if (FriendsList.state == 2 && i >= 0 && FriendsList.size > i) {
								isp = isp2 + 1;
								intStack[isp2] = FriendsList.sameGame[i] ? 1 : 0;
								continue;
							}
							isp = isp2 + 1;
							intStack[isp2] = 0;
							continue;
						}
						if (opcode == 3628) {
							ssp--;
							@Pc(13020) String username = stringStack[ssp];
							if (username.startsWith("<img=0>") || username.startsWith("<img=1>")) {
								username = username.substring(7);
							}
							intStack[isp++] = FriendsList.indexOf(username);
							continue;
						}
						if (opcode == 3629) {
							intStack[isp++] = client.country;
							continue;
						}
						if (opcode == 3630) {
							ssp--;
							@Pc(13064) String username = stringStack[ssp];
							IgnoreList.add(Base37.encode(username), true);
							continue;
						}
						if (opcode == 3631) {
							@Pc(13079) int isp2 = isp - 1;
							@Pc(13082) int i = intStack[isp2];
							isp = isp2 + 1;
							intStack[isp2] = IgnoreList.temporary[i] ? 1 : 0;
							continue;
						}
					} else if (opcode < 4000) {
						if (opcode == 3903) {
							@Pc(3628) int isp2 = isp - 1;
							@Pc(3631) int i = intStack[isp2];
							isp = isp2 + 1;
							intStack[isp2] = StockMarketManager.offers[i].getType();
							continue;
						}
						if (opcode == 3904) {
							@Pc(3650) int isp2 = isp - 1;
							@Pc(3653) int i = intStack[isp2];
							isp = isp2 + 1;
							intStack[isp2] = StockMarketManager.offers[i].item;
							continue;
						}
						if (opcode == 3905) {
							@Pc(3670) int isp2 = isp - 1;
							@Pc(3673) int i = intStack[isp2];
							isp = isp2 + 1;
							intStack[isp2] = StockMarketManager.offers[i].price;
							continue;
						}
						if (opcode == 3906) {
							@Pc(3690) int isp2 = isp - 1;
							@Pc(3693) int i = intStack[isp2];
							isp = isp2 + 1;
							intStack[isp2] = StockMarketManager.offers[i].count;
							continue;
						}
						if (opcode == 3907) {
							@Pc(3708) int isp2 = isp - 1;
							@Pc(3711) int i = intStack[isp2];
							isp = isp2 + 1;
							intStack[isp2] = StockMarketManager.offers[i].completedCount;
							continue;
						}
						if (opcode == 3908) {
							@Pc(3726) int isp2 = isp - 1;
							@Pc(3729) int i = intStack[isp2];
							isp = isp2 + 1;
							intStack[isp2] = StockMarketManager.offers[i].completedGold;
							continue;
						}
						if (opcode == 3910) {
							@Pc(3745) int isp2 = isp - 1;
							@Pc(3748) int i = intStack[isp2];
							@Pc(3754) int status = StockMarketManager.offers[i].getStatus();
							isp = isp2 + 1;
							intStack[isp2] = status == 0 ? 1 : 0;
							continue;
						}
						if (opcode == 3911) {
							@Pc(3776) int isp2 = isp - 1;
							@Pc(3779) int i = intStack[isp2];
							@Pc(3785) int status = StockMarketManager.offers[i].getStatus();
							isp = isp2 + 1;
							intStack[isp2] = status == 2 ? 1 : 0;
							continue;
						}
						if (opcode == 3912) {
							@Pc(3803) int isp2 = isp - 1;
							@Pc(3806) int i = intStack[isp2];
							@Pc(3814) int status = StockMarketManager.offers[i].getStatus();
							isp = isp2 + 1;
							intStack[isp2] = status == 5 ? 1 : 0;
							continue;
						}
						if (opcode == 3913) {
							@Pc(3835) int isp2 = isp - 1;
							@Pc(3838) int i = intStack[isp2];
							@Pc(3844) int status = StockMarketManager.offers[i].getStatus();
							isp = isp2 + 1;
							intStack[isp2] = status == 1 ? 1 : 0;
							continue;
						}
					} else if (opcode < 4100) {
						if (opcode == 4000) {
							@Pc(11734) int isp2 = isp - 2;
							@Pc(11740) int b = intStack[isp2 + 1];
							@Pc(11744) int a = intStack[isp2];
							isp = isp2 + 1;
							intStack[isp2] = a + b;
							continue;
						}
						if (opcode == 4001) {
							@Pc(11758) int isp2 = isp - 2;
							@Pc(11762) int a = intStack[isp2];
							@Pc(11768) int b = intStack[isp2 + 1];
							isp = isp2 + 1;
							intStack[isp2] = a - b;
							continue;
						}
						if (opcode == 4002) {
							@Pc(11784) int isp2 = isp - 2;
							@Pc(11788) int a = intStack[isp2];
							@Pc(11794) int b = intStack[isp2 + 1];
							isp = isp2 + 1;
							intStack[isp2] = a * b;
							continue;
						}
						if (opcode == 4003) {
							@Pc(11810) int isp2 = isp - 2;
							@Pc(11816) int b = intStack[isp2 + 1];
							@Pc(11820) int a = intStack[isp2];
							isp = isp2 + 1;
							intStack[isp2] = a / b;
							continue;
						}
						if (opcode == 4004) {
							@Pc(11835) int isp2 = isp - 1;
							@Pc(11838) int max = intStack[isp2];
							isp = isp2 + 1;
							intStack[isp2] = (int) ((double) max * Math.random());
							continue;
						}
						if (opcode == 4005) {
							@Pc(11856) int isp2 = isp - 1;
							@Pc(11859) int max = intStack[isp2];
							isp = isp2 + 1;
							intStack[isp2] = (int) ((double) (max + 1) * Math.random());
							continue;
						}
						if (opcode == 4006) {
							@Pc(11876) int isp2 = isp - 5;
							@Pc(11880) int y1 = intStack[isp2];
							@Pc(11886) int x1 = intStack[isp2 + 2];
							@Pc(11892) int x2 = intStack[isp2 + 3];
							@Pc(11898) int y2 = intStack[isp2 + 1];
							@Pc(11904) int x = intStack[isp2 + 4];
							isp = isp2 + 1;
							intStack[isp2] = (x - x1) * (y2 - y1) / (x2 - x1) + y1;
							continue;
						}
						if (opcode == 4007) {
							@Pc(11930) int isp2 = isp - 2;
							@Pc(11935) long n = intStack[isp2];
							@Pc(11942) long percent = intStack[isp2 + 1];
							isp = isp2 + 1;
							intStack[isp2] = (int) (percent * n / 100L + n);
							continue;
						}
						if (opcode == 4008) {
							@Pc(11962) int isp2 = isp - 2;
							@Pc(11966) int a = intStack[isp2];
							@Pc(11972) int b = intStack[isp2 + 1];
							isp = isp2 + 1;
							intStack[isp2] = 0x1 << b | a;
							continue;
						}
						if (opcode == 4009) {
							@Pc(11987) int isp2 = isp - 2;
							@Pc(11991) int value = intStack[isp2];
							@Pc(11997) int bit = intStack[isp2 + 1];
							isp = isp2 + 1;
							intStack[isp2] = -(0x1 << bit) - 1 & value;
							continue;
						}
						if (opcode == 4010) {
							@Pc(12016) int isp2 = isp - 2;
							@Pc(12020) int value = intStack[isp2];
							@Pc(12026) int bit = intStack[isp2 + 1];
							isp = isp2 + 1;
							intStack[isp2] = (value & 0x1 << bit) == 0 ? 0 : 1;
							continue;
						}
						if (opcode == 4011) {
							@Pc(12048) int isp2 = isp - 2;
							@Pc(12052) int a = intStack[isp2];
							@Pc(12058) int b = intStack[isp2 + 1];
							isp = isp2 + 1;
							intStack[isp2] = a % b;
							continue;
						}
						if (opcode == 4012) {
							@Pc(12072) int isp2 = isp - 2;
							@Pc(12076) int a = intStack[isp2];
							@Pc(12082) int b = intStack[isp2 + 1];
							if (a == 0) {
								isp = isp2 + 1;
								intStack[isp2] = 0;
							} else {
								isp = isp2 + 1;
								intStack[isp2] = (int) Math.pow(a, b);
							}
							continue;
						}
						if (opcode == 4013) {
							@Pc(12110) int isp2 = isp - 2;
							@Pc(12114) int a = intStack[isp2];
							@Pc(12120) int b = intStack[isp2 + 1];
							if (a == 0) {
								isp = isp2 + 1;
								intStack[isp2] = 0;
							} else if (b == 0) {
								isp = isp2 + 1;
								intStack[isp2] = Integer.MAX_VALUE;
							} else {
								isp = isp2 + 1;
								intStack[isp2] = (int) Math.pow(a, 1.0D / (double) b);
							}
							continue;
						}
						if (opcode == 4014) {
							@Pc(12160) int isp2 = isp - 2;
							@Pc(12164) int a = intStack[isp2];
							@Pc(12170) int b = intStack[isp2 + 1];
							isp = isp2 + 1;
							intStack[isp2] = b & a;
							continue;
						}
						if (opcode == 4015) {
							@Pc(12185) int isp2 = isp - 2;
							@Pc(12191) int b = intStack[isp2 + 1];
							@Pc(12195) int a = intStack[isp2];
							isp = isp2 + 1;
							intStack[isp2] = b | a;
							continue;
						}
						if (opcode == 4016) {
							@Pc(12209) int isp2 = isp - 2;
							@Pc(12213) int a = intStack[isp2];
							@Pc(12219) int b = intStack[isp2 + 1];
							isp = isp2 + 1;
							intStack[isp2] = b <= a ? b : a;
							continue;
						}
						if (opcode == 4017) {
							@Pc(12235) int isp2 = isp - 2;
							@Pc(12239) int a = intStack[isp2];
							@Pc(12245) int b = intStack[isp2 + 1];
							isp = isp2 + 1;
							intStack[isp2] = a > b ? a : b;
							continue;
						}
						if (opcode == 4018) {
							@Pc(12266) int isp2 = isp - 3;
							@Pc(12271) long numerator = intStack[isp2];
							@Pc(12278) long value = intStack[isp2 + 2];
							@Pc(12285) long denominator = intStack[isp2 + 1];
							isp = isp2 + 1;
							intStack[isp2] = (int) (value * numerator / denominator);
							continue;
						}
					} else if (opcode < 4200) {
						if (opcode == 4100) {
							@Pc(10985) int ssp2 = ssp - 1;
							@Pc(10988) String a = stringStack[ssp2];
							isp--;
							@Pc(10993) int b = intStack[isp];
							ssp = ssp2 + 1;
							stringStack[ssp2] = a + b;
							continue;
						}
						if (opcode == 4101) {
							@Pc(11013) int ssp2 = ssp - 2;
							@Pc(11017) String a = stringStack[ssp2];
							@Pc(11023) String b = stringStack[ssp2 + 1];
							ssp = ssp2 + 1;
							stringStack[ssp2] = a + b;
							continue;
						}
						if (opcode == 4102) {
							isp--;
							@Pc(11048) int b = intStack[isp];
							@Pc(11050) int ssp2 = ssp - 1;
							@Pc(11053) String a = stringStack[ssp2];
							ssp = ssp2 + 1;
							stringStack[ssp2] = a + IntUtils.toString(b);
							continue;
						}
						if (opcode == 4103) {
							@Pc(11075) int ssp2 = ssp - 1;
							@Pc(11078) String value = stringStack[ssp2];
							ssp = ssp2 + 1;
							stringStack[ssp2] = value.toLowerCase();
							continue;
						}
						if (opcode == 4104) {
							isp--;
							@Pc(11097) int isp2 = intStack[isp];
							@Pc(11104) long timestamp = (long) isp2 * 86400000L + 1014768000000L;
							calendar.setTime(new Date(timestamp));
							@Pc(11114) int day = calendar.get(Calendar.DATE);
							@Pc(11118) int month = calendar.get(Calendar.MONTH);
							@Pc(11122) int year = calendar.get(Calendar.YEAR);
							stringStack[ssp++] = day + "-" + MONTHS[month] + "-" + year;
							continue;
						}
						if (opcode == 4105) {
							@Pc(11151) int ssp2 = ssp - 2;
							@Pc(11157) String femaleValue = stringStack[ssp2 + 1];
							@Pc(11161) String maleValue = stringStack[ssp2];
							if (PlayerList.self.appearance != null && PlayerList.self.appearance.female) {
								ssp = ssp2 + 1;
								stringStack[ssp2] = femaleValue;
								continue;
							}
							ssp = ssp2 + 1;
							stringStack[ssp2] = maleValue;
							continue;
						}
						if (opcode == 4106) {
							isp--;
							@Pc(11192) int value = intStack[isp];
							stringStack[ssp++] = Integer.toString(value);
							continue;
						}
						if (opcode == 4107) {
							ssp -= 2;
							intStack[isp++] = IntUtils.signum(StringUtils.compare(stringStack[ssp], stringStack[ssp + 1], client.language));
							continue;
						}
						if (opcode == 4108) {
							@Pc(11229) int isp2 = isp - 2;
							@Pc(11235) int fontId = intStack[isp2 + 1];
							@Pc(11239) int local11239 = intStack[isp2];
							ssp--;
							@Pc(11244) String text = stringStack[ssp];
							isp = isp2 + 1;
							intStack[isp2] = Static31.method3656(fontId).method2274(text, local11239);
							continue;
						}
						if (opcode == 4109) {
							@Pc(11260) int isp2 = isp - 2;
							ssp--;
							@Pc(11265) String text = stringStack[ssp];
							@Pc(11269) int local11269 = intStack[isp2];
							@Pc(11275) int fontId = intStack[isp2 + 1];
							isp = isp2 + 1;
							intStack[isp2] = Static31.method3656(fontId).method2261(text, local11269);
							continue;
						}
						if (opcode == 4110) {
							@Pc(11292) int ssp2 = ssp - 2;
							@Pc(11296) String trueValue = stringStack[ssp2];
							@Pc(11302) String falseValue = stringStack[ssp2 + 1];
							isp--;
							if (intStack[isp] == 1) {
								ssp = ssp2 + 1;
								stringStack[ssp2] = trueValue;
							} else {
								ssp = ssp2 + 1;
								stringStack[ssp2] = falseValue;
							}
							continue;
						}
						if (opcode == 4111) {
							@Pc(11329) int ssp2 = ssp - 1;
							@Pc(11332) String value = stringStack[ssp2];
							ssp = ssp2 + 1;
							stringStack[ssp2] = StringUtils.escape(value);
							continue;
						}
						if (opcode == 4112) {
							@Pc(11347) int ssp2 = ssp - 1;
							@Pc(11350) String value = stringStack[ssp2];
							isp--;
							@Pc(11355) int codepoint = intStack[isp];
							if (codepoint == -1) {
								throw new RuntimeException("null char");
							}
							ssp = ssp2 + 1;
							stringStack[ssp2] = value + (char) codepoint;
							continue;
						}
						if (opcode == 4113) {
							@Pc(11387) int isp2 = isp - 1;
							@Pc(11390) int codepoint = intStack[isp2];
							isp = isp2 + 1;
							intStack[isp2] = Cp1252Charset.isPrintable((char) codepoint) ? 1 : 0;
							continue;
						}
						if (opcode == 4114) {
							@Pc(11412) int isp2 = isp - 1;
							@Pc(11415) int codepoint = intStack[isp2];
							isp = isp2 + 1;
							intStack[isp2] = CharUtils.isLetterOrDigit((char) codepoint) ? 1 : 0;
							continue;
						}
						if (opcode == 4115) {
							@Pc(11434) int isp2 = isp - 1;
							@Pc(11437) int codepoint = intStack[isp2];
							isp = isp2 + 1;
							intStack[isp2] = CharUtils.isLetter((char) codepoint) ? 1 : 0;
							continue;
						}
						if (opcode == 4116) {
							@Pc(11456) int isp2 = isp - 1;
							@Pc(11459) int codepoint = intStack[isp2];
							isp = isp2 + 1;
							intStack[isp2] = CharUtils.isDigit((char) codepoint) ? 1 : 0;
							continue;
						}
						if (opcode == 4117) {
							ssp--;
							@Pc(11484) String value = stringStack[ssp];
							if (value == null) {
								intStack[isp++] = 0;
							} else {
								intStack[isp++] = value.length();
							}
							continue;
						}
						if (opcode == 4118) {
							isp -= 2;
							@Pc(11510) int ssp2 = ssp - 1;
							@Pc(11513) String value = stringStack[ssp2];
							@Pc(11517) int start = intStack[isp];
							@Pc(11523) int end = intStack[isp + 1];
							ssp = ssp2 + 1;
							stringStack[ssp2] = value.substring(start, end);
							continue;
						}
						if (opcode == 4119) {
							@Pc(11539) int ssp2 = ssp - 1;
							@Pc(11542) String in = stringStack[ssp2];
							@Pc(11544) boolean tag = false;
							@Pc(11550) StringBuffer out = new StringBuffer(in.length());
							for (@Pc(11552) int i = 0; i < in.length(); i++) {
								@Pc(11564) char c = in.charAt(i);
								if (c == '<') {
									tag = true;
								} else if (c == '>') {
									tag = false;
								} else if (!tag) {
									out.append(c);
								}
							}
							ssp = ssp2 + 1;
							stringStack[ssp2] = out.toString();
							continue;
						}
						if (opcode == 4120) {
							@Pc(11602) int isp2 = isp - 2;
							ssp--;
							@Pc(11607) String value = stringStack[ssp];
							@Pc(11611) int codepoint = intStack[isp2];
							@Pc(11617) int fromIndex = intStack[isp2 + 1];
							isp = isp2 + 1;
							intStack[isp2] = value.indexOf(codepoint, fromIndex);
							continue;
						}
						if (opcode == 4121) {
							@Pc(11634) int isp2 = isp - 1;
							@Pc(11637) int fromIndex = intStack[isp2];
							ssp -= 2;
							@Pc(11642) String value = stringStack[ssp];
							@Pc(11648) String string = stringStack[ssp + 1];
							isp = isp2 + 1;
							intStack[isp2] = value.indexOf(string, fromIndex);
							continue;
						}
						if (opcode == 4122) {
							@Pc(11665) int isp2 = isp - 1;
							@Pc(11668) int codepoint = intStack[isp2];
							isp = isp2 + 1;
							intStack[isp2] = Character.toLowerCase((char) codepoint);
							continue;
						}
						if (opcode == 4123) {
							@Pc(11683) int isp2 = isp - 1;
							@Pc(11686) int codepoint = intStack[isp2];
							isp = isp2 + 1;
							intStack[isp2] = Character.toUpperCase((char) codepoint);
							continue;
						}
						if (opcode == 4124) {
							@Pc(11703) int isp2 = isp - 1;
							@Pc(11712) boolean thousandsSeparator = intStack[isp2] != 0;
							isp = isp2 - 1;
							@Pc(11717) int value = intStack[isp];
							stringStack[ssp++] = LongUtils.fixedPointToString(value, thousandsSeparator, 0, client.language);
							continue;
						}
					} else if (opcode < 4300) {
						if (opcode == 4200) {
							isp--;
							@Pc(10588) int id = intStack[isp];
							stringStack[ssp++] = ObjTypeList.get(id).name;
							continue;
						}
						if (opcode == 4201) {
							isp -= 2;
							@Pc(10609) int op = intStack[isp + 1];
							@Pc(10613) int id = intStack[isp];
							@Pc(10617) ObjType type = ObjTypeList.get(id);
							if (op >= 1 && op <= 5 && type.ops[op - 1] != null) {
								stringStack[ssp++] = type.ops[op - 1];
								continue;
							}
							stringStack[ssp++] = "";
							continue;
						}
						if (opcode == 4202) {
							isp -= 2;
							@Pc(10662) int id = intStack[isp];
							@Pc(10668) int op = intStack[isp + 1];
							@Pc(10672) ObjType type = ObjTypeList.get(id);
							if (op >= 1 && op <= 5 && type.inventoryOps[op - 1] != null) {
								stringStack[ssp++] = type.inventoryOps[op - 1];
								continue;
							}
							stringStack[ssp++] = "";
							continue;
						}
						if (opcode == 4203) {
							@Pc(10712) int isp2 = isp - 1;
							@Pc(10715) int id = intStack[isp2];
							isp = isp2 + 1;
							intStack[isp2] = ObjTypeList.get(id).cost;
							continue;
						}
						if (opcode == 4204) {
							@Pc(10732) int isp2 = isp - 1;
							@Pc(10735) int id = intStack[isp2];
							isp = isp2 + 1;
							intStack[isp2] = ObjTypeList.get(id).stackable == 1 ? 1 : 0;
							continue;
						}
						if (opcode == 4205) {
							@Pc(10760) int isp2 = isp - 1;
							@Pc(10763) int id = intStack[isp2];
							@Pc(10767) ObjType type = ObjTypeList.get(id);
							if (type.certificateTemplate == -1 && type.certificateLink >= 0) {
								isp = isp2 + 1;
								intStack[isp2] = type.certificateLink;
								continue;
							}
							isp = isp2 + 1;
							intStack[isp2] = id;
							continue;
						}
						if (opcode == 4206) {
							@Pc(10797) int isp2 = isp - 1;
							@Pc(10800) int id = intStack[isp2];
							@Pc(10804) ObjType type = ObjTypeList.get(id);
							if (type.certificateTemplate >= 0 && type.certificateLink >= 0) {
								isp = isp2 + 1;
								intStack[isp2] = type.certificateLink;
								continue;
							}
							isp = isp2 + 1;
							intStack[isp2] = id;
							continue;
						}
						if (opcode == 4207) {
							@Pc(10836) int isp2 = isp - 1;
							@Pc(10839) int id = intStack[isp2];
							isp = isp2 + 1;
							intStack[isp2] = ObjTypeList.get(id).members ? 1 : 0;
							continue;
						}
						if (opcode == 4208) {
							isp -= 2;
							@Pc(10865) int paramId = intStack[isp + 1];
							@Pc(10869) int objId = intStack[isp];
							@Pc(10873) ParamType param = ParamTypeList.get(paramId);
							if (param.isString()) {
								stringStack[ssp++] = ObjTypeList.get(objId).getParam(paramId, param.defaultString);
							} else {
								intStack[isp++] = ObjTypeList.get(objId).getParam(paramId, param.defaultInt);
							}
							continue;
						}
						if (opcode == 4210) {
							ssp--;
							@Pc(10915) String query = stringStack[ssp];
							@Pc(10917) int isp2 = isp - 1;
							@Pc(10920) int stockMarketOnly = intStack[isp2];
							Find.findObjs(query, stockMarketOnly == 1);
							isp = isp2 + 1;
							intStack[isp2] = Find.size;
							continue;
						}
						if (opcode == 4211) {
							if (Find.results != null && Find.size > Find.index) {
								intStack[isp++] = Find.results[Find.index++] & 0xFFFF;
								continue;
							}
							intStack[isp++] = -1;
							continue;
						}
						if (opcode == 4212) {
							Find.index = 0;
							continue;
						}
					} else if (opcode < 4400) {
						if (opcode == 4300) {
							isp -= 2;
							@Pc(3882) int paramId = intStack[isp + 1];
							@Pc(3886) int npcId = intStack[isp];
							@Pc(3890) ParamType param = ParamTypeList.get(paramId);
							if (param.isString()) {
								stringStack[ssp++] = NpcTypeList.get(npcId).getParam(paramId, param.defaultString);
							} else {
								intStack[isp++] = NpcTypeList.get(npcId).getParam(paramId, param.defaultInt);
							}
							continue;
						}
					} else if (opcode >= 4500) {
						if (opcode >= 4600) {
							if (opcode < 5100) {
								if (opcode == 5000) {
									intStack[isp++] = Chat.publicFilter;
									continue;
								}
								if (opcode == 5001) {
									isp -= 3;
									Chat.publicFilter = intStack[isp];
									Chat.privateFilter = intStack[isp + 1];
									Chat.tradeFilter = intStack[isp + 2];
									Protocol.outboundBuffer.writeOpcode(234);
									Protocol.outboundBuffer.writeByte(Chat.publicFilter);
									Protocol.outboundBuffer.writeByte(Chat.privateFilter);
									Protocol.outboundBuffer.writeByte(Chat.tradeFilter);
									continue;
								}
								if (opcode == 5002) {
									ssp--;
									@Pc(4007) String username = stringStack[ssp];
									isp -= 2;
									@Pc(4012) int rule = intStack[isp];
									@Pc(4018) int mute = intStack[isp + 1];
									Protocol.outboundBuffer.writeOpcode(90);
									Protocol.outboundBuffer.writeLong(Base37.encode(username));
									Protocol.outboundBuffer.writeByte(rule - 1);
									Protocol.outboundBuffer.writeByte(mute);
									continue;
								}
								if (opcode == 5003) {
									isp--;
									@Pc(4050) int i = intStack[isp];
									@Pc(4052) String message = null;
									if (i < 100) {
										message = Chat.messages[i];
									}
									if (message == null) {
										message = "";
									}
									stringStack[ssp++] = message;
									continue;
								}
								if (opcode == 5004) {
									@Pc(4077) int type = -1;
									@Pc(4079) int isp2 = isp - 1;
									@Pc(4082) int i = intStack[isp2];
									if (i < 100 && Chat.messages[i] != null) {
										type = Chat.types[i];
									}
									isp = isp2 + 1;
									intStack[isp2] = type;
									continue;
								}
								if (opcode == 5005) {
									intStack[isp++] = Chat.privateFilter;
									continue;
								}
								if (opcode == 5008) {
									ssp--;
									@Pc(4125) String message = stringStack[ssp];
									if (message.startsWith("::")) {
										Cheat.execute(message);
										continue;
									}
									if (LoginManager.staffModLevel == 0 && (LoginManager.playerUnderage && !LoginManager.parentalChatConsent || LoginManager.mapQuickChat)) {
										continue;
									}
									@Pc(4152) String lowerMessage = message.toLowerCase();
									@Pc(4154) byte color = 0;
									@Pc(4156) byte effect = 0;
									if (lowerMessage.startsWith(Text.CHATCOL0)) {
										message = message.substring(Text.CHATCOL0.length());
										color = 0;
									} else if (lowerMessage.startsWith(Text.CHATCOL1)) {
										color = 1;
										message = message.substring(Text.CHATCOL1.length());
									} else if (lowerMessage.startsWith(Text.CHATCOL2)) {
										message = message.substring(Text.CHATCOL2.length());
										color = 2;
									} else if (lowerMessage.startsWith(Text.CHATCOL3)) {
										message = message.substring(Text.CHATCOL3.length());
										color = 3;
									} else if (lowerMessage.startsWith(Text.CHATCOL4)) {
										message = message.substring(Text.CHATCOL4.length());
										color = 4;
									} else if (lowerMessage.startsWith(Text.CHATCOL5)) {
										message = message.substring(Text.CHATCOL5.length());
										color = 5;
									} else if (lowerMessage.startsWith(Text.CHATCOL6)) {
										message = message.substring(Text.CHATCOL6.length());
										color = 6;
									} else if (lowerMessage.startsWith(Text.CHATCOL7)) {
										color = 7;
										message = message.substring(Text.CHATCOL7.length());
									} else if (lowerMessage.startsWith(Text.CHATCOL8)) {
										message = message.substring(Text.CHATCOL8.length());
										color = 8;
									} else if (lowerMessage.startsWith(Text.CHATCOL9)) {
										message = message.substring(Text.CHATCOL9.length());
										color = 9;
									} else if (lowerMessage.startsWith(Text.CHATCOL10)) {
										color = 10;
										message = message.substring(Text.CHATCOL10.length());
									} else if (lowerMessage.startsWith(Text.CHATCOL11)) {
										message = message.substring(Text.CHATCOL11.length());
										color = 11;
									} else if (client.language != 0) {
										if (lowerMessage.startsWith(LocalisedText.CHATCOL0)) {
											message = message.substring(LocalisedText.CHATCOL0.length());
											color = 0;
										} else if (lowerMessage.startsWith(LocalisedText.CHATCOL1)) {
											message = message.substring(LocalisedText.CHATCOL1.length());
											color = 1;
										} else if (lowerMessage.startsWith(LocalisedText.CHATCOL2)) {
											color = 2;
											message = message.substring(LocalisedText.CHATCOL2.length());
										} else if (lowerMessage.startsWith(LocalisedText.CHATCOL3)) {
											color = 3;
											message = message.substring(LocalisedText.CHATCOL3.length());
										} else if (lowerMessage.startsWith(LocalisedText.CHATCOL4)) {
											color = 4;
											message = message.substring(LocalisedText.CHATCOL4.length());
										} else if (lowerMessage.startsWith(LocalisedText.CHATCOL5)) {
											message = message.substring(LocalisedText.CHATCOL5.length());
											color = 5;
										} else if (lowerMessage.startsWith(LocalisedText.CHATCOL6)) {
											message = message.substring(LocalisedText.CHATCOL6.length());
											color = 6;
										} else if (lowerMessage.startsWith(LocalisedText.CHATCOL7)) {
											color = 7;
											message = message.substring(LocalisedText.CHATCOL7.length());
										} else if (lowerMessage.startsWith(LocalisedText.CHATCOL8)) {
											message = message.substring(LocalisedText.CHATCOL8.length());
											color = 8;
										} else if (lowerMessage.startsWith(LocalisedText.CHATCOL9)) {
											color = 9;
											message = message.substring(LocalisedText.CHATCOL9.length());
										} else if (lowerMessage.startsWith(LocalisedText.CHATCOL10)) {
											message = message.substring(LocalisedText.CHATCOL10.length());
											color = 10;
										} else if (lowerMessage.startsWith(LocalisedText.CHATCOL11)) {
											color = 11;
											message = message.substring(LocalisedText.CHATCOL11.length());
										}
									}
									@Pc(4473) String lowerMessage2 = message.toLowerCase();
									if (lowerMessage2.startsWith(Text.CHATEFFECT1)) {
										message = message.substring(Text.CHATEFFECT1.length());
										effect = 1;
									} else if (lowerMessage2.startsWith(Text.CHATEFFECT2)) {
										effect = 2;
										message = message.substring(Text.CHATEFFECT2.length());
									} else if (lowerMessage2.startsWith(Text.CHATEFFECT3)) {
										effect = 3;
										message = message.substring(Text.CHATEFFECT3.length());
									} else if (lowerMessage2.startsWith(Text.CHATEFFECT4)) {
										message = message.substring(Text.CHATEFFECT4.length());
										effect = 4;
									} else if (lowerMessage2.startsWith(Text.CHATEFFECT5)) {
										effect = 5;
										message = message.substring(Text.CHATEFFECT5.length());
									} else if (client.language != 0) {
										if (lowerMessage2.startsWith(LocalisedText.CHATEFFECT1)) {
											message = message.substring(LocalisedText.CHATEFFECT1.length());
											effect = 1;
										} else if (lowerMessage2.startsWith(LocalisedText.CHATEFFECT2)) {
											message = message.substring(LocalisedText.CHATEFFECT2.length());
											effect = 2;
										} else if (lowerMessage2.startsWith(LocalisedText.CHATEFFECT3)) {
											effect = 3;
											message = message.substring(LocalisedText.CHATEFFECT3.length());
										} else if (lowerMessage2.startsWith(LocalisedText.CHATEFFECT4)) {
											effect = 4;
											message = message.substring(LocalisedText.CHATEFFECT4.length());
										} else if (lowerMessage2.startsWith(LocalisedText.CHATEFFECT5)) {
											message = message.substring(LocalisedText.CHATEFFECT5.length());
											effect = 5;
										}
									}
									Protocol.outboundBuffer.writeOpcode(186);
									Protocol.outboundBuffer.writeByte(0);
									@Pc(4616) int position = Protocol.outboundBuffer.position;
									Protocol.outboundBuffer.writeByte(color);
									Protocol.outboundBuffer.writeByte(effect);
									WordPack.writeString(Protocol.outboundBuffer, message);
									Protocol.outboundBuffer.writeByteLength(Protocol.outboundBuffer.position - position);
									continue;
								}
								if (opcode == 5009) {
									ssp -= 2;
									@Pc(4647) String username = stringStack[ssp];
									@Pc(4653) String message = stringStack[ssp + 1];
									if (LoginManager.staffModLevel != 0 || (!LoginManager.playerUnderage || LoginManager.parentalChatConsent) && !LoginManager.mapQuickChat) {
										Protocol.outboundBuffer.writeOpcode(157);
										Protocol.outboundBuffer.writeByte(0);
										@Pc(4680) int position = Protocol.outboundBuffer.position;
										Protocol.outboundBuffer.writeLong(Base37.encode(username));
										WordPack.writeString(Protocol.outboundBuffer, message);
										Protocol.outboundBuffer.writeByteLength(Protocol.outboundBuffer.position - position);
									}
									continue;
								}
								if (opcode == 5010) {
									@Pc(4708) String name = null;
									isp--;
									@Pc(4713) int i = intStack[isp];
									if (i < 100) {
										name = Chat.names[i];
									}
									if (name == null) {
										name = "";
									}
									stringStack[ssp++] = name;
									continue;
								}
								if (opcode == 5011) {
									isp--;
									@Pc(4745) int i = intStack[isp];
									@Pc(4747) String clan = null;
									if (i < 100) {
										clan = Chat.clans[i];
									}
									if (clan == null) {
										clan = "";
									}
									stringStack[ssp++] = clan;
									continue;
								}
								if (opcode == 5012) {
									@Pc(4777) int isp2 = isp - 1;
									@Pc(4780) int i = intStack[isp2];
									@Pc(4782) int phraseId = -1;
									if (i < 100) {
										phraseId = Chat.phraseIds[i];
									}
									isp = isp2 + 1;
									intStack[isp2] = phraseId;
									continue;
								}
								if (opcode == 5015) {
									@Pc(4812) String name;
									if (PlayerList.self == null || PlayerList.self.username == null) {
										name = LoginManager.username;
									} else {
										name = PlayerList.self.getName();
									}
									stringStack[ssp++] = name;
									continue;
								}
								if (opcode == 5016) {
									intStack[isp++] = Chat.tradeFilter;
									continue;
								}
								if (opcode == 5017) {
									intStack[isp++] = Chat.size;
									continue;
								}
								if (opcode == 5050) {
									isp--;
									@Pc(4852) int id = intStack[isp];
									stringStack[ssp++] = QuickChatCatTypeList.get(id).description;
									continue;
								}
								if (opcode == 5051) {
									@Pc(4872) int isp2 = isp - 1;
									@Pc(4875) int id = intStack[isp2];
									@Pc(4879) QuickChatCatType type = QuickChatCatTypeList.get(id);
									if (type.subcategories == null) {
										isp = isp2 + 1;
										intStack[isp2] = 0;
									} else {
										isp = isp2 + 1;
										intStack[isp2] = type.subcategories.length;
									}
									continue;
								}
								if (opcode == 5052) {
									@Pc(4903) int isp2 = isp - 2;
									@Pc(4909) int i = intStack[isp2 + 1];
									@Pc(4913) int id = intStack[isp2];
									@Pc(4917) QuickChatCatType type = QuickChatCatTypeList.get(id);
									@Pc(4922) int subcategory = type.subcategories[i];
									isp = isp2 + 1;
									intStack[isp2] = subcategory;
									continue;
								}
								if (opcode == 5053) {
									@Pc(4934) int isp2 = isp - 1;
									@Pc(4937) int id = intStack[isp2];
									@Pc(4943) QuickChatCatType type = QuickChatCatTypeList.get(id);
									if (type.phrases == null) {
										isp = isp2 + 1;
										intStack[isp2] = 0;
									} else {
										isp = isp2 + 1;
										intStack[isp2] = type.phrases.length;
									}
									continue;
								}
								if (opcode == 5054) {
									@Pc(4968) int isp2 = isp - 2;
									@Pc(4972) int id = intStack[isp2];
									@Pc(4978) int i = intStack[isp2 + 1];
									isp = isp2 + 1;
									intStack[isp2] = QuickChatCatTypeList.get(id).phrases[i];
									continue;
								}
								if (opcode == 5055) {
									isp--;
									@Pc(5000) int id = intStack[isp];
									stringStack[ssp++] = QuickChatPhraseTypeList.get(id).getText();
									continue;
								}
								if (opcode == 5056) {
									@Pc(5018) int isp2 = isp - 1;
									@Pc(5021) int id = intStack[isp2];
									@Pc(5025) QuickChatPhraseType type = QuickChatPhraseTypeList.get(id);
									if (type.automaticResponses == null) {
										isp = isp2 + 1;
										intStack[isp2] = 0;
									} else {
										isp = isp2 + 1;
										intStack[isp2] = type.automaticResponses.length;
									}
									continue;
								}
								if (opcode == 5057) {
									@Pc(5051) int isp2 = isp - 2;
									@Pc(5055) int id = intStack[isp2];
									@Pc(5061) int i = intStack[isp2 + 1];
									isp = isp2 + 1;
									intStack[isp2] = QuickChatPhraseTypeList.get(id).automaticResponses[i];
									continue;
								}
								if (opcode == 5058) {
									activePhrase = new QuickChatPhrase();
									isp--;
									activePhrase.id = intStack[isp];
									activePhrase.type = QuickChatPhraseTypeList.get(activePhrase.id);
									activePhrase.values = new int[activePhrase.type.getDynamicCommandCount()];
									continue;
								}
								if (opcode == 5059) {
									Protocol.outboundBuffer.writeOpcode(222);
									Protocol.outboundBuffer.writeByte(0);
									@Pc(5125) int position = Protocol.outboundBuffer.position;
									Protocol.outboundBuffer.writeByte(0);
									Protocol.outboundBuffer.writeShort(activePhrase.id);
									activePhrase.type.encodeMessage(Protocol.outboundBuffer, activePhrase.values);
									Protocol.outboundBuffer.writeByteLength(Protocol.outboundBuffer.position - position);
									continue;
								}
								if (opcode == 5060) {
									ssp--;
									@Pc(5165) String username = stringStack[ssp];
									Protocol.outboundBuffer.writeOpcode(42);
									Protocol.outboundBuffer.writeByte(0);
									@Pc(5178) int position = Protocol.outboundBuffer.position;
									Protocol.outboundBuffer.writeLong(Base37.encode(username));
									Protocol.outboundBuffer.writeShort(activePhrase.id);
									activePhrase.type.encodeMessage(Protocol.outboundBuffer, activePhrase.values);
									Protocol.outboundBuffer.writeByteLength(Protocol.outboundBuffer.position - position);
									continue;
								}
								if (opcode == 5061) {
									Protocol.outboundBuffer.writeOpcode(222);
									Protocol.outboundBuffer.writeByte(0);
									@Pc(5227) int position = Protocol.outboundBuffer.position;
									Protocol.outboundBuffer.writeByte(1);
									Protocol.outboundBuffer.writeShort(activePhrase.id);
									activePhrase.type.encodeMessage(Protocol.outboundBuffer, activePhrase.values);
									Protocol.outboundBuffer.writeByteLength(Protocol.outboundBuffer.position - position);
									continue;
								}
								if (opcode == 5062) {
									@Pc(5259) int isp2 = isp - 2;
									@Pc(5263) int id = intStack[isp2];
									@Pc(5269) int i = intStack[isp2 + 1];
									isp = isp2 + 1;
									intStack[isp2] = QuickChatCatTypeList.get(id).subcategoryShortcuts[i];
									continue;
								}
								if (opcode == 5063) {
									@Pc(5288) int isp2 = isp - 2;
									@Pc(5292) int id = intStack[isp2];
									@Pc(5298) int i = intStack[isp2 + 1];
									isp = isp2 + 1;
									intStack[isp2] = QuickChatCatTypeList.get(id).phraseShortcuts[i];
									continue;
								}
								if (opcode == 5064) {
									@Pc(5316) int isp2 = isp - 2;
									@Pc(5322) int shortcut = intStack[isp2 + 1];
									@Pc(5326) int id = intStack[isp2];
									if (shortcut == -1) {
										isp = isp2 + 1;
										intStack[isp2] = -1;
									} else {
										isp = isp2 + 1;
										intStack[isp2] = QuickChatCatTypeList.get(id).getSubcategoryByShortcut((char) shortcut);
									}
									continue;
								}
								if (opcode == 5065) {
									@Pc(5357) int isp2 = isp - 2;
									@Pc(5363) int shortcut = intStack[isp2 + 1];
									@Pc(5367) int id = intStack[isp2];
									if (shortcut == -1) {
										isp = isp2 + 1;
										intStack[isp2] = -1;
									} else {
										isp = isp2 + 1;
										intStack[isp2] = QuickChatCatTypeList.get(id).getPhraseByShortcut((char) shortcut);
									}
									continue;
								}
								if (opcode == 5066) {
									@Pc(5396) int isp2 = isp - 1;
									@Pc(5399) int id = intStack[isp2];
									isp = isp2 + 1;
									intStack[isp2] = QuickChatPhraseTypeList.get(id).getDynamicCommandCount();
									continue;
								}
								if (opcode == 5067) {
									@Pc(5417) int isp2 = isp - 2;
									@Pc(5421) int id = intStack[isp2];
									@Pc(5427) int i = intStack[isp2 + 1];
									@Pc(5434) int dynamicCommand = QuickChatPhraseTypeList.get(id).getDynamicCommand(i);
									isp = isp2 + 1;
									intStack[isp2] = dynamicCommand;
									continue;
								}
								if (opcode == 5068) {
									isp -= 2;
									@Pc(5451) int i = intStack[isp];
									@Pc(5457) int value = intStack[isp + 1];
									activePhrase.values[i] = value;
									continue;
								}
								if (opcode == 5069) {
									isp -= 2;
									@Pc(5475) int i = intStack[isp];
									@Pc(5481) int value = intStack[isp + 1];
									activePhrase.values[i] = value;
									continue;
								}
								if (opcode == 5070) {
									@Pc(5494) int isp2 = isp - 3;
									@Pc(5498) int id = intStack[isp2];
									@Pc(5504) int j = intStack[isp2 + 2];
									@Pc(5510) int i = intStack[isp2 + 1];
									@Pc(5514) QuickChatPhraseType type = QuickChatPhraseTypeList.get(id);
									if (type.getDynamicCommand(i) != 0) {
										throw new RuntimeException("bad command");
									}
									isp = isp2 + 1;
									intStack[isp2] = type.getDynamicCommandParam(i, j);
									continue;
								}
								if (opcode == 5071) {
									ssp--;
									@Pc(5548) String query = stringStack[ssp];
									@Pc(5551) int isp2 = isp - 1;
									@Pc(5560) boolean global = intStack[isp2] == 1;
									Find.findQuickChatPhrases(query, global);
									isp = isp2 + 1;
									intStack[isp2] = Find.size;
									continue;
								}
								if (opcode == 5072) {
									if (Find.results != null && Find.size > Find.index) {
										intStack[isp++] = Find.results[Find.index++] & 0xFFFF;
										continue;
									}
									intStack[isp++] = -1;
									continue;
								}
								if (opcode == 5073) {
									Find.index = 0;
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
									WorldMap.setZoom(intStack[isp]);
									continue;
								}
								if (opcode == 5201) {
									intStack[isp++] = WorldMap.getZoom();
									continue;
								}
								if (opcode == 5205) {
									isp--;
									Static24.method2947(false, -1, -1, intStack[isp]);
									continue;
								}
								if (opcode == 5206) {
									@Pc(9428) int isp2 = isp - 1;
									@Pc(9431) int coord = intStack[isp2];
									@Pc(9441) Map map = MapList.getContainingSource(coord >> 14 & 0x3FFF, coord & 0x3FFF);
									if (map == null) {
										isp = isp2 + 1;
										intStack[isp2] = -1;
									} else {
										isp = isp2 + 1;
										intStack[isp2] = map.id;
									}
									continue;
								}
								if (opcode == 5207) {
									isp--;
									@Pc(9470) Map map = MapList.get(intStack[isp]);
									if (map != null && map.name != null) {
										stringStack[ssp++] = map.name;
										continue;
									}
									stringStack[ssp++] = "";
									continue;
								}
								if (opcode == 5208) {
									@Pc(9497) int isp2 = isp + 1;
									intStack[isp] = Static7.anInt5331;
									isp = isp2 + 1;
									intStack[isp2] = Static7.anInt5680;
									continue;
								}
								if (opcode == 5209) {
									@Pc(9512) int isp2 = isp + 1;
									intStack[isp] = Static1.anInt331 + Static3.anInt2962;
									isp = isp2 + 1;
									intStack[isp2] = Static3.anInt2961 + Static3.anInt2960 - Static7.anInt5231 - 1;
									continue;
								}
								if (opcode == 5210) {
									@Pc(9539) int isp2 = isp - 1;
									@Pc(9542) int mapId = intStack[isp2];
									@Pc(9545) Map map = MapList.get(mapId);
									if (map == null) {
										@Pc(9570) int isp3 = isp2 + 1;
										intStack[isp2] = 0;
										isp = isp3 + 1;
										intStack[isp3] = 0;
									} else {
										@Pc(9550) int isp3 = isp2 + 1;
										intStack[isp2] = map.origin >> 14 & 0x3FFF;
										isp = isp3 + 1;
										intStack[isp3] = map.origin & 0x3FFF;
									}
									continue;
								}
								if (opcode == 5211) {
									@Pc(9585) int isp2 = isp - 1;
									@Pc(9588) int mapId = intStack[isp2];
									@Pc(9591) Map map = MapList.get(mapId);
									if (map == null) {
										@Pc(9618) int isp3 = isp2 + 1;
										intStack[isp2] = 0;
										isp = isp3 + 1;
										intStack[isp3] = 0;
									} else {
										@Pc(9597) int isp3 = isp2 + 1;
										intStack[isp2] = map.displayMaxX - map.displayMinX;
										isp = isp3 + 1;
										intStack[isp3] = map.displayMaxZ - map.displayMinZ;
									}
									continue;
								}
								if (opcode == 5212) {
									@Pc(9635) MapElement element = Static11.method492();
									if (element == null) {
										@Pc(9641) int isp2 = isp + 1;
										intStack[isp] = -1;
										isp = isp2 + 1;
										intStack[isp2] = -1;
									} else {
										@Pc(9653) int isp2 = isp + 1;
										intStack[isp] = element.id;
										@Pc(9678) int packedElement = Static3.anInt2962 + element.x << 14 | element.level << 28 | Static3.anInt2961 + Static3.anInt2960 - element.z - 1;
										isp = isp2 + 1;
										intStack[isp2] = packedElement;
									}
									continue;
								}
								if (opcode == 5213) {
									@Pc(9692) MapElement element = Static24.method2713();
									if (element == null) {
										@Pc(9733) int isp2 = isp + 1;
										intStack[isp] = -1;
										isp = isp2 + 1;
										intStack[isp2] = -1;
									} else {
										@Pc(9697) int isp2 = isp + 1;
										intStack[isp] = element.id;
										@Pc(9723) int packedElement = Static3.anInt2960 + Static3.anInt2961 - element.z - 1 | element.level << 28 | element.x + Static3.anInt2962 << 14;
										isp = isp2 + 1;
										intStack[isp2] = packedElement;
									}
									continue;
								}
								if (opcode == 5214) {
									isp--;
									@Pc(9750) int isp2 = intStack[isp];
									@Pc(9753) Map map = WorldMap.getCurrentMap();
									if (map != null) {
										@Pc(9775) boolean success = map.convertSourceToDisplay(isp2 >> 28 & 0x3, isp2 >> 14 & 0x3FFF, isp2 & 0x3FFF, coord);
										if (success) {
											Static20.method1970(coord[1], coord[2]);
										}
									}
									continue;
								}
								if (opcode == 5215) {
									@Pc(9792) int isp2 = isp - 2;
									@Pc(9798) int mapId = intStack[isp2 + 1];
									@Pc(9802) int local9802 = intStack[isp2];
									@Pc(9812) SecondaryLinkedList maps = MapList.getAllContainingSource(local9802 >> 14 & 0x3FFF, local9802 & 0x3FFF);
									@Pc(9814) boolean success = false;
									for (@Pc(9819) Map map = (Map) maps.head(); map != null; map = (Map) maps.next()) {
										if (map.id == mapId) {
											success = true;
											break;
										}
									}
									if (success) {
										isp = isp2 + 1;
										intStack[isp2] = 1;
									} else {
										isp = isp2 + 1;
										intStack[isp2] = 0;
									}
									continue;
								}
								if (opcode == 5218) {
									@Pc(9861) int isp2 = isp - 1;
									@Pc(9864) int mapId = intStack[isp2];
									@Pc(9867) Map map = MapList.get(mapId);
									if (map == null) {
										isp = isp2 + 1;
										intStack[isp2] = -1;
									} else {
										isp = isp2 + 1;
										intStack[isp2] = map.defaultZoom;
									}
									continue;
								}
								if (opcode == 5220) {
									intStack[isp++] = WorldMap.loadPercentage == 100 ? 1 : 0;
									continue;
								}
								if (opcode == 5221) {
									isp--;
									@Pc(9912) int coord = intStack[isp];
									Static20.method1970(coord >> 14 & 0x3FFF, coord & 0x3FFF);
									continue;
								}
								if (opcode == 5222) {
									@Pc(9933) Map map = WorldMap.getCurrentMap();
									if (map == null) {
										@Pc(9938) int isp2 = isp + 1;
										intStack[isp] = -1;
										isp = isp2 + 1;
										intStack[isp2] = -1;
									} else {
										@Pc(9963) boolean success = map.convertDisplayToSource(Static3.anInt2962 + Static1.anInt331, Static3.anInt2960 + Static3.anInt2961 - Static7.anInt5231 - 1, coord);
										if (success) {
											@Pc(9980) int isp2 = isp + 1;
											intStack[isp] = coord[1];
											isp = isp2 + 1;
											intStack[isp2] = coord[2];
										} else {
											@Pc(9968) int isp2 = isp + 1;
											intStack[isp] = -1;
											isp = isp2 + 1;
											intStack[isp2] = -1;
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
									@Pc(10031) int isp2 = isp - 1;
									@Pc(10034) int local10034 = intStack[isp2];
									@Pc(10039) Map map = WorldMap.getCurrentMap();
									if (map == null) {
										@Pc(10045) int isp3 = isp2 + 1;
										intStack[isp2] = -1;
										isp = isp3 + 1;
										intStack[isp3] = -1;
									} else {
										@Pc(10072) boolean success = map.convertSourceToDisplay(local10034 >> 28 & 0x3, local10034 >> 14 & 0x3FFF, local10034 & 0x3FFF, coord);
										if (success) {
											@Pc(10077) int isp3 = isp2 + 1;
											intStack[isp2] = coord[1];
											isp = isp3 + 1;
											intStack[isp3] = coord[2];
										} else {
											@Pc(10093) int isp3 = isp2 + 1;
											intStack[isp2] = -1;
											isp = isp3 + 1;
											intStack[isp3] = -1;
										}
									}
									continue;
								}
								if (opcode == 5225) {
									@Pc(10109) int isp2 = isp - 1;
									@Pc(10112) int coord = intStack[isp2];
									@Pc(10115) Map map = WorldMap.getCurrentMap();
									if (map == null) {
										@Pc(10164) int isp3 = isp2 + 1;
										intStack[isp2] = -1;
										isp = isp3 + 1;
										intStack[isp3] = -1;
									} else {
										@Pc(10131) boolean success = map.convertDisplayToSource(coord >> 14 & 0x3FFF, coord & 0x3FFF, ScriptRunner.coord);
										if (success) {
											@Pc(10136) int isp3 = isp2 + 1;
											intStack[isp2] = ScriptRunner.coord[1];
											isp = isp3 + 1;
											intStack[isp3] = ScriptRunner.coord[2];
										} else {
											@Pc(10152) int isp3 = isp2 + 1;
											intStack[isp2] = -1;
											isp = isp3 + 1;
											intStack[isp3] = -1;
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
									@Pc(5696) int isp2 = isp - 2;
									@Pc(5700) int width = intStack[isp2];
									@Pc(5706) int height = intStack[isp2 + 1];
									Static35.setWindowMode(false, 3, width, height);
									isp = isp2 + 1;
									intStack[isp2] = GameShell.fullScreenFrame == null ? 0 : 1;
									continue;
								}
								if (opcode == 5301) {
									if (GameShell.fullScreenFrame != null) {
										Static35.setWindowMode(false, Preferences.windowMode, -1, -1);
									}
									continue;
								}
								if (opcode == 5302) {
									@Pc(5750) DisplayMode[] modes = DisplayMode.getModes();
									intStack[isp++] = modes.length;
									continue;
								}
								if (opcode == 5303) {
									@Pc(5766) int isp2 = isp - 1;
									@Pc(5769) int i = intStack[isp2];
									@Pc(5772) DisplayMode[] modes = DisplayMode.getModes();
									intStack[isp2++] = modes[i].width;
									isp = isp2 + 1;
									intStack[isp2] = modes[i].height;
									continue;
								}
								if (opcode == 5305) {
									@Pc(5796) int width = Preferences.fullScreenWidth;
									@Pc(5798) int height = Preferences.fullScreenHeight;
									@Pc(5800) int result = -1;
									@Pc(5803) DisplayMode[] modes = DisplayMode.getModes();
									for (@Pc(5805) int i = 0; i < modes.length; i++) {
										@Pc(5813) DisplayMode mode = modes[i];
										if (mode.width == width && mode.height == height) {
											result = i;
											break;
										}
									}
									intStack[isp++] = result;
									continue;
								}
								if (opcode == 5306) {
									intStack[isp++] = Static11.getWindowMode();
									continue;
								}
								if (opcode == 5307) {
									isp--;
									@Pc(5862) int windowMode = intStack[isp];
									if (windowMode < 0 || windowMode > 2) {
										windowMode = 0;
									}
									Static35.setWindowMode(false, windowMode, -1, -1);
									continue;
								}
								if (opcode == 5308) {
									intStack[isp++] = Preferences.windowMode;
									continue;
								}
								if (opcode == 5309) {
									isp--;
									@Pc(5907) int windowMode = intStack[isp];
									if (windowMode < 0 || windowMode > 2) {
										windowMode = 0;
									}
									Preferences.windowMode = windowMode;
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
									Static7.aShortArray124[intStack[isp]] = (short) ColorUtils.rgbToHsl(intStack[isp + 1]);
									ObjTypeList.clearModels();
									ObjTypeList.clearSprites();
									NpcTypeList.clearModels();
									NpcTypeList.clearHeadModels();
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
										Static35.setWindowMode(false, Preferences.windowMode, -1, -1);
									}
									if (GameShell.frame == null) {
										Static37.openUrl(Static36.method4436(), false);
									} else {
										System.exit(0);
									}
									continue;
								}
								if (opcode == 5419) {
									@Pc(9027) String hostname = "";
									if (Static1.reverseDnsRequest != null) {
										if (Static1.reverseDnsRequest.result == null) {
											hostname = Static27.method3226(Static1.reverseDnsRequest.intArg1);
										} else {
											hostname = (String) Static1.reverseDnsRequest.result;
										}
									}
									stringStack[ssp++] = hostname;
									continue;
								}
								if (opcode == 5420) {
									intStack[isp++] = SignLink.anInt6106 == 3 ? 1 : 0;
									continue;
								}
								if (opcode == 5421) {
									if (GameShell.fullScreenFrame != null) {
										Static35.setWindowMode(false, Preferences.windowMode, -1, -1);
									}
									ssp--;
									@Pc(9090) String path = stringStack[ssp];
									isp--;
									@Pc(9100) boolean newTab = intStack[isp] == 1;
									@Pc(9110) String url = Static36.method4436() + path;
									if (GameShell.frame != null || newTab && SignLink.anInt6106 != 3 && SignLink.osName.startsWith("win") && !client.haveIe6) {
										Static6.url = url;
										Static4.newTab = newTab;
										Static1.openUrlRequest = GameShell.signLink.openUrl(url);
										continue;
									}
									Static37.openUrl(url, newTab);
									continue;
								}
								if (opcode == 5422) {
									ssp -= 2;
									@Pc(9150) String prefix = stringStack[ssp];
									@Pc(9156) String suffix = stringStack[ssp + 1];
									isp--;
									@Pc(9161) int i = intStack[isp];
									if (prefix.length() > 0) {
										if (Player.TITLE_PREFIXES == null) {
											Player.TITLE_PREFIXES = new String[Player.TITLES_PER_GAME[client.game]];
										}
										Player.TITLE_PREFIXES[i] = prefix;
									}
									if (suffix.length() > 0) {
										if (Player.TITLE_SUFFIXES == null) {
											Player.TITLE_SUFFIXES = new String[Player.TITLES_PER_GAME[client.game]];
										}
										Player.TITLE_SUFFIXES[i] = suffix;
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
									@Pc(5954) String username = stringStack[ssp];
									@Pc(5960) String password = stringStack[ssp + 1];
									if (Static4.anInt3304 == 10 && LoginManager.autoStep == 0 && LoginManager.step == 0 && CreateManager.step == 0 && WorldList.step == 0) {
										LoginManager.login(username, password, local5950);
									}
									continue;
								}
								if (opcode == 5601) {
									LoginManager.method4619();
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
										stringStack[ssp++] = CreateManager.suggestedNames.length > local6245 ? Base37.toTitleCase(CreateManager.suggestedNames[local6245]) : "";
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
									@Pc(6301) int brightness = intStack[isp];
									if (brightness < 1) {
										brightness = 1;
									}
									if (brightness > 4) {
										brightness = 4;
									}
									Preferences.brightness = brightness;
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
									ObjTypeList.clearSprites();
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
									((Js5GlTextureProvider) Static4.textureProvider).setLowDetail(!Preferences.highDetailTextures);
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
									@Pc(6587) int sceneryShadows = intStack[isp];
									if (sceneryShadows < 0 || sceneryShadows > 2) {
										sceneryShadows = 0;
									}
									Preferences.sceneryShadows = sceneryShadows;
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
									@Pc(6779) int volume = intStack[isp];
									if (volume < 0) {
										volume = 0;
									}
									if (volume > 127) {
										volume = 127;
									}
									Preferences.soundEffectsVolume = volume;
									Preferences.write(GameShell.signLink);
									Preferences.sentToServer = false;
									continue;
								}
								if (opcode == 6019) {
									isp--;
									@Pc(6806) int volume = intStack[isp];
									if (volume < 0) {
										volume = 0;
									}
									if (volume > 255) {
										volume = 255;
									}
									if (Preferences.musicVolume != volume) {
										if (Preferences.musicVolume == 0 && Static6.anInt4844 != -1) {
											Static28.method3251(volume, Static6.anInt4844, client.js5Archive6);
											Static4.aBoolean210 = false;
										} else if (volume == 0) {
											Static37.method4718();
											Static4.aBoolean210 = false;
										} else {
											Static29.method3541(volume);
										}
										Preferences.musicVolume = volume;
									}
									Preferences.write(GameShell.signLink);
									Preferences.sentToServer = false;
									continue;
								}
								if (opcode == 6020) {
									isp--;
									@Pc(6882) int volume = intStack[isp];
									if (volume < 0) {
										volume = 0;
									}
									if (volume > 127) {
										volume = 127;
									}
									Preferences.areaSoundsVolume = volume;
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
									@Pc(6933) boolean forceDisabled = false;
									@Pc(6935) int isp2 = isp - 1;
									@Pc(6938) int particles = intStack[isp2];
									if (particles < 0) {
										particles = 0;
									}
									if (particles > 2) {
										particles = 2;
									}
									if (GameShell.maxMemory < 96) {
										particles = 0;
										forceDisabled = true;
									}
									Preferences.setParticles(particles);
									Preferences.write(GameShell.signLink);
									Preferences.sentToServer = false;
									isp = isp2 + 1;
									intStack[isp2] = forceDisabled ? 0 : 1;
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
									@Pc(7015) int hdr = intStack[isp];
									if (!GlRenderer.enabled) {
										continue;
									}
									if (hdr < 0 || hdr > 1) {
										hdr = 0;
									}
									Static10.setHdrEnabled(hdr == 1);
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
									Static32.method3924(0, false, Static3.aClass185_5.height, 0, Static3.aClass185_5.width);
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
									@Pc(7466) int isp2 = isp - 3;
									@Pc(7470) int day = intStack[isp2];
									@Pc(7476) int year = intStack[isp2 + 2];
									@Pc(7482) int month = intStack[isp2 + 1];
									calendar.clear();
									calendar.set(Calendar.HOUR_OF_DAY, 12);
									calendar.set(year, month, day);
									isp = isp2 + 1;
									intStack[isp2] = (int) (calendar.getTime().getTime() / 86400000L) - 11745;
									continue;
								}
								if (opcode == 6303) {
									calendar.clear();
									calendar.setTime(new Date(MonotonicClock.currentTimeMillis()));
									intStack[isp++] = calendar.get(Calendar.YEAR);
									continue;
								}
								if (opcode == 6304) {
									@Pc(7537) int isp2 = isp - 1;
									@Pc(7540) int year = intStack[isp2];
									@Pc(7542) boolean leapYear = true;
									if (year < 0) {
										leapYear = (year + 1) % 4 == 0;
									} else if (year < 1582) {
										leapYear = year % 4 == 0;
									} else if (year % 4 != 0) {
										leapYear = false;
									} else if (year % 100 != 0) {
										leapYear = true;
									} else if (year % 400 != 0) {
										leapYear = false;
									}
									isp = isp2 + 1;
									intStack[isp2] = leapYear ? 1 : 0;
									continue;
								}
							} else if (opcode < 6500) {
								if (opcode == 6405) {
									intStack[isp++] = Static26.showVideoAd() ? 1 : 0;
									continue;
								}
								if (opcode == 6406) {
									intStack[isp++] = Static14.isShowingVideoAd() ? 1 : 0;
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
										@Pc(7758) int isp2 = isp + 1;
										intStack[isp] = -1;
										intStack[isp2++] = 0;
										@Pc(7768) int ssp2 = ssp + 1;
										stringStack[ssp] = "";
										intStack[isp2++] = 0;
										ssp = ssp2 + 1;
										stringStack[ssp2] = "";
										isp = isp2 + 1;
										intStack[isp2] = 0;
									} else {
										@Pc(7716) int isp2 = isp + 1;
										intStack[isp] = world.id;
										intStack[isp2++] = world.flags;
										@Pc(7728) int ssp2 = ssp + 1;
										stringStack[ssp] = world.activity;
										@Pc(7735) Country country = world.getCountry();
										intStack[isp2++] = country.flag;
										ssp = ssp2 + 1;
										stringStack[ssp2] = country.name;
										isp = isp2 + 1;
										intStack[isp2] = world.players;
									}
									continue;
								}
								if (opcode == 6502) {
									@Pc(7796) World world = WorldList.next();
									if (world == null) {
										@Pc(7801) int isp2 = isp + 1;
										intStack[isp] = -1;
										intStack[isp2++] = 0;
										@Pc(7811) int ssp2 = ssp + 1;
										stringStack[ssp] = "";
										intStack[isp2++] = 0;
										ssp = ssp2 + 1;
										stringStack[ssp2] = "";
										isp = isp2 + 1;
										intStack[isp2] = 0;
									} else {
										@Pc(7833) int isp2 = isp + 1;
										intStack[isp] = world.id;
										intStack[isp2++] = world.flags;
										@Pc(7845) int ssp2 = ssp + 1;
										stringStack[ssp] = world.activity;
										@Pc(7852) Country country = world.getCountry();
										intStack[isp2++] = country.flag;
										ssp = ssp2 + 1;
										stringStack[ssp2] = country.name;
										isp = isp2 + 1;
										intStack[isp2] = world.players;
									}
									continue;
								}
								if (opcode == 6503) {
									@Pc(7880) int isp2 = isp - 1;
									@Pc(7883) int id = intStack[isp2];
									if (Static4.anInt3304 == 10 && LoginManager.autoStep == 0 && LoginManager.step == 0 && CreateManager.step == 0) {
										isp = isp2 + 1;
										intStack[isp2] = WorldList.switchWorld(id) ? 1 : 0;
										continue;
									}
									isp = isp2 + 1;
									intStack[isp2] = 0;
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
									@Pc(7950) int isp2 = isp - 1;
									@Pc(7953) int id = intStack[isp2];
									@Pc(7957) World world = WorldList.get(id);
									if (world == null) {
										@Pc(7963) int isp3 = isp2 + 1;
										intStack[isp2] = -1;
										@Pc(7968) int ssp2 = ssp + 1;
										stringStack[ssp] = "";
										intStack[isp3++] = 0;
										ssp = ssp2 + 1;
										stringStack[ssp2] = "";
										isp = isp3 + 1;
										intStack[isp3] = 0;
									} else {
										@Pc(7990) int isp3 = isp2 + 1;
										intStack[isp2] = world.flags;
										@Pc(7996) int ssp2 = ssp + 1;
										stringStack[ssp] = world.activity;
										@Pc(8003) Country country = world.getCountry();
										intStack[isp3++] = country.flag;
										ssp = ssp2 + 1;
										stringStack[ssp2] = country.name;
										isp = isp3 + 1;
										intStack[isp3] = world.players;
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
									@Pc(8089) int id = intStack[isp];
									@Pc(8093) MelType type = MelTypeList.get(id);
									if (type.text == null) {
										stringStack[ssp++] = "";
									} else {
										stringStack[ssp++] = type.text;
									}
									continue;
								}
								if (opcode == 6801) {
									@Pc(8119) int isp2 = isp - 1;
									@Pc(8122) int id = intStack[isp2];
									@Pc(8126) MelType type = MelTypeList.get(id);
									isp = isp2 + 1;
									intStack[isp2] = type.sprite;
									continue;
								}
								if (opcode == 6802) {
									@Pc(8141) int isp2 = isp - 1;
									@Pc(8144) int id = intStack[isp2];
									@Pc(8148) MelType type = MelTypeList.get(id);
									isp = isp2 + 1;
									intStack[isp2] = type.textSize;
									continue;
								}
								if (opcode == 6803) {
									@Pc(8163) int isp2 = isp - 1;
									@Pc(8166) int id = intStack[isp2];
									@Pc(8170) MelType type = MelTypeList.get(id);
									isp = isp2 + 1;
									intStack[isp2] = type.category;
									continue;
								}
							}
						} else if (opcode == 4500) {
							isp -= 2;
							@Pc(10481) int structId = intStack[isp];
							@Pc(10487) int paramId = intStack[isp + 1];
							@Pc(10491) ParamType param = ParamTypeList.get(paramId);
							if (param.isString()) {
								stringStack[ssp++] = StructTypeList.get(structId).getParam(paramId, param.defaultString);
							} else {
								intStack[isp++] = StructTypeList.get(structId).getParam(paramId, param.defaultInt);
							}
							continue;
						}
					} else if (opcode == 4400) {
						isp -= 2;
						@Pc(10538) int locId = intStack[isp];
						@Pc(10544) int paramId = intStack[isp + 1];
						@Pc(10548) ParamType param = ParamTypeList.get(paramId);
						if (param.isString()) {
							stringStack[ssp++] = LocTypeList.get(locId).getParam(paramId, param.defaultString);
						} else {
							intStack[isp++] = LocTypeList.get(locId).getParam(paramId, param.defaultInt);
						}
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(15060) Exception ex) {
			if (script.name == null) {
				if (client.modeWhere != 0) {
					Chat.add(0, "", "Clientscript error - check log for details");
				}
				TracingException.report(ex, "CS2 - scr:" + script.key + " op:" + opcode);
			} else {
				@Pc(15069) StringBuffer buffer = new StringBuffer(30);
				buffer.append("%0a - in: ").append(script.name);
				for (@Pc(15080) int i = fp - 1; i >= 0; i--) {
					buffer.append("%0a - via: ").append(callStack[i].script.name);
				}
				if (opcode == 40) {
					@Pc(15103) int scriptId = intOperands[pc];
					buffer.append("%0a - non-existant gosub script-num: ").append(Integer.toString(scriptId));
				}
				if (client.modeWhere != 0) {
					Chat.add(0, "", "Clientscript error in: " + script.name);
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
				x = Static5.aClass185_12.x;
				y = Static5.aClass185_12.y;
			}
			intLocals[1] = Mouse.y - y;
			intLocals[0] = Mouse.x - x;
		}
		run(script, 200000);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!io;ZI)V")
	public static void method519(@OriginalArg(0) HookRequest request, @OriginalArg(2) int maxCycles) {
		@Pc(8) Object[] args = request.arguments;
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
					value = request.mouseX;
				}
				if (value == 0x80000002) {
					value = request.mouseY;
				}
				if (value == 0x80000003) {
					value = request.source == null ? -1 : request.source.id;
				}
				if (value == 0x80000004) {
					value = request.op;
				}
				if (value == 0x80000005) {
					value = request.source == null ? -1 : request.source.createdComponentId;
				}
				if (value == 0x80000006) {
					value = request.target == null ? -1 : request.target.id;
				}
				if (value == 0x80000007) {
					value = request.target == null ? -1 : request.target.createdComponentId;
				}
				if (value == 0x80000008) {
					value = request.keyCode;
				}
				if (value == 0x80000009) {
					value = request.keyChar;
				}
				intLocals[intLocalIndex++] = value;
			} else if (args[i] instanceof String) {
				@Pc(168) String value = (String) args[i];
				if (value.equals("event_opbase")) {
					value = request.opBase;
				}
				stringLocals[stringLocalIndex++] = value;
			}
		}
		run(script, maxCycles);
	}
}
