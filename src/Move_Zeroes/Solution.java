/**   
 * @Title: Solution.java 
 * @Package: Move_Zeroes 
 * @Description: TODO
 * @author yao_wang 
 * @date 2015-11-10 9:24:46 
 * @version V1.0   
 */
package Move_Zeroes;

/**
 * @ClassName: Solution
 * @Description: TODO
 * @author yao_wang
 * @date 2015-11-10
 * 
 */
public class Solution {
	
	public void moveZeroes(int[] nums) {
		
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[index] = nums[i];
				index++;
			}
			if (i == nums.length-1) {
				for (; index < nums.length; index++) {
					nums[index] = 0;
				}
			}
		}
		
	}
	
	
	public void moveZeroes_v1(int[] nums) {
		int zeroNum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				zeroNum++;
			}
		}
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[index] = nums[i];
				index++;
			}
		}
		for (int i = 0; i < zeroNum; i++) {
			nums[nums.length-1-i] = 0;
		}
		
	}
}
