package Regular_Expression_Matching;

public class Solution {
	
	
	public boolean isMatch(String s, String p) {

		if (s.length() == 0) {
			for (int i = 0; i < p.length(); i++) {
				if (p.charAt(i) != '*') {
					return false;
				}
			}
			return true;
		}
		
		if (s.length() != 0 && p.length() == 0) {
			return false;
		}

		int i = 0;
		int j = 0;
		while ( i < s.length() && j < p.length()) {
			if (p.charAt(j) == '*') {
				
				
				
				i++;
				continue;
			}
			if (p.charAt(j) == '.') {
				i++;
				j++;
				continue;
			}
			if (s.charAt(i) == p.charAt(j)) {
				i++;
				j++;
			} else {
				return false;
			}
		}
		
		if (i == s.length()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isMatch_bak(String s, String p) {

		if (s.length() == 0) {
			for (int i = 0; i < p.length(); i++) {
				if (p.charAt(i) != '*') {
					return false;
				}
			}
			return true;
		}
		
		if (s.length() != 0 && p.length() == 0) {
			return false;
		}

		int i = 0;
		int j = 0;
		int index = j;
		while ( i < s.length() && j < p.length()) {
			if (p.charAt(j) == '*') {
				if (i == 0) {
					index = j;
				}
				i++;
				continue;
			}
			if (p.charAt(j) == '.') {
				if (i == 0) {
					index = j;
				}
				i++;
				j++;
				continue;
			}
			if (s.charAt(i) == p.charAt(j)) {
				if (i == 0) {
					index = j;
				}
				i++;
				j++;
			} else {
				i = 0;
				index++;
				j = index;
			}
		}
		
		if (i == s.length()) {
			return true;
		} else {
			return false;
		}
	}
}