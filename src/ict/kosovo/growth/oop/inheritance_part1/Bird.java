package ict.kosovo.growth.oop.inheritance_part1;

//super class, parent class, base class
public class Bird extends Object {
    //variablat instance
    private String color;
    private String movement;
    protected String food;

    public Bird(String color, String movement, String food) {
        super();//nese na nuk e shkruajm -> compajlleri e shkruan
        this.color = color;
        this.movement = movement;
        this.food = food;
        System.out.println("I am a Bird!");
    }



    public String getColor() {
        return color;
    }
//pyetjet a guxojne te gjitha atributet me pas GET DHE SET
//    public void setColor(String color) {
//        this.color = color;
//    }

    public String getMovement() {
        return movement;
    }

//    public void setMovement(String movement) {
//        this.movement = movement;
//    }

    public String getFood() {
        return food;
    }

//    public void setFood(String food) {
//        this.food = food;
//    }

    @Override //mbishkruje sjelljen e objektit
    public String toString() {
        return String.format("Bird with color %s, with movement %s, eats %s"
        ,color,movement,food);
    }


}
