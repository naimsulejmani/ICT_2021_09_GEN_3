package ict.kosovo.growth.oop.inheritance_part1.payrollsystem;

import java.time.LocalDate;

public class Paycheck {
    private Employee employee;
    private int month;
    private int year;
    private LocalDate releaseDate;
    private LocalDate insertDate;

    public Paycheck(Employee employee, int month, int year, LocalDate releaseDate) {
        this.employee = employee;
        this.month = month;
        this.year = year;
        this.releaseDate = releaseDate;
        this.insertDate = LocalDate.now();
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public LocalDate getInsertDate() {
        return insertDate;
    }

    private String getProfession() {
        String profession = "Puntor";

        if(employee instanceof Programmer)
            profession="Programmer";
        else if(employee instanceof  Manager)
            profession="Manager";
        else if(employee instanceof Secretary)
            profession="Secretary";
        else if(employee instanceof Consultant)
            profession="Consultant";
        else if(employee instanceof SalariedEmployee)
            profession = "Puntore with monthly salary";
        else if(employee instanceof HourlyEmployee)
            profession = "Puntore with hourly wages";

        return profession;
    }

    @Override
    public String toString() {
        return String.format(
                "Rroga per muajin: %d/%d%nPuntori: %s%nRroga: %.2f EUR%nData e leshuar: %s%nProfesioni: %s",
                month, year,
                employee.getId() + " " + employee.getName() + " " + employee.getSurname(),
                employee.pay(), releaseDate, getProfession()
        );
    }

    public void print() {
        System.out.println(this);
    }


    /*
        Rroga per periudhen: 9/2021
        Puntori: 1- Naim Sulejmani
        Rroga: 100 EUR
        Data e leshuar: data
        Profesioni: Programer
     */

}
