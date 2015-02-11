package ctc;

import java.util.LinkedList;

public class Ch2Pr3 {

	public static void removeAt(LinkedList<Ch2Node> testList, Ch2Node ptr) {
		Ch2Node tmp = ptr.next;
		ptr.data = tmp.data;
		ptr.next = tmp.next;
	}


	
	
}
