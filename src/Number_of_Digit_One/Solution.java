package Number_of_Digit_One;

import java.util.ArrayList;
import java.util.List;

public class Solution {
//	public int countDigitOne(int n) {
//		int ret = 0;
//		if (n <= 0) {
//			return ret;
//		}
//		
//		List<Integer> num = new ArrayList<Integer>();
//		List<Integer> reminderList = new ArrayList<Integer>();
//		for (int i = 0; n > 0; i++, n /= 10) {
//			Integer reminder = n % 10;
//			reminderList.add(reminder);
//			if (reminder == 0) {
//				num.add(0);
//			} else if (reminder == 1 && n/10 == 0) {
//				if (i == 0) {
//					num.add(1);
//				} else {
//					int index = reminderList.size()-2;
//					int prenum = reminderList.get(index)+1;
//					num.add(prenum);
//				}
//			} else {
//				if (i == 0) {
//					num.add(1);
//				} else {
//					num.add(10);
//				}
//			}
//		}
//		
//		for (int i = num.size()-1; i >= 0; i--) {
//			ret += (num.size() - i) * num.get(i);
//		}
//		
//		return ret;
//	}
}
