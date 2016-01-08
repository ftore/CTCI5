package stackqueue;

import linkedlists.Node;

public class Queue {
	Node top;
	
	public void enqueue(int n) {
		Node t = new Node(n);
		
		Node curr = top;
		while(curr != null) {
			curr = curr.next;
		}
		
		curr = t;
	}
	
	public int dequeue() {
		int res = top.val;
		top = top.next;
		return res;
	}
}
