package Reverse_Bits;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Reverse_Bits.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test() {
		int ret = solution.reverseBits(43261596 );
		Assert.assertEquals(964176192, ret);
	}

}
