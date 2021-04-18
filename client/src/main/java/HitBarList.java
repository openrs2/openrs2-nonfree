import org.openrs2.deob.annotation.OriginalMember;

public final class HitBarList {
	@OriginalMember(owner = "client!bl", name = "db", descriptor = "Lclient!cc;")
	public static final SoftLruHashTable hitBars = new SoftLruHashTable(4);
}
