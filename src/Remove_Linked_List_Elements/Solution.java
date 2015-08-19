package Remove_Linked_List_Elements;

public class Solution {

	/**
	 * 352ms
	 * 
	 * @param head
	 * @param val
	 * @return
	 */
	public ListNode removeElements(ListNode head, int val) {

		ListNode preListNode = new ListNode(0);
		ListNode ret = preListNode;
		preListNode.next = head;
		while (preListNode.next != null) {
			if (preListNode.next.val == val) {
				preListNode.next = preListNode.next.next;
			} else {
				preListNode = preListNode.next;
			}
		}

		return ret.next;
	}
}
