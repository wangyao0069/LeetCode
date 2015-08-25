package Minimum_Depth_of_Binary_Tree;

import Util.TreeNode;

public class Solution {

	/**
	 * 352ms beats 74%
	 * 
	 * @param root
	 * @return
	 */
	public int minDepth(TreeNode root) {
		int ret = travering(root);

		return ret;
	}

	int travering(TreeNode node) {

		if (node == null) {
			return 0;
		}

		int l = travering(node.left);
		int r = travering(node.right);

		if (l == 0 && r != 0) {
			return r + 1;
		}
		if (r == 0 && l != 0) {
			return l + 1;
		}
		if (l < r) {
			return l + 1;
		} else {
			return r + 1;
		}
	}
}
