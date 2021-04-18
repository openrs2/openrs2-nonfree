import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
	public static void method4791() {
		Static5.aByteArrayArrayArray18 = null;
		Static1.tileAngles = null;
		Static4.anIntArrayArrayArray9 = null;
		Static6.anIntArray465 = null;
		Static2.rowChroma = null;
		Static4.tileOverlays = null;
		Static2.tileShapes = null;
		Static2.tileUnderlays = null;
		Static6.rowWeightedHue = null;
		Static7.rowSaturation = null;
		Static6.rowLightness = null;
		Static6.rowCount = null;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!f;III)V")
	public static void method4793(@OriginalArg(0) Player arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.seqId == arg1 && arg1 != -1) {
			@Pc(89) SeqType local89 = SeqTypeList.get(arg1);
			@Pc(92) int local92 = local89.anInt1238;
			if (local92 == 1) {
				arg0.anInt3996 = arg2;
				arg0.anInt3970 = 0;
				arg0.anInt4044 = 0;
				arg0.anInt4011 = 1;
				arg0.anInt4001 = 0;
				SoundPlayer.playSeqSound(local89, arg0.zFine, arg0.xFine, arg0.anInt3970, arg0 == PlayerList.self);
			}
			if (local92 == 2) {
				arg0.anInt4001 = 0;
			}
		} else if (arg1 == -1 || arg0.seqId == -1 || SeqTypeList.get(arg1).anInt1243 >= SeqTypeList.get(arg0.seqId).anInt1243) {
			arg0.seqId = arg1;
			arg0.anInt4044 = 0;
			arg0.anInt3996 = arg2;
			arg0.anInt3970 = 0;
			arg0.anInt4011 = 1;
			arg0.anInt4001 = 0;
			arg0.anInt4030 = arg0.movementQueueSize;
			if (arg0.seqId != -1) {
				SoundPlayer.playSeqSound(SeqTypeList.get(arg0.seqId), arg0.zFine, arg0.xFine, arg0.anInt3970, arg0 == PlayerList.self);
			}
		}
	}

}
