package Three_Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Three_Sum.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}
	
	@Test
	public void testThreeSum1() {
		List<List<Integer>> retList = solution.threeSum(new int[]{0,0,0,1,-1,2});
		List<List<Integer>> expectedList = new ArrayList<List<Integer>>();
		expectedList.add(Arrays.asList(-1,0,1));
		expectedList.add(Arrays.asList(0,0,0));
	
		Assert.assertEquals(expectedList,retList);
	}

	@Test
	public void testThreeSum2() {
		List<List<Integer>> retList = solution.threeSum(new int[]{3,-1,-2,-1,-3,1,2});
		List<List<Integer>> expectedList = new ArrayList<List<Integer>>();
		expectedList.add(Arrays.asList(-1,-1,2));
		expectedList.add(Arrays.asList(-2,-1,3));
		expectedList.add(Arrays.asList(-3,1,2));
		Assert.assertEquals(expectedList,retList);
	}
	
	@Test
	public void testThreeSum3() {
		List<List<Integer>> retList = solution.threeSum(new int[]{-3,1,2,1,3,-1,-2});
		List<List<Integer>> expectedList = new ArrayList<List<Integer>>();
		expectedList.add(Arrays.asList(-2,-1,3));
		expectedList.add(Arrays.asList(-3,1,2));
		expectedList.add(Arrays.asList(-2,1,1));
		Assert.assertEquals(expectedList,retList);
	}

}
