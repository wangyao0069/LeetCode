package Median_of_Two_Sorted_Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
	
	private Solution solution;

	@Before
	public void before(){
		solution = new Solution();
	}

	@Test
	public void test1() {
		int[] a = new int[]{0};
		int[] b = new int[]{1};
		
		double ret = solution.findMedianSortedArrays(a, b);
		double expected = 0.5;
		Assert.assertEquals(expected, ret, 0.00001);
	}
	
	@Test
	public void test2() {
		int[] a = new int[]{0,1};
		int[] b = new int[]{2,3};
		
		double ret = solution.findMedianSortedArrays(a, b);
		double expected = 1.5;
		Assert.assertEquals(expected, ret, 0.00001);
	}

}
