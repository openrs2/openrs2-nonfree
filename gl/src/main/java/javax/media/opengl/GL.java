package javax.media.opengl;

import java.nio.Buffer;
import java.nio.FloatBuffer;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!javax/media/opengl/GL")
public interface GL {

	int GL_POINTS = 0x0;

	int GL_LINES = 0x1;

	int GL_ONE = 0x1;

	int GL_LINE_LOOP = 0x2;

	int GL_TRIANGLES = 0x4;

	int GL_TRIANGLE_STRIP = 0x5;

	int GL_TRIANGLE_FAN = 0x6;

	int GL_QUADS = 0x7;

	int GL_FOG_BIT = 0x80;

	int GL_DEPTH_BUFFER_BIT = 0x100;

	int GL_ADD = 0x104;

	int GL_LEQUAL = 0x203;

	int GL_GREATER = 0x204;

	int GL_SRC_COLOR = 0x300;

	int GL_SRC_ALPHA = 0x302;

	int GL_ONE_MINUS_SRC_ALPHA = 0x303;

	int GL_DST_ALPHA = 0x304;

	int GL_ONE_MINUS_DST_ALPHA = 0x305;

	int GL_DST_COLOR = 0x306;

	int GL_FRONT_LEFT = 0x400;

	int GL_BACK_LEFT = 0x402;

	int GL_FRONT = 0x404;

	int GL_BACK = 0x405;

	int GL_VIEWPORT_BIT = 0x800;

	int GL_CULL_FACE = 0xB44;

	int GL_LIGHTING = 0xB50;

	int GL_LIGHT_MODEL_AMBIENT = 0xB53;

	int GL_COLOR_MATERIAL = 0xB57;

	int GL_FOG = 0xB60;

	int GL_FOG_DENSITY = 0xB62;

	int GL_FOG_START = 0xB63;

	int GL_FOG_END = 0xB64;

	int GL_FOG_MODE = 0xB65;

	int GL_FOG_COLOR = 0xB66;

	int GL_DEPTH_TEST = 0xB71;

	int GL_VIEWPORT = 0xBA2;

	int GL_ALPHA_TEST = 0xBC0;

	int GL_BLEND = 0xBE2;

	int GL_DRAW_BUFFER = 0xC01;

	int GL_READ_BUFFER = 0xC02;

	int GL_SCISSOR_TEST = 0xC11;

	int GL_FOG_HINT = 0xC54;

	int GL_TEXTURE_GEN_S = 0xC60;

	int GL_TEXTURE_GEN_T = 0xC61;

	int GL_TEXTURE_GEN_R = 0xC62;

	int GL_TEXTURE_GEN_Q = 0xC63;

	int GL_TEXTURE_1D = 0xDE0;

	int GL_TEXTURE_2D = 0xDE1;

	int GL_FASTEST = 0x1101;

	int GL_AMBIENT = 0x1200;

	int GL_DIFFUSE = 0x1201;

	int GL_POSITION = 0x1203;

	int GL_CONSTANT_ATTENUATION = 0x1207;

	int GL_LINEAR_ATTENUATION = 0x1208;

	int GL_QUADRATIC_ATTENUATION = 0x1209;

	int GL_COMPILE = 0x1300;

	int GL_UNSIGNED_BYTE = 0x1401;

	int GL_UNSIGNED_SHORT = 0x1403;

	int GL_UNSIGNED_INT = 0x1405;

	int GL_FLOAT = 0x1406;

	int GL_AMBIENT_AND_DIFFUSE = 0x1602;

	int GL_MODELVIEW = 0x1700;

	int GL_PROJECTION = 0x1701;

	int GL_TEXTURE = 0x1702;

	int GL_COLOR = 0x1800;

	int GL_DEPTH_COMPONENT = 0x1902;

	int GL_ALPHA = 0x1906;

	int GL_RGB = 0x1907;

	int GL_RGBA = 0x1908;

	int GL_LUMINANCE_ALPHA = 0x190A;

	int GL_FILL = 0x1B02;

	int GL_SMOOTH = 0x1D01;

	int GL_REPLACE = 0x1E01;

	int GL_VENDOR = 0x1F00;

	int GL_RENDERER = 0x1F01;

	int GL_VERSION = 0x1F02;

	int GL_EXTENSIONS = 0x1F03;

	int GL_S = 0x2000;

	int GL_ENABLE_BIT = 0x2000;

	int GL_T = 0x2001;

	int GL_R = 0x2002;

	int GL_Q = 0x2003;

	int GL_MODULATE = 0x2100;

	int GL_TEXTURE_ENV_MODE = 0x2200;

	int GL_TEXTURE_ENV_COLOR = 0x2201;

	int GL_TEXTURE_ENV = 0x2300;

	int GL_EYE_LINEAR = 0x2400;

	int GL_OBJECT_LINEAR = 0x2401;

	int GL_TEXTURE_GEN_MODE = 0x2500;

	int GL_OBJECT_PLANE = 0x2501;

	int GL_EYE_PLANE = 0x2502;

	int GL_NEAREST = 0x2600;

	int GL_LINEAR = 0x2601;

	int GL_LINEAR_MIPMAP_LINEAR = 0x2703;

	int GL_TEXTURE_MAG_FILTER = 0x2800;

	int GL_TEXTURE_MIN_FILTER = 0x2801;

	int GL_TEXTURE_WRAP_S = 0x2802;

	int GL_TEXTURE_WRAP_T = 0x2803;

	int GL_REPEAT = 0x2901;

	int GL_C4UB_V3F = 0x2A23;

	int GL_T2F_V3F = 0x2A27;

	int GL_COLOR_BUFFER_BIT = 0x4000;

	int GL_LIGHT0 = 0x4000;

	int GL_LIGHT1 = 0x4001;

	int GL_TEXTURE_3D = 0x806F;

	int GL_TEXTURE_WRAP_R = 0x8072;

	int GL_VERTEX_ARRAY = 0x8074;

	int GL_NORMAL_ARRAY = 0x8075;

	int GL_COLOR_ARRAY = 0x8076;

	int GL_TEXTURE_COORD_ARRAY = 0x8078;

	int GL_BGRA = 0x80E1;

	int GL_POINT_SIZE_MIN = 0x8126;

	int GL_POINT_SIZE_MAX = 0x8127;

	int GL_POINT_DISTANCE_ATTENUATION = 0x8129;

	int GL_CLAMP_TO_EDGE = 0x812F;

	int GL_UNSIGNED_INT_8_8_8_8_REV = 0x8367;

	int GL_TEXTURE0 = 0x84C0;

	int GL_TEXTURE1 = 0x84C1;

	int GL_TEXTURE2 = 0x84C2;

	int GL_MAX_TEXTURE_UNITS = 0x84E2;

	int GL_SUBTRACT = 0x84E7;

	int GL_TEXTURE_RECTANGLE = 0x84F5;

	int GL_NORMAL_MAP = 0x8511;

	int GL_REFLECTION_MAP = 0x8512;

	int GL_TEXTURE_CUBE_MAP = 0x8513;

	int GL_TEXTURE_CUBE_MAP_POSITIVE_X = 0x8515;

	int GL_COMBINE = 0x8570;

	int GL_COMBINE_RGB = 0x8571;

	int GL_COMBINE_ALPHA = 0x8572;

	int GL_RGB_SCALE = 0x8573;

	int GL_ADD_SIGNED = 0x8574;

	int GL_INTERPOLATE = 0x8575;

	int GL_CONSTANT = 0x8576;

	int GL_PRIMARY_COLOR = 0x8577;

	int GL_PREVIOUS = 0x8578;

	int GL_SRC0_RGB = 0x8580;

	int GL_SRC1_RGB = 0x8581;

	int GL_SRC2_RGB = 0x8582;

	int GL_SRC0_ALPHA = 0x8588;

	int GL_SRC1_ALPHA = 0x8589;

	int GL_SRC2_ALPHA = 0x858A;

	int GL_OPERAND0_RGB = 0x8590;

	int GL_OPERAND1_RGB = 0x8591;

	int GL_OPERAND0_ALPHA = 0x8598;

	int GL_VERTEX_PROGRAM_ARB = 0x8620;

	int GL_PROGRAM_ERROR_POSITION_ARB = 0x864B;

	int GL_FRAGMENT_PROGRAM_ARB = 0x8804;

	int GL_RGBA16F = 0x881A;

	int GL_POINT_SPRITE = 0x8861;

	int GL_COORD_REPLACE = 0x8862;

	int GL_MAX_TEXTURE_COORDS = 0x8871;

	int GL_MAX_TEXTURE_IMAGE_UNITS = 0x8872;

	int GL_PROGRAM_FORMAT_ASCII_ARB = 0x8875;

	int GL_ARRAY_BUFFER = 0x8892;

	int GL_ELEMENT_ARRAY_BUFFER = 0x8893;

	int GL_STREAM_DRAW = 0x88E0;

	int GL_STATIC_DRAW = 0x88E4;

	int GL_COMPILE_STATUS = 0x8B81;

	int GL_LINK_STATUS = 0x8B82;

	int GL_INFO_LOG_LENGTH = 0x8B84;

	int GL_FRAMEBUFFER_COMPLETE = 0x8CD5;

	int GL_MAX_COLOR_ATTACHMENTS = 0x8CDF;

	int GL_COLOR_ATTACHMENT0 = 0x8CE0;

	int GL_COLOR_ATTACHMENT1 = 0x8CE1;

	int GL_DEPTH_ATTACHMENT = 0x8D00;

	int GL_FRAMEBUFFER = 0x8D40;

	int GL_RENDERBUFFER = 0x8D41;

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "isExtensionAvailable", descriptor = "(Ljava/lang/String;)Z")
	boolean isExtensionAvailable(@OriginalArg(0) String extension);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "setSwapInterval", descriptor = "(I)V")
	void setSwapInterval(@OriginalArg(0) int swapInterval);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glLightfv", descriptor = "(II[FI)V")
	void glLightfv(@OriginalArg(0) int light, @OriginalArg(1) int pname, @OriginalArg(2) float[] params, @OriginalArg(3) int paramsOffset);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glBegin", descriptor = "(I)V")
	void glBegin(@OriginalArg(0) int mode);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glEnd", descriptor = "()V")
	void glEnd();

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glClear", descriptor = "(I)V")
	void glClear(@OriginalArg(0) int mask);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glEnable", descriptor = "(I)V")
	void glEnable(@OriginalArg(0) int cap);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glLoadIdentity", descriptor = "()V")
	void glLoadIdentity();

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glMatrixMode", descriptor = "(I)V")
	void glMatrixMode(@OriginalArg(0) int mode);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glTranslatef", descriptor = "(FFF)V")
	void glTranslatef(@OriginalArg(0) float x, @OriginalArg(1) float y, @OriginalArg(2) float z);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glRotatef", descriptor = "(FFFF)V")
	void glRotatef(@OriginalArg(0) float angle, @OriginalArg(1) float x, @OriginalArg(2) float y, @OriginalArg(3) float z);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glTexCoord2f", descriptor = "(FF)V")
	void glTexCoord2f(@OriginalArg(0) float s, @OriginalArg(1) float t);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glActiveTexture", descriptor = "(I)V")
	void glActiveTexture(@OriginalArg(0) int texture);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glGenProgramsARB", descriptor = "(I[II)V")
	void glGenProgramsARB(@OriginalArg(0) int n, @OriginalArg(1) int[] programs, @OriginalArg(2) int programsOffset);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glBindProgramARB", descriptor = "(II)V")
	void glBindProgramARB(@OriginalArg(0) int target, @OriginalArg(1) int program);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glAlphaFunc", descriptor = "(IF)V")
	void glAlphaFunc(@OriginalArg(0) int func, @OriginalArg(1) float ref);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glAttachObjectARB", descriptor = "(II)V")
	void glAttachObjectARB(@OriginalArg(0) int containerObj, @OriginalArg(1) int obj);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glBlendFunc", descriptor = "(II)V")
	void glBlendFunc(@OriginalArg(0) int sfactor, @OriginalArg(1) int dfactor);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glCallList", descriptor = "(I)V")
	void glCallList(@OriginalArg(0) int list);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glClearDepth", descriptor = "(F)V")
	void glClearDepth(@OriginalArg(0) float depth);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glClearColor", descriptor = "(FFFF)V")
	void glClearColor(@OriginalArg(0) float red, @OriginalArg(1) float green, @OriginalArg(2) float blue, @OriginalArg(3) float alpha);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glCheckFramebufferStatusEXT", descriptor = "(I)I")
	int glCheckFramebufferStatusEXT(@OriginalArg(0) int target);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glBindTexture", descriptor = "(II)V")
	void glBindTexture(@OriginalArg(0) int target, @OriginalArg(1) int texture);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glClientActiveTexture", descriptor = "(I)V")
	void glClientActiveTexture(@OriginalArg(0) int texture);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glGenFramebuffersEXT", descriptor = "(I[II)V")
	void glGenFramebuffersEXT(@OriginalArg(0) int n, @OriginalArg(1) int[] framebuffers, @OriginalArg(2) int framebuffersOffset);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glDeleteFramebuffersEXT", descriptor = "(I[II)V")
	void glDeleteFramebuffersEXT(@OriginalArg(0) int n, @OriginalArg(1) int[] framebuffers, @OriginalArg(2) int framebuffersOffset);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glBindBufferARB", descriptor = "(II)V")
	void glBindBufferARB(@OriginalArg(0) int target, @OriginalArg(1) int buffer);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glBufferDataARB", descriptor = "(IILjava/nio/Buffer;I)V")
	void glBufferDataARB(@OriginalArg(0) int target, @OriginalArg(1) int size, @OriginalArg(2) Buffer data, @OriginalArg(3) int usage);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glBufferSubDataARB", descriptor = "(IIILjava/nio/Buffer;)V")
	void glBufferSubDataARB(@OriginalArg(0) int target, @OriginalArg(1) int offset, @OriginalArg(2) int size, @OriginalArg(3) Buffer data);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glBindFramebufferEXT", descriptor = "(II)V")
	void glBindFramebufferEXT(@OriginalArg(0) int target, @OriginalArg(1) int framebuffer);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glColor3ub", descriptor = "(BBB)V")
	void glColor3ub(@OriginalArg(0) byte red, @OriginalArg(1) byte green, @OriginalArg(2) byte blue);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glColor4f", descriptor = "(FFFF)V")
	void glColor4f(@OriginalArg(0) float red, @OriginalArg(1) float green, @OriginalArg(2) float blue, @OriginalArg(3) float alpha);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glColor4fv", descriptor = "([FI)V")
	void glColor4fv(@OriginalArg(0) float[] v, @OriginalArg(1) int vOffset);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glColor4ub", descriptor = "(BBBB)V")
	void glColor4ub(@OriginalArg(0) byte red, @OriginalArg(1) byte green, @OriginalArg(2) byte blue, @OriginalArg(3) byte alpha);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glColorMaterial", descriptor = "(II)V")
	void glColorMaterial(@OriginalArg(0) int face, @OriginalArg(1) int mode);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glColorPointer", descriptor = "(IIILjava/nio/Buffer;)V")
	void glColorPointer(@OriginalArg(0) int size, @OriginalArg(1) int type, @OriginalArg(2) int stride, @OriginalArg(3) Buffer pointer);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glColorPointer", descriptor = "(IIIJ)V")
	void glColorPointer(@OriginalArg(0) int size, @OriginalArg(1) int type, @OriginalArg(2) int stride, @OriginalArg(3) long pointer);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glCompileShaderARB", descriptor = "(I)V")
	void glCompileShaderARB(@OriginalArg(0) int shaderObj);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glCopyPixels", descriptor = "(IIIII)V")
	void glCopyPixels(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int type);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glCopyTexImage2D", descriptor = "(IIIIIIII)V")
	void glCopyTexImage2D(@OriginalArg(0) int target, @OriginalArg(1) int level, @OriginalArg(2) int internalformat, @OriginalArg(3) int x, @OriginalArg(4) int y, @OriginalArg(5) int width, @OriginalArg(6) int height, @OriginalArg(7) int border);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glCreateProgramObjectARB", descriptor = "()I")
	int glCreateProgramObjectARB();

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glCreateShaderObjectARB", descriptor = "(I)I")
	int glCreateShaderObjectARB(@OriginalArg(0) int shaderType);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glCullFace", descriptor = "(I)V")
	void glCullFace(@OriginalArg(0) int mode);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glDeleteBuffersARB", descriptor = "(I[II)V")
	void glDeleteBuffersARB(@OriginalArg(0) int n, @OriginalArg(1) int[] buffers, @OriginalArg(2) int buffersOffset);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glDeleteLists", descriptor = "(II)V")
	void glDeleteLists(@OriginalArg(0) int list, @OriginalArg(1) int range);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glDeleteObjectARB", descriptor = "(I)V")
	void glDeleteObjectARB(@OriginalArg(0) int obj);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glDeleteTextures", descriptor = "(I[II)V")
	void glDeleteTextures(@OriginalArg(0) int n, @OriginalArg(1) int[] textures, @OriginalArg(2) int texturesOffset);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glDepthFunc", descriptor = "(I)V")
	void glDepthFunc(@OriginalArg(0) int func);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glDepthMask", descriptor = "(Z)V")
	void glDepthMask(@OriginalArg(0) boolean flag);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glDetachObjectARB", descriptor = "(II)V")
	void glDetachObjectARB(@OriginalArg(0) int containerObj, @OriginalArg(1) int attachedObj);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glDisable", descriptor = "(I)V")
	void glDisable(@OriginalArg(0) int cap);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glDisableClientState", descriptor = "(I)V")
	void glDisableClientState(@OriginalArg(0) int array);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glDrawBuffer", descriptor = "(I)V")
	void glDrawBuffer(@OriginalArg(0) int buf);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glDrawElements", descriptor = "(IIILjava/nio/Buffer;)V")
	void glDrawElements(@OriginalArg(0) int mode, @OriginalArg(1) int count, @OriginalArg(2) int type, @OriginalArg(3) Buffer indices);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glDrawElements", descriptor = "(IIIJ)V")
	void glDrawElements(@OriginalArg(0) int mode, @OriginalArg(1) int count, @OriginalArg(2) int type, @OriginalArg(3) long indices);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glDrawPixels", descriptor = "(IIIILjava/nio/Buffer;)V")
	void glDrawPixels(@OriginalArg(0) int width, @OriginalArg(1) int height, @OriginalArg(2) int format, @OriginalArg(3) int type, @OriginalArg(4) Buffer pixels);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glEnableClientState", descriptor = "(I)V")
	void glEnableClientState(@OriginalArg(0) int array);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glEndList", descriptor = "()V")
	void glEndList();

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glFogf", descriptor = "(IF)V")
	void glFogf(@OriginalArg(0) int pname, @OriginalArg(1) float param);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glFogfv", descriptor = "(I[FI)V")
	void glFogfv(@OriginalArg(0) int pname, @OriginalArg(1) float[] params, @OriginalArg(2) int paramsOffset);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glFogi", descriptor = "(II)V")
	void glFogi(@OriginalArg(0) int pname, @OriginalArg(1) int param);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glFramebufferTexture2DEXT", descriptor = "(IIIII)V")
	void glFramebufferTexture2DEXT(@OriginalArg(0) int target, @OriginalArg(1) int attachment, @OriginalArg(2) int textarget, @OriginalArg(3) int texture, @OriginalArg(4) int level);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glGenBuffersARB", descriptor = "(I[II)V")
	void glGenBuffersARB(@OriginalArg(0) int n, @OriginalArg(1) int[] buffers, @OriginalArg(2) int buffersOffset);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glGenLists", descriptor = "(I)I")
	int glGenLists(@OriginalArg(0) int range);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glGenTextures", descriptor = "(I[II)V")
	void glGenTextures(@OriginalArg(0) int n, @OriginalArg(1) int[] textures, @OriginalArg(2) int texturesOffset);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glGetFloatv", descriptor = "(ILjava/nio/FloatBuffer;)V")
	void glGetFloatv(@OriginalArg(0) int pname, @OriginalArg(1) FloatBuffer data);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glGetFloatv", descriptor = "(I[FI)V")
	void glGetFloatv(@OriginalArg(0) int pname, @OriginalArg(1) float[] data, @OriginalArg(2) int dataOffset);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glGetIntegerv", descriptor = "(I[II)V")
	void glGetIntegerv(@OriginalArg(0) int pname, @OriginalArg(1) int[] data, @OriginalArg(2) int dataOffset);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glGetInfoLogARB", descriptor = "(II[II[BI)V")
	void glGetInfoLogARB(@OriginalArg(0) int obj, @OriginalArg(1) int maxLength, @OriginalArg(2) int[] length, @OriginalArg(3) int lengthOffset, @OriginalArg(4) byte[] infoLog, @OriginalArg(5) int infoLogOffset);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glGetObjectParameterivARB", descriptor = "(II[II)V")
	void glGetObjectParameterivARB(@OriginalArg(0) int obj, @OriginalArg(1) int pname, @OriginalArg(2) int[] params, @OriginalArg(3) int paramsOffset);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glGetString", descriptor = "(I)Ljava/lang/String;")
	String glGetString(@OriginalArg(0) int name);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glGetUniformLocation", descriptor = "(ILjava/lang/String;)I")
	int glGetUniformLocation(@OriginalArg(0) int program, @OriginalArg(1) String name);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glHint", descriptor = "(II)V")
	void glHint(@OriginalArg(0) int target, @OriginalArg(1) int mode);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glInterleavedArrays", descriptor = "(IIJ)V")
	void glInterleavedArrays(@OriginalArg(0) int format, @OriginalArg(1) int stride, @OriginalArg(2) long pointer);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glInterleavedArrays", descriptor = "(IILjava/nio/Buffer;)V")
	void glInterleavedArrays(@OriginalArg(0) int format, @OriginalArg(1) int stride, @OriginalArg(2) Buffer pointer);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glLightModelfv", descriptor = "(I[FI)V")
	void glLightModelfv(@OriginalArg(0) int pname, @OriginalArg(1) float[] params, @OriginalArg(2) int paramsOffset);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glLightf", descriptor = "(IIF)V")
	void glLightf(@OriginalArg(0) int light, @OriginalArg(1) int pname, @OriginalArg(2) float param);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glLinkProgramARB", descriptor = "(I)V")
	void glLinkProgramARB(@OriginalArg(0) int programObj);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glLoadMatrixf", descriptor = "([FI)V")
	void glLoadMatrixf(@OriginalArg(0) float[] m, @OriginalArg(1) int mOffset);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glMaterialfv", descriptor = "(II[FI)V")
	void glMaterialfv(@OriginalArg(0) int face, @OriginalArg(1) int pname, @OriginalArg(2) float[] params, @OriginalArg(3) int paramsOffset);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glMultiTexCoord2f", descriptor = "(IFF)V")
	void glMultiTexCoord2f(@OriginalArg(0) int target, @OriginalArg(1) float s, @OriginalArg(2) float t);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glMultiTexCoord2i", descriptor = "(III)V")
	void glMultiTexCoord2i(@OriginalArg(0) int target, @OriginalArg(1) int s, @OriginalArg(2) int t);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glNewList", descriptor = "(II)V")
	void glNewList(@OriginalArg(0) int list, @OriginalArg(1) int mode);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glNormal3f", descriptor = "(FFF)V")
	void glNormal3f(@OriginalArg(0) float nx, @OriginalArg(1) float ny, @OriginalArg(2) float nz);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glNormalPointer", descriptor = "(IILjava/nio/Buffer;)V")
	void glNormalPointer(@OriginalArg(0) int type, @OriginalArg(1) int stride, @OriginalArg(2) Buffer pointer);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glNormalPointer", descriptor = "(IIJ)V")
	void glNormalPointer(@OriginalArg(0) int type, @OriginalArg(1) int stride, @OriginalArg(2) long pointer);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glOrtho", descriptor = "(DDDDDD)V")
	void glOrtho(@OriginalArg(0) double left, @OriginalArg(1) double right, @OriginalArg(2) double bottom, @OriginalArg(3) double top, @OriginalArg(4) double zNear, @OriginalArg(5) double zFar);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glPointParameterfARB", descriptor = "(IF)V")
	void glPointParameterfARB(@OriginalArg(0) int pname, @OriginalArg(1) float param);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glPointParameterfvARB", descriptor = "(I[FI)V")
	void glPointParameterfvARB(@OriginalArg(0) int pname, @OriginalArg(1) float[] params, @OriginalArg(2) int paramsOffset);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glPointSize", descriptor = "(F)V")
	void glPointSize(@OriginalArg(0) float size);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glPolygonMode", descriptor = "(II)V")
	void glPolygonMode(@OriginalArg(0) int face, @OriginalArg(1) int mode);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glPopAttrib", descriptor = "()V")
	void glPopAttrib();

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glPopMatrix", descriptor = "()V")
	void glPopMatrix();

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glProgramLocalParameter4fARB", descriptor = "(IIFFFF)V")
	void glProgramLocalParameter4fARB(@OriginalArg(0) int target, @OriginalArg(1) int index, @OriginalArg(2) float x, @OriginalArg(3) float y, @OriginalArg(4) float z, @OriginalArg(5) float w);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glProgramLocalParameter4fvARB", descriptor = "(IILjava/nio/FloatBuffer;)V")
	void glProgramLocalParameter4fvARB(@OriginalArg(0) int target, @OriginalArg(1) int index, @OriginalArg(2) FloatBuffer params);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glProgramLocalParameter4fvARB", descriptor = "(II[FI)V")
	void glProgramLocalParameter4fvARB(@OriginalArg(0) int target, @OriginalArg(1) int index, @OriginalArg(2) float[] params, @OriginalArg(3) int paramsOffset);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glProgramStringARB", descriptor = "(IIILjava/lang/String;)V")
	void glProgramStringARB(@OriginalArg(0) int target, @OriginalArg(1) int format, @OriginalArg(2) int len, @OriginalArg(3) String string);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glPushAttrib", descriptor = "(I)V")
	void glPushAttrib(@OriginalArg(0) int mask);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glPushMatrix", descriptor = "()V")
	void glPushMatrix();

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glRasterPos2i", descriptor = "(II)V")
	void glRasterPos2i(@OriginalArg(0) int x, @OriginalArg(1) int y);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glReadBuffer", descriptor = "(I)V")
	void glReadBuffer(@OriginalArg(0) int src);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glScalef", descriptor = "(FFF)V")
	void glScalef(@OriginalArg(0) float x, @OriginalArg(1) float y, @OriginalArg(2) float z);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glScissor", descriptor = "(IIII)V")
	void glScissor(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glShadeModel", descriptor = "(I)V")
	void glShadeModel(@OriginalArg(0) int mode);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glShaderSourceARB", descriptor = "(II[Ljava/lang/String;[II)V")
	void glShaderSourceARB(@OriginalArg(0) int shaderObj, @OriginalArg(1) int count, @OriginalArg(2) String[] string, @OriginalArg(3) int[] length, @OriginalArg(4) int lengthOffset);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glTexCoord2i", descriptor = "(II)V")
	void glTexCoord2i(@OriginalArg(0) int s, @OriginalArg(1) int t);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glTexCoordPointer", descriptor = "(IIILjava/nio/Buffer;)V")
	void glTexCoordPointer(@OriginalArg(0) int size, @OriginalArg(1) int type, @OriginalArg(2) int stride, @OriginalArg(3) Buffer pointer);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glTexCoordPointer", descriptor = "(IIIJ)V")
	void glTexCoordPointer(@OriginalArg(0) int size, @OriginalArg(1) int type, @OriginalArg(2) int stride, @OriginalArg(3) long pointer);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glTexEnvf", descriptor = "(IIF)V")
	void glTexEnvf(@OriginalArg(0) int target, @OriginalArg(1) int pname, @OriginalArg(2) float param);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glTexEnvfv", descriptor = "(II[FI)V")
	void glTexEnvfv(@OriginalArg(0) int target, @OriginalArg(1) int pname, @OriginalArg(2) float[] params, @OriginalArg(3) int paramsOffset);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glTexEnvi", descriptor = "(III)V")
	void glTexEnvi(@OriginalArg(0) int target, @OriginalArg(1) int pname, @OriginalArg(2) int param);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glTexGenfv", descriptor = "(II[FI)V")
	void glTexGenfv(@OriginalArg(0) int coord, @OriginalArg(1) int pname, @OriginalArg(2) float[] params, @OriginalArg(3) int paramsOffset);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glTexGeni", descriptor = "(III)V")
	void glTexGeni(@OriginalArg(0) int coord, @OriginalArg(1) int pname, @OriginalArg(2) int param);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glTexImage1D", descriptor = "(IIIIIIILjava/nio/Buffer;)V")
	void glTexImage1D(@OriginalArg(0) int target, @OriginalArg(1) int level, @OriginalArg(2) int internalformat, @OriginalArg(3) int width, @OriginalArg(4) int border, @OriginalArg(5) int format, @OriginalArg(6) int type, @OriginalArg(7) Buffer pixels);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glTexImage2D", descriptor = "(IIIIIIIILjava/nio/Buffer;)V")
	void glTexImage2D(@OriginalArg(0) int target, @OriginalArg(1) int level, @OriginalArg(2) int internalformat, @OriginalArg(3) int width, @OriginalArg(4) int height, @OriginalArg(5) int border, @OriginalArg(6) int format, @OriginalArg(7) int type, @OriginalArg(8) Buffer pixels);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glTexImage3D", descriptor = "(IIIIIIIIILjava/nio/Buffer;)V")
	void glTexImage3D(@OriginalArg(0) int target, @OriginalArg(1) int level, @OriginalArg(2) int internalformat, @OriginalArg(3) int width, @OriginalArg(4) int height, @OriginalArg(5) int depth, @OriginalArg(6) int border, @OriginalArg(7) int format, @OriginalArg(8) int type, @OriginalArg(9) Buffer pixels);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glTexParameteri", descriptor = "(III)V")
	void glTexParameteri(@OriginalArg(0) int target, @OriginalArg(1) int pname, @OriginalArg(2) int param);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glUniform1iARB", descriptor = "(II)V")
	void glUniform1iARB(@OriginalArg(0) int location, @OriginalArg(1) int v0);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glUniform3fARB", descriptor = "(IFFF)V")
	void glUniform3fARB(@OriginalArg(0) int location, @OriginalArg(1) float v0, @OriginalArg(2) float v1, @OriginalArg(3) float v2);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glUseProgramObjectARB", descriptor = "(I)V")
	void glUseProgramObjectARB(@OriginalArg(0) int programObj);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glVertex2f", descriptor = "(FF)V")
	void glVertex2f(@OriginalArg(0) float x, @OriginalArg(1) float y);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glVertex2i", descriptor = "(II)V")
	void glVertex2i(@OriginalArg(0) int x, @OriginalArg(1) int y);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glVertexPointer", descriptor = "(IIILjava/nio/Buffer;)V")
	void glVertexPointer(@OriginalArg(0) int size, @OriginalArg(1) int type, @OriginalArg(2) int stride, @OriginalArg(3) Buffer pointer);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glVertexPointer", descriptor = "(IIIJ)V")
	void glVertexPointer(@OriginalArg(0) int size, @OriginalArg(1) int type, @OriginalArg(2) int stride, @OriginalArg(3) long pointer);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glViewport", descriptor = "(IIII)V")
	void glViewport(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glColorMask", descriptor = "(ZZZZ)V")
	void glColorMask(@OriginalArg(0) boolean red, @OriginalArg(1) boolean green, @OriginalArg(2) boolean blue, @OriginalArg(3) boolean alpha);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glGenRenderbuffersEXT", descriptor = "(I[II)V")
	void glGenRenderbuffersEXT(@OriginalArg(0) int n, @OriginalArg(1) int[] renderbuffers, @OriginalArg(2) int renderbuffersOffset);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glDeleteRenderbuffersEXT", descriptor = "(I[II)V")
	void glDeleteRenderbuffersEXT(@OriginalArg(0) int n, @OriginalArg(1) int[] renderbuffers, @OriginalArg(2) int renderbuffersOffset);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glBindRenderbufferEXT", descriptor = "(II)V")
	void glBindRenderbufferEXT(@OriginalArg(0) int target, @OriginalArg(1) int renderbuffer);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glRenderbufferStorageEXT", descriptor = "(IIII)V")
	void glRenderbufferStorageEXT(@OriginalArg(0) int target, @OriginalArg(1) int internalformat, @OriginalArg(2) int width, @OriginalArg(3) int height);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glFramebufferRenderbufferEXT", descriptor = "(IIII)V")
	void glFramebufferRenderbufferEXT(@OriginalArg(0) int target, @OriginalArg(1) int attachment, @OriginalArg(2) int renderbuffertarget, @OriginalArg(3) int renderbuffer);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glDrawArrays", descriptor = "(III)V")
	void glDrawArrays(@OriginalArg(0) int mode, @OriginalArg(1) int first, @OriginalArg(2) int count);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glLineWidth", descriptor = "(F)V")
	void glLineWidth(@OriginalArg(0) float width);

	void glPixelZoom(float xfactor, float yfactor);
}
