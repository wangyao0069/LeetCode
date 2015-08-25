package Path_Sum_II;

import java.util.ArrayList;
import java.util.List;

import Util.TreeNode;

public class Solution {
	/**
	 * 368ms beats 68.19%
	 * 
	 * @param root
	 * @param sum
	 * @return
	 */
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> ret = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();

		if (root != null) {
			traversing(root, ret, list, 0, sum);
		}

		return ret;

	}

	private boolean traversing(TreeNode node, List<List<Integer>> ret,
			List<Integer> list, int num, int sum) {

		if (node.left == null && node.right == null) {
			if (node.val + num == sum) {
				list.add(node.val);
				ret.add(list);
				return true;
			} else {
				return false;
			}
		}
		list.add(node.val);
		boolean left = false;
		boolean right = false;
		if (node.left != null) {
			List<Integer> list1 = new ArrayList<Integer>(list);
			left = traversing(node.left, ret, list1, num + node.val, sum);
		}
		if (node.right != null) {
			List<Integer> list2 = new ArrayList<Integer>(list);
			right = traversing(node.right, ret, list2, num + node.val, sum);
		}

		return left || right;
	}

}
