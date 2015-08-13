package Add_Two_Numbers;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = l1;
		
        ListNode cur_1_pre = null;
        while (l1 != null && l2 != null) {	
        	int sum = l1.val + l2.val;
        	
        	if (sum >= 10) {
				l1.val = sum % 10;
				if (l1.next == null) {
					ListNode node = new ListNode(sum/10);
					l1.next = node;
				} else {
					l1.next.val += sum/10;
				}
			} else {
				l1.val = sum;
			}
        	cur_1_pre = l1;
        	l1 = l1.next;
        	l2 = l2.next;
        }
        
        if (l2 != null) {
        	cur_1_pre.next = l2;
		}
        
        while (l1 != null) {
        	if (l1.val >= 10) {
        		l1.val = l1.val %10;
        		if (l1.next == null) {
					ListNode node = new ListNode(1);
					l1.next = node;
				} else {
					l1.next.val++;
				}
			}
        	l1 = l1.next;
        }
        
        return head;
    }
}