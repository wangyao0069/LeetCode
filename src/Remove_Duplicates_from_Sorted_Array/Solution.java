package Remove_Duplicates_from_Sorted_Array;

public class Solution {
	
	/**364ms
	 * @param nums
	 * @return
	 */
	public int removeDuplicates(int[] nums) {

		if (nums == null || nums.length == 0) {
			return 0;
		}
		int i = 0;
		int k = 1;
		while(k < nums.length) {
			while (k < nums.length && nums[i] == nums[k]) {
				k++;
			} 
			if (k == i+1) {
				k++;
			} else if (k >= nums.length) {
				continue;
			}else {
				int t = nums[i+1];
				nums[i+1] = nums[k];
				nums[k] = t;
				k++;
			}
			i++;
		}

		return i+1;
	}

	/**528  省掉调用
	 * @param nums
	 * @return
	 */
	public int removeDuplicates_v2(int[] nums) {

		if (nums == null || nums.length == 0) {
			return 0;
		}

		int j = 0;
		for (int i = 0; i < nums.length - j - 1;) {
			if (nums[i] == nums[i + 1]) {
				//move(i + 1, nums);
				
				int tmp = nums[i+1];
				for (int s = i+1; s < nums.length - 1; s++) {
					nums[s] = nums[s + 1];
				}
				nums[nums.length - 1] = tmp;
				
				
				j++;
			} else {
				i++;
			}
		}

		return nums.length - j;
	}

	/**
	 * 532ms
	 * 
	 * @param nums
	 * @return
	 */
	public int removeDuplicates_v1(int[] nums) {

		if (nums == null || nums.length == 0) {
			return 0;
		}

		int j = 0;
		for (int i = 0; i < nums.length - j - 1;) {
			if (nums[i] == nums[i + 1]) {
				move(i + 1, nums);
				j++;
			} else {
				i++;
			}
		}

		return nums.length - j;
	}

	private void move(int s, int[] nums) {
		int tmp = nums[s];
		for (int i = s; i < nums.length - 1; i++) {
			nums[i] = nums[i + 1];
		}
		nums[nums.length - 1] = tmp;
	}
}
