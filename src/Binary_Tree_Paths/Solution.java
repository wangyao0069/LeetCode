package Binary_Tree_Paths;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class Solution {

	public List<String> binaryTreePaths(TreeNode root) {

		List<String> retList = new ArrayList<String>();

		if (root == null) {
			return retList;
		}

		treePath(root, String.valueOf(root.val), retList);

		return retList;

	}

	void treePath(TreeNode node, String path, List<String> ret) {

		if (node.left == null && node.right == null) {
			ret.add(path);
			return;
		}
		if (node.left != null) {
			treePath(node.left, path + "->" + String.valueOf(node.left.val),
					ret);
		}
		if (node.right != null) {
			treePath(node.right, path + "->" + String.valueOf(node.right.val),
					ret);
		}

	}
}
