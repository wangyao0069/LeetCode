package Product_of_Array_Except_Self;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Product_of_Array_Except_Self.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test() {
		solution.productExceptSelf(new int[]{1,2,3,4});
	}

}
