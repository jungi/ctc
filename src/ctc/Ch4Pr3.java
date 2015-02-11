package ctc;

public class Ch4Pr3 {

	public static BSTNode makeBST(int[] arr) {
		if (arr.length > 1) {
			int k = arr.length/2;
			BSTNode node = new BSTNode(arr[k]);
			int[] tmp1 = new int[k];
			int[] tmp2 = new int[k];
			for (int i = 0; i < arr.length/2; i++) {
				tmp1[i] = arr[i];
				tmp2[i] = arr[i + k + 1];
			}
			node.left = makeBST(tmp1);
			node.right = makeBST(tmp2);
			return node;
		} else {
			return new BSTNode(arr[0]);
		}
	}

}
