package Implement_Queue_using_Stacks;

import java.util.Stack;

/**
 * 164ms
 * @author yao_wang
 *
 */
class MyQueue {

	//private Stack<Integer> empty;
	private Stack<Integer> full;

	public MyQueue() {
		full = new Stack<Integer>();
	}

	// Push element x to the back of queue.
	public void push(int x) {
		Stack<Integer> empty = new Stack<Integer>();
		while (!full.empty()) {
			empty.push(full.pop());
		}
		full.push(x);
		while (!empty.empty()) {
			full.push(empty.pop());
		}
	}

	// Removes the element from in front of queue.
	public void pop() {
		full.pop();
	}

	// Get the front element.
	public int peek() {

		int ret = full.peek();

		return ret;
	}

	// Return whether the queue is empty.
	public boolean empty() {
		return full.empty();
	}
}