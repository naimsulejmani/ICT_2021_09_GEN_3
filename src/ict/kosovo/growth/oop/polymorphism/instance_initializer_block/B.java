package ict.kosovo.growth.oop.polymorphism.instance_initializer_block;

public class B {
    private int x =10;
    public B() {
        /*
         super(); //per shkak te trashegeimise se klases Object
         System.out.println("Thirre initializer instance block-1");
         System.out.println("Thirre initializer instance block-2");
         System.out.println(x);
         x=x+10;
         System.out.println("Thirre konstruktorin!!!");
         */
        System.out.println("Thirre konstruktorin!!!");
        System.out.println(x);
    }
    {
        System.out.println("Thirre initializer instance block-1");
    }

    {
        System.out.println("Thirre initializer instance block-2");
    }
    {
        System.out.println(x);
        x=x+10;
    }

}
