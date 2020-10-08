import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public final class ClanMember extends Node {

	@OriginalMember(owner = "client!l", name = "p", descriptor = "I")
	public int world;

	@OriginalMember(owner = "client!l", name = "t", descriptor = "B")
	public byte rank;

	@OriginalMember(owner = "client!l", name = "y", descriptor = "Ljava/lang/String;")
	public String worldName;

	@OriginalMember(owner = "client!l", name = "z", descriptor = "Ljava/lang/String;")
	public String username;
}
