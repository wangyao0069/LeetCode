package Pascal_Triangle_II;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	/**
	 * 256ms 29.9%
	 * 
	 * @param rowIndex
	 * @return
	 */
	public List<Integer> getRow(int rowIndex) {
		List<Integer> L1 = new ArrayList<Integer>();
		List<Integer> L2 = new ArrayList<Integer>();
		rowIndex++;
		if (rowIndex == 0) {
			;
		} else {
			L1.add(1);

			for (int i = 1; i < rowIndex; i++) {
				L2.add(1);
				for (int j = 1; j < L1.size(); j++) {
					L2.add(L1.get(j - 1) + L1.get(j));
				}
				L2.add(1);

				List<Integer> t = L1;
				L1 = L2;
				L2 = t;
				L2.clear();
			}
		}

		return L1;
	}
}
