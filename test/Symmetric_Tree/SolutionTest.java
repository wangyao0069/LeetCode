package Symmetric_Tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Symmetric_Tree.Solution;
import Util.*;

public class SolutionTest {
	
	private Solution solution;
	
	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test1() {
		TreeNode root = TreeNodeUtil.GetTree(new int[]{1,2,2,3,4,4,3});
		boolean ret = solution.isSymmetric(root);
		Assert.assertEquals(true, ret);
	}
	@Test
	public void test2() {
		TreeNode root = TreeNodeUtil.GetTree(new int[]{1,2,2,-1,3,-1,3});
		boolean ret = solution.isSymmetric(root);
		Assert.assertEquals(false, ret);
	}

}
