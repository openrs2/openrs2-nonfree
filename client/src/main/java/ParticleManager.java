import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class ParticleManager {
	@OriginalMember(owner = "client!ne", name = "A", descriptor = "Z")
	public static final boolean DEBUG = false;

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
	public static int poolReaderIndex = 0;

	@OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
	public static int poolWriterIndex = 0;

	@OriginalMember(owner = "client!ne", name = "z", descriptor = "Lclient!ug;")
	public static SceneGraphLinkedList systems;

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "[Lclient!lm;")
	public static Particle[] pool;

	@OriginalMember(owner = "client!ne", name = "B", descriptor = "I")
	public static int running = 0;

	@OriginalMember(owner = "client!ne", name = "y", descriptor = "I")
	public static int particles;

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
	public static int prevParticles = 0;

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "Lclient!ak;")
	public static SecondaryHashTable aClass10_1 = new SecondaryHashTable(8);

	@OriginalMember(owner = "client!ne", name = "eb", descriptor = "I")
	public static int anInt3524 = 0;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!fh;)V")
	public static void init(@OriginalArg(0) Js5 archive) {
		poolReaderIndex = 0;
		poolWriterIndex = 0;
		systems = new SceneGraphLinkedList();
		pool = new Particle[1024];
		ParticleEmitterTypeList.init(archive);
		ParticleEffectorTypeList.init(archive);
	}

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "()V")
	public static void clear() {
		aClass10_1 = new SecondaryHashTable(8);
		anInt3524 = 0;
		for (@Pc(11) ParticleSystem system = (ParticleSystem) systems.head(); system != null; system = (ParticleSystem) systems.next()) {
			system.remove();
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(J)V")
	public static void redraw(@OriginalArg(0) long loop) {
		prevParticles = particles;
		running = 0;
		particles = 0;
		@Pc(8) long start = MonotonicClock.currentTimeMillis();
		for (@Pc(13) ParticleSystem system = (ParticleSystem) systems.head(); system != null; system = (ParticleSystem) systems.next()) {
			if (system.redraw(loop)) {
				running++;
			}
		}
		if (DEBUG && loop % 100L == 0L) {
			System.out.println("Particle system count: " + systems.size() + ", running: " + running + ". Particles: " + particles + ". Time taken: " + (MonotonicClock.currentTimeMillis() - start) + "ms");
		}
	}
}
