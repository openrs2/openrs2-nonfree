import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Js5GlTextureProvider extends Js5TextureProvider implements GlTextureProvider {

	@OriginalMember(owner = "client!c", name = "y", descriptor = "Z")
	private boolean lowDetail = false;

	@OriginalMember(owner = "client!c", name = "v", descriptor = "I")
	private int capacity = 50;

	@OriginalMember(owner = "client!c", name = "N", descriptor = "Lclient!fh;")
	private final Js5 spritesArchive;

	@OriginalMember(owner = "client!c", name = "J", descriptor = "Lclient!fh;")
	private final Js5 texturesArchive;

	@OriginalMember(owner = "client!c", name = "X", descriptor = "Lclient!dj;")
	private LruHashTable glTextures;

	@OriginalMember(owner = "client!c", name = "E", descriptor = "Lclient!dj;")
	private LruHashTable solidColorSprites;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Lclient!fh;Lclient!fh;Lclient!fh;IZ)V")
	public Js5GlTextureProvider(@OriginalArg(0) Js5 texturesArchive, @OriginalArg(2) Js5 spritesArchive, @OriginalArg(1) Js5 materialsArchive, @OriginalArg(3) int capacity, @OriginalArg(4) boolean lowDetail) {
		super(texturesArchive, spritesArchive, materialsArchive);
		this.capacity = capacity;
		this.spritesArchive = spritesArchive;
		this.texturesArchive = texturesArchive;
		this.lowDetail = lowDetail;
		this.glTextures = new LruHashTable(this.capacity);
		if (GlRenderer.enabled) {
			this.solidColorSprites = new LruHashTable(this.capacity);
		} else {
			this.solidColorSprites = null;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZI)V")
	public final void setLowDetail(@OriginalArg(0) boolean lowDetail) {
		this.lowDetail = lowDetail;
		this.clear();
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(IZ)I")
	@Override
	public final int method450(@OriginalArg(0) int id) {
		return this.getMaterial(id).aByte7 & 0xFF;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(IB)Z")
	@Override
	public final boolean method442(@OriginalArg(0) int id) {
		return this.getMaterial(id).aBoolean233;
	}

	@OriginalMember(owner = "client!c", name = "i", descriptor = "(II)V")
	public final void method458(@OriginalArg(0) int arg0) {
		for (@Pc(13) GlTexture texture = (GlTexture) this.glTextures.head(); texture != null; texture = (GlTexture) this.glTextures.next()) {
			if (texture.aBoolean344) {
				texture.method4074(arg0);
				texture.aBoolean344 = false;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(II)Z")
	@Override
	public final boolean method441(@OriginalArg(0) int id) {
		return !this.getMaterial(id).aBoolean237;
	}

	@OriginalMember(owner = "client!c", name = "h", descriptor = "(II)I")
	@Override
	public final int method455(@OriginalArg(0) int id) {
		return this.getMaterial(id).materialArg & 0xFF;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(IB)[I")
	@Override
	public final int[] method449(@OriginalArg(0) int id) {
		@Pc(8) GlTexture texture = this.getGlTexture(id);
		return texture == null ? null : texture.method4071(this, this.spritesArchive, this.lowDetail || this.getMaterial(id).lowDetail);
	}

	@OriginalMember(owner = "client!c", name = "j", descriptor = "(II)Lclient!so;")
	private GlTexture getGlTexture(@OriginalArg(0) int id) {
		@Pc(17) GlTexture texture = (GlTexture) this.glTextures.get(id);
		if (texture != null) {
			return texture;
		}
		@Pc(28) byte[] bytes = this.texturesArchive.fetchFile(id, 0);
		if (bytes == null) {
			return null;
		} else {
			@Pc(40) GlTexture newTexture = new GlTexture(new Buffer(bytes));
			this.glTextures.put(id, newTexture);
			return newTexture;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZFZII)Lclient!vn;")
	@Override
	public final SoftwareSprite getSprite(@OriginalArg(4) int id, @OriginalArg(0) boolean alpha, @OriginalArg(1) float brightness, @OriginalArg(3) int size) {
		@Pc(8) GlTexture texture = this.getGlTexture(id);
		if (texture != null && texture.isReady(this, this.spritesArchive)) {
			return alpha ? texture.texture.getAlphaSprite(size, this, this.spritesArchive, brightness, size) : texture.texture.getSprite(brightness, size, this, this.spritesArchive, size);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!c", name = "g", descriptor = "(II)Z")
	@Override
	public final boolean isLowDetail(@OriginalArg(1) int id) {
		return this.lowDetail || this.getMaterial(id).lowDetail;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
	public final void clear() {
		this.glTextures.clear();
		if (this.solidColorSprites != null) {
			this.solidColorSprites.clear();
		}
		Static6.anIntArray539 = null;
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(II)I")
	@Override
	public final int getAverageColor(@OriginalArg(0) int id) {
		return this.getMaterial(id).averageColor & 0xFFFF;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IZ)Z")
	@Override
	public final boolean isGlTextureReady(@OriginalArg(0) int id) {
		@Pc(15) GlTexture texture = this.getGlTexture(id);
		return texture == null ? false : texture.isReady(this, this.spritesArchive);
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(IB)V")
	public final void resize(@OriginalArg(0) int capacity) {
		this.capacity = capacity;
		this.glTextures = new LruHashTable(this.capacity);
		if (GlRenderer.enabled) {
			this.solidColorSprites = new LruHashTable(this.capacity);
		} else {
			this.solidColorSprites = null;
		}
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(II)Z")
	@Override
	public final boolean method443(@OriginalArg(1) int id) {
		return this.getMaterial(id).aBoolean235;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BII)V")
	@Override
	public final void method454(@OriginalArg(2) int id, @OriginalArg(1) int arg0) {
		MaterialManager.setMaterial(this.getMaterial(id).materialId & 0xFF, this.getMaterial(id).materialArg & 0xFF);
		@Pc(29) boolean local29 = false;
		@Pc(34) GlTexture texture = this.getGlTexture(id);
		if (texture != null) {
			local29 = texture.method4077(this, this.spritesArchive, arg0);
		}
		if (!local29) {
			@Pc(50) GlSolidColorTexture solidColorTexture = this.getSolidColorTexture(id);
			solidColorTexture.method3539();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)I")
	@Override
	public final int method447(@OriginalArg(1) int arg0) {
		return this.getMaterial(arg0).aByte10 & 0xFF;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(IZ)Lclient!ln;")
	@Override
	protected final Texture getTexture(@OriginalArg(0) int id) {
		@Pc(14) GlTexture local14 = this.getGlTexture(id);
		return local14 == null ? null : local14.texture;
	}

	@OriginalMember(owner = "client!c", name = "k", descriptor = "(II)Lclient!qd;")
	private GlSolidColorTexture getSolidColorTexture(@OriginalArg(1) int id) {
		@Pc(11) GlSolidColorTexture texture = (GlSolidColorTexture) this.solidColorSprites.get(id);
		if (texture == null) {
			@Pc(27) GlSolidColorTexture newTexture = new GlSolidColorTexture(this.getMaterial(id).averageColor & 0xFFFF);
			this.solidColorSprites.put(id, newTexture);
			return newTexture;
		} else {
			return texture;
		}
	}

	@OriginalMember(owner = "client!c", name = "f", descriptor = "(II)V")
	@Override
	public final void method451(@OriginalArg(1) int id) {
		this.method454(id, this.lowDetail || this.getMaterial(id).lowDetail ? 64 : 128);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(FII)[I")
	@Override
	public final int[] method445(@OriginalArg(2) int id, @OriginalArg(0) float arg0) {
		@Pc(4) GlTexture texture = this.getGlTexture(id);
		if (texture == null) {
			return null;
		} else {
			texture.aBoolean344 = true;
			return texture.method4073(this, this.spritesArchive, arg0, this.lowDetail || this.getMaterial(id).lowDetail);
		}
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(II)I")
	@Override
	public final int method444(@OriginalArg(0) int id) {
		return this.getMaterial(id).materialId & 0xFF;
	}
}
