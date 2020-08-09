import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!u")
public final class Bzip2Decompressor {

	@OriginalMember(owner = "unpackclass!u", name = "a", descriptor = "Lunpackclass!h;")
	private static final Bzip2DState state = new Bzip2DState();

	@OriginalMember(owner = "unpackclass!u", name = "a", descriptor = "([BI[BII)I")
	public static int bunzip2(@OriginalArg(0) byte[] dest, @OriginalArg(1) int destLen, @OriginalArg(2) byte[] src, @OriginalArg(3) int srcLen) {
		synchronized (state) {
			state.strmNextIn = src;
			state.strmNextInPtr = 9;
			state.strmNextOut = dest;
			state.strmNextOutPtr = 0;
			state.strmAvailOut = destLen;
			state.bsLive = 0;
			state.bsBuff = 0;
			state.strmTotalInLo32 = 0;
			state.strmTotalOutLo32 = 0;
			decompress(state);
			destLen -= state.strmAvailOut;
			state.strmNextIn = null;
			state.strmNextOut = null;
			return destLen;
		}
	}

	@OriginalMember(owner = "unpackclass!u", name = "a", descriptor = "(Lunpackclass!h;)V")
	private static void unRleObufToOutputFast(@OriginalArg(0) Bzip2DState state) {
		@Pc(2) byte cStateOutCh = state.stateOutCh;
		@Pc(5) int cStateOutLen = state.stateOutLen;
		@Pc(8) int cNblockUsed = state.nblockUsed;
		@Pc(11) int cK0 = state.k0;
		@Pc(13) int[] cTt = Bzip2DState.tt;
		@Pc(16) int cTPos = state.tPos;
		@Pc(19) byte[] csNextOut = state.strmNextOut;
		@Pc(22) int csNextOutPtr = state.strmNextOutPtr;
		@Pc(25) int csAvailOut = state.strmAvailOut;
		@Pc(27) int csAvailOutOld = csAvailOut;
		@Pc(32) int sSaveNblockPp = state.saveNblock + 1;
		returnNotr:
		while (true) {
			if (cStateOutLen > 0) {
				while (true) {
					if (csAvailOut == 0) {
						break returnNotr;
					}
					if (cStateOutLen == 1) {
						if (csAvailOut == 0) {
							cStateOutLen = 1;
							break returnNotr;
						}
						csNextOut[csNextOutPtr] = cStateOutCh;
						csNextOutPtr++;
						csAvailOut--;
						break;
					}
					csNextOut[csNextOutPtr] = cStateOutCh;
					cStateOutLen--;
					csNextOutPtr++;
					csAvailOut--;
				}
			}
			@Pc(60) boolean gotoReturnNotr = true;
			while (gotoReturnNotr) {
				gotoReturnNotr = false;
				if (cNblockUsed == sSaveNblockPp) {
					cStateOutLen = 0;
					break returnNotr;
				}
				cStateOutCh = (byte) cK0;
				@Pc(76) int cTPos2 = cTt[cTPos];
				@Pc(81) byte k1 = (byte) (cTPos2 & 0xFF);
				cTPos = cTPos2 >> 8;
				cNblockUsed++;
				if (k1 != cK0) {
					cK0 = k1;
					if (csAvailOut == 0) {
						cStateOutLen = 1;
						break returnNotr;
					}
					csNextOut[csNextOutPtr] = cStateOutCh;
					csNextOutPtr++;
					csAvailOut--;
					gotoReturnNotr = true;
				} else if (cNblockUsed == sSaveNblockPp) {
					if (csAvailOut == 0) {
						cStateOutLen = 1;
						break returnNotr;
					}
					csNextOut[csNextOutPtr] = cStateOutCh;
					csNextOutPtr++;
					csAvailOut--;
					gotoReturnNotr = true;
				}
			}
			cStateOutLen = 2;
			@Pc(130) int cTPos2 = cTt[cTPos];
			@Pc(135) byte k1 = (byte) (cTPos2 & 0xFF);
			cTPos = cTPos2 >> 8;
			cNblockUsed++;
			if (cNblockUsed != sSaveNblockPp) {
				if (k1 == cK0) {
					cStateOutLen = 3;
					@Pc(155) int cTPos3 = cTt[cTPos];
					@Pc(160) byte k12 = (byte) (cTPos3 & 0xFF);
					cTPos = cTPos3 >> 8;
					cNblockUsed++;
					if (cNblockUsed != sSaveNblockPp) {
						if (k12 == cK0) {
							@Pc(178) int cTPos4 = cTt[cTPos];
							@Pc(183) byte k13 = (byte) (cTPos4 & 0xFF);
							cTPos4 >>= 8;
							@Pc(188) int cNblockUsed2 = cNblockUsed + 1;
							cStateOutLen = (k13 & 0xFF) + 4;
							cTPos4 = cTt[cTPos4];
							cK0 = (byte) (cTPos4 & 0xFF);
							cTPos = cTPos4 >> 8;
							cNblockUsed = cNblockUsed2 + 1;
						} else {
							cK0 = k12;
						}
					}
				} else {
					cK0 = k1;
				}
			}
		}
		@Pc(212) int totalOutLo32Old = state.strmTotalOutLo32;
		state.strmTotalOutLo32 += csAvailOutOld - csAvailOut;
		state.stateOutCh = cStateOutCh;
		state.stateOutLen = cStateOutLen;
		state.nblockUsed = cNblockUsed;
		state.k0 = cK0;
		Bzip2DState.tt = cTt;
		state.tPos = cTPos;
		state.strmNextOut = csNextOut;
		state.strmNextOutPtr = csNextOutPtr;
		state.strmAvailOut = csAvailOut;
	}

	@OriginalMember(owner = "unpackclass!u", name = "b", descriptor = "(Lunpackclass!h;)V")
	private static void decompress(@OriginalArg(0) Bzip2DState state) {
		state.blockSize100k = 1;
		if (Bzip2DState.tt == null) {
			Bzip2DState.tt = new int[state.blockSize100k * 100000];
		}
		@Pc(56) boolean gotoBzXBlkhdr1 = true;
		while (true) {
			while (gotoBzXBlkhdr1) {
				@Pc(60) byte uc = getUchar(state);
				if (uc == 0x17) {
					return;
				}
				@Pc(67) byte uc2 = getUchar(state);
				uc2 = getUchar(state);
				uc2 = getUchar(state);
				uc2 = getUchar(state);
				uc2 = getUchar(state);
				uc2 = getUchar(state);
				uc2 = getUchar(state);
				uc2 = getUchar(state);
				uc2 = getUchar(state);
				uc2 = getBit(state);
				state.origPtr = 0;
				uc2 = getUchar(state);
				state.origPtr = state.origPtr << 8 | uc2 & 0xFF;
				uc2 = getUchar(state);
				state.origPtr = state.origPtr << 8 | uc2 & 0xFF;
				uc2 = getUchar(state);
				state.origPtr = state.origPtr << 8 | uc2 & 0xFF;
				for (@Pc(138) int i = 0; i < 16; i++) {
					@Pc(142) byte uc3 = getBit(state);
					if (uc3 == 1) {
						state.inUse16[i] = true;
					} else {
						state.inUse16[i] = false;
					}
				}
				for (@Pc(162) int i = 0; i < 256; i++) {
					state.inUse[i] = false;
				}
				for (@Pc(174) int i = 0; i < 16; i++) {
					if (state.inUse16[i]) {
						for (@Pc(182) int j = 0; j < 16; j++) {
							@Pc(186) byte uc3 = getBit(state);
							if (uc3 == 1) {
								state.inUse[i * 16 + j] = true;
							}
						}
					}
				}
				makeMapsD(state);
				@Pc(213) int alphaSize = state.nInUse + 2;
				@Pc(217) int nGroups = getBits(3, state);
				@Pc(221) int nSelectors = getBits(15, state);
				for (@Pc(223) int i = 0; i < nSelectors; i++) {
					@Pc(226) int j = 0;
					while (true) {
						@Pc(229) byte uc3 = getBit(state);
						if (uc3 == 0) {
							state.selectorMtf[i] = (byte) j;
							break;
						}
						j++;
					}
				}
				@Pc(246) byte[] pos = new byte[6];
				@Pc(248) byte v = 0;
				while (v < nGroups) {
					pos[v] = v++;
				}
				for (@Pc(263) int i = 0; i < nSelectors; i++) {
					@Pc(269) byte v2 = state.selectorMtf[i];
					@Pc(273) byte tmp = pos[v2];
					while (v2 > 0) {
						pos[v2] = pos[v2 - 1];
						v2--;
					}
					pos[0] = tmp;
					state.selector[i] = tmp;
				}
				for (@Pc(304) int t = 0; t < nGroups; t++) {
					@Pc(309) int curr = getBits(5, state);
					for (@Pc(311) int i = 0; i < alphaSize; i++) {
						while (true) {
							@Pc(315) byte uc3 = getBit(state);
							if (uc3 == 0) {
								state.len[t][i] = (byte) curr;
								break;
							}
							@Pc(320) byte uc4 = getBit(state);
							if (uc4 == 0) {
								curr++;
							} else {
								curr--;
							}
						}
					}
				}
				for (@Pc(344) int t = 0; t < nGroups; t++) {
					@Pc(347) byte minLen = 32;
					@Pc(349) byte maxLen = 0;
					for (@Pc(351) int i = 0; i < alphaSize; i++) {
						if (state.len[t][i] > maxLen) {
							maxLen = state.len[t][i];
						}
						if (state.len[t][i] < minLen) {
							minLen = state.len[t][i];
						}
					}
					hbCreateDecodeTables(state.limit[t], state.base[t], state.perm[t], state.len[t], minLen, maxLen, alphaSize);
					state.minLens[t] = minLen;
				}
				@Pc(420) int eob = state.nInUse + 1;
				@Pc(422) byte groupNo = -1;
				for (@Pc(426) int i = 0; i <= 255; i++) {
					state.unfztab[i] = 0;
				}
				@Pc(438) int kk = 4095;
				for (@Pc(440) int ii = 15; ii >= 0; ii--) {
					for (@Pc(443) int jj = 15; jj >= 0; jj--) {
						state.mtfa[kk] = (byte) (ii * 16 + jj);
						kk--;
					}
					state.mtfbase[ii] = kk + 1;
				}
				@Pc(470) int nblock = 0;
				@Pc(473) int groupNo2 = groupNo + 1;
				@Pc(475) byte groupPos = 50;
				@Pc(480) byte gSel = state.selector[0];
				@Pc(485) int gMinlen = state.minLens[gSel];
				@Pc(490) int[] gLimit = state.limit[gSel];
				@Pc(495) int[] gPerm = state.perm[gSel];
				@Pc(500) int[] gBase = state.base[gSel];
				@Pc(501) int groupPos2 = groupPos - 1;
				@Pc(503) int zn = gMinlen;
				@Pc(507) int zvec;
				@Pc(516) byte zj;
				for (zvec = getBits(gMinlen, state); zvec > gLimit[zn]; zvec = zvec << 1 | zj) {
					zn++;
					zj = getBit(state);
				}
				@Pc(531) int nextSym = gPerm[zvec - gBase[zn]];
				while (true) {
					while (nextSym != eob) {
						if (nextSym == 0 || nextSym == 1) {
							@Pc(541) int es = -1;
							@Pc(543) int n = 1;
							do {
								if (nextSym == 0) {
									es += n;
								} else if (nextSym == 1) {
									es += n * 2;
								}
								n *= 2;
								if (groupPos2 == 0) {
									groupNo2++;
									groupPos2 = 50;
									@Pc(573) byte gSel2 = state.selector[groupNo2];
									gMinlen = state.minLens[gSel2];
									gLimit = state.limit[gSel2];
									gPerm = state.perm[gSel2];
									gBase = state.base[gSel2];
								}
								groupPos2--;
								@Pc(596) int zn2 = gMinlen;
								@Pc(600) int zvec2;
								@Pc(609) byte zj2;
								for (zvec2 = getBits(gMinlen, state); zvec2 > gLimit[zn2]; zvec2 = zvec2 << 1 | zj2) {
									zn2++;
									zj2 = getBit(state);
								}
								nextSym = gPerm[zvec2 - gBase[zn2]];
							} while (nextSym == 0 || nextSym == 1);
							@Pc(630) int es2 = es + 1;
							@Pc(643) byte uc3 = state.seqToUnseq[state.mtfa[state.mtfbase[0]] & 0xFF];
							@Pc(645) int[] unfztab = state.unfztab;
							unfztab[uc3 & 0xFF] += es2;
							while (es2 > 0) {
								Bzip2DState.tt[nblock] = uc3 & 0xFF;
								nblock++;
								es2--;
							}
						} else {
							@Pc(669) int nn = nextSym - 1;
							@Pc(684) byte uc3;
							if (nn < 16) {
								@Pc(677) int pp = state.mtfbase[0];
								uc3 = state.mtfa[pp + nn];
								while (nn > 3) {
									@Pc(689) int z = pp + nn;
									state.mtfa[z] = state.mtfa[z - 1];
									state.mtfa[z - 1] = state.mtfa[z - 2];
									state.mtfa[z - 2] = state.mtfa[z - 3];
									state.mtfa[z - 3] = state.mtfa[z - 4];
									nn -= 4;
								}
								while (nn > 0) {
									state.mtfa[pp + nn] = state.mtfa[pp + nn - 1];
									nn--;
								}
								state.mtfa[pp] = uc3;
							} else {
								@Pc(767) int lno = nn / 16;
								@Pc(771) int off = nn % 16;
								@Pc(778) int pp2 = state.mtfbase[lno] + off;
								uc3 = state.mtfa[pp2];
								while (pp2 > state.mtfbase[lno]) {
									state.mtfa[pp2] = state.mtfa[pp2 - 1];
									pp2--;
								}
								state.mtfbase[lno]++;
								while (lno > 0) {
									state.mtfbase[lno]--;
									state.mtfa[state.mtfbase[lno]] = state.mtfa[state.mtfbase[lno - 1] + 16 - 1];
									lno--;
								}
								state.mtfbase[0]--;
								state.mtfa[state.mtfbase[0]] = uc3;
								if (state.mtfbase[0] == 0) {
									@Pc(864) int kk2 = 4095;
									for (@Pc(866) int ii = 15; ii >= 0; ii--) {
										for (@Pc(869) int jj = 15; jj >= 0; jj--) {
											state.mtfa[kk2] = state.mtfa[state.mtfbase[ii] + jj];
											kk2--;
										}
										state.mtfbase[ii] = kk2 + 1;
									}
								}
							}
							state.unfztab[state.seqToUnseq[uc3 & 0xFF] & 0xFF]++;
							Bzip2DState.tt[nblock] = state.seqToUnseq[uc3 & 0xFF] & 0xFF;
							nblock++;
							if (groupPos2 == 0) {
								groupNo2++;
								groupPos2 = 50;
								@Pc(934) byte gSel2 = state.selector[groupNo2];
								gMinlen = state.minLens[gSel2];
								gLimit = state.limit[gSel2];
								gPerm = state.perm[gSel2];
								gBase = state.base[gSel2];
							}
							groupPos2--;
							@Pc(957) int zn2 = gMinlen;
							@Pc(961) int zvec2;
							@Pc(970) byte zj2;
							for (zvec2 = getBits(gMinlen, state); zvec2 > gLimit[zn2]; zvec2 = zvec2 << 1 | zj2) {
								zn2++;
								zj2 = getBit(state);
							}
							nextSym = gPerm[zvec2 - gBase[zn2]];
						}
					}
					state.stateOutLen = 0;
					state.stateOutCh = 0;
					state.cftab[0] = 0;
					for (@Pc(999) int i = 1; i <= 256; i++) {
						state.cftab[i] = state.unfztab[i - 1];
					}
					for (@Pc(1016) int i = 1; i <= 256; i++) {
						@Pc(1019) int[] cftab = state.cftab;
						cftab[i] += state.cftab[i - 1];
					}
					for (@Pc(1036) int i = 0; i < nblock; i++) {
						@Pc(1044) byte uc3 = (byte) (Bzip2DState.tt[i] & 0xFF);
						@Pc(1045) int[] tt = Bzip2DState.tt;
						@Pc(1051) int cftab = state.cftab[uc3 & 0xFF];
						tt[cftab] |= i << 8;
						state.cftab[uc3 & 0xFF]++;
					}
					state.tPos = Bzip2DState.tt[state.origPtr] >> 8;
					state.nblockUsed = 0;
					state.tPos = Bzip2DState.tt[state.tPos];
					state.k0 = (byte) (state.tPos & 0xFF);
					state.tPos >>= 8;
					state.nblockUsed++;
					state.saveNblock = nblock;
					unRleObufToOutputFast(state);
					if (state.nblockUsed == state.saveNblock + 1 && state.stateOutLen == 0) {
						gotoBzXBlkhdr1 = true;
						break;
					}
					gotoBzXBlkhdr1 = false;
					break;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "unpackclass!u", name = "c", descriptor = "(Lunpackclass!h;)B")
	private static byte getUchar(@OriginalArg(0) Bzip2DState state) {
		return (byte) getBits(8, state);
	}

	@OriginalMember(owner = "unpackclass!u", name = "d", descriptor = "(Lunpackclass!h;)B")
	private static byte getBit(@OriginalArg(0) Bzip2DState state) {
		return (byte) getBits(1, state);
	}

	@OriginalMember(owner = "unpackclass!u", name = "a", descriptor = "(ILunpackclass!h;)I")
	private static int getBits(@OriginalArg(0) int nnn, @OriginalArg(1) Bzip2DState state) {
		while (state.bsLive < nnn) {
			state.bsBuff = state.bsBuff << 8 | state.strmNextIn[state.strmNextInPtr] & 0xFF;
			state.bsLive += 8;
			state.strmNextInPtr++;
			state.strmTotalInLo32++;
		}
		@Pc(17) int vvv = state.bsBuff >> state.bsLive - nnn & (0x1 << nnn) - 1;
		state.bsLive -= nnn;
		return vvv;
	}

	@OriginalMember(owner = "unpackclass!u", name = "e", descriptor = "(Lunpackclass!h;)V")
	private static void makeMapsD(@OriginalArg(0) Bzip2DState state) {
		state.nInUse = 0;
		for (@Pc(4) int i = 0; i < 256; i++) {
			if (state.inUse[i]) {
				state.seqToUnseq[state.nInUse] = (byte) i;
				state.nInUse++;
			}
		}
	}

	@OriginalMember(owner = "unpackclass!u", name = "a", descriptor = "([I[I[I[BIII)V")
	private static void hbCreateDecodeTables(@OriginalArg(0) int[] limit, @OriginalArg(1) int[] base, @OriginalArg(2) int[] perm, @OriginalArg(3) byte[] length, @OriginalArg(4) int minLen, @OriginalArg(5) int maxLen, @OriginalArg(6) int alphaSize) {
		@Pc(1) int pp = 0;
		for (@Pc(3) int i = minLen; i <= maxLen; i++) {
			for (@Pc(6) int j = 0; j < alphaSize; j++) {
				if (length[j] == i) {
					perm[pp] = j;
					pp++;
				}
			}
		}
		for (@Pc(27) int i = 0; i < 23; i++) {
			base[i] = 0;
		}
		for (@Pc(38) int i = 0; i < alphaSize; i++) {
			base[length[i] + 1]++;
		}
		for (@Pc(56) int i = 1; i < 23; i++) {
			base[i] += base[i - 1];
		}
		for (@Pc(74) int i = 0; i < 23; i++) {
			limit[i] = 0;
		}
		@Pc(85) int vec = 0;
		for (@Pc(87) int i = minLen; i <= maxLen; i++) {
			@Pc(100) int vec2 = vec + base[i + 1] - base[i];
			limit[i] = vec2 - 1;
			vec = vec2 << 1;
		}
		for (@Pc(118) int i = minLen + 1; i <= maxLen; i++) {
			base[i] = (limit[i - 1] + 1 << 1) - base[i];
		}
	}
}
