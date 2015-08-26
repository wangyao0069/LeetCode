package Reverse_Bits;

public class Solution {
	// you need treat n as an unsigned value
	/**
	 * 304ms 81.89%
	 * 
	 * @param n
	 * @return
	 */
	public int reverseBits(int n) {
		int ret = 0;
		for (int i = 0; i < 32; i++) {
			if ((n & 1) == 1) {
				ret = ret << 1;
				ret = ret + 1;
			} else {
				ret = ret << 1;
			}
			n = n >> 1;
		}

		return ret;
	}
}
