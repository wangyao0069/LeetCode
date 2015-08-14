package Reverse_Linked_List;

public class Solution {

	public ListNode reverseList_itr(ListNode head) {

		ListNode next = null;
		ListNode first = head;
		if (head != null) {
			next = head.next;
		} else {
			return null;
		}
		while (next != null) {
			ListNode t = next.next;
			next.next = head;

			head = next;
			next = t;
		}
		first.next = null;

		return head;
	}

	public ListNode reverseList(ListNode head) {

		if (head == null) {
			return null;
		}

		ListNode ret = re(head);

		head.next = null;

		return ret;

	}

	public ListNode re(ListNode head) {
		if (head == null) {
			return null;
		}

		if (head.next == null) {
			return head;
		}
		ListNode ret = re(head.next);
		head.next.next = head;

		return ret;
	}

}
