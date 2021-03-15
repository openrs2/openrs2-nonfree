import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Npc extends PathingEntity {

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BLclient!p;)I")
	public static int getSound(@OriginalArg(1) Npc npc) {
		@Pc(4) NpcType npcType = npc.type;
		if (npcType.multiNpcs != null) {
			npcType = npcType.getMultiNpc();
			if (npcType == null) {
				return -1;
			}
		}
		@Pc(33) int sound = npcType.walkSound;
		@Pc(37) BasType baseType = npc.getBasType();
		if (npc.movementSeqId == baseType.readySeqId) {
			sound = npcType.idleSound;
		} else if (npc.movementSeqId == baseType.anInt831 || npc.movementSeqId == baseType.anInt829 || npc.movementSeqId == baseType.anInt857 || baseType.anInt867 == npc.movementSeqId) {
			sound = npcType.runSound;
		} else if (npc.movementSeqId == baseType.anInt854 || baseType.anInt833 == npc.movementSeqId || baseType.anInt861 == npc.movementSeqId || npc.movementSeqId == baseType.anInt852) {
			sound = npcType.crawlSound;
		}
		return sound;
	}

	@OriginalMember(owner = "client!p", name = "oc", descriptor = "Lclient!ua;")
	public NpcType type;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BLclient!ua;)V")
	public final void setType(@OriginalArg(1) NpcType type) {
		this.type = type;
		if (this.particleSystem != null) {
			this.particleSystem.method2952();
		}
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean isVisible() {
		return this.type != null;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIIIIJILclient!ne;)V")
	@Override
	public final void method3805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) ParticleSystem arg10) {
		if (this.type == null) {
			return;
		}
		@Pc(28) SeqType local28 = this.seqId != -1 && this.anInt3996 == 0 ? SeqTypeList.get(this.seqId) : null;
		@Pc(54) SeqType local54 = this.movementSeqId == -1 || this.movementSeqId == this.getBasType().readySeqId && local28 != null ? null : SeqTypeList.get(this.movementSeqId);
		@Pc(75) Model local75 = this.type.method4268(this.anInt3970, this.anInt4000, local54, local28, this.anInt4011, this.aClass150Array3, this.anInt4019, this.anInt4046, this.anInt4044);
		if (local75 == null) {
			return;
		}
		this.anInt4016 = local75.getMinY();
		@Pc(86) NpcType type = this.type;
		if (type.multiNpcs != null) {
			type = type.getMultiNpc();
		}
		if (Preferences.characterShadows && type.aBoolean354) {
			@Pc(141) Model local141 = Static12.method745(this.type.aShort46, local54 == null ? local28 : local54, arg0, this.type.size, this.type.aByte20, local75, local54 == null ? this.anInt3970 : this.anInt4046, this.anInt4006, this.zFine, this.aBoolean284, this.type.aShort47, this.type.aByte19, this.xFine);
			if (GlRenderer.enabled) {
				@Pc(145) float local145 = GlRenderer.method1620();
				@Pc(147) float local147 = GlRenderer.method1612();
				GlRenderer.disableDepthMask();
				GlRenderer.method1621(local145, local147 - 150.0F);
				local141.method3805(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.particleSystem);
				GlRenderer.enableDepthMask();
				GlRenderer.method1621(local145, local147);
			} else {
				local141.method3805(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.particleSystem);
			}
		}
		@Pc(189) Model local189 = null;
		this.method3305(local75);
		this.method3312(local75, arg0);
		if (this.spotAnimId != -1 && this.anInt4026 != -1) {
			@Pc(214) SpotAnimType local214 = SpotAnimTypeList.get(this.spotAnimId);
			local189 = local214.method2569(this.anInt3976, this.anInt3968, this.anInt4026);
			if (local189 != null) {
				local189.translate(0, -this.anInt3971, 0);
				if (local214.aBoolean221) {
					if (Static5.anInt3525 != 0) {
						local189.method3832(Static5.anInt3525);
					}
					if (Static6.anInt4907 != 0) {
						local189.method3817(Static6.anInt4907);
					}
					if (Static4.anInt2747 != 0) {
						local189.translate(0, Static4.anInt2747, 0);
					}
				}
			}
		}
		if (!GlRenderer.enabled) {
			if (local189 != null) {
				local75 = ((SoftwareModel) local75).method2903(local189);
			}
			this.method3315(local75, local189);
			if (this.type.size == 1) {
				local75.aBoolean324 = true;
			}
			local75.method3805(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.particleSystem);
			return;
		}
		this.method3315(local75, local189);
		if (this.type.size == 1) {
			local75.aBoolean324 = true;
		}
		local75.method3805(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.particleSystem);
		if (local189 == null) {
			return;
		}
		if (this.type.size == 1) {
			local189.aBoolean324 = true;
		}
		if (this.particleSystem != null) {
			@Pc(352) GlModel local352 = (GlModel) local189;
			this.particleSystem.method2967(local352.particleEmitters, local352.particleEffectors, true, local352.vertexX, local352.vertexY, local352.vertexZ);
		}
		local189.method3805(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.particleSystem);
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "()I")
	@Override
	public final int getMinY() {
		return this.anInt4016;
	}

	@OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() {
		if (this.particleSystem != null) {
			this.particleSystem.remove();
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIII)V")
	@Override
	public final void method3806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.type == null) {
			return;
		}
		if (!this.aBoolean285) {
			@Pc(28) SeqType local28 = this.seqId != -1 && this.anInt3996 == 0 ? SeqTypeList.get(this.seqId) : null;
			@Pc(52) SeqType local52 = this.movementSeqId == -1 || this.movementSeqId == this.getBasType().readySeqId && local28 != null ? null : SeqTypeList.get(this.movementSeqId);
			@Pc(73) Model local73 = this.type.method4268(this.anInt3970, this.anInt4000, local52, local28, this.anInt4011, this.aClass150Array3, this.anInt4019, this.anInt4046, this.anInt4044);
			if (local73 == null) {
				return;
			}
			this.method3315(local73, null);
		}
		if (this.particleSystem != null) {
			this.particleSystem.method2949(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)I")
	@Override
	protected final int getBasId() {
		if (this.type.multiNpcs != null) {
			@Pc(17) NpcType type = this.type.getMultiNpc();
			if (type != null && type.basId != -1) {
				return type.basId;
			}
		}
		return this.basId;
	}
}
