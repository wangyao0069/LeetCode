package Merge_Two_Sorted_Lists;

public class Solution {
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       if(l1==null || l2==null) return l1==null? l2 : l1;
        ListNode dummy = new ListNode(0);
        dummy.next = l1;
        ListNode p1 = dummy;
        ListNode p2 = l2; 

        while(p1.next!=null && p2!=null){
            if(p2.val<p1.next.val){
                ListNode t = p2;
                p2 = p2.next;
                t.next = p1.next;
                p1.next = t;
            }
            p1 = p1.next;
        }
        if(p1.next == null && p2!=null) p1.next = p2;
        return dummy.next;
		
    }

	public ListNode mergeTwoLists_v1(ListNode l1, ListNode l2) {

		ListNode head = new ListNode(0);
		ListNode ret = head;
	
		if (l2 != null && l1 == null) {
			return l2;
		} else
		if (l1 != null && l2 == null) {
			return l1;
		} else 
		if (l1 == null && l2 == null) {
			return null;
		} else {
			
			if (l2.val > l1.val) {
				head.val = l1.val;
				l1 = l1.next;
				head.next = l2;
				l2 = l2.next;
				head = head.next;
			} else {
				head.val = l2.val;
				l2 = l2.next;
				head.next = l1;
				l1 = l1.next;
				head = head.next;
			}
		}
		
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				head.next = l1;
				head = head.next;
				l1 = l1.next;
				head.next = l2;
				head = head.next;
				l2 = l2.next;
			} else {
				head = l2;
				head = head.next;
				l2 = l2.next;
				head.next = l1;
				head = head.next;
				l1 = l1.next;
			}
		}
		
		if (l1 != null) {
			head.next = l1;
		}
		
		if (l2 != null) {
			head.next = l2;
		}
		
		return ret;
		
	}
}
