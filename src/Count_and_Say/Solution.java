package Count_and_Say;

public class Solution {
	/**
	 * 252ms
	 * 
	 * @param n
	 * @return
	 */
	public String countAndSay(int n) {
		StringBuffer sbBuffer = new StringBuffer("1");
		if (n == 1) {
			return sbBuffer.toString();
		}

		int ret = 1;
		StringBuffer retStringBuffer = new StringBuffer();
		while (true) {
			for (int i = 0; i < sbBuffer.length();) {
				char t = sbBuffer.charAt(i);
				int k = 0;
				while (i + k < sbBuffer.length() && sbBuffer.charAt(i + k) == t) {
					k++;
				}
				i = i + k;
				retStringBuffer.append(String.valueOf(k));
				retStringBuffer.append(t);
			}

			ret++;
			if (ret == n) {
				return retStringBuffer.toString();
			}
			sbBuffer.setLength(0);
			sbBuffer.append(retStringBuffer);
			retStringBuffer.setLength(0);
		}
	}
}
