package Roman_to_Integer;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Roman_to_Integer.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void testRomanToInt1() {
		int ret = solution.romanToInt("I");
		Assert.assertEquals(1, ret);
	}
	@Test
	public void testRomanToInt2() {
		int ret = solution.romanToInt("II");
		Assert.assertEquals(2, ret);
	}
	@Test
	public void testRomanToInt3() {
		int ret = solution.romanToInt("III");
		Assert.assertEquals(3, ret);
	}
	@Test
	public void testRomanToInt4() {
		int ret = solution.romanToInt("IV");
		Assert.assertEquals(4, ret);
	}
	@Test
	public void testRomanToInt5() {
		int ret = solution.romanToInt("V");
		Assert.assertEquals(5, ret);
	}
	@Test
	public void testRomanToInt6() {
		int ret = solution.romanToInt("VI");
		Assert.assertEquals(6, ret);
	}
	@Test
	public void testRomanToInt7() {
		int ret = solution.romanToInt("VII");
		Assert.assertEquals(7, ret);
	}
	@Test
	public void testRomanToInt8() {
		int ret = solution.romanToInt("VIII");
		Assert.assertEquals(8, ret);
	}
	@Test
	public void testRomanToInt9() {
		int ret = solution.romanToInt("IX");
		Assert.assertEquals(9, ret);
	}
	@Test
	public void testRomanToInt10() {
		int ret = solution.romanToInt("X");
		Assert.assertEquals(10, ret);
	}
	@Test
	public void testRomanToInt11() {
		int ret = solution.romanToInt("XXX");
		Assert.assertEquals(30, ret);
	}
	@Test
	public void testRomanToInt12() {
		int ret = solution.romanToInt("XL");
		Assert.assertEquals(40, ret);
	}
	@Test
	public void testRomanToInt13() {
		int ret = solution.romanToInt("XC");
		Assert.assertEquals(90, ret);
	}
	@Test
	public void testRomanToInt14() {
		int ret = solution.romanToInt("CD");
		Assert.assertEquals(400, ret);
	}
	@Test
	public void testRomanToInt15() {
		int ret = solution.romanToInt("CM");
		Assert.assertEquals(900, ret);
	}
	@Test
	public void testRomanToInt16() {
		int ret = solution.romanToInt("D");
		Assert.assertEquals(500, ret);
	}
	@Test
	public void testRomanToInt17() {
		int ret = solution.romanToInt("MMMI");
		Assert.assertEquals(3001, ret);
	}
	@Test
	public void testRomanToInt18() {
		int ret = solution.romanToInt("MMMCMXCIX");
		Assert.assertEquals(3999, ret);
	}
	@Test
	public void testRomanToInt19() {
		int ret = solution.romanToInt("MMDXXXIV");
		Assert.assertEquals(2534, ret);
	}
	@Test
	public void testRomanToInt20() {
		int ret = solution.romanToInt("MDCCCLXXXIV");
		Assert.assertEquals(1884, ret);
	}
}
