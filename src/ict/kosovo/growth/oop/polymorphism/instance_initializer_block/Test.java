package ict.kosovo.growth.oop.polymorphism.instance_initializer_block;

public class Test {

    //instance initializer block
    {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }
    }
    {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        Test t = new Test();
    }
}
