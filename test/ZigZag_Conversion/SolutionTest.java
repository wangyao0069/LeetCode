package ZigZag_Conversion;

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
		String ret = solution.convert("PAYPALISHIRING", 3);
		Assert.assertEquals("PAHNAPLSIIGYIR", ret);
	}

	@Test
	public void test1() {
		String ret = solution.convert("PAYPALISHIRING", 4);
		Assert.assertEquals("PINALSIGYAHRPI", ret);
	}

	@Test
	public void test2() {
		String ret = solution.convert("PAYPALISHIRING", 2);
		Assert.assertEquals("PYAIHRNAPLSIIG", ret);
	}

}
