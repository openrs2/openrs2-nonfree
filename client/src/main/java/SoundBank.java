import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class SoundBank {

	@OriginalMember(owner = "client!jk", name = "m", descriptor = "Lclient!ic;")
	private final HashTable vorbisCache = new HashTable(256);

	@OriginalMember(owner = "client!jk", name = "x", descriptor = "Lclient!ic;")
	private final HashTable cache = new HashTable(256);

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "Lclient!fh;")
	private final Js5 vorbisArchive;

	@OriginalMember(owner = "client!jk", name = "l", descriptor = "Lclient!fh;")
	private final Js5 synthArchive;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lclient!fh;Lclient!fh;)V")
	public SoundBank(@OriginalArg(0) Js5 synthArchive, @OriginalArg(1) Js5 vorbisArchive) {
		this.vorbisArchive = vorbisArchive;
		this.synthArchive = synthArchive;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I[III)Lclient!pb;")
	private PcmSound getSynthSound(@OriginalArg(0) int group, @OriginalArg(2) int file, @OriginalArg(1) int[] samplingRates) {
		@Pc(18) int key = file ^ (group >>> 12 | (group & 0x30000FFF) << 4);
		key |= group << 16;
		@Pc(31) long key2 = key;
		@Pc(38) PcmSound sound = (PcmSound) this.cache.get(key2);
		if (sound != null) {
			return sound;
		} else if (samplingRates == null || samplingRates[0] > 0) {
			@Pc(57) SynthSound synthSound = SynthSound.create(this.synthArchive, group, file);
			if (synthSound == null) {
				return null;
			}
			@Pc(66) PcmSound newSound = synthSound.toPcmSound();
			this.cache.put(key2, newSound);
			if (samplingRates != null) {
				samplingRates[0] -= newSound.samples.length;
			}
			return newSound;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "([III)Lclient!pb;")
	public PcmSound getVorbisSound(@OriginalArg(2) int id, @OriginalArg(0) int[] samplingRates) {
		if (this.vorbisArchive.capacity() == 1) {
			return this.getVorbisSound(0, id, samplingRates);
		} else if (this.vorbisArchive.getGroupCapacity(id) == 1) {
			return this.getVorbisSound(id, 0, samplingRates);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(III[I)Lclient!pb;")
	private PcmSound getVorbisSound(@OriginalArg(2) int group, @OriginalArg(0) int file, @OriginalArg(3) int[] samplingRates) {
		@Pc(15) int key = file ^ ((group & 0x60000FFF) << 4 | group >>> 12);
		key |= group << 16;
		@Pc(26) long key2 = (long) key ^ 0x100000000L;
		@Pc(33) PcmSound sound = (PcmSound) this.cache.get(key2);
		if (sound != null) {
			return sound;
		} else if (samplingRates == null || samplingRates[0] > 0) {
			@Pc(64) VorbisSound vorbisSound = (VorbisSound) this.vorbisCache.get(key2);
			if (vorbisSound == null) {
				vorbisSound = VorbisSound.create(this.vorbisArchive, group, file);
				if (vorbisSound == null) {
					return null;
				}
				this.vorbisCache.put(key2, vorbisSound);
			}
			@Pc(87) PcmSound newSound = vorbisSound.toPcmSound(samplingRates);
			if (newSound == null) {
				return null;
			} else {
				vorbisSound.unlink();
				this.cache.put(key2, newSound);
				return newSound;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I[II)Lclient!pb;")
	public PcmSound getSynthSound(@OriginalArg(2) int id, @OriginalArg(1) int[] samplingRates) {
		if (this.synthArchive.capacity() == 1) {
			return this.getSynthSound(0, id, samplingRates);
		} else if (this.synthArchive.getGroupCapacity(id) == 1) {
			return this.getSynthSound(id, 0, samplingRates);
		} else {
			throw new RuntimeException();
		}
	}
}
