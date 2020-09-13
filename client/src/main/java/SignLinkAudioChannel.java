import java.awt.Component;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public final class SignLinkAudioChannel extends AudioChannel {

	@OriginalMember(owner = "client!nm", name = "N", descriptor = "Lsignlink!le;")
	private static AudioSource audioSource;

	@OriginalMember(owner = "client!nm", name = "M", descriptor = "I")
	private final int channel;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lsignlink!pm;I)V")
	public SignLinkAudioChannel(@OriginalArg(0) SignLink signLink, @OriginalArg(1) int channel) {
		audioSource = signLink.getAudioSource();
		this.channel = channel;
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V")
	@Override
	public final void open(@OriginalArg(0) int bufferSize) throws Exception {
		if (bufferSize > 32768) {
			throw new IllegalArgumentException();
		}
		audioSource.open(this.channel, bufferSize);
	}

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "()V")
	@Override
	protected final void flush() {
		audioSource.flush(this.channel);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public final void init(@OriginalArg(0) Component component) throws Exception {
		audioSource.init(component, AudioChannel.stereo, Static7.sampleRate);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "()I")
	@Override
	protected final int getBufferedSampleCount() {
		return audioSource.getBufferedSampleCount(this.channel);
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "()V")
	@Override
	protected final void close() {
		audioSource.close(this.channel);
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "()V")
	@Override
	protected final void write() {
		audioSource.write(this.channel, this.samples);
	}
}
