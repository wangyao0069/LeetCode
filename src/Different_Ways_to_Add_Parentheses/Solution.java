package Different_Ways_to_Add_Parentheses;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

	public List<Integer> diffWaysToCompute(String input) {
		List<Integer> rst = new ArrayList<Integer>();
		List<Integer> subrst = new ArrayList<Integer>();
		List<Integer> number = new ArrayList<Integer>();
		List<String> sign = new ArrayList<String>();
		char[] charelement = input.toCharArray();
		String entire = "";
		int in = 0, is = 0;
		for (int i = 0; i < charelement.length; i++) {
			if (charelement[i] != '+' && charelement[i] != '-'
					&& charelement[i] != '*')
				entire = entire + charelement[i];
			else {
				number.add(Integer.parseInt(entire));
				in++;
				sign.add(String.valueOf(charelement[i]));
				entire = "";
			}

			if (i + 1 == charelement.length)
				number.add(Integer.parseInt(entire));
		}

		if (number.size() == 1) {
			rst.add(number.get(0));
			return rst;
		}
		for (int i = 0; i < number.size() - 1; i++) {
			subrst = action(0, i + 1, number.size(), number, sign);
			for (int j = 0; j < subrst.size(); j++) {
				rst.add(subrst.get(j));
			}
		}

		return rst;
	}

	public List<Integer> action(int s, int m, int e, List<Integer> number,
			List<String> sign) {

		List<Integer> left = new ArrayList<Integer>(), right = new ArrayList<Integer>(), result = new ArrayList<Integer>();
		List<Integer> lefts = new ArrayList<Integer>(), rights = new ArrayList<Integer>();
		int signindex = 0;

		if (s + 1 >= m) {
			lefts.add(number.get(s));
			signindex = s;
		} else {
			for (int i = s + 1; i < m; i++) {
				List<Integer> leftss = new ArrayList<Integer>();
				signindex = i;
				leftss = action(s, i, m, number, sign);
				for (int j = 0; j < leftss.size(); j++) {
					lefts.add(leftss.get(j));
				}
			}
		}

		if (m >= e - 1) {
			rights.add(number.get(e - 1));
		} else {
			for (int i = m + 1; i < e; i++) {
				List<Integer> rightss = new ArrayList<Integer>();
				rightss = action(m, i, e, number, sign);
				for (int j = 0; j < rightss.size(); j++) {
					rights.add(rightss.get(j));
				}
			}
		}

		for (int j = 0; j < lefts.size(); j++) {
			for (int x = 0; x < rights.size(); x++) {
				result.add(calculate(lefts.get(j), rights.get(x),
						sign.get(signindex)));
			}
		}

		return result;

	}

	public int calculate(int x, int y, String sign) {
		switch (sign) {
		case "+":
			return x + y;
		case "-":
			return x - y;
		case "*":
			return x * y;
		}
		return 0;
	}

	
	
	
	
	
	public List<Integer> diffWaysToCompute_v1(String input) {

		List<Integer> ret = new ArrayList<Integer>();
		if (input == null || input.length() == 0) {
			return ret;
		}

		List<Integer> nums = new LinkedList<Integer>();
		List<Character> operators = new LinkedList<Character>();

		StringBuffer tmpBuffer = new StringBuffer();
		for (int i = 0; i < input.length(); i++) {
			if ('0' <= input.charAt(i) && input.charAt(i) <= '9') {
				tmpBuffer.append(input.charAt(i));
			} else {
				operators.add(input.charAt(i));
				if (tmpBuffer.length() != 0) {
					nums.add(Integer.parseInt(tmpBuffer.toString()));
					tmpBuffer.setLength(0);
				}
			}
		}
		if (tmpBuffer.length() != 0) {
			nums.add(Integer.parseInt(tmpBuffer.toString()));
		}

		traversing(nums, operators, ret);

		return ret;

	}

	private void traversing(List<Integer> nums, List<Character> operators,
			List<Integer> ret) {

		if (nums.size() == 1) {
			ret.add(nums.get(0));
			// ret.add(compute(nums.get(0), nums.get(1), operators.get(0)));
		} else {
			for (int i = 0; i < nums.size() - 1; i++) {
				List<Integer> numsCopy = new LinkedList<Integer>(nums);
				List<Character> operatorsCopy = new LinkedList<Character>(
						operators);

				int re = compute(nums.get(i), nums.get(i + 1), operators.get(i));
				numsCopy.remove(i);
				numsCopy.remove(i);
				numsCopy.add(i, re);
				operatorsCopy.remove(i);
				traversing(numsCopy, operatorsCopy, ret);
			}
		}

	}

	private int compute(int a, int b, char op) {
		int ret = 0;
		switch (op) {
		case '+':
			ret = a + b;
			break;
		case '-':
			ret = a - b;
			break;
		case '*':
			ret = a * b;
			break;
		}
		return ret;
	}

}
