package prompto.intrinsic;

public abstract class PromptoString {

	public static String multiply(String s, int count) {
		char[] src = s.toCharArray();
		char[] cc = new char[count * src.length];
		for (int i = 0; i < count; i++)
			System.arraycopy(src, 0, cc, i * src.length, src.length);
		return new String(cc);
	}
	
}
