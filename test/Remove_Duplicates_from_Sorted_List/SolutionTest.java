package Remove_Duplicates_from_Sorted_List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Remove_Duplicates_from_Sorted_List.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}
	@Test
	public void test1() {
		ListNode head = new ListNode(1);
		ListNode l1 = new ListNode(1);
		
		head.next = l1;
		
		solution.deleteDuplicates(head);
	}
	@Test
	public void test2() {
		ListNode head = new ListNode(1);
		//ListNode l1 = new ListNode(1);
		//head.next = l1;
		solution.deleteDuplicates(head);
	}
	@Test
	public void test3() {
		ListNode head = new ListNode(1);
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		head.next = l1;
		l1.next = l2;
		solution.deleteDuplicates(head);
	}
	@Test
	public void test4() {
		ListNode head = new ListNode(1);
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(2);
		head.next = l1;
		l1.next = l2;
		solution.deleteDuplicates(head);
	}

}
