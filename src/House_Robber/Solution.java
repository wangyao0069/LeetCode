package House_Robber;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public int rob(int[] nums) {
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
				if (t.get(t.size()-1) == 0 && (t.size()-2 < 0 || !t.get(t.size()-2).equals(0))) {
					ArrayList<Integer> t2 = new ArrayList<Integer>(t); 
					t.add(0);
					t2.add(1);
					listSet.add(t2);
				} else if (t.get(t.size()-1) == 0 && t.size()-2 >= 0 && t.get(t.size()-1) == 0) {
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
