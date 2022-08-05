import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Environment {

	@OriginalMember(owner = "client!wj", name = "o", descriptor = "F")
	public float aFloat152 = 0.25F;

	@OriginalMember(owner = "client!wj", name = "q", descriptor = "F")
	public float aFloat153 = 1.0F;

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "F")
	public float aFloat151 = 1.0F;

	@OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
	public final int anInt6034;

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "F")
	public final float aFloat149;

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
	public final int anInt6033;

	@OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
	public final int anInt6035;

	@OriginalMember(owner = "client!wj", name = "u", descriptor = "I")
	public final int anInt6043;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "F")
	public final float aFloat148;

	@OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
	public final int anInt6037;

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "F")
	public final float aFloat150;

	@OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
	public final int anInt6036;

	@OriginalMember(owner = "client!wj", name = "t", descriptor = "Lclient!ib;")
	public SkyBoxCube skybox;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
	public Environment() {
		this.anInt6034 = Static4.anInt3364;
		this.aFloat149 = 1.2F;
		this.anInt6033 = -50;
		this.anInt6035 = -50;
		this.anInt6043 = 0;
		this.aFloat148 = 1.1523438F;
		this.anInt6037 = -60;
		this.aFloat150 = 0.69921875F;
		this.anInt6036 = Static4.anInt3365;
		if (Defaults.skyboxTextures != null) {
			this.skybox = SkyBoxCube.create(Defaults.skyboxTextures[0], Defaults.skyboxTextures[1], Defaults.skyboxTextures[2], Defaults.skyboxTextures[3], Defaults.skyboxTextures[4], Defaults.skyboxTextures[5]);
		}
	}

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lclient!fd;)V")
	public Environment(@OriginalArg(0) Buffer buffer) {
		@Pc(16) int flags = buffer.readUnsignedByte();
		if ((flags & 0x1) == 0) {
			this.anInt6034 = Static4.anInt3364;
		} else {
			this.anInt6034 = buffer.readInt();
		}
		if ((flags & 0x2) == 0) {
			this.aFloat148 = 1.1523438F;
		} else {
			this.aFloat148 = (float) buffer.readUnsignedShort() / 256.0F;
		}
		if ((flags & 0x4) == 0) {
			this.aFloat150 = 0.69921875F;
		} else {
			this.aFloat150 = (float) buffer.readUnsignedShort() / 256.0F;
		}
		if ((flags & 0x8) == 0) {
			this.aFloat149 = 1.2F;
		} else {
			this.aFloat149 = (float) buffer.readUnsignedShort() / 256.0F;
		}
		if ((flags & 0x10) == 0) {
			this.anInt6033 = -50;
			this.anInt6035 = -50;
			this.anInt6037 = -60;
		} else {
			this.anInt6035 = buffer.readShort();
			this.anInt6037 = buffer.readShort();
			this.anInt6033 = buffer.readShort();
		}
		if ((flags & 0x20) == 0) {
			this.anInt6036 = Static4.anInt3365;
		} else {
			this.anInt6036 = buffer.readInt();
		}
		if ((flags & 0x40) == 0) {
			this.anInt6043 = 0;
		} else {
			this.anInt6043 = buffer.readUnsignedShort();
		}
		if ((flags & 0x80) != 0) {
			this.skybox = SkyBoxCube.create(buffer.readUnsignedShort(), buffer.readUnsignedShort(), buffer.readUnsignedShort(), buffer.readUnsignedShort(), buffer.readUnsignedShort(), buffer.readUnsignedShort());
		} else if (Defaults.skyboxTextures != null) {
			this.skybox = SkyBoxCube.create(Defaults.skyboxTextures[0], Defaults.skyboxTextures[1], Defaults.skyboxTextures[2], Defaults.skyboxTextures[3], Defaults.skyboxTextures[4], Defaults.skyboxTextures[5]);
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!fd;I)V")
	public final void method4786(@OriginalArg(0) Buffer buffer) {
		this.aFloat151 = (float) (buffer.readUnsignedByte() * 8) / 255.0F;
		this.aFloat152 = (float) (buffer.readUnsignedByte() * 8) / 255.0F;
		this.aFloat153 = (float) (buffer.readUnsignedByte() * 8) / 255.0F;
	}
}
