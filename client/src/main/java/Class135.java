import java.nio.ByteBuffer;
import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class135 {

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
	public int anInt4159;

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer13;

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
	public int anInt4160;

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer14;

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "[B")
	private byte[] aByteArray53;

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "[B")
	private byte[] aByteArray54;

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "Lclient!lk;")
	private GlBuffer aClass111_5;

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
	public int anInt4161;

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "[I")
	private int[] anIntArray436;

	@OriginalMember(owner = "client!pi", name = "j", descriptor = "[I")
	private int[] anIntArray437;

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "Lclient!lk;")
	private GlBuffer aClass111_6;

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
	public int anInt4162;

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "[I")
	private int[] anIntArray438;

	@OriginalMember(owner = "client!pi", name = "n", descriptor = "Lclient!ic;")
	private HashTable aClass84_19;

	@OriginalMember(owner = "client!pi", name = "o", descriptor = "[B")
	private byte[] aByteArray55;

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "[I")
	private int[] anIntArray439;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "([I)V")
	public final void method3431(@OriginalArg(0) int[] arg0) {
		for (@Pc(1) int local1 = 1; local1 < arg0.length - 1; local1++) {
			this.anIntArray437[this.anInt4162++] = arg0[0];
			this.anIntArray437[this.anInt4162++] = arg0[local1];
			this.anIntArray437[this.anInt4162++] = arg0[local1 + 1];
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "()V")
	public final void method3432() {
		this.anIntArray437 = new int[this.anInt4160];
		this.anIntArray439 = new int[this.anInt4159];
		this.anIntArray438 = new int[this.anInt4159];
		this.anIntArray436 = new int[this.anInt4159];
		this.aByteArray53 = new byte[this.anInt4159];
		this.aByteArray54 = new byte[this.anInt4159];
		this.aByteArray55 = new byte[this.anInt4159];
		this.aClass84_19 = new HashTable(IntUtils.clp2(this.anInt4159));
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "()V")
	public final void method3433() {
		@Pc(1) GL local1 = GlRenderer.gl;
		if (GlRenderer.arbVboSupported) {
			this.aClass111_5.bindArray();
			local1.glInterleavedArrays(GL.GL_C4UB_V3F, 16, 0L);
			GlRenderer.normalArrayEnabled = false;
			this.aClass111_6.bindElementArray();
			local1.glDrawElements(GL.GL_TRIANGLES, this.anInt4162, GL.GL_UNSIGNED_INT, 0L);
			return;
		}
		if (GlRenderer.arbVboSupported) {
			local1.glBindBufferARB(GL.GL_ARRAY_BUFFER, 0);
			local1.glBindBufferARB(GL.GL_ELEMENT_ARRAY_BUFFER, 0);
		}
		local1.glInterleavedArrays(GL.GL_C4UB_V3F, 16, this.aByteBuffer13);
		GlRenderer.normalArrayEnabled = false;
		local1.glDrawElements(GL.GL_TRIANGLES, this.anInt4162, GL.GL_UNSIGNED_INT, this.aByteBuffer14);
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "()V")
	public final void method3434() {
		@Pc(7) Buffer local7 = new Buffer(this.anInt4162 * 4);
		@Pc(15) Buffer local15 = new Buffer(this.anInt4161 * 16);
		if (GlRenderer.bigEndian) {
			for (@Pc(19) int local19 = 0; local19 < this.anInt4161; local19++) {
				local15.writeByte(this.aByteArray53[local19]);
				local15.writeByte(this.aByteArray54[local19]);
				local15.writeByte(this.aByteArray55[local19]);
				local15.writeByte(255);
				local15.writeFloat((float) this.anIntArray439[local19]);
				local15.writeFloat((float) this.anIntArray438[local19]);
				local15.writeFloat((float) this.anIntArray436[local19]);
			}
			for (@Pc(76) int local76 = 0; local76 < this.anInt4162; local76++) {
				local7.writeInt(this.anIntArray437[local76]);
			}
		} else {
			for (@Pc(92) int local92 = 0; local92 < this.anInt4161; local92++) {
				local15.writeByte(this.aByteArray53[local92]);
				local15.writeByte(this.aByteArray54[local92]);
				local15.writeByte(this.aByteArray55[local92]);
				local15.writeByte(255);
				local15.writeFloatLE((float) this.anIntArray439[local92]);
				local15.writeFloatLE((float) this.anIntArray438[local92]);
				local15.writeFloatLE((float) this.anIntArray436[local92]);
			}
			for (@Pc(149) int local149 = 0; local149 < this.anInt4162; local149++) {
				local7.writeIntLE(this.anIntArray437[local149]);
			}
		}
		if (GlRenderer.arbVboSupported) {
			this.aClass111_5 = new GlBuffer();
			@Pc(173) ByteBuffer local173 = ByteBuffer.wrap(local15.bytes);
			this.aClass111_5.setArrayBuffer(local173);
			this.aClass111_6 = new GlBuffer();
			local173 = ByteBuffer.wrap(local7.bytes);
			this.aClass111_6.setElementArrayBuffer(local173);
		} else {
			this.aByteBuffer13 = ByteBuffer.allocateDirect(local15.position);
			this.aByteBuffer13.put(local15.bytes);
			this.aByteBuffer13.flip();
			this.aByteBuffer14 = ByteBuffer.allocateDirect(local7.position);
			this.aByteBuffer14.put(local7.bytes);
			this.aByteBuffer14.flip();
		}
		this.anIntArray439 = null;
		this.anIntArray438 = null;
		this.anIntArray436 = null;
		this.aByteArray53 = null;
		this.aByteArray54 = null;
		this.aByteArray55 = null;
		this.anIntArray437 = null;
		this.aClass84_19 = null;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!em;IIIFFF)I")
	public final int method3435(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(1) long local1 = 0L;
		if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local1 = arg1 + (arg3 << 16);
			@Pc(23) IntNode local23 = (IntNode) this.aClass84_19.get(local1);
			if (local23 != null) {
				return local23.value;
			}
		}
		@Pc(31) int local31 = arg0.anInt1321;
		@Pc(37) float local37 = (float) (arg0.anInt1338 - arg1);
		@Pc(43) float local43 = (float) (arg0.anInt1322 - arg2);
		@Pc(49) float local49 = (float) (arg0.anInt1320 - arg3);
		@Pc(64) float local64 = (float) Math.sqrt((double) (local37 * local37 + local43 * local43 + local49 * local49));
		@Pc(68) float local68 = 1.0F / local64;
		local37 *= local68;
		local43 *= local68;
		local49 *= local68;
		@Pc(90) float local90 = local64 / (float) ((arg0.anInt1318 << 7) + 64);
		@Pc(96) float local96 = 1.0F - local90 * local90;
		if (local96 < 0.0F) {
			local96 = 0.0F;
		}
		@Pc(114) float local114 = local37 * arg4 + local43 * arg5 + local49 * arg6;
		if (local114 < 0.0F) {
			local114 = 0.0F;
		}
		@Pc(126) float local126 = local114 * local96 * 2.0F;
		if (local126 > 1.0F) {
			local126 = 1.0F;
		}
		@Pc(142) int local142 = (int) (local126 * (float) (local31 >> 16 & 0xFF));
		if (local142 > 255) {
			local142 = 255;
		}
		@Pc(157) int local157 = (int) (local126 * (float) (local31 >> 8 & 0xFF));
		if (local157 > 255) {
			local157 = 255;
		}
		@Pc(170) int local170 = (int) (local126 * (float) (local31 & 0xFF));
		if (local170 > 255) {
			local170 = 255;
		}
		this.aByteArray53[this.anInt4161] = (byte) local142;
		this.aByteArray54[this.anInt4161] = (byte) local157;
		this.aByteArray55[this.anInt4161] = (byte) local170;
		this.anIntArray439[this.anInt4161] = arg1;
		this.anIntArray438[this.anInt4161] = arg2;
		this.anIntArray436[this.anInt4161] = arg3;
		this.aClass84_19.put(local1, new IntNode(this.anInt4161));
		return this.anInt4161++;
	}
}
