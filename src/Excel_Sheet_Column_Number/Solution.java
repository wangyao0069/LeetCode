package Excel_Sheet_Column_Number;

public class Solution {

	/**
	 * 344ms 62.44%
	 * 
	 * @param s
	 * @return
	 */
	public int titleToNumber(String s) {
		int ret = 0;
		for (int i = 0; i < s.length(); i++) {
			ret = 26 * ret + s.charAt(i) - ('A' - 1);
		}

		return ret;
	}
}
