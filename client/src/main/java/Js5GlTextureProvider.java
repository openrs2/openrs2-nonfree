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
	public void setLowDetail(@OriginalArg(0) boolean lowDetail) {
		this.lowDetail = lowDetail;
		this.clear();
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(IZ)I")
	@Override
	public int method450(@OriginalArg(0) int id) {
		return this.getMaterial(id).aByte7 & 0xFF;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(IB)Z")
	@Override
	public boolean method442(@OriginalArg(0) int id) {
		return this.getMaterial(id).aBoolean233;
	}

	@OriginalMember(owner = "client!c", name = "i", descriptor = "(II)V")
	public void method458(@OriginalArg(0) int arg0) {
		for (@Pc(13) GlTexture texture = (GlTexture) this.glTextures.head(); texture != null; texture = (GlTexture) this.glTextures.next()) {
			if (texture.aBoolean344) {
				texture.method4074(arg0);
				texture.aBoolean344 = false;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method441(@OriginalArg(0) int id) {
		return !this.getMaterial(id).aBoolean237;
	}

	@OriginalMember(owner = "client!c", name = "h", descriptor = "(II)I")
	@Override
	public int getMaterialArg(@OriginalArg(0) int id) {
		return this.getMaterial(id).arg & 0xFF;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(IB)[I")
	@Override
	public int[] getPixels(@OriginalArg(0) int id) {
		@Pc(8) GlTexture texture = this.getGlTexture(id);
		return texture == null ? null : texture.getPixels(this, this.spritesArchive, this.lowDetail || this.getMaterial(id).lowDetail);
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
	public SoftwareSprite getSprite(@OriginalArg(4) int id, @OriginalArg(0) boolean alpha, @OriginalArg(1) float brightness, @OriginalArg(3) int size) {
		@Pc(8) GlTexture texture = this.getGlTexture(id);
		if (texture != null && texture.isReady(this, this.spritesArchive)) {
			return alpha ? texture.texture.getAlphaSprite(size, size, brightness, this, this.spritesArchive) : texture.texture.getSprite(size, size, brightness, this, this.spritesArchive);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!c", name = "g", descriptor = "(II)Z")
	@Override
	public boolean isLowDetail(@OriginalArg(1) int id) {
		return this.lowDetail || this.getMaterial(id).lowDetail;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
	public void clear() {
		this.glTextures.clear();
		if (this.solidColorSprites != null) {
			this.solidColorSprites.clear();
		}
		Static6.anIntArray539 = null;
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(II)I")
	@Override
	public int getAverageColor(@OriginalArg(0) int id) {
		return this.getMaterial(id).averageColor & 0xFFFF;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IZ)Z")
	@Override
	public boolean isGlTextureReady(@OriginalArg(0) int id) {
		@Pc(15) GlTexture texture = this.getGlTexture(id);
		return texture == null ? false : texture.isReady(this, this.spritesArchive);
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(IB)V")
	public void resize(@OriginalArg(0) int capacity) {
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
	public boolean method443(@OriginalArg(1) int id) {
		return this.getMaterial(id).aBoolean235;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BII)V")
	@Override
	public void method454(@OriginalArg(2) int id, @OriginalArg(1) int size) {
		MaterialManager.setMaterial(this.getMaterial(id).type & 0xFF, this.getMaterial(id).arg & 0xFF);
		@Pc(29) boolean local29 = false;
		@Pc(34) GlTexture texture = this.getGlTexture(id);
		if (texture != null) {
			local29 = texture.method4077(this, this.spritesArchive, size);
		}
		if (!local29) {
			@Pc(50) GlSolidColorTexture solidColorTexture = this.getSolidColorTexture(id);
			solidColorTexture.method3539();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)I")
	@Override
	public int method447(@OriginalArg(1) int id) {
		return this.getMaterial(id).aByte10 & 0xFF;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(IZ)Lclient!ln;")
	@Override
	protected Texture getTexture(@OriginalArg(0) int id) {
		@Pc(14) GlTexture texture = this.getGlTexture(id);
		return texture == null ? null : texture.texture;
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
	public void method451(@OriginalArg(1) int id) {
		this.method454(id, this.lowDetail || this.getMaterial(id).lowDetail ? 64 : 128);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(FII)[I")
	@Override
	public int[] method445(@OriginalArg(2) int id, @OriginalArg(0) float brightness) {
		@Pc(4) GlTexture texture = this.getGlTexture(id);
		if (texture == null) {
			return null;
		} else {
			texture.aBoolean344 = true;
			return texture.method4073(this, this.spritesArchive, brightness, this.lowDetail || this.getMaterial(id).lowDetail);
		}
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(II)I")
	@Override
	public int getMaterialType(@OriginalArg(0) int id) {
		return this.getMaterial(id).type & 0xFF;
	}
}
