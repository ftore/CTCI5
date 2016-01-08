package linkedlists;

import java.util.LinkedList;
import java.util.Queue;

public class RemoveDuplicate {
	public static Node removeDuplicate(Node root) {
		Queue<Integer> q = new LinkedList<>();
		
		Node curr = root;
		
		while(curr != null) {
			if(!q.contains(curr.val)) {
				q.offer(curr.val);
			}
			curr = curr.next;
		}
		
		Node n = new Node(q.poll());
		root = n;
		
		while(!q.isEmpty()) {
			n.next = new Node(q.poll());
			n = n.next;
		}
		
		return root;
	}
	
	public static void main(String[] args) {
		Node root = new Node(1);
		Node curr = root;
		
		curr.next = new Node(2);
		curr = curr.next;
		
		curr.next = new Node(3);
		curr = curr.next;
		
		curr.next = new Node(1);
		curr = curr.next;
		
		curr.next = new Node(4);
		
		Node curr2 = root;
		
		while(curr2 != null) {
			//System.out.println(curr2.val);
			curr2 = curr2.next;
		}
		
		root = removeDuplicate(root);
		
		curr2 = root;
		
		while(curr2 != null) {
			System.out.println(curr2.val);
			curr2 = curr2.next;
		}
	}
}
