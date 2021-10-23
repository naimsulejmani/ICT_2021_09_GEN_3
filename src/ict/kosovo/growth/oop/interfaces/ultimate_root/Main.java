package ict.kosovo.growth.oop.interfaces.ultimate_root;

public class Main {
    public static void main(String[] args) {
        Z z = new Z();
        System.out.println(z.toString());
        z.a();
        z.b();

        if(z instanceof Y) {
            Y y = (Y)z;
            System.out.println(y.toString());
            y.a();;
            //y.b();

        }
    }
}
