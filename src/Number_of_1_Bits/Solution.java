package Number_of_1_Bits;

public class Solution {
	// you need to treat n as an unsigned value
	/**
	 * 252ms 74.67%
	 * 
	 * @param n
	 * @return
	 */
	public int hammingWeight(int n) {
		int ret = 0;

		for (int i = 0; i < 32; i++) {
			if ((n & 1) == 1) {
				ret++;
			}
			n = n >> 1;
		}

		return ret;
	}
}
