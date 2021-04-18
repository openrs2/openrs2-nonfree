import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class JavaAudioChannel extends AudioChannel {

	@OriginalMember(owner = "client!kb", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine line;

	@OriginalMember(owner = "client!kb", name = "O", descriptor = "I")
	private int lineBufferSize;

	@OriginalMember(owner = "client!kb", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat format;

	@OriginalMember(owner = "client!kb", name = "Q", descriptor = "[B")
	private byte[] binarySamples;

	@OriginalMember(owner = "client!kb", name = "M", descriptor = "Z")
	private boolean reopenAfterFlush = false;

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "()V")
	@Override
	protected final void close() {
		if (this.line != null) {
			this.line.close();
			this.line = null;
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	@Override
	public final void open(@OriginalArg(0) int bufferSize) throws LineUnavailableException {
		try {
			@Pc(20) Info info = new Info(SourceDataLine.class, this.format, bufferSize << (AudioChannel.stereo ? 2 : 1));
			this.line = (SourceDataLine) AudioSystem.getLine(info);
			this.line.open();
			this.line.start();
			this.lineBufferSize = bufferSize;
		} catch (@Pc(36) LineUnavailableException ex) {
			if (IntUtils.bitCountFast(bufferSize) == 1) {
				this.line = null;
				throw ex;
			} else {
				this.open(IntUtils.clp2(bufferSize));
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "()I")
	@Override
	protected final int getBufferedSampleCount() {
		return this.lineBufferSize - (this.line.available() >> (AudioChannel.stereo ? 2 : 1));
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "()V")
	@Override
	protected final void flush() throws LineUnavailableException {
		this.line.flush();
		if (!this.reopenAfterFlush) {
			return;
		}
		this.line.close();
		this.line = null;
		@Pc(34) Info info = new Info(SourceDataLine.class, this.format, this.lineBufferSize << (AudioChannel.stereo ? 2 : 1));
		this.line = (SourceDataLine) AudioSystem.getLine(info);
		this.line.open();
		this.line.start();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public final void init(@OriginalArg(0) Component component) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] mixers = AudioSystem.getMixerInfo();
		if (mixers != null) {
			for (@Pc(9) int i = 0; i < mixers.length; i++) {
				@Pc(17) javax.sound.sampled.Mixer.Info mixer = mixers[i];
				if (mixer != null) {
					@Pc(23) String name = mixer.getName();
					if (name != null && name.toLowerCase().indexOf("soundmax") >= 0) {
						this.reopenAfterFlush = true;
					}
				}
			}
		}
		this.format = new AudioFormat((float) Static7.sampleRate, 16, AudioChannel.stereo ? 2 : 1, true, false);
		this.binarySamples = new byte[0x100 << (AudioChannel.stereo ? 2 : 1)];
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "()V")
	@Override
	protected final void write() {
		@Pc(1) short len = 256;
		if (AudioChannel.stereo) {
			len = 512;
		}
		for (@Pc(9) int i = 0; i < len; i++) {
			@Pc(17) int sample = this.samples[i];
			if ((sample + 0x800000 & 0xFF000000) != 0) {
				sample = sample >> 31 ^ 0x7FFFFF;
			}
			this.binarySamples[i * 2] = (byte) (sample >> 8);
			this.binarySamples[i * 2 + 1] = (byte) (sample >> 16);
		}
		this.line.write(this.binarySamples, 0, len << 1);
	}
}
