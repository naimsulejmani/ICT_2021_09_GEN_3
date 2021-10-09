package ict.kosovo.growth.oop.arrays_example;

public class Todo {
    private static int counter = 0;
    private int id;
    private String name;
    private boolean isCompleted;

    public Todo(String name) {
        this.id = ++counter;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void changeStatus() {
        this.isCompleted = !this.isCompleted;
    }

    public void print() {
        System.out.printf("%d - %s (%s)%n", id, name, isCompleted ? "YES":"NO");
    }
}
