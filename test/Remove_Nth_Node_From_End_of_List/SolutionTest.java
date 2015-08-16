package Remove_Nth_Node_From_End_of_List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Remove_Nth_Node_From_End_of_List.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}
	@Test
	public void testRemoveNthFromEnd1() {
		ListNode head = new ListNode(1);
		/*
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		head.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;*/
		
		solution.removeNthFromEnd(head, 1);
	}
	
	@Test
	public void testRemoveNthFromEnd2() {
		ListNode head = new ListNode(1);
		ListNode l2 = new ListNode(2);
		head.next = l2;
		/*
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		head.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;*/
		
		solution.removeNthFromEnd(head, 2);
	}

}
