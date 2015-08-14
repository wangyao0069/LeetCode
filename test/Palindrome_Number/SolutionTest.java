package Palindrome_Number;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Palindrome_Number.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void testIsPalindrome() {
		boolean ret = solution.isPalindrome(0);
		Assert.assertEquals(true, ret);
	}
	@Test
	public void testIsPalindrome1() {
		boolean ret = solution.isPalindrome(-1);
		Assert.assertEquals(false, ret);
	}
	@Test
	public void testIsPalindrome2() {
		boolean ret = solution.isPalindrome(121);
		Assert.assertEquals(true, ret);
	}
	@Test
	public void testIsPalindrome3() {
		boolean ret = solution.isPalindrome(1234567899);
		Assert.assertEquals(false, ret);
	}

}
