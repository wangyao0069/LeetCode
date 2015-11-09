package Different_Ways_to_Add_Parentheses;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Different_Ways_to_Add_Parentheses.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test1() {
		solution.diffWaysToCompute("2-1-1");
	}
	@Test
	public void test2() {
		solution.diffWaysToCompute("2*3-4*5");
	}
	@Test
	public void test3() {
		solution.diffWaysToCompute("0");
	}

}
