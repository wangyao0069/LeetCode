package Valid_Parentheses;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Valid_Parentheses.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();

	}

	@Test
	public void testIsValid1() {
		boolean ret = solution.isValid("");
		Assert.assertEquals(true, ret);
	}
	@Test
	public void testIsValid2() {
		boolean ret = solution.isValid(null);
		Assert.assertEquals(true, ret);
	}
	@Test
	public void testIsValid3() {
		boolean ret = solution.isValid("()");
		Assert.assertEquals(true, ret);
	}
	@Test
	public void testIsValid4() {
		boolean ret = solution.isValid("{}");
		Assert.assertEquals(true, ret);
	}
	@Test
	public void testIsValid5() {
		boolean ret = solution.isValid("[]");
		Assert.assertEquals(true, ret);
	}
	@Test
	public void testIsValid6() {
		boolean ret = solution.isValid("()[]{}");
		Assert.assertEquals(true, ret);
	}
	@Test
	public void testIsValid7() {
		boolean ret = solution.isValid("[()]{[()]}");
		Assert.assertEquals(true, ret);
	}
	@Test
	public void testIsValid8() {
		boolean ret = solution.isValid("(]");
		Assert.assertEquals(false, ret);
	}
	@Test
	public void testIsValid9() {
		boolean ret = solution.isValid("([)]");
		Assert.assertEquals(false, ret);
	}
	@Test
	public void testIsValid10() {
		boolean ret = solution.isValid(")]");
		Assert.assertEquals(false, ret);
	}
	@Test
	public void testIsValid11() {
		boolean ret = solution.isValid("(");
		Assert.assertEquals(false, ret);
	}

}
