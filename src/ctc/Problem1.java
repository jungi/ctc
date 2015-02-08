package ctc;

import java.util.HashMap;
import java.util.Map;

// Check if a string has all unique char
public class Problem1 {
	
	public static boolean checkUnique(String s){
		Map<Character, Integer> countMap = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (countMap.get(s.charAt(i)) != null) {
				return false;
			}
			else {
				countMap.put(s.charAt(i), 1);
			}
		}
		
		return true;
		
	}
}
