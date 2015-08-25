package Excel_Sheet_Column_Title;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Excel_Sheet_Column_Title.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test1() {
		String ret = solution.convertToTitle(1);
		Assert.assertEquals("A", ret);
	}
	@Test
	public void test2() {
		String ret = solution.convertToTitle(26);
		Assert.assertEquals("Z", ret);
	}
	@Test
	public void test3() {
		String ret = solution.convertToTitle(27);
		Assert.assertEquals("AA", ret);
	}

}
