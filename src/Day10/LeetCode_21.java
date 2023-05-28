package Day10;

import Day7_Classroom.LinkedList;

public class LeetCode_21 {

	public void example()
	{
		Node head = new Node();
		head.next = 1;
	}
	
	class Node{
		int data;
		Node next;
		
		Node() {
			next = null;
		}

		Node(int key) {
			this.data = key;
			next = null;
		}
	}
	
	
}
