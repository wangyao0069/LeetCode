package Remove_Nth_Node_From_End_of_List;

public class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {

		ListNode first = head;
		ListNode second = head;

		int i = 0;
		while (first != null) {
			if (i > n) {
				second = second.next;
			}
			i++;
			first = first.next;
		}

		if (i <= n) {
			return second.next;
		}
		
		second.next = second.next.next;

		return head;
	}
}
