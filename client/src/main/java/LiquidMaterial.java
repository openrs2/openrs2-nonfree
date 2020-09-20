import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class LiquidMaterial implements Material {

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
	private int anInt2099 = -1;

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
	private int anInt2101 = -1;

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
	private int anInt2100;

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "Ljava/nio/FloatBuffer;")
	private FloatBuffer aFloatBuffer1;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V")
	public LiquidMaterial() {
		if (this.anInt2099 < 0 && (GlRenderer.arbVertexProgramSupported && GlRenderer.maxTextureUnits >= 2)) {
			@Pc(19) int[] local19 = new int[1];
			@Pc(21) GL local21 = GlRenderer.gl;
			local21.glGenProgramsARB(1, local19, 0);
			this.anInt2100 = local19[0];
			@Pc(42) int[][] local42 = Static27.method3234(0.4F);
			@Pc(53) int[][] local53 = Static27.method3234(0.4F);
			@Pc(58) Buffer local58 = new Buffer(262144);
			for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
				@Pc(67) int[] local67 = local42[local60];
				@Pc(71) int[] local71 = local53[local60];
				for (@Pc(73) int local73 = 0; local73 < 64; local73++) {
					if (GlRenderer.bigEndian) {
						local58.writeFloat((float) local67[local73] / 4096.0F);
						local58.writeFloat((float) local71[local73] / 4096.0F);
						local58.writeFloat(1.0F);
						local58.writeFloat(1.0F);
					} else {
						local58.writeFloatLE((float) local67[local73] / 4096.0F);
						local58.writeFloatLE((float) local71[local73] / 4096.0F);
						local58.writeFloatLE(1.0F);
						local58.writeFloatLE(1.0F);
					}
				}
			}
			@Pc(141) ByteBuffer local141 = ByteBuffer.allocateDirect(local58.position).order(ByteOrder.nativeOrder());
			local141.put(local58.bytes, 0, local58.position);
			local141.flip();
			this.aFloatBuffer1 = local141.asFloatBuffer().asReadOnlyBuffer();
			this.method1642();
			this.method1643();
		}
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "()I")
	@Override
	public final int getFlags() {
		return 0;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "()V")
	@Override
	public final void unbind() {
		if (this.anInt2099 >= 0) {
			@Pc(5) GL local5 = GlRenderer.gl;
			local5.glCallList(this.anInt2099 + 1);
		}
	}

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "()V")
	private void method1642() {
		@Pc(1) GL local1 = GlRenderer.gl;
		this.anInt2099 = local1.glGenLists(2);
		local1.glNewList(this.anInt2099, GL.GL_COMPILE);
		local1.glActiveTexture(GL.GL_TEXTURE1);
		if (Static3.aBoolean160) {
			local1.glBindTexture(GL.GL_TEXTURE_3D, Static3.anInt2342);
		}
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_ADD);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_REPLACE);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_PREVIOUS);
		local1.glActiveTexture(GL.GL_TEXTURE0);
		local1.glBindProgramARB(GL.GL_VERTEX_PROGRAM_ARB, this.anInt2100);
		local1.glEnable(GL.GL_VERTEX_PROGRAM_ARB);
		local1.glEndList();
		local1.glNewList(this.anInt2099 + 1, GL.GL_COMPILE);
		local1.glActiveTexture(GL.GL_TEXTURE1);
		local1.glMatrixMode(GL.GL_TEXTURE);
		local1.glLoadIdentity();
		local1.glMatrixMode(GL.GL_MODELVIEW);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_MODULATE);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_TEXTURE);
		local1.glDisable(Static3.aBoolean160 ? GL.GL_TEXTURE_3D : GL.GL_TEXTURE_2D);
		local1.glActiveTexture(GL.GL_TEXTURE0);
		local1.glBindProgramARB(GL.GL_VERTEX_PROGRAM_ARB, 0);
		local1.glDisable(GL.GL_VERTEX_PROGRAM_ARB);
		local1.glDisable(GL.GL_FRAGMENT_PROGRAM_ARB);
		local1.glEndList();
	}

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "()V")
	private void method1643() {
		if (this.anInt2099 < 0) {
			return;
		}
		@Pc(4) GL local4 = GlRenderer.gl;
		@Pc(7) int[] local7 = new int[1];
		local4.glBindProgramARB(GL.GL_VERTEX_PROGRAM_ARB, this.anInt2100);
		local4.glProgramStringARB(GL.GL_VERTEX_PROGRAM_ARB, GL.GL_PROGRAM_FORMAT_ASCII_ARB, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, 1;\nMOV   oFogCoord.x, clipPos.z;\nMOV   oPos, clipPos; \nEND".length(), "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, 1;\nMOV   oFogCoord.x, clipPos.z;\nMOV   oPos, clipPos; \nEND");
		local4.glGetIntegerv(GL.GL_PROGRAM_ERROR_POSITION_ARB, local7, 0);
		if (local7[0] != -1) {
			return;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
	@Override
	public final void setArgument(@OriginalArg(0) int arg) {
		if (this.anInt2099 < 0) {
			return;
		}
		@Pc(5) GL local5 = GlRenderer.gl;
		local5.glActiveTexture(GL.GL_TEXTURE1);
		if ((arg & 0x80) == 0) {
			local5.glEnable(Static3.aBoolean160 ? GL.GL_TEXTURE_3D : GL.GL_TEXTURE_2D);
		} else {
			local5.glDisable(Static3.aBoolean160 ? GL.GL_TEXTURE_3D : GL.GL_TEXTURE_2D);
		}
		local5.glActiveTexture(GL.GL_TEXTURE0);
		if ((arg & 0x40) == 0) {
			local5.glGetFloatv(GL.GL_LIGHT_MODEL_AMBIENT, Static3.aFloatArray21, 0);
			local5.glProgramLocalParameter4fvARB(GL.GL_VERTEX_PROGRAM_ARB, 66, Static3.aFloatArray21, 0);
		} else {
			local5.glProgramLocalParameter4fARB(GL.GL_VERTEX_PROGRAM_ARB, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		@Pc(58) int local58 = arg & 0x3;
		if (local58 == 2) {
			local5.glProgramLocalParameter4fARB(GL.GL_VERTEX_PROGRAM_ARB, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local58 == 3) {
			local5.glProgramLocalParameter4fARB(GL.GL_VERTEX_PROGRAM_ARB, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			local5.glProgramLocalParameter4fARB(GL.GL_VERTEX_PROGRAM_ARB, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "()V")
	@Override
	public final void bind() {
		if (this.anInt2099 < 0) {
			return;
		}
		@Pc(5) GL local5 = GlRenderer.gl;
		local5.glCallList(this.anInt2099);
		local5.glActiveTexture(GL.GL_TEXTURE1);
		local5.glMatrixMode(GL.GL_TEXTURE);
		local5.glTranslatef((float) Static5.anInt3731, (float) Static6.anInt4558, (float) Static1.anInt525);
		local5.glRotatef(-((float) Static6.anInt4403 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
		local5.glRotatef(-((float) Static4.anInt3258 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
		local5.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local5.glMatrixMode(GL.GL_MODELVIEW);
		if (!Static3.aBoolean160) {
			local5.glBindTexture(GL.GL_TEXTURE_2D, Static3.anIntArray198[(int) ((float) (GlRenderer.anInt2085 * 64) * 0.005F) % 64]);
		}
		local5.glActiveTexture(GL.GL_TEXTURE0);
		if (this.anInt2101 == GlRenderer.anInt2085) {
			return;
		}
		@Pc(85) int local85 = (GlRenderer.anInt2085 & 0xFF) * 256;
		for (@Pc(87) int local87 = 0; local87 < 64; local87++) {
			this.aFloatBuffer1.position(local85);
			local5.glProgramLocalParameter4fvARB(GL.GL_VERTEX_PROGRAM_ARB, local87, this.aFloatBuffer1);
			local85 += 4;
		}
		if (Static3.aBoolean160) {
			local5.glProgramLocalParameter4fARB(GL.GL_VERTEX_PROGRAM_ARB, 65, (float) GlRenderer.anInt2085 * 0.005F, 0.0F, 0.0F, 1.0F);
		} else {
			local5.glProgramLocalParameter4fARB(GL.GL_VERTEX_PROGRAM_ARB, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt2101 = GlRenderer.anInt2085;
	}
}
