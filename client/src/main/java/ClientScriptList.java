import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class ClientScriptList {
	@OriginalMember(owner = "client!pa", name = "c", descriptor = "Lclient!dj;")
	public static final LruHashTable scripts = new LruHashTable(128);

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ZI)Lclient!jl;")
	public static ClientScript get(@OriginalArg(1) int id) {
		@Pc(10) ClientScript script = (ClientScript) scripts.get(id);
		if (script != null) {
			return script;
		}
		@Pc(21) byte[] bytes = client.js5Archive12.fetchFile(id, 0);
		if (bytes == null || bytes.length <= 1) {
			return null;
		} else {
			@Pc(36) ClientScript newScript = ClientScript.decode(bytes);
			scripts.put(id, newScript);
			return newScript;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIII)Lclient!jl;")
	public static ClientScript get(@OriginalArg(0) int trigger, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = arg1 << 8 | trigger;
		@Pc(18) ClientScript script = (ClientScript) scripts.get((long) local9 << 16);
		if (script != null) {
			return script;
		}
		@Pc(30) byte[] local30 = client.js5Archive12.fetchFile(client.js5Archive12.getGroupId(local9));
		if (local30 == null) {
			@Pc(69) int local69 = trigger | arg2 + 65536 << 8;
			@Pc(80) ClientScript local80 = (ClientScript) scripts.get((long) local69 << 16);
			if (local80 != null) {
				return local80;
			}
			@Pc(93) byte[] local93 = client.js5Archive12.fetchFile(client.js5Archive12.getGroupId(local69));
			if (local93 == null) {
				@Pc(131) int local131 = trigger | 0xFFFF00;
				@Pc(140) ClientScript local140 = (ClientScript) scripts.get((long) local131 << 16);
				if (local140 != null) {
					return local140;
				}
				@Pc(153) byte[] local153 = client.js5Archive12.fetchFile(client.js5Archive12.getGroupId(local131));
				if (local153 == null) {
					return null;
				} else if (local153.length > 1) {
					@Pc(166) ClientScript local166 = ClientScript.decode(local153);
					local166.trigger = trigger;
					scripts.put((long) local131 << 16, local166);
					return local166;
				} else {
					return null;
				}
			} else if (local93.length <= 1) {
				return null;
			} else {
				@Pc(112) ClientScript local112 = ClientScript.decode(local93);
				local112.trigger = trigger;
				scripts.put((long) local69 << 16, local112);
				return local112;
			}
		} else if (local30.length <= 1) {
			return null;
		} else {
			@Pc(46) ClientScript local46 = ClientScript.decode(local30);
			local46.trigger = trigger;
			scripts.put((long) local9 << 16, local46);
			return local46;
		}
	}
}
