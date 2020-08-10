import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class141 {

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "Lclient!ni;")
	private Node aClass4_159;

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
	private int anInt4287 = 0;

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "Lclient!ic;")
	private final HashTable aClass84_20;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!ic;)V")
	public Class141(@OriginalArg(0) HashTable arg0) {
		this.aClass84_20 = arg0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)Lclient!ni;")
	public final Node method3540() {
		this.anInt4287 = 0;
		return this.method3544();
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)Lclient!ni;")
	public final Node method3544() {
		if (this.anInt4287 > 0 && this.aClass84_20.buckets[this.anInt4287 - 1] != this.aClass4_159) {
			@Pc(25) Node local25 = this.aClass4_159;
			this.aClass4_159 = local25.next;
			return local25;
		}
		@Pc(50) Node local50;
		do {
			if (this.anInt4287 >= this.aClass84_20.bucketCount) {
				return null;
			}
			local50 = this.aClass84_20.buckets[this.anInt4287++].next;
		} while (this.aClass84_20.buckets[this.anInt4287 - 1] == local50);
		this.aClass4_159 = local50.next;
		return local50;
	}
}
