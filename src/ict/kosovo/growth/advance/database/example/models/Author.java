package ict.kosovo.growth.advance.database.example.models;

public class Author {
    private int id;
    private String name;
    private String surname;
    private boolean isActive;

    public Author(int id, String name, String surname, boolean isActive) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.isActive = isActive;
    }

    public Author(int id, String name, String surname) {
        this(id, name, surname, false);
    }

    public Author(int id, String name) {
        this(id, name, null, false);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return String.format("%d - %s %s (%b) %n", id, name, surname, isActive);
    }
}
