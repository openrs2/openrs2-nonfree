import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public final class ServerActiveProperties extends Node {

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)I")
	public static int getTargetMask(@OriginalArg(0) int events) {
		return events >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!on", name = "J", descriptor = "I")
	public final int events;

	@OriginalMember(owner = "client!on", name = "A", descriptor = "I")
	public final int targetParam;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(II)V")
	public ServerActiveProperties(@OriginalArg(0) int events, @OriginalArg(1) int targetParam) {
		this.events = events;
		this.targetParam = targetParam;
	}

	@OriginalMember(owner = "client!on", name = "d", descriptor = "(B)Z")
	public final boolean isDragTarget() {
		return (this.events >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(II)Z")
	public final boolean isButtonEnabled(@OriginalArg(0) int button) {
		return (this.events >> button + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(I)Z")
	public final boolean isObjSwapEnabled() {
		return (this.events >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!on", name = "e", descriptor = "(B)I")
	public final int getDragDepth() {
		return this.events >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!on", name = "d", descriptor = "(I)I")
	public final int getTargetMask() {
		return getTargetMask(this.events);
	}

	@OriginalMember(owner = "client!on", name = "f", descriptor = "(B)Z")
	public final boolean isResumePauseButtonEnabled() {
		return (this.events & 0x1) != 0;
	}

	@OriginalMember(owner = "client!on", name = "e", descriptor = "(I)Z")
	public final boolean isObjUseEnabled() {
		return (this.events >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!on", name = "f", descriptor = "(I)Z")
	public final boolean isObjReplaceEnabled() {
		return (this.events >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)Z")
	public final boolean isUseTarget() {
		return (this.events >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!on", name = "h", descriptor = "(I)Z")
	public final boolean isObjOpsEnabled() {
		return (this.events >> 30 & 0x1) != 0;
	}
}
