package Plus_One;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Plus_One.Solution;

public class SolutionTest {

	private Solution solution;
	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test1() {
		int[] ret = solution.plusOne(new int[]{9});
		Assert.assertArrayEquals(new int[]{1,0}, ret);
	}
	@Test
	public void test2() {
		int[] ret = solution.plusOne(new int[]{2,9});
		Assert.assertArrayEquals(new int[]{3,0}, ret);
	}
	@Test
	public void test3() {
		int[] ret = solution.plusOne(new int[]{0});
		Assert.assertArrayEquals(new int[]{1}, ret);
	}
	@Test
	public void test4() {
		int[] ret = solution.plusOne(new int[]{1,2});
		Assert.assertArrayEquals(new int[]{1,3}, ret);
	}

}
