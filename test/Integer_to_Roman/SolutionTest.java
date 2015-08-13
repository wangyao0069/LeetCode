package Integer_to_Roman;

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
	public void testIntToRoman1() {
		String retString = solution.intToRoman(1);
		String expected = "";
		Assert.assertEquals(expected, retString);
	}

}
