package Implement_strStr;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Implement_strStr.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void testStrStr1() {
		int ret = solution.strStr("ab", "a");
		Assert.assertEquals(0, ret);
	}
	@Test
	public void testStrStr2() {
		int ret = solution.strStr("a", "a");
		Assert.assertEquals(0, ret);
	}
	@Test
	public void testStrStr3() {
		int ret = solution.strStr("a", "ab");
		Assert.assertEquals(-1, ret);
	}
	@Test
	public void testStrStr4() {
		int ret = solution.strStr("abcd", "rg");
		Assert.assertEquals(-1, ret);
	}
	@Test
	public void testStrStr5() {
		int ret = solution.strStr("abcd", "bcd");
		Assert.assertEquals(1, ret);
	}
	@Test
	public void testStrStr6() {
		int ret = solution.strStr("abcd", "abc");
		Assert.assertEquals(0, ret);
	}
}
