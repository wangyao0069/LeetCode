package Compare_Version_Numbers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Compare_Version_Numbers.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test1() {
		int ret = solution.compareVersion("1.1.0", "1.1.0");
		Assert.assertEquals(0, ret);
	}
	@Test
	public void test2() {
		int ret = solution.compareVersion("1.1.1", "1.1.0");
		Assert.assertEquals(1, ret);
	}
	@Test
	public void test3() {
		int ret = solution.compareVersion("1.1.1", "1.1");
		Assert.assertEquals(1, ret);
	}
	@Test
	public void test4() {
		int ret = solution.compareVersion("1.0.0", "1.1.0");
		Assert.assertEquals(-1, ret);
	}
	@Test
	public void test5() {
		int ret = solution.compareVersion("1.0", "1");
		Assert.assertEquals(0, ret);
	}
	

}
