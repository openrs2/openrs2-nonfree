import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class IsaacRandom {

	@OriginalMember(owner = "client!m", name = "b", descriptor = "I")
	private int count;

	@OriginalMember(owner = "client!m", name = "e", descriptor = "I")
	private int c;

	@OriginalMember(owner = "client!m", name = "g", descriptor = "I")
	private int b;

	@OriginalMember(owner = "client!m", name = "l", descriptor = "I")
	private int a;

	@OriginalMember(owner = "client!m", name = "m", descriptor = "[I")
	private final int[] rsl = new int[256];

	@OriginalMember(owner = "client!m", name = "n", descriptor = "[I")
	private final int[] mem = new int[256];

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "([I)V")
	public IsaacRandom(@OriginalArg(0) int[] seed) {
		for (@Pc(13) int i = 0; i < seed.length; i++) {
			this.rsl[i] = seed[i];
		}
		this.init();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	private void init() {
		@Pc(8) int h = 0x9E3779B9;
		@Pc(10) int g = 0x9E3779B9;
		@Pc(12) int f = 0x9E3779B9;
		@Pc(14) int e = 0x9E3779B9;
		@Pc(16) int d = 0x9E3779B9;
		@Pc(18) int c = 0x9E3779B9;
		@Pc(20) int b = 0x9E3779B9;
		@Pc(21) int a = 0x9E3779B9;
		for (@Pc(23) int i = 0; i < 4; i++) {
			@Pc(38) int a2 = a ^ b << 11;
			@Pc(42) int d2 = d + a2;
			@Pc(46) int b2 = b + c;
			b2 ^= c >>> 2;
			@Pc(56) int c2 = c + d2;
			c2 ^= d2 << 8;
			@Pc(66) int e2 = e + b2;
			d2 += e2;
			d = d2 ^ e2 >>> 16;
			@Pc(80) int g2 = g + d;
			@Pc(84) int f2 = f + c2;
			e2 += f2;
			e = e2 ^ f2 << 10;
			f2 += g2;
			f = f2 ^ g2 >>> 4;
			@Pc(108) int h2 = h + e;
			g2 += h2;
			a2 += f;
			g = g2 ^ h2 << 8;
			b = b2 + g;
			h2 += a2;
			h = h2 ^ a2 >>> 9;
			a = a2 + b;
			c = c2 + h;
		}
		for (@Pc(149) int i = 0; i < 256; i += 8) {
			@Pc(161) int h2 = h + this.rsl[i + 7];
			@Pc(170) int g2 = g + this.rsl[i + 6];
			@Pc(179) int b2 = b + this.rsl[i + 1];
			@Pc(188) int e2 = e + this.rsl[i + 4];
			@Pc(197) int f2 = f + this.rsl[i + 5];
			@Pc(204) int a2 = a + this.rsl[i];
			a2 ^= b2 << 11;
			@Pc(219) int d2 = d + this.rsl[i + 3];
			@Pc(228) int c2 = c + this.rsl[i + 2];
			b2 += c2;
			b2 ^= c2 >>> 2;
			e2 += b2;
			d2 += a2;
			c2 += d2;
			c2 ^= d2 << 8;
			f2 += c2;
			d2 += e2;
			d = d2 ^ e2 >>> 16;
			g2 += d;
			e2 += f2;
			e = e2 ^ f2 << 10;
			h2 += e;
			f2 += g2;
			f = f2 ^ g2 >>> 4;
			g2 += h2;
			g = g2 ^ h2 << 8;
			a2 += f;
			h2 += a2;
			h = h2 ^ a2 >>> 9;
			b = b2 + g;
			a = a2 + b;
			c = c2 + h;
			this.mem[i] = a;
			this.mem[i + 1] = b;
			this.mem[i + 2] = c;
			this.mem[i + 3] = d;
			this.mem[i + 4] = e;
			this.mem[i + 5] = f;
			this.mem[i + 6] = g;
			this.mem[i + 7] = h;
		}
		for (@Pc(393) int j = 0; j < 256; j += 8) {
			@Pc(407) int e2 = e + this.mem[j + 4];
			@Pc(416) int d2 = d + this.mem[j + 3];
			@Pc(425) int b2 = b + this.mem[j + 1];
			@Pc(434) int c2 = c + this.mem[j + 2];
			@Pc(443) int g2 = g + this.mem[j + 6];
			@Pc(452) int f2 = f + this.mem[j + 5];
			@Pc(459) int a2 = a + this.mem[j];
			@Pc(468) int h2 = h + this.mem[j + 7];
			a2 ^= b2 << 11;
			d2 += a2;
			b2 += c2;
			b2 ^= c2 >>> 2;
			e2 += b2;
			c2 += d2;
			c2 ^= d2 << 8;
			d2 += e2;
			d = d2 ^ e2 >>> 16;
			f2 += c2;
			e2 += f2;
			g2 += d;
			e = e2 ^ f2 << 10;
			h2 += e;
			f2 += g2;
			f = f2 ^ g2 >>> 4;
			a2 += f;
			g2 += h2;
			g = g2 ^ h2 << 8;
			b = b2 + g;
			h2 += a2;
			h = h2 ^ a2 >>> 9;
			a = a2 + b;
			this.mem[j] = a;
			this.mem[j + 1] = b;
			c = c2 + h;
			this.mem[j + 2] = c;
			this.mem[j + 3] = d;
			this.mem[j + 4] = e;
			this.mem[j + 5] = f;
			this.mem[j + 6] = g;
			this.mem[j + 7] = h;
		}
		this.isaac();
		this.count = 256;
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(I)I")
	public int nextInt() {
		if (this.count-- == 0) {
			this.isaac();
			this.count = 255;
		}
		return this.rsl[this.count];
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(I)V")
	private void isaac() {
		this.b += ++this.c;
		for (@Pc(19) int i = 0; i < 256; i++) {
			@Pc(27) int x = this.mem[i];
			if ((i & 0x2) == 0) {
				if ((i & 0x1) == 0) {
					this.a ^= this.a << 13;
				} else {
					this.a ^= this.a >>> 6;
				}
			} else if ((i & 0x1) == 0) {
				this.a ^= this.a << 2;
			} else {
				this.a ^= this.a >>> 16;
			}
			this.a += this.mem[i + 128 & 0xFF];
			@Pc(121) int y;
			this.mem[i] = y = this.b + this.mem[x >> 2 & 0xFF] + this.a;
			this.rsl[i] = this.b = this.mem[y >> 8 >> 2 & 0xFF] + x;
		}
	}
}
