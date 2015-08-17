package Palindrome_Linked_List;

import java.util.Stack;

public class Solution {
	
	private ListNode head;
	
	/**
	 * 412ms
	 * @param head
	 * @return
	 */
	public boolean isPalindrome(ListNode head) {
		
		if (head == null) {
			return true;
		}
		this.head = head;
		
        boolean ret = recursion(head);
		
        return ret;
  
    }
	
	private boolean recursion(ListNode node) {
		boolean ret = true;
		if (node.next != null) {
			ret = recursion(node.next);
		}
		if (node.val != head.val) {
			ret = false;
		} else {
			ret = true && ret;
		}
		head = head.next;
		
		return ret;
		
	}
	
	/**
	 * 452ms middle
	 * @param head
	 * @return
	 */
	public boolean isPalindrome_v1(ListNode head) {
        Stack<Integer> s = new Stack<Integer>();
        int length = 0;
        ListNode cur = head;
        while (cur != null) {
        	length++;
        	cur = cur.next;
        }
        cur = head;
        for (int i = 0; i < length; i++) {
			if (i < length/2) {
				s.push(cur.val);
			}
			if (length%2 == 1 && i > length/2 || length%2 == 0 && i >= length/2) {
				int t = s.pop();
				if (t != cur.val) {
					return false;
				}
			}
			
        	cur = cur.next;
		}
        
        return true;
  
    }
}
