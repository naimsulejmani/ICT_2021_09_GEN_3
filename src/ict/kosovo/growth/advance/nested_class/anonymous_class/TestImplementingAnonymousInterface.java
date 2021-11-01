package ict.kosovo.growth.advance.nested_class.anonymous_class;

public class TestImplementingAnonymousInterface {
    public static void main(String[] args) {
        Moveable moveable = new Moveable() {
            @Override
            public void move(String righOrLeft) {
                System.out.println("move " + righOrLeft);
            }
        };

        moveable.move("right");
    }
}
