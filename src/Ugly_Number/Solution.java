package Ugly_Number;

public class Solution {
	/**308ms
	 * @param num
	 * @return
	 */
	public boolean isUgly(int num) {
		if (num < 1) {
			return false;
		} else if (num == 1) {
			return true;
		} else {
			int factor = -1; 
			while (num > 1) {
				factor = -1; 
				if (num%2 == 0) {
					factor = 2;
				}
				if (num%3 == 0) {
					factor = 3;
				}
				if (num%5 == 0) {
					factor = 5;
				}
				if (factor > 0) {
					num /= factor;
				} else {
					return false;
				}
			}
			return true;
		}
	}
}
