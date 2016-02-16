package ZigZag;

public class Solution {
	public static int zigZag(int[] seque){
		int[] len = new int[seque.length];
		int[] symbol = new int[seque.length];
		
		len[0] = 1;
		
		for (int i = 1; i < len.length; i++) {

			symbol[i] = seque[0]-seque[i];
			if (symbol[i] == 0) {
				len[i] = 1;
			} else {
				len[i] = 2;
			}
			for (int j = i-1; j > 0; j--) {
				if (len[j] >= len[i] && (symbol[j]*(seque[j]-seque[i]) < 0)) {
					len[i] = len[j]+1;
					symbol[i] = seque[j]-seque[i];
				}
			}
		}
		
		return len[seque.length-1];
	}
}
