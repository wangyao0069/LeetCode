package Divide_Two_Integers;

import java.util.Stack;

public class Solution {

	public int divide(int dividend, int divisor) {
		int symbol1 = 1;
		int symbol2 = 1;

		if (dividend < 0) {
			if (dividend == Integer.MIN_VALUE) {
				if (divisor == 1) {
					return dividend;
				}
				if (divisor == -1) {
					return Integer.MAX_VALUE;
				}
			} else {
				dividend = -dividend;
			}

			symbol1 = -1;
		}
		if (divisor < 0) {
			if (divisor == Integer.MIN_VALUE) {
				if (Integer.MIN_VALUE == dividend) {
					return 1;
				} else {
					return 0;
				}
			} else {
				divisor = -divisor;
			}
			symbol2 = -1;
		}

		long dend = 0;
		int ret = 0;
		int s = Integer.MIN_VALUE;
		while (dividend > 0 || dividend == Integer.MIN_VALUE) {
			while ((dividend > 0 || dividend == Integer.MIN_VALUE)
					&& dend < divisor) {
				dend = dend << 1;
				ret = ret << 1;
				dend += (s & dividend)==0?0:1;
				s = s >>> 1;
			}

			if (dend >= divisor) {
				dend -= divisor;
				ret += 1;
			}
		}

		if (symbol1 == 1 && symbol2 == 1 || symbol1 == -1 && symbol2 == -1) {
			return ret;
		} else {
			return -ret;
		}
	}

	/**
	 * 316ms
	 * 
	 * @param dividend
	 * @param divisor
	 * @return
	 */
	public int divide_v2(int dividend, int divisor) {
		int symbol1 = 1;
		int symbol2 = 1;

		if (dividend < 0) {
			if (dividend == Integer.MIN_VALUE) {
				if (divisor == 1) {
					return dividend;
				}
				if (divisor == -1) {
					return Integer.MAX_VALUE;
				}
			} else {
				dividend = -dividend;
			}

			symbol1 = -1;
		}
		if (divisor < 0) {
			if (divisor == Integer.MIN_VALUE) {
				if (Integer.MIN_VALUE == dividend) {
					return 1;
				} else {
					return 0;
				}
			} else {
				divisor = -divisor;
			}
			symbol2 = -1;
		}
		// if (divisor == 0 && symbol1 == 1) {
		// return Integer.MAX_VALUE;
		// } else if (divisor == 0 && symbol1 == -1) {
		// return Integer.MIN_VALUE;
		// }
		Stack<Integer> dividendStack = new Stack<Integer>();
		int x = 1;
		for (int i = 0; i < 32; i++) {
			dividendStack.push((x & dividend) == 0 ? 0 : 1);
			x = x << 1;
		}
		while (!dividendStack.empty() && dividendStack.peek() == 0) {
			dividendStack.pop();
		}
		long dend = 0;
		int ret = 0;
		while (!dividendStack.empty()) {
			while (!dividendStack.empty() && dend < divisor) {
				dend = dend << 1;
				ret = ret << 1;
				dend += dividendStack.pop();
			}

			if (dend >= divisor) {
				dend -= divisor;
				ret += 1;
			}
		}

		if (symbol1 == 1 && symbol2 == 1 || symbol1 == -1 && symbol2 == -1) {
			return ret;
		} else {
			return -ret;
		}
	}

	/**
	 * slow
	 * 
	 * @param dividend
	 * @param divisor
	 * @return
	 */
	public int divide_v1(int dividend, int divisor) {
		int symbol1 = 1;
		int symbol2 = 1;
		if (dividend < 0) {
			dividend = -dividend;
			symbol1 = -1;
		}
		if (divisor < 0) {
			divisor = -divisor;
			symbol2 = -1;
		}

		if (divisor == 0 && symbol1 == 1) {
			return Integer.MAX_VALUE;
		} else if (divisor == 0 && symbol1 == -1) {
			return Integer.MIN_VALUE;
		}
		int i = 0;

		while (dividend >= 0) {
			dividend = dividend - divisor;
			i++;
		}
		if (symbol1 == 1 && symbol2 == 1 || symbol1 == -1 && symbol2 == -1) {
			return (i - 1);
		} else {
			return -(i - 1);
		}

	}
}
