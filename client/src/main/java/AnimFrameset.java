import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class AnimFrameset extends SecondaryNode {

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BILclient!fh;Lclient!fh;Z)Lclient!te;")
	public static AnimFrameset create(@OriginalArg(2) Js5 animsArchive, @OriginalArg(3) Js5 basesArchive, @OriginalArg(1) int id) {
		@Pc(7) boolean ready = true;
		@Pc(12) int[] fileIds = animsArchive.getFileIds(id);
		for (@Pc(14) int i = 0; i < fileIds.length; i++) {
			@Pc(30) byte[] bytes = animsArchive.fetchFileNoDiscard(id, fileIds[i]);
			if (bytes == null) {
				ready = false;
			} else {
				@Pc(52) int baseId = (bytes[0] & 0xFF) << 8 | bytes[1] & 0xFF;
				@Pc(60) byte[] baseBytes = basesArchive.fetchFileNoDiscard(baseId, 0);
				if (baseBytes == null) {
					ready = false;
				}
			}
		}
		if (!ready) {
			return null;
		}
		try {
			return new AnimFrameset(animsArchive, basesArchive, id, false);
		} catch (@Pc(97) Exception ex) {
			return null;
		}
	}

	@OriginalMember(owner = "client!te", name = "B", descriptor = "[Lclient!a;")
	public final AnimFrame[] frames;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!fh;Lclient!fh;IZ)V")
	public AnimFrameset(@OriginalArg(0) Js5 animsArchive, @OriginalArg(1) Js5 basesArchive, @OriginalArg(2) int id, @OriginalArg(3) boolean arg3) {
		@Pc(7) LinkedList bases = new LinkedList();
		@Pc(12) int capacity = animsArchive.getGroupCapacity(id);
		this.frames = new AnimFrame[capacity];
		@Pc(21) int[] fileIds = animsArchive.getFileIds(id);
		for (@Pc(23) int i = 0; i < fileIds.length; i++) {
			@Pc(35) byte[] bytes = animsArchive.fetchFile(id, fileIds[i]);
			@Pc(37) AnimBase base = null;
			@Pc(51) int baseId = (bytes[0] & 0xFF) << 8 | bytes[1] & 0xFF;
			for (@Pc(56) AnimBase b = (AnimBase) bases.head(); b != null; b = (AnimBase) bases.next()) {
				if (baseId == b.id) {
					base = b;
					break;
				}
			}
			if (base == null) {
				@Pc(95) byte[] baseBytes = basesArchive.fetchFileNoDiscard(baseId, 0);
				base = new AnimBase(baseId, baseBytes);
				bases.addTail(base);
			}
			this.frames[fileIds[i]] = new AnimFrame(bytes, base);
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(BI)Z")
	public final boolean method4150(@OriginalArg(1) int frame) {
		return this.frames[frame].aBoolean1;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(II)Z")
	public final boolean method4151(@OriginalArg(1) int frame) {
		return this.frames[frame].aBoolean2;
	}
}
