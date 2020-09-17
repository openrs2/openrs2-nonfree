import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!fh;IB)[Lclient!fe;")
	public static SoftwareIndexedSprite[] method4790(@OriginalArg(0) Js5 arg0, @OriginalArg(1) int arg1) {
		return Static33.method4131(arg0, arg1) ? Static26.method4358() : null;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
	public static void method4791() {
		Static5.aByteArrayArrayArray18 = null;
		Static1.aByteArrayArrayArray1 = null;
		Static4.anIntArrayArrayArray9 = null;
		Static6.anIntArray465 = null;
		Static2.anIntArray649 = null;
		Static4.aByteArrayArrayArray15 = null;
		Static2.aByteArrayArrayArray4 = null;
		Static2.aByteArrayArrayArray3 = null;
		Static6.anIntArray491 = null;
		Static7.anIntArray650 = null;
		Static6.anIntArray523 = null;
		Static6.anIntArray549 = null;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!f;III)V")
	public static void method4793(@OriginalArg(0) Player arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.anInt4007 == arg1 && arg1 != -1) {
			@Pc(89) SeqType local89 = SeqTypeList.get(arg1);
			@Pc(92) int local92 = local89.anInt1238;
			if (local92 == 1) {
				arg0.anInt3996 = arg2;
				arg0.anInt3970 = 0;
				arg0.anInt4044 = 0;
				arg0.anInt4011 = 1;
				arg0.anInt4001 = 0;
				Static29.method3461(local89, arg0.z, arg0.x, arg0.anInt3970, arg0 == PlayerList.self);
			}
			if (local92 == 2) {
				arg0.anInt4001 = 0;
			}
		} else if (arg1 == -1 || arg0.anInt4007 == -1 || SeqTypeList.get(arg1).anInt1243 >= SeqTypeList.get(arg0.anInt4007).anInt1243) {
			arg0.anInt4007 = arg1;
			arg0.anInt4044 = 0;
			arg0.anInt3996 = arg2;
			arg0.anInt3970 = 0;
			arg0.anInt4011 = 1;
			arg0.anInt4001 = 0;
			arg0.anInt4030 = arg0.anInt3965;
			if (arg0.anInt4007 != -1) {
				Static29.method3461(SeqTypeList.get(arg0.anInt4007), arg0.z, arg0.x, arg0.anInt3970, arg0 == PlayerList.self);
			}
		}
	}

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "(B)V")
	public static void method4825() {
		for (@Pc(7) int local7 = -1; local7 < PlayerList.size; local7++) {
			@Pc(19) int local19;
			if (local7 == -1) {
				local19 = 2047;
			} else {
				local19 = PlayerList.ids[local7];
			}
			@Pc(29) Player local29 = PlayerList.players[local19];
			if (local29 != null && local29.anInt4023 > 0) {
				local29.anInt4023--;
				if (local29.anInt4023 == 0) {
					local29.aString234 = null;
				}
			}
		}
		for (@Pc(57) int local57 = 0; local57 < NpcList.size; local57++) {
			@Pc(64) int local64 = NpcList.ids[local57];
			@Pc(68) Npc local68 = NpcList.npcs[local64];
			if (local68 != null && local68.anInt4023 > 0) {
				local68.anInt4023--;
				if (local68.anInt4023 == 0) {
					local68.aString234 = null;
				}
			}
		}
	}

}
