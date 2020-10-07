import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class GlCleaner {
	@OriginalMember(owner = "client!mh", name = "l", descriptor = "[I")
	private static final int[] ids = new int[1000];

	@OriginalMember(owner = "client!mh", name = "k", descriptor = "Lclient!ll;")
	private static final LinkedList shaders = new LinkedList();

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "Lclient!ll;")
	private static final LinkedList programs = new LinkedList();

	@OriginalMember(owner = "client!mh", name = "i", descriptor = "Lclient!ll;")
	private static final LinkedList lists = new LinkedList();

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "Lclient!ll;")
	private static final LinkedList textures = new LinkedList();

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "Lclient!ll;")
	private static final LinkedList textures2d = new LinkedList();

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "Lclient!ll;")
	private static final LinkedList buffers = new LinkedList();

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
	public static int onCardGeometry = 0;

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
	public static int onCard2d = 0;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
	public static int onCardTexture = 0;

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
	public static int contextId = 0;

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "J")
	private static long lastGcTime = 0L;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "()V")
	public static synchronized void clear() {
		contextId++;
		buffers.clear();
		textures2d.clear();
		textures.clear();
		lists.clear();
		programs.clear();
		shaders.clear();
		onCardGeometry = 0;
		onCard2d = 0;
		onCardTexture = 0;
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "()V")
	public static synchronized void loop() {
		@Pc(1) GL gl = GlRenderer.gl;
		@Pc(3) int n = 0;
		while (true) {
			@Pc(8) IntNode buffer = (IntNode) buffers.removeHead();
			if (buffer == null) {
				if (n > 0) {
					gl.glDeleteBuffersARB(n, ids, 0);
					n = 0;
				}
				while (true) {
					@Pc(48) IntNode texture2d = (IntNode) textures2d.removeHead();
					if (texture2d == null) {
						while (true) {
							@Pc(79) IntNode texture = (IntNode) textures.removeHead();
							if (texture == null) {
								if (n > 0) {
									gl.glDeleteTextures(n, ids, 0);
								}
								while (true) {
									@Pc(119) IntNode list = (IntNode) lists.removeHead();
									if (list == null) {
										while (true) {
											@Pc(136) GlCleanerProgram program = (GlCleanerProgram) programs.removeHead();
											if (program == null) {
												while (true) {
													@Pc(167) IntNode shader = (IntNode) shaders.removeHead();
													if (shader == null) {
														if (onCardGeometry + onCard2d + onCardTexture > 0x6000000 && MonotonicClock.currentTimeMillis() > lastGcTime + 60000L) {
															System.gc();
															lastGcTime = MonotonicClock.currentTimeMillis();
														}
														return;
													}
													@Pc(174) int id = (int) shader.key;
													gl.glDeleteObjectARB(id);
												}
											}
											for (@Pc(141) int i = 0; i < program.shaders.length; i++) {
												gl.glDetachObjectARB(program.id, program.shaders[i].id);
											}
											gl.glDeleteObjectARB(program.id);
										}
									}
									@Pc(126) int id = (int) list.key;
									gl.glDeleteLists(id, 1);
								}
							}
							ids[n++] = (int) texture.key;
							onCardTexture -= texture.value;
							if (n == 1000) {
								gl.glDeleteTextures(n, ids, 0);
								n = 0;
							}
						}
					}
					ids[n++] = (int) texture2d.key;
					onCard2d -= texture2d.value;
					if (n == 1000) {
						gl.glDeleteTextures(n, ids, 0);
						n = 0;
					}
				}
			}
			ids[n++] = (int) buffer.key;
			onCardGeometry -= buffer.value;
			if (n == 1000) {
				gl.glDeleteBuffersARB(n, ids, 0);
				n = 0;
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I[Lclient!ec;I)V")
	public static synchronized void deleteProgram(@OriginalArg(0) int id, @OriginalArg(1) GlShader[] shaders, @OriginalArg(2) int contextId) {
		if (contextId == GlCleaner.contextId) {
			programs.addTail(new GlCleanerProgram(id, shaders));
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)V")
	public static synchronized void deleteList(@OriginalArg(0) int id, @OriginalArg(1) int contextId) {
		if (contextId == GlCleaner.contextId) {
			@Pc(7) IntNode node = new IntNode();
			node.key = id;
			lists.addTail(node);
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)V")
	public static synchronized void deleteTexture(@OriginalArg(0) int id, @OriginalArg(1) int size, @OriginalArg(2) int contextId) {
		if (contextId == GlCleaner.contextId) {
			@Pc(8) IntNode node = new IntNode(size);
			node.key = id;
			textures.addTail(node);
		}
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(III)V")
	public static synchronized void deleteBuffer(@OriginalArg(0) int id, @OriginalArg(1) int size, @OriginalArg(2) int contextId) {
		if (contextId == GlCleaner.contextId) {
			@Pc(8) IntNode node = new IntNode(size);
			node.key = id;
			buffers.addTail(node);
		}
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(III)V")
	public static synchronized void deleteTexture2d(@OriginalArg(0) int id, @OriginalArg(1) int size, @OriginalArg(2) int contextId) {
		if (contextId == GlCleaner.contextId) {
			@Pc(8) IntNode node = new IntNode(size);
			node.key = id;
			textures2d.addTail(node);
		}
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)V")
	public static synchronized void deleteShader(@OriginalArg(0) int id, @OriginalArg(1) int contextId) {
		if (contextId == GlCleaner.contextId) {
			@Pc(7) IntNode node = new IntNode();
			node.key = id;
			shaders.addTail(node);
		}
	}
}
