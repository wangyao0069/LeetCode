package Add_Binary;

public class Solution {
	/**
	 * 352ms
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public String addBinary(String a, String b) {
		StringBuffer aBuffer = new StringBuffer(a);
		StringBuffer bBuffer = new StringBuffer(b);
		StringBuffer ret = new StringBuffer();

		StringBuffer smallBuffer = null;
		if (a.length() < b.length()) {
			smallBuffer = aBuffer;
		} else {
			smallBuffer = bBuffer;
		}
		for (int i = 0; i < Math.abs(a.length() - b.length()); i++) {
			smallBuffer.insert(0, '0');
		}
		int sta = 0;
		for (int i = aBuffer.length() - 1; i >= 0; i--) {
			if (sta == 0) {
				if (aBuffer.charAt(i) == '1' && bBuffer.charAt(i) == '1') {
					ret.insert(0, '0');
					sta = 1;
				} else if (aBuffer.charAt(i) == '0' && bBuffer.charAt(i) == '0') {
					ret.insert(0, '0');
					sta = 0;
				} else {
					ret.insert(0, '1');
					sta = 0;
				}
			} else {
				if (aBuffer.charAt(i) == '1' && bBuffer.charAt(i) == '1') {
					ret.insert(0, '1');
					sta = 1;
				} else if (aBuffer.charAt(i) == '0' && bBuffer.charAt(i) == '0') {
					ret.insert(0, '1');
					sta = 0;
				} else {
					ret.insert(0, '0');
					sta = 1;
				}
			}
		}
		if (sta == 1) {
			ret.insert(0, '1');
		}

		return ret.toString();
	}
}
