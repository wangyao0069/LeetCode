package Excel_Sheet_Column_Title;

public class Solution {

	/**
	 * 248ms 14.41%
	 * 
	 * @param n
	 * @return
	 */
	public String convertToTitle(int n) {
		StringBuffer ret = new StringBuffer("");
		if (n > 0) {
			// if (--n == 0) {
			// ret.append("A");
			// }
			while (n > 0) {
				int mod = n % 26;
				if (mod == 0) {
					ret.insert(0, 'Z');
					n /= 26;
					n--;
				} else {
					ret.insert(0, (char) ('A' - 1 + mod));
					n /= 26;
				}
			}
		}

		return ret.toString();
	}
}
