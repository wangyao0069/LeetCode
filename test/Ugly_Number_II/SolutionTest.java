package Ugly_Number_II;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Ugly_Number_II.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test1() {
		int ret = solution.nthUglyNumber(1);
		Assert.assertEquals(1, ret);
	}
	@Test
	public void test2() {
		int ret = solution.nthUglyNumber(2);
		Assert.assertEquals(2, ret);
	}
	@Test
	public void test3() {
		int ret = solution.nthUglyNumber(3);
		Assert.assertEquals(3, ret);
	}
	@Test
	public void test4() {
		int ret = solution.nthUglyNumber(4);
		Assert.assertEquals(4, ret);
	}
	@Test
	public void test5() {
		int ret = solution.nthUglyNumber(5);
		Assert.assertEquals(5, ret);
	}
	@Test
	public void test6() {
		int ret = solution.nthUglyNumber(6);
		Assert.assertEquals(6, ret);
	}
	@Test
	public void test7() {
		int ret = solution.nthUglyNumber(7);
		Assert.assertEquals(8, ret);
	}
}
