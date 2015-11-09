package Integer_to_English_Word;

public class Solution {
	/**324 ms
	 * @param num
	 * @return
	 */
	public String numberToWords(int num) {
		StringBuffer ret = new StringBuffer();

		String[] theUnits = { " Zero", " One", " Two", " Three", " Four", " Five",
				" Six", " Seven", " Eight", " Nine" };
		String[] tenTwenty = { " Ten", " Eleven", " Twelve", " Thirteen",
				" Fourteen", " Fifteen", " Sixteen", " Seventeen", " Eighteen", " Nineteen"};
		String[] tenUnits = { "", "", " Twenty", " Thirty", " Forty", " Fifty",
				" Sixty", " Seventy", " Eighty", " Ninety" };
		String[] units = { "", " Thousand", " Million", " Billion" };
		if (num == 0) {
			ret.append(theUnits[num]);
		} else {
			boolean nagetive = false;
			long numb = num;
			if (numb < 0) {
				nagetive = true;
				numb = -numb;
			}
			int i = 0;
			while (numb > 0) {
				int a = (int) (numb % 1000);
				

				int hundred = a / 100;
				int ten = (a % 100) / 10;
				int the = a % 10;
				if (hundred !=0 || ten !=0 || the !=0) {
					ret.insert(0, units[i]);
				}
				if (ten == 1) {
					ret.insert(0, tenTwenty[the]);
				} else {
					if (the != 0) {
						ret.insert(0, theUnits[the]);
					}
					ret.insert(0, tenUnits[ten]);
				}
				if (hundred != 0) {
					ret.insert(0, theUnits[hundred] + " Hundred");
				}

				numb /= 1000;
				i++;
			}
			if (nagetive) {
				ret.insert(0, "Nagetive");
			}
		}
		
		return ret.toString().trim();
	}
}
