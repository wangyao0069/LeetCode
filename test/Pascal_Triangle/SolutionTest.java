package Pascal_Triangle;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Pascal_Triangle.Solution;
import Util.*;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test1() {
		solution.generate(1);
	}
	@Test
	public void test2() {
		solution.generate(2);
	}
	@Test
	public void test3() {
		solution.generate(3);
	}
	@Test
	public void test4() {
		solution.generate(5);
	}

}
