package Product_of_Array_Except_Self;

public class Solution {
	
	public int[] productExceptSelf(int[] nums) {
        int[] ret = new int[nums.length];
        int ji = 1;
        for (int i = 0; i < nums.length; i++) {
        	ret[i] = ji;
        	ji *= nums[i];
        }
        ji = 1;
        for (int i = nums.length-1; i >= 0; i--) {
        	ret[i] *= ji;
        	ji *= nums[i];
        }

        return ret;
    }

	public int[] productExceptSelf_v1(int[] nums) {
        int[] ret = new int[nums.length];
        int ji = 1;
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                ji *= nums[i];
            else
                zeroCount++;
        }
        if (zeroCount > 1)
            return ret;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 && zeroCount == 0)
                ret[i] = ji/nums[i];
            else if (nums[i] != 0 && zeroCount == 1) {
                
            } else {
                ret[i] = ji;
            }
        }
        
        return ret;
    }
}
