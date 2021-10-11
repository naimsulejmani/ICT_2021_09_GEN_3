package ict.kosovo.growth.oop.association_composition_aggregation.aggregation_example;

import java.util.ArrayList;

public class Institute {
    private final String id;
    private String name;

    private ArrayList<Department> departments;

    public Institute(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addDepartment(Department department) {
        this.departments.add(department);
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
