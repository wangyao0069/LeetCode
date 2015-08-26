package Excel_Sheet_Column_Number;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Excel_Sheet_Column_Number.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}


	@Test
	public void test1() {
		int ret = solution.titleToNumber("A");
		Assert.assertEquals(1, ret);
	}
	@Test
	public void test2() {
		int ret = solution.titleToNumber("Z");
		Assert.assertEquals(26, ret);
	}
	@Test
	public void test3() {
		int ret = solution.titleToNumber("AA");
		Assert.assertEquals(27, ret);
	}


}
