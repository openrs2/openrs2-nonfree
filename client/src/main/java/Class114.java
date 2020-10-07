import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class114 {

	@OriginalMember(owner = "client!md", name = "m", descriptor = "I")
	private int anInt3305 = -1;

	@OriginalMember(owner = "client!md", name = "h", descriptor = "I")
	private int anInt3301 = 0;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "Lclient!ll;")
	private LinkedList aClass112_17 = new LinkedList();

	@OriginalMember(owner = "client!md", name = "r", descriptor = "Z")
	public boolean aBoolean230 = false;

	@OriginalMember(owner = "client!md", name = "q", descriptor = "I")
	private final int anInt3307;

	@OriginalMember(owner = "client!md", name = "g", descriptor = "I")
	private final int anInt3300;

	@OriginalMember(owner = "client!md", name = "f", descriptor = "[Lclient!mc;")
	private Class4_Sub16[] aClass4_Sub16Array1;

	@OriginalMember(owner = "client!md", name = "k", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(III)V")
	public Class114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3307 = arg0;
		this.anInt3300 = arg1;
		this.aClass4_Sub16Array1 = new Class4_Sub16[this.anInt3300];
		this.anIntArrayArrayArray8 = new int[this.anInt3307][3][arg2];
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
	public final void method2693() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt3307; local11++) {
			this.anIntArrayArrayArray8[local11][0] = null;
			this.anIntArrayArrayArray8[local11][1] = null;
			this.anIntArrayArrayArray8[local11][2] = null;
			this.anIntArrayArrayArray8[local11] = null;
		}
		this.anIntArrayArrayArray8 = null;
		this.aClass4_Sub16Array1 = null;
		this.aClass112_17.clear();
		this.aClass112_17 = null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)[[[I")
	public final int[][][] method2694() {
		if (this.anInt3307 != this.anInt3300) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt3307; local17++) {
			this.aClass4_Sub16Array1[local17] = Static2.aClass4_Sub16_2;
		}
		return this.anIntArrayArrayArray8;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II)[[I")
	public final int[][] method2696(@OriginalArg(0) int arg0) {
		if (this.anInt3300 == this.anInt3307) {
			this.aBoolean230 = this.aClass4_Sub16Array1[arg0] == null;
			this.aClass4_Sub16Array1[arg0] = Static2.aClass4_Sub16_2;
			return this.anIntArrayArrayArray8[arg0];
		} else if (this.anInt3307 == 1) {
			this.aBoolean230 = arg0 != this.anInt3305;
			this.anInt3305 = arg0;
			return this.anIntArrayArrayArray8[0];
		} else {
			@Pc(30) Class4_Sub16 local30 = this.aClass4_Sub16Array1[arg0];
			if (local30 == null) {
				this.aBoolean230 = true;
				if (this.anInt3307 <= this.anInt3301) {
					@Pc(47) Class4_Sub16 local47 = (Class4_Sub16) this.aClass112_17.tail();
					local30 = new Class4_Sub16(arg0, local47.anInt3293);
					this.aClass4_Sub16Array1[local47.anInt3294] = null;
					local47.unlink();
				} else {
					local30 = new Class4_Sub16(arg0, this.anInt3301);
					this.anInt3301++;
				}
				this.aClass4_Sub16Array1[arg0] = local30;
			} else {
				this.aBoolean230 = false;
			}
			this.aClass112_17.addHead(local30);
			return this.anIntArrayArrayArray8[local30.anInt3293];
		}
	}
}
