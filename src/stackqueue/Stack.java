package stackqueue;

import linkedlists.Node;

public class Stack {
	Node top;
	public void push(int data) {
		Node t = new Node(data);
		t.next = top;
		top = t;
	}
	
	public int pop() {
		if(top != null) {
			int res = top.val;
			top = top.next;
			return res;
		}
		return -1;
	}
	
	public int peek() {
		return top.val;
	}
}
