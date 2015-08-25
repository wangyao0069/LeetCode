package Balanced_Binary_Tree;

import Util.TreeNode;

public class Solution {

	/**
	 * 396ms
	 *
	 * @param root
	 * @return
	 */
	public boolean isBalanced(TreeNode root) {
		// Integer num = 0;
		int ret = travering(root);

		if (ret == -1) {
			return false;
		} else {
			return true;
		}
	}

	int travering(TreeNode node) {

		if (node == null) {
			return 0;
		}

		int l = travering(node.left);
		int r = travering(node.right);

		if (l == -1 || r == -1) {
			return -1;
		} else if (Math.abs(l - r) <= 1) {
			return Math.max(l, r) + 1;
		} else {
			return -1;
		}
	}
}
