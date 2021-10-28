package ict.kosovo.growth.oop.generics.type_variable_bounds;

//nese nuk mundemi
//mundemi me kriju nje interface qe i trashegon te gjitha
// //qato qe te vyen e pastaj me perdore kete interface te ri

public class Person implements Comparable<Person>{
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return this.getAge()-o.getAge();
    }
}
