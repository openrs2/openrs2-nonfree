import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class ShadowModelList {
	@OriginalMember(owner = "client!sd", name = "b", descriptor = "Lclient!cc;")
	public static final SoftLruHashTable models = new SoftLruHashTable(32);

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILclient!eg;IIILclient!vg;IIIZIII)Lclient!vg;")
	public static Model get(@OriginalArg(0) int arg0, @OriginalArg(2) SeqType arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Model arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(23) long key = ((long) arg10 << 32) + (long) ((arg4 << 24) + (arg11 << 16) + arg3) + ((long) arg0 << 48);
		@Pc(33) Model model = (Model) models.get(key);
		if (model == null) {
			@Pc(41) byte local41;
			if (arg3 == 1) {
				local41 = 9;
			} else if (arg3 == 2) {
				local41 = 12;
			} else if (arg3 == 3) {
				local41 = 15;
			} else if (arg3 == 4) {
				local41 = 18;
			} else {
				local41 = 21;
			}
			@Pc(83) int[] local83 = new int[] { 64, 96, 128 };
			@Pc(89) int[][] local89 = new int[3][local41];
			@Pc(107) RawModel local107 = new RawModel(local41 * 3 + 1, local41 * 2 * 3 - local41, 0);
			@Pc(113) int local113 = local107.addVertex(0, 0);
			for (@Pc(115) int local115 = 0; local115 < 3; local115++) {
				@Pc(126) int local126 = local83[local115];
				@Pc(130) int local130 = local83[local115];
				for (@Pc(132) int local132 = 0; local132 < local41; local132++) {
					@Pc(145) int local145 = (local132 << 11) / local41;
					@Pc(155) int local155 = MathUtils.SINE[local145] * local126 + arg12 >> 16;
					@Pc(165) int local165 = MathUtils.COSINE[local145] * local130 + arg8 >> 16;
					local89[local115][local132] = local107.addVertex(local155, local165);
				}
			}
			for (@Pc(183) int local183 = 0; local183 < 3; local183++) {
				@Pc(198) int local198 = (local183 * 256 + 128) / 3;
				@Pc(203) int local203 = 256 - local198;
				@Pc(214) byte local214 = (byte) (local198 * arg4 + local203 * arg11 >> 8);
				@Pc(259) short local259 = (short) ((local198 * (arg0 & 0xFC00) + local203 * (arg10 & 0xFC00) & 0xFC0000) + ((arg0 & 0x380) * local198 + local203 * (arg10 & 0x380) & 0x38000) + ((arg10 & 0x7F) * local203 + local198 * (arg0 & 0x7F) & 0x7F00) >> 8);
				for (@Pc(261) int local261 = 0; local261 < local41; local261++) {
					if (local183 == 0) {
						local107.addTriangle(local113, local89[0][(local261 + 1) % local41], local89[0][local261], local259, local214);
					} else {
						local107.addTriangle(local89[local183 - 1][local261], local89[local183 - 1][(local261 + 1) % local41], local89[local183][(local261 + 1) % local41], local259, local214);
						local107.addTriangle(local89[local183 - 1][local261], local89[local183][(local261 + 1) % local41], local89[local183][local261], local259, local214);
					}
				}
			}
			model = local107.createModel(64, 768, -50, -10, -50);
			models.put(key, model);
		}
		@Pc(377) int local377 = arg3 * 64 - 1;
		@Pc(380) int local380 = -local377;
		@Pc(387) int local387 = local377;
		@Pc(390) int local390 = -local377;
		@Pc(392) int local392 = local377;
		if (arg9) {
			if (arg2 > 128 && arg2 < 896) {
				local380 -= 128;
			}
			if (arg2 > 1664 || arg2 < 384) {
				local390 -= 128;
			}
			if (arg2 > 1152 && arg2 < 1920) {
				local387 = local377 + 128;
			}
			if (arg2 > 640 && arg2 < 1408) {
				local392 = local377 + 128;
			}
		}
		@Pc(432) int local432 = arg5.getMinX();
		@Pc(435) int local435 = arg5.getMaxX();
		@Pc(438) int local438 = arg5.getMinZ();
		if (local387 < local435) {
			local435 = local387;
		}
		if (local390 > local438) {
			local438 = local390;
		}
		@Pc(457) int local457 = arg5.getMaxZ();
		if (local432 < local380) {
			local432 = local380;
		}
		if (local457 > local392) {
			local457 = local392;
		}
		@Pc(475) AnimFrameset local475 = null;
		if (arg1 != null) {
			arg6 = arg1.anIntArray95[arg6];
			local475 = SeqTypeList.getAnimFrameset(arg6 >> 16);
			arg6 &= 65535;
		}
		@Pc(500) Model local500;
		if (local475 == null) {
			local500 = model.method3836(true, true, true);
			local500.resize((local435 - local432) / 2, 128, (local457 - local438) / 2);
			local500.translate((local432 + local435) / 2, 0, (local438 + local457) / 2);
		} else {
			local500 = model.method3836(!local475.method4150(arg6), !local475.method4151(arg6), true);
			local500.resize((local435 - local432) / 2, 128, (local457 - local438) / 2);
			local500.translate((local435 + local432) / 2, 0, (local438 + local457) / 2);
			local500.method3844(local475, arg6);
		}
		if (arg2 != 0) {
			local500.method3815(arg2);
		}
		if (GlRenderer.enabled) {
			@Pc(591) GlModel local591 = (GlModel) local500;
			if (arg7 != SceneGraph.method522(Player.level, arg12 + local432, local438 + arg8) || SceneGraph.method522(Player.level, local435 + arg12, local457 + arg8) != arg7) {
				for (@Pc(615) int local615 = 0; local615 < local591.vertexCount; local615++) {
					@Pc(621) int[] local621 = local591.vertexY;
					local621[local615] += SceneGraph.method522(Player.level, arg12 + local591.vertexX[local615], arg8 + local591.vertexZ[local615]) - arg7;
				}
				local591.vertexBuffer.valid = false;
				local591.bounds.valid = false;
			}
		} else {
			@Pc(660) SoftwareModel local660 = (SoftwareModel) local500;
			if (arg7 != SceneGraph.method522(Player.level, local432 + arg12, local438 + arg8) || arg7 != SceneGraph.method522(Player.level, arg12 + local435, local457 + arg8)) {
				for (@Pc(690) int local690 = 0; local690 < local660.vertexCount; local690++) {
					@Pc(700) int[] local700 = local660.vertexY;
					local700[local690] += SceneGraph.method522(Player.level, local660.vertexX[local690] + arg12, local660.vertexZ[local690] + arg8) - arg7;
				}
				local660.boundsValid = false;
			}
		}
		return local500;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V")
	public static void removeSoft() {
		models.removeSoft();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)V")
	public static void clean() {
		models.clean(5);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
	public static void clear() {
		models.clear();
	}
}
