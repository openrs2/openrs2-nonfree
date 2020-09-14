import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Npc extends PathingEntity {

	@OriginalMember(owner = "client!hk", name = "hb", descriptor = "[Lclient!p;")
	public static final Npc[] npcs = new Npc[32768];

	@OriginalMember(owner = "client!uc", name = "T", descriptor = "[I")
	public static final int[] ids = new int[1024];

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
	public static int size = 0;

	@OriginalMember(owner = "client!p", name = "oc", descriptor = "Lclient!ua;")
	public NpcType type;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BLclient!ua;)V")
	public final void setType(@OriginalArg(1) NpcType type) {
		this.type = type;
		if (this.aClass20_Sub3_6 != null) {
			this.aClass20_Sub3_6.method2952();
		}
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method3310() {
		return this.type != null;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIIIIJILclient!ne;)V")
	@Override
	public final void method3805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class20_Sub3 arg10) {
		if (this.type == null) {
			return;
		}
		@Pc(28) Class46 local28 = this.anInt4007 != -1 && this.anInt3996 == 0 ? Static23.method2494(this.anInt4007) : null;
		@Pc(54) Class46 local54 = this.anInt4005 == -1 || this.anInt4005 == this.method3314().anInt860 && local28 != null ? null : Static23.method2494(this.anInt4005);
		@Pc(75) Model local75 = this.type.method4268(this.anInt3970, this.anInt4000, local54, local28, this.anInt4011, this.aClass150Array3, this.anInt4019, this.anInt4046, this.anInt4044);
		if (local75 == null) {
			return;
		}
		this.anInt4016 = local75.method3813();
		@Pc(86) NpcType local86 = this.type;
		if (local86.anIntArray590 != null) {
			local86 = local86.method4265();
		}
		if (Preferences.characterShadows && local86.aBoolean354) {
			@Pc(141) Model local141 = Static12.method745(this.type.aShort46, local54 == null ? local28 : local54, arg0, this.type.size, this.type.aByte20, local75, local54 == null ? this.anInt3970 : this.anInt4046, this.anInt4006, this.z, this.aBoolean284, this.type.aShort47, this.type.aByte19, this.x);
			if (GlRenderer.enabled) {
				@Pc(145) float local145 = GlRenderer.method1620();
				@Pc(147) float local147 = GlRenderer.method1612();
				GlRenderer.disableDepthMask();
				GlRenderer.method1621(local145, local147 - 150.0F);
				local141.method3805(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.aClass20_Sub3_6);
				GlRenderer.enableDepthMask();
				GlRenderer.method1621(local145, local147);
			} else {
				local141.method3805(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.aClass20_Sub3_6);
			}
		}
		@Pc(189) Model local189 = null;
		this.method3305(local75);
		this.method3312(local75, arg0);
		if (this.anInt3961 != -1 && this.anInt4026 != -1) {
			@Pc(214) Class110 local214 = Static21.method2004(this.anInt3961);
			local189 = local214.method2569(this.anInt3976, this.anInt3968, this.anInt4026);
			if (local189 != null) {
				local189.method3823(0, -this.anInt3971, 0);
				if (local214.aBoolean221) {
					if (Static5.anInt3525 != 0) {
						local189.method3832(Static5.anInt3525);
					}
					if (Static6.anInt4907 != 0) {
						local189.method3817(Static6.anInt4907);
					}
					if (Static4.anInt2747 != 0) {
						local189.method3823(0, Static4.anInt2747, 0);
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
			local75.method3805(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass20_Sub3_6);
			return;
		}
		this.method3315(local75, local189);
		if (this.type.size == 1) {
			local75.aBoolean324 = true;
		}
		local75.method3805(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass20_Sub3_6);
		if (local189 == null) {
			return;
		}
		if (this.type.size == 1) {
			local189.aBoolean324 = true;
		}
		if (this.aClass20_Sub3_6 != null) {
			@Pc(352) GlModel local352 = (GlModel) local189;
			this.aClass20_Sub3_6.method2967(local352.aClass158Array3, local352.aClass167Array3, true, local352.anIntArray507, local352.anIntArray504, local352.anIntArray502);
		}
		local189.method3805(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass20_Sub3_6);
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "()I")
	@Override
	public final int method3813() {
		return this.anInt4016;
	}

	@OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() {
		if (this.aClass20_Sub3_6 != null) {
			this.aClass20_Sub3_6.method2958();
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIII)V")
	@Override
	public final void method3806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.type == null) {
			return;
		}
		if (!this.aBoolean285) {
			@Pc(28) Class46 local28 = this.anInt4007 != -1 && this.anInt3996 == 0 ? Static23.method2494(this.anInt4007) : null;
			@Pc(52) Class46 local52 = this.anInt4005 == -1 || this.anInt4005 == this.method3314().anInt860 && local28 != null ? null : Static23.method2494(this.anInt4005);
			@Pc(73) Model local73 = this.type.method4268(this.anInt3970, this.anInt4000, local52, local28, this.anInt4011, this.aClass150Array3, this.anInt4019, this.anInt4046, this.anInt4044);
			if (local73 == null) {
				return;
			}
			this.method3315(local73, null);
		}
		if (this.aClass20_Sub3_6 != null) {
			this.aClass20_Sub3_6.method2949(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)I")
	@Override
	protected final int method3303() {
		if (this.type.anIntArray590 != null) {
			@Pc(17) NpcType local17 = this.type.method4265();
			if (local17 != null && local17.anInt5261 != -1) {
				return local17.anInt5261;
			}
		}
		return this.basId;
	}
}
