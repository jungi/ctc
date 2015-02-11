package ctc;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

import org.junit.Test;

import com.sun.corba.se.impl.orbutil.graph.Node;



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
	
	// problem 8:
	// given strings s1 and s2, check if s2 is rotation of s1
	// using only one call to isSubstring
	@Test
	public void Problem8Test1() {
		String t1 = "waterbottle";
		String t2 = "erbottlewat";
		assertTrue(Problem8.isRotation(t1, t2));
	}
	
	// ch2 pr1:
	// remove duplicates from an unsorted linked list
	@Test
	public void Ch2Pr1Test1() {
		LinkedList<String> testList = new LinkedList<String>();
		LinkedList<String> resultList = new LinkedList<String>();
		testList.add("F");
		testList.add("O");
		testList.add("L");
		testList.add("L");
		testList.add("O");
		testList.add("W");
		testList.add(" ");
		testList.add("U");
		testList.add("P");
		
		resultList.add("F");
		resultList.add("O");
		resultList.add("L");
		resultList.add("W");
		resultList.add(" ");
		resultList.add("U");
		resultList.add("P");
		
		Iterator<String> it1 = Ch2Pr1.removeDuplicates(testList).iterator();
		Iterator<String> it2 = resultList.iterator();
		
		while (it1.hasNext()) {
			assertEquals(it1.next(), it2.next());
		}
	
		
		
	}
	
	// ch2 pr2:
	// implement an algorithm to find the kth to last element of a linked list
	@Test
	public void Ch2Pr2Test1() {
		LinkedList<Integer> testList = new LinkedList<Integer>();
		LinkedList<Integer> resultList = new LinkedList<Integer>();
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(4);
		testList.add(5);
		testList.add(6);
		testList.add(7);
		testList.add(8);
		testList.add(9);
		testList.add(10);
		
		assertEquals(Ch2Pr2.findKthLast(testList, 4), 7);
		assertEquals(Ch2Pr2.findKthLast(testList, 5), 6);
		assertEquals(Ch2Pr2.findKthLast(testList, 3), 8);
		assertEquals(Ch2Pr2.findKthLast(testList, 2), 9);	
	}
	
	// ch2 pr3:
	// delete a node in a singly linked list with only access to that node
	@Test
	public void Ch2Pr3Test1() {
		LinkedList<Ch2Node> testList = new LinkedList<Ch2Node>();
		Ch2Node ptr7 = new Ch2Node(7, null);
		Ch2Node ptr6 = new Ch2Node(6, ptr7);
		Ch2Node ptr5 = new Ch2Node(5, ptr6);
		Ch2Node ptr4 = new Ch2Node(4, ptr5);
		
		testList.add(ptr4);
		testList.add(ptr5);
		testList.add(ptr6);
		testList.add(ptr7);
		
		
		Ch2Pr3.removeAt(testList, ptr5);
		
		Iterator<Ch2Node> it = testList.iterator();

		assertEquals(it.next().data, 4);
		assertEquals(it.next().data, 6);
		assertEquals(it.next().data, 6);
		assertEquals(it.next().data, 7);
	}
	
	
	
}
