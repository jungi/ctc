package ctc;

import java.util.HashMap;

public class Problem3 {

	public static boolean checkPermutation(String s1, String s2) {
		HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
		
		if (s1.length() != s2.length()) {
			return false;
		}
		for (int i = 0; i < s1.length(); i++) {
			if (countMap.get(s1.charAt(i)) != null) {
				countMap.put(s1.charAt(i), countMap.get(s1.charAt(i)) + 1);
			}
			else {
				countMap.put(s1.charAt(i), 1);
			}
		}
		for (int i = 0; i < s2.length(); i++) {
			if (countMap.get(s2.charAt(i)) == null ||
				countMap.get(s2.charAt(i)) == 0) {
				return false;
			}
			else {
				countMap.put(s2.charAt(i), countMap.get(s2.charAt(i)) - 1);
			}
		}
		
		return true;
	}
}
