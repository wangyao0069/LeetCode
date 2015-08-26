package Rotate_Array;

public class Solution {

	/**
	 * 360ms 18%
	 * 
	 * @param nums
	 * @param k
	 */
	public void rotate(int[] nums, int k) {
		k = k % nums.length;

		palindrome(nums, 0, nums.length - k);
		palindrome(nums, nums.length - k, nums.length);
		palindrome(nums, 0, nums.length);
	}

	private void palindrome(int[] nums, int s, int e) {
		for (int i = 0; i < (e - s) / 2; i++) {
			int t = nums[s + i];
			nums[s + i] = nums[e - 1 - i];
			nums[e - 1 - i] = t;
		}
	}
}
