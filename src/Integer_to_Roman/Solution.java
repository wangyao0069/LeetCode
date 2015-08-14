package Integer_to_Roman;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	/**396ms
	 * @param num
	 * @return
	 */
	public String intToRoman(int num) {
		String[] map = new String[]{"I","V","X","L","C","D","M"};
		
		StringBuffer sbBuffer = new StringBuffer();
		
		for (int unit = 1; num != 0; num = num/10, unit = unit*10) {
			int toR = num % 10;
			String s_1 = null;
			String s_5 = null;
			String s_10 = null;
			if (unit == 1) {
				s_1 = map[0];
				s_5 = map[1];
				s_10 = map[2];
			} else if (unit == 10) {
				s_1 = map[2];
				s_5 = map[3];
				s_10 = map[4];
			} else if (unit == 100) {
				s_1 = map[4];
				s_5 = map[5];
				s_10 = map[6];
			} else if (unit == 1000) {
				s_1 = map[6];
			}
			
			if (1 <= toR && toR <= 3) {
				for (int i = 0; i < toR; i++) {
					sbBuffer.insert(0, s_1);
				}
			} else if (toR == 4) {
				sbBuffer.insert(0, s_5);
				sbBuffer.insert(0, s_1);
			} else if (5 <= toR && toR <= 8) {
				for (int i = 0; i < toR - 5; i++) {
					sbBuffer.insert(0, s_1);
				}
				sbBuffer.insert(0, s_5);
			} else if (toR == 9) {
				sbBuffer.insert(0, s_10);
				sbBuffer.insert(0, s_1);
			}
			//toR==0 do nothing
		}
		
		return sbBuffer.toString();
	}
	

	/**map append 440 ms
	 *map insert 464ms
	 * @param num
	 * @return
	 */
	public String intToRoman_bak(int num) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "I");
		map.put(5, "V");
		map.put(10, "X");
		map.put(50, "L");
		map.put(100, "C");
		map.put(500, "D");
		map.put(1000, "M");
		
		StringBuffer sbBuffer = new StringBuffer();
		
		for (int unit = 1; num != 0; num = num/10, unit = unit*10) {
			int toR = num % 10;
			if (1 <= toR && toR <= 3) {
				for (int i = 0; i < toR; i++) {
					sbBuffer.insert(0, map.get(1*unit));
				}
			} else if (toR == 4) {
				sbBuffer.insert(0, map.get(5*unit));
				sbBuffer.insert(0, map.get(1*unit));
			} else if (5 <= toR && toR <= 8) {
				for (int i = 0; i < toR - 5; i++) {
					sbBuffer.insert(0, map.get(unit*1));
				}
				sbBuffer.insert(0, map.get(unit*5));
			} else if (toR == 9) {
				sbBuffer.insert(0, map.get(10*unit));
				sbBuffer.insert(0, map.get(1*unit));
			}
			//toR==0 do nothing
		}
		
		//sbBuffer.reverse();
		
		return sbBuffer.toString();
	}
	
	/**
	 * map 436 ms
	 * String[] 424ms
	 * for high performance
	 * @param num
	 * @return
	 */
	public String intToRoman2(int num) {
		/*
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "I");
		map.put(2, "II");
		map.put(3, "III");
		map.put(4, "IV");
		map.put(5, "V");
		map.put(6, "VI");
		map.put(7, "VII");
		map.put(8, "VIII");
		map.put(9, "IX");
		
		map.put(10, "X");
		map.put(20, "XX");
		map.put(30, "XXX");
		map.put(40, "XL");
		map.put(50, "L");
		map.put(60, "LX");
		map.put(70, "LXX");
		map.put(80, "LXXX");
		map.put(90, "XC");
		
		map.put(100, "C");
		map.put(200, "CC");
		map.put(300, "CCC");
		map.put(400, "CD");
		map.put(500, "D");
		map.put(600, "DC");
		map.put(700, "DCC");
		map.put(800, "DCCC");
		map.put(900, "CM");
		
		map.put(1000, "M");
		map.put(2000, "MM");
		map.put(3000, "MMM");
		*/
		
		String[] unit1 = new String[]{"I","II","III","IV","V","VI","VII","VIII","IX"};
		String[] unit10 = new String[]{"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String[] unit100 = new String[]{"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String[] unit1000 = new String[]{"M","MM","MMM"};
		StringBuffer sbBuffer = new StringBuffer();
		
		for (int unit = 1; num != 0; num = num/10, unit = unit*10) {
			int toR = num % 10;
			if (toR != 0) {
				String[] pStrings = null;
				if (unit == 1) {
					pStrings = unit1;
				} else if (unit == 10) {
					pStrings = unit10;
				} else if (unit == 100) {
					pStrings = unit100;
				} else if (unit == 1000) {
					pStrings = unit1000;
				}
				sbBuffer.insert(0, pStrings[toR-1]);
			}
			//toR==0 do nothing
		}
		
		return sbBuffer.toString();
	}
}
