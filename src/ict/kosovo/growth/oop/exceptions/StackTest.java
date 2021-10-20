package ict.kosovo.growth.oop.exceptions;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack(3);
        try {
            stack.push(10);
//            stack.pop();
//            stack.pop();
            stack.push(20);
            stack.push(30);
            stack.push(40);
            stack.pop();
        } catch (StackOverflowException e) {
            System.out.println(e.getMessage());
            System.out.println("Jeni duke dashur te vendosni me shume elemente" +
                    "se sa nxen stack");
        }
        catch (StackUnderflowException e) {
            System.out.println(e.getMessage());
            System.out.println("Jeni duke dashur te hjekni elemente ne stack te zbrazur");
        }
    }
}
