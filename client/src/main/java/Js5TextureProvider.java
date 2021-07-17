import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public class Js5TextureProvider implements TextureProvider {

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "Lclient!dj;")
	private final LruHashTable textures = new LruHashTable(256);

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "Lclient!fh;")
	private final Js5 texturesArchive;

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "Lclient!fh;")
	private final Js5 spritesArchive;

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "[Lclient!mi;")
	private final Material[] materials;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lclient!fh;Lclient!fh;Lclient!fh;)V")
	protected Js5TextureProvider(@OriginalArg(1) Js5 texturesArchive, @OriginalArg(2) Js5 spritesArchive, @OriginalArg(0) Js5 materialsArchive) {
		this.texturesArchive = texturesArchive;
		this.spritesArchive = spritesArchive;
		@Pc(24) Buffer buffer = new Buffer(materialsArchive.fetchFile(0, 0));
		@Pc(28) int len = buffer.readUnsignedShort();
		this.materials = new Material[len];
		for (@Pc(34) int i = 0; i < len; i++) {
			if (buffer.readUnsignedByte() == 1) {
				this.materials[i] = new Material();
			}
		}
		for (@Pc(60) int i = 0; i < len; i++) {
			if (this.materials[i] != null) {
				this.materials[i].aBoolean237 = buffer.readUnsignedByte() == 0;
			}
		}
		for (@Pc(88) int i = 0; i < len; i++) {
			if (this.materials[i] != null) {
				this.materials[i].aBoolean235 = buffer.readUnsignedByte() == 1;
			}
		}
		for (@Pc(117) int i = 0; i < len; i++) {
			if (this.materials[i] != null) {
				this.materials[i].lowDetail = buffer.readUnsignedByte() == 1;
			}
		}
		for (@Pc(149) int i = 0; i < len; i++) {
			if (this.materials[i] != null) {
				this.materials[i].aBoolean233 = buffer.readUnsignedByte() == 1;
			}
		}
		for (@Pc(180) int i = 0; i < len; i++) {
			if (this.materials[i] != null) {
				this.materials[i].aByte10 = buffer.readByte();
			}
		}
		for (@Pc(206) int i = 0; i < len; i++) {
			if (this.materials[i] != null) {
				this.materials[i].aByte7 = buffer.readByte();
			}
		}
		for (@Pc(232) int i = 0; i < len; i++) {
			if (this.materials[i] != null) {
				this.materials[i].type = buffer.readByte();
			}
		}
		for (@Pc(254) int i = 0; i < len; i++) {
			if (this.materials[i] != null) {
				this.materials[i].arg = buffer.readByte();
			}
		}
		for (@Pc(277) int i = 0; i < len; i++) {
			if (this.materials[i] != null) {
				this.materials[i].averageColor = (short) buffer.readUnsignedShort();
			}
		}
		if (buffer.position < buffer.bytes.length) {
			for (@Pc(315) int i = 0; i < len; i++) {
				if (this.materials[i] != null) {
					buffer.readByte();
				}
			}
			for (@Pc(337) int i = 0; i < len; i++) {
				if (this.materials[i] != null) {
					buffer.readByte();
				}
			}
			for (@Pc(355) int i = 0; i < len; i++) {
				if (this.materials[i] != null) {
					buffer.readUnsignedByte();
				}
			}
			for (@Pc(377) int i = 0; i < len; i++) {
				if (this.materials[i] != null) {
					this.materials[i].columnMajor = buffer.readUnsignedByte() == 1;
				}
			}
			for (@Pc(406) int i = 0; i < len; i++) {
				if (this.materials[i] != null) {
					buffer.readByte();
				}
			}
			for (@Pc(424) int i = 0; i < len; i++) {
				if (this.materials[i] != null) {
					buffer.readUnsignedByte();
				}
			}
			for (@Pc(445) int i = 0; i < len; i++) {
				if (this.materials[i] != null) {
					buffer.readUnsignedByte();
				}
			}
			for (@Pc(467) int i = 0; i < len; i++) {
				if (this.materials[i] != null) {
					buffer.readUnsignedByte();
				}
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IFIIIZ)[I")
	@Override
	public final int[] getPixels(@OriginalArg(2) int id, @OriginalArg(3) int width, @OriginalArg(0) int height, @OriginalArg(1) float brightness) {
		return this.getTexture(id).getPixels(width, height, brightness, this, this.spritesArchive, this.materials[id].columnMajor, false);
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(IZ)Lclient!ln;")
	protected Texture getTexture(@OriginalArg(0) int id) {
		@Pc(10) SecondaryNode texture = this.textures.get(id);
		if (texture != null) {
			return (Texture) texture;
		}
		@Pc(21) byte[] bytes = this.texturesArchive.fetchFile(id);
		if (bytes == null) {
			return null;
		} else {
			@Pc(34) Texture newTexture = new Texture(new Buffer(bytes));
			this.textures.put(id, newTexture);
			return newTexture;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Z")
	@Override
	public final boolean isTextureReady(@OriginalArg(0) int id) {
		@Pc(11) Texture texture = this.getTexture(id);
		return texture != null && texture.isReady(this, this.spritesArchive);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IB)Lclient!mi;")
	@Override
	public final Material getMaterial(@OriginalArg(0) int id) {
		return this.materials[id];
	}
}
