package Merge_Two_Sorted_Lists;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Merge_Two_Sorted_Lists.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void testMergeTwoLists() {
		ListNode head = new ListNode(0);
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		head.next = l2;
		l2.next = l4;
		l1.next = l3;
		//l3.next = l5;
		
		solution.mergeTwoLists(head, l1);
	}

}
