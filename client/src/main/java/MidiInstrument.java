import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class MidiInstrument extends Node {

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!fh;I)Lclient!qh;")
	public static MidiInstrument create(@OriginalArg(1) Js5 archive, @OriginalArg(0) int id) {
		@Pc(17) byte[] bytes = archive.fetchFile(id);
		return bytes == null ? null : new MidiInstrument(bytes);
	}

	@OriginalMember(owner = "client!qh", name = "p", descriptor = "[B")
	public final byte[] aByteArray56;

	@OriginalMember(owner = "client!qh", name = "s", descriptor = "[Lclient!pb;")
	public final PcmSound[] sounds;

	@OriginalMember(owner = "client!qh", name = "t", descriptor = "I")
	public final int anInt4326;

	@OriginalMember(owner = "client!qh", name = "y", descriptor = "[Lclient!si;")
	public final Class157[] aClass157Array1;

	@OriginalMember(owner = "client!qh", name = "A", descriptor = "[B")
	public final byte[] keyPan;

	@OriginalMember(owner = "client!qh", name = "B", descriptor = "[I")
	private int[] soundIds = new int[128];

	@OriginalMember(owner = "client!qh", name = "D", descriptor = "[S")
	public final short[] aShortArray80;

	@OriginalMember(owner = "client!qh", name = "E", descriptor = "[B")
	public final byte[] aByteArray58;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "([B)V")
	private MidiInstrument(@OriginalArg(0) byte[] bytes) {
		@Pc(9) int local9 = 0;
		this.aByteArray56 = new byte[128];
		this.aByteArray58 = new byte[128];
		this.keyPan = new byte[128];
		this.aClass157Array1 = new Class157[128];
		this.aShortArray80 = new short[128];
		this.sounds = new PcmSound[128];
		@Pc(38) Buffer buffer = new Buffer(bytes);
		while (buffer.bytes[local9 + buffer.position] != 0) {
			local9++;
		}
		@Pc(52) byte[] local52 = new byte[local9];
		for (@Pc(54) int local54 = 0; local54 < local9; local54++) {
			local52[local54] = buffer.readByte();
		}
		@Pc(71) int local71 = local9 + 1;
		buffer.position++;
		@Pc(80) int local80 = buffer.position;
		buffer.position += local71;
		@Pc(88) int local88;
		for (local88 = 0; buffer.bytes[buffer.position + local88] != 0; local88++) {
		}
		@Pc(102) byte[] local102 = new byte[local88];
		for (@Pc(104) int local104 = 0; local104 < local88; local104++) {
			local102[local104] = buffer.readByte();
		}
		@Pc(117) int local117 = local88 + 1;
		buffer.position++;
		@Pc(125) int local125 = 0;
		@Pc(128) int local128 = buffer.position;
		buffer.position += local117;
		while (buffer.bytes[buffer.position + local125] != 0) {
			local125++;
		}
		@Pc(149) byte[] local149 = new byte[local125];
		for (@Pc(151) int local151 = 0; local151 < local125; local151++) {
			local149[local151] = buffer.readByte();
		}
		@Pc(164) int local164 = local125 + 1;
		buffer.position++;
		@Pc(173) byte[] local173 = new byte[local164];
		@Pc(182) int local182;
		if (local164 > 1) {
			@Pc(180) int local180 = 1;
			local182 = 2;
			local173[1] = 1;
			for (@Pc(188) int local188 = 2; local188 < local164; local188++) {
				@Pc(195) int local195 = buffer.readUnsignedByte();
				if (local195 == 0) {
					local180 = local182++;
				} else {
					if (local180 >= local195) {
						local195--;
					}
					local180 = local195;
				}
				local173[local188] = (byte) local180;
			}
		} else {
			local182 = local164;
		}
		@Pc(228) Class157[] local228 = new Class157[local182];
		for (@Pc(230) int local230 = 0; local230 < local228.length; local230++) {
			@Pc(242) Class157 local242 = local228[local230] = new Class157();
			@Pc(246) int local246 = buffer.readUnsignedByte();
			if (local246 > 0) {
				local242.aByteArray65 = new byte[local246 * 2];
			}
			@Pc(262) int local262 = buffer.readUnsignedByte();
			if (local262 > 0) {
				local242.aByteArray64 = new byte[local262 * 2 + 2];
				local242.aByteArray64[1] = 64;
			}
		}
		@Pc(286) int local286 = buffer.readUnsignedByte();
		@Pc(298) byte[] local298 = local286 > 0 ? new byte[local286 * 2] : null;
		local286 = buffer.readUnsignedByte();
		@Pc(304) int local304 = 0;
		@Pc(314) byte[] local314 = local286 <= 0 ? null : new byte[local286 * 2];
		while (buffer.bytes[local304 + buffer.position] != 0) {
			local304++;
		}
		@Pc(329) byte[] local329 = new byte[local304];
		for (@Pc(331) int local331 = 0; local331 < local304; local331++) {
			local329[local331] = buffer.readByte();
		}
		buffer.position++;
		@Pc(354) int local354 = local304 + 1;
		@Pc(356) int local356 = 0;
		for (@Pc(358) int local358 = 0; local358 < 128; local358++) {
			local356 += buffer.readUnsignedByte();
			this.aShortArray80[local358] = (short) local356;
		}
		@Pc(378) int local378 = 0;
		for (@Pc(380) int local380 = 0; local380 < 128; local380++) {
			local378 += buffer.readUnsignedByte();
			@Pc(391) short[] local391 = this.aShortArray80;
			local391[local380] = (short) (local391[local380] + (local378 << 8));
		}
		@Pc(405) int local405 = 0;
		@Pc(407) int local407 = 0;
		@Pc(409) int local409 = 0;
		for (@Pc(411) int local411 = 0; local411 < 128; local411++) {
			if (local405 == 0) {
				if (local407 >= local329.length) {
					local405 = -1;
				} else {
					local405 = local329[local407++];
				}
				local409 = buffer.readVarInt();
			}
			@Pc(441) short[] local441 = this.aShortArray80;
			local441[local411] = (short) (local441[local411] + ((local409 - 1 & 0x2) << 14));
			this.soundIds[local411] = local409;
			local405--;
		}
		@Pc(465) int local465 = 0;
		@Pc(467) int local467 = 0;
		@Pc(469) int local469 = 0;
		for (@Pc(471) int local471 = 0; local471 < 128; local471++) {
			if (this.soundIds[local471] != 0) {
				if (local465 == 0) {
					local469 = buffer.bytes[local80++] - 1;
					if (local467 >= local52.length) {
						local465 = -1;
					} else {
						local465 = local52[local467++];
					}
				}
				this.aByteArray56[local471] = (byte) local469;
				local465--;
			}
		}
		@Pc(521) int local521 = 0;
		@Pc(523) int local523 = 0;
		@Pc(525) int local525 = 0;
		for (@Pc(527) int local527 = 0; local527 < 128; local527++) {
			if (this.soundIds[local527] != 0) {
				if (local525 == 0) {
					if (local102.length <= local523) {
						local525 = -1;
					} else {
						local525 = local102[local523++];
					}
					local521 = buffer.bytes[local128++] + 16 << 2;
				}
				this.keyPan[local527] = (byte) local521;
				local525--;
			}
		}
		@Pc(577) int local577 = 0;
		@Pc(579) int local579 = 0;
		@Pc(581) Class157 local581 = null;
		for (@Pc(583) int local583 = 0; local583 < 128; local583++) {
			if (this.soundIds[local583] != 0) {
				if (local577 == 0) {
					local581 = local228[local173[local579]];
					if (local149.length > local579) {
						local577 = local149[local579++];
					} else {
						local577 = -1;
					}
				}
				local577--;
				this.aClass157Array1[local583] = local581;
			}
		}
		@Pc(636) int local636 = 0;
		@Pc(638) int local638 = 0;
		@Pc(640) int local640 = 0;
		for (@Pc(642) int local642 = 0; local642 < 128; local642++) {
			if (local636 == 0) {
				if (local329.length <= local638) {
					local636 = -1;
				} else {
					local636 = local329[local638++];
				}
				if (this.soundIds[local642] > 0) {
					local640 = buffer.readUnsignedByte() + 1;
				}
			}
			this.aByteArray58[local642] = (byte) local640;
			local636--;
		}
		this.anInt4326 = buffer.readUnsignedByte() + 1;
		for (@Pc(693) int local693 = 0; local693 < local182; local693++) {
			@Pc(700) Class157 local700 = local228[local693];
			if (local700.aByteArray65 != null) {
				for (@Pc(705) int local705 = 1; local705 < local700.aByteArray65.length; local705 += 2) {
					local700.aByteArray65[local705] = buffer.readByte();
				}
			}
			if (local700.aByteArray64 != null) {
				for (@Pc(731) int local731 = 3; local731 < local700.aByteArray64.length - 2; local731 += 2) {
					local700.aByteArray64[local731] = buffer.readByte();
				}
			}
		}
		if (local298 != null) {
			for (@Pc(760) int local760 = 1; local760 < local298.length; local760 += 2) {
				local298[local760] = buffer.readByte();
			}
		}
		if (local314 != null) {
			for (@Pc(778) int local778 = 1; local778 < local314.length; local778 += 2) {
				local314[local778] = buffer.readByte();
			}
		}
		for (@Pc(793) int local793 = 0; local793 < local182; local793++) {
			@Pc(804) Class157 local804 = local228[local793];
			if (local804.aByteArray64 != null) {
				@Pc(810) int local810 = 0;
				for (@Pc(812) int local812 = 2; local812 < local804.aByteArray64.length; local812 += 2) {
					local810 += buffer.readUnsignedByte() + 1;
					local804.aByteArray64[local812] = (byte) local810;
				}
			}
		}
		for (@Pc(839) int local839 = 0; local839 < local182; local839++) {
			@Pc(850) Class157 local850 = local228[local839];
			if (local850.aByteArray65 != null) {
				@Pc(857) int local857 = 0;
				for (@Pc(859) int local859 = 2; local859 < local850.aByteArray65.length; local859 += 2) {
					local857 = buffer.readUnsignedByte() + local857 + 1;
					local850.aByteArray65[local859] = (byte) local857;
				}
			}
		}
		if (local298 != null) {
			@Pc(895) int local895 = buffer.readUnsignedByte();
			local298[0] = (byte) local895;
			for (@Pc(902) int local902 = 2; local902 < local298.length; local902 += 2) {
				local895 = local895 + buffer.readUnsignedByte() + 1;
				local298[local902] = (byte) local895;
			}
			@Pc(930) byte local930 = local298[0];
			@Pc(934) byte local934 = local298[1];
			for (@Pc(936) int local936 = 0; local936 < local930; local936++) {
				this.aByteArray58[local936] = (byte) (this.aByteArray58[local936] * local934 + 32 >> 6);
			}
			for (@Pc(963) int local963 = 2; local963 < local298.length; local963 += 2) {
				@Pc(973) byte local973 = local298[local963 + 1];
				@Pc(977) byte local977 = local298[local963];
				@Pc(991) int local991 = (local977 - local930) / 2 + local934 * (local977 - local930);
				for (@Pc(993) int local993 = local930; local993 < local977; local993++) {
					@Pc(1004) int local1004 = Static26.method2987(local977 - local930, local991);
					this.aByteArray58[local993] = (byte) (this.aByteArray58[local993] * local1004 + 32 >> 6);
					local991 += local973 - local934;
				}
				local934 = local973;
				local930 = local977;
			}
			for (@Pc(1040) int local1040 = local930; local1040 < 128; local1040++) {
				this.aByteArray58[local1040] = (byte) (local934 * this.aByteArray58[local1040] + 32 >> 6);
			}
		}
		if (local314 != null) {
			@Pc(1069) int local1069 = buffer.readUnsignedByte();
			local314[0] = (byte) local1069;
			for (@Pc(1076) int local1076 = 2; local1076 < local314.length; local1076 += 2) {
				local1069 -= -buffer.readUnsignedByte() - 1;
				local314[local1076] = (byte) local1069;
			}
			@Pc(1103) int local1103 = local314[1] << 1;
			@Pc(1107) byte local1107 = local314[0];
			for (@Pc(1109) int local1109 = 0; local1109 < local1107; local1109++) {
				@Pc(1126) int local1126 = (this.keyPan[local1109] & 0xFF) + local1103;
				if (local1126 < 0) {
					local1126 = 0;
				}
				if (local1126 > 128) {
					local1126 = 128;
				}
				this.keyPan[local1109] = (byte) local1126;
			}
			@Pc(1150) int local1150 = 2;
			while (local314.length > local1150) {
				@Pc(1162) byte local1162 = local314[local1150];
				@Pc(1170) int local1170 = local314[local1150 + 1] << 1;
				local1150 += 2;
				@Pc(1184) int local1184 = local1103 * (local1162 - local1107) + (local1162 - local1107) / 2;
				for (@Pc(1186) int local1186 = local1107; local1186 < local1162; local1186++) {
					@Pc(1201) int local1201 = Static26.method2987(local1162 - local1107, local1184);
					local1184 += local1170 - local1103;
					@Pc(1218) int local1218 = (this.keyPan[local1186] & 0xFF) + local1201;
					if (local1218 < 0) {
						local1218 = 0;
					}
					if (local1218 > 128) {
						local1218 = 128;
					}
					this.keyPan[local1186] = (byte) local1218;
				}
				local1107 = local1162;
				local1103 = local1170;
			}
			for (@Pc(1253) int local1253 = local1107; local1253 < 128; local1253++) {
				@Pc(1265) int local1265 = local1103 + (this.keyPan[local1253] & 0xFF);
				if (local1265 < 0) {
					local1265 = 0;
				}
				if (local1265 > 128) {
					local1265 = 128;
				}
				this.keyPan[local1253] = (byte) local1265;
			}
		}
		for (@Pc(1287) int local1287 = 0; local1287 < local182; local1287++) {
			local228[local1287].anInt4841 = buffer.readUnsignedByte();
		}
		for (@Pc(1306) int local1306 = 0; local1306 < local182; local1306++) {
			@Pc(1313) Class157 local1313 = local228[local1306];
			if (local1313.aByteArray65 != null) {
				local1313.anInt4842 = buffer.readUnsignedByte();
			}
			if (local1313.aByteArray64 != null) {
				local1313.anInt4848 = buffer.readUnsignedByte();
			}
			if (local1313.anInt4841 > 0) {
				local1313.anInt4839 = buffer.readUnsignedByte();
			}
		}
		for (@Pc(1345) int local1345 = 0; local1345 < local182; local1345++) {
			local228[local1345].anInt4847 = buffer.readUnsignedByte();
		}
		for (@Pc(1364) int local1364 = 0; local1364 < local182; local1364++) {
			@Pc(1371) Class157 local1371 = local228[local1364];
			if (local1371.anInt4847 > 0) {
				local1371.anInt4840 = buffer.readUnsignedByte();
			}
		}
		for (@Pc(1387) int local1387 = 0; local1387 < local182; local1387++) {
			@Pc(1398) Class157 local1398 = local228[local1387];
			if (local1398.anInt4840 > 0) {
				local1398.anInt4845 = buffer.readUnsignedByte();
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "([ILclient!jk;I[B)Z")
	public boolean isReady(@OriginalArg(1) SoundBank bank, @OriginalArg(0) int[] samplingRates, @OriginalArg(3) byte[] keys) {
		@Pc(15) boolean ready = true;
		@Pc(17) int prevSoundId = 0;
		@Pc(19) PcmSound sound = null;
		for (@Pc(21) int i = 0; i < 128; i++) {
			if (keys == null || keys[i] != 0) {
				@Pc(40) int soundId = this.soundIds[i];
				if (soundId != 0) {
					if (soundId != prevSoundId) {
						prevSoundId = soundId;
						@Pc(51) int soundId2 = soundId - 1;
						if ((soundId2 & 0x1) == 0) {
							sound = bank.getSynthSound(soundId2 >> 2, samplingRates);
						} else {
							sound = bank.getVorbisSound(soundId2 >> 2, samplingRates);
						}
						if (sound == null) {
							ready = false;
						}
					}
					if (sound != null) {
						this.sounds[i] = sound;
						this.soundIds[i] = 0;
					}
				}
			}
		}
		return ready;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V")
	public void release() {
		this.soundIds = null;
	}
}
