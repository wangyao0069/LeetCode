package Implement_Stack_using_Queues;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {

	private Queue<Integer> data;

	public MyStack() {
		data = new LinkedList<Integer>();
	}

	// Push element x onto stack.
	public void push(int x) {
		data.add(x);
	}

	// Removes the element on top of the stack.
	public void pop() {
		int size = data.size();

		for (int i = 0; i < size - 1; i++) {
			int t = data.poll();
			data.add(t);
		}
		data.poll();
	}

	// Get the top element.
	public int top() {
		int size = data.size();

		for (int i = 0; i < size - 1; i++) {
			int t = data.poll();
			data.add(t);
		}
		int ret = data.poll();
		data.add(ret);
		return ret;
	}

	// Return whether the stack is empty.
	public boolean empty() {
		Integer t = data.peek();
		if (t == null) {
			return true;
		} else {
			return false;
		}
	}
}