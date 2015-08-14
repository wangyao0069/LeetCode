package Container_With_Most_Water;

public class Solution {

	/**Copy from other's solution
	 * don't know how to prove
	 * @param height
	 * @return
	 */
	public int maxArea(int[] height) {
		int start = 0;
		int end = height.length - 1;
		int max = 0;
		int area = 0;

		if (height.length == 0 || height.length == 1) {
			return 0;
		}
		// two-pointer scan, start from both sides of the array
		while (start < end) {
			area = getArea(height, start, end);
			if (area > max) {
				max = area;
			}

			if (height[start] < height[end]) {
				start++;
			} else {
				end--;
			}

		}

		return max;
	}

	public int getArea(int[] height, int start, int end) {
		int Height = Math.min(height[start], height[end]);
		return Height * (end - start);
	}

	public int maxArea_bak(int[] height) {

		int[] area = new int[height.length];

		for (int i = 0; i < height.length; i++) {
			int f = searchFromFront(i, height);
			int b = searchFromBack(i, height);
			area[i] = max(i - f, b - i) * height[i];
		}

		int max = 0;
		for (int i = 0; i < height.length; i++) {
			if (max < area[i]) {
				max = area[i];
			}
		}

		return max;
	}

	private int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	private int searchFromBack(int index, int[] height) {
		int j = index;
		for (int i = height.length - 1; i > index; i--) {
			if (height[index] <= height[i]) {
				j = i;
				break;
			}
		}
		return j;
	}

	private int searchFromFront(int index, int[] height) {
		int j = index;
		for (int i = 0; i < index; i++) {
			if (height[index] <= height[i]) {
				j = i;
				break;
			}
		}
		return j;
	}
}
