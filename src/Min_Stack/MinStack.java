package Min_Stack;

import java.util.Stack;

/**
 * 424ms 92.11%
 * 
 * @author yao_wang
 *
 */
public class MinStack {
	private Stack<Integer> data;
	private int min;

	public MinStack() {
		data = new Stack<Integer>();
		min = Integer.MAX_VALUE;
	}

	public void push(int x) {
		data.push(x);
		if (x < min) {
			min = x;
		}
	}

	public void pop() {
		int pop = data.pop();
		if (pop == min) {
			min = Integer.MAX_VALUE;
			for (int i = 0; i < data.size(); i++) {
				if (min > data.get(i)) {
					min = data.get(i);
				}
			}
		}
	}

	public int top() {
		return data.peek();
	}

	public int getMin() {
		return min;
	}
}
