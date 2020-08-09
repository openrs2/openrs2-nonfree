import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!p")
public final class Js5File extends Js5Index {

	@OriginalMember(owner = "unpackclass!p", name = "<init>", descriptor = "([BZZ)V")
	public Js5File(@OriginalArg(0) byte[] in, @OriginalArg(1) boolean discardPacked, @OriginalArg(2) boolean discardUnpacked) throws IOException {
		this(in, discardPacked, discardUnpacked, false);
	}

	@OriginalMember(owner = "unpackclass!p", name = "<init>", descriptor = "([BZZZ)V")
	private Js5File(@OriginalArg(0) byte[] in, @OriginalArg(1) boolean discardPacked, @OriginalArg(2) boolean discardUnapcked, @OriginalArg(3) boolean arg3) throws IOException {
		super(discardPacked, discardUnapcked);
		this.read(new DataInputStream(new ByteArrayInputStream(in)), arg3);
	}

	@OriginalMember(owner = "unpackclass!p", name = "a", descriptor = "(Ljava/io/DataInputStream;Z)V")
	private void read(@OriginalArg(0) DataInputStream in, @OriginalArg(1) boolean arg1) throws IOException {
		@Pc(4) int indexType = in.read();
		@Pc(7) int indexRemaining = in.readInt();
		@Pc(9) int indexCompressedLen = indexRemaining;
		if (indexType != 0) {
			indexRemaining += 4;
		}
		@Pc(19) Buffer indexBuffer = new Buffer(indexRemaining + 5);
		indexBuffer.writeByte(indexType);
		indexBuffer.writeInt(indexCompressedLen);
		in.readFully(indexBuffer.bytes, indexBuffer.position, indexRemaining);
		this.read(indexBuffer.bytes);
		for (@Pc(38) int i = 0; i < super.size; i++) {
			@Pc(43) int groupType = in.read();
			@Pc(46) int groupRemaining = in.readInt();
			@Pc(48) int groupCompressedLen = groupRemaining;
			if (groupType != 0) {
				groupRemaining += 4;
			}
			@Pc(58) Buffer groupBuffer = new Buffer(groupRemaining + 5);
			groupBuffer.writeByte(groupType);
			groupBuffer.writeInt(groupCompressedLen);
			while (groupRemaining > 0x2000000) {
				in.readFully(groupBuffer.bytes, groupBuffer.position, 0x2000000);
				groupBuffer.position += 0x2000000;
				groupRemaining -= 0x2000000;
			}
			in.readFully(groupBuffer.bytes, groupBuffer.position, groupRemaining);
			if (super.discardPacked) {
				super.packed[super.groupIds[i]] = groupBuffer.bytes;
			} else {
				super.packed[super.groupIds[i]] = ByteArray.wrap(groupBuffer.bytes);
			}
		}
	}
}
