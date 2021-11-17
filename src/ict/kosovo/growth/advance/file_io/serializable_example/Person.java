package ict.kosovo.growth.advance.file_io.serializable_example;

import ict.kosovo.growth.oop.interfaces.functional_interfaces.Serializable;

import java.time.LocalDate;

public class Person implements Serializable, Comparable<Person> {
    public Integer id;
    public String name;
    public String Surname;
    public LocalDate birthdate;

    public Person(Integer id, String name, String surname, LocalDate birthdate) {
        this.id = id;
        this.name = name;
        Surname = surname;
        this.birthdate = birthdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
