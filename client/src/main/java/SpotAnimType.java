import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class SpotAnimType {

	@OriginalMember(owner = "client!li", name = "i", descriptor = "[S")
	private short[] recolorDestination;

	@OriginalMember(owner = "client!li", name = "l", descriptor = "I")
	private int modelId;

	@OriginalMember(owner = "client!li", name = "n", descriptor = "I")
	public int id;

	@OriginalMember(owner = "client!li", name = "v", descriptor = "[S")
	private short[] retextureSource;

	@OriginalMember(owner = "client!li", name = "w", descriptor = "[S")
	private short[] retextureDestination;

	@OriginalMember(owner = "client!li", name = "x", descriptor = "[S")
	private short[] recolorSource;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "I")
	private int ambient = 0;

	@OriginalMember(owner = "client!li", name = "g", descriptor = "I")
	public int seqId = -1;

	@OriginalMember(owner = "client!li", name = "e", descriptor = "Z")
	public boolean aBoolean221 = false;

	@OriginalMember(owner = "client!li", name = "f", descriptor = "I")
	private int resizeXZ = 128;

	@OriginalMember(owner = "client!li", name = "u", descriptor = "I")
	private int resizeY = 128;

	@OriginalMember(owner = "client!li", name = "m", descriptor = "I")
	private int angle = 0;

	@OriginalMember(owner = "client!li", name = "s", descriptor = "Z")
	public boolean loop = false;

	@OriginalMember(owner = "client!li", name = "d", descriptor = "I")
	private int contrast = 0;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IILclient!fd;)V")
	private void decode(@OriginalArg(2) Buffer buffer, @OriginalArg(0) int code) {
		if (code == 1) {
			this.modelId = buffer.readUnsignedShort();
		} else if (code == 2) {
			this.seqId = buffer.readUnsignedShort();
		} else if (code == 4) {
			this.resizeXZ = buffer.readUnsignedShort();
		} else if (code == 5) {
			this.resizeY = buffer.readUnsignedShort();
		} else if (code == 6) {
			this.angle = buffer.readUnsignedShort();
		} else if (code == 7) {
			this.ambient = buffer.readUnsignedByte();
		} else if (code == 8) {
			this.contrast = buffer.readUnsignedByte();
		} else if (code == 9) {
			this.aBoolean221 = true;
		} else if (code == 10) {
			this.loop = true;
		} else if (code == 40) {
			@Pc(93) int len = buffer.readUnsignedByte();
			this.recolorDestination = new short[len];
			this.recolorSource = new short[len];
			for (@Pc(103) int i = 0; i < len; i++) {
				this.recolorSource[i] = (short) buffer.readUnsignedShort();
				this.recolorDestination[i] = (short) buffer.readUnsignedShort();
			}
		} else if (code == 41) {
			@Pc(141) int len = buffer.readUnsignedByte();
			this.retextureSource = new short[len];
			this.retextureDestination = new short[len];
			for (@Pc(151) int i = 0; i < len; i++) {
				this.retextureSource[i] = (short) buffer.readUnsignedShort();
				this.retextureDestination[i] = (short) buffer.readUnsignedShort();
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
			@Pc(22) RawModel rawModel = RawModel.create(SpotAnimTypeList.modelsArchive, this.modelId);
			if (rawModel == null) {
				return null;
			}
			if (this.recolorSource != null) {
				for (@Pc(34) int i = 0; i < this.recolorSource.length; i++) {
					rawModel.recolor(this.recolorSource[i], this.recolorDestination[i]);
				}
			}
			if (this.retextureSource != null) {
				for (@Pc(57) int i = 0; i < this.retextureSource.length; i++) {
					rawModel.retexture(this.retextureSource[i], this.retextureDestination[i]);
				}
			}
			model = rawModel.createModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
			SpotAnimTypeList.models.put(this.id, model);
		}
		@Pc(113) Model model2;
		if (this.seqId == -1 || arg2 == -1) {
			model2 = model.method3836(true, true, true);
		} else {
			model2 = SeqTypeList.get(this.seqId).method1018(arg2, arg1, model, arg0);
		}
		if (this.resizeXZ != 128 || this.resizeY != 128) {
			model2.resize(this.resizeXZ, this.resizeY, this.resizeXZ);
		}
		if (this.angle != 0) {
			if (this.angle == 90) {
				model2.method3820();
			}
			if (this.angle == 180) {
				model2.method3828();
			}
			if (this.angle == 270) {
				model2.method3827();
			}
		}
		return model2;
	}
}
