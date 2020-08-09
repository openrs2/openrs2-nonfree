import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class140 {

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "[S")
	private short[] aShortArray75;

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "[S")
	private short[] aShortArray76;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "[S")
	private short[] aShortArray77;

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "[S")
	private short[] aShortArray78;

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "[I")
	private int[] anIntArray449;

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "Z")
	public boolean aBoolean298 = false;

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "[I")
	private final int[] anIntArray450 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "I")
	public int anInt4231 = -1;

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)Lclient!ml;")
	public final Class53_Sub3 method3489() {
		@Pc(8) Class53_Sub3[] local8 = new Class53_Sub3[5];
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			if (this.anIntArray450[local17] != -1) {
				local8[local10++] = Static25.method2752(Static3.aClass58_48, this.anIntArray450[local17]);
			}
		}
		@Pc(51) Class53_Sub3 local51 = new Class53_Sub3(local8, local10);
		if (this.aShortArray75 != null) {
			for (@Pc(58) int local58 = 0; local58 < this.aShortArray75.length; local58++) {
				local51.method2768(this.aShortArray75[local58], this.aShortArray76[local58]);
			}
		}
		if (this.aShortArray77 != null) {
			for (@Pc(81) int local81 = 0; local81 < this.aShortArray77.length; local81++) {
				local51.method2753(this.aShortArray77[local81], this.aShortArray78[local81]);
			}
		}
		return local51;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)Lclient!ml;")
	public final Class53_Sub3 method3490() {
		if (this.anIntArray449 == null) {
			return null;
		}
		@Pc(16) Class53_Sub3[] local16 = new Class53_Sub3[this.anIntArray449.length];
		for (@Pc(27) int local27 = 0; local27 < this.anIntArray449.length; local27++) {
			local16[local27] = Static25.method2752(Static3.aClass58_48, this.anIntArray449[local27]);
		}
		@Pc(60) Class53_Sub3 local60;
		if (local16.length == 1) {
			local60 = local16[0];
		} else {
			local60 = new Class53_Sub3(local16, local16.length);
		}
		if (this.aShortArray75 != null) {
			for (@Pc(72) int local72 = 0; local72 < this.aShortArray75.length; local72++) {
				local60.method2768(this.aShortArray75[local72], this.aShortArray76[local72]);
			}
		}
		if (this.aShortArray77 != null) {
			for (@Pc(96) int local96 = 0; local96 < this.aShortArray77.length; local96++) {
				local60.method2753(this.aShortArray77[local96], this.aShortArray78[local96]);
			}
		}
		return local60;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!fd;Z)V")
	private void method3491(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 1) {
			this.anInt4231 = arg1.readUnsignedByte();
		} else if (arg0 == 2) {
			@Pc(22) int local22 = arg1.readUnsignedByte();
			this.anIntArray449 = new int[local22];
			for (@Pc(28) int local28 = 0; local28 < local22; local28++) {
				this.anIntArray449[local28] = arg1.readUnsignedShort();
			}
		} else if (arg0 == 3) {
			this.aBoolean298 = true;
		} else if (arg0 == 40) {
			@Pc(55) int local55 = arg1.readUnsignedByte();
			this.aShortArray76 = new short[local55];
			this.aShortArray75 = new short[local55];
			for (@Pc(65) int local65 = 0; local65 < local55; local65++) {
				this.aShortArray75[local65] = (short) arg1.readUnsignedShort();
				this.aShortArray76[local65] = (short) arg1.readUnsignedShort();
			}
		} else if (arg0 == 41) {
			@Pc(124) int local124 = arg1.readUnsignedByte();
			this.aShortArray78 = new short[local124];
			this.aShortArray77 = new short[local124];
			for (@Pc(134) int local134 = 0; local134 < local124; local134++) {
				this.aShortArray77[local134] = (short) arg1.readUnsignedShort();
				this.aShortArray78[local134] = (short) arg1.readUnsignedShort();
			}
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray450[arg0 - 60] = arg1.readUnsignedShort();
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)Z")
	public final boolean method3494() {
		if (this.anIntArray449 == null) {
			return true;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray449.length; local22++) {
			if (!Static3.aClass58_48.method1370(this.anIntArray449[local22], 0)) {
				local13 = false;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZLclient!fd;)V")
	public final void method3496(@OriginalArg(1) Buffer arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.readUnsignedByte();
			if (local5 == 0) {
				return;
			}
			this.method3491(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)Z")
	public final boolean method3497() {
		@Pc(16) boolean local16 = true;
		for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
			if (this.anIntArray450[local18] != -1 && !Static3.aClass58_48.method1370(this.anIntArray450[local18], 0)) {
				local16 = false;
			}
		}
		return local16;
	}
}
