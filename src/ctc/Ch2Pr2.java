package ctc;

import java.util.Iterator;
import java.util.LinkedList;

public class Ch2Pr2 {

	public static int findKthLast(LinkedList<Integer> testList, int k) {
		Iterator<Integer> it = testList.iterator();
		Iterator<Integer> it2 = null;
		int a = 0;
		
		while (it.hasNext()) {
			if (k > 0) {
				k--;
				it.next();
			} 
			else if (k == 0) {
				it2 = testList.iterator();
				k--;
			}
			else {
				it.next();
				a = it2.next();
				k--;
			}
		}
		
		return it2.next();
	}

}
