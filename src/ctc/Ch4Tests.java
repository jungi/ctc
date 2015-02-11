package ctc;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ch4Tests {
	
	@Test
	public void Ch4Pr1Test1() {
		//initialize bst tree (this is balanced)
		BSTNode node = new BSTNode(5);
		BSTNode node4 = new BSTNode(4);
		BSTNode node3 = new BSTNode(3);
		BSTNode node2 = new BSTNode(2);
		BSTNode node1 = new BSTNode(1);
		BSTNode node6 = new BSTNode(6);
		BSTNode node7 = new BSTNode(7);
		BSTNode node8 = new BSTNode(8);
		BSTNode node9 = new BSTNode(5);
		
		node.left = node3;
		node3.left = node2;
		node2.left = node1;
		node3.right = node4;
		node.right = node7;
		node7.left = node6;
		node7.right = node9;
		node9.left = node8;
		
		assertTrue(Ch4Pr1.isBalanced(node));
	}
	
	// Ch4 Pr2
	// check for path
	@Test
	public void Ch4Pr2Test() {
		Ch4Pr2Graph graph = new Ch4Pr2Graph();
		Ch4Pr2Node n1 = new Ch4Pr2Node();
		Ch4Pr2Node n2 = new Ch4Pr2Node();
		Ch4Pr2Node n3 = new Ch4Pr2Node();
		Ch4Pr2Node n4 = new Ch4Pr2Node();
		Ch4Pr2Node n5 = new Ch4Pr2Node();
		Ch4Pr2Node n6 = new Ch4Pr2Node();
		n1.addNeighbor(n2);
		n1.addNeighbor(n4);
		n2.addNeighbor(n5);
		n5.addNeighbor(n1);
		n6.addNeighbor(n3);
		n4.addNeighbor(n3);
		n3.addNeighbor(n4);
		
		assertFalse(Ch4Pr2.checkPath(n1, n6));
		assertTrue(Ch4Pr2.checkPath(n1, n3));
	}
	
	// Ch4 Pr3
	// sorted array -> bst 
	@Test
	public void Ch4Pr3Test() {
		int[] arr = new int[7];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		
		BSTNode n = Ch4Pr3.makeBST(arr);
		
		assertEquals(n.data, 3);
		assertEquals(n.left.data, 1);
		assertEquals(n.left.left.data, 0);
		assertEquals(n.left.right.data, 2);
		assertEquals(n.right.data, 5);
		assertEquals(n.right.left.data, 4);
		assertEquals(n.right.right.data, 6);

	}
}
