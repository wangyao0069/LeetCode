package House_Robber;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import House_Robber.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}


	@Test
	public void test1() {
		int ret = solution.rob(new int[]{1});
		Assert.assertEquals(1, ret);
	}
	@Test
	public void test2() {
		int ret = solution.rob(new int[]{0});
		Assert.assertEquals(0, ret);
	}
	@Test
	public void test3() {
		int ret = solution.rob(new int[]{2,1});
		Assert.assertEquals(2, ret);
	}
	@Test
	public void test4() {
		int ret = solution.rob(new int[]{1,3,1});
		Assert.assertEquals(3, ret);
	}
	@Test
	public void test5() {
		int ret = solution.rob(new int[]{2,2,1});
		Assert.assertEquals(3, ret);
	}
	@Test
	public void test6() {
		int ret = solution.rob(new int[]{3,1,2,9});
		Assert.assertEquals(12, ret);
	}
	@Test
	public void test7() {
		int ret = solution.rob(new int[]{1,3,1,3,100});
		Assert.assertEquals(103, ret);
	}
	@Test
	public void test8() {
		int ret = solution.rob(new int[]{114,117,207,117,235,82,90,67,143,146,53,108,200,91,80,223,58,170,110,236,81,90,222,160,165,195,187,199,114,235,197,187,69,129,64,214,228,78,188,67,205,94,205,169,241,202,144,240});
		Assert.assertEquals(103, ret);
	}

}
