import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class ReflectionCheck extends Node {

	@OriginalMember(owner = "client!rl", name = "x", descriptor = "Lclient!ll;")
	private static LinkedList queue = new LinkedList();

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(I)V")
	public static void clear() {
		queue = new LinkedList();
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lsignlink!pm;IBLclient!fd;)V")
	public static void push(@OriginalArg(3) Buffer buffer, @OriginalArg(1) int length, @OriginalArg(0) SignLink signLink) {
		@Pc(9) ReflectionCheck check = new ReflectionCheck();
		check.size = buffer.readUnsignedByte();
		check.id = buffer.readInt();
		check.types = new int[check.size];
		check.methodArguments = new byte[check.size][][];
		check.fieldRequests = new PrivilegedRequest[check.size];
		check.methodRequests = new PrivilegedRequest[check.size];
		check.errors = new int[check.size];
		check.fieldValues = new int[check.size];
		for (@Pc(57) int i = 0; i < check.size; i++) {
			try {
				@Pc(69) int type = buffer.readUnsignedByte();
				if (type == 0 || type == 1 || type == 2) {
					@Pc(88) String className = buffer.readString();
					@Pc(90) int value = 0;
					@Pc(94) String fieldName = buffer.readString();
					if (type == 1) {
						value = buffer.readInt();
					}
					check.types[i] = type;
					check.fieldValues[i] = value;
					check.fieldRequests[i] = signLink.getDeclaredField(classForName(className), fieldName);
				} else if (type == 3 || type == 4) {
					@Pc(137) String className = buffer.readString();
					@Pc(141) String methodName = buffer.readString();
					@Pc(145) int parameters = buffer.readUnsignedByte();
					@Pc(148) String[] parameterNames = new String[parameters];
					for (@Pc(150) int j = 0; j < parameters; j++) {
						parameterNames[j] = buffer.readString();
					}
					@Pc(169) byte[][] arguments = new byte[parameters][];
					if (type == 3) {
						for (@Pc(174) int j = 0; j < parameters; j++) {
							@Pc(185) int len = buffer.readInt();
							arguments[j] = new byte[len];
							buffer.readBytes(arguments[j], len);
						}
					}
					@Pc(204) Class<?>[] parameterTypes = new Class<?>[parameters];
					check.types[i] = type;
					for (@Pc(211) int j = 0; j < parameters; j++) {
						parameterTypes[j] = classForName(parameterNames[j]);
					}
					check.methodRequests[i] = signLink.getDeclaredMethod(classForName(className), methodName, parameterTypes);
					check.methodArguments[i] = arguments;
				}
			} catch (@Pc(244) ClassNotFoundException ex) {
				check.errors[i] = -1;
			} catch (@Pc(251) SecurityException ex) {
				check.errors[i] = -2;
			} catch (@Pc(258) NullPointerException ex) {
				check.errors[i] = -3;
			} catch (@Pc(265) Exception ex) {
				check.errors[i] = -4;
			} catch (@Pc(272) Throwable ex) {
				check.errors[i] = -5;
			}
		}
		queue.addTail(check);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!wa;ZI)V")
	public static void loop(@OriginalArg(0) Packet buffer) {
		while (true) {
			@Pc(16) ReflectionCheck check = (ReflectionCheck) queue.head();
			if (check == null) {
				return;
			}
			@Pc(22) boolean pending = false;
			for (@Pc(24) int i = 0; i < check.size; i++) {
				if (check.fieldRequests[i] != null) {
					if (check.fieldRequests[i].status == 2) {
						check.errors[i] = -5;
					}
					if (check.fieldRequests[i].status == 0) {
						pending = true;
					}
				}
				if (check.methodRequests[i] != null) {
					if (check.methodRequests[i].status == 2) {
						check.errors[i] = -6;
					}
					if (check.methodRequests[i].status == 0) {
						pending = true;
					}
				}
			}
			if (pending) {
				return;
			}
			buffer.writeOpcode(78);
			buffer.writeByte(0);
			@Pc(107) int originalPos = buffer.position;
			buffer.writeInt(check.id);
			for (@Pc(114) int i = 0; i < check.size; i++) {
				if (check.errors[i] == 0) {
					try {
						@Pc(140) int type = check.types[i];
						if (type == 0) {
							@Pc(149) Field field = (Field) check.fieldRequests[i].result;
							@Pc(153) int value = field.getInt(null);
							buffer.writeByte(0);
							buffer.writeInt(value);
						} else if (type == 1) {
							@Pc(173) Field field = (Field) check.fieldRequests[i].result;
							field.setInt(null, check.fieldValues[i]);
							buffer.writeByte(0);
						} else if (type == 2) {
							@Pc(196) Field field = (Field) check.fieldRequests[i].result;
							@Pc(199) int modifiers = field.getModifiers();
							buffer.writeByte(0);
							buffer.writeInt(modifiers);
						}
						if (type == 3) {
							@Pc(242) Method method = (Method) check.methodRequests[i].result;
							@Pc(247) byte[][] encodedArguments = check.methodArguments[i];
							@Pc(251) Object[] arguments = new Object[encodedArguments.length];
							for (@Pc(253) int j = 0; j < encodedArguments.length; j++) {
								@Pc(271) ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(encodedArguments[j]));
								arguments[j] = in.readObject();
							}
							@Pc(284) Object result = method.invoke(null, arguments);
							if (result == null) {
								buffer.writeByte(0);
							} else if (result instanceof Number) {
								buffer.writeByte(1);
								buffer.writeLong(((Number) result).longValue());
							} else if (result instanceof String) {
								buffer.writeByte(2);
								buffer.writeString((String) result);
							} else {
								buffer.writeByte(4);
							}
						} else if (type == 4) {
							@Pc(222) Method method = (Method) check.methodRequests[i].result;
							@Pc(225) int modifiers = method.getModifiers();
							buffer.writeByte(0);
							buffer.writeInt(modifiers);
						}
					} catch (@Pc(327) ClassNotFoundException ex) {
						buffer.writeByte(-10);
					} catch (@Pc(333) InvalidClassException ex) {
						buffer.writeByte(-11);
					} catch (@Pc(339) StreamCorruptedException ex) {
						buffer.writeByte(-12);
					} catch (@Pc(345) OptionalDataException ex) {
						buffer.writeByte(-13);
					} catch (@Pc(351) IllegalAccessException ex) {
						buffer.writeByte(-14);
					} catch (@Pc(357) IllegalArgumentException ex) {
						buffer.writeByte(-15);
					} catch (@Pc(363) InvocationTargetException ex) {
						buffer.writeByte(-16);
					} catch (@Pc(369) SecurityException ex) {
						buffer.writeByte(-17);
					} catch (@Pc(375) IOException ex) {
						buffer.writeByte(-18);
					} catch (@Pc(381) NullPointerException ex) {
						buffer.writeByte(-19);
					} catch (@Pc(387) Exception ex) {
						buffer.writeByte(-20);
					} catch (@Pc(393) Throwable ex) {
						buffer.writeByte(-21);
					}
				} else {
					buffer.writeByte(check.errors[i]);
				}
			}
			buffer.writeCrc32(originalPos);
			buffer.writeByteLength(buffer.position - originalPos);
			check.unlink();
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	private static Class<?> classForName(@OriginalArg(1) String name) throws ClassNotFoundException {
		if (name.equals("B")) {
			return Byte.TYPE;
		} else if (name.equals("I")) {
			return Integer.TYPE;
		} else if (name.equals("S")) {
			return Short.TYPE;
		} else if (name.equals("J")) {
			return Long.TYPE;
		} else if (name.equals("Z")) {
			return Boolean.TYPE;
		} else if (name.equals("F")) {
			return Float.TYPE;
		} else if (name.equals("D")) {
			return Double.TYPE;
		} else if (name.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(name);
		}
	}

	@OriginalMember(owner = "client!sj", name = "o", descriptor = "[[[B")
	private byte[][][] methodArguments;

	@OriginalMember(owner = "client!sj", name = "q", descriptor = "[I")
	private int[] fieldValues;

	@OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
	private int size;

	@OriginalMember(owner = "client!sj", name = "t", descriptor = "[Lsignlink!vk;")
	private PrivilegedRequest[] fieldRequests;

	@OriginalMember(owner = "client!sj", name = "u", descriptor = "[I")
	private int[] types;

	@OriginalMember(owner = "client!sj", name = "v", descriptor = "I")
	private int id;

	@OriginalMember(owner = "client!sj", name = "z", descriptor = "[Lsignlink!vk;")
	private PrivilegedRequest[] methodRequests;

	@OriginalMember(owner = "client!sj", name = "D", descriptor = "[I")
	private int[] errors;
}
