package ctc;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class CtCTests {

	// problem 1: 
	// check if all char in string are unique
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
	
	//problem 2:
	// reverse a string:
	@Test
	public void Problem2Test1() {
		assertTrue(Problem2.reverseString("abcde").equals("edcba"));
	}
	@Test
	public void Problem2Test2() {
		assertFalse(Problem2.reverseString("hello, world!").equals("hi"));
	}
	
	// problem 3:
	// check if two strings are permutations
	@Test
	public void Problem3Test1() {
		// the shining.. 
		assertTrue(Problem3.checkPermutation("redrum", "murder"));
	}
	@Test
	public void Problem3Test2() { 
		assertFalse(Problem3.checkPermutation("notpermu", "tation"));
	}
	
	// problem 4:
	// replace all apces with '%20'
	@Test
	public void Problem4Test1() {
		char[] inputJohnSmith = {'M', 'r', ' ', 'J', 'o', 'h','n', ' ', 'S',
				'm', 'i', 't', 'h', ' ', ' ', ' ', ' '};
		assertTrue(Problem4.replaceSpaces(inputJohnSmith, 13)
				.equals("Mr%20John%20Smith"));
	}
	
	// problem 5:
	// basic string compression	
	@Test
	public void Problem5Test1() { 
		assertTrue(Problem5.compressString("aabccccca").equals("a2b1c5a1"));
	}
	@Test
	public void Problem5Test2() { 
		assertTrue(Problem5.compressString("abcd").equals("abcd"));
	}
	
	// problem 7:
	// if an element in MxN matrix is 0, set its row/col to 0
	@Test
	public void Problem7Test1() {
		int[][] testArray = {
				{1, 1, 1, 1, 1},
				{1, 1, 1, 1, 1},
				{1, 1, 0, 1, 1},
				{1, 1, 1, 1, 1},
				{0, 1, 1, 0, 1}
		};
		int[][] resultArray = {
				{0, 1, 0, 0, 1},
				{0, 1, 0, 0, 1},
				{0, 0, 0, 0, 0},
				{0, 1, 0, 0, 1},
				{0, 0, 0, 0, 0},
		};
		int[][] tmpArray = Problem7.setZeroes(testArray);
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				assertTrue(tmpArray[i][j] == resultArray[i][j]);
			}
		}
	}
	
	
	
	
	
	
	
}
