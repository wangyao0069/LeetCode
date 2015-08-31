package Letter_Combinations_of_a_Phone_Number;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	/**
	 * 236ms 99.42%
	 * 
	 * @param digits
	 * @return
	 */
	public List<String> letterCombinations(String digits) {
		List<String> ret = new ArrayList<String>();
		List<String[]> map = new ArrayList<String[]>();
		// map.add(new char[]{" "});
		map.add(new String[] { "a", "b", "c" });
		map.add(new String[] { "d", "e", "f" });
		map.add(new String[] { "g", "h", "i" });
		map.add(new String[] { "j", "k", "l" });
		map.add(new String[] { "m", "n", "o" });
		map.add(new String[] { "p", "q", "r", "s" });
		map.add(new String[] { "t", "u", "v" });
		map.add(new String[] { "w", "x", "y", "z" });

		for (int i = 0; i < digits.length(); i++) {
			int num = digits.charAt(i) - '2';
			if (ret.size() == 0) {
				String[] s = map.get(num);
				for (int j = 0; j < s.length; j++) {
					ret.add(s[j]);
				}
			} else {
				int size = ret.size();
				for (int j = 0; j < size; j++) {
					String s = ret.get(j);

					String[] strs = map.get(num);
					for (int k = 0; k < strs.length; k++) {
						if (k == 0) {
							ret.remove(j);
							ret.add(j, s + strs[k]);
						} else {
							ret.add(s + strs[k]);
						}
					}
				}
			}
		}

		return ret;
	}
}
