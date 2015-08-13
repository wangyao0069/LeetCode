package Reverse_Integer;

public class Solution {

	/**
	 * 360ms takes more time than other solutions but it's easy to understand
	 * 
	 * @param x
	 * @return
	 */
	public int reverse(int x) {
		int ret = 0;
		StringBuffer sbBuffer = new StringBuffer();
		if (x < 0) {
			sbBuffer.append("-");
			x = -x;
		}
		String xString = Integer.toString(x);
		for (int i = xString.length() - 1; i >= 0; i--) {
			sbBuffer.append(xString.charAt(i));
		}

		try {
			ret = Integer.valueOf(sbBuffer.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return ret;
	}

	/**
	 * 256ms
	 * 
	 * @param x
	 * @return
	 */
	public int reverse_v2(int x) {
		long ret = 0;
		int sysbol = 1;
		if (x < 0) {
			sysbol = -1;
			x = -x;
		}

		if (x == 0) {
			return 0;
		}

		while (x > 0) {
			ret = ret * 10 + x % 10;
			if (ret > Integer.MAX_VALUE) {
				return 0;
			}
			x = x / 10;
		}

		return (int) ret * sysbol;
	}
}
