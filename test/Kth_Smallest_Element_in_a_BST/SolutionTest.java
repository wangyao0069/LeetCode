package Kth_Smallest_Element_in_a_BST;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Kth_Smallest_Element_in_a_BST.Solution;

public class SolutionTest {

	private Solution solution;
	
	TreeNode rootNode = new TreeNode(6);
	TreeNode node2 = new TreeNode(2);
	TreeNode node8 = new TreeNode(8);
	TreeNode node0 = new TreeNode(0);
	TreeNode node4 = new TreeNode(4);
	TreeNode node3 = new TreeNode(3);
	TreeNode node5 = new TreeNode(5);
	TreeNode node7 = new TreeNode(7);
	TreeNode node9 = new TreeNode(9);

	@Before
	public void before() {
		solution = new Solution();
		
		rootNode.left = node2;
		rootNode.right = node8;
		node2.left = node0;
		node2.right = node4;
		node4.left = node3;
		node4.right = node5;
		node8.left= node7;
		node8.right = node9;
	}
	
	@Test
	public void testKthSmallest1() {
		int ret = solution.kthSmallest(rootNode, 2);
		Assert.assertEquals(2, ret);
	}
	@Test
	public void testKthSmallest2() {
		int ret = solution.kthSmallest(rootNode, 8);
		Assert.assertEquals(8, ret);
	}
	@Test
	public void testKthSmallest3() {
		int ret = solution.kthSmallest(rootNode, 5);
		Assert.assertEquals(5, ret);
	}
	@Test
	public void testKthSmallest4() {
		int ret = solution.kthSmallest(rootNode, 6);
		Assert.assertEquals(6, ret);
	}
	@Test
	public void testKthSmallest5() {
		int ret = solution.kthSmallest(rootNode, 9);
		Assert.assertEquals(9, ret);
	}

}
