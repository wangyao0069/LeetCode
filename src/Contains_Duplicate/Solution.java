package Contains_Duplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	/**
	 * 436ms
	 * 
	 * @param nums
	 * @return
	 */
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (set.contains(nums[i])) {
				return true;
			} else {
				set.add(nums[i]);
			}
		}

		return false;
	}
}
