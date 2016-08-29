package First_Unique_Character_in_a_String;

public class Solution {
	public int firstUniqChar(String s) {
		int[] a = new int[26];
		int[] b = new int[26];
		
		for (int i = 0; i < s.length(); i++) {
			int tmp = s.charAt(i) - 'a';
			a[tmp]++;
			b[tmp] = i;
		}
		for (int i = 0; i < s.length(); i++) {
			int tmp = s.charAt(i) - 'a';
			if (a[tmp] == 1) {
				return b[tmp];
			}
		}
		
		return -1;
	}
}
