import java.security.AllPermission;
import java.security.CodeSource;
import java.security.Permissions;
import java.security.ProtectionDomain;
import java.security.cert.Certificate;
import java.util.Hashtable;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("loader!d")
public final class ClassLoader_Sub1 extends ClassLoader {

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "Lunpack!unpack;")
	public unpack anUnpack1;

	@OriginalMember(owner = "loader!d", name = "d", descriptor = "Lunpack!unpack;")
	public unpack anUnpack2;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "Ljava/util/Hashtable;")
	public final Hashtable aHashtable1 = new Hashtable();

	@OriginalMember(owner = "loader!d", name = "c", descriptor = "Ljava/security/ProtectionDomain;")
	private final ProtectionDomain aProtectionDomain1;

	@OriginalMember(owner = "loader!d", name = "<init>", descriptor = "()V")
	public ClassLoader_Sub1() {
		@Pc(15) CodeSource local15 = new CodeSource(null, (Certificate[]) null);
		@Pc(19) Permissions local19 = new Permissions();
		local19.add(new AllPermission());
		this.aProtectionDomain1 = new ProtectionDomain(local15, local19);
	}

	@OriginalMember(owner = "loader!d", name = "loadClass", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;")
	@Override
	protected final synchronized Class loadClass(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) throws ClassNotFoundException {
		@Pc(5) Class local5 = (Class) this.aHashtable1.get(arg0);
		if (local5 != null) {
			return local5;
		}
		if (this.anUnpack1 != null) {
			@Pc(21) byte[] local21 = this.anUnpack1.get(arg0);
			if (local21 != null) {
				@Pc(35) Class local35 = this.defineClass(arg0, local21, 0, local21.length, this.aProtectionDomain1);
				if (arg1) {
					this.resolveClass(local35);
				}
				this.aHashtable1.put(arg0, local35);
				return local35;
			}
		}
		@Pc(54) byte[] local54 = this.anUnpack2.get(arg0);
		if (local54 == null) {
			return super.findSystemClass(arg0);
		}
		@Pc(65) Class local65 = this.defineClass(arg0, local54, 0, local54.length);
		if (arg1) {
			this.resolveClass(local65);
		}
		this.aHashtable1.put(arg0, local65);
		return local65;
	}
}
