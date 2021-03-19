import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class IdkType {

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "[S")
	private short[] recolorSource;

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "[S")
	private short[] recolorDestination;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "[S")
	private short[] retextureSource;

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "[S")
	private short[] retextureDestination;

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "[I")
	private int[] bodyModels;

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "Z")
	public boolean aBoolean298 = false;

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "[I")
	private final int[] headModels = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "I")
	public int feature = -1;

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)Lclient!ml;")
	public final RawModel getHeadModel() {
		@Pc(8) RawModel[] models = new RawModel[5];
		@Pc(10) int len = 0;
		for (@Pc(17) int i = 0; i < 5; i++) {
			if (this.headModels[i] != -1) {
				models[len++] = RawModel.create(IdkTypeList.modelsArchive, this.headModels[i]);
			}
		}
		@Pc(51) RawModel model = new RawModel(models, len);
		if (this.recolorSource != null) {
			for (@Pc(58) int i = 0; i < this.recolorSource.length; i++) {
				model.recolor(this.recolorSource[i], this.recolorDestination[i]);
			}
		}
		if (this.retextureSource != null) {
			for (@Pc(81) int i = 0; i < this.retextureSource.length; i++) {
				model.retexture(this.retextureSource[i], this.retextureDestination[i]);
			}
		}
		return model;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)Lclient!ml;")
	public final RawModel getBodyModel() {
		if (this.bodyModels == null) {
			return null;
		}
		@Pc(16) RawModel[] models = new RawModel[this.bodyModels.length];
		for (@Pc(27) int i = 0; i < this.bodyModels.length; i++) {
			models[i] = RawModel.create(IdkTypeList.modelsArchive, this.bodyModels[i]);
		}
		@Pc(60) RawModel model;
		if (models.length == 1) {
			model = models[0];
		} else {
			model = new RawModel(models, models.length);
		}
		if (this.recolorSource != null) {
			for (@Pc(72) int i = 0; i < this.recolorSource.length; i++) {
				model.recolor(this.recolorSource[i], this.recolorDestination[i]);
			}
		}
		if (this.retextureSource != null) {
			for (@Pc(96) int i = 0; i < this.retextureSource.length; i++) {
				model.retexture(this.retextureSource[i], this.retextureDestination[i]);
			}
		}
		return model;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!fd;Z)V")
	private void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(0) int code) {
		if (code == 1) {
			this.feature = buffer.readUnsignedByte();
		} else if (code == 2) {
			@Pc(22) int len = buffer.readUnsignedByte();
			this.bodyModels = new int[len];
			for (@Pc(28) int i = 0; i < len; i++) {
				this.bodyModels[i] = buffer.readUnsignedShort();
			}
		} else if (code == 3) {
			this.aBoolean298 = true;
		} else if (code == 40) {
			@Pc(55) int len = buffer.readUnsignedByte();
			this.recolorDestination = new short[len];
			this.recolorSource = new short[len];
			for (@Pc(65) int local65 = 0; local65 < len; local65++) {
				this.recolorSource[local65] = (short) buffer.readUnsignedShort();
				this.recolorDestination[local65] = (short) buffer.readUnsignedShort();
			}
		} else if (code == 41) {
			@Pc(124) int len = buffer.readUnsignedByte();
			this.retextureDestination = new short[len];
			this.retextureSource = new short[len];
			for (@Pc(134) int i = 0; i < len; i++) {
				this.retextureSource[i] = (short) buffer.readUnsignedShort();
				this.retextureDestination[i] = (short) buffer.readUnsignedShort();
			}
		} else if (code >= 60 && code < 70) {
			this.headModels[code - 60] = buffer.readUnsignedShort();
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)Z")
	public final boolean isBodyModelReady() {
		if (this.bodyModels == null) {
			return true;
		}
		@Pc(13) boolean ready = true;
		for (@Pc(22) int i = 0; i < this.bodyModels.length; i++) {
			if (!IdkTypeList.modelsArchive.isFileReady(this.bodyModels[i], 0)) {
				ready = false;
			}
		}
		return ready;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZLclient!fd;)V")
	public final void decode(@OriginalArg(1) Buffer buffer) {
		while (true) {
			@Pc(5) int code = buffer.readUnsignedByte();
			if (code == 0) {
				return;
			}
			this.decode(buffer, code);
		}
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)Z")
	public final boolean isHeadModelReady() {
		@Pc(16) boolean ready = true;
		for (@Pc(18) int i = 0; i < 5; i++) {
			if (this.headModels[i] != -1 && !IdkTypeList.modelsArchive.isFileReady(this.headModels[i], 0)) {
				ready = false;
			}
		}
		return ready;
	}
}
