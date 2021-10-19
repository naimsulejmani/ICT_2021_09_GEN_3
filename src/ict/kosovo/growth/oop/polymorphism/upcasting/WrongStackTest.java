package ict.kosovo.growth.oop.polymorphism.upcasting;

import ict.kosovo.growth.oop.polymorphism.Stack;

public class WrongStackTest {
    public static void main(String[] args) {
        Stack stack =new Stack();
        stack.push("Naim");
        stack.push("Agim");
        stack.push("Fitore");

        //stack.add(0,"ALO");

        System.out.println(stack.size());

        System.out.println(stack.pop());
        System.out.println(stack.size());

    }
}
