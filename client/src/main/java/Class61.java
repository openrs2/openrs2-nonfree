import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class61 {

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "[I")
	public int[] anIntArray152;

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "[I")
	public int[] anIntArray153;

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "I")
	public int anInt1971;

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
	public int anInt1972;

	@OriginalMember(owner = "client!fo", name = "i", descriptor = "Lclient!gf;")
	public IntHashTable aClass66_1;

	@OriginalMember(owner = "client!fo", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!fo", name = "l", descriptor = "[I")
	public int[] anIntArray154;

	@OriginalMember(owner = "client!fo", name = "q", descriptor = "[Lclient!gf;")
	public IntHashTable[] aClass66Array1;

	@OriginalMember(owner = "client!fo", name = "s", descriptor = "[I")
	public int[] anIntArray155;

	@OriginalMember(owner = "client!fo", name = "u", descriptor = "[I")
	public int[] anIntArray156;

	@OriginalMember(owner = "client!fo", name = "v", descriptor = "[I")
	public int[] anIntArray157;

	@OriginalMember(owner = "client!fo", name = "w", descriptor = "I")
	public int anInt1979;

	@OriginalMember(owner = "client!fo", name = "t", descriptor = "I")
	public final int anInt1978;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "([BI)V")
	public Class61(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1978 = Static12.method2321(arg0.length, arg0);
		if (this.anInt1978 != arg1) {
			throw new RuntimeException();
		}
		this.method1503(arg0);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "([BI)V")
	private void method1503(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Buffer local8 = new Buffer(Static19.method1749(arg0));
		@Pc(12) int local12 = local8.readUnsignedByte();
		if (local12 != 5 && local12 != 6) {
			throw new RuntimeException();
		}
		if (local12 >= 6) {
			this.anInt1971 = local8.readInt();
		} else {
			this.anInt1971 = 0;
		}
		@Pc(44) int local44 = 0;
		@Pc(48) int local48 = local8.readUnsignedByte();
		this.anInt1972 = local8.readUnsignedShort();
		@Pc(55) int local55 = -1;
		this.anIntArray156 = new int[this.anInt1972];
		for (@Pc(62) int local62 = 0; local62 < this.anInt1972; local62++) {
			this.anIntArray156[local62] = local44 += local8.readUnsignedShort();
			if (local55 < this.anIntArray156[local62]) {
				local55 = this.anIntArray156[local62];
			}
		}
		this.anInt1979 = local55 + 1;
		this.anIntArray154 = new int[this.anInt1979];
		this.anIntArray153 = new int[this.anInt1979];
		this.anIntArrayArray14 = new int[this.anInt1979][];
		this.anIntArray152 = new int[this.anInt1979];
		this.anIntArray157 = new int[this.anInt1979];
		if (local48 != 0) {
			this.anIntArray155 = new int[this.anInt1979];
			for (@Pc(137) int local137 = 0; local137 < this.anInt1979; local137++) {
				this.anIntArray155[local137] = -1;
			}
			for (@Pc(151) int local151 = 0; local151 < this.anInt1972; local151++) {
				this.anIntArray155[this.anIntArray156[local151]] = local8.readInt();
			}
			this.aClass66_1 = new IntHashTable(this.anIntArray155);
		}
		for (@Pc(181) int local181 = 0; local181 < this.anInt1972; local181++) {
			this.anIntArray153[this.anIntArray156[local181]] = local8.readInt();
		}
		for (@Pc(204) int local204 = 0; local204 < this.anInt1972; local204++) {
			this.anIntArray157[this.anIntArray156[local204]] = local8.readInt();
		}
		for (@Pc(223) int local223 = 0; local223 < this.anInt1972; local223++) {
			this.anIntArray154[this.anIntArray156[local223]] = local8.readUnsignedShort();
		}
		for (@Pc(242) int local242 = 0; local242 < this.anInt1972; local242++) {
			@Pc(258) int local258 = 0;
			@Pc(260) int local260 = -1;
			@Pc(265) int local265 = this.anIntArray156[local242];
			@Pc(270) int local270 = this.anIntArray154[local265];
			this.anIntArrayArray14[local265] = new int[local270];
			for (@Pc(278) int local278 = 0; local278 < local270; local278++) {
				@Pc(300) int local300 = this.anIntArrayArray14[local265][local278] = local258 += local8.readUnsignedShort();
				if (local300 > local260) {
					local260 = local300;
				}
			}
			this.anIntArray152[local265] = local260 + 1;
			if (local260 + 1 == local270) {
				this.anIntArrayArray14[local265] = null;
			}
		}
		if (local48 == 0) {
			return;
		}
		this.anIntArrayArray15 = new int[local55 + 1][];
		this.aClass66Array1 = new IntHashTable[local55 + 1];
		for (@Pc(353) int local353 = 0; local353 < this.anInt1972; local353++) {
			@Pc(366) int local366 = this.anIntArray156[local353];
			@Pc(371) int local371 = this.anIntArray154[local366];
			this.anIntArrayArray15[local366] = new int[this.anIntArray152[local366]];
			for (@Pc(382) int local382 = 0; local382 < this.anIntArray152[local366]; local382++) {
				this.anIntArrayArray15[local366][local382] = -1;
			}
			for (@Pc(404) int local404 = 0; local404 < local371; local404++) {
				@Pc(420) int local420;
				if (this.anIntArrayArray14[local366] == null) {
					local420 = local404;
				} else {
					local420 = this.anIntArrayArray14[local366][local404];
				}
				this.anIntArrayArray15[local366][local420] = local8.readInt();
			}
			this.aClass66Array1[local366] = new IntHashTable(this.anIntArrayArray15[local366]);
		}
	}
}
