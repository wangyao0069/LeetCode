/**   
 * @Title: Solution.java 
 * @Package: Bulls_and_Cows 
 * @Description: TODO
 * @author yao_wang 
 * @date 2015-11-9 11:17:43 
 * @version V1.0   
 */
package Bulls_and_Cows;

/**
 * @ClassName: Solution
 * @Description: TODO
 * @author yao_wang
 * @date 2015-11-9
 * 
 */
public class Solution {

	public String getHint(String secret, String guess) {
		StringBuffer ret = new StringBuffer(10);
		int [] map = new int[10];
		int bull = 0;
		int cow = 0;
		StringBuffer tmp = new StringBuffer();
		for (int i = 0; i < secret.length(); i++) {
			if (secret.charAt(i) == guess.charAt(i)) {
				bull++;
			} else {
				tmp.append(guess.charAt(i));
				int index = secret.charAt(i) - '0';
				map[index]++;
			}
		}
		
		for (int i = 0; i < tmp.length(); i++) {
			int index = tmp.charAt(i) - '0';
			if (map[index] > 0) {
				cow++;
				map[index]--;
			}
		}
		
		ret.append(bull);
		ret.append("A");
		ret.append(cow);
		ret.append("B");
		
		return ret.toString();
	}

}
