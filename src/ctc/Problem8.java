package ctc;

public class Problem8 {
	public static boolean isRotation(String s1, String s2) {
		String tmp = s1 + s1;
		// used contains here instead of isSubstring
		return tmp.contains(s2);		
	}
}
