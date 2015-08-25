package Valid_Palindrome;

public class Solution {
	/**
	 * 396ms beats 54.18%
	 * 
	 * @param s
	 * @return
	 */
	public boolean isPalindrome(String s) {

		boolean ret = true;
		s = s.toLowerCase();
		for (int i = 0, j = s.length() - 1; i <= j;) {
			while (i < s.length()
					&& !('a' <= s.charAt(i) && s.charAt(i) <= 'z' || '0' <= s
							.charAt(i) && s.charAt(i) <= '9')) {
				i++;
			}
			while (j >= 0
					&& !('a' <= s.charAt(j) && s.charAt(j) <= 'z' || '0' <= s
							.charAt(j) && s.charAt(j) <= '9')) {
				j--;
			}
			if (i < s.length() && j >= 0) {
				if (s.charAt(i) == s.charAt(j)) {
					i++;
					j--;
				} else {
					return false;
				}
			}
		}

		return ret;

	}
}
