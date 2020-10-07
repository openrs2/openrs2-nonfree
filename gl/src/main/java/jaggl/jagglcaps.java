package jaggl;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!jaggl/jagglcaps")
public class jagglcaps {

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "doubleBuffered", descriptor = "Z")
	private final boolean doubleBuffered = true;

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "stereo", descriptor = "Z")
	private final boolean stereo = false;

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "hardwareAccelerated", descriptor = "Z")
	private final boolean hardwareAccelerated = true;

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "depthBits", descriptor = "I")
	private final int depthBits = 24;

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "stencilBits", descriptor = "I")
	private final int stencilBits = 0;

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "redBits", descriptor = "I")
	private final int redBits = 8;

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "greenBits", descriptor = "I")
	private final int greenBits = 8;

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "blueBits", descriptor = "I")
	private final int blueBits = 8;

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "alphaBits", descriptor = "I")
	private int alphaBits = 0;

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "accumRedBits", descriptor = "I")
	private final int accumRedBits = 0;

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "accumGreenBits", descriptor = "I")
	private final int accumGreenBits = 0;

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "accumBlueBits", descriptor = "I")
	private final int accumBlueBits = 0;

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "accumAlphaBits", descriptor = "I")
	private final int accumAlphaBits = 0;

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "sampleBuffers", descriptor = "Z")
	private boolean sampleBuffers = false;

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "numSamples", descriptor = "I")
	private int numSamples = 2;

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "getAlphaBits", descriptor = "()I")
	public final int getAlphaBits() {
		return this.alphaBits;
	}

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "setAlphaBits", descriptor = "(I)V")
	public final void setAlphaBits(@OriginalArg(0) int alphaBits) {
		this.alphaBits = alphaBits;
	}

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "setSampleBuffers", descriptor = "(Z)V")
	public final void setSampleBuffers(@OriginalArg(0) boolean sampleBuffers) {
		this.sampleBuffers = sampleBuffers;
	}

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "getSampleBuffers", descriptor = "()Z")
	public final boolean getSampleBuffers() {
		return this.sampleBuffers;
	}

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "setNumSamples", descriptor = "(I)V")
	public final void setNumSamples(@OriginalArg(0) int numSamples) {
		this.numSamples = numSamples;
	}

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "getNumSamples", descriptor = "()I")
	public final int getNumSamples() {
		return this.numSamples;
	}

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public final String toString() {
		return "GLCapabilities [DoubleBuffered: " + this.doubleBuffered + ", Stereo: " + this.stereo + ", HardwareAccelerated: " + this.hardwareAccelerated + ", DepthBits: " + this.depthBits + ", StencilBits: " + this.stencilBits + ", Red: " + this.redBits + ", Green: " + this.greenBits + ", Blue: " + this.blueBits + ", Alpha: " + this.alphaBits + ", Red Accum: " + this.accumRedBits + ", Green Accum: " + this.accumGreenBits + ", Blue Accum: " + this.accumBlueBits + ", Alpha Accum: " + this.accumAlphaBits + ", Multisample: " + this.sampleBuffers + (this.sampleBuffers ? ", Num samples: " + this.numSamples : "") + " ]";
	}
}
