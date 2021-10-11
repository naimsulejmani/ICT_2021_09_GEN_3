package ict.kosovo.growth.Dorezimet.NdriqimBehrami;

import java.util.Scanner;

public class ToDo {
    private static int counter = 0;
    private int id;
    private String name;
    private boolean isCompleted;

    public ToDo() {
        ++ToDo.counter;
    }

    public static void setCounter(int counter) {
        ToDo.counter = counter;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
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
        System.out.printf("%d - %s (%b)%n", id, name, isCompleted);
    }

    public static void menyjaKryesore(){
        System.out.println("hello");

    }
    public static int menu() {
        System.out.println();
        System.out.println("----------------------");
        System.out.println("Menyja Kryesore");
        System.out.println("----------------------");
        System.out.println("1 - Per te shtuar nje todo");
        System.out.println("2 - Per te lexuar nje todo");
        System.out.println("3 - Per te fshire nje todo");
        System.out.println("4 - Per ti shtypur te gjithen e listen e todos");
        System.out.println("5 - Per te fshire/pastruar komplet todo");
        System.out.println("6 - Per te gjet nje todo ne baze emrit");
        System.out.println("7 - Per te shfaqur numrin total te todove");
        System.out.println("8 - Mark selected todo as completed");
        System.out.println("0 - Per dalje");
        System.out.println(" ------------------------------");
        System.out.println();
        System.out.print("Cilen deshironi? : ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

}
