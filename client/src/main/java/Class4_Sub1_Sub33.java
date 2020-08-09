import java.util.Random;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class4_Sub1_Sub33 extends Class4_Sub1 {

	@OriginalMember(owner = "client!sn", name = "X", descriptor = "I")
	private int anInt4937;

	@OriginalMember(owner = "client!sn", name = "cb", descriptor = "[[I")
	private int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!sn", name = "kb", descriptor = "I")
	private int anInt4948;

	@OriginalMember(owner = "client!sn", name = "lb", descriptor = "[I")
	private int[] anIntArray536;

	@OriginalMember(owner = "client!sn", name = "mb", descriptor = "I")
	private int anInt4949;

	@OriginalMember(owner = "client!sn", name = "nb", descriptor = "[[I")
	private int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!sn", name = "U", descriptor = "I")
	private int anInt4935 = 81;

	@OriginalMember(owner = "client!sn", name = "fb", descriptor = "I")
	private int anInt4943 = 4;

	@OriginalMember(owner = "client!sn", name = "gb", descriptor = "I")
	private int anInt4944 = 0;

	@OriginalMember(owner = "client!sn", name = "eb", descriptor = "I")
	private int anInt4942 = 1024;

	@OriginalMember(owner = "client!sn", name = "db", descriptor = "I")
	private int anInt4941 = 1024;

	@OriginalMember(owner = "client!sn", name = "hb", descriptor = "I")
	private int anInt4945 = 409;

	@OriginalMember(owner = "client!sn", name = "sb", descriptor = "I")
	private int anInt4954 = 204;

	@OriginalMember(owner = "client!sn", name = "V", descriptor = "I")
	private int anInt4936 = 8;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "(I)V")
	private void method4057() {
		@Pc(12) Random local12 = new Random((long) this.anInt4936);
		this.anInt4937 = 4096 / this.anInt4936;
		this.anIntArray536 = new int[this.anInt4936 + 1];
		this.anIntArrayArray41 = new int[this.anInt4936][this.anInt4943 + 1];
		this.anIntArrayArray42 = new int[this.anInt4936][this.anInt4943];
		this.anIntArray536[0] = 0;
		this.anInt4949 = 4096 / this.anInt4943;
		@Pc(57) int local57 = this.anInt4949 / 2;
		this.anInt4948 = this.anInt4935 / 2;
		@Pc(68) int local68 = this.anInt4937 / 2;
		for (@Pc(74) int local74 = 0; local74 < this.anInt4936; local74++) {
			if (local74 > 0) {
				@Pc(87) int local87 = this.anInt4937;
				@Pc(99) int local99 = (Static12.method716(local12, 4096) - 2048) * this.anInt4954 >> 12;
				local87 += local99 * local68 >> 12;
				this.anIntArray536[local74] = local87 + this.anIntArray536[local74 - 1];
			}
			this.anIntArrayArray41[local74][0] = 0;
			for (@Pc(128) int local128 = 0; local128 < this.anInt4943; local128++) {
				if (local128 > 0) {
					@Pc(139) int local139 = this.anInt4949;
					@Pc(153) int local153 = (Static12.method716(local12, 4096) - 2048) * this.anInt4945 >> 12;
					local139 += local57 * local153 >> 12;
					this.anIntArrayArray41[local74][local128] = this.anIntArrayArray41[local74][local128 - 1] + local139;
				}
				this.anIntArrayArray42[local74][local128] = this.anInt4941 <= 0 ? 4096 : 4096 - Static12.method716(local12, this.anInt4941);
			}
			this.anIntArrayArray41[local74][this.anInt4943] = 4096;
		}
		this.anIntArray536[this.anInt4936] = 4096;
	}

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "(B)V")
	@Override
	public final void method4700() {
		this.method4057();
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void method4687(@OriginalArg(1) Buffer arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4943 = arg0.readUnsignedByte();
		} else if (arg1 == 1) {
			this.anInt4936 = arg0.readUnsignedByte();
		} else if (arg1 == 2) {
			this.anInt4945 = arg0.readUnsignedShort();
		} else if (arg1 == 3) {
			this.anInt4954 = arg0.readUnsignedShort();
		} else if (arg1 == 4) {
			this.anInt4942 = arg0.readUnsignedShort();
		} else if (arg1 == 5) {
			this.anInt4944 = arg0.readUnsignedShort();
		} else if (arg1 == 6) {
			this.anInt4935 = arg0.readUnsignedShort();
		} else if (arg1 == 7) {
			this.anInt4941 = arg0.readUnsignedShort();
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] method4694(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			@Pc(19) int local19 = 0;
			@Pc(26) int local26;
			for (local26 = this.anInt4944 + Static6.anIntArray478[arg0]; local26 < 0; local26 += 4096) {
			}
			while (local26 > 4096) {
				local26 -= 4096;
			}
			while (this.anInt4936 > local19 && local26 >= this.anIntArray536[local19]) {
				local19++;
			}
			@Pc(64) int local64 = local19 - 1;
			@Pc(69) int local69 = this.anIntArray536[local19];
			@Pc(80) boolean local80 = (local19 & 0x1) == 0;
			@Pc(87) int local87 = this.anIntArray536[local19 - 1];
			if (local87 + this.anInt4948 < local26 && local26 < local69 - this.anInt4948) {
				for (@Pc(107) int local107 = 0; local107 < Static2.anInt1626; local107++) {
					@Pc(123) int local123 = local80 ? this.anInt4942 : -this.anInt4942;
					@Pc(135) int local135 = Static4.anIntArray231[local107] + (local123 * this.anInt4949 >> 12);
					@Pc(137) int local137 = 0;
					while (local135 < 0) {
						local135 += 4096;
					}
					while (local135 > 4096) {
						local135 -= 4096;
					}
					while (local137 < this.anInt4943 && local135 >= this.anIntArrayArray41[local64][local137]) {
						local137++;
					}
					@Pc(175) int local175 = this.anIntArrayArray41[local64][local137];
					@Pc(179) int local179 = local137 - 1;
					@Pc(186) int local186 = this.anIntArrayArray41[local64][local179];
					if (local186 + this.anInt4948 < local135 && local175 - this.anInt4948 > local135) {
						local13[local107] = this.anIntArrayArray42[local64][local179];
					} else {
						local13[local107] = 0;
					}
				}
			} else {
				Static8.method75(local13, 0, Static2.anInt1626, 0);
			}
		}
		return local13;
	}
}
