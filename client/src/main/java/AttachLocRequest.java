import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class AttachLocRequest extends Node {

	@OriginalMember(owner = "client!qd", name = "J", descriptor = "Lclient!ll;")
	private static final LinkedList queue = new LinkedList();

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	public static void push(@OriginalArg(0) int x0Delta, @OriginalArg(1) int entityId, @OriginalArg(2) int resetLoops, @OriginalArg(3) int setLoops, @OriginalArg(4) int shape, @OriginalArg(5) int z1Delta, @OriginalArg(6) int z0Delta, @OriginalArg(8) int locId, @OriginalArg(9) int angle, @OriginalArg(10) int z, @OriginalArg(11) int x1Delta, @OriginalArg(12) int x) {
		@Pc(3) AttachLocRequest request = new AttachLocRequest();
		request.z0Delta = z0Delta;
		request.setLoops = setLoops;
		request.x1Delta = x1Delta;
		request.x = x;
		request.shape = shape;
		request.z1Delta = z1Delta;
		request.locId = locId;
		request.x0Delta = x0Delta;
		request.resetLoops = resetLoops;
		request.z = z;
		request.entityId = entityId;
		request.angle = angle;
		queue.addTail(request);
	}

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "(I)V")
	public static void loop() {
		while (true) {
			@Pc(16) AttachLocRequest request = (AttachLocRequest) queue.removeHead();
			if (request == null) {
				return;
			}
			@Pc(42) PathingEntity entity;
			if (request.entityId < 0) {
				@Pc(33) int playerId = -request.entityId - 1;
				if (playerId == PlayerList.selfId) {
					entity = PlayerList.self;
				} else {
					entity = PlayerList.players[playerId];
				}
			} else {
				@Pc(55) int npcId = request.entityId - 1;
				entity = NpcList.npcs[npcId];
			}
			if (entity != null) {
				@Pc(69) LocType type = LocTypeList.get(request.locId);
				if (Player.level < 3) {
				}
				@Pc(88) int width;
				@Pc(85) int length;
				if (request.angle == 1 || request.angle == 3) {
					width = type.length;
					length = type.width;
				} else {
					length = type.length;
					width = type.width;
				}
				@Pc(105) int centerX1 = request.x + (width + 1 >> 1);
				@Pc(112) int centerX0 = request.x + (width >> 1);
				@Pc(120) int centerZ0 = request.z + (length >> 1);
				@Pc(130) int centerZ1 = request.z + (length + 1 >> 1);
				@Pc(134) int[][] tileHeights = SceneGraph.tileHeights[Player.level];
				@Pc(161) int y = tileHeights[centerX1][centerZ0] + tileHeights[centerX0][centerZ0] + tileHeights[centerX0][centerZ1] + tileHeights[centerX1][centerZ1] >> 2;
				@Pc(163) Entity attachment = null;
				@Pc(168) int layer = Loc.LAYERS[request.shape];
				if (layer == 0) {
					@Pc(234) Wall wall = SceneGraph.getWall(Player.level, request.x, request.z);
					if (wall != null) {
						attachment = wall.primary;
					}
				} else if (layer == 1) {
					@Pc(219) WallDecor wallDecor = SceneGraph.getWallDecor(Player.level, request.x, request.z);
					if (wallDecor != null) {
						attachment = wallDecor.primary;
					}
				} else if (layer == 2) {
					@Pc(205) Scenery scenery = SceneGraph.getScenery(Player.level, request.x, request.z);
					if (scenery != null) {
						attachment = scenery.entity;
					}
				} else if (layer == 3) {
					@Pc(192) GroundDecor groundDecor = SceneGraph.getGroundDecor(Player.level, request.x, request.z);
					if (groundDecor != null) {
						attachment = groundDecor.entity;
					}
				}
				if (attachment != null) {
					ChangeLocRequest.push(-1, request.x, Player.level, request.z, 0, 0, layer, request.setLoops + 1, request.resetLoops + 1);
					entity.attachmentZFine = request.z * 128 + length * 64;
					@Pc(274) int z0Delta = request.z0Delta;
					@Pc(277) int x0Delta = request.x0Delta;
					entity.attachmentXFine = request.x * 128 + width * 64;
					entity.attachmentY = y;
					entity.attachmentSetAt = request.setLoops + client.loop;
					@Pc(300) int x1Delta = request.x1Delta;
					entity.attachment = attachment;
					entity.attachmentResetAt = request.resetLoops + client.loop;
					if (x1Delta < x0Delta) {
						@Pc(315) int temp = x0Delta;
						x0Delta = x1Delta;
						x1Delta = temp;
					}
					entity.attachmentX1 = request.x + x1Delta;
					entity.attachmentX0 = request.x + x0Delta;
					@Pc(335) int z1Delta = request.z1Delta;
					if (z1Delta < z0Delta) {
						@Pc(341) int temp = z0Delta;
						z0Delta = z1Delta;
						z1Delta = temp;
					}
					entity.attachmentZ1 = z1Delta + request.z;
					entity.attachmentZ0 = z0Delta + request.z;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
	private int entityId;

	@OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
	private int z;

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
	private int z0Delta;

	@OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
	private int x0Delta;

	@OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
	private int setLoops;

	@OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
	private int shape;

	@OriginalMember(owner = "client!ta", name = "x", descriptor = "I")
	private int resetLoops;

	@OriginalMember(owner = "client!ta", name = "C", descriptor = "I")
	private int angle;

	@OriginalMember(owner = "client!ta", name = "D", descriptor = "I")
	private int locId;

	@OriginalMember(owner = "client!ta", name = "H", descriptor = "I")
	private int x1Delta;

	@OriginalMember(owner = "client!ta", name = "I", descriptor = "I")
	private int z1Delta;

	@OriginalMember(owner = "client!ta", name = "K", descriptor = "I")
	private int x;
}
