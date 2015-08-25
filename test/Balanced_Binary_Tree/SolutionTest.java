package Balanced_Binary_Tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Balanced_Binary_Tree.Solution;
import Util.*;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test1() {
		TreeNode root = TreeNodeUtil.GetTree(new int[]{0,1,1});
		boolean ret = solution.isBalanced(root);
		Assert.assertEquals(true, ret);
	}
	@Test
	public void test2() {
		TreeNode root = TreeNodeUtil.GetTree(new int[]{});
		boolean ret = solution.isBalanced(root);
		Assert.assertEquals(true, ret);
	}
	@Test
	public void test3() {
		boolean ret = solution.isBalanced(null);
		Assert.assertEquals(true, ret);
	}
	@Test
	public void test4() {
		TreeNode root = TreeNodeUtil.GetTree(new int[]{0,-1,1});
		boolean ret = solution.isBalanced(root);
		Assert.assertEquals(true, ret);
	}
	@Test
	public void test5() {
		TreeNode root = TreeNodeUtil.GetTree(new int[]{1,2,2,3,3,3,3});
		boolean ret = solution.isBalanced(root);
		Assert.assertEquals(true, ret);
	}
	@Test
	public void test6() {
		TreeNode root = TreeNodeUtil.GetTree(new int[]{1,2,-1,3,3});
		boolean ret = solution.isBalanced(root);
		Assert.assertEquals(false, ret);
	}
	@Test
	public void test7() {
		TreeNode root = TreeNodeUtil.GetTree(new int[]{1,2,3,4,5});
		boolean ret = solution.isBalanced(root);
		Assert.assertEquals(true, ret);
	}
	@Test
	public void test8() {
		TreeNode root = TreeNodeUtil.GetTree(new int[]{1,2,2,3,3,3,3,4,4,4,4,4,4,-1,-1,5,5});
		boolean ret = solution.isBalanced(root);
		Assert.assertEquals(true, ret);
	}
}
