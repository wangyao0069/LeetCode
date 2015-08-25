package Path_Sum;

import Util.TreeNode;

public class Solution {
	/**
	 * 344 beats 85.73%
	 * 
	 * @param root
	 * @param sum
	 * @return
	 */
	public boolean hasPathSum(TreeNode root, int sum) {
		boolean ret = false;
		if (root != null) {
			ret = traversing(root, 0, sum);
		}

		return ret;
	}

	private boolean traversing(TreeNode node, int num, int sum) {

		if (node.left == null && node.right == null) {
			if (node.val + num == sum) {
				return true;
			} else {
				return false;
			}
		}

		boolean left = false;
		boolean right = false;
		if (node.left != null) {
			left = traversing(node.left, num + node.val, sum);
		}
		if (node.right != null) {
			right = traversing(node.right, num + node.val, sum);
		}

		return left || right;
	}

}
