package Missing_Number;

public class Solution {

	/**444ms
	 * @param nums
	 * @return
	 */
	public int missingNumber(int[] nums) {
		
		int length = nums.length+1;
		int expect_sum = (length-1)*length/2;
		int actual_sum = 0;
		for (int i = 0; i < nums.length; i++) {
			actual_sum += nums[i];
		}
		
		return expect_sum - actual_sum;
	}

}
