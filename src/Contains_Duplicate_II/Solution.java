package Contains_Duplicate_II;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	/**
	 * 432ms
	 * 
	 * @param nums
	 * @param k
	 * @return
	 */
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		boolean ret = false;
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				if ((i - map.get(nums[i])) <= k) {
					ret = true;
				}
			}
			map.put(nums[i], i);
		}

		return ret;
	}
}
