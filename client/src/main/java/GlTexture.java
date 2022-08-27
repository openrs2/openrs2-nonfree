import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class GlTexture extends SecondaryNode {

	@OriginalMember(owner = "client!so", name = "A", descriptor = "[I")
	private int[] pixels;

	@OriginalMember(owner = "client!so", name = "H", descriptor = "I")
	private int size;

	@OriginalMember(owner = "client!so", name = "I", descriptor = "I")
	private int contextId;

	@OriginalMember(owner = "client!so", name = "O", descriptor = "F")
	private float brightness;

	@OriginalMember(owner = "client!so", name = "M", descriptor = "I")
	private int textureSize = 0;

	@OriginalMember(owner = "client!so", name = "z", descriptor = "I")
	private int textureId = -1;

	@OriginalMember(owner = "client!so", name = "L", descriptor = "Z")
	public boolean aBoolean344 = false;

	@OriginalMember(owner = "client!so", name = "J", descriptor = "Lclient!ln;")
	public final Texture texture;

	@OriginalMember(owner = "client!so", name = "N", descriptor = "Z")
	private final boolean aBoolean345;

	@OriginalMember(owner = "client!so", name = "y", descriptor = "Z")
	private final boolean columnMajor;

	@OriginalMember(owner = "client!so", name = "P", descriptor = "Z")
	private final boolean wrapS;

	@OriginalMember(owner = "client!so", name = "F", descriptor = "Z")
	private final boolean wrapT;

	@OriginalMember(owner = "client!so", name = "C", descriptor = "I")
	private final int anInt4968;

	@OriginalMember(owner = "client!so", name = "G", descriptor = "I")
	private final int anInt4970;

	@OriginalMember(owner = "client!so", name = "K", descriptor = "Z")
	private final boolean bloom;

	@OriginalMember(owner = "client!so", name = "E", descriptor = "I")
	private final int mipMapMode;

	@OriginalMember(owner = "client!so", name = "B", descriptor = "I")
	private final int combineRgbMode;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lclient!fd;)V")
	public GlTexture(@OriginalArg(0) Buffer buffer) {
		this.texture = new Texture(buffer);
		this.aBoolean345 = buffer.readUnsignedByte() == 1;
		this.columnMajor = buffer.readUnsignedByte() == 1;
		this.wrapS = buffer.readUnsignedByte() == 1;
		this.wrapT = buffer.readUnsignedByte() == 1;
		@Pc(62) int combineRgbMode = buffer.readUnsignedByte() & 0x3;
		this.anInt4968 = buffer.readByte();
		this.anInt4970 = buffer.readByte();
		@Pc(76) int local76 = buffer.readUnsignedByte();
		buffer.readUnsignedByte();
		this.bloom = buffer.readUnsignedByte() == 1;
		this.mipMapMode = local76 >> 4 & 0xF;
		if (combineRgbMode == 1) {
			this.combineRgbMode = 2;
		} else if (combineRgbMode == 2) {
			this.combineRgbMode = 3;
		} else if (combineRgbMode == 3) {
			this.combineRgbMode = 4;
		} else {
			this.combineRgbMode = 0;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!kj;Lclient!fh;Z)[I")
	public int[] getPixels(@OriginalArg(0) TextureProvider textureProvider, @OriginalArg(1) Js5 spritesArchive, @OriginalArg(2) boolean lowDetail) {
		if (this.texture.isReady(textureProvider, spritesArchive)) {
			@Pc(14) int size = lowDetail ? 64 : 128;
			return this.texture.getPixels(size, size, 1.0D, textureProvider, spritesArchive, this.columnMajor, false);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!kj;Lclient!fh;FZ)[I")
	public int[] method4073(@OriginalArg(0) TextureProvider textureProvider, @OriginalArg(1) Js5 spritesArchive, @OriginalArg(2) float brightness, @OriginalArg(3) boolean lowDetail) {
		if (this.pixels == null || this.brightness != brightness) {
			if (!this.texture.isReady(textureProvider, spritesArchive)) {
				return null;
			}
			this.size = lowDetail ? 64 : 128;
			this.pixels = this.texture.getPixels(this.size, this.size, brightness, textureProvider, spritesArchive, this.columnMajor, true);
			this.brightness = brightness;
			if (this.aBoolean345) {
				@Pc(50) int[] reds = new int[this.size];
				@Pc(54) int[] greens = new int[this.size];
				@Pc(58) int[] blues = new int[this.size];
				@Pc(65) int[] pixels = new int[this.size * this.size];
				@Pc(68) int local68 = this.size;
				@Pc(71) int local71 = this.size;
				@Pc(75) int local75 = local68 - 1;
				@Pc(79) int local79 = local71 - 1;
				@Pc(83) int local83 = local68 * local71;
				@Pc(88) int local88;
				@Pc(89) int local89 = local88 = local68;
				for (@Pc(91) int local91 = 2; local91 >= 0; local91--) {
					for (@Pc(95) int local95 = local75; local95 >= 0; local95--) {
						local88--;
						@Pc(103) int color = this.pixels[local88];
						reds[local95] += color >> 16 & 0xFF;
						greens[local95] += color >> 8 & 0xFF;
						blues[local95] += color & 0xFF;
					}
					if (local88 == 0) {
						local88 = local83;
					}
				}
				@Pc(144) int local144 = local83;
				for (@Pc(146) int local146 = local79; local146 >= 0; local146--) {
					@Pc(150) int local150 = 1;
					@Pc(152) int local152 = 1;
					@Pc(155) int green = 0;
					@Pc(157) int blue = 0;
					@Pc(158) int red = 0;
					for (@Pc(160) int local160 = 2; local160 >= 0; local160--) {
						local152--;
						red += reds[local152];
						green += greens[local152];
						blue += blues[local152];
						if (local152 == 0) {
							local152 = local68;
						}
					}
					for (@Pc(189) int local189 = local75; local189 >= 0; local189--) {
						local152--;
						local150--;
						@Pc(197) int averageRed = red / 9;
						@Pc(201) int averageGreen = green / 9;
						@Pc(205) int averageBlue = blue / 9;
						local144--;
						pixels[local144] = averageRed << 16 | averageGreen << 8 | averageBlue;
						red += reds[local152] - reds[local150];
						blue += blues[local152] - blues[local150];
						green += greens[local152] - greens[local150];
						if (local152 == 0) {
							local152 = local68;
						}
						if (local150 == 0) {
							local150 = local68;
						}
					}
					for (@Pc(260) int local260 = local75; local260 >= 0; local260--) {
						local88--;
						@Pc(268) int local268 = this.pixels[local88];
						local89--;
						@Pc(274) int local274 = this.pixels[local89];
						reds[local260] += (local268 >> 16 & 0xFF) - (local274 >> 16 & 0xFF);
						greens[local260] += (local268 >> 8 & 0xFF) - (local274 >> 8 & 0xFF);
						blues[local260] += (local268 & 0xFF) - (local274 & 0xFF);
					}
					if (local88 == 0) {
						local88 = local83;
					}
					if (local89 == 0) {
						local89 = local83;
					}
				}
				this.pixels = pixels;
			}
		}
		return this.pixels;
	}

	@OriginalMember(owner = "client!so", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.textureId != -1) {
			GlCleaner.deleteTexture(this.textureId, this.textureSize, this.contextId);
			this.textureId = -1;
			this.textureSize = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!so", name = "d", descriptor = "(I)V")
	public void method4074(@OriginalArg(0) int arg0) {
		if (this.pixels == null || this.anInt4970 == 0 && this.anInt4968 == 0) {
			return;
		}
		if (Static6.anIntArray539 == null || Static6.anIntArray539.length < this.pixels.length) {
			Static6.anIntArray539 = new int[this.pixels.length];
		}
		@Pc(26) int local26 = this.pixels.length;
		@Pc(31) int local31 = arg0 * this.anInt4968;
		@Pc(36) int local36 = this.size - 1;
		@Pc(44) int local44 = this.size * arg0 * this.anInt4970;
		@Pc(48) int local48 = local26 - 1;
		for (@Pc(50) int local50 = 0; local50 < local26; local50 += this.size) {
			@Pc(59) int local59 = local50 + local44 & local48;
			for (@Pc(61) int local61 = 0; local61 < this.size; local61++) {
				@Pc(69) int local69 = local50 + local61;
				@Pc(77) int local77 = local59 + (local61 + local31 & local36);
				Static6.anIntArray539[local69] = this.pixels[local77];
			}
		}
		@Pc(95) int[] local95 = this.pixels;
		this.pixels = Static6.anIntArray539;
		Static6.anIntArray539 = local95;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!kj;Lclient!fh;)Z")
	public boolean isReady(@OriginalArg(0) TextureProvider provider, @OriginalArg(1) Js5 spritesArchive) {
		return this.texture.isReady(provider, spritesArchive);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!kj;Lclient!fh;I)Z")
	public boolean method4077(@OriginalArg(0) TextureProvider provider, @OriginalArg(1) Js5 spritesArchive, @OriginalArg(2) int size) {
		if (!this.texture.isReady(provider, spritesArchive)) {
			return false;
		}
		@Pc(10) GL gl = GlRenderer.gl;
		@Pc(13) int flags = MaterialManager.getFlags();
		if ((flags & 0x1) == 0) {
			if (this.textureId != -1 && this.size == size) {
				GlRenderer.setTextureId(this.textureId);
			} else {
				if (this.textureId == -1) {
					@Pc(32) int[] temp = new int[1];
					gl.glGenTextures(1, temp, 0);
					this.textureId = temp[0];
					this.contextId = GlCleaner.contextId;
				}
				GlRenderer.setTextureId(this.textureId);
				if (this.bloom && PostProcessorManager.isBloomEnabled()) {
					@Pc(64) float[] pixels = this.texture.getBloomPixels(size, size, provider, spritesArchive, this.columnMajor);
					if (this.mipMapMode == 2) {
						Static33.method4070(GlTextureAllocator.GL_TEXTURE_2D, GlTextureAllocator.GL_RGBA16F, size, size, GlTextureAllocator.GL_RGBA, GlTextureAllocator.GL_FLOAT, pixels);
						gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR_MIPMAP_LINEAR);
						gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
						GlCleaner.onCardTexture += pixels.length * 4 / 3 - this.textureSize;
						this.textureSize = pixels.length * 4 / 3;
					} else {
						gl.glTexImage2D(GL.GL_TEXTURE_2D, GL.GL_POINTS, GL.GL_RGBA16F, size, size, GL.GL_POINTS, GL.GL_RGBA, GL.GL_FLOAT, FloatBuffer.wrap(pixels));
						gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
						gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
						GlCleaner.onCardTexture += pixels.length - this.textureSize;
						this.textureSize = pixels.length;
					}
				} else {
					@Pc(148) int type = GlRenderer.bigEndian ? 33639 : 5121;
					@Pc(160) int[] pixels = this.texture.getPixelsAlpha(size, size, 0.7D, provider, spritesArchive, this.columnMajor);
					if (this.mipMapMode == 2) {
						Static33.method4072(GlTextureAllocator.GL_TEXTURE_2D, GlTextureAllocator.GL_RGBA, size, size, GlTextureAllocator.GL_BGRA, type, pixels);
						gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR_MIPMAP_LINEAR);
						gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
						GlCleaner.onCardTexture += pixels.length * 4 / 3 - this.textureSize;
						this.textureSize = pixels.length * 4 / 3;
					} else if (this.mipMapMode == 1) {
						@Pc(209) int level = 0;
						while (true) {
							gl.glTexImage2D(GL.GL_TEXTURE_2D, level++, GL.GL_RGBA, size, size, GL.GL_POINTS, GL.GL_BGRA, type, IntBuffer.wrap(pixels));
							size >>= 1;
							if (size == 0) {
								gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR_MIPMAP_LINEAR);
								gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
								GlCleaner.onCardTexture += pixels.length * 4 / 3 - this.textureSize;
								this.textureSize = pixels.length * 4 / 3;
								break;
							}
							pixels = this.texture.getPixelsAlpha(size, size, 0.7D, provider, spritesArchive, this.columnMajor);
						}
					} else {
						gl.glTexImage2D(GL.GL_TEXTURE_2D, GL.GL_POINTS, GL.GL_RGBA, size, size, GL.GL_POINTS, GL.GL_BGRA, type, IntBuffer.wrap(pixels));
						gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
						gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
						GlCleaner.onCardTexture += pixels.length - this.textureSize;
						this.textureSize = pixels.length;
					}
				}
				gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_WRAP_S, this.wrapS ? GL.GL_REPEAT : GL.GL_CLAMP_TO_EDGE);
				gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_WRAP_T, this.wrapT ? GL.GL_REPEAT : GL.GL_CLAMP_TO_EDGE);
				this.size = size;
			}
		}
		if ((flags & 0x2) == 0) {
			GlRenderer.setTextureCombineRgbMode(this.combineRgbMode);
		}
		if ((flags & 0x4) == 0) {
			GlRenderer.setTextureCombineAlphaMode(0);
		}
		if ((flags & 0x8) == 0) {
			if (this.anInt4970 == 0 && this.anInt4968 == 0) {
				GlRenderer.resetTextureMatrix();
			} else {
				@Pc(367) float y = (float) (GlRenderer.anInt2085 * this.anInt4970) / (float) this.size;
				@Pc(377) float x = (float) (GlRenderer.anInt2085 * this.anInt4968) / (float) this.size;
				GlRenderer.translateTextureMatrix(x, y, 0.0F);
			}
		}
		return true;
	}
}
