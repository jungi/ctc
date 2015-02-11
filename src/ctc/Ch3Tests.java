package ctc;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ch3Tests {

	@Test
	public void Ch3Pr1Test() {
		Ch3Pr1Stack stack = new Ch3Pr1Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		assertEquals(3, stack.peek());
		assertEquals(3, stack.pop());
		assertEquals(2, stack.pop());
		assertEquals(1, stack.pop());
		//returns -1 when empty
		assertEquals(-1, stack.pop());
	}
	
	@Test
	public void Ch3Pr2Test() {
		Ch3Pr2Stack stack = new Ch3Pr2Stack();
		stack.push(4);
		stack.push(2);
		stack.push(6);
		stack.push(2);
		stack.push(7);
		stack.push(1);
		stack.push(1);
		stack.push(5);

		assertEquals(1, stack.min());
		stack.pop();
		stack.pop();
		assertEquals(1, stack.min());
		stack.pop();
		assertEquals(2, stack.min());

	}

}
