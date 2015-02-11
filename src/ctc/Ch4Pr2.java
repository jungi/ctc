package ctc;

import java.util.HashSet;

public class Ch4Pr2 {

	public static boolean checkPath(Ch4Pr2Node n1, Ch4Pr2Node n2) {
		HashSet<Ch4Pr2Node> m = new HashSet<Ch4Pr2Node>();
		return dfs(n1, m).contains(n2);
	}
	
	// return all reachable neighbors
	public static HashSet<Ch4Pr2Node> dfs(Ch4Pr2Node n, 
			HashSet<Ch4Pr2Node> marked) {
		marked.add(n);
		for (Ch4Pr2Node neighbor : n.neighbors) {
			if (!marked.contains(neighbor)) {
				dfs(neighbor, marked);
			}
		}
		return marked;
	}

}
