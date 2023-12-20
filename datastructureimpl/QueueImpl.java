package datastructureimpl;

import java.util.LinkedList;
import java.util.EmptyStackException;

public class QueueImpl<T> {
	private LinkedList<T> queue;

	public QueueImpl() {
		queue = new LinkedList<>();
	}

	public void enqueue(T item) {
		queue.addLast(item);
	}
    
    public T get(int ind) {
    	return queue.get(ind);
    }

	public T dequeue() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return queue.removeFirst();
	}

	public T peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return queue.getFirst();
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}

	public int size() {
		return queue.size();
	}

	public static void main(String[] args) {
		QueueImpl<Integer> queue = new QueueImpl<>();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);

//		System.out.println("Size: " + queue.size()); // Output: Size: 3
//		System.out.println("Dequeue: " + queue.dequeue()); // Output: Dequeue: 10
//		System.out.println("Peek: " + queue.peek()); // Output: Peek: 20
//		System.out.println("Size: " + queue.size()); // Output: Size: 2
		
		for(int i=0;i<queue.size();i++) {
    		System.out.println(queue.get(i));
    	}
	}
}
