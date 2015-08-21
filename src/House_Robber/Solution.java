package House_Robber;

public class Solution {
	public int rob(int[] nums) {
		int ret = 0;
		/*if (nums.length == 1) {
			return nums[0];
		} else if (nums.length == 2) {
			if (nums[0] < nums[1]) {
				ret = nums[1];
			} else {
				ret = nums[0];
			}
		} else {*/
			int i = 2;
			//int last = 0;
			while (i < nums.length) {
				int r = sum3(nums[i - 2], nums[i - 1], nums[i]);
				//last = r;
				if (r == 0) {
					ret += nums[i - 2] + nums[i];
					i += 4;
				}
				if (r == 1) {
					ret += nums[i - 1];
					i += 3;
				}
			}
			//+3
			if (i - nums.length == 1 ) {
				ret += nums[nums.length-1];
			}
			if (i - nums.length == 0 ) {
				if (nums[nums.length-2] < nums[nums.length-1]) {
					ret = nums[nums.length-1];
				} else {
					ret = nums[nums.length-2];
				}
			}
			
	//	}

		return ret;
	}

	/**
	 * @param a
	 * @param b
	 * @param c
	 * @return 0 select a,c return 1 select b
	 */
	private int sum3(int a, int b, int c) {

		if (a + c > b) {
			return 0;
		} else {
			return 1;
		}

	}

}
