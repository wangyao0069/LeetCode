package Palindrome_Number;

public class Solution {

	/**
	 * 492ms
	 * @param x
	 * @return
	 */
	public boolean isPalindrome(int x) {
		boolean is = false;
		
		if (x < 0) {
			return false;
		}
		
		if (x < 10) {
			return true;
		}
		int x_o = x;
		long x_r = 0;
		while (x > 0) {
			x_r = x_r*10 + x%10;
			
			x = x/10;
		}
		
		if (x_o == x_r) {
			return true;
		}
		
		
		return is;
	}
}
