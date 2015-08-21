package Climbing_Stairs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Climbing_Stairs.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}
	
	@Test
	public void test1() {
		int ret = solution.climbStairs(1);
		Assert.assertEquals(1, ret);
	}
	@Test
	public void test2() {
		int ret = solution.climbStairs(2);
		Assert.assertEquals(2, ret);
	}
	@Test
	public void test3() {
		int ret = solution.climbStairs(3);
		Assert.assertEquals(3, ret);
	}
	@Test
	public void test4() {
		int ret = solution.climbStairs(4);
		Assert.assertEquals(5, ret);
	}
	@Test
	public void test5() {
		int ret = solution.climbStairs(5);
		Assert.assertEquals(8, ret);
	}
	@Test
	public void test6() {
		int ret = solution.climbStairs(6);
		Assert.assertEquals(13, ret);
	}
	@Test
	public void test7() {
		int ret = solution.climbStairs(35);
		Assert.assertEquals(14930352, ret);
	}

}
