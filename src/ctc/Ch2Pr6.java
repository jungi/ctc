package ctc;

public class Ch2Pr6 {

	public static Ch2Node findLoop(Ch2Node ptr1) {
		Ch2Node tmp = ptr1;
		while (ptr1.next != null) {
			ptr1 = ptr1.next;
			if (tmp.equals(ptr1)) {
				return tmp;
			}
		}
		return null;
	}

}
