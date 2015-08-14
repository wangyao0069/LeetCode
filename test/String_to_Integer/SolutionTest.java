package String_to_Integer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import String_to_Integer.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void testMyAtoi() {
		int ret = solution.myAtoi("0");
		Assert.assertEquals(0, ret);
	}
	
	@Test
	public void testMyAtoi1() {
		int ret = solution.myAtoi("-1");
		Assert.assertEquals(-1, ret);
	}
	
	@Test
	public void testMyAtoi2() {
		int ret = solution.myAtoi("1");
		Assert.assertEquals(1, ret);
	}
	
	@Test
	public void testMyAtoi3() {
		int ret = solution.myAtoi("2147483647");
		Assert.assertEquals(Integer.MAX_VALUE, ret);
	}
	
	@Test
	public void testMyAtoi4() {
		int ret = solution.myAtoi("-2147483648");
		Assert.assertEquals(Integer.MIN_VALUE, ret);
	}

	@Test
	public void testMyAtoi5() {
		int ret = solution.myAtoi("+-2");
		Assert.assertEquals(0, ret);
	}
	
	@Test
	public void testMyAtoi6() {
		int ret = solution.myAtoi("   010");
		Assert.assertEquals(10, ret);
	}
	
	@Test
	public void testMyAtoi7() {
		int ret = solution.myAtoi("  -0012a42");
		Assert.assertEquals(-12, ret);
	}
	
	@Test
	public void testMyAtoi8() {
		int ret = solution.myAtoi("2147483648");
		Assert.assertEquals(Integer.MAX_VALUE, ret);
	}
	
	@Test
	public void testMyAtoi9() {
		int ret = solution.myAtoi("   -1123u3761867");
		Assert.assertEquals(-1123, ret);
	}
	
	@Test
	public void testMyAtoi10() {
		int ret = solution.myAtoi("1243254365476453421324233");
		Assert.assertEquals(Integer.MAX_VALUE, ret);
	}
}
