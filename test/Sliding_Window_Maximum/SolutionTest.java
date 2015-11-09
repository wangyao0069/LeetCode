package Sliding_Window_Maximum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Sliding_Window_Maximum.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test() {
		int[] ret = solution.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3);
		Assert.assertArrayEquals(new int[]{3,3,5,5,6,7}, ret);
	}
	@Test
	public void test1() {
		int[] ret = solution.maxSlidingWindow(new int[]{1}, 1);
		Assert.assertArrayEquals(new int[]{1}, ret);
	}

}
