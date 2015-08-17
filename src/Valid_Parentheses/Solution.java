package Valid_Parentheses;

public class Solution {
	/**292ms
	 * @param s
	 * @return
	 */
	public boolean isValid(String s) {

		if (s == null || s.length() == 0) {
			return true;
		}
		char[] stack = new char[s.length()];
		int p = -1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				stack[++p] = s.charAt(i);
			}
			if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
				if (p < 0) {
					return false;
				}
				char t = stack[p--];
				if (s.charAt(i) == ')' && t == '(' || 
					s.charAt(i) == '}' && t == '{' || 
					s.charAt(i) == ']' && t == '[') {
					;
				} else {
					return false;
				}
			}
		}
		if (p < 0) {
			return true;
		} else {
			return false;
		}
	}
}
