package Add_Binary;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Add_Binary.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test1() {
		String ret = solution.addBinary("1", "0");
		Assert.assertEquals("1", ret);
	}
	@Test
	public void test2() {
		String ret = solution.addBinary("11", "1");
		Assert.assertEquals("100", ret);
	}
	@Test
	public void test3() {
		String ret = solution.addBinary("11", "11");
		Assert.assertEquals("110", ret);
	}
	
}
