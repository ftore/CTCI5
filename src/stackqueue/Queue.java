package stackqueue;

import linkedlists.Node;

public class Queue {
	private Node first, last;
	private int min = Integer.MAX_VALUE;
	
	public void enqueue(int n) {
		if(n < min) {
			min = n;
		}
		if(first == null) {
			last = new Node(n);
			first = last;
		} else {
			last.next = new Node(n);
			last = last.next;
		}
	}
	
	public Integer dequeue() {
		
		if(first != null) {
			int res = first.val;
			first = first.next;
			
			if(res == min) {
				min = first.val;
				Node curr = first;
				while(curr != null) {
					if(curr.val < min) {
						min = curr.val;
					}
					curr = curr.next;
				}
			}
			
			return res;
		}
		
		return null;
	}
	
	public int min() {
		return min;
	}
	
	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		
		System.out.println(q.min());
		q.dequeue();
		System.out.println(q.min());
		
	}

	@Override
	public String toString() {
		return "Queue [first=" + first + ", last=" + last + ", min=" + min + "]";
	}
	
	
}
