package Ugly_Number;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Ugly_Number.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test1() {
		boolean ret = solution.isUgly(-1);
		Assert.assertEquals(false, ret);
	}
	@Test
	public void test2() {
		boolean ret = solution.isUgly(0);
		Assert.assertEquals(false, ret);
	}
	@Test
	public void test3() {
		boolean ret = solution.isUgly(1);
		Assert.assertEquals(true, ret);
	}
	@Test
	public void test4() {
		boolean ret = solution.isUgly(2);
		Assert.assertEquals(true, ret);
	}
	@Test
	public void test5() {
		boolean ret = solution.isUgly(14);
		Assert.assertEquals(false, ret);
	}
	@Test
	public void test6() {
		boolean ret = solution.isUgly(81);
		Assert.assertEquals(true, ret);
	}
	@Test
	public void test7() {
		boolean ret = solution.isUgly(100);
		Assert.assertEquals(true, ret);
	}
	@Test
	public void test8() {
		boolean ret = solution.isUgly(101);
		Assert.assertEquals(false, ret);
	}
	@Test
	public void test9() {
		boolean ret = solution.isUgly(8);
		Assert.assertEquals(true, ret);
	}

}
