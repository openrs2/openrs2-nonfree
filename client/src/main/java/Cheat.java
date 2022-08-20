import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Cheat {
	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void execute(@OriginalArg(1) String command) {
		if (LoginManager.staffModLevel >= 2) {
			if (command.equalsIgnoreCase("::gc")) {
				client.removeSoft();
				for (@Pc(20) int i = 0; i < 10; i++) {
					System.gc();
				}
				@Pc(29) Runtime runtime = Runtime.getRuntime();
				@Pc(38) int used = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Chat.add(0, null, "mem=" + used + "k");
			}
			if (command.equalsIgnoreCase("::mm")) {
				client.removeSoft();
				for (@Pc(60) int i = 0; i < 10; i++) {
					System.gc();
				}
				@Pc(69) Runtime runtime = Runtime.getRuntime();
				@Pc(79) int usedBefore = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Chat.add(0, null, "Memory before cleanup=" + usedBefore + "k");
				Static24.method2567();
				client.removeSoft();
				for (@Pc(99) int i = 0; i < 10; i++) {
					System.gc();
				}
				@Pc(115) int usedAfter = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Chat.add(0, null, "Memory after cleanup=" + usedAfter + "k");
			}
			if (command.equalsIgnoreCase("::pcachesize")) {
				Chat.add(0, null, "Number of player models in cache:" + PlayerAppearance.getModelCacheSize());
			}
			if (GlRenderer.enabled && command.equalsIgnoreCase("::cardmem")) {
				System.out.println("oncard_geometry:" + GlCleaner.onCardGeometry);
				System.out.println("oncard_2d:" + GlCleaner.onCard2d);
				System.out.println("oncard_texture:" + GlCleaner.onCardTexture);
			}
			if (command.equalsIgnoreCase("::clientdrop")) {
				Static23.method2455();
			}
			if (command.equalsIgnoreCase("::clientjs5drop")) {
				client.js5NetQueue.quit();
			}
			if (command.equalsIgnoreCase("::serverjs5drop")) {
				client.js5NetQueue.closeServer();
			}
			if (command.equalsIgnoreCase("::breakcon")) {
				GameShell.signLink.breakConnection();
				Protocol.socket.breakConnection();
				client.js5NetQueue.breakConnection();
			}
			if (command.equalsIgnoreCase("::replacecanvas")) {
				GameShell.replaceCanvas = true;
			}
			if (command.equalsIgnoreCase("::rebuild")) {
				Static9.method233(25);
			}
			if (command.equalsIgnoreCase("::fpson")) {
				client.displayFps = true;
			}
			if (command.equalsIgnoreCase("::fpsoff")) {
				client.displayFps = false;
			}
			if (command.equalsIgnoreCase("::wm0")) {
				Static35.setWindowMode(false, 0, -1, -1);
			}
			if (command.equalsIgnoreCase("::wm1")) {
				Static35.setWindowMode(false, 1, -1, -1);
			}
			if (command.equalsIgnoreCase("::wm2")) {
				Static35.setWindowMode(false, 2, -1, -1);
			}
			if (command.equalsIgnoreCase("::wm3")) {
				Static35.setWindowMode(false, 3, 1024, 768);
			}
			if (command.startsWith("::setba")) {
				Preferences.buildArea = StringUtils.parseInt(command.substring(8));
				Preferences.write(GameShell.signLink);
				Preferences.sentToServer = false;
			}
			if (command.startsWith("::setparticles")) {
				Preferences.setParticles(StringUtils.parseInt(command.substring(15)));
				Preferences.write(GameShell.signLink);
				Preferences.sentToServer = false;
			}
			if (command.startsWith("::fps ") && client.modeWhere != 0) {
				GameShell.setFramesPerSecond(StringUtils.parseInt(command.substring(6)));
			}
			if (command.equalsIgnoreCase("::errortest")) {
				throw new RuntimeException();
			}
			if (command.startsWith("::rect_debug")) {
				Static1.rectDebug = StringUtils.parseInt(command.substring(12).trim());
				Chat.add(0, null, "rect_debug=" + Static1.rectDebug);
			}
			if (command.equalsIgnoreCase("::qa_op_test")) {
				Static1.qaOpTest = true;
			}
			if (command.startsWith("::hdr") && GlRenderer.enabled && !Static10.setHdrEnabled(!PostProcessorManager.isBloomEnabled())) {
				Chat.add(0, null, "Failed to enable hdr");
			}
			if (command.equalsIgnoreCase("::tween")) {
				if (SeqType.forceTween) {
					SeqType.forceTween = false;
					Chat.add(0, null, "Forced tweening disabled.");
				} else {
					SeqType.forceTween = true;
					Chat.add(0, null, "Forced tweening ENABLED!");
				}
			}
			if (command.equalsIgnoreCase("::shiftclick")) {
				if (Static2.shiftClick) {
					System.out.println("Shift-click disabled.");
					Static2.shiftClick = false;
				} else {
					System.out.println("Shift-click ENABLED!");
					Static2.shiftClick = true;
				}
			}
			if (command.equalsIgnoreCase("::getcgcoord")) {
				Chat.add(0, null, "x:" + (PlayerList.self.xFine >> 7) + " z:" + (PlayerList.self.zFine >> 7) + " groundh:" + SceneGraph.tileHeights[Player.level][PlayerList.self.xFine >> 7][PlayerList.self.zFine >> 7]);
			}
			if (command.equalsIgnoreCase("::getheight")) {
				Chat.add(0, null, "Height: " + SceneGraph.tileHeights[Player.level][PlayerList.self.xFine >> 7][PlayerList.self.zFine >> 7]);
			}
		}
		Protocol.outboundBuffer.writeOpcode(216);
		Protocol.outboundBuffer.writeByte(command.length() - 1);
		Protocol.outboundBuffer.writeString(command.substring(2));
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BIII)V")
	public static void teleport(@OriginalArg(3) int level, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		@Pc(32) String command = "::tele " + level + "," + (x >> 6) + "," + (z >> 6) + "," + (x & 0x3F) + "," + (z & 0x3F);
		System.out.println(command);
		execute(command);
	}
}
