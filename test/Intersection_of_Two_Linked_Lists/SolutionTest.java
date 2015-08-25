package Intersection_of_Two_Linked_Lists;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Intersection_of_Two_Linked_Lists.Solution;
import Util.*;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test1() {
		ListNode a1 = new ListNode(1);
		ListNode a2 = new ListNode(2);
		ListNode c1 = new ListNode(31);
		ListNode c2 = new ListNode(32);
		ListNode c3 = new ListNode(33);
		ListNode b1 = new ListNode(21);
		ListNode b2 = new ListNode(22);
		ListNode b3 = new ListNode(23);
		
		a1.next = a2;
		a2.next = c1;
		b1.next = b2;
		b2.next = b3;
		b3.next = c1;
		c1.next = c2;
		c2.next = c3;
		
		ListNode ret = solution.getIntersectionNode(a1, b1);
		Assert.assertEquals(c1, ret);
	}
	
	@Test
	public void test2() {
		ListNode a1 = new ListNode(1);
		ListNode a2 = new ListNode(2);
		ListNode c1 = new ListNode(31);
		ListNode c2 = new ListNode(32);
		ListNode c3 = new ListNode(33);
		ListNode b1 = new ListNode(21);
		ListNode b2 = new ListNode(22);
		ListNode b3 = new ListNode(23);
		
//		a1.next = a2;
//		a2.next = c1;
//		b1.next = b2;
//		b2.next = b3;
//		b3.next = c1;
//		c1.next = c2;
//		c2.next = c3;
		
		ListNode ret = solution.getIntersectionNode(a1, a1);
		Assert.assertEquals(a1, ret);
	}
	

}
