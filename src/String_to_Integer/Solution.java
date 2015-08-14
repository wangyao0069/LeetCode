package String_to_Integer;

public class Solution {
	/**424ms
	 * @param str
	 * @return
	 */
	public int myAtoi(String str) {
		long ret = 0;
		int sysbol = 1;
		str = str.trim();
		if ( str.length() == 0) {
			return 0;
		}
		
		if (str.charAt(0) == '-') {
			sysbol = -1;
			str = str.substring(1);
		} else if (str.charAt(0) == '+') {
			str = str.substring(1);
		}

		for (int i = 0; i < str.length(); i++) {
			char t = str.charAt(i);
			if ('0' <= t && t <= '9') {
				ret = ret*10 + (t-'0');
			} else {
				break;
			}
			if (ret > (long)Integer.MAX_VALUE+1) {
				break;
			}
		}
		ret *= sysbol;
		if (ret > (long)Integer.MAX_VALUE) {
			ret = Integer.MAX_VALUE;
		}
		if (ret < (long)Integer.MIN_VALUE) {
			ret = Integer.MIN_VALUE;
		}
		
		return (int)ret;
	}
}
