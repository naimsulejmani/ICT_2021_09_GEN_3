package ict.kosovo.growth.oop.polymorphism;

import java.util.ArrayList;

//metoda push, pop
//push - vendose nje element ne top te stack-ut
//pop - terhjeke nje element nga top i stack-ut
//public class Stack extends ArrayList {
public class Stack {
    private ArrayList stack = new ArrayList(16);

    public void push(Object object) {
        stack.add(object);
    }

    public Object pop() {
        Object object = stack.get(stack.size() - 1);
        // this.remove(object);
        stack.remove(stack.size() - 1);
        return object;
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }
}
