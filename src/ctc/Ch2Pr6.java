package ctc;

import java.util.HashSet;

public class Ch2Pr6 {

	public static Ch2Node findLoop(Ch2Node ptr1) {
		HashSet<Ch2Node> seen = new HashSet<Ch2Node>();
		Ch2Node tmp = ptr1;
		while (ptr1 != null) {
			if (!seen.contains(tmp)) {
				seen.add(tmp);
				tmp = tmp.next;
			}
			else {
				return tmp;
			}
			
		}
		return null;
	}

}
