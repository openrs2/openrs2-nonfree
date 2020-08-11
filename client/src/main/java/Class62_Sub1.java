import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class62_Sub1 extends Class62 {

	@OriginalMember(owner = "client!wb", name = "z", descriptor = "[B")
	private byte[] aByteArray72;

	@OriginalMember(owner = "client!wb", name = "C", descriptor = "Lclient!fo;")
	private Js5Index aClass61_2;

	@OriginalMember(owner = "client!wb", name = "Q", descriptor = "Z")
	private boolean aBoolean395;

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
	private int anInt5783 = 0;

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "Lclient!ic;")
	private final HashTable aClass84_27 = new HashTable(16);

	@OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
	private int anInt5802 = 0;

	@OriginalMember(owner = "client!wb", name = "R", descriptor = "Lclient!ll;")
	private final LinkedList aClass112_29 = new LinkedList();

	@OriginalMember(owner = "client!wb", name = "T", descriptor = "J")
	private long aLong199 = 0L;

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "Lclient!fm;")
	private final Cache aClass60_4;

	@OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
	private final int anInt5790;

	@OriginalMember(owner = "client!wb", name = "P", descriptor = "Z")
	private boolean aBoolean394;

	@OriginalMember(owner = "client!wb", name = "S", descriptor = "Lclient!ll;")
	private LinkedList aClass112_30;

	@OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
	private final int anInt5800;

	@OriginalMember(owner = "client!wb", name = "U", descriptor = "Z")
	private final boolean aBoolean396;

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
	private final int anInt5784;

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "Lclient!ja;")
	private final Js5CacheQueue aClass92_3;

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "Lclient!fm;")
	private final Cache aClass60_3;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "Lclient!en;")
	private final Js5NetQueue aClass51_3;

	@OriginalMember(owner = "client!wb", name = "F", descriptor = "Lclient!ng;")
	private Js5Request aClass4_Sub3_Sub1_1;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(ILclient!fm;Lclient!fm;Lclient!en;Lclient!ja;IIZ)V")
	public Class62_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Cache arg1, @OriginalArg(2) Cache arg2, @OriginalArg(3) Js5NetQueue arg3, @OriginalArg(4) Js5CacheQueue arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.aClass60_4 = arg1;
		this.anInt5790 = arg0;
		if (this.aClass60_4 == null) {
			this.aBoolean394 = false;
		} else {
			this.aBoolean394 = true;
			this.aClass112_30 = new LinkedList();
		}
		this.anInt5800 = arg6;
		this.aBoolean396 = arg7;
		this.anInt5784 = arg5;
		this.aClass92_3 = arg4;
		this.aClass60_3 = arg2;
		this.aClass51_3 = arg3;
		if (this.aClass60_3 != null) {
			this.aClass4_Sub3_Sub1_1 = this.aClass92_3.readSynchronous(this.aClass60_3, this.anInt5790);
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)I")
	public final int method4660() {
		if (this.aClass61_2 == null) {
			return 0;
		} else if (this.aBoolean394) {
			@Pc(27) Node local27 = this.aClass112_30.head();
			return local27 == null ? 0 : (int) local27.key;
		} else {
			return this.aClass61_2.size;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)Lclient!fo;")
	@Override
	public final Js5Index fetchIndex() {
		if (this.aClass61_2 != null) {
			return this.aClass61_2;
		}
		if (this.aClass4_Sub3_Sub1_1 == null) {
			if (this.aClass51_3.isUrgentRequestQueueFull()) {
				return null;
			}
			this.aClass4_Sub3_Sub1_1 = this.aClass51_3.read(255, this.anInt5790, true, (byte) 0);
		}
		if (this.aClass4_Sub3_Sub1_1.incomplete) {
			return null;
		}
		@Pc(53) byte[] local53 = this.aClass4_Sub3_Sub1_1.getData();
		if (this.aClass4_Sub3_Sub1_1 instanceof Js5CacheRequest) {
			try {
				if (local53 == null) {
					throw new RuntimeException();
				}
				this.aClass61_2 = new Js5Index(local53, this.anInt5784);
				if (this.anInt5800 != this.aClass61_2.version) {
					throw new RuntimeException();
				}
			} catch (@Pc(149) RuntimeException local149) {
				this.aClass61_2 = null;
				if (this.aClass51_3.isUrgentRequestQueueFull()) {
					this.aClass4_Sub3_Sub1_1 = null;
				} else {
					this.aClass4_Sub3_Sub1_1 = this.aClass51_3.read(255, this.anInt5790, true, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local53 == null) {
					throw new RuntimeException();
				}
				this.aClass61_2 = new Js5Index(local53, this.anInt5784);
			} catch (@Pc(74) RuntimeException local74) {
				this.aClass51_3.rekey();
				this.aClass61_2 = null;
				if (this.aClass51_3.isUrgentRequestQueueFull()) {
					this.aClass4_Sub3_Sub1_1 = null;
				} else {
					this.aClass4_Sub3_Sub1_1 = this.aClass51_3.read(255, this.anInt5790, true, (byte) 0);
				}
				return null;
			}
			if (this.aClass60_3 != null) {
				this.aClass92_3.write(this.aClass60_3, this.anInt5790, local53);
			}
		}
		if (this.aClass60_4 != null) {
			this.anInt5783 = 0;
			this.aByteArray72 = new byte[this.aClass61_2.capacity];
		}
		this.aClass4_Sub3_Sub1_1 = null;
		return this.aClass61_2;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)I")
	public final int method4664() {
		if (this.fetchIndex() == null) {
			return this.aClass4_Sub3_Sub1_1 == null ? 0 : this.aClass4_Sub3_Sub1_1.getPercentageComplete();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)V")
	@Override
	public final void prefetchGroup(@OriginalArg(0) int group) {
		if (this.aClass60_4 == null) {
			return;
		}
		for (@Pc(22) Node local22 = this.aClass112_29.head(); local22 != null; local22 = this.aClass112_29.next()) {
			if ((long) group == local22.key) {
				return;
			}
		}
		@Pc(48) Node local48 = new Node();
		local48.key = group;
		this.aClass112_29.addTail(local48);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V")
	public final void method4666() {
		if (this.aClass112_30 == null || this.fetchIndex() == null) {
			return;
		}
		for (@Pc(22) Node local22 = this.aClass112_29.head(); local22 != null; local22 = this.aClass112_29.next()) {
			@Pc(32) int local32 = (int) local22.key;
			if (local32 < 0 || this.aClass61_2.capacity <= local32 || this.aClass61_2.groupSizes[local32] == 0) {
				local22.unlink();
			} else {
				if (this.aByteArray72[local32] == 0) {
					this.method4672(local32, 1);
				}
				if (this.aByteArray72[local32] == -1) {
					this.method4672(local32, 2);
				}
				if (this.aByteArray72[local32] == 1) {
					local22.unlink();
				}
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)I")
	public final int method4667() {
		return this.anInt5783;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V")
	public final void method4668() {
		if (this.aClass60_4 != null) {
			this.aBoolean395 = true;
			if (this.aClass112_30 == null) {
				this.aClass112_30 = new LinkedList();
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)[B")
	@Override
	public final byte[] fetchGroup(@OriginalArg(1) int group) {
		@Pc(9) Js5Request local9 = this.method4672(group, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(25) byte[] local25 = local9.getData();
			local9.unlink();
			return local25;
		}
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)I")
	public final int method4671() {
		return this.aClass61_2 == null ? 0 : this.aClass61_2.size;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)I")
	@Override
	public final int getPercentageComplete(@OriginalArg(0) int group) {
		@Pc(9) Js5Request local9 = (Js5Request) this.aClass84_27.get((long) group);
		return local9 == null ? 0 : local9.getPercentageComplete();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)Lclient!ng;")
	private Js5Request method4672(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Js5Request local13 = (Js5Request) this.aClass84_27.get((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.urgent && local13.incomplete) {
			local13.unlink();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.aClass60_4 == null || this.aByteArray72[arg0] == -1) {
					if (this.aClass51_3.isUrgentRequestQueueFull()) {
						return null;
					}
					local13 = this.aClass51_3.read(this.anInt5790, arg0, true, (byte) 2);
				} else {
					local13 = this.aClass92_3.readSynchronous(this.aClass60_4, arg0);
				}
			} else if (arg1 == 1) {
				if (this.aClass60_4 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass92_3.read(this.aClass60_4, arg0);
			} else if (arg1 == 2) {
				if (this.aClass60_4 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray72[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass51_3.isPrefetchRequestQueueFull()) {
					return null;
				}
				local13 = this.aClass51_3.read(this.anInt5790, arg0, false, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass84_27.put((long) arg0, local13);
		}
		if (local13.incomplete) {
			return null;
		}
		@Pc(169) byte[] local169 = local13.getData();
		if (!(local13 instanceof Js5CacheRequest)) {
			try {
				if (local169 == null || local169.length <= 2) {
					throw new RuntimeException();
				}
				Static7.aCRC32_1.reset();
				Static7.aCRC32_1.update(local169, 0, local169.length - 2);
				@Pc(197) int local197 = (int) Static7.aCRC32_1.getValue();
				if (this.aClass61_2.groupChecksums[arg0] != local197) {
					throw new RuntimeException();
				}
				this.aClass51_3.errors = 0;
				this.aClass51_3.state = 0;
			} catch (@Pc(219) RuntimeException local219) {
				this.aClass51_3.rekey();
				local13.unlink();
				if (local13.urgent && !this.aClass51_3.isUrgentRequestQueueFull()) {
					@Pc(244) Js5NetRequest local244 = this.aClass51_3.read(this.anInt5790, arg0, true, (byte) 2);
					this.aClass84_27.put((long) arg0, local244);
				}
				return null;
			}
			local169[local169.length - 2] = (byte) (this.aClass61_2.groupVersions[arg0] >>> 8);
			local169[local169.length - 1] = (byte) this.aClass61_2.groupVersions[arg0];
			if (this.aClass60_4 != null) {
				this.aClass92_3.write(this.aClass60_4, arg0, local169);
				if (this.aByteArray72[arg0] != 1) {
					this.anInt5783++;
					this.aByteArray72[arg0] = 1;
				}
			}
			if (!local13.urgent) {
				local13.unlink();
			}
			return local13;
		}
		try {
			if (local169 == null || local169.length <= 2) {
				throw new RuntimeException();
			}
			Static7.aCRC32_1.reset();
			Static7.aCRC32_1.update(local169, 0, local169.length - 2);
			@Pc(346) int local346 = (int) Static7.aCRC32_1.getValue();
			if (local346 != this.aClass61_2.groupChecksums[arg0]) {
				throw new RuntimeException();
			}
			@Pc(378) int local378 = (local169[local169.length - 1] & 0xFF) + ((local169[local169.length - 2] & 0xFF) << 8);
			if ((this.aClass61_2.groupVersions[arg0] & 0xFFFF) != local378) {
				throw new RuntimeException();
			}
			if (this.aByteArray72[arg0] != 1) {
				if (this.aByteArray72[arg0] != 0) {
				}
				this.anInt5783++;
				this.aByteArray72[arg0] = 1;
			}
			if (!local13.urgent) {
				local13.unlink();
			}
			return local13;
		} catch (@Pc(428) Exception local428) {
			this.aByteArray72[arg0] = -1;
			local13.unlink();
			if (local13.urgent && !this.aClass51_3.isUrgentRequestQueueFull()) {
				@Pc(455) Js5NetRequest local455 = this.aClass51_3.read(this.anInt5790, arg0, true, (byte) 2);
				this.aClass84_27.put((long) arg0, local455);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)V")
	public final void method4673() {
		if (this.aClass112_30 != null) {
			if (this.fetchIndex() == null) {
				return;
			}
			if (this.aBoolean394) {
				@Pc(175) boolean local175 = true;
				for (@Pc(182) Node local182 = this.aClass112_30.head(); local182 != null; local182 = this.aClass112_30.next()) {
					@Pc(188) int local188 = (int) local182.key;
					if (this.aByteArray72[local188] == 0) {
						this.method4672(local188, 1);
					}
					if (this.aByteArray72[local188] == 0) {
						local175 = false;
					} else {
						local182.unlink();
					}
				}
				while (this.anInt5802 < this.aClass61_2.groupSizes.length) {
					if (this.aClass61_2.groupSizes[this.anInt5802] == 0) {
						this.anInt5802++;
					} else {
						if (this.aClass92_3.size >= 250) {
							local175 = false;
							break;
						}
						if (this.aByteArray72[this.anInt5802] == 0) {
							this.method4672(this.anInt5802, 1);
						}
						if (this.aByteArray72[this.anInt5802] == 0) {
							local175 = false;
							@Pc(290) Node local290 = new Node();
							local290.key = this.anInt5802;
							this.aClass112_30.addTail(local290);
						}
						this.anInt5802++;
					}
				}
				if (local175) {
					this.aBoolean394 = false;
					this.anInt5802 = 0;
				}
			} else if (this.aBoolean395) {
				@Pc(31) boolean local31 = true;
				for (@Pc(36) Node local36 = this.aClass112_30.head(); local36 != null; local36 = this.aClass112_30.next()) {
					@Pc(42) int local42 = (int) local36.key;
					if (this.aByteArray72[local42] != 1) {
						this.method4672(local42, 2);
					}
					if (this.aByteArray72[local42] == 1) {
						local36.unlink();
					} else {
						local31 = false;
					}
				}
				while (this.aClass61_2.groupSizes.length > this.anInt5802) {
					if (this.aClass61_2.groupSizes[this.anInt5802] == 0) {
						this.anInt5802++;
					} else {
						if (this.aClass51_3.isPrefetchRequestQueueFull()) {
							local31 = false;
							break;
						}
						if (this.aByteArray72[this.anInt5802] != 1) {
							this.method4672(this.anInt5802, 2);
						}
						if (this.aByteArray72[this.anInt5802] != 1) {
							local31 = false;
							@Pc(145) Node local145 = new Node();
							local145.key = this.anInt5802;
							this.aClass112_30.addTail(local145);
						}
						this.anInt5802++;
					}
				}
				if (local31) {
					this.aBoolean395 = false;
					this.anInt5802 = 0;
				}
			} else {
				this.aClass112_30 = null;
			}
		}
		if (!this.aBoolean396 || this.aLong199 > MonotonicClock.currentTimeMillis()) {
			return;
		}
		for (@Pc(335) Js5Request local335 = (Js5Request) this.aClass84_27.head(); local335 != null; local335 = (Js5Request) this.aClass84_27.next()) {
			if (!local335.incomplete) {
				if (local335.aBoolean365) {
					if (!local335.urgent) {
						throw new RuntimeException();
					}
					local335.unlink();
				} else {
					local335.aBoolean365 = true;
				}
			}
		}
		this.aLong199 = MonotonicClock.currentTimeMillis() + 1000L;
	}
}
