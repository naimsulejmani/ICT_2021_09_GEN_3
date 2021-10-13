package ict.kosovo.growth.oop.inheritance_part1;

public class WalkingBird extends Bird {

    //per me kriju objekt nga WalkingBird -> new WalkingBird()
    //per me kriju nje objekt te femise -> para se me u thirre konstruktori
    // i femise, thirret konstruktori prind
    public WalkingBird(String color, String movement, String food) {
        //deklarata e pare duhet me u thirr konstruktori prind
        super(color, movement, food);
        System.out.println("I am a walking bird specifically!");
    }

    @Override
    public String toString() {
        return "Walking " + super.toString();
    }
}
