package Contains_Duplicate_II;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Contains_Duplicate_II.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test() {
		boolean ret =solution.containsNearbyDuplicate(new int[]{1,0,1,1}, 1);
		Assert.assertEquals(true, ret);
	}

}
