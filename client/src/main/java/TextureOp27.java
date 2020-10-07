import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class TextureOp27 extends TextureOp {

	@OriginalMember(owner = "client!rm", name = "bb", descriptor = "[I")
	private int[] anIntArray498;

	@OriginalMember(owner = "client!rm", name = "eb", descriptor = "[I")
	private int[] anIntArray499;

	@OriginalMember(owner = "client!rm", name = "V", descriptor = "I")
	private int anInt4650 = 10;

	@OriginalMember(owner = "client!rm", name = "Y", descriptor = "I")
	private int anInt4653 = 2048;

	@OriginalMember(owner = "client!rm", name = "Z", descriptor = "I")
	private int anInt4654 = 0;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V")
	public TextureOp27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt4650 = buffer.readUnsignedByte();
		} else if (code == 1) {
			this.anInt4653 = buffer.readUnsignedShort();
		} else if (code == 2) {
			this.anInt4654 = buffer.readUnsignedByte();
		}
	}

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "(B)V")
	@Override
	public final void postDecode() {
		this.method3784();
	}

	@OriginalMember(owner = "client!rm", name = "g", descriptor = "(B)V")
	private void method3784() {
		this.anIntArray498 = new int[this.anInt4650 + 1];
		@Pc(17) int local17 = 4096 / this.anInt4650;
		this.anIntArray499 = new int[this.anInt4650 + 1];
		@Pc(31) int local31 = local17 * this.anInt4653 >> 12;
		@Pc(33) int local33 = 0;
		for (@Pc(35) int local35 = 0; local35 < this.anInt4650; local35++) {
			this.anIntArray498[local35] = local33;
			this.anIntArray499[local35] = local31 + local33;
			local33 += local17;
		}
		this.anIntArray498[this.anInt4650] = 4096;
		this.anIntArray499[this.anInt4650] = this.anIntArray499[0] + 4096;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] method4694(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			@Pc(26) int local26 = Static6.anIntArray478[arg0];
			if (this.anInt4654 == 0) {
				@Pc(140) short local140 = 0;
				for (@Pc(142) int local142 = 0; local142 < this.anInt4650; local142++) {
					if (local26 >= this.anIntArray498[local142] && local26 < this.anIntArray498[local142 + 1]) {
						if (local26 < this.anIntArray499[local142]) {
							local140 = 4096;
						}
						break;
					}
				}
				ArrayUtils.fill(local11, 0, Static2.anInt1626, local140);
			} else {
				for (@Pc(31) int local31 = 0; local31 < Static2.anInt1626; local31++) {
					@Pc(40) int local40 = 0;
					@Pc(42) short local42 = 0;
					@Pc(46) int local46 = Static4.anIntArray231[local31];
					@Pc(49) int local49 = this.anInt4654;
					if (local49 == 1) {
						local40 = local46;
					} else if (local49 == 2) {
						local40 = (local26 + local46 - 4096 >> 1) + 2048;
					} else if (local49 == 3) {
						local40 = (local46 - local26 >> 1) + 2048;
					}
					for (@Pc(86) int local86 = 0; local86 < this.anInt4650; local86++) {
						if (this.anIntArray498[local86] <= local40 && local40 < this.anIntArray498[local86 + 1]) {
							if (local40 < this.anIntArray499[local86]) {
								local42 = 4096;
							}
							break;
						}
					}
					local11[local31] = local42;
				}
			}
		}
		return local11;
	}
}
