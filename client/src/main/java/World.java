import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public final class World extends AbstractWorld {

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "Ljava/lang/String;")
	public String activity;

	@OriginalMember(owner = "client!gb", name = "x", descriptor = "Ljava/lang/String;")
	public String hostname;

	@OriginalMember(owner = "client!gb", name = "A", descriptor = "I")
	public int id;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)Lclient!rf;")
	public final Country getCountry() {
		return WorldList.countries[this.country];
	}
}
