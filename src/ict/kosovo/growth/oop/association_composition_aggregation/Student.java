package ict.kosovo.growth.oop.association_composition_aggregation;

import java.time.LocalDate;

public class Student {
    //ni lloj gjeneratori sikurse ne SQL - AUTO_INCREMENT, IDENTITY(1,1)
    private static int idGenerator = 0;
    private final int id; //readonly
    private String firstName;
    private String lastName;
    private LocalDate registerDate;
    private boolean isActive;

    public Student(String firstName, String lastName, LocalDate registerDate) {
        this.id = ++idGenerator;
        this.firstName = firstName;
        this.lastName = lastName;
        this.registerDate = registerDate == null ? LocalDate.now() : registerDate;
        this.isActive = true;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
