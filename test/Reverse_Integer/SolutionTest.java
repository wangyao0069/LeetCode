package Reverse_Integer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void testReverse() {

		int ret = solution.reverse(-123);
		Assert.assertEquals(-321, ret);

		ret = solution.reverse(0);
		Assert.assertEquals(0, ret);

		ret = solution.reverse(123);
		Assert.assertEquals(321, ret);

		ret = solution.reverse(1534236469);
		Assert.assertEquals(0, ret);

	}

	@Test
	public void testReverse_v2_0() {

		int ret = solution.reverse_v2(-123);
		Assert.assertEquals(-321, ret);
	}

	@Test
	public void testReverse_v2_1() {

		int ret = solution.reverse_v2(0);
		Assert.assertEquals(0, ret);

	}

	@Test
	public void testReverse_v2_2() {

		int ret = solution.reverse_v2(123);
		Assert.assertEquals(321, ret);

	}

	@Test
	public void testReverse_v2_3() {

		int ret = solution.reverse_v2(1534236469);
		Assert.assertEquals(0, ret);

	}
}
