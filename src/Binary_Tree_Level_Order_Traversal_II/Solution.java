package Binary_Tree_Level_Order_Traversal_II;

import java.util.ArrayList;
import java.util.List;

import Util.TreeNode;

public class Solution {
	/**308ms
	 * @param root
	 * @return
	 */
	public List<List<Integer>> levelOrderBottom(TreeNode root) {

		List<List<Integer>> ret = new ArrayList<List<Integer>>();
		if (root == null) {
			return ret;
		}

		recordLevel(ret, root, 1);
		List<List<Integer>> ret1 = new ArrayList<List<Integer>>();
		for (int i = 0; i < ret.size(); i++) {
			ret1.add(ret.get(ret.size() - 1 - i));
		}

		return ret1;
	}

	private void recordLevel(List<List<Integer>> ret, TreeNode cur, int level) {

		if (cur == null) {
			return;
		}

		List<Integer> tmpList = null;
		if (ret.size() < level) {
			tmpList = new ArrayList<Integer>();
			ret.add(tmpList);
		} else {
			tmpList = ret.get(level - 1);
		}
		tmpList.add(cur.val);

		recordLevel(ret, cur.left, level + 1);
		recordLevel(ret, cur.right, level + 1);
	}
}
