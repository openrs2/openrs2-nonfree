import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Bzip2Decompressor {
	@OriginalMember(owner = "client!bm", name = "a", descriptor = "Lclient!kf;")
	private static final Bzip2DState state = new Bzip2DState();

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "([BI[BII)I")
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

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "(Lclient!kf;)V")
	private static void decompress(@OriginalArg(0) Bzip2DState state) {
		state.blockSize100k = 1;
		if (Bzip2DState.tt == null) {
			Bzip2DState.tt = new int[state.blockSize100k * 100000];
		}
		@Pc(56) boolean gotoBzXBlkhdr1 = true;
		while (true) {
			while (gotoBzXBlkhdr1) {
				@Pc(61) byte uc = getUchar(state);
				if (uc == 0x17) {
					return;
				}
				@Pc(68) byte uc2 = getUchar(state);
				uc2 = getUchar(state);
				uc2 = getUchar(state);
				uc2 = getUchar(state);
				uc2 = getUchar(state);
				uc2 = getUchar(state);
				uc2 = getUchar(state);
				uc2 = getUchar(state);
				uc2 = getUchar(state);
				uc2 = getBit(state);
				if (uc2 != 0) {
				}
				state.origPtr = 0;
				@Pc(103) byte uc3 = getUchar(state);
				state.origPtr = state.origPtr << 8 | uc3 & 0xFF;
				uc3 = getUchar(state);
				state.origPtr = state.origPtr << 8 | uc3 & 0xFF;
				uc3 = getUchar(state);
				state.origPtr = state.origPtr << 8 | uc3 & 0xFF;
				for (@Pc(141) int i = 0; i < 16; i++) {
					@Pc(147) byte uc4 = getBit(state);
					if (uc4 == 1) {
						state.inUse16[i] = true;
					} else {
						state.inUse16[i] = false;
					}
				}
				for (@Pc(165) int i = 0; i < 256; i++) {
					state.inUse[i] = false;
				}
				for (@Pc(177) int i = 0; i < 16; i++) {
					if (state.inUse16[i]) {
						for (@Pc(187) int j = 0; j < 16; j++) {
							@Pc(193) byte uc4 = getBit(state);
							if (uc4 == 1) {
								state.inUse[i * 16 + j] = true;
							}
						}
					}
				}
				makeMapsD(state);
				@Pc(216) int alphaSize = state.nInUse + 2;
				@Pc(220) int nGroups = getBits(3, state);
				@Pc(224) int nSelectors = getBits(15, state);
				for (@Pc(226) int i = 0; i < nSelectors; i++) {
					@Pc(231) int j = 0;
					while (true) {
						@Pc(234) byte uc4 = getBit(state);
						if (uc4 == 0) {
							state.selectorMtf[i] = (byte) j;
							break;
						}
						j++;
					}
				}
				@Pc(250) byte[] pos = new byte[6];
				@Pc(252) byte v = 0;
				while (v < nGroups) {
					pos[v] = v++;
				}
				for (@Pc(267) int i = 0; i < nSelectors; i++) {
					@Pc(275) byte v2 = state.selectorMtf[i];
					@Pc(279) byte tmp = pos[v2];
					while (v2 > 0) {
						pos[v2] = pos[v2 - 1];
						v2--;
					}
					pos[0] = tmp;
					state.selector[i] = tmp;
				}
				for (@Pc(308) int t = 0; t < nGroups; t++) {
					@Pc(315) int curr = getBits(5, state);
					for (@Pc(317) int i = 0; i < alphaSize; i++) {
						while (true) {
							@Pc(323) byte uc4 = getBit(state);
							if (uc4 == 0) {
								state.len[t][i] = (byte) curr;
								break;
							}
							@Pc(329) byte uc5 = getBit(state);
							if (uc5 == 0) {
								curr++;
							} else {
								curr--;
							}
						}
					}
				}
				for (@Pc(349) int t = 0; t < nGroups; t++) {
					@Pc(354) byte minLen = 32;
					@Pc(356) byte maxLen = 0;
					for (@Pc(358) int i = 0; i < alphaSize; i++) {
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
				@Pc(425) int eob = state.nInUse + 1;
				@Pc(427) byte groupNo = -1;
				for (@Pc(431) int i = 0; i <= 255; i++) {
					state.unfztab[i] = 0;
				}
				@Pc(443) int kk = 4095;
				for (@Pc(445) int ii = 15; ii >= 0; ii--) {
					for (@Pc(449) int jj = 15; jj >= 0; jj--) {
						state.mfta[kk] = (byte) (ii * 16 + jj);
						kk--;
					}
					state.mtfbase[ii] = kk + 1;
				}
				@Pc(475) int nblock = 0;
				@Pc(478) int groupNo2 = groupNo + 1;
				@Pc(480) byte groupPos = 50;
				@Pc(485) byte gSel = state.selector[0];
				@Pc(490) int gMinlen = state.minLens[gSel];
				@Pc(495) int[] gLimit = state.limit[gSel];
				@Pc(500) int[] gPerm = state.perm[gSel];
				@Pc(505) int[] gBase = state.base[gSel];
				@Pc(506) int groupPos2 = groupPos - 1;
				@Pc(508) int zn = gMinlen;
				@Pc(512) int zvec;
				@Pc(522) byte zj;
				for (zvec = getBits(gMinlen, state); zvec > gLimit[zn]; zvec = zvec << 1 | zj) {
					zn++;
					zj = getBit(state);
				}
				@Pc(537) int nextSym = gPerm[zvec - gBase[zn]];
				while (true) {
					while (nextSym != eob) {
						if (nextSym == 0 || nextSym == 1) {
							@Pc(548) int es = -1;
							@Pc(550) int n = 1;
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
									@Pc(582) byte gSel2 = state.selector[groupNo2];
									gMinlen = state.minLens[gSel2];
									gLimit = state.limit[gSel2];
									gPerm = state.perm[gSel2];
									gBase = state.base[gSel2];
								}
								groupPos2--;
								@Pc(605) int zn2 = gMinlen;
								@Pc(609) int zvec2;
								@Pc(619) byte zj2;
								for (zvec2 = getBits(gMinlen, state); zvec2 > gLimit[zn2]; zvec2 = zvec2 << 1 | zj2) {
									zn2++;
									zj2 = getBit(state);
								}
								nextSym = gPerm[zvec2 - gBase[zn2]];
							} while (nextSym == 0 || nextSym == 1);
							@Pc(640) int es2 = es + 1;
							@Pc(653) byte uc4 = state.seqToUnseq[state.mfta[state.mtfbase[0]] & 0xFF];
							@Pc(655) int[] unfztab = state.unfztab;
							unfztab[uc4 & 0xFF] += es2;
							while (es2 > 0) {
								Bzip2DState.tt[nblock] = uc4 & 0xFF;
								nblock++;
								es2--;
							}
						} else {
							@Pc(678) int nn = nextSym - 1;
							@Pc(693) byte uc4;
							if (nn < 16) {
								@Pc(686) int pp = state.mtfbase[0];
								uc4 = state.mfta[pp + nn];
								while (nn > 3) {
									@Pc(700) int z = pp + nn;
									state.mfta[z] = state.mfta[z - 1];
									state.mfta[z - 1] = state.mfta[z - 2];
									state.mfta[z - 2] = state.mfta[z - 3];
									state.mfta[z - 3] = state.mfta[z - 4];
									nn -= 4;
								}
								while (nn > 0) {
									state.mfta[pp + nn] = state.mfta[pp + nn - 1];
									nn--;
								}
								state.mfta[pp] = uc4;
							} else {
								@Pc(776) int lno = nn / 16;
								@Pc(780) int off = nn % 16;
								@Pc(787) int pp2 = state.mtfbase[lno] + off;
								uc4 = state.mfta[pp2];
								while (pp2 > state.mtfbase[lno]) {
									state.mfta[pp2] = state.mfta[pp2 - 1];
									pp2--;
								}
								state.mtfbase[lno]++;
								while (lno > 0) {
									state.mtfbase[lno]--;
									state.mfta[state.mtfbase[lno]] = state.mfta[state.mtfbase[lno - 1] + 16 - 1];
									lno--;
								}
								state.mtfbase[0]--;
								state.mfta[state.mtfbase[0]] = uc4;
								if (state.mtfbase[0] == 0) {
									@Pc(873) int kk2 = 4095;
									for (@Pc(875) int ii = 15; ii >= 0; ii--) {
										for (@Pc(879) int jj = 15; jj >= 0; jj--) {
											state.mfta[kk2] = state.mfta[state.mtfbase[ii] + jj];
											kk2--;
										}
										state.mtfbase[ii] = kk2 + 1;
									}
								}
							}
							state.unfztab[state.seqToUnseq[uc4 & 0xFF] & 0xFF]++;
							Bzip2DState.tt[nblock] = state.seqToUnseq[uc4 & 0xFF] & 0xFF;
							nblock++;
							if (groupPos2 == 0) {
								groupNo2++;
								groupPos2 = 50;
								@Pc(943) byte gSel2 = state.selector[groupNo2];
								gMinlen = state.minLens[gSel2];
								gLimit = state.limit[gSel2];
								gPerm = state.perm[gSel2];
								gBase = state.base[gSel2];
							}
							groupPos2--;
							@Pc(966) int zn2 = gMinlen;
							@Pc(970) int zvec2;
							@Pc(980) byte zj2;
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
					for (@Pc(1009) int i = 1; i <= 256; i++) {
						state.cftab[i] = state.unfztab[i - 1];
					}
					for (@Pc(1026) int i = 1; i <= 256; i++) {
						@Pc(1031) int[] cftab = state.cftab;
						cftab[i] += state.cftab[i - 1];
					}
					for (@Pc(1046) int i = 0; i < nblock; i++) {
						@Pc(1056) byte uc4 = (byte) (Bzip2DState.tt[i] & 0xFF);
						@Pc(1057) int[] tt = Bzip2DState.tt;
						@Pc(1063) int cftab = state.cftab[uc4 & 0xFF];
						tt[cftab] |= i << 8;
						state.cftab[uc4 & 0xFF]++;
					}
					state.tPos = Bzip2DState.tt[state.origPtr] >> 8;
					state.nblockused = 0;
					state.tPos = Bzip2DState.tt[state.tPos];
					state.k0 = (byte) (state.tPos & 0xFF);
					state.tPos >>= 8;
					state.nblockused++;
					state.saveNblock = nblock;
					unRleObufToOutputFast(state);
					if (state.nblockused == state.saveNblock + 1 && state.stateOutLen == 0) {
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

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(Lclient!kf;)B")
	private static byte getUchar(@OriginalArg(0) Bzip2DState state) {
		return (byte) getBits(8, state);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!kf;)I")
	private static int getBits(@OriginalArg(0) int nn, @OriginalArg(1) Bzip2DState state) {
		while (state.bsLive < nn) {
			state.bsBuff = state.bsBuff << 8 | state.strmNextIn[state.strmNextInPtr] & 0xFF;
			state.bsLive += 8;
			state.strmNextInPtr++;
			state.strmTotalInLo32++;
			if (state.strmTotalInLo32 == 0) {
			}
		}
		@Pc(17) int vvv = state.bsBuff >> state.bsLive - nn & (0x1 << nn) - 1;
		state.bsLive -= nn;
		return vvv;
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(Lclient!kf;)B")
	private static byte getBit(@OriginalArg(0) Bzip2DState state) {
		return (byte) getBits(1, state);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!kf;)V")
	private static void makeMapsD(@OriginalArg(0) Bzip2DState state) {
		state.nInUse = 0;
		for (@Pc(4) int i = 0; i < 256; i++) {
			if (state.inUse[i]) {
				state.seqToUnseq[state.nInUse] = (byte) i;
				state.nInUse++;
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "([I[I[I[BIII)V")
	private static void hbCreateDecodeTables(@OriginalArg(0) int[] limit, @OriginalArg(1) int[] base, @OriginalArg(2) int[] perm, @OriginalArg(3) byte[] length, @OriginalArg(4) int minLen, @OriginalArg(5) int maxLen, @OriginalArg(6) int alphaSize) {
		@Pc(1) int pp = 0;
		for (@Pc(3) int i = minLen; i <= maxLen; i++) {
			for (@Pc(8) int j = 0; j < alphaSize; j++) {
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
			@Pc(102) int vec2 = vec + base[i + 1] - base[i];
			limit[i] = vec2 - 1;
			vec = vec2 << 1;
		}
		for (@Pc(118) int i = minLen + 1; i <= maxLen; i++) {
			base[i] = (limit[i - 1] + 1 << 1) - base[i];
		}
	}

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "(Lclient!kf;)V")
	private static void unRleObufToOutputFast(@OriginalArg(0) Bzip2DState state) {
		@Pc(2) byte cStateOutCh = state.stateOutCh;
		@Pc(5) int cStateOutLen = state.stateOutLen;
		@Pc(8) int cNblockUsed = state.nblockused;
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
			@Pc(62) boolean gotoReturnNotr = true;
			while (gotoReturnNotr) {
				gotoReturnNotr = false;
				if (cNblockUsed == sSaveNblockPp) {
					cStateOutLen = 0;
					break returnNotr;
				}
				cStateOutCh = (byte) cK0;
				@Pc(79) int cTPos2 = cTt[cTPos];
				@Pc(84) byte k1 = (byte) (cTPos2 & 0xFF);
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
			@Pc(131) int cTPos2 = cTt[cTPos];
			@Pc(136) byte k1 = (byte) (cTPos2 & 0xFF);
			cTPos = cTPos2 >> 8;
			cNblockUsed++;
			if (cNblockUsed != sSaveNblockPp) {
				if (k1 == cK0) {
					cStateOutLen = 3;
					@Pc(157) int cTPos3 = cTt[cTPos];
					@Pc(162) byte k12 = (byte) (cTPos3 & 0xFF);
					cTPos = cTPos3 >> 8;
					cNblockUsed++;
					if (cNblockUsed != sSaveNblockPp) {
						if (k12 == cK0) {
							@Pc(181) int cTPos4 = cTt[cTPos];
							@Pc(186) byte k13 = (byte) (cTPos4 & 0xFF);
							cTPos4 >>= 8;
							@Pc(191) int cNblockUsed2 = cNblockUsed + 1;
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
		@Pc(215) int totalOutLo32Old = state.strmTotalOutLo32;
		state.strmTotalOutLo32 += csAvailOutOld - csAvailOut;
		if (state.strmTotalOutLo32 < totalOutLo32Old) {
		}
		state.stateOutCh = cStateOutCh;
		state.stateOutLen = cStateOutLen;
		state.nblockused = cNblockUsed;
		state.k0 = cK0;
		Bzip2DState.tt = cTt;
		state.tPos = cTPos;
		state.strmNextOut = csNextOut;
		state.strmNextOutPtr = csNextOutPtr;
		state.strmAvailOut = csAvailOut;
	}
}
