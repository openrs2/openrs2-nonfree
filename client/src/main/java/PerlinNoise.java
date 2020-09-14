import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class PerlinNoise {
	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(III)I")
	public static int getTileHeight(@OriginalArg(0) int x, @OriginalArg(1) int z) {
		@Pc(39) int height = interpolatedNoise(x + 45365, z + 91923, 4) + (interpolatedNoise(x + 10294, z + 37821, 2) - 128 >> 1) + (interpolatedNoise(x, z, 1) - 128 >> 2) - 128;
		@Pc(47) int height2 = (int) ((double) height * 0.3D) + 35;
		if (height2 < 10) {
			height2 = 10;
		} else if (height2 > 60) {
			height2 = 60;
		}
		return height2;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIII)I")
	private static int interpolatedNoise(@OriginalArg(2) int x, @OriginalArg(0) int z, @OriginalArg(3) int period) {
		@Pc(7) int x2 = x / period;
		@Pc(21) int xt = period - 1 & x;
		@Pc(25) int z2 = z / period;
		@Pc(31) int zt = period - 1 & z;
		@Pc(36) int v1 = smoothNoise(x2, z2);
		@Pc(43) int v2 = smoothNoise(x2 + 1, z2);
		@Pc(50) int v3 = smoothNoise(x2, z2 + 1);
		@Pc(59) int v4 = smoothNoise(x2 + 1, z2 + 1);
		@Pc(66) int i1 = interpolate(v1, v2, xt, period);
		@Pc(73) int i2 = interpolate(v3, v4, xt, period);
		return interpolate(i1, i2, zt, period);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BII)I")
	private static int smoothNoise(@OriginalArg(2) int x, @OriginalArg(1) int z) {
		@Pc(37) int corners = noise(x - 1, z - 1) + noise(x + 1, z - 1) + noise(x - 1, z + 1) + noise(x + 1, z + 1);
		@Pc(71) int sides = noise(x - 1, z) + noise(x + 1, z) + noise(x, z - 1) + noise(x, z + 1);
		@Pc(80) int center = noise(x, z);
		return corners / 16 + sides / 8 + center / 4;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)I")
	private static int noise(@OriginalArg(0) int x, @OriginalArg(2) int z) {
		@Pc(9) int noise = x + z * 57;
		noise ^= noise << 13;
		@Pc(34) int noise2 = (noise * noise * 15731 + 789221) * noise + 1376312589 & Integer.MAX_VALUE;
		return noise2 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIZ)I")
	private static int interpolate(@OriginalArg(2) int a, @OriginalArg(1) int b, @OriginalArg(3) int t, @OriginalArg(0) int period) {
		@Pc(21) int cosine = 65536 - MathUtils.COSINE[t * 1024 / period] >> 1;
		return ((65536 - cosine) * a >> 16) + (cosine * b >> 16);
	}
}
