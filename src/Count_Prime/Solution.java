package Count_Prime;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	/**
	 * 368ms
	 * 
	 * @param n
	 * @return
	 */
	public int countPrimes(int n) {
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
