import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class QuickChatCatType extends SecondaryNode {

	@OriginalMember(owner = "client!wh", name = "z", descriptor = "[I")
	public int[] phrases;

	@OriginalMember(owner = "client!wh", name = "C", descriptor = "Ljava/lang/String;")
	public String description;

	@OriginalMember(owner = "client!wh", name = "D", descriptor = "[I")
	public int[] subcategories;

	@OriginalMember(owner = "client!wh", name = "F", descriptor = "[C")
	public char[] subcategoryShortcuts;

	@OriginalMember(owner = "client!wh", name = "J", descriptor = "[C")
	public char[] phraseShortcuts;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLclient!fd;)V")
	public void decode(@OriginalArg(1) Buffer buffer) {
		while (true) {
			@Pc(5) int code = buffer.readUnsignedByte();
			if (code == 0) {
				return;
			}
			this.decode(buffer, code);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(CI)I")
	public int getPhraseByShortcut(@OriginalArg(0) char shortcut) {
		if (this.phrases == null) {
			return -1;
		}
		for (@Pc(20) int i = 0; i < this.phrases.length; i++) {
			if (this.phraseShortcuts[i] == shortcut) {
				return this.phrases[i];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(CI)I")
	public int getSubcategoryByShortcut(@OriginalArg(0) char shortcut) {
		if (this.subcategories == null) {
			return -1;
		}
		for (@Pc(21) int i = 0; i < this.subcategories.length; i++) {
			if (this.subcategoryShortcuts[i] == shortcut) {
				return this.subcategories[i];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)V")
	public void method4778() {
		if (this.phrases != null) {
			for (@Pc(8) int i = 0; i < this.phrases.length; i++) {
				this.phrases[i] |= 32768;
			}
		}
		if (this.subcategories != null) {
			for (@Pc(39) int i = 0; i < this.subcategories.length; i++) {
				this.subcategories[i] |= 32768;
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILclient!fd;I)V")
	private void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 1) {
			this.description = buffer.readString();
		} else if (code == 2) {
			@Pc(95) int len = buffer.readUnsignedByte();
			this.subcategories = new int[len];
			this.subcategoryShortcuts = new char[len];
			for (@Pc(105) int i = 0; i < len; i++) {
				this.subcategories[i] = buffer.readUnsignedShort();
				@Pc(119) byte shortcut = buffer.readByte();
				this.subcategoryShortcuts[i] = shortcut == 0 ? 0 : Cp1252Charset.decodeChar(shortcut);
			}
		} else if (code == 3) {
			@Pc(39) int len = buffer.readUnsignedByte();
			this.phraseShortcuts = new char[len];
			this.phrases = new int[len];
			for (@Pc(49) int i = 0; i < len; i++) {
				this.phrases[i] = buffer.readUnsignedShort();
				@Pc(69) byte phrase = buffer.readByte();
				this.phraseShortcuts[i] = phrase == 0 ? 0 : Cp1252Charset.decodeChar(phrase);
			}
		} else if (code != 4) {
		}
	}
}
