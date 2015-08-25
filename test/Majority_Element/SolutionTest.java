package Majority_Element;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Majority_Element.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test1() {
		int ret = solution.majorityElement(new int[]{1});
		Assert.assertEquals(1, ret);
	}
	@Test
	public void test2() {
		int ret = solution.majorityElement(new int[]{1,1,1,2,3});
		Assert.assertEquals(1, ret);
	}
	@Test
	public void test3() {
		int ret = solution.majorityElement(new int[]{1,1,1,1,2,3});
		Assert.assertEquals(1, ret);
	}
	@Test
	public void test4() {
		int ret = solution.majorityElement(new int[]{1});
		Assert.assertEquals(1, ret);
	}
	@Test
	public void test5() {
		int ret = solution.majorityElement(new int[]{3,2,3});
		Assert.assertEquals(3, ret);
	}

}
