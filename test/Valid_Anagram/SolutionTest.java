package Valid_Anagram;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Valid_Anagram.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}
	
	@Test
	public void testIsAnagram1() {
		boolean ret = solution.isAnagram("", "");
		Assert.assertEquals(true, ret);
	}
	@Test
	public void testIsAnagram2() {
		boolean ret = solution.isAnagram("as", "sa");
		Assert.assertEquals(true, ret);
	}
	@Test
	public void testIsAnagram3() {
		boolean ret = solution.isAnagram("as", "as");
		Assert.assertEquals(true, ret);
	}
	@Test
	public void testIsAnagram4() {
		boolean ret = solution.isAnagram("anagram", "nagaram");
		Assert.assertEquals(true, ret);
	}
	@Test
	public void testIsAnagram5() {
		boolean ret = solution.isAnagram("a", "b");
		Assert.assertEquals(false, ret);
	}

}
