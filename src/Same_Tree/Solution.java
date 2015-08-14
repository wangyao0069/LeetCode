package Same_Tree;

public class Solution {
	public boolean isSameTree(TreeNode p, TreeNode q) {

		if (p == null && q == null) {
			return true;
		} else if (p != null && q != null) {
			boolean cur = false;
			if (p.val == q.val) {
				cur = true;
			}
			boolean left = isSameTree(p.left, q.left);
			boolean right = isSameTree(p.right, q.right);
			
			return cur && left && right;
		} else {
			return false;
		}
	}
}
