package ict.kosovo.growth.oop.inheritance_part1.payrollsystem;

public class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(int id, String name, String surname, double salary) {
        super(id, name, surname);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double pay() {
        return getSalary();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%nSalary: %.2f EUR", salary);
    }


}
