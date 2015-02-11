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

	@Test
	public void Ch4Pr1Test2() {
		//initialize bst tree (this is balanced)
		BSTNode node5 = new BSTNode(5);
		BSTNode node4 = new BSTNode(4);
		BSTNode node3 = new BSTNode(3);
		BSTNode node2 = new BSTNode(2);
		BSTNode node1 = new BSTNode(1);
		
		node1.right = node2;
		node2.right = node3;
		node3.right = node4;
		node4.right = node5;
		
		assertFalse(Ch4Pr1.isBalanced(node1));
	}

}
