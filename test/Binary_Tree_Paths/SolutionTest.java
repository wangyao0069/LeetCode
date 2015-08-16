package Binary_Tree_Paths;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Binary_Tree_Paths.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}
	
	@Test
	public void testBinaryTreePaths() {
		TreeNode root = new TreeNode(1);
		
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n5 = new TreeNode(5);
		
		root.left = n2;
		root.right = n3;
		n2.right = n5;
		
		solution.binaryTreePaths(root);
	}

}
