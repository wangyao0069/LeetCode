package Invert_Binary_Tree;

public class Solution {
	public TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null;
		}
		
		TreeNode t = root.left;
		root.left = root.right;
		root.right = t;
		
		if (root.left != null) {
			invertTree(root.left);
		}
		if (root.right != null) {
			invertTree(root.right);
		}
		
		return root;
	}
}
