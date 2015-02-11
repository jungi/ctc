package ctc;

public class Ch3Pr2Stack {
	Ch3Pr1Stack stack;
	Ch3Pr1Stack minStack;
		
	public Ch3Pr2Stack() {
		stack = new Ch3Pr1Stack();
		minStack = new Ch3Pr1Stack();
	}
	
	public void push(int k) {
		stack.push(k);
		if (minStack.peek() >= k || minStack.topOfStack == null) {
			minStack.push(k);
		}
	}
	
	public int peek() {
		return stack.peek();
	}
	
	public int pop() {
		if (stack.peek() == minStack.peek()) {
			minStack.pop();
			return stack.pop();
		}
		else {
			return stack.pop();
		}
	}
	
	public int min() {
		return minStack.peek();
	}
	
}
