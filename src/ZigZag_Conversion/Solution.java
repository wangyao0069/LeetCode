package ZigZag_Conversion;

public class Solution {
	public String convert(String s, int numRows) {
		StringBuffer sBuffer = new StringBuffer();

		if (numRows == 1) {
			return s;
		}
		int add = 2 * (numRows - 1);
		for (int row = 0; row < numRows; row++) {
			for (int i = row, j = 0; i < s.length(); j++) {
				sBuffer.append(s.charAt(i));
				if (row == 0 || row == numRows - 1) {
					i += add;
				} else if (j % 2 == 0) {
					i += add - row * 2;
				} else {
					i += row * 2;
				}
			}
		}

		return sBuffer.toString();
	}
}
