package Remove_Element;

public class Solution {

	/**
	 * 296ms
	 * 
	 * @param nums
	 * @param val
	 * @return
	 */
	public int removeElement(int[] nums, int val) {
		int i = 0;
		int j = 0;
		for (j = 0; j < nums.length; j++) {
			if (nums[j] != val) {
				nums[i] = nums[j];
				i++;
			}
		}
		return nums.length - j + i;
	}

	/**
	 * 340ms
	 * 
	 * @param nums
	 * @param val
	 * @return
	 */
	public int removeElement_v1(int[] nums, int val) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int i = 0;
		int k = 0;
		while (i + k < nums.length) {
			while (i + k < nums.length && nums[i + k] == val) {
				k++;
			}
			if (i + k >= nums.length) {
				continue;
			} else if (k != 0) {
				nums[i] = nums[i + k];
			}
			i++;
		}
		return i;
	}
}
