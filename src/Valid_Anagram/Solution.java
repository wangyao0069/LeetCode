package Valid_Anagram;

import java.util.Arrays;


public class Solution {
	
	public boolean isAnagram (String s, String t) {
		
		if (s.length() == 0 && t.length() == 0) {
			return true;
		}
		
		if (s.length() == t.length()) {

			char[] sChars = s.toCharArray();
			char[] tChars = t.toCharArray();

			Arrays.sort(sChars);
			Arrays.sort(tChars);

			s = new String(sChars);
			t = new String(tChars);

			return s.equals(t);
		} else {
			return false;
		}
	}
	
	public boolean isAnagram_v1 (String s, String t) {
		
		if (s.length() == 0 && t.length() == 0) {
			return true;
		}
		
		if (s.length() == t.length() ) {
			
			int[] map1 = new int[26];
			int[] map2 = new int[26];
			
			for (int i = 0; i < s.length(); i++) {
				map1[s.charAt(i)-'a']++;
			}
			for (int i = 0; i < t.length(); i++) {
				map2[t.charAt(i)-'a']++;
			}
			for (int i = 0; i < 26; i++) {
				if (map1[i] != map2[i]) {
					return false;
				}
			}
			
			return true;
		} else {
			return false;
		}
	}
}
