package Ugly_Number_II;

import java.util.PriorityQueue;

public class Solution {

	/**
	 * 304ms
	 * 
	 * @param n
	 * @return
	 */
	public int nthUglyNumber(int n) {
		int[] ugly = new int[n];
		ugly[0] = 1;
		int index2 = 0, index3 = 0, index5 = 0;
		int factor2 = 2, factor3 = 3, factor5 = 5;
		for (int i = 1; i < n; i++) {
			int min = Math.min(Math.min(factor2, factor3), factor5);
			ugly[i] = min;
			if (factor2 == min)
				factor2 = 2 * ugly[++index2];
			if (factor3 == min)
				factor3 = 3 * ugly[++index3];
			if (factor5 == min)
				factor5 = 5 * ugly[++index5];
		}
		return ugly[n - 1];
	}

	/**
	 * 488ms
	 * 
	 * @param n
	 * @return
	 */
	public int nthUglyNumber_v2(int n) {

		PriorityQueue<Long> q = new PriorityQueue<Long>();
		q.offer(1L);
		int i = 0;
		long prev = 0;
		while (i++ < n) {
			long val = q.poll();
			while (val == prev) {
				val = q.poll();
			}
			prev = val;
			for (long ugly : new long[] { val * 2, val * 3, val * 5 }) {
				q.offer(ugly);
			}
		}
		return (int) prev;
	}

	/**
	 * 笨办法
	 * 
	 * @param n
	 * @return
	 */
	public int nthUglyNumber_v1(int n) {

		if (n == 1) {
			return 1;
		}
		int num = 1;
		int ret = 0;
		for (int i = 2; i <= Integer.MAX_VALUE; i++) {
			if (isUgly(i)) {
				num++;
				if (num == n) {
					ret = i;
					break;
				}
			}
		}

		return ret;
	}

	private boolean isUgly(int num) {
		if (num < 1) {
			return false;
		} else if (num == 1) {
			return true;
		} else {
			int factor = -1;
			while (num > 1) {
				factor = -1;
				if (num % 2 == 0) {
					factor = 2;
				}
				if (num % 3 == 0) {
					factor = 3;
				}
				if (num % 5 == 0) {
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
