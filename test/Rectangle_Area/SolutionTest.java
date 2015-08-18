package Rectangle_Area;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Rectangle_Area.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}
	@Test
	public void test1() {
		int ret = solution.computeArea(-2, -2, 2, 2, -2, -2, 2, 2);
		Assert.assertEquals(16, ret);
	}
	@Test
	public void test2() {
		int ret = solution.computeArea(-2, -2, 2, 2, 1, -3, 3, -1);
		Assert.assertEquals(19, ret);
	}
}
