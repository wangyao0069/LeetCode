package Add_Two_Numbers;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Test;

public class SolutionTest {

//	@Test
//	public void test() {
//		Solution suSolution = new Solution();
//		ListNode l1 = new ListNode(0);
//		
//		
//		ListNode l2 = new ListNode(0);
//		//
//		//ListNode l4 = new ListNode(7);
//		
//		//l2.next = l3;
//		//l3.next = l4;
//		
//		ListNode ret = suSolution.addTwoNumbers(l1, l2);
//		
//		while (ret != null) {
//			System.out.println(ret.val+"->");
//			ret = ret.next;
//		}
//		
//	}
	
	@Test
	public void test1() {
		Solution suSolution = new Solution();
		ListNode l1 = new ListNode(3);
		ListNode l3 = new ListNode(7);
		ListNode l4 = new ListNode(2);
		ListNode l2 = new ListNode(9);
		//
		//ListNode l4 = new ListNode(7);
		
		l1.next = l3;
		l2.next = l4;
		
		ListNode ret = suSolution.addTwoNumbers(l1, l2);
		
		while (ret != null) {
			System.out.println(ret.val+"->");
			ret = ret.next;
		}
	}

}
