package Summary_Ranges;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Summary_Ranges.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}
	@Test
	public void test1() {
		List<String> ret = solution.summaryRanges(new int[]{0,1,2,4,5,7});
		Assert.assertEquals(Arrays.asList("0->2","4->5","7"), ret);
	}
	@Test
	public void test2() {
		List<String> ret = solution.summaryRanges(new int[]{0});
		Assert.assertEquals(Arrays.asList("0"), ret);
	}
	@Test
	public void test3() {
		List<String> ret = solution.summaryRanges(new int[]{0,1,2});
		Assert.assertEquals(Arrays.asList("0->2"), ret);
	}
	@Test
	public void test4() {
		List<String> ret = solution.summaryRanges(new int[]{0,2,5,7});
		Assert.assertEquals(Arrays.asList("0","2","5","7"), ret);
	}
}
