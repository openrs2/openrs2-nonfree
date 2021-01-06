import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class98 {

	@OriginalMember(owner = "client!jk", name = "m", descriptor = "Lclient!ic;")
	private final HashTable vorbisCache = new HashTable(256);

	@OriginalMember(owner = "client!jk", name = "x", descriptor = "Lclient!ic;")
	private final HashTable cache = new HashTable(256);

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "Lclient!fh;")
	private final Js5 vorbisArchive;

	@OriginalMember(owner = "client!jk", name = "l", descriptor = "Lclient!fh;")
	private final Js5 synthArchive;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lclient!fh;Lclient!fh;)V")
	public Class98(@OriginalArg(0) Js5 synthArchive, @OriginalArg(1) Js5 vorbisArchive) {
		this.vorbisArchive = vorbisArchive;
		this.synthArchive = synthArchive;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I[III)Lclient!pb;")
	private PcmSound method2057(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(18) int local18 = arg2 ^ (arg0 >>> 12 | (arg0 & 0x30000FFF) << 4);
		local18 |= arg0 << 16;
		@Pc(31) long local31 = (long) local18;
		@Pc(38) PcmSound local38 = (PcmSound) this.cache.get(local31);
		if (local38 != null) {
			return local38;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(57) SynthSound local57 = SynthSound.create(this.synthArchive, arg0, arg2);
			if (local57 == null) {
				return null;
			}
			@Pc(66) PcmSound local66 = local57.toPcmSound();
			this.cache.put(local31, local66);
			if (arg1 != null) {
				arg1[0] -= local66.samples.length;
			}
			return local66;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "([III)Lclient!pb;")
	public final PcmSound method2058(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.vorbisArchive.capacity() == 1) {
			return this.method2059(arg1, 0, arg0);
		} else if (this.vorbisArchive.getGroupCapacity(arg1) == 1) {
			return this.method2059(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(III[I)Lclient!pb;")
	private PcmSound method2059(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = arg0 ^ ((arg1 & 0x60000FFF) << 4 | arg1 >>> 12);
		local15 |= arg1 << 16;
		@Pc(26) long local26 = (long) local15 ^ 0x100000000L;
		@Pc(33) PcmSound local33 = (PcmSound) this.cache.get(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(64) VorbisSound local64 = (VorbisSound) this.vorbisCache.get(local26);
			if (local64 == null) {
				local64 = VorbisSound.create(this.vorbisArchive, arg1, arg0);
				if (local64 == null) {
					return null;
				}
				this.vorbisCache.put(local26, local64);
			}
			@Pc(87) PcmSound local87 = local64.toPcmSound(arg2);
			if (local87 == null) {
				return null;
			} else {
				local64.unlink();
				this.cache.put(local26, local87);
				return local87;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I[II)Lclient!pb;")
	public final PcmSound method2061(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.synthArchive.capacity() == 1) {
			return this.method2057(0, arg0, arg1);
		} else if (this.synthArchive.getGroupCapacity(arg1) == 1) {
			return this.method2057(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
