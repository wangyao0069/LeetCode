package Climbing_Stairs;

public class Solution {
	/**
	 * 200ms
	 * 
	 * @param n
	 * @return
	 */
	public int climbStairs(int n) {
		int n2 = 1, n1 = 2, sum = 0;

		for (int i = 1; i <= n; i++) {
			if (i == 1)
				sum = 1;
			else if (i == 2)
				sum = 2;
			else {
				// for every other value of n, the number of steps is equal to
				// the number
				// of steps required to get to 2 steps previous and 1 step
				// previous. Therefore
				// we don't need to store any other numbers other than getting
				// to n-1 and n-2
				sum = n1 + n2;
				n2 = n1;
				n1 = sum;
			}
		}

		return sum;
	}
}
