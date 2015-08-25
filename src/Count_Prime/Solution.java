package Count_Prime;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	/**320ms
	 * 标记删除
	 * @param n
	 * @return
	 */
	public int countPrimes(int n) {
		boolean[] isPrime = new boolean[n];
		for (int i = 2; i < n; i++) {
			isPrime[i] = true;
		}
		// Loop's ending condition is i * i < n instead of i < sqrt(n)
		// to avoid repeatedly calling an expensive function sqrt().
		for (int i = 2; i * i < n; i++) {
			if (!isPrime[i])
				continue;
			for (int j = i * i; j < n; j += i) {
				isPrime[j] = false;
			}
		}
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (isPrime[i])
				count++;
		}
		return count;
	}

	/**
	 * 
	 * 
	 * @param n
	 * @return
	 */
	public int countPrimes_v1(int n) {
		int ret = 0;
		List<Integer> primes = new ArrayList<Integer>();

		for (int i = 2; i < n; i++) {

			if (isPrime(i, primes)) {
				primes.add(i);
				ret++;
			}
		}

		return ret;
	}

	private boolean isPrime(int num, List<Integer> primes) {
		boolean ret = true;
		for (int i = 0; i < primes.size() && i < Math.sqrt(1.0 * num); i++) {
			if (num % primes.get(i) == 0) {
				return false;
			}
		}

		return ret;
	}
}
