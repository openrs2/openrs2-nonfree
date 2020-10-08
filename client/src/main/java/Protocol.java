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

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)Z")
	public static boolean readPacket() {
		try {
			return readPacketInternal();
		} catch (@Pc(16) IOException ex) {
			Static23.method2455();
			return true;
		} catch (@Pc(21) Exception ex) {
			@Pc(63) String message = "T2 - " + opcode + "," + Static3.anInt2273 + "," + Static2.anInt1231 + " - " + length + "," + (Static5.originX + PlayerList.self.anIntArray422[0]) + "," + (Static7.originZ + PlayerList.self.anIntArray426[0]) + " - ";
			for (@Pc(65) int i = 0; i < length && i < 50; i++) {
				message = message + inboundBuffer.bytes[i] + ",";
			}
			TracingException.report(ex, message);
			Static19.method1818();
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
		if (length > available) {
			return false;
		}
		inboundBuffer.position = 0;
		socket.read(inboundBuffer.bytes, 0, length);
		Static2.anInt1231 = Static3.anInt2273;
		Static3.anInt2273 = Static4.anInt3335;
		Static3.anInt2583 = 0;
		Static4.anInt3335 = opcode;
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
			@Pc(180) int local180 = inboundBuffer.readInt();
			@Pc(184) int local184 = inboundBuffer.readUnsignedShort();
			@Pc(193) Component component;
			if (local180 >= 0) {
				component = InterfaceList.getComponent(local180);
			} else {
				component = null;
			}
			if (local180 < -70000) {
				local184 += 32768;
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
				Inv.set(local184, slot, id - 1, count);
			}
			if (component != null) {
				Static28.method3270(component);
			}
			Static21.method2062();
			Static7.anIntArray656[Static2.anInt959++ & 0x1F] = local184 & 0x7FFF;
			opcode = -1;
			return true;
		} else if (opcode == 53) {
			Static1.anInt818 = inboundBuffer.readUnsignedByteS();
			Static1.anInt894 = inboundBuffer.readUnsignedByteA();
			while (length > inboundBuffer.position) {
				opcode = inboundBuffer.readUnsignedByte();
				readZonePacket();
			}
			opcode = -1;
			return true;
		} else if (opcode == 192) {
			Static19.method1818();
			opcode = -1;
			return false;
		} else if (opcode == 176) {
			@Pc(356) int local356 = inboundBuffer.readUnsignedShort();
			@Pc(360) int local360 = inboundBuffer.readUnsignedShortLEA();
			@Pc(364) byte local364 = inboundBuffer.readByteC();
			if (Static35.method4381(local356)) {
				DelayedStateChange.setVarcServer(local360, local364);
			}
			opcode = -1;
			return true;
		} else if (opcode == 4) {
			Static7.anInt5497 = inboundBuffer.readUnsignedByte();
			Static3.anInt2102 = Static6.anInt4979;
			opcode = -1;
			return true;
		} else if (opcode == 35) {
			@Pc(401) int local401 = inboundBuffer.readUnsignedByteC();
			@Pc(405) int local405 = inboundBuffer.readUnsignedShortLEA();
			@Pc(409) int local409 = inboundBuffer.readIntLE();
			@Pc(413) int local413 = inboundBuffer.readUnsignedShortLE();
			if (Static35.method4381(local405)) {
				@Pc(425) Class4_Sub27 local425 = (Class4_Sub27) Static4.aClass84_13.get((long) local409);
				if (local425 != null) {
					Static28.method3246(local413 != local425.anInt4620, local425);
				}
				Static10.method318(local413, local401, local409);
			}
			opcode = -1;
			return true;
		} else if (opcode == 59) {
			@Pc(462) String local462 = inboundBuffer.readString();
			if (local462.endsWith(":tradereq:")) {
				@Pc(912) String local912 = local462.substring(0, local462.indexOf(":"));
				@Pc(914) boolean local914 = false;
				@Pc(918) long local918 = Base37.encode(local912);
				for (@Pc(920) int local920 = 0; local920 < Static6.anInt4516; local920++) {
					if (Static3.aLongArray16[local920] == local918) {
						local914 = true;
						break;
					}
				}
				if (!local914 && Static3.anInt5405 == 0) {
					Static26.method4357(local912, 4, LocalisedText.TRADEREQ);
				}
			} else if (local462.endsWith(":chalreq:")) {
				@Pc(851) String local851 = local462.substring(0, local462.indexOf(":"));
				@Pc(853) boolean local853 = false;
				@Pc(859) long local859 = Base37.encode(local851);
				for (@Pc(861) int local861 = 0; local861 < Static6.anInt4516; local861++) {
					if (Static3.aLongArray16[local861] == local859) {
						local853 = true;
						break;
					}
				}
				if (!local853 && Static3.anInt5405 == 0) {
					@Pc(898) String local898 = local462.substring(local462.indexOf(":") + 1, local462.length() - 9);
					Static26.method4357(local851, 8, local898);
				}
			} else if (local462.endsWith(":assistreq:")) {
				@Pc(481) String local481 = local462.substring(0, local462.indexOf(":"));
				@Pc(485) long local485 = Base37.encode(local481);
				@Pc(487) boolean local487 = false;
				for (@Pc(489) int local489 = 0; local489 < Static6.anInt4516; local489++) {
					if (local485 == Static3.aLongArray16[local489]) {
						local487 = true;
						break;
					}
				}
				if (!local487 && Static3.anInt5405 == 0) {
					Static26.method4357(local481, 10, "");
				}
			} else if (local462.endsWith(":clan:")) {
				@Pc(837) String local837 = local462.substring(0, local462.indexOf(":clan:"));
				Static26.method4357("", 11, local837);
			} else if (local462.endsWith(":trade:")) {
				@Pc(818) String local818 = local462.substring(0, local462.indexOf(":trade:"));
				if (Static3.anInt5405 == 0) {
					Static26.method4357("", 12, local818);
				}
			} else if (local462.endsWith(":assist:")) {
				@Pc(542) String local542 = local462.substring(0, local462.indexOf(":assist:"));
				if (Static3.anInt5405 == 0) {
					Static26.method4357("", 13, local542);
				}
			} else if (local462.endsWith(":duelstake:")) {
				@Pc(767) String local767 = local462.substring(0, local462.indexOf(":"));
				@Pc(773) long local773 = Base37.encode(local767);
				@Pc(775) boolean local775 = false;
				for (@Pc(777) int local777 = 0; local777 < Static6.anInt4516; local777++) {
					if (Static3.aLongArray16[local777] == local773) {
						local775 = true;
						break;
					}
				}
				if (!local775 && Static3.anInt5405 == 0) {
					Static26.method4357(local767, 14, "");
				}
			} else if (local462.endsWith(":duelfriend:")) {
				@Pc(715) String local715 = local462.substring(0, local462.indexOf(":"));
				@Pc(717) boolean local717 = false;
				@Pc(721) long local721 = Base37.encode(local715);
				for (@Pc(723) int local723 = 0; local723 < Static6.anInt4516; local723++) {
					if (local721 == Static3.aLongArray16[local723]) {
						local717 = true;
						break;
					}
				}
				if (!local717 && Static3.anInt5405 == 0) {
					Static26.method4357(local715, 15, "");
				}
			} else if (local462.endsWith(":clanreq:")) {
				@Pc(667) String local667 = local462.substring(0, local462.indexOf(":"));
				@Pc(671) long local671 = Base37.encode(local667);
				@Pc(673) boolean local673 = false;
				for (@Pc(675) int local675 = 0; local675 < Static6.anInt4516; local675++) {
					if (local671 == Static3.aLongArray16[local675]) {
						local673 = true;
						break;
					}
				}
				if (!local673 && Static3.anInt5405 == 0) {
					Static26.method4357(local667, 16, "");
				}
			} else if (local462.endsWith(":allyreq:")) {
				@Pc(578) String local578 = local462.substring(0, local462.indexOf(":"));
				@Pc(584) long local584 = Base37.encode(local578);
				@Pc(586) boolean local586 = false;
				for (@Pc(588) int local588 = 0; local588 < Static6.anInt4516; local588++) {
					if (local584 == Static3.aLongArray16[local588]) {
						local586 = true;
						break;
					}
				}
				if (!local586 && Static3.anInt5405 == 0) {
					@Pc(621) String local621 = local462.substring(local462.indexOf(":") + 1, local462.length() - 9);
					Static26.method4357(local578, 21, local621);
				}
			} else if (local462.endsWith(":spam:")) {
				@Pc(647) String local647 = local462.substring(0, local462.length() - 6);
				if (Static3.anInt5405 == 0) {
					Static26.method4357("", 22, local647);
				}
			} else {
				Static26.method4357("", 0, local462);
			}
			opcode = -1;
			return true;
		} else if (opcode == 162) {
			@Pc(967) int local967 = inboundBuffer.readInt();
			@Pc(973) int local973 = inboundBuffer.readInt();
			@Pc(977) int local977 = inboundBuffer.readUnsignedShort();
			@Pc(981) int local981 = inboundBuffer.readUnsignedShortLEA();
			if (local977 == 65535) {
				local977 = -1;
			}
			if (local981 == 65535) {
				local981 = -1;
			}
			@Pc(996) int local996 = inboundBuffer.readUnsignedShortLEA();
			if (Static35.method4381(local996)) {
				for (@Pc(1003) int local1003 = local981; local1003 <= local977; local1003++) {
					@Pc(1015) long local1015 = ((long) local973 << 32) + (long) local1003;
					@Pc(1021) ServerActiveProperties local1021 = (ServerActiveProperties) Static2.aClass84_5.get(local1015);
					@Pc(1037) ServerActiveProperties local1037;
					if (local1021 != null) {
						local1037 = new ServerActiveProperties(local967, local1021.targetParam);
						local1021.unlink();
					} else if (local1003 == -1) {
						local1037 = new ServerActiveProperties(local967, InterfaceList.getComponent(local973).serverActiveProperties.targetParam);
					} else {
						local1037 = new ServerActiveProperties(local967, -1);
					}
					Static2.aClass84_5.put(local1015, local1037);
				}
			}
			opcode = -1;
			return true;
		} else if (opcode == 1) {
			@Pc(1079) int local1079 = inboundBuffer.readUnsignedShortLE();
			@Pc(1085) String local1085 = inboundBuffer.readString();
			@Pc(1089) int local1089 = inboundBuffer.readIntAlt3Reverse();
			if (Static35.method4381(local1079)) {
				DelayedStateChange.method2079(local1089, local1085);
			}
			opcode = -1;
			return true;
		} else if (opcode == 11) {
			@Pc(1114) int local1114 = inboundBuffer.readUnsignedShortLE();
			@Pc(1118) int local1118 = inboundBuffer.readIntAlt3();
			@Pc(1122) int local1122 = inboundBuffer.readUnsignedShortA();
			if (Static35.method4381(local1114)) {
				DelayedStateChange.method1773(local1118, local1122);
			}
			opcode = -1;
			return true;
		} else if (opcode == 148) {
			@Pc(1144) int local1144 = inboundBuffer.readUnsignedShort();
			@Pc(1148) int local1148 = inboundBuffer.readIntLE();
			@Pc(1152) int local1152 = inboundBuffer.readUnsignedShort();
			if (Static35.method4381(local1152)) {
				DelayedStateChange.setVarcServer(local1144, local1148);
			}
			opcode = -1;
			return true;
		} else if (opcode == 95) {
			Static21.method2062();
			Static3.anInt2048 = inboundBuffer.readShort();
			Static1.anInt925 = Static6.anInt4979;
			opcode = -1;
			return true;
		} else if (opcode == 164) {
			Static21.method2062();
			@Pc(1190) int local1190 = inboundBuffer.readUnsignedByte();
			@Pc(1194) int local1194 = inboundBuffer.readIntAlt3Reverse();
			@Pc(1198) int local1198 = inboundBuffer.readUnsignedByte();
			Static7.anIntArray637[local1198] = local1194;
			Static7.anIntArray501[local1198] = local1190;
			Static7.anIntArray599[local1198] = 1;
			for (@Pc(1212) int local1212 = 0; local1212 < 98; local1212++) {
				if (local1194 >= Class65.anIntArray165[local1212]) {
					Static7.anIntArray599[local1198] = local1212 + 2;
				}
			}
			Static4.anIntArray336[Static5.anInt4210++ & 0x1F] = local1198;
			opcode = -1;
			return true;
		} else if (opcode == 8) {
			Static21.method2062();
			Static2.anInt2248 = inboundBuffer.readUnsignedByte();
			Static1.anInt925 = Static6.anInt4979;
			opcode = -1;
			return true;
		} else if (opcode == 86) {
			Static30.method419(inboundBuffer.readString());
			opcode = -1;
			return true;
		} else if (opcode == 87) {
			@Pc(1285) int local1285 = inboundBuffer.readUnsignedShortLEA();
			@Pc(1289) int local1289 = inboundBuffer.readUnsignedShort();
			if (local1289 == 65535) {
				local1289 = -1;
			}
			@Pc(1300) int local1300 = inboundBuffer.readIntLE();
			if (Static35.method4381(local1285)) {
				DelayedStateChange.method3471(local1300, 1, local1289, -1);
			}
			opcode = -1;
			return true;
		} else if (opcode == 49) {
			readRebuildPacket(false);
			opcode = -1;
			return true;
		} else if (opcode == 138) {
			@Pc(1336) int local1336 = inboundBuffer.readUnsignedShortLEA();
			@Pc(1340) int local1340 = inboundBuffer.readIntAlt3();
			VarpDomain.setVarbitServer(local1336, local1340);
			opcode = -1;
			return true;
		} else if (opcode == 96) {
			if (Static3.anInt5398 != -1) {
				Static28.method3277(Static3.anInt5398, 0);
			}
			opcode = -1;
			return true;
		} else if (opcode == 97) {
			Static1.anInt818 = inboundBuffer.readUnsignedByteS();
			Static1.anInt894 = inboundBuffer.readUnsignedByteA();
			opcode = -1;
			return true;
		} else if (opcode == 25) {
			readPlayerInfoPacket();
			opcode = -1;
			return true;
		} else if (opcode == 126) {
			@Pc(1403) String local1403 = inboundBuffer.readString();
			@Pc(1407) int local1407 = inboundBuffer.readUnsignedByteC();
			@Pc(1411) int local1411 = inboundBuffer.readUnsignedShortLE();
			@Pc(1415) int local1415 = inboundBuffer.readUnsignedByteS();
			if (local1411 == 65535) {
				local1411 = -1;
			}
			if (local1415 >= 1 && local1415 <= 8) {
				if (local1403.equalsIgnoreCase("null")) {
					local1403 = null;
				}
				Static2.aStringArray40[local1415 - 1] = local1403;
				Static5.anIntArray615[local1415 - 1] = local1411;
				Static3.aBooleanArray11[local1415 - 1] = local1407 == 0;
			}
			opcode = -1;
			return true;
		} else if (opcode == 55) {
			Static5.anInt5206 = inboundBuffer.readUnsignedByte();
			opcode = -1;
			return true;
		} else if (opcode == 31) {
			@Pc(1486) int local1486 = inboundBuffer.readInt();
			@Pc(1490) int local1490 = inboundBuffer.readUnsignedShort();
			@Pc(1494) int local1494 = inboundBuffer.readUnsignedShortA();
			@Pc(1498) int local1498 = inboundBuffer.readUnsignedShort();
			@Pc(1502) int local1502 = inboundBuffer.readUnsignedShort();
			if (local1498 == 65535) {
				local1498 = -1;
			}
			if (local1502 == 65535) {
				local1502 = -1;
			}
			if (Static35.method4381(local1494)) {
				for (@Pc(1520) int local1520 = local1502; local1520 <= local1498; local1520++) {
					@Pc(1535) long local1535 = ((long) local1486 << 32) + (long) local1520;
					@Pc(1541) ServerActiveProperties local1541 = (ServerActiveProperties) Static2.aClass84_5.get(local1535);
					@Pc(1556) ServerActiveProperties local1556;
					if (local1541 != null) {
						local1556 = new ServerActiveProperties(local1541.events, local1490);
						local1541.unlink();
					} else if (local1520 == -1) {
						local1556 = new ServerActiveProperties(InterfaceList.getComponent(local1486).serverActiveProperties.events, local1490);
					} else {
						local1556 = new ServerActiveProperties(0, local1490);
					}
					Static2.aClass84_5.put(local1535, local1556);
				}
			}
			opcode = -1;
			return true;
		} else if (opcode == 174) {
			@Pc(1598) long local1598 = inboundBuffer.readLong();
			@Pc(1602) int local1602 = inboundBuffer.readUnsignedShort();
			@Pc(1604) boolean local1604 = false;
			if ((Long.MIN_VALUE & local1598) != 0L) {
				local1604 = true;
			}
			@Pc(1619) byte local1619 = inboundBuffer.readByte();
			if (local1604) {
				if (Static4.anInt3260 == 0) {
					opcode = -1;
					return true;
				}
				@Pc(1779) long local1779 = local1598 & Long.MAX_VALUE;
				@Pc(1781) int local1781;
				for (local1781 = 0; Static4.anInt3260 > local1781 && (Static6.aClass4_Sub15Array1[local1781].key != local1779 || local1602 != Static6.aClass4_Sub15Array1[local1781].world); local1781++) {
				}
				if (local1781 < Static4.anInt3260) {
					while (local1781 < Static4.anInt3260 - 1) {
						Static6.aClass4_Sub15Array1[local1781] = Static6.aClass4_Sub15Array1[local1781 + 1];
						local1781++;
					}
					Static4.anInt3260--;
					Static6.aClass4_Sub15Array1[Static4.anInt3260] = null;
				}
			} else {
				@Pc(1625) String local1625 = inboundBuffer.readString();
				@Pc(1629) ClanMember local1629 = new ClanMember();
				local1629.key = local1598;
				local1629.username = Base37.decodeLowerCase(local1629.key);
				local1629.rank = local1619;
				local1629.world = local1602;
				local1629.worldName = local1625;
				@Pc(1653) int local1653;
				for (local1653 = Static4.anInt3260 - 1; local1653 >= 0; local1653--) {
					@Pc(1663) int local1663 = Static6.aClass4_Sub15Array1[local1653].username.compareTo(local1629.username);
					if (local1663 == 0) {
						Static6.aClass4_Sub15Array1[local1653].world = local1602;
						Static6.aClass4_Sub15Array1[local1653].rank = local1619;
						Static6.aClass4_Sub15Array1[local1653].worldName = local1625;
						Static3.anInt2616 = Static6.anInt4979;
						if (LoginManager.encodedUsername == local1598) {
							Static5.aByte13 = local1619;
						}
						opcode = -1;
						return true;
					}
					if (local1663 < 0) {
						break;
					}
				}
				if (Static4.anInt3260 >= Static6.aClass4_Sub15Array1.length) {
					opcode = -1;
					return true;
				}
				for (@Pc(1720) int local1720 = Static4.anInt3260 - 1; local1720 > local1653; local1720--) {
					Static6.aClass4_Sub15Array1[local1720 + 1] = Static6.aClass4_Sub15Array1[local1720];
				}
				if (Static4.anInt3260 == 0) {
					Static6.aClass4_Sub15Array1 = new ClanMember[100];
				}
				Static6.aClass4_Sub15Array1[local1653 + 1] = local1629;
				if (local1598 == LoginManager.encodedUsername) {
					Static5.aByte13 = local1619;
				}
				Static4.anInt3260++;
			}
			Static3.anInt2616 = Static6.anInt4979;
			opcode = -1;
			return true;
		} else if (opcode == 104) {
			@Pc(1858) long local1858 = inboundBuffer.readLong();
			@Pc(1865) String local1865 = StringUtils.escape(Static30.method3569(WordPack.readString(inboundBuffer)));
			Static26.method4357(Base37.decodeTitleCase(local1858), 6, local1865);
			opcode = -1;
			return true;
		} else if (opcode == 253) {
			@Pc(1885) int local1885 = inboundBuffer.readUnsignedShort();
			@Pc(1889) String local1889 = inboundBuffer.readString();
			@Pc(1895) Object[] local1895 = new Object[local1889.length() + 1];
			for (@Pc(1900) int local1900 = local1889.length() - 1; local1900 >= 0; local1900--) {
				if (local1889.charAt(local1900) == 's') {
					local1895[local1900 + 1] = inboundBuffer.readString();
				} else {
					local1895[local1900 + 1] = Integer.valueOf(inboundBuffer.readInt());
				}
			}
			local1895[0] = Integer.valueOf(inboundBuffer.readInt());
			if (Static35.method4381(local1885)) {
				@Pc(1953) Class4_Sub13 local1953 = new Class4_Sub13();
				local1953.arguments = local1895;
				Static21.method2019(local1953);
			}
			opcode = -1;
			return true;
		} else if (opcode == 63) {
			@Pc(1971) int local1971 = inboundBuffer.readUnsignedShortLE();
			@Pc(1975) int local1975 = inboundBuffer.readUnsignedByteS();
			if (local1971 == 65535) {
				local1971 = -1;
			}
			@Pc(1986) int local1986 = local1975 >> 2;
			@Pc(1990) int local1990 = Loc.LAYERS[local1986];
			@Pc(1994) int local1994 = local1975 & 0x3;
			@Pc(1998) int local1998 = inboundBuffer.readInt();
			@Pc(2004) int local2004 = local1998 >> 28 & 0x3;
			@Pc(2010) int local2010 = local1998 >> 14 & 0x3FFF;
			@Pc(2014) int local2014 = local1998 & 0x3FFF;
			local2014 -= Static7.originZ;
			local2010 -= Static5.originX;
			Static34.method4250(local1971, local2010, local2004, local2014, local1990, local1994, local1986);
			opcode = -1;
			return true;
		} else if (opcode == 30) {
			if (GameShell.fullScreenFrame != null) {
				Static35.method4512(false, Preferences.displayMode, -1, -1);
			}
			@Pc(2051) byte[] local2051 = new byte[length];
			inboundBuffer.readEncryptedBytes(local2051, length);
			@Pc(2063) String local2063 = Cp1252Charset.decodeString(local2051, 0, length);
			if (GameShell.frame == null && (SignLink.anInt6106 == 3 || !SignLink.osName.startsWith("win") || client.haveIe6)) {
				Static37.method4719(local2063, true);
			} else {
				Static6.aString269 = local2063;
				Static4.aBoolean206 = true;
				Static1.aClass197_1 = GameShell.signLink.openUrl(local2063);
			}
			opcode = -1;
			return true;
		} else if (opcode == 147) {
			Static1.anInt894 = inboundBuffer.readUnsignedByte();
			Static1.anInt818 = inboundBuffer.readUnsignedByteA();
			for (@Pc(2109) int local2109 = Static1.anInt894; local2109 < Static1.anInt894 + 8; local2109++) {
				for (@Pc(2116) int local2116 = Static1.anInt818; local2116 < Static1.anInt818 + 8; local2116++) {
					if (Static4.objStacks[Static7.y][local2109][local2116] != null) {
						Static4.objStacks[Static7.y][local2109][local2116] = null;
						Static8.method89(local2109, local2116);
					}
				}
			}
			for (@Pc(2157) ChangeLocRequest loc = (ChangeLocRequest) ChangeLocRequest.queue.head(); loc != null; loc = (ChangeLocRequest) ChangeLocRequest.queue.next()) {
				if (Static1.anInt894 <= loc.x && loc.x < Static1.anInt894 + 8 && Static1.anInt818 <= loc.z && Static1.anInt818 + 8 > loc.z && Static7.y == loc.y) {
					loc.resetLoops = 0;
				}
			}
			opcode = -1;
			return true;
		} else if (opcode == 10) {
			@Pc(2208) int local2208 = inboundBuffer.readIntAlt3Reverse();
			@Pc(2212) int local2212 = inboundBuffer.readUnsignedShortA();
			VarpDomain.setVarpServer(local2212, local2208);
			opcode = -1;
			return true;
		} else if (opcode == 100) {
			@Pc(2227) int local2227 = inboundBuffer.readUnsignedShort();
			if (local2227 == 65535) {
				local2227 = -1;
			}
			@Pc(2239) int local2239 = inboundBuffer.readUnsignedByteA();
			Static36.method4444(local2239, local2227);
			opcode = -1;
			return true;
		} else if (opcode == 206) {
			@Pc(2256) int local2256 = inboundBuffer.readUnsignedByte();
			@Pc(2262) int local2262 = inboundBuffer.readUnsignedShortLEA();
			if (local2262 == 65535) {
				local2262 = -1;
			}
			@Pc(2271) int local2271 = inboundBuffer.method4590();
			Static23.method1933(local2256, local2271, local2262);
			opcode = -1;
			return true;
		} else if (opcode == 54) {
			if (length == 0) {
				Static5.aString236 = LocalisedText.WALKHERE;
			} else {
				Static5.aString236 = inboundBuffer.readString();
			}
			opcode = -1;
			return true;
		} else if (opcode == 33) {
			@Pc(2312) int local2312 = inboundBuffer.readUnsignedByte();
			@Pc(2316) int local2316 = inboundBuffer.readUnsignedByte();
			@Pc(2322) byte local2322 = inboundBuffer.readByte();
			if (Static1.aByte1 != local2322) {
				opcode = -1;
				return true;
			}
			opcode = -1;
			if (local2312 == 255) {
				Static3.aBoolean147 = false;
				Static6.anInt4506 = 0;
				Static3.anInt2140 = 0;
			} else {
				Static3.aBoolean147 = true;
				Static3.anInt2140 = local2316;
				Static6.anInt4506 = local2312;
			}
			return true;
		} else if (opcode == 183) {
			@Pc(2367) int local2367 = inboundBuffer.readInt();
			@Pc(2373) int local2373 = inboundBuffer.readUnsignedShortLEA();
			if (local2373 == 65535) {
				local2373 = -1;
			}
			@Pc(2382) int local2382 = inboundBuffer.readUnsignedShortA();
			@Pc(2386) int local2386 = inboundBuffer.readInt();
			if (Static35.method4381(local2382)) {
				@Pc(2395) Component local2395 = InterfaceList.getComponent(local2367);
				if (local2395.if3) {
					DelayedStateChange.method3716(local2367, local2373, local2386);
					@Pc(2409) ObjType local2409 = ObjTypeList.get(local2373);
					DelayedStateChange.method1019(local2367, local2409.xAngle2d, local2409.yAngle2d, local2409.zoom2d);
					DelayedStateChange.method4433(local2367, local2409.xOffset2d, local2409.yOffset2d, local2409.anInt5062);
				} else if (local2373 == -1) {
					local2395.anInt5939 = 0;
					opcode = -1;
					return true;
				} else {
					@Pc(2443) ObjType local2443 = ObjTypeList.get(local2373);
					local2395.anInt5976 = local2443.yAngle2d;
					local2395.anInt5939 = 4;
					local2395.anInt5895 = local2373;
					local2395.anInt5944 = local2443.xAngle2d;
					local2395.anInt5918 = local2443.zoom2d * 100 / local2386;
					Static28.method3270(local2395);
				}
			}
			opcode = -1;
			return true;
		} else if (opcode == 65) {
			@Pc(2482) int local2482 = inboundBuffer.readIntAlt3();
			@Pc(2488) int local2488 = inboundBuffer.readUnsignedShortLEA();
			@Pc(2494) int local2494 = inboundBuffer.readShortA();
			@Pc(2498) int local2498 = inboundBuffer.readShortLE();
			if (Static35.method4381(local2488)) {
				DelayedStateChange.method726(local2482, local2494, local2498);
			}
			opcode = -1;
			return true;
		} else if (opcode == 152) {
			@Pc(2523) int local2523 = inboundBuffer.readUnsignedShortLEA();
			@Pc(2527) int local2527 = inboundBuffer.readUnsignedShortLEA();
			@Pc(2531) int local2531 = inboundBuffer.readUnsignedShortA();
			@Pc(2535) int local2535 = inboundBuffer.readIntLE();
			if (Static35.method4381(local2523)) {
				DelayedStateChange.method2021(local2535, local2531 + (local2527 << 16));
			}
			opcode = -1;
			return true;
		} else if (opcode == 44) {
			@Pc(2559) boolean local2559 = false;
			@Pc(2563) long local2563 = inboundBuffer.readLong();
			@Pc(2568) long local2568 = (long) inboundBuffer.readUnsignedShort();
			@Pc(2573) long local2573 = (long) inboundBuffer.readUnsignedMedium();
			@Pc(2579) long local2579 = (local2568 << 32) + local2573;
			@Pc(2583) int local2583 = inboundBuffer.readUnsignedByte();
			@Pc(2585) int local2585 = 0;
			label1451:
			while (true) {
				if (local2585 >= 100) {
					if (local2583 <= 1) {
						if (LoginManager.playerUnderage && !LoginManager.parentalChatConsent || LoginManager.mapQuickChat) {
							local2559 = true;
						} else {
							for (@Pc(2623) int local2623 = 0; local2623 < Static6.anInt4516; local2623++) {
								if (local2563 == Static3.aLongArray16[local2623]) {
									local2559 = true;
									break label1451;
								}
							}
						}
					}
					break;
				}
				if (Static4.aLongArray24[local2585] == local2579) {
					local2559 = true;
					break;
				}
				local2585++;
			}
			if (!local2559 && Static3.anInt5405 == 0) {
				Static4.aLongArray24[Static1.anInt595] = local2579;
				Static1.anInt595 = (Static1.anInt595 + 1) % 100;
				@Pc(2663) String local2663 = StringUtils.escape(Static30.method3569(WordPack.readString(inboundBuffer)));
				if (local2583 == 2 || local2583 == 3) {
					Static26.method4357("<img=1>" + Base37.decodeTitleCase(local2563), 7, local2663);
				} else if (local2583 == 1) {
					Static26.method4357("<img=0>" + Base37.decodeTitleCase(local2563), 7, local2663);
				} else {
					Static26.method4357(Base37.decodeTitleCase(local2563), 3, local2663);
				}
			}
			opcode = -1;
			return true;
		} else if (opcode == 89) {
			@Pc(2728) int local2728 = inboundBuffer.readUnsignedShortLE();
			@Pc(2732) int local2732 = inboundBuffer.readInt();
			@Pc(2736) int local2736 = inboundBuffer.readIntLE();
			if (Static35.method4381(local2728)) {
				@Pc(2747) Class4_Sub27 local2747 = (Class4_Sub27) Static4.aClass84_13.get((long) local2732);
				@Pc(2754) Class4_Sub27 local2754 = (Class4_Sub27) Static4.aClass84_13.get((long) local2736);
				if (local2754 != null) {
					Static28.method3246(local2747 == null || local2754.anInt4620 != local2747.anInt4620, local2754);
				}
				if (local2747 != null) {
					local2747.unlink();
					Static4.aClass84_13.put((long) local2736, local2747);
				}
				@Pc(2788) Component local2788 = InterfaceList.getComponent(local2732);
				if (local2788 != null) {
					Static28.method3270(local2788);
				}
				@Pc(2799) Component local2799 = InterfaceList.getComponent(local2736);
				if (local2799 != null) {
					Static28.method3270(local2799);
					Static34.method4251(true, local2799);
				}
				if (Static3.anInt5398 != -1) {
					Static28.method3277(Static3.anInt5398, 1);
				}
			}
			opcode = -1;
			return true;
		} else if (opcode == 246) {
			@Pc(2830) long local2830 = inboundBuffer.readLong();
			inboundBuffer.readByte();
			@Pc(2838) long local2838 = inboundBuffer.readLong();
			@Pc(2843) long local2843 = (long) inboundBuffer.readUnsignedShort();
			@Pc(2848) long local2848 = (long) inboundBuffer.readUnsignedMedium();
			@Pc(2855) long local2855 = (local2843 << 32) + local2848;
			@Pc(2859) int local2859 = inboundBuffer.readUnsignedByte();
			@Pc(2861) boolean local2861 = false;
			@Pc(2863) int local2863 = 0;
			label1702:
			while (true) {
				if (local2863 < 100) {
					if (Static4.aLongArray24[local2863] != local2855) {
						local2863++;
						continue;
					}
					local2861 = true;
					break;
				}
				if (local2859 <= 1) {
					if (LoginManager.playerUnderage && !LoginManager.parentalChatConsent || LoginManager.mapQuickChat) {
						local2861 = true;
					} else {
						for (@Pc(2899) int local2899 = 0; local2899 < Static6.anInt4516; local2899++) {
							if (local2830 == Static3.aLongArray16[local2899]) {
								local2861 = true;
								break label1702;
							}
						}
					}
				}
				break;
			}
			if (!local2861 && Static3.anInt5405 == 0) {
				Static4.aLongArray24[Static1.anInt595] = local2855;
				Static1.anInt595 = (Static1.anInt595 + 1) % 100;
				@Pc(2939) String local2939 = StringUtils.escape(Static30.method3569(WordPack.readString(inboundBuffer)));
				if (local2859 == 2 || local2859 == 3) {
					Static26.method2982("<img=1>" + Base37.decodeTitleCase(local2830), Base37.decodeTitleCase(local2838), local2939);
				} else if (local2859 == 1) {
					Static26.method2982("<img=0>" + Base37.decodeTitleCase(local2830), Base37.decodeTitleCase(local2838), local2939);
				} else {
					Static26.method2982(Base37.decodeTitleCase(local2830), Base37.decodeTitleCase(local2838), local2939);
				}
			}
			opcode = -1;
			return true;
		} else if (opcode == 90) {
			@Pc(3016) int local3016 = inboundBuffer.readUnsignedShortLEA();
			@Pc(3020) int local3020 = inboundBuffer.readUnsignedShortA();
			@Pc(3024) int local3024 = inboundBuffer.readUnsignedShortA();
			@Pc(3028) int local3028 = inboundBuffer.readUnsignedShortLE();
			@Pc(3032) int local3032 = inboundBuffer.readIntLE();
			if (Static35.method4381(local3024)) {
				DelayedStateChange.method1019(local3032, local3028, local3020, local3016);
			}
			opcode = -1;
			return true;
		} else if (opcode == 130) {
			@Pc(3053) int local3053 = inboundBuffer.readUnsignedByteA();
			@Pc(3057) int local3057 = inboundBuffer.readUnsignedByteC();
			@Pc(3061) int local3061 = inboundBuffer.readUnsignedByte();
			Static7.y = local3061 >> 1;
			PlayerList.self.method1174(local3053, (local3061 & 0x1) == 1, local3057);
			opcode = -1;
			return true;
		} else if (opcode == 172) {
			@Pc(3091) int local3091 = inboundBuffer.readIntLE();
			@Pc(3095) int local3095 = inboundBuffer.readShort();
			@Pc(3101) int local3101 = inboundBuffer.readUnsignedShortLEA();
			if (Static35.method4381(local3101)) {
				DelayedStateChange.method4824(local3091, local3095);
			}
			opcode = -1;
			return true;
		} else if (opcode == 103) {
			@Pc(3127) int local3127 = inboundBuffer.readInt();
			Static1.aClass197_2 = GameShell.signLink.getReverseDns(local3127);
			opcode = -1;
			return true;
		} else if (opcode == 242) {
			@Pc(3144) int local3144 = inboundBuffer.readUnsignedByte();
			@Pc(3148) int local3148 = inboundBuffer.readUnsignedShortLE();
			if (Static35.method4381(local3148)) {
				Static5.anInt4166 = local3144;
			}
			opcode = -1;
			return true;
		} else if (opcode == 2) {
			Static3.anInt2616 = Static6.anInt4979;
			@Pc(3168) long local3168 = inboundBuffer.readLong();
			if (local3168 == 0L) {
				Static2.aString108 = null;
				Static4.anInt3260 = 0;
				Static6.aString268 = null;
				opcode = -1;
				Static6.aClass4_Sub15Array1 = null;
				return true;
			}
			@Pc(3188) long local3188 = inboundBuffer.readLong();
			Static2.aString108 = Base37.decodeLowerCase(local3188);
			Static6.aString268 = Base37.decodeLowerCase(local3168);
			Static4.aByte6 = inboundBuffer.readByte();
			@Pc(3204) int local3204 = inboundBuffer.readUnsignedByte();
			if (local3204 == 255) {
				opcode = -1;
				return true;
			}
			Static4.anInt3260 = local3204;
			@Pc(3217) ClanMember[] local3217 = new ClanMember[100];
			for (@Pc(3219) int local3219 = 0; local3219 < Static4.anInt3260; local3219++) {
				local3217[local3219] = new ClanMember();
				local3217[local3219].key = inboundBuffer.readLong();
				local3217[local3219].username = Base37.decodeLowerCase(local3217[local3219].key);
				local3217[local3219].world = inboundBuffer.readUnsignedShort();
				local3217[local3219].rank = inboundBuffer.readByte();
				local3217[local3219].worldName = inboundBuffer.readString();
				if (LoginManager.encodedUsername == local3217[local3219].key) {
					Static5.aByte13 = local3217[local3219].rank;
				}
			}
			@Pc(3291) int local3291 = Static4.anInt3260;
			while (local3291 > 0) {
				local3291--;
				@Pc(3297) boolean local3297 = true;
				for (@Pc(3299) int local3299 = 0; local3299 < local3291; local3299++) {
					if (local3217[local3299].username.compareTo(local3217[local3299 + 1].username) > 0) {
						@Pc(3321) ClanMember local3321 = local3217[local3299];
						local3217[local3299] = local3217[local3299 + 1];
						local3217[local3299 + 1] = local3321;
						local3297 = false;
					}
				}
				if (local3297) {
					break;
				}
			}
			opcode = -1;
			Static6.aClass4_Sub15Array1 = local3217;
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
			@Pc(3441) int local3441 = inboundBuffer.readIntAlt3();
			@Pc(3447) int local3447 = inboundBuffer.readUnsignedShortLEA();
			@Pc(3451) int local3451 = inboundBuffer.readUnsignedShortLEA();
			@Pc(3455) int local3455 = inboundBuffer.readUnsignedShortLEA();
			if (Static35.method4381(local3451)) {
				DelayedStateChange.method3471(local3441, 7, local3447 << 16 | local3455, local3435);
			}
			opcode = -1;
			return true;
		} else if (opcode == 182) {
			@Pc(3481) long local3481 = inboundBuffer.readLong();
			@Pc(3485) int local3485 = inboundBuffer.readUnsignedShort();
			@Pc(3489) int local3489 = inboundBuffer.readUnsignedByte();
			@Pc(3491) boolean local3491 = true;
			if (local3481 < 0L) {
				local3491 = false;
				local3481 &= Long.MAX_VALUE;
			}
			@Pc(3504) String local3504 = "";
			if (local3485 > 0) {
				local3504 = inboundBuffer.readString();
			}
			@Pc(3518) String local3518 = Base37.decodeTitleCase(local3481);
			for (@Pc(3520) int local3520 = 0; local3520 < Static6.anInt5214; local3520++) {
				if (Static7.aLongArray54[local3520] == local3481) {
					if (local3485 != Static4.anIntArray293[local3520]) {
						Static4.anIntArray293[local3520] = local3485;
						if (local3485 > 0) {
							Static26.method4357("", 5, local3518 + LocalisedText.FRIENDLOGIN);
						}
						if (local3485 == 0) {
							Static26.method4357("", 5, local3518 + LocalisedText.FRIENDLOGOUT);
						}
					}
					Static4.aStringArray22[local3520] = local3504;
					Static6.anIntArray517[local3520] = local3489;
					Static2.aBooleanArray7[local3520] = local3491;
					local3518 = null;
					break;
				}
			}
			if (local3518 != null && Static6.anInt5214 < 200) {
				Static7.aLongArray54[Static6.anInt5214] = local3481;
				Static4.aStringArray23[Static6.anInt5214] = local3518;
				Static4.anIntArray293[Static6.anInt5214] = local3485;
				Static4.aStringArray22[Static6.anInt5214] = local3504;
				Static6.anIntArray517[Static6.anInt5214] = local3489;
				Static2.aBooleanArray7[Static6.anInt5214] = local3491;
				Static6.anInt5214++;
			}
			Static3.anInt2102 = Static6.anInt4979;
			@Pc(3644) int local3644 = Static6.anInt5214;
			while (local3644 > 0) {
				@Pc(3651) boolean local3651 = true;
				local3644--;
				for (@Pc(3654) int local3654 = 0; local3654 < local3644; local3654++) {
					if (Static4.anIntArray293[local3654] != client.worldId && client.worldId == Static4.anIntArray293[local3654 + 1] || Static4.anIntArray293[local3654] == 0 && Static4.anIntArray293[local3654 + 1] != 0) {
						local3651 = false;
						@Pc(3691) int local3691 = Static4.anIntArray293[local3654];
						Static4.anIntArray293[local3654] = Static4.anIntArray293[local3654 + 1];
						Static4.anIntArray293[local3654 + 1] = local3691;
						@Pc(3709) String local3709 = Static4.aStringArray22[local3654];
						Static4.aStringArray22[local3654] = Static4.aStringArray22[local3654 + 1];
						Static4.aStringArray22[local3654 + 1] = local3709;
						@Pc(3727) String local3727 = Static4.aStringArray23[local3654];
						Static4.aStringArray23[local3654] = Static4.aStringArray23[local3654 + 1];
						Static4.aStringArray23[local3654 + 1] = local3727;
						@Pc(3745) long local3745 = Static7.aLongArray54[local3654];
						Static7.aLongArray54[local3654] = Static7.aLongArray54[local3654 + 1];
						Static7.aLongArray54[local3654 + 1] = local3745;
						@Pc(3763) int local3763 = Static6.anIntArray517[local3654];
						Static6.anIntArray517[local3654] = Static6.anIntArray517[local3654 + 1];
						Static6.anIntArray517[local3654 + 1] = local3763;
						@Pc(3781) boolean local3781 = Static2.aBooleanArray7[local3654];
						Static2.aBooleanArray7[local3654] = Static2.aBooleanArray7[local3654 + 1];
						Static2.aBooleanArray7[local3654 + 1] = local3781;
					}
				}
				if (local3651) {
					break;
				}
			}
			opcode = -1;
			return true;
		} else if (opcode == 225) {
			@Pc(3813) int local3813 = inboundBuffer.readUnsignedShort();
			@Pc(3817) int local3817 = inboundBuffer.readUnsignedShortLEA();
			@Pc(3821) int local3821 = inboundBuffer.readUnsignedByteS();
			if (Static35.method4381(local3817)) {
				if (local3821 == 2) {
					Static16.method1557();
				}
				Static3.anInt5398 = local3813;
				Static9.method230(local3813);
				Static12.method777(false);
				Static14.method1102(Static3.anInt5398);
				for (@Pc(3846) int local3846 = 0; local3846 < 100; local3846++) {
					Static2.aBooleanArray8[local3846] = true;
				}
			}
			opcode = -1;
			return true;
		} else if (opcode == 156) {
			@Pc(3870) int local3870 = inboundBuffer.readUnsignedShort();
			if (Static35.method4381(local3870)) {
				Static8.method11();
			}
			opcode = -1;
			return true;
		} else if (opcode == 229) {
			for (@Pc(3886) int local3886 = 0; local3886 < PlayerList.players.length; local3886++) {
				if (PlayerList.players[local3886] != null) {
					PlayerList.players[local3886].anInt4007 = -1;
				}
			}
			for (@Pc(3906) int local3906 = 0; local3906 < NpcList.npcs.length; local3906++) {
				if (NpcList.npcs[local3906] != null) {
					NpcList.npcs[local3906].anInt4007 = -1;
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
			@Pc(3952) int local3952 = inboundBuffer.readUnsignedByte();
			@Pc(3956) int local3956 = local3952 >> 5;
			@Pc(3960) int local3960 = local3952 & 0x1F;
			if (local3960 == 0) {
				Static7.aClass94Array1[local3956] = null;
				opcode = -1;
				return true;
			}
			@Pc(3976) Class94 local3976 = new Class94();
			local3976.anInt2561 = local3960;
			local3976.anInt2559 = inboundBuffer.readUnsignedByte();
			if (local3976.anInt2559 >= 0 && local3976.anInt2559 < Static6.aClass4_Sub3_Sub14Array11.length) {
				if (local3976.anInt2561 == 1 || local3976.anInt2561 == 10) {
					local3976.anInt2560 = inboundBuffer.readUnsignedShort();
					@Pc(4011) Packet local4011 = inboundBuffer;
					local4011.position += 5;
				} else if (local3976.anInt2561 >= 2 && local3976.anInt2561 <= 6) {
					if (local3976.anInt2561 == 2) {
						local3976.anInt2564 = 64;
						local3976.anInt2568 = 64;
					}
					if (local3976.anInt2561 == 3) {
						local3976.anInt2568 = 64;
						local3976.anInt2564 = 0;
					}
					if (local3976.anInt2561 == 4) {
						local3976.anInt2564 = 128;
						local3976.anInt2568 = 64;
					}
					if (local3976.anInt2561 == 5) {
						local3976.anInt2564 = 64;
						local3976.anInt2568 = 0;
					}
					if (local3976.anInt2561 == 6) {
						local3976.anInt2568 = 128;
						local3976.anInt2564 = 64;
					}
					local3976.anInt2561 = 2;
					local3976.anInt2558 = inboundBuffer.readUnsignedShort();
					local3976.anInt2565 = inboundBuffer.readUnsignedShort();
					local3976.anInt2567 = inboundBuffer.readUnsignedByte();
					local3976.anInt2562 = inboundBuffer.readUnsignedShort();
				}
				local3976.anInt2563 = inboundBuffer.readUnsignedShort();
				if (local3976.anInt2563 == 65535) {
					local3976.anInt2563 = -1;
				}
				Static7.aClass94Array1[local3956] = local3976;
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
			@Pc(4162) int local4162 = inboundBuffer.readUnsignedShortLEA();
			@Pc(4166) String local4166 = inboundBuffer.readString();
			@Pc(4170) int local4170 = inboundBuffer.readUnsignedShortLEA();
			if (Static35.method4381(local4162)) {
				DelayedStateChange.setVarcstrServer(local4170, local4166);
			}
			opcode = -1;
			return true;
		} else if (opcode == 137) {
			@Pc(4190) int local4190 = inboundBuffer.readUnsignedShortLE();
			@Pc(4194) int local4194 = inboundBuffer.readUnsignedByte();
			VarpDomain.setVarbitServer(local4190, local4194);
			opcode = -1;
			return true;
		} else if (opcode == 72) {
			Static5.anInt4329 = inboundBuffer.readUnsignedShortLE() * 30;
			Static1.anInt925 = Static6.anInt4979;
			opcode = -1;
			return true;
		} else if (opcode == 26) {
			@Pc(4226) int local4226 = inboundBuffer.readIntAlt3Reverse();
			@Pc(4232) Component component = InterfaceList.getComponent(local4226);
			for (@Pc(4234) int slot = 0; slot < component.objTypes.length; slot++) {
				component.objTypes[slot] = -1;
				component.objTypes[slot] = 0;
			}
			Static28.method3270(component);
			opcode = -1;
			return true;
		} else if (opcode == 99) {
			@Pc(4270) long local4270 = inboundBuffer.readLong();
			inboundBuffer.readByte();
			@Pc(4278) long local4278 = inboundBuffer.readLong();
			@Pc(4283) long local4283 = (long) inboundBuffer.readUnsignedShort();
			@Pc(4288) long local4288 = (long) inboundBuffer.readUnsignedMedium();
			@Pc(4295) long local4295 = (local4283 << 32) + local4288;
			@Pc(4299) int local4299 = inboundBuffer.readUnsignedByte();
			@Pc(4303) int phraseId = inboundBuffer.readUnsignedShort();
			@Pc(4305) boolean local4305 = false;
			@Pc(4307) int local4307 = 0;
			label1529:
			while (true) {
				if (local4307 < 100) {
					if (Static4.aLongArray24[local4307] != local4295) {
						local4307++;
						continue;
					}
					local4305 = true;
					break;
				}
				if (local4299 <= 1) {
					for (@Pc(4333) int local4333 = 0; local4333 < Static6.anInt4516; local4333++) {
						if (local4270 == Static3.aLongArray16[local4333]) {
							local4305 = true;
							break label1529;
						}
					}
				}
				break;
			}
			if (!local4305 && Static3.anInt5405 == 0) {
				Static4.aLongArray24[Static1.anInt595] = local4295;
				Static1.anInt595 = (Static1.anInt595 + 1) % 100;
				@Pc(4375) String message = QuickChatPhraseTypeList.get(phraseId).decodeMessage(inboundBuffer);
				if (local4299 == 2 || local4299 == 3) {
					Static25.method2927("<img=1>" + Base37.decodeTitleCase(local4270), phraseId, Base37.decodeTitleCase(local4278), 20, message);
				} else if (local4299 == 1) {
					Static25.method2927("<img=0>" + Base37.decodeTitleCase(local4270), phraseId, Base37.decodeTitleCase(local4278), 20, message);
				} else {
					Static25.method2927(Base37.decodeTitleCase(local4270), phraseId, Base37.decodeTitleCase(local4278), 20, message);
				}
			}
			opcode = -1;
			return true;
		} else if (opcode == 237) {
			@Pc(4452) int local4452 = inboundBuffer.readUnsignedShortLE();
			@Pc(4456) int local4456 = inboundBuffer.readUnsignedShortA();
			@Pc(4460) int local4460 = inboundBuffer.readUnsignedShortLE();
			@Pc(4466) int local4466 = inboundBuffer.readIntAlt3Reverse();
			if (local4466 >> 30 != 0) {
				@Pc(4479) int local4479 = local4466 >> 28 & 0x3;
				@Pc(4488) int local4488 = (local4466 >> 14 & 0x3FFF) - Static5.originX;
				@Pc(4495) int local4495 = (local4466 & 0x3FFF) - Static7.originZ;
				if (local4488 >= 0 && local4495 >= 0 && local4488 < 104 && local4495 < 104) {
					@Pc(4515) int local4515 = local4495 * 128 + 64;
					@Pc(4521) int local4521 = local4488 * 128 + 64;
					@Pc(4539) SpotAnim local4539 = new SpotAnim(local4452, local4479, local4521, local4515, Static11.method522(local4515, local4521, local4479) - local4460, local4456, client.loop);
					Static2.aClass112_8.addTail(new SpotAnimNode(local4539));
				}
			} else if (local4466 >> 29 != 0) {
				@Pc(4805) int local4805 = local4466 & 0xFFFF;
				@Pc(4809) Npc local4809 = NpcList.npcs[local4805];
				if (local4809 != null) {
					if (local4452 == 65535) {
						local4452 = -1;
					}
					@Pc(4822) boolean local4822 = true;
					if (local4452 != -1 && local4809.anInt3961 != -1) {
						if (local4452 == local4809.anInt3961) {
							@Pc(4840) SpotAnimType local4840 = SpotAnimTypeList.get(local4452);
							if (local4840.aBoolean222 && local4840.anInt3134 != -1) {
								@Pc(4855) SeqType local4855 = SeqTypeList.get(local4840.anInt3134);
								@Pc(4858) int local4858 = local4855.anInt1238;
								if (local4858 == 1) {
									local4822 = false;
									local4809.anInt3984 = client.loop + local4456;
									local4809.anInt4026 = 0;
									local4809.anInt3976 = 1;
									local4809.anInt3968 = 0;
									local4809.anInt3989 = 0;
									Static29.method3461(local4855, local4809.z, local4809.x, local4809.anInt4026, false);
								} else if (local4858 == 2) {
									local4809.anInt4001 = 0;
									local4822 = false;
								}
							}
						} else {
							@Pc(4913) SpotAnimType local4913 = SpotAnimTypeList.get(local4452);
							@Pc(4918) SpotAnimType local4918 = SpotAnimTypeList.get(local4809.anInt3961);
							if (local4913.anInt3134 != -1 && local4918.anInt3134 != -1) {
								@Pc(4935) SeqType local4935 = SeqTypeList.get(local4913.anInt3134);
								@Pc(4940) SeqType local4940 = SeqTypeList.get(local4918.anInt3134);
								if (local4935.anInt1243 < local4940.anInt1243) {
									local4822 = false;
								}
							}
						}
					}
					if (local4822) {
						local4809.anInt3961 = local4452;
						local4809.anInt4026 = 0;
						local4809.anInt3976 = 1;
						local4809.anInt3971 = local4460;
						local4809.anInt3968 = 0;
						local4809.anInt3984 = local4456 + client.loop;
						if (local4809.anInt3984 > client.loop) {
							local4809.anInt4026 = -1;
						}
						if (local4809.anInt3961 != -1 && client.loop == local4809.anInt3984) {
							@Pc(5003) int local5003 = SpotAnimTypeList.get(local4809.anInt3961).anInt3134;
							if (local5003 != -1) {
								@Pc(5010) SeqType local5010 = SeqTypeList.get(local5003);
								if (local5010 != null && local5010.anIntArray95 != null) {
									Static29.method3461(local5010, local4809.z, local4809.x, 0, false);
								}
							}
						}
					}
				}
			} else if (local4466 >> 28 != 0) {
				@Pc(4564) int local4564 = local4466 & 0xFFFF;
				@Pc(4569) Player local4569;
				if (PlayerList.selfId == local4564) {
					local4569 = PlayerList.self;
				} else {
					local4569 = PlayerList.players[local4564];
				}
				if (local4569 != null) {
					if (local4452 == 65535) {
						local4452 = -1;
					}
					@Pc(4586) boolean local4586 = true;
					if (local4452 != -1 && local4569.anInt3961 != -1) {
						if (local4452 == local4569.anInt3961) {
							@Pc(4649) SpotAnimType local4649 = SpotAnimTypeList.get(local4452);
							if (local4649.aBoolean222 && local4649.anInt3134 != -1) {
								@Pc(4663) SeqType local4663 = SeqTypeList.get(local4649.anInt3134);
								@Pc(4666) int local4666 = local4663.anInt1238;
								if (local4666 == 1) {
									local4569.anInt4026 = 0;
									local4569.anInt3968 = 0;
									local4569.anInt3976 = 1;
									local4586 = false;
									local4569.anInt3984 = local4456 + client.loop;
									local4569.anInt3989 = 0;
									Static29.method3461(local4663, local4569.z, local4569.x, local4569.anInt4026, false);
								} else if (local4666 == 2) {
									local4569.anInt4001 = 0;
									local4586 = false;
								}
							}
						} else {
							@Pc(4605) SpotAnimType local4605 = SpotAnimTypeList.get(local4452);
							@Pc(4610) SpotAnimType local4610 = SpotAnimTypeList.get(local4569.anInt3961);
							if (local4605.anInt3134 != -1 && local4610.anInt3134 != -1) {
								@Pc(4627) SeqType local4627 = SeqTypeList.get(local4605.anInt3134);
								@Pc(4632) SeqType local4632 = SeqTypeList.get(local4610.anInt3134);
								if (local4627.anInt1243 < local4632.anInt1243) {
									local4586 = false;
								}
							}
						}
					}
					if (local4586) {
						local4569.anInt3968 = 0;
						local4569.anInt3976 = 1;
						local4569.anInt3984 = client.loop + local4456;
						local4569.anInt3971 = local4460;
						local4569.anInt4026 = 0;
						local4569.anInt3961 = local4452;
						if (local4569.anInt3984 > client.loop) {
							local4569.anInt4026 = -1;
						}
						if (local4569.anInt3961 == 65535) {
							local4569.anInt3961 = -1;
						}
						if (local4569.anInt3961 != -1 && local4569.anInt3984 == client.loop) {
							@Pc(4768) int local4768 = SpotAnimTypeList.get(local4569.anInt3961).anInt3134;
							if (local4768 != -1) {
								@Pc(4778) SeqType local4778 = SeqTypeList.get(local4768);
								if (local4778 != null && local4778.anIntArray95 != null) {
									Static29.method3461(local4778, local4569.z, local4569.x, 0, local4569 == PlayerList.self);
								}
							}
						}
					}
				}
			}
			opcode = -1;
			return true;
		} else if (opcode == 151) {
			@Pc(5037) int local5037 = inboundBuffer.readUnsignedShort();
			@Pc(5041) int local5041 = inboundBuffer.readUnsignedByte();
			@Pc(5045) int local5045 = inboundBuffer.readUnsignedByte();
			@Pc(5049) int local5049 = inboundBuffer.readUnsignedShort();
			@Pc(5053) int local5053 = inboundBuffer.readUnsignedByte();
			@Pc(5057) int local5057 = inboundBuffer.readUnsignedByte();
			if (Static35.method4381(local5037)) {
				Static37.method4773(local5053, local5041, local5057, local5049, true, local5045);
			}
			opcode = -1;
			return true;
		} else if (opcode == 116) {
			@Pc(5083) int local5083 = inboundBuffer.readUnsignedShortA();
			@Pc(5087) int local5087 = inboundBuffer.readUnsignedShortA();
			@Pc(5091) String local5091 = inboundBuffer.readString();
			if (Static35.method4381(local5087)) {
				DelayedStateChange.setVarcstrServer(local5083, local5091);
			}
			opcode = -1;
			return true;
		} else if (opcode == 222) {
			@Pc(5111) long local5111 = inboundBuffer.readLong();
			@Pc(5116) long local5116 = (long) inboundBuffer.readUnsignedShort();
			@Pc(5121) long local5121 = (long) inboundBuffer.readUnsignedMedium();
			@Pc(5125) int local5125 = inboundBuffer.readUnsignedByte();
			@Pc(5129) int phraseId = inboundBuffer.readUnsignedShort();
			@Pc(5131) boolean local5131 = false;
			@Pc(5137) long local5137 = (local5116 << 32) + local5121;
			@Pc(5139) int local5139 = 0;
			label1545:
			while (true) {
				if (local5139 < 100) {
					if (local5137 != Static4.aLongArray24[local5139]) {
						local5139++;
						continue;
					}
					local5131 = true;
					break;
				}
				if (local5125 <= 1) {
					for (@Pc(5167) int local5167 = 0; local5167 < Static6.anInt4516; local5167++) {
						if (Static3.aLongArray16[local5167] == local5111) {
							local5131 = true;
							break label1545;
						}
					}
				}
				break;
			}
			if (!local5131 && Static3.anInt5405 == 0) {
				Static4.aLongArray24[Static1.anInt595] = local5137;
				Static1.anInt595 = (Static1.anInt595 + 1) % 100;
				@Pc(5214) String message = QuickChatPhraseTypeList.get(phraseId).decodeMessage(inboundBuffer);
				if (local5125 == 2) {
					Static25.method2927("<img=1>" + Base37.decodeTitleCase(local5111), phraseId, null, 18, message);
				} else if (local5125 == 1) {
					Static25.method2927("<img=0>" + Base37.decodeTitleCase(local5111), phraseId, null, 18, message);
				} else {
					Static25.method2927(Base37.decodeTitleCase(local5111), phraseId, null, 18, message);
				}
			}
			opcode = -1;
			return true;
		} else if (opcode == 46) {
			@Pc(5282) int local5282 = inboundBuffer.readUnsignedShort();
			@Pc(5286) int local5286 = inboundBuffer.readUnsignedByte();
			@Pc(5290) int local5290 = inboundBuffer.readUnsignedByte();
			@Pc(5294) int local5294 = inboundBuffer.readUnsignedByte();
			@Pc(5298) int local5298 = inboundBuffer.readUnsignedByte();
			@Pc(5302) int local5302 = inboundBuffer.readUnsignedShort();
			if (Static35.method4381(local5282)) {
				Static3.aBooleanArray13[local5286] = true;
				Static7.anIntArray625[local5286] = local5290;
				Static7.anIntArray626[local5286] = local5294;
				Static1.anIntArray13[local5286] = local5298;
				Static1.anIntArray14[local5286] = local5302;
			}
			opcode = -1;
			return true;
		} else if (opcode == 153) {
			@Pc(5340) int local5340 = inboundBuffer.readUnsignedShort();
			if (local5340 == 65535) {
				local5340 = -1;
			}
			@Pc(5349) int local5349 = inboundBuffer.readUnsignedByte();
			@Pc(5353) int local5353 = inboundBuffer.readUnsignedShort();
			@Pc(5357) int local5357 = inboundBuffer.readUnsignedByte();
			Static15.method1227(local5353, local5340, local5349, local5357);
			opcode = -1;
			return true;
		} else if (opcode == 135) {
			@Pc(5375) int local5375 = inboundBuffer.readUnsignedShort();
			@Pc(5379) int local5379 = inboundBuffer.readInt();
			if (Static35.method4381(local5375)) {
				@Pc(5392) Class4_Sub27 local5392 = (Class4_Sub27) Static4.aClass84_13.get((long) local5379);
				if (local5392 != null) {
					Static28.method3246(true, local5392);
				}
				if (Static6.aClass185_14 != null) {
					Static28.method3270(Static6.aClass185_14);
					Static6.aClass185_14 = null;
				}
			}
			opcode = -1;
			return true;
		} else if (opcode == 40) {
			@Pc(5419) int local5419 = inboundBuffer.readIntLE();
			@Pc(5423) int local5423 = inboundBuffer.readUnsignedShortLE();
			@Pc(5427) int local5427 = inboundBuffer.readUnsignedByte();
			if (Static35.method4381(local5423)) {
				DelayedStateChange.method2997(local5419, local5427);
			}
			opcode = -1;
			return true;
		} else if (opcode == 23) {
			Static7.anInt5413 = inboundBuffer.readUnsignedByte();
			Static6.anInt4837 = inboundBuffer.readUnsignedByte();
			Static6.anInt5016 = inboundBuffer.readUnsignedByte();
			opcode = -1;
			return true;
		} else if (opcode == 168) {
			@Pc(5469) int local5469 = inboundBuffer.readUnsignedShort();
			Inv.delete(local5469);
			Static7.anIntArray656[Static2.anInt959++ & 0x1F] = local5469 & 0x7FFF;
			opcode = -1;
			return true;
		} else if (opcode == 52) {
			@Pc(5498) int local5498 = inboundBuffer.readUnsignedShort();
			if (Static35.method4381(local5498)) {
				Static24.method2563();
			}
			opcode = -1;
			return true;
		} else if (opcode == 38) {
			@Pc(5517) byte local5517 = inboundBuffer.readByte();
			@Pc(5521) int local5521 = inboundBuffer.readUnsignedShortLE();
			VarpDomain.setVarpServer(local5521, local5517);
			opcode = -1;
			return true;
		} else if (opcode == 194) {
			@Pc(5536) int local5536 = inboundBuffer.readInt();
			@Pc(5540) int local5540 = inboundBuffer.readUnsignedShort();
			if (local5536 < -70000) {
				local5540 += 32768;
			}
			@Pc(5557) Component component;
			if (local5536 < 0) {
				component = null;
			} else {
				component = InterfaceList.getComponent(local5536);
			}
			if (component != null) {
				for (@Pc(5570) int slot = 0; slot < component.objTypes.length; slot++) {
					component.objTypes[slot] = 0;
					component.objCounts[slot] = 0;
				}
			}
			Inv.clear(local5540);
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
				Inv.set(local5540, i, id - 1, count);
			}
			if (component != null) {
				Static28.method3270(component);
			}
			Static21.method2062();
			Static7.anIntArray656[Static2.anInt959++ & 0x1F] = local5540 & 0x7FFF;
			opcode = -1;
			return true;
		} else if (opcode == 150) {
			@Pc(5687) int local5687 = inboundBuffer.readUnsignedShort();
			@Pc(5691) int local5691 = inboundBuffer.readUnsignedShortA();
			@Pc(5695) int local5695 = inboundBuffer.readUnsignedByteC();
			@Pc(5699) Npc local5699 = NpcList.npcs[local5691];
			if (local5699 != null) {
				Static11.method529(local5687, local5699, local5695);
			}
			opcode = -1;
			return true;
		} else if (opcode == 93) {
			@Pc(5721) int local5721 = inboundBuffer.readUnsignedShort();
			@Pc(5725) int local5725 = inboundBuffer.readUnsignedByte();
			@Pc(5729) int local5729 = inboundBuffer.readUnsignedByte();
			@Pc(5733) int local5733 = inboundBuffer.readUnsignedShort();
			@Pc(5737) int local5737 = inboundBuffer.readUnsignedByte();
			@Pc(5741) int local5741 = inboundBuffer.readUnsignedByte();
			if (Static35.method4381(local5721)) {
				Static23.method2536(local5733, local5737, local5725, local5729, local5741);
			}
			opcode = -1;
			return true;
		} else if (opcode == 166) {
			@Pc(5763) Packet local5763 = inboundBuffer;
			local5763.position += 28;
			if (inboundBuffer.verifyCrc32()) {
				Static9.method281(inboundBuffer.position - 28, inboundBuffer);
			}
			opcode = -1;
			return true;
		} else if (opcode == 42) {
			@Pc(5797) int local5797 = inboundBuffer.readUnsignedShortLEA();
			@Pc(5801) int local5801 = inboundBuffer.readUnsignedShortA();
			@Pc(5805) int local5805 = inboundBuffer.readUnsignedShortLEA();
			if (Static35.method4381(local5797)) {
				Static17.method1654(local5805, local5801);
			}
			opcode = -1;
			return true;
		} else if (opcode == 18) {
			@Pc(5828) int local5828 = inboundBuffer.readUnsignedShortLE();
			if (local5828 == 65535) {
				local5828 = -1;
			}
			@Pc(5837) int local5837 = inboundBuffer.readUnsignedShort();
			@Pc(5841) int local5841 = inboundBuffer.readInt();
			if (Static35.method4381(local5837)) {
				DelayedStateChange.method3471(local5841, 2, local5828, -1);
			}
			opcode = -1;
			return true;
		} else if (opcode == 43) {
			Static6.anInt4516 = length / 8;
			for (@Pc(5867) int local5867 = 0; local5867 < Static6.anInt4516; local5867++) {
				Static3.aLongArray16[local5867] = inboundBuffer.readLong();
				Static3.aStringArray18[local5867] = Static30.method423(Static3.aLongArray16[local5867]);
				Static2.aBooleanArray5[local5867] = false;
			}
			opcode = -1;
			Static3.anInt2102 = Static6.anInt4979;
			return true;
		} else if (opcode == 221) {
			@Pc(5909) long local5909 = inboundBuffer.readLong();
			@Pc(5913) int phraseId = inboundBuffer.readUnsignedShort();
			@Pc(5920) String message = QuickChatPhraseTypeList.get(phraseId).decodeMessage(inboundBuffer);
			Static25.method2927(Base37.decodeTitleCase(local5909), phraseId, null, 19, message);
			opcode = -1;
			return true;
		} else if (opcode == 199) {
			@Pc(5941) int local5941 = inboundBuffer.readIntAlt3Reverse();
			@Pc(5945) int local5945 = inboundBuffer.readUnsignedShort();
			if (Static35.method4381(local5945)) {
				@Pc(5951) int local5951 = 0;
				if (PlayerList.self.appearance != null) {
					local5951 = PlayerList.self.appearance.method3611();
				}
				DelayedStateChange.method3471(local5941, 3, local5951, -1);
			}
			opcode = -1;
			return true;
		} else if (opcode == 243) {
			@Pc(5979) int local5979 = inboundBuffer.readUnsignedShort();
			@Pc(5985) int local5985 = inboundBuffer.readIntAlt3Reverse();
			@Pc(5989) int local5989 = inboundBuffer.readUnsignedShortLEA();
			if (Static35.method4381(local5989)) {
				DelayedStateChange.method722(local5985, local5979);
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
			Static6.anInt4996 = Static6.anInt4979;
			return true;
		} else {
			TracingException.report(null, "T1 - " + opcode + "," + Static3.anInt2273 + "," + Static2.anInt1231 + " - " + length);
			Static19.method1818();
			return true;
		}
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(B)V")
	private static void readZonePacket() {
		if (opcode == 17) {
			@Pc(15) int local15 = inboundBuffer.readUnsignedByte();
			@Pc(26) int local26 = Static1.anInt894 * 2 + (local15 >> 4 & 0xF);
			@Pc(34) int local34 = (local15 & 0xF) + Static1.anInt818 * 2;
			@Pc(41) int local41 = local26 + inboundBuffer.readByte();
			@Pc(47) int local47 = inboundBuffer.readByte() + local34;
			@Pc(51) int local51 = inboundBuffer.readShort();
			@Pc(55) int local55 = inboundBuffer.readUnsignedShort();
			@Pc(61) int local61 = inboundBuffer.readUnsignedByte() * 4;
			@Pc(67) int local67 = inboundBuffer.readUnsignedByte() * 4;
			@Pc(71) int local71 = inboundBuffer.readUnsignedShort();
			@Pc(75) int local75 = inboundBuffer.readUnsignedShort();
			@Pc(79) int local79 = inboundBuffer.readUnsignedByte();
			if (local79 == 255) {
				local79 = -1;
			}
			@Pc(89) int local89 = inboundBuffer.readUnsignedByte();
			if (local26 >= 0 && local34 >= 0 && local26 < 208 && local34 < 208 && local41 >= 0 && local47 >= 0 && local41 < 208 && local47 < 208 && local55 != 65535) {
				@Pc(126) int local126 = local26 * 64;
				@Pc(130) int local130 = local34 * 64;
				@Pc(134) int local134 = local41 * 64;
				@Pc(161) ProjAnim local161 = new ProjAnim(local55, Static7.y, local126, local130, Static11.method522(local130, local126, Static7.y) - local61, local71 + client.loop, client.loop + local75, local79, local89, local51, local67);
				@Pc(165) int local165 = local47 * 64;
				local161.method3105(Static11.method522(local165, local134, Static7.y) - local67, local134, client.loop + local71, local165);
				Static1.aClass112_1.addTail(new ProjAnimNode(local161));
			}
		} else if (opcode == 114) {
			@Pc(198) int local198 = inboundBuffer.readUnsignedByte();
			@Pc(206) int local206 = Static1.anInt894 + (local198 >> 4 & 0x7);
			@Pc(212) int local212 = (local198 & 0x7) + Static1.anInt818;
			@Pc(216) int local216 = inboundBuffer.readUnsignedShort();
			@Pc(220) int local220 = inboundBuffer.readUnsignedShort();
			@Pc(224) int local224 = inboundBuffer.readUnsignedShort();
			if (local206 >= 0 && local212 >= 0 && local206 < 104 && local212 < 104) {
				@Pc(247) LinkedList local247 = Static4.objStacks[Static7.y][local206][local212];
				if (local247 != null) {
					for (@Pc(256) ObjStackNode local256 = (ObjStackNode) local247.head(); local256 != null; local256 = (ObjStackNode) local247.next()) {
						@Pc(262) ObjStack local262 = local256.value;
						if (local262.type == (local216 & 0x7FFF) && local220 == local262.count) {
							local262.count = local224;
							break;
						}
					}
					Static8.method89(local206, local212);
				}
			}
		} else {
			if (opcode == 133) {
				@Pc(306) int local306 = inboundBuffer.readShortA();
				@Pc(310) int local310 = inboundBuffer.readUnsignedByteA();
				@Pc(316) int local316 = (local310 & 0x7) + Static1.anInt818;
				@Pc(324) int local324 = (local310 >> 4 & 0x7) + Static1.anInt894;
				@Pc(328) int local328 = inboundBuffer.readUnsignedShortLEA();
				@Pc(332) int local332 = inboundBuffer.readUnsignedByte();
				@Pc(336) int local336 = local332 >> 2;
				@Pc(340) byte local340 = inboundBuffer.readByteS();
				@Pc(344) int local344 = local332 & 0x3;
				@Pc(348) byte local348 = inboundBuffer.readByteC();
				@Pc(352) byte local352 = inboundBuffer.readByte();
				@Pc(356) byte local356 = inboundBuffer.readByteC();
				@Pc(360) int local360 = inboundBuffer.readUnsignedShortLEA();
				@Pc(364) int local364 = inboundBuffer.readUnsignedShort();
				if (!GlRenderer.enabled) {
					Static13.method967(local340, local306, local328, local360, local336, local348, local352, local364, local344, local316, local356, local324);
				}
			}
			if (opcode == 111) {
				@Pc(390) int local390 = inboundBuffer.readUnsignedByte();
				@Pc(400) int local400 = Static1.anInt894 * 2 + (local390 >> 4 & 0xF);
				@Pc(408) int local408 = (local390 & 0xF) + Static1.anInt818 * 2;
				@Pc(414) int local414 = inboundBuffer.readByte() + local400;
				@Pc(421) int local421 = local408 + inboundBuffer.readByte();
				@Pc(425) int local425 = inboundBuffer.readShort();
				@Pc(429) int local429 = inboundBuffer.readShort();
				@Pc(433) int local433 = inboundBuffer.readUnsignedShort();
				@Pc(437) int local437 = inboundBuffer.readByte();
				@Pc(443) int local443 = inboundBuffer.readUnsignedByte() * 4;
				@Pc(447) int local447 = inboundBuffer.readUnsignedShort();
				@Pc(451) int local451 = inboundBuffer.readUnsignedShort();
				@Pc(455) int local455 = inboundBuffer.readUnsignedByte();
				if (local455 == 255) {
					local455 = -1;
				}
				@Pc(465) int local465 = inboundBuffer.readUnsignedByte();
				if (local400 >= 0 && local408 >= 0 && local400 < 208 && local408 < 208 && local414 >= 0 && local421 >= 0 && local414 < 208 && local421 < 208 && local433 != 65535) {
					@Pc(502) int local502 = local421 * 64;
					@Pc(506) int local506 = local414 * 64;
					@Pc(510) int local510 = local400 * 64;
					@Pc(514) int local514 = local408 * 64;
					if (local425 != 0) {
						@Pc(534) int local534;
						@Pc(542) PathingEntity local542;
						if (local425 >= 0) {
							@Pc(528) int local528 = local425 - 1;
							local534 = local528 >> 11 & 0xF;
							@Pc(538) int local538 = local528 & 0x7FF;
							local542 = NpcList.npcs[local538];
						} else {
							@Pc(549) int local549 = -local425 - 1;
							local534 = local549 >> 11 & 0xF;
							@Pc(559) int local559 = local549 & 0x7FF;
							if (local559 == PlayerList.selfId) {
								local542 = PlayerList.self;
							} else {
								local542 = PlayerList.players[local559];
							}
						}
						if (local542 != null) {
							@Pc(581) BasType local581 = local542.method3314();
							if (local581.anIntArrayArray7 != null && local581.anIntArrayArray7[local534] != null) {
								local437 -= local581.anIntArrayArray7[local534][1];
								@Pc(607) int local607 = local581.anIntArrayArray7[local534][0];
								@Pc(612) int local612 = MathUtils.SINE[local542.anInt4031];
								@Pc(619) int local619 = local581.anIntArrayArray7[local534][2];
								@Pc(624) int local624 = MathUtils.COSINE[local542.anInt4031];
								@Pc(634) int local634 = local607 * local624 + local612 * local619 >> 16;
								local619 = local624 * local619 - local607 * local612 >> 16;
								local514 += local619;
								local510 += local634;
							}
						}
					}
					@Pc(682) ProjAnim local682 = new ProjAnim(local433, Static7.y, local510, local514, Static11.method522(local514, local510, Static7.y) - local437, local447 + client.loop, client.loop + local451, local455, local465, local429, local443);
					local682.method3105(Static11.method522(local502, local506, Static7.y) - local443, local506, client.loop + local447, local502);
					Static1.aClass112_1.addTail(new ProjAnimNode(local682));
				}
			} else if (opcode == 158) {
				@Pc(715) int local715 = inboundBuffer.readUnsignedByte();
				@Pc(723) int local723 = (local715 >> 4 & 0x7) + Static1.anInt894;
				@Pc(729) int local729 = Static1.anInt818 + (local715 & 0x7);
				@Pc(733) int local733 = inboundBuffer.readUnsignedShort();
				@Pc(737) int local737 = inboundBuffer.readUnsignedByte();
				@Pc(741) int local741 = inboundBuffer.readUnsignedShort();
				if (local723 >= 0 && local729 >= 0 && local723 < 104 && local729 < 104) {
					@Pc(765) int local765 = local729 * 128 + 64;
					@Pc(771) int local771 = local723 * 128 + 64;
					@Pc(789) SpotAnim local789 = new SpotAnim(local733, Static7.y, local771, local765, Static11.method522(local765, local771, Static7.y) - local737, local741, client.loop);
					Static2.aClass112_8.addTail(new SpotAnimNode(local789));
				}
			} else if (opcode == 179) {
				@Pc(804) int local804 = inboundBuffer.readUnsignedShort();
				if (local804 == 65535) {
					local804 = -1;
				}
				@Pc(814) int shapeAndAngle = inboundBuffer.readUnsignedByteS();
				@Pc(818) int shape = shapeAndAngle >> 2;
				@Pc(822) int angle = shapeAndAngle & 0x3;
				@Pc(826) int layer = Loc.LAYERS[shape];
				@Pc(830) int offset = inboundBuffer.readUnsignedByte();
				@Pc(836) int z = (offset & 0x7) + Static1.anInt818;
				@Pc(844) int x = Static1.anInt894 + (offset >> 4 & 0x7);
				Static34.method4250(local804, x, Static7.y, z, layer, angle, shape);
			} else if (opcode == 131) {
				@Pc(863) int shapeAndAngle = inboundBuffer.readUnsignedByteS();
				@Pc(867) int shape = shapeAndAngle >> 2;
				@Pc(871) int layer = Loc.LAYERS[shape];
				@Pc(875) int angle = shapeAndAngle & 0x3;
				@Pc(879) int id = inboundBuffer.readUnsignedShortLE();
				@Pc(883) int offset = inboundBuffer.readUnsignedByte();
				@Pc(889) int z = (offset & 0x7) + Static1.anInt818;
				@Pc(897) int x = (offset >> 4 & 0x7) + Static1.anInt894;
				if (x >= 0 && z >= 0 && x < 104 && z < 104) {
					ChangeLocRequest.push(id, x, Static7.y, z, angle, shape, layer, 0, -1);
				}
			} else if (opcode == 115) {
				@Pc(935) int id = inboundBuffer.readUnsignedShort();
				@Pc(939) int shape = inboundBuffer.readUnsignedByte();
				LocTypeList.get(id).isReady(shape);
			} else if (opcode == 232) {
				@Pc(954) int offset = inboundBuffer.readUnsignedByteC();
				@Pc(960) int z = Static1.anInt818 + (offset & 0x7);
				@Pc(968) int x = (offset >> 4 & 0x7) + Static1.anInt894;
				@Pc(972) int shapeAndAngle = inboundBuffer.readUnsignedByte();
				@Pc(976) int shape = shapeAndAngle >> 2;
				@Pc(980) int layer = Loc.LAYERS[shape];
				@Pc(984) int angle = shapeAndAngle & 0x3;
				if (x >= 0 && z >= 0 && x < 104 && z < 104) {
					ChangeLocRequest.push(-1, x, Static7.y, z, angle, shape, layer, 0, -1);
				}
			} else if (opcode == 105) {
				@Pc(1022) int local1022 = inboundBuffer.readUnsignedByte();
				@Pc(1030) int local1030 = (local1022 >> 4 & 0x7) + Static1.anInt894;
				@Pc(1036) int local1036 = (local1022 & 0x7) + Static1.anInt818;
				@Pc(1042) int local1042 = inboundBuffer.readByte() + local1030;
				@Pc(1048) int local1048 = inboundBuffer.readByte() + local1036;
				@Pc(1052) int local1052 = inboundBuffer.readShort();
				@Pc(1056) int local1056 = inboundBuffer.readUnsignedShort();
				@Pc(1062) int local1062 = inboundBuffer.readUnsignedByte() * 4;
				@Pc(1068) int local1068 = inboundBuffer.readUnsignedByte() * 4;
				@Pc(1072) int local1072 = inboundBuffer.readUnsignedShort();
				@Pc(1076) int local1076 = inboundBuffer.readUnsignedShort();
				@Pc(1080) int local1080 = inboundBuffer.readUnsignedByte();
				@Pc(1084) int local1084 = inboundBuffer.readUnsignedByte();
				if (local1080 == 255) {
					local1080 = -1;
				}
				if (local1030 >= 0 && local1036 >= 0 && local1030 < 104 && local1036 < 104 && local1042 >= 0 && local1048 >= 0 && local1042 < 104 && local1048 < 104 && local1056 != 65535) {
					@Pc(1128) int local1128 = local1036 * 128 + 64;
					@Pc(1134) int local1134 = local1042 * 128 + 64;
					@Pc(1140) int local1140 = local1048 * 128 + 64;
					@Pc(1146) int local1146 = local1030 * 128 + 64;
					@Pc(1173) ProjAnim local1173 = new ProjAnim(local1056, Static7.y, local1146, local1128, Static11.method522(local1128, local1146, Static7.y) - local1062, client.loop + local1072, local1076 + client.loop, local1080, local1084, local1052, local1068);
					local1173.method3105(Static11.method522(local1140, local1134, Static7.y) - local1068, local1134, local1072 + client.loop, local1140);
					Static1.aClass112_1.addTail(new ProjAnimNode(local1173));
				}
			} else if (opcode == 120) {
				@Pc(1203) int local1203 = inboundBuffer.readUnsignedByteS();
				@Pc(1212) int local1212 = Static1.anInt894 + (local1203 >> 4 & 0x7);
				@Pc(1218) int local1218 = (local1203 & 0x7) + Static1.anInt818;
				@Pc(1222) int local1222 = inboundBuffer.readUnsignedShortA();
				if (local1212 >= 0 && local1218 >= 0 && local1212 < 104 && local1218 < 104) {
					@Pc(1245) LinkedList local1245 = Static4.objStacks[Static7.y][local1212][local1218];
					if (local1245 != null) {
						for (@Pc(1253) ObjStackNode local1253 = (ObjStackNode) local1245.head(); local1253 != null; local1253 = (ObjStackNode) local1245.next()) {
							if ((local1222 & 0x7FFF) == local1253.value.type) {
								local1253.unlink();
								break;
							}
						}
						if (local1245.head() == null) {
							Static4.objStacks[Static7.y][local1212][local1218] = null;
						}
						Static8.method89(local1212, local1218);
					}
				}
			} else if (opcode == 60) {
				@Pc(1306) int local1306 = inboundBuffer.readUnsignedByteA();
				@Pc(1312) int local1312 = Static1.anInt818 + (local1306 & 0x7);
				@Pc(1320) int local1320 = (local1306 >> 4 & 0x7) + Static1.anInt894;
				@Pc(1324) int local1324 = inboundBuffer.readUnsignedShortLE();
				@Pc(1328) int local1328 = inboundBuffer.readUnsignedShortA();
				if (local1320 >= 0 && local1312 >= 0 && local1320 < 104 && local1312 < 104) {
					@Pc(1352) ObjStack local1352 = new ObjStack();
					local1352.count = local1328;
					local1352.type = local1324;
					if (Static4.objStacks[Static7.y][local1320][local1312] == null) {
						Static4.objStacks[Static7.y][local1320][local1312] = new LinkedList();
					}
					Static4.objStacks[Static7.y][local1320][local1312].addTail(new ObjStackNode(local1352));
					Static8.method89(local1320, local1312);
				}
			} else if (opcode == 144) {
				@Pc(1403) int local1403 = inboundBuffer.readUnsignedByte();
				@Pc(1410) int local1410 = Static1.anInt818 + (local1403 & 0x7);
				@Pc(1419) int local1419 = Static1.anInt894 + (local1403 >> 4 & 0x7);
				@Pc(1423) int local1423 = inboundBuffer.readUnsignedShort();
				if (local1423 == 65535) {
					local1423 = -1;
				}
				@Pc(1433) int local1433 = inboundBuffer.readUnsignedByte();
				@Pc(1439) int local1439 = local1433 >> 4 & 0xF;
				@Pc(1443) int local1443 = local1433 & 0x7;
				@Pc(1447) int local1447 = inboundBuffer.readUnsignedByte();
				@Pc(1451) int local1451 = inboundBuffer.readUnsignedByte();
				if (local1419 >= 0 && local1410 >= 0 && local1419 < 104 && local1410 < 104) {
					@Pc(1474) int local1474 = local1439 + 1;
					if (local1419 - local1474 <= PlayerList.self.anIntArray422[0] && PlayerList.self.anIntArray422[0] <= local1474 + local1419 && local1410 - local1474 <= PlayerList.self.anIntArray426[0] && local1410 + local1474 >= PlayerList.self.anIntArray426[0] && Preferences.areaSoundsVolume != 0 && local1443 > 0 && Static6.anInt4457 < 50 && local1423 != -1) {
						Static4.anIntArray294[Static6.anInt4457] = local1423;
						Static7.anIntArray629[Static6.anInt4457] = local1443;
						Static3.anIntArray217[Static6.anInt4457] = local1447;
						Static4.aClass7Array1[Static6.anInt4457] = null;
						Static7.anIntArray601[Static6.anInt4457] = local1439 + (local1410 << 8) + (local1419 << 16);
						Static1.anIntArray21[Static6.anInt4457] = local1451;
						Static6.anInt4457++;
					}
				}
			} else if (opcode == 47) {
				@Pc(1577) int local1577 = inboundBuffer.readUnsignedShortLEA();
				@Pc(1581) int local1581 = inboundBuffer.readUnsignedShort();
				@Pc(1585) int local1585 = inboundBuffer.readUnsignedShort();
				@Pc(1589) int local1589 = inboundBuffer.readUnsignedByteA();
				@Pc(1597) int local1597 = (local1589 >> 4 & 0x7) + Static1.anInt894;
				@Pc(1603) int local1603 = Static1.anInt818 + (local1589 & 0x7);
				if (local1597 >= 0 && local1603 >= 0 && local1597 < 104 && local1603 < 104 && local1581 != PlayerList.selfId) {
					@Pc(1629) ObjStack local1629 = new ObjStack();
					local1629.count = local1585;
					local1629.type = local1577;
					if (Static4.objStacks[Static7.y][local1597][local1603] == null) {
						Static4.objStacks[Static7.y][local1597][local1603] = new LinkedList();
					}
					Static4.objStacks[Static7.y][local1597][local1603].addTail(new ObjStackNode(local1629));
					Static8.method89(local1597, local1603);
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
			@Pc(425) int y = inboundBuffer.readUnsignedByteC();
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
			Static1.aByteArrayArray4 = new byte[mapSquares][];
			Static3.underwaterLocGroupIds = new int[mapSquares];
			Static1.locGroupIds = new int[mapSquares];
			Static7.aByteArrayArray50 = null;
			Static7.aByteArrayArray49 = new byte[mapSquares][];
			Static5.aByteArrayArray31 = new byte[mapSquares][];
			Static6.anIntArray570 = null;
			Static1.aByteArrayArray3 = new byte[mapSquares][];
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
			Static8.method2(false, zoneX, buildAreaChanged, localZ, localX, zoneZ, y);
			return;
		}
		@Pc(19) int localY = inboundBuffer.readUnsignedShortLEA();
		@Pc(23) int zoneY = inboundBuffer.readUnsignedShortA();
		@Pc(27) int zoneX = inboundBuffer.readUnsignedShortLE();
		inboundBuffer.startBitAccess();
		for (@Pc(32) int y = 0; y < 4; y++) {
			for (@Pc(39) int x = 0; x < 13; x++) {
				for (@Pc(46) int z = 0; z < 13; z++) {
					@Pc(56) int local56 = inboundBuffer.readBits(1);
					if (local56 == 1) {
						Static7.zones[y][x][z] = inboundBuffer.readBits(26);
					} else {
						Static7.zones[y][x][z] = -1;
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
		@Pc(148) int y = inboundBuffer.readUnsignedByteA();
		Static3.underwaterLocGroupIds = new int[mapSquares];
		Static7.aByteArrayArray50 = null;
		Static7.aByteArrayArray49 = new byte[mapSquares][];
		Static7.mapSquares = new int[mapSquares];
		Static6.anIntArray570 = null;
		Static4.underwaterMapGroupIds = new int[mapSquares];
		Static3.mapGroupIds = new int[mapSquares];
		Static1.aByteArrayArray3 = new byte[mapSquares][];
		Static5.aByteArrayArray31 = new byte[mapSquares][];
		Static1.locGroupIds = new int[mapSquares];
		Static1.aByteArrayArray4 = new byte[mapSquares][];
		@Pc(182) int i = 0;
		for (@Pc(184) int y0 = 0; y0 < 4; y0++) {
			for (@Pc(189) int x = 0; x < 13; x++) {
				for (@Pc(194) int z = 0; z < 13; z++) {
					@Pc(207) int zone = Static7.zones[y0][x][z];
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
		Static8.method2(false, zoneX, buildAreaChanged, localY, localX, zoneY, y);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	public static void readPlayerInfoPacket() {
		removedCount = 0;
		extendedCount = 0;
		readSelfPlayerInfo();
		readPlayerInfo();
		readNewPlayerInfo();
		readExtendedPlayerInfo();
		for (@Pc(19) int i = 0; i < removedCount; i++) {
			@Pc(34) int id = removedIds[i];
			if (client.loop != PlayerList.players[id].anInt3990) {
				if (PlayerList.players[id].soundRadius > 0) {
					Static12.method739(PlayerList.players[id]);
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
			@Pc(42) int local42 = inboundBuffer.readBits(3);
			PlayerList.self.method3308(local42, 1);
			@Pc(54) int local54 = inboundBuffer.readBits(1);
			if (local54 == 1) {
				extendedIds[extendedCount++] = 2047;
			}
		} else if (type == 2) {
			if (inboundBuffer.readBits(1) == 1) {
				@Pc(82) int local82 = inboundBuffer.readBits(3);
				PlayerList.self.method3308(local82, 2);
				@Pc(92) int local92 = inboundBuffer.readBits(3);
				PlayerList.self.method3308(local92, 2);
			} else {
				@Pc(104) int local104 = inboundBuffer.readBits(3);
				PlayerList.self.method3308(local104, 0);
			}
			@Pc(114) int local114 = inboundBuffer.readBits(1);
			if (local114 == 1) {
				extendedIds[extendedCount++] = 2047;
			}
		} else if (type == 3) {
			@Pc(137) int local137 = inboundBuffer.readBits(7);
			@Pc(142) int local142 = inboundBuffer.readBits(1);
			@Pc(147) int local147 = inboundBuffer.readBits(1);
			if (local147 == 1) {
				extendedIds[extendedCount++] = 2047;
			}
			Static7.y = inboundBuffer.readBits(2);
			@Pc(171) int local171 = inboundBuffer.readBits(7);
			PlayerList.self.method1174(local137, local142 == 1, local171);
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
				player.anInt3990 = client.loop;
			} else {
				@Pc(94) int type = inboundBuffer.readBits(2);
				if (type == 0) {
					PlayerList.ids[PlayerList.size++] = id;
					player.anInt3990 = client.loop;
					extendedIds[Protocol.extendedCount++] = id;
				} else if (type == 1) {
					PlayerList.ids[PlayerList.size++] = id;
					player.anInt3990 = client.loop;
					@Pc(140) int local140 = inboundBuffer.readBits(3);
					player.method3308(local140, 1);
					@Pc(150) int local150 = inboundBuffer.readBits(1);
					if (local150 == 1) {
						extendedIds[Protocol.extendedCount++] = id;
					}
				} else if (type == 2) {
					PlayerList.ids[PlayerList.size++] = id;
					player.anInt3990 = client.loop;
					if (inboundBuffer.readBits(1) == 1) {
						@Pc(193) int local193 = inboundBuffer.readBits(3);
						player.method3308(local193, 2);
						@Pc(205) int local205 = inboundBuffer.readBits(3);
						player.method3308(local205, 2);
					} else {
						@Pc(219) int local219 = inboundBuffer.readBits(3);
						player.method3308(local219, 0);
					}
					@Pc(229) int local229 = inboundBuffer.readBits(1);
					if (local229 == 1) {
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
					player.anInt3990 = client.loop;
					@Pc(75) int local75 = PathingEntity.ANGLES[inboundBuffer.readBits(3)];
					if (created) {
						player.anInt4017 = player.anInt4031 = local75;
					}
					@Pc(88) int local88 = inboundBuffer.readBits(5);
					if (local88 > 15) {
						local88 -= 32;
					}
					@Pc(97) int local97 = inboundBuffer.readBits(1);
					@Pc(102) int extended = inboundBuffer.readBits(1);
					if (extended == 1) {
						extendedIds[extendedCount++] = id;
					}
					@Pc(119) int local119 = inboundBuffer.readBits(5);
					if (local119 > 15) {
						local119 -= 32;
					}
					player.method1174(PlayerList.self.anIntArray426[0] + local119, local97 == 1, PlayerList.self.anIntArray422[0] + local88);
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
			@Pc(14) int local14 = inboundBuffer.readUnsignedShortSmart();
			@Pc(18) int local18 = inboundBuffer.readUnsignedByte();
			player.method3304(client.loop, local18, local14);
			player.anInt3993 = client.loop + 300;
			player.anInt4022 = inboundBuffer.readUnsignedByteC();
		}
		if ((flags & 0x2) != 0) {
			@Pc(43) int local43 = inboundBuffer.readUnsignedShort();
			if (local43 == 65535) {
				local43 = -1;
			}
			@Pc(53) int local53 = inboundBuffer.readUnsignedByte();
			Static38.method4793(player, local43, local53);
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
			player.anInt4014 = inboundBuffer.readUnsignedShortLE();
			player.anInt4003 = inboundBuffer.readUnsignedShort();
		}
		if ((flags & 0x800) != 0) {
			@Pc(117) int local117 = inboundBuffer.readUnsignedByteA();
			@Pc(120) int[] local120 = new int[local117];
			@Pc(123) int[] local123 = new int[local117];
			@Pc(126) int[] local126 = new int[local117];
			for (@Pc(128) int local128 = 0; local128 < local117; local128++) {
				@Pc(135) int local135 = inboundBuffer.readUnsignedShort();
				if (local135 == 65535) {
					local135 = -1;
				}
				local120[local128] = local135;
				local123[local128] = inboundBuffer.readUnsignedByteS();
				local126[local128] = inboundBuffer.readUnsignedShortLEA();
			}
			Static32.method4023(local126, player, local123, local120);
		}
		if ((flags & 0x10) != 0) {
			player.aString234 = inboundBuffer.readString();
			if (player.aString234.charAt(0) == '~') {
				player.aString234 = player.aString234.substring(1);
				Static26.method4357(player.method1173(), 2, player.aString234);
			} else if (player == PlayerList.self) {
				Static26.method4357(player.method1173(), 2, player.aString234);
			}
			player.anInt3998 = 0;
			player.anInt3981 = 0;
			player.anInt4023 = 150;
		}
		if ((flags & 0x20) != 0) {
			@Pc(232) int local232 = inboundBuffer.readUnsignedShortA();
			@Pc(236) int local236 = inboundBuffer.readUnsignedByteA();
			@Pc(244) boolean local244 = (local232 & 0x8000) != 0;
			@Pc(248) int local248 = inboundBuffer.readUnsignedByteS();
			@Pc(251) int local251 = inboundBuffer.position;
			if (player.name != null && player.appearance != null) {
				@Pc(264) long local264 = Base37.encode(player.name);
				@Pc(266) boolean local266 = false;
				if (local236 <= 1) {
					if (!local244 && (LoginManager.playerUnderage && !LoginManager.parentalChatConsent || LoginManager.mapQuickChat)) {
						local266 = true;
					} else {
						for (@Pc(284) int local284 = 0; local284 < Static6.anInt4516; local284++) {
							if (local264 == Static3.aLongArray16[local284]) {
								local266 = true;
								break;
							}
						}
					}
				}
				if (!local266 && Static3.anInt5405 == 0) {
					Static5.aClass4_Sub10_8.position = 0;
					@Pc(314) int phraseId = -1;
					inboundBuffer.readBytesReverse(Static5.aClass4_Sub10_8.bytes, local248);
					Static5.aClass4_Sub10_8.position = 0;
					@Pc(333) String message;
					if (local244) {
						local232 &= 32767;
						@Pc(343) QuickChatPhrase phrase = QuickChatPhrase.decode(Static5.aClass4_Sub10_8);
						phraseId = phrase.id;
						message = phrase.type.decodeMessage(Static5.aClass4_Sub10_8);
					} else {
						message = StringUtils.escape(Static30.method3569(WordPack.readString(Static5.aClass4_Sub10_8)));
					}
					player.aString234 = message.trim();
					player.anInt3998 = local232 & 0xFF;
					player.anInt4023 = 150;
					player.anInt3981 = local232 >> 8;
					if (local236 == 2) {
						Static25.method2927("<img=1>" + player.method1173(), phraseId, null, local244 ? 17 : 1, message);
					} else if (local236 == 1) {
						Static25.method2927("<img=0>" + player.method1173(), phraseId, null, local244 ? 17 : 1, message);
					} else {
						Static25.method2927(player.method1173(), phraseId, null, local244 ? 17 : 2, message);
					}
				}
			}
			inboundBuffer.position = local251 + local248;
		}
		if ((flags & 0x100) != 0) {
			@Pc(450) int local450 = inboundBuffer.readUnsignedShortLE();
			@Pc(454) int local454 = inboundBuffer.readInt();
			@Pc(456) boolean local456 = true;
			if (local450 == 65535) {
				local450 = -1;
			}
			if (local450 != -1 && player.anInt3961 != -1 && SeqTypeList.get(SpotAnimTypeList.get(local450).anInt3134).anInt1243 < SeqTypeList.get(SpotAnimTypeList.get(player.anInt3961).anInt3134).anInt1243) {
				local456 = false;
			}
			if (local456) {
				player.anInt3976 = 1;
				player.anInt3971 = local454 >> 16;
				player.anInt3968 = 0;
				player.anInt4026 = 0;
				player.anInt3984 = (local454 & 0xFFFF) + client.loop;
				if (client.loop < player.anInt3984) {
					player.anInt4026 = -1;
				}
				player.anInt3961 = local450;
				if (player.anInt3961 != -1 && client.loop == player.anInt3984) {
					@Pc(553) int local553 = SpotAnimTypeList.get(player.anInt3961).anInt3134;
					if (local553 != -1) {
						@Pc(562) SeqType local562 = SeqTypeList.get(local553);
						if (local562 != null && local562.anIntArray95 != null) {
							Static29.method3461(local562, player.z, player.x, 0, player == PlayerList.self);
						}
					}
				}
			}
		}
		if ((flags & 0x40) != 0) {
			player.anInt3985 = inboundBuffer.readUnsignedShortA();
			if (player.anInt3985 == 65535) {
				player.anInt3985 = -1;
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
			player.anInt3965 = 1;
			player.anInt4030 = 0;
		}
		if ((flags & 0x400) != 0) {
			@Pc(670) int local670 = inboundBuffer.readUnsignedShortSmart();
			@Pc(674) int local674 = inboundBuffer.readUnsignedByte();
			player.method3304(client.loop, local674, local670);
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
	public static void readNpcInfoPacket() {
		extendedCount = 0;
		removedCount = 0;
		readNpcInfo();
		readNewNpcInfo();
		readExtendedNpcInfo();
		for (@Pc(17) int i = 0; i < removedCount; i++) {
			@Pc(28) int id = removedIds[i];
			if (client.loop != NpcList.npcs[id].anInt3990) {
				if (NpcList.npcs[id].type.method4260()) {
					Static25.method2931(NpcList.npcs[id]);
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
				npc.anInt3990 = client.loop;
			} else {
				@Pc(106) int type = inboundBuffer.readBits(2);
				if (type == 0) {
					NpcList.ids[NpcList.size++] = id;
					npc.anInt3990 = client.loop;
					extendedIds[extendedCount++] = id;
				} else if (type == 1) {
					NpcList.ids[NpcList.size++] = id;
					npc.anInt3990 = client.loop;
					@Pc(151) int local151 = inboundBuffer.readBits(3);
					npc.method3308(local151, 1);
					@Pc(161) int local161 = inboundBuffer.readBits(1);
					if (local161 == 1) {
						extendedIds[extendedCount++] = id;
					}
				} else if (type == 2) {
					NpcList.ids[NpcList.size++] = id;
					npc.anInt3990 = client.loop;
					if (inboundBuffer.readBits(1) == 1) {
						@Pc(215) int local215 = inboundBuffer.readBits(3);
						npc.method3308(local215, 2);
						@Pc(227) int local227 = inboundBuffer.readBits(3);
						npc.method3308(local227, 2);
					} else {
						@Pc(201) int local201 = inboundBuffer.readBits(3);
						npc.method3308(local201, 0);
					}
					@Pc(237) int local237 = inboundBuffer.readBits(1);
					if (local237 == 1) {
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
					npc.anInt3990 = client.loop;
					if (npc.type != null && npc.type.method4260()) {
						Static25.method2931(npc);
					}
					@Pc(77) int local77 = inboundBuffer.readBits(5);
					if (local77 > 15) {
						local77 -= 32;
					}
					@Pc(89) int local89 = PathingEntity.ANGLES[inboundBuffer.readBits(3)];
					if (created) {
						npc.anInt4017 = npc.anInt4031 = local89;
					}
					@Pc(102) int local102 = inboundBuffer.readBits(5);
					npc.setType(NpcTypeList.get(inboundBuffer.readBits(14)));
					@Pc(116) int extended = inboundBuffer.readBits(1);
					if (local102 > 15) {
						local102 -= 32;
					}
					if (extended == 1) {
						extendedIds[extendedCount++] = id;
					}
					@Pc(139) int local139 = inboundBuffer.readBits(1);
					npc.setSize(npc.type.size);
					npc.basId = npc.type.anInt5261;
					npc.anInt4009 = npc.type.anInt5243;
					if (npc.anInt4009 == 0) {
						npc.anInt4031 = 0;
					}
					npc.method3301(PlayerList.self.anIntArray426[0] + local77, npc.getSize(), local102 + PlayerList.self.anIntArray422[0], local139 == 1);
					if (npc.type.method4260()) {
						Static8.method109(null, npc.anIntArray422[0], npc, npc.anIntArray426[0], null, 0, Static7.y);
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
				@Pc(43) int local43 = inboundBuffer.readUnsignedByteC();
				@Pc(49) int local49 = inboundBuffer.readUnsignedByteS();
				npc.method3304(client.loop, local49, local43);
				npc.anInt3993 = client.loop + 300;
				npc.anInt4022 = inboundBuffer.readUnsignedByteC();
			}
			if ((flags & 0x100) != 0) {
				@Pc(74) int local74 = inboundBuffer.readUnsignedByteA();
				@Pc(77) int[] local77 = new int[local74];
				@Pc(80) int[] local80 = new int[local74];
				@Pc(83) int[] local83 = new int[local74];
				for (@Pc(85) int local85 = 0; local85 < local74; local85++) {
					@Pc(96) int local96 = inboundBuffer.readUnsignedShortLE();
					if (local96 == 65535) {
						local96 = -1;
					}
					local83[local85] = local96;
					local77[local85] = inboundBuffer.readUnsignedByteC();
					local80[local85] = inboundBuffer.readUnsignedShortLEA();
				}
				Static11.method555(local83, npc, local80, local77);
			}
			if ((flags & 0x10) != 0) {
				@Pc(141) int local141 = inboundBuffer.readUnsignedByteA();
				@Pc(145) int local145 = inboundBuffer.readUnsignedByteS();
				npc.method3304(client.loop, local145, local141);
			}
			if ((flags & 0x2) != 0) {
				if (npc.type.method4260()) {
					Static25.method2931(npc);
				}
				npc.setType(NpcTypeList.get(inboundBuffer.readUnsignedShortA()));
				npc.setSize(npc.type.size);
				npc.anInt4009 = npc.type.anInt5243;
				npc.basId = npc.type.anInt5261;
				if (npc.type.method4260()) {
					Static8.method109(null, npc.anIntArray422[0], npc, npc.anIntArray426[0], null, 0, Static7.y);
				}
			}
			if ((flags & 0x200) != 0) {
				npc.anInt4014 = inboundBuffer.readUnsignedShortLEA();
				npc.anInt4003 = inboundBuffer.readUnsignedShort();
			}
			if ((flags & 0x20) != 0) {
				@Pc(238) int local238 = inboundBuffer.readUnsignedShort();
				if (local238 == 65535) {
					local238 = -1;
				}
				@Pc(250) int local250 = inboundBuffer.readUnsignedByteS();
				Static11.method529(local238, npc, local250);
			}
			if ((flags & 0x4) != 0) {
				@Pc(266) int local266 = inboundBuffer.readUnsignedShortA();
				@Pc(270) int local270 = inboundBuffer.readInt();
				@Pc(272) boolean local272 = true;
				if (local266 == 65535) {
					local266 = -1;
				}
				if (local266 != -1 && npc.anInt3961 != -1 && SeqTypeList.get(SpotAnimTypeList.get(local266).anInt3134).anInt1243 < SeqTypeList.get(SpotAnimTypeList.get(npc.anInt3961).anInt3134).anInt1243) {
					local272 = false;
				}
				if (local272) {
					npc.anInt3968 = 0;
					npc.anInt4026 = 0;
					npc.anInt3976 = 1;
					npc.anInt3984 = (local270 & 0xFFFF) + client.loop;
					if (npc.anInt3984 > client.loop) {
						npc.anInt4026 = -1;
					}
					npc.anInt3971 = local270 >> 16;
					npc.anInt3961 = local266;
					if (npc.anInt3961 != -1 && client.loop == npc.anInt3984) {
						@Pc(358) int local358 = SpotAnimTypeList.get(npc.anInt3961).anInt3134;
						if (local358 != -1) {
							@Pc(365) SeqType local365 = SeqTypeList.get(local358);
							if (local365 != null && local365.anIntArray95 != null) {
								Static29.method3461(local365, npc.z, npc.x, 0, false);
							}
						}
					}
				}
			}
			if ((flags & 0x8) != 0) {
				npc.anInt3985 = inboundBuffer.readUnsignedShortLE();
				if (npc.anInt3985 == 65535) {
					npc.anInt3985 = -1;
				}
			}
			if ((flags & 0x80) != 0) {
				npc.aString234 = inboundBuffer.readString();
				npc.anInt4023 = 100;
			}
		}
	}
}
