package ctc;

// reverse a string
public class Problem2 {

	/* pretty sure the main point of this question was to reverse the string
	 * in place by manipulating pointers in C or C++ (as asked in the question)
	 * regardless, here it goes..
	 */
	public static String reverseString(String s) {
		
		StringBuffer returnString = new StringBuffer();
		for (int i = s.length() - 1; i >= 0; i--) {
			returnString.append(s.charAt(i));
		}
		return returnString.toString();
	}
}
