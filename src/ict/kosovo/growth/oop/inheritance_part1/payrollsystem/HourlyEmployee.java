package ict.kosovo.growth.oop.inheritance_part1.payrollsystem;

public class HourlyEmployee extends Employee {
    private int hours;
    private double hourlyWage;

    public HourlyEmployee(int id, String name, String surname, int hours, double hourlyWage) {
        super(id, name, surname);
        this.hours = hours;
        this.hourlyWage = hourlyWage;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours > 0)
            this.hours = hours;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        if (hourlyWage > 0)
            this.hourlyWage = hourlyWage;
    }

    @Override
    public double pay() {
        return hours * hourlyWage;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%nTotal hourse: %d %nHourly wage: %.2f"
                , hours, hourlyWage);
    }
}
