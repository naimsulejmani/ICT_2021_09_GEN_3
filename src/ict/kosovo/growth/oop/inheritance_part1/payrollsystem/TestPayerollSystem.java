package ict.kosovo.growth.oop.inheritance_part1.payrollsystem;

public class TestPayerollSystem {
    public static void main(String[] args) {
        Employee punetori1 = new Programmer(100, "Filan", "Fisteku", 500);
        Employee punetori2 = new Consultant(101, "Filane", "Fisteke", 88, 15.75);

        System.out.println(punetori1);
        System.out.println("-------------------------");
        System.out.println(punetori2);

        Manager m = new Manager(1,"FILAN","TEST",400);
        System.out.println(m.getName());
    }
}
