package Practices;

import org.junit.Test;

public class BasicLinkedList {

	@Test
	public void testReverse() {
		Node head = add(10);
		head.next = add(24);
		head.next.next = add(33);
		head.next.next.next = add(40);

		printAllNodes(head);
		Node tail = reverseNodes(head);
		System.out.println("***************************");
		printAllNodes(tail);
	}

	private Node reverseNodes(Node head) {
		Node curr = head, prev = null, next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	private void printAllNodes(Node node) {
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	public class Node {
		int data;
		Node next;
		// Node prev;

		Node(int key) {
			this.data = key;
			next = null;
		}
	}

	public Node add(int data) {
		Node node = new Node(data);
		return node;
		// return new Node(data);
	}
}
