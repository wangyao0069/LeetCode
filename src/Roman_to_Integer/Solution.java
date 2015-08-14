package Roman_to_Integer;

public class Solution {

	/**432ms
	 * @param s
	 * @return
	 */
	public int romanToInt(String s) {
        int ret = 0;
        
        for (int i = 0; i < s.length();) {
			if (s.charAt(i) == 'M') {
				ret += 1000;
				i++;
			} else
			if (s.charAt(i) == 'C') {
				if (i+2 <=s.length() && s.charAt(i+1) == 'M') {
					ret += 900;
					i = i+2;
				} else if (i+2 <=s.length() && s.charAt(i+1) == 'D') {	
					ret += 400;
					i = i+2;
				} else {
					ret += 100;
					i++;
				}
			} else
			if (s.charAt(i) == 'D') {
				ret += 500;
				i++;
			} else
			if (s.charAt(i) == 'X') {
				if (i+2 <=s.length() && s.charAt(i+1) == 'C') {
					ret += 90;
					i = i+2;
				} else if (i+2 <=s.length() && s.charAt(i+1) == 'L') {	
					ret += 40;
					i = i+2;
				} else {
					ret += 10;
					i++;
				}
			} else if (s.charAt(i) == 'L') {
				ret += 50;
				i++;
			} else
			if (s.charAt(i) == 'V') {
				ret += 5;
				i++;
			} else
			if (s.charAt(i) == 'I') {
				if (i+2 <=s.length() && s.charAt(i+1) == 'X') {
					ret += 9;
					i = i+2;
				} else if (i+2 <=s.length() && s.charAt(i+1) == 'V') {	
					ret += 4;
					i = i+2;
				} else {
					ret += 1;
					i++;
				}
			}
		}
        
        return ret;
    }
}
