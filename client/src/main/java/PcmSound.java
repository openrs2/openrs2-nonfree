import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public final class PcmSound extends Sound {

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "Z")
	public boolean aBoolean288;

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
	public int rate;

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "[B")
	public byte[] samples;

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
	public int start;

	@OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
	public int end;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(I[BII)V")
	public PcmSound(@OriginalArg(0) int rate, @OriginalArg(1) byte[] samples, @OriginalArg(2) int start, @OriginalArg(3) int end) {
		this.rate = rate;
		this.samples = samples;
		this.start = start;
		this.end = end;
	}

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(I[BIIZ)V")
	public PcmSound(@OriginalArg(0) int rate, @OriginalArg(1) byte[] samples, @OriginalArg(2) int start, @OriginalArg(3) int end, @OriginalArg(4) boolean arg4) {
		this.rate = rate;
		this.samples = samples;
		this.start = start;
		this.end = end;
		this.aBoolean288 = arg4;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!ud;)Lclient!pb;")
	public final PcmSound resample(@OriginalArg(0) Resampler resampler) {
		this.samples = resampler.resample(this.samples);
		this.rate = resampler.scaleRate(this.rate);
		if (this.start == this.end) {
			this.start = this.end = resampler.scalePosition(this.start);
		} else {
			this.start = resampler.scalePosition(this.start);
			this.end = resampler.scalePosition(this.end);
			if (this.start == this.end) {
				this.start--;
			}
		}
		return this;
	}
}
