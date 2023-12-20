package datastructureimpl;

class Node1{
	Object e;
	Node1 next;
	Node1(Object e){
		this.e = e;
	}
}
public class Queue {
    private Node1 first = null;
    private Node1 last = null;
    
    private int count = 0;
    
    public void add(Object e) {
    	if(first==null) {
    		first = new Node1(e);
    		last=first;
    		count++;
    		return;
    	}
    	last.next = new Node1(e);
    	last = last.next;
    	count++;
    }
    public int size() {
    	return count;
    }
    public Object peek() {
    	if(first==null) return null;
    	return first.e;
    }
    public Object poll() {
    	if(first==null) {
    		return null;
    	}
    	Object e = first.e;
    	first = first.next;
    	count--;
    	return e;
    }
    public boolean isEmpty() {
    	return first ==null;
    }
    public static void main(String[] args) {
		Queue q = new Queue();
		q.add(23);
		q.add(43);
		q.add(77);
		System.out.println(q.peek());
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}
}
