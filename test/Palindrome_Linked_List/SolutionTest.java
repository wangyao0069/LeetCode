package Palindrome_Linked_List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Palindrome_Linked_List.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();

	}

	@Test
	public void testIsPalindrome1() {
		ListNode head = new ListNode(0);
		boolean ret = solution.isPalindrome(head);
		Assert.assertEquals(true, ret);
	}
	@Test
	public void testIsPalindrome2() {
		ListNode head = new ListNode(0);
		ListNode l1 = new ListNode(0);
		head.next = l1;
		boolean ret = solution.isPalindrome(head);
		Assert.assertEquals(true, ret);
	}
	@Test
	public void testIsPalindrome3() {
		ListNode head = new ListNode(0);
		ListNode l1 = new ListNode(1);
		head.next = l1;
		boolean ret = solution.isPalindrome(head);
		Assert.assertEquals(false, ret);
	}
	@Test
	public void testIsPalindrome4() {
		ListNode head = new ListNode(0);
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(0);
		head.next = l1;
		l1.next = l2;
		boolean ret = solution.isPalindrome(head);
		Assert.assertEquals(true, ret);
	}
	@Test
	public void testIsPalindrome5() {
		ListNode head = new ListNode(0);
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		head.next = l1;
		l1.next = l2;
		boolean ret = solution.isPalindrome(head);
		Assert.assertEquals(false, ret);
	}
	@Test
	public void testIsPalindrome6() {
		ListNode head = new ListNode(0);
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(1);
		ListNode l3 = new ListNode(0);
		head.next = l1;
		l1.next = l2;
		l2.next = l3;
		boolean ret = solution.isPalindrome(head);
		Assert.assertEquals(true, ret);
	}
	@Test
	public void testIsPalindrome7() {
		ListNode head = new ListNode(0);
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(1);
		ListNode l4 = new ListNode(0);
		head.next = l1;
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		boolean ret = solution.isPalindrome(head);
		Assert.assertEquals(true, ret);
	}
	@Test
	public void testIsPalindrome8() {
		boolean ret = solution.isPalindrome(null);
		Assert.assertEquals(true, ret);
	}
	@Test
	public void testIsPalindrome9() {
		ListNode head = new ListNode(1);
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(1);
		head.next = l1;
		l1.next = l2;
		l2.next = l3;
		boolean ret = solution.isPalindrome(head);
		Assert.assertEquals(false, ret);
	}


}
