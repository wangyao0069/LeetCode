package Isomorphic_Strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Isomorphic_Strings.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test1() {
		boolean ret = solution.isIsomorphic("egg", "add");
		Assert.assertEquals(true, ret);
	}
	@Test
	public void test2() {
		boolean ret = solution.isIsomorphic("", "");
		Assert.assertEquals(true, ret);
	}
	@Test
	public void test3() {
		boolean ret = solution.isIsomorphic("foo", "bar");
		Assert.assertEquals(false, ret);
	}
	@Test
	public void test4() {
		boolean ret = solution.isIsomorphic("paper", "title");
		Assert.assertEquals(true, ret);
	}
	@Test
	public void test5() {
		boolean ret = solution.isIsomorphic("paper", "title");
		Assert.assertEquals(true, ret);
	}
	@Test
	public void test6() {
		boolean ret = solution.isIsomorphic("aba", "abb");
		Assert.assertEquals(false, ret);
	}
}
