package ctc;

public class Ch3Pr1Stack {
	int[] stack;
	Integer topOfStack;
	
	public Ch3Pr1Stack() {
		stack = new int[10];
	}
	
	public void resize(int k) {
		int[] newStack = new int[k];
		for (int i = 0; i <= topOfStack; i++) {
			newStack[i] = stack[i];
		}
		stack = newStack;
	}
	
	public void push(int k) {
		if (topOfStack == null) {
			topOfStack = 0;
			stack[topOfStack] = k;
		}
		else {
			topOfStack++;

			if (topOfStack >= stack.length - 1) {
				resize(topOfStack * 2);
			}
			
			stack[topOfStack] = k;
		}
	}
	
	public int peek() {
		if (topOfStack != null) { 
		return stack[topOfStack];
		}
		else {
			return -1;
		}
	}
	
	// return -1 when empty
	public int pop() {
		if (topOfStack != null) {
			int ret = stack[topOfStack];
			if (topOfStack == 0) {
				topOfStack = null;
			}
			else {
				topOfStack--;
				if (topOfStack == stack.length / 4 && stack.length > 4) {
					resize(stack.length / 2);
				}
			}
			return ret;
		} else
		{
			return -1;
		}
	}
	
	public boolean isEmpty() {
		return topOfStack == null;
	}
}
