import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class158 {

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
	public final int anInt4864;

	@OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
	public final int anInt4868;

	@OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
	public final int anInt4869;

	@OriginalMember(owner = "client!sk", name = "g", descriptor = "Lclient!ik;")
	public final Class89 aClass89_2;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(IIII)V")
	public Class158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) Class89 local5 = Static32.method3982(arg0);
		this.anInt4864 = arg3;
		this.anInt4868 = arg2;
		this.anInt4869 = arg1;
		if (Static3.aBoolean138 || local5.anInt2433 == -1) {
			this.aClass89_2 = local5;
		} else {
			this.aClass89_2 = Static32.method3982(local5.anInt2433);
		}
	}

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lclient!ik;III)V")
	public Class158(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4869 = arg1;
		this.aClass89_2 = arg0;
		this.anInt4864 = arg3;
		this.anInt4868 = arg2;
	}
}
