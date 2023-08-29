import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class ChangeLocRequest extends Node {

	@OriginalMember(owner = "client!e", name = "A", descriptor = "Lclient!ll;")
	public static LinkedList queue = new LinkedList();

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIIBIII)V")
	public static void push(@OriginalArg(0) int id, @OriginalArg(3) int x, @OriginalArg(1) int level, @OriginalArg(5) int z, @OriginalArg(2) int angle, @OriginalArg(7) int shape, @OriginalArg(8) int layer, @OriginalArg(9) int setLoops, @OriginalArg(4) int resetLoops) {
		@Pc(5) ChangeLocRequest loc = null;
		for (@Pc(10) ChangeLocRequest l = (ChangeLocRequest) queue.head(); l != null; l = (ChangeLocRequest) queue.next()) {
			if (level == l.level && x == l.x && l.z == z && layer == l.layer) {
				loc = l;
				break;
			}
		}
		if (loc == null) {
			loc = new ChangeLocRequest();
			loc.z = z;
			loc.level = level;
			loc.layer = layer;
			loc.x = x;
			init(loc);
			queue.addTail(loc);
		}
		loc.setLoops = setLoops;
		loc.id = id;
		loc.resetLoops = resetLoops;
		loc.angle = angle;
		loc.shape = shape;
	}

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)V")
	public static void loop() {
		for (@Pc(8) ChangeLocRequest loc = (ChangeLocRequest) queue.head(); loc != null; loc = (ChangeLocRequest) queue.next()) {
			if (loc.resetLoops > 0) {
				loc.resetLoops--;
			}
			if (loc.resetLoops != 0) {
				if (loc.setLoops > 0) {
					loc.setLoops--;
				}
				if (loc.setLoops == 0 && loc.x >= 1 && loc.z >= 1 && loc.x <= 102 && loc.z <= 102 && (loc.id < 0 || isShapeReady(loc.id, loc.shape))) {
					SceneGraph.changeLoc(loc.level, loc.x, loc.z, loc.layer, loc.shape, loc.id, loc.angle);
					loc.setLoops = -1;
					if (loc.id == loc.originalId && loc.originalId == -1) {
						loc.unlink();
					} else if (loc.id == loc.originalId && loc.angle == loc.originalAngle && loc.shape == loc.originalShape) {
						loc.unlink();
					}
				}
			} else if (loc.originalId < 0 || isShapeReady(loc.originalId, loc.originalShape)) {
				SceneGraph.changeLoc(loc.level, loc.x, loc.z, loc.layer, loc.originalShape, loc.originalId, loc.originalAngle);
				loc.unlink();
			}
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)Z")
	private static boolean isShapeReady(@OriginalArg(0) int id, @OriginalArg(1) int shape) {
		if (shape == 11) {
			shape = 10;
		}
		@Pc(15) LocType type = LocTypeList.get(id);
		if (shape >= 5 && shape <= 8) {
			shape = 4;
		}
		return type.isReady(shape);
	}

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "(I)V")
	public static void flush() {
		for (@Pc(6) ChangeLocRequest loc = (ChangeLocRequest) queue.head(); loc != null; loc = (ChangeLocRequest) queue.next()) {
			if (loc.resetLoops == -1) {
				loc.setLoops = 0;
				init(loc);
			} else {
				loc.unlink();
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!ra;B)V")
	private static void init(@OriginalArg(0) ChangeLocRequest loc) {
		@Pc(5) int originalId = -1;
		@Pc(7) int originalShape = 0;
		@Pc(9) long key = 0L;
		if (loc.layer == 0) {
			key = SceneGraph.getWallKey(loc.level, loc.x, loc.z);
		}
		if (loc.layer == 1) {
			key = SceneGraph.getWallDecorKey(loc.level, loc.x, loc.z);
		}
		@Pc(45) int originalAngle = 0;
		if (loc.layer == 2) {
			key = SceneGraph.getSceneryKey(loc.level, loc.x, loc.z);
		}
		if (loc.layer == 3) {
			key = SceneGraph.getGroundDecorKey(loc.level, loc.x, loc.z);
		}
		if (key != 0L) {
			originalShape = (int) key >> 14 & 0x1F;
			originalAngle = (int) key >> 20 & 0x3;
			originalId = Integer.MAX_VALUE & (int) (key >>> 32);
		}
		loc.originalAngle = originalAngle;
		loc.originalShape = originalShape;
		loc.originalId = originalId;
	}

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
	public int angle;

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
	public int id;

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
	private int layer;

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
	public int level;

	@OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
	private int originalId;

	@OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
	public int z;

	@OriginalMember(owner = "client!ra", name = "z", descriptor = "I")
	public int shape;

	@OriginalMember(owner = "client!ra", name = "A", descriptor = "I")
	private int originalShape;

	@OriginalMember(owner = "client!ra", name = "B", descriptor = "I")
	private int originalAngle;

	@OriginalMember(owner = "client!ra", name = "D", descriptor = "I")
	public int x;

	@OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
	public int resetLoops = -1;

	@OriginalMember(owner = "client!ra", name = "E", descriptor = "I")
	private int setLoops = 0;
}
