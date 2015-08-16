package Regular_Expression_Matching;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Regular_Expression_Matching.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}
	
	@Test
	public void test1() {
		boolean ret = solution.isMatch("", "");
		Assert.assertEquals(true, ret);
	}
	@Test
	public void test2() {
		boolean ret = solution.isMatch("", "*");
		Assert.assertEquals(true, ret);
	}
	@Test
	public void test3() {
		boolean ret = solution.isMatch("", "*.");
		Assert.assertEquals(false, ret);
	}
	@Test
	public void test4() {
		boolean ret = solution.isMatch("aa", "a");
		Assert.assertEquals(false, ret);
	}
	@Test
	public void test5() {
		boolean ret = solution.isMatch("aa", "aa");
		Assert.assertEquals(true, ret);
	}
	@Test
	public void test6() {
		boolean ret = solution.isMatch("aaa", "a");
		Assert.assertEquals(false, ret);
	}
	@Test
	public void test7() {
		boolean ret = solution.isMatch("aa", "a*");
		Assert.assertEquals(true, ret);
	}
	@Test
	public void test8() {
		boolean ret = solution.isMatch("aa", ".*");
		Assert.assertEquals(true, ret);
	}
	@Test
	public void test9() {
		boolean ret = solution.isMatch("ab", ".*");
		Assert.assertEquals(true, ret);
	}
	@Test
	public void test10() {
		boolean ret = solution.isMatch("aab", "c*a*b");
		Assert.assertEquals(true, ret);
	}
	@Test
	public void test11() {
		boolean ret = solution.isMatch("aab", "acbaaab");
		Assert.assertEquals(true, ret);
	}
	@Test
	public void test12() {
		boolean ret = solution.isMatch("abcd", "d*");
		Assert.assertEquals(true, ret);
	}
}
