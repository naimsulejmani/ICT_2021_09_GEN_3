package ict.kosovo.growth.oop.association_composition_aggregation.aggregation_example;

import java.util.ArrayList;

public class Department {
    private final String id;
    private String name;
    private ArrayList<Student> students;

    public Department(String id, String name) {
        this.name = name;
        this.id = id;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
