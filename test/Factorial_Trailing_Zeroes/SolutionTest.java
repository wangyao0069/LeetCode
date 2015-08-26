package Factorial_Trailing_Zeroes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Factorial_Trailing_Zeroes.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test1() {
		int ret = solution.trailingZeroes(0);
		Assert.assertEquals(0, ret);
	}
	@Test
	public void test2() {
		int ret = solution.trailingZeroes(3);
		Assert.assertEquals(0, ret);
	}
	@Test
	public void test3() {
		int ret = solution.trailingZeroes(5);
		Assert.assertEquals(1, ret);
	}
	@Test
	public void test4() {
		int ret = solution.trailingZeroes(10);
		Assert.assertEquals(2, ret);
	}
	@Test
	public void test5() {
		int ret = solution.trailingZeroes(25);
		Assert.assertEquals(6, ret);
	}
}
