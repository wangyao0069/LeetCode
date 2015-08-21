package Merge_Sorted_Array;

public class Solution {
	/**
	 * 264ms
	 * 
	 * @param nums1
	 * @param m
	 * @param nums2
	 * @param n
	 */
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int p1 = m - 1;
		int p2 = n - 1;
		if (m == 0) {
			for (int i = 0; i < n; i++) {
				nums1[i] = nums2[i];
			}
		} else {
			for (int i = m + n - 1; i >= 0 && p1 >= 0 && p2 >= 0; i--) {
				if (nums1[p1] < nums2[p2]) {
					nums1[i] = nums2[p2];
					p2--;
				} else {
					nums1[i] = nums1[p1];
					p1--;
				}
			}
			while (p2 >= 0) {
				nums1[p2] = nums2[p2];
				p2--;
			}
		}

	}
}
