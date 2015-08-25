package Missing_Number;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Missing_Number.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test1() {
		int ret = solution.missingNumber(new int[]{});
		Assert.assertEquals(0, ret);
	}
	@Test
	public void test2() {
		int ret = solution.missingNumber(new int[]{0,1,3});
		Assert.assertEquals(2, ret);
	}

}
