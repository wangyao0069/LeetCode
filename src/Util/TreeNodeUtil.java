package Util;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNodeUtil {

	public static TreeNode GetTree(int[] treeValue) {
		
		TreeNode head = null;
		
		if (treeValue.length < 1) {
			;
		} else {
			Queue<TreeNode> queue = new LinkedList<TreeNode>();
			head = new TreeNode(treeValue[0]);
			queue.add(head);
			for (int i = 1; i < treeValue.length; i += 2) {
				TreeNode cur = queue.poll();
				TreeNode left = null;
				TreeNode right = null;
				if (cur == null) {
					continue;
				}
				if (treeValue[i] != -1) {
					left = new TreeNode(treeValue[i]);
					cur.left = left;
					queue.add(left);
				} else {
					queue.add(null);
				}
				if (treeValue[i+1] != -1) {
					right = new TreeNode(treeValue[i+1]);
					cur.right = right;
					queue.add(right);
				} else {
					queue.add(null);
				}
			}
		}

		return head;
	}
	
}
