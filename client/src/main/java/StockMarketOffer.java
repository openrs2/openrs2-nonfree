import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public final class StockMarketOffer {

	@OriginalMember(owner = "client!t", name = "c", descriptor = "I")
	public int count;

	@OriginalMember(owner = "client!t", name = "h", descriptor = "B")
	private byte statusAndType;

	@OriginalMember(owner = "client!t", name = "i", descriptor = "I")
	public int completedCount;

	@OriginalMember(owner = "client!t", name = "j", descriptor = "I")
	public int completedGold;

	@OriginalMember(owner = "client!t", name = "k", descriptor = "I")
	public int price;

	@OriginalMember(owner = "client!t", name = "l", descriptor = "I")
	public int item;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
	public StockMarketOffer() {
	}

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!fd;)V")
	public StockMarketOffer(@OriginalArg(0) Buffer buffer) {
		this.statusAndType = buffer.readByte();
		this.item = buffer.readUnsignedShort();
		this.price = buffer.readInt();
		this.count = buffer.readInt();
		this.completedCount = buffer.readInt();
		this.completedGold = buffer.readInt();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)I")
	public int getType() {
		return (this.statusAndType & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(I)I")
	public int getStatus() {
		return this.statusAndType & 0x7;
	}
}
