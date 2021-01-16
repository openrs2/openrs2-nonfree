import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class PlayerSkillXpTable {

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "[I")
	public static final int[] EXPERIENCE_FOR_LEVEL = new int[99];

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "[Z")
	public static final boolean[] ENABLED_SKILLS = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "[I")
	public static final int[] baseLevels = new int[25];

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "[I")
	public static final int[] boostedLevels = new int[25];

	@OriginalMember(owner = "client!vi", name = "ab", descriptor = "[I")
	public static final int[] experience = new int[25];

	@OriginalMember(owner = "client!mo", name = "db", descriptor = "[I")
	public static final int[] updatedSkills = new int[32];

	@OriginalMember(owner = "client!pl", name = "y", descriptor = "I")
	public static int updatedSkillsWriterIndex = 0;

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
