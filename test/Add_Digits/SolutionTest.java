package Add_Digits;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Add_Digits.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}
	
	@Test
	public void testAddDigits1() {
		int ret = solution.addDigits(9);
		Assert.assertEquals(9, ret);
	}
	@Test
	public void testAddDigits2() {
		int ret = solution.addDigits(19);
		Assert.assertEquals(1, ret);
	}
	@Test
	public void testAddDigits3() {
		int ret = solution.addDigits(37);
		Assert.assertEquals(1, ret);
	}
	@Test
	public void testAddDigits4() {
		int ret = solution.addDigits(3778554);
		Assert.assertEquals(3, ret);
	}
	@Test
	public void testAddDigits5() {
		int ret = solution.addDigits(20);
		Assert.assertEquals(2, ret);
	}
	@Test
	public void testAddDigits6() {
		int ret = solution.addDigits(30);
		Assert.assertEquals(3, ret);
	}
	@Test
	public void testAddDigits7() {
		int ret = solution.addDigits(130);
		Assert.assertEquals(4, ret);
	}
	@Test
	public void testAddDigits8() {
		int ret = solution.addDigits(1234);
		Assert.assertEquals(1, ret);
	}
	

}
