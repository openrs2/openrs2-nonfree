import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!b")
public final class Class190 {

	@OriginalMember(owner = "loader!b", name = "d", descriptor = "[I")
	public int[] anIntArray682 = new int[20];

	@OriginalMember(owner = "loader!b", name = "e", descriptor = "I")
	public final int anInt6096;

	@OriginalMember(owner = "loader!b", name = "c", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray45;

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString371;

	@OriginalMember(owner = "loader!b", name = "f", descriptor = "I")
	public final int anInt6097;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString370;

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class190(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt6096 = arg3;
		this.aStringArray45 = arg2;
		this.aString371 = arg1;
		this.anInt6097 = arg4;
		this.aString370 = arg0;
		this.anIntArray682 = arg5;
	}
}
