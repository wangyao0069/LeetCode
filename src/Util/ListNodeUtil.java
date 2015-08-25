package Util;

public class ListNodeUtil {

	public static ListNode GetListNode(int[] nums) {
		ListNode head = null;
		if (nums.length == 0) {
			
		} else {
			head = new ListNode(nums[0]);
			ListNode cur = head;
			for (int i = 1; i < nums.length; i++) {
				ListNode t = new ListNode(nums[i]);
				cur.next = t;
				cur = cur.next;
			}
		}
		return head;
	}
}
