package Remove_Duplicates_from_Sorted_List;

public class Solution {

	/**
	 * 348ms
	 * 
	 * @param head
	 * @return
	 */
	public ListNode deleteDuplicates(ListNode head) {

		ListNode ret = head;
		while (head != null) {
			ListNode over = head.next;
			while (over != null && head.val == over.val) {
				over = over.next;
			}
			head.next = over;

			head = head.next;
		}

		return ret;
	}
}
