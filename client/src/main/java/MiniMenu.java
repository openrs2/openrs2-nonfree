import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class MiniMenu {
	@OriginalMember(owner = "client!sn", name = "ab", descriptor = "[Ljava/lang/String;")
	public static final String[] ops = new String[500];

	@OriginalMember(owner = "client!sc", name = "jb", descriptor = "[Ljava/lang/String;")
	public static final String[] opBases = new String[500];

	@OriginalMember(owner = "client!g", name = "L", descriptor = "[I")
	public static final int[] cursors = new int[500];

	@OriginalMember(owner = "client!ta", name = "E", descriptor = "[S")
	public static final short[] actions = new short[500];

	@OriginalMember(owner = "client!jo", name = "E", descriptor = "[J")
	private static final long[] aLongArray56 = new long[500];

	@OriginalMember(owner = "client!fa", name = "cb", descriptor = "[I")
	public static final int[] anIntArray117 = new int[500];

	@OriginalMember(owner = "client!ta", name = "t", descriptor = "[I")
	public static final int[] anIntArray543 = new int[500];

	@OriginalMember(owner = "client!vl", name = "u", descriptor = "I")
	public static int size = 0;

	@OriginalMember(owner = "client!p", name = "pc", descriptor = "Ljava/lang/String;")
	public static String walkHereOp;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(JIILjava/lang/String;Ljava/lang/String;SIB)V")
	public static void add(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String opBase, @OriginalArg(4) String op, @OriginalArg(5) short action, @OriginalArg(6) int cursor) {
		if (Static1.aBoolean17 || size >= 500) {
			return;
		}
		ops[size] = op;
		opBases[size] = opBase;
		cursors[size] = cursor == -1 ? Static7.anInt6050 : cursor;
		actions[size] = action;
		aLongArray56[size] = arg0;
		anIntArray117[size] = arg1;
		anIntArray543[size] = arg2;
		size++;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZI)V")
	public static void remove(@OriginalArg(1) int i) {
		size--;
		if (size == i) {
			return;
		}
		ArrayUtils.copy(ops, i + 1, ops, i, size - i);
		ArrayUtils.copy(opBases, i + 1, opBases, i, size - i);
		ArrayUtils.copy(cursors, i + 1, cursors, i, size - i);
		ArrayUtils.copy(actions, i + 1, actions, i, size - i);
		ArrayUtils.copy(aLongArray56, i + 1, aLongArray56, i, size - i);
		ArrayUtils.copy(anIntArray117, i + 1, anIntArray117, i, size - i);
		ArrayUtils.copy(anIntArray543, i + 1, anIntArray543, i, size - i);
	}

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "(I)V")
	public static void sort() {
		@Pc(11) boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (@Pc(17) int i = 0; i < size - 1; i++) {
				if (actions[i] < 1000 && actions[i + 1] > 1000) {
					sorted = false;
					@Pc(43) String opBase = opBases[i];
					opBases[i] = opBases[i + 1];
					opBases[i + 1] = opBase;
					@Pc(61) String op = ops[i];
					ops[i] = ops[i + 1];
					ops[i + 1] = op;
					@Pc(79) int tempInt = anIntArray117[i];
					anIntArray117[i] = anIntArray117[i + 1];
					anIntArray117[i + 1] = tempInt;
					tempInt = anIntArray543[i];
					anIntArray543[i] = anIntArray543[i + 1];
					anIntArray543[i + 1] = tempInt;
					tempInt = cursors[i];
					cursors[i] = cursors[i + 1];
					cursors[i + 1] = tempInt;
					@Pc(133) short action = actions[i];
					actions[i] = actions[i + 1];
					actions[i + 1] = action;
					@Pc(151) long local151 = aLongArray56[i];
					aLongArray56[i] = aLongArray56[i + 1];
					aLongArray56[i + 1] = local151;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)V")
	public static void doAction(@OriginalArg(1) int i) {
		if (i < 0) {
			return;
		}
		@Pc(15) int local15 = anIntArray117[i];
		@Pc(19) int local19 = anIntArray543[i];
		@Pc(24) int local24 = (int) aLongArray56[i];
		@Pc(28) int action = actions[i];
		@Pc(32) long local32 = aLongArray56[i];
		if (action >= 2000) {
			action -= 2000;
		}
		if (action == 24) {
			@Pc(46) Player player = PlayerList.players[local24];
			if (player != null) {
				Static6.anInt5177 = Mouse.clickX;
				Static7.anInt6008 = 2;
				Static2.anInt1629 = 0;
				Static4.anInt3275 = Mouse.clickY;
				Protocol.outboundBuffer.writeOpcode(52);
				Protocol.outboundBuffer.writeShort(local24);
				Protocol.outboundBuffer.writeByte(Keyboard.pressedKeys[82] ? 1 : 0);
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, player.getSize(), player.getSize(), 0, 0);
			}
		}
		if (action == 17) {
			Protocol.outboundBuffer.writeOpcode(95);
			Protocol.outboundBuffer.writeShort(local24);
			Protocol.outboundBuffer.writeIntAlt3(local19);
			Protocol.outboundBuffer.writeShortLEA(local15);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = InterfaceList.getComponent(local19);
			Static5.anInt3884 = local15;
		}
		if (action == 33) {
			@Pc(146) Npc npc = NpcList.npcs[local24];
			if (npc != null) {
				Static6.anInt5177 = Mouse.clickX;
				Static7.anInt6008 = 2;
				Static4.anInt3275 = Mouse.clickY;
				Static2.anInt1629 = 0;
				Protocol.outboundBuffer.writeOpcode(160);
				Protocol.outboundBuffer.writeByteC(Keyboard.pressedKeys[82] ? 1 : 0);
				Protocol.outboundBuffer.writeIntLE2(Static5.anInt4302);
				Protocol.outboundBuffer.writeShortLE2(local24);
				Protocol.outboundBuffer.writeShort(Static1.anInt314);
				Protocol.outboundBuffer.writeShortLEA(Static1.anInt243);
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, npc.getSize(), npc.getSize(), 0, 0);
			}
		}
		if (action == 40) {
			Static4.anInt3275 = Mouse.clickY;
			Static7.anInt6008 = 2;
			Static6.anInt5177 = Mouse.clickX;
			Static2.anInt1629 = 0;
			Protocol.outboundBuffer.writeOpcode(134);
			Protocol.outboundBuffer.writeByteS(Keyboard.pressedKeys[82] ? 1 : 0);
			Protocol.outboundBuffer.writeShortA(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Protocol.outboundBuffer.writeShortA(Static7.originZ + local19);
			Protocol.outboundBuffer.writeShortLEA(Static5.originX + local15);
			Static13.method1004(local19, local32, local15);
		}
		if (action == 46) {
			Static2.anInt1629 = 0;
			Static6.anInt5177 = Mouse.clickX;
			Static7.anInt6008 = 2;
			Static4.anInt3275 = Mouse.clickY;
			Protocol.outboundBuffer.writeOpcode(227);
			Protocol.outboundBuffer.writeShort(local15 + Static5.originX);
			Protocol.outboundBuffer.writeByte(Keyboard.pressedKeys[82] ? 1 : 0);
			Protocol.outboundBuffer.writeShort(Static7.originZ + local19);
			Protocol.outboundBuffer.writeShortLEA(local24);
			PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, 0, 0, 0, 0);
		}
		if (action == 21) {
			@Pc(346) Player player = PlayerList.players[local24];
			if (player != null) {
				Static4.anInt3275 = Mouse.clickY;
				Static6.anInt5177 = Mouse.clickX;
				Static7.anInt6008 = 2;
				Static2.anInt1629 = 0;
				Protocol.outboundBuffer.writeOpcode(123);
				Protocol.outboundBuffer.writeShortLEA(local24);
				Protocol.outboundBuffer.writeInt(Static5.anInt4302);
				Protocol.outboundBuffer.writeShortA(Static1.anInt314);
				Protocol.outboundBuffer.writeByteS(Keyboard.pressedKeys[82] ? 1 : 0);
				Protocol.outboundBuffer.writeShortLEA(Static1.anInt243);
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, player.getSize(), player.getSize(), 0, 0);
			}
		}
		if (action == 1004) {
			Static4.anInt3275 = Mouse.clickY;
			Static6.anInt5177 = Mouse.clickX;
			Static2.anInt1629 = 0;
			Static7.anInt6008 = 2;
			Protocol.outboundBuffer.writeOpcode(72);
			Protocol.outboundBuffer.writeShort(local24);
		}
		if (action == 19) {
			if (local24 == 0) {
				Static2.anInt1767 = 1;
				Static27.method3186(Player.level, local15, local19);
			} else if (local24 == 1) {
				Protocol.outboundBuffer.writeOpcode(204);
				Protocol.outboundBuffer.writeShortA(local19 + Static7.originZ);
				Protocol.outboundBuffer.writeShortA(Static2.anInt1367);
				Protocol.outboundBuffer.writeIntAlt3(Static1.anInt1053);
				Protocol.outboundBuffer.writeShortLE2(local15 + Static5.originX);
			}
		}
		if (action == 28) {
			Static4.anInt3275 = Mouse.clickY;
			Static7.anInt6008 = 2;
			Static6.anInt5177 = Mouse.clickX;
			Static2.anInt1629 = 0;
			Protocol.outboundBuffer.writeOpcode(119);
			Protocol.outboundBuffer.writeIntAlt3(Static5.anInt4302);
			Protocol.outboundBuffer.writeShort(Static7.originZ + local19);
			Protocol.outboundBuffer.writeShortA(Static1.anInt243);
			Protocol.outboundBuffer.writeShortLE2(Static1.anInt314);
			Protocol.outboundBuffer.writeShortLEA(local24);
			Protocol.outboundBuffer.writeShortLE2(Static5.originX + local15);
			Protocol.outboundBuffer.writeByteS(Keyboard.pressedKeys[82] ? 1 : 0);
			PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, 0, 0, 0, 0);
		}
		if (action == 36) {
			@Pc(582) Npc local582 = NpcList.npcs[local24];
			if (local582 != null) {
				Static7.anInt6008 = 2;
				Static2.anInt1629 = 0;
				Static6.anInt5177 = Mouse.clickX;
				Static4.anInt3275 = Mouse.clickY;
				Protocol.outboundBuffer.writeOpcode(37);
				Protocol.outboundBuffer.writeByte(Keyboard.pressedKeys[82] ? 1 : 0);
				Protocol.outboundBuffer.writeShortLEA(local24);
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, local582.getSize(), local582.getSize(), 0, 0);
			}
		}
		if (action == 12) {
			@Pc(649) Player player = PlayerList.players[local24];
			if (player != null) {
				Static7.anInt6008 = 2;
				Static6.anInt5177 = Mouse.clickX;
				Static2.anInt1629 = 0;
				Static4.anInt3275 = Mouse.clickY;
				Protocol.outboundBuffer.writeOpcode(4);
				Protocol.outboundBuffer.writeByte(Keyboard.pressedKeys[82] ? 1 : 0);
				Protocol.outboundBuffer.writeShortA(local24);
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, player.getSize(), player.getSize(), 0, 0);
			}
		}
		if (action == 10) {
			Protocol.outboundBuffer.writeOpcode(102);
			Protocol.outboundBuffer.writeInt(local19);
			Protocol.outboundBuffer.writeShortA(local15);
			Protocol.outboundBuffer.writeShort(local24);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = InterfaceList.getComponent(local19);
			Static5.anInt3884 = local15;
		}
		if (action == 25) {
			@Pc(744) Npc npc = NpcList.npcs[local24];
			if (npc != null) {
				Static2.anInt1629 = 0;
				Static4.anInt3275 = Mouse.clickY;
				Static7.anInt6008 = 2;
				Static6.anInt5177 = Mouse.clickX;
				Protocol.outboundBuffer.writeOpcode(33);
				Protocol.outboundBuffer.writeShortLEA(local24);
				Protocol.outboundBuffer.writeByteA(Keyboard.pressedKeys[82] ? 1 : 0);
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, npc.getSize(), npc.getSize(), 0, 0);
			}
		}
		if (action == 1007) {
			Static6.anInt5177 = Mouse.clickX;
			Static2.anInt1629 = 0;
			Static4.anInt3275 = Mouse.clickY;
			Static7.anInt6008 = 2;
			Protocol.outboundBuffer.writeOpcode(176);
			Protocol.outboundBuffer.writeShort(local24);
		}
		if (action == 4) {
			Static7.anInt6008 = 2;
			Static4.anInt3275 = Mouse.clickY;
			Static2.anInt1629 = 0;
			Static6.anInt5177 = Mouse.clickX;
			Protocol.outboundBuffer.writeOpcode(89);
			Protocol.outboundBuffer.writeShort((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Protocol.outboundBuffer.writeByteC(Keyboard.pressedKeys[82] ? 1 : 0);
			Protocol.outboundBuffer.writeShortLEA(Static5.originX + local15);
			Protocol.outboundBuffer.writeShortLE2(Static2.anInt1367);
			Protocol.outboundBuffer.writeShort(Static7.originZ + local19);
			Protocol.outboundBuffer.writeIntAlt3(Static1.anInt1053);
			Static13.method1004(local19, local32, local15);
		}
		if (action == 6) {
			Static6.anInt5177 = Mouse.clickX;
			Static2.anInt1629 = 0;
			Static7.anInt6008 = 2;
			Static4.anInt3275 = Mouse.clickY;
			Protocol.outboundBuffer.writeOpcode(232);
			Protocol.outboundBuffer.writeShortLE2(local19 + Static7.originZ);
			Protocol.outboundBuffer.writeShortLEA(local24);
			Protocol.outboundBuffer.writeByteA(Keyboard.pressedKeys[82] ? 1 : 0);
			Protocol.outboundBuffer.writeShortLE2(local15 + Static5.originX);
			PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, 0, 0, 0, 0);
		}
		if (action == 42) {
			@Pc(969) Npc npc = NpcList.npcs[local24];
			if (npc != null) {
				Static2.anInt1629 = 0;
				Static6.anInt5177 = Mouse.clickX;
				Static4.anInt3275 = Mouse.clickY;
				Static7.anInt6008 = 2;
				Protocol.outboundBuffer.writeOpcode(155);
				Protocol.outboundBuffer.writeShortA(local24);
				Protocol.outboundBuffer.writeByteC(Keyboard.pressedKeys[82] ? 1 : 0);
				Protocol.outboundBuffer.writeShort(Static2.anInt1367);
				Protocol.outboundBuffer.writeIntAlt3(Static1.anInt1053);
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, npc.getSize(), npc.getSize(), 0, 0);
			}
		}
		if (action == 31) {
			@Pc(1044) Player player = PlayerList.players[local24];
			if (player != null) {
				Static4.anInt3275 = Mouse.clickY;
				Static2.anInt1629 = 0;
				Static6.anInt5177 = Mouse.clickX;
				Static7.anInt6008 = 2;
				Protocol.outboundBuffer.writeOpcode(105);
				Protocol.outboundBuffer.writeShort(local24);
				Protocol.outboundBuffer.writeByte(Keyboard.pressedKeys[82] ? 1 : 0);
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, player.getSize(), player.getSize(), 0, 0);
			}
		}
		if (action == 47) {
			if (local24 == 0) {
				Static6.anInt4946 = 1;
				Static27.method3186(Player.level, local15, local19);
			} else if (LoginManager.staffModLevel > 0 && Keyboard.pressedKeys[82] && Keyboard.pressedKeys[81]) {
				Static24.method2945(Static5.originX + local15, Static7.originZ + local19, Player.level);
			} else {
				Protocol.outboundBuffer.writeOpcode(85);
				Protocol.outboundBuffer.writeShortLEA(Static5.originX + local15);
				Protocol.outboundBuffer.writeShortLE2(Static7.originZ + local19);
			}
		}
		if (action == 59) {
			@Pc(1170) Npc npc = NpcList.npcs[local24];
			if (npc != null) {
				Static4.anInt3275 = Mouse.clickY;
				Static6.anInt5177 = Mouse.clickX;
				Static2.anInt1629 = 0;
				Static7.anInt6008 = 2;
				Protocol.outboundBuffer.writeOpcode(53);
				Protocol.outboundBuffer.writeShortLEA(local24);
				Protocol.outboundBuffer.writeByteS(Keyboard.pressedKeys[82] ? 1 : 0);
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, npc.getSize(), npc.getSize(), 0, 0);
			}
		}
		if (action == 51) {
			Protocol.outboundBuffer.writeOpcode(88);
			Protocol.outboundBuffer.writeShortLEA(local24);
			Protocol.outboundBuffer.writeIntAlt3Reverse(local19);
			Protocol.outboundBuffer.writeShortLEA(local15);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = InterfaceList.getComponent(local19);
			Static5.anInt3884 = local15;
		}
		if (action == 13) {
			Protocol.outboundBuffer.writeOpcode(242);
			Protocol.outboundBuffer.writeShortLEA(local15);
			Protocol.outboundBuffer.writeShortLEA(local24);
			Protocol.outboundBuffer.writeIntAlt3Reverse(local19);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = InterfaceList.getComponent(local19);
			Static5.anInt3884 = local15;
		}
		if (action == 3 && Static6.aClass185_14 == null) {
			Static37.method4736(local15, local19);
			Static6.aClass185_14 = InterfaceList.getCreatedComponent(local19, local15);
			Static28.method3270(Static6.aClass185_14);
		}
		if (action == 1) {
			Protocol.outboundBuffer.writeOpcode(40);
			Protocol.outboundBuffer.writeIntAlt3Reverse(local19);
			Protocol.outboundBuffer.writeShort(Static2.anInt1367);
			Protocol.outboundBuffer.writeShortLE2(local15);
			Protocol.outboundBuffer.writeInt(Static1.anInt1053);
		}
		if (action == 29) {
			@Pc(1354) Player player = PlayerList.players[local24];
			if (player != null) {
				Static2.anInt1629 = 0;
				Static4.anInt3275 = Mouse.clickY;
				Static6.anInt5177 = Mouse.clickX;
				Static7.anInt6008 = 2;
				Protocol.outboundBuffer.writeOpcode(148);
				Protocol.outboundBuffer.writeShortA(local24);
				Protocol.outboundBuffer.writeByteA(Keyboard.pressedKeys[82] ? 1 : 0);
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, player.getSize(), player.getSize(), 0, 0);
			}
		}
		if (action == 11) {
			Protocol.outboundBuffer.writeOpcode(158);
			Protocol.outboundBuffer.writeInt(local19);
			@Pc(1434) Component component = InterfaceList.getComponent(local19);
			if (component.cs1Scripts != null && component.cs1Scripts[0][0] == 5) {
				@Pc(1452) int local1452 = component.cs1Scripts[0][1];
				if (component.cs1ComparisonOperands[0] != VarpDomain.varps[local1452]) {
					VarpDomain.varps[local1452] = component.cs1ComparisonOperands[0];
					Static29.method3534(local1452);
				}
			}
		}
		if (action == 32) {
			Static6.anInt5177 = Mouse.clickX;
			Static7.anInt6008 = 2;
			Static2.anInt1629 = 0;
			Static4.anInt3275 = Mouse.clickY;
			Protocol.outboundBuffer.writeOpcode(159);
			Protocol.outboundBuffer.writeShortLEA(local15 + Static5.originX);
			Protocol.outboundBuffer.writeShort(Static7.originZ + local19);
			Protocol.outboundBuffer.writeByte(Keyboard.pressedKeys[82] ? 1 : 0);
			Protocol.outboundBuffer.writeShortLEA((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static13.method1004(local19, local32, local15);
		}
		if (action == 39) {
			@Pc(1545) Npc npc = NpcList.npcs[local24];
			if (npc != null) {
				Static6.anInt5177 = Mouse.clickX;
				Static4.anInt3275 = Mouse.clickY;
				Static2.anInt1629 = 0;
				Static7.anInt6008 = 2;
				Protocol.outboundBuffer.writeOpcode(245);
				Protocol.outboundBuffer.writeShort(local24);
				Protocol.outboundBuffer.writeByteS(Keyboard.pressedKeys[82] ? 1 : 0);
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, npc.getSize(), npc.getSize(), 0, 0);
			}
		}
		if (action == 15) {
			Protocol.outboundBuffer.writeOpcode(58);
			Protocol.outboundBuffer.writeShort(local24);
			Protocol.outboundBuffer.writeIntAlt3(local19);
			Protocol.outboundBuffer.writeShort(Static1.anInt314);
			Protocol.outboundBuffer.writeShort(local15);
			Protocol.outboundBuffer.writeShortA(Static1.anInt243);
			Protocol.outboundBuffer.writeIntAlt3(Static5.anInt4302);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = InterfaceList.getComponent(local19);
			Static5.anInt3884 = local15;
		}
		if (action == 57) {
			@Pc(1660) Component component = InterfaceList.getComponent(local19);
			@Pc(1662) boolean local1662 = true;
			if (component.anInt5904 > 0) {
				local1662 = Static36.method4402(component);
			}
			if (local1662) {
				Protocol.outboundBuffer.writeOpcode(158);
				Protocol.outboundBuffer.writeInt(local19);
			}
		}
		if (action == 30) {
			Protocol.outboundBuffer.writeOpcode(81);
			Protocol.outboundBuffer.writeShortLE2(local15);
			Protocol.outboundBuffer.writeShortLEA(local24);
			Protocol.outboundBuffer.writeIntLE2(local19);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = InterfaceList.getComponent(local19);
			Static5.anInt3884 = local15;
		}
		if (action == 14) {
			@Pc(1728) Player player = PlayerList.players[local24];
			if (player != null) {
				Static7.anInt6008 = 2;
				Static4.anInt3275 = Mouse.clickY;
				Static2.anInt1629 = 0;
				Static6.anInt5177 = Mouse.clickX;
				Protocol.outboundBuffer.writeOpcode(77);
				Protocol.outboundBuffer.writeShortLE2(local24);
				Protocol.outboundBuffer.writeByteS(Keyboard.pressedKeys[82] ? 1 : 0);
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, player.getSize(), player.getSize(), 0, 0);
			}
		}
		if (action == 26) {
			if (local24 == 0) {
				Static27.method3186(Player.level, local15, local19);
			} else if (local24 == 1) {
				if (LoginManager.staffModLevel > 0 && Keyboard.pressedKeys[82] && Keyboard.pressedKeys[81]) {
					Static24.method2945(local15 + Static5.originX, local19 + Static7.originZ, Player.level);
				} else {
					Static37.method4661(local15, 1, local19);
					Protocol.outboundBuffer.writeByte(Static2.anInt1941);
					Protocol.outboundBuffer.writeByte(Static7.anInt5798);
					Protocol.outboundBuffer.writeShort((int) Static5.aFloat97);
					Protocol.outboundBuffer.writeByte(57);
					Protocol.outboundBuffer.writeByte(Static6.anInt3585);
					Protocol.outboundBuffer.writeByte(Static6.anInt4761);
					Protocol.outboundBuffer.writeByte(89);
					Protocol.outboundBuffer.writeShort(PlayerList.self.xFine);
					Protocol.outboundBuffer.writeShort(PlayerList.self.zFine);
					Protocol.outboundBuffer.writeByte(Static2.anInt946);
					Protocol.outboundBuffer.writeByte(63);
					PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, 0, 0, 0, 0);
				}
			}
		}
		if (action == 9) {
			Static26.method4812();
			@Pc(1913) Component component = InterfaceList.getComponent(local19);
			Static1.anInt314 = local15;
			Static2.anInt1334 = 1;
			Static5.anInt4302 = local19;
			Static1.anInt243 = local24;
			Static28.method3270(component);
			Static7.aString365 = "<col=ff9040>" + ObjTypeList.get(local24).name + "<col=ffffff>";
			if (Static7.aString365 == null) {
				Static7.aString365 = "null";
			}
			return;
		}
		if (action == 1012 || action == 1002 || action == 1008 || action == 1003 || action == 1011) {
			Static13.method1007(local24, action, local15);
		}
		if (action == 48) {
			Static6.anInt5177 = Mouse.clickX;
			Static7.anInt6008 = 2;
			Static2.anInt1629 = 0;
			Static4.anInt3275 = Mouse.clickY;
			Protocol.outboundBuffer.writeOpcode(28);
			Protocol.outboundBuffer.writeShortLEA(local19 + Static7.originZ);
			Protocol.outboundBuffer.writeInt(Static1.anInt1053);
			Protocol.outboundBuffer.writeShortLE2(Static2.anInt1367);
			Protocol.outboundBuffer.writeShort(local24);
			Protocol.outboundBuffer.writeShortLE2(local15 + Static5.originX);
			Protocol.outboundBuffer.writeByteS(Keyboard.pressedKeys[82] ? 1 : 0);
			PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, 0, 0, 0, 0);
		}
		if (action == 5) {
			@Pc(2053) Player player = PlayerList.players[local24];
			if (player != null) {
				Static7.anInt6008 = 2;
				Static6.anInt5177 = Mouse.clickX;
				Static4.anInt3275 = Mouse.clickY;
				Static2.anInt1629 = 0;
				Protocol.outboundBuffer.writeOpcode(224);
				Protocol.outboundBuffer.writeShortA(local24);
				Protocol.outboundBuffer.writeShort(Static2.anInt1367);
				Protocol.outboundBuffer.writeIntLE2(Static1.anInt1053);
				Protocol.outboundBuffer.writeByteS(Keyboard.pressedKeys[82] ? 1 : 0);
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, player.getSize(), player.getSize(), 0, 0);
			}
		}
		if (action == 37) {
			Static2.anInt1629 = 0;
			Static7.anInt6008 = 2;
			Static4.anInt3275 = Mouse.clickY;
			Static6.anInt5177 = Mouse.clickX;
			Protocol.outboundBuffer.writeOpcode(48);
			Protocol.outboundBuffer.writeShort(Static5.originX + local15);
			Protocol.outboundBuffer.writeShortA((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Protocol.outboundBuffer.writeByteS(Keyboard.pressedKeys[82] ? 1 : 0);
			Protocol.outboundBuffer.writeShort(Static7.originZ + local19);
			Static13.method1004(local19, local32, local15);
		}
		if (action == 34) {
			@Pc(2187) Component component = InterfaceList.getCreatedComponent(local19, local15);
			if (component != null) {
				Static26.method4812();
				@Pc(2195) ServerActiveProperties local2195 = InterfaceList.getServerActiveProperties(component);
				Static21.method2081(local2195.getTargetMask(), local2195.targetParam, component.anInt5890, local15, component.anInt5930, local19);
				Static2.anInt1334 = 0;
				Static4.aString140 = Static12.method780(component);
				if (Static4.aString140 == null) {
					Static4.aString140 = "Null";
				}
				if (component.if3) {
					Static2.aString81 = component.opBase + "<col=ffffff>";
				} else {
					Static2.aString81 = "<col=00ff00>" + component.aString353 + "<col=ffffff>";
				}
			}
			return;
		}
		if (action == 49) {
			Protocol.outboundBuffer.writeOpcode(145);
			Protocol.outboundBuffer.writeShortA(local15);
			Protocol.outboundBuffer.writeIntAlt3(local19);
			Protocol.outboundBuffer.writeShortA(local24);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = InterfaceList.getComponent(local19);
			Static5.anInt3884 = local15;
		}
		if (action == 58) {
			Protocol.outboundBuffer.writeOpcode(214);
			Protocol.outboundBuffer.writeShortLEA(local15);
			Protocol.outboundBuffer.writeShortA(local24);
			Protocol.outboundBuffer.writeInt(local19);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = InterfaceList.getComponent(local19);
			Static5.anInt3884 = local15;
		}
		if (action == 8) {
			@Pc(2321) Npc npc = NpcList.npcs[local24];
			if (npc != null) {
				Static6.anInt5177 = Mouse.clickX;
				Static7.anInt6008 = 2;
				Static2.anInt1629 = 0;
				Static4.anInt3275 = Mouse.clickY;
				Protocol.outboundBuffer.writeOpcode(12);
				Protocol.outboundBuffer.writeShortLE2(local24);
				Protocol.outboundBuffer.writeByte(Keyboard.pressedKeys[82] ? 1 : 0);
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, npc.getSize(), npc.getSize(), 0, 0);
			}
		}
		if (action == 35) {
			Protocol.outboundBuffer.writeOpcode(103);
			Protocol.outboundBuffer.writeIntAlt3Reverse(local19);
			Protocol.outboundBuffer.writeShortLE2(local15);
			Protocol.outboundBuffer.writeShort(local24);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = InterfaceList.getComponent(local19);
			Static5.anInt3884 = local15;
		}
		if (action == 43) {
			@Pc(2423) Player player = PlayerList.players[local24];
			if (player != null) {
				Static4.anInt3275 = Mouse.clickY;
				Static6.anInt5177 = Mouse.clickX;
				Static2.anInt1629 = 0;
				Static7.anInt6008 = 2;
				Protocol.outboundBuffer.writeOpcode(212);
				Protocol.outboundBuffer.writeShortA(local24);
				Protocol.outboundBuffer.writeByteA(Keyboard.pressedKeys[82] ? 1 : 0);
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, player.getSize(), player.getSize(), 0, 0);
			}
		}
		if (action == 16) {
			Static4.anInt3275 = Mouse.clickY;
			Static7.anInt6008 = 2;
			Static6.anInt5177 = Mouse.clickX;
			Static2.anInt1629 = 0;
			Protocol.outboundBuffer.writeOpcode(116);
			Protocol.outboundBuffer.writeShort(Static1.anInt314);
			Protocol.outboundBuffer.writeShortLEA(local15 + Static5.originX);
			Protocol.outboundBuffer.writeShortLEA((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Protocol.outboundBuffer.writeIntLE2(Static5.anInt4302);
			Protocol.outboundBuffer.writeByteC(Keyboard.pressedKeys[82] ? 1 : 0);
			Protocol.outboundBuffer.writeShortLE2(Static7.originZ + local19);
			Protocol.outboundBuffer.writeShortLE2(Static1.anInt243);
			Static13.method1004(local19, local32, local15);
		}
		if (action == 44) {
			Static4.anInt3275 = Mouse.clickY;
			Static6.anInt5177 = Mouse.clickX;
			Static2.anInt1629 = 0;
			Static7.anInt6008 = 2;
			Protocol.outboundBuffer.writeOpcode(3);
			Protocol.outboundBuffer.writeByteC(Keyboard.pressedKeys[82] ? 1 : 0);
			Protocol.outboundBuffer.writeShortLE2(Static7.originZ + local19);
			Protocol.outboundBuffer.writeShortLE2(local24);
			Protocol.outboundBuffer.writeShortA(local15 + Static5.originX);
			PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, 0, 0, 0, 0);
		}
		if (action == 23 || action == 1009) {
			Static37.method4752(local19, local15, local24, opBases[i]);
		}
		if (action == 1010) {
			Static2.anInt1629 = 0;
			Static7.anInt6008 = 2;
			Static4.anInt3275 = Mouse.clickY;
			Static6.anInt5177 = Mouse.clickX;
			@Pc(2659) Npc npc = NpcList.npcs[local24];
			if (npc != null) {
				@Pc(2665) NpcType type = npc.type;
				if (type.multiNpcs != null) {
					type = type.getMultiNpc();
				}
				if (type != null) {
					Protocol.outboundBuffer.writeOpcode(65);
					Protocol.outboundBuffer.writeShortLE2(type.id);
				}
			}
		}
		if (action == 7) {
			Static21.method2063();
		}
		if (action == 1005) {
			Static4.anInt3275 = Mouse.clickY;
			Static7.anInt6008 = 2;
			Static6.anInt5177 = Mouse.clickX;
			Static2.anInt1629 = 0;
			Protocol.outboundBuffer.writeOpcode(60);
			Protocol.outboundBuffer.writeShortA(local19 + Static7.originZ);
			Protocol.outboundBuffer.writeShortLE2((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Protocol.outboundBuffer.writeByte(Keyboard.pressedKeys[82] ? 1 : 0);
			Protocol.outboundBuffer.writeShortLE2(Static5.originX + local15);
			Static13.method1004(local19, local32, local15);
		}
		if (action == 41) {
			Static7.anInt6008 = 2;
			Static2.anInt1629 = 0;
			Static6.anInt5177 = Mouse.clickX;
			Static4.anInt3275 = Mouse.clickY;
			Protocol.outboundBuffer.writeOpcode(92);
			Protocol.outboundBuffer.writeByteS(Keyboard.pressedKeys[82] ? 1 : 0);
			Protocol.outboundBuffer.writeShortLE2((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Protocol.outboundBuffer.writeShortA(local15 + Static5.originX);
			Protocol.outboundBuffer.writeShortA(local19 + Static7.originZ);
			Static13.method1004(local19, local32, local15);
		}
		if (action == 50) {
			Protocol.outboundBuffer.writeOpcode(177);
			Protocol.outboundBuffer.writeIntAlt3Reverse(local19);
			Protocol.outboundBuffer.writeShort(local24);
			Protocol.outboundBuffer.writeIntLE2(Static1.anInt1053);
			Protocol.outboundBuffer.writeShortLE2(local15);
			Protocol.outboundBuffer.writeShortLE2(Static2.anInt1367);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = InterfaceList.getComponent(local19);
			Static5.anInt3884 = local15;
		}
		if (action == 20) {
			Protocol.outboundBuffer.writeOpcode(124);
			Protocol.outboundBuffer.writeShortLEA(local15);
			Protocol.outboundBuffer.writeShortLEA(local24);
			Protocol.outboundBuffer.writeIntLE2(local19);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = InterfaceList.getComponent(local19);
			Static5.anInt3884 = local15;
		}
		if (action == 2) {
			Protocol.outboundBuffer.writeOpcode(205);
			Protocol.outboundBuffer.writeIntAlt3Reverse(local19);
			Protocol.outboundBuffer.writeShortLE2(local15);
			Protocol.outboundBuffer.writeShortA(local24);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = InterfaceList.getComponent(local19);
			Static5.anInt3884 = local15;
		}
		if (action == 45) {
			Static7.anInt6008 = 2;
			Static6.anInt5177 = Mouse.clickX;
			Static4.anInt3275 = Mouse.clickY;
			Static2.anInt1629 = 0;
			Protocol.outboundBuffer.writeOpcode(54);
			Protocol.outboundBuffer.writeByte(Keyboard.pressedKeys[82] ? 1 : 0);
			Protocol.outboundBuffer.writeShortLE2(Static7.originZ + local19);
			Protocol.outboundBuffer.writeShort(local24);
			Protocol.outboundBuffer.writeShort(local15 + Static5.originX);
			PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, 0, 0, 0, 0);
		}
		if (action == 22) {
			@Pc(3012) Player player = PlayerList.players[local24];
			if (player != null) {
				Static4.anInt3275 = Mouse.clickY;
				Static7.anInt6008 = 2;
				Static6.anInt5177 = Mouse.clickX;
				Static2.anInt1629 = 0;
				Protocol.outboundBuffer.writeOpcode(96);
				Protocol.outboundBuffer.writeByteA(Keyboard.pressedKeys[82] ? 1 : 0);
				Protocol.outboundBuffer.writeShort(local24);
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, player.getSize(), player.getSize(), 0, 0);
			}
		}
		if (action == 60) {
			@Pc(3080) Player player = PlayerList.players[local24];
			if (player != null) {
				Static7.anInt6008 = 2;
				Static2.anInt1629 = 0;
				Static6.anInt5177 = Mouse.clickX;
				Static4.anInt3275 = Mouse.clickY;
				Protocol.outboundBuffer.writeOpcode(223);
				Protocol.outboundBuffer.writeByte(Keyboard.pressedKeys[82] ? 1 : 0);
				Protocol.outboundBuffer.writeShortLEA(local24);
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, player.getSize(), player.getSize(), 0, 0);
			}
		}
		if (action == 1001) {
			@Pc(3148) Component component = InterfaceList.getComponent(local19);
			if (component == null || component.objCounts[local15] < 100000) {
				Protocol.outboundBuffer.writeOpcode(72);
				Protocol.outboundBuffer.writeShort(local24);
			} else {
				Chat.add(0, "", component.objCounts[local15] + " x " + ObjTypeList.get(local24).name);
			}
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = InterfaceList.getComponent(local19);
			Static5.anInt3884 = local15;
		}
		if (action == 18) {
			Protocol.outboundBuffer.writeOpcode(158);
			Protocol.outboundBuffer.writeInt(local19);
			@Pc(3216) Component component = InterfaceList.getComponent(local19);
			if (component.cs1Scripts != null && component.cs1Scripts[0][0] == 5) {
				@Pc(3240) int local3240 = component.cs1Scripts[0][1];
				VarpDomain.varps[local3240] = 1 - VarpDomain.varps[local3240];
				Static29.method3534(local3240);
			}
		}
		if (action == 38) {
			Static2.anInt1629 = 0;
			Static7.anInt6008 = 2;
			Static4.anInt3275 = Mouse.clickY;
			Static6.anInt5177 = Mouse.clickX;
			Protocol.outboundBuffer.writeOpcode(8);
			Protocol.outboundBuffer.writeShortLEA(local24);
			Protocol.outboundBuffer.writeShort(local19 + Static7.originZ);
			Protocol.outboundBuffer.writeShort(Static5.originX + local15);
			Protocol.outboundBuffer.writeByteA(Keyboard.pressedKeys[82] ? 1 : 0);
			PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, 0, 0, 0, 0);
		}
		if (Static2.anInt1334 != 0) {
			Static2.anInt1334 = 0;
			Static28.method3270(InterfaceList.getComponent(Static5.anInt4302));
		}
		if (Static3.aBoolean177) {
			Static26.method4812();
		}
		if (Static1.aClass185_3 != null && Static2.anInt2246 == 0) {
			Static28.method3270(Static1.aClass185_3);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!ua;IIII)V")
	private static void addNpcEntries(@OriginalArg(3) int id, @OriginalArg(0) NpcType type, @OriginalArg(4) int x, @OriginalArg(2) int z) {
		if (size >= 400) {
			return;
		}
		if (type.multiNpcs != null) {
			type = type.getMultiNpc();
		}
		if (type == null || !type.aBoolean357) {
			return;
		}
		@Pc(38) String nameWithLevel = type.name;
		if (type.combatLevel != 0) {
			@Pc(51) String levelPrefix = client.game == 1 ? LocalisedText.RATING : LocalisedText.LEVEL;
			nameWithLevel = nameWithLevel + Static20.getCombatLevelColor(PlayerList.self.combatLevel, type.combatLevel) + " (" + levelPrefix + type.combatLevel + ")";
		}
		if (Static2.anInt1334 == 1) {
			add(id, x, z, Static7.aString365 + " -> <col=ffff00>" + nameWithLevel, LocalisedText.USE, (short) 33, Static2.anInt1937);
		} else if (Static3.aBoolean177) {
			@Pc(88) ParamType param = Static5.anInt4224 == -1 ? null : ParamTypeList.get(Static5.anInt4224);
			if ((Static5.anInt3560 & 0x2) != 0 && (param == null || type.getParam(Static5.anInt4224, param.defaultInt) != param.defaultInt)) {
				add(id, x, z, Static2.aString81 + " -> <col=ffff00>" + nameWithLevel, Static4.aString140, (short) 42, Static6.anInt4466);
			}
		} else {
			@Pc(134) String[] ops = type.ops;
			if (Static5.aBoolean254) {
				ops = Static35.method4300(ops);
			}
			if (ops != null) {
				for (@Pc(145) int i = 4; i >= 0; i--) {
					if (ops[i] != null && (client.game != 0 || !ops[i].equalsIgnoreCase(LocalisedText.ATTACK))) {
						@Pc(167) byte action = 0;
						@Pc(169) int cursor = -1;
						if (i == type.cursor1Op) {
							cursor = type.cursor1;
						}
						if (type.cursor2Op == i) {
							cursor = type.cursor2;
						}
						if (i == 0) {
							action = 39;
						}
						if (i == 1) {
							action = 8;
						}
						if (i == 2) {
							action = 36;
						}
						if (i == 3) {
							action = 25;
						}
						if (i == 4) {
							action = 59;
						}
						add(id, x, z, "<col=ffff00>" + nameWithLevel, ops[i], action, cursor);
					}
				}
			}
			if (client.game == 0 && ops != null) {
				for (@Pc(249) int i = 4; i >= 0; i--) {
					if (ops[i] != null && ops[i].equalsIgnoreCase(LocalisedText.ATTACK)) {
						@Pc(271) short priority = 0;
						if (PlayerList.self.combatLevel < type.combatLevel) {
							priority = 2000;
						}
						@Pc(281) short action = 0;
						if (i == 0) {
							action = 39;
						}
						if (i == 1) {
							action = 8;
						}
						if (i == 2) {
							action = 36;
						}
						if (i == 3) {
							action = 25;
						}
						if (i == 4) {
							action = 59;
						}
						if (action != 0) {
							action += priority;
						}
						add(id, x, z, "<col=ffff00>" + nameWithLevel, ops[i], action, type.anInt5241);
					}
				}
			}
			add(id, x, z, "<col=ffff00>" + nameWithLevel, LocalisedText.EXAMINE, (short) 1010, Static3.anInt2232);
		}
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)I")
	public static int getCursor() {
		return Static2.shiftClick && Keyboard.pressedKeys[81] && size > 2 ? cursors[size - 2] : cursors[size - 1];
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!wf;III)V")
	public static void addComponentEntries(@OriginalArg(0) Component component, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (component.anInt5912 == 1) {
			add(0L, 0, component.id, "", component.aString349, (short) 57, -1);
		}
		if (component.anInt5912 == 2 && !Static3.aBoolean177) {
			@Pc(35) String local35 = Static12.method780(component);
			if (local35 != null) {
				add(0L, -1, component.id, "<col=00ff00>" + component.aString353, local35, (short) 34, -1);
			}
		}
		if (component.anInt5912 == 3) {
			add(0L, 0, component.id, "", LocalisedText.CLOSE, (short) 7, -1);
		}
		if (component.anInt5912 == 4) {
			add(0L, 0, component.id, "", component.aString349, (short) 18, -1);
		}
		if (component.anInt5912 == 5) {
			add(0L, 0, component.id, "", component.aString349, (short) 11, -1);
		}
		if (component.anInt5912 == 6 && Static6.aClass185_14 == null) {
			add(0L, -1, component.id, "", component.aString349, (short) 3, -1);
		}
		if (component.type == 2) {
			@Pc(160) int local160 = 0;
			for (@Pc(162) int local162 = 0; local162 < component.baseHeight; local162++) {
				for (@Pc(172) int local172 = 0; local172 < component.baseWidth; local172++) {
					@Pc(187) int local187 = local172 * (component.anInt5943 + 32);
					@Pc(195) int local195 = local162 * (component.anInt5964 + 32);
					if (local160 < 20) {
						local195 += component.anIntArray663[local160];
						local187 += component.anIntArray664[local160];
					}
					if (arg2 >= local187 && arg1 >= local195 && local187 + 32 > arg2 && arg1 < local195 + 32) {
						Static4.anInt2989 = local160;
						Static6.aClass185_13 = component;
						if (component.objTypes[local160] > 0) {
							@Pc(257) ServerActiveProperties properties = InterfaceList.getServerActiveProperties(component);
							@Pc(266) ObjType objType = ObjTypeList.get(component.objTypes[local160] - 1);
							if (Static2.anInt1334 == 1 && properties.isObjOpsEnabled()) {
								if (Static5.anInt4302 != component.id || Static1.anInt314 != local160) {
									add((long) objType.id, local160, component.id, Static7.aString365 + " -> <col=ff9040>" + objType.name, LocalisedText.USE, (short) 15, -1);
								}
							} else if (Static3.aBoolean177 && properties.isObjOpsEnabled()) {
								@Pc(290) ParamType param = Static5.anInt4224 == -1 ? null : ParamTypeList.get(Static5.anInt4224);
								if ((Static5.anInt3560 & 0x10) != 0 && (param == null || objType.getParam(Static5.anInt4224, param.defaultInt) != param.defaultInt)) {
									add((long) objType.id, local160, component.id, Static2.aString81 + " -> <col=ff9040>" + objType.name, Static4.aString140, (short) 50, Static6.anInt4466);
								}
							} else {
								@Pc(340) String[] local340 = objType.inventoryOps;
								if (Static5.aBoolean254) {
									local340 = Static35.method4300(local340);
								}
								if (properties.isObjOpsEnabled()) {
									for (@Pc(353) int local353 = 4; local353 >= 3; local353--) {
										if (local340 != null && local340[local353] != null) {
											@Pc(373) byte local373;
											if (local353 == 3) {
												local373 = 10;
											} else {
												local373 = 51;
											}
											add((long) objType.id, local160, component.id, "<col=ff9040>" + objType.name, local340[local353], local373, -1);
										}
									}
								}
								if (properties.isObjUseEnabled()) {
									add((long) objType.id, local160, component.id, "<col=ff9040>" + objType.name, LocalisedText.USE, (short) 9, Static2.anInt1937);
								}
								if (properties.isObjOpsEnabled() && local340 != null) {
									for (@Pc(444) int local444 = 2; local444 >= 0; local444--) {
										if (local340[local444] != null) {
											@Pc(455) byte local455 = 0;
											if (local444 == 0) {
												local455 = 58;
											}
											if (local444 == 1) {
												local455 = 35;
											}
											if (local444 == 2) {
												local455 = 17;
											}
											add((long) objType.id, local160, component.id, "<col=ff9040>" + objType.name, local340[local444], local455, -1);
										}
									}
								}
								@Pc(505) String[] local505 = component.aStringArray44;
								if (Static5.aBoolean254) {
									local505 = Static35.method4300(local505);
								}
								if (local505 != null) {
									for (@Pc(517) int local517 = 4; local517 >= 0; local517--) {
										if (local505[local517] != null) {
											@Pc(533) byte local533 = 0;
											if (local517 == 0) {
												local533 = 30;
											}
											if (local517 == 1) {
												local533 = 20;
											}
											if (local517 == 2) {
												local533 = 13;
											}
											if (local517 == 3) {
												local533 = 2;
											}
											if (local517 == 4) {
												local533 = 49;
											}
											add((long) objType.id, local160, component.id, "<col=ff9040>" + objType.name, local505[local517], local533, -1);
										}
									}
								}
								add((long) objType.id, local160, component.id, "<col=ff9040>" + objType.name, LocalisedText.EXAMINE, (short) 1001, Static3.anInt2232);
							}
						}
					}
					local160++;
				}
			}
		}
		if (!component.if3) {
			return;
		}
		if (!Static3.aBoolean177) {
			for (@Pc(704) int local704 = 9; local704 >= 5; local704--) {
				@Pc(712) String local712 = Static24.method2597(local704, component);
				if (local712 != null) {
					add((long) (local704 + 1), component.createdComponentId, component.id, component.opBase, local712, (short) 1009, Static32.method3985(component, local704));
				}
			}
			@Pc(745) String local745 = Static12.method780(component);
			if (local745 != null) {
				add(0L, component.createdComponentId, component.id, component.opBase, local745, (short) 34, -1);
			}
			for (@Pc(767) int local767 = 4; local767 >= 0; local767--) {
				@Pc(774) String local774 = Static24.method2597(local767, component);
				if (local774 != null) {
					add((long) (local767 + 1), component.createdComponentId, component.id, component.opBase, local774, (short) 23, Static32.method3985(component, local767));
				}
			}
			if (InterfaceList.getServerActiveProperties(component).isResumePauseButtonEnabled()) {
				if (component.pauseText == null) {
					add(0L, component.createdComponentId, component.id, "", LocalisedText.CONTINUE, (short) 3, -1);
				} else {
					add(0L, component.createdComponentId, component.id, "", component.pauseText, (short) 3, -1);
				}
			}
		} else if (InterfaceList.getServerActiveProperties(component).isUseTarget() && (Static5.anInt3560 & 0x20) != 0) {
			add(0L, component.createdComponentId, component.id, Static2.aString81 + " -> " + component.opBase, Static4.aString140, (short) 1, Static6.anInt4466);
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIILclient!f;I)V")
	private static void addPlayerEntries(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Player player, @OriginalArg(4) int arg3) {
		if (PlayerList.self == player || size >= 400) {
			return;
		}
		@Pc(144) String local144;
		if (player.skillLevel == 0) {
			@Pc(29) boolean local29 = true;
			if (PlayerList.self.anInt1586 != -1 && player.anInt1586 != -1) {
				@Pc(53) int local53 = player.combatLevel >= PlayerList.self.combatLevel ? player.combatLevel : PlayerList.self.combatLevel;
				@Pc(68) int local68 = PlayerList.self.anInt1586 >= player.anInt1586 ? player.anInt1586 : PlayerList.self.anInt1586;
				@Pc(79) int local79 = local53 * 10 / 100 + local68 + 5;
				@Pc(86) int local86 = PlayerList.self.combatLevel - player.combatLevel;
				if (local86 < 0) {
					local86 = -local86;
				}
				if (local79 < local86) {
					local29 = false;
				}
			}
			@Pc(110) String local110 = client.game == 1 ? LocalisedText.RATING : LocalisedText.LEVEL;
			if (player.anInt1576 <= player.combatLevel) {
				local144 = player.getName() + (local29 ? Static20.getCombatLevelColor(PlayerList.self.combatLevel, player.combatLevel) : "<col=ffffff>") + " (" + local110 + player.combatLevel + ")";
			} else {
				local144 = player.getName() + (local29 ? Static20.getCombatLevelColor(PlayerList.self.combatLevel, player.combatLevel) : "<col=ffffff>") + " (" + local110 + player.combatLevel + "+" + (player.anInt1576 - player.combatLevel) + ")";
			}
		} else {
			local144 = player.getName() + " (" + LocalisedText.SKILL + player.skillLevel + ")";
		}
		if (Static2.anInt1334 == 1) {
			add((long) arg1, arg3, arg0, Static7.aString365 + " -> <col=ffffff>" + local144, LocalisedText.USE, (short) 21, Static2.anInt1937);
		} else if (!Static3.aBoolean177) {
			for (@Pc(269) int local269 = 7; local269 >= 0; local269--) {
				if (Player.ops[local269] != null) {
					@Pc(277) short priority = 0;
					if (client.game == 0 && Player.ops[local269].equalsIgnoreCase(LocalisedText.ATTACK)) {
						if (PlayerList.self.combatLevel < player.combatLevel) {
							priority = 2000;
						}
						if (PlayerList.self.team != 0 && player.team != 0) {
							if (player.team == PlayerList.self.team) {
								priority = 2000;
							} else {
								priority = 0;
							}
						}
					} else if (Player.opLowPriority[local269]) {
						priority = 2000;
					}
					@Pc(336) short local336 = Static7.aShortArray122[local269];
					local336 += priority;
					add((long) arg1, arg3, arg0, "<col=ffffff>" + local144, Player.ops[local269], local336, Player.opCursors[local269]);
				}
			}
		} else if ((Static5.anInt3560 & 0x8) != 0) {
			add((long) arg1, arg3, arg0, Static2.aString81 + " -> <col=ffffff>" + local144, Static4.aString140, (short) 5, Static6.anInt4466);
		}
		for (@Pc(367) int local367 = 0; local367 < size; local367++) {
			if (actions[local367] == 26) {
				opBases[local367] = "<col=ffffff>" + local144;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIII)V")
	public static void addEntries(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static2.anInt1334 == 0) {
			@Pc(14) int local14 = Static7.anInt5437;
			@Pc(16) int local16 = Static4.anInt3123;
			@Pc(18) int local18 = Static7.anInt6030;
			@Pc(30) int local30 = (local16 - local14) * (arg1 - arg3) / arg4 + local14;
			@Pc(32) int local32 = Static1.anInt403;
			@Pc(46) int local46 = local18 + (local32 - local18) * (arg5 - arg2) / arg0;
			if (Static3.aBoolean177 && (Static5.anInt3560 & 0x40) != 0) {
				@Pc(85) Component local85 = InterfaceList.getCreatedComponent(Static1.anInt1053, Static2.anInt1367);
				if (local85 == null) {
					Static26.method4812();
				} else {
					add(0L, local30, local46, " ->", Static4.aString140, (short) 19, Static6.anInt4466);
				}
			} else {
				if (client.game == 1) {
					add(0L, local30, local46, "", LocalisedText.FACEHERE, (short) 47, -1);
				}
				add(0L, local30, local46, "", walkHereOp, (short) 26, -1);
			}
		}
		@Pc(103) long prevKey = -1L;
		for (@Pc(105) int i = 0; i < Static7.keysSize; i++) {
			@Pc(112) long key = Static5.keys[i];
			@Pc(117) int x = (int) key & 0x7F;
			@Pc(124) int z = (int) key >> 7 & 0x7F;
			@Pc(131) int id = Integer.MAX_VALUE & (int) (key >>> 32);
			@Pc(138) int keyType = (int) key >> 29 & 0x3;
			if (prevKey != key) {
				prevKey = key;
				if (keyType == 2 && SceneGraph.isLocValid(Player.level, x, z, key)) {
					@Pc(163) LocType type = LocTypeList.get(id);
					if (type.multiLocs != null) {
						type = type.getMultiLoc();
					}
					if (type == null) {
						continue;
					}
					if (Static2.anInt1334 == 1) {
						add(key, x, z, Static7.aString365 + " -> <col=00ffff>" + type.name, LocalisedText.USE, (short) 16, Static2.anInt1937);
					} else if (Static3.aBoolean177) {
						@Pc(215) ParamType param = Static5.anInt4224 == -1 ? null : ParamTypeList.get(Static5.anInt4224);
						if ((Static5.anInt3560 & 0x4) != 0 && (param == null || type.getParam(Static5.anInt4224, param.defaultInt) != param.defaultInt)) {
							add(key, x, z, Static2.aString81 + " -> <col=00ffff>" + type.name, Static4.aString140, (short) 4, Static6.anInt4466);
						}
					} else {
						@Pc(267) String[] ops = type.ops;
						if (Static5.aBoolean254) {
							ops = Static35.method4300(ops);
						}
						if (ops != null) {
							for (@Pc(278) int j = 4; j >= 0; j--) {
								if (ops[j] != null) {
									@Pc(294) short action = 0;
									if (j == 0) {
										action = 41;
									}
									if (j == 1) {
										action = 37;
									}
									if (j == 2) {
										action = 32;
									}
									if (j == 3) {
										action = 40;
									}
									if (j == 4) {
										action = 1005;
									}
									@Pc(327) int cursor = -1;
									if (j == type.cursor1Op) {
										cursor = type.cursor1;
									}
									if (j == type.cursor2Op) {
										cursor = type.cursor2;
									}
									add(key, x, z, "<col=00ffff>" + type.name, ops[j], action, cursor);
								}
							}
						}
						add(type.id, x, z, "<col=00ffff>" + type.name, LocalisedText.EXAMINE, (short) 1007, Static3.anInt2232);
					}
				}
				if (keyType == 1) {
					@Pc(394) Npc npc = NpcList.npcs[id];
					if ((npc.type.size & 0x1) == 0 && (npc.xFine & 0x7F) == 0 && (npc.zFine & 0x7F) == 0 || (npc.type.size & 0x1) == 1 && (npc.xFine & 0x7F) == 64 && (npc.zFine & 0x7F) == 64) {
						@Pc(450) int local450 = npc.xFine - (npc.type.size - 1) * 64;
						@Pc(462) int local462 = npc.zFine + 64 - npc.type.size * 64;
						for (@Pc(464) int j = 0; j < NpcList.size; j++) {
							@Pc(477) Npc other = NpcList.npcs[NpcList.ids[j]];
							if (other != null && !other.aBoolean281 && other != npc && other.aBoolean282) {
								@Pc(501) int local501 = other.xFine - (other.type.size - 1) * 64;
								@Pc(512) int local512 = other.zFine - (other.type.size - 1) * 64;
								if (local501 >= local450 && other.type.size <= npc.type.size - (local501 - local450 >> 7) && local512 >= local462 && npc.type.size - (local512 - local462 >> 7) >= other.type.size) {
									addNpcEntries(NpcList.ids[j], other.type, x, z);
									other.aBoolean281 = true;
								}
							}
						}
						for (@Pc(568) int j = 0; j < PlayerList.size; j++) {
							@Pc(577) Player other = PlayerList.players[PlayerList.ids[j]];
							if (other != null && !other.aBoolean281 && other.aBoolean282) {
								@Pc(597) int local597 = other.xFine - (other.getSize() - 1) * 64;
								@Pc(609) int local609 = other.zFine - (other.getSize() - 1) * 64;
								if (local597 >= local450 && other.getSize() <= npc.type.size - (local597 - local450 >> 7) && local462 <= local609 && other.getSize() <= npc.type.size - (local609 - local462 >> 7)) {
									addPlayerEntries(z, PlayerList.ids[j], other, x);
									other.aBoolean281 = true;
								}
							}
						}
					}
					if (npc.aBoolean281) {
						continue;
					}
					addNpcEntries(id, npc.type, x, z);
					npc.aBoolean281 = true;
				}
				if (keyType == 0) {
					@Pc(682) Player player = PlayerList.players[id];
					if ((player.xFine & 0x7F) == 64 && (player.zFine & 0x7F) == 64) {
						@Pc(709) int local709 = player.xFine - (player.getSize() - 1) * 64;
						@Pc(721) int local721 = player.zFine - (player.getSize() - 1) * 64;
						for (@Pc(723) int j = 0; j < NpcList.size; j++) {
							@Pc(736) Npc other = NpcList.npcs[NpcList.ids[j]];
							if (other != null && !other.aBoolean281 && other.aBoolean282) {
								@Pc(756) int local756 = other.xFine - (other.type.size - 1) * 64;
								@Pc(768) int local768 = other.zFine - (other.type.size - 1) * 64;
								if (local709 <= local756 && other.type.size <= player.getSize() - (local756 - local709 >> 7) && local721 <= local768 && other.type.size <= player.getSize() - (local768 - local721 >> 7)) {
									addNpcEntries(NpcList.ids[j], other.type, x, z);
									other.aBoolean281 = true;
								}
							}
						}
						for (@Pc(827) int j = 0; j < PlayerList.size; j++) {
							@Pc(840) Player other = PlayerList.players[PlayerList.ids[j]];
							if (other != null && !other.aBoolean281 && other != player && other.aBoolean282) {
								@Pc(865) int local865 = other.xFine - (other.getSize() - 1) * 64;
								@Pc(877) int local877 = other.zFine + 64 - other.getSize() * 64;
								if (local865 >= local709 && other.getSize() <= player.getSize() - (local865 - local709 >> 7) && local721 <= local877 && other.getSize() <= player.getSize() - (local877 - local721 >> 7)) {
									addPlayerEntries(z, PlayerList.ids[j], other, x);
									other.aBoolean281 = true;
								}
							}
						}
					}
					if (player.aBoolean281) {
						continue;
					}
					addPlayerEntries(z, id, player, x);
					player.aBoolean281 = true;
				}
				if (keyType == 3) {
					@Pc(952) LinkedList objStacks = Static4.objStacks[Player.level][x][z];
					if (objStacks != null) {
						for (@Pc(960) ObjStackNode node = (ObjStackNode) objStacks.tail(); node != null; node = (ObjStackNode) objStacks.prev()) {
							@Pc(967) int objId = node.value.type;
							@Pc(971) ObjType type = ObjTypeList.get(objId);
							if (Static2.anInt1334 == 1) {
								add(objId, x, z, Static7.aString365 + " -> <col=ff9040>" + type.name, LocalisedText.USE, (short) 28, Static2.anInt1937);
							} else if (Static3.aBoolean177) {
								@Pc(986) ParamType param = Static5.anInt4224 == -1 ? null : ParamTypeList.get(Static5.anInt4224);
								if ((Static5.anInt3560 & 0x1) != 0 && (param == null || type.getParam(Static5.anInt4224, param.defaultInt) != param.defaultInt)) {
									add(objId, x, z, Static2.aString81 + " -> <col=ff9040>" + type.name, Static4.aString140, (short) 48, Static6.anInt4466);
								}
							} else {
								@Pc(1043) String[] ops = type.ops;
								if (Static5.aBoolean254) {
									ops = Static35.method4300(ops);
								}
								for (@Pc(1052) int j = 4; j >= 0; j--) {
									if (ops != null && ops[j] != null) {
										@Pc(1067) int cursor = -1;
										if (j == type.cursor1Op) {
											cursor = type.cursor1;
										}
										if (j == type.cursor2Op) {
											cursor = type.cursor2;
										}
										@Pc(1096) byte action = 0;
										if (j == 0) {
											action = 45;
										}
										if (j == 1) {
											action = 46;
										}
										if (j == 2) {
											action = 38;
										}
										if (j == 3) {
											action = 6;
										}
										if (j == 4) {
											action = 44;
										}
										add(objId, x, z, "<col=ff9040>" + type.name, ops[j], action, cursor);
									}
								}
								add(objId, x, z, "<col=ff9040>" + type.name, LocalisedText.EXAMINE, (short) 1004, Static3.anInt2232);
							}
						}
					}
				}
			}
		}
	}
}
