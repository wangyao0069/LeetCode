package Count_and_Say;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Count_and_Say.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void testCountAndSay1() {
		String ret = solution.countAndSay(1);
		Assert.assertEquals("1", ret);
	}
	@Test
	public void testCountAndSay2() {
		String ret = solution.countAndSay(2);
		Assert.assertEquals("11", ret);
	}
	@Test
	public void testCountAndSay3() {
		String ret = solution.countAndSay(3);
		Assert.assertEquals("21", ret);
	}
	@Test
	public void testCountAndSay4() {
		String ret = solution.countAndSay(4);
		Assert.assertEquals("1211", ret);
	}
	@Test
	public void testCountAndSay5() {
		String ret = solution.countAndSay(5);
		Assert.assertEquals("111221", ret);
	}
	@Test
	public void testCountAndSay6() {
		String ret = solution.countAndSay(6);
		Assert.assertEquals("312211", ret);
	}

}
