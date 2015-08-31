package Letter_Combinations_of_a_Phone_Number;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test() {
		solution.letterCombinations("23");
		
	}

}
