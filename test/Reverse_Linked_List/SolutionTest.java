package Reverse_Linked_List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Reverse_Linked_List.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test() {
		ListNode head = new ListNode(0);
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		
		head.next = l1;
		l1.next = l2;
		
		ListNode ret = solution.reverseList(head);
		
	}

}
