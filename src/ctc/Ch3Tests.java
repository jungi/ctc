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

	
	// CH3 PR4:
	// TOWER OF HANOI!!
	@Test
	public void Ch3Pr4Test1() {
		Ch3Pr1Stack stack1 = new Ch3Pr1Stack();
		Ch3Pr1Stack stack2 = new Ch3Pr1Stack();
		Ch3Pr1Stack stack3 = new Ch3Pr1Stack();
		for (int i = 7; i > 0; i--) {
			stack1.push(i);
		}
		
		Ch3Pr4.towersOfHanoi(stack1, stack2, stack3);
		
		for (int i = 1; i < 8; i++) {
			assertEquals(i, stack3.pop());
		}
	}
	
	// CH3 PR4:
	// TOWER OF HANOI!!
	@Test
	public void Ch3Pr4Test2() {
		Ch3Pr1Stack stack1 = new Ch3Pr1Stack();
		Ch3Pr1Stack stack2 = new Ch3Pr1Stack();
		Ch3Pr1Stack stack3 = new Ch3Pr1Stack();
		for (int i = 1000; i > 0; i--) {
			stack1.push(i);
		}
		
		Ch3Pr4.towersOfHanoi(stack1, stack2, stack3);
		
		for (int i = 1; i < 1000; i++) {
			assertEquals(i, stack3.pop());
		}
	}
	
	// Ch3 Pr5 :
	// implement a queue using two stacks
	@Test
	public void Ch3Pr5Test1() {
		Ch3Pr5Queue q = new Ch3Pr5Queue();
		for (int i = 1; i <= 100; i++) {
			q.offer(i);
		}
		for (int i = 1; i <= 100; i++) {
			assertEquals(i, q.poll());
		}
	}
	
	// Ch3 Pr5 :
	// implement a queue using two stacks
	@Test
	public void Ch3Pr5Test2() {
		Ch3Pr5Queue q = new Ch3Pr5Queue();
		for (int i = 1; i <= 50; i++) {
			q.offer(i);
		}
		for (int i = 1; i <= 25; i++) {
			assertEquals(i, q.poll());
		}
		for (int i = 51; i <= 100; i++) {
			q.offer(i);
		}
		for (int i = 26; i <= 100; i++) {
			assertEquals(i, q.poll());
		}
	}
	
	
}
