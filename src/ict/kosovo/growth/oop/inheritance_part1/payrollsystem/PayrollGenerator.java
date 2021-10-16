package ict.kosovo.growth.oop.inheritance_part1.payrollsystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class PayrollGenerator {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        String fileContent =
                "1,Naim,Sulejmani,Programmer,500;2,Filan,Fisteku,Secretary,30,10;3,Lumbardh,Gashi,Manager,1000";

        String[] employeeFiles = fileContent.split(";");

        for (String employeeString : employeeFiles) {
            String[] attributes = employeeString.split(",");
            int id = Integer.parseInt(attributes[0]);
            String name = attributes[1];
            String surname = attributes[2];
            String profession = attributes[3];
            Employee employee = null;

            if (profession.equals("Programmer")) {
                double salary = Double.parseDouble(attributes[4]);
                employee = new Programmer(id, name, surname, salary);
            } else if (profession.equals("Manager")) {
                double salary = Double.parseDouble(attributes[4]);
                employee = new Manager(id, name, surname, salary);
            } else if (profession.equals("Secretary")) {
                int hours = Integer.parseInt(attributes[4]);
                double hourlyWage = Double.parseDouble(attributes[5]);
                employee = new Secretary(id, name, surname, hours, hourlyWage);
            } else if (profession.equals("Consultant")) {
                int hours = Integer.parseInt(attributes[4]);
                double hourlyWage = Double.parseDouble(attributes[5]);
                employee = new Consultant(id, name, surname, hours, hourlyWage);
            } else {
                employee = new Employee(id, name, surname);
            }
            employees.add(employee);
        }

        int month, year;
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj muajin: ");
        month = reader.nextInt();
        System.out.println("Shkruaj vitin: ");
        year = reader.nextInt();

        for(Employee emp: employees) {
            System.out.println("------------------------");
            Paycheck paycheck = new Paycheck(emp,month,year, LocalDate.now().minusDays(1));
            paycheck.print();
            System.out.println();
        }

    }
}






