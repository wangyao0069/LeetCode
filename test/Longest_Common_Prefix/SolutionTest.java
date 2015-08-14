package Longest_Common_Prefix;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Longest_Common_Prefix.Solution;

public class SolutionTest {

private Solution solution;
	
	@Before
	public void before() {
		solution = new Solution();
	}
	
	@Test
	public void testLongestCommonPrefix1() {
		String retString = solution.longestCommonPrefix(new String[]{"abtrtrecs","abjjvss","abj"});
	
		Assert.assertEquals("ab", retString);
	}
	
	@Test
	public void testLongestCommonPrefix2() {
		String retString = solution.longestCommonPrefix(new String[]{"a"});
	
		Assert.assertEquals("ab", retString);
	}
	
	@Test
	public void testLongestCommonPrefix3() {
		String retString = solution.longestCommonPrefix(new String[]{"aca","cba"});
	
		Assert.assertEquals("", retString);
	}

}
