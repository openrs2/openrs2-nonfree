import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public final class Js5CacheRequest extends Js5Request {

	@OriginalMember(owner = "client!al", name = "N", descriptor = "I")
	public int type;

	@OriginalMember(owner = "client!al", name = "T", descriptor = "[B")
	public byte[] data;

	@OriginalMember(owner = "client!al", name = "Y", descriptor = "Lclient!fm;")
	public Cache cache;

	@OriginalMember(owner = "client!al", name = "d", descriptor = "(I)I")
	@Override
	public int getPercentageComplete() {
		return this.incomplete ? 0 : 100;
	}

	@OriginalMember(owner = "client!al", name = "e", descriptor = "(B)[B")
	@Override
	public byte[] getData() {
		if (this.incomplete) {
			throw new RuntimeException();
		}
		return this.data;
	}
}
