package ctc;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Ch4Pr4 {

	public static void makeLists(BSTNode node,
			HashMap<Integer, Queue<BSTNode>> lists) {
		helper(node, lists, 0);
	}
	
	public static void helper (BSTNode node,
			HashMap<Integer, Queue<BSTNode>> lists, int level) {
		if (node != null) {
			if (lists.get(level) == null) {
				lists.put(level, new LinkedList<BSTNode>());
				lists.get(level).offer(node);
				helper(node.left, lists, level + 1);
				helper(node.right, lists, level + 1);
			}
			else {
				lists.get(level).offer(node);
				helper(node.left, lists, level + 1);
				helper(node.right, lists, level + 1);
			}
		}
	}

}
