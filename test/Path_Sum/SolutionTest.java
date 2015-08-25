package Path_Sum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Path_Sum.Solution;
import Util.*;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test1() {
		TreeNode root = TreeNodeUtil.GetTree(new int[] { 5, 4, 8, 11, -1, 13,
				4, 7, 2, -1, -1, -1, -1, -1, 1 });
		boolean ret = solution.hasPathSum(root, 22);
		Assert.assertEquals(true, ret);
	}

	@Test
	public void test2() {
		TreeNode root = TreeNodeUtil.GetTree(new int[] { 1 });
		boolean ret = solution.hasPathSum(root, 1);
		Assert.assertEquals(true, ret);
	}

	@Test
	public void test3() {
		TreeNode root = TreeNodeUtil.GetTree(new int[] { 1 });
		boolean ret = solution.hasPathSum(root, 2);
		Assert.assertEquals(false, ret);
	}

	@Test
	public void test4() {
		// TreeNode root = TreeNodeUtil.GetTree(new int[] {});
		boolean ret = solution.hasPathSum(null, 2);
		Assert.assertEquals(false, ret);
	}

	@Test
	public void test5() {
		TreeNode root = TreeNodeUtil.GetTree(new int[] { 1, 2, 3 });
		boolean ret = solution.hasPathSum(root, 4);
		Assert.assertEquals(true, ret);
	}

	@Test
	public void test6() {
		TreeNode root = TreeNodeUtil.GetTree(new int[] { 1, 2, -1 });
		boolean ret = solution.hasPathSum(root, 0);
		Assert.assertEquals(false, ret);
	}
}
