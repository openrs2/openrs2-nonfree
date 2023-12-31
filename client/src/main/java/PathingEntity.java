import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public abstract class PathingEntity extends Entity {

	@OriginalMember(owner = "client!be", name = "j", descriptor = "[I")
	public static final int[] ANGLES = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILclient!qc;)V")
	public static void method939(@OriginalArg(1) PathingEntity entity) {
		entity.aBoolean284 = false;
		if (entity.movementSeqId != -1) {
			@Pc(19) SeqType seqType = SeqTypeList.get(entity.movementSeqId);
			if (seqType == null || seqType.frames == null) {
				entity.movementSeqId = -1;
			} else {
				entity.anInt4000++;
				if (entity.anInt4046 < seqType.frames.length && seqType.anIntArray94[entity.anInt4046] < entity.anInt4000) {
					entity.anInt4019++;
					entity.anInt4000 = 1;
					entity.anInt4046++;
					SoundPlayer.playSeqSound(seqType, entity.xFine, entity.zFine, entity.anInt4046, entity == PlayerList.self);
				}
				if (entity.anInt4046 >= seqType.frames.length) {
					entity.anInt4000 = 0;
					entity.anInt4046 = 0;
					SoundPlayer.playSeqSound(seqType, entity.xFine, entity.zFine, entity.anInt4046, PlayerList.self == entity);
				}
				entity.anInt4019 = entity.anInt4046 + 1;
				if (entity.anInt4019 >= seqType.frames.length) {
					entity.anInt4019 = 0;
				}
			}
		}
		if (entity.spotAnimId != -1 && client.loop >= entity.spotAnimStart) {
			@Pc(149) SpotAnimType spotAnimType = SpotAnimTypeList.get(entity.spotAnimId);
			@Pc(152) int seqId = spotAnimType.seqId;
			if (seqId == -1) {
				entity.spotAnimId = -1;
			} else {
				label303:
				{
					@Pc(166) SeqType seqType = SeqTypeList.get(seqId);
					if (spotAnimType.loop) {
						if (seqType.anInt1240 == 3) {
							if (entity.anInt4030 > 0 && entity.exactMoveStart <= client.loop && client.loop > entity.exactMoveEnd) {
								entity.spotAnimId = -1;
								break label303;
							}
						} else if (seqType.anInt1240 == 1 && entity.anInt4030 > 0 && entity.exactMoveStart <= client.loop && entity.exactMoveEnd < client.loop) {
							entity.spotAnimStart = client.loop + 1;
							break label303;
						}
					}
					if (seqType == null || seqType.frames == null) {
						entity.spotAnimId = -1;
					} else {
						if (entity.anInt4026 < 0) {
							entity.anInt4026 = 0;
							SoundPlayer.playSeqSound(seqType, entity.xFine, entity.zFine, 0, entity == PlayerList.self);
						}
						entity.anInt3968++;
						if (seqType.frames.length > entity.anInt4026 && seqType.anIntArray94[entity.anInt4026] < entity.anInt3968) {
							entity.anInt3968 = 1;
							entity.anInt4026++;
							SoundPlayer.playSeqSound(seqType, entity.xFine, entity.zFine, entity.anInt4026, PlayerList.self == entity);
						}
						if (entity.anInt4026 >= seqType.frames.length) {
							if (spotAnimType.loop) {
								entity.anInt3989++;
								entity.anInt4026 -= seqType.anInt1242;
								if (seqType.anInt1239 <= entity.anInt3989) {
									entity.spotAnimId = -1;
								} else if (entity.anInt4026 >= 0 && seqType.frames.length > entity.anInt4026) {
									SoundPlayer.playSeqSound(seqType, entity.xFine, entity.zFine, entity.anInt4026, PlayerList.self == entity);
								} else {
									entity.spotAnimId = -1;
								}
							} else {
								entity.spotAnimId = -1;
							}
						}
						entity.anInt3976 = entity.anInt4026 + 1;
						if (entity.anInt3976 >= seqType.frames.length) {
							if (spotAnimType.loop) {
								entity.anInt3976 -= seqType.anInt1242;
								if (seqType.anInt1239 <= entity.anInt3989 + 1) {
									entity.anInt3976 = -1;
								} else if (entity.anInt3976 < 0 || entity.anInt3976 >= seqType.frames.length) {
									entity.anInt3976 = -1;
								}
							} else {
								entity.anInt3976 = -1;
							}
						}
					}
				}
			}
		}
		if (entity.seqId != -1 && entity.seqDelay <= 1) {
			@Pc(458) SeqType seqType = SeqTypeList.get(entity.seqId);
			if (seqType.anInt1240 == 3) {
				if (entity.anInt4030 > 0 && client.loop >= entity.exactMoveStart && entity.exactMoveEnd < client.loop) {
					entity.seqId = -1;
				}
			} else if (seqType.anInt1240 == 1 && entity.anInt4030 > 0 && client.loop >= entity.exactMoveStart && client.loop > entity.exactMoveEnd) {
				entity.seqDelay = 2;
			}
		}
		if (entity.seqId != -1 && entity.seqDelay == 0) {
			@Pc(538) SeqType seqType = SeqTypeList.get(entity.seqId);
			if (seqType == null || seqType.frames == null) {
				entity.seqId = -1;
			} else {
				entity.anInt4044++;
				if (seqType.frames.length > entity.anInt3970 && entity.anInt4044 > seqType.anIntArray94[entity.anInt3970]) {
					entity.anInt3970++;
					entity.anInt4044 = 1;
					SoundPlayer.playSeqSound(seqType, entity.xFine, entity.zFine, entity.anInt3970, entity == PlayerList.self);
				}
				if (entity.anInt3970 >= seqType.frames.length) {
					entity.anInt4001++;
					entity.anInt3970 -= seqType.anInt1242;
					if (seqType.anInt1239 <= entity.anInt4001) {
						entity.seqId = -1;
					} else if (entity.anInt3970 >= 0 && entity.anInt3970 < seqType.frames.length) {
						SoundPlayer.playSeqSound(seqType, entity.xFine, entity.zFine, entity.anInt3970, entity == PlayerList.self);
					} else {
						entity.seqId = -1;
					}
				}
				entity.anInt4011 = entity.anInt3970 + 1;
				if (entity.anInt4011 >= seqType.frames.length) {
					entity.anInt4011 -= seqType.anInt1242;
					if (entity.anInt4001 + 1 >= seqType.anInt1239) {
						entity.anInt4011 = -1;
					} else if (entity.anInt4011 < 0 || entity.anInt4011 >= seqType.frames.length) {
						entity.anInt4011 = -1;
					}
				}
				entity.aBoolean284 = seqType.aBoolean73;
			}
		}
		if (entity.seqDelay > 0) {
			entity.seqDelay--;
		}
		for (@Pc(746) int i = 0; i < entity.seqs.length; i++) {
			@Pc(760) Seq seq = entity.seqs[i];
			if (seq != null) {
				if (seq.delay > 0) {
					seq.delay--;
				} else {
					@Pc(782) SeqType seqType = SeqTypeList.get(seq.seqId);
					if (seqType == null || seqType.frames == null) {
						entity.seqs[i] = null;
					} else {
						seq.anInt4460++;
						if (seqType.frames.length > seq.anInt4462 && seqType.anIntArray94[seq.anInt4462] < seq.anInt4460) {
							seq.anInt4460 = 1;
							seq.anInt4462++;
							SoundPlayer.playSeqSound(seqType, entity.xFine, entity.zFine, seq.anInt4462, entity == PlayerList.self);
						}
						if (seq.anInt4462 >= seqType.frames.length) {
							seq.anInt4462 -= seqType.anInt1242;
							seq.anInt4465++;
							if (seqType.anInt1239 <= seq.anInt4465) {
								entity.seqs[i] = null;
							} else if (seq.anInt4462 >= 0 && seqType.frames.length > seq.anInt4462) {
								SoundPlayer.playSeqSound(seqType, entity.xFine, entity.zFine, seq.anInt4462, entity == PlayerList.self);
							} else {
								entity.seqs[i] = null;
							}
						}
						seq.anInt4464 = seq.anInt4462 + 1;
						if (seqType.frames.length <= seq.anInt4464) {
							seq.anInt4464 -= seqType.anInt1242;
							if (seq.anInt4465 + 1 >= seqType.anInt1239) {
								seq.anInt4464 = -1;
							} else if (seq.anInt4464 < 0 || seq.anInt4464 >= seqType.frames.length) {
								seq.anInt4464 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!qc;I)V")
	private static void exactMove(@OriginalArg(0) PathingEntity entity) {
		if (client.loop == entity.exactMoveEnd || entity.seqId == -1 || entity.seqDelay != 0 || entity.anInt4044 + 1 > SeqTypeList.get(entity.seqId).anIntArray94[entity.anInt3970]) {
			@Pc(41) int duration = entity.exactMoveEnd - entity.exactMoveStart;
			@Pc(46) int time = client.loop - entity.exactMoveStart;
			@Pc(57) int srcX = entity.exactMoveSrcX * 128 + entity.getSize() * 64;
			@Pc(71) int srcZ = entity.exactMoveSrcZ * 128 + entity.getSize() * 64;
			@Pc(82) int destX = entity.exactMoveDestX * 128 + entity.getSize() * 64;
			@Pc(95) int destZ = entity.exactMoveDestZ * 128 + entity.getSize() * 64;
			entity.zFine = (srcZ * (duration - time) + destZ * time) / duration;
			entity.xFine = (srcX * (duration - time) + destX * time) / duration;
		}
		if (entity.exactMoveDirection == 0) {
			entity.targetAngle = 1024;
		}
		if (entity.exactMoveDirection == 1) {
			entity.targetAngle = 1536;
		}
		if (entity.exactMoveDirection == 2) {
			entity.targetAngle = 0;
		}
		entity.movementBlockedLoops = 0;
		if (entity.exactMoveDirection == 3) {
			entity.targetAngle = 512;
		}
		entity.angle = entity.targetAngle;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!qc;Z)V")
	private static void preExactMove(@OriginalArg(0) PathingEntity entity) {
		@Pc(13) int duration = entity.exactMoveStart - client.loop;
		@Pc(25) int srcX = entity.exactMoveSrcX * 128 + entity.getSize() * 64;
		@Pc(37) int srcZ = entity.exactMoveSrcZ * 128 + entity.getSize() * 64;
		if (entity.exactMoveDirection == 0) {
			entity.targetAngle = 1024;
		}
		entity.zFine += (srcZ - entity.zFine) / duration;
		entity.xFine += (srcX - entity.xFine) / duration;
		if (entity.exactMoveDirection == 1) {
			entity.targetAngle = 1536;
		}
		entity.movementBlockedLoops = 0;
		if (entity.exactMoveDirection == 2) {
			entity.targetAngle = 0;
		}
		if (entity.exactMoveDirection == 3) {
			entity.targetAngle = 512;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILclient!qc;)V")
	public static void turn(@OriginalArg(1) PathingEntity entity) {
		if (entity.turnSpeed == 0) {
			return;
		}
		@Pc(16) BasType basType = entity.getBasType();
		if (entity.faceEntity != -1 && entity.faceEntity < 32768) {
			@Pc(31) Npc npc = NpcList.npcs[entity.faceEntity];
			if (npc != null) {
				@Pc(42) int dx = entity.xFine - npc.xFine;
				@Pc(49) int dz = entity.zFine - npc.zFine;
				if (dx != 0 || dz != 0) {
					entity.targetAngle = (int) (Math.atan2(dx, dz) * 325.949D) & 0x7FF;
				}
			}
		}
		if (entity.faceEntity >= 32768) {
			@Pc(87) int id = entity.faceEntity - 32768;
			if (id == PlayerList.selfId) {
				id = 2047;
			}
			@Pc(101) Player player = PlayerList.players[id];
			if (player != null) {
				@Pc(112) int dx = entity.xFine - player.xFine;
				@Pc(119) int dz = entity.zFine - player.zFine;
				if (dx != 0 || dz != 0) {
					entity.targetAngle = (int) (Math.atan2(dx, dz) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((entity.faceX != 0 || entity.faceY != 0) && (entity.movementQueueSize == 0 || entity.movementBlockedLoops > 0)) {
			@Pc(172) int dz = entity.zFine - (entity.faceY - Static7.originZ - Static7.originZ) * 64;
			@Pc(185) int dx = entity.xFine - (entity.faceX - Static5.originX - Static5.originX) * 64;
			if (dx != 0 || dz != 0) {
				entity.targetAngle = (int) (Math.atan2(dx, dz) * 325.949D) & 0x7FF;
			}
			entity.faceX = 0;
			entity.faceY = 0;
		}
		@Pc(222) int angleDelta = entity.targetAngle - entity.angle & 0x7FF;
		if (angleDelta == 0) {
			entity.anInt4020 = 0;
			entity.anInt4015 = 0;
		} else if (basType.anInt830 == 0) {
			entity.anInt4015++;
			if (angleDelta <= 1024) {
				entity.angle += entity.turnSpeed;
				@Pc(874) boolean turning = true;
				if (entity.turnSpeed > angleDelta || angleDelta > 2048 - entity.turnSpeed) {
					turning = false;
					entity.angle = entity.targetAngle;
				}
				if (entity.anInt4015 > 25 || turning) {
					entity.movementSeqId = basType.walkSeqId;
					if (entity.movementQueueSize <= 0) {
						if (basType.readyCwSeqId != -1) {
							entity.movementSeqId = basType.readyCwSeqId;
						}
					} else if (entity.movementQueueSpeed[entity.movementQueueSize - 1] == 2) {
						if (basType.runCwSeqId != -1) {
							entity.movementSeqId = basType.runCwSeqId;
						} else if (basType.runSeqId != -1) {
							entity.movementSeqId = basType.runSeqId;
						}
					} else if (entity.movementQueueSpeed[entity.movementQueueSize - 1] == 0) {
						if (basType.crawlCwSeqId != -1) {
							entity.movementSeqId = basType.crawlCwSeqId;
						} else if (basType.crawlSeqId != -1) {
							entity.movementSeqId = basType.crawlSeqId;
						}
					} else if (basType.walkCwSeqId != -1) {
						entity.movementSeqId = basType.walkCwSeqId;
					}
				}
			} else {
				entity.angle -= entity.turnSpeed;
				@Pc(1005) boolean turning = true;
				if (angleDelta < entity.turnSpeed || 2048 - entity.turnSpeed < angleDelta) {
					turning = false;
					entity.angle = entity.targetAngle;
				}
				if (entity.anInt4015 > 25 || turning) {
					entity.movementSeqId = basType.walkSeqId;
					if (entity.movementQueueSize <= 0) {
						if (basType.readyCcwSeqId != -1) {
							entity.movementSeqId = basType.readyCcwSeqId;
						}
					} else if (entity.movementQueueSpeed[entity.movementQueueSize - 1] == 2) {
						if (basType.runCcwSeqId != -1) {
							entity.movementSeqId = basType.runCcwSeqId;
						} else if (basType.runSeqId != -1) {
							entity.movementSeqId = basType.runSeqId;
						}
					} else if (entity.movementQueueSpeed[entity.movementQueueSize - 1] == 0) {
						if (basType.crawlCcwSeqId != -1) {
							entity.movementSeqId = basType.crawlCcwSeqId;
						} else if (basType.crawlSeqId != -1) {
							entity.movementSeqId = basType.crawlSeqId;
						}
					} else if (basType.walkCcwSeqId != -1) {
						entity.movementSeqId = basType.walkCcwSeqId;
					}
				}
			}
			entity.angle &= 2047;
		} else {
			entity.movementSeqId = -1;
			@Pc(241) int local241 = entity.targetAngle << 5;
			if (entity.anInt3987 != local241) {
				entity.anInt4029 = 0;
				entity.anInt3987 = local241;
				@Pc(263) int local263 = local241 - entity.anInt3992 & 0xFFFF;
				@Pc(274) int local274 = entity.anInt4020 * entity.anInt4020 / (basType.anInt830 * 2);
				if (entity.anInt4020 > 0 && local274 <= local263 && local263 - local274 < 32768) {
					entity.aBoolean283 = true;
					entity.anInt3994 = local263 / 2;
					@Pc(379) int local379 = basType.anInt862 * basType.anInt862 / (basType.anInt830 * 2);
					if (local379 > 32767) {
						local379 = 32767;
					}
					if (entity.anInt3994 > local379) {
						entity.anInt3994 = local263 - local379;
					}
				} else if (entity.anInt4020 < 0 && local274 <= 65536 - local263 && 65536 - local263 - local274 < 32768) {
					entity.anInt3994 = (65536 - local263) / 2;
					entity.aBoolean283 = true;
					@Pc(334) int local334 = basType.anInt862 * basType.anInt862 / (basType.anInt830 * 2);
					if (local334 > 32767) {
						local334 = 32767;
					}
					if (entity.anInt3994 > local334) {
						entity.anInt3994 = 65536 - local334 - local263;
					}
				} else {
					entity.aBoolean283 = false;
				}
			}
			if (entity.anInt4020 == 0) {
				@Pc(410) int local410 = entity.anInt3987 - entity.anInt3992 & 0xFFFF;
				if (local410 < basType.anInt830) {
					entity.anInt3992 = entity.anInt3987;
				} else {
					entity.anInt4029 = 0;
					entity.aBoolean283 = true;
					@Pc(441) int local441 = basType.anInt862 * basType.anInt862 / (basType.anInt830 * 2);
					if (local441 > 32767) {
						local441 = 32767;
					}
					if (local410 >= 32768) {
						entity.anInt3994 = (65536 - local410) / 2;
						if (local441 < entity.anInt3994) {
							entity.anInt3994 = 65536 - local410 - local441;
						}
						entity.anInt4020 = -basType.anInt830;
					} else {
						entity.anInt3994 = local410 / 2;
						entity.anInt4020 = basType.anInt830;
						if (entity.anInt3994 > local441) {
							entity.anInt3994 = local410 - local441;
						}
					}
				}
			} else if (entity.anInt4020 > 0) {
				if (entity.anInt4029 >= entity.anInt3994) {
					entity.aBoolean283 = false;
				}
				if (!entity.aBoolean283) {
					entity.anInt4020 -= basType.anInt830;
					if (entity.anInt4020 < 0) {
						entity.anInt4020 = 0;
					}
				} else if (entity.anInt4020 < basType.anInt862) {
					entity.anInt4020 += basType.anInt830;
				}
			} else {
				if (entity.anInt4029 >= entity.anInt3994) {
					entity.aBoolean283 = false;
				}
				if (!entity.aBoolean283) {
					entity.anInt4020 += basType.anInt830;
					if (entity.anInt4020 > 0) {
						entity.anInt4020 = 0;
					}
				} else if (-basType.anInt862 < entity.anInt4020) {
					entity.anInt4020 -= basType.anInt830;
				}
			}
			entity.anInt3992 += entity.anInt4020;
			entity.anInt3992 &= 65535;
			entity.angle = entity.anInt3992 >> 5;
			if (entity.anInt4020 <= 0) {
				entity.anInt4029 -= entity.anInt4020;
			} else {
				entity.anInt4029 += entity.anInt4020;
			}
			if (entity.anInt4020 < 0) {
				if (entity.movementQueueSize > 0) {
					if (entity.movementQueueSpeed[entity.movementQueueSize - 1] == 2) {
						if (basType.runCcwSeqId != -1) {
							entity.movementSeqId = basType.runCcwSeqId;
						} else if (basType.runSeqId != -1) {
							entity.movementSeqId = basType.runSeqId;
						}
					} else if (entity.movementQueueSpeed[entity.movementQueueSize - 1] == 0) {
						if (basType.crawlCcwSeqId != -1) {
							entity.movementSeqId = basType.crawlCcwSeqId;
						} else if (basType.crawlSeqId != -1) {
							entity.movementSeqId = basType.crawlSeqId;
						}
					}
				}
				if (entity.movementSeqId == -1) {
					if (basType.walkCcwSeqId != -1) {
						entity.movementSeqId = basType.walkCcwSeqId;
					} else if (basType.readyCcwSeqId != -1) {
						entity.movementSeqId = basType.readyCcwSeqId;
					}
				}
			} else {
				if (entity.movementQueueSize > 0) {
					if (entity.movementQueueSpeed[entity.movementQueueSize - 1] == 2) {
						if (basType.runCwSeqId != -1) {
							entity.movementSeqId = basType.runCwSeqId;
						} else if (basType.runSeqId != -1) {
							entity.movementSeqId = basType.runSeqId;
						}
					} else if (entity.movementQueueSpeed[entity.movementQueueSize - 1] == 0) {
						if (basType.crawlCwSeqId != -1) {
							entity.movementSeqId = basType.crawlCwSeqId;
						} else if (basType.crawlSeqId != -1) {
							entity.movementSeqId = basType.crawlSeqId;
						}
					}
				}
				if (entity.movementSeqId == -1) {
					if (basType.walkCwSeqId != -1) {
						entity.movementSeqId = basType.walkCwSeqId;
					} else if (basType.readyCwSeqId != -1) {
						entity.movementSeqId = basType.readyCwSeqId;
					}
				}
			}
			if (entity.movementSeqId == -1) {
				entity.movementSeqId = basType.walkSeqId;
			}
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!qc;B)V")
	public static void move(@OriginalArg(0) PathingEntity entity) {
		@Pc(5) BasType basType = entity.getBasType();
		entity.movementSeqId = basType.readySeqId;
		if (entity.movementQueueSize == 0) {
			entity.movementBlockedLoops = 0;
			return;
		}
		if (entity.seqId != -1 && entity.seqDelay == 0) {
			@Pc(41) SeqType seqType = SeqTypeList.get(entity.seqId);
			if (entity.anInt4030 > 0 && seqType.anInt1240 == 0) {
				entity.movementBlockedLoops++;
				return;
			}
			if (entity.anInt4030 <= 0 && seqType.anInt1237 == 0) {
				entity.movementBlockedLoops++;
				return;
			}
		}
		if (entity.spotAnimId != -1 && client.loop >= entity.spotAnimStart) {
			@Pc(95) SpotAnimType spotAnimType = SpotAnimTypeList.get(entity.spotAnimId);
			if (spotAnimType.loop && spotAnimType.seqId != -1) {
				@Pc(110) SeqType seqType = SeqTypeList.get(spotAnimType.seqId);
				if (entity.anInt4030 > 0 && seqType.anInt1240 == 0) {
					entity.movementBlockedLoops++;
					return;
				}
				if (entity.anInt4030 <= 0 && seqType.anInt1237 == 0) {
					entity.movementBlockedLoops++;
					return;
				}
			}
		}
		@Pc(145) int x = entity.xFine;
		@Pc(148) int z = entity.zFine;
		@Pc(167) int targetX = entity.movementQueueX[entity.movementQueueSize - 1] * 128 + entity.getSize() * 64;
		@Pc(184) int targetZ = entity.movementQueueZ[entity.movementQueueSize - 1] * 128 + entity.getSize() * 64;
		if (targetX - x > 256 || targetX - x < -256 || targetZ - z > 256 || targetZ - z < -256) {
			entity.zFine = targetZ;
			entity.xFine = targetX;
			return;
		}
		if (x >= targetX) {
			if (x <= targetX) {
				if (z < targetZ) {
					entity.targetAngle = 1024;
				} else if (z > targetZ) {
					entity.targetAngle = 0;
				}
			} else if (z < targetZ) {
				entity.targetAngle = 768;
			} else if (z <= targetZ) {
				entity.targetAngle = 512;
			} else {
				entity.targetAngle = 256;
			}
		} else if (z < targetZ) {
			entity.targetAngle = 1280;
		} else if (z > targetZ) {
			entity.targetAngle = 1792;
		} else {
			entity.targetAngle = 1536;
		}
		@Pc(295) int seqId = basType.walkFollow180SeqId;
		@Pc(304) int angleDelta = entity.targetAngle - entity.angle & 0x7FF;
		if (angleDelta > 1024) {
			angleDelta -= 2048;
		}
		if (angleDelta >= -256 && angleDelta <= 256) {
			seqId = basType.walkSeqId;
		} else if (angleDelta >= 256 && angleDelta < 768) {
			seqId = basType.walkFollowCwSeqId;
		} else if (angleDelta >= -768 && angleDelta <= -256) {
			seqId = basType.walkFollowCcwSeqId;
		}
		if (seqId == -1) {
			seqId = basType.walkSeqId;
		}
		entity.movementSeqId = seqId;
		@Pc(361) int local361 = 4;
		@Pc(363) boolean local363 = true;
		if (entity instanceof Npc) {
			local363 = ((Npc) entity).type.aBoolean358;
		}
		@Pc(373) byte movementSpeed = 1;
		if (local363) {
			if (entity.angle != entity.targetAngle && entity.faceEntity == -1 && entity.turnSpeed != 0) {
				local361 = 2;
			}
			if (entity.movementQueueSize > 2) {
				local361 = 6;
			}
			if (entity.movementQueueSize > 3) {
				local361 = 8;
			}
			if (entity.movementBlockedLoops > 0 && entity.movementQueueSize > 1) {
				local361 = 8;
				entity.movementBlockedLoops--;
			}
		} else {
			if (entity.movementQueueSize > 1) {
				local361 = 6;
			}
			if (entity.movementQueueSize > 2) {
				local361 = 8;
			}
			if (entity.movementBlockedLoops > 0 && entity.movementQueueSize > 1) {
				entity.movementBlockedLoops--;
				local361 = 8;
			}
		}
		if (entity.movementQueueSpeed[entity.movementQueueSize - 1] == 2) {
			movementSpeed = 2;
			local361 <<= 1;
		} else if (entity.movementQueueSpeed[entity.movementQueueSize - 1] == 0) {
			local361 >>= 1;
			movementSpeed = 0;
		}
		if (local361 < 8 || basType.runSeqId == -1) {
			if (basType.crawlSeqId != -1 && movementSpeed == 0) {
				if (entity.movementSeqId == basType.walkFollow180SeqId && basType.crawlFollow180SeqId != -1) {
					entity.movementSeqId = basType.crawlFollow180SeqId;
				} else if (entity.movementSeqId == basType.walkFollowCcwSeqId && basType.crawlFollowCcwSeqId != -1) {
					entity.movementSeqId = basType.crawlFollowCcwSeqId;
				} else if (entity.movementSeqId == basType.walkFollowCwSeqId && basType.crawlFollowCwSeqId != -1) {
					entity.movementSeqId = basType.crawlFollowCwSeqId;
				} else {
					entity.movementSeqId = basType.crawlSeqId;
				}
			}
		} else if (entity.movementSeqId == basType.walkFollow180SeqId && basType.runFollow180SeqId != -1) {
			entity.movementSeqId = basType.runFollow180SeqId;
		} else if (entity.movementSeqId == basType.walkFollowCcwSeqId && basType.runFollowCcwSeqId != -1) {
			entity.movementSeqId = basType.runFollowCcwSeqId;
		} else if (entity.movementSeqId == basType.walkFollowCwSeqId && basType.runFollowCwSeqId != -1) {
			entity.movementSeqId = basType.runFollowCwSeqId;
		} else {
			entity.movementSeqId = basType.runSeqId;
		}
		if (basType.anInt841 != -1) {
			@Pc(654) int local654 = local361 << 7;
			if (entity.movementQueueSize == 1) {
				@Pc(666) int local666 = entity.anInt3999 * entity.anInt3999;
				@Pc(683) int dz = (targetZ >= entity.zFine ? targetZ - entity.zFine : entity.zFine - targetZ) << 7;
				@Pc(701) int dx = (targetX < entity.xFine ? entity.xFine - targetX : targetX - entity.xFine) << 7;
				@Pc(712) int local712 = dz >= dx ? dz : dx;
				@Pc(719) int local719 = basType.anInt841 * 2 * local712;
				if (local719 < local666) {
					entity.anInt3999 /= 2;
				} else if (local666 / 2 > local712) {
					entity.anInt3999 -= basType.anInt841;
					if (entity.anInt3999 < 0) {
						entity.anInt3999 = 0;
					}
				} else if (entity.anInt3999 < local654) {
					entity.anInt3999 += basType.anInt841;
					if (local654 < entity.anInt3999) {
						entity.anInt3999 = local654;
					}
				}
			} else if (entity.anInt3999 < local654) {
				entity.anInt3999 += basType.anInt841;
				if (local654 < entity.anInt3999) {
					entity.anInt3999 = local654;
				}
			} else if (entity.anInt3999 > 0) {
				entity.anInt3999 -= basType.anInt841;
				if (entity.anInt3999 < 0) {
					entity.anInt3999 = 0;
				}
			}
			local361 = entity.anInt3999 >> 7;
			if (local361 < 1) {
				local361 = 1;
			}
		}
		if (targetZ > z) {
			entity.zFine += local361;
			if (targetZ < entity.zFine) {
				entity.zFine = targetZ;
			}
		} else if (z > targetZ) {
			entity.zFine -= local361;
			if (targetZ > entity.zFine) {
				entity.zFine = targetZ;
			}
		}
		if (x < targetX) {
			entity.xFine += local361;
			if (entity.xFine > targetX) {
				entity.xFine = targetX;
			}
		} else if (x > targetX) {
			entity.xFine -= local361;
			if (entity.xFine < targetX) {
				entity.xFine = targetX;
			}
		}
		if (entity.xFine == targetX && entity.zFine == targetZ) {
			entity.movementQueueSize--;
			if (entity.anInt4030 > 0) {
				entity.anInt4030--;
			}
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IILclient!qc;)V")
	public static void loop(@OriginalArg(2) PathingEntity entity, @OriginalArg(1) int size) {
		if (client.loop < entity.exactMoveStart) {
			preExactMove(entity);
		} else if (client.loop <= entity.exactMoveEnd) {
			exactMove(entity);
		} else {
			move(entity);
		}
		if (entity.xFine < 128 || entity.zFine < 128 || entity.xFine >= 13184 || entity.zFine >= 13184) {
			entity.exactMoveEnd = 0;
			entity.exactMoveStart = 0;
			entity.spotAnimId = -1;
			entity.seqId = -1;
			entity.xFine = entity.movementQueueX[0] * 128 + entity.getSize() * 64;
			entity.zFine = entity.movementQueueZ[0] * 128 + entity.getSize() * 64;
			entity.clearMovementQueue();
		}
		if (entity == PlayerList.self && (entity.xFine < 1536 || entity.zFine < 1536 || entity.xFine >= 11776 || entity.zFine >= 11776)) {
			entity.spotAnimId = -1;
			entity.exactMoveEnd = 0;
			entity.exactMoveStart = 0;
			entity.seqId = -1;
			entity.xFine = entity.movementQueueX[0] * 128 + entity.getSize() * 64;
			entity.zFine = entity.movementQueueZ[0] * 128 + entity.getSize() * 64;
			entity.clearMovementQueue();
		}
		turn(entity);
		method939(entity);
	}

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
	public int exactMoveEnd;

	@OriginalMember(owner = "client!qc", name = "y", descriptor = "I")
	public int spotAnimY;

	@OriginalMember(owner = "client!qc", name = "A", descriptor = "I")
	public int exactMoveSrcX;

	@OriginalMember(owner = "client!qc", name = "C", descriptor = "I")
	public int xFine;

	@OriginalMember(owner = "client!qc", name = "D", descriptor = "I")
	public int attachmentY;

	@OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
	public int spotAnimStart;

	@OriginalMember(owner = "client!qc", name = "ab", descriptor = "Lclient!ne;")
	protected ParticleSystem particleSystem;

	@OriginalMember(owner = "client!qc", name = "ob", descriptor = "I")
	public int zFine;

	@OriginalMember(owner = "client!qc", name = "tb", descriptor = "I")
	public int y;

	@OriginalMember(owner = "client!qc", name = "wb", descriptor = "I")
	public int exactMoveDirection;

	@OriginalMember(owner = "client!qc", name = "Db", descriptor = "I")
	public int exactMoveDestX;

	@OriginalMember(owner = "client!qc", name = "Hb", descriptor = "I")
	public int targetAngle;

	@OriginalMember(owner = "client!qc", name = "Ib", descriptor = "I")
	public int attachmentZ0;

	@OriginalMember(owner = "client!qc", name = "Mb", descriptor = "I")
	public int hitpointsBar;

	@OriginalMember(owner = "client!qc", name = "Pb", descriptor = "I")
	public int exactMoveDestZ;

	@OriginalMember(owner = "client!qc", name = "Rb", descriptor = "I")
	public int attachmentZFine;

	@OriginalMember(owner = "client!qc", name = "Vb", descriptor = "I")
	public int angle;

	@OriginalMember(owner = "client!qc", name = "Wb", descriptor = "I")
	public int attachmentXFine;

	@OriginalMember(owner = "client!qc", name = "Xb", descriptor = "I")
	public int exactMoveSrcZ;

	@OriginalMember(owner = "client!qc", name = "Yb", descriptor = "I")
	public int exactMoveStart;

	@OriginalMember(owner = "client!qc", name = "cc", descriptor = "I")
	public int attachmentZ1;

	@OriginalMember(owner = "client!qc", name = "gc", descriptor = "I")
	public int attachmentX1;

	@OriginalMember(owner = "client!qc", name = "ic", descriptor = "I")
	public int attachmentX0;

	@OriginalMember(owner = "client!qc", name = "mc", descriptor = "Ljava/lang/Object;")
	public Object attachment;

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "[I")
	public final int[] movementQueueX = new int[10];

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
	private int anInt3967 = 0;

	@OriginalMember(owner = "client!qc", name = "r", descriptor = "Z")
	private boolean aBoolean279 = false;

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "I")
	public int anInt3968 = 0;

	@OriginalMember(owner = "client!qc", name = "G", descriptor = "[Lclient!re;")
	public final Seq[] seqs = new Seq[12];

	@OriginalMember(owner = "client!qc", name = "I", descriptor = "I")
	private int anInt3978 = 0;

	@OriginalMember(owner = "client!qc", name = "z", descriptor = "I")
	private int anInt3972 = 0;

	@OriginalMember(owner = "client!qc", name = "N", descriptor = "I")
	private int size = 1;

	@OriginalMember(owner = "client!qc", name = "R", descriptor = "I")
	public int faceEntity = -1;

	@OriginalMember(owner = "client!qc", name = "db", descriptor = "[I")
	public final int[] hitTypes = new int[4];

	@OriginalMember(owner = "client!qc", name = "T", descriptor = "I")
	private int anInt3987 = 0;

	@OriginalMember(owner = "client!qc", name = "Q", descriptor = "Z")
	private boolean aBoolean280 = false;

	@OriginalMember(owner = "client!qc", name = "hb", descriptor = "I")
	private int anInt3997 = 0;

	@OriginalMember(owner = "client!qc", name = "fb", descriptor = "Z")
	public boolean aBoolean282 = true;

	@OriginalMember(owner = "client!qc", name = "V", descriptor = "I")
	public int anInt3989 = 0;

	@OriginalMember(owner = "client!qc", name = "jb", descriptor = "I")
	public int anInt3999 = 0;

	@OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
	public int movementQueueSize = 0;

	@OriginalMember(owner = "client!qc", name = "S", descriptor = "I")
	public int basId = -1;

	@OriginalMember(owner = "client!qc", name = "ub", descriptor = "I")
	public int seqId = -1;

	@OriginalMember(owner = "client!qc", name = "Ab", descriptor = "I")
	public int attachmentResetAt = 0;

	@OriginalMember(owner = "client!qc", name = "Bb", descriptor = "I")
	public int anInt4011 = -1;

	@OriginalMember(owner = "client!qc", name = "lb", descriptor = "I")
	public int anInt4000 = 0;

	@OriginalMember(owner = "client!qc", name = "yb", descriptor = "I")
	public int turnSpeed = 32;

	@OriginalMember(owner = "client!qc", name = "X", descriptor = "Z")
	public boolean aBoolean281 = false;

	@OriginalMember(owner = "client!qc", name = "Cb", descriptor = "I")
	private int anInt4012 = 0;

	@OriginalMember(owner = "client!qc", name = "L", descriptor = "Ljava/lang/String;")
	public String chatMessage = null;

	@OriginalMember(owner = "client!qc", name = "kb", descriptor = "Z")
	public boolean aBoolean283 = false;

	@OriginalMember(owner = "client!qc", name = "H", descriptor = "[B")
	public final byte[] movementQueueSpeed = new byte[10];

	@OriginalMember(owner = "client!qc", name = "gb", descriptor = "I")
	public int seqDelay = 0;

	@OriginalMember(owner = "client!qc", name = "pb", descriptor = "Z")
	public boolean aBoolean284 = false;

	@OriginalMember(owner = "client!qc", name = "mb", descriptor = "I")
	public int anInt4001 = 0;

	@OriginalMember(owner = "client!qc", name = "sb", descriptor = "I")
	public int movementSeqId = -1;

	@OriginalMember(owner = "client!qc", name = "Z", descriptor = "I")
	private int anInt3992 = 0;

	@OriginalMember(owner = "client!qc", name = "Nb", descriptor = "I")
	public int chatLoops = 100;

	@OriginalMember(owner = "client!qc", name = "Tb", descriptor = "I")
	private int anInt4029 = 0;

	@OriginalMember(owner = "client!qc", name = "ib", descriptor = "I")
	public int chatEffect = 0;

	@OriginalMember(owner = "client!qc", name = "Ub", descriptor = "I")
	public int anInt4030 = 0;

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
	public int spotAnimId = -1;

	@OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
	public int anInt3970 = 0;

	@OriginalMember(owner = "client!qc", name = "Jb", descriptor = "I")
	public int anInt4019 = -1;

	@OriginalMember(owner = "client!qc", name = "E", descriptor = "I")
	public int anInt3976 = -1;

	@OriginalMember(owner = "client!qc", name = "Eb", descriptor = "I")
	public int faceX = 0;

	@OriginalMember(owner = "client!qc", name = "Qb", descriptor = "I")
	public int anInt4026 = 0;

	@OriginalMember(owner = "client!qc", name = "nb", descriptor = "[I")
	public final int[] hitVisibleUntil = new int[4];

	@OriginalMember(owner = "client!qc", name = "Gb", descriptor = "I")
	protected int minY = -32768;

	@OriginalMember(owner = "client!qc", name = "M", descriptor = "I")
	public int chatColor = 0;

	@OriginalMember(owner = "client!qc", name = "dc", descriptor = "I")
	private int anInt4039 = 0;

	@OriginalMember(owner = "client!qc", name = "ac", descriptor = "I")
	private int anInt4036 = 0;

	@OriginalMember(owner = "client!qc", name = "Fb", descriptor = "I")
	public int anInt4015 = 0;

	@OriginalMember(owner = "client!qc", name = "B", descriptor = "[I")
	public final int[] hitDamages = new int[4];

	@OriginalMember(owner = "client!qc", name = "bb", descriptor = "I")
	public int hitpointsBarVisibleUntil = -1000;

	@OriginalMember(owner = "client!qc", name = "bc", descriptor = "I")
	public int movementBlockedLoops = 0;

	@OriginalMember(owner = "client!qc", name = "fc", descriptor = "[I")
	public final int[] movementQueueZ = new int[10];

	@OriginalMember(owner = "client!qc", name = "Sb", descriptor = "I")
	private int anInt4028 = 0;

	@OriginalMember(owner = "client!qc", name = "Kb", descriptor = "I")
	public int anInt4020 = 0;

	@OriginalMember(owner = "client!qc", name = "cb", descriptor = "I")
	public int anInt3994 = 0;

	@OriginalMember(owner = "client!qc", name = "W", descriptor = "I")
	public int lastSeenLoop = 0;

	@OriginalMember(owner = "client!qc", name = "qb", descriptor = "I")
	public int faceY = 0;

	@OriginalMember(owner = "client!qc", name = "hc", descriptor = "I")
	public int attachmentSetAt = 0;

	@OriginalMember(owner = "client!qc", name = "lc", descriptor = "I")
	public int anInt4046 = 0;

	@OriginalMember(owner = "client!qc", name = "jc", descriptor = "I")
	public int anInt4044 = 0;

	@OriginalMember(owner = "client!qc", name = "vb", descriptor = "Z")
	protected boolean aBoolean285 = false;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BIIIZ)V")
	public final void teleport(@OriginalArg(3) int x, @OriginalArg(1) int z, @OriginalArg(4) boolean clearMovementQueue, @OriginalArg(2) int size) {
		if (this.seqId != -1 && SeqTypeList.get(this.seqId).anInt1237 == 1) {
			this.seqId = -1;
		}
		if (this.spotAnimId != -1) {
			@Pc(39) SpotAnimType type = SpotAnimTypeList.get(this.spotAnimId);
			if (type.loop && SeqTypeList.get(type.seqId).anInt1237 == 1) {
				this.spotAnimId = -1;
			}
		}
		if (!clearMovementQueue) {
			@Pc(63) int dx = x - this.movementQueueX[0];
			@Pc(71) int dz = z - this.movementQueueZ[0];
			if (dx >= -8 && dx <= 8 && dz >= -8 && dz <= 8) {
				if (this.movementQueueSize < 9) {
					this.movementQueueSize++;
				}
				for (@Pc(103) int i = this.movementQueueSize; i > 0; i--) {
					this.movementQueueX[i] = this.movementQueueX[i - 1];
					this.movementQueueZ[i] = this.movementQueueZ[i - 1];
					this.movementQueueSpeed[i] = this.movementQueueSpeed[i - 1];
				}
				this.movementQueueX[0] = x;
				this.movementQueueSpeed[0] = 1;
				this.movementQueueZ[0] = z;
				return;
			}
		}
		this.anInt4030 = 0;
		this.movementBlockedLoops = 0;
		this.movementQueueX[0] = x;
		this.movementQueueZ[0] = z;
		this.zFine = this.movementQueueZ[0] * 128 + size * 64;
		this.movementQueueSize = 0;
		this.xFine = this.movementQueueX[0] * 128 + size * 64;
		if (GlRenderer.enabled && PlayerList.self == this) {
			Static17.method1655();
		}
		if (this.particleSystem != null) {
			this.particleSystem.method2952();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)I")
	protected abstract int getBasId();

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIII)V")
	public final void addHit(@OriginalArg(0) int loop, @OriginalArg(2) int type, @OriginalArg(3) int damage) {
		for (@Pc(7) int i = 0; i < 4; i++) {
			if (loop >= this.hitVisibleUntil[i]) {
				this.hitDamages[i] = damage;
				this.hitTypes[i] = type;
				this.hitVisibleUntil[i] = loop + 70;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!vg;)V")
	protected final void method3305(@OriginalArg(1) Model arg0) {
		@Pc(9) BasType local9 = this.getBasType();
		if (local9.anInt850 == 0 && local9.anInt851 == 0) {
			return;
		}
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		if (this.aBoolean283 && this.anInt4020 != 0) {
			local21 = local9.anInt851;
			if (this.anInt4020 < 0) {
				local19 = -local9.anInt850;
			} else {
				local19 = local9.anInt850;
			}
		}
		if (local9.anInt856 != 0) {
			if (this.anInt3978 != local19) {
				if (this.anInt4039 > 0 && local19 > this.anInt3972) {
					@Pc(83) int local83 = this.anInt4039 * this.anInt4039 / (local9.anInt856 * 2);
					@Pc(89) int local89 = local19 - this.anInt3972;
					if (local83 <= local89) {
						this.aBoolean279 = true;
						this.anInt4028 = (this.anInt3972 + local19 - local83) / 2;
						@Pc(122) int local122 = local9.anInt838 * local9.anInt838 / (local9.anInt856 * 2);
						@Pc(127) int local127 = local19 - local122;
						if (this.anInt4028 < local127) {
							this.anInt4028 = local127;
						}
					} else {
						this.aBoolean279 = false;
					}
				} else if (this.anInt4039 < 0 && this.anInt3972 > local19) {
					@Pc(171) int local171 = this.anInt4039 * this.anInt4039 / (local9.anInt856 * 2);
					@Pc(176) int local176 = local19 - this.anInt3972;
					if (local176 >= local171) {
						this.anInt4028 = (local19 + local171 + this.anInt3972) / 2;
						@Pc(200) int local200 = local9.anInt838 * local9.anInt838 / (local9.anInt856 * 2);
						this.aBoolean279 = true;
						@Pc(207) int local207 = local200 + local19;
						if (this.anInt4028 > local207) {
							this.anInt4028 = local207;
						}
					} else {
						this.aBoolean279 = false;
					}
				} else {
					this.aBoolean279 = false;
				}
				this.anInt3978 = local19;
			}
			if (this.anInt4039 == 0) {
				@Pc(243) int local243 = this.anInt3978 - this.anInt3972;
				if (local243 > -local9.anInt856 && local9.anInt856 > local243) {
					this.anInt3972 = this.anInt3978;
				} else {
					@Pc(269) int local269 = local9.anInt838 * local9.anInt838 / (local9.anInt856 * 2);
					this.anInt4028 = (this.anInt3978 + this.anInt3972) / 2;
					if (local243 < 0) {
						@Pc(288) int local288 = this.anInt3978 + local269;
						this.anInt4039 = -local9.anInt856;
						if (this.anInt4028 > local288) {
							this.anInt4028 = local288;
						}
					} else {
						@Pc(312) int local312 = this.anInt3978 - local269;
						this.anInt4039 = local9.anInt856;
						if (local312 > this.anInt4028) {
							this.anInt4028 = local312;
						}
					}
					this.aBoolean279 = true;
				}
			} else if (this.anInt4039 <= 0) {
				if (this.anInt4028 >= this.anInt3972) {
					this.aBoolean279 = false;
				}
				if (!this.aBoolean279) {
					this.anInt4039 += local9.anInt856;
					if (this.anInt4039 > 0) {
						this.anInt4039 = 0;
					}
				} else if (this.anInt4039 > -local9.anInt838) {
					this.anInt4039 -= local9.anInt856;
				}
			} else {
				if (this.anInt4028 <= this.anInt3972) {
					this.aBoolean279 = false;
				}
				if (!this.aBoolean279) {
					this.anInt4039 -= local9.anInt856;
					if (this.anInt4039 < 0) {
						this.anInt4039 = 0;
					}
				} else if (this.anInt4039 < local9.anInt838) {
					this.anInt4039 += local9.anInt856;
				}
			}
			this.anInt3972 += this.anInt4039;
			if (this.anInt3972 != 0) {
				@Pc(445) int local445 = this.anInt3972 >> 5 & 0x7FF;
				@Pc(450) int local450 = arg0.getMinY() / 2;
				arg0.translate(0, -local450, 0);
				arg0.method3817(local445);
				arg0.translate(0, local450, 0);
			}
		}
		if (local9.anInt863 == 0) {
			return;
		}
		if (local21 != this.anInt4012) {
			if (this.anInt4036 > 0 && local21 > this.anInt3997) {
				@Pc(568) int local568 = local21 - this.anInt3997;
				@Pc(579) int local579 = this.anInt4036 * this.anInt4036 / (local9.anInt863 * 2);
				if (local579 > local568) {
					this.aBoolean280 = false;
				} else {
					this.aBoolean280 = true;
					@Pc(601) int local601 = local9.anInt848 * local9.anInt848 / (local9.anInt863 * 2);
					this.anInt3967 = (local21 + this.anInt3997 - local579) / 2;
					@Pc(616) int local616 = local21 - local601;
					if (this.anInt3967 < local616) {
						this.anInt3967 = local616;
					}
				}
			} else if (this.anInt4036 < 0 && local21 < this.anInt3997) {
				@Pc(506) int local506 = this.anInt4036 * this.anInt4036 / (local9.anInt863 * 2);
				@Pc(512) int local512 = local21 - this.anInt3997;
				if (local506 > local512) {
					this.aBoolean280 = false;
				} else {
					this.aBoolean280 = true;
					this.anInt3967 = (local21 + local506 + this.anInt3997) / 2;
					@Pc(544) int local544 = local9.anInt848 * local9.anInt848 / (local9.anInt863 * 2);
					@Pc(548) int local548 = local544 + local21;
					if (local548 < this.anInt3967) {
						this.anInt3967 = local548;
					}
				}
			} else {
				this.aBoolean280 = false;
			}
			this.anInt4012 = local21;
		}
		if (this.anInt4036 == 0) {
			@Pc(735) int local735 = this.anInt4012 - this.anInt3997;
			if (-local9.anInt863 < local735 && local735 < local9.anInt863) {
				this.anInt3997 = this.anInt4012;
			} else {
				this.anInt3967 = (this.anInt4012 + this.anInt3997) / 2;
				@Pc(770) int local770 = local9.anInt848 * local9.anInt848 / (local9.anInt863 * 2);
				this.aBoolean280 = true;
				if (local735 < 0) {
					@Pc(783) int local783 = local770 + this.anInt4012;
					if (this.anInt3967 > local783) {
						this.anInt3967 = local783;
					}
					this.anInt4036 = -local9.anInt863;
				} else {
					this.anInt4036 = local9.anInt863;
					@Pc(807) int local807 = this.anInt4012 - local770;
					if (this.anInt3967 < local807) {
						this.anInt3967 = local807;
					}
				}
			}
		} else if (this.anInt4036 > 0) {
			if (this.anInt3967 <= this.anInt3997) {
				this.aBoolean280 = false;
			}
			if (!this.aBoolean280) {
				this.anInt4036 -= local9.anInt863;
				if (this.anInt4036 < 0) {
					this.anInt4036 = 0;
				}
			} else if (this.anInt4036 < local9.anInt848) {
				this.anInt4036 += local9.anInt863;
			}
		} else {
			if (this.anInt3967 >= this.anInt3997) {
				this.aBoolean280 = false;
			}
			if (!this.aBoolean280) {
				this.anInt4036 += local9.anInt863;
				if (this.anInt4036 > 0) {
					this.anInt4036 = 0;
				}
			} else if (this.anInt4036 > -local9.anInt848) {
				this.anInt4036 -= local9.anInt863;
			}
		}
		this.anInt3997 += this.anInt4036;
		if (this.anInt3997 == 0) {
			return;
		}
		@Pc(840) int local840 = this.anInt3997 >> 5 & 0x7FF;
		@Pc(845) int local845 = arg0.getMinY() / 2;
		arg0.translate(0, -local845, 0);
		arg0.method3832(local840);
		arg0.translate(0, local845, 0);
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)I")
	public final int method3306() {
		return this.minY == -32768 ? 200 : -this.minY;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
	private final void clearMovementQueue() {
		this.anInt4030 = 0;
		this.movementQueueSize = 0;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(III)V")
	public final void move(@OriginalArg(0) int direction, @OriginalArg(2) int speed) {
		@Pc(6) int x = this.movementQueueX[0];
		@Pc(15) int z = this.movementQueueZ[0];
		if (direction == 0) {
			x--;
			z++;
		}
		if (this.seqId != -1 && SeqTypeList.get(this.seqId).anInt1237 == 1) {
			this.seqId = -1;
		}
		if (direction == 1) {
			z++;
		}
		if (this.spotAnimId != -1) {
			@Pc(58) SpotAnimType type = SpotAnimTypeList.get(this.spotAnimId);
			if (type.loop && SeqTypeList.get(type.seqId).anInt1237 == 1) {
				this.spotAnimId = -1;
			}
		}
		if (direction == 2) {
			z++;
			x++;
		}
		if (this.movementQueueSize < 9) {
			this.movementQueueSize++;
		}
		for (@Pc(95) int i = this.movementQueueSize; i > 0; i--) {
			this.movementQueueX[i] = this.movementQueueX[i - 1];
			this.movementQueueZ[i] = this.movementQueueZ[i - 1];
			this.movementQueueSpeed[i] = this.movementQueueSpeed[i - 1];
		}
		this.movementQueueSpeed[0] = (byte) speed;
		if (direction == 3) {
			x--;
		}
		if (direction == 4) {
			x++;
		}
		if (direction == 5) {
			x--;
			z--;
		}
		if (direction == 6) {
			z--;
		}
		if (direction == 7) {
			x++;
			z--;
		}
		this.movementQueueX[0] = x;
		this.movementQueueZ[0] = z;
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)Z")
	public boolean isVisible() {
		return false;
	}

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)I")
	public int getSize() {
		return this.size;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!vg;II)V")
	protected final void method3312(@OriginalArg(0) Model arg0, @OriginalArg(1) int arg1) {
		Static6.anInt4907 = 0;
		Static4.anInt2747 = 0;
		Static5.anInt3525 = 0;
		@Pc(9) BasType type = this.getBasType();
		@Pc(16) int local16 = type.anInt844;
		@Pc(19) int local19 = type.anInt847;
		if (local16 == 0 || local19 == 0) {
			return;
		}
		@Pc(31) int local31 = MathUtils.SINE[arg1];
		@Pc(35) int local35 = MathUtils.COSINE[arg1];
		@Pc(40) int local40 = -local16 / 2;
		@Pc(45) int local45 = -local19 / 2;
		@Pc(55) int local55 = local35 * local45 - local40 * local31 >> 16;
		@Pc(65) int local65 = local35 * local40 + local45 * local31 >> 16;
		@Pc(70) int local70 = -local19 / 2;
		@Pc(82) int local82 = SceneGraph.getTileHeight(Player.level, local65 + this.xFine, local55 + this.zFine);
		@Pc(86) int local86 = local16 / 2;
		@Pc(91) int local91 = -local16 / 2;
		@Pc(102) int local102 = local31 * local70 + local86 * local35 >> 16;
		@Pc(106) int local106 = local19 / 2;
		@Pc(116) int local116 = local35 * local106 - local31 * local91 >> 16;
		@Pc(126) int local126 = local35 * local70 - local31 * local86 >> 16;
		@Pc(136) int local136 = local91 * local35 + local31 * local106 >> 16;
		@Pc(148) int local148 = SceneGraph.getTileHeight(Player.level, local102 + this.xFine, local126 + this.zFine);
		@Pc(161) int local161 = SceneGraph.getTileHeight(Player.level, this.xFine + local136, local116 + this.zFine);
		@Pc(165) int local165 = local16 / 2;
		@Pc(169) int local169 = local19 / 2;
		@Pc(180) int local180 = local31 * local169 + local165 * local35 >> 16;
		@Pc(191) int local191 = local35 * local169 - local31 * local165 >> 16;
		@Pc(204) int local204 = SceneGraph.getTileHeight(Player.level, local180 + this.xFine, this.zFine + local191);
		@Pc(215) int local215 = local204 > local161 ? local161 : local204;
		@Pc(226) int local226 = local161 > local82 ? local82 : local161;
		@Pc(233) int local233 = local82 < local148 ? local82 : local148;
		@Pc(240) int local240 = local148 >= local204 ? local204 : local148;
		Static5.anInt3525 = (int) (Math.atan2((double) (local233 - local215), (double) local19) * 325.95D) & 0x7FF;
		if (Static5.anInt3525 != 0) {
			arg0.method3832(Static5.anInt3525);
		}
		Static6.anInt4907 = (int) (Math.atan2((double) (local226 - local240), (double) local16) * 325.95D) & 0x7FF;
		if (Static6.anInt4907 != 0) {
			arg0.method3817(Static6.anInt4907);
		}
		Static4.anInt2747 = local82 + local204;
		if (Static4.anInt2747 > local161 + local148) {
			Static4.anInt2747 = local148 + local161;
		}
		Static4.anInt2747 = (Static4.anInt2747 >> 1) - this.y;
		if (Static4.anInt2747 != 0) {
			arg0.translate(0, Static4.anInt2747, 0);
		}
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(B)Lclient!d;")
	public final BasType getBasType() {
		@Pc(15) int basId = this.getBasId();
		return basId == -1 ? BasType.DEFAULT : BasTypeList.get(basId);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!vg;BLclient!vg;)V")
	protected final void method3315(@OriginalArg(0) Model arg0, @OriginalArg(2) Model arg1) {
		if (GlRenderer.enabled) {
			@Pc(67) GlModel local67 = (GlModel) arg0;
			@Pc(70) GlModel local70 = (GlModel) arg1;
			if ((this.particleSystem == null || this.particleSystem.stopped) && (local67.particleEmitters != null || local67.particleEffectors != null || local70 != null && (local70.particleEmitters != null || local70.particleEffectors != null))) {
				this.particleSystem = new ParticleSystem(client.loop, this.getSize(), this.getSize());
			}
			if (this.particleSystem != null) {
				this.particleSystem.method2967(local67.particleEmitters, local67.particleEffectors, false, local67.vertexX, local67.vertexY, local67.vertexZ);
			}
		} else {
			@Pc(4) SoftwareModel local4 = (SoftwareModel) arg1;
			@Pc(7) SoftwareModel local7 = (SoftwareModel) arg0;
			if ((this.particleSystem == null || this.particleSystem.stopped) && (local7.particleEmitters != null || local7.particleEffectors != null || local4 != null && (local4.particleEmitters != null || local4.particleEffectors != null))) {
				this.particleSystem = new ParticleSystem(client.loop, this.getSize(), this.getSize());
			}
			if (this.particleSystem != null) {
				this.particleSystem.method2967(local7.particleEmitters, local7.particleEffectors, false, local7.vertexX, local7.vertexY, local7.vertexZ);
			}
		}
		this.aBoolean285 = true;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V")
	public final void setSize(@OriginalArg(1) int size) {
		this.size = size;
	}
}
