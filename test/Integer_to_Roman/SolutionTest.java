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
	/*
	@Test
	public void perform() {
		StringBuffer sbBuffer = new StringBuffer();
		StringBuffer sbBuffer1 = new StringBuffer();
		
		long s = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++)
			sbBuffer.insert(0, "a");
		long m = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++)
			sbBuffer1.append("a");
		long e = System.currentTimeMillis();
		
		System.out.println(m-s);
		System.out.println(e-s);
	}
	
*/
	@Test
	public void testIntToRoman1() {
		String retString = solution.intToRoman2(1);
		String expected = "I";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman2() {
		String retString = solution.intToRoman2(2);
		String expected = "II";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman3() {
		String retString = solution.intToRoman2(3);
		String expected = "III";
		Assert.assertEquals(expected, retString);
	}
	
	@Test
	public void testIntToRoman4() {
		String retString = solution.intToRoman2(30);
		String expected = "XXX";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman5() {
		String retString = solution.intToRoman2(300);
		String expected = "CCC";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman6() {
		String retString = solution.intToRoman2(3000);
		String expected = "MMM";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman7() {
		String retString = solution.intToRoman2(3001);
		String expected = "MMMI";
		Assert.assertEquals(expected, retString);
	}
	
	@Test
	public void testIntToRoman8() {
		String retString = solution.intToRoman2(4);
		String expected = "IV";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman9() {
		String retString = solution.intToRoman2(40);
		String expected = "XL";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman10() {
		String retString = solution.intToRoman2(400);
		String expected = "CD";
		Assert.assertEquals(expected, retString);
	}
	
	@Test
	public void testIntToRoman11() {
		String retString = solution.intToRoman2(5);
		String expected = "V";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman12() {
		String retString = solution.intToRoman2(6);
		String expected = "VI";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman13() {
		String retString = solution.intToRoman2(7);
		String expected = "VII";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman14() {
		String retString = solution.intToRoman2(8);
		String expected = "VIII";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman16() {
		String retString = solution.intToRoman2(50);
		String expected = "L";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman17() {
		String retString = solution.intToRoman2(60);
		String expected = "LX";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman18() {
		String retString = solution.intToRoman2(500);
		String expected = "D";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman19() {
		String retString = solution.intToRoman2(501);
		String expected = "DI";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman20() {
		String retString = solution.intToRoman2(600);
		String expected = "DC";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman21() {
		String retString = solution.intToRoman2(2534);
		String expected = "MMDXXXIV";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman22() {
		String retString = solution.intToRoman2(3999);
		String expected = "MMMCMXCIX";
		Assert.assertEquals(expected, retString);
	}
	
	
	
	
	@Test
	public void testIntToRoman111() {
		String retString = solution.intToRoman(1);
		String expected = "I";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman112() {
		String retString = solution.intToRoman(2);
		String expected = "II";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman113() {
		String retString = solution.intToRoman(3);
		String expected = "III";
		Assert.assertEquals(expected, retString);
	}
	
	@Test
	public void testIntToRoman114() {
		String retString = solution.intToRoman(30);
		String expected = "XXX";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman115() {
		String retString = solution.intToRoman(300);
		String expected = "CCC";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman116() {
		String retString = solution.intToRoman(3000);
		String expected = "MMM";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman117() {
		String retString = solution.intToRoman(3001);
		String expected = "MMMI";
		Assert.assertEquals(expected, retString);
	}
	
	@Test
	public void testIntToRoman118() {
		String retString = solution.intToRoman(4);
		String expected = "IV";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman119() {
		String retString = solution.intToRoman(40);
		String expected = "XL";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman120() {
		String retString = solution.intToRoman(400);
		String expected = "CD";
		Assert.assertEquals(expected, retString);
	}
	
	@Test
	public void testIntToRoman121() {
		String retString = solution.intToRoman(5);
		String expected = "V";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman122() {
		String retString = solution.intToRoman(6);
		String expected = "VI";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman123() {
		String retString = solution.intToRoman(7);
		String expected = "VII";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman124() {
		String retString = solution.intToRoman(8);
		String expected = "VIII";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman126() {
		String retString = solution.intToRoman(50);
		String expected = "L";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman127() {
		String retString = solution.intToRoman(60);
		String expected = "LX";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman128() {
		String retString = solution.intToRoman(500);
		String expected = "D";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman129() {
		String retString = solution.intToRoman(501);
		String expected = "DI";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman130() {
		String retString = solution.intToRoman(600);
		String expected = "DC";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman131() {
		String retString = solution.intToRoman(2534);
		String expected = "MMDXXXIV";
		Assert.assertEquals(expected, retString);
	}
	@Test
	public void testIntToRoman132() {
		String retString = solution.intToRoman(3999);
		String expected = "MMMCMXCIX";
		Assert.assertEquals(expected, retString);
	}
	
}
