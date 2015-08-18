package Remove_Duplicates_from_Sorted_Array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Remove_Duplicates_from_Sorted_Array.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void testRemoveDuplicates1() {
		int ret = solution.removeDuplicates(new int[]{});
		Assert.assertEquals(0, ret);
	}
	@Test
	public void testRemoveDuplicates2() {
		int ret = solution.removeDuplicates(new int[]{0});
		Assert.assertEquals(1, ret);
	}
	@Test
	public void testRemoveDuplicates3() {
		int ret = solution.removeDuplicates(new int[]{0,1,1,1,1,2});
		Assert.assertEquals(3, ret);
	}
	@Test
	public void testRemoveDuplicates4() {
		int ret = solution.removeDuplicates(new int[]{2,2});
		Assert.assertEquals(1, ret);
	}
	@Test
	public void testRemoveDuplicates5() {
		int ret = solution.removeDuplicates(new int[]{1,1,2});
		Assert.assertEquals(2, ret);
	}
	@Test
	public void testRemoveDuplicates6() {
		int ret = solution.removeDuplicates(null);
		Assert.assertEquals(0, ret);
	}
	@Test
	public void testRemoveDuplicates7() {
		int ret = solution.removeDuplicates(new int[]{1,1,2,2});
		Assert.assertEquals(2, ret);
	}
	@Test
	public void testRemoveDuplicates8() {
		int ret = solution.removeDuplicates(new int[]{1,2});
		Assert.assertEquals(2, ret);
	}
}
