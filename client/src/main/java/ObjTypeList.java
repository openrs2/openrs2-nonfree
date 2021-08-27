import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class ObjTypeList {
	@OriginalMember(owner = "client!nj", name = "h", descriptor = "Lclient!cc;")
	private static final SoftLruHashTable types = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!df", name = "a", descriptor = "Lclient!cc;")
	public static final SoftLruHashTable models = new SoftLruHashTable(50);

	@OriginalMember(owner = "client!o", name = "r", descriptor = "Lclient!cc;")
	public static final SoftLruHashTable sprites = new SoftLruHashTable(100);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
	public static int capacity;

	@OriginalMember(owner = "client!cn", name = "C", descriptor = "Z")
	private static boolean allowMembers;

	@OriginalMember(owner = "client!sc", name = "U", descriptor = "[Ljava/lang/String;")
	private static String[] defaultInventoryOps = null;

	@OriginalMember(owner = "client!sl", name = "Y", descriptor = "[Ljava/lang/String;")
	private static String[] defaultOps = null;

	@OriginalMember(owner = "client!pk", name = "U", descriptor = "Lclient!fh;")
	private static Js5 objArchive;

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "Lclient!fh;")
	public static Js5 modelsArchive;

	@OriginalMember(owner = "client!be", name = "h", descriptor = "Lclient!ke;")
	public static SoftwareFont font;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)Lclient!td;")
	public static ObjType get(@OriginalArg(0) int id) {
		@Pc(18) ObjType type = (ObjType) types.get(id);
		if (type != null) {
			return type;
		}
		@Pc(34) byte[] bytes = objArchive.fetchFile(getGroupId(id), getFileId(id));
		@Pc(38) ObjType newType = new ObjType();
		newType.id = id;
		if (bytes != null) {
			newType.decode(new Buffer(bytes));
		}
		newType.postDecode();
		if (newType.certificateTemplate != -1) {
			newType.generateCertificate(get(newType.certificateLink), get(newType.certificateTemplate));
		}
		if (newType.lentTemplate != -1) {
			newType.generateLent(get(newType.lentLink), get(newType.lentTemplate));
		}
		if (!allowMembers && newType.members) {
			newType.name = LocalisedText.MEMBERS_OBJECT;
			newType.ops = defaultOps;
			newType.inventoryOps = defaultInventoryOps;
			newType.team = 0;
			newType.stockMarket = false;
		}
		types.put(id, newType);
		return newType;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)I")
	private static int getGroupId(@OriginalArg(1) int id) {
		return id >>> 8;
	}

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "(II)I")
	private static int getFileId(@OriginalArg(1) int id) {
		return id & 0xFF;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!fh;Lclient!ke;IZLclient!fh;)V")
	public static void init(@OriginalArg(0) Js5 objArchive, @OriginalArg(4) Js5 modelsArchive, @OriginalArg(1) SoftwareFont font) {
		ObjTypeList.modelsArchive = modelsArchive;
		ObjTypeList.objArchive = objArchive;
		allowMembers = true;
		@Pc(11) int maxGroupId = ObjTypeList.objArchive.capacity() - 1;
		capacity = maxGroupId * 256 + ObjTypeList.objArchive.getGroupCapacity(maxGroupId);
		ObjTypeList.font = font;
		defaultInventoryOps = new String[] { null, null, null, null, LocalisedText.DROP };
		defaultOps = new String[] { null, null, LocalisedText.TAKE, null, null };
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZB)V")
	public static void setAllowMembers(@OriginalArg(0) boolean allowMembers) {
		if (allowMembers != ObjTypeList.allowMembers) {
			ObjTypeList.allowMembers = allowMembers;
			clear();
		}
	}

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "(I)V")
	public static void clear() {
		types.clear();
		models.clear();
		sprites.clear();
	}

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "(B)V")
	public static void removeSoft() {
		types.removeSoft();
		models.removeSoft();
		sprites.removeSoft();
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(II)V")
	public static void clean() {
		types.clean(5);
		models.clean(5);
		sprites.clean(5);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z)V")
	public static void clearModels() {
		models.clear();
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V")
	public static void clearSprites() {
		sprites.clear();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIZBLclient!qk;II)Lclient!uj;")
	public static Sprite getSprite(@OriginalArg(5) int id, @OriginalArg(0) int count, @OriginalArg(1) int outlineMode, @OriginalArg(2) boolean renderCount, @OriginalArg(4) PlayerAppearance appearance, @OriginalArg(6) int shadowColor) {
		@Pc(23) int key = (renderCount ? 0x10000 : 0) + id + (outlineMode << 17) + (shadowColor << 19);
		@Pc(34) long key2 = (long) count * 3147483667L + (long) key * 3849834839L;
		@Pc(40) Sprite sprite = (Sprite) sprites.get(key2);
		if (sprite != null) {
			return sprite;
		}
		Static4.aBoolean218 = false;
		@Pc(58) Sprite sprite2 = createSprite(id, count, outlineMode, renderCount, false, appearance, shadowColor, false);
		if (sprite2 != null && !Static4.aBoolean218) {
			sprites.put(key2, sprite2);
		}
		return sprite2;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IZIZLclient!qk;IIIZ)Lclient!uj;")
	private static Sprite createSprite(@OriginalArg(7) int id, @OriginalArg(2) int count, @OriginalArg(0) int outlineMode, @OriginalArg(1) boolean renderCount, @OriginalArg(3) boolean certificate, @OriginalArg(4) PlayerAppearance appearance, @OriginalArg(6) int shadowColor, @OriginalArg(8) boolean forceSoftware) {
		@Pc(9) ObjType type = get(id);
		if (count > 1 && type.countObj != null) {
			@Pc(19) int countId = -1;
			for (@Pc(21) int i = 0; i < 10; i++) {
				if (type.countCount[i] <= count && type.countCount[i] != 0) {
					countId = type.countObj[i];
				}
			}
			if (countId != -1) {
				type = get(countId);
			}
		}
		@Pc(61) SoftwareModel model = type.getInvModel(appearance);
		if (model == null) {
			return null;
		}
		@Pc(68) SoftwareSprite linkSprite = null;
		if (type.certificateTemplate != -1) {
			linkSprite = (SoftwareSprite) createSprite(type.certificateLink, 10, 1, false, true, appearance, 0, true);
			if (linkSprite == null) {
				return null;
			}
		} else if (type.lentTemplate != -1) {
			linkSprite = (SoftwareSprite) createSprite(type.lentLink, count, outlineMode, false, false, appearance, shadowColor, true);
			if (linkSprite == null) {
				return null;
			}
		}
		@Pc(116) int[] prevPixels = SoftwareRaster.pixels;
		@Pc(118) int prevHeight = SoftwareRaster.height;
		@Pc(121) int[] prevClip = new int[4];
		@Pc(123) int prevWidth = SoftwareRaster.width;
		SoftwareRaster.getClip(prevClip);
		@Pc(131) SoftwareSprite sprite = new SoftwareSprite(36, 32);
		SoftwareRaster.setPixels(sprite.pixels, 36, 32);
		Static23.method2561();
		Static23.method2556(16, 16);
		Static4.aBoolean216 = false;
		@Pc(145) int zoom2d = type.zoom2d;
		if (certificate) {
			zoom2d = (int) ((double) zoom2d * 1.5D);
		} else if (outlineMode == 2) {
			zoom2d = (int) ((double) zoom2d * 1.04D);
		}
		@Pc(174) int y = MathUtils.COSINE[type.xAngle2d] * zoom2d >> 16;
		@Pc(191) int x = MathUtils.SINE[type.xAngle2d] * zoom2d >> 16;
		model.method3822(type.yAngle2d, type.zAngle2d, type.xAngle2d, type.xOffset2d, x + type.yOffset2d - model.getMinY() / 2, type.yOffset2d + y, -1L);
		if (outlineMode >= 1) {
			sprite.addOutline(1);
			if (outlineMode >= 2) {
				sprite.addOutline(0xFFFFFF);
			}
			SoftwareRaster.setPixels(sprite.pixels, 36, 32);
		}
		if (shadowColor != 0) {
			sprite.addShadow(shadowColor);
		}
		if (type.certificateTemplate != -1) {
			linkSprite.renderTransparent(0, 0);
		} else if (type.lentTemplate != -1) {
			SoftwareRaster.setPixels(linkSprite.pixels, 36, 32);
			sprite.renderTransparent(0, 0);
			sprite = linkSprite;
		}
		if (renderCount && (type.stackable == 1 || count != 1) && count != -1) {
			font.renderLeft(countToString(count), 0, 9, 0xFFFF00, 1);
		}
		SoftwareRaster.setPixels(prevPixels, prevWidth, prevHeight);
		SoftwareRaster.setClip(prevClip);
		Static23.method2561();
		Static4.aBoolean216 = true;
		return GlRenderer.enabled && !forceSoftware ? new GlSprite(sprite) : sprite;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)Ljava/lang/String;")
	private static String countToString(@OriginalArg(1) int count) {
		if (count < 100000) {
			return "<col=ffff00>" + count + "</col>";
		} else if (count < 10000000) {
			return "<col=ffffff>" + count / 1000 + LocalisedText.THOUSAND_SHORT + "</col>";
		} else {
			return "<col=00ff80>" + count / 1000000 + LocalisedText.MILLION_SHORT + "</col>";
		}
	}
}
