package Remove_Element;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Remove_Element.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void testRemoveElement1() {
		int ret = solution.removeElement(new int[]{3}, 3);
		Assert.assertEquals(0, ret);
	}
	@Test
	public void testRemoveElement2() {
		int ret = solution.removeElement(new int[]{3,3}, 3);
		Assert.assertEquals(0, ret);
	}
	@Test
	public void testRemoveElement3() {
		int ret = solution.removeElement(new int[]{1,2,3}, 1);
		Assert.assertEquals(2, ret);
	}
	@Test
	public void testRemoveElement4() {
		int ret = solution.removeElement(new int[]{1,2,3}, 2);
		Assert.assertEquals(2, ret);
	}
	@Test
	public void testRemoveElement5() {
		int ret = solution.removeElement(new int[]{1,2,3}, 3);
		Assert.assertEquals(2, ret);
	}
	@Test
	public void testRemoveElement6() {
		int ret = solution.removeElement(new int[]{1,1,2,3}, 1);
		Assert.assertEquals(2, ret);
	}
	@Test
	public void testRemoveElement7() {
		int ret = solution.removeElement(new int[]{1,2,2,3}, 2);
		Assert.assertEquals(2, ret);
	}
	@Test
	public void testRemoveElement8() {
		int ret = solution.removeElement(new int[]{1,2,3,3}, 3);
		Assert.assertEquals(2, ret);
	}
	@Test
	public void testRemoveElement9() {
		int ret = solution.removeElement(new int[]{1,2,3,4}, 1);
		Assert.assertEquals(3, ret);
	}
}
