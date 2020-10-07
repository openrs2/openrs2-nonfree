import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class4_Sub11 extends Node {

	@OriginalMember(owner = "client!gn", name = "o", descriptor = "Lclient!pc;")
	public Class4_Sub6_Sub4 aClass4_Sub6_Sub4_2;

	@OriginalMember(owner = "client!gn", name = "s", descriptor = "I")
	public int anInt2112;

	@OriginalMember(owner = "client!gn", name = "t", descriptor = "[I")
	public int[] anIntArray172;

	@OriginalMember(owner = "client!gn", name = "u", descriptor = "I")
	public int anInt2113;

	@OriginalMember(owner = "client!gn", name = "x", descriptor = "I")
	public int anInt2115;

	@OriginalMember(owner = "client!gn", name = "y", descriptor = "I")
	public int anInt2116;

	@OriginalMember(owner = "client!gn", name = "z", descriptor = "I")
	public int anInt2117;

	@OriginalMember(owner = "client!gn", name = "B", descriptor = "Lclient!pc;")
	public Class4_Sub6_Sub4 aClass4_Sub6_Sub4_3;

	@OriginalMember(owner = "client!gn", name = "C", descriptor = "I")
	public int anInt2119;

	@OriginalMember(owner = "client!gn", name = "G", descriptor = "Z")
	public boolean aBoolean146;

	@OriginalMember(owner = "client!gn", name = "I", descriptor = "Lclient!p;")
	public Npc aClass53_Sub1_Sub2_1;

	@OriginalMember(owner = "client!gn", name = "J", descriptor = "I")
	public int anInt2123;

	@OriginalMember(owner = "client!gn", name = "K", descriptor = "I")
	public int anInt2124;

	@OriginalMember(owner = "client!gn", name = "L", descriptor = "Lclient!f;")
	public Player aClass53_Sub1_Sub1_1;

	@OriginalMember(owner = "client!gn", name = "M", descriptor = "I")
	public int anInt2125;

	@OriginalMember(owner = "client!gn", name = "N", descriptor = "Lclient!vh;")
	public LocType aClass181_1;

	@OriginalMember(owner = "client!gn", name = "O", descriptor = "I")
	public int anInt2126;

	@OriginalMember(owner = "client!gn", name = "P", descriptor = "I")
	public int anInt2127;

	@OriginalMember(owner = "client!gn", name = "r", descriptor = "I")
	public int anInt2111 = 0;

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)V")
	public final void method1652() {
		@Pc(9) int local9 = this.anInt2115;
		if (this.aClass181_1 != null) {
			@Pc(96) LocType local96 = this.aClass181_1.getMultiLoc();
			if (local96 == null) {
				this.anInt2119 = 0;
				this.anInt2123 = 0;
				this.anIntArray172 = null;
				this.anInt2127 = 0;
				this.anInt2115 = -1;
				this.anInt2116 = 0;
			} else {
				this.anInt2115 = local96.anInt5521;
				this.anInt2119 = local96.anInt5555;
				this.anInt2116 = local96.anInt5530;
				this.anInt2123 = local96.anInt5519 * 128;
				this.anInt2127 = local96.anInt5525;
				this.anIntArray172 = local96.anIntArray632;
			}
		} else if (this.aClass53_Sub1_Sub2_1 != null) {
			@Pc(21) int local21 = Static10.method395(this.aClass53_Sub1_Sub2_1);
			if (local9 != local21) {
				this.anInt2115 = local21;
				@Pc(36) NpcType local36 = this.aClass53_Sub1_Sub2_1.type;
				if (local36.multiNpcs != null) {
					local36 = local36.getMultiNpc();
				}
				if (local36 == null) {
					this.anInt2127 = this.anInt2123 = 0;
				} else {
					this.anInt2123 = local36.anInt5249 * 128;
					this.anInt2127 = local36.anInt5235;
				}
			}
		} else if (this.aClass53_Sub1_Sub1_1 != null) {
			this.anInt2115 = Static10.method396(this.aClass53_Sub1_Sub1_1);
			this.anInt2123 = this.aClass53_Sub1_Sub1_1.soundRadius * 128;
			this.anInt2127 = this.aClass53_Sub1_Sub1_1.soundVolume;
		}
		if (this.anInt2115 != local9 && this.aClass4_Sub6_Sub4_3 != null) {
			Static5.aClass4_Sub6_Sub3_2.method2670(this.aClass4_Sub6_Sub4_3);
			this.aClass4_Sub6_Sub4_3 = null;
		}
	}
}
