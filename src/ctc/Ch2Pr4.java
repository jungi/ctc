package ctc;

public class Ch2Pr4 {

	public static Ch2Node partition(Ch2Node ptr, int i) {
		Ch2Node less, equal, greater;
		less = null;
		equal = null;
		greater = null;
		
		while (ptr != null) {
			if (ptr.data > i) {
				if (greater == null) {
					greater = new Ch2Node(ptr.data, null);
					ptr = ptr.next;
				}
				else {
					Ch2Node tmp = ptr;
					ptr = ptr.next;
					tmp.next = greater;
					greater = tmp;
				}
			}
			else if (ptr.data < i) {
				if (less == null) {
					less = new Ch2Node(ptr.data, null);
					ptr = ptr.next;
				}
				else {
					Ch2Node tmp = ptr;
					ptr = ptr.next;
					tmp.next = less;
					less = tmp;
				}
			}
			else {
				equal = ptr;
				ptr = ptr.next;
			}
		}
		
		Ch2Node tmp = less;
		while (tmp.next != null) {
			tmp = tmp.next;
		}
		
		tmp.next = equal;
		equal.next = greater;
		return less;

		
	}

}
