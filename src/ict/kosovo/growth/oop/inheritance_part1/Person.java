package ict.kosovo.growth.oop.inheritance_part1;

import java.time.LocalDate;

public class Person {
    private int id;
    private String name;
    private String surname;
    private LocalDate birthdate;
    private String address;

    public Person() {
        this(0,null,null,null,null);
    }

    public Person(int id, String name, String surname, LocalDate birthdate, String address) {
        super();
        this.id=id;
        this.name=name;
        this.birthdate=birthdate;
        this.address=address;
    }
    public Person(int id, String name, String surname) {
       this(id,name,surname,null,null);
    }







}
