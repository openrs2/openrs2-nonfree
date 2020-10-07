import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Player extends PathingEntity {

	@OriginalMember(owner = "client!f", name = "Oc", descriptor = "Ljava/lang/String;")
	public String name;

	@OriginalMember(owner = "client!f", name = "Tc", descriptor = "Lclient!qk;")
	public PlayerAppearance appearance;

	@OriginalMember(owner = "client!f", name = "sc", descriptor = "I")
	public int anInt1576 = 0;

	@OriginalMember(owner = "client!f", name = "Ac", descriptor = "I")
	public int skillLevel = 0;

	@OriginalMember(owner = "client!f", name = "wc", descriptor = "I")
	public int walkSound = -1;

	@OriginalMember(owner = "client!f", name = "yc", descriptor = "I")
	public int soundRadius = 0;

	@OriginalMember(owner = "client!f", name = "Cc", descriptor = "I")
	public int anInt1586 = -1;

	@OriginalMember(owner = "client!f", name = "pc", descriptor = "I")
	public int pkIcon = -1;

	@OriginalMember(owner = "client!f", name = "Dc", descriptor = "I")
	public int soundVolume = 255;

	@OriginalMember(owner = "client!f", name = "zc", descriptor = "I")
	public int crawlSound = -1;

	@OriginalMember(owner = "client!f", name = "Lc", descriptor = "I")
	public int team = 0;

	@OriginalMember(owner = "client!f", name = "Fc", descriptor = "B")
	private byte title = 0;

	@OriginalMember(owner = "client!f", name = "Gc", descriptor = "I")
	public int runSound = -1;

	@OriginalMember(owner = "client!f", name = "Ec", descriptor = "I")
	public int idleSound = -1;

	@OriginalMember(owner = "client!f", name = "Jc", descriptor = "Z")
	public boolean aBoolean98 = false;

	@OriginalMember(owner = "client!f", name = "Qc", descriptor = "I")
	public int combatLevel = 0;

	@OriginalMember(owner = "client!f", name = "Pc", descriptor = "I")
	public int prayerIcon = -1;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!fd;B)V")
	public final void decodeAppearance(@OriginalArg(0) Buffer buffer) {
		buffer.position = 0;
		@Pc(16) int npcId = -1;
		@Pc(20) int flags = buffer.readUnsignedByte();
		@Pc(31) boolean showSkillLevel = (flags & 0x4) != 0;
		@Pc(35) int gender = flags & 0x1;
		@Pc(41) int previousSize = super.getSize();
		this.setSize((flags >> 3 & 0x7) + 1);
		this.title = (byte) (flags >> 6 & 0x3);
		@Pc(64) int[] identikit = new int[12];
		this.x += (this.getSize() - previousSize) * 64;
		this.z += (this.getSize() - previousSize) * 64;
		this.pkIcon = buffer.readByte();
		this.prayerIcon = buffer.readByte();
		this.team = 0;
		for (@Pc(107) int i = 0; i < 12; i++) {
			@Pc(116) int msb = buffer.readUnsignedByte();
			if (msb == 0) {
				identikit[i] = 0;
			} else {
				@Pc(129) int lsb = buffer.readUnsignedByte();
				@Pc(136) int id = (msb << 8) + lsb;
				if (i == 0 && id == 65535) {
					npcId = buffer.readUnsignedShort();
					this.team = buffer.readUnsignedByte();
					break;
				}
				if (id >= 32768) {
					@Pc(165) int objId = Equipment.objIds[id - 32768];
					identikit[i] = objId | 0x40000000;
					@Pc(176) int team = ObjTypeList.get(objId).team;
					if (team != 0) {
						this.team = team;
					}
				} else {
					identikit[i] = Integer.MIN_VALUE | id - 256;
				}
			}
		}
		@Pc(199) int[] colors = new int[5];
		for (@Pc(201) int i = 0; i < 5; i++) {
			@Pc(208) int color = buffer.readUnsignedByte();
			if (color < 0 || color >= Static6.aShortArrayArray6[i].length) {
				color = 0;
			}
			colors[i] = color;
		}
		this.basId = buffer.readUnsignedShort();
		@Pc(242) long encodedName = buffer.readLong();
		this.name = Base37.decodeTitleCase(encodedName);
		this.combatLevel = buffer.readUnsignedByte();
		if (showSkillLevel) {
			this.skillLevel = buffer.readUnsignedShort();
			this.anInt1576 = this.combatLevel;
			this.anInt1586 = -1;
		} else {
			this.skillLevel = 0;
			this.anInt1576 = buffer.readUnsignedByte();
			this.anInt1586 = buffer.readUnsignedByte();
			if (this.anInt1586 == 255) {
				this.anInt1586 = -1;
			}
		}
		@Pc(293) int previousSoundRadius = this.soundRadius;
		this.soundRadius = buffer.readUnsignedByte();
		if (this.soundRadius == 0) {
			Static12.method739(this);
		} else {
			@Pc(304) int previousCrawlSound = this.crawlSound;
			@Pc(307) int previousIdleSound = this.idleSound;
			@Pc(310) int previousWalkSound = this.walkSound;
			@Pc(313) int previousRunSound = this.runSound;
			@Pc(316) int previousSoundVolume = this.soundVolume;
			this.idleSound = buffer.readUnsignedShort();
			this.crawlSound = buffer.readUnsignedShort();
			this.walkSound = buffer.readUnsignedShort();
			this.runSound = buffer.readUnsignedShort();
			this.soundVolume = buffer.readUnsignedByte();
			if (this.soundRadius != previousSoundRadius || previousIdleSound != this.idleSound || previousCrawlSound != this.crawlSound || this.walkSound != previousWalkSound || this.runSound != previousRunSound || this.soundVolume != previousSoundVolume) {
				Static10.method383(this);
			}
		}
		if (this.appearance == null) {
			this.appearance = new PlayerAppearance();
		}
		@Pc(399) int previousNpcId = this.appearance.npcId;
		this.appearance.set(npcId, identikit, this.basId, colors, gender == 1);
		if (npcId != previousNpcId) {
			this.x = this.anIntArray422[0] * 128 + this.getSize() * 64;
			this.z = this.anIntArray426[0] * 128 + this.getSize() * 64;
		}
		if (this.aClass20_Sub3_6 != null) {
			this.aClass20_Sub3_6.method2952();
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "()I")
	@Override
	public final int method3813() {
		return this.anInt4016;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIII)V")
	@Override
	public final void method3806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.aBoolean285) {
			if (this.appearance == null) {
				return;
			}
			@Pc(26) SeqType local26 = this.anInt4007 != -1 && this.anInt3996 == 0 ? SeqTypeList.get(this.anInt4007) : null;
			@Pc(55) SeqType local55 = this.anInt4005 == -1 || this.aBoolean98 || this.anInt4005 == this.method3314().anInt860 && local26 != null ? null : SeqTypeList.get(this.anInt4005);
			@Pc(78) Model local78 = this.appearance.method3608(this.aClass150Array3, this.anInt4046, this.anInt4011, this.anInt4019, local55, this.anInt3970, false, this.anInt4000, local26, false, this.anInt4044);
			if (local78 == null) {
				return;
			}
			this.method3315(local78, null);
		}
		if (this.aClass20_Sub3_6 != null) {
			this.aClass20_Sub3_6.method2949(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)I")
	@Override
	protected final int method3303() {
		return this.basId;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIIIIJILclient!ne;)V")
	@Override
	public final void method3805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) ParticleSystem arg10) {
		if (this.appearance == null) {
			return;
		}
		@Pc(27) SeqType local27 = this.anInt4007 != -1 && this.anInt3996 == 0 ? SeqTypeList.get(this.anInt4007) : null;
		@Pc(31) BasType local31 = this.method3314();
		@Pc(53) boolean local53 = local31.anInt844 != 0 || local31.anInt847 != 0 || local31.anInt850 != 0 || local31.anInt851 != 0;
		@Pc(82) SeqType local82 = this.anInt4005 == -1 || this.aBoolean98 || this.anInt4005 == this.method3314().anInt860 && local27 != null ? null : SeqTypeList.get(this.anInt4005);
		@Pc(105) Model local105 = this.appearance.method3608(this.aClass150Array3, this.anInt4046, this.anInt4011, this.anInt4019, local82, this.anInt3970, local53, this.anInt4000, local27, true, this.anInt4044);
		@Pc(108) int local108 = Static15.method1228();
		if (GlRenderer.enabled && GameShell.maxMemory < 96 && local108 > 50) {
			Static24.method2567();
		}
		if (client.modeWhat != 0 && local108 < 50) {
			@Pc(134) int local134 = 50 - local108;
			while (Static7.anInt5425 < local134) {
				Static6.aByteArrayArray35[Static7.anInt5425] = new byte[102400];
				Static7.anInt5425++;
			}
			while (local134 < Static7.anInt5425) {
				Static7.anInt5425--;
				Static6.aByteArrayArray35[Static7.anInt5425] = null;
			}
		}
		if (local105 == null) {
			return;
		}
		this.anInt4016 = local105.method3813();
		if (Preferences.characterShadows && (this.appearance.npcId == -1 || NpcTypeList.get(this.appearance.npcId).aBoolean354)) {
			@Pc(222) Model local222 = Static12.method745(0, local82 == null ? local27 : local82, arg0, 1, 240, local105, local82 == null ? this.anInt3970 : this.anInt4046, this.anInt4006, this.z, this.aBoolean284, 0, 160, this.x);
			if (GlRenderer.enabled) {
				@Pc(241) float local241 = GlRenderer.method1620();
				@Pc(243) float local243 = GlRenderer.method1612();
				GlRenderer.disableDepthMask();
				GlRenderer.method1621(local241, local243 - 150.0F);
				local222.method3805(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, null);
				GlRenderer.enableDepthMask();
				GlRenderer.method1621(local241, local243);
			} else {
				local222.method3805(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, null);
			}
		}
		if (PlayerList.self == this) {
			for (@Pc(275) int local275 = Static7.aClass94Array1.length - 1; local275 >= 0; local275--) {
				@Pc(282) Class94 local282 = Static7.aClass94Array1[local275];
				if (local282 != null && local282.anInt2563 != -1) {
					if (local282.anInt2561 == 1 && local282.anInt2560 >= 0 && local282.anInt2560 < NpcList.npcs.length) {
						@Pc(315) Npc local315 = NpcList.npcs[local282.anInt2560];
						if (local315 != null) {
							@Pc(329) int local329 = local315.x / 32 - PlayerList.self.x / 32;
							@Pc(339) int local339 = local315.z / 32 - PlayerList.self.z / 32;
							this.method1175(arg3, local339, null, arg2, arg9, arg1, arg0, arg5, local329, arg6, local282.anInt2563, arg4, 360000, local105, arg7);
						}
					}
					if (local282.anInt2561 == 2) {
						@Pc(378) int local378 = (local282.anInt2558 - Static5.originX) * 4 + 2 - PlayerList.self.x / 32;
						@Pc(393) int local393 = (local282.anInt2565 - Static7.originZ) * 4 + 2 - PlayerList.self.z / 32;
						@Pc(398) int local398 = local282.anInt2562 * 4;
						local398 *= local398;
						this.method1175(arg3, local393, null, arg2, arg9, arg1, arg0, arg5, local378, arg6, local282.anInt2563, arg4, local398, local105, arg7);
					}
					if (local282.anInt2561 == 10 && local282.anInt2560 >= 0 && PlayerList.players.length > local282.anInt2560) {
						@Pc(442) Player local442 = PlayerList.players[local282.anInt2560];
						if (local442 != null) {
							@Pc(455) int local455 = local442.x / 32 - PlayerList.self.x / 32;
							@Pc(466) int local466 = local442.z / 32 - PlayerList.self.z / 32;
							this.method1175(arg3, local466, null, arg2, arg9, arg1, arg0, arg5, local455, arg6, local282.anInt2563, arg4, 360000, local105, arg7);
						}
					}
				}
			}
		}
		this.method3305(local105);
		@Pc(494) Model local494 = null;
		this.method3312(local105, arg0);
		if (!this.aBoolean98 && this.anInt3961 != -1 && this.anInt4026 != -1) {
			@Pc(518) SpotAnimType local518 = SpotAnimTypeList.get(this.anInt3961);
			local494 = local518.method2569(this.anInt3976, this.anInt3968, this.anInt4026);
			if (local494 != null) {
				local494.method3823(0, -this.anInt3971, 0);
				if (local518.aBoolean221) {
					if (Static5.anInt3525 != 0) {
						local494.method3832(Static5.anInt3525);
					}
					if (Static6.anInt4907 != 0) {
						local494.method3817(Static6.anInt4907);
					}
					if (Static4.anInt2747 != 0) {
						local494.method3823(0, Static4.anInt2747, 0);
					}
				}
			}
		}
		@Pc(572) Model local572 = null;
		if (!this.aBoolean98 && this.anObject5 != null) {
			if (this.anInt4010 <= client.loop) {
				this.anObject5 = null;
			}
			if (this.anInt4042 <= client.loop && client.loop < this.anInt4010) {
				if (this.anObject5 instanceof Loc) {
					local572 = (Model) ((Loc) this.anObject5).method3735();
				} else {
					local572 = (Model) this.anObject5;
				}
				local572.method3823(this.anInt4032 - this.x, this.anInt3975 - this.anInt4006, this.anInt4027 - this.z);
				if (this.anInt4017 == 512) {
					local572.method3827();
				} else if (this.anInt4017 == 1024) {
					local572.method3828();
				} else if (this.anInt4017 == 1536) {
					local572.method3820();
				}
			}
		}
		if (GlRenderer.enabled) {
			this.method3315(local105, local494);
			local105.aBoolean324 = true;
			local105.method3805(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass20_Sub3_6);
			if (local494 != null) {
				if (this.aClass20_Sub3_6 != null) {
					@Pc(736) GlModel local736 = (GlModel) local494;
					this.aClass20_Sub3_6.method2967(local736.particleEmitters, local736.particleEffectors, true, local736.anIntArray507, local736.anIntArray504, local736.anIntArray502);
				}
				local494.aBoolean324 = true;
				local494.method3805(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass20_Sub3_6);
			}
		} else {
			if (local494 != null) {
				local105 = ((SoftwareModel) local105).method2903(local494);
			}
			if (local572 != null) {
				local105 = ((SoftwareModel) local105).method2903(local572);
			}
			this.method3315(local105, local494);
			local105.aBoolean324 = true;
			local105.method3805(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass20_Sub3_6);
		}
		if (local572 == null) {
			return;
		}
		if (this.anInt4017 == 512) {
			local572.method3820();
		} else if (this.anInt4017 == 1024) {
			local572.method3828();
		} else if (this.anInt4017 == 1536) {
			local572.method3827();
		}
		local572.method3823(this.x - this.anInt4032, this.anInt4006 - this.anInt3975, this.z - this.anInt4027);
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method3310() {
		return this.appearance != null;
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(B)Ljava/lang/String;")
	public final String method1173() {
		@Pc(11) String local11 = this.name;
		if (Static7.aStringArray38 != null) {
			local11 = Static7.aStringArray38[this.title] + local11;
		}
		if (Static2.aStringArray42 != null) {
			local11 = local11 + Static2.aStringArray42[this.title];
		}
		return local11;
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "(I)I")
	@Override
	public final int getSize() {
		return this.appearance == null || this.appearance.npcId == -1 ? super.getSize() : NpcTypeList.get(this.appearance.npcId).size;
	}

	@OriginalMember(owner = "client!f", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() {
		if (this.aClass20_Sub3_6 != null) {
			this.aClass20_Sub3_6.remove();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IZBI)V")
	public final void method1174(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		super.method3301(arg0, this.getSize(), arg2, arg1);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IILclient!ne;IIIIIIIIBIILclient!vg;I)V")
	private void method1175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ParticleSystem arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Model arg13, @OriginalArg(15) int arg14) {
		@Pc(15) int local15 = arg8 * arg8 + arg1 * arg1;
		if (local15 < 16 || local15 > arg12) {
			return;
		}
		@Pc(39) int local39 = (int) (Math.atan2((double) arg8, (double) arg1) * 325.949D) & 0x7FF;
		@Pc(51) Model local51 = Static29.method3427(local39, arg13, this.z, arg10, this.anInt4006, this.x);
		if (local51 == null) {
			return;
		}
		if (!GlRenderer.enabled) {
			local51.method3805(0, arg5, arg3, arg0, arg11, arg7, arg9, arg14, -1L, arg4, arg2);
			return;
		}
		@Pc(59) float local59 = GlRenderer.method1620();
		@Pc(61) float local61 = GlRenderer.method1612();
		GlRenderer.disableDepthMask();
		GlRenderer.method1621(local59, local61 - 150.0F);
		local51.method3805(0, arg5, arg3, arg0, arg11, arg7, arg9, arg14, -1L, arg4, arg2);
		GlRenderer.enableDepthMask();
		GlRenderer.method1621(local59, local61);
	}
}
