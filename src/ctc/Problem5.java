package ctc;

public class Problem5 {
	// "aabcccccaa"
	public static String compressString(String s) {
		StringBuffer returnString = new StringBuffer();
		int count = 0;
		
		for (int i = 0; i < s.length() - 1; i++) {
			if (count == 0) {
				returnString.append(s.charAt(i));
				count++;
				if (s.charAt(i + 1) != s.charAt(i)) {
					returnString.append(count);
					count = 0;
				} 
			}
			else {
				count++;
				if (s.charAt(i + 1) != s.charAt(i)) {
					returnString.append(count);
					count = 0;
				} 
			}
			if (i == s.length() - 2) {
				if (count == 0) {
					returnString.append(s.charAt(i+1));
					returnString.append(1);
				}
				else {
					returnString.append(count);
				}
			}
		}

		if (returnString.toString().length() > s.length()) {
			return s;
		}
		else {
			return returnString.toString();
		}
	}
}
