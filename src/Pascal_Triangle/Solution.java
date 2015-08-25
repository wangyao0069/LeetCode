package Pascal_Triangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	/**
	 * 260ms 24.31%
	 * 
	 * @param numRows
	 * @return
	 */
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> ret = new ArrayList<List<Integer>>();
		if (numRows == 0) {
			;// return ret;
		} else {
			List<Integer> tmp = new ArrayList<Integer>();
			tmp.add(1);
			ret.add(tmp);
			for (int i = 1; i < numRows; i++) {
				List<Integer> cur = new ArrayList<Integer>();
				cur.add(1);
				List<Integer> pre = ret.get(i - 1);
				for (int j = 1; j < pre.size(); j++) {
					cur.add(pre.get(j - 1) + pre.get(j));
				}
				cur.add(1);
				ret.add(cur);
			}
		}

		return ret;
	}
}
