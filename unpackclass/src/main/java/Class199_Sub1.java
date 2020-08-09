import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!p")
public final class Class199_Sub1 extends Js5Index {

	@OriginalMember(owner = "unpackclass!p", name = "<init>", descriptor = "([BZZ)V")
	public Class199_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) throws IOException {
		this(arg0, arg1, arg2, false);
	}

	@OriginalMember(owner = "unpackclass!p", name = "<init>", descriptor = "([BZZZ)V")
	private Class199_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) throws IOException {
		super(arg1, arg2);
		this.method4936(new DataInputStream(new ByteArrayInputStream(arg0)), arg3);
	}

	@OriginalMember(owner = "unpackclass!p", name = "a", descriptor = "(Ljava/io/DataInputStream;Z)V")
	private void method4936(@OriginalArg(0) DataInputStream arg0, @OriginalArg(1) boolean arg1) throws IOException {
		@Pc(4) int local4 = arg0.read();
		@Pc(7) int local7 = arg0.readInt();
		@Pc(9) int local9 = local7;
		if (local4 != 0) {
			local7 += 4;
		}
		@Pc(19) Buffer local19 = new Buffer(local7 + 5);
		local19.writeByte(local4);
		local19.writeInt(local9);
		arg0.readFully(local19.bytes, local19.position, local7);
		this.read(local19.bytes);
		for (@Pc(38) int local38 = 0; local38 < super.size; local38++) {
			@Pc(43) int local43 = arg0.read();
			@Pc(46) int local46 = arg0.readInt();
			@Pc(48) int local48 = local46;
			if (local43 != 0) {
				local46 += 4;
			}
			@Pc(58) Buffer local58 = new Buffer(local46 + 5);
			local58.writeByte(local43);
			local58.writeInt(local48);
			while (local46 > 33554432) {
				arg0.readFully(local58.bytes, local58.position, 33554432);
				local58.position += 33554432;
				local46 -= 33554432;
			}
			arg0.readFully(local58.bytes, local58.position, local46);
			if (super.discardPacked) {
				super.packed[super.groupIds[local38]] = local58.bytes;
			} else {
				super.packed[super.groupIds[local38]] = ByteArray.wrap(local58.bytes);
			}
		}
	}
}
