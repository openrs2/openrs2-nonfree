import org.openrs2.deob.annotation.OriginalMember;

public final class StockMarketManager {
	@OriginalMember(owner = "client!bg", name = "u", descriptor = "[Lclient!t;")
	public static final StockMarketOffer[] offers = new StockMarketOffer[6];

	@OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
	public static int transmitAt = 0;
}
