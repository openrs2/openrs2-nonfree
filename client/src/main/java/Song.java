import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Song extends Node {

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!fh;II)Lclient!tg;")
	public static Song create(@OriginalArg(0) Js5 archive, @OriginalArg(1) int groupId, @OriginalArg(2) int fileId) {
		@Pc(5) byte[] bytes = archive.fetchFile(groupId, fileId);
		return bytes == null ? null : new Song(new Buffer(bytes));
	}

	@OriginalMember(owner = "client!tg", name = "p", descriptor = "Lclient!ic;")
	public HashTable programs;

	@OriginalMember(owner = "client!tg", name = "o", descriptor = "[B")
	public final byte[] midiBytes;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lclient!fd;)V")
	private Song(@OriginalArg(0) Buffer in) {
		in.position = in.bytes.length - 3;
		@Pc(12) int tracks = in.readUnsignedByte();
		@Pc(16) int division = in.readUnsignedShort();
		@Pc(22) int midiLen = tracks * 10 + 14;
		in.position = 0;
		@Pc(27) int tempoChanges = 0;
		@Pc(29) int controllerEvents = 0;
		@Pc(31) int noteOnEvents = 0;
		@Pc(33) int noteOffEvents = 0;
		@Pc(35) int pitchWheelEvents = 0;
		@Pc(37) int channelPressureEvents = 0;
		@Pc(39) int keyPressureEvents = 0;
		@Pc(41) int bankSelectEvents = 0;
		for (@Pc(43) int i = 0; i < tracks; i++) {
			@Pc(48) int status = -1;
			while (true) {
				@Pc(52) int statusAndChannel = in.readUnsignedByte();
				if (statusAndChannel != status) {
					midiLen++;
				}
				status = statusAndChannel & 0xF;
				if (statusAndChannel == 7) {
					break;
				}
				if (statusAndChannel == 23) {
					tempoChanges++;
				} else if (status == 0) {
					noteOnEvents++;
				} else if (status == 1) {
					noteOffEvents++;
				} else if (status == 2) {
					controllerEvents++;
				} else if (status == 3) {
					pitchWheelEvents++;
				} else if (status == 4) {
					channelPressureEvents++;
				} else if (status == 5) {
					keyPressureEvents++;
				} else if (status == 6) {
					bankSelectEvents++;
				} else {
					throw new RuntimeException();
				}
			}
		}
		@Pc(115) int midiLen2 = midiLen + tempoChanges * 5;
		midiLen2 += (noteOnEvents + noteOffEvents + controllerEvents + pitchWheelEvents + keyPressureEvents) * 2;
		midiLen2 += channelPressureEvents + bankSelectEvents;
		@Pc(138) int deltaTimePos = in.position;
		@Pc(156) int events = tracks + tempoChanges + controllerEvents + noteOnEvents + noteOffEvents + pitchWheelEvents + channelPressureEvents + keyPressureEvents + bankSelectEvents;
		for (@Pc(158) int i = 0; i < events; i++) {
			in.readVarInt();
		}
		@Pc(174) int midiLen3 = midiLen2 + in.position - deltaTimePos;
		@Pc(177) int controllerPos = in.position;
		@Pc(179) int modulationWheelMsbEvents = 0;
		@Pc(181) int modulationWheelLsbEvents = 0;
		@Pc(183) int channelVolumeMsbEvents = 0;
		@Pc(185) int channelVolumeLsbEvents = 0;
		@Pc(187) int panMsbEvents = 0;
		@Pc(189) int panLsbEvents = 0;
		@Pc(191) int nonRegisteredMsbEvents = 0;
		@Pc(193) int nonRegisteredLsbEvents = 0;
		@Pc(195) int registeredMsbEvents = 0;
		@Pc(197) int registeredLsbEvents = 0;
		@Pc(199) int otherKnownControllerEvents = 0;
		@Pc(201) int unknownControllerEvents = 0;
		@Pc(203) int controller = 0;
		for (@Pc(205) int i = 0; i < controllerEvents; i++) {
			controller = controller + in.readUnsignedByte() & 0x7F;
			if (controller == 0 || controller == 32) {
				bankSelectEvents++;
			} else if (controller == 1) {
				modulationWheelMsbEvents++;
			} else if (controller == 33) {
				modulationWheelLsbEvents++;
			} else if (controller == 7) {
				channelVolumeMsbEvents++;
			} else if (controller == 39) {
				channelVolumeLsbEvents++;
			} else if (controller == 10) {
				panMsbEvents++;
			} else if (controller == 42) {
				panLsbEvents++;
			} else if (controller == 99) {
				nonRegisteredMsbEvents++;
			} else if (controller == 98) {
				nonRegisteredLsbEvents++;
			} else if (controller == 101) {
				registeredMsbEvents++;
			} else if (controller == 100) {
				registeredLsbEvents++;
			} else if (controller == 64 || controller == 65 || controller == 120 || controller == 121 || controller == 123) {
				otherKnownControllerEvents++;
			} else {
				unknownControllerEvents++;
			}
		}
		@Pc(295) int messagePos = 0;
		@Pc(298) int otherKnownControllerPos = in.position;
		in.position += otherKnownControllerEvents;
		@Pc(307) int keyPressurePos = in.position;
		in.position += keyPressureEvents;
		@Pc(316) int channelPressurePos = in.position;
		in.position += channelPressureEvents;
		@Pc(325) int pitchWheelMsbPos = in.position;
		in.position += pitchWheelEvents;
		@Pc(334) int modulationWheelMsbPos = in.position;
		in.position += modulationWheelMsbEvents;
		@Pc(343) int channelVolumeMsbPos = in.position;
		in.position += channelVolumeMsbEvents;
		@Pc(352) int panMsbPos = in.position;
		in.position += panMsbEvents;
		@Pc(361) int keyPos = in.position;
		in.position += noteOnEvents + noteOffEvents + keyPressureEvents;
		@Pc(374) int onVelocityPos = in.position;
		in.position += noteOnEvents;
		@Pc(383) int unknownControllerPos = in.position;
		in.position += unknownControllerEvents;
		@Pc(392) int offVelocityPos = in.position;
		in.position += noteOffEvents;
		@Pc(401) int modulationWheelLsbPos = in.position;
		in.position += modulationWheelLsbEvents;
		@Pc(410) int channelVolumeLsbPos = in.position;
		in.position += channelVolumeLsbEvents;
		@Pc(419) int panLsbPos = in.position;
		in.position += panLsbEvents;
		@Pc(428) int bankSelectPos = in.position;
		in.position += bankSelectEvents;
		@Pc(437) int pitchWheelLsbPos = in.position;
		in.position += pitchWheelEvents;
		@Pc(446) int nonRegisteredMsbPos = in.position;
		in.position += nonRegisteredMsbEvents;
		@Pc(455) int nonRegisteredLsbPos = in.position;
		in.position += nonRegisteredLsbEvents;
		@Pc(464) int registeredMsbPos = in.position;
		in.position += registeredMsbEvents;
		@Pc(473) int registeredLsbPos = in.position;
		in.position += registeredLsbEvents;
		@Pc(482) int tempoPos = in.position;
		in.position += tempoChanges * 3;
		this.midiBytes = new byte[midiLen3];
		@Pc(500) Buffer out = new Buffer(this.midiBytes);
		out.writeInt(0x4D546864);
		out.writeInt(6);
		out.writeShort(tracks > 1 ? 1 : 0);
		out.writeShort(tracks);
		out.writeShort(division);
		in.position = deltaTimePos;
		@Pc(530) int channel = 0;
		@Pc(532) int key = 0;
		@Pc(534) int onVelocity = 0;
		@Pc(536) int offVelocity = 0;
		@Pc(538) int pitchWheel = 0;
		@Pc(540) int channelPressure = 0;
		@Pc(542) int keyPressure = 0;
		@Pc(545) int[] values = new int[128];
		@Pc(547) int controller2 = 0;
		track:
		for (@Pc(549) int i = 0; i < tracks; i++) {
			out.writeInt(0x4D54726B);
			out.position += 4;
			@Pc(565) int trackLenPosition = out.position;
			@Pc(567) int status = -1;
			while (true) {
				while (true) {
					@Pc(571) int deltaTime = in.readVarInt();
					out.writeVarInt(deltaTime);
					@Pc(583) int statusAndChannel = in.bytes[messagePos++] & 0xFF;
					@Pc(590) boolean statusChanged = statusAndChannel != status;
					status = statusAndChannel & 0xF;
					if (statusAndChannel == 7) {
						if (statusChanged) {
							out.writeByte(255);
						}
						out.writeByte(47);
						out.writeByte(0);
						out.writeIntLength(out.position - trackLenPosition);
						continue track;
					}
					if (statusAndChannel == 23) {
						if (statusChanged) {
							out.writeByte(255);
						}
						out.writeByte(81);
						out.writeByte(3);
						@Pc(634) int tempoPos2 = tempoPos + 1;
						out.writeByte(in.bytes[tempoPos]);
						out.writeByte(in.bytes[tempoPos2++]);
						tempoPos = tempoPos2 + 1;
						out.writeByte(in.bytes[tempoPos2]);
					} else {
						channel ^= statusAndChannel >> 4;
						if (status == 0) {
							if (statusChanged) {
								out.writeByte(channel + 144);
							}
							key += in.bytes[keyPos++];
							onVelocity += in.bytes[onVelocityPos++];
							out.writeByte(key & 0x7F);
							out.writeByte(onVelocity & 0x7F);
						} else if (status == 1) {
							if (statusChanged) {
								out.writeByte(channel + 128);
							}
							key += in.bytes[keyPos++];
							offVelocity += in.bytes[offVelocityPos++];
							out.writeByte(key & 0x7F);
							out.writeByte(offVelocity & 0x7F);
						} else if (status == 2) {
							if (statusChanged) {
								out.writeByte(channel + 176);
							}
							controller2 = controller2 + in.bytes[controllerPos++] & 0x7F;
							out.writeByte(controller2);
							@Pc(775) byte valueDelta;
							if (controller2 == 0 || controller2 == 32) {
								valueDelta = in.bytes[bankSelectPos++];
							} else if (controller2 == 1) {
								valueDelta = in.bytes[modulationWheelMsbPos++];
							} else if (controller2 == 33) {
								valueDelta = in.bytes[modulationWheelLsbPos++];
							} else if (controller2 == 7) {
								valueDelta = in.bytes[channelVolumeMsbPos++];
							} else if (controller2 == 39) {
								valueDelta = in.bytes[channelVolumeLsbPos++];
							} else if (controller2 == 10) {
								valueDelta = in.bytes[panMsbPos++];
							} else if (controller2 == 42) {
								valueDelta = in.bytes[panLsbPos++];
							} else if (controller2 == 99) {
								valueDelta = in.bytes[nonRegisteredMsbPos++];
							} else if (controller2 == 98) {
								valueDelta = in.bytes[nonRegisteredLsbPos++];
							} else if (controller2 == 101) {
								valueDelta = in.bytes[registeredMsbPos++];
							} else if (controller2 == 100) {
								valueDelta = in.bytes[registeredLsbPos++];
							} else if (controller2 == 64 || controller2 == 65 || controller2 == 120 || controller2 == 121 || controller2 == 123) {
								valueDelta = in.bytes[otherKnownControllerPos++];
							} else {
								valueDelta = in.bytes[unknownControllerPos++];
							}
							@Pc(910) int value = valueDelta + values[controller2];
							values[controller2] = value;
							out.writeByte(value & 0x7F);
						} else if (status == 3) {
							if (statusChanged) {
								out.writeByte(channel + 224);
							}
							@Pc(940) int pitchWheelLsb = pitchWheel + in.bytes[pitchWheelLsbPos++];
							pitchWheel = pitchWheelLsb + (in.bytes[pitchWheelMsbPos++] << 7);
							out.writeByte(pitchWheel & 0x7F);
							out.writeByte(pitchWheel >> 7 & 0x7F);
						} else if (status == 4) {
							if (statusChanged) {
								out.writeByte(channel + 208);
							}
							channelPressure += in.bytes[channelPressurePos++];
							out.writeByte(channelPressure & 0x7F);
						} else if (status == 5) {
							if (statusChanged) {
								out.writeByte(channel + 160);
							}
							key += in.bytes[keyPos++];
							keyPressure += in.bytes[keyPressurePos++];
							out.writeByte(key & 0x7F);
							out.writeByte(keyPressure & 0x7F);
						} else if (status == 6) {
							if (statusChanged) {
								out.writeByte(channel + 192);
							}
							out.writeByte(in.bytes[bankSelectPos++]);
						} else {
							throw new RuntimeException();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "()V")
	public void createPrograms() {
		if (this.programs != null) {
			return;
		}
		this.programs = new HashTable(16);
		@Pc(12) int[] banks = new int[16];
		@Pc(15) int[] programs = new int[16];
		banks[9] = programs[9] = 128;
		@Pc(29) MidiDecoder song = new MidiDecoder(this.midiBytes);
		@Pc(32) int tracks = song.getTrackCount();
		for (@Pc(34) int i = 0; i < tracks; i++) {
			song.loadTrackPosition(i);
			song.addDeltaTime(i);
			song.saveTrackPosition(i);
		}
		track:
		do {
			while (true) {
				@Pc(51) int track = song.getNextTrack();
				@Pc(56) int time = song.times[track];
				while (song.times[track] == time) {
					song.loadTrackPosition(track);
					@Pc(69) int event = song.getNextEvent(track);
					if (event == 1) {
						song.loadEndOfTrackPosition();
						song.saveTrackPosition(track);
						continue track;
					}
					@Pc(85) int type = event & 0xF0;
					if (type == 176) {
						@Pc(92) int channel = event & 0xF;
						@Pc(98) int controller = event >> 8 & 0x7F;
						@Pc(104) int value = event >> 16 & 0x7F;
						if (controller == 0) {
							banks[channel] = (banks[channel] & 0xFFE03FFF) + (value << 14);
						}
						if (controller == 32) {
							banks[channel] = (banks[channel] & 0xFFFFC07F) + (value << 7);
						}
					}
					if (type == 192) {
						@Pc(140) int channel = event & 0xF;
						@Pc(146) int program = event >> 8 & 0x7F;
						programs[channel] = banks[channel] + program;
					}
					if (type == 144) {
						@Pc(161) int channel = event & 0xF;
						@Pc(167) int key = event >> 8 & 0x7F;
						@Pc(173) int velocity = event >> 16 & 0x7F;
						if (velocity > 0) {
							@Pc(179) int program = programs[channel];
							@Pc(187) ByteArrayNode node = (ByteArrayNode) this.programs.get(program);
							if (node == null) {
								node = new ByteArrayNode(new byte[128]);
								this.programs.put(program, node);
							}
							node.value[key] = 1;
						}
					}
					song.addDeltaTime(track);
					song.saveTrackPosition(track);
				}
			}
		} while (!song.hasNextTrack());
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "()V")
	public void releasePrograms() {
		this.programs = null;
	}
}
