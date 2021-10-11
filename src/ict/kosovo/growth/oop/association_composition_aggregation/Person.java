package ict.kosovo.growth.oop.association_composition_aggregation;

public class Person {
    //u be lidhja - relacioni me klasen truri
    //kur krijojme objekt te personit, ai person mundet me pas trurin
    private Brain brain; // null
    private String name; //null
    private Date birthdate; //null

    //lidhja composition behet nepermjet konstruktorit apo default implementimint
    public Person(String name, Date birthdate) {
        //this.brain = new Brain();
        this.name = name;
        this.birthdate = birthdate;
    }
}
