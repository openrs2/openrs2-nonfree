import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class DelayedStateChange extends SecondaryNode {

	@OriginalMember(owner = "client!ij", name = "N", descriptor = "Lclient!ic;")
	private static final HashTable changes = new HashTable(16);

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "Lclient!uk;")
	private static final SecondaryLinkedList serverQueue = new SecondaryLinkedList();

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "Lclient!uk;")
	private static final SecondaryLinkedList clientQueue = new SecondaryLinkedList();

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)Lclient!g;")
	private static DelayedStateChange create(@OriginalArg(0) int type, @OriginalArg(1) int id) {
		@Pc(16) DelayedStateChange change = (DelayedStateChange) changes.get((long) type << 32 | (long) id);
		if (change == null) {
			change = new DelayedStateChange(type, id);
			changes.put(change.key, change);
		}
		return change;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(III)V")
	public static void setVarcServer(@OriginalArg(0) int id, @OriginalArg(1) int value) {
		@Pc(8) DelayedStateChange change = create(1, id);
		change.pushServer();
		change.intArg1 = value;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)V")
	public static void setVarcClient(@OriginalArg(1) int id) {
		@Pc(4) DelayedStateChange changed = create(1, id);
		changed.pushClient();
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	public static void setVarcstrServer(@OriginalArg(1) int id, @OriginalArg(0) String value) {
		@Pc(8) DelayedStateChange change = create(2, id);
		change.pushServer();
		change.stringArg = value;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZ)V")
	public static void setVarcstrClient(@OriginalArg(0) int id) {
		@Pc(13) DelayedStateChange change = create(2, id);
		change.pushClient();
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void setComponentTextServer(@OriginalArg(1) int id, @OriginalArg(2) String text) {
		@Pc(13) DelayedStateChange change = create(3, id);
		change.pushServer();
		change.stringArg = text;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V")
	public static void setComponentTextClient(@OriginalArg(0) int id) {
		@Pc(6) DelayedStateChange change = create(3, id);
		change.pushClient();
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIB)V")
	public static void setComponentModelServer(@OriginalArg(2) int id, @OriginalArg(0) int type, @OriginalArg(3) int modelId, @OriginalArg(1) int arg1) {
		@Pc(18) DelayedStateChange change = create(4, id);
		change.pushServer();
		change.intArg1 = type;
		change.intArg2 = modelId;
		change.intArg3 = arg1;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V")
	public static void setComponentModelClient(@OriginalArg(1) int id) {
		@Pc(10) DelayedStateChange change = create(4, id);
		change.pushClient();
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)V")
	public static void setComponentModelAnimServer(@OriginalArg(1) int id, @OriginalArg(2) int seqId) {
		@Pc(4) DelayedStateChange change = create(5, id);
		change.pushServer();
		change.intArg1 = seqId;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(IZ)V")
	public static void setComponentModelAnimClient(@OriginalArg(0) int id) {
		@Pc(13) DelayedStateChange change = create(5, id);
		change.pushClient();
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZI)V")
	public static void setComponentColorServer(@OriginalArg(2) int id, @OriginalArg(0) int color) {
		@Pc(14) DelayedStateChange change = create(6, id);
		change.pushServer();
		change.intArg1 = color;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(ZI)V")
	public static void setComponentColorClient(@OriginalArg(1) int id) {
		@Pc(14) DelayedStateChange change = create(6, id);
		change.pushClient();
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIZ)V")
	public static void setComponentHiddenServer(@OriginalArg(0) int id, @OriginalArg(1) int hidden) {
		@Pc(4) DelayedStateChange change = create(7, id);
		change.pushServer();
		change.intArg1 = hidden;
	}

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "(II)V")
	public static void setComponentHiddenClient(@OriginalArg(0) int id) {
		@Pc(14) DelayedStateChange change = create(7, id);
		change.pushClient();
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIB)V")
	public static void setComponentModelAngleServer(@OriginalArg(3) int id, @OriginalArg(2) int xAngle, @OriginalArg(0) int yAngle, @OriginalArg(1) int zoom) {
		@Pc(10) DelayedStateChange change = create(8, id);
		change.pushServer();
		change.intArg2 = yAngle;
		change.intArg3 = zoom;
		change.intArg1 = xAngle;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V")
	public static void setComponentModelAngleClient(@OriginalArg(1) int id) {
		@Pc(6) DelayedStateChange change = create(8, id);
		change.pushClient();
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIII)V")
	public static void setComponentObjServer(@OriginalArg(1) int id, @OriginalArg(3) int objId, @OriginalArg(0) int count) {
		@Pc(12) DelayedStateChange change = create(9, id);
		change.pushServer();
		change.intArg2 = count;
		change.intArg1 = objId;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)V")
	public static void setComponentObjClient(@OriginalArg(0) int id) {
		@Pc(10) DelayedStateChange change = create(9, id);
		change.pushClient();
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BIIII)V")
	public static void setComponentModelOffsetServer(@OriginalArg(4) int id, @OriginalArg(3) int xOffset2d, @OriginalArg(1) int yOffset2d, @OriginalArg(2) int zAngle2d) {
		@Pc(6) DelayedStateChange change = create(10, id);
		change.pushServer();
		change.intArg2 = yOffset2d;
		change.intArg3 = zAngle2d;
		change.intArg1 = xOffset2d;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V")
	public static void setComponentModelOffsetClient(@OriginalArg(0) int id) {
		@Pc(8) DelayedStateChange change = create(10, id);
		change.pushClient();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BIII)V")
	public static void setComponentPositionServer(@OriginalArg(1) int id, @OriginalArg(2) int x, @OriginalArg(3) int y) {
		@Pc(12) DelayedStateChange change = create(11, id);
		change.pushServer();
		change.intArg1 = x;
		change.intArg2 = y;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)V")
	public static void setComponentPositionClient(@OriginalArg(0) int id) {
		@Pc(10) DelayedStateChange change = create(11, id);
		change.pushClient();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(III)V")
	public static void setComponentScrollPositionServer(@OriginalArg(0) int id, @OriginalArg(1) int scrollY) {
		@Pc(8) DelayedStateChange change = create(12, id);
		change.pushServer();
		change.intArg1 = scrollY;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)V")
	public static void setComponentScrollPositionClient(@OriginalArg(0) int id) {
		@Pc(8) DelayedStateChange change = create(12, id);
		change.pushClient();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIB)V")
	public static void setComponentModelRotationSpeedServer(@OriginalArg(1) int id, @OriginalArg(0) int rotationSpeed) {
		@Pc(8) DelayedStateChange change = create(13, id);
		change.pushServer();
		change.intArg1 = rotationSpeed;
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(B)Lclient!g;")
	public static DelayedStateChange poll() {
		@Pc(10) DelayedStateChange serverChange = (DelayedStateChange) serverQueue.head();
		if (serverChange != null) {
			serverChange.unlink();
			serverChange.unlinkSecondary();
			return serverChange;
		}
		@Pc(35) DelayedStateChange clientChange;
		do {
			clientChange = (DelayedStateChange) clientQueue.head();
			if (clientChange == null) {
				return null;
			}
			if (clientChange.getTime() > MonotonicClock.currentTimeMillis()) {
				return null;
			}
			clientChange.unlink();
			clientChange.unlinkSecondary();
		} while ((clientChange.secondaryKey & Long.MIN_VALUE) == 0L);
		return clientChange;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V")
	public static void clear() {
		changes.clear();
		clientQueue.clear();
		serverQueue.clear();
	}

	@OriginalMember(owner = "client!g", name = "A", descriptor = "I")
	public int intArg1;

	@OriginalMember(owner = "client!g", name = "C", descriptor = "I")
	public int intArg3;

	@OriginalMember(owner = "client!g", name = "O", descriptor = "I")
	public int intArg2;

	@OriginalMember(owner = "client!g", name = "R", descriptor = "Ljava/lang/String;")
	public String stringArg;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(II)V")
	private DelayedStateChange(@OriginalArg(0) int type, @OriginalArg(1) int id) {
		this.key = (long) type << 32 | (long) id;
	}

	@OriginalMember(owner = "client!g", name = "d", descriptor = "(I)I")
	public int getType() {
		return (int) (this.key >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!g", name = "e", descriptor = "(I)I")
	public int getId() {
		return (int) this.key;
	}

	@OriginalMember(owner = "client!g", name = "e", descriptor = "(B)V")
	private void pushClient() {
		this.secondaryKey = MonotonicClock.currentTimeMillis() + 500L | this.secondaryKey & Long.MIN_VALUE;
		clientQueue.addTail(this);
	}

	@OriginalMember(owner = "client!g", name = "f", descriptor = "(B)V")
	private void pushServer() {
		this.secondaryKey |= Long.MIN_VALUE;
		if (this.getTime() == 0L) {
			serverQueue.addTail(this);
		}
	}

	@OriginalMember(owner = "client!g", name = "g", descriptor = "(I)J")
	public long getTime() {
		return this.secondaryKey & Long.MAX_VALUE;
	}
}
