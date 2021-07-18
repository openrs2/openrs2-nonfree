import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class MiniMap {
	@OriginalMember(owner = "client!mm", name = "h", descriptor = "[[I")
	private static final int[][] anIntArrayArray28 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!r", name = "s", descriptor = "[[I")
	private static final int[][] anIntArrayArray25 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!ob", name = "y", descriptor = "I")
	public static int state = 0;

	@OriginalMember(owner = "client!rg", name = "ab", descriptor = "I")
	public static int flagX = 0;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
	public static int flagY = 0;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "B")
	public static byte sequenceNumber = 0;

	@OriginalMember(owner = "client!la", name = "W", descriptor = "I")
	public static int level = -1;

	@OriginalMember(owner = "client!he", name = "B", descriptor = "Z")
	public static boolean aBoolean147 = true;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "Lclient!uj;")
	public static Sprite sprite;

	@OriginalMember(owner = "client!ij", name = "L", descriptor = "Lclient!vn;")
	private static SoftwareSprite softwareSprite;

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "[I")
	private static final int[] locId = new int[1000];

	@OriginalMember(owner = "client!ho", name = "Q", descriptor = "[I")
	private static final int[] locX = new int[1000];

	@OriginalMember(owner = "client!dg", name = "n", descriptor = "[I")
	private static final int[] locZ = new int[1000];

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
	private static int locs = 0;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
	public static void method115() {
		state = 0;
		sequenceNumber = 0;
		flagY = 0;
		flagX = 0;
		aBoolean147 = false;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IILclient!wf;II)V")
	public static void render(@OriginalArg(2) Component component, @OriginalArg(0) int x, @OriginalArg(3) int y, @OriginalArg(1) int rectangle) {
		Static9.method763();
		if (GlRenderer.enabled) {
			GlRaster.setClip(x, y, x + component.width, y + component.height);
		} else {
			SoftwareRaster.setClip(x, y, x + component.width, y + component.height);
		}
		if (state != 2 && state != 5 && sprite != null) {
			@Pc(92) int local92 = (int) Static5.aFloat97 + Static6.anInt3585 & 0x7FF;
			@Pc(101) int local101 = 464 - PlayerList.self.zFine / 32;
			@Pc(109) int local109 = PlayerList.self.xFine / 32 + 48;
			if (GlRenderer.enabled) {
				((GlSprite) sprite).renderRotatedTransparent(x, y, component.width, component.height, local109, local101, local92, Static6.anInt4761 + 256, (GlSprite) component.method4729(false));
			} else {
				((SoftwareSprite) sprite).renderRotatedTransparent(x, y, component.width, component.height, local109, local101, local92, Static6.anInt4761 + 256, component.anIntArray672, component.anIntArray657);
			}
			if (Static7.mapElements != null) {
				for (@Pc(158) int i = 0; i < Static7.mapElements.size; i++) {
					if (Static7.mapElements.elements[i] != null && Static7.mapElements.positions[i] >> 28 == Player.level) {
						@Pc(188) int local188 = (Static7.mapElements.positions[i] >> 14 & 0x3FFF) - Static5.originX;
						@Pc(197) int local197 = (Static7.mapElements.positions[i] & 0x3FFF) - Static7.originZ;
						if (local188 >= 0 && local188 < 104 && local197 >= 0 && local197 < 104) {
							@Pc(227) int local227 = local188 * 4 + 2 - PlayerList.self.xFine / 32;
							@Pc(239) int local239 = local197 * 4 + 2 - PlayerList.self.zFine / 32;
							renderMapElement(component, Static7.mapElements.elements[i].id, x, y, local227, local239);
						}
					}
				}
			}
			for (@Pc(258) int i = 0; i < locs; i++) {
				@Pc(277) int local277 = locX[i] * 4 + 2 - PlayerList.self.xFine / 32;
				@Pc(292) int local292 = locZ[i] * 4 + 2 - PlayerList.self.zFine / 32;
				@Pc(298) LocType type = LocTypeList.get(locId[i]);
				if (type.multiLocs != null) {
					type = type.getMultiLoc();
					if (type == null || type.mapElement == -1) {
						continue;
					}
				}
				renderMapElement(component, type.mapElement, x, y, local277, local292);
			}
			for (@Pc(329) int xGrid = 0; xGrid < 104; xGrid++) {
				for (@Pc(334) int zGrid = 0; zGrid < 104; zGrid++) {
					@Pc(347) LinkedList objStack = Static4.objStacks[Player.level][xGrid][zGrid];
					if (objStack != null) {
						@Pc(362) int local362 = xGrid * 4 + 2 - PlayerList.self.xFine / 32;
						@Pc(374) int local374 = zGrid * 4 + 2 - PlayerList.self.zFine / 32;
						renderDot(component, x, y, local362, local374, Sprites.mapDots[0]);
					}
				}
			}
			for (@Pc(394) int i = 0; i < NpcList.size; i++) {
				@Pc(407) Npc npc = NpcList.npcs[NpcList.ids[i]];
				if (npc != null && npc.isVisible()) {
					@Pc(418) NpcType type = npc.type;
					if (type != null && type.multiNpcs != null) {
						type = type.getMultiNpc();
					}
					if (type != null && type.aBoolean356 && type.aBoolean357) {
						@Pc(448) int local448 = npc.xFine / 32 - PlayerList.self.xFine / 32;
						@Pc(459) int local459 = npc.zFine / 32 - PlayerList.self.zFine / 32;
						if (type.mapElement == -1) {
							renderDot(component, x, y, local448, local459, Sprites.mapDots[1]);
						} else {
							renderMapElement(component, type.mapElement, x, y, local448, local459);
						}
					}
				}
			}
			for (@Pc(493) int i = 0; i < PlayerList.size; i++) {
				@Pc(502) Player player = PlayerList.players[PlayerList.ids[i]];
				if (player != null && player.isVisible()) {
					@Pc(520) int local520 = player.xFine / 32 - PlayerList.self.xFine / 32;
					@Pc(522) boolean friend = false;
					@Pc(533) int local533 = player.zFine / 32 - PlayerList.self.zFine / 32;
					@Pc(540) long encodedUsername = Base37.encode(player.username);
					for (@Pc(542) int j = 0; j < FriendsList.size; j++) {
						if (encodedUsername == FriendsList.encodedUsernames[j] && FriendsList.worlds[j] != 0) {
							friend = true;
							break;
						}
					}
					@Pc(567) boolean clanMate = false;
					for (@Pc(569) int j = 0; j < ClanChat.size; j++) {
						if (ClanChat.members[j].key == encodedUsername) {
							clanMate = true;
							break;
						}
					}
					@Pc(588) boolean teamMate = false;
					if (PlayerList.self.team != 0 && player.team != 0 && PlayerList.self.team == player.team) {
						teamMate = true;
					}
					if (friend) {
						renderDot(component, x, y, local520, local533, Sprites.mapDots[3]);
					} else if (clanMate) {
						renderDot(component, x, y, local520, local533, Sprites.mapDots[5]);
					} else if (teamMate) {
						renderDot(component, x, y, local520, local533, Sprites.mapDots[4]);
					} else {
						renderDot(component, x, y, local520, local533, Sprites.mapDots[2]);
					}
				}
			}
			@Pc(670) int i = 0;
			@Pc(672) HintArrow[] arrows = HintArrowManager.HINT_ARROWS;
			while (i < arrows.length) {
				@Pc(684) HintArrow arrow = arrows[i];
				if (arrow != null && arrow.type != 0 && client.loop % 20 < 10) {
					if (arrow.type == 1 && arrow.target >= 0 && arrow.target < NpcList.npcs.length) {
						@Pc(717) Npc npc = NpcList.npcs[arrow.target];
						if (npc != null) {
							@Pc(731) int local731 = npc.zFine / 32 - PlayerList.self.zFine / 32;
							@Pc(742) int local742 = npc.xFine / 32 - PlayerList.self.xFine / 32;
							renderHintArrow(component, 360000, x, local731, y, local742, arrow.headIcon);
						}
					}
					if (arrow.type == 2) {
						@Pc(774) int local774 = (arrow.z - Static7.originZ) * 4 + 2 - PlayerList.self.zFine / 32;
						@Pc(779) int radiusSquared = arrow.radius * 4;
						@Pc(795) int local795 = (arrow.x - Static5.originX) * 4 + 2 - PlayerList.self.xFine / 32;
						radiusSquared *= radiusSquared;
						renderHintArrow(component, radiusSquared, x, local774, y, local795, arrow.headIcon);
					}
					if (arrow.type == 10 && arrow.target >= 0 && arrow.target < PlayerList.players.length) {
						@Pc(834) Player player = PlayerList.players[arrow.target];
						if (player != null) {
							@Pc(847) int local847 = player.xFine / 32 - PlayerList.self.xFine / 32;
							@Pc(858) int local858 = player.zFine / 32 - PlayerList.self.zFine / 32;
							renderHintArrow(component, 360000, x, local858, y, local847, arrow.headIcon);
						}
					}
				}
				i++;
			}
			if (flagX != 0) {
				@Pc(895) int local895 = flagX * 4 + PlayerList.self.getSize() * 2 + 2 - PlayerList.self.xFine / 32 - 2;
				@Pc(917) int local917 = flagY * 4 + PlayerList.self.getSize() * 2 + 2 - PlayerList.self.zFine / 32 - 2;
				renderDot(component, x, y, local895, local917, Sprites.mapFlag[aBoolean147 ? 1 : 0]);
			}
			if (GlRenderer.enabled) {
				GlRaster.fillRect(x + component.width / 2 - 1, component.height / 2 + y - 1, 3, 3, 0xFFFFFF);
			} else {
				SoftwareRaster.fillRect(x + component.width / 2 - 1, component.height / 2 + y - 1, 3, 3, 0xFFFFFF);
			}
		} else if (GlRenderer.enabled) {
			@Pc(64) Sprite sprite = component.method4729(false);
			if (sprite != null) {
				sprite.renderTransparent(x, y);
			}
		} else {
			SoftwareRaster.method4210(x, y, component.anIntArray672, component.anIntArray657);
		}
		InterfaceList.rectangleRedraw[rectangle] = true;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)Z")
	private static boolean renderMap(@OriginalArg(1) int level) {
		if (softwareSprite == null) {
			if (GlRenderer.enabled || sprite == null) {
				softwareSprite = new SoftwareSprite(512, 512);
			} else {
				softwareSprite = (SoftwareSprite) sprite;
			}
			@Pc(38) int[] pixels = softwareSprite.pixels;
			@Pc(41) int len = pixels.length;
			for (@Pc(43) int i = 0; i < len; i++) {
				pixels[i] = 1;
			}
			for (@Pc(57) int z = 1; z < 103; z++) {
				@Pc(80) int index = (103 - z) * 512 * 4 + 24628;
				for (@Pc(84) int x = 1; x < 103; x++) {
					if ((Static4.tileFlags[level][x][z] & 0x18) == 0) {
						renderTile(pixels, index, level, x, z);
					}
					if (level < 3 && (Static4.tileFlags[level + 1][x][z] & 0x8) != 0) {
						renderTile(pixels, index, level + 1, x, z);
					}
					index += 4;
				}
			}
			locs = 0;
			for (@Pc(147) int x = 0; x < 104; x++) {
				for (@Pc(154) int z = 0; z < 104; z++) {
					@Pc(168) long key = SceneGraph.getGroundDecorKey(level, x, z);
					if (key == 0L) {
						key = SceneGraph.getSceneryKey(level, x, z);
					}
					if (key == 0L) {
						key = SceneGraph.getWallKey(level, x, z);
					}
					if (key == 0L) {
						key = SceneGraph.getWallDecorKey(level, x, z);
					}
					if (key != 0L) {
						@Pc(227) LocType type = LocTypeList.get(Integer.MAX_VALUE & (int) (key >>> 32));
						if (!type.members || LoginManager.mapMembers) {
							@Pc(235) int mapElement = type.mapElement;
							if (type.multiLocs != null) {
								for (@Pc(241) int i = 0; i < type.multiLocs.length; i++) {
									if (type.multiLocs[i] != -1) {
										@Pc(264) LocType multiType = LocTypeList.get(type.multiLocs[i]);
										if (multiType.mapElement >= 0) {
											mapElement = multiType.mapElement;
										}
									}
								}
							}
							if (mapElement >= 0) {
								@Pc(280) boolean randomizePosition = false;
								@Pc(284) MelType mapElementType = MelTypeList.get(mapElement);
								@Pc(288) int randomisedX = x;
								@Pc(293) int randomisedZ = z;
								if (mapElementType != null && mapElementType.randomizePosition) {
									randomizePosition = true;
								}
								if (randomizePosition) {
									@Pc(309) int[][] flags = PathFinder.collisionMaps[level].flags;
									for (@Pc(311) int i = 0; i < 10; i++) {
										@Pc(321) int direction = (int) (Math.random() * 4.0D);
										if (direction == 0 && randomisedX > 0 && randomisedX > x - 3 && (flags[randomisedX - 1][randomisedZ] & 0x2C0108) == 0) {
											randomisedX--;
										}
										if (direction == 1 && randomisedX < 103 && randomisedX < x + 3 && (flags[randomisedX + 1][randomisedZ] & 0x2C0180) == 0) {
											randomisedX++;
										}
										if (direction == 2 && randomisedZ > 0 && z - 3 < randomisedZ && (flags[randomisedX][randomisedZ - 1] & 0x2C0102) == 0) {
											randomisedZ--;
										}
										if (direction == 3 && randomisedZ < 103 && z + 3 > randomisedZ && (flags[randomisedX][randomisedZ + 1] & 0x2C0120) == 0) {
											randomisedZ++;
										}
									}
								}
								locId[locs] = type.id;
								locX[locs] = randomisedX;
								locZ[locs] = randomisedZ;
								locs++;
							}
						}
					}
				}
			}
		}
		softwareSprite.makeTarget();
		@Pc(504) int wallColor = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + 238 - 10;
		@Pc(515) int doorColor = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		for (@Pc(517) int z = 1; z < 103; z++) {
			for (@Pc(522) int x = 1; x < 103; x++) {
				if ((Static4.tileFlags[level][x][z] & 0x18) == 0 && !renderLoc(level, x, z, wallColor, doorColor)) {
					if (GlRenderer.enabled) {
						SoftwareRaster.pixels = null;
					} else {
						client.frameBuffer.makeTarget();
					}
					return false;
				}
				if (level < 3 && (Static4.tileFlags[level + 1][x][z] & 0x8) != 0 && !renderLoc(level + 1, x, z, wallColor, doorColor)) {
					if (GlRenderer.enabled) {
						SoftwareRaster.pixels = null;
					} else {
						client.frameBuffer.makeTarget();
					}
					return false;
				}
			}
		}
		if (GlRenderer.enabled) {
			@Pc(624) int[] pixels = softwareSprite.pixels;
			@Pc(627) int len = pixels.length;
			for (@Pc(629) int i = 0; i < len; i++) {
				if (pixels[i] == 0) {
					pixels[i] = 1;
				}
			}
			sprite = new GlSprite(softwareSprite);
		} else {
			sprite = softwareSprite;
		}
		if (GlRenderer.enabled) {
			SoftwareRaster.pixels = null;
		} else {
			client.frameBuffer.makeTarget();
		}
		softwareSprite = null;
		return true;
	}

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "(B)V")
	public static void renderMap() {
		if (level != Player.level && renderMap(Player.level)) {
			level = Player.level;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!wf;IIIII)V")
	private static void renderMapElement(@OriginalArg(1) Component component, @OriginalArg(3) int id, @OriginalArg(2) int x, @OriginalArg(0) int y, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) MelType type = MelTypeList.get(id);
		if (type == null || !type.miniMapVisible || !type.isVisible()) {
			return;
		}
		if (type.anIntArray188 != null) {
			@Pc(32) int[] local32 = new int[type.anIntArray188.length];
			for (@Pc(34) int local34 = 0; local34 < local32.length / 2; local34++) {
				@Pc(48) int local48 = (int) Static5.aFloat97 + Static6.anInt3585 & 0x7FF;
				@Pc(52) int local52 = MathUtils.COSINE[local48];
				local52 = local52 * 256 / (Static6.anInt4761 + 256);
				@Pc(64) int local64 = MathUtils.SINE[local48];
				local64 = local64 * 256 / (Static6.anInt4761 + 256);
				local32[local34 * 2] = x + component.width / 2 + ((arg5 + type.anIntArray188[local34 * 2 + 1] * 4) * local64 + local52 * (arg4 + type.anIntArray188[local34 * 2] * 4) >> 16);
				local32[local34 * 2 + 1] = y + component.height / 2 - (local52 * (arg5 + type.anIntArray188[local34 * 2 + 1] * 4) - local64 * (arg4 + type.anIntArray188[local34 * 2] * 4) >> 16);
			}
			if (GlRenderer.enabled) {
				Static18.method1738(local32, type.anInt2283, type.anInt2283 >>> 24, component.anIntArray672, component.anIntArray657);
			} else {
				Static17.method1630(local32, type.anInt2283, type.anInt2283 >>> 24, component.anIntArray672, component.anIntArray657);
			}
			for (@Pc(195) int local195 = 0; local195 < local32.length / 2 - 1; local195++) {
				if (GlRenderer.enabled) {
					GlRaster.drawRectMaskedAlpha(local32[local195 * 2], local32[local195 * 2 + 1], local32[(local195 + 1) * 2], local32[local195 * 2 + 1 + 2], type.anInt2266, type.anInt2266 >>> 24, (GlSprite) component.method4729(false));
				} else {
					SoftwareRaster.drawRectMaskedAlpha(local32[local195 * 2], local32[local195 * 2 + 1], local32[local195 * 2 + 2], local32[local195 * 2 + 3], type.anInt2266, type.anInt2266 >>> 24, component.anIntArray672, component.anIntArray657);
				}
			}
			if (GlRenderer.enabled) {
				GlRaster.drawRectMaskedAlpha(local32[local32.length - 2], local32[local32.length - 1], local32[0], local32[1], type.anInt2266, type.anInt2266 >>> 24, (GlSprite) component.method4729(false));
			} else {
				SoftwareRaster.drawRectMaskedAlpha(local32[local32.length - 2], local32[local32.length - 1], local32[0], local32[1], type.anInt2266, type.anInt2266 >>> 24, component.anIntArray672, component.anIntArray657);
			}
		}
		@Pc(356) IndexedSprite sprite = null;
		if (type.sprite != -1) {
			sprite = type.method1811(false, false);
			if (sprite != null) {
				renderMapElementSprite(sprite, x, component, arg4, arg5, y);
			}
		}
		if (type.text == null) {
			return;
		}
		@Pc(384) int local384 = 0;
		@Pc(386) Font font = Fonts.p11Full;
		if (type.textSize == 1) {
			font = Fonts.p12Full;
		}
		if (type.textSize == 2) {
			font = Fonts.b12Full;
		}
		if (sprite != null) {
			local384 = sprite.height;
		}
		renderMapElementLabel(type.textColor, type.text, y, arg5, x, arg4, local384, font, component);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjava/lang/String;IIIIIILclient!gl;Lclient!wf;)V")
	private static void renderMapElementLabel(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Font arg7, @OriginalArg(9) Component arg8) {
		@Pc(14) int local14 = arg5 * arg5 + arg3 * arg3;
		@Pc(21) int local21 = (int) Static5.aFloat97 + Static6.anInt3585 & 0x7FF;
		@Pc(33) int local33 = Math.max(arg8.width / 2, arg8.height / 2) + 10;
		if (local33 * local33 < local14) {
			return;
		}
		@Pc(43) int local43 = MathUtils.COSINE[local21];
		local43 = local43 * 256 / (Static6.anInt4761 + 256);
		@Pc(55) int local55 = MathUtils.SINE[local21];
		local55 = local55 * 256 / (Static6.anInt4761 + 256);
		@Pc(74) int local74 = local55 * arg3 + local43 * arg5 >> 16;
		@Pc(79) int local79 = arg7.getParagraphWidth(arg1, 100);
		@Pc(85) int local85 = arg7.getParagraphHeight(arg1);
		@Pc(96) int local96 = arg3 * local43 - local55 * arg5 >> 16;
		local74 -= local79 / 2;
		if (-arg8.width > local74 || local74 > arg8.width || -arg8.height > local96 || local96 > arg8.height) {
			return;
		}
		if (GlRenderer.enabled) {
			GlRaster.setMask((GlSprite) arg8.method4729(false));
		} else {
			SoftwareRaster.setMask(arg8.anIntArray672, arg8.anIntArray657);
		}
		arg7.renderParagraphAlpha(arg1, local74 + arg4 + arg8.width / 2, arg2 + arg8.height / 2 - local96 - arg6 - local85, local79, 50, arg0, 0, 1, 0, 0);
		if (GlRenderer.enabled) {
			GlRaster.resetMask();
		} else {
			SoftwareRaster.resetMask();
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!ma;ILclient!wf;BIII)V")
	private static void renderMapElementSprite(@OriginalArg(0) IndexedSprite arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		@Pc(13) int local13 = Static6.anInt3585 + (int) Static5.aFloat97 & 0x7FF;
		@Pc(25) int local25 = Math.max(arg2.width / 2, arg2.height / 2) + 10;
		@Pc(38) int local38 = arg4 * arg4 + arg3 * arg3;
		if (local25 * local25 < local38) {
			return;
		}
		@Pc(48) int local48 = MathUtils.SINE[local13];
		local48 = local48 * 256 / (Static6.anInt4761 + 256);
		@Pc(60) int local60 = MathUtils.COSINE[local13];
		local60 = local60 * 256 / (Static6.anInt4761 + 256);
		@Pc(78) int local78 = local60 * arg3 + arg4 * local48 >> 16;
		@Pc(89) int local89 = arg4 * local60 - arg3 * local48 >> 16;
		if (GlRenderer.enabled) {
			((GlIndexedSprite) arg0).renderTransparentMasked(local78 + arg2.width / 2 + arg1 - arg0.innerWidth / 2, arg2.height / 2 + arg5 - local89 - arg0.innerHeight / 2, (GlSprite) arg2.method4729(false));
		} else {
			((SoftwareIndexedSprite) arg0).renderTransparentMasked(local78 + arg1 + arg2.width / 2 - arg0.innerWidth / 2, arg5 + arg2.height / 2 - local89 - arg0.innerHeight / 2, arg2.anIntArray672, arg2.anIntArray657);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!wf;IIIILclient!uj;)V")
	private static void renderDot(@OriginalArg(1) Component arg1, @OriginalArg(0) int arg0, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Sprite arg5) {
		if (arg5 == null) {
			return;
		}
		@Pc(14) int local14 = (int) Static5.aFloat97 + Static6.anInt3585 & 0x7FF;
		@Pc(26) int local26 = Math.max(arg1.width / 2, arg1.height / 2) + 10;
		@Pc(34) int local34 = arg4 * arg4 + arg3 * arg3;
		if (local34 > local26 * local26) {
			return;
		}
		@Pc(45) int local45 = MathUtils.SINE[local14];
		local45 = local45 * 256 / (Static6.anInt4761 + 256);
		@Pc(57) int local57 = MathUtils.COSINE[local14];
		local57 = local57 * 256 / (Static6.anInt4761 + 256);
		@Pc(75) int local75 = arg3 * local57 + arg4 * local45 >> 16;
		@Pc(86) int local86 = local57 * arg4 - arg3 * local45 >> 16;
		if (GlRenderer.enabled) {
			((GlSprite) arg5).renderTransparentMasked(arg1.width / 2 + arg0 + local75 - arg5.innerWidth / 2, arg1.height / 2 + arg2 - arg5.innerHeight / 2 - local86, (GlSprite) arg1.method4729(false));
		} else {
			((SoftwareSprite) arg5).renderTransparentMasked(arg0 + arg1.width / 2 + local75 - arg5.innerWidth / 2, arg1.height / 2 + arg2 - arg5.innerHeight / 2 - local86, arg1.anIntArray672, arg1.anIntArray657);
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!wf;IIIIIII)V")
	private static void renderHintArrow(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(18) int local18 = arg3 * arg3 + arg5 * arg5;
		if (arg1 < local18) {
			return;
		}
		@Pc(37) int local37 = Math.min(arg0.width / 2, arg0.height / 2);
		if (local18 <= local37 * local37) {
			renderDot(arg0, arg2, arg4, arg5, arg3, Sprites.hintMapMarkers[arg6]);
			return;
		}
		@Pc(43) int local43 = local37 - 10;
		@Pc(50) int local50 = Static6.anInt3585 + (int) Static5.aFloat97 & 0x7FF;
		@Pc(54) int local54 = MathUtils.COSINE[local50];
		local54 = local54 * 256 / (Static6.anInt4761 + 256);
		@Pc(66) int local66 = MathUtils.SINE[local50];
		local66 = local66 * 256 / (Static6.anInt4761 + 256);
		@Pc(85) int local85 = local54 * arg3 - arg5 * local66 >> 16;
		@Pc(95) int local95 = arg5 * local54 + local66 * arg3 >> 16;
		@Pc(101) double local101 = Math.atan2((double) local95, (double) local85);
		@Pc(108) int local108 = (int) ((double) local43 * Math.sin(local101));
		@Pc(115) int local115 = (int) ((double) local43 * Math.cos(local101));
		if (GlRenderer.enabled) {
			((GlSprite) Sprites.hintMapEdge[arg6]).renderRotatedTransparent((arg2 + arg0.width / 2 + local108) * 16, (arg4 + arg0.height / 2 - local115) * 16, (int) (local101 * 10430.378D));
		} else {
			((SoftwareSprite) Sprites.hintMapEdge[arg6]).renderRotatedTransparent(arg2 + arg0.width / 2 + local108 - 10, arg0.height / 2 + arg4 - local115 - 10, local101);
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "([IIIIII)V")
	private static void renderTile(@OriginalArg(0) int[] pixels, @OriginalArg(1) int index, @OriginalArg(3) int level, @OriginalArg(4) int x, @OriginalArg(5) int z) {
		@Pc(7) Tile tile = SceneGraph.tiles[level][x][z];
		if (tile == null) {
			return;
		}
		@Pc(13) PlainTile plainTile = tile.plainTile;
		if (plainTile != null) {
			@Pc(18) int local18 = plainTile.anInt4294;
			if (local18 != 0) {
				for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
					pixels[index] = local18;
					pixels[index + 1] = local18;
					pixels[index + 2] = local18;
					pixels[index + 3] = local18;
					index += 512;
				}
			}
			return;
		}
		@Pc(58) ShapedTile shapedTile = tile.shapedTile;
		if (shapedTile == null) {
			return;
		}
		@Pc(64) int local64 = shapedTile.anInt5224;
		@Pc(67) int local67 = shapedTile.anInt5226;
		@Pc(70) int local70 = shapedTile.anInt5227;
		@Pc(73) int local73 = shapedTile.anInt5225;
		@Pc(77) int[] local77 = anIntArrayArray28[local64];
		@Pc(81) int[] local81 = anIntArrayArray25[local67];
		@Pc(83) int local83 = 0;
		if (local70 != 0) {
			for (@Pc(87) int local87 = 0; local87 < 4; local87++) {
				@Pc(96) int local96 = local83 + 1;
				pixels[index] = local77[local81[local83]] == 0 ? local70 : local73;
				pixels[index + 1] = local77[local81[local96++]] == 0 ? local70 : local73;
				pixels[index + 2] = local77[local81[local96++]] == 0 ? local70 : local73;
				@Pc(137) int local137 = index + 3;
				local83 = local96 + 1;
				pixels[local137] = local77[local81[local96]] == 0 ? local70 : local73;
				index += 512;
			}
			return;
		}
		for (@Pc(157) int local157 = 0; local157 < 4; local157++) {
			@Pc(164) int local164 = local83 + 1;
			if (local77[local81[local83]] != 0) {
				pixels[index] = local73;
			}
			@Pc(175) int local175 = local164 + 1;
			if (local77[local81[local164]] != 0) {
				pixels[index + 1] = local73;
			}
			@Pc(188) int local188 = local175 + 1;
			if (local77[local81[local175]] != 0) {
				pixels[index + 2] = local73;
			}
			local83 = local188 + 1;
			if (local77[local81[local188]] != 0) {
				pixels[index + 3] = local73;
			}
			index += 512;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIZII)Z")
	private static boolean renderLoc(@OriginalArg(1) int level, @OriginalArg(7) int x, @OriginalArg(6) int z, @OriginalArg(0) int wallColor, @OriginalArg(4) int doorColor) {
		@Pc(21) long wallKey = SceneGraph.getWallKey(level, x, z);
		if (wallKey != 0L) {
			@Pc(32) int angle = (int) wallKey >> 20 & 0x3;
			@Pc(39) int shape = (int) wallKey >> 14 & 0x1F;
			@Pc(46) int id = Integer.MAX_VALUE & (int) (wallKey >>> 32);
			@Pc(50) LocType type = LocTypeList.get(id);
			if (type.mapSceneId == -1) {
				@Pc(56) int color = wallColor;
				@Pc(58) int[] pixels = SoftwareRaster.pixels;
				@Pc(75) int index = x * 4 + (52736 - z * 512) * 4 + 24624;
				if (wallKey > 0L) {
					color = doorColor;
				}
				if (shape == 0 || shape == 2) {
					if (angle == 0) {
						pixels[index] = color;
						pixels[index + 512] = color;
						pixels[index + 1024] = color;
						pixels[index + 1536] = color;
					} else if (angle == 1) {
						pixels[index] = color;
						pixels[index + 1] = color;
						pixels[index + 2] = color;
						pixels[index + 3] = color;
					} else if (angle == 2) {
						pixels[index + 3] = color;
						pixels[index + 512 + 3] = color;
						pixels[index + 1024 + 3] = color;
						pixels[index + 3 + 1536] = color;
					} else if (angle == 3) {
						pixels[index + 1536] = color;
						pixels[index + 1536 + 1] = color;
						pixels[index + 2 + 1536] = color;
						pixels[index + 1536 + 3] = color;
					}
				}
				if (shape == 3) {
					if (angle == 0) {
						pixels[index] = color;
					} else if (angle == 1) {
						pixels[index + 3] = color;
					} else if (angle == 2) {
						pixels[index + 3 + 1536] = color;
					} else if (angle == 3) {
						pixels[index + 1536] = color;
					}
				}
				if (shape == 2) {
					if (angle == 3) {
						pixels[index] = color;
						pixels[index + 512] = color;
						pixels[index + 1024] = color;
						pixels[index + 1536] = color;
					} else if (angle == 0) {
						pixels[index] = color;
						pixels[index + 1] = color;
						pixels[index + 2] = color;
						pixels[index + 3] = color;
					} else if (angle == 1) {
						pixels[index + 3] = color;
						pixels[index + 512 + 3] = color;
						pixels[index + 1024 + 3] = color;
						pixels[index + 3 + 1536] = color;
					} else if (angle == 2) {
						pixels[index + 1536] = color;
						pixels[index + 1536 + 1] = color;
						pixels[index + 2 + 1536] = color;
						pixels[index + 1539] = color;
					}
				}
			} else if (!renderScenery(type, x, z, angle)) {
				return false;
			}
		}
		@Pc(418) long sceneryKey = SceneGraph.getSceneryKey(level, x, z);
		if (sceneryKey != 0L) {
			@Pc(430) int angle = (int) sceneryKey >> 20 & 0x3;
			@Pc(437) int id = Integer.MAX_VALUE & (int) (sceneryKey >>> 32);
			@Pc(444) int shape = (int) sceneryKey >> 14 & 0x1F;
			@Pc(448) LocType type = LocTypeList.get(id);
			if (type.mapSceneId == -1) {
				if (shape == 9) {
					@Pc(459) int color = 0xEEEEEE;
					@Pc(461) int[] pixels = SoftwareRaster.pixels;
					if (sceneryKey > 0L) {
						color = 0xEE0000;
					}
					@Pc(485) int index = x * 4 + (52736 - z * 512) * 4 + 24624;
					if (angle == 0 || angle == 2) {
						pixels[index + 1536] = color;
						pixels[index + 1024 + 1] = color;
						pixels[index + 512 + 2] = color;
						pixels[index + 3] = color;
					} else {
						pixels[index] = color;
						pixels[index + 1 + 512] = color;
						pixels[index + 1024 + 2] = color;
						pixels[index + 3 + 1536] = color;
					}
				}
			} else if (!renderScenery(type, x, z, angle)) {
				return false;
			}
		}
		@Pc(573) long groundDecorKey = SceneGraph.getGroundDecorKey(level, x, z);
		if (groundDecorKey != 0L) {
			@Pc(585) int id = (int) (groundDecorKey >>> 32) & Integer.MAX_VALUE;
			@Pc(592) int angle = (int) groundDecorKey >> 20 & 0x3;
			@Pc(596) LocType type = LocTypeList.get(id);
			if (type.mapSceneId != -1 && !renderScenery(type, x, z, angle)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IILclient!vh;IIII)Z")
	private static boolean renderScenery(@OriginalArg(2) LocType locType, @OriginalArg(4) int x, @OriginalArg(1) int z, @OriginalArg(6) int angle) {
		@Pc(10) MsiType msiType = MsiTypeList.get(locType.mapSceneId);
		if (msiType.spriteId == -1) {
			return true;
		}
		@Pc(22) int angle2;
		if (locType.mapSceneRotated) {
			angle += locType.mapSceneAngleOffset;
			angle2 = angle & 0x3;
		} else {
			angle2 = 0;
		}
		@Pc(45) SoftwareIndexedSprite sprite = msiType.getSprite(locType.mapSceneFlipVertical, angle2);
		if (sprite == null) {
			return false;
		}
		@Pc(53) int width = locType.width;
		@Pc(56) int length = locType.length;
		if ((angle2 & 0x1) == 1) {
			width = locType.length;
			length = locType.width;
		}
		@Pc(73) int local73 = sprite.innerWidth;
		@Pc(76) int local76 = sprite.innerHeight;
		if (msiType.aBoolean303) {
			local73 = width * 4;
			local76 = length * 4;
		}
		if (msiType.anInt4306 == 0) {
			sprite.method1315(x * 4 + 48, (104 - z - length) * 4 + 48, local73, local76);
		} else {
			sprite.method1316(x * 4 + 48, (104 - length - z) * 4 + 48, local73, local76, msiType.anInt4306);
		}
		return true;
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(B)V")
	public static void clear() {
		sprite = null;
		level = -1;
	}
}
