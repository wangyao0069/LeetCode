package Integer_to_English_Word;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Integer_to_English_Word.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test1() {
		String ret = solution.numberToWords(12);
		Assert.assertEquals("Twelve", ret);
	}
	@Test
	public void test2() {
		String ret = solution.numberToWords(0);
		Assert.assertEquals("Zero", ret);
	}
	@Test
	public void test3() {
		String ret = solution.numberToWords(234);
		Assert.assertEquals("Two Hundred Thirty Four", ret);
	}
	@Test
	public void test4() {
		String ret = solution.numberToWords(123);
		Assert.assertEquals("One Hundred Twenty Three", ret);
	}
	@Test
	public void test5() {
		String ret = solution.numberToWords(12345);
		Assert.assertEquals("Twelve Thousand Three Hundred Forty Five", ret);
	}
	@Test
	public void test6() {
		String ret = solution.numberToWords(1234567);
		Assert.assertEquals("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven", ret);
	}
	@Test
	public void test7() {
		String ret = solution.numberToWords(1000010);
		Assert.assertEquals("One Million Ten", ret);
	}

}
