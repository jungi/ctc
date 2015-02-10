package ctc;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Ch2Pr1 {
	public static LinkedList<String> removeDuplicates(LinkedList<String> ll) {
		LinkedList<String> returnString = new LinkedList<String>();
		HashSet<String> count = new HashSet<String>();
		
		Iterator it = ll.iterator();
		
		while (it.hasNext()) {
			String s = (String) it.next();
			if (!count.contains(s)) {
				count.add(s);
				returnString.add(s);
			}
		}
		
		
		return returnString;
	}
}
