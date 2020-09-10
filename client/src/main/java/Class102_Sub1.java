import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class102_Sub1 extends Class102 {

	@OriginalMember(owner = "client!kb", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!kb", name = "O", descriptor = "I")
	private int anInt2805;

	@OriginalMember(owner = "client!kb", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!kb", name = "Q", descriptor = "[B")
	private byte[] aByteArray20;

	@OriginalMember(owner = "client!kb", name = "M", descriptor = "Z")
	private boolean aBoolean196 = false;

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "()V")
	@Override
	protected final void method3004() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	@Override
	public final void method2999(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static4.aBoolean183 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt2805 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static11.method496(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method2999(IntUtils.clp2(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "()I")
	@Override
	protected final int method3002() {
		return this.anInt2805 - (this.aSourceDataLine1.available() >> (Static4.aBoolean183 ? 2 : 1));
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "()V")
	@Override
	protected final void method3011() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean196) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt2805 << (Static4.aBoolean183 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public final void method3006(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(17) javax.sound.sampled.Mixer.Info local17 = local1[local9];
				if (local17 != null) {
					@Pc(23) String local23 = local17.getName();
					if (local23 != null && local23.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean196 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static7.anInt5394, 16, Static4.aBoolean183 ? 2 : 1, true, false);
		this.aByteArray20 = new byte[0x100 << (Static4.aBoolean183 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "()V")
	@Override
	protected final void method3005() {
		@Pc(1) short local1 = 256;
		if (Static4.aBoolean183) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray393[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray20[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray20[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray20, 0, local1 << 1);
	}
}
