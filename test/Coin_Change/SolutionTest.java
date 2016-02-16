package Coin_Change;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testCoinChange() {
		Solution solution = new Solution();
		int num = solution.coinChange(new int[]{1,2,5}, 10);
		assertEquals(2, num);
	}
	@Test
	public void testCoinChange1() {
		Solution solution = new Solution();
		int num = solution.coinChange(new int[]{1,2,5}, 11);
		assertEquals(3, num);
	}
	@Test
	public void testCoinChange2() {
		Solution solution = new Solution();
		int num = solution.coinChange(new int[]{2}, 3);
		assertEquals(-1, num);
	}
	@Test
	public void testCoinChange3() {
		Solution solution = new Solution();
		int num = solution.coinChange(new int[]{1,2,5}, 34);
		assertEquals(8, num);
	}
	@Test
	public void testCoinChange4() {
		Solution solution = new Solution();
		int num = solution.coinChange(new int[]{2,5}, 6);
		assertEquals(3, num);
	}
	@Test
	public void testCoinChange5() {
		Solution solution = new Solution();
		int num = solution.coinChange(new int[]{186,419,83,408}, 6249);
		assertEquals(20, num);
	}
}
