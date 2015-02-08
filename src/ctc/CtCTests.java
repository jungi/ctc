package ctc;

import static org.junit.Assert.*;

import org.junit.Test;

public class CtCTests {

	@Test
	public void Problem1Test1() {
		assertTrue(Problem1.checkUnique("abcdefghijklmnopqrstuvwxyz"));
	}
	@Test
	public void Problem1Test2() {
		assertFalse(Problem1.checkUnique("24asdf87sfewiuhqo"));
	}
	@Test
	public void Problem1Test3() {
		assertFalse(Problem1.checkUnique("aaaaaaaaaa"));
	}
	@Test
	public void Problem2Test1() {
		assertTrue(Problem2.reverseString("abcde").equals("edcba"));
	}
	@Test
	public void Problem2Test2() {
		assertFalse(Problem2.reverseString("hello, world!").equals("hi"));
	}

}
