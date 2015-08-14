package Container_With_Most_Water;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Container_With_Most_Water.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}
	
	@Test
	public void test() {
		int ret = solution.maxArea(new int[]{0});
		int expected = 0;
		Assert.assertEquals(expected, ret);
	}
	@Test
	public void test1() {
		int ret = solution.maxArea(new int[]{0,1});
		int expected = 0;
		Assert.assertEquals(expected, ret);
	}
	@Test
	public void test2() {
		int ret = solution.maxArea(new int[]{1,1});
		int expected = 1;
		Assert.assertEquals(expected, ret);
	}
	@Test
	public void test3() {
		int ret = solution.maxArea(new int[]{1,2,3});
		int expected = 2;
		Assert.assertEquals(expected, ret);
	}
	@Test
	public void test4() {
		int ret = solution.maxArea(new int[]{1,2,3,4});
		int expected = 4;
		Assert.assertEquals(expected, ret);
	}
	@Test
	public void test5() {
		int ret = solution.maxArea(new int[]{2,1,2,1});
		int expected = 4;
		Assert.assertEquals(expected, ret);
	}
	@Test
	public void test6() {
		int ret = solution.maxArea(new int[]{
				119,118,117,116,115,114,113,112,111,110,109,108,107,106,105,104,103,102,101,100,99,98,97,96,95,94,93,92,91,90,89,88,87,86,85,84,83,82,81,80,79,78,77,76,75,74,73,72,71,70,69,68,67,66,65,64,63,62,61,60,59,58,57,56,55,54,53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2
		});
		int expected = 4;
		//Assert.assertEquals(expected, ret);
	}
}
