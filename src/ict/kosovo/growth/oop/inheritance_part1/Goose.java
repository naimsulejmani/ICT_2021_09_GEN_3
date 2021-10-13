package ict.kosovo.growth.oop.inheritance_part1;

public class Goose extends WalkingBird{
    public Goose(String color, String movement, String food) {
        super(color, movement, food);
        System.out.println("I am a goose!");
    }

    @Override
    public String toString() {
        return "HAHAHAH";
    }
}
