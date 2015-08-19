package Happy_Number;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Happy_Number.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test1() {
		boolean ret = solution.isHappy(19);
		Assert.assertEquals(true, ret);
	}
	@Test
	public void test2() {
		boolean ret = solution.isHappy(18);
		Assert.assertEquals(false, ret);
	}
	@Test
	public void test3() {
		boolean ret = solution.isHappy(29);
		Assert.assertEquals(false, ret);
	}
	@Test
	public void test4() {
		boolean ret = solution.isHappy(7);
		Assert.assertEquals(true, ret);
	}

}
