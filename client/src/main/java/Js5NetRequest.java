import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public final class Js5NetRequest extends Js5Request {

	@OriginalMember(owner = "client!ul", name = "K", descriptor = "I")
	public int blockPosition;

	@OriginalMember(owner = "client!ul", name = "O", descriptor = "B")
	public byte trailerLen;

	@OriginalMember(owner = "client!ul", name = "R", descriptor = "Lclient!fd;")
	public Buffer data;

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)I")
	@Override
	public final int getPercentageComplete() {
		return this.data == null ? 0 : this.data.position * 100 / (this.data.bytes.length - this.trailerLen);
	}

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "(B)[B")
	@Override
	public final byte[] getData() {
		if (this.incomplete || this.data.bytes.length - this.trailerLen > this.data.position) {
			throw new RuntimeException();
		}
		return this.data.bytes;
	}
}
