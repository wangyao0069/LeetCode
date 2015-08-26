package Number_of_1_Bits;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Number_of_1_Bits.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}
	@Test
	public void test() {
		int ret = solution.hammingWeight(11);
		Assert.assertEquals(3, ret);
	}

}
