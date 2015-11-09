package TenTo4bit36;

public class solution {

	String get4bit36(int n){
		StringBuffer ret = new StringBuffer();
		if (n > 0) {
			char[] symbol = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
					 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
					 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
					 'U', 'V', 'W', 'X', 'Y', 'Z'};
			int i = 0;
			while (n>0) {
				int t = n%36;
				ret.insert(0, symbol[t]);
				n = n/36;
				i++;
			}
			while (i < 4) {
				ret.insert(0, '0');
				i++;
			}
		}
		
		return ret.toString();
	}
}
