package ict.kosovo.growth.oop.exceptions;

import java.nio.file.StandardWatchEventKinds;

public class Stack {
    private Object[] stack;
    private int capacity;
    private int counter;

    public Stack(int capacity) {
        this.capacity = capacity;
        stack = new Object[capacity];
    }

    public boolean isEmpty() {
        return counter == 0;
    }

    public boolean isFull() {
        return counter == capacity;
    }

    public void push(Object o) throws StackOverflowException {
        if (isFull()) {
            throw new StackOverflowException("Stack is full!");
        }
        stack[counter++] = o;
    }

    public Object pop() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty!");
        }
        Object obj = stack[counter - 1];
        stack[counter - 1] = null;
        counter--;
        return obj;
    }


}
