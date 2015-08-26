package House_Robber;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	/**
	 * 280ms
	 * 
	 * @param nums
	 * @return
	 */
	public int rob(int[] nums) {
		int len = nums.length;
		if (len == 0)
			return 0;
		if (len == 1)
			return nums[0];
		int[] val = new int[len];
		val[0] = nums[0];
		val[1] = Math.max(nums[0], nums[1]);
		for (int i = 2; i < len; i++)
			val[i] = Math.max(nums[i] + val[i - 2], val[i - 1]);
		return val[len - 1];
	}

	/**
	 * @param nums
	 * @return
	 */
	public int rob_v1(int[] nums) {
		int ret = 0;
		if (nums == null || nums.length == 0) {
			return ret;
		}
		List<ArrayList<Integer>> listSet = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list1.add(0);
		list2.add(1);
		listSet.add(list1);
		listSet.add(list2);
		for (int i = 1; i < nums.length; i++) {
			int size = listSet.size();
			for (int j = 0; j < size; j++) {
				ArrayList<Integer> t = listSet.get(j);
				if (t.get(t.size() - 1) == 0
						&& (t.size() - 2 < 0 || !t.get(t.size() - 2).equals(0))) {
					ArrayList<Integer> t2 = new ArrayList<Integer>(t);
					t.add(0);
					t2.add(1);
					listSet.add(t2);
				} else if (t.get(t.size() - 1) == 0 && t.size() - 2 >= 0
						&& t.get(t.size() - 1) == 0) {
					t.add(1);
				} else {
					t.add(0);
				}
			}
		}

		for (int i = 0; i < listSet.size(); i++) {
			int sum = 0;
			for (int j = 0; j < listSet.get(i).size(); j++) {
				if (listSet.get(i).get(j) == 1) {
					sum += nums[j];
				}
			}
			if (sum > ret) {
				ret = sum;
			}
		}

		return ret;
	}

}
