package House_Robber;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import House_Robber.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}


	@Test
	public void test() {
		int ret = solution.rob(new int[]{});
	}

}
