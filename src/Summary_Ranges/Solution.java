package Summary_Ranges;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	/**
	 * 264ms
	 * 
	 * @param nums
	 * @return
	 */
	public List<String> summaryRanges(int[] nums) {

		List<String> ret = new ArrayList<String>();

		for (int i = 0; i < nums.length;) {
			int k = 0;
			while (i + k + 1 < nums.length
					&& nums[i + k] == nums[i + k + 1] - 1) {
				k++;
			}

			if (k == 0) {
				ret.add(String.valueOf(nums[i]));
			} else {
				ret.add(String.valueOf(nums[i]) + "->"
						+ String.valueOf(nums[i + k]));
			}
			i = i + k + 1;
		}

		return ret;

	}
}
