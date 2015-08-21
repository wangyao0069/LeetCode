package Maximum_Depth_of_Binary_Tree;

public class Solution {

	/**
	 * 296ms
	 * 
	 * @param root
	 * @return
	 */
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}
		int ret = maxDepth(root.left);
		int r = maxDepth(root.right);
		ret = r > ret ? r : ret;

		return ret + 1;
	}
}
