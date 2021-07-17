import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Cs1ScriptRunner {
	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IBLclient!wf;)I")
	private static int run(@OriginalArg(2) Component component, @OriginalArg(0) int id) {
		if (component.cs1Scripts == null || id >= component.cs1Scripts.length) {
			return -2;
		}
		try {
			@Pc(30) int[] script = component.cs1Scripts[id];
			@Pc(32) int pc = 0;
			@Pc(34) int accumulator = 0;
			@Pc(36) byte accumulatorMode = 0;
			while (true) {
				@Pc(38) byte nextAccumulatorMode = 0;
				@Pc(43) int opcode = script[pc++];
				@Pc(45) int value = 0;
				if (opcode == 0) {
					return accumulator;
				}
				if (opcode == 1) {
					value = PlayerSkillXpTable.boostedLevels[script[pc++]];
				}
				if (opcode == 15) {
					nextAccumulatorMode = 1;
				}
				if (opcode == 16) {
					nextAccumulatorMode = 2;
				}
				if (opcode == 17) {
					nextAccumulatorMode = 3;
				}
				if (opcode == 2) {
					value = PlayerSkillXpTable.baseLevels[script[pc++]];
				}
				if (opcode == 3) {
					value = PlayerSkillXpTable.experience[script[pc++]];
				}
				if (opcode == 4) {
					@Pc(114) int pc2 = pc + 1;
					@Pc(118) int componentId = script[pc] << 16;
					componentId += script[pc2++];
					@Pc(129) Component otherComponent = InterfaceList.getComponent(componentId);
					pc = pc2 + 1;
					@Pc(134) int objType = script[pc2];
					if (objType != -1 && (!ObjTypeList.get(objType).members || LoginManager.mapMembers)) {
						for (@Pc(147) int slot = 0; slot < otherComponent.objTypes.length; slot++) {
							if (otherComponent.objTypes[slot] == objType + 1) {
								value += otherComponent.objCounts[slot];
							}
						}
					}
				}
				if (opcode == 5) {
					value = VarpDomain.varps[script[pc++]];
				}
				if (opcode == 6) {
					value = PlayerSkillXpTable.EXPERIENCE_FOR_LEVEL[PlayerSkillXpTable.baseLevels[script[pc++]] - 1];
				}
				if (opcode == 7) {
					value = VarpDomain.varps[script[pc++]] * 100 / 46875;
				}
				if (opcode == 8) {
					value = PlayerList.self.combatLevel;
				}
				if (opcode == 9) {
					for (@Pc(237) int skill = 0; skill < 25; skill++) {
						if (PlayerSkillXpTable.ENABLED_SKILLS[skill]) {
							value += PlayerSkillXpTable.baseLevels[skill];
						}
					}
				}
				if (opcode == 10) {
					@Pc(261) int pc2 = pc + 1;
					@Pc(265) int componentId = script[pc] << 16;
					componentId += script[pc2++];
					@Pc(276) Component otherComponent = InterfaceList.getComponent(componentId);
					pc = pc2 + 1;
					@Pc(281) int objType = script[pc2];
					if (objType != -1 && (!ObjTypeList.get(objType).members || LoginManager.mapMembers)) {
						for (@Pc(295) int slot = 0; slot < otherComponent.objTypes.length; slot++) {
							if (objType + 1 == otherComponent.objTypes[slot]) {
								value = 999999999;
								break;
							}
						}
					}
				}
				if (opcode == 11) {
					value = Static2.runEnergy;
				}
				if (opcode == 12) {
					value = Static3.weight;
				}
				if (opcode == 13) {
					@Pc(345) int pc2 = pc + 1;
					@Pc(348) int varpValue = VarpDomain.varps[script[pc]];
					pc = pc2 + 1;
					@Pc(353) int bit = script[pc2];
					value = (0x1 << bit & varpValue) == 0 ? 0 : 1;
				}
				if (opcode == 14) {
					@Pc(375) int varbit = script[pc++];
					value = VarpDomain.getVarbit(varbit);
				}
				if (opcode == 18) {
					value = Static5.originX + (PlayerList.self.xFine >> 7);
				}
				if (opcode == 19) {
					value = Static7.originZ + (PlayerList.self.zFine >> 7);
				}
				if (opcode == 20) {
					value = script[pc++];
				}
				if (nextAccumulatorMode == 0) {
					if (accumulatorMode == 0) {
						accumulator += value;
					}
					if (accumulatorMode == 1) {
						accumulator -= value;
					}
					if (accumulatorMode == 2 && value != 0) {
						accumulator /= value;
					}
					if (accumulatorMode == 3) {
						accumulator *= value;
					}
					accumulatorMode = 0;
				} else {
					accumulatorMode = nextAccumulatorMode;
				}
			}
		} catch (@Pc(459) Exception ex) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!wf;B)Z")
	public static boolean isTrue(@OriginalArg(0) Component component) {
		if (component.cs1ComparisonOpcodes == null) {
			return false;
		}
		for (@Pc(19) int i = 0; i < component.cs1ComparisonOpcodes.length; i++) {
			@Pc(29) int value = run(component, i);
			@Pc(34) int operand = component.cs1ComparisonOperands[i];
			if (component.cs1ComparisonOpcodes[i] == 2) {
				if (value >= operand) {
					return false;
				}
			} else if (component.cs1ComparisonOpcodes[i] == 3) {
				if (value <= operand) {
					return false;
				}
			} else if (component.cs1ComparisonOpcodes[i] == 4) {
				if (value == operand) {
					return false;
				}
			} else if (operand != value) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!wf;ILjava/lang/String;)Ljava/lang/String;")
	public static String interpolate(@OriginalArg(0) Component component, @OriginalArg(2) String text) {
		if (text.indexOf("%") == -1) {
			return text;
		}
		while (true) {
			@Pc(21) int index1 = text.indexOf("%1");
			if (index1 == -1) {
				while (true) {
					@Pc(54) int index2 = text.indexOf("%2");
					if (index2 == -1) {
						while (true) {
							@Pc(90) int index3 = text.indexOf("%3");
							if (index3 == -1) {
								while (true) {
									@Pc(126) int index4 = text.indexOf("%4");
									if (index4 == -1) {
										while (true) {
											@Pc(162) int index5 = text.indexOf("%5");
											if (index5 == -1) {
												while (true) {
													@Pc(194) int dnsIndex = text.indexOf("%dns");
													if (dnsIndex == -1) {
														return text;
													}
													@Pc(200) String reverseDns = "";
													if (Static1.reverseDnsRequest != null) {
														if (Static1.reverseDnsRequest.result == null) {
															reverseDns = StringUtils.ipToString(Static1.reverseDnsRequest.intArg1);
														} else {
															reverseDns = (String) Static1.reverseDnsRequest.result;
														}
													}
													text = text.substring(0, dnsIndex) + reverseDns + text.substring(dnsIndex + 4);
												}
											}
											text = text.substring(0, index5) + toString(run(component, 4)) + text.substring(index5 + 2);
										}
									}
									text = text.substring(0, index4) + toString(run(component, 3)) + text.substring(index4 + 2);
								}
							}
							text = text.substring(0, index3) + toString(run(component, 2)) + text.substring(index3 + 2);
						}
					}
					text = text.substring(0, index2) + toString(run(component, 1)) + text.substring(index2 + 2);
				}
			}
			text = text.substring(0, index1) + toString(run(component, 0)) + text.substring(index1 + 2);
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(II)Ljava/lang/String;")
	private static String toString(@OriginalArg(0) int value) {
		return value >= 999999999 ? "*" : Integer.toString(value);
	}
}
