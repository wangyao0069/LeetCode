package Contains_Duplicate_III;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Contains_Duplicate_III.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test() {
		boolean ret = solution.containsNearbyAlmostDuplicate(new int[]{1,19,41,78,6,8,14,15}, 3, 2);
		Assert.assertEquals(true, ret);
	}
	@Test
	public void test1() {
		boolean ret = solution.containsNearbyAlmostDuplicate(new int[]{7,1,3}, 2, 3);
		Assert.assertEquals(true, ret);
	}
}
