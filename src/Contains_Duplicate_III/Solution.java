package Contains_Duplicate_III;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
	
	/**464ms
	 * @param nums
	 * @param k
	 * @param t
	 * @return
	 */
	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

		if (nums.length == 0 || nums.length == 1) {
			return false;
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] numList = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			numList[i] = nums[i];
		}
		Arrays.sort(nums);
		for (int i = 0; i < numList.length; i++) {
			int s = searchStart(nums, numList[i] - t, 0, nums.length, true);
			int e = searchStart(nums, numList[i] + t, 0, nums.length, false);
			for (int j = s; j <= e; j++) {
				if (map.containsKey(nums[j])) {
					if (i - map.get(nums[j]) <= k) {
						return true;
					}
				}
			}
			map.put(numList[i], i);
		}

		return false;
	}

	private int searchStart(int[] list, int t, int s, int e, boolean isStart) {

		if (list[s + (e - s) / 2] > t) {
			if (e == s || (s + 1) == e) {
				if (s == 0) {
					return 0;
				}
				if (isStart) {
					return s+1;
				}else {
					return s;
				}
			}
			return searchStart(list, t, s, s + (e - s) / 2,isStart);
		} else if (list[s + (e - s) / 2] < t) {
			if (e == s || (s + 1) == e) {
				if (isStart) {
					return s+1;
				}else {
					return s;
				}
			}
			return searchStart(list, t, s + (e - s) / 2, e,isStart);
		} else {
			return s + (e - s) / 2;
		}
	}

	/**
	 * cannot pass leetcode
	 * 
	 * @param nums
	 * @param k
	 * @param t
	 * @return
	 */
	public boolean containsNearbyAlmostDuplicate_v1(int[] nums, int k, int t) {
		if (nums.length == 0 || nums.length == 1) {
			return false;
		}
		boolean ret = false;
		for (int i = 1; i < nums.length; i++) {
			for (int j = i - 1; j >= 0 && i - j <= k; j--) {
				if (Math.abs(nums[i] - nums[j]) <= t) {
					return true;
				}
			}
		}

		return ret;
	}
}
