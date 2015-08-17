package Lowest_Common_Ancestor_of_a_Binary_Search_Tree;

public class Solution {
	
	
	/**
	 * 476ms
	 * @param root
	 * @param p
	 * @param q
	 * @return
	 */
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		
		TreeNode ret = null;

		if (root.val == p.val || root.val == q.val) {
			ret = root;
		}
		
		if (p.val < root.val && q.val < root.val) {
			ret = lowestCommonAncestor(root.left, p, q);
		}
		if (p.val > root.val && q.val > root.val) {
			ret = lowestCommonAncestor(root.right, p, q);
		}
		if (p.val > root.val && q.val < root.val ||
				p.val < root.val && q.val > root.val) {
			ret = root;
		}
		
		return ret;
	}


}
