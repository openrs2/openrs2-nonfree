import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class RawModel extends Entity {

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!fh;II)Lclient!ml;")
	public static RawModel create(@OriginalArg(0) Js5 archive, @OriginalArg(1) int id) {
		@Pc(5) byte[] bytes = archive.fetchFile(id, 0);
		return bytes == null ? null : new RawModel(bytes);
	}

	@OriginalMember(owner = "client!ml", name = "m", descriptor = "[S")
	public short[] aShortArray51;

	@OriginalMember(owner = "client!ml", name = "n", descriptor = "[B")
	public byte[] aByteArray31;

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "[S")
	public short[] aShortArray52;

	@OriginalMember(owner = "client!ml", name = "q", descriptor = "S")
	private short aShort27;

	@OriginalMember(owner = "client!ml", name = "r", descriptor = "I")
	public int anInt3352;

	@OriginalMember(owner = "client!ml", name = "t", descriptor = "[S")
	public short[] aShortArray53;

	@OriginalMember(owner = "client!ml", name = "v", descriptor = "[B")
	public byte[] aByteArray32;

	@OriginalMember(owner = "client!ml", name = "w", descriptor = "[I")
	public int[] anIntArray323;

	@OriginalMember(owner = "client!ml", name = "x", descriptor = "[I")
	public int[] anIntArray324;

	@OriginalMember(owner = "client!ml", name = "z", descriptor = "[[I")
	public int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!ml", name = "A", descriptor = "[B")
	public byte[] aByteArray33;

	@OriginalMember(owner = "client!ml", name = "B", descriptor = "S")
	private short aShort28;

	@OriginalMember(owner = "client!ml", name = "C", descriptor = "S")
	public short aShort29;

	@OriginalMember(owner = "client!ml", name = "D", descriptor = "[S")
	public short[] aShortArray54;

	@OriginalMember(owner = "client!ml", name = "E", descriptor = "S")
	private short aShort30;

	@OriginalMember(owner = "client!ml", name = "G", descriptor = "[B")
	public byte[] aByteArray34;

	@OriginalMember(owner = "client!ml", name = "H", descriptor = "[Lclient!sk;")
	public ModelParticleEmitter[] particleEmitters;

	@OriginalMember(owner = "client!ml", name = "I", descriptor = "[I")
	public int[] anIntArray325;

	@OriginalMember(owner = "client!ml", name = "J", descriptor = "[S")
	public short[] aShortArray55;

	@OriginalMember(owner = "client!ml", name = "K", descriptor = "S")
	private short aShort31;

	@OriginalMember(owner = "client!ml", name = "L", descriptor = "[S")
	public short[] aShortArray56;

	@OriginalMember(owner = "client!ml", name = "M", descriptor = "[B")
	public byte[] aByteArray35;

	@OriginalMember(owner = "client!ml", name = "N", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!ml", name = "O", descriptor = "[Lclient!ci;")
	public Class31[] aClass31Array1;

	@OriginalMember(owner = "client!ml", name = "P", descriptor = "[B")
	public byte[] aByteArray37;

	@OriginalMember(owner = "client!ml", name = "Q", descriptor = "[Lclient!mj;")
	public Class120[] aClass120Array1;

	@OriginalMember(owner = "client!ml", name = "R", descriptor = "[I")
	public int[] anIntArray326;

	@OriginalMember(owner = "client!ml", name = "U", descriptor = "[[I")
	public int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!ml", name = "V", descriptor = "[B")
	public byte[] aByteArray38;

	@OriginalMember(owner = "client!ml", name = "X", descriptor = "[Lclient!u;")
	public ModelParticleEffector[] particleEffectors;

	@OriginalMember(owner = "client!ml", name = "Y", descriptor = "[B")
	public byte[] aByteArray39;

	@OriginalMember(owner = "client!ml", name = "Z", descriptor = "S")
	private short aShort32;

	@OriginalMember(owner = "client!ml", name = "ab", descriptor = "[I")
	public int[] anIntArray329;

	@OriginalMember(owner = "client!ml", name = "bb", descriptor = "[I")
	public int[] anIntArray330;

	@OriginalMember(owner = "client!ml", name = "cb", descriptor = "[S")
	public short[] aShortArray57;

	@OriginalMember(owner = "client!ml", name = "db", descriptor = "[Lclient!ci;")
	public Class31[] aClass31Array2;

	@OriginalMember(owner = "client!ml", name = "eb", descriptor = "S")
	public short aShort33;

	@OriginalMember(owner = "client!ml", name = "fb", descriptor = "[B")
	public byte[] aByteArray40;

	@OriginalMember(owner = "client!ml", name = "hb", descriptor = "[I")
	public int[] anIntArray331;

	@OriginalMember(owner = "client!ml", name = "ib", descriptor = "[I")
	public int[] anIntArray332;

	@OriginalMember(owner = "client!ml", name = "kb", descriptor = "[S")
	public short[] aShortArray58;

	@OriginalMember(owner = "client!ml", name = "lb", descriptor = "[S")
	public short[] aShortArray59;

	@OriginalMember(owner = "client!ml", name = "mb", descriptor = "S")
	private short aShort34;

	@OriginalMember(owner = "client!ml", name = "nb", descriptor = "[S")
	public short[] aShortArray60;

	@OriginalMember(owner = "client!ml", name = "s", descriptor = "I")
	public int anInt3353 = 0;

	@OriginalMember(owner = "client!ml", name = "F", descriptor = "Z")
	private boolean aBoolean238 = false;

	@OriginalMember(owner = "client!ml", name = "gb", descriptor = "I")
	public int anInt3356 = 0;

	@OriginalMember(owner = "client!ml", name = "jb", descriptor = "B")
	public byte aByte11 = 0;

	@OriginalMember(owner = "client!ml", name = "W", descriptor = "I")
	public int anInt3355 = 0;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V")
	private RawModel() {
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "([B)V")
	public RawModel(@OriginalArg(0) byte[] bytes) {
		if (bytes[bytes.length - 1] == -1 && bytes[bytes.length - 2] == -1) {
			this.decodeNew(bytes);
		} else {
			this.decodeOld(bytes);
		}
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(III)V")
	public RawModel(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray329 = new int[arg0];
		this.anIntArray324 = new int[arg0];
		this.anIntArray326 = new int[arg0];
		this.anIntArray323 = new int[arg0];
		this.anIntArray331 = new int[arg1];
		this.anIntArray330 = new int[arg1];
		this.anIntArray332 = new int[arg1];
		this.aByteArray40 = new byte[arg1];
		this.aByteArray37 = new byte[arg1];
		this.aByteArray33 = new byte[arg1];
		this.aShortArray53 = new short[arg1];
		this.aShortArray51 = new short[arg1];
		this.aByteArray35 = new byte[arg1];
		this.anIntArray325 = new int[arg1];
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "([Lclient!ml;I)V")
	public RawModel(@OriginalArg(0) RawModel[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		this.anInt3356 = 0;
		this.anInt3353 = 0;
		this.anInt3352 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		this.aByte11 = -1;
		for (@Pc(46) int local46 = 0; local46 < arg1; local46++) {
			@Pc(53) RawModel local53 = arg0[local46];
			if (local53 != null) {
				this.anInt3356 += local53.anInt3356;
				this.anInt3353 += local53.anInt3353;
				this.anInt3352 += local53.anInt3352;
				if (local53.aByteArray37 == null) {
					if (this.aByte11 == -1) {
						this.aByte11 = local53.aByte11;
					}
					if (this.aByte11 != local53.aByte11) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local18 |= local53.aByteArray40 != null;
				local22 |= local53.aByteArray33 != null;
				local24 |= local53.anIntArray325 != null;
				local26 |= local53.aShortArray51 != null;
				local28 |= local53.aByteArray35 != null;
				if (local53.particleEmitters != null) {
					local39 += local53.particleEmitters.length;
				}
				if (local53.particleEffectors != null) {
					local41 += local53.particleEffectors.length;
				}
			}
		}
		this.anIntArray329 = new int[this.anInt3356];
		this.anIntArray324 = new int[this.anInt3356];
		this.anIntArray326 = new int[this.anInt3356];
		this.anIntArray323 = new int[this.anInt3356];
		this.aShortArray52 = new short[this.anInt3356];
		this.anIntArray331 = new int[this.anInt3353];
		this.anIntArray330 = new int[this.anInt3353];
		this.anIntArray332 = new int[this.anInt3353];
		if (local18) {
			this.aByteArray40 = new byte[this.anInt3353];
		}
		if (local20) {
			this.aByteArray37 = new byte[this.anInt3353];
		}
		if (local22) {
			this.aByteArray33 = new byte[this.anInt3353];
		}
		if (local24) {
			this.anIntArray325 = new int[this.anInt3353];
		}
		if (local26) {
			this.aShortArray51 = new short[this.anInt3353];
		}
		if (local28) {
			this.aByteArray35 = new byte[this.anInt3353];
		}
		if (local39 > 0) {
			this.particleEmitters = new ModelParticleEmitter[local39];
		}
		if (local41 > 0) {
			this.particleEffectors = new ModelParticleEffector[local41];
		}
		this.aShortArray53 = new short[this.anInt3353];
		this.aShortArray54 = new short[this.anInt3353];
		if (this.anInt3352 > 0) {
			this.aByteArray38 = new byte[this.anInt3352];
			this.aShortArray59 = new short[this.anInt3352];
			this.aShortArray56 = new short[this.anInt3352];
			this.aShortArray57 = new short[this.anInt3352];
			this.aShortArray60 = new short[this.anInt3352];
			this.aShortArray55 = new short[this.anInt3352];
			this.aShortArray58 = new short[this.anInt3352];
			this.aByteArray36 = new byte[this.anInt3352];
			this.aByteArray39 = new byte[this.anInt3352];
			this.aByteArray34 = new byte[this.anInt3352];
			this.aByteArray32 = new byte[this.anInt3352];
			this.aByteArray31 = new byte[this.anInt3352];
		}
		this.anInt3356 = 0;
		this.anInt3353 = 0;
		this.anInt3352 = 0;
		@Pc(340) int local340 = 0;
		@Pc(342) int local342 = 0;
		for (@Pc(344) int local344 = 0; local344 < arg1; local344++) {
			@Pc(352) short local352 = (short) (0x1 << local344);
			@Pc(356) RawModel local356 = arg0[local344];
			if (local356 != null) {
				for (@Pc(360) int local360 = 0; local360 < local356.anInt3353; local360++) {
					if (local18 && local356.aByteArray40 != null) {
						this.aByteArray40[this.anInt3353] = local356.aByteArray40[local360];
					}
					if (local20) {
						if (local356.aByteArray37 == null) {
							this.aByteArray37[this.anInt3353] = local356.aByte11;
						} else {
							this.aByteArray37[this.anInt3353] = local356.aByteArray37[local360];
						}
					}
					if (local22 && local356.aByteArray33 != null) {
						this.aByteArray33[this.anInt3353] = local356.aByteArray33[local360];
					}
					if (local24 && local356.anIntArray325 != null) {
						this.anIntArray325[this.anInt3353] = local356.anIntArray325[local360];
					}
					if (local26) {
						if (local356.aShortArray51 == null) {
							this.aShortArray51[this.anInt3353] = -1;
						} else {
							this.aShortArray51[this.anInt3353] = local356.aShortArray51[local360];
						}
					}
					this.aShortArray53[this.anInt3353] = local356.aShortArray53[local360];
					this.aShortArray54[this.anInt3353] = local352;
					this.anIntArray331[this.anInt3353] = this.method2741(local356, local356.anIntArray331[local360], local352);
					this.anIntArray330[this.anInt3353] = this.method2741(local356, local356.anIntArray330[local360], local352);
					this.anIntArray332[this.anInt3353] = this.method2741(local356, local356.anIntArray332[local360], local352);
					this.anInt3353++;
				}
				if (local356.particleEmitters != null) {
					for (@Pc(516) int local516 = 0; local516 < local356.particleEmitters.length; local516++) {
						@Pc(531) int local531 = this.method2741(local356, local356.particleEmitters[local516].anInt4869, local352);
						@Pc(541) int local541 = this.method2741(local356, local356.particleEmitters[local516].anInt4868, local352);
						@Pc(551) int local551 = this.method2741(local356, local356.particleEmitters[local516].anInt4864, local352);
						this.particleEmitters[local340] = new ModelParticleEmitter(local356.particleEmitters[local516].type, local531, local541, local551);
						local340++;
					}
				}
				if (local356.particleEffectors != null) {
					for (@Pc(574) int local574 = 0; local574 < local356.particleEffectors.length; local574++) {
						@Pc(589) int local589 = this.method2741(local356, local356.particleEffectors[local574].anInt5232, local352);
						this.particleEffectors[local342] = new ModelParticleEffector(local356.particleEffectors[local574].type, local589);
						local342++;
					}
				}
			}
		}
		@Pc(609) int local609 = 0;
		this.anInt3355 = this.anInt3356;
		for (@Pc(615) int local615 = 0; local615 < arg1; local615++) {
			@Pc(622) RawModel local622 = arg0[local615];
			@Pc(627) short local627 = (short) (0x1 << local615);
			if (local622 != null) {
				for (@Pc(631) int local631 = 0; local631 < local622.anInt3353; local631++) {
					if (local28) {
						this.aByteArray35[local609++] = (byte) (local622.aByteArray35 == null || local622.aByteArray35[local631] == -1 ? -1 : local622.aByteArray35[local631] + this.anInt3352);
					}
				}
				for (@Pc(665) int local665 = 0; local665 < local622.anInt3352; local665++) {
					@Pc(680) byte local680 = this.aByteArray38[this.anInt3352] = local622.aByteArray38[local665];
					if (local680 == 0) {
						this.aShortArray59[this.anInt3352] = (short) this.method2741(local622, local622.aShortArray59[local665], local627);
						this.aShortArray56[this.anInt3352] = (short) this.method2741(local622, local622.aShortArray56[local665], local627);
						this.aShortArray57[this.anInt3352] = (short) this.method2741(local622, local622.aShortArray57[local665], local627);
					}
					if (local680 >= 1 && local680 <= 3) {
						this.aShortArray59[this.anInt3352] = local622.aShortArray59[local665];
						this.aShortArray56[this.anInt3352] = local622.aShortArray56[local665];
						this.aShortArray57[this.anInt3352] = local622.aShortArray57[local665];
						this.aShortArray60[this.anInt3352] = local622.aShortArray60[local665];
						this.aShortArray55[this.anInt3352] = local622.aShortArray55[local665];
						this.aShortArray58[this.anInt3352] = local622.aShortArray58[local665];
						this.aByteArray36[this.anInt3352] = local622.aByteArray36[local665];
						this.aByteArray39[this.anInt3352] = local622.aByteArray39[local665];
						this.aByteArray34[this.anInt3352] = local622.aByteArray34[local665];
					}
					if (local680 == 2) {
						this.aByteArray32[this.anInt3352] = local622.aByteArray32[local665];
						this.aByteArray31[this.anInt3352] = local622.aByteArray31[local665];
					}
					this.anInt3352++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!ml;ZZZZ)V")
	public RawModel(@OriginalArg(0) RawModel arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3356 = arg0.anInt3356;
		this.anInt3355 = arg0.anInt3355;
		this.anInt3353 = arg0.anInt3353;
		this.anInt3352 = arg0.anInt3352;
		if (arg1) {
			this.anIntArray329 = arg0.anIntArray329;
			this.anIntArray324 = arg0.anIntArray324;
			this.anIntArray326 = arg0.anIntArray326;
		} else {
			this.anIntArray329 = new int[this.anInt3356];
			this.anIntArray324 = new int[this.anInt3356];
			this.anIntArray326 = new int[this.anInt3356];
			for (@Pc(64) int local64 = 0; local64 < this.anInt3356; local64++) {
				this.anIntArray329[local64] = arg0.anIntArray329[local64];
				this.anIntArray324[local64] = arg0.anIntArray324[local64];
				this.anIntArray326[local64] = arg0.anIntArray326[local64];
			}
		}
		if (arg2) {
			this.aShortArray53 = arg0.aShortArray53;
		} else {
			this.aShortArray53 = new short[this.anInt3353];
			for (@Pc(108) int local108 = 0; local108 < this.anInt3353; local108++) {
				this.aShortArray53[local108] = arg0.aShortArray53[local108];
			}
		}
		if (arg3 || arg0.aShortArray51 == null) {
			this.aShortArray51 = arg0.aShortArray51;
		} else {
			this.aShortArray51 = new short[this.anInt3353];
			for (@Pc(139) int local139 = 0; local139 < this.anInt3353; local139++) {
				this.aShortArray51[local139] = arg0.aShortArray51[local139];
			}
		}
		this.aByteArray33 = arg0.aByteArray33;
		this.anIntArray331 = arg0.anIntArray331;
		this.anIntArray330 = arg0.anIntArray330;
		this.anIntArray332 = arg0.anIntArray332;
		this.aByteArray40 = arg0.aByteArray40;
		this.aByteArray37 = arg0.aByteArray37;
		this.aByteArray35 = arg0.aByteArray35;
		this.aByte11 = arg0.aByte11;
		this.aByteArray38 = arg0.aByteArray38;
		this.aShortArray59 = arg0.aShortArray59;
		this.aShortArray56 = arg0.aShortArray56;
		this.aShortArray57 = arg0.aShortArray57;
		this.aShortArray60 = arg0.aShortArray60;
		this.aShortArray55 = arg0.aShortArray55;
		this.aShortArray58 = arg0.aShortArray58;
		this.aByteArray36 = arg0.aByteArray36;
		this.aByteArray39 = arg0.aByteArray39;
		this.aByteArray34 = arg0.aByteArray34;
		this.aByteArray32 = arg0.aByteArray32;
		this.aByteArray31 = arg0.aByteArray31;
		this.anIntArray323 = arg0.anIntArray323;
		this.anIntArray325 = arg0.anIntArray325;
		this.anIntArrayArray27 = arg0.anIntArrayArray27;
		this.anIntArrayArray26 = arg0.anIntArrayArray26;
		this.aClass31Array1 = arg0.aClass31Array1;
		this.aClass120Array1 = arg0.aClass120Array1;
		this.aClass31Array2 = arg0.aClass31Array2;
		this.aShort33 = arg0.aShort33;
		this.aShort29 = arg0.aShort29;
		this.particleEmitters = arg0.particleEmitters;
		this.particleEffectors = arg0.particleEffectors;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
	public final void method2740() {
		@Pc(3) int local3 = Static4.anIntArray322[256];
		@Pc(7) int local7 = Static4.anIntArray321[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3356; local9++) {
			@Pc(29) int local29 = this.anIntArray326[local9] * local3 + this.anIntArray329[local9] * local7 >> 16;
			this.anIntArray326[local9] = this.anIntArray326[local9] * local7 - this.anIntArray329[local9] * local3 >> 16;
			this.anIntArray329[local9] = local29;
		}
		this.method2757();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!ml;IS)I")
	private int method2741(@OriginalArg(0) RawModel arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		@Pc(4) int local4 = arg0.anIntArray329[arg1];
		@Pc(9) int local9 = arg0.anIntArray324[arg1];
		@Pc(14) int local14 = arg0.anIntArray326[arg1];
		for (@Pc(16) int local16 = 0; local16 < this.anInt3356; local16++) {
			if (local4 == this.anIntArray329[local16] && local9 == this.anIntArray324[local16] && local14 == this.anIntArray326[local16]) {
				@Pc(40) short[] local40 = this.aShortArray52;
				local40[local16] |= arg2;
				return local16;
			}
		}
		this.anIntArray329[this.anInt3356] = local4;
		this.anIntArray324[this.anInt3356] = local9;
		this.anIntArray326[this.anInt3356] = local14;
		this.aShortArray52[this.anInt3356] = arg2;
		if (arg0.anIntArray323 != null) {
			this.anIntArray323[this.anInt3356] = arg0.anIntArray323[arg1];
		}
		return this.anInt3356++;
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "()I")
	@Override
	public final int method3813() {
		if (!this.aBoolean238) {
			this.method2765();
		}
		return this.aShort31;
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "()V")
	public final void method2742() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3356; local1++) {
			@Pc(10) int local10 = this.anIntArray329[local1];
			this.anIntArray329[local1] = this.anIntArray326[local1];
			this.anIntArray326[local1] = -local10;
		}
		this.method2757();
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(III)V")
	public final void method2743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3356; local1++) {
			@Pc(7) int[] local7 = this.anIntArray329;
			local7[local1] += arg0;
			local7 = this.anIntArray324;
			local7[local1] += arg1;
			local7 = this.anIntArray326;
			local7[local1] += arg2;
		}
		this.method2757();
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "()V")
	public final void method2744() {
		if (this.anIntArray323 != null) {
			@Pc(5) int[] local5 = new int[256];
			@Pc(7) int local7 = 0;
			for (@Pc(9) int local9 = 0; local9 < this.anInt3356; local9++) {
				@Pc(18) int local18 = this.anIntArray323[local9];
				@Pc(22) int local22 = local5[local18]++;
				if (local18 > local7) {
					local7 = local18;
				}
			}
			this.anIntArrayArray27 = new int[local7 + 1][];
			for (@Pc(40) int local40 = 0; local40 <= local7; local40++) {
				this.anIntArrayArray27[local40] = new int[local5[local40]];
				local5[local40] = 0;
			}
			@Pc(59) int local59 = 0;
			while (local59 < this.anInt3356) {
				@Pc(68) int local68 = this.anIntArray323[local59];
				this.anIntArrayArray27[local68][local5[local68]++] = local59++;
			}
			this.anIntArray323 = null;
		}
		if (this.anIntArray325 == null) {
			return;
		}
		@Pc(93) int[] local93 = new int[256];
		@Pc(95) int local95 = 0;
		for (@Pc(97) int local97 = 0; local97 < this.anInt3353; local97++) {
			@Pc(106) int local106 = this.anIntArray325[local97];
			@Pc(110) int local110 = local93[local106]++;
			if (local106 > local95) {
				local95 = local106;
			}
		}
		this.anIntArrayArray26 = new int[local95 + 1][];
		for (@Pc(128) int local128 = 0; local128 <= local95; local128++) {
			this.anIntArrayArray26[local128] = new int[local93[local128]];
			local93[local128] = 0;
		}
		@Pc(147) int local147 = 0;
		while (local147 < this.anInt3353) {
			@Pc(156) int local156 = this.anIntArray325[local147];
			this.anIntArrayArray26[local156][local93[local156]++] = local147++;
		}
		this.anIntArray325 = null;
	}

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "()V")
	public final void method2745() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3356; local1++) {
			this.anIntArray329[local1] = -this.anIntArray329[local1];
			this.anIntArray326[local1] = -this.anIntArray326[local1];
		}
		this.method2757();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIIIIJILclient!ne;)V")
	@Override
	public final void method3805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) ParticleSystem arg10) {
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "([[IIIIII)V")
	private void method2746(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(24) int local24 = Static25.method2762(arg0, arg1 + local10, arg3 + local15);
		@Pc(28) int local28 = arg4 / 2;
		@Pc(33) int local33 = -arg5 / 2;
		@Pc(42) int local42 = Static25.method2762(arg0, arg1 + local28, arg3 + local33);
		@Pc(47) int local47 = -arg4 / 2;
		@Pc(51) int local51 = arg5 / 2;
		@Pc(60) int local60 = Static25.method2762(arg0, arg1 + local47, arg3 + local51);
		@Pc(64) int local64 = arg4 / 2;
		@Pc(68) int local68 = arg5 / 2;
		@Pc(77) int local77 = Static25.method2762(arg0, arg1 + local64, arg3 + local68);
		@Pc(84) int local84 = local24 < local42 ? local24 : local42;
		@Pc(91) int local91 = local60 < local77 ? local60 : local77;
		@Pc(98) int local98 = local42 < local77 ? local42 : local77;
		@Pc(105) int local105 = local24 < local60 ? local24 : local60;
		if (arg5 != 0) {
			@Pc(120) int local120 = (int) (Math.atan2((double) (local84 - local91), (double) arg5) * 325.95D) & 0x7FF;
			if (local120 != 0) {
				this.method2758(local120);
			}
		}
		if (arg4 != 0) {
			@Pc(140) int local140 = (int) (Math.atan2((double) (local105 - local98), (double) arg4) * 325.95D) & 0x7FF;
			if (local140 != 0) {
				this.method2769(local140);
			}
		}
		@Pc(149) int local149 = local24 + local77;
		if (local42 + local60 < local149) {
			local149 = local42 + local60;
		}
		@Pc(164) int local164 = (local149 >> 1) - arg2;
		if (local164 != 0) {
			this.method2743(0, local164, 0);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "()Z")
	@Override
	public final boolean method3808() {
		return true;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIII)V")
	@Override
	public final void method3806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "()V")
	public final void method2747() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3356; local1++) {
			@Pc(10) int local10 = this.anIntArray326[local1];
			this.anIntArray326[local1] = this.anIntArray329[local1];
			this.anIntArray329[local1] = -local10;
		}
		this.method2757();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(III)Lclient!vc;")
	@Override
	public final Entity method3809() {
		return this.createModel(this.aShort33, this.aShort29, -50, -10, -50);
	}

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "()V")
	public final void method2748() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3356; local1++) {
			this.anIntArray326[local1] = -this.anIntArray326[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt3353; local18++) {
			@Pc(27) int local27 = this.anIntArray331[local18];
			this.anIntArray331[local18] = this.anIntArray332[local18];
			this.anIntArray332[local18] = local27;
		}
		this.method2757();
	}

	@OriginalMember(owner = "client!ml", name = "h", descriptor = "()Lclient!ml;")
	public final RawModel method2749() {
		@Pc(3) RawModel local3 = new RawModel();
		if (this.aByteArray40 != null) {
			local3.aByteArray40 = new byte[this.anInt3353];
			for (@Pc(13) int local13 = 0; local13 < this.anInt3353; local13++) {
				local3.aByteArray40[local13] = this.aByteArray40[local13];
			}
		}
		local3.anInt3356 = this.anInt3356;
		local3.anInt3355 = this.anInt3355;
		local3.anInt3353 = this.anInt3353;
		local3.anInt3352 = this.anInt3352;
		local3.anIntArray329 = this.anIntArray329;
		local3.anIntArray324 = this.anIntArray324;
		local3.anIntArray326 = this.anIntArray326;
		local3.anIntArray331 = this.anIntArray331;
		local3.anIntArray330 = this.anIntArray330;
		local3.anIntArray332 = this.anIntArray332;
		local3.aByteArray37 = this.aByteArray37;
		local3.aByteArray33 = this.aByteArray33;
		local3.aByteArray35 = this.aByteArray35;
		local3.aShortArray53 = this.aShortArray53;
		local3.aShortArray51 = this.aShortArray51;
		local3.aByte11 = this.aByte11;
		local3.aByteArray38 = this.aByteArray38;
		local3.aShortArray59 = this.aShortArray59;
		local3.aShortArray56 = this.aShortArray56;
		local3.aShortArray57 = this.aShortArray57;
		local3.aShortArray60 = this.aShortArray60;
		local3.aShortArray55 = this.aShortArray55;
		local3.aShortArray58 = this.aShortArray58;
		local3.aByteArray36 = this.aByteArray36;
		local3.aByteArray39 = this.aByteArray39;
		local3.aByteArray34 = this.aByteArray34;
		local3.aByteArray32 = this.aByteArray32;
		local3.aByteArray31 = this.aByteArray31;
		local3.anIntArray323 = this.anIntArray323;
		local3.anIntArray325 = this.anIntArray325;
		local3.anIntArrayArray27 = this.anIntArrayArray27;
		local3.anIntArrayArray26 = this.anIntArrayArray26;
		local3.aClass31Array1 = this.aClass31Array1;
		local3.aClass120Array1 = this.aClass120Array1;
		local3.aShort33 = this.aShort33;
		local3.aShort29 = this.aShort29;
		local3.particleEmitters = this.particleEmitters;
		local3.particleEffectors = this.particleEffectors;
		return local3;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "([B)V")
	private void decodeOld(@OriginalArg(0) byte[] bytes) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Buffer local8 = new Buffer(bytes);
		@Pc(13) Buffer local13 = new Buffer(bytes);
		@Pc(18) Buffer local18 = new Buffer(bytes);
		@Pc(23) Buffer local23 = new Buffer(bytes);
		@Pc(28) Buffer local28 = new Buffer(bytes);
		local8.position = bytes.length - 18;
		@Pc(38) int local38 = local8.readUnsignedShort();
		@Pc(42) int local42 = local8.readUnsignedShort();
		@Pc(46) int local46 = local8.readUnsignedByte();
		@Pc(50) int local50 = local8.readUnsignedByte();
		@Pc(54) int local54 = local8.readUnsignedByte();
		@Pc(58) int local58 = local8.readUnsignedByte();
		@Pc(62) int local62 = local8.readUnsignedByte();
		@Pc(66) int local66 = local8.readUnsignedByte();
		@Pc(70) int local70 = local8.readUnsignedShort();
		@Pc(74) int local74 = local8.readUnsignedShort();
		@Pc(78) int local78 = local8.readUnsignedShort();
		@Pc(82) int local82 = local8.readUnsignedShort();
		@Pc(90) int local90 = local38;
		@Pc(96) int local96 = local90 + local42;
		@Pc(98) int local98 = local96;
		if (local54 == 255) {
			local96 += local42;
		}
		@Pc(107) int local107 = local96;
		if (local62 == 1) {
			local96 += local42;
		}
		@Pc(116) int local116 = local96;
		if (local50 == 1) {
			local96 += local42;
		}
		@Pc(125) int local125 = local96;
		if (local66 == 1) {
			local96 += local38;
		}
		@Pc(134) int local134 = local96;
		if (local58 == 1) {
			local96 += local42;
		}
		@Pc(147) int local147 = local96 + local82;
		@Pc(149) int local149 = local147;
		local147 += local42 * 2;
		@Pc(157) int local157 = local147;
		local147 += local46 * 6;
		@Pc(165) int local165 = local147;
		local147 += local70;
		@Pc(171) int local171 = local147;
		local147 += local74;
		this.anInt3356 = local38;
		this.anInt3353 = local42;
		this.anInt3352 = local46;
		this.anIntArray329 = new int[local38];
		this.anIntArray324 = new int[local38];
		this.anIntArray326 = new int[local38];
		this.anIntArray331 = new int[local42];
		this.anIntArray330 = new int[local42];
		this.anIntArray332 = new int[local42];
		if (local46 > 0) {
			this.aByteArray38 = new byte[local46];
			this.aShortArray59 = new short[local46];
			this.aShortArray56 = new short[local46];
			this.aShortArray57 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray323 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray40 = new byte[local42];
			this.aByteArray35 = new byte[local42];
			this.aShortArray51 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray37 = new byte[local42];
		} else {
			this.aByte11 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray33 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray325 = new int[local42];
		}
		this.aShortArray53 = new short[local42];
		local8.position = 0;
		local13.position = local165;
		local18.position = local171;
		local23.position = local147;
		local28.position = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			@Pc(314) int local314 = local8.readUnsignedByte();
			@Pc(316) int local316 = 0;
			if ((local314 & 0x1) != 0) {
				local316 = local13.readShortSmart();
			}
			@Pc(326) int local326 = 0;
			if ((local314 & 0x2) != 0) {
				local326 = local18.readShortSmart();
			}
			@Pc(336) int local336 = 0;
			if ((local314 & 0x4) != 0) {
				local336 = local23.readShortSmart();
			}
			this.anIntArray329[local307] = local301 + local316;
			this.anIntArray324[local307] = local303 + local326;
			this.anIntArray326[local307] = local305 + local336;
			local301 = this.anIntArray329[local307];
			local303 = this.anIntArray324[local307];
			local305 = this.anIntArray326[local307];
			if (local66 == 1) {
				this.anIntArray323[local307] = local28.readUnsignedByte();
			}
		}
		local8.position = local149;
		local13.position = local116;
		local18.position = local98;
		local23.position = local134;
		local28.position = local107;
		for (@Pc(409) int local409 = 0; local409 < local42; local409++) {
			this.aShortArray53[local409] = (short) local8.readUnsignedShort();
			if (local50 == 1) {
				@Pc(427) int local427 = local13.readUnsignedByte();
				if ((local427 & 0x1) == 1) {
					this.aByteArray40[local409] = 1;
					local1 = true;
				} else {
					this.aByteArray40[local409] = 0;
				}
				if ((local427 & 0x2) == 2) {
					this.aByteArray35[local409] = (byte) (local427 >> 2);
					this.aShortArray51[local409] = this.aShortArray53[local409];
					this.aShortArray53[local409] = 127;
					if (this.aShortArray51[local409] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray35[local409] = -1;
					this.aShortArray51[local409] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray37[local409] = local18.readByte();
			}
			if (local58 == 1) {
				this.aByteArray33[local409] = local23.readByte();
			}
			if (local62 == 1) {
				this.anIntArray325[local409] = local28.readUnsignedByte();
			}
		}
		this.anInt3355 = -1;
		local8.position = local96;
		local13.position = local90;
		@Pc(533) int local533 = 0;
		@Pc(535) int local535 = 0;
		@Pc(537) int local537 = 0;
		@Pc(539) int local539 = 0;
		for (@Pc(541) int local541 = 0; local541 < local42; local541++) {
			@Pc(548) int local548 = local13.readUnsignedByte();
			if (local548 == 1) {
				local533 = local8.readShortSmart() + local539;
				local535 = local8.readShortSmart() + local533;
				local537 = local8.readShortSmart() + local535;
				local539 = local537;
				this.anIntArray331[local541] = local533;
				this.anIntArray330[local541] = local535;
				this.anIntArray332[local541] = local537;
				if (local533 > this.anInt3355) {
					this.anInt3355 = local533;
				}
				if (local535 > this.anInt3355) {
					this.anInt3355 = local535;
				}
				if (local537 > this.anInt3355) {
					this.anInt3355 = local537;
				}
			}
			if (local548 == 2) {
				local535 = local537;
				local537 = local8.readShortSmart() + local539;
				local539 = local537;
				this.anIntArray331[local541] = local533;
				this.anIntArray330[local541] = local535;
				this.anIntArray332[local541] = local537;
				if (local537 > this.anInt3355) {
					this.anInt3355 = local537;
				}
			}
			if (local548 == 3) {
				local533 = local537;
				local537 = local8.readShortSmart() + local539;
				local539 = local537;
				this.anIntArray331[local541] = local533;
				this.anIntArray330[local541] = local535;
				this.anIntArray332[local541] = local537;
				if (local537 > this.anInt3355) {
					this.anInt3355 = local537;
				}
			}
			if (local548 == 4) {
				@Pc(686) int local686 = local533;
				local533 = local535;
				local535 = local686;
				local537 = local8.readShortSmart() + local539;
				local539 = local537;
				this.anIntArray331[local541] = local533;
				this.anIntArray330[local541] = local686;
				this.anIntArray332[local541] = local537;
				if (local537 > this.anInt3355) {
					this.anInt3355 = local537;
				}
			}
		}
		this.anInt3355++;
		local8.position = local157;
		for (@Pc(733) int local733 = 0; local733 < local46; local733++) {
			this.aByteArray38[local733] = 0;
			this.aShortArray59[local733] = (short) local8.readUnsignedShort();
			this.aShortArray56[local733] = (short) local8.readUnsignedShort();
			this.aShortArray57[local733] = (short) local8.readUnsignedShort();
		}
		if (this.aByteArray35 != null) {
			@Pc(772) boolean local772 = false;
			for (@Pc(774) int local774 = 0; local774 < local42; local774++) {
				@Pc(784) int local784 = this.aByteArray35[local774] & 0xFF;
				if (local784 != 255) {
					if ((this.aShortArray59[local784] & 0xFFFF) == this.anIntArray331[local774] && (this.aShortArray56[local784] & 0xFFFF) == this.anIntArray330[local774] && (this.aShortArray57[local784] & 0xFFFF) == this.anIntArray332[local774]) {
						this.aByteArray35[local774] = -1;
					} else {
						local772 = true;
					}
				}
			}
			if (!local772) {
				this.aByteArray35 = null;
			}
		}
		if (!local3) {
			this.aShortArray51 = null;
		}
		if (!local1) {
			this.aByteArray40 = null;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(SS)V")
	public final void method2753(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray51 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt3353; local5++) {
			if (this.aShortArray51[local5] == arg0) {
				this.aShortArray51[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(III)V")
	public final void method2754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 != 0) {
			@Pc(5) int local5 = Static4.anIntArray322[arg2];
			@Pc(9) int local9 = Static4.anIntArray321[arg2];
			for (@Pc(11) int local11 = 0; local11 < this.anInt3356; local11++) {
				@Pc(31) int local31 = this.anIntArray324[local11] * local5 + this.anIntArray329[local11] * local9 >> 16;
				this.anIntArray324[local11] = this.anIntArray324[local11] * local9 - this.anIntArray329[local11] * local5 >> 16;
				this.anIntArray329[local11] = local31;
			}
		}
		if (arg0 != 0) {
			@Pc(63) int local63 = Static4.anIntArray322[arg0];
			@Pc(67) int local67 = Static4.anIntArray321[arg0];
			for (@Pc(69) int local69 = 0; local69 < this.anInt3356; local69++) {
				@Pc(89) int local89 = this.anIntArray324[local69] * local67 - this.anIntArray326[local69] * local63 >> 16;
				this.anIntArray326[local69] = this.anIntArray324[local69] * local63 + this.anIntArray326[local69] * local67 >> 16;
				this.anIntArray324[local69] = local89;
			}
		}
		if (arg1 == 0) {
			return;
		}
		@Pc(121) int local121 = Static4.anIntArray322[arg1];
		@Pc(125) int local125 = Static4.anIntArray321[arg1];
		for (@Pc(127) int local127 = 0; local127 < this.anInt3356; local127++) {
			@Pc(147) int local147 = this.anIntArray326[local127] * local121 + this.anIntArray329[local127] * local125 >> 16;
			this.anIntArray326[local127] = this.anIntArray326[local127] * local125 - this.anIntArray329[local127] * local121 >> 16;
			this.anIntArray329[local127] = local147;
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "([B)V")
	private void decodeNew(@OriginalArg(0) byte[] bytes) {
		@Pc(4) Buffer local4 = new Buffer(bytes);
		@Pc(9) Buffer local9 = new Buffer(bytes);
		@Pc(14) Buffer local14 = new Buffer(bytes);
		@Pc(19) Buffer local19 = new Buffer(bytes);
		@Pc(24) Buffer local24 = new Buffer(bytes);
		@Pc(29) Buffer local29 = new Buffer(bytes);
		@Pc(34) Buffer local34 = new Buffer(bytes);
		local4.position = bytes.length - 23;
		@Pc(44) int local44 = local4.readUnsignedShort();
		@Pc(48) int local48 = local4.readUnsignedShort();
		@Pc(52) int local52 = local4.readUnsignedByte();
		@Pc(56) int local56 = local4.readUnsignedByte();
		@Pc(65) boolean local65 = (local56 & 0x1) == 1;
		@Pc(74) boolean local74 = (local56 & 0x2) == 2;
		@Pc(78) int local78 = local4.readUnsignedByte();
		@Pc(82) int local82 = local4.readUnsignedByte();
		@Pc(86) int local86 = local4.readUnsignedByte();
		@Pc(90) int local90 = local4.readUnsignedByte();
		@Pc(94) int local94 = local4.readUnsignedByte();
		@Pc(98) int local98 = local4.readUnsignedShort();
		@Pc(102) int local102 = local4.readUnsignedShort();
		@Pc(106) int local106 = local4.readUnsignedShort();
		@Pc(110) int local110 = local4.readUnsignedShort();
		@Pc(114) int local114 = local4.readUnsignedShort();
		@Pc(116) int local116 = 0;
		@Pc(118) int local118 = 0;
		@Pc(120) int local120 = 0;
		if (local52 > 0) {
			this.aByteArray38 = new byte[local52];
			local4.position = 0;
			for (@Pc(131) int local131 = 0; local131 < local52; local131++) {
				@Pc(143) byte local143 = this.aByteArray38[local131] = local4.readByte();
				if (local143 == 0) {
					local116++;
				}
				if (local143 >= 1 && local143 <= 3) {
					local118++;
				}
				if (local143 == 2) {
					local120++;
				}
			}
		}
		@Pc(167) int local167 = local52 + local44;
		@Pc(169) int local169 = local167;
		if (local65) {
			local167 += local48;
		}
		@Pc(181) int local181 = local167 + local48;
		@Pc(183) int local183 = local181;
		if (local78 == 255) {
			local181 += local48;
		}
		@Pc(192) int local192 = local181;
		if (local86 == 1) {
			local181 += local48;
		}
		@Pc(201) int local201 = local181;
		if (local94 == 1) {
			local181 += local44;
		}
		@Pc(210) int local210 = local181;
		if (local82 == 1) {
			local181 += local48;
		}
		@Pc(223) int local223 = local181 + local110;
		@Pc(225) int local225 = local223;
		if (local90 == 1) {
			local223 += local48 * 2;
		}
		@Pc(240) int local240 = local223 + local114;
		@Pc(242) int local242 = local240;
		local240 += local48 * 2;
		@Pc(250) int local250 = local240;
		local240 += local98;
		@Pc(256) int local256 = local240;
		local240 += local102;
		@Pc(262) int local262 = local240;
		local240 += local106;
		@Pc(268) int local268 = local240;
		local240 += local116 * 6;
		@Pc(276) int local276 = local240;
		local240 += local118 * 6;
		@Pc(284) int local284 = local240;
		local240 += local118 * 6;
		@Pc(292) int local292 = local240;
		local240 += local118;
		@Pc(298) int local298 = local240;
		local240 += local118;
		@Pc(304) int local304 = local240;
		local240 += local118 + local120 * 2;
		this.anInt3356 = local44;
		this.anInt3353 = local48;
		this.anInt3352 = local52;
		this.anIntArray329 = new int[local44];
		this.anIntArray324 = new int[local44];
		this.anIntArray326 = new int[local44];
		this.anIntArray331 = new int[local48];
		this.anIntArray330 = new int[local48];
		this.anIntArray332 = new int[local48];
		if (local94 == 1) {
			this.anIntArray323 = new int[local44];
		}
		if (local65) {
			this.aByteArray40 = new byte[local48];
		}
		if (local78 == 255) {
			this.aByteArray37 = new byte[local48];
		} else {
			this.aByte11 = (byte) local78;
		}
		if (local82 == 1) {
			this.aByteArray33 = new byte[local48];
		}
		if (local86 == 1) {
			this.anIntArray325 = new int[local48];
		}
		if (local90 == 1) {
			this.aShortArray51 = new short[local48];
		}
		if (local90 == 1 && local52 > 0) {
			this.aByteArray35 = new byte[local48];
		}
		this.aShortArray53 = new short[local48];
		if (local52 > 0) {
			this.aShortArray59 = new short[local52];
			this.aShortArray56 = new short[local52];
			this.aShortArray57 = new short[local52];
			if (local118 > 0) {
				this.aShortArray60 = new short[local118];
				this.aShortArray55 = new short[local118];
				this.aShortArray58 = new short[local118];
				this.aByteArray36 = new byte[local118];
				this.aByteArray39 = new byte[local118];
				this.aByteArray34 = new byte[local118];
			}
			if (local120 > 0) {
				this.aByteArray32 = new byte[local120];
				this.aByteArray31 = new byte[local120];
			}
		}
		local4.position = local52;
		local9.position = local250;
		local14.position = local256;
		local19.position = local262;
		local24.position = local201;
		@Pc(473) int local473 = 0;
		@Pc(475) int local475 = 0;
		@Pc(477) int local477 = 0;
		for (@Pc(479) int local479 = 0; local479 < local44; local479++) {
			@Pc(486) int local486 = local4.readUnsignedByte();
			@Pc(488) int local488 = 0;
			if ((local486 & 0x1) != 0) {
				local488 = local9.readShortSmart();
			}
			@Pc(498) int local498 = 0;
			if ((local486 & 0x2) != 0) {
				local498 = local14.readShortSmart();
			}
			@Pc(508) int local508 = 0;
			if ((local486 & 0x4) != 0) {
				local508 = local19.readShortSmart();
			}
			this.anIntArray329[local479] = local473 + local488;
			this.anIntArray324[local479] = local475 + local498;
			this.anIntArray326[local479] = local477 + local508;
			local473 = this.anIntArray329[local479];
			local475 = this.anIntArray324[local479];
			local477 = this.anIntArray326[local479];
			if (local94 == 1) {
				this.anIntArray323[local479] = local24.readUnsignedByte();
			}
		}
		local4.position = local242;
		local9.position = local169;
		local14.position = local183;
		local19.position = local210;
		local24.position = local192;
		local29.position = local225;
		local34.position = local223;
		for (@Pc(587) int local587 = 0; local587 < local48; local587++) {
			this.aShortArray53[local587] = (short) local4.readUnsignedShort();
			if (local65) {
				this.aByteArray40[local587] = local9.readByte();
			}
			if (local78 == 255) {
				this.aByteArray37[local587] = local14.readByte();
			}
			if (local82 == 1) {
				this.aByteArray33[local587] = local19.readByte();
			}
			if (local86 == 1) {
				this.anIntArray325[local587] = local24.readUnsignedByte();
			}
			if (local90 == 1) {
				this.aShortArray51[local587] = (short) (local29.readUnsignedShort() - 1);
			}
			if (this.aByteArray35 != null) {
				if (this.aShortArray51[local587] == -1) {
					this.aByteArray35[local587] = -1;
				} else {
					this.aByteArray35[local587] = (byte) (local34.readUnsignedByte() - 1);
				}
			}
		}
		this.anInt3355 = -1;
		local4.position = local181;
		local9.position = local167;
		@Pc(688) int local688 = 0;
		@Pc(690) int local690 = 0;
		@Pc(692) int local692 = 0;
		@Pc(694) int local694 = 0;
		for (@Pc(696) int local696 = 0; local696 < local48; local696++) {
			@Pc(703) int local703 = local9.readUnsignedByte();
			if (local703 == 1) {
				local688 = local4.readShortSmart() + local694;
				local690 = local4.readShortSmart() + local688;
				local692 = local4.readShortSmart() + local690;
				local694 = local692;
				this.anIntArray331[local696] = local688;
				this.anIntArray330[local696] = local690;
				this.anIntArray332[local696] = local692;
				if (local688 > this.anInt3355) {
					this.anInt3355 = local688;
				}
				if (local690 > this.anInt3355) {
					this.anInt3355 = local690;
				}
				if (local692 > this.anInt3355) {
					this.anInt3355 = local692;
				}
			}
			if (local703 == 2) {
				local690 = local692;
				local692 = local4.readShortSmart() + local694;
				local694 = local692;
				this.anIntArray331[local696] = local688;
				this.anIntArray330[local696] = local690;
				this.anIntArray332[local696] = local692;
				if (local692 > this.anInt3355) {
					this.anInt3355 = local692;
				}
			}
			if (local703 == 3) {
				local688 = local692;
				local692 = local4.readShortSmart() + local694;
				local694 = local692;
				this.anIntArray331[local696] = local688;
				this.anIntArray330[local696] = local690;
				this.anIntArray332[local696] = local692;
				if (local692 > this.anInt3355) {
					this.anInt3355 = local692;
				}
			}
			if (local703 == 4) {
				@Pc(841) int local841 = local688;
				local688 = local690;
				local690 = local841;
				local692 = local4.readShortSmart() + local694;
				local694 = local692;
				this.anIntArray331[local696] = local688;
				this.anIntArray330[local696] = local841;
				this.anIntArray332[local696] = local692;
				if (local692 > this.anInt3355) {
					this.anInt3355 = local692;
				}
			}
		}
		this.anInt3355++;
		local4.position = local268;
		local9.position = local276;
		local14.position = local284;
		local19.position = local292;
		local24.position = local298;
		local29.position = local304;
		for (@Pc(903) int local903 = 0; local903 < local52; local903++) {
			@Pc(913) int local913 = this.aByteArray38[local903] & 0xFF;
			if (local913 == 0) {
				this.aShortArray59[local903] = (short) local4.readUnsignedShort();
				this.aShortArray56[local903] = (short) local4.readUnsignedShort();
				this.aShortArray57[local903] = (short) local4.readUnsignedShort();
			}
			if (local913 == 1) {
				this.aShortArray59[local903] = (short) local9.readUnsignedShort();
				this.aShortArray56[local903] = (short) local9.readUnsignedShort();
				this.aShortArray57[local903] = (short) local9.readUnsignedShort();
				this.aShortArray60[local903] = (short) local14.readUnsignedShort();
				this.aShortArray55[local903] = (short) local14.readUnsignedShort();
				this.aShortArray58[local903] = (short) local14.readUnsignedShort();
				this.aByteArray36[local903] = local19.readByte();
				this.aByteArray39[local903] = local24.readByte();
				this.aByteArray34[local903] = local29.readByte();
			}
			if (local913 == 2) {
				this.aShortArray59[local903] = (short) local9.readUnsignedShort();
				this.aShortArray56[local903] = (short) local9.readUnsignedShort();
				this.aShortArray57[local903] = (short) local9.readUnsignedShort();
				this.aShortArray60[local903] = (short) local14.readUnsignedShort();
				this.aShortArray55[local903] = (short) local14.readUnsignedShort();
				this.aShortArray58[local903] = (short) local14.readUnsignedShort();
				this.aByteArray36[local903] = local19.readByte();
				this.aByteArray39[local903] = local24.readByte();
				this.aByteArray34[local903] = local29.readByte();
				this.aByteArray32[local903] = local29.readByte();
				this.aByteArray31[local903] = local29.readByte();
			}
			if (local913 == 3) {
				this.aShortArray59[local903] = (short) local9.readUnsignedShort();
				this.aShortArray56[local903] = (short) local9.readUnsignedShort();
				this.aShortArray57[local903] = (short) local9.readUnsignedShort();
				this.aShortArray60[local903] = (short) local14.readUnsignedShort();
				this.aShortArray55[local903] = (short) local14.readUnsignedShort();
				this.aShortArray58[local903] = (short) local14.readUnsignedShort();
				this.aByteArray36[local903] = local19.readByte();
				this.aByteArray39[local903] = local24.readByte();
				this.aByteArray34[local903] = local29.readByte();
			}
		}
		if (!local74) {
			return;
		}
		local4.position = local240;
		@Pc(1180) int local1180 = local4.readUnsignedByte();
		if (local1180 > 0) {
			this.particleEmitters = new ModelParticleEmitter[local1180];
			for (@Pc(1188) int local1188 = 0; local1188 < local1180; local1188++) {
				@Pc(1195) int local1195 = local4.readUnsignedShort();
				@Pc(1199) int local1199 = local4.readUnsignedShort();
				this.particleEmitters[local1188] = new ModelParticleEmitter(local1195, this.anIntArray331[local1199], this.anIntArray330[local1199], this.anIntArray332[local1199]);
			}
		}
		@Pc(1225) int local1225 = local4.readUnsignedByte();
		if (local1225 > 0) {
			this.particleEffectors = new ModelParticleEffector[local1225];
			for (@Pc(1233) int local1233 = 0; local1233 < local1225; local1233++) {
				this.particleEffectors[local1233] = new ModelParticleEffector(local4.readUnsignedShort(), local4.readUnsignedShort());
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIBSB)I")
	public final int method2756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) short arg3, @OriginalArg(5) byte arg4) {
		this.anIntArray331[this.anInt3353] = arg0;
		this.anIntArray330[this.anInt3353] = arg1;
		this.anIntArray332[this.anInt3353] = arg2;
		this.aByteArray40[this.anInt3353] = 1;
		this.aByteArray35[this.anInt3353] = -1;
		this.aShortArray53[this.anInt3353] = arg3;
		this.aShortArray51[this.anInt3353] = -1;
		this.aByteArray33[this.anInt3353] = arg4;
		return this.anInt3353++;
	}

	@OriginalMember(owner = "client!ml", name = "j", descriptor = "()V")
	private void method2757() {
		this.aClass31Array1 = null;
		this.aClass31Array2 = null;
		this.aClass120Array1 = null;
		this.aBoolean238 = false;
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V")
	private void method2758(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static4.anIntArray322[arg0];
		@Pc(7) int local7 = Static4.anIntArray321[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3356; local9++) {
			@Pc(29) int local29 = this.anIntArray324[local9] * local7 - this.anIntArray326[local9] * local3 >> 16;
			this.anIntArray326[local9] = this.anIntArray324[local9] * local3 + this.anIntArray326[local9] * local7 >> 16;
			this.anIntArray324[local9] = local29;
		}
		this.method2757();
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(IIIII)Lclient!na;")
	public final SoftwareModel createSoftwareModel(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new SoftwareModel(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ml", name = "k", descriptor = "()V")
	public final void method2760() {
		this.anIntArray323 = null;
		this.anIntArray325 = null;
		this.anIntArrayArray27 = null;
		this.anIntArrayArray26 = null;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!vc;IIIZ)V")
	@Override
	public final void method3807(@OriginalArg(0) Entity arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) RawModel local2 = (RawModel) arg0;
		local2.method2765();
		local2.method2764();
		Static4.anInt3354++;
		@Pc(12) int local12 = 0;
		@Pc(15) int[] local15 = local2.anIntArray329;
		@Pc(18) int local18 = local2.anInt3355;
		for (@Pc(20) int local20 = 0; local20 < this.anInt3355; local20++) {
			@Pc(29) Class31 local29 = this.aClass31Array1[local20];
			if (local29.anInt620 != 0) {
				@Pc(40) int local40 = this.anIntArray324[local20] - arg2;
				if (local40 >= local2.aShort31 && local40 <= local2.aShort30) {
					@Pc(56) int local56 = this.anIntArray329[local20] - arg1;
					if (local56 >= local2.aShort27 && local56 <= local2.aShort34) {
						@Pc(72) int local72 = this.anIntArray326[local20] - arg3;
						if (local72 >= local2.aShort32 && local72 <= local2.aShort28) {
							for (@Pc(83) int local83 = 0; local83 < local18; local83++) {
								@Pc(91) Class31 local91 = local2.aClass31Array1[local83];
								if (local56 == local15[local83] && local72 == local2.anIntArray326[local83] && local40 == local2.anIntArray324[local83] && local91.anInt620 != 0) {
									if (this.aClass31Array2 == null) {
										this.aClass31Array2 = new Class31[this.anInt3355];
									}
									if (local2.aClass31Array2 == null) {
										local2.aClass31Array2 = new Class31[local18];
									}
									@Pc(131) Class31 local131 = this.aClass31Array2[local20];
									if (local131 == null) {
										local131 = this.aClass31Array2[local20] = new Class31(local29);
									}
									@Pc(148) Class31 local148 = local2.aClass31Array2[local83];
									if (local148 == null) {
										local148 = local2.aClass31Array2[local83] = new Class31(local91);
									}
									local131.anInt621 += local91.anInt621;
									local131.anInt619 += local91.anInt619;
									local131.anInt625 += local91.anInt625;
									local131.anInt620 += local91.anInt620;
									local148.anInt621 += local29.anInt621;
									local148.anInt619 += local29.anInt619;
									local148.anInt625 += local29.anInt625;
									local148.anInt620 += local29.anInt620;
									local12++;
									Static4.anIntArray327[local20] = Static4.anInt3354;
									Static4.anIntArray328[local83] = Static4.anInt3354;
								}
							}
						}
					}
				}
			}
		}
		if (local12 < 3 || !arg4) {
			return;
		}
		for (@Pc(237) int local237 = 0; local237 < this.anInt3353; local237++) {
			if (Static4.anIntArray327[this.anIntArray331[local237]] == Static4.anInt3354 && Static4.anIntArray327[this.anIntArray330[local237]] == Static4.anInt3354 && Static4.anIntArray327[this.anIntArray332[local237]] == Static4.anInt3354) {
				if (this.aByteArray40 == null) {
					this.aByteArray40 = new byte[this.anInt3353];
				}
				this.aByteArray40[local237] = 2;
			}
		}
		for (@Pc(282) int local282 = 0; local282 < local2.anInt3353; local282++) {
			if (Static4.anIntArray328[local2.anIntArray331[local282]] == Static4.anInt3354 && Static4.anIntArray328[local2.anIntArray330[local282]] == Static4.anInt3354 && Static4.anIntArray328[local2.anIntArray332[local282]] == Static4.anInt3354) {
				if (local2.aByteArray40 == null) {
					local2.aByteArray40 = new byte[local2.anInt3353];
				}
				local2.aByteArray40[local282] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(IIIII)Lclient!vg;")
	public final Model createModel(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (GlRenderer.enabled) {
			@Pc(9) GlModel model = new GlModel(this, arg0, arg1, true);
			model.method3866();
			return model;
		} else {
			return new SoftwareModel(this, arg0, arg1, arg2, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(III)I")
	public final int method2763(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3356; local1++) {
			if (this.anIntArray329[local1] == arg0 && this.anIntArray324[local1] == 0 && this.anIntArray326[local1] == arg1) {
				return local1;
			}
		}
		this.anIntArray329[this.anInt3356] = arg0;
		this.anIntArray324[this.anInt3356] = 0;
		this.anIntArray326[this.anInt3356] = arg1;
		this.anInt3355 = ++this.anInt3356;
		return this.anInt3356 - 1;
	}

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "()V")
	public final void method2764() {
		if (this.aClass31Array1 != null) {
			return;
		}
		this.aClass31Array1 = new Class31[this.anInt3355];
		for (@Pc(10) int local10 = 0; local10 < this.anInt3355; local10++) {
			this.aClass31Array1[local10] = new Class31();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt3353; local25++) {
			@Pc(34) int local34 = this.anIntArray331[local25];
			@Pc(39) int local39 = this.anIntArray330[local25];
			@Pc(44) int local44 = this.anIntArray332[local25];
			@Pc(54) int local54 = this.anIntArray329[local39] - this.anIntArray329[local34];
			@Pc(64) int local64 = this.anIntArray324[local39] - this.anIntArray324[local34];
			@Pc(74) int local74 = this.anIntArray326[local39] - this.anIntArray326[local34];
			@Pc(84) int local84 = this.anIntArray329[local44] - this.anIntArray329[local34];
			@Pc(94) int local94 = this.anIntArray324[local44] - this.anIntArray324[local34];
			@Pc(104) int local104 = this.anIntArray326[local44] - this.anIntArray326[local34];
			@Pc(112) int local112 = local64 * local104 - local94 * local74;
			@Pc(120) int local120 = local74 * local84 - local104 * local54;
			@Pc(128) int local128;
			for (local128 = local54 * local94 - local84 * local64; local112 > 8192 || local120 > 8192 || local128 > 8192 || local112 < -8192 || local120 < -8192 || local128 < -8192; local128 >>= 1) {
				local112 >>= 1;
				local120 >>= 1;
			}
			@Pc(174) int local174 = (int) Math.sqrt((double) (local112 * local112 + local120 * local120 + local128 * local128));
			if (local174 <= 0) {
				local174 = 1;
			}
			@Pc(184) int local184 = local112 * 256 / local174;
			@Pc(190) int local190 = local120 * 256 / local174;
			@Pc(196) int local196 = local128 * 256 / local174;
			@Pc(201) byte local201;
			if (this.aByteArray40 == null) {
				local201 = 0;
			} else {
				local201 = this.aByteArray40[local25];
			}
			if (local201 == 0) {
				@Pc(214) Class31 local214 = this.aClass31Array1[local34];
				local214.anInt621 += local184;
				local214.anInt619 += local190;
				local214.anInt625 += local196;
				local214.anInt620++;
				local214 = this.aClass31Array1[local39];
				local214.anInt621 += local184;
				local214.anInt619 += local190;
				local214.anInt625 += local196;
				local214.anInt620++;
				local214 = this.aClass31Array1[local44];
				local214.anInt621 += local184;
				local214.anInt619 += local190;
				local214.anInt625 += local196;
				local214.anInt620++;
			} else if (local201 == 1) {
				if (this.aClass120Array1 == null) {
					this.aClass120Array1 = new Class120[this.anInt3353];
				}
				@Pc(317) Class120 local317 = this.aClass120Array1[local25] = new Class120();
				local317.anInt3342 = local184;
				local317.anInt3339 = local190;
				local317.anInt3343 = local196;
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "m", descriptor = "()V")
	private void method2765() {
		if (this.aBoolean238) {
			return;
		}
		this.aBoolean238 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt3355; local20++) {
			@Pc(29) int local29 = this.anIntArray329[local20];
			@Pc(34) int local34 = this.anIntArray324[local20];
			@Pc(39) int local39 = this.anIntArray326[local20];
			if (local29 < local8) {
				local8 = local29;
			}
			if (local29 > local14) {
				local14 = local29;
			}
			if (local34 < local10) {
				local10 = local34;
			}
			if (local34 > local16) {
				local16 = local34;
			}
			if (local39 < local12) {
				local12 = local39;
			}
			if (local39 > local18) {
				local18 = local39;
			}
		}
		this.aShort27 = (short) local8;
		this.aShort34 = (short) local14;
		this.aShort31 = (short) local10;
		this.aShort30 = (short) local16;
		this.aShort32 = (short) local12;
		this.aShort28 = (short) local18;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II[[I[[IIIIZZ)Lclient!ml;")
	public final RawModel method2766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method2765();
		@Pc(6) int local6 = arg4 + this.aShort27;
		@Pc(11) int local11 = arg4 + this.aShort34;
		@Pc(16) int local16 = arg6 + this.aShort32;
		@Pc(21) int local21 = arg6 + this.aShort28;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local6 < 0 || local11 + 128 >> 7 >= arg2.length || local16 < 0 || local21 + 128 >> 7 >= arg2[0].length)) {
			return this;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return this;
			}
			if (local6 < 0 || local11 + 128 >> 7 >= arg3.length || local16 < 0 || local21 + 128 >> 7 >= arg3[0].length) {
				return this;
			}
		} else {
			@Pc(95) int local95 = local6 >> 7;
			@Pc(101) int local101 = local11 + 127 >> 7;
			@Pc(105) int local105 = local16 >> 7;
			@Pc(111) int local111 = local21 + 127 >> 7;
			if (arg2[local95][local105] == arg5 && arg2[local101][local105] == arg5 && arg2[local95][local111] == arg5 && arg2[local101][local111] == arg5) {
				return this;
			}
		}
		@Pc(147) RawModel local147 = new RawModel();
		local147.anInt3356 = this.anInt3356;
		local147.anInt3355 = this.anInt3355;
		local147.anInt3353 = this.anInt3353;
		local147.anInt3352 = this.anInt3352;
		local147.anIntArray331 = this.anIntArray331;
		local147.anIntArray330 = this.anIntArray330;
		local147.anIntArray332 = this.anIntArray332;
		local147.aByteArray40 = this.aByteArray40;
		local147.aByteArray37 = this.aByteArray37;
		local147.aByteArray33 = this.aByteArray33;
		local147.aByteArray35 = this.aByteArray35;
		local147.aShortArray53 = this.aShortArray53;
		local147.aShortArray51 = this.aShortArray51;
		local147.aByte11 = this.aByte11;
		local147.aByteArray38 = this.aByteArray38;
		local147.aShortArray59 = this.aShortArray59;
		local147.aShortArray56 = this.aShortArray56;
		local147.aShortArray57 = this.aShortArray57;
		local147.aShortArray60 = this.aShortArray60;
		local147.aShortArray55 = this.aShortArray55;
		local147.aShortArray58 = this.aShortArray58;
		local147.aByteArray36 = this.aByteArray36;
		local147.aByteArray39 = this.aByteArray39;
		local147.aByteArray34 = this.aByteArray34;
		local147.aByteArray32 = this.aByteArray32;
		local147.aByteArray31 = this.aByteArray31;
		local147.anIntArray323 = this.anIntArray323;
		local147.anIntArray325 = this.anIntArray325;
		local147.anIntArrayArray27 = this.anIntArrayArray27;
		local147.anIntArrayArray26 = this.anIntArrayArray26;
		local147.aShort33 = this.aShort33;
		local147.aShort29 = this.aShort29;
		local147.aClass31Array1 = this.aClass31Array1;
		local147.aClass120Array1 = this.aClass120Array1;
		local147.aClass31Array2 = this.aClass31Array2;
		local147.particleEmitters = this.particleEmitters;
		local147.particleEffectors = this.particleEffectors;
		if (arg0 == 3) {
			local147.anIntArray329 = Static24.method2566(this.anIntArray329);
			local147.anIntArray324 = Static24.method2566(this.anIntArray324);
			local147.anIntArray326 = Static24.method2566(this.anIntArray326);
		} else {
			local147.anIntArray329 = this.anIntArray329;
			local147.anIntArray324 = new int[local147.anInt3356];
			local147.anIntArray326 = this.anIntArray326;
		}
		if (arg0 == 1) {
			for (@Pc(338) int local338 = 0; local338 < local147.anInt3355; local338++) {
				@Pc(349) int local349 = this.anIntArray329[local338] + arg4;
				@Pc(356) int local356 = this.anIntArray326[local338] + arg6;
				@Pc(360) int local360 = local349 & 0x7F;
				@Pc(364) int local364 = local356 & 0x7F;
				@Pc(368) int local368 = local349 >> 7;
				@Pc(372) int local372 = local356 >> 7;
				@Pc(394) int local394 = arg2[local368][local372] * (128 - local360) + arg2[local368 + 1][local372] * local360 >> 7;
				@Pc(420) int local420 = arg2[local368][local372 + 1] * (128 - local360) + arg2[local368 + 1][local372 + 1] * local360 >> 7;
				@Pc(432) int local432 = local394 * (128 - local364) + local420 * local364 >> 7;
				local147.anIntArray324[local338] = this.anIntArray324[local338] + local432 - arg5;
			}
			for (@Pc(449) int local449 = local147.anInt3355; local449 < local147.anInt3356; local449++) {
				@Pc(460) int local460 = this.anIntArray329[local449] + arg4;
				@Pc(467) int local467 = this.anIntArray326[local449] + arg6;
				@Pc(471) int local471 = local460 & 0x7F;
				@Pc(475) int local475 = local467 & 0x7F;
				@Pc(479) int local479 = local460 >> 7;
				@Pc(483) int local483 = local467 >> 7;
				if (local479 >= 0 && local479 < arg2.length - 1 && local483 >= 0 && local483 < arg2[0].length - 1) {
					@Pc(524) int local524 = arg2[local479][local483] * (128 - local471) + arg2[local479 + 1][local483] * local471 >> 7;
					@Pc(550) int local550 = arg2[local479][local483 + 1] * (128 - local471) + arg2[local479 + 1][local483 + 1] * local471 >> 7;
					@Pc(562) int local562 = local524 * (128 - local475) + local550 * local475 >> 7;
					local147.anIntArray324[local449] = this.anIntArray324[local449] + local562 - arg5;
				}
			}
		} else if (arg0 == 2) {
			for (@Pc(582) int local582 = 0; local582 < local147.anInt3355; local582++) {
				@Pc(596) int local596 = (this.anIntArray324[local582] << 16) / this.aShort31;
				if (local596 < arg1) {
					@Pc(606) int local606 = this.anIntArray329[local582] + arg4;
					@Pc(613) int local613 = this.anIntArray326[local582] + arg6;
					@Pc(617) int local617 = local606 & 0x7F;
					@Pc(621) int local621 = local613 & 0x7F;
					@Pc(625) int local625 = local606 >> 7;
					@Pc(629) int local629 = local613 >> 7;
					@Pc(651) int local651 = arg2[local625][local629] * (128 - local617) + arg2[local625 + 1][local629] * local617 >> 7;
					@Pc(677) int local677 = arg2[local625][local629 + 1] * (128 - local617) + arg2[local625 + 1][local629 + 1] * local617 >> 7;
					@Pc(689) int local689 = local651 * (128 - local621) + local677 * local621 >> 7;
					local147.anIntArray324[local582] = this.anIntArray324[local582] + (local689 - arg5) * (arg1 - local596) / arg1;
				} else {
					local147.anIntArray324[local582] = this.anIntArray324[local582];
				}
			}
			for (@Pc(721) int local721 = local147.anInt3355; local721 < local147.anInt3356; local721++) {
				@Pc(735) int local735 = (this.anIntArray324[local721] << 16) / this.aShort31;
				if (local735 < arg1) {
					@Pc(745) int local745 = this.anIntArray329[local721] + arg4;
					@Pc(752) int local752 = this.anIntArray326[local721] + arg6;
					@Pc(756) int local756 = local745 & 0x7F;
					@Pc(760) int local760 = local752 & 0x7F;
					@Pc(764) int local764 = local745 >> 7;
					@Pc(768) int local768 = local752 >> 7;
					if (local764 >= 0 && local764 < arg2.length - 1 && local768 >= 0 && local768 < arg2[0].length - 1) {
						@Pc(809) int local809 = arg2[local764][local768] * (128 - local756) + arg2[local764 + 1][local768] * local756 >> 7;
						@Pc(835) int local835 = arg2[local764][local768 + 1] * (128 - local756) + arg2[local764 + 1][local768 + 1] * local756 >> 7;
						@Pc(847) int local847 = local809 * (128 - local760) + local835 * local760 >> 7;
						local147.anIntArray324[local721] = this.anIntArray324[local721] + (local847 - arg5) * (arg1 - local735) / arg1;
					}
				} else {
					local147.anIntArray324[local721] = this.anIntArray324[local721];
				}
			}
		} else if (arg0 == 3) {
			@Pc(886) int local886 = (arg1 & 0xFF) * 4;
			@Pc(894) int local894 = (arg1 >> 8 & 0xFF) * 4;
			local147.method2746(arg2, arg4, arg5, arg6, local886, local894);
		} else if (arg0 == 4) {
			@Pc(912) int local912 = this.aShort30 - this.aShort31;
			for (@Pc(914) int local914 = 0; local914 < this.anInt3355; local914++) {
				@Pc(925) int local925 = this.anIntArray329[local914] + arg4;
				@Pc(932) int local932 = this.anIntArray326[local914] + arg6;
				@Pc(936) int local936 = local925 & 0x7F;
				@Pc(940) int local940 = local932 & 0x7F;
				@Pc(944) int local944 = local925 >> 7;
				@Pc(948) int local948 = local932 >> 7;
				@Pc(970) int local970 = arg3[local944][local948] * (128 - local936) + arg3[local944 + 1][local948] * local936 >> 7;
				@Pc(996) int local996 = arg3[local944][local948 + 1] * (128 - local936) + arg3[local944 + 1][local948 + 1] * local936 >> 7;
				@Pc(1008) int local1008 = local970 * (128 - local940) + local996 * local940 >> 7;
				local147.anIntArray324[local914] = this.anIntArray324[local914] + local1008 + local912 - arg5;
			}
			for (@Pc(1027) int local1027 = local147.anInt3355; local1027 < local147.anInt3356; local1027++) {
				@Pc(1038) int local1038 = this.anIntArray329[local1027] + arg4;
				@Pc(1045) int local1045 = this.anIntArray326[local1027] + arg6;
				@Pc(1049) int local1049 = local1038 & 0x7F;
				@Pc(1053) int local1053 = local1045 & 0x7F;
				@Pc(1057) int local1057 = local1038 >> 7;
				@Pc(1061) int local1061 = local1045 >> 7;
				if (local1057 >= 0 && local1057 < arg3.length - 1 && local1061 >= 0 && local1061 < arg3[0].length - 1) {
					@Pc(1102) int local1102 = arg3[local1057][local1061] * (128 - local1049) + arg3[local1057 + 1][local1061] * local1049 >> 7;
					@Pc(1128) int local1128 = arg3[local1057][local1061 + 1] * (128 - local1049) + arg3[local1057 + 1][local1061 + 1] * local1049 >> 7;
					@Pc(1140) int local1140 = local1102 * (128 - local1053) + local1128 * local1053 >> 7;
					local147.anIntArray324[local1027] = this.anIntArray324[local1027] + local1140 + local912 - arg5;
				}
			}
		} else if (arg0 == 5) {
			@Pc(1166) int local1166 = this.aShort30 - this.aShort31;
			for (@Pc(1168) int local1168 = 0; local1168 < this.anInt3355; local1168++) {
				@Pc(1179) int local1179 = this.anIntArray329[local1168] + arg4;
				@Pc(1186) int local1186 = this.anIntArray326[local1168] + arg6;
				@Pc(1190) int local1190 = local1179 & 0x7F;
				@Pc(1194) int local1194 = local1186 & 0x7F;
				@Pc(1198) int local1198 = local1179 >> 7;
				@Pc(1202) int local1202 = local1186 >> 7;
				@Pc(1224) int local1224 = arg2[local1198][local1202] * (128 - local1190) + arg2[local1198 + 1][local1202] * local1190 >> 7;
				@Pc(1250) int local1250 = arg2[local1198][local1202 + 1] * (128 - local1190) + arg2[local1198 + 1][local1202 + 1] * local1190 >> 7;
				@Pc(1262) int local1262 = local1224 * (128 - local1194) + local1250 * local1194 >> 7;
				local1224 = arg3[local1198][local1202] * (128 - local1190) + arg3[local1198 + 1][local1202] * local1190 >> 7;
				local1250 = arg3[local1198][local1202 + 1] * (128 - local1190) + arg3[local1198 + 1][local1202 + 1] * local1190 >> 7;
				@Pc(1322) int local1322 = local1224 * (128 - local1194) + local1250 * local1194 >> 7;
				@Pc(1326) int local1326 = local1262 - local1322;
				local147.anIntArray324[local1168] = ((this.anIntArray324[local1168] << 8) / local1166 * local1326 >> 8) + local1262 - arg5;
			}
			for (@Pc(1351) int local1351 = local147.anInt3355; local1351 < local147.anInt3356; local1351++) {
				@Pc(1362) int local1362 = this.anIntArray329[local1351] + arg4;
				@Pc(1369) int local1369 = this.anIntArray326[local1351] + arg6;
				@Pc(1373) int local1373 = local1362 & 0x7F;
				@Pc(1377) int local1377 = local1369 & 0x7F;
				@Pc(1381) int local1381 = local1362 >> 7;
				@Pc(1385) int local1385 = local1369 >> 7;
				if (local1381 >= 0 && local1381 < arg2.length - 1 && local1381 < arg3.length - 1 && local1385 >= 0 && local1385 < arg2[0].length - 1 && local1385 < arg3[0].length - 1) {
					@Pc(1440) int local1440 = arg2[local1381][local1385] * (128 - local1373) + arg2[local1381 + 1][local1385] * local1373 >> 7;
					@Pc(1466) int local1466 = arg2[local1381][local1385 + 1] * (128 - local1373) + arg2[local1381 + 1][local1385 + 1] * local1373 >> 7;
					@Pc(1478) int local1478 = local1440 * (128 - local1377) + local1466 * local1377 >> 7;
					local1440 = arg3[local1381][local1385] * (128 - local1373) + arg3[local1381 + 1][local1385] * local1373 >> 7;
					local1466 = arg3[local1381][local1385 + 1] * (128 - local1373) + arg3[local1381 + 1][local1385 + 1] * local1373 >> 7;
					@Pc(1538) int local1538 = local1440 * (128 - local1377) + local1466 * local1377 >> 7;
					@Pc(1542) int local1542 = local1478 - local1538;
					local147.anIntArray324[local1351] = ((this.anIntArray324[local1351] << 8) / local1166 * local1542 >> 8) + local1478 - arg5;
				}
			}
		}
		this.aBoolean238 = false;
		return local147;
	}

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "(III)V")
	public final void method2767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3356; local1++) {
			this.anIntArray329[local1] = this.anIntArray329[local1] * arg0 / 128;
			this.anIntArray324[local1] = this.anIntArray324[local1] * arg1 / 128;
			this.anIntArray326[local1] = this.anIntArray326[local1] * arg2 / 128;
		}
		this.method2757();
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(SS)V")
	public final void method2768(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3353; local1++) {
			if (this.aShortArray53[local1] == arg0) {
				this.aShortArray53[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)V")
	private void method2769(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static4.anIntArray322[arg0];
		@Pc(7) int local7 = Static4.anIntArray321[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3356; local9++) {
			@Pc(29) int local29 = this.anIntArray324[local9] * local3 + this.anIntArray329[local9] * local7 >> 16;
			this.anIntArray324[local9] = this.anIntArray324[local9] * local7 - this.anIntArray329[local9] * local3 >> 16;
			this.anIntArray329[local9] = local29;
		}
		this.method2757();
	}
}
