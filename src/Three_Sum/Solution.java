package Three_Sum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {

	public List<List<Integer>> threeSum(int[] nums) {

		List<List<Integer>> retList = new ArrayList<List<Integer>>();

		if (nums == null || nums.length < 3) {
			;// do nothing
		} else {
			
			// k=nums, v=repeat count
			Map<Integer, Integer> positiveMap = new HashMap<Integer, Integer>();
			Map<Integer, Integer> nagetiveMap = new HashMap<Integer, Integer>();
			int zero = 0;
			for (int i = 0; i < nums.length; i++) {
				int num = nums[i];
				if (num > 0) {
					if (positiveMap.containsKey(num)) {
						int t = positiveMap.get(num);
						positiveMap.put(num, ++t);
					} else {
						positiveMap.put(num, 1);
					}
				} else if (num < 0) {
					if (nagetiveMap.containsKey(num)) {
						int t = nagetiveMap.get(num);
						nagetiveMap.put(num, ++t);
					} else {
						nagetiveMap.put(num, 1);
					}
				} else {
					zero++;
				}
			}

			for (Map.Entry<Integer, Integer> entry : positiveMap.entrySet()) {
				int target = entry.getKey();
				//1 positive 2 nagetive
				for (Map.Entry<Integer, Integer> entryN : nagetiveMap.entrySet()) {
					int b = -1*target - entryN.getKey();
					int half = -1*target/2;
					if (nagetiveMap.containsKey(b) && b >= half) {
						if (b == entryN.getKey()) {//2 same nagetive
							if (nagetiveMap.get(b) > 1) {
								retList.add(sort(target, entryN.getKey(), b));
							}
						} else {
							retList.add(sort(target, entryN.getKey(), b));
						}
						
					}
				}
			}			
			
			for (Map.Entry<Integer, Integer> entryN : nagetiveMap.entrySet()) {
				int target = entryN.getKey();
				//2 positive 1 nagetive
				for (Map.Entry<Integer, Integer> entry : positiveMap.entrySet()) {
					int b = -1*target - entry.getKey();
					int half = (-1*target/2);
					if (positiveMap.containsKey(b) && b <= half) {
						if (b == entry.getKey()) {//2 same positive
							if (positiveMap.get(b) > 1) {
								retList.add(sort(target, b, b));
							}
						}else {
							retList.add(sort(target, entry.getKey(), b));
						}
					}
				}
			}
			
			if (zero > 0) {//1 zero
				for (Map.Entry<Integer, Integer> entry : positiveMap.entrySet()) {
					int target = entry.getKey();
					if (nagetiveMap.containsKey(-1*target)) {
						retList.add(sort(target, 0, -1*target));
					}
				}		
			}
			//contain three or more zeros 
			if (zero >= 3) {
				retList.add(sort(0, 0, 0));
			}
		}

		return retList;
	}
	
	List<Integer> sort(int a, int b, int c) {
		List<Integer> retIntegers = new ArrayList<Integer>();
		int t = 0;
		if (a < b) {
			t = a;
			a = b;
			b = t;
		}
		if (a < c) {
			t = a;
			a = c;
			c = t;
		}
		if (b < c) {
			t = b;
			b = c;
			c = t;
		}
		retIntegers.add(c);
		retIntegers.add(b);
		retIntegers.add(a);
		
		return retIntegers;
	}
}
