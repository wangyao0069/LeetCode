package Remove_Linked_List_Elements;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Remove_Linked_List_Elements.Solution;

public class SolutionTest {

	private Solution solution;
	private ListNode head;
	private ListNode l1;
	private ListNode l2;
	private ListNode l3;
	private ListNode l4;
	private ListNode l5;
	@Before
	public void before() {
		solution = new Solution();
		head = new ListNode(1);
		l1 = new ListNode(1);
		l2 = new ListNode(2);
		l3 = new ListNode(2);
		l4 = new ListNode(3);
		l5 = new ListNode(3);
	}

	@Test
	public void testRemoveElements1() {
		solution.removeElements(head, 1);
	}
	@Test
	public void testRemoveElements2() {
		head.next = l1;
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		solution.removeElements(head, 1);
	}
	@Test
	public void testRemoveElements3() {
		head.next = l1;
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		solution.removeElements(head, 2);
	}
	@Test
	public void testRemoveElements4() {
		head.next = l1;
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		solution.removeElements(head, 3);
	}
	@Test
	public void testRemoveElements5() {
		solution.removeElements(null, 1);
	}
}
