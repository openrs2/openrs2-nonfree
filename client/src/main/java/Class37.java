import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class37 {

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
	public int anInt892;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
	private int anInt893;

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
	public int anInt895;

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
	public int anInt898;

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
	public int anInt900;

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
	public int anInt903;

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
	public int anInt904;

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
	public int anInt906;

	@OriginalMember(owner = "client!dc", name = "s", descriptor = "I")
	public int anInt907;

	@OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
	public int anInt911;

	@OriginalMember(owner = "client!dc", name = "A", descriptor = "J")
	public long aLong39;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
	public int anInt905 = 0;

	@OriginalMember(owner = "client!dc", name = "t", descriptor = "I")
	public int anInt908 = 0;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!fd;II)V")
	private void method740(@OriginalArg(0) Buffer arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt893 = arg0.readUnsignedShort();
		} else if (arg1 == 2) {
			arg0.readUnsignedByte();
		} else if (arg1 == 3) {
			this.anInt898 = arg0.readInt();
			this.anInt903 = arg0.readInt();
			this.anInt892 = arg0.readInt();
		} else if (arg1 == 4) {
			this.anInt895 = arg0.readUnsignedByte();
			this.anInt911 = arg0.readInt();
		} else if (arg1 == 6) {
			this.anInt907 = arg0.readUnsignedByte();
		} else if (arg1 == 8) {
			this.anInt908 = 1;
		} else if (arg1 == 9) {
			this.anInt905 = 1;
		} else if (arg1 == 10) {
			this.aBoolean53 = true;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
	public final void method743() {
		this.anInt906 = Class109.anIntArray298[this.anInt893];
		this.anInt904 = (int) Math.sqrt((double) (this.anInt892 * this.anInt892 + this.anInt898 * this.anInt898 + this.anInt903 * this.anInt903));
		if (this.anInt911 == 0) {
			this.anInt911 = 1;
		}
		if (this.anInt895 == 0) {
			this.aLong39 = 2147483647L;
		} else if (this.anInt895 == 1) {
			this.aLong39 = this.anInt904 * 8 / this.anInt911;
			this.aLong39 *= this.aLong39;
		} else if (this.anInt895 == 2) {
			this.aLong39 = this.anInt904 * 8 / this.anInt911;
		}
		if (this.aBoolean53) {
			this.anInt904 *= -1;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!fd;B)V")
	public final void method746(@OriginalArg(0) Buffer arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.readUnsignedByte();
			if (local10 == 0) {
				return;
			}
			this.method740(arg0, local10);
		}
	}
}
