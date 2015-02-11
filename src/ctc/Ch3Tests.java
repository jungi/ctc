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

}
