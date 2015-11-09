package H_Index;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import H_Index.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test1() {
		int ret = solution.hIndex(new int[]{3, 0, 6, 1, 5});
		Assert.assertEquals(3, ret);
	}
	@Test
	public void test2() {
		int ret = solution.hIndex(new int[]{1});
		Assert.assertEquals(1, ret);
	}
	@Test
	public void test3() {
	}

}
