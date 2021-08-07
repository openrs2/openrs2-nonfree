import java.awt.Component;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("signlink!le")
public interface AudioSource {

	@OriginalMember(owner = "signlink!le", name = "a", descriptor = "(I[I)V")
	void write(@OriginalArg(0) int channel, @OriginalArg(1) int[] samples);

	@OriginalMember(owner = "signlink!le", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
	void init(@OriginalArg(1) Component component, @OriginalArg(0) boolean stereo, @OriginalArg(3) int sampleRate) throws Exception;

	@OriginalMember(owner = "signlink!le", name = "c", descriptor = "(II)I")
	int getBufferSize(@OriginalArg(0) int channel);

	@OriginalMember(owner = "signlink!le", name = "a", descriptor = "(II)V")
	void close(@OriginalArg(0) int channel);

	@OriginalMember(owner = "signlink!le", name = "b", descriptor = "(II)V")
	void flush(@OriginalArg(1) int channel);

	@OriginalMember(owner = "signlink!le", name = "a", descriptor = "(IBI)V")
	void open(@OriginalArg(2) int channel, @OriginalArg(0) int bufferCapacity) throws Exception;
}
