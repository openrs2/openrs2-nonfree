import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class PlayerAppearance {

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "Lclient!qk;")
	public static final PlayerAppearance DEFAULT = new PlayerAppearance();

	@OriginalMember(owner = "client!ti", name = "db", descriptor = "[[S")
	public static final short[][] GAME0_DESTINATION_BODY_COLORS = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "[S")
	public static final short[] GAME0_SOURCE_BODY_COLORS = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "[[S")
	public static final short[][] GAME0_DESTINATION_SKIN_COLORS = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "[S")
	public static final short[] GAME0_SOURCE_SKIN_COLORS = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "[[S")
	public static final short[][] GAME1_DESTINATION_SKIN_COLORS = new short[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 } };

	@OriginalMember(owner = "client!j", name = "x", descriptor = "[S")
	public static final short[] GAME1_SOURCE_BODY_COLORS = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "[S")
	public static final short[] GAME1_SOURCE_SKIN_COLORS = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "[[S")
	public static final short[][] GAME1_DESTINATION_BODY_COLORS = new short[][] { { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 } };

	@OriginalMember(owner = "client!el", name = "f", descriptor = "Lclient!cc;")
	private static final SoftLruHashTable bodyModels = new SoftLruHashTable(260);

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "Lclient!cc;")
	private static final SoftLruHashTable headModels = new SoftLruHashTable(5);

	@OriginalMember(owner = "client!ca", name = "V", descriptor = "[I")
	private static final int[] BASE_PART_MAP = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!rh", name = "jb", descriptor = "[I")
	public static final int[] FEMALE_FEATURES = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!td", name = "n", descriptor = "[I")
	public static final int[] MALE_FEATURES = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!vb", name = "X", descriptor = "[S")
	public static short[] sourceBodyColors;

	@OriginalMember(owner = "client!li", name = "k", descriptor = "[S")
	public static short[] sourceSkinColors;

	@OriginalMember(owner = "client!sm", name = "g", descriptor = "[[S")
	public static short[][] destinationBodyColors;

	@OriginalMember(owner = "client!bn", name = "v", descriptor = "[[S")
	public static short[][] destinationSkinColors;

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)I")
	public static int getModelCacheSize() {
		return bodyModels.size();
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(II)V")
	public static void clean() {
		bodyModels.clean(5);
		headModels.clean(5);
	}

	@OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V")
	public static void removeSoft() {
		bodyModels.removeSoft();
		headModels.removeSoft();
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
	public static void clear() {
		bodyModels.clear();
		headModels.clear();
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "J")
	private long checksum;

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
	private int basId;

	@OriginalMember(owner = "client!qk", name = "p", descriptor = "[I")
	public int[] colors;

	@OriginalMember(owner = "client!qk", name = "q", descriptor = "Z")
	public boolean female;

	@OriginalMember(owner = "client!qk", name = "u", descriptor = "J")
	private long prevChecksum;

	@OriginalMember(owner = "client!qk", name = "w", descriptor = "I")
	public int npcId;

	@OriginalMember(owner = "client!qk", name = "y", descriptor = "[I")
	private int[] identikit;

	@OriginalMember(owner = "client!qk", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BII)V")
	public final void setIdentikit(@OriginalArg(1) int i, @OriginalArg(2) int identikit) {
		@Pc(7) int part = BASE_PART_MAP[i];
		if (this.identikit[part] != 0 && IdkTypeList.get(identikit) != null) {
			this.identikit[part] = Integer.MIN_VALUE | identikit;
			this.updateChecksum();
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZI)V")
	public final void setGender(@OriginalArg(0) boolean female) {
		this.female = female;
		this.updateChecksum();
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
	private void updateChecksum() {
		@Pc(8) long previousChecksum = this.checksum;
		@Pc(10) long[] CRC64_TABLE = BufferedFile.CRC64_TABLE;
		this.checksum = -1L;
		this.checksum = this.checksum >>> 8 ^ CRC64_TABLE[(int) ((this.checksum ^ (long) (this.basId >> 8)) & 0xFFL)];
		this.checksum = this.checksum >>> 8 ^ CRC64_TABLE[(int) ((this.checksum ^ (long) this.basId) & 0xFFL)];
		for (@Pc(53) int i = 0; i < 12; i++) {
			this.checksum = this.checksum >>> 8 ^ CRC64_TABLE[(int) ((this.checksum ^ (long) (this.identikit[i] >> 24)) & 0xFFL)];
			this.checksum = this.checksum >>> 8 ^ CRC64_TABLE[(int) ((this.checksum ^ (long) (this.identikit[i] >> 16)) & 0xFFL)];
			this.checksum = this.checksum >>> 8 ^ CRC64_TABLE[(int) ((this.checksum ^ (long) (this.identikit[i] >> 8)) & 0xFFL)];
			this.checksum = this.checksum >>> 8 ^ CRC64_TABLE[(int) ((this.checksum ^ (long) this.identikit[i]) & 0xFFL)];
		}
		for (@Pc(147) int i = 0; i < 5; i++) {
			this.checksum = this.checksum >>> 8 ^ CRC64_TABLE[(int) ((this.checksum ^ (long) this.colors[i]) & 0xFFL)];
		}
		this.checksum = this.checksum >>> 8 ^ CRC64_TABLE[(int) ((this.checksum ^ (long) (this.female ? 1 : 0)) & 0xFFL)];
		if (previousChecksum != 0L && this.checksum != previousChecksum) {
			bodyModels.remove(previousChecksum);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "([Lclient!re;IIILclient!eg;IIZILclient!eg;ZI)Lclient!vg;")
	public final Model getBodyModel(@OriginalArg(0) Class150[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) SeqType arg4, @OriginalArg(5) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) SeqType arg8, @OriginalArg(10) boolean cache, @OriginalArg(11) int arg10) {
		if (this.npcId != -1) {
			return NpcTypeList.get(this.npcId).getBodyModel(arg5, arg7, arg4, arg8, arg2, arg0, arg3, arg1, arg10);
		}
		@Pc(51) int[] identikit = this.identikit;
		@Pc(54) long checksum = this.checksum;
		if (arg8 != null && (arg8.anInt1224 >= 0 || arg8.anInt1232 >= 0)) {
			identikit = new int[12];
			for (@Pc(75) int i = 0; i < 12; i++) {
				identikit[i] = this.identikit[i];
			}
			if (arg8.anInt1224 >= 0) {
				if (arg8.anInt1224 == 65535) {
					identikit[5] = 0;
					checksum ^= 0xFFFFFFFF00000000L;
				} else {
					identikit[5] = arg8.anInt1224 | 0x40000000;
					checksum ^= (long) identikit[5] << 32;
				}
			}
			if (arg8.anInt1232 >= 0) {
				if (arg8.anInt1232 == 65535) {
					checksum ^= 0xFFFFFFFFL;
					identikit[3] = 0;
				} else {
					identikit[3] = arg8.anInt1232 | 0x40000000;
					checksum ^= identikit[3];
				}
			}
		}
		@Pc(169) Model model = (Model) bodyModels.get(checksum);
		if (model == null) {
			@Pc(174) boolean incomplete = false;
			for (@Pc(176) int i = 0; i < 12; i++) {
				@Pc(185) int id = identikit[i];
				if ((id & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & id) != 0 && !IdkTypeList.get(id & 0x3FFFFFFF).isBodyModelReady()) {
						incomplete = true;
					}
				} else if (!ObjTypeList.get(id & 0x3FFFFFFF).method4128(this.female)) {
					incomplete = true;
				}
			}
			if (incomplete) {
				if (this.prevChecksum != -1L) {
					model = (Model) bodyModels.get(this.prevChecksum);
				}
				if (model == null) {
					return null;
				}
			}
			if (model == null) {
				@Pc(250) RawModel[] models = new RawModel[12];
				for (@Pc(252) int i = 0; i < 12; i++) {
					@Pc(259) int id = identikit[i];
					if ((id & 0x40000000) != 0) {
						@Pc(273) RawModel m = ObjTypeList.get(id & 0x3FFFFFFF).getBodyModel(this.female);
						if (m != null) {
							models[i] = m;
						}
					} else if ((Integer.MIN_VALUE & id) != 0) {
						@Pc(294) RawModel m = IdkTypeList.get(id & 0x3FFFFFFF).getBodyModel();
						if (m != null) {
							models[i] = m;
						}
					}
				}
				@Pc(306) BasType basType = null;
				if (this.basId != -1) {
					basType = BasTypeList.get(this.basId);
				}
				if (basType != null && basType.anIntArrayArray7 != null) {
					for (@Pc(326) int local326 = 0; local326 < basType.anIntArrayArray7.length; local326++) {
						if (basType.anIntArrayArray7[local326] != null && models[local326] != null) {
							@Pc(351) int local351 = basType.anIntArrayArray7[local326][0];
							@Pc(358) int local358 = basType.anIntArrayArray7[local326][1];
							@Pc(365) int local365 = basType.anIntArrayArray7[local326][2];
							@Pc(372) int local372 = basType.anIntArrayArray7[local326][3];
							@Pc(379) int local379 = basType.anIntArrayArray7[local326][5];
							@Pc(386) int local386 = basType.anIntArrayArray7[local326][4];
							if (this.anIntArrayArray37 == null) {
								this.anIntArrayArray37 = new int[basType.anIntArrayArray7.length][];
							}
							if (this.anIntArrayArray37[local326] == null) {
								@Pc(410) int[] local410 = this.anIntArrayArray37[local326] = new int[15];
								if (local372 == 0 && local386 == 0 && local379 == 0) {
									local410[13] = -local358;
									local410[0] = local410[4] = local410[8] = 32768;
									local410[14] = -local365;
									local410[12] = -local351;
								} else {
									@Pc(457) int local457 = MathUtils.COSINE[local372] >> 1;
									@Pc(463) int local463 = MathUtils.SINE[local372] >> 1;
									@Pc(469) int local469 = MathUtils.COSINE[local386] >> 1;
									@Pc(475) int local475 = MathUtils.SINE[local379] >> 1;
									@Pc(481) int local481 = MathUtils.SINE[local386] >> 1;
									@Pc(489) int local489 = local463 * local475 + 16384 >> 15;
									@Pc(495) int local495 = MathUtils.COSINE[local379] >> 1;
									@Pc(503) int local503 = local495 * local463 + 16384 >> 15;
									local410[3] = local457 * local475 + 16384 >> 15;
									local410[1] = -local475 * local469 + local481 * local503 + 16384 >> 15;
									local410[8] = local457 * local469 + 16384 >> 15;
									local410[7] = -local475 * -local481 + local469 * local503 + 16384 >> 15;
									local410[6] = local489 * local469 + -local481 * local495 + 16384 >> 15;
									local410[4] = local457 * local495 + 16384 >> 15;
									local410[13] = -local365 * local410[7] + local410[1] * -local351 + local410[4] * -local358 + 16384 >> 15;
									local410[5] = -local463;
									local410[2] = local457 * local481 + 16384 >> 15;
									local410[0] = local469 * local495 + local481 * local489 + 16384 >> 15;
									local410[12] = local410[3] * -local358 + local410[0] * -local351 + -local365 * local410[6] + 16384 >> 15;
									local410[14] = local410[8] * -local365 + -local351 * local410[2] + -local358 * local410[5] + 16384 >> 15;
								}
								local410[10] = local358;
								local410[9] = local351;
								local410[11] = local365;
							}
							if (local372 != 0 || local386 != 0 || local379 != 0) {
								models[local326].method2754(local372, local386, local379);
							}
							if (local351 != 0 || local358 != 0 || local365 != 0) {
								models[local326].translate(local351, local358, local365);
							}
						}
					}
				}
				@Pc(753) RawModel newModel = new RawModel(models, models.length);
				for (@Pc(755) int i = 0; i < 5; i++) {
					if (destinationBodyColors[i].length > this.colors[i]) {
						newModel.recolor(sourceBodyColors[i], destinationBodyColors[i][this.colors[i]]);
					}
					if (destinationSkinColors[i].length > this.colors[i]) {
						newModel.recolor(sourceSkinColors[i], destinationSkinColors[i][this.colors[i]]);
					}
				}
				model = newModel.createModel(64, 850, -30, -50, -30);
				if (GlRenderer.enabled) {
					((GlModel) model).method3872(false, false, true, false, false, true);
				}
				if (cache) {
					bodyModels.put(checksum, model);
					this.prevChecksum = checksum;
				}
			}
		}
		@Pc(846) boolean local846 = false;
		@Pc(848) boolean alphaTransformed = false;
		@Pc(850) boolean colorTransformed = false;
		@Pc(852) boolean normalsTransformed = false;
		@Pc(860) int len = arg0 == null ? 0 : arg0.length;
		for (@Pc(862) int i = 0; i < len; i++) {
			if (arg0[i] != null) {
				@Pc(881) SeqType seqType = SeqTypeList.get(arg0[i].seqId);
				if (seqType.frames != null) {
					local846 = true;
					Static5.aClass46Array2[i] = seqType;
					@Pc(896) int local896 = arg0[i].anInt4462;
					@Pc(901) int local901 = arg0[i].anInt4464;
					@Pc(906) int local906 = seqType.frames[local896];
					Static5.aClass4_Sub3_Sub19Array4[i] = SeqTypeList.getAnimFrameset(local906 >>> 16);
					local906 &= 65535;
					Static3.anIntArray190[i] = local906;
					if (Static5.aClass4_Sub3_Sub19Array4[i] != null) {
						colorTransformed |= Static5.aClass4_Sub3_Sub19Array4[i].isColorTransformed(local906);
						alphaTransformed |= Static5.aClass4_Sub3_Sub19Array4[i].isAlphaTransformed(local906);
						normalsTransformed |= seqType.aBoolean72;
					}
					if ((seqType.tween || SeqType.forceTween) && local901 != -1 && seqType.frames.length > local901) {
						Static6.anIntArray483[i] = seqType.anIntArray94[local896];
						Static3.anIntArray181[i] = arg0[i].anInt4460;
						@Pc(1002) int local1002 = seqType.frames[local901];
						Static4.aClass4_Sub3_Sub19Array2[i] = SeqTypeList.getAnimFrameset(local1002 >>> 16);
						local1002 &= 65535;
						Static3.anIntArray211[i] = local1002;
						if (Static4.aClass4_Sub3_Sub19Array2[i] != null) {
							colorTransformed |= Static4.aClass4_Sub3_Sub19Array2[i].isColorTransformed(local1002);
							alphaTransformed |= Static4.aClass4_Sub3_Sub19Array2[i].isAlphaTransformed(local1002);
						}
					} else {
						Static6.anIntArray483[i] = 0;
						Static3.anIntArray181[i] = 0;
						Static4.aClass4_Sub3_Sub19Array2[i] = null;
						Static3.anIntArray211[i] = -1;
					}
				}
			}
		}
		if (local846 || arg8 != null || arg4 != null) {
			@Pc(1064) int local1064 = -1;
			@Pc(1066) int local1066 = -1;
			@Pc(1068) AnimFrameset local1068 = null;
			@Pc(1070) int local1070 = 0;
			@Pc(1072) AnimFrameset local1072 = null;
			if (arg8 != null) {
				@Pc(1080) int local1080 = arg8.frames[arg5];
				@Pc(1084) int local1084 = local1080 >>> 16;
				local1064 = local1080 & 0xFFFF;
				local1068 = SeqTypeList.getAnimFrameset(local1084);
				if (local1068 != null) {
					colorTransformed |= local1068.isColorTransformed(local1064);
					alphaTransformed |= local1068.isAlphaTransformed(local1064);
					normalsTransformed |= arg8.aBoolean72;
				}
				if ((arg8.tween || SeqType.forceTween) && arg2 != -1 && arg2 < arg8.frames.length) {
					@Pc(1134) int local1134 = arg8.frames[arg2];
					@Pc(1138) int local1138 = local1134 >>> 16;
					local1066 = local1134 & 0xFFFF;
					local1070 = arg8.anIntArray94[arg5];
					if (local1138 == local1084) {
						local1072 = local1068;
					} else {
						local1072 = SeqTypeList.getAnimFrameset(local1066 >>> 16);
					}
					if (local1072 != null) {
						colorTransformed |= local1072.isColorTransformed(local1066);
						alphaTransformed |= local1072.isAlphaTransformed(local1066);
					}
				}
			}
			@Pc(1180) int local1180 = -1;
			@Pc(1182) int local1182 = 0;
			@Pc(1184) int local1184 = -1;
			@Pc(1186) AnimFrameset local1186 = null;
			@Pc(1188) AnimFrameset local1188 = null;
			if (arg4 != null) {
				@Pc(1196) int local1196 = arg4.frames[arg1];
				@Pc(1200) int local1200 = local1196 >>> 16;
				local1188 = SeqTypeList.getAnimFrameset(local1200);
				local1184 = local1196 & 0xFFFF;
				if (local1188 != null) {
					colorTransformed |= local1188.isColorTransformed(local1184);
					alphaTransformed |= local1188.isAlphaTransformed(local1184);
					normalsTransformed |= arg4.aBoolean72;
				}
				if ((arg4.tween || SeqType.forceTween) && arg3 != -1 && arg3 < arg4.frames.length) {
					local1182 = arg4.anIntArray94[arg1];
					@Pc(1260) int local1260 = arg4.frames[arg3];
					@Pc(1264) int local1264 = local1260 >>> 16;
					local1180 = local1260 & 0xFFFF;
					if (local1264 == local1200) {
						local1186 = local1188;
					} else {
						local1186 = SeqTypeList.getAnimFrameset(local1180 >>> 16);
					}
					if (local1186 != null) {
						colorTransformed |= local1186.isColorTransformed(local1180);
						alphaTransformed |= local1186.isAlphaTransformed(local1180);
					}
				}
			}
			@Pc(1318) Model model2 = model.method3831(!alphaTransformed, !colorTransformed, !normalsTransformed);
			@Pc(1320) int local1320 = 0;
			@Pc(1322) int part = 1;
			while (len > local1320) {
				if (Static5.aClass4_Sub3_Sub19Array4[local1320] != null) {
					model2.method3839(Static5.aClass4_Sub3_Sub19Array4[local1320], Static3.anIntArray190[local1320], Static4.aClass4_Sub3_Sub19Array2[local1320], Static3.anIntArray211[local1320], Static3.anIntArray181[local1320] - 1, Static6.anIntArray483[local1320], part, Static5.aClass46Array2[local1320].aBoolean72, this.anIntArrayArray37[local1320]);
				}
				local1320++;
				part <<= 1;
			}
			if (local1068 != null && local1188 != null) {
				model2.method3816(local1068, local1064, local1072, local1066, arg10 - 1, local1070, local1188, local1184, local1186, local1180, arg7 - 1, local1182, arg8.aBooleanArray6, arg4.aBoolean72 | arg8.aBoolean72);
			} else if (local1068 != null) {
				model2.method3835(local1068, local1064, local1072, local1066, arg10 - 1, local1070, arg8.aBoolean72);
			} else if (local1188 != null) {
				model2.method3835(local1188, local1184, local1186, local1180, arg7 - 1, local1182, arg4.aBoolean72);
			}
			for (@Pc(1434) int i = 0; i < len; i++) {
				Static5.aClass4_Sub3_Sub19Array4[i] = null;
				Static4.aClass4_Sub3_Sub19Array2[i] = null;
				Static5.aClass46Array2[i] = null;
			}
			return model2;
		} else if (arg6) {
			return model.method3831(false, false, false);
		} else {
			return model;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!eg;IIIIII)Lclient!vg;")
	public final Model method3609(@OriginalArg(1) SeqType arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(14) long key = (long) arg2 << 32 | (long) (arg1 << 16) | (long) arg5;
		@Pc(24) Model model = (Model) headModels.get(key);
		if (model == null) {
			@Pc(30) int len = 0;
			@Pc(33) RawModel[] models = new RawModel[3];
			if (!IdkTypeList.get(arg5).isHeadModelReady() || !IdkTypeList.get(arg1).isHeadModelReady() || !IdkTypeList.get(arg2).isHeadModelReady()) {
				return null;
			}
			@Pc(65) RawModel local65 = IdkTypeList.get(arg5).getHeadModel();
			if (local65 != null) {
				len++;
				models[0] = local65;
			}
			@Pc(78) RawModel local78 = IdkTypeList.get(arg1).getHeadModel();
			if (local78 != null) {
				models[len++] = local78;
			}
			@Pc(92) RawModel local92 = IdkTypeList.get(arg2).getHeadModel();
			if (local92 != null) {
				models[len++] = local92;
			}
			@Pc(105) RawModel newModel = new RawModel(models, len);
			for (@Pc(107) int i = 0; i < 5; i++) {
				if (destinationBodyColors[i].length > this.colors[i]) {
					newModel.recolor(sourceBodyColors[i], destinationBodyColors[i][this.colors[i]]);
				}
				if (destinationSkinColors[i].length > this.colors[i]) {
					newModel.recolor(sourceSkinColors[i], destinationSkinColors[i][this.colors[i]]);
				}
			}
			model = newModel.createModel(64, 768, -50, -10, -50);
			headModels.put(key, model);
		}
		if (arg0 != null) {
			model = arg0.method1017(arg4, arg6, model, arg3);
		}
		return model;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II[II[IZ)V")
	public final void set(@OriginalArg(1) int npcId, @OriginalArg(2) int[] identikit, @OriginalArg(3) int basId, @OriginalArg(4) int[] colors, @OriginalArg(5) boolean female) {
		if (this.basId != basId) {
			this.basId = basId;
			this.anIntArrayArray37 = null;
		}
		if (identikit == null) {
			identikit = new int[12];
			for (@Pc(25) int i = 0; i < 8; i++) {
				for (@Pc(30) int id = 0; id < IdkTypeList.capacity; id++) {
					@Pc(37) IdkType type = IdkTypeList.get(id);
					if (type != null && !type.aBoolean298 && (female ? FEMALE_FEATURES[i] : MALE_FEATURES[i]) == type.feature) {
						identikit[BASE_PART_MAP[i]] = Integer.MIN_VALUE | id;
						break;
					}
				}
			}
		}
		this.identikit = identikit;
		this.colors = colors;
		this.female = female;
		this.npcId = npcId;
		this.updateChecksum();
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)I")
	public final int method3611() {
		return this.npcId == -1 ? (this.identikit[8] << 10) + (this.colors[0] << 25) + (this.colors[4] << 20) + (this.identikit[0] << 15) + (this.identikit[11] << 5) + this.identikit[1] : NpcTypeList.get(this.npcId).id + 0x12345678;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!eg;IBI)Lclient!vg;")
	public final Model method3612(@OriginalArg(0) int arg0, @OriginalArg(1) SeqType seqType, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.npcId != -1) {
			return NpcTypeList.get(this.npcId).getHeadModel(arg2, seqType, arg0, arg3);
		}
		@Pc(28) Model model = (Model) headModels.get(this.checksum);
		if (model == null) {
			@Pc(33) boolean incomplete = false;
			for (@Pc(35) int i = 0; i < 12; i++) {
				@Pc(43) int id = this.identikit[i];
				if ((id & 0x40000000) == 0) {
					if ((id & Integer.MIN_VALUE) != 0 && !IdkTypeList.get(id & 0x3FFFFFFF).isHeadModelReady()) {
						incomplete = true;
					}
				} else if (!ObjTypeList.get(id & 0x3FFFFFFF).isHeadModelReady(this.female)) {
					incomplete = true;
				}
			}
			if (incomplete) {
				return null;
			}
			@Pc(93) RawModel[] models = new RawModel[12];
			@Pc(95) int len = 0;
			for (@Pc(97) int i = 0; i < 12; i++) {
				@Pc(105) int id = this.identikit[i];
				if ((id & 0x40000000) != 0) {
					@Pc(122) RawModel m = ObjTypeList.get(id & 0x3FFFFFFF).getHeadModel(this.female);
					if (m != null) {
						models[len++] = m;
					}
				} else if ((Integer.MIN_VALUE & id) != 0) {
					@Pc(145) RawModel m = IdkTypeList.get(id & 0x3FFFFFFF).getHeadModel();
					if (m != null) {
						models[len++] = m;
					}
				}
			}
			@Pc(162) RawModel newModel = new RawModel(models, len);
			for (@Pc(164) int i = 0; i < 5; i++) {
				if (this.colors[i] < destinationBodyColors[i].length) {
					newModel.recolor(sourceBodyColors[i], destinationBodyColors[i][this.colors[i]]);
				}
				if (this.colors[i] < destinationSkinColors[i].length) {
					newModel.recolor(sourceSkinColors[i], destinationSkinColors[i][this.colors[i]]);
				}
			}
			model = newModel.createModel(64, 768, -50, -10, -50);
			headModels.put(this.checksum, model);
		}
		if (seqType != null) {
			model = seqType.method1017(arg0, arg2, model, arg3);
		}
		return model;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(IBI)V")
	public final void setColor(@OriginalArg(0) int i, @OriginalArg(2) int color) {
		this.colors[i] = color;
		this.updateChecksum();
	}
}
