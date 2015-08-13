package Median_of_Two_Sorted_Arrays;

public class Solution {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double ret = 0.0;
		int[] small = nums1;
		int[] big = nums2;

		if (nums1[0] > nums2[0]) {
			small = nums2;
			big = nums1;
		}

		if (small[small.length - 1] < big[big.length - 1]) {

		}

		return ret;
	}

	void search(int target1, int target2) {
		if (target2 == -1) {

		}
	}
}
