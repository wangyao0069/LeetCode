package Count_Prime;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Count_Prime.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test1() {
		int ret = solution.countPrimes(0);
		Assert.assertEquals(0, ret);
	}
	@Test
	public void test2() {
		int ret = solution.countPrimes(1);
		Assert.assertEquals(0, ret);
	}
	@Test
	public void test3() {
		int ret = solution.countPrimes(2);
		Assert.assertEquals(0, ret);
	}
	@Test
	public void test4() {
		int ret = solution.countPrimes(3);
		Assert.assertEquals(1, ret);
	}
	@Test
	public void test5() {
		int ret = solution.countPrimes(4);
		Assert.assertEquals(2, ret);
	}
	@Test
	public void test6() {
		int ret = solution.countPrimes(5);
		Assert.assertEquals(2, ret);
	}
	@Test
	public void test7() {
		int ret = solution.countPrimes(18);
		Assert.assertEquals(7, ret);
	}
	@Test
	public void test8() {
		int ret = solution.countPrimes(100);
		Assert.assertEquals(25, ret);
	}
	@Test
	public void test9() {
		int ret = solution.countPrimes(1500000);
		Assert.assertEquals(114155, ret);
	}

}
