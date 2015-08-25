package Compare_Version_Numbers;

public class Solution {
	/**
	 * 280ms 59.45%
	 * 
	 * @param version1
	 * @param version2
	 * @return
	 */
	public int compareVersion(String version1, String version2) {

		String[] ver1 = version1.split("\\.");
		String[] ver2 = version2.split("\\.");
		int i = 0;
		for (; i < ver1.length && i < ver2.length; i++) {
			int v1 = Integer.parseInt(ver1[i]);
			int v2 = Integer.parseInt(ver2[i]);
			if (v1 > v2) {
				return 1;
			} else if (v1 < v2) {
				return -1;
			}
		}
		while (i < ver1.length) {
			int v1 = Integer.parseInt(ver1[i]);
			if (v1 > 0) {
				return 1;
			}
			i++;
		}
		while (i < ver2.length) {
			int v2 = Integer.parseInt(ver2[i]);
			if (v2 > 0) {
				return -1;
			}
			i++;
		}

		return 0;
	}
}
