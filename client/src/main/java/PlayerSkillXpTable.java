import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class PlayerSkillXpTable {

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "[I")
	public static final int[] EXPERIENCE_FOR_LEVEL = new int[99];

	static {
		@Pc(4) int experience = 0;
		for (@Pc(6) int i = 0; i < 99; i++) {
			@Pc(15) int level = i + 1;
			@Pc(28) int delta = (int) (Math.pow(2.0D, (double) level / 7.0D) * 300.0D + (double) level);
			experience += delta;
			EXPERIENCE_FOR_LEVEL[i] = experience / 4;
		}
	}
}
