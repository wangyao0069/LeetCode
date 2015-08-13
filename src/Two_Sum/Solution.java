package Two_Sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public int[] twoSum(int[] nums, int target) {
		int[] retIndexs = null;

		Map<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
		Map<Integer, Integer> numsMap_re = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (numsMap.containsKey(nums[i])) {
				numsMap_re.put(nums[i], i + 1);
			} else {
				numsMap.put(nums[i], i + 1);
			}
		}
		
		for (int i = 0; i < nums.length; i++) {
			int a_i = 0, b_i = 0;
			int b = target - nums[i];
			if (numsMap_re.containsKey(b)) {
				a_i = numsMap.get(b);
				b_i = numsMap_re.get(b);
				retIndexs = sort(a_i, b_i);
				break;
			} else if (numsMap.containsKey(nums[i]) && numsMap.containsKey(b)) {
				a_i = numsMap.get(nums[i]);
				b_i = numsMap.get(b);
				if (a_i == b_i) {
					continue;
				}
				retIndexs = sort(a_i, b_i);
				break;
			} 
		}

		return retIndexs;
	}
	
	private int[] sort(int a, int b){
		int[] ret = new int[2];
		
		if (a > b) {
			ret[0] = b;
			ret[1] = a;
		} else {
			ret[1] = b;
			ret[0] = a;
		}
		
		return ret;
	}

}
