package Intersection_of_Two_Linked_Lists;

import Util.*;

public class Solution {

	/**432ms 83.5%
	 * @param headA
	 * @param headB
	 * @return
	 */
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA ==null || headB == null) {
			return null;
		}
		int lenA = 0;
		int lenB = 0;
		ListNode curA = headA;
		ListNode curB = headB;
		while (curA != null) {
			lenA++;
			curA = curA.next;
		}
		while (curB != null) {
			lenB++;
			curB = curB.next;
		}
		
		if (lenB > lenA) {
			int t = lenA;
			lenA = lenB;
			lenB = t;
			
			curA = headB;
			curB = headA;
		} else {
			curA = headA;
			curB = headB;
		}
		ListNode ret = null;
		
		while (curA != null) {
			if (lenA == lenB) {
				if (curA == curB) {
					ret = curA;
					break;
				}
				curB = curB.next;
				lenB--;
			}
			curA = curA.next;
			lenA--;
		}
		
		return ret;
	}
}
