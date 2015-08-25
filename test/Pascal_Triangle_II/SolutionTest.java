package Pascal_Triangle_II;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Pascal_Triangle_II.Solution;
import Util.*;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test1() {
		List<Integer> ret = solution.getRow(1);
		System.out.println(ret.toString());
	}
	@Test
	public void test2() {
		List<Integer> ret = solution.getRow(2);
		System.out.println(ret.toString());
	}
	@Test
	public void test3() {
		List<Integer> ret = solution.getRow(3);
		System.out.println(ret.toString());
	}
	@Test
	public void test4() {
		List<Integer> ret = solution.getRow(4);
		System.out.println(ret.toString());
	}
	@Test
	public void test5() {
		List<Integer> ret = solution.getRow(5);
		System.out.println(ret.toString());
	}
	@Test
	public void test6() {
		List<Integer> ret = solution.getRow(0);
		System.out.println(ret.toString());
	}

}
