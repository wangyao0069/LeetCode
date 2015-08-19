package Length_of_Last_Word;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Length_of_Last_Word.Solution;

public class SolutionTest {

	private Solution solution;
	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void testLengthOfLastWord1() {
		int ret = solution.lengthOfLastWord("hello world");
		Assert.assertEquals(5, ret);
	}
	@Test
	public void testLengthOfLastWord2() {
		int ret = solution.lengthOfLastWord("hello world  ");
		Assert.assertEquals(5, ret);
	}
	@Test
	public void testLengthOfLastWord3() {
		int ret = solution.lengthOfLastWord("  ");
		Assert.assertEquals(0, ret);
	}
	@Test
	public void testLengthOfLastWord4() {
		int ret = solution.lengthOfLastWord("");
		Assert.assertEquals(0, ret);
	}
	@Test
	public void testLengthOfLastWord5() {
		int ret = solution.lengthOfLastWord("world");
		Assert.assertEquals(5, ret);
	}

}
