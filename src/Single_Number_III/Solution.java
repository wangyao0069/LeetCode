package Single_Number_III;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	/**424ms
	 * @param nums
	 * @return
	 */
	public int[] singleNumber(int[] nums) {
		int s = 0;
		for (int i = 0; i < nums.length; i++) {
			s ^= nums[i];
		}
		//以最后一个1划分两个数
		s = s - (s & (s - 1));
		int[] ret = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if ((s & nums[i]) == 0) {
				ret[0] ^= nums[i];
			} else {
				ret[1] ^= nums[i];
			}
		}
		
		return ret;
	}
	
	
	/**504
	 * @param nums
	 * @return
	 */
	public int[] singleNumber_v1(int[] nums) {
		int[] ret = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i])+1);
			} else {
				map.put(nums[i], 1);
			}
		}
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (map.get(nums[i]) == 1) {
				ret[j] = nums[i];
				j++;
			}
		}
		
		return ret;
	}
}
