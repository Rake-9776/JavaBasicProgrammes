package datastructureimpl;

import java.util.LinkedList;
import java.util.EmptyStackException;

public class StackImpl<T> {
    private LinkedList<T> stack;

    public StackImpl() {
        stack = new LinkedList<>();
    }

    public void push(T item) {
        stack.addLast(item);
    }
    
    public T get(int ind) {
    	return stack.get(ind);
    }
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeLast();
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.getLast();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }
    public static void main(String[] args) {
    	StackImpl<Integer> stack = new StackImpl<>();
    	
    	stack.push(10);
    	stack.push(20);
    	stack.push(30);
    	
//    	System.out.println("Size: " + stack.size()); // Output: Size: 3
//    	System.out.println("Pop: " + stack.pop()); // Output: Pop: 30
//    	System.out.println("Peek: " + stack.peek()); // Output: Peek: 20
//    	System.out.println("Size: " + stack.size()); // Output: Size: 2
    	
    	for(int i=0;i<stack.size();i++) {
    		System.out.println(stack.get(i));
    	}
    }
}


