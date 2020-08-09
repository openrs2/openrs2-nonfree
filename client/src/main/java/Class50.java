import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class50 {

	@OriginalMember(owner = "client!em", name = "b", descriptor = "I")
	public final int anInt1318;

	@OriginalMember(owner = "client!em", name = "d", descriptor = "Z")
	public final boolean aBoolean78;

	@OriginalMember(owner = "client!em", name = "e", descriptor = "[S")
	public final short[] aShortArray28;

	@OriginalMember(owner = "client!em", name = "f", descriptor = "I")
	public int anInt1320;

	@OriginalMember(owner = "client!em", name = "g", descriptor = "I")
	public final int anInt1321;

	@OriginalMember(owner = "client!em", name = "h", descriptor = "I")
	public int anInt1322;

	@OriginalMember(owner = "client!em", name = "i", descriptor = "I")
	public final int anInt1323;

	@OriginalMember(owner = "client!em", name = "k", descriptor = "I")
	private int anInt1324;

	@OriginalMember(owner = "client!em", name = "m", descriptor = "Lclient!pi;")
	public Class135 aClass135_1;

	@OriginalMember(owner = "client!em", name = "o", descriptor = "Z")
	public final boolean aBoolean79;

	@OriginalMember(owner = "client!em", name = "q", descriptor = "I")
	public int anInt1326;

	@OriginalMember(owner = "client!em", name = "t", descriptor = "I")
	private int anInt1328;

	@OriginalMember(owner = "client!em", name = "u", descriptor = "F")
	public float aFloat32;

	@OriginalMember(owner = "client!em", name = "v", descriptor = "I")
	private int anInt1329;

	@OriginalMember(owner = "client!em", name = "x", descriptor = "I")
	private int anInt1331;

	@OriginalMember(owner = "client!em", name = "y", descriptor = "I")
	private final int anInt1332;

	@OriginalMember(owner = "client!em", name = "D", descriptor = "F")
	public float aFloat33;

	@OriginalMember(owner = "client!em", name = "G", descriptor = "I")
	public int anInt1338;

	@OriginalMember(owner = "client!em", name = "j", descriptor = "[F")
	public final float[] aFloatArray16 = new float[4];

	@OriginalMember(owner = "client!em", name = "s", descriptor = "Z")
	public boolean aBoolean80 = false;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!fd;)V")
	public Class50(@OriginalArg(0) Buffer arg0) {
		if (Static2.anIntArray97 == null) {
			Static35.method4363();
		}
		this.anInt1326 = arg0.readUnsignedByte();
		this.aBoolean78 = (this.anInt1326 & 0x10) != 0;
		this.aBoolean79 = (this.anInt1326 & 0x8) != 0;
		this.anInt1326 &= 7;
		this.anInt1338 = arg0.readUnsignedShort();
		this.anInt1320 = arg0.readUnsignedShort();
		this.anInt1322 = arg0.readUnsignedShort();
		this.anInt1318 = arg0.readUnsignedByte();
		this.method1075();
		this.aShortArray28 = new short[this.anInt1318 * 2 + 1];
		for (@Pc(81) int local81 = 0; local81 < this.aShortArray28.length; local81++) {
			this.aShortArray28[local81] = (short) arg0.readUnsignedShort();
		}
		this.anInt1321 = Static4.anIntArray295[arg0.readUnsignedShort()];
		@Pc(108) int local108 = arg0.readUnsignedByte();
		this.anInt1323 = local108 & 0x1F;
		this.anInt1332 = (local108 & 0xE0) << 3;
		if (this.anInt1323 != 31) {
			this.method1074();
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIII)V")
	public final void method1073(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt1324 = arg2;
		this.anInt1328 = arg3;
		this.anInt1329 = arg1;
		this.anInt1331 = arg0;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V")
	private void method1074() {
		@Pc(11) int local11 = this.anInt1323;
		if (local11 == 2) {
			this.anInt1324 = 1;
			this.anInt1329 = 0;
			this.anInt1331 = 2048;
			this.anInt1328 = 2048;
		} else if (local11 == 3) {
			this.anInt1324 = 1;
			this.anInt1331 = 2048;
			this.anInt1329 = 0;
			this.anInt1328 = 4096;
		} else if (local11 == 4) {
			this.anInt1331 = 2048;
			this.anInt1329 = 0;
			this.anInt1324 = 4;
			this.anInt1328 = 2048;
		} else if (local11 == 5) {
			this.anInt1324 = 4;
			this.anInt1328 = 8192;
			this.anInt1329 = 0;
			this.anInt1331 = 2048;
		} else if (local11 == 12) {
			this.anInt1331 = 2048;
			this.anInt1329 = 0;
			this.anInt1328 = 2048;
			this.anInt1324 = 2;
		} else if (local11 == 13) {
			this.anInt1324 = 2;
			this.anInt1331 = 2048;
			this.anInt1329 = 0;
			this.anInt1328 = 8192;
		} else if (local11 == 10) {
			this.anInt1329 = 1536;
			this.anInt1328 = 2048;
			this.anInt1331 = 512;
			this.anInt1324 = 3;
		} else if (local11 == 11) {
			this.anInt1329 = 1536;
			this.anInt1328 = 4096;
			this.anInt1324 = 3;
			this.anInt1331 = 512;
		} else if (local11 == 6) {
			this.anInt1329 = 1280;
			this.anInt1331 = 768;
			this.anInt1328 = 2048;
			this.anInt1324 = 3;
		} else if (local11 == 7) {
			this.anInt1328 = 4096;
			this.anInt1329 = 1280;
			this.anInt1324 = 3;
			this.anInt1331 = 768;
		} else if (local11 == 8) {
			this.anInt1329 = 1024;
			this.anInt1324 = 3;
			this.anInt1331 = 1024;
			this.anInt1328 = 2048;
		} else if (local11 == 9) {
			this.anInt1324 = 3;
			this.anInt1331 = 1024;
			this.anInt1329 = 1024;
			this.anInt1328 = 4096;
		} else if (local11 == 14) {
			this.anInt1329 = 1280;
			this.anInt1324 = 1;
			this.anInt1331 = 768;
			this.anInt1328 = 2048;
		} else if (local11 == 15) {
			this.anInt1329 = 1536;
			this.anInt1331 = 512;
			this.anInt1324 = 1;
			this.anInt1328 = 4096;
		} else if (local11 == 16) {
			this.anInt1329 = 1792;
			this.anInt1328 = 8192;
			this.anInt1331 = 256;
			this.anInt1324 = 1;
		} else {
			this.anInt1331 = 2048;
			this.anInt1329 = 0;
			this.anInt1328 = 2048;
			this.anInt1324 = 0;
		}
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V")
	private void method1075() {
		@Pc(14) int local14 = (this.anInt1318 << 7) + 64;
		this.aFloat32 = 1.0F / (float) (local14 * local14);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZZI)V")
	public final void method1076(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(22) int local22 = this.anInt1332 + this.anInt1328 * arg1 / 50 & 0x7FF;
		@Pc(25) int local25 = this.anInt1324;
		@Pc(56) int local56;
		if (local25 == 1) {
			local56 = (Class109.anIntArray299[local22] >> 6) + 1024;
		} else if (local25 == 3) {
			local56 = Static2.anIntArray97[local22] >> 1;
		} else if (local25 == 4) {
			local56 = local22 >> 10 << 11;
		} else if (local25 == 2) {
			local56 = local22;
		} else if (local25 == 5) {
			local56 = (local22 < 1024 ? local22 : 2048 - local22) << 1;
		} else {
			local56 = 2048;
		}
		if (arg0) {
			local56 = 2048;
		}
		this.aFloat33 = (float) ((local56 * this.anInt1331 >> 11) + this.anInt1329) / 2048.0F;
		@Pc(120) float local120 = this.aFloat33 / 255.0F;
		this.aFloatArray16[2] = local120 * (float) (this.anInt1321 & 0xFF);
		this.aFloatArray16[0] = (float) (this.anInt1321 >> 16 & 0xFF) * local120;
		this.aFloatArray16[1] = (float) (this.anInt1321 >> 8 & 0xFF) * local120;
	}
}
