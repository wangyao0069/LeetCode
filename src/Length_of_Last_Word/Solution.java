package Length_of_Last_Word;

public class Solution {
	/**300ms
	 * @param s
	 * @return
	 */
	public int lengthOfLastWord(String s) {
		int ret = 0;
		for (int i = s.length()-1; i >= 0; i--) {
			while (i >= 0 && ('a' <= s.charAt(i) && s.charAt(i) <= 'z' ||
					'A' <= s.charAt(i) && s.charAt(i) <= 'Z')) {
				ret++;
				i--;
			}
			if (ret > 0) {
				break;
			}
		}
		
		return ret;
	}
}
//'a' <= s.charAt(i) && s.charAt(i) <= 'z' ||
//		'A' <= s.charAt(i) && s.charAt(i) <= 'Z'