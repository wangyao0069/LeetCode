package Longest_Palindromic_Substring;

public class Solution {

	private int max_index;
	private int max_length;

	/**
	 * 308ms
	 * @param s
	 * @return
	 */
	public String longestPalindrome(String s) {

		if (s.length() == 0) {
			return s;
		}
		
		int[] p = new int[s.length()*2+1];
		p[0] = 1;

		//eliminate difference between odd and even
		StringBuffer ret = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			ret.append("#" + s.charAt(i));
		}
		ret.append("#");
		int mx = 0;
		int id = 0;
		for (int i = 1; i < ret.length(); i++) {
			
			if (mx > i) {
				p[i] = min(p[2*id-i], mx-i);
 			} else {
				p[i] = 1;
			}
			//detect
			for (;i+p[i]<ret.length() && i-p[i] >=0 && ret.charAt(i+p[i]) == ret.charAt(i-p[i]); p[i]++)
				;
			if (i+p[i] > mx) {
				mx = i+p[i];
				id = i;
			}
		}
		
		int index = 0;
		int length = p[0];
		for(int i = 1; i < ret.length(); i++) {
			if (length < p[i]) {
				length = p[i];
				index = i;
			}
		}
		
		if (index%2 == 1) {
			return s.substring(index/2 - (length-1)/2, 
					index/2 + (length-1)/2 + 1);
		} else {
			return s.substring(index/2 - (length-1)/2, 
					index/2 + (length-1)/2);
		}
	}

	int min(int a, int b) {
		if (a < b) {
			return a;
		} else {
			return b;
		}
	}

	/**
	 * too slow
	 * 
	 * @param s
	 * @return
	 */
	public String longestPalindrome_bak(String s) {

		if (s.length() == 0) {
			return s;
		}

		max_index = 0;
		max_length = 0;
		// eliminate difference between odd and even
		StringBuffer ret = new StringBuffer("");
		for (int i = 0; i < s.length(); i++) {
			ret.append("#" + s.charAt(i));
		}
		ret.append("#");

		for (int i = 1; i < ret.length() - 1; i++) {
			Search_bak(i, ret);
		}
		if (max_index % 2 == 1) {
			max_length--;
			return s.substring(max_index / 2 - (max_length / 4), max_index / 2
					+ (max_length / 4) + 1);
		} else {
			return s.substring(max_index / 2 - (max_length / 4), max_index / 2
					+ (max_length / 4));
		}
	}

	private void Search_bak(int index, StringBuffer s) {
		int length = 0;
		if (index % 2 == 1) {
			length = 1;
		}
		for (int f = index - 1, b = index + 1; f >= 0 && b < s.length(); f--, b++) {
			if (s.charAt(f) == s.charAt(b)) {
				length += 2;
			}
		}

		if (length > max_length) {
			max_index = index;
			max_length = length;
		}
	}
}
