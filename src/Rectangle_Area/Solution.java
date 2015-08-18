package Rectangle_Area;

public class Solution {

	/**408ms
	 * @param A
	 * @param B
	 * @param C
	 * @param D
	 * @param E
	 * @param F
	 * @param G
	 * @param H
	 * @return
	 */
	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int result =  (C-A ) * (D-B) + (G-E) * (H-F);
        if ( overlap(A,C, E,G) > 0 && overlap(B,D,F,H) > 0)
            result -= overlap(A,C, E,G)* overlap(B,D,F,H) ;

        return result;
    }

    int overlap(int s1, int e1, int s2, int e2) {
        if (s2 > e1 || s1 > e2) return 0;
        return Math.min(e1,e2) - Math.max(s1,s2);
    }
	
	/**
	 * 432ms
	 * @param A
	 * @param B
	 * @param C
	 * @param D
	 * @param E
	 * @param F
	 * @param G
	 * @param H
	 * @return
	 */
	public int computeArea_v1(int A, int B, int C, int D, int E, int F, int G,
			int H) {

		int rectangle1 = Math.abs(C - A) * Math.abs(D - B);
		int rectangle2 = Math.abs(G - E) * Math.abs(H - F);

		int over_w = getOverLength(A, C, E, G);
		int over_h = getOverLength(B, D, F, H);

		return rectangle1 + rectangle2 - over_h * over_w;

	}

	private int getOverLength(int a, int b, int c, int d) {
		int max1 = a;
		int min1 = b;
		if (a < b) {
			max1 = b;
			min1 = a;
		}
		int max2 = c;
		int min2 = d;
		if (c < d) {
			max2 = d;
			min2 = c;
		}

		if (max1 <= min2 || max2 <= min1) {
			return 0;
		} else if (max1 <= max2 && min2 <= min1) {
			return max1 - min1;
		} else if (max2 <= max1 && min1 <= min2) {
			return max2 - min2;
		} else if (max2 >= min1 && max1 >= max2) {
			return max2-min1;
		} else {
			return max1-min2;
		}
	}
}
