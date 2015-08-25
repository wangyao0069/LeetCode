package Majority_Element;

import java.util.Stack;

public class Solution {

	/**
	 * 376ms 98.17%
	 * 
	 * @param nums
	 * @return
	 */
	public int majorityElement(int[] nums) {
		Integer ret = null;
		int num = 0;

		for (int i = 0; i < nums.length; i++) {
			if (ret == null) {
				ret = nums[i];
				num++;
			} else if (ret != nums[i]) {
				num--;
				if (num == 0) {
					ret = null;
				}
			} else {
				num++;
			}
		}

		return ret;
	}

	/**
	 * 524ms
	 * 
	 * @param nums
	 * @return
	 */
	public int majorityElement_v2(int[] nums) {
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (stack.empty()) {
				stack.push(nums[i]);
			} else {
				if (stack.peek().equals(nums[i])) {
					stack.push(nums[i]);
				} else {
					stack.pop();
				}
			}
		}

		return stack.peek();
	}

	/**
	 * 796ms
	 * 
	 * @param nums
	 * @return
	 */
	public int majorityElement_v1(int[] nums) {
		int ret = nums[0];

		for (int i = 0; i < nums.length - 1; i += 2) {
			int j = i + 1;
			while (j < nums.length - 1 && nums[i] == nums[j]) {
				j++;
			}

			int t = nums[j];
			nums[j] = nums[i + 1];
			nums[i + 1] = t;
		}

		ret = nums[nums.length - 1];
		return ret;
	}
}
