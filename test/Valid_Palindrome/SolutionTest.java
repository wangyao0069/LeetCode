package Valid_Palindrome;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Valid_Palindrome.Solution;
import Util.*;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test1() {
		boolean ret = solution.isPalindrome("");
		Assert.assertEquals(true, ret);
	}
	@Test
	public void test2() {
		boolean ret = solution.isPalindrome("A man, a plan, a canal: Panama");
		Assert.assertEquals(true, ret);
	}
	@Test
	public void test3() {
		boolean ret = solution.isPalindrome("race a car");
		Assert.assertEquals(false, ret);
	}
	@Test
	public void test4() {
		boolean ret = solution.isPalindrome("avc1,.;23 321;'[]cv a");
		Assert.assertEquals(true, ret);
	}
	@Test
	public void test5() {
		boolean ret = solution.isPalindrome(" ");
		Assert.assertEquals(true, ret);
	}

}
