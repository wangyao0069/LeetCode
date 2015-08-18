package Divide_Two_Integers;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Divide_Two_Integers.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void testDivide() {
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		Stack<Integer> stack3 = new Stack<Integer>();
		int n1 = -1109186033;
		int n2 = -n1;
		int n3 = 1109186033;
		int x =1;
		for (int i = 0; i < 32; i++) {
			stack1.push((x&n1)==0?0:1);
			stack2.push((x&n2)==0?0:1);
			stack3.push((x&n3)==0?0:1);
			x = x << 1;
		}
		
		System.out.println("");
	
	
	}
	@Test
	public void testDivide1() {
		int ret = solution.divide(0, 1);
		Assert.assertEquals(0/1, ret);
	}
	@Test
	public void testDivide2() {
		int ret = solution.divide(4, -2);
		Assert.assertEquals(4/(-2), ret);
	}
	@Test
	public void testDivide3() {
		int ret = solution.divide(5, 2);
		Assert.assertEquals(5/2, ret);
	}
	@Test
	public void testDivide4() {
		int ret = solution.divide(-4, -2);
		Assert.assertEquals((-4)/(-2), ret);
	}
	@Test
	public void testDivide5() {
		int ret = solution.divide(5, -2);
		Assert.assertEquals(-5/2, ret);
	}
	@Test
	public void testDivide6() {
		int ret = solution.divide(Integer.MAX_VALUE, 1);
		Assert.assertEquals(Integer.MAX_VALUE, ret);
	}
	@Test
	public void testDivide7() {
		int ret = solution.divide(Integer.MIN_VALUE, 1);
		Assert.assertEquals(Integer.MIN_VALUE, ret);
	}
	@Test
	public void testDivide8() {
		int ret = solution.divide(1233454, 123);
		Assert.assertEquals(1233454/123, ret);
	}
	@Test
	public void testDivide9() {
		int ret = solution.divide(-1010369383, -2147483648);
		Assert.assertEquals((-1010369383)/(-2147483648), ret);
	}
	@Test
	public void testDivide10() {
		int ret = solution.divide(-1010369383, -2147483648);
		Assert.assertEquals((-1010369383)/(-2147483648), ret);
	}
	@Test
	public void testDivide11() {
		int ret = solution.divide(1010369383, -2147483648);
		Assert.assertEquals((1010369383)/(-2147483648), ret);
	}
	@Test
	public void testDivide12() {
		int ret = solution.divide(-2147483648, -1010369383);
		Assert.assertEquals((-2147483648)/(-1010369383), ret);
	}
	@Test
	public void testDivide13() {
		int ret = solution.divide(-2147483648, 1);
		Assert.assertEquals((-2147483648)/(1), ret);
	}
//	@Test
//	public void testDivide14() {
//		int ret = solution.divide(-2147483648, -1);
//		int aa = (-2147483648)/(-1);
//		Assert.assertEquals((-2147483648)/(-1), ret);
//	}
	@Test
	public void testDivide15() {
		int ret = solution.divide(-2147483648, -1109186033);
		Assert.assertEquals((-2147483648)/(-1109186033), ret);
	}
	@Test
	public void testDivide16() {
		int ret = solution.divide(-2147483648, -2147483648);
		Assert.assertEquals((-2147483648)/(-2147483648), ret);
	}
	
}
