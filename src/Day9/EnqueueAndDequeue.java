package Day9;

public class EnqueueAndDequeue {
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.dequeue(10);
		System.out.println(queue.toString());
	}
}

class Queue {
	class Node {
		int number;
		Node next;
	}

	private Node start;
	private Node end;
	private int size = 0;

	void enqueue(int no) {
		// Created a new Node
		Node node = new Node();
		node.number = no;
		// Handling the insertion of 1st element
		if (start == null) {
			start = node;
			end = node;
		} else {
			end.next = node;
			end = node;
		}
		size++;
	}

	int dequeue(int no) {
		
		if(start == null)
		{
			throw new NullPointerException("Queue is already empty");
		} 
		
		Node temp = start;
		if(start==end)
		{
			start = null;
			end = null;
		}
		else {
			start = start.next;
		}
		return temp;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		Node current = start;
		while (current != null) {
			sb.append(current.number + ", ");
			current = current.next;
		}
		sb.append("] --> " + "size: " + size);
		return sb.toString();
	}
}
