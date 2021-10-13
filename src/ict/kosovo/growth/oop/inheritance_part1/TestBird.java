package ict.kosovo.growth.oop.inheritance_part1;

public class TestBird {
    public static void main(String[] args) {
        Bird bird1 = new Bird("white","walking","insect");
        System.out.println(bird1.toString());
        System.out.println("--------------------------");
        WalkingBird walkingBird1 = new WalkingBird("blue","walking","insect");
        System.out.println(walkingBird1.toString());
        System.out.println("--------------------------");
        Goose goose  = new Goose("white","walking","fish");
        System.out.println(goose);
        System.out.println(goose.getFood());

        /*
        Legal call
         */
        Bird b1 = new Goose("white","test","A");
        WalkingBird b2 = new Goose("test","test","test");

        /*
        Jo legale
         */
//        Goose g1 = new Bird("a","b","c");
//        Goose g2 = new WalkingBird("c","c","c");

        Bird wBird = new WalkingBird("A","B","C");
            System.out.println(wBird.toString());

    }
}
