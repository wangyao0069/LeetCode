package Lowest_Common_Ancestor_of_a_Binary_Search_Tree;

public class Solution {

	/**
	 * any binary tree
	 * @param root
	 * @param p
	 * @param q
	 * @return
	 */
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

		TreeNode lNode = null;
		TreeNode rNode = null;

		if (root.left != null) {
			lNode = lowestCommonAncestor(root.left, p, q);
		}
		if (root.right != null) {
			rNode = lowestCommonAncestor(root.right, p, q);
		}

		if (lNode == null && rNode == null) {
			if (root == p) {
				return p;
			} else if (root == q) {
				return q;
			} else {
				return null;
			}
		} else {
			if ((rNode != null && lNode == null && (root.right == p || root.right == q))
					|| (lNode != null && rNode == null && (root.left == p || root.left == q))) {
				return root;
			}
			TreeNode accNode = root;
			if (rNode != null && lNode == null) {
				accNode = rNode;
			}
			if (lNode != null && rNode == null) {
				accNode = lNode;
			}

			return accNode;
		}
	}
}
