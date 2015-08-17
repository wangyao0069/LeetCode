package Kth_Smallest_Element_in_a_BST;

import java.util.Stack;

public class Solution {
	
	/**432ms
	 * @param root
	 * @param k
	 * @return
	 */
	public int kthSmallest(TreeNode root, int k) {
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
	    while (true) {
	        while(root != null) {
	            stack.push(root);
	            root = root.left;
	        }
	        root = stack.pop();
	        if (--k == 0) { return root.val; }
	        root = root.right;
	    }
	}
	
	
	

	/**508ms
	 * @param root
	 * @param k
	 * @return
	 */
	public int kthSmallest_v1(TreeNode root, int k) {
		TreeNode ret = new TreeNode(0);
		tree(root, ret, 0, k);

		return ret.val;
	}

	private int tree(TreeNode root, TreeNode ret, int index, int k) {
		if (root.left != null) {
			index = tree(root.left, ret, index, k);
			index++;
		} else {
			if (index == 0) {
				index = 1;
			} else {
				index++;
			}
		}

		if (k == index) {
			ret.val = root.val;
		}

		if (root.right != null) {
			index = tree(root.right, ret, index, k);
		}

		return index;
	}

}
