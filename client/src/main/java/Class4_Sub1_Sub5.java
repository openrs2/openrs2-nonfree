import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class4_Sub1_Sub5 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ck", name = "W", descriptor = "I")
	private int anInt685 = 3216;

	@OriginalMember(owner = "client!ck", name = "T", descriptor = "I")
	private int anInt682 = 3216;

	@OriginalMember(owner = "client!ck", name = "X", descriptor = "I")
	private int anInt686 = 4096;

	@OriginalMember(owner = "client!ck", name = "eb", descriptor = "[I")
	private final int[] anIntArray57 = new int[3];

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub5() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void method4687(@OriginalArg(1) Buffer arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt686 = arg0.readUnsignedShort();
		} else if (arg1 == 1) {
			this.anInt685 = arg0.readUnsignedShort();
		} else if (arg1 == 2) {
			this.anInt682 = arg0.readUnsignedShort();
		}
	}

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "(B)V")
	@Override
	public final void method4700() {
		this.method642();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] method4694(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			@Pc(24) int local24 = Static6.anInt4511 * this.anInt686 >> 12;
			@Pc(36) int[] local36 = this.method4699(arg0 - 1 & Static6.anInt5001, 0);
			@Pc(44) int[] local44 = this.method4699(arg0, 0);
			@Pc(56) int[] local56 = this.method4699(Static6.anInt5001 & arg0 + 1, 0);
			for (@Pc(58) int local58 = 0; local58 < Static2.anInt1626; local58++) {
				@Pc(82) int local82 = local24 * (local44[Static1.anInt901 & local58 - 1] - local44[Static1.anInt901 & local58 + 1]) >> 12;
				@Pc(86) int local86 = local82 >> 4;
				@Pc(99) int local99 = (local56[local58] - local36[local58]) * local24 >> 12;
				if (local86 < 0) {
					local86 = -local86;
				}
				@Pc(112) int local112 = local99 >> 4;
				if (local112 < 0) {
					local112 = -local112;
				}
				if (local112 > 255) {
					local112 = 255;
				}
				if (local86 > 255) {
					local86 = 255;
				}
				@Pc(149) int local149 = Class17.aByteArray4[local86 + ((local112 + 1) * local112 >> 1)] & 0xFF;
				@Pc(155) int local155 = local82 * local149 >> 8;
				@Pc(161) int local161 = local149 * local99 >> 8;
				local155 = this.anIntArray57[0] * local155 >> 12;
				@Pc(176) int local176 = local149 * 4096 >> 8;
				local161 = this.anIntArray57[1] * local161 >> 12;
				local176 = this.anIntArray57[2] * local176 >> 12;
				local7[local58] = local176 + local161 + local155;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "(B)V")
	private void method642() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt682 / 4096.0F));
		this.anIntArray57[0] = (int) (Math.sin((double) ((float) this.anInt685 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray57[1] = (int) (Math.cos((double) ((float) this.anInt685 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray57[2] = (int) (Math.sin((double) ((float) this.anInt682 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray57[0] * this.anIntArray57[0] >> 12;
		@Pc(81) int local81 = this.anIntArray57[2] * this.anIntArray57[2] >> 12;
		@Pc(93) int local93 = this.anIntArray57[1] * this.anIntArray57[1] >> 12;
		@Pc(106) int local106 = (int) (Math.sqrt((double) (local81 + local69 + local93 >> 12)) * 4096.0D);
		if (local106 != 0) {
			this.anIntArray57[0] = (this.anIntArray57[0] << 12) / local106;
			this.anIntArray57[2] = (this.anIntArray57[2] << 12) / local106;
			this.anIntArray57[1] = (this.anIntArray57[1] << 12) / local106;
		}
	}
}
