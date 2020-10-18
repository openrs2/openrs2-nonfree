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
	private int[] anIntArray449;

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "Z")
	public boolean aBoolean298 = false;

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "[I")
	private final int[] anIntArray450 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "I")
	public int anInt4231 = -1;

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)Lclient!ml;")
	public final RawModel method3489() {
		@Pc(8) RawModel[] models = new RawModel[5];
		@Pc(10) int len = 0;
		for (@Pc(17) int i = 0; i < 5; i++) {
			if (this.anIntArray450[i] != -1) {
				models[len++] = RawModel.create(IdkTypeList.modelsArchive, this.anIntArray450[i]);
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
	public final RawModel method3490() {
		if (this.anIntArray449 == null) {
			return null;
		}
		@Pc(16) RawModel[] models = new RawModel[this.anIntArray449.length];
		for (@Pc(27) int i = 0; i < this.anIntArray449.length; i++) {
			models[i] = RawModel.create(IdkTypeList.modelsArchive, this.anIntArray449[i]);
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
			this.anInt4231 = buffer.readUnsignedByte();
		} else if (code == 2) {
			@Pc(22) int local22 = buffer.readUnsignedByte();
			this.anIntArray449 = new int[local22];
			for (@Pc(28) int local28 = 0; local28 < local22; local28++) {
				this.anIntArray449[local28] = buffer.readUnsignedShort();
			}
		} else if (code == 3) {
			this.aBoolean298 = true;
		} else if (code == 40) {
			@Pc(55) int local55 = buffer.readUnsignedByte();
			this.recolorDestination = new short[local55];
			this.recolorSource = new short[local55];
			for (@Pc(65) int local65 = 0; local65 < local55; local65++) {
				this.recolorSource[local65] = (short) buffer.readUnsignedShort();
				this.recolorDestination[local65] = (short) buffer.readUnsignedShort();
			}
		} else if (code == 41) {
			@Pc(124) int local124 = buffer.readUnsignedByte();
			this.retextureDestination = new short[local124];
			this.retextureSource = new short[local124];
			for (@Pc(134) int local134 = 0; local134 < local124; local134++) {
				this.retextureSource[local134] = (short) buffer.readUnsignedShort();
				this.retextureDestination[local134] = (short) buffer.readUnsignedShort();
			}
		} else if (code >= 60 && code < 70) {
			this.anIntArray450[code - 60] = buffer.readUnsignedShort();
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)Z")
	public final boolean method3494() {
		if (this.anIntArray449 == null) {
			return true;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray449.length; local22++) {
			if (!IdkTypeList.modelsArchive.isFileReady(this.anIntArray449[local22], 0)) {
				local13 = false;
			}
		}
		return local13;
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
	public final boolean method3497() {
		@Pc(16) boolean local16 = true;
		for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
			if (this.anIntArray450[local18] != -1 && !IdkTypeList.modelsArchive.isFileReady(this.anIntArray450[local18], 0)) {
				local16 = false;
			}
		}
		return local16;
	}
}
