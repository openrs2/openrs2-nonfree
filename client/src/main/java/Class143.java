import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class143 {

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
	public int anInt4306;

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
	public int anInt4312;

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "Z")
	public boolean aBoolean303 = false;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILclient!fd;II)V")
	private void method3552(@OriginalArg(1) Buffer arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt4312 = arg0.readUnsignedShort();
		} else if (arg2 == 2) {
			this.anInt4306 = arg0.readUnsignedMedium();
		} else if (arg2 == 3) {
			this.aBoolean303 = true;
		} else if (arg2 == 4) {
			this.anInt4312 = -1;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZLclient!fd;)V")
	public final void method3556(@OriginalArg(0) int arg0, @OriginalArg(2) Buffer arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.readUnsignedByte();
			if (local9 == 0) {
				return;
			}
			this.method3552(arg1, arg0, local9);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZI)Lclient!fe;")
	public final Class56_Sub1 method3557(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(23) Class56_Sub1 local23 = (Class56_Sub1) Static5.aClass26_41.get((long) (arg1 << 16 | this.anInt4312 | (arg0 ? 262144 : 0)));
		if (local23 != null) {
			return local23;
		}
		Static7.aClass58_103.method1359(this.anInt4312);
		@Pc(44) Class56_Sub1 local44 = Static33.method3003(Static7.aClass58_103, this.anInt4312);
		if (local44 != null) {
			local44.method1311(Static6.anInt4867, Static1.anInt97, Static5.anInt3963);
			local44.anInt3412 = local44.anInt3408;
			local44.anInt3410 = local44.anInt3413;
			if (arg0) {
				local44.method1312();
			}
			for (@Pc(66) int local66 = 0; local66 < arg1; local66++) {
				local44.method1313();
			}
			Static5.aClass26_41.put((long) (this.anInt4312 | arg1 << 16 | (arg0 ? 262144 : 0)), local44);
		}
		return local44;
	}
}
