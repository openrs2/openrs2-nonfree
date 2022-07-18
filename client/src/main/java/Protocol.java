import java.io.IOException;
import java.math.BigInteger;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Protocol {
	@OriginalMember(owner = "client!tb", name = "g", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger EXPONENT = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger MODULUS = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "[I")
	private static final int[] PACKET_LENGTHS = new int[] { 0, -2, -2, 0, 1, 0, 0, 0, 1, 0, 6, 8, 0, 0, 0, 0, 0, 15, 8, 20, 0, 0, 0, 3, 0, -2, 4, 0, 0, 0, -1, 12, 0, 3, -2, 9, 0, 0, 3, 0, 7, 0, 6, -2, -1, 0, 8, 7, 0, -2, 0, 0, 2, -2, -1, 1, 0, 0, 0, -1, 5, 0, 0, 7, 0, 10, 0, 0, 0, 0, 0, 0, 2, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 8, 0, 10, 12, 0, 0, 8, 0, 2, 0, 2, 0, -1, 3, 0, 0, 4, -1, 15, 0, 0, 0, 0, 0, 17, 0, 12, 7, 3, -2, 0, 0, 0, 3, 0, 0, 0, 0, 0, -1, 0, 0, 6, 3, 4, 0, 14, 0, 6, -2, 3, 6, 0, 0, 0, 0, 0, 6, 0, 0, 2, 8, 0, 5, 8, 10, 6, 0, -2, 2, 0, 6, 0, 0, 0, 14, 0, 6, 0, 28, 0, 2, 0, 0, 0, 8, -2, -1, 0, 5, 11, 0, 4, 0, 0, -1, 12, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, 5, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 10, 0, 0, 0, 0, 3, 8, 0, 0, -1, 0, 0, 0, 0, 0, -1, -2, 0, 0 };

	@OriginalMember(owner = "client!wb", name = "D", descriptor = "Lsignlink!vk;")
	public static PrivilegedRequest socketRequest;

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "Lclient!eo;")
	public static BufferedSocket socket;

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
	public static int opcode = 0;

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
	public static int opcode1 = 0;

	@OriginalMember(owner = "client!ho", name = "n", descriptor = "I")
	public static int opcode2 = 0;

	@OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
	public static int opcode3 = 0;

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
	public static int length = 0;

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "Lclient!wa;")
	public static final Packet inboundBuffer = new Packet(65536);

	@OriginalMember(owner = "client!hk", name = "ab", descriptor = "Lclient!wa;")
	public static final Packet outboundBuffer = new Packet(5000);

	@OriginalMember(owner = "client!el", name = "e", descriptor = "[I")
	private static final int[] removedIds = new int[1000];

	@OriginalMember(owner = "client!pk", name = "Y", descriptor = "I")
	private static int removedCount = 0;

	@OriginalMember(owner = "client!u", name = "g", descriptor = "[I")
	private static final int[] extendedIds = new int[2048];

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
	private static int extendedCount = 0;

	@OriginalMember(owner = "client!no", name = "U", descriptor = "Lclient!fd;")
	private static final Buffer chatBuffer = new Buffer(new byte[5000]);

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
	private static int zoneX;

	@OriginalMember(owner = "client!co", name = "i", descriptor = "I")
	private static int zoneZ;

	@OriginalMember(owner = "client!uo", name = "A", descriptor = "I")
	public static int verifyId = 0;

	@OriginalMember(owner = "client!da", name = "h", descriptor = "Z")
	public static boolean verifyIdChanged = false;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)Z")
	public static boolean readPacket() {
		try {
			return readPacketInternal();
		} catch (@Pc(16) IOException ex) {
			Static23.method2455();
			return true;
		} catch (@Pc(21) Exception ex) {
			@Pc(63) String message = "T2 - " + opcode + "," + opcode2 + "," + opcode3 + " - " + length + "," + (Static5.originX + PlayerList.self.movementQueueX[0]) + "," + (Static7.originZ + PlayerList.self.movementQueueZ[0]) + " - ";
			for (@Pc(65) int i = 0; i < length && i < 50; i++) {
				message = message + inboundBuffer.bytes[i] + ",";
			}
			TracingException.report(ex, message);
			Static19.logout();
			return true;
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)Z")
	private static boolean readPacketInternal() throws IOException {
		if (socket == null) {
			return false;
		}
		@Pc(15) int available = socket.available();
		if (available == 0) {
			return false;
		}
		if (opcode == -1) {
			socket.read(inboundBuffer.bytes, 0, 1);
			inboundBuffer.position = 0;
			available--;
			opcode = inboundBuffer.readOpcode();
			length = PACKET_LENGTHS[opcode];
		}
		if (length == -1) {
			if (available <= 0) {
				return false;
			}
			available--;
			socket.read(inboundBuffer.bytes, 0, 1);
			length = inboundBuffer.bytes[0] & 0xFF;
		}
		if (length == -2) {
			if (available <= 1) {
				return false;
			}
			available -= 2;
			socket.read(inboundBuffer.bytes, 0, 2);
			inboundBuffer.position = 0;
			length = inboundBuffer.readUnsignedShort();
		}
		if (available < length) {
			return false;
		}
		inboundBuffer.position = 0;
		socket.read(inboundBuffer.bytes, 0, length);
		opcode3 = opcode2;
		opcode2 = opcode1;
		Static3.anInt2583 = 0;
		opcode1 = opcode;
		if (opcode == 163) {
			for (@Pc(130) int i = 0; i < VarpDomain.varps.length; i++) {
				if (VarpDomain.varps[i] != VarpDomain.serverVarps[i]) {
					VarpDomain.varps[i] = VarpDomain.serverVarps[i];
					Static29.method3534(i);
					VarpDomain.updatedVarps[VarpDomain.updatedVarpsWriterIndex++ & 0x1F] = i;
				}
			}
			opcode = -1;
			return true;
		} else if (opcode == 34) {
			@Pc(180) int componentId = inboundBuffer.readInt();
			@Pc(184) int invId = inboundBuffer.readUnsignedShort();
			@Pc(193) Component component;
			if (componentId >= 0) {
				component = InterfaceList.getComponent(componentId);
			} else {
				component = null;
			}
			if (componentId < -70000) {
				invId += 32768;
			}
			while (inboundBuffer.position < length) {
				@Pc(213) int count = 0;
				@Pc(217) int slot = inboundBuffer.readUnsignedShortSmart();
				@Pc(221) int id = inboundBuffer.readUnsignedShort();
				if (id != 0) {
					count = inboundBuffer.readUnsignedByte();
					if (count == 255) {
						count = inboundBuffer.readInt();
					}
				}
				if (component != null && slot >= 0 && component.objTypes.length > slot) {
					component.objTypes[slot] = id;
					component.objCounts[slot] = count;
				}
				Inv.set(invId, slot, id - 1, count);
			}
			if (component != null) {
				Static28.method3270(component);
			}
			Static21.method2062();
			Inv.updatedInventories[Inv.updatedInventoriesWriterIndex++ & 0x1F] = invId & 0x7FFF;
			opcode = -1;
			return true;
		} else if (opcode == 53) {
			zoneZ = inboundBuffer.readUnsignedByteS();
			zoneX = inboundBuffer.readUnsignedByteA();
			while (length > inboundBuffer.position) {
				opcode = inboundBuffer.readUnsignedByte();
				readZonePacket();
			}
			opcode = -1;
			return true;
		} else if (opcode == 192) {
			Static19.logout();
			opcode = -1;
			return false;
		} else if (opcode == 176) {
			@Pc(356) int verifyId = inboundBuffer.readUnsignedShort();
			@Pc(360) int id = inboundBuffer.readUnsignedShortLEA();
			@Pc(364) byte value = inboundBuffer.readByteC();
			if (setVerifyId(verifyId)) {
				DelayedStateChange.setVarcServer(id, value);
			}
			opcode = -1;
			return true;
		} else if (opcode == 4) {
			FriendsList.state = inboundBuffer.readUnsignedByte();
			FriendsList.transmitAt = InterfaceList.transmitTimer;
			opcode = -1;
			return true;
		} else if (opcode == 35) {
			@Pc(401) int type = inboundBuffer.readUnsignedByteC();
			@Pc(405) int verifyId = inboundBuffer.readUnsignedShortLEA();
			@Pc(409) int componentId = inboundBuffer.readIntLE();
			@Pc(413) int id = inboundBuffer.readUnsignedShortLE();
			if (setVerifyId(verifyId)) {
				@Pc(425) SubInterface subInterface = (SubInterface) InterfaceList.subInterfaces.get(componentId);
				if (subInterface != null) {
					InterfaceList.closeSubInterface(subInterface, id != subInterface.id);
				}
				InterfaceList.openSubInterface(componentId, id, type);
			}
			opcode = -1;
			return true;
		} else if (opcode == 59) {
			@Pc(462) String message = inboundBuffer.readString();
			if (message.endsWith(":tradereq:")) {
				@Pc(912) String username = message.substring(0, message.indexOf(":"));
				@Pc(914) boolean ignore = false;
				@Pc(918) long encodedUsername = Base37.encode(username);
				for (@Pc(920) int i = 0; i < IgnoreList.size; i++) {
					if (IgnoreList.encodedUsernames[i] == encodedUsername) {
						ignore = true;
						break;
					}
				}
				if (!ignore && Player.inTutorialIsland == 0) {
					Chat.add(4, username, LocalisedText.TRADEREQ);
				}
			} else if (message.endsWith(":chalreq:")) {
				@Pc(851) String username = message.substring(0, message.indexOf(":"));
				@Pc(853) boolean ignore = false;
				@Pc(859) long encodedUsername = Base37.encode(username);
				for (@Pc(861) int i = 0; i < IgnoreList.size; i++) {
					if (IgnoreList.encodedUsernames[i] == encodedUsername) {
						ignore = true;
						break;
					}
				}
				if (!ignore && Player.inTutorialIsland == 0) {
					@Pc(898) String local898 = message.substring(message.indexOf(":") + 1, message.length() - 9);
					Chat.add(8, username, local898);
				}
			} else if (message.endsWith(":assistreq:")) {
				@Pc(481) String username = message.substring(0, message.indexOf(":"));
				@Pc(485) long encodedUsername = Base37.encode(username);
				@Pc(487) boolean ignore = false;
				for (@Pc(489) int i = 0; i < IgnoreList.size; i++) {
					if (encodedUsername == IgnoreList.encodedUsernames[i]) {
						ignore = true;
						break;
					}
				}
				if (!ignore && Player.inTutorialIsland == 0) {
					Chat.add(10, username, "");
				}
			} else if (message.endsWith(":clan:")) {
				@Pc(837) String username = message.substring(0, message.indexOf(":clan:"));
				Chat.add(11, "", username);
			} else if (message.endsWith(":trade:")) {
				@Pc(818) String username = message.substring(0, message.indexOf(":trade:"));
				if (Player.inTutorialIsland == 0) {
					Chat.add(12, "", username);
				}
			} else if (message.endsWith(":assist:")) {
				@Pc(542) String username = message.substring(0, message.indexOf(":assist:"));
				if (Player.inTutorialIsland == 0) {
					Chat.add(13, "", username);
				}
			} else if (message.endsWith(":duelstake:")) {
				@Pc(767) String username = message.substring(0, message.indexOf(":"));
				@Pc(773) long encodedUsername = Base37.encode(username);
				@Pc(775) boolean ignore = false;
				for (@Pc(777) int i = 0; i < IgnoreList.size; i++) {
					if (IgnoreList.encodedUsernames[i] == encodedUsername) {
						ignore = true;
						break;
					}
				}
				if (!ignore && Player.inTutorialIsland == 0) {
					Chat.add(14, username, "");
				}
			} else if (message.endsWith(":duelfriend:")) {
				@Pc(715) String username = message.substring(0, message.indexOf(":"));
				@Pc(717) boolean ignore = false;
				@Pc(721) long encodedUsername = Base37.encode(username);
				for (@Pc(723) int i = 0; i < IgnoreList.size; i++) {
					if (encodedUsername == IgnoreList.encodedUsernames[i]) {
						ignore = true;
						break;
					}
				}
				if (!ignore && Player.inTutorialIsland == 0) {
					Chat.add(15, username, "");
				}
			} else if (message.endsWith(":clanreq:")) {
				@Pc(667) String username = message.substring(0, message.indexOf(":"));
				@Pc(671) long encodedUsername = Base37.encode(username);
				@Pc(673) boolean ignore = false;
				for (@Pc(675) int i = 0; i < IgnoreList.size; i++) {
					if (encodedUsername == IgnoreList.encodedUsernames[i]) {
						ignore = true;
						break;
					}
				}
				if (!ignore && Player.inTutorialIsland == 0) {
					Chat.add(16, username, "");
				}
			} else if (message.endsWith(":allyreq:")) {
				@Pc(578) String username = message.substring(0, message.indexOf(":"));
				@Pc(584) long encodedUsername = Base37.encode(username);
				@Pc(586) boolean ignore = false;
				for (@Pc(588) int i = 0; i < IgnoreList.size; i++) {
					if (encodedUsername == IgnoreList.encodedUsernames[i]) {
						ignore = true;
						break;
					}
				}
				if (!ignore && Player.inTutorialIsland == 0) {
					@Pc(621) String local621 = message.substring(message.indexOf(":") + 1, message.length() - 9);
					Chat.add(21, username, local621);
				}
			} else if (message.endsWith(":spam:")) {
				@Pc(647) String username = message.substring(0, message.length() - 6);
				if (Player.inTutorialIsland == 0) {
					Chat.add(22, "", username);
				}
			} else {
				Chat.add(0, "", message);
			}
			opcode = -1;
			return true;
		} else if (opcode == 162) {
			@Pc(967) int events = inboundBuffer.readInt();
			@Pc(973) int componentId = inboundBuffer.readInt();
			@Pc(977) int lastCreatedComponentId = inboundBuffer.readUnsignedShort();
			@Pc(981) int firstCreatedComponentId = inboundBuffer.readUnsignedShortLEA();
			if (lastCreatedComponentId == 65535) {
				lastCreatedComponentId = -1;
			}
			if (firstCreatedComponentId == 65535) {
				firstCreatedComponentId = -1;
			}
			@Pc(996) int verifyId = inboundBuffer.readUnsignedShortLEA();
			if (setVerifyId(verifyId)) {
				for (@Pc(1003) int i = firstCreatedComponentId; i <= lastCreatedComponentId; i++) {
					@Pc(1015) long key = ((long) componentId << 32) + (long) i;
					@Pc(1021) ServerActiveProperties oldProperties = (ServerActiveProperties) InterfaceList.serverActiveProperties.get(key);
					@Pc(1037) ServerActiveProperties newProperties;
					if (oldProperties != null) {
						newProperties = new ServerActiveProperties(events, oldProperties.targetParam);
						oldProperties.unlink();
					} else if (i == -1) {
						newProperties = new ServerActiveProperties(events, InterfaceList.getComponent(componentId).serverActiveProperties.targetParam);
					} else {
						newProperties = new ServerActiveProperties(events, -1);
					}
					InterfaceList.serverActiveProperties.put(key, newProperties);
				}
			}
			opcode = -1;
			return true;
		} else if (opcode == 1) {
			@Pc(1079) int verifyId = inboundBuffer.readUnsignedShortLE();
			@Pc(1085) String text = inboundBuffer.readString();
			@Pc(1089) int id = inboundBuffer.readIntAlt3Reverse();
			if (setVerifyId(verifyId)) {
				DelayedStateChange.setComponentTextServer(id, text);
			}
			opcode = -1;
			return true;
		} else if (opcode == 11) {
			@Pc(1114) int verifyId = inboundBuffer.readUnsignedShortLE();
			@Pc(1118) int id = inboundBuffer.readIntAlt3();
			@Pc(1122) int color = inboundBuffer.readUnsignedShortA();
			if (setVerifyId(verifyId)) {
				DelayedStateChange.setComponentColorServer(id, color);
			}
			opcode = -1;
			return true;
		} else if (opcode == 148) {
			@Pc(1144) int id = inboundBuffer.readUnsignedShort();
			@Pc(1148) int value = inboundBuffer.readIntLE();
			@Pc(1152) int verifyId = inboundBuffer.readUnsignedShort();
			if (setVerifyId(verifyId)) {
				DelayedStateChange.setVarcServer(id, value);
			}
			opcode = -1;
			return true;
		} else if (opcode == 95) {
			Static21.method2062();
			Static3.weight = inboundBuffer.readShort();
			InterfaceList.miscTransmitAt = InterfaceList.transmitTimer;
			opcode = -1;
			return true;
		} else if (opcode == 164) {
			Static21.method2062();
			@Pc(1190) int boostedLevel = inboundBuffer.readUnsignedByte();
			@Pc(1194) int experience = inboundBuffer.readIntAlt3Reverse();
			@Pc(1198) int skill = inboundBuffer.readUnsignedByte();
			PlayerSkillXpTable.experience[skill] = experience;
			PlayerSkillXpTable.boostedLevels[skill] = boostedLevel;
			PlayerSkillXpTable.baseLevels[skill] = 1;
			for (@Pc(1212) int baseLevel = 0; baseLevel < 98; baseLevel++) {
				if (experience >= PlayerSkillXpTable.EXPERIENCE_FOR_LEVEL[baseLevel]) {
					PlayerSkillXpTable.baseLevels[skill] = baseLevel + 2;
				}
			}
			PlayerSkillXpTable.updatedStats[PlayerSkillXpTable.updatedStatsWriterIndex++ & 0x1F] = skill;
			opcode = -1;
			return true;
		} else if (opcode == 8) {
			Static21.method2062();
			Static2.runEnergy = inboundBuffer.readUnsignedByte();
			InterfaceList.miscTransmitAt = InterfaceList.transmitTimer;
			opcode = -1;
			return true;
		} else if (opcode == 86) {
			Static30.setSettings(inboundBuffer.readString());
			opcode = -1;
			return true;
		} else if (opcode == 87) {
			@Pc(1285) int verifyId = inboundBuffer.readUnsignedShortLEA();
			@Pc(1289) int local1289 = inboundBuffer.readUnsignedShort();
			if (local1289 == 65535) {
				local1289 = -1;
			}
			@Pc(1300) int id = inboundBuffer.readIntLE();
			if (setVerifyId(verifyId)) {
				DelayedStateChange.setComponentModelServer(id, 1, local1289, -1);
			}
			opcode = -1;
			return true;
		} else if (opcode == 49) {
			readRebuildPacket(false);
			opcode = -1;
			return true;
		} else if (opcode == 138) {
			@Pc(1336) int id = inboundBuffer.readUnsignedShortLEA();
			@Pc(1340) int value = inboundBuffer.readIntAlt3();
			VarpDomain.setVarbitServer(id, value);
			opcode = -1;
			return true;
		} else if (opcode == 96) {
			if (InterfaceList.topLevelInterface != -1) {
				Static28.method3277(InterfaceList.topLevelInterface, 0);
			}
			opcode = -1;
			return true;
		} else if (opcode == 97) {
			zoneZ = inboundBuffer.readUnsignedByteS();
			zoneX = inboundBuffer.readUnsignedByteA();
			opcode = -1;
			return true;
		} else if (opcode == 25) {
			readPlayerInfoPacket();
			opcode = -1;
			return true;
		} else if (opcode == 126) {
			@Pc(1403) String op = inboundBuffer.readString();
			@Pc(1407) int highPriority = inboundBuffer.readUnsignedByteC();
			@Pc(1411) int cursor = inboundBuffer.readUnsignedShortLE();
			@Pc(1415) int i = inboundBuffer.readUnsignedByteS();
			if (cursor == 65535) {
				cursor = -1;
			}
			if (i >= 1 && i <= 8) {
				if (op.equalsIgnoreCase("null")) {
					op = null;
				}
				Player.ops[i - 1] = op;
				Player.opCursors[i - 1] = cursor;
				Player.opLowPriority[i - 1] = highPriority == 0;
			}
			opcode = -1;
			return true;
		} else if (opcode == 55) {
			MiniMap.state = inboundBuffer.readUnsignedByte();
			opcode = -1;
			return true;
		} else if (opcode == 31) {
			@Pc(1486) int componentId = inboundBuffer.readInt();
			@Pc(1490) int targetParam = inboundBuffer.readUnsignedShort();
			@Pc(1494) int verifyId = inboundBuffer.readUnsignedShortA();
			@Pc(1498) int lastCreatedComponentId = inboundBuffer.readUnsignedShort();
			@Pc(1502) int firstCreatedComponentId = inboundBuffer.readUnsignedShort();
			if (lastCreatedComponentId == 65535) {
				lastCreatedComponentId = -1;
			}
			if (firstCreatedComponentId == 65535) {
				firstCreatedComponentId = -1;
			}
			if (setVerifyId(verifyId)) {
				for (@Pc(1520) int i = firstCreatedComponentId; i <= lastCreatedComponentId; i++) {
					@Pc(1535) long key = ((long) componentId << 32) + (long) i;
					@Pc(1541) ServerActiveProperties oldProperties = (ServerActiveProperties) InterfaceList.serverActiveProperties.get(key);
					@Pc(1556) ServerActiveProperties newProperties;
					if (oldProperties != null) {
						newProperties = new ServerActiveProperties(oldProperties.events, targetParam);
						oldProperties.unlink();
					} else if (i == -1) {
						newProperties = new ServerActiveProperties(InterfaceList.getComponent(componentId).serverActiveProperties.events, targetParam);
					} else {
						newProperties = new ServerActiveProperties(0, targetParam);
					}
					InterfaceList.serverActiveProperties.put(key, newProperties);
				}
			}
			opcode = -1;
			return true;
		} else if (opcode == 174) {
			@Pc(1598) long key = inboundBuffer.readLong();
			@Pc(1602) int world = inboundBuffer.readUnsignedShort();
			@Pc(1604) boolean delete = false;
			if ((Long.MIN_VALUE & key) != 0L) {
				delete = true;
			}
			@Pc(1619) byte rank = inboundBuffer.readByte();
			if (delete) {
				if (ClanChat.size == 0) {
					opcode = -1;
					return true;
				}
				@Pc(1779) long key2 = key & Long.MAX_VALUE;
				@Pc(1781) int i;
				for (i = 0; ClanChat.size > i && (ClanChat.members[i].key != key2 || world != ClanChat.members[i].world); i++) {
				}
				if (i < ClanChat.size) {
					while (i < ClanChat.size - 1) {
						ClanChat.members[i] = ClanChat.members[i + 1];
						i++;
					}
					ClanChat.size--;
					ClanChat.members[ClanChat.size] = null;
				}
			} else {
				@Pc(1625) String worldName = inboundBuffer.readString();
				@Pc(1629) ClanMember member = new ClanMember();
				member.key = key;
				member.username = Base37.decodeLowerCase(member.key);
				member.rank = rank;
				member.world = world;
				member.worldName = worldName;
				@Pc(1653) int i;
				for (i = ClanChat.size - 1; i >= 0; i--) {
					@Pc(1663) int compare = ClanChat.members[i].username.compareTo(member.username);
					if (compare == 0) {
						ClanChat.members[i].world = world;
						ClanChat.members[i].rank = rank;
						ClanChat.members[i].worldName = worldName;
						ClanChat.transmitAt = InterfaceList.transmitTimer;
						if (LoginManager.encodedUsername == key) {
							ClanChat.rank = rank;
						}
						opcode = -1;
						return true;
					}
					if (compare < 0) {
						break;
					}
				}
				if (ClanChat.size >= ClanChat.members.length) {
					opcode = -1;
					return true;
				}
				for (@Pc(1720) int j = ClanChat.size - 1; j > i; j--) {
					ClanChat.members[j + 1] = ClanChat.members[j];
				}
				if (ClanChat.size == 0) {
					ClanChat.members = new ClanMember[100];
				}
				ClanChat.members[i + 1] = member;
				if (key == LoginManager.encodedUsername) {
					ClanChat.rank = rank;
				}
				ClanChat.size++;
			}
			ClanChat.transmitAt = InterfaceList.transmitTimer;
			opcode = -1;
			return true;
		} else if (opcode == 104) {
			@Pc(1858) long username = inboundBuffer.readLong();
			@Pc(1865) String message = StringUtils.escape(StringUtils.formatChatMessage(WordPack.readString(inboundBuffer)));
			Chat.add(6, Base37.decodeTitleCase(username), message);
			opcode = -1;
			return true;
		} else if (opcode == 253) {
			@Pc(1885) int verifyId = inboundBuffer.readUnsignedShort();
			@Pc(1889) String descriptor = inboundBuffer.readString();
			@Pc(1895) Object[] arguments = new Object[descriptor.length() + 1];
			for (@Pc(1900) int i = descriptor.length() - 1; i >= 0; i--) {
				if (descriptor.charAt(i) == 's') {
					arguments[i + 1] = inboundBuffer.readString();
				} else {
					arguments[i + 1] = Integer.valueOf(inboundBuffer.readInt());
				}
			}
			arguments[0] = Integer.valueOf(inboundBuffer.readInt());
			if (setVerifyId(verifyId)) {
				@Pc(1953) HookRequest request = new HookRequest();
				request.arguments = arguments;
				ScriptRunner.method2019(request);
			}
			opcode = -1;
			return true;
		} else if (opcode == 63) {
			@Pc(1971) int seqId = inboundBuffer.readUnsignedShortLE();
			@Pc(1975) int shapeAndAngle = inboundBuffer.readUnsignedByteS();
			if (seqId == 65535) {
				seqId = -1;
			}
			@Pc(1986) int shape = shapeAndAngle >> 2;
			@Pc(1990) int layer = Loc.LAYERS[shape];
			@Pc(1994) int angle = shapeAndAngle & 0x3;
			@Pc(1998) int position = inboundBuffer.readInt();
			@Pc(2004) int level = position >> 28 & 0x3;
			@Pc(2010) int x = position >> 14 & 0x3FFF;
			@Pc(2014) int z = position & 0x3FFF;
			z -= Static7.originZ;
			x -= Static5.originX;
			SceneGraph.method4250(level, x, z, layer, shape, angle, seqId);
			opcode = -1;
			return true;
		} else if (opcode == 30) {
			if (GameShell.fullScreenFrame != null) {
				Static35.setWindowMode(false, Preferences.windowMode, -1, -1);
			}
			@Pc(2051) byte[] bytes = new byte[length];
			inboundBuffer.readEncryptedBytes(bytes, length);
			@Pc(2063) String url = Cp1252Charset.decodeString(bytes, 0, length);
			if (GameShell.frame == null && (SignLink.anInt6106 == 3 || !SignLink.osName.startsWith("win") || client.haveIe6)) {
				Static37.openUrl(url, true);
			} else {
				Static6.url = url;
				Static4.newTab = true;
				Static1.openUrlRequest = GameShell.signLink.openUrl(url);
			}
			opcode = -1;
			return true;
		} else if (opcode == 147) {
			zoneX = inboundBuffer.readUnsignedByte();
			zoneZ = inboundBuffer.readUnsignedByteA();
			for (@Pc(2109) int x = zoneX; x < zoneX + 8; x++) {
				for (@Pc(2116) int z = zoneZ; z < zoneZ + 8; z++) {
					if (Static4.objStacks[Player.level][x][z] != null) {
						Static4.objStacks[Player.level][x][z] = null;
						Static8.sortObjStack(x, z);
					}
				}
			}
			for (@Pc(2157) ChangeLocRequest loc = (ChangeLocRequest) ChangeLocRequest.queue.head(); loc != null; loc = (ChangeLocRequest) ChangeLocRequest.queue.next()) {
				if (zoneX <= loc.x && loc.x < zoneX + 8 && zoneZ <= loc.z && zoneZ + 8 > loc.z && Player.level == loc.level) {
					loc.resetLoops = 0;
				}
			}
			opcode = -1;
			return true;
		} else if (opcode == 10) {
			@Pc(2208) int value = inboundBuffer.readIntAlt3Reverse();
			@Pc(2212) int id = inboundBuffer.readUnsignedShortA();
			VarpDomain.setVarpServer(id, value);
			opcode = -1;
			return true;
		} else if (opcode == 100) {
			@Pc(2227) int groupId = inboundBuffer.readUnsignedShort();
			if (groupId == 65535) {
				groupId = -1;
			}
			@Pc(2239) int volume = inboundBuffer.readUnsignedByteA();
			MusicPlayer.playSong(groupId, volume);
			opcode = -1;
			return true;
		} else if (opcode == 206) {
			@Pc(2256) int volume = inboundBuffer.readUnsignedByte();
			@Pc(2262) int groupId = inboundBuffer.readUnsignedShortLEA();
			if (groupId == 65535) {
				groupId = -1;
			}
			@Pc(2271) int local2271 = inboundBuffer.method4590();
			MusicPlayer.playJingle(groupId, volume, local2271);
			opcode = -1;
			return true;
		} else if (opcode == 54) {
			if (length == 0) {
				MiniMenu.walkHereOp = LocalisedText.WALKHERE;
			} else {
				MiniMenu.walkHereOp = inboundBuffer.readString();
			}
			opcode = -1;
			return true;
		} else if (opcode == 33) {
			@Pc(2312) int x = inboundBuffer.readUnsignedByte();
			@Pc(2316) int y = inboundBuffer.readUnsignedByte();
			@Pc(2322) byte sequenceNumber = inboundBuffer.readByte();
			if (MiniMap.sequenceNumber != sequenceNumber) {
				opcode = -1;
				return true;
			}
			opcode = -1;
			if (x == 255) {
				MiniMap.aBoolean147 = false;
				MiniMap.flagX = 0;
				MiniMap.flagY = 0;
			} else {
				MiniMap.aBoolean147 = true;
				MiniMap.flagY = y;
				MiniMap.flagX = x;
			}
			return true;
		} else if (opcode == 183) {
			@Pc(2367) int componentId = inboundBuffer.readInt();
			@Pc(2373) int objId = inboundBuffer.readUnsignedShortLEA();
			if (objId == 65535) {
				objId = -1;
			}
			@Pc(2382) int verifyId = inboundBuffer.readUnsignedShortA();
			@Pc(2386) int local2386 = inboundBuffer.readInt();
			if (setVerifyId(verifyId)) {
				@Pc(2395) Component component = InterfaceList.getComponent(componentId);
				if (component.if3) {
					DelayedStateChange.setComponentObjServer(componentId, objId, local2386);
					@Pc(2409) ObjType objType = ObjTypeList.get(objId);
					DelayedStateChange.setComponentModelAngleServer(componentId, objType.xAngle2d, objType.yAngle2d, objType.zoom2d);
					DelayedStateChange.setComponentModelOffsetServer(componentId, objType.xOffset2d, objType.yOffset2d, objType.zAngle2d);
				} else if (objId == -1) {
					component.modelType = 0;
					opcode = -1;
					return true;
				} else {
					@Pc(2443) ObjType objType = ObjTypeList.get(objId);
					component.modelYAngle = objType.yAngle2d;
					component.modelType = 4;
					component.modelId = objId;
					component.modelXAngle = objType.xAngle2d;
					component.modelZoom = objType.zoom2d * 100 / local2386;
					Static28.method3270(component);
				}
			}
			opcode = -1;
			return true;
		} else if (opcode == 65) {
			@Pc(2482) int id = inboundBuffer.readIntAlt3();
			@Pc(2488) int verifyId = inboundBuffer.readUnsignedShortLEA();
			@Pc(2494) int x = inboundBuffer.readShortA();
			@Pc(2498) int y = inboundBuffer.readShortLE();
			if (setVerifyId(verifyId)) {
				DelayedStateChange.setComponentPositionServer(id, x, y);
			}
			opcode = -1;
			return true;
		} else if (opcode == 152) {
			@Pc(2523) int verifyId = inboundBuffer.readUnsignedShortLEA();
			@Pc(2527) int xSpeed = inboundBuffer.readUnsignedShortLEA();
			@Pc(2531) int ySpeed = inboundBuffer.readUnsignedShortA();
			@Pc(2535) int id = inboundBuffer.readIntLE();
			if (setVerifyId(verifyId)) {
				DelayedStateChange.setComponentModelRotationSpeedServer(id, ySpeed + (xSpeed << 16));
			}
			opcode = -1;
			return true;
		} else if (opcode == 44) {
			@Pc(2559) boolean ignore = false;
			@Pc(2563) long username = inboundBuffer.readLong();
			@Pc(2568) long world = inboundBuffer.readUnsignedShort();
			@Pc(2573) long counter = inboundBuffer.readUnsignedMedium();
			@Pc(2579) long uid = (world << 32) + counter;
			@Pc(2583) int staffModLevel = inboundBuffer.readUnsignedByte();
			@Pc(2585) int i = 0;
			label1451:
			while (true) {
				if (i >= 100) {
					if (staffModLevel <= 1) {
						if (LoginManager.playerUnderage && !LoginManager.parentalChatConsent || LoginManager.mapQuickChat) {
							ignore = true;
						} else {
							for (@Pc(2623) int j = 0; j < IgnoreList.size; j++) {
								if (username == IgnoreList.encodedUsernames[j]) {
									ignore = true;
									break label1451;
								}
							}
						}
					}
					break;
				}
				if (Chat.uids[i] == uid) {
					ignore = true;
					break;
				}
				i++;
			}
			if (!ignore && Player.inTutorialIsland == 0) {
				Chat.uids[Chat.uidsWriterIndex] = uid;
				Chat.uidsWriterIndex = (Chat.uidsWriterIndex + 1) % 100;
				@Pc(2663) String message = StringUtils.escape(StringUtils.formatChatMessage(WordPack.readString(inboundBuffer)));
				if (staffModLevel == 2 || staffModLevel == 3) {
					Chat.add(7, "<img=1>" + Base37.decodeTitleCase(username), message);
				} else if (staffModLevel == 1) {
					Chat.add(7, "<img=0>" + Base37.decodeTitleCase(username), message);
				} else {
					Chat.add(3, Base37.decodeTitleCase(username), message);
				}
			}
			opcode = -1;
			return true;
		} else if (opcode == 89) {
			@Pc(2728) int verifyId = inboundBuffer.readUnsignedShortLE();
			@Pc(2732) int sourceComponentId = inboundBuffer.readInt();
			@Pc(2736) int destComponentId = inboundBuffer.readIntLE();
			if (setVerifyId(verifyId)) {
				@Pc(2747) SubInterface sourceSubInterface = (SubInterface) InterfaceList.subInterfaces.get(sourceComponentId);
				@Pc(2754) SubInterface destSubInterface = (SubInterface) InterfaceList.subInterfaces.get(destComponentId);
				if (destSubInterface != null) {
					InterfaceList.closeSubInterface(destSubInterface, sourceSubInterface == null || destSubInterface.id != sourceSubInterface.id);
				}
				if (sourceSubInterface != null) {
					sourceSubInterface.unlink();
					InterfaceList.subInterfaces.put(destComponentId, sourceSubInterface);
				}
				@Pc(2788) Component sourceComponent = InterfaceList.getComponent(sourceComponentId);
				if (sourceComponent != null) {
					Static28.method3270(sourceComponent);
				}
				@Pc(2799) Component destComponent = InterfaceList.getComponent(destComponentId);
				if (destComponent != null) {
					Static28.method3270(destComponent);
					Static34.method4251(true, destComponent);
				}
				if (InterfaceList.topLevelInterface != -1) {
					Static28.method3277(InterfaceList.topLevelInterface, 1);
				}
			}
			opcode = -1;
			return true;
		} else if (opcode == 246) {
			@Pc(2830) long encodedUsername = inboundBuffer.readLong();
			inboundBuffer.readByte();
			@Pc(2838) long encodedClan = inboundBuffer.readLong();
			@Pc(2843) long world = inboundBuffer.readUnsignedShort();
			@Pc(2848) long counter = inboundBuffer.readUnsignedMedium();
			@Pc(2855) long uid = (world << 32) + counter;
			@Pc(2859) int staffModLevel = inboundBuffer.readUnsignedByte();
			@Pc(2861) boolean ignore = false;
			@Pc(2863) int i = 0;
			label1702:
			while (true) {
				if (i < 100) {
					if (Chat.uids[i] != uid) {
						i++;
						continue;
					}
					ignore = true;
					break;
				}
				if (staffModLevel <= 1) {
					if (LoginManager.playerUnderage && !LoginManager.parentalChatConsent || LoginManager.mapQuickChat) {
						ignore = true;
					} else {
						for (@Pc(2899) int j = 0; j < IgnoreList.size; j++) {
							if (encodedUsername == IgnoreList.encodedUsernames[j]) {
								ignore = true;
								break label1702;
							}
						}
					}
				}
				break;
			}
			if (!ignore && Player.inTutorialIsland == 0) {
				Chat.uids[Chat.uidsWriterIndex] = uid;
				Chat.uidsWriterIndex = (Chat.uidsWriterIndex + 1) % 100;
				@Pc(2939) String message = StringUtils.escape(StringUtils.formatChatMessage(WordPack.readString(inboundBuffer)));
				if (staffModLevel == 2 || staffModLevel == 3) {
					Chat.addClanMessage("<img=1>" + Base37.decodeTitleCase(encodedUsername), message, Base37.decodeTitleCase(encodedClan));
				} else if (staffModLevel == 1) {
					Chat.addClanMessage("<img=0>" + Base37.decodeTitleCase(encodedUsername), message, Base37.decodeTitleCase(encodedClan));
				} else {
					Chat.addClanMessage(Base37.decodeTitleCase(encodedUsername), message, Base37.decodeTitleCase(encodedClan));
				}
			}
			opcode = -1;
			return true;
		} else if (opcode == 90) {
			@Pc(3016) int zoom = inboundBuffer.readUnsignedShortLEA();
			@Pc(3020) int yAngle = inboundBuffer.readUnsignedShortA();
			@Pc(3024) int verifyId = inboundBuffer.readUnsignedShortA();
			@Pc(3028) int xAngle = inboundBuffer.readUnsignedShortLE();
			@Pc(3032) int id = inboundBuffer.readIntLE();
			if (setVerifyId(verifyId)) {
				DelayedStateChange.setComponentModelAngleServer(id, xAngle, yAngle, zoom);
			}
			opcode = -1;
			return true;
		} else if (opcode == 130) {
			@Pc(3053) int z = inboundBuffer.readUnsignedByteA();
			@Pc(3057) int x = inboundBuffer.readUnsignedByteC();
			@Pc(3061) int levelAndClearMovementQueue = inboundBuffer.readUnsignedByte();
			Player.level = levelAndClearMovementQueue >> 1;
			PlayerList.self.teleport(x, z, (levelAndClearMovementQueue & 0x1) == 1);
			opcode = -1;
			return true;
		} else if (opcode == 172) {
			@Pc(3091) int id = inboundBuffer.readIntLE();
			@Pc(3095) int seqId = inboundBuffer.readShort();
			@Pc(3101) int verifyId = inboundBuffer.readUnsignedShortLEA();
			if (setVerifyId(verifyId)) {
				DelayedStateChange.setComponentModelAnimServer(id, seqId);
			}
			opcode = -1;
			return true;
		} else if (opcode == 103) {
			@Pc(3127) int ip = inboundBuffer.readInt();
			Static1.reverseDnsRequest = GameShell.signLink.getReverseDns(ip);
			opcode = -1;
			return true;
		} else if (opcode == 242) {
			@Pc(3144) int renderPriority = inboundBuffer.readUnsignedByte();
			@Pc(3148) int verifyId = inboundBuffer.readUnsignedShortLE();
			if (setVerifyId(verifyId)) {
				Static5.renderPriority = renderPriority;
			}
			opcode = -1;
			return true;
		} else if (opcode == 2) {
			ClanChat.transmitAt = InterfaceList.transmitTimer;
			@Pc(3168) long owner = inboundBuffer.readLong();
			if (owner == 0L) {
				ClanChat.name = null;
				ClanChat.size = 0;
				ClanChat.owner = null;
				opcode = -1;
				ClanChat.members = null;
				return true;
			}
			@Pc(3188) long name = inboundBuffer.readLong();
			ClanChat.name = Base37.decodeLowerCase(name);
			ClanChat.owner = Base37.decodeLowerCase(owner);
			ClanChat.minKick = inboundBuffer.readByte();
			@Pc(3204) int size = inboundBuffer.readUnsignedByte();
			if (size == 255) {
				opcode = -1;
				return true;
			}
			ClanChat.size = size;
			@Pc(3217) ClanMember[] clanMembers = new ClanMember[100];
			for (@Pc(3219) int i = 0; i < ClanChat.size; i++) {
				clanMembers[i] = new ClanMember();
				clanMembers[i].key = inboundBuffer.readLong();
				clanMembers[i].username = Base37.decodeLowerCase(clanMembers[i].key);
				clanMembers[i].world = inboundBuffer.readUnsignedShort();
				clanMembers[i].rank = inboundBuffer.readByte();
				clanMembers[i].worldName = inboundBuffer.readString();
				if (LoginManager.encodedUsername == clanMembers[i].key) {
					ClanChat.rank = clanMembers[i].rank;
				}
			}
			@Pc(3291) int i = ClanChat.size;
			while (i > 0) {
				i--;
				@Pc(3297) boolean sorted = true;
				for (@Pc(3299) int j = 0; j < i; j++) {
					if (clanMembers[j].username.compareTo(clanMembers[j + 1].username) > 0) {
						@Pc(3321) ClanMember member = clanMembers[j];
						clanMembers[j] = clanMembers[j + 1];
						clanMembers[j + 1] = member;
						sorted = false;
					}
				}
				if (sorted) {
					break;
				}
			}
			opcode = -1;
			ClanChat.members = clanMembers;
			return true;
		} else if (opcode == 173) {
			ReflectionCheck.push(inboundBuffer, length, GameShell.signLink);
			opcode = -1;
			return true;
		} else if (opcode == 115 || opcode == 111 || opcode == 17 || opcode == 144 || opcode == 114 || opcode == 133 || opcode == 47 || opcode == 158 || opcode == 105 || opcode == 120 || opcode == 60 || opcode == 179 || opcode == 232 || opcode == 131) {
			readZonePacket();
			opcode = -1;
			return true;
		} else if (opcode == 113) {
			@Pc(3435) int local3435 = inboundBuffer.readUnsignedShort();
			@Pc(3441) int id = inboundBuffer.readIntAlt3();
			@Pc(3447) int local3447 = inboundBuffer.readUnsignedShortLEA();
			@Pc(3451) int verifyId = inboundBuffer.readUnsignedShortLEA();
			@Pc(3455) int local3455 = inboundBuffer.readUnsignedShortLEA();
			if (setVerifyId(verifyId)) {
				DelayedStateChange.setComponentModelServer(id, 7, local3447 << 16 | local3455, local3435);
			}
			opcode = -1;
			return true;
		} else if (opcode == 182) {
			@Pc(3481) long encodedUsername = inboundBuffer.readLong();
			@Pc(3485) int world = inboundBuffer.readUnsignedShort();
			@Pc(3489) int rank = inboundBuffer.readUnsignedByte();
			@Pc(3491) boolean sameGame = true;
			if (encodedUsername < 0L) {
				sameGame = false;
				encodedUsername &= Long.MAX_VALUE;
			}
			@Pc(3504) String worldName = "";
			if (world > 0) {
				worldName = inboundBuffer.readString();
			}
			@Pc(3518) String username = Base37.decodeTitleCase(encodedUsername);
			for (@Pc(3520) int i = 0; i < FriendsList.size; i++) {
				if (FriendsList.encodedUsernames[i] == encodedUsername) {
					if (world != FriendsList.worlds[i]) {
						FriendsList.worlds[i] = world;
						if (world > 0) {
							Chat.add(5, "", username + LocalisedText.FRIENDLOGIN);
						}
						if (world == 0) {
							Chat.add(5, "", username + LocalisedText.FRIENDLOGOUT);
						}
					}
					FriendsList.worldNames[i] = worldName;
					FriendsList.ranks[i] = rank;
					FriendsList.sameGame[i] = sameGame;
					username = null;
					break;
				}
			}
			if (username != null && FriendsList.size < 200) {
				FriendsList.encodedUsernames[FriendsList.size] = encodedUsername;
				FriendsList.usernames[FriendsList.size] = username;
				FriendsList.worlds[FriendsList.size] = world;
				FriendsList.worldNames[FriendsList.size] = worldName;
				FriendsList.ranks[FriendsList.size] = rank;
				FriendsList.sameGame[FriendsList.size] = sameGame;
				FriendsList.size++;
			}
			FriendsList.transmitAt = InterfaceList.transmitTimer;
			@Pc(3644) int i = FriendsList.size;
			while (i > 0) {
				@Pc(3651) boolean sorted = true;
				i--;
				for (@Pc(3654) int j = 0; j < i; j++) {
					if (FriendsList.worlds[j] != client.worldId && client.worldId == FriendsList.worlds[j + 1] || FriendsList.worlds[j] == 0 && FriendsList.worlds[j + 1] != 0) {
						sorted = false;
						@Pc(3691) int tempWorld = FriendsList.worlds[j];
						FriendsList.worlds[j] = FriendsList.worlds[j + 1];
						FriendsList.worlds[j + 1] = tempWorld;
						@Pc(3709) String tempWorldName = FriendsList.worldNames[j];
						FriendsList.worldNames[j] = FriendsList.worldNames[j + 1];
						FriendsList.worldNames[j + 1] = tempWorldName;
						@Pc(3727) String tempUsername = FriendsList.usernames[j];
						FriendsList.usernames[j] = FriendsList.usernames[j + 1];
						FriendsList.usernames[j + 1] = tempUsername;
						@Pc(3745) long tempEncodedUsername = FriendsList.encodedUsernames[j];
						FriendsList.encodedUsernames[j] = FriendsList.encodedUsernames[j + 1];
						FriendsList.encodedUsernames[j + 1] = tempEncodedUsername;
						@Pc(3763) int tempRank = FriendsList.ranks[j];
						FriendsList.ranks[j] = FriendsList.ranks[j + 1];
						FriendsList.ranks[j + 1] = tempRank;
						@Pc(3781) boolean tempSameGame = FriendsList.sameGame[j];
						FriendsList.sameGame[j] = FriendsList.sameGame[j + 1];
						FriendsList.sameGame[j + 1] = tempSameGame;
					}
				}
				if (sorted) {
					break;
				}
			}
			opcode = -1;
			return true;
		} else if (opcode == 225) {
			@Pc(3813) int id = inboundBuffer.readUnsignedShort();
			@Pc(3817) int verifyId = inboundBuffer.readUnsignedShortLEA();
			@Pc(3821) int type = inboundBuffer.readUnsignedByteS();
			if (setVerifyId(verifyId)) {
				if (type == 2) {
					Static16.method1557();
				}
				InterfaceList.topLevelInterface = id;
				InterfaceList.method230(id);
				Static12.method777(false);
				Static14.method1102(InterfaceList.topLevelInterface);
				for (@Pc(3846) int i = 0; i < 100; i++) {
					Static2.aBooleanArray8[i] = true;
				}
			}
			opcode = -1;
			return true;
		} else if (opcode == 156) {
			@Pc(3870) int verifyId = inboundBuffer.readUnsignedShort();
			if (setVerifyId(verifyId)) {
				Camera.smoothReset();
			}
			opcode = -1;
			return true;
		} else if (opcode == 229) {
			for (@Pc(3886) int i = 0; i < PlayerList.players.length; i++) {
				if (PlayerList.players[i] != null) {
					PlayerList.players[i].seqId = -1;
				}
			}
			for (@Pc(3906) int i = 0; i < NpcList.npcs.length; i++) {
				if (NpcList.npcs[i] != null) {
					NpcList.npcs[i].seqId = -1;
				}
			}
			opcode = -1;
			return true;
		} else if (opcode == 78) {
			VarpDomain.clear();
			Static21.method2062();
			opcode = -1;
			VarpDomain.updatedVarpsWriterIndex += 32;
			return true;
		} else if (opcode == 177) {
			@Pc(3952) int indexAndType = inboundBuffer.readUnsignedByte();
			@Pc(3956) int index = indexAndType >> 5;
			@Pc(3960) int type = indexAndType & 0x1F;
			if (type == 0) {
				HintArrowManager.HINT_ARROWS[index] = null;
				opcode = -1;
				return true;
			}
			@Pc(3976) HintArrow hintArrow = new HintArrow();
			hintArrow.type = type;
			hintArrow.headIcon = inboundBuffer.readUnsignedByte();
			if (hintArrow.headIcon >= 0 && hintArrow.headIcon < Sprites.hintHeadIcons.length) {
				if (hintArrow.type == 1 || hintArrow.type == 10) {
					hintArrow.target = inboundBuffer.readUnsignedShort();
					@Pc(4011) Packet inboundBuffer = Protocol.inboundBuffer;
					inboundBuffer.position += 5;
				} else if (hintArrow.type >= 2 && hintArrow.type <= 6) {
					if (hintArrow.type == 2) {
						hintArrow.xOffset = 64;
						hintArrow.zOffset = 64;
					}
					if (hintArrow.type == 3) {
						hintArrow.zOffset = 64;
						hintArrow.xOffset = 0;
					}
					if (hintArrow.type == 4) {
						hintArrow.xOffset = 128;
						hintArrow.zOffset = 64;
					}
					if (hintArrow.type == 5) {
						hintArrow.xOffset = 64;
						hintArrow.zOffset = 0;
					}
					if (hintArrow.type == 6) {
						hintArrow.zOffset = 128;
						hintArrow.xOffset = 64;
					}
					hintArrow.type = 2;
					hintArrow.x = inboundBuffer.readUnsignedShort();
					hintArrow.z = inboundBuffer.readUnsignedShort();
					hintArrow.yOffset = inboundBuffer.readUnsignedByte();
					hintArrow.radius = inboundBuffer.readUnsignedShort();
				}
				hintArrow.model = inboundBuffer.readUnsignedShort();
				if (hintArrow.model == 65535) {
					hintArrow.model = -1;
				}
				HintArrowManager.HINT_ARROWS[index] = hintArrow;
			}
			opcode = -1;
			return true;
		} else if (opcode == 136) {
			readNpcInfoPacket();
			opcode = -1;
			return true;
		} else if (opcode == 155) {
			readRebuildPacket(true);
			opcode = -1;
			return true;
		} else if (opcode == 75) {
			@Pc(4162) int verifyId = inboundBuffer.readUnsignedShortLEA();
			@Pc(4166) String value = inboundBuffer.readString();
			@Pc(4170) int id = inboundBuffer.readUnsignedShortLEA();
			if (setVerifyId(verifyId)) {
				DelayedStateChange.setVarcstrServer(id, value);
			}
			opcode = -1;
			return true;
		} else if (opcode == 137) {
			@Pc(4190) int id = inboundBuffer.readUnsignedShortLE();
			@Pc(4194) int value = inboundBuffer.readUnsignedByte();
			VarpDomain.setVarbitServer(id, value);
			opcode = -1;
			return true;
		} else if (opcode == 72) {
			Static5.rebootTimer = inboundBuffer.readUnsignedShortLE() * 30;
			InterfaceList.miscTransmitAt = InterfaceList.transmitTimer;
			opcode = -1;
			return true;
		} else if (opcode == 26) {
			@Pc(4226) int componentId = inboundBuffer.readIntAlt3Reverse();
			@Pc(4232) Component component = InterfaceList.getComponent(componentId);
			for (@Pc(4234) int slot = 0; slot < component.objTypes.length; slot++) {
				component.objTypes[slot] = -1;
				component.objTypes[slot] = 0;
			}
			Static28.method3270(component);
			opcode = -1;
			return true;
		} else if (opcode == 99) {
			@Pc(4270) long encodedUsername = inboundBuffer.readLong();
			inboundBuffer.readByte();
			@Pc(4278) long encodedClan = inboundBuffer.readLong();
			@Pc(4283) long world = inboundBuffer.readUnsignedShort();
			@Pc(4288) long counter = inboundBuffer.readUnsignedMedium();
			@Pc(4295) long uid = (world << 32) + counter;
			@Pc(4299) int staffModLevel = inboundBuffer.readUnsignedByte();
			@Pc(4303) int phraseId = inboundBuffer.readUnsignedShort();
			@Pc(4305) boolean ignore = false;
			@Pc(4307) int i = 0;
			label1529:
			while (true) {
				if (i < 100) {
					if (Chat.uids[i] != uid) {
						i++;
						continue;
					}
					ignore = true;
					break;
				}
				if (staffModLevel <= 1) {
					for (@Pc(4333) int j = 0; j < IgnoreList.size; j++) {
						if (encodedUsername == IgnoreList.encodedUsernames[j]) {
							ignore = true;
							break label1529;
						}
					}
				}
				break;
			}
			if (!ignore && Player.inTutorialIsland == 0) {
				Chat.uids[Chat.uidsWriterIndex] = uid;
				Chat.uidsWriterIndex = (Chat.uidsWriterIndex + 1) % 100;
				@Pc(4375) String message = QuickChatPhraseTypeList.get(phraseId).decodeMessage(inboundBuffer);
				if (staffModLevel == 2 || staffModLevel == 3) {
					Chat.add(20, "<img=1>" + Base37.decodeTitleCase(encodedUsername), message, Base37.decodeTitleCase(encodedClan), phraseId);
				} else if (staffModLevel == 1) {
					Chat.add(20, "<img=0>" + Base37.decodeTitleCase(encodedUsername), message, Base37.decodeTitleCase(encodedClan), phraseId);
				} else {
					Chat.add(20, Base37.decodeTitleCase(encodedUsername), message, Base37.decodeTitleCase(encodedClan), phraseId);
				}
			}
			opcode = -1;
			return true;
		} else if (opcode == 237) {
			@Pc(4452) int spotAnimId = inboundBuffer.readUnsignedShortLE();
			@Pc(4456) int delay = inboundBuffer.readUnsignedShortA();
			@Pc(4460) int y = inboundBuffer.readUnsignedShortLE();
			@Pc(4466) int index = inboundBuffer.readIntAlt3Reverse();
			if (index >> 30 != 0) {
				@Pc(4479) int level = index >> 28 & 0x3;
				@Pc(4488) int x = (index >> 14 & 0x3FFF) - Static5.originX;
				@Pc(4495) int z = (index & 0x3FFF) - Static7.originZ;
				if (x >= 0 && z >= 0 && x < 104 && z < 104) {
					@Pc(4515) int zFine = z * 128 + 64;
					@Pc(4521) int xFine = x * 128 + 64;
					@Pc(4539) SpotAnim spotAnim = new SpotAnim(spotAnimId, level, xFine, zFine, SceneGraph.getTileHeight(level, xFine, zFine) - y, delay, client.loop);
					Static2.spotAnims.addTail(new SpotAnimNode(spotAnim));
				}
			} else if (index >> 29 != 0) {
				@Pc(4805) int npcIndex = index & 0xFFFF;
				@Pc(4809) Npc npc = NpcList.npcs[npcIndex];
				if (npc != null) {
					if (spotAnimId == 65535) {
						spotAnimId = -1;
					}
					@Pc(4822) boolean local4822 = true;
					if (spotAnimId != -1 && npc.spotAnimId != -1) {
						if (spotAnimId == npc.spotAnimId) {
							@Pc(4840) SpotAnimType local4840 = SpotAnimTypeList.get(spotAnimId);
							if (local4840.aBoolean222 && local4840.seqId != -1) {
								@Pc(4855) SeqType local4855 = SeqTypeList.get(local4840.seqId);
								@Pc(4858) int local4858 = local4855.anInt1238;
								if (local4858 == 1) {
									local4822 = false;
									npc.spotAnimStart = client.loop + delay;
									npc.anInt4026 = 0;
									npc.anInt3976 = 1;
									npc.anInt3968 = 0;
									npc.anInt3989 = 0;
									SoundPlayer.playSeqSound(local4855, npc.xFine, npc.zFine, npc.anInt4026, false);
								} else if (local4858 == 2) {
									npc.anInt4001 = 0;
									local4822 = false;
								}
							}
						} else {
							@Pc(4913) SpotAnimType local4913 = SpotAnimTypeList.get(spotAnimId);
							@Pc(4918) SpotAnimType local4918 = SpotAnimTypeList.get(npc.spotAnimId);
							if (local4913.seqId != -1 && local4918.seqId != -1) {
								@Pc(4935) SeqType local4935 = SeqTypeList.get(local4913.seqId);
								@Pc(4940) SeqType local4940 = SeqTypeList.get(local4918.seqId);
								if (local4935.priority < local4940.priority) {
									local4822 = false;
								}
							}
						}
					}
					if (local4822) {
						npc.spotAnimId = spotAnimId;
						npc.anInt4026 = 0;
						npc.anInt3976 = 1;
						npc.spotAnimY = y;
						npc.anInt3968 = 0;
						npc.spotAnimStart = delay + client.loop;
						if (npc.spotAnimStart > client.loop) {
							npc.anInt4026 = -1;
						}
						if (npc.spotAnimId != -1 && client.loop == npc.spotAnimStart) {
							@Pc(5003) int local5003 = SpotAnimTypeList.get(npc.spotAnimId).seqId;
							if (local5003 != -1) {
								@Pc(5010) SeqType local5010 = SeqTypeList.get(local5003);
								if (local5010 != null && local5010.frames != null) {
									SoundPlayer.playSeqSound(local5010, npc.xFine, npc.zFine, 0, false);
								}
							}
						}
					}
				}
			} else if (index >> 28 != 0) {
				@Pc(4564) int playerIndex = index & 0xFFFF;
				@Pc(4569) Player player;
				if (PlayerList.selfId == playerIndex) {
					player = PlayerList.self;
				} else {
					player = PlayerList.players[playerIndex];
				}
				if (player != null) {
					if (spotAnimId == 65535) {
						spotAnimId = -1;
					}
					@Pc(4586) boolean local4586 = true;
					if (spotAnimId != -1 && player.spotAnimId != -1) {
						if (spotAnimId == player.spotAnimId) {
							@Pc(4649) SpotAnimType local4649 = SpotAnimTypeList.get(spotAnimId);
							if (local4649.aBoolean222 && local4649.seqId != -1) {
								@Pc(4663) SeqType local4663 = SeqTypeList.get(local4649.seqId);
								@Pc(4666) int local4666 = local4663.anInt1238;
								if (local4666 == 1) {
									player.anInt4026 = 0;
									player.anInt3968 = 0;
									player.anInt3976 = 1;
									local4586 = false;
									player.spotAnimStart = delay + client.loop;
									player.anInt3989 = 0;
									SoundPlayer.playSeqSound(local4663, player.xFine, player.zFine, player.anInt4026, false);
								} else if (local4666 == 2) {
									player.anInt4001 = 0;
									local4586 = false;
								}
							}
						} else {
							@Pc(4605) SpotAnimType local4605 = SpotAnimTypeList.get(spotAnimId);
							@Pc(4610) SpotAnimType local4610 = SpotAnimTypeList.get(player.spotAnimId);
							if (local4605.seqId != -1 && local4610.seqId != -1) {
								@Pc(4627) SeqType local4627 = SeqTypeList.get(local4605.seqId);
								@Pc(4632) SeqType local4632 = SeqTypeList.get(local4610.seqId);
								if (local4627.priority < local4632.priority) {
									local4586 = false;
								}
							}
						}
					}
					if (local4586) {
						player.anInt3968 = 0;
						player.anInt3976 = 1;
						player.spotAnimStart = client.loop + delay;
						player.spotAnimY = y;
						player.anInt4026 = 0;
						player.spotAnimId = spotAnimId;
						if (player.spotAnimStart > client.loop) {
							player.anInt4026 = -1;
						}
						if (player.spotAnimId == 65535) {
							player.spotAnimId = -1;
						}
						if (player.spotAnimId != -1 && player.spotAnimStart == client.loop) {
							@Pc(4768) int local4768 = SpotAnimTypeList.get(player.spotAnimId).seqId;
							if (local4768 != -1) {
								@Pc(4778) SeqType local4778 = SeqTypeList.get(local4768);
								if (local4778 != null && local4778.frames != null) {
									SoundPlayer.playSeqSound(local4778, player.xFine, player.zFine, 0, player == PlayerList.self);
								}
							}
						}
					}
				}
			}
			opcode = -1;
			return true;
		} else if (opcode == 151) {
			@Pc(5037) int verifyId = inboundBuffer.readUnsignedShort();
			@Pc(5041) int local5041 = inboundBuffer.readUnsignedByte();
			@Pc(5045) int local5045 = inboundBuffer.readUnsignedByte();
			@Pc(5049) int local5049 = inboundBuffer.readUnsignedShort();
			@Pc(5053) int local5053 = inboundBuffer.readUnsignedByte();
			@Pc(5057) int local5057 = inboundBuffer.readUnsignedByte();
			if (setVerifyId(verifyId)) {
				Camera.moveTo(local5053, local5041, local5057, local5049, true, local5045);
			}
			opcode = -1;
			return true;
		} else if (opcode == 116) {
			@Pc(5083) int id = inboundBuffer.readUnsignedShortA();
			@Pc(5087) int verifyId = inboundBuffer.readUnsignedShortA();
			@Pc(5091) String value = inboundBuffer.readString();
			if (setVerifyId(verifyId)) {
				DelayedStateChange.setVarcstrServer(id, value);
			}
			opcode = -1;
			return true;
		} else if (opcode == 222) {
			@Pc(5111) long encodedUsername = inboundBuffer.readLong();
			@Pc(5116) long world = inboundBuffer.readUnsignedShort();
			@Pc(5121) long counter = inboundBuffer.readUnsignedMedium();
			@Pc(5125) int staffModLevel = inboundBuffer.readUnsignedByte();
			@Pc(5129) int phraseId = inboundBuffer.readUnsignedShort();
			@Pc(5131) boolean ignore = false;
			@Pc(5137) long uid = (world << 32) + counter;
			@Pc(5139) int i = 0;
			label1545:
			while (true) {
				if (i < 100) {
					if (uid != Chat.uids[i]) {
						i++;
						continue;
					}
					ignore = true;
					break;
				}
				if (staffModLevel <= 1) {
					for (@Pc(5167) int j = 0; j < IgnoreList.size; j++) {
						if (IgnoreList.encodedUsernames[j] == encodedUsername) {
							ignore = true;
							break label1545;
						}
					}
				}
				break;
			}
			if (!ignore && Player.inTutorialIsland == 0) {
				Chat.uids[Chat.uidsWriterIndex] = uid;
				Chat.uidsWriterIndex = (Chat.uidsWriterIndex + 1) % 100;
				@Pc(5214) String message = QuickChatPhraseTypeList.get(phraseId).decodeMessage(inboundBuffer);
				if (staffModLevel == 2) {
					Chat.add(18, "<img=1>" + Base37.decodeTitleCase(encodedUsername), message, null, phraseId);
				} else if (staffModLevel == 1) {
					Chat.add(18, "<img=0>" + Base37.decodeTitleCase(encodedUsername), message, null, phraseId);
				} else {
					Chat.add(18, Base37.decodeTitleCase(encodedUsername), message, null, phraseId);
				}
			}
			opcode = -1;
			return true;
		} else if (opcode == 46) {
			@Pc(5282) int verifyId = inboundBuffer.readUnsignedShort();
			@Pc(5286) int index = inboundBuffer.readUnsignedByte();
			@Pc(5290) int local5290 = inboundBuffer.readUnsignedByte();
			@Pc(5294) int local5294 = inboundBuffer.readUnsignedByte();
			@Pc(5298) int local5298 = inboundBuffer.readUnsignedByte();
			@Pc(5302) int local5302 = inboundBuffer.readUnsignedShort();
			if (setVerifyId(verifyId)) {
				Camera.shakeEnabled[index] = true;
				Camera.anIntArray625[index] = local5290;
				Camera.anIntArray626[index] = local5294;
				Camera.anIntArray13[index] = local5298;
				Camera.anIntArray14[index] = local5302;
			}
			opcode = -1;
			return true;
		} else if (opcode == 153) {
			@Pc(5340) int id = inboundBuffer.readUnsignedShort();
			if (id == 65535) {
				id = -1;
			}
			@Pc(5349) int loops = inboundBuffer.readUnsignedByte();
			@Pc(5353) int delay = inboundBuffer.readUnsignedShort();
			@Pc(5357) int volume = inboundBuffer.readUnsignedByte();
			SoundPlayer.play(delay, id, loops, volume);
			opcode = -1;
			return true;
		} else if (opcode == 135) {
			@Pc(5375) int verifyId = inboundBuffer.readUnsignedShort();
			@Pc(5379) int componentId = inboundBuffer.readInt();
			if (setVerifyId(verifyId)) {
				@Pc(5392) SubInterface subInterface = (SubInterface) InterfaceList.subInterfaces.get(componentId);
				if (subInterface != null) {
					InterfaceList.closeSubInterface(subInterface, true);
				}
				if (Static6.aClass185_14 != null) {
					Static28.method3270(Static6.aClass185_14);
					Static6.aClass185_14 = null;
				}
			}
			opcode = -1;
			return true;
		} else if (opcode == 40) {
			@Pc(5419) int id = inboundBuffer.readIntLE();
			@Pc(5423) int verifyId = inboundBuffer.readUnsignedShortLE();
			@Pc(5427) int hidden = inboundBuffer.readUnsignedByte();
			if (setVerifyId(verifyId)) {
				DelayedStateChange.setComponentHiddenServer(id, hidden);
			}
			opcode = -1;
			return true;
		} else if (opcode == 23) {
			Chat.publicFilter = inboundBuffer.readUnsignedByte();
			Chat.privateFilter = inboundBuffer.readUnsignedByte();
			Chat.tradeFilter = inboundBuffer.readUnsignedByte();
			opcode = -1;
			return true;
		} else if (opcode == 168) {
			@Pc(5469) int invId = inboundBuffer.readUnsignedShort();
			Inv.delete(invId);
			Inv.updatedInventories[Inv.updatedInventoriesWriterIndex++ & 0x1F] = invId & 0x7FFF;
			opcode = -1;
			return true;
		} else if (opcode == 52) {
			@Pc(5498) int verifyId = inboundBuffer.readUnsignedShort();
			if (setVerifyId(verifyId)) {
				Camera.reset();
			}
			opcode = -1;
			return true;
		} else if (opcode == 38) {
			@Pc(5517) byte value = inboundBuffer.readByte();
			@Pc(5521) int id = inboundBuffer.readUnsignedShortLE();
			VarpDomain.setVarpServer(id, value);
			opcode = -1;
			return true;
		} else if (opcode == 194) {
			@Pc(5536) int componentId = inboundBuffer.readInt();
			@Pc(5540) int invId = inboundBuffer.readUnsignedShort();
			if (componentId < -70000) {
				invId += 32768;
			}
			@Pc(5557) Component component;
			if (componentId < 0) {
				component = null;
			} else {
				component = InterfaceList.getComponent(componentId);
			}
			if (component != null) {
				for (@Pc(5570) int slot = 0; slot < component.objTypes.length; slot++) {
					component.objTypes[slot] = 0;
					component.objCounts[slot] = 0;
				}
			}
			Inv.clear(invId);
			@Pc(5595) int len = inboundBuffer.readUnsignedShort();
			for (@Pc(5597) int i = 0; i < len; i++) {
				@Pc(5608) int id = inboundBuffer.readUnsignedShort();
				@Pc(5612) int count = inboundBuffer.readUnsignedByteC();
				if (count == 255) {
					count = inboundBuffer.readInt();
				}
				if (component != null && i < component.objTypes.length) {
					component.objTypes[i] = id;
					component.objCounts[i] = count;
				}
				Inv.set(invId, i, id - 1, count);
			}
			if (component != null) {
				Static28.method3270(component);
			}
			Static21.method2062();
			Inv.updatedInventories[Inv.updatedInventoriesWriterIndex++ & 0x1F] = invId & 0x7FFF;
			opcode = -1;
			return true;
		} else if (opcode == 150) {
			@Pc(5687) int seqId = inboundBuffer.readUnsignedShort();
			@Pc(5691) int npcIndex = inboundBuffer.readUnsignedShortA();
			@Pc(5695) int delay = inboundBuffer.readUnsignedByteC();
			@Pc(5699) Npc npc = NpcList.npcs[npcIndex];
			if (npc != null) {
				Npc.animate(npc, seqId, delay);
			}
			opcode = -1;
			return true;
		} else if (opcode == 93) {
			@Pc(5721) int verifyId = inboundBuffer.readUnsignedShort();
			@Pc(5725) int local5725 = inboundBuffer.readUnsignedByte();
			@Pc(5729) int local5729 = inboundBuffer.readUnsignedByte();
			@Pc(5733) int local5733 = inboundBuffer.readUnsignedShort();
			@Pc(5737) int local5737 = inboundBuffer.readUnsignedByte();
			@Pc(5741) int local5741 = inboundBuffer.readUnsignedByte();
			if (setVerifyId(verifyId)) {
				Camera.lookAt(local5733, local5737, local5725, local5729, local5741);
			}
			opcode = -1;
			return true;
		} else if (opcode == 166) {
			@Pc(5763) Packet buffer = inboundBuffer;
			buffer.position += 28;
			if (inboundBuffer.verifyCrc32()) {
				client.readUid(inboundBuffer, inboundBuffer.position - 28);
			}
			opcode = -1;
			return true;
		} else if (opcode == 42) {
			@Pc(5797) int verifyId = inboundBuffer.readUnsignedShortLEA();
			@Pc(5801) int local5801 = inboundBuffer.readUnsignedShortA();
			@Pc(5805) int local5805 = inboundBuffer.readUnsignedShortLEA();
			if (setVerifyId(verifyId)) {
				Camera.forceAngle(local5805, local5801);
			}
			opcode = -1;
			return true;
		} else if (opcode == 18) {
			@Pc(5828) int local5828 = inboundBuffer.readUnsignedShortLE();
			if (local5828 == 65535) {
				local5828 = -1;
			}
			@Pc(5837) int verifyId = inboundBuffer.readUnsignedShort();
			@Pc(5841) int id = inboundBuffer.readInt();
			if (setVerifyId(verifyId)) {
				DelayedStateChange.setComponentModelServer(id, 2, local5828, -1);
			}
			opcode = -1;
			return true;
		} else if (opcode == 43) {
			IgnoreList.size = length / 8;
			for (@Pc(5867) int i = 0; i < IgnoreList.size; i++) {
				IgnoreList.encodedUsernames[i] = inboundBuffer.readLong();
				IgnoreList.usernames[i] = IgnoreList.base37DecodeLowerCase(IgnoreList.encodedUsernames[i]);
				IgnoreList.temporary[i] = false;
			}
			opcode = -1;
			FriendsList.transmitAt = InterfaceList.transmitTimer;
			return true;
		} else if (opcode == 221) {
			@Pc(5909) long username = inboundBuffer.readLong();
			@Pc(5913) int phraseId = inboundBuffer.readUnsignedShort();
			@Pc(5920) String message = QuickChatPhraseTypeList.get(phraseId).decodeMessage(inboundBuffer);
			Chat.add(19, Base37.decodeTitleCase(username), message, null, phraseId);
			opcode = -1;
			return true;
		} else if (opcode == 199) {
			@Pc(5941) int id = inboundBuffer.readIntAlt3Reverse();
			@Pc(5945) int verifyId = inboundBuffer.readUnsignedShort();
			if (setVerifyId(verifyId)) {
				@Pc(5951) int local5951 = 0;
				if (PlayerList.self.appearance != null) {
					local5951 = PlayerList.self.appearance.method3611();
				}
				DelayedStateChange.setComponentModelServer(id, 3, local5951, -1);
			}
			opcode = -1;
			return true;
		} else if (opcode == 243) {
			@Pc(5979) int scrollY = inboundBuffer.readUnsignedShort();
			@Pc(5985) int id = inboundBuffer.readIntAlt3Reverse();
			@Pc(5989) int verifyId = inboundBuffer.readUnsignedShortLEA();
			if (setVerifyId(verifyId)) {
				DelayedStateChange.setComponentScrollPositionServer(id, scrollY);
			}
			opcode = -1;
			return true;
		} else if (opcode == 19) {
			@Pc(6012) int slot = inboundBuffer.readUnsignedByte();
			if (inboundBuffer.readUnsignedByte() == 0) {
				StockMarketManager.offers[slot] = new StockMarketOffer();
			} else {
				inboundBuffer.position--;
				StockMarketManager.offers[slot] = new StockMarketOffer(inboundBuffer);
			}
			opcode = -1;
			StockMarketManager.transmitAt = InterfaceList.transmitTimer;
			return true;
		} else {
			TracingException.report(null, "T1 - " + opcode + "," + opcode2 + "," + opcode3 + " - " + length);
			Static19.logout();
			return true;
		}
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(B)V")
	private static void readZonePacket() {
		if (opcode == 17) {
			@Pc(15) int position = inboundBuffer.readUnsignedByte();
			@Pc(26) int x = zoneX * 2 + (position >> 4 & 0xF);
			@Pc(34) int z = zoneZ * 2 + (position & 0xF);
			@Pc(41) int targetX = x + inboundBuffer.readByte();
			@Pc(47) int targetZ = z + inboundBuffer.readByte();
			@Pc(51) int targetEntity = inboundBuffer.readShort();
			@Pc(55) int spotAnimId = inboundBuffer.readUnsignedShort();
			@Pc(61) int y = inboundBuffer.readUnsignedByte() * 4;
			@Pc(67) int targetY = inboundBuffer.readUnsignedByte() * 4;
			@Pc(71) int startDelay = inboundBuffer.readUnsignedShort();
			@Pc(75) int endDelay = inboundBuffer.readUnsignedShort();
			@Pc(79) int local79 = inboundBuffer.readUnsignedByte();
			if (local79 == 255) {
				local79 = -1;
			}
			@Pc(89) int local89 = inboundBuffer.readUnsignedByte();
			if (x >= 0 && z >= 0 && x < 208 && z < 208 && targetX >= 0 && targetZ >= 0 && targetX < 208 && targetZ < 208 && spotAnimId != 65535) {
				@Pc(126) int xFine = x * 64;
				@Pc(130) int zFine = z * 64;
				@Pc(134) int targetXFine = targetX * 64;
				@Pc(161) ProjAnim projAnim = new ProjAnim(spotAnimId, Player.level, xFine, zFine, SceneGraph.getTileHeight(Player.level, xFine, zFine) - y, startDelay + client.loop, client.loop + endDelay, local79, local89, targetEntity, targetY);
				@Pc(165) int targetZFine = targetZ * 64;
				projAnim.setTarget(SceneGraph.getTileHeight(Player.level, targetXFine, targetZFine) - targetY, targetXFine, client.loop + startDelay, targetZFine);
				Static1.projAnims.addTail(new ProjAnimNode(projAnim));
			}
		} else if (opcode == 114) {
			@Pc(198) int position = inboundBuffer.readUnsignedByte();
			@Pc(206) int x = zoneX + (position >> 4 & 0x7);
			@Pc(212) int z = zoneZ + (position & 0x7);
			@Pc(216) int type = inboundBuffer.readUnsignedShort();
			@Pc(220) int oldCount = inboundBuffer.readUnsignedShort();
			@Pc(224) int newCount = inboundBuffer.readUnsignedShort();
			if (x >= 0 && z >= 0 && x < 104 && z < 104) {
				@Pc(247) LinkedList objStacks = Static4.objStacks[Player.level][x][z];
				if (objStacks != null) {
					for (@Pc(256) ObjStackNode node = (ObjStackNode) objStacks.head(); node != null; node = (ObjStackNode) objStacks.next()) {
						@Pc(262) ObjStack objStack = node.value;
						if (objStack.type == (type & 0x7FFF) && oldCount == objStack.count) {
							objStack.count = newCount;
							break;
						}
					}
					Static8.sortObjStack(x, z);
				}
			}
		} else {
			if (opcode == 133) {
				@Pc(306) int entityId = inboundBuffer.readShortA();
				@Pc(310) int position = inboundBuffer.readUnsignedByteA();
				@Pc(316) int z = zoneZ + (position & 0x7);
				@Pc(324) int x = zoneX + (position >> 4 & 0x7);
				@Pc(328) int resetLoops = inboundBuffer.readUnsignedShortLEA();
				@Pc(332) int shapeAndAngle = inboundBuffer.readUnsignedByte();
				@Pc(336) int shape = shapeAndAngle >> 2;
				@Pc(340) byte x0Delta = inboundBuffer.readByteS();
				@Pc(344) int angle = shapeAndAngle & 0x3;
				@Pc(348) byte z1Delta = inboundBuffer.readByteC();
				@Pc(352) byte z0Delta = inboundBuffer.readByte();
				@Pc(356) byte x1Delta = inboundBuffer.readByteC();
				@Pc(360) int setLoops = inboundBuffer.readUnsignedShortLEA();
				@Pc(364) int locId = inboundBuffer.readUnsignedShort();
				if (!GlRenderer.enabled) {
					AttachLocRequest.push(x0Delta, entityId, resetLoops, setLoops, shape, z1Delta, z0Delta, locId, angle, z, x1Delta, x);
				}
			}
			if (opcode == 111) {
				@Pc(390) int position = inboundBuffer.readUnsignedByte();
				@Pc(400) int x = zoneX * 2 + (position >> 4 & 0xF);
				@Pc(408) int z = zoneZ * 2 + (position & 0xF);
				@Pc(414) int targetX = x + inboundBuffer.readByte();
				@Pc(421) int targetZ = z + inboundBuffer.readByte();
				@Pc(425) int sourceEntity = inboundBuffer.readShort();
				@Pc(429) int targetEntity = inboundBuffer.readShort();
				@Pc(433) int spotAnimId = inboundBuffer.readUnsignedShort();
				@Pc(437) int y = inboundBuffer.readByte();
				@Pc(443) int targetY = inboundBuffer.readUnsignedByte() * 4;
				@Pc(447) int startDelay = inboundBuffer.readUnsignedShort();
				@Pc(451) int endDelay = inboundBuffer.readUnsignedShort();
				@Pc(455) int local455 = inboundBuffer.readUnsignedByte();
				if (local455 == 255) {
					local455 = -1;
				}
				@Pc(465) int local465 = inboundBuffer.readUnsignedByte();
				if (x >= 0 && z >= 0 && x < 208 && z < 208 && targetX >= 0 && targetZ >= 0 && targetX < 208 && targetZ < 208 && spotAnimId != 65535) {
					@Pc(502) int targetZFine = targetZ * 64;
					@Pc(506) int targetXFine = targetX * 64;
					@Pc(510) int xFine = x * 64;
					@Pc(514) int zFine = z * 64;
					if (sourceEntity != 0) {
						@Pc(534) int local534;
						@Pc(542) PathingEntity entity;
						if (sourceEntity >= 0) {
							@Pc(528) int local528 = sourceEntity - 1;
							local534 = local528 >> 11 & 0xF;
							@Pc(538) int id = local528 & 0x7FF;
							entity = NpcList.npcs[id];
						} else {
							@Pc(549) int local549 = -sourceEntity - 1;
							local534 = local549 >> 11 & 0xF;
							@Pc(559) int id = local549 & 0x7FF;
							if (id == PlayerList.selfId) {
								entity = PlayerList.self;
							} else {
								entity = PlayerList.players[id];
							}
						}
						if (entity != null) {
							@Pc(581) BasType basType = entity.getBasType();
							if (basType.anIntArrayArray7 != null && basType.anIntArrayArray7[local534] != null) {
								y -= basType.anIntArrayArray7[local534][1];
								@Pc(607) int local607 = basType.anIntArrayArray7[local534][0];
								@Pc(612) int sine = MathUtils.SINE[entity.angle];
								@Pc(619) int local619 = basType.anIntArrayArray7[local534][2];
								@Pc(624) int cosine = MathUtils.COSINE[entity.angle];
								@Pc(634) int local634 = local607 * cosine + sine * local619 >> 16;
								local619 = cosine * local619 - local607 * sine >> 16;
								zFine += local619;
								xFine += local634;
							}
						}
					}
					@Pc(682) ProjAnim projAnim = new ProjAnim(spotAnimId, Player.level, xFine, zFine, SceneGraph.getTileHeight(Player.level, xFine, zFine) - y, startDelay + client.loop, client.loop + endDelay, local455, local465, targetEntity, targetY);
					projAnim.setTarget(SceneGraph.getTileHeight(Player.level, targetXFine, targetZFine) - targetY, targetXFine, client.loop + startDelay, targetZFine);
					Static1.projAnims.addTail(new ProjAnimNode(projAnim));
				}
			} else if (opcode == 158) {
				@Pc(715) int position = inboundBuffer.readUnsignedByte();
				@Pc(723) int x = (position >> 4 & 0x7) + zoneX;
				@Pc(729) int z = zoneZ + (position & 0x7);
				@Pc(733) int spotAnimId = inboundBuffer.readUnsignedShort();
				@Pc(737) int y = inboundBuffer.readUnsignedByte();
				@Pc(741) int delay = inboundBuffer.readUnsignedShort();
				if (x >= 0 && z >= 0 && x < 104 && z < 104) {
					@Pc(765) int zFine = z * 128 + 64;
					@Pc(771) int xFine = x * 128 + 64;
					@Pc(789) SpotAnim spotAnim = new SpotAnim(spotAnimId, Player.level, xFine, zFine, SceneGraph.getTileHeight(Player.level, xFine, zFine) - y, delay, client.loop);
					Static2.spotAnims.addTail(new SpotAnimNode(spotAnim));
				}
			} else if (opcode == 179) {
				@Pc(804) int seqId = inboundBuffer.readUnsignedShort();
				if (seqId == 65535) {
					seqId = -1;
				}
				@Pc(814) int shapeAndAngle = inboundBuffer.readUnsignedByteS();
				@Pc(818) int shape = shapeAndAngle >> 2;
				@Pc(822) int angle = shapeAndAngle & 0x3;
				@Pc(826) int layer = Loc.LAYERS[shape];
				@Pc(830) int offset = inboundBuffer.readUnsignedByte();
				@Pc(836) int z = (offset & 0x7) + zoneZ;
				@Pc(844) int x = zoneX + (offset >> 4 & 0x7);
				SceneGraph.method4250(Player.level, x, z, layer, shape, angle, seqId);
			} else if (opcode == 131) {
				@Pc(863) int shapeAndAngle = inboundBuffer.readUnsignedByteS();
				@Pc(867) int shape = shapeAndAngle >> 2;
				@Pc(871) int layer = Loc.LAYERS[shape];
				@Pc(875) int angle = shapeAndAngle & 0x3;
				@Pc(879) int id = inboundBuffer.readUnsignedShortLE();
				@Pc(883) int offset = inboundBuffer.readUnsignedByte();
				@Pc(889) int z = (offset & 0x7) + zoneZ;
				@Pc(897) int x = (offset >> 4 & 0x7) + zoneX;
				if (x >= 0 && z >= 0 && x < 104 && z < 104) {
					ChangeLocRequest.push(id, x, Player.level, z, angle, shape, layer, 0, -1);
				}
			} else if (opcode == 115) {
				@Pc(935) int id = inboundBuffer.readUnsignedShort();
				@Pc(939) int shape = inboundBuffer.readUnsignedByte();
				LocTypeList.get(id).isReady(shape);
			} else if (opcode == 232) {
				@Pc(954) int offset = inboundBuffer.readUnsignedByteC();
				@Pc(960) int z = zoneZ + (offset & 0x7);
				@Pc(968) int x = (offset >> 4 & 0x7) + zoneX;
				@Pc(972) int shapeAndAngle = inboundBuffer.readUnsignedByte();
				@Pc(976) int shape = shapeAndAngle >> 2;
				@Pc(980) int layer = Loc.LAYERS[shape];
				@Pc(984) int angle = shapeAndAngle & 0x3;
				if (x >= 0 && z >= 0 && x < 104 && z < 104) {
					ChangeLocRequest.push(-1, x, Player.level, z, angle, shape, layer, 0, -1);
				}
			} else if (opcode == 105) {
				@Pc(1022) int position = inboundBuffer.readUnsignedByte();
				@Pc(1030) int x = (position >> 4 & 0x7) + zoneX;
				@Pc(1036) int z = (position & 0x7) + zoneZ;
				@Pc(1042) int targetX = inboundBuffer.readByte() + x;
				@Pc(1048) int targetZ = inboundBuffer.readByte() + z;
				@Pc(1052) int targetEntity = inboundBuffer.readShort();
				@Pc(1056) int spotAnimId = inboundBuffer.readUnsignedShort();
				@Pc(1062) int y = inboundBuffer.readUnsignedByte() * 4;
				@Pc(1068) int targetY = inboundBuffer.readUnsignedByte() * 4;
				@Pc(1072) int startDelay = inboundBuffer.readUnsignedShort();
				@Pc(1076) int endDelay = inboundBuffer.readUnsignedShort();
				@Pc(1080) int local1080 = inboundBuffer.readUnsignedByte();
				@Pc(1084) int local1084 = inboundBuffer.readUnsignedByte();
				if (local1080 == 255) {
					local1080 = -1;
				}
				if (x >= 0 && z >= 0 && x < 104 && z < 104 && targetX >= 0 && targetZ >= 0 && targetX < 104 && targetZ < 104 && spotAnimId != 65535) {
					@Pc(1128) int zFine = z * 128 + 64;
					@Pc(1134) int targetXFine = targetX * 128 + 64;
					@Pc(1140) int targetZFine = targetZ * 128 + 64;
					@Pc(1146) int xFine = x * 128 + 64;
					@Pc(1173) ProjAnim projAnim = new ProjAnim(spotAnimId, Player.level, xFine, zFine, SceneGraph.getTileHeight(Player.level, xFine, zFine) - y, client.loop + startDelay, endDelay + client.loop, local1080, local1084, targetEntity, targetY);
					projAnim.setTarget(SceneGraph.getTileHeight(Player.level, targetXFine, targetZFine) - targetY, targetXFine, startDelay + client.loop, targetZFine);
					Static1.projAnims.addTail(new ProjAnimNode(projAnim));
				}
			} else if (opcode == 120) {
				@Pc(1203) int position = inboundBuffer.readUnsignedByteS();
				@Pc(1212) int x = zoneX + (position >> 4 & 0x7);
				@Pc(1218) int z = (position & 0x7) + zoneZ;
				@Pc(1222) int type = inboundBuffer.readUnsignedShortA();
				if (x >= 0 && z >= 0 && x < 104 && z < 104) {
					@Pc(1245) LinkedList objStacks = Static4.objStacks[Player.level][x][z];
					if (objStacks != null) {
						for (@Pc(1253) ObjStackNode node = (ObjStackNode) objStacks.head(); node != null; node = (ObjStackNode) objStacks.next()) {
							if ((type & 0x7FFF) == node.value.type) {
								node.unlink();
								break;
							}
						}
						if (objStacks.head() == null) {
							Static4.objStacks[Player.level][x][z] = null;
						}
						Static8.sortObjStack(x, z);
					}
				}
			} else if (opcode == 60) {
				@Pc(1306) int position = inboundBuffer.readUnsignedByteA();
				@Pc(1312) int z = zoneZ + (position & 0x7);
				@Pc(1320) int x = (position >> 4 & 0x7) + zoneX;
				@Pc(1324) int type = inboundBuffer.readUnsignedShortLE();
				@Pc(1328) int count = inboundBuffer.readUnsignedShortA();
				if (x >= 0 && z >= 0 && x < 104 && z < 104) {
					@Pc(1352) ObjStack objStack = new ObjStack();
					objStack.count = count;
					objStack.type = type;
					if (Static4.objStacks[Player.level][x][z] == null) {
						Static4.objStacks[Player.level][x][z] = new LinkedList();
					}
					Static4.objStacks[Player.level][x][z].addTail(new ObjStackNode(objStack));
					Static8.sortObjStack(x, z);
				}
			} else if (opcode == 144) {
				@Pc(1403) int position = inboundBuffer.readUnsignedByte();
				@Pc(1410) int z = zoneZ + (position & 0x7);
				@Pc(1419) int x = zoneX + (position >> 4 & 0x7);
				@Pc(1423) int id = inboundBuffer.readUnsignedShort();
				if (id == 65535) {
					id = -1;
				}
				@Pc(1433) int minDistanceAndLoops = inboundBuffer.readUnsignedByte();
				@Pc(1439) int minDistance = minDistanceAndLoops >> 4 & 0xF;
				@Pc(1443) int loops = minDistanceAndLoops & 0x7;
				@Pc(1447) int delay = inboundBuffer.readUnsignedByte();
				@Pc(1451) int volume = inboundBuffer.readUnsignedByte();
				if (x >= 0 && z >= 0 && x < 104 && z < 104) {
					@Pc(1474) int minDistanceP1 = minDistance + 1;
					if (x - minDistanceP1 <= PlayerList.self.movementQueueX[0] && PlayerList.self.movementQueueX[0] <= minDistanceP1 + x && z - minDistanceP1 <= PlayerList.self.movementQueueZ[0] && z + minDistanceP1 >= PlayerList.self.movementQueueZ[0] && Preferences.areaSoundsVolume != 0 && loops > 0 && SoundPlayer.size < 50 && id != -1) {
						SoundPlayer.ids[SoundPlayer.size] = id;
						SoundPlayer.loops[SoundPlayer.size] = loops;
						SoundPlayer.delays[SoundPlayer.size] = delay;
						SoundPlayer.sounds[SoundPlayer.size] = null;
						SoundPlayer.positions[SoundPlayer.size] = minDistance + (z << 8) + (x << 16);
						SoundPlayer.volumes[SoundPlayer.size] = volume;
						SoundPlayer.size++;
					}
				}
			} else if (opcode == 47) {
				@Pc(1577) int type = inboundBuffer.readUnsignedShortLEA();
				@Pc(1581) int playerId = inboundBuffer.readUnsignedShort();
				@Pc(1585) int count = inboundBuffer.readUnsignedShort();
				@Pc(1589) int position = inboundBuffer.readUnsignedByteA();
				@Pc(1597) int x = (position >> 4 & 0x7) + zoneX;
				@Pc(1603) int z = zoneZ + (position & 0x7);
				if (x >= 0 && z >= 0 && x < 104 && z < 104 && playerId != PlayerList.selfId) {
					@Pc(1629) ObjStack objStack = new ObjStack();
					objStack.count = count;
					objStack.type = type;
					if (Static4.objStacks[Player.level][x][z] == null) {
						Static4.objStacks[Player.level][x][z] = new LinkedList();
					}
					Static4.objStacks[Player.level][x][z].addTail(new ObjStackNode(objStack));
					Static8.sortObjStack(x, z);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZI)V")
	public static void readRebuildPacket(@OriginalArg(0) boolean dynamic) {
		Static5.dynamicArea = dynamic;
		if (!Static5.dynamicArea) {
			@Pc(377) boolean buildAreaChanged = Static27.setBuildArea(inboundBuffer.readUnsignedByteS());
			@Pc(381) int zoneZ = inboundBuffer.readUnsignedShort();
			@Pc(389) int mapSquares = (length - inboundBuffer.position) / 16;
			Static5.xteaKeys = new int[mapSquares][4];
			for (@Pc(395) int i = 0; i < mapSquares; i++) {
				for (@Pc(404) int j = 0; j < 4; j++) {
					Static5.xteaKeys[i][j] = inboundBuffer.readIntLE();
				}
			}
			@Pc(425) int level = inboundBuffer.readUnsignedByteC();
			@Pc(429) int localX = inboundBuffer.readUnsignedShortA();
			@Pc(433) int localZ = inboundBuffer.readUnsignedShort();
			@Pc(435) boolean tutorialIsland = false;
			@Pc(439) int zoneX = inboundBuffer.readUnsignedShort();
			if ((zoneX / 8 == 48 || zoneX / 8 == 49) && zoneZ / 8 == 48) {
				tutorialIsland = true;
			}
			Static4.underwaterMapGroupIds = new int[mapSquares];
			if (zoneX / 8 == 48 && zoneZ / 8 == 148) {
				tutorialIsland = true;
			}
			Static3.mapGroupIds = new int[mapSquares];
			Static1.mapBytes = new byte[mapSquares][];
			Static3.underwaterLocGroupIds = new int[mapSquares];
			Static1.locGroupIds = new int[mapSquares];
			Static7.npcBytes = null;
			Static7.underwaterMapBytes = new byte[mapSquares][];
			Static5.locBytes = new byte[mapSquares][];
			Static6.npcGroupIds = null;
			Static1.underwaterLocBytes = new byte[mapSquares][];
			Static7.mapSquares = new int[mapSquares];
			@Pc(504) int i = 0;
			for (@Pc(510) int mapX = (zoneX - 6) / 8; mapX <= (zoneX + 6) / 8; mapX++) {
				for (@Pc(523) int mapZ = (zoneZ - 6) / 8; mapZ <= (zoneZ + 6) / 8; mapZ++) {
					@Pc(536) int mapSquare = (mapX << 8) + mapZ;
					if (tutorialIsland && (mapZ == 49 || mapZ == 149 || mapZ == 147 || mapX == 50 || mapX == 49 && mapZ == 47)) {
						Static7.mapSquares[i] = mapSquare;
						Static3.mapGroupIds[i] = -1;
						Static1.locGroupIds[i] = -1;
						Static4.underwaterMapGroupIds[i] = -1;
						Static3.underwaterLocGroupIds[i] = -1;
					} else {
						Static7.mapSquares[i] = mapSquare;
						Static3.mapGroupIds[i] = client.js5Archive5.getGroupId("m" + mapX + "_" + mapZ);
						Static1.locGroupIds[i] = client.js5Archive5.getGroupId("l" + mapX + "_" + mapZ);
						Static4.underwaterMapGroupIds[i] = client.js5Archive5.getGroupId("um" + mapX + "_" + mapZ);
						Static3.underwaterLocGroupIds[i] = client.js5Archive5.getGroupId("ul" + mapX + "_" + mapZ);
					}
					i++;
				}
			}
			Static8.method2(false, zoneX, buildAreaChanged, localZ, localX, zoneZ, level);
			return;
		}
		@Pc(19) int localY = inboundBuffer.readUnsignedShortLEA();
		@Pc(23) int zoneY = inboundBuffer.readUnsignedShortA();
		@Pc(27) int zoneX = inboundBuffer.readUnsignedShortLE();
		inboundBuffer.startBitAccess();
		for (@Pc(32) int level = 0; level < 4; level++) {
			for (@Pc(39) int x = 0; x < 13; x++) {
				for (@Pc(46) int z = 0; z < 13; z++) {
					@Pc(56) int local56 = inboundBuffer.readBits(1);
					if (local56 == 1) {
						Static7.zones[level][x][z] = inboundBuffer.readBits(26);
					} else {
						Static7.zones[level][x][z] = -1;
					}
				}
			}
		}
		inboundBuffer.finishBitAccess();
		@Pc(104) int mapSquares = (length - inboundBuffer.position) / 16;
		Static5.xteaKeys = new int[mapSquares][4];
		for (@Pc(110) int i = 0; i < mapSquares; i++) {
			for (@Pc(115) int j = 0; j < 4; j++) {
				Static5.xteaKeys[i][j] = inboundBuffer.readIntAlt3();
			}
		}
		@Pc(138) int localX = inboundBuffer.readUnsignedShort();
		@Pc(144) boolean buildAreaChanged = Static27.setBuildArea(inboundBuffer.readUnsignedByteS());
		@Pc(148) int level = inboundBuffer.readUnsignedByteA();
		Static3.underwaterLocGroupIds = new int[mapSquares];
		Static7.npcBytes = null;
		Static7.underwaterMapBytes = new byte[mapSquares][];
		Static7.mapSquares = new int[mapSquares];
		Static6.npcGroupIds = null;
		Static4.underwaterMapGroupIds = new int[mapSquares];
		Static3.mapGroupIds = new int[mapSquares];
		Static1.underwaterLocBytes = new byte[mapSquares][];
		Static5.locBytes = new byte[mapSquares][];
		Static1.locGroupIds = new int[mapSquares];
		Static1.mapBytes = new byte[mapSquares][];
		@Pc(182) int i = 0;
		for (@Pc(184) int level0 = 0; level0 < 4; level0++) {
			for (@Pc(189) int x = 0; x < 13; x++) {
				for (@Pc(194) int z = 0; z < 13; z++) {
					@Pc(207) int zone = Static7.zones[level0][x][z];
					if (zone != -1) {
						@Pc(217) int srcX = zone >> 14 & 0x3FF;
						@Pc(223) int srcZ = zone >> 3 & 0x7FF;
						@Pc(233) int mapSquare = (srcX / 8 << 8) + srcZ / 8;
						for (@Pc(235) int local235 = 0; local235 < i; local235++) {
							if (Static7.mapSquares[local235] == mapSquare) {
								mapSquare = -1;
								break;
							}
						}
						if (mapSquare != -1) {
							Static7.mapSquares[i] = mapSquare;
							@Pc(272) int mapX = mapSquare >> 8 & 0xFF;
							@Pc(276) int mapZ = mapSquare & 0xFF;
							Static3.mapGroupIds[i] = client.js5Archive5.getGroupId("m" + mapX + "_" + mapZ);
							Static1.locGroupIds[i] = client.js5Archive5.getGroupId("l" + mapX + "_" + mapZ);
							Static4.underwaterMapGroupIds[i] = client.js5Archive5.getGroupId("um" + mapX + "_" + mapZ);
							Static3.underwaterLocGroupIds[i] = client.js5Archive5.getGroupId("ul" + mapX + "_" + mapZ);
							i++;
						}
					}
				}
			}
		}
		Static8.method2(false, zoneX, buildAreaChanged, localY, localX, zoneY, level);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	private static void readPlayerInfoPacket() {
		removedCount = 0;
		extendedCount = 0;
		readSelfPlayerInfo();
		readPlayerInfo();
		readNewPlayerInfo();
		readExtendedPlayerInfo();
		for (@Pc(19) int i = 0; i < removedCount; i++) {
			@Pc(34) int id = removedIds[i];
			if (client.loop != PlayerList.players[id].lastSeenLoop) {
				if (PlayerList.players[id].soundRadius > 0) {
					AreaSoundManager.remove(PlayerList.players[id]);
				}
				PlayerList.players[id] = null;
			}
		}
		if (inboundBuffer.position != length) {
			throw new RuntimeException("gpp1 pos:" + inboundBuffer.position + " psize:" + length);
		}
		for (@Pc(85) int i = 0; i < PlayerList.size; i++) {
			if (PlayerList.players[PlayerList.ids[i]] == null) {
				throw new RuntimeException("gpp2 pos:" + i + " size:" + PlayerList.size);
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
	private static void readSelfPlayerInfo() {
		inboundBuffer.startBitAccess();
		@Pc(7) int updated = inboundBuffer.readBits(1);
		if (updated == 0) {
			return;
		}
		@Pc(19) int type = inboundBuffer.readBits(2);
		if (type == 0) {
			extendedIds[extendedCount++] = 2047;
		} else if (type == 1) {
			@Pc(42) int direction = inboundBuffer.readBits(3);
			PlayerList.self.move(direction, 1);
			@Pc(54) int extendedUpate = inboundBuffer.readBits(1);
			if (extendedUpate == 1) {
				extendedIds[extendedCount++] = 2047;
			}
		} else if (type == 2) {
			if (inboundBuffer.readBits(1) == 1) {
				@Pc(82) int firstDirection = inboundBuffer.readBits(3);
				PlayerList.self.move(firstDirection, 2);
				@Pc(92) int secondDirection = inboundBuffer.readBits(3);
				PlayerList.self.move(secondDirection, 2);
			} else {
				@Pc(104) int direction = inboundBuffer.readBits(3);
				PlayerList.self.move(direction, 0);
			}
			@Pc(114) int extended = inboundBuffer.readBits(1);
			if (extended == 1) {
				extendedIds[extendedCount++] = 2047;
			}
		} else if (type == 3) {
			@Pc(137) int z = inboundBuffer.readBits(7);
			@Pc(142) int clearMovementQueue = inboundBuffer.readBits(1);
			@Pc(147) int extended = inboundBuffer.readBits(1);
			if (extended == 1) {
				extendedIds[extendedCount++] = 2047;
			}
			Player.level = inboundBuffer.readBits(2);
			@Pc(171) int x = inboundBuffer.readBits(7);
			PlayerList.self.teleport(x, z, clearMovementQueue == 1);
		}
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
	private static void readPlayerInfo() {
		@Pc(6) int size = inboundBuffer.readBits(8);
		if (PlayerList.size > size) {
			for (@Pc(23) int i = size; i < PlayerList.size; i++) {
				removedIds[removedCount++] = PlayerList.ids[i];
			}
		}
		if (size > PlayerList.size) {
			throw new RuntimeException("gppov1");
		}
		PlayerList.size = 0;
		for (@Pc(55) int i = 0; i < size; i++) {
			@Pc(62) int id = PlayerList.ids[i];
			@Pc(66) Player player = PlayerList.players[id];
			@Pc(73) int updated = inboundBuffer.readBits(1);
			if (updated == 0) {
				PlayerList.ids[PlayerList.size++] = id;
				player.lastSeenLoop = client.loop;
			} else {
				@Pc(94) int type = inboundBuffer.readBits(2);
				if (type == 0) {
					PlayerList.ids[PlayerList.size++] = id;
					player.lastSeenLoop = client.loop;
					extendedIds[Protocol.extendedCount++] = id;
				} else if (type == 1) {
					PlayerList.ids[PlayerList.size++] = id;
					player.lastSeenLoop = client.loop;
					@Pc(140) int direction = inboundBuffer.readBits(3);
					player.move(direction, 1);
					@Pc(150) int extended = inboundBuffer.readBits(1);
					if (extended == 1) {
						extendedIds[Protocol.extendedCount++] = id;
					}
				} else if (type == 2) {
					PlayerList.ids[PlayerList.size++] = id;
					player.lastSeenLoop = client.loop;
					if (inboundBuffer.readBits(1) == 1) {
						@Pc(193) int firstDirection = inboundBuffer.readBits(3);
						player.move(firstDirection, 2);
						@Pc(205) int secondDirection = inboundBuffer.readBits(3);
						player.move(secondDirection, 2);
					} else {
						@Pc(219) int direction = inboundBuffer.readBits(3);
						player.move(direction, 0);
					}
					@Pc(229) int extended = inboundBuffer.readBits(1);
					if (extended == 1) {
						extendedIds[Protocol.extendedCount++] = id;
					}
				} else if (type == 3) {
					removedIds[removedCount++] = id;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
	private static void readNewPlayerInfo() {
		while (true) {
			if (inboundBuffer.readableBits(length) >= 11) {
				@Pc(18) int id = inboundBuffer.readBits(11);
				if (id != 2047) {
					@Pc(27) boolean created = false;
					if (PlayerList.players[id] == null) {
						created = true;
						PlayerList.players[id] = new Player();
						if (PlayerList.appearanceCache[id] != null) {
							PlayerList.players[id].decodeAppearance(PlayerList.appearanceCache[id]);
						}
					}
					PlayerList.ids[PlayerList.size++] = id;
					@Pc(65) Player player = PlayerList.players[id];
					player.lastSeenLoop = client.loop;
					@Pc(75) int angle = PathingEntity.ANGLES[inboundBuffer.readBits(3)];
					if (created) {
						player.targetAngle = player.angle = angle;
					}
					@Pc(88) int x = inboundBuffer.readBits(5);
					if (x > 15) {
						x -= 32;
					}
					@Pc(97) int clearMovementQueue = inboundBuffer.readBits(1);
					@Pc(102) int extended = inboundBuffer.readBits(1);
					if (extended == 1) {
						extendedIds[extendedCount++] = id;
					}
					@Pc(119) int z = inboundBuffer.readBits(5);
					if (z > 15) {
						z -= 32;
					}
					player.teleport(PlayerList.self.movementQueueX[0] + x, PlayerList.self.movementQueueZ[0] + z, clearMovementQueue == 1);
					continue;
				}
			}
			inboundBuffer.finishBitAccess();
			return;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	private static void readExtendedPlayerInfo() {
		for (@Pc(13) int i = 0; i < extendedCount; i++) {
			@Pc(24) int id = extendedIds[i];
			@Pc(28) Player player = PlayerList.players[id];
			@Pc(32) int flags = inboundBuffer.readUnsignedByte();
			if ((flags & 0x80) != 0) {
				flags += inboundBuffer.readUnsignedByte() << 8;
			}
			readExtendedPlayerInfo(player, id, flags);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIILclient!f;)V")
	private static void readExtendedPlayerInfo(@OriginalArg(3) Player player, @OriginalArg(0) int id, @OriginalArg(1) int flags) {
		if ((flags & 0x1) != 0) {
			@Pc(14) int damage = inboundBuffer.readUnsignedShortSmart();
			@Pc(18) int type = inboundBuffer.readUnsignedByte();
			player.addHit(client.loop, type, damage);
			player.hitpointsBarVisibleUntil = client.loop + 300;
			player.hitpointsBar = inboundBuffer.readUnsignedByteC();
		}
		if ((flags & 0x2) != 0) {
			@Pc(43) int seqId = inboundBuffer.readUnsignedShort();
			if (seqId == 65535) {
				seqId = -1;
			}
			@Pc(53) int delay = inboundBuffer.readUnsignedByte();
			Player.animate(player, seqId, delay);
		}
		if ((flags & 0x8) != 0) {
			@Pc(68) int len = inboundBuffer.readUnsignedByteC();
			@Pc(71) byte[] bytes = new byte[len];
			@Pc(76) Buffer buffer = new Buffer(bytes);
			inboundBuffer.readBytesA(bytes, len);
			PlayerList.appearanceCache[id] = buffer;
			player.decodeAppearance(buffer);
		}
		if ((flags & 0x4) != 0) {
			player.faceX = inboundBuffer.readUnsignedShortLE();
			player.faceY = inboundBuffer.readUnsignedShort();
		}
		if ((flags & 0x800) != 0) {
			@Pc(117) int len = inboundBuffer.readUnsignedByteA();
			@Pc(120) int[] seqIds = new int[len];
			@Pc(123) int[] delays = new int[len];
			@Pc(126) int[] slotMasks = new int[len];
			for (@Pc(128) int i = 0; i < len; i++) {
				@Pc(135) int seqId = inboundBuffer.readUnsignedShort();
				if (seqId == 65535) {
					seqId = -1;
				}
				seqIds[i] = seqId;
				delays[i] = inboundBuffer.readUnsignedByteS();
				slotMasks[i] = inboundBuffer.readUnsignedShortLEA();
			}
			Player.method4023(player, seqIds, delays, slotMasks);
		}
		if ((flags & 0x10) != 0) {
			player.chatMessage = inboundBuffer.readString();
			if (player.chatMessage.charAt(0) == '~') {
				player.chatMessage = player.chatMessage.substring(1);
				Chat.add(2, player.getName(), player.chatMessage);
			} else if (player == PlayerList.self) {
				Chat.add(2, player.getName(), player.chatMessage);
			}
			player.chatEffect = 0;
			player.chatColor = 0;
			player.chatLoops = 150;
		}
		if ((flags & 0x20) != 0) {
			@Pc(232) int chatFlags = inboundBuffer.readUnsignedShortA();
			@Pc(236) int staffModelLevel = inboundBuffer.readUnsignedByteA();
			@Pc(244) boolean quickChat = (chatFlags & 0x8000) != 0;
			@Pc(248) int len = inboundBuffer.readUnsignedByteS();
			@Pc(251) int off = inboundBuffer.position;
			if (player.username != null && player.appearance != null) {
				@Pc(264) long encodedUsername = Base37.encode(player.username);
				@Pc(266) boolean ignore = false;
				if (staffModelLevel <= 1) {
					if (!quickChat && (LoginManager.playerUnderage && !LoginManager.parentalChatConsent || LoginManager.mapQuickChat)) {
						ignore = true;
					} else {
						for (@Pc(284) int i = 0; i < IgnoreList.size; i++) {
							if (encodedUsername == IgnoreList.encodedUsernames[i]) {
								ignore = true;
								break;
							}
						}
					}
				}
				if (!ignore && Player.inTutorialIsland == 0) {
					chatBuffer.position = 0;
					@Pc(314) int phraseId = -1;
					inboundBuffer.readBytesReverse(chatBuffer.bytes, len);
					chatBuffer.position = 0;
					@Pc(333) String message;
					if (quickChat) {
						chatFlags &= 32767;
						@Pc(343) QuickChatPhrase phrase = QuickChatPhrase.decode(chatBuffer);
						phraseId = phrase.id;
						message = phrase.type.decodeMessage(chatBuffer);
					} else {
						message = StringUtils.escape(StringUtils.formatChatMessage(WordPack.readString(chatBuffer)));
					}
					player.chatMessage = message.trim();
					player.chatEffect = chatFlags & 0xFF;
					player.chatLoops = 150;
					player.chatColor = chatFlags >> 8;
					if (staffModelLevel == 2) {
						Chat.add(quickChat ? 17 : 1, "<img=1>" + player.getName(), message, null, phraseId);
					} else if (staffModelLevel == 1) {
						Chat.add(quickChat ? 17 : 1, "<img=0>" + player.getName(), message, null, phraseId);
					} else {
						Chat.add(quickChat ? 17 : 2, player.getName(), message, null, phraseId);
					}
				}
			}
			inboundBuffer.position = off + len;
		}
		if ((flags & 0x100) != 0) {
			@Pc(450) int spotAnimId = inboundBuffer.readUnsignedShortLE();
			@Pc(454) int yAndDelay = inboundBuffer.readInt();
			@Pc(456) boolean play = true;
			if (spotAnimId == 65535) {
				spotAnimId = -1;
			}
			if (spotAnimId != -1 && player.spotAnimId != -1 && SeqTypeList.get(SpotAnimTypeList.get(spotAnimId).seqId).priority < SeqTypeList.get(SpotAnimTypeList.get(player.spotAnimId).seqId).priority) {
				play = false;
			}
			if (play) {
				player.anInt3976 = 1;
				player.spotAnimY = yAndDelay >> 16;
				player.anInt3968 = 0;
				player.anInt4026 = 0;
				player.spotAnimStart = (yAndDelay & 0xFFFF) + client.loop;
				if (client.loop < player.spotAnimStart) {
					player.anInt4026 = -1;
				}
				player.spotAnimId = spotAnimId;
				if (player.spotAnimId != -1 && client.loop == player.spotAnimStart) {
					@Pc(553) int seqId = SpotAnimTypeList.get(player.spotAnimId).seqId;
					if (seqId != -1) {
						@Pc(562) SeqType seqType = SeqTypeList.get(seqId);
						if (seqType != null && seqType.frames != null) {
							SoundPlayer.playSeqSound(seqType, player.xFine, player.zFine, 0, player == PlayerList.self);
						}
					}
				}
			}
		}
		if ((flags & 0x40) != 0) {
			player.faceEntity = inboundBuffer.readUnsignedShortA();
			if (player.faceEntity == 65535) {
				player.faceEntity = -1;
			}
		}
		if ((flags & 0x200) != 0) {
			player.anInt3973 = inboundBuffer.readUnsignedByteA();
			player.anInt4033 = inboundBuffer.readUnsignedByte();
			player.anInt4013 = inboundBuffer.readUnsignedByteS();
			player.anInt4025 = inboundBuffer.readUnsignedByteA();
			player.anInt4034 = inboundBuffer.readUnsignedShortLEA() + client.loop;
			player.anInt3966 = inboundBuffer.readUnsignedShortLEA() + client.loop;
			player.anInt4008 = inboundBuffer.readUnsignedByteC();
			player.movementQueueSize = 1;
			player.anInt4030 = 0;
		}
		if ((flags & 0x400) != 0) {
			@Pc(670) int damage = inboundBuffer.readUnsignedShortSmart();
			@Pc(674) int type = inboundBuffer.readUnsignedByte();
			player.addHit(client.loop, type, damage);
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
	private static void readNpcInfoPacket() {
		extendedCount = 0;
		removedCount = 0;
		readNpcInfo();
		readNewNpcInfo();
		readExtendedNpcInfo();
		for (@Pc(17) int i = 0; i < removedCount; i++) {
			@Pc(28) int id = removedIds[i];
			if (client.loop != NpcList.npcs[id].lastSeenLoop) {
				if (NpcList.npcs[id].type.hasAreaSound()) {
					AreaSoundManager.remove(NpcList.npcs[id]);
				}
				NpcList.npcs[id].setType(null);
				NpcList.npcs[id] = null;
			}
		}
		if (inboundBuffer.position != length) {
			throw new RuntimeException("gnp1 pos:" + inboundBuffer.position + " psize:" + length);
		}
		for (@Pc(87) int i = 0; i < NpcList.size; i++) {
			if (NpcList.npcs[NpcList.ids[i]] == null) {
				throw new RuntimeException("gnp2 pos:" + i + " size:" + NpcList.size);
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
	private static void readNpcInfo() {
		inboundBuffer.startBitAccess();
		@Pc(13) int size = inboundBuffer.readBits(8);
		if (size < NpcList.size) {
			for (@Pc(23) int i = size; i < NpcList.size; i++) {
				removedIds[removedCount++] = NpcList.ids[i];
			}
		}
		if (size > NpcList.size) {
			throw new RuntimeException("gnpov1");
		}
		NpcList.size = 0;
		for (@Pc(62) int i = 0; i < size; i++) {
			@Pc(73) int id = NpcList.ids[i];
			@Pc(77) Npc npc = NpcList.npcs[id];
			@Pc(82) int updated = inboundBuffer.readBits(1);
			if (updated == 0) {
				NpcList.ids[NpcList.size++] = id;
				npc.lastSeenLoop = client.loop;
			} else {
				@Pc(106) int type = inboundBuffer.readBits(2);
				if (type == 0) {
					NpcList.ids[NpcList.size++] = id;
					npc.lastSeenLoop = client.loop;
					extendedIds[extendedCount++] = id;
				} else if (type == 1) {
					NpcList.ids[NpcList.size++] = id;
					npc.lastSeenLoop = client.loop;
					@Pc(151) int direction = inboundBuffer.readBits(3);
					npc.move(direction, 1);
					@Pc(161) int extended = inboundBuffer.readBits(1);
					if (extended == 1) {
						extendedIds[extendedCount++] = id;
					}
				} else if (type == 2) {
					NpcList.ids[NpcList.size++] = id;
					npc.lastSeenLoop = client.loop;
					if (inboundBuffer.readBits(1) == 1) {
						@Pc(215) int firstDirection = inboundBuffer.readBits(3);
						npc.move(firstDirection, 2);
						@Pc(227) int secondDirection = inboundBuffer.readBits(3);
						npc.move(secondDirection, 2);
					} else {
						@Pc(201) int direction = inboundBuffer.readBits(3);
						npc.move(direction, 0);
					}
					@Pc(237) int extended = inboundBuffer.readBits(1);
					if (extended == 1) {
						extendedIds[extendedCount++] = id;
					}
				} else if (type == 3) {
					removedIds[removedCount++] = id;
				}
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	private static void readNewNpcInfo() {
		while (true) {
			if (inboundBuffer.readableBits(length) >= 27) {
				@Pc(22) int id = inboundBuffer.readBits(15);
				if (id != 32767) {
					@Pc(31) boolean created = false;
					if (NpcList.npcs[id] == null) {
						created = true;
						NpcList.npcs[id] = new Npc();
					}
					@Pc(49) Npc npc = NpcList.npcs[id];
					NpcList.ids[NpcList.size++] = id;
					npc.lastSeenLoop = client.loop;
					if (npc.type != null && npc.type.hasAreaSound()) {
						AreaSoundManager.remove(npc);
					}
					@Pc(77) int z = inboundBuffer.readBits(5);
					if (z > 15) {
						z -= 32;
					}
					@Pc(89) int angle = PathingEntity.ANGLES[inboundBuffer.readBits(3)];
					if (created) {
						npc.targetAngle = npc.angle = angle;
					}
					@Pc(102) int x = inboundBuffer.readBits(5);
					npc.setType(NpcTypeList.get(inboundBuffer.readBits(14)));
					@Pc(116) int extended = inboundBuffer.readBits(1);
					if (x > 15) {
						x -= 32;
					}
					if (extended == 1) {
						extendedIds[extendedCount++] = id;
					}
					@Pc(139) int clearMovementQueue = inboundBuffer.readBits(1);
					npc.setSize(npc.type.size);
					npc.basId = npc.type.basId;
					npc.anInt4009 = npc.type.anInt5243;
					if (npc.anInt4009 == 0) {
						npc.angle = 0;
					}
					npc.teleport(x + PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0] + z, clearMovementQueue == 1, npc.getSize());
					if (npc.type.hasAreaSound()) {
						AreaSoundManager.add(Player.level, npc.movementQueueX[0], npc.movementQueueZ[0], null, 0, npc, null);
					}
					continue;
				}
			}
			inboundBuffer.finishBitAccess();
			return;
		}
	}

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)V")
	private static void readExtendedNpcInfo() {
		for (@Pc(3) int i = 0; i < extendedCount; i++) {
			@Pc(10) int id = extendedIds[i];
			@Pc(14) Npc npc = NpcList.npcs[id];
			@Pc(18) int flags = inboundBuffer.readUnsignedByte();
			if ((flags & 0x1) != 0) {
				flags += inboundBuffer.readUnsignedByte() << 8;
			}
			if ((flags & 0x40) != 0) {
				@Pc(43) int damage = inboundBuffer.readUnsignedByteC();
				@Pc(49) int type = inboundBuffer.readUnsignedByteS();
				npc.addHit(client.loop, type, damage);
				npc.hitpointsBarVisibleUntil = client.loop + 300;
				npc.hitpointsBar = inboundBuffer.readUnsignedByteC();
			}
			if ((flags & 0x100) != 0) {
				@Pc(74) int len = inboundBuffer.readUnsignedByteA();
				@Pc(77) int[] delays = new int[len];
				@Pc(80) int[] slotMasks = new int[len];
				@Pc(83) int[] seqIds = new int[len];
				for (@Pc(85) int j = 0; j < len; j++) {
					@Pc(96) int seqId = inboundBuffer.readUnsignedShortLE();
					if (seqId == 65535) {
						seqId = -1;
					}
					seqIds[j] = seqId;
					delays[j] = inboundBuffer.readUnsignedByteC();
					slotMasks[j] = inboundBuffer.readUnsignedShortLEA();
				}
				Npc.method555(npc, seqIds, delays, slotMasks);
			}
			if ((flags & 0x10) != 0) {
				@Pc(141) int damage = inboundBuffer.readUnsignedByteA();
				@Pc(145) int type = inboundBuffer.readUnsignedByteS();
				npc.addHit(client.loop, type, damage);
			}
			if ((flags & 0x2) != 0) {
				if (npc.type.hasAreaSound()) {
					AreaSoundManager.remove(npc);
				}
				npc.setType(NpcTypeList.get(inboundBuffer.readUnsignedShortA()));
				npc.setSize(npc.type.size);
				npc.anInt4009 = npc.type.anInt5243;
				npc.basId = npc.type.basId;
				if (npc.type.hasAreaSound()) {
					AreaSoundManager.add(Player.level, npc.movementQueueX[0], npc.movementQueueZ[0], null, 0, npc, null);
				}
			}
			if ((flags & 0x200) != 0) {
				npc.faceX = inboundBuffer.readUnsignedShortLEA();
				npc.faceY = inboundBuffer.readUnsignedShort();
			}
			if ((flags & 0x20) != 0) {
				@Pc(238) int seqId = inboundBuffer.readUnsignedShort();
				if (seqId == 65535) {
					seqId = -1;
				}
				@Pc(250) int delay = inboundBuffer.readUnsignedByteS();
				Npc.animate(npc, seqId, delay);
			}
			if ((flags & 0x4) != 0) {
				@Pc(266) int spotAnimId = inboundBuffer.readUnsignedShortA();
				@Pc(270) int yAndDelay = inboundBuffer.readInt();
				@Pc(272) boolean play = true;
				if (spotAnimId == 65535) {
					spotAnimId = -1;
				}
				if (spotAnimId != -1 && npc.spotAnimId != -1 && SeqTypeList.get(SpotAnimTypeList.get(spotAnimId).seqId).priority < SeqTypeList.get(SpotAnimTypeList.get(npc.spotAnimId).seqId).priority) {
					play = false;
				}
				if (play) {
					npc.anInt3968 = 0;
					npc.anInt4026 = 0;
					npc.anInt3976 = 1;
					npc.spotAnimStart = (yAndDelay & 0xFFFF) + client.loop;
					if (npc.spotAnimStart > client.loop) {
						npc.anInt4026 = -1;
					}
					npc.spotAnimY = yAndDelay >> 16;
					npc.spotAnimId = spotAnimId;
					if (npc.spotAnimId != -1 && client.loop == npc.spotAnimStart) {
						@Pc(358) int seqId = SpotAnimTypeList.get(npc.spotAnimId).seqId;
						if (seqId != -1) {
							@Pc(365) SeqType seqType = SeqTypeList.get(seqId);
							if (seqType != null && seqType.frames != null) {
								SoundPlayer.playSeqSound(seqType, npc.xFine, npc.zFine, 0, false);
							}
						}
					}
				}
			}
			if ((flags & 0x8) != 0) {
				npc.faceEntity = inboundBuffer.readUnsignedShortLE();
				if (npc.faceEntity == 65535) {
					npc.faceEntity = -1;
				}
			}
			if ((flags & 0x80) != 0) {
				npc.chatMessage = inboundBuffer.readString();
				npc.chatLoops = 100;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V")
	public static void transmitVerifyId() {
		outboundBuffer.writeOpcode(156);
		outboundBuffer.writeShort(verifyId);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BI)Z")
	private static boolean setVerifyId(@OriginalArg(1) int verifyId) {
		Protocol.verifyId = verifyId + 1 & 0xFFFF;
		verifyIdChanged = true;
		return true;
	}
}
