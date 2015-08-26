package Rotate_Array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Rotate_Array.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test1() {
		int[] ret = new int[]{1,2,3,4,5,6,7};
		solution.rotate(ret,3);
		Assert.assertArrayEquals(new int[]{5,6,7,1,2,3,4}, ret);
	}
	@Test
	public void test2() {
		int[] ret = new int[]{-1};
		solution.rotate(ret,2);
		Assert.assertArrayEquals(new int[]{-1}, ret);
	}
	@Test
	public void test3() {
		int[] ret = new int[]{-1,2};
		solution.rotate(ret,5);
		Assert.assertArrayEquals(new int[]{2,-1}, ret);
	}

}
