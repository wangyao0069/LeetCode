package Binary_Tree_Level_Order_Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import Util.TreeNode;

public class Solution {
	
	/**356ms
	 * @param root
	 * @return
	 */
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> ret = new ArrayList<List<Integer>>();
		if (root == null) {
			return ret;
		}
		
		recordLevel(ret, root, 1);
		
		return ret;
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
		
		recordLevel(ret, cur.left, level+1);
		recordLevel(ret, cur.right, level+1);
	}
	

	/**364ms
	 * @param root
	 * @return
	 */
	public List<List<Integer>> levelOrder_v1(TreeNode root) {
		List<List<Integer>> ret = new ArrayList<List<Integer>>();
		if (root == null) {
			return ret;
		}
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while (queue.size() != 0) {
			List<TreeNode> levelNodes = new LinkedList<TreeNode>(queue);
			List<Integer> numList = new ArrayList<Integer>();
			queue.clear();
			for (int i = 0; i < levelNodes.size(); i++) {
				numList.add(levelNodes.get(i).val);
				if (levelNodes.get(i).left != null) {
					queue.add(levelNodes.get(i).left);
				}
				if (levelNodes.get(i).right != null) {
					queue.add(levelNodes.get(i).right);
				}
			}
			
			ret.add(numList);
		}
		
		return ret;
	}
}
