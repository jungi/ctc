package ctc;

public class Ch3Pr5Queue {
	Ch3Pr1Stack stack1;
	Ch3Pr1Stack stack2;
	
	public Ch3Pr5Queue() {
		stack1 = new Ch3Pr1Stack();
		stack2 = new Ch3Pr1Stack();
	}

	public void offer(int i) {
		stack1.push(i);
	}

	public int poll() {
		if (!stack2.isEmpty()) {
			return stack2.pop();
		}
		else {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
			return stack2.pop();
		}
	}

}
