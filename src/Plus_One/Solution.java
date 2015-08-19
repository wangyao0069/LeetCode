package Plus_One;

public class Solution {
	/**
	 * 316ms
	 * 
	 * @param digits
	 * @return
	 */
	public int[] plusOne(int[] digits) {
		int sta = 0;
		for (int i = digits.length - 1; i >= 0; i--) {
			if (i == digits.length - 1 || sta == 1) {
				if (digits[i] == 9) {
					digits[i] = 0;
					sta = 1;
				} else {
					digits[i]++;
					sta = 0;
				}
			}
		}
		int[] ret = null;
		if (sta == 1) {
			ret = new int[digits.length + 1];
			ret[0] = 1;
			for (int i = 1; i < digits.length + 1; i++) {
				ret[i] = digits[i - 1];
			}
		} else {
			ret = digits;
		}

		return ret;
	}
}
