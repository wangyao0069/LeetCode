package Median_of_Two_Sorted_Arrays;

public class Solution {
	
	/**
	 * 564ms 84%
	 * 
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] whole = new int[nums1.length + nums2.length];
		int j = 0;
		int k = 0;
		int i = 0;
		while (i < whole.length && j < nums1.length && k < nums2.length) {
			if (nums1[j] < nums2[k]) {
				whole[i++] = nums1[j++];
			} else {
				whole[i++] = nums2[k++];
			}
		}
		while (j < nums1.length) {
			whole[i++] = nums1[j++];
		}
		while (k < nums2.length) {
			whole[i++] = nums2[k++];
		}

		if (whole.length % 2 == 0) {
			int index = whole.length / 2;
			return (double) (whole[index - 1] + whole[index]) / 2;
		} else {
			return (double) (whole[whole.length / 2]);
		}
	}
}
