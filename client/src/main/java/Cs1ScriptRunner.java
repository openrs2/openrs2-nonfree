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
					value = Static7.anIntArray501[script[pc++]];
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
					value = Static7.anIntArray599[script[pc++]];
				}
				if (opcode == 3) {
					value = Static7.anIntArray637[script[pc++]];
				}
				if (opcode == 4) {
					@Pc(114) int local114 = pc + 1;
					@Pc(118) int local118 = script[pc] << 16;
					local118 += script[local114++];
					@Pc(129) Component local129 = InterfaceList.getComponent(local118);
					pc = local114 + 1;
					@Pc(134) int local134 = script[local114];
					if (local134 != -1 && (!ObjTypeList.get(local134).members || LoginManager.mapMembers)) {
						for (@Pc(147) int local147 = 0; local147 < local129.objTypes.length; local147++) {
							if (local129.objTypes[local147] == local134 + 1) {
								value += local129.objCounts[local147];
							}
						}
					}
				}
				if (opcode == 5) {
					value = VarpDomain.varps[script[pc++]];
				}
				if (opcode == 6) {
					value = PlayerSkillXpTable.EXPERIENCE_FOR_LEVEL[Static7.anIntArray599[script[pc++]] - 1];
				}
				if (opcode == 7) {
					value = VarpDomain.varps[script[pc++]] * 100 / 46875;
				}
				if (opcode == 8) {
					value = PlayerList.self.combatLevel;
				}
				if (opcode == 9) {
					for (@Pc(237) int local237 = 0; local237 < 25; local237++) {
						if (Static7.aBooleanArray25[local237]) {
							value += Static7.anIntArray599[local237];
						}
					}
				}
				if (opcode == 10) {
					@Pc(261) int local261 = pc + 1;
					@Pc(265) int local265 = script[pc] << 16;
					local265 += script[local261++];
					@Pc(276) Component local276 = InterfaceList.getComponent(local265);
					pc = local261 + 1;
					@Pc(281) int local281 = script[local261];
					if (local281 != -1 && (!ObjTypeList.get(local281).members || LoginManager.mapMembers)) {
						for (@Pc(295) int local295 = 0; local295 < local276.objTypes.length; local295++) {
							if (local281 + 1 == local276.objTypes[local295]) {
								value = 999999999;
								break;
							}
						}
					}
				}
				if (opcode == 11) {
					value = Static2.anInt2248;
				}
				if (opcode == 12) {
					value = Static3.anInt2048;
				}
				if (opcode == 13) {
					@Pc(345) int local345 = pc + 1;
					@Pc(348) int local348 = VarpDomain.varps[script[pc]];
					pc = local345 + 1;
					@Pc(353) int local353 = script[local345];
					value = (0x1 << local353 & local348) == 0 ? 0 : 1;
				}
				if (opcode == 14) {
					@Pc(375) int local375 = script[pc++];
					value = VarpDomain.getVarbit(local375);
				}
				if (opcode == 18) {
					value = Static5.originX + (PlayerList.self.x >> 7);
				}
				if (opcode == 19) {
					value = (PlayerList.self.z >> 7) + Static7.originZ;
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
			@Pc(21) int local21 = text.indexOf("%1");
			if (local21 == -1) {
				while (true) {
					@Pc(54) int local54 = text.indexOf("%2");
					if (local54 == -1) {
						while (true) {
							@Pc(90) int local90 = text.indexOf("%3");
							if (local90 == -1) {
								while (true) {
									@Pc(126) int local126 = text.indexOf("%4");
									if (local126 == -1) {
										while (true) {
											@Pc(162) int local162 = text.indexOf("%5");
											if (local162 == -1) {
												while (true) {
													@Pc(194) int local194 = text.indexOf("%dns");
													if (local194 == -1) {
														return text;
													}
													@Pc(200) String local200 = "";
													if (Static1.aClass197_2 != null) {
														if (Static1.aClass197_2.result == null) {
															local200 = Static27.method3226(Static1.aClass197_2.intArg1);
														} else {
															local200 = (String) Static1.aClass197_2.result;
														}
													}
													text = text.substring(0, local194) + local200 + text.substring(local194 + 4);
												}
											}
											text = text.substring(0, local162) + toString(run(component, 4)) + text.substring(local162 + 2);
										}
									}
									text = text.substring(0, local126) + toString(run(component, 3)) + text.substring(local126 + 2);
								}
							}
							text = text.substring(0, local90) + toString(run(component, 2)) + text.substring(local90 + 2);
						}
					}
					text = text.substring(0, local54) + toString(run(component, 1)) + text.substring(local54 + 2);
				}
			}
			text = text.substring(0, local21) + toString(run(component, 0)) + text.substring(local21 + 2);
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(II)Ljava/lang/String;")
	private static String toString(@OriginalArg(0) int value) {
		return value >= 999999999 ? "*" : Integer.toString(value);
	}
}
