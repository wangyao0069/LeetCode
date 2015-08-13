package Two_Sum;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

	@Test
	public void twoSumTest() {
		Solution suSolution = new Solution();
		int[] nums = new int[]{-1,-2,-3,-4,-5};
		int target = -8;
		int[] ret = suSolution.twoSum(nums, target);
		System.out.println(ret[0]+" "+ret[1]);
		Assert.assertArrayEquals(new int[]{1,2}, ret);
	}
	
	
}
