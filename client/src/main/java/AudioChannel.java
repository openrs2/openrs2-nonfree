import java.awt.Component;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public class AudioChannel {

	@OriginalMember(owner = "client!jk", name = "w", descriptor = "Lclient!im;")
	private static AudioThread thread;

	@OriginalMember(owner = "client!ln", name = "T", descriptor = "I")
	private static int threadPriority;

	@OriginalMember(owner = "client!jk", name = "s", descriptor = "Z")
	public static boolean stereo;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IZIB)V")
	public static void init(@OriginalArg(1) boolean stereo) {
		threadPriority = 2;
		AudioChannel.stereo = stereo;
		Static7.sampleRate = 22050;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ljava/awt/Component;BILsignlink!pm;I)Lclient!tj;")
	public static AudioChannel create(@OriginalArg(0) Component component, @OriginalArg(3) SignLink signLink, @OriginalArg(4) int channelId, @OriginalArg(2) int sampleRate) {
		if (Static7.sampleRate == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(38) AudioChannel channel = (AudioChannel) Class.forName("JavaAudioChannel").getDeclaredConstructor().newInstance();
			channel.sampleRate = sampleRate;
			channel.samples = new int[(stereo ? 2 : 1) * 256];
			channel.init(component);
			channel.bufferCapacity = (sampleRate & 0xFFFFFC00) + 1024;
			if (channel.bufferCapacity > 16384) {
				channel.bufferCapacity = 16384;
			}
			channel.open(channel.bufferCapacity);
			if (threadPriority > 0 && thread == null) {
				thread = new AudioThread();
				thread.signLink = signLink;
				signLink.startThread(thread, threadPriority);
			}
			if (thread != null) {
				if (thread.channels[channelId] != null) {
					throw new IllegalArgumentException();
				}
				thread.channels[channelId] = channel;
			}
			return channel;
		} catch (@Pc(123) Throwable ex) {
			try {
				@Pc(129) SignLinkAudioChannel channel = new SignLinkAudioChannel(signLink, channelId);
				channel.sampleRate = sampleRate;
				channel.samples = new int[(stereo ? 2 : 1) * 256];
				channel.init(component);
				channel.bufferCapacity = 16384;
				channel.open(channel.bufferCapacity);
				if (threadPriority > 0 && thread == null) {
					thread = new AudioThread();
					thread.signLink = signLink;
					signLink.startThread(thread, threadPriority);
				}
				if (thread != null) {
					if (thread.channels[channelId] != null) {
						throw new IllegalArgumentException();
					}
					thread.channels[channelId] = channel;
				}
				return channel;
			} catch (@Pc(192) Throwable ex2) {
				return new AudioChannel();
			}
		}
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "Lclient!tf;")
	private PcmStream stream;

	@OriginalMember(owner = "client!tj", name = "o", descriptor = "[I")
	public int[] samples;

	@OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
	public int sampleRate;

	@OriginalMember(owner = "client!tj", name = "E", descriptor = "I")
	public int bufferCapacity;

	@OriginalMember(owner = "client!tj", name = "G", descriptor = "I")
	private int anInt3597;

	@OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
	private final int anInt3577 = 32;

	@OriginalMember(owner = "client!tj", name = "r", descriptor = "Z")
	private boolean stop = false;

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "J")
	private long time = MonotonicClock.currentTimeMillis();

	@OriginalMember(owner = "client!tj", name = "B", descriptor = "I")
	private int prevBufferSize = 0;

	@OriginalMember(owner = "client!tj", name = "z", descriptor = "I")
	private int prevConsumedSamples = 0;

	@OriginalMember(owner = "client!tj", name = "A", descriptor = "I")
	private int anInt3593 = 0;

	@OriginalMember(owner = "client!tj", name = "F", descriptor = "[Lclient!tf;")
	private final PcmStream[] aClass4_Sub6Array6 = new PcmStream[8];

	@OriginalMember(owner = "client!tj", name = "H", descriptor = "I")
	private int consumedSamples = 0;

	@OriginalMember(owner = "client!tj", name = "D", descriptor = "[Lclient!tf;")
	private final PcmStream[] aClass4_Sub6Array5 = new PcmStream[8];

	@OriginalMember(owner = "client!tj", name = "K", descriptor = "J")
	private long closeUntil = 0L;

	@OriginalMember(owner = "client!tj", name = "L", descriptor = "Z")
	private boolean skipConsumptionCheck = true;

	@OriginalMember(owner = "client!tj", name = "I", descriptor = "J")
	private long calculateConsumptionAt = 0L;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILclient!tf;B)V")
	private void method2994(@OriginalArg(0) int arg0, @OriginalArg(1) PcmStream arg1) {
		@Pc(3) int local3 = arg0 >> 5;
		@Pc(8) PcmStream local8 = this.aClass4_Sub6Array5[local3];
		if (local8 == null) {
			this.aClass4_Sub6Array6[local3] = arg1;
		} else {
			local8.aClass4_Sub6_8 = arg1;
		}
		this.aClass4_Sub6Array5[local3] = arg1;
		arg1.anInt4094 = arg0;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI)V")
	private void skip() {
		this.anInt3593 -= 256;
		if (this.anInt3593 < 0) {
			this.anInt3593 = 0;
		}
		if (this.stream != null) {
			this.stream.skip(256);
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
	public final void method2996() {
		this.skipConsumptionCheck = true;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
	public final synchronized void loop() {
		if (this.stop) {
			return;
		}
		@Pc(18) long now = MonotonicClock.currentTimeMillis();
		try {
			if (this.time + 500000L < now) {
				this.time = now - 500000L;
			}
			while (this.time + 5000L < now) {
				this.skip();
				this.time += 256000 / Static7.sampleRate;
			}
		} catch (@Pc(58) Exception ex) {
			this.time = now;
		}
		if (this.samples == null) {
			return;
		}
		try {
			if (this.closeUntil != 0L) {
				if (this.closeUntil > now) {
					return;
				}
				this.open(this.bufferCapacity);
				this.skipConsumptionCheck = true;
				this.closeUntil = 0L;
			}
			@Pc(96) int bufferSize = this.getBufferSize();
			if (this.prevBufferSize - bufferSize > this.consumedSamples) {
				this.consumedSamples = this.prevBufferSize - bufferSize;
			}
			@Pc(117) int targetBufferSize = this.anInt3597 + this.sampleRate;
			if (targetBufferSize + 256 > 16384) {
				targetBufferSize = 16128;
			}
			if (this.bufferCapacity < targetBufferSize + 256) {
				this.bufferCapacity += 1024;
				bufferSize = 0;
				if (this.bufferCapacity > 16384) {
					this.bufferCapacity = 16384;
				}
				this.close();
				this.open(this.bufferCapacity);
				if (this.bufferCapacity < targetBufferSize + 256) {
					targetBufferSize = this.bufferCapacity - 256;
					this.anInt3597 = targetBufferSize - this.sampleRate;
				}
				this.skipConsumptionCheck = true;
			}
			while (bufferSize < targetBufferSize) {
				bufferSize += 256;
				this.read(this.samples);
				this.write();
			}
			if (now > this.calculateConsumptionAt) {
				if (this.skipConsumptionCheck) {
					this.skipConsumptionCheck = false;
				} else if (this.consumedSamples == 0 && this.prevConsumedSamples == 0) {
					this.close();
					this.closeUntil = now + 2000L;
					return;
				} else {
					this.anInt3597 = Math.min(this.prevConsumedSamples, this.consumedSamples);
					this.prevConsumedSamples = this.consumedSamples;
				}
				this.consumedSamples = 0;
				this.calculateConsumptionAt = now + 2000L;
			}
			this.prevBufferSize = bufferSize;
		} catch (@Pc(262) Exception ex) {
			this.close();
			this.closeUntil = now + 2000L;
		}
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)V")
	public void open(@OriginalArg(0) int bufferCapacity) throws Exception {
	}

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)V")
	public final synchronized void quit() {
		if (thread != null) {
			@Pc(17) boolean stop = true;
			for (@Pc(19) int i = 0; i < 2; i++) {
				if (thread.channels[i] == this) {
					thread.channels[i] = null;
				}
				if (thread.channels[i] != null) {
					stop = false;
				}
			}
			if (stop) {
				thread.stop = true;
				while (thread.running) {
					ThreadUtils.sleep(50L);
				}
				thread = null;
			}
		}
		this.close();
		this.stop = true;
		this.samples = null;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "()I")
	protected int getBufferSize() throws Exception {
		return this.bufferCapacity;
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "()V")
	protected void close() {
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "()V")
	protected void write() throws Exception {
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void init(@OriginalArg(0) Component component) throws Exception {
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!tf;I)V")
	public final synchronized void setStream(@OriginalArg(0) PcmStream stream) {
		this.stream = stream;
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)V")
	public final synchronized void method3009() {
		this.skipConsumptionCheck = true;
		try {
			this.flush();
		} catch (@Pc(18) Exception ex) {
			this.close();
			this.closeUntil = MonotonicClock.currentTimeMillis() + 2000L;
		}
	}

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "()V")
	protected void flush() throws Exception {
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "([II)V")
	private void read(@OriginalArg(0) int[] samples) {
		@Pc(1) short len = 256;
		if (stereo) {
			len = 512;
		}
		ArrayUtils.clear(samples, 0, len);
		this.anInt3593 -= 256;
		if (this.stream != null && this.anInt3593 <= 0) {
			this.anInt3593 += Static7.sampleRate >> 4;
			PcmStream.setInactive(this.stream);
			this.method2994(this.stream.method3347(), this.stream);
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = 255;
			@Pc(49) int local49 = 7;
			label106:
			while (local47 != 0) {
				@Pc(57) int local57;
				@Pc(62) int local62;
				if (local49 < 0) {
					local57 = local49 & 0x3;
					local62 = -(local49 >> 2);
				} else {
					local57 = local49;
					local62 = 0;
				}
				for (@Pc(73) int local73 = local47 >>> local57 & 0x11111111; local73 != 0; local73 >>>= 4) {
					if ((local73 & 0x1) != 0) {
						local47 &= ~(0x1 << local57);
						@Pc(91) PcmStream local91 = null;
						@Pc(96) PcmStream local96 = this.aClass4_Sub6Array6[local57];
						label100:
						while (true) {
							while (true) {
								if (local96 == null) {
									break label100;
								}
								@Pc(101) Sound local101 = local96.sound;
								if (local101 == null || local101.position <= local62) {
									local96.active = true;
									@Pc(125) int local125 = local96.method3346();
									local45 += local125;
									if (local101 != null) {
										local101.position += local125;
									}
									if (local45 >= this.anInt3577) {
										break label106;
									}
									@Pc(145) PcmStream local145 = local96.firstSubStream();
									if (local145 != null) {
										@Pc(150) int local150 = local96.anInt4094;
										while (local145 != null) {
											this.method2994(local150 * local145.method3347() >> 8, local145);
											local145 = local96.nextSubStream();
										}
									}
									@Pc(169) PcmStream local169 = local96.aClass4_Sub6_8;
									local96.aClass4_Sub6_8 = null;
									if (local91 == null) {
										this.aClass4_Sub6Array6[local57] = local169;
									} else {
										local91.aClass4_Sub6_8 = local169;
									}
									if (local169 == null) {
										this.aClass4_Sub6Array5[local57] = local91;
									}
									local96 = local169;
								} else {
									local47 |= 0x1 << local57;
									local91 = local96;
									local96 = local96.aClass4_Sub6_8;
								}
							}
						}
					}
					local57 += 4;
					local62++;
				}
				local49--;
			}
			for (@Pc(204) int local204 = 0; local204 < 8; local204++) {
				@Pc(212) PcmStream local212 = this.aClass4_Sub6Array6[local204];
				this.aClass4_Sub6Array6[local204] = this.aClass4_Sub6Array5[local204] = null;
				while (local212 != null) {
					@Pc(227) PcmStream local227 = local212.aClass4_Sub6_8;
					local212.aClass4_Sub6_8 = null;
					local212 = local227;
				}
			}
		}
		if (this.anInt3593 < 0) {
			this.anInt3593 = 0;
		}
		if (this.stream != null) {
			this.stream.read(samples, 0, 256);
		}
		this.time = MonotonicClock.currentTimeMillis();
	}
}
