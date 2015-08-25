package Symmetric_Tree;

import java.util.ArrayList;
import java.util.List;

import Util.TreeNode;

public class Solution {
	public boolean isSymmetric(TreeNode root) {
		if (root == null)
			return true;
		return isSymmHelper(root.left, root.right);
	}

	public boolean isSymmHelper(TreeNode left, TreeNode right) {
		// Either both should be null or none
		if (left == null || right == null)
			return (left == right);
		// compare left subtree of leftchild with right subtree of rightchild
		// and vice versa
		if ((left.val == right.val) && (isSymmHelper(left.left, right.right))
				&& (isSymmHelper(left.right, right.left)))
			return true;
		else
			return false;
	}
}
