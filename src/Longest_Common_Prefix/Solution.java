package Longest_Common_Prefix;

public class Solution {
	public String longestCommonPrefix(String[] strs) {

		if (strs == null || strs.length == 0) {
			return "";
		}
		if (strs.length == 1)
		    return strs[0];
		
		int length = 0;
		int str_min_length = Integer.MAX_VALUE;
		for (int i = 0; i < strs.length; i++) {
			if (str_min_length > strs[i].length()) {
				str_min_length = strs[i].length();
			}
		}
		boolean flag = false;
		for (int j = 0; j < str_min_length; j++) {
			for (int i = 1; i < strs.length; i++) {
				if (strs[0].charAt(j) == strs[i].charAt(j)) {
					if (i == strs.length-1) {
						length++;
					}
				} else {
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
		}
		
		return strs[0].substring(0,length);
	}
}
