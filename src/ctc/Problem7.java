package ctc;

public class Problem7 {
	public static int[][] setZeroes(int[][] input) {
		int[] zeroRow = new int[input.length];
		int[] zeroCol = new int[input[0].length];
		int[][] returnMat = new int[input.length][input[0].length];
		
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				if (input[i][j] == 0) {
					zeroRow[i] = 1;
					zeroCol[j] = 1;
				}
			}
		}
		
		for (int i = 0; i < returnMat.length; i++) {
			for (int j = 0; j < returnMat[0].length; j++) {
				if (zeroRow[i] == 1 || zeroCol[j] == 1) {
					returnMat[i][j] = 0;
				}
				else {
					returnMat[i][j] = input[i][j];
				}
			}
		}
		
		
		return returnMat;
		
	}
}
