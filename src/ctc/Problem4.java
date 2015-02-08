package ctc;

public class Problem4 {

	public static String replaceSpaces(char[] input, int k) {
		
		int ptr1, ptr2;
		ptr1 = input.length - 1;
		ptr2 = input.length - 1;
		
		while (input[ptr1] == ' ') {
			ptr1--;
		}
		while (ptr1 >= 0 && ptr2 > 0) {
			if (input[ptr1] == ' ') {
				input[ptr2] = '0';
				ptr2--;
				input[ptr2] = '2';
				ptr2--;
				input[ptr2] = '%';
				ptr2--;
				ptr1--;
			}
			else {
				input[ptr2] = input[ptr1];
				ptr1--;
				ptr2--;
			}
		}
		
		StringBuffer returnString = new StringBuffer();
		for (int i = 0; i < input.length; i++) {
			returnString.append(input[i]);
		}
		System.out.println(returnString.toString());
		
		return returnString.toString();
		
	}
}
