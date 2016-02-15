package Binary_Tree_Inorder_Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import Binary_Tree_Paths.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> retIntegers = new ArrayList<Integer>();
        Stack<TreeNode> listNodes = new Stack<TreeNode>();
        listNodes.add(root);
        
        
        return retIntegers;
    }
	
//	public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> retIntegers = new ArrayList<Integer>();
//        if(root != null)
//            Recursive(retIntegers, root);
//        
//        return retIntegers;
//    }
//    
//    void Recursive(List<Integer> retIntegers, TreeNode n){
//    	if (n.left != null) {
//			Recursive(retIntegers, n.left);
//		} 
//    	retIntegers.add(n.val);
//    	if (n.right != null) {
//    		Recursive(retIntegers, n.right);
//		}
//    }
}
