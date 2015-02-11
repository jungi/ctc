package ctc;

import java.util.HashSet;

public class Ch4Pr2Graph {
HashSet<Ch4Pr2Node> nodes;
	public Ch4Pr2Graph() {
		nodes = new HashSet<Ch4Pr2Node>();
	}
	
	public void add(Ch4Pr2Node n) {
		nodes.add(n);
	}
}
