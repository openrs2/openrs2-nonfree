import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class155 {

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
	private final int anInt4798 = Static30.method3637(16);

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
	private final int anInt4800 = Static30.method3637(24);

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
	private final int anInt4796 = Static30.method3637(24);

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
	private final int anInt4795 = Static30.method3637(24) + 1;

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
	private final int anInt4799 = Static30.method3637(6) + 1;

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
	private final int anInt4797 = Static30.method3637(8);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "[I")
	private final int[] anIntArray518;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
	public Class155() {
		@Pc(33) int[] local33 = new int[this.anInt4799];
		for (@Pc(35) int local35 = 0; local35 < this.anInt4799; local35++) {
			@Pc(41) int local41 = 0;
			@Pc(44) int local44 = Static30.method3637(3);
			@Pc(50) boolean local50 = Static30.method3632() != 0;
			if (local50) {
				local41 = Static30.method3637(5);
			}
			local33[local35] = local41 << 3 | local44;
		}
		this.anIntArray518 = new int[this.anInt4799 * 8];
		for (@Pc(74) int local74 = 0; local74 < this.anInt4799 * 8; local74++) {
			this.anIntArray518[local74] = (local33[local74 >> 3] & 0x1 << (local74 & 0x7)) == 0 ? -1 : Static30.method3637(8);
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "([FIZ)V")
	public final void method3955(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = 0.0F;
		}
		if (arg2) {
			return;
		}
		@Pc(19) int local19 = Static6.aClass132Array1[this.anInt4797].anInt4110;
		@Pc(25) int local25 = this.anInt4796 - this.anInt4800;
		@Pc(30) int local30 = local25 / this.anInt4795;
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			@Pc(40) int local40 = 0;
			while (local40 < local30) {
				if (local35 == 0) {
					@Pc(51) int local51 = Static6.aClass132Array1[this.anInt4797].method3395();
					for (@Pc(55) int local55 = local19 - 1; local55 >= 0; local55--) {
						if (local40 + local55 < local30) {
							local33[local40 + local55] = local51 % this.anInt4799;
						}
						local51 /= this.anInt4799;
					}
				}
				for (@Pc(80) int local80 = 0; local80 < local19; local80++) {
					@Pc(87) int local87 = local33[local40];
					@Pc(96) int local96 = this.anIntArray518[local87 * 8 + local35];
					if (local96 >= 0) {
						@Pc(106) int local106 = this.anInt4800 + local40 * this.anInt4795;
						@Pc(110) Class132 local110 = Static6.aClass132Array1[local96];
						if (this.anInt4798 == 0) {
							@Pc(119) int local119 = this.anInt4795 / local110.anInt4110;
							for (@Pc(121) int local121 = 0; local121 < local119; local121++) {
								@Pc(127) float[] local127 = local110.method3392();
								for (@Pc(129) int local129 = 0; local129 < local110.anInt4110; local129++) {
									arg0[local106 + local121 + local129 * local119] += local127[local129];
								}
							}
						} else {
							@Pc(155) int local155 = 0;
							while (local155 < this.anInt4795) {
								@Pc(162) float[] local162 = local110.method3392();
								for (@Pc(164) int local164 = 0; local164 < local110.anInt4110; local164++) {
									arg0[local106 + local155] += local162[local164];
									local155++;
								}
							}
						}
					}
					local40++;
					if (local40 >= local30) {
						break;
					}
				}
			}
		}
	}
}
