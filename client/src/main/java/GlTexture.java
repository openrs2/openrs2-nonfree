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
	private int[] anIntArray538;

	@OriginalMember(owner = "client!so", name = "H", descriptor = "I")
	private int anInt4971;

	@OriginalMember(owner = "client!so", name = "I", descriptor = "I")
	private int contextId;

	@OriginalMember(owner = "client!so", name = "O", descriptor = "F")
	private float aFloat131;

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
	private final boolean aBoolean341;

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
	private final int anInt4969;

	@OriginalMember(owner = "client!so", name = "B", descriptor = "I")
	private final int combineRgbMode;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lclient!fd;)V")
	public GlTexture(@OriginalArg(0) Buffer buffer) {
		this.texture = new Texture(buffer);
		this.aBoolean345 = buffer.readUnsignedByte() == 1;
		this.aBoolean341 = buffer.readUnsignedByte() == 1;
		this.wrapS = buffer.readUnsignedByte() == 1;
		this.wrapT = buffer.readUnsignedByte() == 1;
		@Pc(62) int combineRgbMode = buffer.readUnsignedByte() & 0x3;
		this.anInt4968 = buffer.readByte();
		this.anInt4970 = buffer.readByte();
		@Pc(76) int local76 = buffer.readUnsignedByte();
		buffer.readUnsignedByte();
		this.bloom = buffer.readUnsignedByte() == 1;
		this.anInt4969 = local76 >> 4 & 0xF;
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
	public final int[] method4071(@OriginalArg(0) TextureProvider arg0, @OriginalArg(1) Js5 spritesArchive, @OriginalArg(2) boolean lowDetail) {
		if (this.texture.isReady(arg0, spritesArchive)) {
			@Pc(14) int local14 = lowDetail ? 64 : 128;
			return this.texture.getPixels(1.0D, this.aBoolean341, spritesArchive, arg0, local14, false, local14);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!kj;Lclient!fh;FZ)[I")
	public final int[] method4073(@OriginalArg(0) TextureProvider arg0, @OriginalArg(1) Js5 spritesArchive, @OriginalArg(2) float arg2, @OriginalArg(3) boolean lowDetail) {
		if (this.anIntArray538 == null || this.aFloat131 != arg2) {
			if (!this.texture.isReady(arg0, spritesArchive)) {
				return null;
			}
			this.anInt4971 = lowDetail ? 64 : 128;
			this.anIntArray538 = this.texture.getPixels((double) arg2, this.aBoolean341, spritesArchive, arg0, this.anInt4971, true, this.anInt4971);
			this.aFloat131 = arg2;
			if (this.aBoolean345) {
				@Pc(50) int[] local50 = new int[this.anInt4971];
				@Pc(54) int[] local54 = new int[this.anInt4971];
				@Pc(58) int[] local58 = new int[this.anInt4971];
				@Pc(65) int[] local65 = new int[this.anInt4971 * this.anInt4971];
				@Pc(68) int local68 = this.anInt4971;
				@Pc(71) int local71 = this.anInt4971;
				@Pc(75) int local75 = local68 - 1;
				@Pc(79) int local79 = local71 - 1;
				@Pc(83) int local83 = local68 * local71;
				@Pc(88) int local88;
				@Pc(89) int local89 = local88 = local68;
				for (@Pc(91) int local91 = 2; local91 >= 0; local91--) {
					for (@Pc(95) int local95 = local75; local95 >= 0; local95--) {
						local88--;
						@Pc(103) int local103 = this.anIntArray538[local88];
						local50[local95] += local103 >> 16 & 0xFF;
						local54[local95] += local103 >> 8 & 0xFF;
						local58[local95] += local103 & 0xFF;
					}
					if (local88 == 0) {
						local88 = local83;
					}
				}
				@Pc(144) int local144 = local83;
				for (@Pc(146) int local146 = local79; local146 >= 0; local146--) {
					@Pc(150) int local150 = 1;
					@Pc(152) int local152 = 1;
					@Pc(155) int local155 = 0;
					@Pc(157) int local157 = 0;
					@Pc(158) int local158 = 0;
					for (@Pc(160) int local160 = 2; local160 >= 0; local160--) {
						local152--;
						local158 += local50[local152];
						local155 += local54[local152];
						local157 += local58[local152];
						if (local152 == 0) {
							local152 = local68;
						}
					}
					for (@Pc(189) int local189 = local75; local189 >= 0; local189--) {
						local152--;
						local150--;
						@Pc(197) int local197 = local158 / 9;
						@Pc(201) int local201 = local155 / 9;
						@Pc(205) int local205 = local157 / 9;
						local144--;
						local65[local144] = local197 << 16 | local201 << 8 | local205;
						local158 += local50[local152] - local50[local150];
						local157 += local58[local152] - local58[local150];
						local155 += local54[local152] - local54[local150];
						if (local152 == 0) {
							local152 = local68;
						}
						if (local150 == 0) {
							local150 = local68;
						}
					}
					for (@Pc(260) int local260 = local75; local260 >= 0; local260--) {
						local88--;
						@Pc(268) int local268 = this.anIntArray538[local88];
						local89--;
						@Pc(274) int local274 = this.anIntArray538[local89];
						local50[local260] += (local268 >> 16 & 0xFF) - (local274 >> 16 & 0xFF);
						local54[local260] += (local268 >> 8 & 0xFF) - (local274 >> 8 & 0xFF);
						local58[local260] += (local268 & 0xFF) - (local274 & 0xFF);
					}
					if (local88 == 0) {
						local88 = local83;
					}
					if (local89 == 0) {
						local89 = local83;
					}
				}
				this.anIntArray538 = local65;
			}
		}
		return this.anIntArray538;
	}

	@OriginalMember(owner = "client!so", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		if (this.textureId != -1) {
			GlCleaner.deleteTexture(this.textureId, this.textureSize, this.contextId);
			this.textureId = -1;
			this.textureSize = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!so", name = "d", descriptor = "(I)V")
	public final void method4074(@OriginalArg(0) int arg0) {
		if (this.anIntArray538 == null || this.anInt4970 == 0 && this.anInt4968 == 0) {
			return;
		}
		if (Static6.anIntArray539 == null || Static6.anIntArray539.length < this.anIntArray538.length) {
			Static6.anIntArray539 = new int[this.anIntArray538.length];
		}
		@Pc(26) int local26 = this.anIntArray538.length;
		@Pc(31) int local31 = arg0 * this.anInt4968;
		@Pc(36) int local36 = this.anInt4971 - 1;
		@Pc(44) int local44 = this.anInt4971 * arg0 * this.anInt4970;
		@Pc(48) int local48 = local26 - 1;
		for (@Pc(50) int local50 = 0; local50 < local26; local50 += this.anInt4971) {
			@Pc(59) int local59 = local50 + local44 & local48;
			for (@Pc(61) int local61 = 0; local61 < this.anInt4971; local61++) {
				@Pc(69) int local69 = local50 + local61;
				@Pc(77) int local77 = local59 + (local61 + local31 & local36);
				Static6.anIntArray539[local69] = this.anIntArray538[local77];
			}
		}
		@Pc(95) int[] local95 = this.anIntArray538;
		this.anIntArray538 = Static6.anIntArray539;
		Static6.anIntArray539 = local95;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!kj;Lclient!fh;)Z")
	public final boolean isReady(@OriginalArg(0) TextureProvider provider, @OriginalArg(1) Js5 spritesArchive) {
		return this.texture.isReady(provider, spritesArchive);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!kj;Lclient!fh;I)Z")
	public final boolean method4077(@OriginalArg(0) TextureProvider provider, @OriginalArg(1) Js5 spritesArchive, @OriginalArg(2) int arg2) {
		if (!this.texture.isReady(provider, spritesArchive)) {
			return false;
		}
		@Pc(10) GL gl = GlRenderer.gl;
		@Pc(13) int flags = MaterialManager.getFlags();
		if ((flags & 0x1) == 0) {
			if (this.textureId != -1 && this.anInt4971 == arg2) {
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
					@Pc(64) float[] pixels = this.texture.getBloomPixels(arg2, this.aBoolean341, provider, spritesArchive, arg2);
					if (this.anInt4969 == 2) {
						Static33.method4070(GlTextureAllocator.GL_TEXTURE_2D, GlTextureAllocator.GL_RGBA16F, arg2, arg2, GlTextureAllocator.GL_RGBA, GlTextureAllocator.GL_FLOAT, pixels);
						gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR_MIPMAP_LINEAR);
						gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
						GlCleaner.onCardTexture += pixels.length * 4 / 3 - this.textureSize;
						this.textureSize = pixels.length * 4 / 3;
					} else {
						gl.glTexImage2D(GL.GL_TEXTURE_2D, GL.GL_POINTS, GL.GL_RGBA16F, arg2, arg2, GL.GL_POINTS, GL.GL_RGBA, GL.GL_FLOAT, FloatBuffer.wrap(pixels));
						gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
						gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
						GlCleaner.onCardTexture += pixels.length - this.textureSize;
						this.textureSize = pixels.length;
					}
				} else {
					@Pc(148) int local148 = GlRenderer.bigEndian ? 33639 : 5121;
					@Pc(160) int[] pixels = this.texture.getPixelsAlpha(arg2, arg2, spritesArchive, 0.7D, provider, this.aBoolean341);
					if (this.anInt4969 == 2) {
						Static33.method4072(GlTextureAllocator.GL_TEXTURE_2D, GlTextureAllocator.GL_RGBA, arg2, arg2, GlTextureAllocator.GL_BGRA, local148, pixels);
						gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR_MIPMAP_LINEAR);
						gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
						GlCleaner.onCardTexture += pixels.length * 4 / 3 - this.textureSize;
						this.textureSize = pixels.length * 4 / 3;
					} else if (this.anInt4969 == 1) {
						@Pc(209) int local209 = 0;
						while (true) {
							gl.glTexImage2D(GL.GL_TEXTURE_2D, local209++, GL.GL_RGBA, arg2, arg2, GL.GL_POINTS, GL.GL_BGRA, local148, IntBuffer.wrap(pixels));
							arg2 >>= 1;
							if (arg2 == 0) {
								gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR_MIPMAP_LINEAR);
								gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
								GlCleaner.onCardTexture += pixels.length * 4 / 3 - this.textureSize;
								this.textureSize = pixels.length * 4 / 3;
								break;
							}
							pixels = this.texture.getPixelsAlpha(arg2, arg2, spritesArchive, 0.7D, provider, this.aBoolean341);
						}
					} else {
						gl.glTexImage2D(GL.GL_TEXTURE_2D, GL.GL_POINTS, GL.GL_RGBA, arg2, arg2, GL.GL_POINTS, GL.GL_BGRA, local148, IntBuffer.wrap(pixels));
						gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
						gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
						GlCleaner.onCardTexture += pixels.length - this.textureSize;
						this.textureSize = pixels.length;
					}
				}
				gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_WRAP_S, this.wrapS ? GL.GL_REPEAT : GL.GL_CLAMP_TO_EDGE);
				gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_WRAP_T, this.wrapT ? GL.GL_REPEAT : GL.GL_CLAMP_TO_EDGE);
				this.anInt4971 = arg2;
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
				@Pc(367) float y = (float) (GlRenderer.anInt2085 * this.anInt4970) / (float) this.anInt4971;
				@Pc(377) float x = (float) (GlRenderer.anInt2085 * this.anInt4968) / (float) this.anInt4971;
				GlRenderer.translateTextureMatrix(x, y, 0.0F);
			}
		}
		return true;
	}
}
