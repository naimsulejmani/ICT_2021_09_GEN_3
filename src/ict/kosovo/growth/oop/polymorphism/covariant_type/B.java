package ict.kosovo.growth.oop.polymorphism.covariant_type;

public class B extends A{
    public String description = "Extended class";

    public void message() {
        System.out.println(super.id);
        System.out.println(super.name);
        System.out.println(this.description);
        System.out.println(this.toString());
        System.out.println(super.toString());
    }

    //is-a
    public B get() {
        A a = super.get();
        return  this; // ose new B();
    }
}
