package Find_the_Difference;

public class Solution {

	public char findTheDifference(String s, String t) {
		int[] a = new int[26];
		int[] b = new int[26];

		for (int i = 0; i < s.length(); i++) {
			int tmp = s.charAt(i) - 'a';
			a[tmp]++;
		}

		for (int i = 0; i < t.length(); i++) {
			int tmp = t.charAt(i) - 'a';
			b[tmp]++;
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return (char) ('a' + i);
			}
		}

		return t.charAt(0);
	}
}
