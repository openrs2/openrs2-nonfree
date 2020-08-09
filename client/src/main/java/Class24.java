import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public class Class24 implements Interface3 {

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "Lclient!dj;")
	private final Class40 aClass40_2 = new Class40(256);

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "Lclient!fh;")
	private final Class58 aClass58_13;

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "Lclient!fh;")
	private final Class58 aClass58_14;

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "[Lclient!mi;")
	private final Class119[] aClass119Array2;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lclient!fh;Lclient!fh;Lclient!fh;)V")
	protected Class24(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) Class58 arg2) {
		this.aClass58_13 = arg1;
		this.aClass58_14 = arg2;
		@Pc(24) Buffer local24 = new Buffer(arg0.method1372(0, 0));
		@Pc(28) int local28 = local24.readUnsignedShort();
		this.aClass119Array2 = new Class119[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.readUnsignedByte() == 1) {
				this.aClass119Array2[local34] = new Class119();
			}
		}
		for (@Pc(60) int local60 = 0; local60 < local28; local60++) {
			if (this.aClass119Array2[local60] != null) {
				this.aClass119Array2[local60].aBoolean237 = local24.readUnsignedByte() == 0;
			}
		}
		for (@Pc(88) int local88 = 0; local88 < local28; local88++) {
			if (this.aClass119Array2[local88] != null) {
				this.aClass119Array2[local88].aBoolean235 = local24.readUnsignedByte() == 1;
			}
		}
		for (@Pc(117) int local117 = 0; local117 < local28; local117++) {
			if (this.aClass119Array2[local117] != null) {
				this.aClass119Array2[local117].aBoolean234 = local24.readUnsignedByte() == 1;
			}
		}
		for (@Pc(149) int local149 = 0; local149 < local28; local149++) {
			if (this.aClass119Array2[local149] != null) {
				this.aClass119Array2[local149].aBoolean233 = local24.readUnsignedByte() == 1;
			}
		}
		for (@Pc(180) int local180 = 0; local180 < local28; local180++) {
			if (this.aClass119Array2[local180] != null) {
				this.aClass119Array2[local180].aByte10 = local24.readByte();
			}
		}
		for (@Pc(206) int local206 = 0; local206 < local28; local206++) {
			if (this.aClass119Array2[local206] != null) {
				this.aClass119Array2[local206].aByte7 = local24.readByte();
			}
		}
		for (@Pc(232) int local232 = 0; local232 < local28; local232++) {
			if (this.aClass119Array2[local232] != null) {
				this.aClass119Array2[local232].aByte8 = local24.readByte();
			}
		}
		for (@Pc(254) int local254 = 0; local254 < local28; local254++) {
			if (this.aClass119Array2[local254] != null) {
				this.aClass119Array2[local254].aByte9 = local24.readByte();
			}
		}
		for (@Pc(277) int local277 = 0; local277 < local28; local277++) {
			if (this.aClass119Array2[local277] != null) {
				this.aClass119Array2[local277].aShort26 = (short) local24.readUnsignedShort();
			}
		}
		if (local24.position < local24.bytes.length) {
			for (@Pc(315) int local315 = 0; local315 < local28; local315++) {
				if (this.aClass119Array2[local315] != null) {
					local24.readByte();
				}
			}
			for (@Pc(337) int local337 = 0; local337 < local28; local337++) {
				if (this.aClass119Array2[local337] != null) {
					local24.readByte();
				}
			}
			for (@Pc(355) int local355 = 0; local355 < local28; local355++) {
				if (this.aClass119Array2[local355] != null) {
					local24.readUnsignedByte();
				}
			}
			for (@Pc(377) int local377 = 0; local377 < local28; local377++) {
				if (this.aClass119Array2[local377] != null) {
					this.aClass119Array2[local377].aBoolean236 = local24.readUnsignedByte() == 1;
				}
			}
			for (@Pc(406) int local406 = 0; local406 < local28; local406++) {
				if (this.aClass119Array2[local406] != null) {
					local24.readByte();
				}
			}
			for (@Pc(424) int local424 = 0; local424 < local28; local424++) {
				if (this.aClass119Array2[local424] != null) {
					local24.readUnsignedByte();
				}
			}
			for (@Pc(445) int local445 = 0; local445 < local28; local445++) {
				if (this.aClass119Array2[local445] != null) {
					local24.readUnsignedByte();
				}
			}
			for (@Pc(467) int local467 = 0; local467 < local28; local467++) {
				if (this.aClass119Array2[local467] != null) {
					local24.readUnsignedByte();
				}
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IFIIIZ)[I")
	@Override
	public final int[] method415(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return this.method421(arg2).method2653((double) arg1, this.aClass119Array2[arg2].aBoolean236, this.aClass58_14, this, arg0, false, arg3);
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(IZ)Lclient!ln;")
	protected Class4_Sub3_Sub15 method421(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub3 local10 = this.aClass40_2.method889((long) arg0);
		if (local10 != null) {
			return (Class4_Sub3_Sub15) local10;
		}
		@Pc(21) byte[] local21 = this.aClass58_13.method1343(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(34) Class4_Sub3_Sub15 local34 = new Class4_Sub3_Sub15(new Buffer(local21));
			this.aClass40_2.method888((long) arg0, local34);
			return local34;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Z")
	@Override
	public final boolean method416(@OriginalArg(0) int arg0) {
		@Pc(11) Class4_Sub3_Sub15 local11 = this.method421(arg0);
		return local11 != null && local11.method2649(this, this.aClass58_14);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IB)Lclient!mi;")
	@Override
	public final Class119 method417(@OriginalArg(0) int arg0) {
		return this.aClass119Array2[arg0];
	}
}
