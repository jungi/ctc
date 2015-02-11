package ctc;

import java.util.HashSet;

public class Ch4Pr2Node {
	HashSet<Ch4Pr2Node> neighbors;
	int data;
	
	public Ch4Pr2Node() {
		neighbors = new HashSet<Ch4Pr2Node>();
	}
	
	public void addNeighbor(Ch4Pr2Node n) {
		neighbors.add(n);
	}
	
	

}
