package ctc;

public class Ch3Pr6 {

	// we only get one other stack
	public static Ch3Pr1Stack sortStack(Ch3Pr1Stack stack) {
		Ch3Pr1Stack stack2 = new Ch3Pr1Stack();

		while (!stack.isEmpty()) {
			int tmp = stack.pop();
			while (!stack2.isEmpty() && tmp < stack2.peek()) {
				stack.push(stack2.pop());
			}
			stack2.push(tmp);
		}
		return stack2;
	}

}

