package Minimum_Depth_of_Binary_Tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Minimum_Depth_of_Binary_Tree.Solution;
import Util.*;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test1() {
		TreeNode root = TreeNodeUtil.GetTree(new int[]{1});
		int ret = solution.minDepth(root);
		Assert.assertEquals(1, ret);
	}
	@Test
	public void test2() {
		int ret = solution.minDepth(null);
		Assert.assertEquals(0, ret);
	}
	@Test
	public void test3() {
		TreeNode root = TreeNodeUtil.GetTree(new int[]{1,2,-1});
		int ret = solution.minDepth(root);
		Assert.assertEquals(2, ret);
	}
	@Test
	public void test4() {
		TreeNode root = TreeNodeUtil.GetTree(new int[]{1,2,-1,3,3});
		int ret = solution.minDepth(root);
		Assert.assertEquals(3, ret);
	}
	@Test
	public void test5() {
		TreeNode root = TreeNodeUtil.GetTree(new int[]{1,2,2,3,-1,-1,-1});
		int ret = solution.minDepth(root);
		Assert.assertEquals(2, ret);
	}
	@Test
	public void test6() {
		TreeNode root = TreeNodeUtil.GetTree(new int[]{1,2,-1,-1,3});
		int ret = solution.minDepth(root);
		Assert.assertEquals(3, ret);
	}

}
