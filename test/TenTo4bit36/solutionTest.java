package TenTo4bit36;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import TenTo4bit36.solution;
import Util.*;

public class solutionTest {
	
	private solution solution;
	
	@Before
	public void before() {
		solution = new solution();
	}

	@Test
	public void test() {
		String ret = solution.get4bit36(1);
		Assert.assertEquals("0001", ret);
		Assert.assertEquals("000A", solution.get4bit36(10));
		Assert.assertEquals("000K", solution.get4bit36(20));
		Assert.assertEquals("000Z", solution.get4bit36(35));
		Assert.assertEquals("0010", solution.get4bit36(36));
		Assert.assertEquals("002S", solution.get4bit36(100));
		Assert.assertEquals("01JK", solution.get4bit36(2000));
		
	}

}
