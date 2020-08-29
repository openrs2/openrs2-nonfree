import java.io.EOFException;
import java.io.IOException;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Cache {

	@OriginalMember(owner = "client!ik", name = "W", descriptor = "[B")
	public static final byte[] buffer = new byte[520];

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "Lclient!wl;")
	private BufferedFile data = null;

	@OriginalMember(owner = "client!fm", name = "p", descriptor = "Lclient!wl;")
	private BufferedFile index = null;

	@OriginalMember(owner = "client!fm", name = "s", descriptor = "I")
	private int maxLen = 65000;

	@OriginalMember(owner = "client!fm", name = "t", descriptor = "I")
	private final int archive;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(ILclient!wl;Lclient!wl;I)V")
	public Cache(@OriginalArg(1) BufferedFile data, @OriginalArg(2) BufferedFile index, @OriginalArg(0) int archive, @OriginalArg(3) int maxLen) {
		this.archive = archive;
		this.maxLen = maxLen;
		this.data = data;
		this.index = index;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IZZI[B)Z")
	private boolean write(@OriginalArg(0) int group, @OriginalArg(4) byte[] bytes, @OriginalArg(3) int len, @OriginalArg(1) boolean overwrite) {
		synchronized (this.data) {
			try {
				@Pc(70) int block;
				if (overwrite) {
					if ((long) (group * 6 + 6) > this.index.length()) {
						@Pc(30) boolean result = false;
						return result;
					}
					this.index.seek((long) (group * 6));
					this.index.read(buffer, 0, 6);
					block = (buffer[5] & 0xFF) + ((buffer[4] & 0xFF) << 8) + ((buffer[3] & 0xFF) << 16);
					if (block <= 0 || (long) block > this.data.length() / 520L) {
						@Pc(84) boolean result = false;
						return result;
					}
				} else {
					block = (int) ((this.data.length() + 519L) / 520L);
					if (block == 0) {
						block = 1;
					}
				}
				buffer[5] = (byte) block;
				buffer[0] = (byte) (len >> 16);
				buffer[1] = (byte) (len >> 8);
				@Pc(126) int blockNum = 0;
				buffer[4] = (byte) (block >> 8);
				@Pc(135) int off = 0;
				buffer[2] = (byte) len;
				buffer[3] = (byte) (block >> 16);
				this.index.seek((long) (group * 6));
				this.index.write(buffer, 0, 6);
				while (true) {
					if (off < len) {
						eof:
						{
							@Pc(167) int nextBlock = 0;
							if (overwrite) {
								this.data.seek((long) (block * 520));
								try {
									this.data.read(buffer, 0, 8);
								} catch (@Pc(190) EOFException ex) {
									break eof;
								}
								nextBlock = (buffer[6] & 0xFF) + ((buffer[4] & 0xFF) << 16) + ((buffer[5] & 0xFF) << 8);
								@Pc(228) int actualBlockNum = ((buffer[2] & 0xFF) << 8) + (buffer[3] & 0xFF);
								@Pc(234) int archive = buffer[7] & 0xFF;
								@Pc(248) int actualGroup = (buffer[1] & 0xFF) + ((buffer[0] & 0xFF) << 8);
								if (group != actualGroup || blockNum != actualBlockNum || archive != this.archive) {
									@Pc(267) boolean result = false;
									return result;
								}
								if (nextBlock < 0 || (long) nextBlock > this.data.length() / 520L) {
									@Pc(289) boolean result = false;
									return result;
								}
							}
							if (nextBlock == 0) {
								overwrite = false;
								nextBlock = (int) ((this.data.length() + 519L) / 520L);
								if (nextBlock == 0) {
									nextBlock++;
								}
								if (nextBlock == block) {
									nextBlock++;
								}
							}
							buffer[1] = (byte) group;
							if (len - off <= 512) {
								nextBlock = 0;
							}
							buffer[5] = (byte) (nextBlock >> 8);
							buffer[4] = (byte) (nextBlock >> 16);
							buffer[6] = (byte) nextBlock;
							buffer[0] = (byte) (group >> 8);
							buffer[2] = (byte) (blockNum >> 8);
							buffer[7] = (byte) this.archive;
							buffer[3] = (byte) blockNum;
							blockNum++;
							@Pc(390) int blockSize = len - off;
							this.data.seek((long) (block * 520));
							if (blockSize > 512) {
								blockSize = 512;
							}
							block = nextBlock;
							this.data.write(buffer, 0, 8);
							this.data.write(bytes, off, blockSize);
							off += blockSize;
							continue;
						}
					}
					@Pc(429) boolean result = true;
					return result;
				}
			} catch (@Pc(433) IOException ex) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public final String toString() {
		return "Cache:" + this.archive;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)[B")
	public final byte[] read(@OriginalArg(0) int group) {
		synchronized (this.data) {
			try {
				if ((long) (group * 6 + 6) > this.index.length()) {
					@Pc(28) Object result = null;
					return (byte[]) result;
				}
				this.index.seek((long) (group * 6));
				this.index.read(buffer, 0, 6);
				@Pc(69) int len = ((buffer[0] & 0xFF) << 16) + ((buffer[1] & 0xFF) << 8) + (buffer[2] & 0xFF);
				@Pc(91) int block = (buffer[5] & 0xFF) + ((buffer[4] & 0xFF) << 8) + ((buffer[3] & 0xFF) << 16);
				if (len < 0 || len > this.maxLen) {
					@Pc(104) Object result = null;
					return (byte[]) result;
				} else if (block <= 0 || (long) block > this.data.length() / 520L) {
					@Pc(124) Object result = null;
					return (byte[]) result;
				} else {
					@Pc(130) byte[] bytes = new byte[len];
					@Pc(132) int blockNum = 0;
					@Pc(134) int off = 0;
					while (off < len) {
						if (block == 0) {
							@Pc(146) Object result = null;
							return (byte[]) result;
						}
						this.data.seek((long) (block * 520));
						@Pc(162) int blockSize = len - off;
						if (blockSize > 512) {
							blockSize = 512;
						}
						this.data.read(buffer, 0, blockSize + 8);
						@Pc(192) int actualBlockNum = (buffer[3] & 0xFF) + ((buffer[2] & 0xFF) << 8);
						@Pc(214) int nextBlock = (buffer[6] & 0xFF) + ((buffer[5] & 0xFF) << 8) + ((buffer[4] & 0xFF) << 16);
						@Pc(228) int actualGroup = (buffer[1] & 0xFF) + ((buffer[0] & 0xFF) << 8);
						@Pc(234) int archive = buffer[7] & 0xFF;
						if (group != actualGroup || actualBlockNum != blockNum || archive != this.archive) {
							@Pc(250) Object result = null;
							return (byte[]) result;
						}
						if (nextBlock < 0 || (long) nextBlock > this.data.length() / 520L) {
							@Pc(267) Object result = null;
							return (byte[]) result;
						}
						for (@Pc(272) int i = 0; i < blockSize; i++) {
							bytes[off++] = buffer[i + 8];
						}
						blockNum++;
						block = nextBlock;
					}
					@Pc(293) byte[] result = bytes;
					return result;
				}
			} catch (@Pc(297) IOException ex) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(I[BII)Z")
	public final boolean write(@OriginalArg(2) int group, @OriginalArg(1) byte[] bytes, @OriginalArg(0) int len) {
		synchronized (this.data) {
			if (len < 0 || len > this.maxLen) {
				throw new IllegalArgumentException();
			}
			@Pc(34) boolean success = this.write(group, bytes, len, true);
			if (!success) {
				success = this.write(group, bytes, len, false);
			}
			return success;
		}
	}
}
