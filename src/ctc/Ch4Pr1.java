package ctc;

public class Ch4Pr1 {

	public static boolean isBalanced(BSTNode node) {
		if (node != null) {

			return isBalanced(node.left) && isBalanced(node.right) &&
					Math.abs(checkHeight(node.left) - checkHeight(node.right))
					<= 1;
		}
		return true;
	}
	
	public static int checkHeight(BSTNode node) {
		if (node == null) {
			return 0;
		}
		else if (node.right != null && node.left != null) {
			return Math.max(checkHeight(node.right) + 1
					, checkHeight(node.left) + 1);
		}
		else if (node.right != null) {
			return checkHeight(node.left) + 1;
		}
		else if (node.left != null) {
			return checkHeight(node.right) + 1;
		}
		else {
			return 0;
		}
	}

}
