package Power_of_Two;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Power_of_Two.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();

	}

	@Test
	public void testIsPowerOfTwo1() {
		boolean ret = solution.isPowerOfTwo(0);
		Assert.assertEquals(false, ret);
	}
	@Test
	public void testIsPowerOfTwo2() {
		boolean ret = solution.isPowerOfTwo(-1);
		Assert.assertEquals(false, ret);
	}
	@Test
	public void testIsPowerOfTwo3() {
		boolean ret = solution.isPowerOfTwo(1);
		Assert.assertEquals(true, ret);
	}
	@Test
	public void testIsPowerOfTwo4() {
		boolean ret = solution.isPowerOfTwo(2);
		Assert.assertEquals(true, ret);
	}
	@Test
	public void testIsPowerOfTwo5() {
		boolean ret = solution.isPowerOfTwo(7);
		Assert.assertEquals(false, ret);
	}
	@Test
	public void testIsPowerOfTwo6() {
		boolean ret = solution.isPowerOfTwo(8);
		Assert.assertEquals(true, ret);
	}
	@Test
	public void testIsPowerOfTwo7() {
		boolean ret = solution.isPowerOfTwo(1023);
		Assert.assertEquals(false, ret);
	}
	@Test
	public void testIsPowerOfTwo8() {
		boolean ret = solution.isPowerOfTwo(1024);
		Assert.assertEquals(true, ret);
	}

}
