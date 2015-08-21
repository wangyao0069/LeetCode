package Isomorphic_Strings;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	/**
	 * 368ms
	 * 
	 * @param s
	 * @param t
	 * @return
	 */
	public boolean isIsomorphic(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}

		Map<Integer, Integer> smap = new HashMap<Integer, Integer>();
		Map<Integer, Integer> tmap = new HashMap<Integer, Integer>();
		for (int i = 0; i < s.length(); i++) {
			Integer sitem = (int) s.charAt(i);
			Integer titem = (int) t.charAt(i);
			if (smap.containsKey(sitem)) {

			} else {
				smap.put(sitem, smap.size());
			}
			if (tmap.containsKey(titem)) {

			} else {
				tmap.put(titem, tmap.size());
			}
			int snum = smap.get(sitem);
			int tnum = tmap.get(titem);
			if (snum != tnum) {
				return false;
			}
		}

		return true;

	}
}
