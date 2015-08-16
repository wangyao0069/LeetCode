package Three_Sum_Cloesst;

import java.util.Arrays;
import java.util.Map;

public class Solution {
	
	
	/**
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int threeSumClosest_bak(int[] nums, int target) {
       Arrays.sort(nums);
       int min = Integer.MAX_VALUE;
       int result = target;
       for(int i=0;i<nums.length-2;i++)
       {
           int start = i+1;
           int end = nums.length-1;
           while(start < end)
           {   
               int temp_sum = nums[i]+nums[start]+nums[end];

               if(target < temp_sum)
               {
                   if(temp_sum-target < min)
                       {
                           min = temp_sum-target;
                           result = temp_sum;
                       }
                   while(start < end && nums[end]==nums[end-1]) end--;
                   end--;
               }
               else
               if(target > temp_sum)
               {
                    if(target-temp_sum < min)
                   {
                       min = target-temp_sum;
                       result = temp_sum;
                   }
                   while(start < end && nums[start]==nums[start+1]) start++;
                   start++;
               }
               else return target;
           }
       }
       return result;
   }
	
	
	
	/**
	 * slow
	 * @param nums
	 * @param target
	 * @return
	 */
	public int threeSumClosest(int[] nums, int target) {
/*
		// null or 0
		if (nums == null || nums.length == 0) {
			return 0;
		}
		//[1,3]
		if (nums.length <= 3) {
			int sum = 0;
			for (int i = 0; i < nums.length; i++) {
				sum += nums[i];
			}
			return sum;
		}*/
		//[4,inf)
		heapSort(nums);
		//Arrays.sort(nums);
		
		long closest = Integer.MAX_VALUE;
		
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				int t = target - nums[i] - nums[j];
				int index = searchThird(nums, i, j, t, 0, nums.length-1);
				if (Math.abs(nums[index]-t) < Math.abs(closest-target)) {
					closest = nums[i] +  nums[j] + nums[index];
				}
			}
		}
		
		return (int)closest;
	}
	
	//return index
	private int searchThird(int[] nums, int i, int j, int t, int s, int e) {
		if (nums[s] <= t && t <= nums[e]) {
			if (e - s <= 6) {
				int a = Integer.MAX_VALUE;
				int ret = 0;
				for (int k = s; k <= e; k++) {
					if (a > Math.abs(nums[k]-t) && k != i && k != j) {
						a = Math.abs(nums[k]-t);
						ret = k;
					}
				}
				return ret;
			} else {
				if (nums[s+(e-s)/2] < t) {
					return searchThird(nums, i, j, t, s+(e-s)/2, e);
				} else if (nums[s+(e-s)/2] > t) {
					return searchThird(nums, i, j, t, s, s+(e-s)/2);
				} else {
					return s+(e-s)/2;
				}
			}
		} else if (t < nums[s]) {
			while ((s == i || s==j) && e > s) {
				s++;
			}
			return s;
		} else if (t > nums[e]) {
			while ((e == i || e==j) && e > s) {
				e--;
			}
			return e;
		}
		
		return e;
	}
	
	private void heapSort(int[] nums) {
		//build heap
		for (int i = nums.length/2; i >= 0; i--) {
			adjust(nums, i, nums.length);
		}
		
		for (int i = nums.length-1; i >= 0; i--) {
			swap(nums, 0, i);
			adjust(nums, 0, i);
		}
	}
	
	private void swap(int[] nums, int a, int b) {
		int t = nums[a];
		nums[a] = nums[b];
		nums[b] = t;
	}
	
	private void adjust(int[] nums, int index, int length){
		
		int leftChild = leftChild(index);
		int rightChild = rightChild(index);
		
		if (leftChild < length && nums[index] < nums[leftChild]) {
			swap(nums, index, leftChild);
			adjust(nums, leftChild, length);
		}
		if (rightChild < length && nums[index] < nums[rightChild]) {
			swap(nums, index, rightChild);
			adjust(nums, rightChild, length);
		}
		
	}
	
	private int leftChild(int index) {
		return ((index << 1) + 1);
	}
	
	private int rightChild(int index) {
		return ((index << 1) + 2);
	}
	
}
