import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class SpotAnimType {

	@OriginalMember(owner = "client!li", name = "i", descriptor = "[S")
	private short[] aShortArray45;

	@OriginalMember(owner = "client!li", name = "l", descriptor = "I")
	private int anInt3136;

	@OriginalMember(owner = "client!li", name = "n", descriptor = "I")
	public int id;

	@OriginalMember(owner = "client!li", name = "v", descriptor = "[S")
	private short[] aShortArray47;

	@OriginalMember(owner = "client!li", name = "w", descriptor = "[S")
	private short[] aShortArray48;

	@OriginalMember(owner = "client!li", name = "x", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "I")
	private int anInt3130 = 0;

	@OriginalMember(owner = "client!li", name = "g", descriptor = "I")
	public int anInt3134 = -1;

	@OriginalMember(owner = "client!li", name = "e", descriptor = "Z")
	public boolean aBoolean221 = false;

	@OriginalMember(owner = "client!li", name = "f", descriptor = "I")
	private int anInt3133 = 128;

	@OriginalMember(owner = "client!li", name = "u", descriptor = "I")
	private int anInt3144 = 128;

	@OriginalMember(owner = "client!li", name = "m", descriptor = "I")
	private int anInt3137 = 0;

	@OriginalMember(owner = "client!li", name = "s", descriptor = "Z")
	public boolean aBoolean222 = false;

	@OriginalMember(owner = "client!li", name = "d", descriptor = "I")
	private int anInt3132 = 0;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IILclient!fd;)V")
	private void decode(@OriginalArg(2) Buffer buffer, @OriginalArg(0) int code) {
		if (code == 1) {
			this.anInt3136 = buffer.readUnsignedShort();
		} else if (code == 2) {
			this.anInt3134 = buffer.readUnsignedShort();
		} else if (code == 4) {
			this.anInt3133 = buffer.readUnsignedShort();
		} else if (code == 5) {
			this.anInt3144 = buffer.readUnsignedShort();
		} else if (code == 6) {
			this.anInt3137 = buffer.readUnsignedShort();
		} else if (code == 7) {
			this.anInt3130 = buffer.readUnsignedByte();
		} else if (code == 8) {
			this.anInt3132 = buffer.readUnsignedByte();
		} else if (code == 9) {
			this.aBoolean221 = true;
		} else if (code == 10) {
			this.aBoolean222 = true;
		} else if (code == 40) {
			@Pc(93) int local93 = buffer.readUnsignedByte();
			this.aShortArray45 = new short[local93];
			this.aShortArray49 = new short[local93];
			for (@Pc(103) int local103 = 0; local103 < local93; local103++) {
				this.aShortArray49[local103] = (short) buffer.readUnsignedShort();
				this.aShortArray45[local103] = (short) buffer.readUnsignedShort();
			}
		} else if (code == 41) {
			@Pc(141) int local141 = buffer.readUnsignedByte();
			this.aShortArray47 = new short[local141];
			this.aShortArray48 = new short[local141];
			for (@Pc(151) int local151 = 0; local151 < local141; local151++) {
				this.aShortArray47[local151] = (short) buffer.readUnsignedShort();
				this.aShortArray48[local151] = (short) buffer.readUnsignedShort();
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!fd;Z)V")
	public final void decode(@OriginalArg(0) Buffer buffer) {
		while (true) {
			@Pc(9) int code = buffer.readUnsignedByte();
			if (code == 0) {
				return;
			}
			this.decode(buffer, code);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIB)Lclient!vg;")
	public final Model method2569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Model model = (Model) SpotAnimTypeList.models.get(this.id);
		if (model == null) {
			@Pc(22) RawModel local22 = RawModel.create(SpotAnimTypeList.modelsArchive, this.anInt3136);
			if (local22 == null) {
				return null;
			}
			if (this.aShortArray49 != null) {
				for (@Pc(34) int local34 = 0; local34 < this.aShortArray49.length; local34++) {
					local22.method2768(this.aShortArray49[local34], this.aShortArray45[local34]);
				}
			}
			if (this.aShortArray47 != null) {
				for (@Pc(57) int local57 = 0; local57 < this.aShortArray47.length; local57++) {
					local22.method2753(this.aShortArray47[local57], this.aShortArray48[local57]);
				}
			}
			model = local22.createModel(this.anInt3130 + 64, this.anInt3132 + 850, -30, -50, -30);
			SpotAnimTypeList.models.put(this.id, model);
		}
		@Pc(113) Model local113;
		if (this.anInt3134 == -1 || arg2 == -1) {
			local113 = model.method3836(true, true, true);
		} else {
			local113 = SeqTypeList.get(this.anInt3134).method1018(arg2, arg1, model, arg0);
		}
		if (this.anInt3133 != 128 || this.anInt3144 != 128) {
			local113.method3824(this.anInt3133, this.anInt3144, this.anInt3133);
		}
		if (this.anInt3137 != 0) {
			if (this.anInt3137 == 90) {
				local113.method3820();
			}
			if (this.anInt3137 == 180) {
				local113.method3828();
			}
			if (this.anInt3137 == 270) {
				local113.method3827();
			}
		}
		return local113;
	}
}
