package ict.kosovo.growth.oop.abstract_interfaces;

public abstract class Wrestler {
    public static void sayHello() {
        System.out.println("Hello from Wrestler Abstract class!");
    }
    //variabla instance
    private String name;

    //klasa abstrakte mund te kete konstruktore
    Wrestler() {
        System.out.println("Abstract constructor!");
    }

    public final void setName(final String name) {
        this.name=name;
    }
    public final String getName() {
        return this.name;
    }

    public void payForWork(int hours) {
        System.out.println("Payment: "+hours*250.00);
    }

    public abstract void themeMusic();
    public abstract void finisher();
}
