package Integer_to_Roman;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public String intToRoman(int num) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "I");
		map.put(5, "V");
		map.put(10, "X");
		map.put(50, "L");
		map.put(100, "C");
		map.put(500, "D");
		map.put(1000, "M");
		
		StringBuffer sbBuffer = new StringBuffer();
		

		return sbBuffer.toString();
	}
}
