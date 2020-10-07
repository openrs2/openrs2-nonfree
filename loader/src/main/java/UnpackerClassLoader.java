import java.security.AllPermission;
import java.security.CodeSource;
import java.security.Permissions;
import java.security.ProtectionDomain;
import java.security.cert.Certificate;
import java.util.Hashtable;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!d")
public final class UnpackerClassLoader extends ClassLoader {

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "Lunpack!unpack;")
	public unpack primaryUnpacker;

	@OriginalMember(owner = "loader!d", name = "d", descriptor = "Lunpack!unpack;")
	public unpack secondaryUnpacker;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "Ljava/util/Hashtable;")
	public final Hashtable<String, Class<?>> cache = new Hashtable<>();

	@OriginalMember(owner = "loader!d", name = "c", descriptor = "Ljava/security/ProtectionDomain;")
	private final ProtectionDomain protectionDomain;

	@OriginalMember(owner = "loader!d", name = "<init>", descriptor = "()V")
	public UnpackerClassLoader() {
		@Pc(15) CodeSource codeSource = new CodeSource(null, (Certificate[]) null);
		@Pc(19) Permissions permissions = new Permissions();
		permissions.add(new AllPermission());
		this.protectionDomain = new ProtectionDomain(codeSource, permissions);
	}

	@OriginalMember(owner = "loader!d", name = "loadClass", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;")
	@Override
	protected final synchronized Class<?> loadClass(@OriginalArg(0) String name, @OriginalArg(1) boolean resolve) throws ClassNotFoundException {
		@Pc(5) Class<?> cachedClass = this.cache.get(name);
		if (cachedClass != null) {
			return cachedClass;
		}
		if (this.primaryUnpacker != null) {
			@Pc(21) byte[] bytes = this.primaryUnpacker.get(name);
			if (bytes != null) {
				@Pc(35) Class<?> clazz = this.defineClass(name, bytes, 0, bytes.length, this.protectionDomain);
				if (resolve) {
					this.resolveClass(clazz);
				}
				this.cache.put(name, clazz);
				return clazz;
			}
		}
		@Pc(54) byte[] bytes = this.secondaryUnpacker.get(name);
		if (bytes == null) {
			return super.findSystemClass(name);
		}
		@Pc(65) Class<?> clazz = this.defineClass(name, bytes, 0, bytes.length);
		if (resolve) {
			this.resolveClass(clazz);
		}
		this.cache.put(name, clazz);
		return clazz;
	}
}
