package ctc;

public class Ch2Pr3 {

	public static void removeAt(Ch2Node ptr) {
		Ch2Node tmp = ptr.next;
		ptr.data = tmp.data;
		ptr.next = tmp.next;
	}


	
	
}
