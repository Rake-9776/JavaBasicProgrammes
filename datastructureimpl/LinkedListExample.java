package datastructureimpl;

class Node {
	Object data;
	Node next;
	public Node(Object data, Node next) {
		// TODO Auto-generated constructor stub
		this.data = data;
		this.next = next;
	}
	public Node(Object data) {
		this.data = data;
	}
}
public class LinkedListExample {
	private Node head = null;
	private int count = 0;

	public void add(Object ele) {
		if (head == null) {
			head = new Node(ele);
			count++;
			return;
		}
		Node curr = head;    ///always try to track curr(its name is fix here)
		while (curr.next != null) {
			curr = curr.next;    //if node is not null iterate happen heree/it find null node
		}
		curr.next = new Node(ele);  //it store element in that particular node
		count++;
	}
	public void addInd(int index,Object ele) {
		if(index==0) {
			head = new Node(ele,head);
			count++;
			return;
		}
		Node curr = head;    ///always try to track curr(its name is fix here)
		for(int i=1;i<index;i++) {
			curr = curr.next;    //if node is not null iterate happen heree/it find null node
		}
		curr.next = new Node(ele,curr.next);  //it store element in that particular node
		count++;
	}
	public Object set(int ind,Object ele) {
		Node curr = head;   //its name anywhere same if you want iterate use this
		for(int i=1;i<=ind;i++) {
			curr = curr.next;
		}
		return curr.data = ele;
	}
	public void remove(int ind) {
		Node curr = head;    ///always try to track curr(its name is fix here)
		for(int i=1;i<=ind;i++) {
			curr = curr.next;    //if node is not null iterate happen heree/it find null node
		}
		curr.next = curr.next.next;  //it store element in that particular node
	}
	
	public Object get(int ind) {
		Node curr = head;
		for(int i=1;i<=ind;i++) {
			curr = curr.next;
		}
		return curr.data;
	}

	public int size() {
		return count; 
	}

	public static void main(String[] args) {
		LinkedListExample link = new LinkedListExample();
		link.add(12);
		link.add(123);
		link.add(124);   
		link.remove(0);
		for(int i=0;i<link.size();i++) {
			System.out.println(link.get(i));
		}
	}
}
/*
 * All Question Of Collection Framework diff arraylist and linkedlist diff list
 * and set diff hashset and linkedhashset diff linkedhaset and treeset what is
 * iterator what is listiterator(); what is stack and explain what is queue and
 * priority queue and dequeue
 * 
 */
