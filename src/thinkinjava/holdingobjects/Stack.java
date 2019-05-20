package thinkinjava.holdingobjects;

import java.util.LinkedList;

/**
 * Making a stack form a LinkedList.
 */
public class Stack<E> {
    private LinkedList<E> storage = new LinkedList<>();

    public void push(E element) {
        storage.addFirst(element);
    }

    public E peek(){
        return storage.peek();
    }

    public E pop() {
        return storage.removeFirst();
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    @Override
    public String toString() {
        return storage.toString();
    }
 }
