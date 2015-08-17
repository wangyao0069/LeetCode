package Lowest_Common_Ancestor_of_a_Binary_Tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Lowest_Common_Ancestor_of_a_Binary_Tree.TreeNode;

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
	public void testLowestCommonAncestor1() {
		TreeNode retNode= solution.lowestCommonAncestor(rootNode, node2, node8);
		
		Assert.assertEquals(rootNode, retNode);
	}
	
	@Test
	public void testLowestCommonAncestor2() {
		TreeNode retNode= solution.lowestCommonAncestor(rootNode, node2, node4);
		
		Assert.assertEquals(node2, retNode);
	}
	
	@Test
	public void testLowestCommonAncestor3() {
		TreeNode retNode= solution.lowestCommonAncestor(rootNode, node3, node5);
		
		Assert.assertEquals(node4, retNode);
	}
	
	@Test
	public void testLowestCommonAncestor4() {
		TreeNode retNode= solution.lowestCommonAncestor(rootNode, node4, node7);
		
		Assert.assertEquals(rootNode, retNode);
	}

}
