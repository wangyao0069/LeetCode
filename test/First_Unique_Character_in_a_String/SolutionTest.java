package First_Unique_Character_in_a_String;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import First_Unique_Character_in_a_String.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}
	
	@Test
	public void test() {
		int ret = solution.firstUniqChar("loveleetcode");
		
		Assert.assertEquals(2, ret);
	}

}
