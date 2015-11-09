package Sliding_Window_Maximum;

public class Solution {
	public int[] maxSlidingWindow(int[] nums, int k) {
		if (nums.length == 0) {
			return new int[0];
		}
		
		int[] ret = new int[nums.length - k + 1];

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (max < nums[i]) {
				max  = nums[i];
			}
			if (i >= k-1) {
				ret[i-k+1] = max;
			}
		}

		return ret;
	}
}
