package Happy_Number;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
	public boolean isHappy(int n) {
		if (n <= 0) {
			return false;
		}
		if (n == 1) {
			return true;
		}
		Set<Integer> cache = new HashSet<Integer>();
		cache.add(n);
		List<Integer> list = new ArrayList<Integer>();
		while (true) {
			list.clear();
			while (n > 0) {
				list.add(n%10);
				n /= 10;
			}
			for (int j = 0; j < list.size(); j++) {
				n += list.get(j)*list.get(j);
			}
			if (cache.contains(n)) {
				return false;
			} else {
				cache.add(n);
			}
			if (n == 1) {
				return true;
			}
		}
	}
}
