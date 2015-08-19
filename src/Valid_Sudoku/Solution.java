package Valid_Sudoku;

public class Solution {

	/**344ms
	 * @param board
	 * @return
	 */
	public boolean isValidSudoku(char[][] board) {
		boolean ret = true;
		for (int i = 0; i < 9; i++) {
			char[] vertical = new char[9];
			char[] horizontal = new char[9];
			for (int j = 0; j < 9; j++) {
				vertical[j] = board[i][j];
				horizontal[j] = board[j][i];
			}
			ret = ret && isValid(vertical);
			ret = ret && isValid(horizontal);
			if (!ret) {
				break;
			}
		}
		
		for (int i = 0; i < 9; i = i+3) {
			for (int j = 0; j < 9; j = j+3) {
				if (!ret) {
					break;
				}
				char[] nine = new char[9];
				for(int m = 0; m < 3; m++){
					for(int n = 0; n < 3; n++) {
						nine[m*3+n] = board[i+m][j+n];
					}
				}
				ret = ret && isValid(nine);
			}
		}
		
		return ret;
	}

	private boolean isValid(char[] nine) {
		int[] state = new int[9];

		for (int i = 0; i < 9; i++) {
			char t = nine[i];
			if (t != '.') {
				if (state[t - '1'] == 0) {
					state[t - '1'] = 1;
				} else {
					return false;
				}
			}
		}

		return true;
	}
}
