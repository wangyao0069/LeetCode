package Factorial_Trailing_Zeroes;

public class Solution {
	/**
	 * 284ms 18%
	 * 
	 * @param n
	 * @return
	 */
	public int trailingZeroes(int n) {
		int ret = 0;

		long num = n;
		num = num < 0 ? -num : num;

		while (n > 0) {
			ret = ret + n / 5;
			n = n / 5;
		}

		return ret;

	}
}
